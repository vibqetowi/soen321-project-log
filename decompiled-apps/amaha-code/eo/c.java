package eo;

import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowUserResponseModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import hs.k;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: OnboardingFlowViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.onboarding.utils.OnboardingFlowViewModel$fetchUserResponseToFirebase$1", f = "OnboardingFlowViewModel.kt", l = {350}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public w f14432u;

    /* renamed from: v  reason: collision with root package name */
    public int f14433v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ f f14434w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f14434w = fVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f14434w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        w<SingleUseEvent<MatchingFlowUserResponseModel>> wVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f14433v;
        f fVar = this.f14434w;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    wVar = this.f14432u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                w<SingleUseEvent<MatchingFlowUserResponseModel>> wVar2 = fVar.J;
                p001do.a aVar2 = fVar.E;
                this.f14432u = wVar2;
                this.f14433v = 1;
                Object a10 = aVar2.a(this);
                if (a10 == aVar) {
                    return aVar;
                }
                wVar = wVar2;
                obj = a10;
            }
            wVar.i(new SingleUseEvent<>(obj));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(fVar.f14443x, e10);
        }
        return k.f19476a;
    }
}
