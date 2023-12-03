package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$submitRating$1", f = "NotV4DashboardViewModel.kt", l = {803}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22293u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22294v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f22295w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f22296x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(NotV4DashboardViewModel notV4DashboardViewModel, int i6, String str, ls.d<? super p1> dVar) {
        super(2, dVar);
        this.f22294v = notV4DashboardViewModel;
        this.f22295w = i6;
        this.f22296x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new p1(this.f22294v, this.f22295w, this.f22296x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((p1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22293u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            this.f22293u = 1;
            if (((t1) this.f22294v.Y.getValue()).a(this.f22295w, this.f22296x, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
