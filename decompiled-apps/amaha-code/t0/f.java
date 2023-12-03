package t0;

import android.graphics.Rect;
import android.view.Gravity;
/* compiled from: GravityCompat.java */
/* loaded from: classes.dex */
public final class f {
    public static void a(int i6, int i10, int i11, Rect rect, int i12, int i13, Rect rect2, int i14) {
        Gravity.apply(i6, i10, i11, rect, i12, i13, rect2, i14);
    }

    public static void b(int i6, int i10, int i11, Rect rect, Rect rect2, int i12) {
        Gravity.apply(i6, i10, i11, rect, rect2, i12);
    }

    public static void c(int i6, Rect rect, Rect rect2, int i10) {
        Gravity.applyDisplay(i6, rect, rect2, i10);
    }
}
