package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.persistence.LocationInterface;
import com.theinnerhour.b2b.persistence.LocationPersistence;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$checkLocationInfo$1", f = "NotV4DashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22093u;

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements LocationInterface {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NotV4DashboardViewModel f22094a;

        public a(NotV4DashboardViewModel notV4DashboardViewModel) {
            this.f22094a = notV4DashboardViewModel;
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchFailure() {
            NotV4DashboardViewModel notV4DashboardViewModel = this.f22094a;
            notV4DashboardViewModel.D = false;
            ((androidx.lifecycle.w) notV4DashboardViewModel.E.getValue()).i(Boolean.FALSE);
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchSuccess() {
            NotV4DashboardViewModel notV4DashboardViewModel = this.f22094a;
            notV4DashboardViewModel.D = true;
            ((androidx.lifecycle.w) notV4DashboardViewModel.E.getValue()).i(Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super b1> dVar) {
        super(2, dVar);
        this.f22093u = notV4DashboardViewModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new b1(this.f22093u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((b1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        LocationPersistence.INSTANCE.fetchLocationInfo(new a(this.f22093u));
        return hs.k.f19476a;
    }
}
