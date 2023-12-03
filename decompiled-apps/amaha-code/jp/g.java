package jp;

import hs.k;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: SplashScreenViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.splash.viewModel.SplashScreenViewModel$showNext$1", f = "SplashScreenViewModel.kt", l = {132}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22564u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f22565v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, ls.d<? super g> dVar2) {
        super(2, dVar2);
        this.f22565v = dVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new g(this.f22565v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((g) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22564u;
        d dVar = this.f22565v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            a aVar2 = dVar.f22547z;
            this.f22564u = 1;
            if (v.S(aVar2.f22534a.mo11default(), new c(aVar2, null), this) == aVar) {
                return aVar;
            }
        }
        dVar.N.i(Boolean.valueOf(dVar.E));
        return k.f19476a;
    }
}
