package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.TagBundle;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
final class AndroidImageProxy implements ImageProxy {
    private final Image mImage;
    private final ImageInfo mImageInfo;
    private final PlaneProxy[] mPlanes;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidImageProxy(Image image) {
        this.mImage = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.mPlanes = new PlaneProxy[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.mPlanes[i] = new PlaneProxy(planes[i]);
            }
        } else {
            this.mPlanes = new PlaneProxy[0];
        }
        this.mImageInfo = ImmutableImageInfo.create(TagBundle.emptyBundle(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public synchronized void close() {
        this.mImage.close();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized Rect getCropRect() {
        return this.mImage.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized void setCropRect(Rect rect) {
        this.mImage.setCropRect(rect);
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getFormat() {
        return this.mImage.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getHeight() {
        return this.mImage.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getWidth() {
        return this.mImage.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized ImageProxy.PlaneProxy[] getPlanes() {
        return this.mPlanes;
    }

    /* loaded from: classes.dex */
    private static final class PlaneProxy implements ImageProxy.PlaneProxy {
        private final Image.Plane mPlane;

        PlaneProxy(Image.Plane plane) {
            this.mPlane = plane;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public synchronized int getRowStride() {
            return this.mPlane.getRowStride();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public synchronized int getPixelStride() {
            return this.mPlane.getPixelStride();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public synchronized ByteBuffer getBuffer() {
            return this.mPlane.getBuffer();
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageInfo getImageInfo() {
        return this.mImageInfo;
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized Image getImage() {
        return this.mImage;
    }
}
