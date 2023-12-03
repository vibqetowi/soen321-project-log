package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class c0 extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f2912a;

    /* renamed from: b  reason: collision with root package name */
    public Scroller f2913b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2914c = new a();

    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.r {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2915a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            if (i6 == 0 && this.f2915a) {
                this.f2915a = false;
                c0.this.f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i6, int i10) {
            if (i6 != 0 || i10 != 0) {
                this.f2915a = true;
            }
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2912a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.f2914c;
        if (recyclerView2 != null) {
            recyclerView2.c0(aVar);
            this.f2912a.setOnFlingListener(null);
        }
        this.f2912a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.f2912a.i(aVar);
                this.f2912a.setOnFlingListener(this);
                this.f2913b = new Scroller(this.f2912a.getContext(), new DecelerateInterpolator());
                f();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.m mVar, View view);

    public RecyclerView.x c(RecyclerView.m mVar) {
        if (!(mVar instanceof RecyclerView.x.b)) {
            return null;
        }
        return new d0(this, this.f2912a.getContext());
    }

    public abstract View d(RecyclerView.m mVar);

    public abstract int e(RecyclerView.m mVar, int i6, int i10);

    public final void f() {
        RecyclerView.m layoutManager;
        View d10;
        RecyclerView recyclerView = this.f2912a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (d10 = d(layoutManager)) == null) {
            return;
        }
        int[] b10 = b(layoutManager, d10);
        int i6 = b10[0];
        if (i6 != 0 || b10[1] != 0) {
            this.f2912a.j0(i6, b10[1]);
        }
    }
}
