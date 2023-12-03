package km;

import androidx.lifecycle.w;
import hs.k;
import java.util.List;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: InAppPromptsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.viewmodel.InAppPromptsViewModel$setMatchingDropOffStatus$1", f = "InAppPromptsViewModel.kt", l = {316}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f23432u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f23433v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f23434w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f23435x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, String str, String str2, ls.d<? super h> dVar2) {
        super(2, dVar2);
        this.f23433v = dVar;
        this.f23434w = str;
        this.f23435x = str2;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new h(this.f23433v, this.f23434w, this.f23435x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((h) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f23432u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            d dVar = this.f23433v;
            w<hs.f<String, String>> wVar = dVar.B;
            String str = this.f23435x;
            String str2 = this.f23434w;
            wVar.i(new hs.f<>(str2, str));
            im.c cVar = dVar.f23394y;
            List<hs.f<String, String>> O0 = ca.a.O0(new hs.f("providerMatchingDropOff", str2));
            this.f23432u = 1;
            if (cVar.d(O0, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
