package an;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: LibraryHomeFragment.kt */
/* loaded from: classes2.dex */
public final class a0 extends androidx.recyclerview.widget.r {
    public final /* synthetic */ t f;

    public a0(t tVar) {
        this.f = tVar;
    }

    @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.c0
    public final int[] b(RecyclerView.m layoutManager, View targetView) {
        int i6;
        t tVar = this.f;
        kotlin.jvm.internal.i.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.i.g(targetView, "targetView");
        int[] iArr = new int[2];
        try {
            int i10 = 0;
            if (layoutManager.canScrollHorizontally()) {
                new Rect();
                try {
                    i6 = (layoutManager.getDecoratedLeft(targetView) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) targetView.getLayoutParams())).leftMargin) - layoutManager.getPaddingLeft();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f775u, e10);
                    i6 = 0;
                }
                iArr[0] = i6;
            } else {
                iArr[0] = 0;
            }
            if (layoutManager.canScrollVertically()) {
                new Rect();
                try {
                    i10 = (layoutManager.getDecoratedTop(targetView) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) targetView.getLayoutParams())).topMargin) - layoutManager.getPaddingTop();
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(tVar.f775u, e11);
                }
                iArr[1] = i10;
            } else {
                iArr[1] = 0;
            }
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(tVar.f775u, e12);
        }
        return iArr;
    }
}
