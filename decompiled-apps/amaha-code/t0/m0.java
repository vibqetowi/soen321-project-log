package t0;

import android.view.View;
import android.view.ViewParent;
/* compiled from: ViewParentCompat.java */
/* loaded from: classes.dex */
public final class m0 {
    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z10) {
        return viewParent.onNestedFling(view, f, f2, z10);
    }

    public static boolean b(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    public static void c(ViewParent viewParent, View view, int i6, int i10, int[] iArr) {
        viewParent.onNestedPreScroll(view, i6, i10, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i6, int i10, int i11, int i12) {
        viewParent.onNestedScroll(view, i6, i10, i11, i12);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i6) {
        viewParent.onNestedScrollAccepted(view, view2, i6);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i6) {
        return viewParent.onStartNestedScroll(view, view2, i6);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
