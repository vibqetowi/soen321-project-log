package t0;

import android.view.View;
/* compiled from: NestedScrollingParent2.java */
/* loaded from: classes.dex */
public interface q {
    void onNestedPreScroll(View view, int i6, int i10, int[] iArr, int i11);

    void onNestedScroll(View view, int i6, int i10, int i11, int i12, int i13);

    void onNestedScrollAccepted(View view, View view2, int i6, int i10);

    boolean onStartNestedScroll(View view, View view2, int i6, int i10);

    void onStopNestedScroll(View view, int i6);
}
