package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.workaround.CorrectVideoTimeByTimebase;
import androidx.camera.video.internal.workaround.EncoderFinder;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class EncoderImpl implements Encoder {
    private static final boolean DEBUG = false;
    private static final long NO_LIMIT_LONG = Long.MAX_VALUE;
    private static final Range<Long> NO_RANGE = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    private static final long STOP_TIMEOUT_MS = 1000;
    private static final long TIMESTAMP_ANY = -1;
    final Executor mEncoderExecutor;
    final EncoderFinder mEncoderFinder;
    final Encoder.EncoderInput mEncoderInput;
    final boolean mIsVideoEncoder;
    final MediaCodec mMediaCodec;
    private final MediaFormat mMediaFormat;
    InternalState mState;
    final String mTag;
    final Object mLock = new Object();
    final Queue<Integer> mFreeInputBufferIndexQueue = new ArrayDeque();
    private final Queue<CallbackToFutureAdapter.Completer<InputBuffer>> mAcquisitionQueue = new ArrayDeque();
    private final Set<InputBuffer> mInputBufferSet = new HashSet();
    final Set<EncodedDataImpl> mEncodedDataSet = new HashSet();
    final Deque<Range<Long>> mActivePauseResumeTimeRanges = new ArrayDeque();
    EncoderCallback mEncoderCallback = EncoderCallback.EMPTY;
    Executor mEncoderCallbackExecutor = CameraXExecutors.directExecutor();
    Range<Long> mStartStopTimeRangeUs = NO_RANGE;
    long mTotalPausedDurationUs = 0;
    boolean mPendingCodecStop = false;
    Long mLastDataStopTimestamp = null;
    Future<?> mStopTimeoutFuture = null;
    private boolean mIsFlushedAfterEndOfStream = false;
    private boolean mSourceStoppedSignalled = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum InternalState {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    public EncoderImpl(Executor executor, EncoderConfig encoderConfig) throws InvalidConfigException {
        EncoderFinder encoderFinder = new EncoderFinder();
        this.mEncoderFinder = encoderFinder;
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(encoderConfig);
        this.mEncoderExecutor = CameraXExecutors.newSequentialExecutor(executor);
        if (encoderConfig instanceof AudioEncoderConfig) {
            this.mTag = "AudioEncoder";
            this.mIsVideoEncoder = false;
            this.mEncoderInput = new ByteBufferInput();
        } else if (encoderConfig instanceof VideoEncoderConfig) {
            this.mTag = "VideoEncoder";
            this.mIsVideoEncoder = true;
            this.mEncoderInput = new SurfaceInput();
        } else {
            throw new InvalidConfigException("Unknown encoder config type");
        }
        MediaFormat mediaFormat = encoderConfig.toMediaFormat();
        this.mMediaFormat = mediaFormat;
        String str = this.mTag;
        Logger.d(str, "mMediaFormat = " + mediaFormat);
        MediaCodec findEncoder = encoderFinder.findEncoder(mediaFormat, new MediaCodecList(1));
        this.mMediaCodec = findEncoder;
        String str2 = this.mTag;
        Logger.i(str2, "Selected encoder: " + findEncoder.getName());
        try {
            reset();
            setState(InternalState.CONFIGURED);
        } catch (MediaCodec.CodecException e) {
            throw new InvalidConfigException(e);
        }
    }

    private void reset() {
        this.mStartStopTimeRangeUs = NO_RANGE;
        this.mTotalPausedDurationUs = 0L;
        this.mActivePauseResumeTimeRanges.clear();
        this.mFreeInputBufferIndexQueue.clear();
        for (CallbackToFutureAdapter.Completer<InputBuffer> completer : this.mAcquisitionQueue) {
            completer.setCancelled();
        }
        this.mAcquisitionQueue.clear();
        this.mMediaCodec.reset();
        this.mIsFlushedAfterEndOfStream = false;
        this.mSourceStoppedSignalled = false;
        this.mPendingCodecStop = false;
        Future<?> future = this.mStopTimeoutFuture;
        if (future != null) {
            future.cancel(true);
            this.mStopTimeoutFuture = null;
        }
        this.mMediaCodec.setCallback(new MediaCodecCallback());
        this.mMediaCodec.configure(this.mMediaFormat, (Surface) null, (MediaCrypto) null, 1);
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof SurfaceInput) {
            ((SurfaceInput) encoderInput).resetSurface();
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public Encoder.EncoderInput getInput() {
        return this.mEncoderInput;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void start() {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.this.m233x58d2d0c4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$start$0$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m233x58d2d0c4() {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
                this.mLastDataStopTimestamp = null;
                long generatePresentationTimeUs = generatePresentationTimeUs();
                String str = this.mTag;
                Logger.d(str, "Start on " + DebugUtils.readableUs(generatePresentationTimeUs));
                try {
                    if (this.mIsFlushedAfterEndOfStream) {
                        reset();
                    }
                    this.mStartStopTimeRangeUs = Range.create(Long.valueOf(generatePresentationTimeUs), Long.MAX_VALUE);
                    this.mMediaCodec.start();
                    Encoder.EncoderInput encoderInput = this.mEncoderInput;
                    if (encoderInput instanceof ByteBufferInput) {
                        ((ByteBufferInput) encoderInput).setActive(true);
                    }
                    setState(InternalState.STARTED);
                    return;
                } catch (MediaCodec.CodecException e) {
                    handleEncodeError(e);
                    return;
                }
            case 2:
            case 6:
            case 8:
                return;
            case 3:
                this.mLastDataStopTimestamp = null;
                Range<Long> removeLast = this.mActivePauseResumeTimeRanges.removeLast();
                Preconditions.checkState(removeLast != null && removeLast.getUpper().longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                long longValue = removeLast.getLower().longValue();
                long generatePresentationTimeUs2 = generatePresentationTimeUs();
                this.mActivePauseResumeTimeRanges.addLast(Range.create(Long.valueOf(longValue), Long.valueOf(generatePresentationTimeUs2)));
                String str2 = this.mTag;
                Logger.d(str2, "Resume on " + DebugUtils.readableUs(generatePresentationTimeUs2) + "\nPaused duration = " + DebugUtils.readableUs(generatePresentationTimeUs2 - longValue));
                if ((this.mIsVideoEncoder || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.mIsVideoEncoder || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    setMediaCodecPaused(false);
                    Encoder.EncoderInput encoderInput2 = this.mEncoderInput;
                    if (encoderInput2 instanceof ByteBufferInput) {
                        ((ByteBufferInput) encoderInput2).setActive(true);
                    }
                }
                if (this.mIsVideoEncoder) {
                    requestKeyFrameToMediaCodec();
                }
                setState(InternalState.STARTED);
                return;
            case 4:
            case 5:
                setState(InternalState.PENDING_START);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop() {
        stop(-1L);
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop(final long j) {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.this.m236lambda$stop$3$androidxcameravideointernalencoderEncoderImpl(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$stop$3$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m236lambda$stop$3$androidxcameravideointernalencoderEncoderImpl(long j) {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
            case 4:
            case 8:
                return;
            case 2:
            case 3:
                InternalState internalState = this.mState;
                setState(InternalState.STOPPING);
                long longValue = this.mStartStopTimeRangeUs.getLower().longValue();
                if (longValue == Long.MAX_VALUE) {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                if (j == -1) {
                    j = generatePresentationTimeUs();
                } else if (j < longValue) {
                    Logger.w(this.mTag, "The expected stop time is less than the start time. Use current time as stop time.");
                    j = generatePresentationTimeUs();
                }
                if (j < longValue) {
                    throw new AssertionError("The start time should be before the stop time.");
                }
                this.mStartStopTimeRangeUs = Range.create(Long.valueOf(longValue), Long.valueOf(j));
                String str = this.mTag;
                Logger.d(str, "Stop on " + DebugUtils.readableUs(j));
                if (internalState == InternalState.PAUSED && this.mLastDataStopTimestamp != null) {
                    signalCodecStop();
                    return;
                }
                this.mPendingCodecStop = true;
                this.mStopTimeoutFuture = CameraXExecutors.mainThreadExecutor().schedule(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.this.m235lambda$stop$2$androidxcameravideointernalencoderEncoderImpl();
                    }
                }, 1000L, TimeUnit.MILLISECONDS);
                return;
            case 5:
            case 6:
                setState(InternalState.CONFIGURED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$stop$2$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m235lambda$stop$2$androidxcameravideointernalencoderEncoderImpl() {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.this.m234lambda$stop$1$androidxcameravideointernalencoderEncoderImpl();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$stop$1$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m234lambda$stop$1$androidxcameravideointernalencoderEncoderImpl() {
        if (this.mPendingCodecStop) {
            Logger.w(this.mTag, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            this.mLastDataStopTimestamp = null;
            signalCodecStop();
            this.mPendingCodecStop = false;
        }
    }

    void signalCodecStop() {
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof ByteBufferInput) {
            ((ByteBufferInput) encoderInput).setActive(false);
            ArrayList arrayList = new ArrayList();
            for (InputBuffer inputBuffer : this.mInputBufferSet) {
                arrayList.add(inputBuffer.getTerminationFuture());
            }
            Futures.successfulAsList(arrayList).addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.this.signalEndOfInputStream();
                }
            }, this.mEncoderExecutor);
        } else if (encoderInput instanceof SurfaceInput) {
            try {
                this.mMediaCodec.signalEndOfInputStream();
            } catch (MediaCodec.CodecException e) {
                handleEncodeError(e);
            }
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void pause() {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.this.m229x5967ad2c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$pause$4$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m229x5967ad2c() {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 8:
                return;
            case 2:
                long generatePresentationTimeUs = generatePresentationTimeUs();
                String str = this.mTag;
                Logger.d(str, "Pause on " + DebugUtils.readableUs(generatePresentationTimeUs));
                this.mActivePauseResumeTimeRanges.addLast(Range.create(Long.valueOf(generatePresentationTimeUs), Long.MAX_VALUE));
                setState(InternalState.PAUSED);
                return;
            case 6:
                setState(InternalState.PENDING_START_PAUSED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void release() {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.this.m230x721822da();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$release$5$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m230x721822da() {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 8:
                releaseInternal();
                return;
            case 4:
            case 5:
            case 6:
                setState(InternalState.PENDING_RELEASE);
                return;
            case 7:
            case 9:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    public void signalSourceStopped() {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.this.m232xbd923a36();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$signalSourceStopped$6$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m232xbd923a36() {
        this.mSourceStoppedSignalled = true;
        if (this.mIsFlushedAfterEndOfStream) {
            this.mMediaCodec.stop();
            reset();
        }
    }

    private void releaseInternal() {
        if (this.mIsFlushedAfterEndOfStream) {
            this.mMediaCodec.stop();
            this.mIsFlushedAfterEndOfStream = false;
        }
        this.mMediaCodec.release();
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof SurfaceInput) {
            ((SurfaceInput) encoderInput).releaseSurface();
        }
        setState(InternalState.RELEASED);
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void setEncoderCallback(EncoderCallback encoderCallback, Executor executor) {
        synchronized (this.mLock) {
            this.mEncoderCallback = encoderCallback;
            this.mEncoderCallbackExecutor = executor;
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void requestKeyFrame() {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.this.m231x6064aa62();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$requestKeyFrame$7$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m231x6064aa62() {
        int i = AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()];
        if (i == 2) {
            requestKeyFrameToMediaCodec();
        } else if (i == 7 || i == 9) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    private void setState(InternalState internalState) {
        if (this.mState == internalState) {
            return;
        }
        String str = this.mTag;
        Logger.d(str, "Transitioning encoder internal state: " + this.mState + " --> " + internalState);
        this.mState = internalState;
    }

    void setMediaCodecPaused(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        this.mMediaCodec.setParameters(bundle);
    }

    void requestKeyFrameToMediaCodec() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.mMediaCodec.setParameters(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signalEndOfInputStream() {
        Futures.addCallback(acquireInputBuffer(), new FutureCallback<InputBuffer>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(InputBuffer inputBuffer) {
                inputBuffer.setPresentationTimeUs(EncoderImpl.generatePresentationTimeUs());
                inputBuffer.setEndOfStream(true);
                inputBuffer.submit();
                Futures.addCallback(inputBuffer.getTerminationFuture(), new FutureCallback<Void>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.1.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(Void r1) {
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(Throwable th) {
                        if (th instanceof MediaCodec.CodecException) {
                            EncoderImpl.this.handleEncodeError((MediaCodec.CodecException) th);
                        } else {
                            EncoderImpl.this.handleEncodeError(0, th.getMessage(), th);
                        }
                    }
                }, EncoderImpl.this.mEncoderExecutor);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                EncoderImpl.this.handleEncodeError(0, "Unable to acquire InputBuffer.", th);
            }
        }, this.mEncoderExecutor);
    }

    void handleEncodeError(MediaCodec.CodecException codecException) {
        handleEncodeError(1, codecException.getMessage(), codecException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState;

        static {
            int[] iArr = new int[InternalState.values().length];
            $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState = iArr;
            try {
                iArr[InternalState.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[InternalState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[InternalState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[InternalState.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[InternalState.PENDING_START_PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[InternalState.PENDING_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[InternalState.PENDING_RELEASE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[InternalState.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[InternalState.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    void handleEncodeError(final int i, final String str, final Throwable th) {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
                m227x6fce6354(i, str, th);
                reset();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                setState(InternalState.ERROR);
                stopMediaCodec(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.this.m227x6fce6354(i, str, th);
                    }
                });
                return;
            case 8:
                String str2 = this.mTag;
                Logger.w(str2, "Get more than one error: " + str + "(" + i + ")", th);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: notifyError */
    public void m227x6fce6354(final int i, final String str, final Throwable th) {
        final EncoderCallback encoderCallback;
        Executor executor;
        synchronized (this.mLock) {
            encoderCallback = this.mEncoderCallback;
            executor = this.mEncoderCallbackExecutor;
        }
        try {
            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderCallback.this.onEncodeError(new EncodeException(i, str, th));
                }
            });
        } catch (RejectedExecutionException e) {
            Logger.e(this.mTag, "Unable to post to the supplied executor.", e);
        }
    }

    void stopMediaCodec(final Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        for (EncodedDataImpl encodedDataImpl : this.mEncodedDataSet) {
            arrayList.add(encodedDataImpl.getClosedFuture());
        }
        for (InputBuffer inputBuffer : this.mInputBufferSet) {
            arrayList.add(inputBuffer.getTerminationFuture());
        }
        Futures.successfulAsList(arrayList).addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.this.m237x86162ec3(runnable);
            }
        }, this.mEncoderExecutor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$stopMediaCodec$10$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m237x86162ec3(Runnable runnable) {
        if ((this.mEncoderInput instanceof SurfaceInput) && !this.mSourceStoppedSignalled) {
            this.mMediaCodec.flush();
            this.mIsFlushedAfterEndOfStream = true;
        } else {
            this.mMediaCodec.stop();
        }
        if (runnable != null) {
            runnable.run();
        }
        handleStopped();
    }

    void handleStopped() {
        if (this.mState == InternalState.PENDING_RELEASE) {
            releaseInternal();
            return;
        }
        InternalState internalState = this.mState;
        if (!this.mIsFlushedAfterEndOfStream) {
            reset();
        }
        setState(InternalState.CONFIGURED);
        if (internalState == InternalState.PENDING_START || internalState == InternalState.PENDING_START_PAUSED) {
            start();
            if (internalState == InternalState.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    void updateTotalPausedDuration(long j) {
        while (!this.mActivePauseResumeTimeRanges.isEmpty()) {
            Range<Long> first = this.mActivePauseResumeTimeRanges.getFirst();
            if (j <= first.getUpper().longValue()) {
                return;
            }
            this.mActivePauseResumeTimeRanges.removeFirst();
            this.mTotalPausedDurationUs += first.getUpper().longValue() - first.getLower().longValue();
            Logger.d(this.mTag, "Total paused duration = " + DebugUtils.readableUs(this.mTotalPausedDurationUs));
        }
    }

    boolean isInPauseRange(long j) {
        for (Range<Long> range : this.mActivePauseResumeTimeRanges) {
            if (range.contains((Range<Long>) Long.valueOf(j))) {
                return true;
            }
            if (j < range.getLower().longValue()) {
                break;
            }
        }
        return false;
    }

    ListenableFuture<InputBuffer> acquireInputBuffer() {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is not started yet."));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                final AtomicReference atomicReference = new AtomicReference();
                ListenableFuture<InputBuffer> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda10
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return atomicReference.set(completer);
                    }
                });
                final CallbackToFutureAdapter.Completer<InputBuffer> completer = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
                this.mAcquisitionQueue.offer(completer);
                completer.addCancellationListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.this.m226x3fb382c1(completer);
                    }
                }, this.mEncoderExecutor);
                matchAcquisitionsAndFreeBufferIndexes();
                return future;
            case 8:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is in error state."));
            case 9:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$acquireInputBuffer$12$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m226x3fb382c1(CallbackToFutureAdapter.Completer completer) {
        this.mAcquisitionQueue.remove(completer);
    }

    void matchAcquisitionsAndFreeBufferIndexes() {
        while (!this.mAcquisitionQueue.isEmpty() && !this.mFreeInputBufferIndexQueue.isEmpty()) {
            CallbackToFutureAdapter.Completer<InputBuffer> poll = this.mAcquisitionQueue.poll();
            try {
                final InputBufferImpl inputBufferImpl = new InputBufferImpl(this.mMediaCodec, this.mFreeInputBufferIndexQueue.poll().intValue());
                if (poll.set(inputBufferImpl)) {
                    this.mInputBufferSet.add(inputBufferImpl);
                    inputBufferImpl.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda7
                        @Override // java.lang.Runnable
                        public final void run() {
                            EncoderImpl.this.m228xa9e8fa9a(inputBufferImpl);
                        }
                    }, this.mEncoderExecutor);
                } else {
                    inputBufferImpl.cancel();
                }
            } catch (MediaCodec.CodecException e) {
                handleEncodeError(e);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$matchAcquisitionsAndFreeBufferIndexes$13$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m228xa9e8fa9a(InputBufferImpl inputBufferImpl) {
        this.mInputBufferSet.remove(inputBufferImpl);
    }

    static long generatePresentationTimeUs() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    static boolean isKeyFrame(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    static boolean isEndOfStream(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class MediaCodecCallback extends MediaCodec.Callback {
        private final CorrectVideoTimeByTimebase mCorrectVideoTimestamp;
        private boolean mHasSendStartCallback = false;
        private boolean mHasFirstData = false;
        private boolean mHasEndData = false;
        private long mLastPresentationTimeUs = 0;
        private long mLastSentPresentationTimeUs = 0;
        private boolean mIsOutputBufferInPauseState = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ MediaFormat lambda$onOutputFormatChanged$5(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        MediaCodecCallback() {
            if (EncoderImpl.this.mIsVideoEncoder && DeviceQuirks.get(CameraUseInconsistentTimebaseQuirk.class) != null) {
                this.mCorrectVideoTimestamp = new CorrectVideoTimeByTimebase();
            } else {
                this.mCorrectVideoTimestamp = null;
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.this.m246xa20c30ed(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onInputBufferAvailable$0$androidx-camera-video-internal-encoder-EncoderImpl$MediaCodecCallback  reason: not valid java name */
        public /* synthetic */ void m246xa20c30ed(int i) {
            switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[EncoderImpl.this.mState.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    EncoderImpl.this.mFreeInputBufferIndexQueue.offer(Integer.valueOf(i));
                    EncoderImpl.this.matchAcquisitionsAndFreeBufferIndexes();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.this.m248x9e380be0(bufferInfo, mediaCodec, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onOutputBufferAvailable$2$androidx-camera-video-internal-encoder-EncoderImpl$MediaCodecCallback  reason: not valid java name */
        public /* synthetic */ void m248x9e380be0(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
            final EncoderCallback encoderCallback;
            final Executor executor;
            switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[EncoderImpl.this.mState.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (EncoderImpl.this.mLock) {
                        encoderCallback = EncoderImpl.this.mEncoderCallback;
                        executor = EncoderImpl.this.mEncoderCallbackExecutor;
                    }
                    CorrectVideoTimeByTimebase correctVideoTimeByTimebase = this.mCorrectVideoTimestamp;
                    if (correctVideoTimeByTimebase != null) {
                        correctVideoTimeByTimebase.correctTimestamp(bufferInfo);
                    }
                    if (!this.mHasSendStartCallback) {
                        this.mHasSendStartCallback = true;
                        try {
                            Objects.requireNonNull(encoderCallback);
                            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    EncoderCallback.this.onEncodeStart();
                                }
                            });
                        } catch (RejectedExecutionException e) {
                            Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                        }
                    }
                    if (!checkBufferInfo(bufferInfo)) {
                        if (!this.mHasFirstData) {
                            this.mHasFirstData = true;
                        }
                        if (EncoderImpl.this.mTotalPausedDurationUs > 0) {
                            bufferInfo.presentationTimeUs -= EncoderImpl.this.mTotalPausedDurationUs;
                        }
                        this.mLastSentPresentationTimeUs = bufferInfo.presentationTimeUs;
                        try {
                            sendEncodedData(new EncodedDataImpl(mediaCodec, i, bufferInfo), encoderCallback, executor);
                        } catch (MediaCodec.CodecException e2) {
                            EncoderImpl.this.handleEncodeError(e2);
                            return;
                        }
                    } else {
                        try {
                            EncoderImpl.this.mMediaCodec.releaseOutputBuffer(i, false);
                        } catch (MediaCodec.CodecException e3) {
                            EncoderImpl.this.handleEncodeError(e3);
                            return;
                        }
                    }
                    if (this.mHasEndData || !EncoderImpl.isEndOfStream(bufferInfo)) {
                        return;
                    }
                    this.mHasEndData = true;
                    EncoderImpl.this.stopMediaCodec(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda7
                        @Override // java.lang.Runnable
                        public final void run() {
                            EncoderImpl.MediaCodecCallback.this.m247xbb0c589f(executor, encoderCallback);
                        }
                    });
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onOutputBufferAvailable$1$androidx-camera-video-internal-encoder-EncoderImpl$MediaCodecCallback  reason: not valid java name */
        public /* synthetic */ void m247xbb0c589f(Executor executor, final EncoderCallback encoderCallback) {
            if (EncoderImpl.this.mState == InternalState.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(encoderCallback);
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderCallback.this.onEncodeStop();
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
            }
        }

        private void sendEncodedData(final EncodedDataImpl encodedDataImpl, final EncoderCallback encoderCallback, Executor executor) {
            EncoderImpl.this.mEncodedDataSet.add(encodedDataImpl);
            Futures.addCallback(encodedDataImpl.getClosedFuture(), new FutureCallback<Void>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(Void r2) {
                    EncoderImpl.this.mEncodedDataSet.remove(encodedDataImpl);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable th) {
                    EncoderImpl.this.mEncodedDataSet.remove(encodedDataImpl);
                    if (th instanceof MediaCodec.CodecException) {
                        EncoderImpl.this.handleEncodeError((MediaCodec.CodecException) th);
                    } else {
                        EncoderImpl.this.handleEncodeError(0, th.getMessage(), th);
                    }
                }
            }, EncoderImpl.this.mEncoderExecutor);
            try {
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderCallback.this.onEncodedData(encodedDataImpl);
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                encodedDataImpl.close();
            }
        }

        private boolean checkBufferInfo(MediaCodec.BufferInfo bufferInfo) {
            if (this.mHasEndData) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by already reach end of stream.");
                return true;
            } else if (bufferInfo.size <= 0) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by invalid buffer size.");
                return true;
            } else if ((bufferInfo.flags & 2) != 0) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by codec config.");
                return true;
            } else if (bufferInfo.presentationTimeUs <= this.mLastPresentationTimeUs) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by out of order buffer from MediaCodec.");
                return true;
            } else {
                this.mLastPresentationTimeUs = bufferInfo.presentationTimeUs;
                if (!EncoderImpl.this.mStartStopTimeRangeUs.contains((Range<Long>) Long.valueOf(bufferInfo.presentationTimeUs))) {
                    Logger.d(EncoderImpl.this.mTag, "Drop buffer by not in start-stop range.");
                    if (EncoderImpl.this.mPendingCodecStop && bufferInfo.presentationTimeUs >= EncoderImpl.this.mStartStopTimeRangeUs.getUpper().longValue()) {
                        if (EncoderImpl.this.mStopTimeoutFuture != null) {
                            EncoderImpl.this.mStopTimeoutFuture.cancel(true);
                        }
                        EncoderImpl.this.mLastDataStopTimestamp = Long.valueOf(bufferInfo.presentationTimeUs);
                        EncoderImpl.this.signalCodecStop();
                        EncoderImpl.this.mPendingCodecStop = false;
                    }
                    return true;
                } else if (updatePauseRangeStateAndCheckIfBufferPaused(bufferInfo)) {
                    Logger.d(EncoderImpl.this.mTag, "Drop buffer by pause.");
                    return true;
                } else if (this.mHasFirstData || !EncoderImpl.this.mIsVideoEncoder || EncoderImpl.isKeyFrame(bufferInfo)) {
                    return false;
                } else {
                    Logger.d(EncoderImpl.this.mTag, "Drop buffer by first video frame is not key frame.");
                    EncoderImpl.this.requestKeyFrameToMediaCodec();
                    return true;
                }
            }
        }

        private boolean updatePauseRangeStateAndCheckIfBufferPaused(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final EncoderCallback encoderCallback;
            EncoderImpl.this.updateTotalPausedDuration(bufferInfo.presentationTimeUs);
            boolean isInPauseRange = EncoderImpl.this.isInPauseRange(bufferInfo.presentationTimeUs);
            boolean z = this.mIsOutputBufferInPauseState;
            if (!z && isInPauseRange) {
                Logger.d(EncoderImpl.this.mTag, "Switch to pause state");
                this.mIsOutputBufferInPauseState = true;
                synchronized (EncoderImpl.this.mLock) {
                    executor = EncoderImpl.this.mEncoderCallbackExecutor;
                    encoderCallback = EncoderImpl.this.mEncoderCallback;
                }
                Objects.requireNonNull(encoderCallback);
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderCallback.this.onEncodePaused();
                    }
                });
                if (EncoderImpl.this.mState == InternalState.PAUSED && ((EncoderImpl.this.mIsVideoEncoder || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!EncoderImpl.this.mIsVideoEncoder || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    if (EncoderImpl.this.mEncoderInput instanceof ByteBufferInput) {
                        ((ByteBufferInput) EncoderImpl.this.mEncoderInput).setActive(false);
                    }
                    EncoderImpl.this.setMediaCodecPaused(true);
                }
                EncoderImpl.this.mLastDataStopTimestamp = Long.valueOf(bufferInfo.presentationTimeUs);
                if (EncoderImpl.this.mPendingCodecStop) {
                    if (EncoderImpl.this.mStopTimeoutFuture != null) {
                        EncoderImpl.this.mStopTimeoutFuture.cancel(true);
                    }
                    EncoderImpl.this.signalCodecStop();
                    EncoderImpl.this.mPendingCodecStop = false;
                }
            } else if (z && !isInPauseRange) {
                if (EncoderImpl.this.mIsVideoEncoder && !EncoderImpl.isKeyFrame(bufferInfo)) {
                    Logger.d(EncoderImpl.this.mTag, "Not a key frame, don't switch to resume state.");
                    EncoderImpl.this.requestKeyFrameToMediaCodec();
                } else if (bufferInfo.presentationTimeUs - EncoderImpl.this.mTotalPausedDurationUs > this.mLastSentPresentationTimeUs) {
                    Logger.d(EncoderImpl.this.mTag, "Switch to resume state");
                    this.mIsOutputBufferInPauseState = false;
                } else {
                    Logger.d(EncoderImpl.this.mTag, "Adjusted time by pause duration is invalid.");
                }
            }
            return this.mIsOutputBufferInPauseState;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.this.m245x7242b142(codecException);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onError$4$androidx-camera-video-internal-encoder-EncoderImpl$MediaCodecCallback  reason: not valid java name */
        public /* synthetic */ void m245x7242b142(MediaCodec.CodecException codecException) {
            switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[EncoderImpl.this.mState.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    EncoderImpl.this.handleEncodeError(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.this.m249xd741dd39(mediaFormat);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onOutputFormatChanged$7$androidx-camera-video-internal-encoder-EncoderImpl$MediaCodecCallback  reason: not valid java name */
        public /* synthetic */ void m249xd741dd39(final MediaFormat mediaFormat) {
            final EncoderCallback encoderCallback;
            Executor executor;
            switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[EncoderImpl.this.mState.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (EncoderImpl.this.mLock) {
                        encoderCallback = EncoderImpl.this.mEncoderCallback;
                        executor = EncoderImpl.this.mEncoderCallbackExecutor;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                EncoderCallback.this.onOutputConfigUpdate(new OutputConfig() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda4
                                    @Override // androidx.camera.video.internal.encoder.OutputConfig
                                    public final MediaFormat getMediaFormat() {
                                        return EncoderImpl.MediaCodecCallback.lambda$onOutputFormatChanged$5(r1);
                                    }
                                });
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e) {
                        Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class SurfaceInput implements Encoder.SurfaceInput {
        private final Object mLock = new Object();
        private final Set<Surface> mObsoleteSurfaces = new HashSet();
        private Surface mSurface;
        private Executor mSurfaceUpdateExecutor;
        private Encoder.SurfaceInput.OnSurfaceUpdateListener mSurfaceUpdateListener;

        SurfaceInput() {
        }

        @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput
        public void setOnSurfaceUpdateListener(Executor executor, Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener) {
            Surface surface;
            synchronized (this.mLock) {
                this.mSurfaceUpdateListener = (Encoder.SurfaceInput.OnSurfaceUpdateListener) Preconditions.checkNotNull(onSurfaceUpdateListener);
                this.mSurfaceUpdateExecutor = (Executor) Preconditions.checkNotNull(executor);
                surface = this.mSurface;
            }
            if (surface != null) {
                notifySurfaceUpdate(executor, onSurfaceUpdateListener, surface);
            }
        }

        void resetSurface() {
            Surface createInputSurface;
            Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.mLock) {
                if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                    if (this.mSurface == null) {
                        createInputSurface = Api23Impl.createPersistentInputSurface();
                        this.mSurface = createInputSurface;
                    } else {
                        createInputSurface = null;
                    }
                    Api23Impl.setInputSurface(EncoderImpl.this.mMediaCodec, this.mSurface);
                } else {
                    Surface surface = this.mSurface;
                    if (surface != null) {
                        this.mObsoleteSurfaces.add(surface);
                    }
                    createInputSurface = EncoderImpl.this.mMediaCodec.createInputSurface();
                    this.mSurface = createInputSurface;
                }
                onSurfaceUpdateListener = this.mSurfaceUpdateListener;
                executor = this.mSurfaceUpdateExecutor;
            }
            if (createInputSurface == null || onSurfaceUpdateListener == null || executor == null) {
                return;
            }
            notifySurfaceUpdate(executor, onSurfaceUpdateListener, createInputSurface);
        }

        void releaseSurface() {
            Surface surface;
            HashSet<Surface> hashSet;
            synchronized (this.mLock) {
                surface = this.mSurface;
                this.mSurface = null;
                hashSet = new HashSet(this.mObsoleteSurfaces);
                this.mObsoleteSurfaces.clear();
            }
            if (surface != null) {
                surface.release();
            }
            for (Surface surface2 : hashSet) {
                surface2.release();
            }
        }

        private void notifySurfaceUpdate(Executor executor, final Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$SurfaceInput$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Encoder.SurfaceInput.OnSurfaceUpdateListener.this.onSurfaceUpdate(surface);
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ByteBufferInput implements Encoder.ByteBufferInput {
        private final Map<Observable.Observer<? super BufferProvider.State>, Executor> mStateObservers = new LinkedHashMap();
        private BufferProvider.State mBufferProviderState = BufferProvider.State.INACTIVE;
        private final List<ListenableFuture<InputBuffer>> mAcquisitionList = new ArrayList();

        ByteBufferInput() {
        }

        @Override // androidx.camera.core.impl.Observable
        public ListenableFuture<BufferProvider.State> fetchData() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda8
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.ByteBufferInput.this.m243xdbdcf33f(completer);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$fetchData$0$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ void m242x3f6ef6e0(CallbackToFutureAdapter.Completer completer) {
            completer.set(this.mBufferProviderState);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$fetchData$1$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ Object m243xdbdcf33f(final CallbackToFutureAdapter.Completer completer) throws Exception {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.ByteBufferInput.this.m242x3f6ef6e0(completer);
                }
            });
            return "fetchData";
        }

        @Override // androidx.camera.video.internal.BufferProvider
        public ListenableFuture<InputBuffer> acquireBuffer() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda3
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.ByteBufferInput.this.m240xc1b33249(completer);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$acquireBuffer$5$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ Object m240xc1b33249(final CallbackToFutureAdapter.Completer completer) throws Exception {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.ByteBufferInput.this.m239x254535ea(completer);
                }
            });
            return "acquireBuffer";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$acquireBuffer$4$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ void m239x254535ea(CallbackToFutureAdapter.Completer completer) {
            if (this.mBufferProviderState == BufferProvider.State.ACTIVE) {
                final ListenableFuture<InputBuffer> acquireInputBuffer = EncoderImpl.this.acquireInputBuffer();
                Futures.propagate(acquireInputBuffer, completer);
                completer.addCancellationListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListenableFuture.this.cancel(true);
                    }
                }, CameraXExecutors.directExecutor());
                this.mAcquisitionList.add(acquireInputBuffer);
                acquireInputBuffer.addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.ByteBufferInput.this.m238x88d7398b(acquireInputBuffer);
                    }
                }, EncoderImpl.this.mEncoderExecutor);
            } else if (this.mBufferProviderState == BufferProvider.State.INACTIVE) {
                completer.setException(new IllegalStateException("BufferProvider is not active."));
            } else {
                completer.setException(new IllegalStateException("Unknown state: " + this.mBufferProviderState));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$acquireBuffer$3$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ void m238x88d7398b(ListenableFuture listenableFuture) {
            this.mAcquisitionList.remove(listenableFuture);
        }

        @Override // androidx.camera.core.impl.Observable
        public void addObserver(final Executor executor, final Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.ByteBufferInput.this.m241x11117d06(observer, executor);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$addObserver$7$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ void m241x11117d06(final Observable.Observer observer, Executor executor) {
            this.mStateObservers.put((Observable.Observer) Preconditions.checkNotNull(observer), (Executor) Preconditions.checkNotNull(executor));
            final BufferProvider.State state = this.mBufferProviderState;
            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Observable.Observer.this.onNewData(state);
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public void removeObserver(final Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.ByteBufferInput.this.m244x87db4ec8(observer);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$removeObserver$8$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ void m244x87db4ec8(Observable.Observer observer) {
            this.mStateObservers.remove(Preconditions.checkNotNull(observer));
        }

        void setActive(boolean z) {
            final BufferProvider.State state = z ? BufferProvider.State.ACTIVE : BufferProvider.State.INACTIVE;
            if (this.mBufferProviderState == state) {
                return;
            }
            this.mBufferProviderState = state;
            if (state == BufferProvider.State.INACTIVE) {
                for (ListenableFuture<InputBuffer> listenableFuture : this.mAcquisitionList) {
                    listenableFuture.cancel(true);
                }
                this.mAcquisitionList.clear();
            }
            for (final Map.Entry<Observable.Observer<? super BufferProvider.State>, Executor> entry : this.mStateObservers.entrySet()) {
                try {
                    entry.getValue().execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((Observable.Observer) entry.getKey()).onNewData(state);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        static Surface createPersistentInputSurface() {
            return MediaCodec.createPersistentInputSurface();
        }

        static void setInputSurface(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }
}
