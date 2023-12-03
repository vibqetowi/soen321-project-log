package ml;

import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$fetchSubscriptionData$1", f = "V3DashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c0 f25471u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(c0 c0Var, ls.d<? super h0> dVar) {
        super(2, dVar);
        this.f25471u = c0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new h0(this.f25471u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        SubscriptionPersistence.INSTANCE.fetchData(this.f25471u);
        return hs.k.f19476a;
    }
}
