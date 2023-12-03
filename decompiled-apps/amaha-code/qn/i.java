package qn;

import c4.g;
import c4.q;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.j;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: MonetizationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$cachePurchaseHistory$1", f = "MonetizationViewModel.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29955u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f29956v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f29957w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f29958x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(MonetizationViewModel monetizationViewModel, boolean z10, ls.d<? super i> dVar) {
        super(2, dVar);
        this.f29957w = monetizationViewModel;
        this.f29958x = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        i iVar = new i(this.f29957w, this.f29958x, dVar);
        iVar.f29956v = obj;
        return iVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        hs.k kVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29955u;
        MonetizationViewModel monetizationViewModel = this.f29957w;
        if (i6 != 0) {
            if (i6 == 1) {
                d0 d0Var = (d0) this.f29956v;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            c cVar = monetizationViewModel.f11455z;
            this.f29956v = (d0) this.f29956v;
            this.f29955u = 1;
            cVar.getClass();
            final kotlinx.coroutines.k kVar2 = new kotlinx.coroutines.k(1, ca.a.G0(this));
            kVar2.u();
            final c4.a aVar2 = new c4.a(true, MyApplication.V.a(), kotlin.jvm.internal.h.O);
            aVar2.C(new c4.e() { // from class: com.theinnerhour.b2b.components.monetization.viewModel.MonetizationRepository$fetchPaymentHistory$2$1
                @Override // c4.e
                public final void a(g p02) {
                    i.g(p02, "p0");
                    int i10 = p02.f4918a;
                    j<ArrayList<String>> jVar = kVar2;
                    if (i10 == 0) {
                        q qVar = new q();
                        qVar.f4948a = "subs";
                        v.H(h.c(o0.f23642c), null, 0, new MonetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1(aVar2, qVar, jVar, null), 3);
                    } else if (jVar.a()) {
                        jVar.resumeWith(null);
                    }
                }

                @Override // c4.e
                public final void b() {
                    j<ArrayList<String>> jVar = kVar2;
                    if (jVar.a()) {
                        jVar.resumeWith(null);
                    }
                }
            });
            obj = kVar2.s();
            if (obj == aVar) {
                return aVar;
            }
        }
        ArrayList<String> arrayList = (ArrayList) obj;
        if (arrayList != null) {
            if (this.f29958x) {
                monetizationViewModel.j().i(arrayList);
            }
            kVar = hs.k.f19476a;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            monetizationViewModel.D.i(Boolean.TRUE);
        }
        return hs.k.f19476a;
    }
}
