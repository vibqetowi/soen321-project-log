package ml;

import com.theinnerhour.b2b.network.model.Prescription;
import com.theinnerhour.b2b.network.model.ProviderPrescriptionList;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchPrescriptionStatus$2$1", f = "DashboardTelecommunicationsViewModel.kt", l = {484}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25493u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f25494v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p f25495w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f25496x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(p pVar, ls.d<? super Boolean> dVar, ls.d<? super k> dVar2) {
        super(2, dVar2);
        this.f25495w = pVar;
        this.f25496x = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        k kVar = new k(this.f25495w, this.f25496x, dVar);
        kVar.f25494v = obj;
        return kVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((k) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        hs.k kVar;
        boolean z10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25493u;
        p pVar = this.f25495w;
        boolean z11 = true;
        if (i6 != 0) {
            if (i6 == 1) {
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f25494v;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            rp.a aVar2 = pVar.f25558y;
            this.f25494v = (kotlinx.coroutines.d0) this.f25494v;
            this.f25493u = 1;
            aVar2.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            try {
                ((or.i) nr.b.a(or.i.class)).c("https://api.theinnerhour.com/v1/psychiatrist/getPrescriptions").I(new rp.c(aVar2, hVar));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(aVar2.f30847b, e10);
            }
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        ProviderPrescriptionList providerPrescriptionList = (ProviderPrescriptionList) obj;
        ls.d<Boolean> dVar = this.f25496x;
        if (providerPrescriptionList != null) {
            if (!pVar.U) {
                ArrayList<Prescription> prescriptionList = providerPrescriptionList.getPrescriptionList();
                if (!(prescriptionList instanceof Collection) || !prescriptionList.isEmpty()) {
                    for (Prescription prescription : prescriptionList) {
                        if (kotlin.jvm.internal.i.b(prescription.getStatus(), "assigned")) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                    z11 = false;
                }
            }
            pVar.U = z11;
            dVar.resumeWith(Boolean.TRUE);
            kVar = hs.k.f19476a;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            dVar.resumeWith(Boolean.FALSE);
        }
        return hs.k.f19476a;
    }
}
