package ek;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.theinnerhour.b2b.R;
/* compiled from: MiniCoursesDashboardLoadingAdapter.kt */
/* loaded from: classes2.dex */
public final class i1 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final LayoutInflater f14170x;

    /* compiled from: MiniCoursesDashboardLoadingAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public i1(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        Object systemService = activity.getSystemService("layout_inflater");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f14170x = (LayoutInflater) systemService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        ((ShimmerFrameLayout) aVar.f2751a.findViewById(R.id.shimmerParent)).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        View inflate = this.f14170x.inflate(R.layout.row_db_mini_course_tall_placeholder, (ViewGroup) parent, false);
        kotlin.jvm.internal.i.f(inflate, "inflater.inflate(R.layou…aceholder, parent, false)");
        return new a(inflate);
    }
}
