package ml;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel", f = "V3DashboardViewModel.kt", l = {807}, m = "preLoadWebViews")
/* loaded from: classes2.dex */
public final class n0 extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public c0 f25543u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f25544v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c0 f25545w;

    /* renamed from: x  reason: collision with root package name */
    public int f25546x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(c0 c0Var, ls.d<? super n0> dVar) {
        super(dVar);
        this.f25545w = c0Var;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f25544v = obj;
        this.f25546x |= LinearLayoutManager.INVALID_OFFSET;
        return c0.f(this.f25545w, this);
    }
}
