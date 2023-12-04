package androidx.camera.core.impl;

import android.util.Size;
/* loaded from: classes.dex */
final class AutoValue_SurfaceSizeDefinition extends SurfaceSizeDefinition {
    private final Size analysisSize;
    private final Size previewSize;
    private final Size recordSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SurfaceSizeDefinition(Size size, Size size2, Size size3) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.analysisSize = size;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.previewSize = size2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.recordSize = size3;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Size getAnalysisSize() {
        return this.analysisSize;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Size getPreviewSize() {
        return this.previewSize;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Size getRecordSize() {
        return this.recordSize;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.analysisSize + ", previewSize=" + this.previewSize + ", recordSize=" + this.recordSize + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceSizeDefinition) {
            SurfaceSizeDefinition surfaceSizeDefinition = (SurfaceSizeDefinition) obj;
            return this.analysisSize.equals(surfaceSizeDefinition.getAnalysisSize()) && this.previewSize.equals(surfaceSizeDefinition.getPreviewSize()) && this.recordSize.equals(surfaceSizeDefinition.getRecordSize());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.analysisSize.hashCode() ^ 1000003) * 1000003) ^ this.previewSize.hashCode()) * 1000003) ^ this.recordSize.hashCode();
    }
}
