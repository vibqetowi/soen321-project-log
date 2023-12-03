package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.network.model.NpsSubmissionModel;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$updateAppNpsScoreForDay$1", f = "NotV4DashboardViewModel.kt", l = {834}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22326u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22327v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f22328w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f22329x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f22330y;

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$updateAppNpsScoreForDay$1$1", f = "NotV4DashboardViewModel.kt", l = {835}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22331u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ NotV4DashboardViewModel f22332v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f22333w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f22334x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f22335y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NotV4DashboardViewModel notV4DashboardViewModel, int i6, int i10, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22332v = notV4DashboardViewModel;
            this.f22333w = i6;
            this.f22334x = i10;
            this.f22335y = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22332v, this.f22333w, this.f22334x, this.f22335y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22331u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u0 u0Var = this.f22332v.f10867y;
                int i10 = this.f22333w;
                int i11 = this.f22334x;
                String str = this.f22335y;
                this.f22331u = 1;
                u0Var.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ((or.g) nr.b.a(or.g.class)).a("https://api.theinnerhour.com/v1/save_nps", new NpsSubmissionModel(i10, i11, str, null, "app")).I(new t0(hVar));
                if (hVar.b() == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(NotV4DashboardViewModel notV4DashboardViewModel, int i6, int i10, String str, ls.d<? super q1> dVar) {
        super(2, dVar);
        this.f22327v = notV4DashboardViewModel;
        this.f22328w = i6;
        this.f22329x = i10;
        this.f22330y = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new q1(this.f22327v, this.f22328w, this.f22329x, this.f22330y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((q1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22326u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22327v, this.f22328w, this.f22329x, this.f22330y, null);
            this.f22326u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
