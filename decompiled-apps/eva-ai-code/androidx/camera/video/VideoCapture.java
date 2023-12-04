package androidx.camera.video;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.UseCaseEventConfig;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class VideoCapture<T extends VideoOutput> extends UseCase {
    private static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final String SURFACE_UPDATE_KEY = "androidx.camera.video.VideoCapture.streamUpdate";
    private static final String TAG = "VideoCapture";
    DeferrableSurface mDeferrableSurface;
    SessionConfig.Builder mSessionConfigBuilder;
    VideoOutput.SourceState mSourceState;
    StreamInfo mStreamInfo;
    private final Observable.Observer<StreamInfo> mStreamInfoObserver;
    private SurfaceRequest mSurfaceRequest;
    ListenableFuture<Void> mSurfaceUpdateFuture;

    public static <T extends VideoOutput> VideoCapture<T> withOutput(T t) {
        return new Builder((VideoOutput) Preconditions.checkNotNull(t)).build();
    }

    VideoCapture(VideoCaptureConfig<T> videoCaptureConfig) {
        super(videoCaptureConfig);
        this.mStreamInfo = StreamInfo.STREAM_INFO_ANY_INACTIVE;
        this.mSessionConfigBuilder = new SessionConfig.Builder();
        this.mSurfaceUpdateFuture = null;
        this.mSourceState = VideoOutput.SourceState.INACTIVE;
        this.mStreamInfoObserver = new Observable.Observer<StreamInfo>() { // from class: androidx.camera.video.VideoCapture.1
            @Override // androidx.camera.core.impl.Observable.Observer
            public void onNewData(StreamInfo streamInfo) {
                if (streamInfo == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                if (VideoCapture.this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                    return;
                }
                Logger.d(VideoCapture.TAG, "Stream info update: old: " + VideoCapture.this.mStreamInfo + " new: " + streamInfo);
                StreamInfo streamInfo2 = VideoCapture.this.mStreamInfo;
                VideoCapture.this.mStreamInfo = streamInfo;
                if (!StreamInfo.NON_SURFACE_STREAM_ID.contains(Integer.valueOf(streamInfo2.getId())) && !StreamInfo.NON_SURFACE_STREAM_ID.contains(Integer.valueOf(streamInfo.getId())) && streamInfo2.getId() != streamInfo.getId()) {
                    VideoCapture videoCapture = VideoCapture.this;
                    videoCapture.resetPipeline(videoCapture.getCameraId(), (VideoCaptureConfig) VideoCapture.this.getCurrentConfig(), (Size) Preconditions.checkNotNull(VideoCapture.this.getAttachedSurfaceResolution()));
                } else if ((streamInfo2.getId() != -1 && streamInfo.getId() == -1) || (streamInfo2.getId() == -1 && streamInfo.getId() != -1)) {
                    VideoCapture videoCapture2 = VideoCapture.this;
                    videoCapture2.applyStreamInfoToSessionConfigBuilder(videoCapture2.mSessionConfigBuilder, streamInfo);
                    VideoCapture videoCapture3 = VideoCapture.this;
                    videoCapture3.updateSessionConfig(videoCapture3.mSessionConfigBuilder.build());
                    VideoCapture.this.notifyReset();
                } else if (streamInfo2.getStreamState() != streamInfo.getStreamState()) {
                    VideoCapture videoCapture4 = VideoCapture.this;
                    videoCapture4.applyStreamInfoToSessionConfigBuilder(videoCapture4.mSessionConfigBuilder, streamInfo);
                    VideoCapture videoCapture5 = VideoCapture.this;
                    videoCapture5.updateSessionConfig(videoCapture5.mSessionConfigBuilder.build());
                    VideoCapture.this.notifyUpdated();
                }
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onError(Throwable th) {
                Logger.w(VideoCapture.TAG, "Receive onError from StreamState observer", th);
            }
        };
    }

    public T getOutput() {
        return (T) ((VideoCaptureConfig) getCurrentConfig()).getVideoOutput();
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    public void setTargetRotation(int i) {
        if (setTargetRotationInternal(i)) {
            sendTransformationInfoIfReady(getAttachedSurfaceResolution());
        }
    }

    @Override // androidx.camera.core.UseCase
    public void onStateAttached() {
        super.onStateAttached();
        getOutput().getStreamInfo().addObserver(CameraXExecutors.mainThreadExecutor(), this.mStreamInfoObserver);
        setSourceState(VideoOutput.SourceState.ACTIVE_NON_STREAMING);
    }

    @Override // androidx.camera.core.UseCase
    protected Size onSuggestedResolutionUpdated(Size size) {
        Logger.d(TAG, "suggestedResolution = " + size);
        String cameraId = getCameraId();
        VideoCaptureConfig<T> videoCaptureConfig = (VideoCaptureConfig) getCurrentConfig();
        Size[] sizeArr = null;
        List supportedResolutions = videoCaptureConfig.getSupportedResolutions(null);
        if (supportedResolutions != null) {
            Iterator it = supportedResolutions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).intValue() == getImageFormat() && pair.second != null) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        if (sizeArr != null) {
            int width = size.getWidth() * size.getHeight();
            int length = sizeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size2 = sizeArr[i];
                if (Objects.equals(size2, size)) {
                    break;
                } else if (size2.getWidth() * size2.getHeight() < width) {
                    Logger.d(TAG, "Find a higher priority resolution: " + size2);
                    size = size2;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.mStreamInfo = (StreamInfo) fetchObservableValue(getOutput().getStreamInfo(), StreamInfo.STREAM_INFO_ANY_INACTIVE);
        SessionConfig.Builder createPipeline = createPipeline(cameraId, videoCaptureConfig, size);
        this.mSessionConfigBuilder = createPipeline;
        applyStreamInfoToSessionConfigBuilder(createPipeline, this.mStreamInfo);
        updateSessionConfig(this.mSessionConfigBuilder.build());
        notifyActive();
        return size;
    }

    @Override // androidx.camera.core.UseCase
    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        sendTransformationInfoIfReady(getAttachedSurfaceResolution());
    }

    @Override // androidx.camera.core.UseCase
    public void onDetached() {
        clearPipeline();
    }

    @Override // androidx.camera.core.UseCase
    public void onStateDetached() {
        Preconditions.checkState(Threads.isMainThread(), "VideoCapture can only be detached on the main thread.");
        setSourceState(VideoOutput.SourceState.INACTIVE);
        getOutput().getStreamInfo().removeObserver(this.mStreamInfoObserver);
        ListenableFuture<Void> listenableFuture = this.mSurfaceUpdateFuture;
        if (listenableFuture == null || !listenableFuture.cancel(false)) {
            return;
        }
        Logger.d(TAG, "VideoCapture is detached from the camera. Surface update cancelled.");
    }

    public String toString() {
        return "VideoCapture:" + getName();
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

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    protected UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        updateSupportedResolutionsByQuality(cameraInfoInternal, builder);
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    private void sendTransformationInfoIfReady(Size size) {
        CameraInternal camera = getCamera();
        SurfaceRequest surfaceRequest = this.mSurfaceRequest;
        Rect cropRect = getCropRect(size);
        if (camera == null || surfaceRequest == null || cropRect == null) {
            return;
        }
        surfaceRequest.updateTransformationInfo(SurfaceRequest.TransformationInfo.of(cropRect, getRelativeRotation(camera), getTargetRotationInternal()));
    }

    private Rect getCropRect(Size size) {
        if (getViewPortCropRect() != null) {
            return getViewPortCropRect();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    private SessionConfig.Builder createPipeline(final String str, final VideoCaptureConfig<T> videoCaptureConfig, final Size size) {
        Threads.checkMainThread();
        this.mSurfaceRequest = new SurfaceRequest(size, (CameraInternal) Preconditions.checkNotNull(getCamera()), false);
        videoCaptureConfig.getVideoOutput().onSurfaceRequested(this.mSurfaceRequest);
        sendTransformationInfoIfReady(size);
        DeferrableSurface deferrableSurface = this.mSurfaceRequest.getDeferrableSurface();
        this.mDeferrableSurface = deferrableSurface;
        deferrableSurface.setContainerClass(MediaCodec.class);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(videoCaptureConfig);
        createFrom.addErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                VideoCapture.this.m208lambda$createPipeline$0$androidxcameravideoVideoCapture(str, videoCaptureConfig, size, sessionConfig, sessionError);
            }
        });
        return createFrom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$createPipeline$0$androidx-camera-video-VideoCapture  reason: not valid java name */
    public /* synthetic */ void m208lambda$createPipeline$0$androidxcameravideoVideoCapture(String str, VideoCaptureConfig videoCaptureConfig, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        resetPipeline(str, videoCaptureConfig, size);
    }

    private void clearPipeline() {
        Threads.checkMainThread();
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
        }
        this.mSurfaceRequest = null;
        this.mStreamInfo = StreamInfo.STREAM_INFO_ANY_INACTIVE;
    }

    void resetPipeline(String str, VideoCaptureConfig<T> videoCaptureConfig, Size size) {
        clearPipeline();
        if (isCurrentCamera(str)) {
            SessionConfig.Builder createPipeline = createPipeline(str, videoCaptureConfig, size);
            this.mSessionConfigBuilder = createPipeline;
            applyStreamInfoToSessionConfigBuilder(createPipeline, this.mStreamInfo);
            updateSessionConfig(this.mSessionConfigBuilder.build());
            notifyReset();
        }
    }

    /* loaded from: classes.dex */
    public static final class Defaults implements ConfigProvider<VideoCaptureConfig<?>> {
        private static final VideoCaptureConfig<?> DEFAULT_CONFIG;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 3;
        private static final VideoOutput DEFAULT_VIDEO_OUTPUT;

        static {
            VideoOutput videoOutput = new VideoOutput() { // from class: androidx.camera.video.VideoCapture$Defaults$$ExternalSyntheticLambda0
                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ Observable getMediaSpec() {
                    Observable withValue;
                    withValue = ConstantObservable.withValue(null);
                    return withValue;
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ Observable getStreamInfo() {
                    Observable observable;
                    observable = StreamInfo.ALWAYS_ACTIVE_OBSERVABLE;
                    return observable;
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ void onSourceStateChanged(VideoOutput.SourceState sourceState) {
                    VideoOutput.CC.$default$onSourceStateChanged(this, sourceState);
                }

                @Override // androidx.camera.video.VideoOutput
                public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                    surfaceRequest.willNotProvideSurface();
                }
            };
            DEFAULT_VIDEO_OUTPUT = videoOutput;
            DEFAULT_CONFIG = (VideoCaptureConfig<T>) new Builder(videoOutput).setSurfaceOccupancyPriority(3).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public VideoCaptureConfig<?> getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    private MediaSpec getMediaSpec() {
        return (MediaSpec) fetchObservableValue(getOutput().getMediaSpec(), null);
    }

    void applyStreamInfoToSessionConfigBuilder(SessionConfig.Builder builder, StreamInfo streamInfo) {
        boolean z = streamInfo.getId() == -1;
        boolean z2 = streamInfo.getStreamState() == StreamInfo.StreamState.ACTIVE;
        if (z && z2) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        builder.clearSurfaces();
        if (!z) {
            if (z2) {
                builder.addSurface(this.mDeferrableSurface);
            } else {
                builder.addNonRepeatingSurface(this.mDeferrableSurface);
            }
        }
        setupSurfaceUpdateNotifier(builder, z2);
    }

    private void setupSurfaceUpdateNotifier(final SessionConfig.Builder builder, final boolean z) {
        ListenableFuture<Void> listenableFuture = this.mSurfaceUpdateFuture;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.d(TAG, "A newer surface update is requested. Previous surface update cancelled.");
        }
        final ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoCapture.this.m209x3b78567b(builder, completer);
            }
        });
        this.mSurfaceUpdateFuture = future;
        Futures.addCallback(future, new FutureCallback<Void>() { // from class: androidx.camera.video.VideoCapture.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r2) {
                if (future != VideoCapture.this.mSurfaceUpdateFuture || VideoCapture.this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                    return;
                }
                VideoCapture.this.setSourceState(z ? VideoOutput.SourceState.ACTIVE_STREAMING : VideoOutput.SourceState.ACTIVE_NON_STREAMING);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                if (th instanceof CancellationException) {
                    return;
                }
                Logger.e(VideoCapture.TAG, "Surface update completed with unexpected exception", th);
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setupSurfaceUpdateNotifier$2$androidx-camera-video-VideoCapture  reason: not valid java name */
    public /* synthetic */ Object m209x3b78567b(final SessionConfig.Builder builder, CallbackToFutureAdapter.Completer completer) throws Exception {
        builder.addTag(SURFACE_UPDATE_KEY, Integer.valueOf(completer.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AnonymousClass2 anonymousClass2 = new AnonymousClass2(atomicBoolean, completer, builder);
        completer.addCancellationListener(new Runnable() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapture.lambda$setupSurfaceUpdateNotifier$1(atomicBoolean, builder, anonymousClass2);
            }
        }, CameraXExecutors.directExecutor());
        builder.addRepeatingCameraCaptureCallback(anonymousClass2);
        return String.format("%s[0x%x]", SURFACE_UPDATE_KEY, Integer.valueOf(completer.hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.video.VideoCapture$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends CameraCaptureCallback {
        final /* synthetic */ CallbackToFutureAdapter.Completer val$completer;
        final /* synthetic */ SessionConfig.Builder val$sessionConfigBuilder;
        final /* synthetic */ AtomicBoolean val$surfaceUpdateComplete;

        AnonymousClass2(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, SessionConfig.Builder builder) {
            this.val$surfaceUpdateComplete = atomicBoolean;
            this.val$completer = completer;
            this.val$sessionConfigBuilder = builder;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            Object tag;
            super.onCaptureCompleted(cameraCaptureResult);
            if (this.val$surfaceUpdateComplete.get() || (tag = cameraCaptureResult.getTagBundle().getTag(VideoCapture.SURFACE_UPDATE_KEY)) == null || ((Integer) tag).intValue() != this.val$completer.hashCode() || !this.val$completer.set(null) || this.val$surfaceUpdateComplete.getAndSet(true)) {
                return;
            }
            ScheduledExecutorService mainThreadExecutor = CameraXExecutors.mainThreadExecutor();
            final SessionConfig.Builder builder = this.val$sessionConfigBuilder;
            mainThreadExecutor.execute(new Runnable() { // from class: androidx.camera.video.VideoCapture$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapture.AnonymousClass2.this.m210lambda$onCaptureCompleted$0$androidxcameravideoVideoCapture$2(builder);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onCaptureCompleted$0$androidx-camera-video-VideoCapture$2  reason: not valid java name */
        public /* synthetic */ void m210lambda$onCaptureCompleted$0$androidxcameravideoVideoCapture$2(SessionConfig.Builder builder) {
            builder.removeCameraCaptureCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$setupSurfaceUpdateNotifier$1(AtomicBoolean atomicBoolean, SessionConfig.Builder builder, CameraCaptureCallback cameraCaptureCallback) {
        Preconditions.checkState(Threads.isMainThread(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        builder.removeCameraCaptureCallback(cameraCaptureCallback);
    }

    private void updateSupportedResolutionsByQuality(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) throws IllegalArgumentException {
        MediaSpec mediaSpec = getMediaSpec();
        Preconditions.checkArgument(mediaSpec != null, "Unable to update target resolution by null MediaSpec.");
        if (QualitySelector.getSupportedQualities(cameraInfoInternal).isEmpty()) {
            Logger.w(TAG, "Can't find any supported quality on the device.");
            return;
        }
        QualitySelector qualitySelector = mediaSpec.getVideoSpec().getQualitySelector();
        List<Quality> prioritizedQualities = qualitySelector.getPrioritizedQualities(cameraInfoInternal);
        Logger.d(TAG, "Found selectedQualities " + prioritizedQualities + " by " + qualitySelector);
        if (prioritizedQualities.isEmpty()) {
            throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
        }
        ArrayList arrayList = new ArrayList();
        for (Quality quality : prioritizedQualities) {
            arrayList.add(QualitySelector.getResolution(cameraInfoInternal, quality));
        }
        Logger.d(TAG, "Set supported resolutions = " + arrayList);
        builder.getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, Collections.singletonList(Pair.create(Integer.valueOf(getImageFormat()), (Size[]) arrayList.toArray(new Size[0]))));
    }

    private static <T> T fetchObservableValue(Observable<T> observable, T t) {
        ListenableFuture<T> fetchData = observable.fetchData();
        if (fetchData.isDone()) {
            try {
                return fetchData.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        return t;
    }

    void setSourceState(VideoOutput.SourceState sourceState) {
        if (sourceState != this.mSourceState) {
            this.mSourceState = sourceState;
            getOutput().onSourceStateChanged(sourceState);
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder<T extends VideoOutput> implements UseCaseConfig.Builder<VideoCapture<T>, VideoCaptureConfig<T>, Builder<T>>, ImageOutputConfig.Builder<Builder<T>>, ThreadConfig.Builder<Builder<T>> {
        private final MutableOptionsBundle mMutableConfig;

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Object setSupportedResolutions(List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        Builder(T t) {
            this(createInitialBundle(t));
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            if (!mutableOptionsBundle.containsOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(VideoCapture.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            setTargetClass((Class) VideoCapture.class);
        }

        static Builder<? extends VideoOutput> fromConfig(Config config) {
            return new Builder<>(MutableOptionsBundle.from(config));
        }

        public static <T extends VideoOutput> Builder<T> fromConfig(VideoCaptureConfig<T> videoCaptureConfig) {
            return new Builder<>(MutableOptionsBundle.from((Config) videoCaptureConfig));
        }

        private static <T extends VideoOutput> MutableOptionsBundle createInitialBundle(T t) {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT, t);
            return create;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public VideoCaptureConfig<T> getUseCaseConfig() {
            return new VideoCaptureConfig<>(OptionsBundle.from(this.mMutableConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public VideoCapture<T> build() {
            return new VideoCapture<>(getUseCaseConfig());
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder<T> setTargetClass(Class<VideoCapture<T>> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder<T> setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setTargetAspectRatio(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setTargetResolution(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public Builder<T> setBackgroundExecutor(Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setCameraSelector(CameraSelector cameraSelector) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
            return this;
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        public Builder<T> setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            getMutableConfig().insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }
    }
}
