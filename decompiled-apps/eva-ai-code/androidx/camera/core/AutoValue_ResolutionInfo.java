package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
/* loaded from: classes.dex */
final class AutoValue_ResolutionInfo extends ResolutionInfo {
    private final Rect cropRect;
    private final Size resolution;
    private final int rotationDegrees;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ResolutionInfo(Size size, Rect rect, int i) {
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        this.resolution = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.cropRect = rect;
        this.rotationDegrees = i;
    }

    @Override // androidx.camera.core.ResolutionInfo
    public Size getResolution() {
        return this.resolution;
    }

    @Override // androidx.camera.core.ResolutionInfo
    public Rect getCropRect() {
        return this.cropRect;
    }

    @Override // androidx.camera.core.ResolutionInfo
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public String toString() {
        return "ResolutionInfo{resolution=" + this.resolution + ", cropRect=" + this.cropRect + ", rotationDegrees=" + this.rotationDegrees + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResolutionInfo) {
            ResolutionInfo resolutionInfo = (ResolutionInfo) obj;
            return this.resolution.equals(resolutionInfo.getResolution()) && this.cropRect.equals(resolutionInfo.getCropRect()) && this.rotationDegrees == resolutionInfo.getRotationDegrees();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.resolution.hashCode() ^ 1000003) * 1000003) ^ this.cropRect.hashCode()) * 1000003) ^ this.rotationDegrees;
    }
}
