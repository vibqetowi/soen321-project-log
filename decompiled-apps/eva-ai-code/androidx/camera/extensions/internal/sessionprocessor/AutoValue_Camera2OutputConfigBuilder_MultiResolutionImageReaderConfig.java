package androidx.camera.extensions.internal.sessionprocessor;

import androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder;
/* loaded from: classes.dex */
final class AutoValue_Camera2OutputConfigBuilder_MultiResolutionImageReaderConfig extends Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig {
    private final int imageFormat;
    private final int maxImages;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Camera2OutputConfigBuilder_MultiResolutionImageReaderConfig(int i, int i2) {
        this.imageFormat = i;
        this.maxImages = i2;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig, androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig, androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getMaxImages() {
        return this.maxImages;
    }

    public String toString() {
        return "MultiResolutionImageReaderConfig{imageFormat=" + this.imageFormat + ", maxImages=" + this.maxImages + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig) {
            Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig multiResolutionImageReaderConfig = (Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig) obj;
            return this.imageFormat == multiResolutionImageReaderConfig.getImageFormat() && this.maxImages == multiResolutionImageReaderConfig.getMaxImages();
        }
        return false;
    }

    public int hashCode() {
        return ((this.imageFormat ^ 1000003) * 1000003) ^ this.maxImages;
    }
}
