package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class SafeCloseImageReaderProxy implements ImageReaderProxy {
    private final ImageReaderProxy mImageReaderProxy;
    private final Surface mSurface;
    private final Object mLock = new Object();
    private int mOutstandingImages = 0;
    private boolean mIsClosed = false;
    private final ForwardingImageProxy.OnImageCloseListener mImageCloseListener = new ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.SafeCloseImageReaderProxy$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
        public final void onImageClose(ImageProxy imageProxy) {
            SafeCloseImageReaderProxy.this.m168lambda$new$0$androidxcameracoreSafeCloseImageReaderProxy(imageProxy);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$androidx-camera-core-SafeCloseImageReaderProxy  reason: not valid java name */
    public /* synthetic */ void m168lambda$new$0$androidxcameracoreSafeCloseImageReaderProxy(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            int i = this.mOutstandingImages - 1;
            this.mOutstandingImages = i;
            if (this.mIsClosed && i == 0) {
                close();
            }
        }
    }

    public SafeCloseImageReaderProxy(ImageReaderProxy imageReaderProxy) {
        this.mImageReaderProxy = imageReaderProxy;
        this.mSurface = imageReaderProxy.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireLatestImage() {
        ImageProxy wrapImageProxy;
        synchronized (this.mLock) {
            wrapImageProxy = wrapImageProxy(this.mImageReaderProxy.acquireLatestImage());
        }
        return wrapImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireNextImage() {
        ImageProxy wrapImageProxy;
        synchronized (this.mLock) {
            wrapImageProxy = wrapImageProxy(this.mImageReaderProxy.acquireNextImage());
        }
        return wrapImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            Surface surface = this.mSurface;
            if (surface != null) {
                surface.release();
            }
            this.mImageReaderProxy.close();
        }
    }

    private ImageProxy wrapImageProxy(ImageProxy imageProxy) {
        if (imageProxy != null) {
            this.mOutstandingImages++;
            SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxy);
            singleCloseImageProxy.addOnImageCloseListener(this.mImageCloseListener);
            return singleCloseImageProxy;
        }
        return null;
    }

    public void safeClose() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mImageReaderProxy.clearOnImageAvailableListener();
            if (this.mOutstandingImages == 0) {
                close();
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReaderProxy.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReaderProxy.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReaderProxy.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReaderProxy.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReaderProxy.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.mLock) {
            this.mImageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.SafeCloseImageReaderProxy$$ExternalSyntheticLambda1
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    SafeCloseImageReaderProxy.this.m169x24b152e2(onImageAvailableListener, imageReaderProxy);
                }
            }, executor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setOnImageAvailableListener$1$androidx-camera-core-SafeCloseImageReaderProxy  reason: not valid java name */
    public /* synthetic */ void m169x24b152e2(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReaderProxy imageReaderProxy) {
        onImageAvailableListener.onImageAvailable(this);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mImageReaderProxy.clearOnImageAvailableListener();
        }
    }
}
