package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import java.util.ArrayList;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$getCommunitiesData$1", f = "NotV4DashboardViewModel.kt", l = {563, 567}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22174u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f22175v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22176w;

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$getCommunitiesData$1$fetchedCommunitiesData$1", f = "NotV4DashboardViewModel.kt", l = {564}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22177u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ NotV4DashboardViewModel f22178v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22178v = notV4DashboardViewModel;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22178v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22177u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u0 u0Var = this.f22178v.f10867y;
                this.f22177u = 1;
                u0Var.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ((or.i) nr.b.a(or.i.class)).a("https://api.theinnerhour.com/v1/communities/user_profiles/onboarding_status").I(new p0(u0Var, hVar));
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$getCommunitiesData$1$fetchedCommunitiesData$2", f = "NotV4DashboardViewModel.kt", l = {568}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super ArrayList<String>>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22179u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ NotV4DashboardViewModel f22180v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f22180v = notV4DashboardViewModel;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f22180v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super ArrayList<String>> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22179u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u0 u0Var = this.f22180v.f10867y;
                this.f22179u = 1;
                u0Var.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ((or.i) nr.b.a(or.i.class)).m("https://api.theinnerhour.com/v1/communities/customers/get_group_info").I(new o0(u0Var, hVar));
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super f1> dVar) {
        super(2, dVar);
        this.f22176w = notV4DashboardViewModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        f1 f1Var = new f1(this.f22176w, dVar);
        f1Var.f22175v = obj;
        return f1Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.d0 d0Var;
        Object obj2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22174u;
        NotV4DashboardViewModel notV4DashboardViewModel = this.f22176w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    obj2 = this.f22175v;
                    sp.b.d0(obj);
                    notV4DashboardViewModel.V.i(new hs.f<>(obj2, obj));
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0Var = (kotlinx.coroutines.d0) this.f22175v;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            d0Var = (kotlinx.coroutines.d0) this.f22175v;
            ls.f f02 = d0Var.f0();
            a aVar2 = new a(notV4DashboardViewModel, null);
            this.f22175v = d0Var;
            this.f22174u = 1;
            obj = ta.v.S(f02, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ls.f f03 = d0Var.f0();
        b bVar = new b(notV4DashboardViewModel, null);
        this.f22175v = obj;
        this.f22174u = 2;
        Object S = ta.v.S(f03, bVar, this);
        if (S == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = S;
        notV4DashboardViewModel.V.i(new hs.f<>(obj2, obj));
        return hs.k.f19476a;
    }
}
