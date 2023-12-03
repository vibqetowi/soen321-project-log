package eo;

import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowUserResponseModel;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.k;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: OnboardingFlowViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.onboarding.utils.OnboardingFlowViewModel$storeUserResponseToFirebase$1", f = "OnboardingFlowViewModel.kt", l = {335}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f14440u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ f f14441v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ MatchingFlowUserResponseModel f14442w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, MatchingFlowUserResponseModel matchingFlowUserResponseModel, ls.d<? super e> dVar) {
        super(2, dVar);
        this.f14441v = fVar;
        this.f14442w = matchingFlowUserResponseModel;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new e(this.f14441v, this.f14442w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((e) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f14440u;
        f fVar = this.f14441v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                p001do.a aVar2 = fVar.E;
                MatchingFlowUserResponseModel matchingFlowUserResponseModel = this.f14442w;
                this.f14440u = 1;
                if (aVar2.c(matchingFlowUserResponseModel, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(fVar.f14443x, e10);
        }
        return k.f19476a;
    }
}
