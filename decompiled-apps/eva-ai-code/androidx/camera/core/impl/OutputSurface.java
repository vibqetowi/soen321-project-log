package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
/* loaded from: classes.dex */
public abstract class OutputSurface {
    public abstract int getImageFormat();

    public abstract Size getSize();

    public abstract Surface getSurface();

    public static OutputSurface create(Surface surface, Size size, int i) {
        return new AutoValue_OutputSurface(surface, size, i);
    }
}
