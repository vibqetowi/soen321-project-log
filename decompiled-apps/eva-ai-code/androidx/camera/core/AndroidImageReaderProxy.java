package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AndroidImageReaderProxy implements ImageReaderProxy {
    private final ImageReader mImageReader;
    private final Object mLock = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidImageReaderProxy(ImageReader imageReader) {
        this.mImageReader = imageReader;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireLatestImage() {
        Image image;
        synchronized (this.mLock) {
            try {
                image = this.mImageReader.acquireLatestImage();
            } catch (RuntimeException e) {
                if (!isImageReaderContextNotInitializedException(e)) {
                    throw e;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new AndroidImageProxy(image);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireNextImage() {
        Image image;
        synchronized (this.mLock) {
            try {
                image = this.mImageReader.acquireNextImage();
            } catch (RuntimeException e) {
                if (!isImageReaderContextNotInitializedException(e)) {
                    throw e;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new AndroidImageProxy(image);
        }
    }

    private boolean isImageReaderContextNotInitializedException(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            this.mImageReader.close();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReader.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReader.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReader.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReader.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReader.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, final Executor executor) {
        synchronized (this.mLock) {
            this.mImageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.AndroidImageReaderProxy$$ExternalSyntheticLambda1
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    AndroidImageReaderProxy.this.m137x2fd48a6(executor, onImageAvailableListener, imageReader);
                }
            }, MainThreadAsyncHandler.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setOnImageAvailableListener$0$androidx-camera-core-AndroidImageReaderProxy  reason: not valid java name */
    public /* synthetic */ void m136x4985bb07(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setOnImageAvailableListener$1$androidx-camera-core-AndroidImageReaderProxy  reason: not valid java name */
    public /* synthetic */ void m137x2fd48a6(Executor executor, final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReader imageReader) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.AndroidImageReaderProxy$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AndroidImageReaderProxy.this.m136x4985bb07(onImageAvailableListener);
            }
        });
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mImageReader.setOnImageAvailableListener(null, null);
        }
    }
}
