package km;

import com.theinnerhour.b2b.utils.Constants;
import hs.k;
import java.util.List;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: InAppPromptsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.viewmodel.InAppPromptsViewModel$dismissProviderVideoBookPrompt$1", f = "InAppPromptsViewModel.kt", l = {307}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f23391u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f23392v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ls.d<? super c> dVar2) {
        super(2, dVar2);
        this.f23392v = dVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f23392v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f23391u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            d dVar = this.f23392v;
            dVar.C.i(null);
            im.c cVar = dVar.f23394y;
            List<hs.f<String, String>> O0 = ca.a.O0(new hs.f("providerVideoDropOff", Constants.SUBSCRIPTION_NONE));
            this.f23391u = 1;
            if (cVar.d(O0, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
