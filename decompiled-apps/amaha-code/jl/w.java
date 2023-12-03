package jl;

import com.theinnerhour.b2b.model.DashboardNpsDayTrack;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserNpsCheckModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
/* compiled from: DashboardDynamicCardsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.DashboardDynamicCardsViewModel$checkAndSetDynamicCard$1", f = "DashboardDynamicCardsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class w extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x f22377u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, ls.d<? super w> dVar) {
        super(2, dVar);
        this.f22377u = xVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new w(this.f22377u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((w) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        DashboardNpsDayTrack dashboardNps;
        ArrayList<Goal> userGoals;
        sp.b.d0(obj);
        UserNpsCheckModel npsCheckModel = NpsPersistence.INSTANCE.getNpsCheckModel();
        if (npsCheckModel != null && (dashboardNps = npsCheckModel.getDashboardNps()) != null) {
            int appOpenDayCount = dashboardNps.getAppOpenDayCount();
            x xVar = this.f22377u;
            if (appOpenDayCount == 2) {
                User user = FirebasePersistence.getInstance().getUser();
                boolean z10 = false;
                if (user != null && (userGoals = user.getUserGoals()) != null && userGoals.isEmpty()) {
                    z10 = true;
                }
                if (z10) {
                    xVar.f22385x.i(Constants.GOAL);
                } else {
                    xVar.f22385x.i("hide_card");
                }
            } else if (appOpenDayCount == 3) {
                xVar.f22385x.i("allie");
            } else if (appOpenDayCount >= 10) {
                if (!FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("isSurveyShown")) {
                    xVar.f22385x.i("survey");
                } else {
                    xVar.f22385x.i("hide_card");
                }
            } else {
                xVar.f22385x.i("hide_card");
            }
            return hs.k.f19476a;
        }
        return hs.k.f19476a;
    }
}
