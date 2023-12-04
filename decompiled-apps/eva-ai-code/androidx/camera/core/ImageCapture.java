package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.location.Location;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.ZslControlImpl$$ExternalSyntheticLambda0;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageSaver;
import androidx.camera.core.ProcessingImageReader;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.MutableTagBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.YuvToJpegProcessor;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class ImageCapture extends UseCase {
    public static final int CAPTURE_MODE_MAXIMIZE_QUALITY = 0;
    public static final int CAPTURE_MODE_MINIMIZE_LATENCY = 1;
    public static final int CAPTURE_MODE_ZERO_SHUTTER_LAG = 2;
    private static final int DEFAULT_CAPTURE_MODE = 1;
    private static final int DEFAULT_FLASH_MODE = 2;
    public static final int ERROR_CAMERA_CLOSED = 3;
    public static final int ERROR_CAPTURE_FAILED = 2;
    public static final int ERROR_FILE_IO = 1;
    public static final int ERROR_INVALID_CAMERA = 4;
    public static final int ERROR_UNKNOWN = 0;
    public static final int FLASH_MODE_AUTO = 0;
    public static final int FLASH_MODE_OFF = 2;
    public static final int FLASH_MODE_ON = 1;
    private static final int FLASH_MODE_UNKNOWN = -1;
    public static final int FLASH_TYPE_ONE_SHOT_FLASH = 0;
    public static final int FLASH_TYPE_USE_TORCH_AS_FLASH = 1;
    private static final byte JPEG_QUALITY_MAXIMIZE_QUALITY_MODE = 100;
    private static final byte JPEG_QUALITY_MINIMIZE_LATENCY_MODE = 95;
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "ImageCapture";
    private CaptureBundle mCaptureBundle;
    private CaptureConfig mCaptureConfig;
    private final int mCaptureMode;
    private CaptureProcessor mCaptureProcessor;
    private final ImageReaderProxy.OnImageAvailableListener mClosingListener;
    private Rational mCropAspectRatio;
    private DeferrableSurface mDeferrableSurface;
    private ExecutorService mExecutor;
    private int mFlashMode;
    private final int mFlashType;
    private ImageCaptureRequestProcessor mImageCaptureRequestProcessor;
    SafeCloseImageReaderProxy mImageReader;
    private ListenableFuture<Void> mImageReaderCloseFuture;
    final Executor mIoExecutor;
    private boolean mIsSessionProcessorEnabled;
    private final AtomicReference<Integer> mLockedFlashMode;
    private int mMaxCaptureStages;
    private CameraCaptureCallback mMetadataMatchingCaptureCallback;
    ProcessingImageReader mProcessingImageReader;
    private Matrix mSensorToBufferTransformMatrix;
    final Executor mSequentialIoExecutor;
    SessionConfig.Builder mSessionConfigBuilder;
    private boolean mUseSoftwareJpeg;
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    static final ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = new ExifRotationAvailability();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface CaptureMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface FlashMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface FlashType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ImageCaptureError {
    }

    /* loaded from: classes.dex */
    public static abstract class OnImageCapturedCallback {
        public void onCaptureSuccess(ImageProxy imageProxy) {
        }

        public void onError(ImageCaptureException imageCaptureException) {
        }
    }

    /* loaded from: classes.dex */
    public interface OnImageSavedCallback {
        void onError(ImageCaptureException imageCaptureException);

        void onImageSaved(OutputFileResults outputFileResults);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Void lambda$issueTakePicture$12(List list) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$new$0(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            Log.d(TAG, "Discarding ImageProxy which was inadvertently acquired: " + acquireLatestImage);
            if (acquireLatestImage != null) {
                acquireLatestImage.close();
            }
        } catch (IllegalStateException e) {
            Log.e(TAG, "Failed to acquire latest image.", e);
        }
    }

    ImageCapture(ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        this.mClosingListener = new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                ImageCapture.lambda$new$0(imageReaderProxy);
            }
        };
        this.mLockedFlashMode = new AtomicReference<>(null);
        this.mFlashMode = -1;
        this.mCropAspectRatio = null;
        this.mUseSoftwareJpeg = false;
        this.mIsSessionProcessorEnabled = true;
        this.mImageReaderCloseFuture = Futures.immediateFuture(null);
        this.mSensorToBufferTransformMatrix = new Matrix();
        ImageCaptureConfig imageCaptureConfig2 = (ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig2.containsOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE)) {
            this.mCaptureMode = imageCaptureConfig2.getCaptureMode();
        } else {
            this.mCaptureMode = 1;
        }
        this.mFlashType = imageCaptureConfig2.getFlashType(0);
        Executor executor = (Executor) Preconditions.checkNotNull(imageCaptureConfig2.getIoExecutor(CameraXExecutors.ioExecutor()));
        this.mIoExecutor = executor;
        this.mSequentialIoExecutor = CameraXExecutors.newSequentialExecutor(executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    SessionConfig.Builder createPipeline(final String str, final ImageCaptureConfig imageCaptureConfig, final Size size) {
        CaptureProcessor captureProcessor;
        final YuvToJpegProcessor yuvToJpegProcessor;
        int i;
        YuvToJpegProcessor yuvToJpegProcessor2;
        CaptureProcessor captureProcessor2;
        ImageReaderProxy imageReaderProxy;
        ImageCaptureRequestProcessor imageCaptureRequestProcessor;
        DeferrableSurface deferrableSurface;
        Threads.checkMainThread();
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(imageCaptureConfig);
        if (getCaptureMode() == 2) {
            getCameraControl().addZslConfig(size, createFrom);
        }
        if (imageCaptureConfig.getImageReaderProxyProvider() != null) {
            this.mImageReader = new SafeCloseImageReaderProxy(imageCaptureConfig.getImageReaderProxyProvider().newInstance(size.getWidth(), size.getHeight(), getImageFormat(), 2, 0L));
            this.mMetadataMatchingCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.core.ImageCapture.1
            };
        } else {
            if (this.mIsSessionProcessorEnabled) {
                if (getImageFormat() == 256) {
                    imageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(size.getWidth(), size.getHeight(), getImageFormat(), 2));
                    yuvToJpegProcessor = null;
                } else if (getImageFormat() == 35) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        YuvToJpegProcessor yuvToJpegProcessor3 = new YuvToJpegProcessor(getJpegQualityInternal(), 2);
                        ModifiableImageReaderProxy modifiableImageReaderProxy = new ModifiableImageReaderProxy(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, 2));
                        CaptureBundle singleDefaultCaptureBundle = CaptureBundles.singleDefaultCaptureBundle();
                        ProcessingImageReader build = new ProcessingImageReader.Builder(modifiableImageReaderProxy, singleDefaultCaptureBundle, yuvToJpegProcessor3).setPostProcessExecutor(this.mExecutor).setOutputFormat(256).build();
                        MutableTagBundle create = MutableTagBundle.create();
                        create.putTag(build.getTagBundleKey(), Integer.valueOf(singleDefaultCaptureBundle.getCaptureStages().get(0).getId()));
                        modifiableImageReaderProxy.setImageTagBundle(create);
                        yuvToJpegProcessor = yuvToJpegProcessor3;
                        imageReaderProxy = build;
                    } else {
                        throw new UnsupportedOperationException("Does not support API level < 26");
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported image format:" + getImageFormat());
                }
                this.mMetadataMatchingCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.core.ImageCapture.2
                };
                this.mImageReader = new SafeCloseImageReaderProxy(imageReaderProxy);
            } else {
                CaptureProcessor captureProcessor3 = this.mCaptureProcessor;
                if (captureProcessor3 != null || this.mUseSoftwareJpeg) {
                    int imageFormat = getImageFormat();
                    int imageFormat2 = getImageFormat();
                    if (!this.mUseSoftwareJpeg) {
                        captureProcessor = captureProcessor3;
                        yuvToJpegProcessor = null;
                        i = imageFormat2;
                    } else if (Build.VERSION.SDK_INT >= 26) {
                        Logger.i(TAG, "Using software JPEG encoder.");
                        if (this.mCaptureProcessor != null) {
                            yuvToJpegProcessor2 = new YuvToJpegProcessor(getJpegQualityInternal(), this.mMaxCaptureStages);
                            captureProcessor2 = new CaptureProcessorPipeline(this.mCaptureProcessor, this.mMaxCaptureStages, yuvToJpegProcessor2, this.mExecutor);
                        } else {
                            yuvToJpegProcessor2 = new YuvToJpegProcessor(getJpegQualityInternal(), this.mMaxCaptureStages);
                            captureProcessor2 = yuvToJpegProcessor2;
                        }
                        captureProcessor = captureProcessor2;
                        yuvToJpegProcessor = yuvToJpegProcessor2;
                        i = 256;
                    } else {
                        throw new IllegalStateException("Software JPEG only supported on API 26+");
                    }
                    ProcessingImageReader build2 = new ProcessingImageReader.Builder(size.getWidth(), size.getHeight(), imageFormat, this.mMaxCaptureStages, getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle()), captureProcessor).setPostProcessExecutor(this.mExecutor).setOutputFormat(i).build();
                    this.mProcessingImageReader = build2;
                    this.mMetadataMatchingCaptureCallback = build2.getCameraCaptureCallback();
                    this.mImageReader = new SafeCloseImageReaderProxy(this.mProcessingImageReader);
                } else {
                    MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), getImageFormat(), 2);
                    this.mMetadataMatchingCaptureCallback = metadataImageReader.getCameraCaptureCallback();
                    this.mImageReader = new SafeCloseImageReaderProxy(metadataImageReader);
                }
            }
            imageCaptureRequestProcessor = this.mImageCaptureRequestProcessor;
            if (imageCaptureRequestProcessor != null) {
                imageCaptureRequestProcessor.cancelRequests(new CancellationException("Request is canceled."));
            }
            this.mImageCaptureRequestProcessor = new ImageCaptureRequestProcessor(2, new ImageCaptureRequestProcessor.ImageCaptor() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda6
                @Override // androidx.camera.core.ImageCapture.ImageCaptureRequestProcessor.ImageCaptor
                public final ListenableFuture capture(ImageCapture.ImageCaptureRequest imageCaptureRequest) {
                    return ImageCapture.this.m150lambda$createPipeline$1$androidxcameracoreImageCapture(imageCaptureRequest);
                }
            }, yuvToJpegProcessor != null ? null : new ImageCaptureRequestProcessor.RequestProcessCallback() { // from class: androidx.camera.core.ImageCapture.3
                @Override // androidx.camera.core.ImageCapture.ImageCaptureRequestProcessor.RequestProcessCallback
                public void onPreProcessRequest(ImageCaptureRequest imageCaptureRequest) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        yuvToJpegProcessor.setJpegQuality(imageCaptureRequest.mJpegQuality);
                        yuvToJpegProcessor.setRotationDegrees(imageCaptureRequest.mRotationDegrees);
                    }
                }
            });
            this.mImageReader.setOnImageAvailableListener(this.mClosingListener, CameraXExecutors.mainThreadExecutor());
            deferrableSurface = this.mDeferrableSurface;
            if (deferrableSurface != null) {
                deferrableSurface.close();
            }
            this.mDeferrableSurface = new ImmediateSurface(this.mImageReader.getSurface(), new Size(this.mImageReader.getWidth(), this.mImageReader.getHeight()), this.mImageReader.getImageFormat());
            ProcessingImageReader processingImageReader = this.mProcessingImageReader;
            this.mImageReaderCloseFuture = processingImageReader == null ? processingImageReader.getCloseFuture() : Futures.immediateFuture(null);
            ListenableFuture<Void> terminationFuture = this.mDeferrableSurface.getTerminationFuture();
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mImageReader;
            Objects.requireNonNull(safeCloseImageReaderProxy);
            terminationFuture.addListener(new ZslControlImpl$$ExternalSyntheticLambda0(safeCloseImageReaderProxy), CameraXExecutors.mainThreadExecutor());
            createFrom.addNonRepeatingSurface(this.mDeferrableSurface);
            createFrom.addErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda7
                @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
                public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                    ImageCapture.this.m151lambda$createPipeline$2$androidxcameracoreImageCapture(str, imageCaptureConfig, size, sessionConfig, sessionError);
                }
            });
            return createFrom;
        }
        yuvToJpegProcessor = null;
        imageCaptureRequestProcessor = this.mImageCaptureRequestProcessor;
        if (imageCaptureRequestProcessor != null) {
        }
        this.mImageCaptureRequestProcessor = new ImageCaptureRequestProcessor(2, new ImageCaptureRequestProcessor.ImageCaptor() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda6
            @Override // androidx.camera.core.ImageCapture.ImageCaptureRequestProcessor.ImageCaptor
            public final ListenableFuture capture(ImageCapture.ImageCaptureRequest imageCaptureRequest) {
                return ImageCapture.this.m150lambda$createPipeline$1$androidxcameracoreImageCapture(imageCaptureRequest);
            }
        }, yuvToJpegProcessor != null ? null : new ImageCaptureRequestProcessor.RequestProcessCallback() { // from class: androidx.camera.core.ImageCapture.3
            @Override // androidx.camera.core.ImageCapture.ImageCaptureRequestProcessor.RequestProcessCallback
            public void onPreProcessRequest(ImageCaptureRequest imageCaptureRequest) {
                if (Build.VERSION.SDK_INT >= 26) {
                    yuvToJpegProcessor.setJpegQuality(imageCaptureRequest.mJpegQuality);
                    yuvToJpegProcessor.setRotationDegrees(imageCaptureRequest.mRotationDegrees);
                }
            }
        });
        this.mImageReader.setOnImageAvailableListener(this.mClosingListener, CameraXExecutors.mainThreadExecutor());
        deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
        }
        this.mDeferrableSurface = new ImmediateSurface(this.mImageReader.getSurface(), new Size(this.mImageReader.getWidth(), this.mImageReader.getHeight()), this.mImageReader.getImageFormat());
        ProcessingImageReader processingImageReader2 = this.mProcessingImageReader;
        this.mImageReaderCloseFuture = processingImageReader2 == null ? processingImageReader2.getCloseFuture() : Futures.immediateFuture(null);
        ListenableFuture<Void> terminationFuture2 = this.mDeferrableSurface.getTerminationFuture();
        SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = this.mImageReader;
        Objects.requireNonNull(safeCloseImageReaderProxy2);
        terminationFuture2.addListener(new ZslControlImpl$$ExternalSyntheticLambda0(safeCloseImageReaderProxy2), CameraXExecutors.mainThreadExecutor());
        createFrom.addNonRepeatingSurface(this.mDeferrableSurface);
        createFrom.addErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda7
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                ImageCapture.this.m151lambda$createPipeline$2$androidxcameracoreImageCapture(str, imageCaptureConfig, size, sessionConfig, sessionError);
            }
        });
        return createFrom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$createPipeline$2$androidx-camera-core-ImageCapture  reason: not valid java name */
    public /* synthetic */ void m151lambda$createPipeline$2$androidxcameracoreImageCapture(String str, ImageCaptureConfig imageCaptureConfig, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        clearPipeline();
        if (isCurrentCamera(str)) {
            SessionConfig.Builder createPipeline = createPipeline(str, imageCaptureConfig, size);
            this.mSessionConfigBuilder = createPipeline;
            updateSessionConfig(createPipeline.build());
            notifyReset();
        }
    }

    void clearPipeline() {
        Threads.checkMainThread();
        ImageCaptureRequestProcessor imageCaptureRequestProcessor = this.mImageCaptureRequestProcessor;
        if (imageCaptureRequestProcessor != null) {
            imageCaptureRequestProcessor.cancelRequests(new CancellationException("Request is canceled."));
            this.mImageCaptureRequestProcessor = null;
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        this.mDeferrableSurface = null;
        this.mImageReader = null;
        this.mProcessingImageReader = null;
        this.mImageReaderCloseFuture = Futures.immediateFuture(null);
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE, getCaptureMode());
        if (z) {
            config = Config.CC.mergeConfigs(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.UseCaseConfig] */
    /* JADX WARN: Type inference failed for: r8v25, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    protected UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        if (builder.getUseCaseConfig().retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, null) != null && Build.VERSION.SDK_INT >= 29) {
            Logger.i(TAG, "Requesting software JPEG due to a CaptureProcessor is set.");
            builder.getMutableConfig().insertOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, true);
        } else if (cameraInfoInternal.getCameraQuirks().contains(SoftwareJpegEncodingPreferredQuirk.class)) {
            if (!((Boolean) builder.getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, true)).booleanValue()) {
                Logger.w(TAG, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                Logger.i(TAG, "Requesting software JPEG due to device quirk.");
                builder.getMutableConfig().insertOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, true);
            }
        }
        boolean enforceSoftwareJpegConstraints = enforceSoftwareJpegConstraints(builder.getMutableConfig());
        Integer num = (Integer) builder.getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        if (num != null) {
            Preconditions.checkArgument(builder.getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, Integer.valueOf(enforceSoftwareJpegConstraints ? 35 : num.intValue()));
        } else if (builder.getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, null) != null || enforceSoftwareJpegConstraints) {
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
        } else {
            List list = (List) builder.getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
            if (list == null) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            } else if (isImageFormatSupported(list, 256)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            } else if (isImageFormatSupported(list, 35)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
            }
        }
        Preconditions.checkArgument(((Integer) builder.getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_MAX_CAPTURE_STAGES, 2)).intValue() >= 1, "Maximum outstanding image count must be at least 1");
        return builder.getUseCaseConfig();
    }

    private static boolean isImageFormatSupported(List<Pair<Integer, Size[]>> list, int i) {
        if (list == null) {
            return false;
        }
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.UseCase
    protected void onCameraControlReady() {
        trySetFlashModeToCameraControl();
    }

    public int getFlashMode() {
        int i;
        synchronized (this.mLockedFlashMode) {
            i = this.mFlashMode;
            if (i == -1) {
                i = ((ImageCaptureConfig) getCurrentConfig()).getFlashMode(2);
            }
        }
        return i;
    }

    public void setFlashMode(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Invalid flash mode: " + i);
        }
        synchronized (this.mLockedFlashMode) {
            this.mFlashMode = i;
            trySetFlashModeToCameraControl();
        }
    }

    public void setCropAspectRatio(Rational rational) {
        this.mCropAspectRatio = rational;
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    public void setTargetRotation(int i) {
        int targetRotation = getTargetRotation();
        if (!setTargetRotationInternal(i) || this.mCropAspectRatio == null) {
            return;
        }
        this.mCropAspectRatio = ImageUtil.getRotatedAspectRatio(Math.abs(CameraOrientationUtil.surfaceRotationToDegrees(i) - CameraOrientationUtil.surfaceRotationToDegrees(targetRotation)), this.mCropAspectRatio);
    }

    public int getCaptureMode() {
        return this.mCaptureMode;
    }

    public int getJpegQuality() {
        return getJpegQualityInternal();
    }

    @Override // androidx.camera.core.UseCase
    public ResolutionInfo getResolutionInfo() {
        return super.getResolutionInfo();
    }

    @Override // androidx.camera.core.UseCase
    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        this.mSensorToBufferTransformMatrix = matrix;
    }

    @Override // androidx.camera.core.UseCase
    protected ResolutionInfo getResolutionInfoInternal() {
        CameraInternal camera = getCamera();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera == null || attachedSurfaceResolution == null) {
            return null;
        }
        Rect viewPortCropRect = getViewPortCropRect();
        Rational rational = this.mCropAspectRatio;
        if (viewPortCropRect == null) {
            if (rational != null) {
                viewPortCropRect = ImageUtil.computeCropRectFromAspectRatio(attachedSurfaceResolution, rational);
            } else {
                viewPortCropRect = new Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
            }
        }
        return ResolutionInfo.create(attachedSurfaceResolution, viewPortCropRect, getRelativeRotation(camera));
    }

    /* renamed from: takePicture */
    public void m153lambda$takePicture$3$androidxcameracoreImageCapture(final Executor executor, final OnImageCapturedCallback onImageCapturedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    ImageCapture.this.m153lambda$takePicture$3$androidxcameracoreImageCapture(executor, onImageCapturedCallback);
                }
            });
        } else {
            sendImageCaptureRequest(executor, onImageCapturedCallback, false);
        }
    }

    /* renamed from: takePicture */
    public void m154lambda$takePicture$4$androidxcameracoreImageCapture(final OutputFileOptions outputFileOptions, final Executor executor, final OnImageSavedCallback onImageSavedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    ImageCapture.this.m154lambda$takePicture$4$androidxcameracoreImageCapture(outputFileOptions, executor, onImageSavedCallback);
                }
            });
            return;
        }
        final ImageSaver.OnImageSavedCallback onImageSavedCallback2 = new ImageSaver.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCapture.4
            @Override // androidx.camera.core.ImageSaver.OnImageSavedCallback
            public void onImageSaved(OutputFileResults outputFileResults) {
                onImageSavedCallback.onImageSaved(outputFileResults);
            }

            @Override // androidx.camera.core.ImageSaver.OnImageSavedCallback
            public void onError(ImageSaver.SaveError saveError, String str, Throwable th) {
                onImageSavedCallback.onError(new ImageCaptureException(AnonymousClass8.$SwitchMap$androidx$camera$core$ImageSaver$SaveError[saveError.ordinal()] != 1 ? 0 : 1, str, th));
            }
        };
        final int jpegQualityInternal = getJpegQualityInternal();
        sendImageCaptureRequest(CameraXExecutors.mainThreadExecutor(), new OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCapture.5
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy imageProxy) {
                ImageCapture.this.mIoExecutor.execute(new ImageSaver(imageProxy, outputFileOptions, imageProxy.getImageInfo().getRotationDegrees(), jpegQualityInternal, executor, ImageCapture.this.mSequentialIoExecutor, onImageSavedCallback2));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(ImageCaptureException imageCaptureException) {
                onImageSavedCallback.onError(imageCaptureException);
            }
        }, true);
    }

    /* renamed from: androidx.camera.core.ImageCapture$8  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$ImageSaver$SaveError;

        static {
            int[] iArr = new int[ImageSaver.SaveError.values().length];
            $SwitchMap$androidx$camera$core$ImageSaver$SaveError = iArr;
            try {
                iArr[ImageSaver.SaveError.FILE_IO_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static Rect computeDispatchCropRect(Rect rect, Rational rational, int i, Size size, int i2) {
        if (rect != null) {
            return ImageUtil.computeCropRectFromDispatchInfo(rect, i, size, i2);
        }
        if (rational != null) {
            if (i2 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (ImageUtil.isAspectRatioValid(size, rational)) {
                return ImageUtil.computeCropRectFromAspectRatio(size, rational);
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    @Override // androidx.camera.core.UseCase
    public void onStateDetached() {
        abortImageCaptureRequests();
    }

    private void abortImageCaptureRequests() {
        if (this.mImageCaptureRequestProcessor != null) {
            this.mImageCaptureRequestProcessor.cancelRequests(new CameraClosedException("Camera is closed."));
        }
    }

    private void sendImageCaptureRequest(Executor executor, final OnImageCapturedCallback onImageCapturedCallback, boolean z) {
        CameraInternal camera = getCamera();
        if (camera == null) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ImageCapture.this.m152x1bb57f01(onImageCapturedCallback);
                }
            });
            return;
        }
        ImageCaptureRequestProcessor imageCaptureRequestProcessor = this.mImageCaptureRequestProcessor;
        if (imageCaptureRequestProcessor == null) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    ImageCapture.OnImageCapturedCallback.this.onError(new ImageCaptureException(0, "Request is canceled", null));
                }
            });
        } else {
            imageCaptureRequestProcessor.sendRequest(new ImageCaptureRequest(getRelativeRotation(camera), getJpegQualityForImageCaptureRequest(camera, z), this.mCropAspectRatio, getViewPortCropRect(), this.mSensorToBufferTransformMatrix, executor, onImageCapturedCallback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$sendImageCaptureRequest$5$androidx-camera-core-ImageCapture  reason: not valid java name */
    public /* synthetic */ void m152x1bb57f01(OnImageCapturedCallback onImageCapturedCallback) {
        onImageCapturedCallback.onError(new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null));
    }

    private int getJpegQualityForImageCaptureRequest(CameraInternal cameraInternal, boolean z) {
        if (z) {
            int relativeRotation = getRelativeRotation(cameraInternal);
            Size attachedSurfaceResolution = getAttachedSurfaceResolution();
            Rect computeDispatchCropRect = computeDispatchCropRect(getViewPortCropRect(), this.mCropAspectRatio, relativeRotation, attachedSurfaceResolution, relativeRotation);
            if (ImageUtil.shouldCropImage(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight(), computeDispatchCropRect.width(), computeDispatchCropRect.height())) {
                return this.mCaptureMode == 0 ? 100 : 95;
            }
            return getJpegQualityInternal();
        }
        return getJpegQualityInternal();
    }

    private void lockFlashMode() {
        synchronized (this.mLockedFlashMode) {
            if (this.mLockedFlashMode.get() != null) {
                return;
            }
            this.mLockedFlashMode.set(Integer.valueOf(getFlashMode()));
        }
    }

    void unlockFlashMode() {
        synchronized (this.mLockedFlashMode) {
            Integer andSet = this.mLockedFlashMode.getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (andSet.intValue() != getFlashMode()) {
                trySetFlashModeToCameraControl();
            }
        }
    }

    private void trySetFlashModeToCameraControl() {
        synchronized (this.mLockedFlashMode) {
            if (this.mLockedFlashMode.get() != null) {
                return;
            }
            getCameraControl().setFlashMode(getFlashMode());
        }
    }

    private int getJpegQualityInternal() {
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig.containsOption(ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY)) {
            return imageCaptureConfig.getJpegQuality();
        }
        int i = this.mCaptureMode;
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 95;
            }
            throw new IllegalStateException("CaptureMode " + this.mCaptureMode + " is invalid");
        }
        return 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: takePictureInternal */
    public ListenableFuture<ImageProxy> m150lambda$createPipeline$1$androidxcameracoreImageCapture(final ImageCaptureRequest imageCaptureRequest) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda8
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ImageCapture.this.m155lambda$takePictureInternal$9$androidxcameracoreImageCapture(imageCaptureRequest, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$takePictureInternal$9$androidx-camera-core-ImageCapture  reason: not valid java name */
    public /* synthetic */ Object m155lambda$takePictureInternal$9$androidxcameracoreImageCapture(ImageCaptureRequest imageCaptureRequest, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda12
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                ImageCapture.lambda$takePictureInternal$7(CallbackToFutureAdapter.Completer.this, imageReaderProxy);
            }
        }, CameraXExecutors.mainThreadExecutor());
        lockFlashMode();
        final ListenableFuture<Void> issueTakePicture = issueTakePicture(imageCaptureRequest);
        Futures.addCallback(issueTakePicture, new FutureCallback<Void>() { // from class: androidx.camera.core.ImageCapture.6
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r1) {
                ImageCapture.this.unlockFlashMode();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                ImageCapture.this.unlockFlashMode();
                completer.setException(th);
            }
        }, this.mExecutor);
        completer.addCancellationListener(new Runnable() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFuture.this.cancel(true);
            }
        }, CameraXExecutors.directExecutor());
        return "takePictureInternal";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$takePictureInternal$7(CallbackToFutureAdapter.Completer completer, ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                if (!completer.set(acquireLatestImage)) {
                    acquireLatestImage.close();
                }
            } else {
                completer.setException(new IllegalStateException("Unable to acquire image"));
            }
        } catch (IllegalStateException e) {
            completer.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ImageCaptureRequestProcessor implements ForwardingImageProxy.OnImageCloseListener {
        ImageCaptureRequest mCurrentRequest;
        ListenableFuture<ImageProxy> mCurrentRequestFuture;
        private final ImageCaptor mImageCaptor;
        final Object mLock;
        private final int mMaxImages;
        int mOutstandingImages;
        private final Deque<ImageCaptureRequest> mPendingRequests;
        private final RequestProcessCallback mRequestProcessCallback;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface ImageCaptor {
            ListenableFuture<ImageProxy> capture(ImageCaptureRequest imageCaptureRequest);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface RequestProcessCallback {
            void onPreProcessRequest(ImageCaptureRequest imageCaptureRequest);
        }

        ImageCaptureRequestProcessor(int i, ImageCaptor imageCaptor) {
            this(i, imageCaptor, null);
        }

        ImageCaptureRequestProcessor(int i, ImageCaptor imageCaptor, RequestProcessCallback requestProcessCallback) {
            this.mPendingRequests = new ArrayDeque();
            this.mCurrentRequest = null;
            this.mCurrentRequestFuture = null;
            this.mOutstandingImages = 0;
            this.mLock = new Object();
            this.mMaxImages = i;
            this.mImageCaptor = imageCaptor;
            this.mRequestProcessCallback = requestProcessCallback;
        }

        public void sendRequest(ImageCaptureRequest imageCaptureRequest) {
            synchronized (this.mLock) {
                this.mPendingRequests.offer(imageCaptureRequest);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(this.mCurrentRequest != null ? 1 : 0);
                objArr[1] = Integer.valueOf(this.mPendingRequests.size());
                Logger.d(ImageCapture.TAG, String.format(locale, "Send image capture request [current, pending] = [%d, %d]", objArr));
                processNextRequest();
            }
        }

        public void cancelRequests(Throwable th) {
            ImageCaptureRequest imageCaptureRequest;
            ListenableFuture<ImageProxy> listenableFuture;
            ArrayList<ImageCaptureRequest> arrayList;
            synchronized (this.mLock) {
                imageCaptureRequest = this.mCurrentRequest;
                this.mCurrentRequest = null;
                listenableFuture = this.mCurrentRequestFuture;
                this.mCurrentRequestFuture = null;
                arrayList = new ArrayList(this.mPendingRequests);
                this.mPendingRequests.clear();
            }
            if (imageCaptureRequest != null && listenableFuture != null) {
                imageCaptureRequest.notifyCallbackError(ImageCapture.getError(th), th.getMessage(), th);
                listenableFuture.cancel(true);
            }
            for (ImageCaptureRequest imageCaptureRequest2 : arrayList) {
                imageCaptureRequest2.notifyCallbackError(ImageCapture.getError(th), th.getMessage(), th);
            }
        }

        @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
        public void onImageClose(ImageProxy imageProxy) {
            synchronized (this.mLock) {
                this.mOutstandingImages--;
                processNextRequest();
            }
        }

        void processNextRequest() {
            synchronized (this.mLock) {
                if (this.mCurrentRequest != null) {
                    return;
                }
                if (this.mOutstandingImages >= this.mMaxImages) {
                    Logger.w(ImageCapture.TAG, "Too many acquire images. Close image to be able to process next.");
                    return;
                }
                final ImageCaptureRequest poll = this.mPendingRequests.poll();
                if (poll == null) {
                    return;
                }
                this.mCurrentRequest = poll;
                RequestProcessCallback requestProcessCallback = this.mRequestProcessCallback;
                if (requestProcessCallback != null) {
                    requestProcessCallback.onPreProcessRequest(poll);
                }
                ListenableFuture<ImageProxy> capture = this.mImageCaptor.capture(poll);
                this.mCurrentRequestFuture = capture;
                Futures.addCallback(capture, new FutureCallback<ImageProxy>() { // from class: androidx.camera.core.ImageCapture.ImageCaptureRequestProcessor.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(ImageProxy imageProxy) {
                        synchronized (ImageCaptureRequestProcessor.this.mLock) {
                            Preconditions.checkNotNull(imageProxy);
                            SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxy);
                            singleCloseImageProxy.addOnImageCloseListener(ImageCaptureRequestProcessor.this);
                            ImageCaptureRequestProcessor.this.mOutstandingImages++;
                            poll.dispatchImage(singleCloseImageProxy);
                            ImageCaptureRequestProcessor.this.mCurrentRequest = null;
                            ImageCaptureRequestProcessor.this.mCurrentRequestFuture = null;
                            ImageCaptureRequestProcessor.this.processNextRequest();
                        }
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(Throwable th) {
                        synchronized (ImageCaptureRequestProcessor.this.mLock) {
                            if (!(th instanceof CancellationException)) {
                                poll.notifyCallbackError(ImageCapture.getError(th), th != null ? th.getMessage() : "Unknown error", th);
                            }
                            ImageCaptureRequestProcessor.this.mCurrentRequest = null;
                            ImageCaptureRequestProcessor.this.mCurrentRequestFuture = null;
                            ImageCaptureRequestProcessor.this.processNextRequest();
                        }
                    }
                }, CameraXExecutors.directExecutor());
            }
        }
    }

    public String toString() {
        return "ImageCapture:" + getName();
    }

    static int getError(Throwable th) {
        if (th instanceof CameraClosedException) {
            return 3;
        }
        if (th instanceof ImageCaptureException) {
            return ((ImageCaptureException) th).getImageCaptureError();
        }
        return 0;
    }

    static boolean enforceSoftwareJpegConstraints(MutableConfig mutableConfig) {
        boolean z;
        boolean z2 = false;
        if (((Boolean) mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, false)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 26) {
                Logger.w(TAG, "Software JPEG only supported on API 26+, but current API level is " + Build.VERSION.SDK_INT);
                z = false;
            } else {
                z = true;
            }
            Integer num = (Integer) mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num == null || num.intValue() == 256) {
                z2 = z;
            } else {
                Logger.w(TAG, "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z2) {
                Logger.w(TAG, "Unable to support software JPEG. Disabling.");
                mutableConfig.insertOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, false);
            }
        }
        return z2;
    }

    @Override // androidx.camera.core.UseCase
    public void onDetached() {
        ListenableFuture<Void> listenableFuture = this.mImageReaderCloseFuture;
        abortImageCaptureRequests();
        clearPipeline();
        this.mUseSoftwareJpeg = false;
        final ExecutorService executorService = this.mExecutor;
        listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                executorService.shutdown();
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.UseCase
    public void onAttached() {
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) getCurrentConfig();
        this.mCaptureConfig = CaptureConfig.Builder.createFrom(imageCaptureConfig).build();
        this.mCaptureProcessor = imageCaptureConfig.getCaptureProcessor(null);
        this.mMaxCaptureStages = imageCaptureConfig.getMaxCaptureStages(2);
        this.mCaptureBundle = imageCaptureConfig.getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
        this.mUseSoftwareJpeg = imageCaptureConfig.isSoftwareJpegEncoderRequested();
        this.mIsSessionProcessorEnabled = imageCaptureConfig.isSessionProcessorEnabled();
        Preconditions.checkNotNull(getCamera(), "Attached camera cannot be null");
        this.mExecutor = Executors.newFixedThreadPool(1, new ThreadFactory() { // from class: androidx.camera.core.ImageCapture.7
            private final AtomicInteger mId = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "CameraX-image_capture_" + this.mId.getAndIncrement());
            }
        });
    }

    @Override // androidx.camera.core.UseCase
    protected Size onSuggestedResolutionUpdated(Size size) {
        SessionConfig.Builder createPipeline = createPipeline(getCameraId(), (ImageCaptureConfig) getCurrentConfig(), size);
        this.mSessionConfigBuilder = createPipeline;
        updateSessionConfig(createPipeline.build());
        notifyActive();
        return size;
    }

    ListenableFuture<Void> issueTakePicture(final ImageCaptureRequest imageCaptureRequest) {
        CaptureBundle captureBundle;
        String str;
        Logger.d(TAG, "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        if (this.mProcessingImageReader != null) {
            captureBundle = getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
            if (captureBundle == null) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (this.mCaptureProcessor == null && captureBundle.getCaptureStages().size() > 1) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
            }
            if (captureBundle.getCaptureStages().size() > this.mMaxCaptureStages) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.mProcessingImageReader.setCaptureBundle(captureBundle);
            this.mProcessingImageReader.setOnProcessingErrorCallback(CameraXExecutors.directExecutor(), new ProcessingImageReader.OnProcessingErrorCallback() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda9
                @Override // androidx.camera.core.ProcessingImageReader.OnProcessingErrorCallback
                public final void notifyProcessingError(String str2, Throwable th) {
                    ImageCapture.lambda$issueTakePicture$11(ImageCapture.ImageCaptureRequest.this, str2, th);
                }
            });
            str = this.mProcessingImageReader.getTagBundleKey();
        } else {
            captureBundle = getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
            if (captureBundle.getCaptureStages().size() > 1) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
            str = null;
        }
        for (CaptureStage captureStage : captureBundle.getCaptureStages()) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mCaptureConfig.getTemplateType());
            builder.addImplementationOptions(this.mCaptureConfig.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(this.mSessionConfigBuilder.getSingleCameraCaptureCallbacks());
            builder.addSurface(this.mDeferrableSurface);
            if (getImageFormat() == 256) {
                if (EXIF_ROTATION_AVAILABILITY.isRotationOptionSupported()) {
                    builder.addImplementationOption(CaptureConfig.OPTION_ROTATION, Integer.valueOf(imageCaptureRequest.mRotationDegrees));
                }
                builder.addImplementationOption(CaptureConfig.OPTION_JPEG_QUALITY, Integer.valueOf(imageCaptureRequest.mJpegQuality));
            }
            builder.addImplementationOptions(captureStage.getCaptureConfig().getImplementationOptions());
            if (str != null) {
                builder.addTag(str, Integer.valueOf(captureStage.getId()));
            }
            builder.addCameraCaptureCallback(this.mMetadataMatchingCaptureCallback);
            arrayList.add(builder.build());
        }
        return Futures.transform(getCameraControl().submitStillCaptureRequests(arrayList, this.mCaptureMode, this.mFlashType), new Function() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda10
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ImageCapture.lambda$issueTakePicture$12((List) obj);
            }
        }, CameraXExecutors.directExecutor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$issueTakePicture$11(ImageCaptureRequest imageCaptureRequest, String str, Throwable th) {
        Logger.e(TAG, "Processing image failed! " + str);
        imageCaptureRequest.notifyCallbackError(2, str, th);
    }

    private CaptureBundle getCaptureBundle(CaptureBundle captureBundle) {
        List<CaptureStage> captureStages = this.mCaptureBundle.getCaptureStages();
        return (captureStages == null || captureStages.isEmpty()) ? captureBundle : CaptureBundles.createCaptureBundle(captureStages);
    }

    /* loaded from: classes.dex */
    public static final class Defaults implements ConfigProvider<ImageCaptureConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final ImageCaptureConfig DEFAULT_CONFIG = new Builder().setSurfaceOccupancyPriority(4).setTargetAspectRatio(0).getUseCaseConfig();
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 4;

        @Override // androidx.camera.core.impl.ConfigProvider
        public ImageCaptureConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    /* loaded from: classes.dex */
    public static final class OutputFileOptions {
        private final ContentResolver mContentResolver;
        private final ContentValues mContentValues;
        private final File mFile;
        private final Metadata mMetadata;
        private final OutputStream mOutputStream;
        private final Uri mSaveCollection;

        OutputFileOptions(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, Metadata metadata) {
            this.mFile = file;
            this.mContentResolver = contentResolver;
            this.mSaveCollection = uri;
            this.mContentValues = contentValues;
            this.mOutputStream = outputStream;
            this.mMetadata = metadata == null ? new Metadata() : metadata;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public File getFile() {
            return this.mFile;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ContentResolver getContentResolver() {
            return this.mContentResolver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Uri getSaveCollection() {
            return this.mSaveCollection;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ContentValues getContentValues() {
            return this.mContentValues;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OutputStream getOutputStream() {
            return this.mOutputStream;
        }

        public Metadata getMetadata() {
            return this.mMetadata;
        }

        /* loaded from: classes.dex */
        public static final class Builder {
            private ContentResolver mContentResolver;
            private ContentValues mContentValues;
            private File mFile;
            private Metadata mMetadata;
            private OutputStream mOutputStream;
            private Uri mSaveCollection;

            public Builder(File file) {
                this.mFile = file;
            }

            public Builder(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
                this.mContentResolver = contentResolver;
                this.mSaveCollection = uri;
                this.mContentValues = contentValues;
            }

            public Builder(OutputStream outputStream) {
                this.mOutputStream = outputStream;
            }

            public Builder setMetadata(Metadata metadata) {
                this.mMetadata = metadata;
                return this;
            }

            public OutputFileOptions build() {
                return new OutputFileOptions(this.mFile, this.mContentResolver, this.mSaveCollection, this.mContentValues, this.mOutputStream, this.mMetadata);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class OutputFileResults {
        private Uri mSavedUri;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OutputFileResults(Uri uri) {
            this.mSavedUri = uri;
        }

        public Uri getSavedUri() {
            return this.mSavedUri;
        }
    }

    /* loaded from: classes.dex */
    public static final class Metadata {
        private boolean mIsReversedHorizontal;
        private boolean mIsReversedHorizontalSet = false;
        private boolean mIsReversedVertical;
        private Location mLocation;

        public boolean isReversedHorizontal() {
            return this.mIsReversedHorizontal;
        }

        public boolean isReversedHorizontalSet() {
            return this.mIsReversedHorizontalSet;
        }

        public void setReversedHorizontal(boolean z) {
            this.mIsReversedHorizontal = z;
            this.mIsReversedHorizontalSet = true;
        }

        public boolean isReversedVertical() {
            return this.mIsReversedVertical;
        }

        public void setReversedVertical(boolean z) {
            this.mIsReversedVertical = z;
        }

        public Location getLocation() {
            return this.mLocation;
        }

        public void setLocation(Location location) {
            this.mLocation = location;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ImageCaptureRequest {
        private final OnImageCapturedCallback mCallback;
        AtomicBoolean mDispatched = new AtomicBoolean(false);
        final int mJpegQuality;
        private final Executor mListenerExecutor;
        final int mRotationDegrees;
        private final Matrix mSensorToBufferTransformMatrix;
        private final Rational mTargetRatio;
        private final Rect mViewPortCropRect;

        ImageCaptureRequest(int i, int i2, Rational rational, Rect rect, Matrix matrix, Executor executor, OnImageCapturedCallback onImageCapturedCallback) {
            this.mRotationDegrees = i;
            this.mJpegQuality = i2;
            if (rational != null) {
                Preconditions.checkArgument(!rational.isZero(), "Target ratio cannot be zero");
                Preconditions.checkArgument(rational.floatValue() > 0.0f, "Target ratio must be positive");
            }
            this.mTargetRatio = rational;
            this.mViewPortCropRect = rect;
            this.mSensorToBufferTransformMatrix = matrix;
            this.mListenerExecutor = executor;
            this.mCallback = onImageCapturedCallback;
        }

        void dispatchImage(ImageProxy imageProxy) {
            Size size;
            int rotation;
            if (!this.mDispatched.compareAndSet(false, true)) {
                imageProxy.close();
                return;
            }
            if (ImageCapture.EXIF_ROTATION_AVAILABILITY.shouldUseExifOrientation(imageProxy)) {
                try {
                    ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
                    buffer.rewind();
                    byte[] bArr = new byte[buffer.capacity()];
                    buffer.get(bArr);
                    Exif createFromInputStream = Exif.createFromInputStream(new ByteArrayInputStream(bArr));
                    buffer.rewind();
                    size = new Size(createFromInputStream.getWidth(), createFromInputStream.getHeight());
                    rotation = createFromInputStream.getRotation();
                } catch (IOException e) {
                    notifyCallbackError(1, "Unable to parse JPEG exif", e);
                    imageProxy.close();
                    return;
                }
            } else {
                size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
                rotation = this.mRotationDegrees;
            }
            final SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy, size, ImmutableImageInfo.create(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), rotation, this.mSensorToBufferTransformMatrix));
            settableImageProxy.setCropRect(ImageCapture.computeDispatchCropRect(this.mViewPortCropRect, this.mTargetRatio, this.mRotationDegrees, size, rotation));
            try {
                this.mListenerExecutor.execute(new Runnable() { // from class: androidx.camera.core.ImageCapture$ImageCaptureRequest$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageCapture.ImageCaptureRequest.this.m156xf35699e1(settableImageProxy);
                    }
                });
            } catch (RejectedExecutionException unused) {
                Logger.e(ImageCapture.TAG, "Unable to post to the supplied executor.");
                imageProxy.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$dispatchImage$0$androidx-camera-core-ImageCapture$ImageCaptureRequest  reason: not valid java name */
        public /* synthetic */ void m156xf35699e1(ImageProxy imageProxy) {
            this.mCallback.onCaptureSuccess(imageProxy);
        }

        void notifyCallbackError(final int i, final String str, final Throwable th) {
            if (this.mDispatched.compareAndSet(false, true)) {
                try {
                    this.mListenerExecutor.execute(new Runnable() { // from class: androidx.camera.core.ImageCapture$ImageCaptureRequest$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ImageCapture.ImageCaptureRequest.this.m157xe8eba4db(i, str, th);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    Logger.e(ImageCapture.TAG, "Unable to post to the supplied executor.");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$notifyCallbackError$1$androidx-camera-core-ImageCapture$ImageCaptureRequest  reason: not valid java name */
        public /* synthetic */ void m157xe8eba4db(int i, String str, Throwable th) {
            this.mCallback.onError(new ImageCaptureException(i, str, th));
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder implements UseCaseConfig.Builder<ImageCapture, ImageCaptureConfig, Builder>, ImageOutputConfig.Builder<Builder>, IoConfig.Builder<Builder> {
        private final MutableOptionsBundle mMutableConfig;

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setSupportedResolutions(List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            return setTargetClass((Class<ImageCapture>) cls);
        }

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(ImageCapture.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            setTargetClass(ImageCapture.class);
        }

        public static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        static Builder fromConfig(ImageCaptureConfig imageCaptureConfig) {
            return new Builder(MutableOptionsBundle.from((Config) imageCaptureConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public ImageCaptureConfig getUseCaseConfig() {
            return new ImageCaptureConfig(OptionsBundle.from(this.mMutableConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public ImageCapture build() {
            int intValue;
            if (getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_TARGET_ASPECT_RATIO, null) != null && getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_TARGET_RESOLUTION, null) != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
            Integer num = (Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num != null) {
                Preconditions.checkArgument(getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, num);
            } else if (getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, null) != null) {
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
            } else {
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            }
            ImageCapture imageCapture = new ImageCapture(getUseCaseConfig());
            Size size = (Size) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_TARGET_RESOLUTION, null);
            if (size != null) {
                imageCapture.setCropAspectRatio(new Rational(size.getWidth(), size.getHeight()));
            }
            Preconditions.checkArgument(((Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_MAX_CAPTURE_STAGES, 2)).intValue() >= 1, "Maximum outstanding image count must be at least 1");
            Preconditions.checkNotNull((Executor) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_IO_EXECUTOR, CameraXExecutors.ioExecutor()), "The IO executor can't be null");
            if (!getMutableConfig().containsOption(ImageCaptureConfig.OPTION_FLASH_MODE) || (intValue = ((Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_FLASH_MODE)).intValue()) == 0 || intValue == 1 || intValue == 2) {
                return imageCapture;
            }
            throw new IllegalArgumentException("The flash mode is not allowed to set: " + intValue);
        }

        public Builder setCaptureMode(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE, Integer.valueOf(i));
            return this;
        }

        public Builder setFlashMode(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_FLASH_MODE, Integer.valueOf(i));
            return this;
        }

        public Builder setCaptureBundle(CaptureBundle captureBundle) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_CAPTURE_BUNDLE, captureBundle);
            return this;
        }

        public Builder setCaptureProcessor(CaptureProcessor captureProcessor) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, captureProcessor);
            return this;
        }

        public Builder setBufferFormat(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, Integer.valueOf(i));
            return this;
        }

        public Builder setSessionProcessorEnabled(boolean z) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_SESSION_PROCESSOR_ENABLED, Boolean.valueOf(z));
            return this;
        }

        public Builder setMaxCaptureStages(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_MAX_CAPTURE_STAGES, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder setTargetClass(Class<ImageCapture> cls) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setTargetAspectRatio(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_TARGET_RESOLUTION, size);
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
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        public Builder setImageReaderProxyProvider(ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        public Builder setSoftwareJpegEncoderRequested(boolean z) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, Boolean.valueOf(z));
            return this;
        }

        public Builder setFlashType(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_FLASH_TYPE, Integer.valueOf(i));
            return this;
        }

        public Builder setJpegQuality(int i) {
            Preconditions.checkArgumentInRange(i, 1, 100, "jpegQuality");
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.IoConfig.Builder
        public Builder setIoExecutor(Executor executor) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IO_EXECUTOR, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setCameraSelector(CameraSelector cameraSelector) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        public Builder setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }
    }
}
