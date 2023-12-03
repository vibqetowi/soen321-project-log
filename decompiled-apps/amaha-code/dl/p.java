package dl;

import android.os.Bundle;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.HashMap;
/* compiled from: V2DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends fm.y0>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13087u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(V2DashboardActivity v2DashboardActivity) {
        super(1);
        this.f13087u = v2DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends fm.y0> singleUseEvent) {
        boolean z10;
        HashMap<String, Object> appConfig;
        SingleUseEvent<? extends fm.y0> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && singleUseEvent2.getContentIfNotHandled() != null) {
            V2DashboardActivity v2DashboardActivity = this.f13087u;
            v2DashboardActivity.f10676w0 = true;
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && (appConfig = user.getAppConfig()) != null) {
                z10 = kotlin.jvm.internal.i.b(appConfig.get(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.TRUE);
            } else {
                z10 = false;
            }
            if (z10) {
                v2DashboardActivity.n0(R.id.dashboardRecommendedActivitiesExperiment).setVisibility(0);
                v2DashboardActivity.c1();
                UtilsKt.fireAnalytics("new_ra_received_by_user", new Bundle());
            }
        }
        return hs.k.f19476a;
    }
}
