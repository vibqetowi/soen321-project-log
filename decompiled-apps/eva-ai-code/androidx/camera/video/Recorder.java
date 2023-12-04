package androidx.camera.video;

import android.content.ContentValues;
import android.content.Context;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CamcorderProfileProxy;
import androidx.camera.core.impl.MutableStateObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.StateObservable;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.Recorder;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.AudioSource;
import androidx.camera.video.internal.AudioSourceAccessException;
import androidx.camera.video.internal.ResourceCreationException;
import androidx.camera.video.internal.compat.Api26Impl;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.config.AudioEncoderConfigCamcorderProfileResolver;
import androidx.camera.video.internal.config.AudioEncoderConfigDefaultResolver;
import androidx.camera.video.internal.config.AudioSourceSettingsCamcorderProfileResolver;
import androidx.camera.video.internal.config.AudioSourceSettingsDefaultResolver;
import androidx.camera.video.internal.config.MimeInfo;
import androidx.camera.video.internal.config.VideoEncoderConfigCamcorderProfileResolver;
import androidx.camera.video.internal.config.VideoEncoderConfigDefaultResolver;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.utils.OutputUtil;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class Recorder implements VideoOutput {
    static final EncoderFactory DEFAULT_ENCODER_FACTORY;
    public static final QualitySelector DEFAULT_QUALITY_SELECTOR;
    private static final String MEDIA_COLUMN = "_data";
    private static final MediaSpec MEDIA_SPEC_DEFAULT;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final Exception PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
    private static final long SOURCE_NON_STREAMING_TIMEOUT_MS = 1000;
    private static final String TAG = "Recorder";
    private static final VideoSpec VIDEO_SPEC_DEFAULT;
    private final EncoderFactory mAudioEncoderFactory;
    private final Executor mExecutor;
    final MutableStateObservable<MediaSpec> mMediaSpec;
    final Executor mSequentialExecutor;
    private boolean mShouldWaitForNewSurface;
    private final MutableStateObservable<StreamInfo> mStreamInfo;
    SurfaceRequest mSurfaceRequest;
    private final Executor mUserProvidedExecutor;
    private final EncoderFactory mVideoEncoderFactory;
    private static final Set<State> PENDING_STATES = Collections.unmodifiableSet(EnumSet.of(State.PENDING_RECORDING, State.PENDING_PAUSED));
    private static final Set<State> VALID_NON_PENDING_STATES_WHILE_PENDING = Collections.unmodifiableSet(EnumSet.of(State.INITIALIZING, State.IDLING, State.RESETTING, State.STOPPING, State.ERROR));
    private final Object mLock = new Object();
    private State mState = State.INITIALIZING;
    private State mNonPendingState = null;
    int mStreamId = 0;
    RecordingRecord mActiveRecordingRecord = null;
    RecordingRecord mPendingRecordingRecord = null;
    private long mLastGeneratedRecordingId = 0;
    private RecordingRecord mInProgressRecording = null;
    boolean mInProgressRecordingStopping = false;
    private SurfaceRequest.TransformationInfo mSurfaceTransformationInfo = null;
    private CamcorderProfileProxy mResolvedCamcorderProfile = null;
    final List<ListenableFuture<Void>> mEncodingFutures = new ArrayList();
    Integer mAudioTrackIndex = null;
    Integer mVideoTrackIndex = null;
    Surface mLatestSurface = null;
    Surface mActiveSurface = null;
    MediaMuxer mMediaMuxer = null;
    AudioSource mAudioSource = null;
    Encoder mVideoEncoder = null;
    OutputConfig mVideoOutputConfig = null;
    Encoder mAudioEncoder = null;
    OutputConfig mAudioOutputConfig = null;
    AudioState mAudioState = AudioState.INITIALIZING;
    Uri mOutputUri = Uri.EMPTY;
    long mRecordingBytes = 0;
    long mRecordingDurationNs = 0;
    long mFirstRecordingVideoDataTimeUs = 0;
    long mFileSizeLimitInBytes = 0;
    int mRecordingStopError = 1;
    Throwable mRecordingStopErrorCause = null;
    EncodedData mPendingFirstVideoData = null;
    EncodedData mPendingFirstAudioData = null;
    Throwable mAudioErrorCause = null;
    boolean mIsAudioSourceSilenced = false;
    VideoOutput.SourceState mSourceState = VideoOutput.SourceState.INACTIVE;
    private ScheduledFuture<?> mSourceNonStreamingTimeout = null;

    /* loaded from: classes.dex */
    public enum AudioState {
        INITIALIZING,
        IDLING,
        DISABLED,
        ACTIVE,
        ERROR
    }

    /* loaded from: classes.dex */
    public enum State {
        INITIALIZING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        QualitySelector fromOrderedList = QualitySelector.fromOrderedList(Arrays.asList(Quality.FHD, Quality.HD, Quality.SD), FallbackStrategy.higherQualityOrLowerThan(Quality.FHD));
        DEFAULT_QUALITY_SELECTOR = fromOrderedList;
        VideoSpec build = VideoSpec.builder().setQualitySelector(fromOrderedList).setAspectRatio(1).build();
        VIDEO_SPEC_DEFAULT = build;
        MEDIA_SPEC_DEFAULT = MediaSpec.builder().setOutputFormat(-1).setVideoSpec(build).build();
        PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE = new RuntimeException("The video frame producer became inactive before any data was received.");
        DEFAULT_ENCODER_FACTORY = new EncoderFactory() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda15
            @Override // androidx.camera.video.internal.encoder.EncoderFactory
            public final Encoder createEncoder(Executor executor, EncoderConfig encoderConfig) {
                return new EncoderImpl(executor, encoderConfig);
            }
        };
    }

    Recorder(Executor executor, MediaSpec mediaSpec, EncoderFactory encoderFactory, EncoderFactory encoderFactory2) {
        this.mUserProvidedExecutor = executor;
        executor = executor == null ? CameraXExecutors.ioExecutor() : executor;
        this.mExecutor = executor;
        this.mSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mMediaSpec = MutableStateObservable.withInitialState(composeRecorderMediaSpec(mediaSpec));
        this.mStreamInfo = MutableStateObservable.withInitialState(StreamInfo.of(this.mStreamId, internalStateToStreamState(this.mState)));
        this.mVideoEncoderFactory = encoderFactory;
        this.mAudioEncoderFactory = encoderFactory2;
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSurfaceRequested(final SurfaceRequest surfaceRequest) {
        synchronized (this.mLock) {
            Logger.d(TAG, "Surface is requested in state: " + this.mState + ", Current surface: " + this.mStreamId);
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda16
                        @Override // java.lang.Runnable
                        public final void run() {
                            Recorder.this.m198lambda$onSurfaceRequested$0$androidxcameravideoRecorder(surfaceRequest);
                        }
                    });
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Surface was requested when the Recorder had been initialized with state " + this.mState);
                case 9:
                    Logger.w(TAG, "Surface was requested when the Recorder had encountered error.");
                    setState(State.INITIALIZING);
                    this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda17
                        @Override // java.lang.Runnable
                        public final void run() {
                            Recorder.this.m199lambda$onSurfaceRequested$1$androidxcameravideoRecorder(surfaceRequest);
                        }
                    });
                    break;
            }
        }
    }

    /* renamed from: lambda$onSurfaceRequested$0$androidx-camera-video-Recorder */
    public /* synthetic */ void m198lambda$onSurfaceRequested$0$androidxcameravideoRecorder(SurfaceRequest surfaceRequest) {
        this.mSurfaceRequest = surfaceRequest;
        initializeInternal(surfaceRequest);
    }

    /* renamed from: lambda$onSurfaceRequested$1$androidx-camera-video-Recorder */
    public /* synthetic */ void m199lambda$onSurfaceRequested$1$androidxcameravideoRecorder(SurfaceRequest surfaceRequest) {
        SurfaceRequest surfaceRequest2 = this.mSurfaceRequest;
        if (surfaceRequest2 != null) {
            surfaceRequest2.willNotProvideSurface();
        }
        this.mSurfaceRequest = surfaceRequest;
        initializeInternal(surfaceRequest);
    }

    @Override // androidx.camera.video.VideoOutput
    public Observable<MediaSpec> getMediaSpec() {
        return this.mMediaSpec;
    }

    @Override // androidx.camera.video.VideoOutput
    public Observable<StreamInfo> getStreamInfo() {
        return this.mStreamInfo;
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSourceStateChanged(final VideoOutput.SourceState sourceState) {
        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                Recorder.this.m197lambda$onSourceStateChanged$2$androidxcameravideoRecorder(sourceState);
            }
        });
    }

    public PendingRecording prepareRecording(Context context, FileOutputOptions fileOutputOptions) {
        return prepareRecordingInternal(context, fileOutputOptions);
    }

    public PendingRecording prepareRecording(Context context, FileDescriptorOutputOptions fileDescriptorOutputOptions) {
        if (Build.VERSION.SDK_INT < 26) {
            throw new UnsupportedOperationException("File descriptors as output destinations are not supported on pre-Android O (API 26) devices.");
        }
        return prepareRecordingInternal(context, fileDescriptorOutputOptions);
    }

    public PendingRecording prepareRecording(Context context, MediaStoreOutputOptions mediaStoreOutputOptions) {
        return prepareRecordingInternal(context, mediaStoreOutputOptions);
    }

    private PendingRecording prepareRecordingInternal(Context context, OutputOptions outputOptions) {
        Preconditions.checkNotNull(outputOptions, "The OutputOptions cannot be null.");
        return new PendingRecording(context, this, outputOptions);
    }

    public QualitySelector getQualitySelector() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getQualitySelector();
    }

    int getAudioSource() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getSource();
    }

    public Executor getExecutor() {
        return this.mUserProvidedExecutor;
    }

    int getAspectRatio() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getAspectRatio();
    }

    public Recording start(PendingRecording pendingRecording) {
        long j;
        RecordingRecord recordingRecord;
        int i;
        RecordingRecord recordingRecord2;
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        synchronized (this.mLock) {
            j = this.mLastGeneratedRecordingId + 1;
            this.mLastGeneratedRecordingId = j;
            recordingRecord = null;
            i = 0;
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                case 2:
                case 5:
                case 6:
                case 9:
                    if (this.mState == State.IDLING) {
                        Preconditions.checkState(this.mActiveRecordingRecord == null && this.mPendingRecordingRecord == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                    }
                    try {
                        RecordingRecord from = RecordingRecord.from(pendingRecording, j);
                        from.initializeRecording(pendingRecording.getApplicationContext());
                        this.mPendingRecordingRecord = from;
                        if (this.mState == State.IDLING) {
                            setState(State.PENDING_RECORDING);
                            this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda13
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Recorder.this.tryServicePendingRecording();
                                }
                            });
                        } else if (this.mState == State.ERROR) {
                            setState(State.PENDING_RECORDING);
                            this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda14
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Recorder.this.m204lambda$start$3$androidxcameravideoRecorder();
                                }
                            });
                        } else {
                            setState(State.PENDING_RECORDING);
                        }
                        e = null;
                        break;
                    } catch (IOException e) {
                        e = e;
                        i = 5;
                        break;
                    }
                case 3:
                case 4:
                    recordingRecord2 = (RecordingRecord) Preconditions.checkNotNull(this.mPendingRecordingRecord);
                    recordingRecord = recordingRecord2;
                    e = null;
                    break;
                case 7:
                case 8:
                    recordingRecord2 = this.mActiveRecordingRecord;
                    recordingRecord = recordingRecord2;
                    e = null;
                    break;
                default:
                    e = null;
                    break;
            }
        }
        if (recordingRecord == null) {
            if (i != 0) {
                Logger.e(TAG, "Recording was started when the Recorder had encountered error " + e);
                finalizePendingRecording(RecordingRecord.from(pendingRecording, j), i, e);
                return Recording.createFinalizedFrom(pendingRecording, j);
            }
            return Recording.from(pendingRecording, j);
        }
        throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
    }

    /* renamed from: lambda$start$3$androidx-camera-video-Recorder */
    public /* synthetic */ void m204lambda$start$3$androidxcameravideoRecorder() {
        SurfaceRequest surfaceRequest = this.mSurfaceRequest;
        if (surfaceRequest == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        initializeInternal(surfaceRequest);
    }

    public void pause(Recording recording) {
        synchronized (this.mLock) {
            if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                Logger.d(TAG, "pause() called on a recording that is no longer active: " + recording.getOutputOptions());
                return;
            }
            int i = AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()];
            if (i == 3) {
                setState(State.PENDING_PAUSED);
            } else if (i == 5 || i == 6) {
                throw new IllegalStateException("Called pause() from invalid state: " + this.mState);
            } else if (i == 7) {
                setState(State.PAUSED);
                final RecordingRecord recordingRecord = this.mActiveRecordingRecord;
                this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        Recorder.this.m200lambda$pause$4$androidxcameravideoRecorder(recordingRecord);
                    }
                });
            }
        }
    }

    public void resume(Recording recording) {
        synchronized (this.mLock) {
            if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                Logger.d(TAG, "resume() called on a recording that is no longer active: " + recording.getOutputOptions());
                return;
            }
            int i = AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()];
            if (i == 4) {
                setState(State.PENDING_RECORDING);
            } else if (i == 5 || i == 6) {
                throw new IllegalStateException("Called resume() from invalid state: " + this.mState);
            } else if (i == 8) {
                setState(State.RECORDING);
                final RecordingRecord recordingRecord = this.mActiveRecordingRecord;
                this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Recorder.this.m201lambda$resume$5$androidxcameravideoRecorder(recordingRecord);
                    }
                });
            }
        }
    }

    public void stop(Recording recording) {
        synchronized (this.mLock) {
            if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                Logger.d(TAG, "stop() called on a recording that is no longer active: " + recording.getOutputOptions());
                return;
            }
            RecordingRecord recordingRecord = null;
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                case 2:
                    Preconditions.checkState(isSameRecording(recording, this.mActiveRecordingRecord));
                    break;
                case 3:
                case 4:
                    Preconditions.checkState(isSameRecording(recording, this.mPendingRecordingRecord));
                    RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                    this.mPendingRecordingRecord = null;
                    restoreNonPendingState();
                    recordingRecord = recordingRecord2;
                    break;
                case 5:
                case 6:
                    throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                case 7:
                case 8:
                    setState(State.STOPPING);
                    final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                    final RecordingRecord recordingRecord3 = this.mActiveRecordingRecord;
                    this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            Recorder.this.m205lambda$stop$6$androidxcameravideoRecorder(recordingRecord3, micros);
                        }
                    });
                    break;
            }
            if (recordingRecord != null) {
                finalizePendingRecording(recordingRecord, 8, new RuntimeException("Recording was stopped before any data could be produced."));
            }
        }
    }

    /* renamed from: lambda$stop$6$androidx-camera-video-Recorder */
    public /* synthetic */ void m205lambda$stop$6$androidxcameravideoRecorder(RecordingRecord recordingRecord, long j) {
        stopInternal(recordingRecord, Long.valueOf(j), 0, null);
    }

    private void finalizePendingRecording(RecordingRecord recordingRecord, int i, Throwable th) {
        recordingRecord.finalizeRecording(Uri.EMPTY);
        recordingRecord.updateVideoRecordEvent(VideoRecordEvent.finalizeWithError(recordingRecord.getOutputOptions(), RecordingStats.of(0L, 0L, AudioStats.of(1, this.mAudioErrorCause)), OutputResults.of(Uri.EMPTY), i, th));
    }

    /* renamed from: onSourceStateChangedInternal */
    public void m197lambda$onSourceStateChanged$2$androidxcameravideoRecorder(VideoOutput.SourceState sourceState) {
        ScheduledFuture<?> scheduledFuture;
        Encoder encoder;
        VideoOutput.SourceState sourceState2 = this.mSourceState;
        this.mSourceState = sourceState;
        if (sourceState2 != sourceState) {
            Logger.d(TAG, "Video source has transitioned to state: " + sourceState);
            if (sourceState == VideoOutput.SourceState.INACTIVE) {
                if (this.mActiveSurface == null) {
                    reset(4, null);
                    setLatestSurface(null);
                    return;
                }
                RecordingRecord recordingRecord = this.mInProgressRecording;
                if (recordingRecord != null) {
                    onInProgressRecordingInternalError(recordingRecord, 4, null);
                    return;
                }
                return;
            } else if (sourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING || (scheduledFuture = this.mSourceNonStreamingTimeout) == null || !scheduledFuture.cancel(false) || (encoder = this.mVideoEncoder) == null) {
                return;
            } else {
                notifyEncoderSourceStopped(encoder);
                return;
            }
        }
        Logger.d(TAG, "Video source transitions to the same state: " + sourceState);
    }

    void reset(int i, Throwable th) {
        boolean z;
        boolean z2;
        synchronized (this.mLock) {
            z = true;
            z2 = false;
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                    setState(State.RESETTING);
                    z = false;
                    break;
                case 2:
                default:
                    z = false;
                    break;
                case 3:
                case 4:
                    updateNonPendingState(State.RESETTING);
                    break;
                case 5:
                    break;
                case 6:
                case 9:
                    setState(State.INITIALIZING);
                    break;
                case 7:
                case 8:
                    if (this.mActiveRecordingRecord != this.mInProgressRecording) {
                        throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                    }
                    setState(State.RESETTING);
                    z2 = true;
                    z = false;
                    break;
            }
        }
        if (z) {
            resetInternal();
        } else if (z2) {
            stopInternal(this.mInProgressRecording, null, i, th);
        }
    }

    private void initializeInternal(SurfaceRequest surfaceRequest) {
        Surface surface = this.mLatestSurface;
        if (surface != null) {
            this.mActiveSurface = surface;
            surfaceRequest.provideSurface(surface, this.mSequentialExecutor, new Recorder$$ExternalSyntheticLambda10(this));
            onInitialized();
            return;
        }
        surfaceRequest.setTransformationInfoListener(this.mSequentialExecutor, new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda11
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                Recorder.this.m196lambda$initializeInternal$7$androidxcameravideoRecorder(transformationInfo);
            }
        });
        Size resolution = surfaceRequest.getResolution();
        VideoCapabilities from = VideoCapabilities.from(surfaceRequest.getCamera().getCameraInfo());
        Quality findHighestSupportedQualityFor = from.findHighestSupportedQualityFor(resolution);
        Logger.d(TAG, "Using supported quality of " + findHighestSupportedQualityFor + " for surface size " + resolution);
        if (findHighestSupportedQualityFor != Quality.NONE) {
            CamcorderProfileProxy profile = from.getProfile(findHighestSupportedQualityFor);
            this.mResolvedCamcorderProfile = profile;
            if (profile == null) {
                throw new AssertionError("Camera advertised available quality but did not produce CamcorderProfile for advertised quality.");
            }
        }
        setupVideo(surfaceRequest);
    }

    /* renamed from: lambda$initializeInternal$7$androidx-camera-video-Recorder */
    public /* synthetic */ void m196lambda$initializeInternal$7$androidxcameravideoRecorder(SurfaceRequest.TransformationInfo transformationInfo) {
        this.mSurfaceTransformationInfo = transformationInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002e A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:43:0x0005, B:44:0x0011, B:66:0x0071, B:46:0x0015, B:47:0x001e, B:50:0x0027, B:53:0x002e, B:55:0x0034, B:56:0x003f, B:57:0x004a, B:58:0x005d, B:59:0x005e, B:61:0x0062, B:62:0x0065, B:63:0x006c), top: B:75:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onInitialized() {
        RecordingRecord recordingRecord;
        boolean z;
        int i;
        Throwable th;
        RecordingRecord recordingRecord2;
        synchronized (this.mLock) {
            recordingRecord = null;
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                    if (this.mShouldWaitForNewSurface) {
                        this.mShouldWaitForNewSurface = false;
                        recordingRecord2 = null;
                        z = false;
                        i = 0;
                        th = recordingRecord2;
                        break;
                    } else {
                        throw new AssertionError("Unexpectedly invoke onInitialized() in a STOPPING state when it's not waiting for a new surface.");
                    }
                case 2:
                case 6:
                case 7:
                case 8:
                    throw new AssertionError("Incorrectly invoke onInitialized() in state " + this.mState);
                case 3:
                    z = false;
                    if (this.mActiveRecordingRecord == null) {
                        recordingRecord2 = null;
                        i = 0;
                        th = recordingRecord2;
                        break;
                    } else if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                        recordingRecord2 = this.mPendingRecordingRecord;
                        this.mPendingRecordingRecord = null;
                        restoreNonPendingState();
                        th = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                        i = 4;
                    } else {
                        i = 0;
                        th = null;
                        recordingRecord = makePendingRecordingActiveLocked(this.mState);
                        recordingRecord2 = null;
                    }
                case 4:
                    z = true;
                    if (this.mActiveRecordingRecord == null) {
                    }
                    break;
                case 5:
                    setState(State.IDLING);
                    recordingRecord2 = null;
                    z = false;
                    i = 0;
                    th = recordingRecord2;
                    break;
                case 9:
                    Logger.e(TAG, "onInitialized() was invoked when the Recorder had encountered error");
                    recordingRecord2 = null;
                    z = false;
                    i = 0;
                    th = recordingRecord2;
                    break;
                default:
                    recordingRecord2 = null;
                    z = false;
                    i = 0;
                    th = recordingRecord2;
                    break;
            }
        }
        if (recordingRecord != null) {
            startRecording(recordingRecord, z);
        } else if (recordingRecord2 != null) {
            finalizePendingRecording(recordingRecord2, i, th);
        }
    }

    private MediaSpec composeRecorderMediaSpec(MediaSpec mediaSpec) {
        MediaSpec.Builder builder = mediaSpec.toBuilder();
        if (mediaSpec.getVideoSpec().getAspectRatio() == -1) {
            builder.configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setAspectRatio(Recorder.VIDEO_SPEC_DEFAULT.getAspectRatio());
                }
            });
        }
        return builder.build();
    }

    private static boolean isSameRecording(Recording recording, RecordingRecord recordingRecord) {
        return recordingRecord != null && recording.getRecordingId() == recordingRecord.getRecordingId();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private MimeInfo resolveAudioMimeInfo(MediaSpec mediaSpec) {
        boolean z;
        String outputFormatToAudioMime = MediaSpec.outputFormatToAudioMime(mediaSpec.getOutputFormat());
        int outputFormatToAudioProfile = MediaSpec.outputFormatToAudioProfile(mediaSpec.getOutputFormat());
        CamcorderProfileProxy camcorderProfileProxy = this.mResolvedCamcorderProfile;
        if (camcorderProfileProxy != null) {
            String audioCodecMimeType = camcorderProfileProxy.getAudioCodecMimeType();
            int requiredAudioProfile = this.mResolvedCamcorderProfile.getRequiredAudioProfile();
            if (audioCodecMimeType == null) {
                Logger.d(TAG, "CamcorderProfile contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + outputFormatToAudioMime + "(profile: " + outputFormatToAudioProfile + ")]");
            } else {
                z = true;
                if (mediaSpec.getOutputFormat() == -1) {
                    Logger.d(TAG, "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive AUDIO settings [mime type: " + audioCodecMimeType + "(profile: " + requiredAudioProfile + ")]");
                } else if (Objects.equals(outputFormatToAudioMime, audioCodecMimeType) && outputFormatToAudioProfile == requiredAudioProfile) {
                    Logger.d(TAG, "MediaSpec audio mime/profile matches CamcorderProfile. Using CamcorderProfile to derive AUDIO settings [mime type: " + audioCodecMimeType + "(profile: " + requiredAudioProfile + ")]");
                } else {
                    Logger.d(TAG, "MediaSpec audio mime or profile does not match CamcorderProfile, so CamcorderProfile settings cannot be used. May rely on fallback defaults to derive AUDIO settings [CamcorderProfile mime type: " + audioCodecMimeType + "(profile: " + requiredAudioProfile + "), chosen mime type: " + outputFormatToAudioMime + "(profile: " + outputFormatToAudioProfile + ")]");
                }
                outputFormatToAudioMime = audioCodecMimeType;
                outputFormatToAudioProfile = requiredAudioProfile;
                MimeInfo.Builder profile = MimeInfo.builder(outputFormatToAudioMime).setProfile(outputFormatToAudioProfile);
                if (z) {
                    profile.setCompatibleCamcorderProfile(this.mResolvedCamcorderProfile);
                }
                return profile.build();
            }
        }
        z = false;
        MimeInfo.Builder profile2 = MimeInfo.builder(outputFormatToAudioMime).setProfile(outputFormatToAudioProfile);
        if (z) {
        }
        return profile2.build();
    }

    private MimeInfo resolveVideoMimeInfo(MediaSpec mediaSpec) {
        String outputFormatToVideoMime = MediaSpec.outputFormatToVideoMime(mediaSpec.getOutputFormat());
        CamcorderProfileProxy camcorderProfileProxy = this.mResolvedCamcorderProfile;
        boolean z = false;
        if (camcorderProfileProxy != null) {
            String videoCodecMimeType = camcorderProfileProxy.getVideoCodecMimeType();
            if (videoCodecMimeType == null) {
                Logger.d(TAG, "CamcorderProfile contains undefined VIDEO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + outputFormatToVideoMime + "]");
            } else {
                if (mediaSpec.getOutputFormat() == -1) {
                    Logger.d(TAG, "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + videoCodecMimeType + "]");
                } else if (Objects.equals(outputFormatToVideoMime, videoCodecMimeType)) {
                    Logger.d(TAG, "MediaSpec video mime matches CamcorderProfile. Using CamcorderProfile to derive VIDEO settings [mime type: " + videoCodecMimeType + "]");
                } else {
                    Logger.d(TAG, "MediaSpec video mime does not match CamcorderProfile, so CamcorderProfile settings cannot be used. May rely on fallback defaults to derive VIDEO settings [CamcorderProfile mime type: " + videoCodecMimeType + ", chosen mime type: " + outputFormatToVideoMime + "]");
                }
                outputFormatToVideoMime = videoCodecMimeType;
                z = true;
            }
        } else {
            Logger.d(TAG, "No CamcorderProfile present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + outputFormatToVideoMime + "]");
        }
        MimeInfo.Builder builder = MimeInfo.builder(outputFormatToVideoMime);
        if (z) {
            builder.setCompatibleCamcorderProfile(this.mResolvedCamcorderProfile);
        }
        return builder.build();
    }

    private static AudioSource.Settings resolveAudioSourceSettings(MimeInfo mimeInfo, AudioSpec audioSpec) {
        Supplier audioSourceSettingsDefaultResolver;
        if (mimeInfo.getCompatibleCamcorderProfile() != null) {
            audioSourceSettingsDefaultResolver = new AudioSourceSettingsCamcorderProfileResolver(audioSpec, mimeInfo.getCompatibleCamcorderProfile());
        } else {
            audioSourceSettingsDefaultResolver = new AudioSourceSettingsDefaultResolver(audioSpec);
        }
        return (AudioSource.Settings) audioSourceSettingsDefaultResolver.get();
    }

    private static AudioEncoderConfig resolveAudioEncoderConfig(MimeInfo mimeInfo, AudioSource.Settings settings, AudioSpec audioSpec) {
        Supplier audioEncoderConfigDefaultResolver;
        if (mimeInfo.getCompatibleCamcorderProfile() != null) {
            audioEncoderConfigDefaultResolver = new AudioEncoderConfigCamcorderProfileResolver(mimeInfo.getMimeType(), mimeInfo.getProfile(), audioSpec, settings, mimeInfo.getCompatibleCamcorderProfile());
        } else {
            audioEncoderConfigDefaultResolver = new AudioEncoderConfigDefaultResolver(mimeInfo.getMimeType(), mimeInfo.getProfile(), audioSpec, settings);
        }
        return (AudioEncoderConfig) audioEncoderConfigDefaultResolver.get();
    }

    private static VideoEncoderConfig resolveVideoEncoderConfig(MimeInfo mimeInfo, VideoSpec videoSpec, Size size) {
        Supplier videoEncoderConfigDefaultResolver;
        if (mimeInfo.getCompatibleCamcorderProfile() != null) {
            videoEncoderConfigDefaultResolver = new VideoEncoderConfigCamcorderProfileResolver(mimeInfo.getMimeType(), videoSpec, size, mimeInfo.getCompatibleCamcorderProfile());
        } else {
            videoEncoderConfigDefaultResolver = new VideoEncoderConfigDefaultResolver(mimeInfo.getMimeType(), videoSpec, size);
        }
        return (VideoEncoderConfig) videoEncoderConfigDefaultResolver.get();
    }

    private void setupAudio(RecordingRecord recordingRecord) throws ResourceCreationException {
        MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
        MimeInfo resolveAudioMimeInfo = resolveAudioMimeInfo(mediaSpec);
        AudioSource.Settings resolveAudioSourceSettings = resolveAudioSourceSettings(resolveAudioMimeInfo, mediaSpec.getAudioSpec());
        try {
            this.mAudioSource = setupAudioSource(recordingRecord, resolveAudioSourceSettings);
            try {
                Encoder createEncoder = this.mAudioEncoderFactory.createEncoder(this.mExecutor, resolveAudioEncoderConfig(resolveAudioMimeInfo, resolveAudioSourceSettings, mediaSpec.getAudioSpec()));
                this.mAudioEncoder = createEncoder;
                Encoder.EncoderInput input = createEncoder.getInput();
                if (!(input instanceof Encoder.ByteBufferInput)) {
                    throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
                }
                this.mAudioSource.setBufferProvider((Encoder.ByteBufferInput) input);
            } catch (InvalidConfigException e) {
                throw new ResourceCreationException(e);
            }
        } catch (AudioSourceAccessException e2) {
            throw new ResourceCreationException(e2);
        }
    }

    private AudioSource setupAudioSource(RecordingRecord recordingRecord, AudioSource.Settings settings) throws AudioSourceAccessException {
        AudioSource performOneTimeAudioSourceCreation = recordingRecord.performOneTimeAudioSourceCreation(settings, CameraXExecutors.ioExecutor());
        performOneTimeAudioSourceCreation.setAudioSourceCallback(this.mSequentialExecutor, new AudioSource.AudioSourceCallback() { // from class: androidx.camera.video.Recorder.1
            {
                Recorder.this = this;
            }

            @Override // androidx.camera.video.internal.AudioSource.AudioSourceCallback
            public void onSilenced(boolean z) {
                if (Recorder.this.mIsAudioSourceSilenced != z) {
                    Recorder.this.mIsAudioSourceSilenced = z;
                    Recorder.this.mAudioErrorCause = z ? new IllegalStateException("The audio source has been silenced.") : null;
                    Recorder.this.updateInProgressStatusEvent();
                    return;
                }
                Logger.w(Recorder.TAG, "Audio source silenced transitions to the same state " + z);
            }

            @Override // androidx.camera.video.internal.AudioSource.AudioSourceCallback
            public void onError(Throwable th) {
                if (th instanceof AudioSourceAccessException) {
                    Recorder.this.setAudioState(AudioState.DISABLED);
                    Recorder.this.updateInProgressStatusEvent();
                }
            }
        });
        return performOneTimeAudioSourceCreation;
    }

    private void setupVideo(final SurfaceRequest surfaceRequest) {
        MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
        try {
            Encoder createEncoder = this.mVideoEncoderFactory.createEncoder(this.mExecutor, resolveVideoEncoderConfig(resolveVideoMimeInfo(mediaSpec), mediaSpec.getVideoSpec(), surfaceRequest.getResolution()));
            this.mVideoEncoder = createEncoder;
            Encoder.EncoderInput input = createEncoder.getInput();
            if (!(input instanceof Encoder.SurfaceInput)) {
                throw new AssertionError("The EncoderInput of video isn't a SurfaceInput.");
            }
            ((Encoder.SurfaceInput) input).setOnSurfaceUpdateListener(this.mSequentialExecutor, new Encoder.SurfaceInput.OnSurfaceUpdateListener() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda5
                @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
                public final void onSurfaceUpdate(Surface surface) {
                    Recorder.this.m203lambda$setupVideo$9$androidxcameravideoRecorder(surfaceRequest, surface);
                }
            });
        } catch (InvalidConfigException e) {
            Logger.e(TAG, "Unable to initialize video encoder.", e);
            onEncoderSetupError(new ResourceCreationException(e));
        }
    }

    /* renamed from: lambda$setupVideo$9$androidx-camera-video-Recorder */
    public /* synthetic */ void m203lambda$setupVideo$9$androidxcameravideoRecorder(SurfaceRequest surfaceRequest, Surface surface) {
        synchronized (this.mLock) {
            Logger.d(TAG, "Encoder surface updated: " + surface.hashCode() + ", Current surface: " + this.mStreamId);
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                    onEncoderSurfaceUpdated(surface, surfaceRequest);
                    break;
                case 7:
                case 8:
                    throw new AssertionError("Unexpected state on update of encoder surface " + this.mState);
            }
        }
    }

    private void onEncoderSurfaceUpdated(Surface surface, SurfaceRequest surfaceRequest) {
        Surface surface2 = this.mLatestSurface;
        if (surface2 != surface) {
            setLatestSurface(surface);
            if (surface2 == null) {
                this.mActiveSurface = surface;
                surfaceRequest.provideSurface(surface, this.mSequentialExecutor, new Recorder$$ExternalSyntheticLambda10(this));
                onInitialized();
                return;
            }
            return;
        }
        Logger.d(TAG, "Video encoder provides the same surface.");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSurfaceRequestComplete(SurfaceRequest.Result result) {
        Encoder encoder;
        Logger.d(TAG, "Surface closed: " + result.getSurface().hashCode());
        Surface surface = result.getSurface();
        if (surface == this.mActiveSurface) {
            ScheduledFuture<?> scheduledFuture = this.mSourceNonStreamingTimeout;
            boolean z = false;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (encoder = this.mVideoEncoder) != null) {
                notifyEncoderSourceStopped(encoder);
            }
            if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                Logger.d(TAG, "Latest active surface no longer in use and source state is INACTIVE. Resetting recorder...");
            } else {
                if (this.mActiveSurface == this.mLatestSurface) {
                    Logger.w(TAG, "Source has stopped producing frames into active surface, yet source state is still active. Stopping any in-progress recordings and resetting encoders in case a new surface is required.");
                }
                this.mActiveSurface = null;
                if (z) {
                    return;
                }
                reset(4, null);
                setLatestSurface(null);
                return;
            }
            z = true;
            this.mActiveSurface = null;
            if (z) {
            }
        } else {
            surface.release();
        }
    }

    private void onEncoderSetupError(Throwable th) {
        RecordingRecord recordingRecord;
        synchronized (this.mLock) {
            recordingRecord = null;
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                case 2:
                case 6:
                case 7:
                case 8:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.mState + ": " + th);
                case 3:
                case 4:
                    RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                    this.mPendingRecordingRecord = null;
                    recordingRecord = recordingRecord2;
                case 5:
                    setStreamId(-1);
                    setState(State.ERROR);
                    break;
            }
        }
        if (recordingRecord != null) {
            finalizePendingRecording(recordingRecord, 7, th);
        }
    }

    void setupAndStartMediaMuxer(RecordingRecord recordingRecord) {
        int outputFormatToMuxerFormat;
        if (this.mMediaMuxer != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (isAudioEnabled() && this.mPendingFirstAudioData == null) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            EncodedData encodedData2 = this.mPendingFirstAudioData;
            this.mPendingFirstVideoData = null;
            this.mPendingFirstAudioData = null;
            long size = encodedData.size();
            if (encodedData2 != null) {
                size += encodedData2.size();
            }
            long j = this.mFileSizeLimitInBytes;
            if (j != 0 && size > j) {
                Logger.d(TAG, String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
                onInProgressRecordingInternalError(recordingRecord, 2, null);
                if (encodedData2 != null) {
                    encodedData2.close();
                }
                if (encodedData != null) {
                    encodedData.close();
                    return;
                }
                return;
            }
            try {
                MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
                if (mediaSpec.getOutputFormat() == -1) {
                    outputFormatToMuxerFormat = supportedMuxerFormatOrDefaultFrom(this.mResolvedCamcorderProfile, MediaSpec.outputFormatToMuxerFormat(MEDIA_SPEC_DEFAULT.getOutputFormat()));
                } else {
                    outputFormatToMuxerFormat = MediaSpec.outputFormatToMuxerFormat(mediaSpec.getOutputFormat());
                }
                MediaMuxer performOneTimeMediaMuxerCreation = recordingRecord.performOneTimeMediaMuxerCreation(outputFormatToMuxerFormat, new Consumer() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda8
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        Recorder.this.m202lambda$setupAndStartMediaMuxer$10$androidxcameravideoRecorder((Uri) obj);
                    }
                });
                this.mMediaMuxer = performOneTimeMediaMuxerCreation;
                SurfaceRequest.TransformationInfo transformationInfo = this.mSurfaceTransformationInfo;
                if (transformationInfo != null) {
                    performOneTimeMediaMuxerCreation.setOrientationHint(transformationInfo.getRotationDegrees());
                }
                this.mVideoTrackIndex = Integer.valueOf(this.mMediaMuxer.addTrack(this.mVideoOutputConfig.getMediaFormat()));
                if (isAudioEnabled()) {
                    this.mAudioTrackIndex = Integer.valueOf(this.mMediaMuxer.addTrack(this.mAudioOutputConfig.getMediaFormat()));
                }
                this.mMediaMuxer.start();
                writeVideoData(encodedData, recordingRecord);
                if (encodedData2 != null) {
                    writeAudioData(encodedData2, recordingRecord);
                }
                if (encodedData2 != null) {
                    encodedData2.close();
                }
                if (encodedData != null) {
                    encodedData.close();
                }
            } catch (IOException e) {
                onInProgressRecordingInternalError(recordingRecord, 5, e);
                if (encodedData2 != null) {
                    encodedData2.close();
                }
                if (encodedData != null) {
                    encodedData.close();
                }
            }
        } catch (Throwable th) {
            if (encodedData != null) {
                try {
                    encodedData.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: lambda$setupAndStartMediaMuxer$10$androidx-camera-video-Recorder */
    public /* synthetic */ void m202lambda$setupAndStartMediaMuxer$10$androidxcameravideoRecorder(Uri uri) {
        this.mOutputUri = uri;
    }

    private void startInternal(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        if (recordingRecord.getOutputOptions().getFileSizeLimit() > 0) {
            this.mFileSizeLimitInBytes = Math.round(recordingRecord.getOutputOptions().getFileSizeLimit() * 0.95d);
            Logger.d(TAG, "File size limit in bytes: " + this.mFileSizeLimitInBytes);
        } else {
            this.mFileSizeLimitInBytes = 0L;
        }
        this.mInProgressRecording = recordingRecord;
        int i = AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$AudioState[this.mAudioState.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.mAudioState);
        }
        if (i == 4) {
            setAudioState(recordingRecord.hasAudioEnabled() ? AudioState.ACTIVE : AudioState.DISABLED);
        } else if (i == 5 && recordingRecord.hasAudioEnabled()) {
            if (!isAudioSupported()) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                setupAudio(recordingRecord);
                setAudioState(AudioState.ACTIVE);
            } catch (ResourceCreationException e) {
                Logger.e(TAG, "Unable to create audio resource with error: ", e);
                setAudioState(AudioState.ERROR);
                this.mAudioErrorCause = e;
            }
        }
        initEncoderCallbacks(recordingRecord);
        if (isAudioEnabled()) {
            this.mAudioSource.start();
            this.mAudioEncoder.start();
        }
        this.mVideoEncoder.start();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.start(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    /* renamed from: androidx.camera.video.Recorder$5 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$Recorder$AudioState;
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$Recorder$State;

        static {
            int[] iArr = new int[AudioState.values().length];
            $SwitchMap$androidx$camera$video$Recorder$AudioState = iArr;
            try {
                iArr[AudioState.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$AudioState[AudioState.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$AudioState[AudioState.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$AudioState[AudioState.IDLING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$AudioState[AudioState.INITIALIZING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[State.values().length];
            $SwitchMap$androidx$camera$video$Recorder$State = iArr2;
            try {
                iArr2[State.STOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$State[State.RESETTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$State[State.PENDING_RECORDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$State[State.PENDING_PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$State[State.INITIALIZING.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$State[State.IDLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$State[State.RECORDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$State[State.PAUSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$androidx$camera$video$Recorder$State[State.ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private void initEncoderCallbacks(final RecordingRecord recordingRecord) {
        this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Recorder.this.m194lambda$initEncoderCallbacks$11$androidxcameravideoRecorder(recordingRecord, completer);
            }
        }));
        if (isAudioEnabled()) {
            this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda3
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Recorder.this.m195lambda$initEncoderCallbacks$12$androidxcameravideoRecorder(recordingRecord, completer);
                }
            }));
        }
        Futures.addCallback(Futures.allAsList(this.mEncodingFutures), new FutureCallback<List<Void>>() { // from class: androidx.camera.video.Recorder.4
            {
                Recorder.this = this;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(List<Void> list) {
                Logger.d(Recorder.TAG, "Encodings end successfully.");
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mRecordingStopError, Recorder.this.mRecordingStopErrorCause);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Logger.d(Recorder.TAG, "Encodings end with error: " + th);
                Recorder.this.finalizeInProgressRecording(6, th);
            }
        }, CameraXExecutors.directExecutor());
    }

    /* renamed from: lambda$initEncoderCallbacks$11$androidx-camera-video-Recorder */
    public /* synthetic */ Object m194lambda$initEncoderCallbacks$11$androidxcameravideoRecorder(final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mVideoEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.2
            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public /* synthetic */ void onEncodePaused() {
                EncoderCallback.CC.$default$onEncodePaused(this);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }

            {
                Recorder.this = this;
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(EncodeException encodeException) {
                completer.setException(encodeException);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(EncodedData encodedData) {
                boolean z;
                if (Recorder.this.mMediaMuxer == null) {
                    if (!Recorder.this.mInProgressRecordingStopping) {
                        if (Recorder.this.mPendingFirstVideoData != null) {
                            Recorder.this.mPendingFirstVideoData.close();
                            Recorder.this.mPendingFirstVideoData = null;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (encodedData.isKeyFrame()) {
                            Recorder.this.mPendingFirstVideoData = encodedData;
                            if (!Recorder.this.isAudioEnabled() || Recorder.this.mPendingFirstAudioData != null) {
                                Logger.d(Recorder.TAG, "Received video keyframe. Starting muxer...");
                                Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                                return;
                            } else if (z) {
                                Logger.d(Recorder.TAG, "Replaced cached video keyframe with newer keyframe.");
                                return;
                            } else {
                                Logger.d(Recorder.TAG, "Cached video keyframe while we wait for first audio sample before starting muxer.");
                                return;
                            }
                        }
                        if (z) {
                            Logger.d(Recorder.TAG, "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                        }
                        Logger.d(Recorder.TAG, "Dropped video data since muxer has not yet started and data is not a keyframe.");
                        Recorder.this.mVideoEncoder.requestKeyFrame();
                        encodedData.close();
                        return;
                    }
                    Logger.d(Recorder.TAG, "Drop video data since recording is stopping.");
                    encodedData.close();
                    return;
                }
                try {
                    Recorder.this.writeVideoData(encodedData, recordingRecord);
                    if (encodedData != null) {
                        encodedData.close();
                    }
                } catch (Throwable th) {
                    if (encodedData != null) {
                        try {
                            encodedData.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mVideoOutputConfig = outputConfig;
            }
        }, this.mSequentialExecutor);
        return "videoEncodingFuture";
    }

    /* renamed from: lambda$initEncoderCallbacks$12$androidx-camera-video-Recorder */
    public /* synthetic */ Object m195lambda$initEncoderCallbacks$12$androidxcameravideoRecorder(final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mAudioEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.3
            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public /* synthetic */ void onEncodePaused() {
                EncoderCallback.CC.$default$onEncodePaused(this);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }

            {
                Recorder.this = this;
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(EncodeException encodeException) {
                Recorder.this.setAudioState(AudioState.ERROR);
                Recorder.this.mAudioErrorCause = encodeException;
                Recorder.this.updateInProgressStatusEvent();
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(EncodedData encodedData) {
                boolean z;
                if (Recorder.this.mAudioState == AudioState.DISABLED) {
                    throw new AssertionError("Audio is not enabled but audio encoded data is produced.");
                }
                if (Recorder.this.mMediaMuxer == null) {
                    if (!Recorder.this.mInProgressRecordingStopping) {
                        if (Recorder.this.mPendingFirstAudioData != null) {
                            Recorder.this.mPendingFirstAudioData.close();
                            Recorder.this.mPendingFirstAudioData = null;
                            z = true;
                        } else {
                            z = false;
                        }
                        Recorder.this.mPendingFirstAudioData = encodedData;
                        if (Recorder.this.mPendingFirstVideoData != null) {
                            Logger.d(Recorder.TAG, "Received audio data. Starting muxer...");
                            Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                            return;
                        } else if (z) {
                            Logger.d(Recorder.TAG, "Replaced cached audio data with newer data.");
                            return;
                        } else {
                            Logger.d(Recorder.TAG, "Cached audio data while we wait for video keyframe before starting muxer.");
                            return;
                        }
                    }
                    Logger.d(Recorder.TAG, "Drop audio data since recording is stopping.");
                    encodedData.close();
                    return;
                }
                try {
                    Recorder.this.writeAudioData(encodedData, recordingRecord);
                    if (encodedData != null) {
                        encodedData.close();
                    }
                } catch (Throwable th) {
                    if (encodedData != null) {
                        try {
                            encodedData.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mAudioOutputConfig = outputConfig;
            }
        }, this.mSequentialExecutor);
        return "audioEncodingFuture";
    }

    void writeVideoData(EncodedData encodedData, RecordingRecord recordingRecord) {
        if (this.mVideoTrackIndex == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.mRecordingBytes + encodedData.size();
        long j = this.mFileSizeLimitInBytes;
        if (j != 0 && size > j) {
            Logger.d(TAG, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        this.mMediaMuxer.writeSampleData(this.mVideoTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
        this.mRecordingBytes = size;
        if (this.mFirstRecordingVideoDataTimeUs == 0) {
            this.mFirstRecordingVideoDataTimeUs = encodedData.getPresentationTimeUs();
        }
        this.mRecordingDurationNs = TimeUnit.MICROSECONDS.toNanos(encodedData.getPresentationTimeUs() - this.mFirstRecordingVideoDataTimeUs);
        updateInProgressStatusEvent();
    }

    void writeAudioData(EncodedData encodedData, RecordingRecord recordingRecord) {
        long size = this.mRecordingBytes + encodedData.size();
        long j = this.mFileSizeLimitInBytes;
        if (j != 0 && size > j) {
            Logger.d(TAG, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        this.mMediaMuxer.writeSampleData(this.mAudioTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
        this.mRecordingBytes = size;
    }

    /* renamed from: pauseInternal */
    public void m200lambda$pause$4$androidxcameravideoRecorder(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        if (isAudioEnabled()) {
            this.mAudioEncoder.pause();
        }
        this.mVideoEncoder.pause();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.pause(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    /* renamed from: resumeInternal */
    public void m201lambda$resume$5$androidxcameravideoRecorder(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        if (isAudioEnabled()) {
            this.mAudioEncoder.start();
        }
        this.mVideoEncoder.start();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.resume(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    void stopInternal(RecordingRecord recordingRecord, Long l, int i, Throwable th) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        this.mShouldWaitForNewSurface = DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.mInProgressRecordingStopping = true;
        this.mRecordingStopError = i;
        this.mRecordingStopErrorCause = th;
        if (isAudioEnabled()) {
            EncodedData encodedData = this.mPendingFirstAudioData;
            if (encodedData != null) {
                encodedData.close();
                this.mPendingFirstAudioData = null;
            }
            if (l == null) {
                this.mAudioEncoder.stop();
            } else {
                this.mAudioEncoder.stop(l.longValue());
            }
        }
        EncodedData encodedData2 = this.mPendingFirstVideoData;
        if (encodedData2 != null) {
            encodedData2.close();
            this.mPendingFirstVideoData = null;
        }
        if (this.mSourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING) {
            final Encoder encoder = this.mVideoEncoder;
            this.mSourceNonStreamingTimeout = CameraXExecutors.mainThreadExecutor().schedule(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    Recorder.this.m206lambda$stopInternal$14$androidxcameravideoRecorder(encoder);
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        } else {
            notifyEncoderSourceStopped(this.mVideoEncoder);
        }
        if (l == null) {
            this.mVideoEncoder.stop();
        } else {
            this.mVideoEncoder.stop(l.longValue());
        }
    }

    /* renamed from: lambda$stopInternal$14$androidx-camera-video-Recorder */
    public /* synthetic */ void m206lambda$stopInternal$14$androidxcameravideoRecorder(final Encoder encoder) {
        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Recorder.lambda$stopInternal$13(Encoder.this);
            }
        });
    }

    public static /* synthetic */ void lambda$stopInternal$13(Encoder encoder) {
        Logger.d(TAG, "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            notifyEncoderSourceStopped(encoder);
        }
    }

    private static void notifyEncoderSourceStopped(Encoder encoder) {
        if (encoder instanceof EncoderImpl) {
            ((EncoderImpl) encoder).signalSourceStopped();
        }
    }

    private void resetInternal() {
        if (this.mAudioEncoder != null) {
            Logger.d(TAG, "Releasing audio encoder.");
            this.mAudioEncoder.release();
            this.mAudioEncoder = null;
            this.mAudioOutputConfig = null;
        }
        if (this.mVideoEncoder != null) {
            Logger.d(TAG, "Releasing video encoder.");
            this.mVideoEncoder.release();
            this.mVideoEncoder = null;
            this.mVideoOutputConfig = null;
        }
        if (this.mAudioSource != null) {
            Logger.d(TAG, "Releasing audio source.");
            this.mAudioSource.release();
            this.mAudioSource = null;
        }
        setAudioState(AudioState.INITIALIZING);
    }

    private int internalAudioStateToAudioStatsState(AudioState audioState) {
        int i = AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$AudioState[audioState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.mIsAudioSourceSilenced ? 2 : 0;
            } else if (i == 3 || i == 5) {
                return 1;
            } else {
                throw new AssertionError("Invalid internal audio state: " + audioState);
            }
        }
        return 3;
    }

    private StreamInfo.StreamState internalStateToStreamState(State state) {
        return (state == State.RECORDING || (state == State.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? StreamInfo.StreamState.ACTIVE : StreamInfo.StreamState.INACTIVE;
    }

    boolean isAudioEnabled() {
        return this.mAudioState == AudioState.ACTIVE;
    }

    void finalizeInProgressRecording(int i, Throwable th) {
        VideoRecordEvent.Finalize finalizeWithError;
        if (this.mInProgressRecording == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.mMediaMuxer.release();
            } catch (IllegalStateException e) {
                Logger.e(TAG, "MediaMuxer failed to stop or release with error: " + e.getMessage());
                if (i == 0) {
                    i = 1;
                }
            }
            this.mMediaMuxer = null;
        } else if (i == 0) {
            i = 8;
        }
        this.mInProgressRecording.finalizeRecording(this.mOutputUri);
        OutputOptions outputOptions = this.mInProgressRecording.getOutputOptions();
        RecordingStats inProgressRecordingStats = getInProgressRecordingStats();
        OutputResults of = OutputResults.of(this.mOutputUri);
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (i == 0) {
            finalizeWithError = VideoRecordEvent.finalize(outputOptions, inProgressRecordingStats, of);
        } else {
            finalizeWithError = VideoRecordEvent.finalizeWithError(outputOptions, inProgressRecordingStats, of, i, th);
        }
        recordingRecord.updateVideoRecordEvent(finalizeWithError);
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        this.mInProgressRecording = null;
        this.mInProgressRecordingStopping = false;
        this.mAudioTrackIndex = null;
        this.mVideoTrackIndex = null;
        this.mEncodingFutures.clear();
        this.mOutputUri = Uri.EMPTY;
        this.mRecordingBytes = 0L;
        this.mRecordingDurationNs = 0L;
        this.mFirstRecordingVideoDataTimeUs = 0L;
        this.mRecordingStopError = 1;
        this.mRecordingStopErrorCause = null;
        this.mAudioErrorCause = null;
        int i2 = AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$AudioState[this.mAudioState.ordinal()];
        if (i2 == 1) {
            setAudioState(AudioState.INITIALIZING);
        } else if (i2 == 2 || i2 == 3) {
            setAudioState(AudioState.IDLING);
        } else if (i2 == 4) {
            throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
        }
        onRecordingFinalized(recordingRecord2);
    }

    private void onRecordingFinalized(RecordingRecord recordingRecord) {
        RecordingRecord recordingRecord2;
        boolean z;
        int i;
        RecordingRecord recordingRecord3;
        Exception exc;
        boolean z2;
        synchronized (this.mLock) {
            if (this.mActiveRecordingRecord != recordingRecord) {
                throw new AssertionError("Active recording did not match finalized recording on finalize.");
            }
            recordingRecord2 = null;
            this.mActiveRecordingRecord = null;
            z = true;
            i = 0;
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                case 7:
                case 8:
                    if (this.mShouldWaitForNewSurface) {
                        setState(State.INITIALIZING);
                    } else {
                        setState(State.IDLING);
                    }
                    recordingRecord3 = null;
                    exc = null;
                    z = false;
                    z2 = false;
                    break;
                case 2:
                    setState(State.INITIALIZING);
                    recordingRecord3 = null;
                    exc = null;
                    z2 = false;
                    break;
                case 3:
                    z = false;
                case 4:
                    if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                        recordingRecord3 = this.mPendingRecordingRecord;
                        this.mPendingRecordingRecord = null;
                        setState(State.INITIALIZING);
                        exc = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                        z2 = z;
                        z = false;
                        i = 4;
                        break;
                    } else if (this.mShouldWaitForNewSurface) {
                        updateNonPendingState(State.INITIALIZING);
                        recordingRecord3 = null;
                        exc = null;
                        z2 = z;
                        z = false;
                        break;
                    } else {
                        exc = null;
                        z2 = z;
                        z = false;
                        recordingRecord2 = makePendingRecordingActiveLocked(this.mState);
                        recordingRecord3 = null;
                        break;
                    }
                case 5:
                case 6:
                    throw new AssertionError("Unexpected state on finalize of recording: " + this.mState);
                default:
                    recordingRecord3 = null;
                    exc = null;
                    z = false;
                    z2 = false;
                    break;
            }
        }
        if (z) {
            resetInternal();
        } else if (recordingRecord2 != null) {
            if (this.mShouldWaitForNewSurface) {
                throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
            }
            startRecording(recordingRecord2, z2);
        } else if (recordingRecord3 != null) {
            finalizePendingRecording(recordingRecord3, i, exc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0039 A[Catch: all -> 0x0049, TryCatch #0 {, blocks: (B:34:0x0009, B:35:0x0014, B:45:0x0041, B:37:0x0018, B:38:0x0020, B:39:0x0033, B:40:0x0034, B:43:0x0039, B:44:0x0040), top: B:54:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onInProgressRecordingInternalError(RecordingRecord recordingRecord, int i, Throwable th) {
        boolean z;
        if (recordingRecord != this.mInProgressRecording) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.mLock) {
            z = false;
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    if (recordingRecord == this.mActiveRecordingRecord) {
                        throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                    }
                    break;
                case 5:
                case 6:
                case 9:
                    throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.mState);
                case 7:
                case 8:
                    setState(State.STOPPING);
                    z = true;
                    if (recordingRecord == this.mActiveRecordingRecord) {
                    }
                    break;
            }
        }
        if (z) {
            stopInternal(recordingRecord, null, i, th);
        }
    }

    public void tryServicePendingRecording() {
        int i;
        boolean z;
        RecordingRecord recordingRecord;
        boolean z2;
        Exception exc;
        RecordingRecord recordingRecord2;
        synchronized (this.mLock) {
            int i2 = AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()];
            i = 4;
            z = false;
            recordingRecord = null;
            if (i2 == 3) {
                z2 = false;
            } else if (i2 != 4) {
                i = 0;
                exc = null;
                recordingRecord2 = exc;
            } else {
                z2 = true;
            }
            if (this.mActiveRecordingRecord != null) {
                i = 0;
                recordingRecord2 = null;
                z = z2;
                exc = null;
            } else if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                recordingRecord2 = this.mPendingRecordingRecord;
                this.mPendingRecordingRecord = null;
                restoreNonPendingState();
                z = z2;
                exc = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
            } else {
                i = 0;
                z = z2;
                exc = null;
                recordingRecord = makePendingRecordingActiveLocked(this.mState);
                recordingRecord2 = exc;
            }
        }
        if (recordingRecord != null) {
            startRecording(recordingRecord, z);
        } else if (recordingRecord2 != null) {
            finalizePendingRecording(recordingRecord2, i, exc);
        }
    }

    private RecordingRecord makePendingRecordingActiveLocked(State state) {
        boolean z;
        if (state == State.PENDING_PAUSED) {
            z = true;
        } else if (state != State.PENDING_RECORDING) {
            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
        } else {
            z = false;
        }
        if (this.mActiveRecordingRecord != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        RecordingRecord recordingRecord = this.mPendingRecordingRecord;
        if (recordingRecord == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.mActiveRecordingRecord = recordingRecord;
        this.mPendingRecordingRecord = null;
        if (z) {
            setState(State.PAUSED);
        } else {
            setState(State.RECORDING);
        }
        return recordingRecord;
    }

    private void startRecording(RecordingRecord recordingRecord, boolean z) {
        startInternal(recordingRecord);
        if (z) {
            m200lambda$pause$4$androidxcameravideoRecorder(recordingRecord);
        }
    }

    void updateInProgressStatusEvent() {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord != null) {
            recordingRecord.updateVideoRecordEvent(VideoRecordEvent.status(recordingRecord.getOutputOptions(), getInProgressRecordingStats()));
        }
    }

    RecordingStats getInProgressRecordingStats() {
        return RecordingStats.of(this.mRecordingDurationNs, this.mRecordingBytes, AudioStats.of(internalAudioStateToAudioStatsState(this.mAudioState), this.mAudioErrorCause));
    }

    <T> T getObservableData(StateObservable<T> stateObservable) {
        try {
            return stateObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public boolean isAudioSupported() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getChannelCount() != 0;
    }

    void setState(State state) {
        if (this.mState == state) {
            throw new AssertionError("Attempted to transition to state " + state + ", but Recorder is already in state " + state);
        }
        Logger.d(TAG, "Transitioning Recorder internal state: " + this.mState + " --> " + state);
        Set<State> set = PENDING_STATES;
        StreamInfo.StreamState streamState = null;
        if (set.contains(state)) {
            if (!set.contains(this.mState)) {
                if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(this.mState)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.mState);
                }
                State state2 = this.mState;
                this.mNonPendingState = state2;
                streamState = internalStateToStreamState(state2);
            }
        } else if (this.mNonPendingState != null) {
            this.mNonPendingState = null;
        }
        this.mState = state;
        if (streamState == null) {
            streamState = internalStateToStreamState(state);
        }
        this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, streamState));
    }

    private void setLatestSurface(Surface surface) {
        int hashCode;
        if (this.mLatestSurface == surface) {
            return;
        }
        this.mLatestSurface = surface;
        synchronized (this.mLock) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                hashCode = 0;
            }
            setStreamId(hashCode);
        }
    }

    private void setStreamId(int i) {
        if (this.mStreamId == i) {
            return;
        }
        Logger.d(TAG, "Transitioning streamId: " + this.mStreamId + " --> " + i);
        this.mStreamId = i;
        this.mStreamInfo.setState(StreamInfo.of(i, internalStateToStreamState(this.mState)));
    }

    private void updateNonPendingState(State state) {
        if (!PENDING_STATES.contains(this.mState)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.mState);
        } else if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(state)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + state);
        } else if (this.mNonPendingState != state) {
            this.mNonPendingState = state;
            this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, internalStateToStreamState(state)));
        }
    }

    private void restoreNonPendingState() {
        if (!PENDING_STATES.contains(this.mState)) {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.mState);
        }
        setState(this.mNonPendingState);
    }

    void setAudioState(AudioState audioState) {
        Logger.d(TAG, "Transitioning audio state: " + this.mAudioState + " --> " + audioState);
        this.mAudioState = audioState;
    }

    private static int supportedMuxerFormatOrDefaultFrom(CamcorderProfileProxy camcorderProfileProxy, int i) {
        if (camcorderProfileProxy != null) {
            int fileFormat = camcorderProfileProxy.getFileFormat();
            if (fileFormat == 1) {
                return Build.VERSION.SDK_INT < 26 ? 0 : 2;
            } else if (fileFormat == 2) {
                return 0;
            } else {
                if (fileFormat == 9) {
                    return 1;
                }
            }
        }
        return i;
    }

    /* loaded from: classes.dex */
    public static abstract class RecordingRecord implements AutoCloseable {
        private final CloseGuardHelper mCloseGuard = CloseGuardHelper.create();
        private final AtomicBoolean mInitialized = new AtomicBoolean(false);
        private final AtomicReference<MediaMuxerSupplier> mMediaMuxerSupplier = new AtomicReference<>(null);
        private final AtomicReference<AudioSourceSupplier> mAudioSourceSupplier = new AtomicReference<>(null);
        private final AtomicReference<Consumer<Uri>> mRecordingFinalizer = new AtomicReference<>(new Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda6
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                Recorder.RecordingRecord.lambda$new$0((Uri) obj);
            }
        });

        /* loaded from: classes.dex */
        public interface AudioSourceSupplier {
            AudioSource get(AudioSource.Settings settings, Executor executor) throws AudioSourceAccessException;
        }

        /* loaded from: classes.dex */
        public interface MediaMuxerSupplier {
            MediaMuxer get(int i, Consumer<Uri> consumer) throws IOException;
        }

        public static /* synthetic */ void lambda$new$0(Uri uri) {
        }

        public abstract Executor getCallbackExecutor();

        public abstract Consumer<VideoRecordEvent> getEventListener();

        public abstract OutputOptions getOutputOptions();

        public abstract long getRecordingId();

        public abstract boolean hasAudioEnabled();

        static RecordingRecord from(PendingRecording pendingRecording, long j) {
            return new AutoValue_Recorder_RecordingRecord(pendingRecording.getOutputOptions(), pendingRecording.getListenerExecutor(), pendingRecording.getEventListener(), pendingRecording.isAudioEnabled(), j);
        }

        void initializeRecording(final Context context) throws IOException {
            if (this.mInitialized.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final OutputOptions outputOptions = getOutputOptions();
            boolean z = outputOptions instanceof FileDescriptorOutputOptions;
            Consumer<Uri> consumer = null;
            final ParcelFileDescriptor dup = z ? ((FileDescriptorOutputOptions) outputOptions).getParcelFileDescriptor().dup() : null;
            this.mCloseGuard.open("finalizeRecording");
            this.mMediaMuxerSupplier.set(new MediaMuxerSupplier() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda0
                @Override // androidx.camera.video.Recorder.RecordingRecord.MediaMuxerSupplier
                public final MediaMuxer get(int i, Consumer consumer2) {
                    return Recorder.RecordingRecord.lambda$initializeRecording$1(OutputOptions.this, dup, i, consumer2);
                }
            });
            if (hasAudioEnabled()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.mAudioSourceSupplier.set(new AudioSourceSupplier() { // from class: androidx.camera.video.Recorder.RecordingRecord.1
                        {
                            RecordingRecord.this = this;
                        }

                        @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
                        public AudioSource get(AudioSource.Settings settings, Executor executor) throws AudioSourceAccessException {
                            return new AudioSource(settings, executor, context);
                        }
                    });
                } else {
                    this.mAudioSourceSupplier.set(new AudioSourceSupplier() { // from class: androidx.camera.video.Recorder.RecordingRecord.2
                        {
                            RecordingRecord.this = this;
                        }

                        @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
                        public AudioSource get(AudioSource.Settings settings, Executor executor) throws AudioSourceAccessException {
                            return new AudioSource(settings, executor, null);
                        }
                    });
                }
            }
            if (outputOptions instanceof MediaStoreOutputOptions) {
                final MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                if (Build.VERSION.SDK_INT >= 29) {
                    consumer = new Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda1
                        @Override // androidx.core.util.Consumer
                        public final void accept(Object obj) {
                            Recorder.RecordingRecord.lambda$initializeRecording$2(MediaStoreOutputOptions.this, (Uri) obj);
                        }
                    };
                } else {
                    consumer = new Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda2
                        @Override // androidx.core.util.Consumer
                        public final void accept(Object obj) {
                            Recorder.RecordingRecord.lambda$initializeRecording$4(MediaStoreOutputOptions.this, context, (Uri) obj);
                        }
                    };
                }
            } else if (z) {
                consumer = new Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda3
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        Recorder.RecordingRecord.lambda$initializeRecording$5(dup, (Uri) obj);
                    }
                };
            }
            if (consumer != null) {
                this.mRecordingFinalizer.set(consumer);
            }
        }

        public static /* synthetic */ MediaMuxer lambda$initializeRecording$1(OutputOptions outputOptions, ParcelFileDescriptor parcelFileDescriptor, int i, Consumer consumer) throws IOException {
            MediaMuxer createMediaMuxer;
            Uri uri = Uri.EMPTY;
            if (outputOptions instanceof FileOutputOptions) {
                File file = ((FileOutputOptions) outputOptions).getFile();
                if (!OutputUtil.createParentFolder(file)) {
                    Logger.w(Recorder.TAG, "Failed to create folder for " + file.getAbsolutePath());
                }
                createMediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
                uri = Uri.fromFile(file);
            } else if (outputOptions instanceof FileDescriptorOutputOptions) {
                if (Build.VERSION.SDK_INT >= 26) {
                    createMediaMuxer = Api26Impl.createMediaMuxer(parcelFileDescriptor.getFileDescriptor(), i);
                } else {
                    throw new IOException("MediaMuxer doesn't accept FileDescriptor as output destination.");
                }
            } else if (outputOptions instanceof MediaStoreOutputOptions) {
                MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                ContentValues contentValues = new ContentValues(mediaStoreOutputOptions.getContentValues());
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                uri = mediaStoreOutputOptions.getContentResolver().insert(mediaStoreOutputOptions.getCollectionUri(), contentValues);
                if (uri == null) {
                    throw new IOException("Unable to create MediaStore entry.");
                }
                if (Build.VERSION.SDK_INT < 26) {
                    String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), uri, Recorder.MEDIA_COLUMN);
                    if (absolutePathFromUri == null) {
                        throw new IOException("Unable to get path from uri " + uri);
                    }
                    if (!OutputUtil.createParentFolder(new File(absolutePathFromUri))) {
                        Logger.w(Recorder.TAG, "Failed to create folder for " + absolutePathFromUri);
                    }
                    createMediaMuxer = new MediaMuxer(absolutePathFromUri, i);
                } else {
                    ParcelFileDescriptor openFileDescriptor = mediaStoreOutputOptions.getContentResolver().openFileDescriptor(uri, "rw");
                    createMediaMuxer = Api26Impl.createMediaMuxer(openFileDescriptor.getFileDescriptor(), i);
                    openFileDescriptor.close();
                }
            } else {
                throw new AssertionError("Invalid output options type: " + outputOptions.getClass().getSimpleName());
            }
            consumer.accept(uri);
            return createMediaMuxer;
        }

        public static /* synthetic */ void lambda$initializeRecording$2(MediaStoreOutputOptions mediaStoreOutputOptions, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_pending", (Integer) 0);
            mediaStoreOutputOptions.getContentResolver().update(uri, contentValues, null, null);
        }

        public static /* synthetic */ void lambda$initializeRecording$4(MediaStoreOutputOptions mediaStoreOutputOptions, Context context, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), uri, Recorder.MEDIA_COLUMN);
            if (absolutePathFromUri != null) {
                MediaScannerConnection.scanFile(context, new String[]{absolutePathFromUri}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda4
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri2) {
                        Recorder.RecordingRecord.lambda$initializeRecording$3(str, uri2);
                    }
                });
                return;
            }
            Logger.d(Recorder.TAG, "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
        }

        public static /* synthetic */ void lambda$initializeRecording$3(String str, Uri uri) {
            if (uri == null) {
                Logger.e(Recorder.TAG, String.format("File scanning operation failed [path: %s]", str));
            } else {
                Logger.d(Recorder.TAG, String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        public static /* synthetic */ void lambda$initializeRecording$5(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
                Logger.e(Recorder.TAG, "Failed to close dup'd ParcelFileDescriptor", e);
            }
        }

        void updateVideoRecordEvent(final VideoRecordEvent videoRecordEvent) {
            VideoRecordEvent.Finalize finalize;
            if (!Objects.equals(videoRecordEvent.getOutputOptions(), getOutputOptions())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + videoRecordEvent.getOutputOptions() + ", Expected: " + getOutputOptions() + "]");
            }
            String str = "Sending VideoRecordEvent " + videoRecordEvent.getClass().getSimpleName();
            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                if (((VideoRecordEvent.Finalize) videoRecordEvent).hasError()) {
                    str = str + String.format(" [error: %s]", VideoRecordEvent.Finalize.errorToString(finalize.getError()));
                }
            }
            Logger.d(Recorder.TAG, str);
            if (getCallbackExecutor() == null || getEventListener() == null) {
                return;
            }
            try {
                getCallbackExecutor().execute(new Runnable() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        Recorder.RecordingRecord.this.m207x1386b2b0(videoRecordEvent);
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.e(Recorder.TAG, "The callback executor is invalid.", e);
            }
        }

        /* renamed from: lambda$updateVideoRecordEvent$6$androidx-camera-video-Recorder$RecordingRecord */
        public /* synthetic */ void m207x1386b2b0(VideoRecordEvent videoRecordEvent) {
            getEventListener().accept(videoRecordEvent);
        }

        AudioSource performOneTimeAudioSourceCreation(AudioSource.Settings settings, Executor executor) throws AudioSourceAccessException {
            if (!hasAudioEnabled()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            AudioSourceSupplier andSet = this.mAudioSourceSupplier.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
            }
            return andSet.get(settings, executor);
        }

        MediaMuxer performOneTimeMediaMuxerCreation(int i, Consumer<Uri> consumer) throws IOException {
            if (!this.mInitialized.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            MediaMuxerSupplier andSet = this.mMediaMuxerSupplier.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            return andSet.get(i, consumer);
        }

        void finalizeRecording(Uri uri) {
            if (this.mInitialized.get()) {
                finalizeRecordingInternal(this.mRecordingFinalizer.getAndSet(null), uri);
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            finalizeRecording(Uri.EMPTY);
        }

        protected void finalize() throws Throwable {
            try {
                this.mCloseGuard.warnIfOpen();
                Consumer<Uri> andSet = this.mRecordingFinalizer.getAndSet(null);
                if (andSet != null) {
                    finalizeRecordingInternal(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        private void finalizeRecordingInternal(Consumer<Uri> consumer, Uri uri) {
            if (consumer == null) {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
            this.mCloseGuard.close();
            consumer.accept(uri);
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private Executor mExecutor = null;
        private EncoderFactory mVideoEncoderFactory = Recorder.DEFAULT_ENCODER_FACTORY;
        private EncoderFactory mAudioEncoderFactory = Recorder.DEFAULT_ENCODER_FACTORY;
        private final MediaSpec.Builder mMediaSpecBuilder = MediaSpec.builder();

        public Builder setExecutor(Executor executor) {
            Preconditions.checkNotNull(executor, "The specified executor can't be null.");
            this.mExecutor = executor;
            return this;
        }

        public Builder setQualitySelector(final QualitySelector qualitySelector) {
            Preconditions.checkNotNull(qualitySelector, "The specified quality selector can't be null.");
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setQualitySelector(QualitySelector.this);
                }
            });
            return this;
        }

        Builder setAspectRatio(final int i) {
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda2
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setAspectRatio(i);
                }
            });
            return this;
        }

        Builder setAudioSource(final int i) {
            this.mMediaSpecBuilder.configureAudio(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((AudioSpec.Builder) obj).setSource(i);
                }
            });
            return this;
        }

        Builder setVideoEncoderFactory(EncoderFactory encoderFactory) {
            this.mVideoEncoderFactory = encoderFactory;
            return this;
        }

        Builder setAudioEncoderFactory(EncoderFactory encoderFactory) {
            this.mAudioEncoderFactory = encoderFactory;
            return this;
        }

        public Recorder build() {
            return new Recorder(this.mExecutor, this.mMediaSpecBuilder.build(), this.mVideoEncoderFactory, this.mAudioEncoderFactory);
        }
    }
}
