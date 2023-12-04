package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
/* loaded from: classes.dex */
public abstract class AttachedSurfaceInfo {
    public abstract int getImageFormat();

    public abstract Size getSize();

    public abstract SurfaceConfig getSurfaceConfig();

    public abstract Range<Integer> getTargetFrameRate();

    public static AttachedSurfaceInfo create(SurfaceConfig surfaceConfig, int i, Size size, Range<Integer> range) {
        return new AutoValue_AttachedSurfaceInfo(surfaceConfig, i, size, range);
    }
}
