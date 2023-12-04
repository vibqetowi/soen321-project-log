package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder;
/* loaded from: classes.dex */
final class AutoValue_Camera2OutputConfigBuilder_ImageReaderConfig extends Camera2OutputConfigBuilder.ImageReaderConfig {
    private final int imageFormat;
    private final int maxImages;
    private final Size size;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Camera2OutputConfigBuilder_ImageReaderConfig(Size size, int i, int i2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.size = size;
        this.imageFormat = i;
        this.maxImages = i2;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder.ImageReaderConfig, androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    public Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder.ImageReaderConfig, androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder.ImageReaderConfig, androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    public int getMaxImages() {
        return this.maxImages;
    }

    public String toString() {
        return "ImageReaderConfig{size=" + this.size + ", imageFormat=" + this.imageFormat + ", maxImages=" + this.maxImages + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Camera2OutputConfigBuilder.ImageReaderConfig) {
            Camera2OutputConfigBuilder.ImageReaderConfig imageReaderConfig = (Camera2OutputConfigBuilder.ImageReaderConfig) obj;
            return this.size.equals(imageReaderConfig.getSize()) && this.imageFormat == imageReaderConfig.getImageFormat() && this.maxImages == imageReaderConfig.getMaxImages();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.imageFormat) * 1000003) ^ this.maxImages;
    }
}
