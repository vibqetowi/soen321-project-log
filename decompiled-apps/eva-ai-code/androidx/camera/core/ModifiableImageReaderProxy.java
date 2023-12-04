package androidx.camera.core;

import android.graphics.Matrix;
import android.media.ImageReader;
import androidx.camera.core.impl.TagBundle;
/* loaded from: classes.dex */
class ModifiableImageReaderProxy extends AndroidImageReaderProxy {
    private volatile Integer mRotationDegrees;
    private volatile Matrix mSensorToBufferTransformMatrix;
    private volatile TagBundle mTagBundle;
    private volatile Long mTimestamp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ModifiableImageReaderProxy(ImageReader imageReader) {
        super(imageReader);
        this.mTagBundle = null;
        this.mTimestamp = null;
        this.mRotationDegrees = null;
        this.mSensorToBufferTransformMatrix = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setImageTagBundle(TagBundle tagBundle) {
        this.mTagBundle = tagBundle;
    }

    void setImageTimeStamp(long j) {
        this.mTimestamp = Long.valueOf(j);
    }

    void setImageRotationDegrees(int i) {
        this.mRotationDegrees = Integer.valueOf(i);
    }

    void setImageSensorToBufferTransformaMatrix(Matrix matrix) {
        this.mSensorToBufferTransformMatrix = matrix;
    }

    @Override // androidx.camera.core.AndroidImageReaderProxy, androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireLatestImage() {
        return modifyImage(super.acquireNextImage());
    }

    @Override // androidx.camera.core.AndroidImageReaderProxy, androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireNextImage() {
        return modifyImage(super.acquireNextImage());
    }

    private ImageProxy modifyImage(ImageProxy imageProxy) {
        ImageInfo imageInfo = imageProxy.getImageInfo();
        return new SettableImageProxy(imageProxy, ImmutableImageInfo.create(this.mTagBundle != null ? this.mTagBundle : imageInfo.getTagBundle(), this.mTimestamp != null ? this.mTimestamp.longValue() : imageInfo.getTimestamp(), this.mRotationDegrees != null ? this.mRotationDegrees.intValue() : imageInfo.getRotationDegrees(), this.mSensorToBufferTransformMatrix != null ? this.mSensorToBufferTransformMatrix : imageInfo.getSensorToBufferTransformMatrix()));
    }
}
