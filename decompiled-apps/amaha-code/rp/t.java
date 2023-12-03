package rp;

import android.app.Application;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
/* compiled from: TelecommunicationsPWAViewModel.kt */
/* loaded from: classes2.dex */
public final class t extends androidx.lifecycle.b {
    public final androidx.lifecycle.w<String> A;

    /* renamed from: y  reason: collision with root package name */
    public final rp.a f30900y;

    /* renamed from: z  reason: collision with root package name */
    public final String f30901z;

    /* compiled from: TelecommunicationsPWAViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.telecommunications.viewmodel.TelecommunicationsPWAViewModel$1", f = "TelecommunicationsPWAViewModel.kt", l = {20}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f30902u;

        public a(ls.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f30902u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f30902u = 1;
                t tVar = t.this;
                tVar.getClass();
                try {
                    ta.v.H(kc.f.H(tVar), null, 0, new u(tVar, null), 3);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f30901z, e10);
                }
                if (hs.k.f19476a == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(rp.a providerDashboardViewModelRepository, Application application) {
        super(application);
        kotlin.jvm.internal.i.g(providerDashboardViewModelRepository, "providerDashboardViewModelRepository");
        kotlin.jvm.internal.i.g(application, "application");
        this.f30900y = providerDashboardViewModelRepository;
        this.f30901z = LogHelper.INSTANCE.makeLogTag("TelecommunicationsPWAViewModel");
        this.A = new androidx.lifecycle.w<>();
        ta.v.H(kc.f.H(this), null, 0, new a(null), 3);
    }
}
