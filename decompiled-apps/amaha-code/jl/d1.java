package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.components.pro.dashboard.model.ProCoachModel;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$fetchProCoachDetails$1", f = "NotV4DashboardViewModel.kt", l = {586}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22142u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22143v;

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$fetchProCoachDetails$1$1", f = "NotV4DashboardViewModel.kt", l = {586}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super ProCoachModel>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22144u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ NotV4DashboardViewModel f22145v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22145v = notV4DashboardViewModel;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22145v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super ProCoachModel> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22144u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u0 u0Var = this.f22145v.f10867y;
                this.f22144u = 1;
                u0Var.getClass();
                kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                kVar.u();
                try {
                    VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(0, "https://api.theinnerhour.com/v1/mycoachv2", null, new r0(u0Var, kVar), new s0(u0Var, kVar)));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(u0Var.f22359a, e10);
                    if (kVar.a()) {
                        kVar.resumeWith(null);
                    }
                }
                obj = kVar.s();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super d1> dVar) {
        super(2, dVar);
        this.f22143v = notV4DashboardViewModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d1(this.f22143v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22142u;
        NotV4DashboardViewModel notV4DashboardViewModel = this.f22143v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = notV4DashboardViewModel.B;
            a aVar2 = new a(notV4DashboardViewModel, null);
            this.f22142u = 1;
            obj = ta.v.S(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        notV4DashboardViewModel.U.i((ProCoachModel) obj);
        return hs.k.f19476a;
    }
}
