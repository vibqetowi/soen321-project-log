package ml;

import java.util.ArrayList;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$getCommunitiesData$1", f = "V3DashboardViewModel.kt", l = {596, 601}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25497u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f25498v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c0 f25499w;

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$getCommunitiesData$1$fetchedCommunitiesData$1", f = "V3DashboardViewModel.kt", l = {597}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25500u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ c0 f25501v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f25501v = c0Var;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f25501v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25500u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u uVar = this.f25501v.f25368y;
                this.f25500u = 1;
                uVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ((or.i) nr.b.a(or.i.class)).a("https://api.theinnerhour.com/v1/communities/user_profiles/onboarding_status").I(new v(uVar, hVar));
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$getCommunitiesData$1$fetchedCommunitiesData$2", f = "V3DashboardViewModel.kt", l = {602}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super ArrayList<String>>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25502u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ c0 f25503v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c0 c0Var, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f25503v = c0Var;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f25503v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super ArrayList<String>> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25502u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u uVar = this.f25503v.f25368y;
                this.f25502u = 1;
                obj = uVar.b("https://api.theinnerhour.com/v1/communities/customers/get_group_info", this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(c0 c0Var, ls.d<? super k0> dVar) {
        super(2, dVar);
        this.f25499w = c0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        k0 k0Var = new k0(this.f25499w, dVar);
        k0Var.f25498v = obj;
        return k0Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((k0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.d0 d0Var;
        Object obj2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25497u;
        c0 c0Var = this.f25499w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    obj2 = this.f25498v;
                    sp.b.d0(obj);
                    c0Var.C.i(new hs.f<>(obj2, obj));
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0Var = (kotlinx.coroutines.d0) this.f25498v;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            d0Var = (kotlinx.coroutines.d0) this.f25498v;
            ls.f f02 = d0Var.f0();
            a aVar2 = new a(c0Var, null);
            this.f25498v = d0Var;
            this.f25497u = 1;
            obj = ta.v.S(f02, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ls.f f03 = d0Var.f0();
        b bVar = new b(c0Var, null);
        this.f25498v = obj;
        this.f25497u = 2;
        Object S = ta.v.S(f03, bVar, this);
        if (S == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = S;
        c0Var.C.i(new hs.f<>(obj2, obj));
        return hs.k.f19476a;
    }
}
