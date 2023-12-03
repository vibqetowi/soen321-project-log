package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public final class d0 extends q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0 f2921a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, Context context) {
        super(context);
        this.f2921a = c0Var;
    }

    @Override // androidx.recyclerview.widget.q
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.RecyclerView.x
    public final void onTargetFound(View view, RecyclerView.y yVar, RecyclerView.x.a aVar) {
        c0 c0Var = this.f2921a;
        RecyclerView recyclerView = c0Var.f2912a;
        if (recyclerView == null) {
            return;
        }
        int[] b10 = c0Var.b(recyclerView.getLayoutManager(), view);
        int i6 = b10[0];
        int i10 = b10[1];
        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i6), Math.abs(i10)));
        if (calculateTimeForDeceleration > 0) {
            DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
            aVar.f2806a = i6;
            aVar.f2807b = i10;
            aVar.f2808c = calculateTimeForDeceleration;
            aVar.f2810e = decelerateInterpolator;
            aVar.f = true;
        }
    }
}
