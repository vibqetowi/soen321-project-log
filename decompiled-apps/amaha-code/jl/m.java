package jl;

import com.theinnerhour.b2b.model.DashboardNpsDayTrack;
import com.theinnerhour.b2b.model.UserNpsCheckModel;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: CustomDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$initialiseNPSPersistence$1", f = "CustomDashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f22264u;

    /* compiled from: CustomDashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ e f22265u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(1);
            this.f22265u = eVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            int i6;
            DashboardNpsDayTrack dashboardNps;
            if (bool.booleanValue()) {
                e eVar = this.f22265u;
                eVar.F.i(Boolean.TRUE);
                NpsPersistence npsPersistence = NpsPersistence.INSTANCE;
                npsPersistence.checkAndUpdateAppOpenDay();
                if (npsPersistence.isDashboardNpsPendingForDay(5)) {
                    UserNpsCheckModel npsCheckModel = npsPersistence.getNpsCheckModel();
                    if (npsCheckModel != null && (dashboardNps = npsCheckModel.getDashboardNps()) != null) {
                        i6 = dashboardNps.getAppOpenDayCount();
                    } else {
                        i6 = -1;
                    }
                    if (i6 >= 5) {
                        eVar.E.i(new SingleUseEvent<>(5));
                        npsPersistence.updateDashboardNpsForDay(5, true);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, ls.d<? super m> dVar) {
        super(2, dVar);
        this.f22264u = eVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new m(this.f22264u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((m) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        NpsPersistence.INSTANCE.initialise(new a(this.f22264u));
        return hs.k.f19476a;
    }
}
