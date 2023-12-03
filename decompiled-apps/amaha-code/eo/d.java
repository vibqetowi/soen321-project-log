package eo;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowModel;
import com.theinnerhour.b2b.components.onboarding.model.MatchingResponse;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import hs.k;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: OnboardingFlowViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.onboarding.utils.OnboardingFlowViewModel$getMatchedTherapist$1", f = "OnboardingFlowViewModel.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMajor}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f14435u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f14436v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ f f14437w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ MatchingFlowModel f14438x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f14439y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, MatchingFlowModel matchingFlowModel, boolean z10, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f14437w = fVar;
        this.f14438x = matchingFlowModel;
        this.f14439y = z10;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        d dVar2 = new d(this.f14437w, this.f14438x, this.f14439y, dVar);
        dVar2.f14436v = obj;
        return dVar2;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        k kVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f14435u;
        boolean z10 = true;
        f fVar = this.f14437w;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    d0 d0Var = (d0) this.f14436v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var2 = (d0) this.f14436v;
                p001do.a aVar2 = fVar.E;
                MatchingFlowModel matchingFlowModel = this.f14438x;
                this.f14436v = d0Var2;
                this.f14435u = 1;
                obj = aVar2.b(matchingFlowModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            MatchingResponse matchingResponse = (MatchingResponse) obj;
            if (matchingResponse != null) {
                if (!this.f14439y) {
                    z10 = false;
                }
                f.e(fVar, matchingResponse, z10);
                kVar = k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                fVar.G.i(new SingleUseEvent<>(Boolean.TRUE));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(fVar.f14443x, e10);
        }
        return k.f19476a;
    }
}
