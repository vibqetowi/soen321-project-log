package jl;

import java.util.List;
/* compiled from: CustomDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$fetchProviderAssignedStatus$1", f = "CustomDashboardViewModel.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22181u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f22182v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ e f22183w;

    /* compiled from: CustomDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$fetchProviderAssignedStatus$1$fetchedIsProviderAssignedList$1", f = "CustomDashboardViewModel.kt", l = {154}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22184u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ e f22185v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22185v = eVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22185v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22184u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f22184u = 1;
                e eVar = this.f22185v;
                eVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ta.v.H(kc.f.H(eVar), null, 0, new i(eVar, new kotlin.jvm.internal.u(), hVar, null), 3);
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: CustomDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$fetchProviderAssignedStatus$1$fetchedIsProviderAssignedList$2", f = "CustomDashboardViewModel.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22186u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ e f22187v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f22187v = eVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f22187v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22186u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f22186u = 1;
                e eVar = this.f22187v;
                eVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ta.v.H(kc.f.H(eVar), null, 0, new h(eVar, new kotlin.jvm.internal.u(), hVar, null), 3);
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, ls.d<? super g> dVar) {
        super(2, dVar);
        this.f22183w = eVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        g gVar = new g(this.f22183w, dVar);
        gVar.f22182v = obj;
        return gVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22181u;
        boolean z10 = false;
        e eVar = this.f22183w;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f22182v;
            List P0 = ca.a.P0(ta.v.g(d0Var, null, new a(eVar, null), 3), ta.v.g(d0Var, null, new b(eVar, null), 3));
            this.f22181u = 1;
            obj = ca.a.n(P0, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list = (List) obj;
        z10 = (((Boolean) list.get(0)).booleanValue() || ((Boolean) list.get(1)).booleanValue()) ? true : true;
        if (!kotlin.jvm.internal.i.b(Boolean.valueOf(z10), eVar.D.d())) {
            eVar.D.i(Boolean.valueOf(z10));
        }
        return hs.k.f19476a;
    }
}
