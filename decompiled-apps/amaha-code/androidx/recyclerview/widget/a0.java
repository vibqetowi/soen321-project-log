package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
public final class a0 {
    public static int a(RecyclerView.y yVar, v vVar, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.getChildCount() != 0 && yVar.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return Math.abs(mVar.getPosition(view) - mVar.getPosition(view2)) + 1;
            }
            return Math.min(vVar.l(), vVar.b(view2) - vVar.e(view));
        }
        return 0;
    }

    public static int b(RecyclerView.y yVar, v vVar, View view, View view2, RecyclerView.m mVar, boolean z10, boolean z11) {
        int max;
        if (mVar.getChildCount() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(mVar.getPosition(view), mVar.getPosition(view2));
        int max2 = Math.max(mVar.getPosition(view), mVar.getPosition(view2));
        if (z11) {
            max = Math.max(0, (yVar.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z10) {
            return max;
        }
        return Math.round((max * (Math.abs(vVar.b(view2) - vVar.e(view)) / (Math.abs(mVar.getPosition(view) - mVar.getPosition(view2)) + 1))) + (vVar.k() - vVar.e(view)));
    }

    public static int c(RecyclerView.y yVar, v vVar, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.getChildCount() != 0 && yVar.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return yVar.b();
            }
            return (int) (((vVar.b(view2) - vVar.e(view)) / (Math.abs(mVar.getPosition(view) - mVar.getPosition(view2)) + 1)) * yVar.b());
        }
        return 0;
    }
}
