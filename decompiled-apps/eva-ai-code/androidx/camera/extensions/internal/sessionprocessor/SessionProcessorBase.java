package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
abstract class SessionProcessorBase implements SessionProcessor {
    private static final String TAG = "SessionProcessorBase";
    private String mCameraId;
    private HandlerThread mImageReaderHandlerThread;
    private Map<Integer, ImageReader> mImageReaderMap = new HashMap();
    private List<DeferrableSurface> mSurfacesList = new ArrayList();
    private final Object mLock = new Object();

    protected abstract void deInitSessionInternal();

    protected abstract Camera2SessionConfig initSessionInternal(String str, Map<String, CameraCharacteristics> map, OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3);

    @Override // androidx.camera.core.impl.SessionProcessor
    public final SessionConfig initSession(CameraInfo cameraInfo, OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3) {
        Camera2CameraInfo from = Camera2CameraInfo.from(cameraInfo);
        Camera2SessionConfig initSessionInternal = initSessionInternal(from.getCameraId(), from.getCameraCharacteristicsMap(), outputSurface, outputSurface2, outputSurface3);
        synchronized (this.mLock) {
            for (Camera2OutputConfig camera2OutputConfig : initSessionInternal.getOutputConfigs()) {
                if (camera2OutputConfig instanceof SurfaceOutputConfig) {
                    this.mSurfacesList.add(new SessionProcessorSurface(((SurfaceOutputConfig) camera2OutputConfig).getSurface(), camera2OutputConfig.getId()));
                } else if (camera2OutputConfig instanceof ImageReaderOutputConfig) {
                    ImageReaderOutputConfig imageReaderOutputConfig = (ImageReaderOutputConfig) camera2OutputConfig;
                    final ImageReader newInstance = ImageReader.newInstance(imageReaderOutputConfig.getSize().getWidth(), imageReaderOutputConfig.getSize().getHeight(), imageReaderOutputConfig.getImageFormat(), imageReaderOutputConfig.getMaxImages());
                    this.mImageReaderMap.put(Integer.valueOf(camera2OutputConfig.getId()), newInstance);
                    SessionProcessorSurface sessionProcessorSurface = new SessionProcessorSurface(newInstance.getSurface(), camera2OutputConfig.getId());
                    sessionProcessorSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            newInstance.close();
                        }
                    }, CameraXExecutors.directExecutor());
                    this.mSurfacesList.add(sessionProcessorSurface);
                } else if (camera2OutputConfig instanceof MultiResolutionImageReaderOutputConfig) {
                    throw new UnsupportedOperationException("MultiResolutionImageReader not supported");
                }
            }
        }
        SessionConfig.Builder builder = new SessionConfig.Builder();
        synchronized (this.mLock) {
            for (DeferrableSurface deferrableSurface : this.mSurfacesList) {
                builder.addSurface(deferrableSurface);
            }
        }
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        for (CaptureRequest.Key<?> key : initSessionInternal.getSessionParameters().keySet()) {
            builder2.setCaptureRequestOption(key, initSessionInternal.getSessionParameters().get(key));
        }
        builder.setImplementationOptions(builder2.build());
        builder.setTemplateType(initSessionInternal.getSessionTemplateId());
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.mImageReaderHandlerThread = handlerThread;
        handlerThread.start();
        this.mCameraId = from.getCameraId();
        Logger.d(TAG, "initSession: cameraId=" + this.mCameraId);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setImageProcessor(final int i, final ImageProcessor imageProcessor) {
        ImageReader imageReader;
        synchronized (this.mLock) {
            imageReader = this.mImageReaderMap.get(Integer.valueOf(i));
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase$$ExternalSyntheticLambda1
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    SessionProcessorBase.lambda$setImageProcessor$1(ImageProcessor.this, i, imageReader2);
                }
            }, new Handler(this.mImageReaderHandlerThread.getLooper()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$setImageProcessor$1(ImageProcessor imageProcessor, int i, ImageReader imageReader) {
        try {
            Image acquireNextImage = imageReader.acquireNextImage();
            imageProcessor.onNextImageAvailable(i, acquireNextImage.getTimestamp(), new ImageRefHolder(acquireNextImage), null);
        } catch (IllegalStateException e) {
            Logger.e(TAG, "Failed to acquire next image.", e);
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final void deInitSession() {
        Logger.e(TAG, "deInitSession: cameraId=" + this.mCameraId);
        deInitSessionInternal();
        synchronized (this.mLock) {
            for (DeferrableSurface deferrableSurface : this.mSurfacesList) {
                deferrableSurface.close();
            }
            this.mSurfacesList.clear();
            this.mImageReaderMap.clear();
        }
        HandlerThread handlerThread = this.mImageReaderHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.mImageReaderHandlerThread = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ImageRefHolder implements ImageReference {
        private Image mImage;
        private final Object mImageLock = new Object();
        private int mRefCount = 1;

        ImageRefHolder(Image image) {
            this.mImage = image;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public boolean increment() {
            synchronized (this.mImageLock) {
                int i = this.mRefCount;
                if (i <= 0) {
                    return false;
                }
                this.mRefCount = i + 1;
                return true;
            }
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public boolean decrement() {
            synchronized (this.mImageLock) {
                int i = this.mRefCount;
                if (i <= 0) {
                    return false;
                }
                int i2 = i - 1;
                this.mRefCount = i2;
                if (i2 <= 0) {
                    this.mImage.close();
                }
                return true;
            }
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public Image get() {
            return this.mImage;
        }
    }
}
