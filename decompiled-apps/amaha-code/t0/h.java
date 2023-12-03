package t0;

import android.view.ViewGroup;
/* compiled from: MarginLayoutParamsCompat.java */
/* loaded from: classes.dex */
public final class h {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
        marginLayoutParams.resolveLayoutDirection(i6);
    }

    public static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
        marginLayoutParams.setLayoutDirection(i6);
    }

    public static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
        marginLayoutParams.setMarginEnd(i6);
    }

    public static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
        marginLayoutParams.setMarginStart(i6);
    }
}
