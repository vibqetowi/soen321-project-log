package jl;

import java.util.ArrayList;
/* compiled from: CustomDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$getCommunitiesData$1", f = "CustomDashboardViewModel.kt", l = {487, 492}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22238u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f22239v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ e f22240w;

    /* compiled from: CustomDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$getCommunitiesData$1$fetchedCommunitiesData$1", f = "CustomDashboardViewModel.kt", l = {488}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22241u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ e f22242v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22242v = eVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22242v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22241u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u uVar = this.f22242v.f22146y;
                this.f22241u = 1;
                uVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ((or.i) nr.b.a(or.i.class)).a("https://api.theinnerhour.com/v1/communities/user_profiles/onboarding_status").I(new t(uVar, hVar));
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: CustomDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$getCommunitiesData$1$fetchedCommunitiesData$2", f = "CustomDashboardViewModel.kt", l = {493}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super ArrayList<String>>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22243u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ e f22244v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f22244v = eVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f22244v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super ArrayList<String>> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22243u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u uVar = this.f22244v.f22146y;
                this.f22243u = 1;
                uVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ((or.i) nr.b.a(or.i.class)).m("https://api.theinnerhour.com/v1/communities/customers/get_group_info").I(new s(uVar, hVar));
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, ls.d<? super j> dVar) {
        super(2, dVar);
        this.f22240w = eVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        j jVar = new j(this.f22240w, dVar);
        jVar.f22239v = obj;
        return jVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.d0 d0Var;
        Object obj2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22238u;
        e eVar = this.f22240w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    obj2 = this.f22239v;
                    sp.b.d0(obj);
                    eVar.H.i(new hs.f<>(obj2, obj));
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0Var = (kotlinx.coroutines.d0) this.f22239v;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            d0Var = (kotlinx.coroutines.d0) this.f22239v;
            ls.f f02 = d0Var.f0();
            a aVar2 = new a(eVar, null);
            this.f22239v = d0Var;
            this.f22238u = 1;
            obj = ta.v.S(f02, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ls.f f03 = d0Var.f0();
        b bVar = new b(eVar, null);
        this.f22239v = obj;
        this.f22238u = 2;
        Object S = ta.v.S(f03, bVar, this);
        if (S == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = S;
        eVar.H.i(new hs.f<>(obj2, obj));
        return hs.k.f19476a;
    }
}
