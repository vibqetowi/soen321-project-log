package v0;

import android.graphics.Path;
import android.view.animation.PathInterpolator;
/* compiled from: PathInterpolatorCompat.java */
/* loaded from: classes.dex */
public final class a {
    public static PathInterpolator a(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    public static PathInterpolator b(float f, float f2, float f10, float f11) {
        return new PathInterpolator(f, f2, f10, f11);
    }

    public static PathInterpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
