package dl;

import android.view.View;
import android.widget.FrameLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.HashMap;
/* compiled from: V2DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13106u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(V2DashboardActivity v2DashboardActivity) {
        super(1);
        this.f13106u = v2DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Integer num) {
        Object obj;
        HashMap<String, Object> appConfig;
        View view;
        HashMap<String, Object> appConfig2;
        HashMap<String, Object> appConfig3;
        Object obj2;
        HashMap<String, Object> appConfig4;
        View view2;
        HashMap<String, Object> appConfig5;
        HashMap<String, Object> appConfig6;
        Integer num2 = num;
        if (num2 != null) {
            int intValue = num2.intValue();
            View view3 = null;
            V2DashboardActivity v2DashboardActivity = this.f13106u;
            if (intValue == 0) {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (appConfig6 = user.getAppConfig()) != null) {
                    obj2 = appConfig6.get("dashboard_communities_card");
                } else {
                    obj2 = null;
                }
                if (obj2 == null) {
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null && (appConfig5 = user2.getAppConfig()) != null) {
                        appConfig5.put("dashboard_communities_card", "show_card_one");
                    }
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                } else {
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null && (appConfig4 = user3.getAppConfig()) != null) {
                        appConfig4.put("dashboard_communities_card", "show_card_one");
                    }
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
                View childAt = ((FrameLayout) v2DashboardActivity.n0(R.id.llCommunitiesExperiment1)).getChildAt(0);
                if (childAt != null) {
                    view2 = childAt.findViewById(R.id.CommunitiesCard1View);
                } else {
                    view2 = null;
                }
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                View childAt2 = ((FrameLayout) v2DashboardActivity.n0(R.id.llCommunitiesExperiment1)).getChildAt(0);
                if (childAt2 != null) {
                    view3 = childAt2.findViewById(R.id.CommunitiesCard2View);
                }
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            } else {
                User user4 = FirebasePersistence.getInstance().getUser();
                if (user4 != null && (appConfig3 = user4.getAppConfig()) != null) {
                    obj = appConfig3.get("dashboard_communities_card");
                } else {
                    obj = null;
                }
                if (obj == null) {
                    User user5 = FirebasePersistence.getInstance().getUser();
                    if (user5 != null && (appConfig2 = user5.getAppConfig()) != null) {
                        appConfig2.put("dashboard_communities_card", "show_card_two");
                    }
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                } else {
                    User user6 = FirebasePersistence.getInstance().getUser();
                    if (user6 != null && (appConfig = user6.getAppConfig()) != null) {
                        appConfig.put("dashboard_communities_card", "show_card_two");
                    }
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
                View childAt3 = ((FrameLayout) v2DashboardActivity.n0(R.id.llCommunitiesExperiment1)).getChildAt(0);
                if (childAt3 != null) {
                    view = childAt3.findViewById(R.id.CommunitiesCard1View);
                } else {
                    view = null;
                }
                if (view != null) {
                    view.setVisibility(8);
                }
                View childAt4 = ((FrameLayout) v2DashboardActivity.n0(R.id.llCommunitiesExperiment1)).getChildAt(0);
                if (childAt4 != null) {
                    view3 = childAt4.findViewById(R.id.CommunitiesCard2View);
                }
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            }
        }
        return hs.k.f19476a;
    }
}
