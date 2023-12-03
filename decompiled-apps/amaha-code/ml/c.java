package ml;

import android.content.Context;
import com.theinnerhour.b2b.MyApplication;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchAccessToken$2$1", f = "DashboardTelecommunicationsViewModel.kt", l = {382}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25357u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f25358v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f25359w;

    /* compiled from: DashboardTelecommunicationsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchAccessToken$2$1$1", f = "DashboardTelecommunicationsViewModel.kt", l = {383}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25360u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f25361v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p f25362w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f25363x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p pVar, ls.d<? super Boolean> dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f25362w = pVar;
            this.f25363x = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f25362w, this.f25363x, dVar);
            aVar.f25361v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            hs.k kVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25360u;
            p pVar = this.f25362w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f25361v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                rp.a aVar2 = pVar.f25558y;
                this.f25361v = (kotlinx.coroutines.d0) this.f25361v;
                this.f25360u = 1;
                obj = aVar2.j(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            String str = (String) obj;
            ls.d<Boolean> dVar = this.f25363x;
            if (str != null) {
                pVar.W = str;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, ls.d<? super Boolean> dVar, ls.d<? super c> dVar2) {
        super(2, dVar2);
        this.f25358v = pVar;
        this.f25359w = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f25358v, this.f25359w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        MyApplication myApplication;
        String str;
        boolean z10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25357u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            p pVar = this.f25358v;
            Context applicationContext = pVar.f2382x.getApplicationContext();
            if (applicationContext instanceof MyApplication) {
                myApplication = (MyApplication) applicationContext;
            } else {
                myApplication = null;
            }
            if (myApplication != null) {
                str = myApplication.O;
            } else {
                str = null;
            }
            if (str != null && !gv.n.B0(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
            ls.d<Boolean> dVar = this.f25359w;
            if (z10) {
                kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                a aVar2 = new a(pVar, dVar, null);
                this.f25357u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                pVar.W = str;
                dVar.resumeWith(Boolean.TRUE);
            }
        }
        return hs.k.f19476a;
    }
}
