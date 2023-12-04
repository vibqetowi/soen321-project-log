package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.VideoCapture$$ExternalSyntheticLambda8;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.UseCaseEventConfig;
import androidx.camera.core.internal.utils.VideoUtil;
import androidx.camera.video.VideoCaptureLegacy;
import androidx.camera.video.impl.VideoCaptureLegacyConfig;
import androidx.camera.video.internal.compat.Api26Impl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import com.ifriend.internal_notifications.notification.HandlingStrategy;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class VideoCaptureLegacy extends UseCase {
    private static final String AUDIO_MIME_TYPE = "audio/mp4a-latm";
    private static final int DEQUE_TIMEOUT_USEC = 10000;
    public static final int ERROR_ENCODER = 1;
    public static final int ERROR_FILE_IO = 4;
    public static final int ERROR_INVALID_CAMERA = 5;
    public static final int ERROR_MUXER = 2;
    public static final int ERROR_RECORDING_IN_PROGRESS = 3;
    public static final int ERROR_UNKNOWN = 0;
    private static final String TAG = "VideoCaptureLegacy";
    private static final String VIDEO_MIME_TYPE = "video/avc";
    private int mAudioBitRate;
    private final MediaCodec.BufferInfo mAudioBufferInfo;
    private int mAudioBufferSize;
    private int mAudioChannelCount;
    private MediaCodec mAudioEncoder;
    private Handler mAudioHandler;
    private HandlerThread mAudioHandlerThread;
    private AudioRecord mAudioRecorder;
    private int mAudioSampleRate;
    private int mAudioTrackIndex;
    Surface mCameraSurface;
    private DeferrableSurface mDeferrableSurface;
    private final AtomicBoolean mEndOfAudioStreamSignal;
    private final AtomicBoolean mEndOfAudioVideoSignal;
    private final AtomicBoolean mEndOfVideoStreamSignal;
    private final AtomicBoolean mIsFirstAudioSampleWrite;
    private final AtomicBoolean mIsFirstVideoSampleWrite;
    private boolean mIsRecording;
    private MediaMuxer mMuxer;
    private final Object mMuxerLock;
    private boolean mMuxerStarted;
    private ParcelFileDescriptor mParcelFileDescriptor;
    private ListenableFuture<Void> mRecordingFuture;
    Uri mSavedVideoUri;
    private final MediaCodec.BufferInfo mVideoBufferInfo;
    MediaCodec mVideoEncoder;
    private Handler mVideoHandler;
    private HandlerThread mVideoHandlerThread;
    private int mVideoTrackIndex;
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final int[] CamcorderQuality = {8, 6, 5, 4};
    private static final short[] sAudioEncoding = {2, 3, 4};

    /* loaded from: classes.dex */
    public static final class Metadata {
        public Location location;
    }

    /* loaded from: classes.dex */
    public interface OnVideoSavedCallback {
        void onError(int i, String str, Throwable th);

        void onVideoSaved(OutputFileResults outputFileResults);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface VideoCaptureError {
    }

    VideoCaptureLegacy(VideoCaptureLegacyConfig videoCaptureLegacyConfig) {
        super(videoCaptureLegacyConfig);
        this.mVideoBufferInfo = new MediaCodec.BufferInfo();
        this.mMuxerLock = new Object();
        this.mEndOfVideoStreamSignal = new AtomicBoolean(true);
        this.mEndOfAudioStreamSignal = new AtomicBoolean(true);
        this.mEndOfAudioVideoSignal = new AtomicBoolean(true);
        this.mAudioBufferInfo = new MediaCodec.BufferInfo();
        this.mIsFirstVideoSampleWrite = new AtomicBoolean(false);
        this.mIsFirstAudioSampleWrite = new AtomicBoolean(false);
        this.mRecordingFuture = null;
        this.mMuxerStarted = false;
        this.mIsRecording = false;
    }

    private static MediaFormat createMediaFormat(VideoCaptureLegacyConfig videoCaptureLegacyConfig, Size size) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", videoCaptureLegacyConfig.getBitRate());
        createVideoFormat.setInteger("frame-rate", videoCaptureLegacyConfig.getVideoFrameRate());
        createVideoFormat.setInteger("i-frame-interval", videoCaptureLegacyConfig.getIFrameInterval());
        return createVideoFormat;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE, 1);
        if (z) {
            config = Config.CC.mergeConfigs(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public void onAttached() {
        this.mVideoHandlerThread = new HandlerThread("CameraX-video encoding thread");
        this.mAudioHandlerThread = new HandlerThread("CameraX-audio encoding thread");
        this.mVideoHandlerThread.start();
        this.mVideoHandler = new Handler(this.mVideoHandlerThread.getLooper());
        this.mAudioHandlerThread.start();
        this.mAudioHandler = new Handler(this.mAudioHandlerThread.getLooper());
    }

    @Override // androidx.camera.core.UseCase
    protected Size onSuggestedResolutionUpdated(Size size) {
        if (this.mCameraSurface != null) {
            this.mVideoEncoder.stop();
            this.mVideoEncoder.release();
            this.mAudioEncoder.stop();
            this.mAudioEncoder.release();
            releaseCameraSurface(false);
        }
        try {
            this.mVideoEncoder = MediaCodec.createEncoderByType("video/avc");
            this.mAudioEncoder = MediaCodec.createEncoderByType("audio/mp4a-latm");
            setupEncoder(getCameraId(), size);
            return size;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to create MediaCodec due to: " + e.getCause());
        }
    }

    /* renamed from: startRecording */
    public void m212lambda$startRecording$0$androidxcameravideoVideoCaptureLegacy(final OutputFileOptions outputFileOptions, final Executor executor, final OnVideoSavedCallback onVideoSavedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.video.VideoCaptureLegacy$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCaptureLegacy.this.m212lambda$startRecording$0$androidxcameravideoVideoCaptureLegacy(outputFileOptions, executor, onVideoSavedCallback);
                }
            });
            return;
        }
        Logger.i(TAG, "startRecording");
        this.mIsFirstVideoSampleWrite.set(false);
        this.mIsFirstAudioSampleWrite.set(false);
        final VideoSavedListenerWrapper videoSavedListenerWrapper = new VideoSavedListenerWrapper(executor, onVideoSavedCallback);
        CameraInternal camera = getCamera();
        if (camera == null) {
            videoSavedListenerWrapper.onError(5, "Not bound to a Camera [" + this + "]", null);
        } else if (!this.mEndOfAudioVideoSignal.get()) {
            videoSavedListenerWrapper.onError(3, "It is still in video recording!", null);
        } else {
            try {
                this.mAudioRecorder.startRecording();
                final AtomicReference atomicReference = new AtomicReference();
                this.mRecordingFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.VideoCaptureLegacy$$ExternalSyntheticLambda2
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return atomicReference.set(completer);
                    }
                });
                final CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
                this.mRecordingFuture.addListener(new Runnable() { // from class: androidx.camera.video.VideoCaptureLegacy$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoCaptureLegacy.this.m213lambda$startRecording$2$androidxcameravideoVideoCaptureLegacy();
                    }
                }, CameraXExecutors.mainThreadExecutor());
                try {
                    Logger.i(TAG, "videoEncoder start");
                    this.mVideoEncoder.start();
                    Logger.i(TAG, "audioEncoder start");
                    this.mAudioEncoder.start();
                    try {
                        synchronized (this.mMuxerLock) {
                            MediaMuxer initMediaMuxer = initMediaMuxer(outputFileOptions);
                            this.mMuxer = initMediaMuxer;
                            Preconditions.checkNotNull(initMediaMuxer);
                            this.mMuxer.setOrientationHint(getRelativeRotation(camera));
                            Metadata metadata = outputFileOptions.getMetadata();
                            if (metadata != null && metadata.location != null) {
                                this.mMuxer.setLocation((float) metadata.location.getLatitude(), (float) metadata.location.getLongitude());
                            }
                        }
                        this.mEndOfVideoStreamSignal.set(false);
                        this.mEndOfAudioStreamSignal.set(false);
                        this.mEndOfAudioVideoSignal.set(false);
                        this.mIsRecording = true;
                        notifyActive();
                        this.mAudioHandler.post(new Runnable() { // from class: androidx.camera.video.VideoCaptureLegacy$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                VideoCaptureLegacy.this.m214lambda$startRecording$3$androidxcameravideoVideoCaptureLegacy(videoSavedListenerWrapper);
                            }
                        });
                        final String cameraId = getCameraId();
                        final Size attachedSurfaceResolution = getAttachedSurfaceResolution();
                        this.mVideoHandler.post(new Runnable() { // from class: androidx.camera.video.VideoCaptureLegacy$$ExternalSyntheticLambda5
                            @Override // java.lang.Runnable
                            public final void run() {
                                VideoCaptureLegacy.this.m215lambda$startRecording$4$androidxcameravideoVideoCaptureLegacy(videoSavedListenerWrapper, cameraId, attachedSurfaceResolution, completer);
                            }
                        });
                    } catch (IOException e) {
                        completer.set(null);
                        videoSavedListenerWrapper.onError(2, "MediaMuxer creation failed!", e);
                    }
                } catch (IllegalStateException e2) {
                    completer.set(null);
                    videoSavedListenerWrapper.onError(1, "Audio/Video encoder start fail", e2);
                }
            } catch (IllegalStateException e3) {
                videoSavedListenerWrapper.onError(1, "AudioRecorder start fail", e3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$startRecording$2$androidx-camera-video-VideoCaptureLegacy  reason: not valid java name */
    public /* synthetic */ void m213lambda$startRecording$2$androidxcameravideoVideoCaptureLegacy() {
        this.mRecordingFuture = null;
        if (getCamera() != null) {
            setupEncoder(getCameraId(), getAttachedSurfaceResolution());
            notifyReset();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$startRecording$4$androidx-camera-video-VideoCaptureLegacy  reason: not valid java name */
    public /* synthetic */ void m215lambda$startRecording$4$androidxcameravideoVideoCaptureLegacy(OnVideoSavedCallback onVideoSavedCallback, String str, Size size, CallbackToFutureAdapter.Completer completer) {
        if (!videoEncode(onVideoSavedCallback, str, size)) {
            onVideoSavedCallback.onVideoSaved(new OutputFileResults(this.mSavedVideoUri));
            this.mSavedVideoUri = null;
        }
        completer.set(null);
    }

    /* renamed from: stopRecording */
    public void m216lambda$stopRecording$5$androidxcameravideoVideoCaptureLegacy() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.video.VideoCaptureLegacy$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCaptureLegacy.this.m216lambda$stopRecording$5$androidxcameravideoVideoCaptureLegacy();
                }
            });
            return;
        }
        Logger.i(TAG, "stopRecording");
        notifyInactive();
        if (this.mEndOfAudioVideoSignal.get() || !this.mIsRecording) {
            return;
        }
        this.mEndOfAudioStreamSignal.set(true);
    }

    @Override // androidx.camera.core.UseCase
    public void onDetached() {
        m216lambda$stopRecording$5$androidxcameravideoVideoCaptureLegacy();
        ListenableFuture<Void> listenableFuture = this.mRecordingFuture;
        if (listenableFuture != null) {
            listenableFuture.addListener(new Runnable() { // from class: androidx.camera.video.VideoCaptureLegacy$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCaptureLegacy.this.m211lambda$onDetached$6$androidxcameravideoVideoCaptureLegacy();
                }
            }, CameraXExecutors.mainThreadExecutor());
        } else {
            m211lambda$onDetached$6$androidxcameravideoVideoCaptureLegacy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: releaseResources */
    public void m211lambda$onDetached$6$androidxcameravideoVideoCaptureLegacy() {
        this.mVideoHandlerThread.quitSafely();
        this.mAudioHandlerThread.quitSafely();
        MediaCodec mediaCodec = this.mAudioEncoder;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.mAudioEncoder = null;
        }
        AudioRecord audioRecord = this.mAudioRecorder;
        if (audioRecord != null) {
            audioRecord.release();
            this.mAudioRecorder = null;
        }
        if (this.mCameraSurface != null) {
            releaseCameraSurface(true);
        }
    }

    @Override // androidx.camera.core.UseCase
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    @Override // androidx.camera.core.UseCase
    public void onStateDetached() {
        m216lambda$stopRecording$5$androidxcameravideoVideoCaptureLegacy();
    }

    private void releaseCameraSurface(final boolean z) {
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface == null) {
            return;
        }
        final MediaCodec mediaCodec = this.mVideoEncoder;
        deferrableSurface.close();
        this.mDeferrableSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.video.VideoCaptureLegacy$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                VideoCaptureLegacy.lambda$releaseCameraSurface$7(z, mediaCodec);
            }
        }, CameraXExecutors.mainThreadExecutor());
        if (z) {
            this.mVideoEncoder = null;
        }
        this.mCameraSurface = null;
        this.mDeferrableSurface = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$releaseCameraSurface$7(boolean z, MediaCodec mediaCodec) {
        if (!z || mediaCodec == null) {
            return;
        }
        mediaCodec.release();
    }

    public void setTargetRotation(int i) {
        setTargetRotationInternal(i);
    }

    void setupEncoder(final String str, final Size size) {
        VideoCaptureLegacyConfig videoCaptureLegacyConfig = (VideoCaptureLegacyConfig) getCurrentConfig();
        this.mVideoEncoder.reset();
        this.mVideoEncoder.configure(createMediaFormat(videoCaptureLegacyConfig, size), (Surface) null, (MediaCrypto) null, 1);
        if (this.mCameraSurface != null) {
            releaseCameraSurface(false);
        }
        Surface createInputSurface = this.mVideoEncoder.createInputSurface();
        this.mCameraSurface = createInputSurface;
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(videoCaptureLegacyConfig);
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        ImmediateSurface immediateSurface = new ImmediateSurface(this.mCameraSurface);
        this.mDeferrableSurface = immediateSurface;
        ListenableFuture<Void> terminationFuture = immediateSurface.getTerminationFuture();
        Objects.requireNonNull(createInputSurface);
        terminationFuture.addListener(new VideoCapture$$ExternalSyntheticLambda8(createInputSurface), CameraXExecutors.mainThreadExecutor());
        createFrom.addSurface(this.mDeferrableSurface);
        createFrom.addErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.video.VideoCaptureLegacy.1
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                if (VideoCaptureLegacy.this.isCurrentCamera(str)) {
                    VideoCaptureLegacy.this.setupEncoder(str, size);
                    VideoCaptureLegacy.this.notifyReset();
                }
            }
        });
        updateSessionConfig(createFrom.build());
        setAudioParametersByCamcorderProfile(size, str);
        this.mAudioEncoder.reset();
        this.mAudioEncoder.configure(createAudioMediaFormat(), (Surface) null, (MediaCrypto) null, 1);
        AudioRecord audioRecord = this.mAudioRecorder;
        if (audioRecord != null) {
            audioRecord.release();
        }
        AudioRecord autoConfigAudioRecordSource = autoConfigAudioRecordSource(videoCaptureLegacyConfig);
        this.mAudioRecorder = autoConfigAudioRecordSource;
        if (autoConfigAudioRecordSource == null) {
            Logger.e(TAG, "AudioRecord object cannot initialized correctly!");
        }
        this.mVideoTrackIndex = -1;
        this.mAudioTrackIndex = -1;
        this.mIsRecording = false;
    }

    private boolean writeVideoEncodedBuffer(int i) {
        if (i < 0) {
            Logger.e(TAG, "Output buffer should not have negative index: " + i);
            return false;
        }
        ByteBuffer outputBuffer = this.mVideoEncoder.getOutputBuffer(i);
        if (outputBuffer == null) {
            Logger.d(TAG, "OutputBuffer was null.");
            return false;
        }
        if (this.mAudioTrackIndex >= 0 && this.mVideoTrackIndex >= 0 && this.mVideoBufferInfo.size > 0) {
            outputBuffer.position(this.mVideoBufferInfo.offset);
            outputBuffer.limit(this.mVideoBufferInfo.offset + this.mVideoBufferInfo.size);
            this.mVideoBufferInfo.presentationTimeUs = System.nanoTime() / 1000;
            synchronized (this.mMuxerLock) {
                if (!this.mIsFirstVideoSampleWrite.get()) {
                    Logger.i(TAG, "First video sample written.");
                    this.mIsFirstVideoSampleWrite.set(true);
                }
                this.mMuxer.writeSampleData(this.mVideoTrackIndex, outputBuffer, this.mVideoBufferInfo);
            }
        }
        this.mVideoEncoder.releaseOutputBuffer(i, false);
        return (this.mVideoBufferInfo.flags & 4) != 0;
    }

    private boolean writeAudioEncodedBuffer(int i) {
        ByteBuffer outputBuffer = getOutputBuffer(this.mAudioEncoder, i);
        outputBuffer.position(this.mAudioBufferInfo.offset);
        if (this.mAudioTrackIndex >= 0 && this.mVideoTrackIndex >= 0 && this.mAudioBufferInfo.size > 0 && this.mAudioBufferInfo.presentationTimeUs > 0) {
            try {
                synchronized (this.mMuxerLock) {
                    if (!this.mIsFirstAudioSampleWrite.get()) {
                        Logger.i(TAG, "First audio sample written.");
                        this.mIsFirstAudioSampleWrite.set(true);
                    }
                    this.mMuxer.writeSampleData(this.mAudioTrackIndex, outputBuffer, this.mAudioBufferInfo);
                }
            } catch (Exception e) {
                Logger.e(TAG, "audio error:size=" + this.mAudioBufferInfo.size + "/offset=" + this.mAudioBufferInfo.offset + "/timeUs=" + this.mAudioBufferInfo.presentationTimeUs);
                e.printStackTrace();
            }
        }
        this.mAudioEncoder.releaseOutputBuffer(i, false);
        return (this.mAudioBufferInfo.flags & 4) != 0;
    }

    boolean videoEncode(OnVideoSavedCallback onVideoSavedCallback, String str, Size size) {
        boolean z = false;
        boolean z2 = false;
        while (!z && !z2) {
            if (this.mEndOfVideoStreamSignal.get()) {
                this.mVideoEncoder.signalEndOfInputStream();
                this.mEndOfVideoStreamSignal.set(false);
            }
            int dequeueOutputBuffer = this.mVideoEncoder.dequeueOutputBuffer(this.mVideoBufferInfo, HandlingStrategy.DEFAULT_TTL);
            if (dequeueOutputBuffer == -2) {
                if (this.mMuxerStarted) {
                    onVideoSavedCallback.onError(1, "Unexpected change in video encoding format.", null);
                    z2 = true;
                }
                synchronized (this.mMuxerLock) {
                    int addTrack = this.mMuxer.addTrack(this.mVideoEncoder.getOutputFormat());
                    this.mVideoTrackIndex = addTrack;
                    if (this.mAudioTrackIndex >= 0 && addTrack >= 0) {
                        this.mMuxerStarted = true;
                        Logger.i(TAG, "media mMuxer start");
                        this.mMuxer.start();
                    }
                }
            } else if (dequeueOutputBuffer != -1) {
                z = writeVideoEncodedBuffer(dequeueOutputBuffer);
            }
        }
        try {
            Logger.i(TAG, "videoEncoder stop");
            this.mVideoEncoder.stop();
        } catch (IllegalStateException e) {
            onVideoSavedCallback.onError(1, "Video encoder stop failed!", e);
            z2 = true;
        }
        try {
            synchronized (this.mMuxerLock) {
                MediaMuxer mediaMuxer = this.mMuxer;
                if (mediaMuxer != null) {
                    if (this.mMuxerStarted) {
                        mediaMuxer.stop();
                    }
                    this.mMuxer.release();
                    this.mMuxer = null;
                }
            }
        } catch (IllegalStateException e2) {
            onVideoSavedCallback.onError(2, "Muxer stop failed!", e2);
            z2 = true;
        }
        ParcelFileDescriptor parcelFileDescriptor = this.mParcelFileDescriptor;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
                this.mParcelFileDescriptor = null;
            } catch (IOException e3) {
                onVideoSavedCallback.onError(2, "File descriptor close failed!", e3);
                z2 = true;
            }
        }
        this.mMuxerStarted = false;
        this.mEndOfAudioVideoSignal.set(true);
        Logger.i(TAG, "Video encode thread end.");
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: audioEncode */
    public boolean m214lambda$startRecording$3$androidxcameravideoVideoCaptureLegacy(OnVideoSavedCallback onVideoSavedCallback) {
        boolean z = false;
        long j = 0;
        while (!z && this.mIsRecording) {
            if (this.mEndOfAudioStreamSignal.get()) {
                this.mEndOfAudioStreamSignal.set(false);
                this.mIsRecording = false;
            }
            MediaCodec mediaCodec = this.mAudioEncoder;
            if (mediaCodec != null && this.mAudioRecorder != null) {
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(-1L);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer inputBuffer = getInputBuffer(this.mAudioEncoder, dequeueInputBuffer);
                    inputBuffer.clear();
                    int read = this.mAudioRecorder.read(inputBuffer, this.mAudioBufferSize);
                    if (read > 0) {
                        this.mAudioEncoder.queueInputBuffer(dequeueInputBuffer, 0, read, System.nanoTime() / 1000, this.mIsRecording ? 0 : 4);
                    }
                }
                do {
                    int dequeueOutputBuffer = this.mAudioEncoder.dequeueOutputBuffer(this.mAudioBufferInfo, 0L);
                    if (dequeueOutputBuffer == -2) {
                        synchronized (this.mMuxerLock) {
                            int addTrack = this.mMuxer.addTrack(this.mAudioEncoder.getOutputFormat());
                            this.mAudioTrackIndex = addTrack;
                            if (addTrack >= 0 && this.mVideoTrackIndex >= 0) {
                                this.mMuxerStarted = true;
                                this.mMuxer.start();
                            }
                        }
                    } else if (dequeueOutputBuffer != -1) {
                        if (this.mAudioBufferInfo.presentationTimeUs >= j) {
                            z = writeAudioEncodedBuffer(dequeueOutputBuffer);
                            j = this.mAudioBufferInfo.presentationTimeUs;
                        } else {
                            Logger.w(TAG, "Drops frame, current frame's timestamp " + this.mAudioBufferInfo.presentationTimeUs + " is earlier that last frame " + j);
                            this.mAudioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                        }
                    }
                    if (dequeueOutputBuffer >= 0) {
                    }
                } while (!z);
            }
        }
        try {
            Logger.i(TAG, "audioRecorder stop");
            this.mAudioRecorder.stop();
        } catch (IllegalStateException e) {
            onVideoSavedCallback.onError(1, "Audio recorder stop failed!", e);
        }
        try {
            this.mAudioEncoder.stop();
        } catch (IllegalStateException e2) {
            onVideoSavedCallback.onError(1, "Audio encoder stop failed!", e2);
        }
        Logger.i(TAG, "Audio encode thread end");
        this.mEndOfVideoStreamSignal.set(true);
        return false;
    }

    private ByteBuffer getInputBuffer(MediaCodec mediaCodec, int i) {
        return mediaCodec.getInputBuffer(i);
    }

    private ByteBuffer getOutputBuffer(MediaCodec mediaCodec, int i) {
        return mediaCodec.getOutputBuffer(i);
    }

    private MediaFormat createAudioMediaFormat() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.mAudioSampleRate, this.mAudioChannelCount);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", this.mAudioBitRate);
        return createAudioFormat;
    }

    private AudioRecord autoConfigAudioRecordSource(VideoCaptureLegacyConfig videoCaptureLegacyConfig) {
        short[] sArr;
        int i;
        AudioRecord audioRecord;
        for (short s : sAudioEncoding) {
            int i2 = this.mAudioChannelCount == 1 ? 16 : 12;
            int audioRecordSource = videoCaptureLegacyConfig.getAudioRecordSource();
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(this.mAudioSampleRate, i2, s);
                if (minBufferSize <= 0) {
                    minBufferSize = videoCaptureLegacyConfig.getAudioMinBufferSize();
                }
                i = minBufferSize;
                audioRecord = new AudioRecord(audioRecordSource, this.mAudioSampleRate, i2, s, i * 2);
            } catch (Exception e) {
                Logger.e(TAG, "Exception, keep trying.", e);
            }
            if (audioRecord.getState() == 1) {
                this.mAudioBufferSize = i;
                Logger.i(TAG, "source: " + audioRecordSource + " audioSampleRate: " + this.mAudioSampleRate + " channelConfig: " + i2 + " audioFormat: " + ((int) s) + " bufferSize: " + i);
                return audioRecord;
            }
            continue;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        r7.mAudioChannelCount = r4.audioChannels;
        r7.mAudioSampleRate = r4.audioSampleRate;
        r7.mAudioBitRate = r4.audioBitRate;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setAudioParametersByCamcorderProfile(Size size, String str) {
        boolean z = false;
        try {
            int[] iArr = CamcorderQuality;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                int i2 = iArr[i];
                if (CamcorderProfile.hasProfile(Integer.parseInt(str), i2)) {
                    CamcorderProfile camcorderProfile = CamcorderProfile.get(Integer.parseInt(str), i2);
                    if (size.getWidth() == camcorderProfile.videoFrameWidth && size.getHeight() == camcorderProfile.videoFrameHeight) {
                        break;
                    }
                }
                i++;
            }
        } catch (NumberFormatException unused) {
            Logger.i(TAG, "The camera Id is not an integer because the camera may be a removable device. Use the default values for the audio related settings.");
        }
        if (z) {
            return;
        }
        VideoCaptureLegacyConfig videoCaptureLegacyConfig = (VideoCaptureLegacyConfig) getCurrentConfig();
        this.mAudioChannelCount = videoCaptureLegacyConfig.getAudioChannelCount();
        this.mAudioSampleRate = videoCaptureLegacyConfig.getAudioSampleRate();
        this.mAudioBitRate = videoCaptureLegacyConfig.getAudioBitRate();
    }

    private MediaMuxer initMediaMuxer(OutputFileOptions outputFileOptions) throws IOException {
        ContentValues contentValues;
        MediaMuxer createMediaMuxer;
        if (outputFileOptions.isSavingToFile()) {
            File file = outputFileOptions.getFile();
            this.mSavedVideoUri = Uri.fromFile(outputFileOptions.getFile());
            return new MediaMuxer(file.getAbsolutePath(), 0);
        } else if (outputFileOptions.isSavingToFileDescriptor()) {
            if (Build.VERSION.SDK_INT < 26) {
                throw new IllegalArgumentException("Using a FileDescriptor to record a video is only supported for Android 8.0 or above.");
            }
            return Api26Impl.createMediaMuxer(outputFileOptions.getFileDescriptor(), 0);
        } else if (outputFileOptions.isSavingToMediaStore()) {
            if (outputFileOptions.getContentValues() != null) {
                contentValues = new ContentValues(outputFileOptions.getContentValues());
            } else {
                contentValues = new ContentValues();
            }
            Uri insert = outputFileOptions.getContentResolver().insert(outputFileOptions.getSaveCollection(), contentValues);
            this.mSavedVideoUri = insert;
            if (insert == null) {
                throw new IOException("Invalid Uri!");
            }
            try {
                if (Build.VERSION.SDK_INT < 26) {
                    String absolutePathFromUri = VideoUtil.getAbsolutePathFromUri(outputFileOptions.getContentResolver(), this.mSavedVideoUri);
                    Logger.i(TAG, "Saved Location Path: " + absolutePathFromUri);
                    createMediaMuxer = new MediaMuxer(absolutePathFromUri, 0);
                } else {
                    ParcelFileDescriptor openFileDescriptor = outputFileOptions.getContentResolver().openFileDescriptor(this.mSavedVideoUri, "rw");
                    this.mParcelFileDescriptor = openFileDescriptor;
                    createMediaMuxer = Api26Impl.createMediaMuxer(openFileDescriptor.getFileDescriptor(), 0);
                }
                return createMediaMuxer;
            } catch (IOException e) {
                this.mSavedVideoUri = null;
                throw e;
            }
        } else {
            throw new IllegalArgumentException("The OutputFileOptions should assign before recording");
        }
    }

    /* loaded from: classes.dex */
    public static final class Defaults implements ConfigProvider<VideoCaptureLegacyConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 1;
        private static final int DEFAULT_AUDIO_BIT_RATE = 64000;
        private static final int DEFAULT_AUDIO_CHANNEL_COUNT = 1;
        private static final int DEFAULT_AUDIO_MIN_BUFFER_SIZE = 1024;
        private static final int DEFAULT_AUDIO_RECORD_SOURCE = 1;
        private static final int DEFAULT_AUDIO_SAMPLE_RATE = 8000;
        private static final int DEFAULT_BIT_RATE = 8388608;
        private static final VideoCaptureLegacyConfig DEFAULT_CONFIG;
        private static final int DEFAULT_INTRA_FRAME_INTERVAL = 1;
        private static final Size DEFAULT_MAX_RESOLUTION;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 3;
        private static final int DEFAULT_VIDEO_FRAME_RATE = 30;

        static {
            Size size = new Size(1920, 1080);
            DEFAULT_MAX_RESOLUTION = size;
            DEFAULT_CONFIG = new Builder().setVideoFrameRate(30).setBitRate(8388608).setIFrameInterval(1).setAudioBitRate(DEFAULT_AUDIO_BIT_RATE).setAudioSampleRate(8000).setAudioChannelCount(1).setAudioRecordSource(1).setAudioMinBufferSize(1024).setMaxResolution(size).setSurfaceOccupancyPriority(3).setTargetAspectRatio(1).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public VideoCaptureLegacyConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class VideoSavedListenerWrapper implements OnVideoSavedCallback {
        Executor mExecutor;
        OnVideoSavedCallback mOnVideoSavedCallback;

        VideoSavedListenerWrapper(Executor executor, OnVideoSavedCallback onVideoSavedCallback) {
            this.mExecutor = executor;
            this.mOnVideoSavedCallback = onVideoSavedCallback;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onVideoSaved$0$androidx-camera-video-VideoCaptureLegacy$VideoSavedListenerWrapper  reason: not valid java name */
        public /* synthetic */ void m218x2008e549(OutputFileResults outputFileResults) {
            this.mOnVideoSavedCallback.onVideoSaved(outputFileResults);
        }

        @Override // androidx.camera.video.VideoCaptureLegacy.OnVideoSavedCallback
        public void onVideoSaved(final OutputFileResults outputFileResults) {
            try {
                this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.VideoCaptureLegacy$VideoSavedListenerWrapper$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoCaptureLegacy.VideoSavedListenerWrapper.this.m218x2008e549(outputFileResults);
                    }
                });
            } catch (RejectedExecutionException unused) {
                Logger.e(VideoCaptureLegacy.TAG, "Unable to post to the supplied executor.");
            }
        }

        @Override // androidx.camera.video.VideoCaptureLegacy.OnVideoSavedCallback
        public void onError(final int i, final String str, final Throwable th) {
            try {
                this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.VideoCaptureLegacy$VideoSavedListenerWrapper$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoCaptureLegacy.VideoSavedListenerWrapper.this.m217xdb64b864(i, str, th);
                    }
                });
            } catch (RejectedExecutionException unused) {
                Logger.e(VideoCaptureLegacy.TAG, "Unable to post to the supplied executor.");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onError$1$androidx-camera-video-VideoCaptureLegacy$VideoSavedListenerWrapper  reason: not valid java name */
        public /* synthetic */ void m217xdb64b864(int i, String str, Throwable th) {
            this.mOnVideoSavedCallback.onError(i, str, th);
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder implements UseCaseConfig.Builder<VideoCaptureLegacy, VideoCaptureLegacyConfig, Builder>, ImageOutputConfig.Builder<Builder>, ThreadConfig.Builder<Builder> {
        private final MutableOptionsBundle mMutableConfig;

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setSupportedResolutions(List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            return setTargetClass((Class<VideoCaptureLegacy>) cls);
        }

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(VideoCaptureLegacy.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            setTargetClass(VideoCaptureLegacy.class);
        }

        static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        public static Builder fromConfig(VideoCaptureLegacyConfig videoCaptureLegacyConfig) {
            return new Builder(MutableOptionsBundle.from((Config) videoCaptureLegacyConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public VideoCaptureLegacyConfig getUseCaseConfig() {
            return new VideoCaptureLegacyConfig(OptionsBundle.from(this.mMutableConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public VideoCaptureLegacy build() {
            if (getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, null) != null && getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null) != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
            return new VideoCaptureLegacy(getUseCaseConfig());
        }

        public Builder setVideoFrameRate(int i) {
            getMutableConfig().insertOption(VideoCaptureLegacyConfig.OPTION_VIDEO_FRAME_RATE, Integer.valueOf(i));
            return this;
        }

        public Builder setBitRate(int i) {
            getMutableConfig().insertOption(VideoCaptureLegacyConfig.OPTION_BIT_RATE, Integer.valueOf(i));
            return this;
        }

        public Builder setIFrameInterval(int i) {
            getMutableConfig().insertOption(VideoCaptureLegacyConfig.OPTION_INTRA_FRAME_INTERVAL, Integer.valueOf(i));
            return this;
        }

        public Builder setAudioBitRate(int i) {
            getMutableConfig().insertOption(VideoCaptureLegacyConfig.OPTION_AUDIO_BIT_RATE, Integer.valueOf(i));
            return this;
        }

        public Builder setAudioSampleRate(int i) {
            getMutableConfig().insertOption(VideoCaptureLegacyConfig.OPTION_AUDIO_SAMPLE_RATE, Integer.valueOf(i));
            return this;
        }

        public Builder setAudioChannelCount(int i) {
            getMutableConfig().insertOption(VideoCaptureLegacyConfig.OPTION_AUDIO_CHANNEL_COUNT, Integer.valueOf(i));
            return this;
        }

        public Builder setAudioRecordSource(int i) {
            getMutableConfig().insertOption(VideoCaptureLegacyConfig.OPTION_AUDIO_RECORD_SOURCE, Integer.valueOf(i));
            return this;
        }

        public Builder setAudioMinBufferSize(int i) {
            getMutableConfig().insertOption(VideoCaptureLegacyConfig.OPTION_AUDIO_MIN_BUFFER_SIZE, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder setTargetClass(Class<VideoCaptureLegacy> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setTargetAspectRatio(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public Builder setBackgroundExecutor(Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setCameraSelector(CameraSelector cameraSelector) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
            return this;
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        public Builder setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            getMutableConfig().insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class OutputFileResults {
        private Uri mSavedUri;

        OutputFileResults(Uri uri) {
            this.mSavedUri = uri;
        }

        public Uri getSavedUri() {
            return this.mSavedUri;
        }
    }

    /* loaded from: classes.dex */
    public static final class OutputFileOptions {
        private static final Metadata EMPTY_METADATA = new Metadata();
        private final ContentResolver mContentResolver;
        private final ContentValues mContentValues;
        private final File mFile;
        private final FileDescriptor mFileDescriptor;
        private final Metadata mMetadata;
        private final Uri mSaveCollection;

        OutputFileOptions(File file, FileDescriptor fileDescriptor, ContentResolver contentResolver, Uri uri, ContentValues contentValues, Metadata metadata) {
            this.mFile = file;
            this.mFileDescriptor = fileDescriptor;
            this.mContentResolver = contentResolver;
            this.mSaveCollection = uri;
            this.mContentValues = contentValues;
            this.mMetadata = metadata == null ? EMPTY_METADATA : metadata;
        }

        File getFile() {
            return this.mFile;
        }

        FileDescriptor getFileDescriptor() {
            return this.mFileDescriptor;
        }

        ContentResolver getContentResolver() {
            return this.mContentResolver;
        }

        Uri getSaveCollection() {
            return this.mSaveCollection;
        }

        ContentValues getContentValues() {
            return this.mContentValues;
        }

        Metadata getMetadata() {
            return this.mMetadata;
        }

        boolean isSavingToMediaStore() {
            return (getSaveCollection() == null || getContentResolver() == null || getContentValues() == null) ? false : true;
        }

        boolean isSavingToFile() {
            return getFile() != null;
        }

        boolean isSavingToFileDescriptor() {
            return getFileDescriptor() != null;
        }

        /* loaded from: classes.dex */
        public static final class Builder {
            private ContentResolver mContentResolver;
            private ContentValues mContentValues;
            private File mFile;
            private FileDescriptor mFileDescriptor;
            private Metadata mMetadata;
            private Uri mSaveCollection;

            public Builder(File file) {
                this.mFile = file;
            }

            public Builder(FileDescriptor fileDescriptor) {
                Preconditions.checkArgument(Build.VERSION.SDK_INT >= 26, "Using a FileDescriptor to record a video is only supported for Android 8.0 or above.");
                this.mFileDescriptor = fileDescriptor;
            }

            public Builder(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
                this.mContentResolver = contentResolver;
                this.mSaveCollection = uri;
                this.mContentValues = contentValues;
            }

            public Builder setMetadata(Metadata metadata) {
                this.mMetadata = metadata;
                return this;
            }

            public OutputFileOptions build() {
                return new OutputFileOptions(this.mFile, this.mFileDescriptor, this.mContentResolver, this.mSaveCollection, this.mContentValues, this.mMetadata);
            }
        }
    }
}
