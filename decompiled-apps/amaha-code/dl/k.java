package dl;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements androidx.activity.result.b, BottomNavigationView.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13053u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13054v;

    public /* synthetic */ k(V2DashboardActivity v2DashboardActivity, int i6) {
        this.f13053u = i6;
        this.f13054v = v2DashboardActivity;
    }

    @Override // androidx.activity.result.b
    public final void b(Object obj) {
        int i6 = this.f13053u;
        V2DashboardActivity this$0 = this.f13054v;
        switch (i6) {
            case 0:
                androidx.activity.result.a result = (androidx.activity.result.a) obj;
                int i10 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.f(result, "result");
                try {
                    if (result.f976u == -1) {
                        ml.y yVar = this$0.f10668q0;
                        if (yVar != null) {
                            yVar.e();
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("dashboardViewModel");
                            throw null;
                        }
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f10673v, e10);
                    return;
                }
            default:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                int i11 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("isSurveyShown")) {
                    ((FrameLayout) this$0.n0(R.id.flDynamicCards)).removeAllViews();
                    ((FrameLayout) this$0.n0(R.id.flDynamicCards)).setVisibility(8);
                }
                ((RobertoTextView) ((NavigationView) this$0.n0(R.id.dashboardv2NavView)).d().findViewById(R.id.dashboardMenuName)).setText(this$0.getString(R.string.left_menu_dashboard_rate_us_title, FirebasePersistence.getInstance().getUser().getFirstName()));
                return;
        }
    }

    @Override // sb.g.b
    public final boolean c(MenuItem item) {
        boolean z10;
        String str;
        HashMap<String, Object> appConfig;
        int i6 = V2DashboardActivity.F0;
        V2DashboardActivity this$0 = this.f13054v;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(item, "item");
        boolean z11 = true;
        item.setChecked(true);
        int itemId = item.getItemId();
        int i10 = this$0.K;
        switch (itemId) {
            case R.id.navigation_goals /* 2131365057 */:
                if (this$0.f10676w0) {
                    UtilsKt.fireAnalytics("dashboard_goals_click", UtilsKt.getAnalyticsBundle());
                    this$0.startActivityForResult(new Intent(this$0, V2GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD), i10);
                    break;
                } else {
                    Extensions extensions = Extensions.INSTANCE;
                    String string = this$0.getString(R.string.goalMigrationProgress);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.goalMigrationProgress)");
                    extensions.toast(this$0, string, 1);
                    break;
                }
            case R.id.navigation_home /* 2131365059 */:
                return true;
            case R.id.navigation_profile /* 2131365065 */:
                UtilsKt.fireAnalytics("dashboard_profile_click", UtilsKt.getAnalyticsBundle());
                this$0.f10682z0.a(new Intent(this$0, ExperimentProfileActivity.class));
                this$0.n0(R.id.layoutProfileBottomToolTip).setVisibility(8);
                break;
            case R.id.navigation_therapist /* 2131365066 */:
                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                    if (defpackage.d.q("v2.3") && (defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                        Boolean SKIP_MONETIZATION = Constants.SKIP_MONETIZATION;
                        kotlin.jvm.internal.i.f(SKIP_MONETIZATION, "SKIP_MONETIZATION");
                        if (SKIP_MONETIZATION.booleanValue()) {
                            this$0.startActivityForResult(new Intent(this$0, ProInitialAssessmentActivity.class).putExtra("source", "bottom_nav"), i10);
                        } else {
                            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                            if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "plus")) {
                                Extensions.INSTANCE.toast(this$0, "Congrats, you already have a subscription", 1);
                            } else {
                                this$0.startActivityForResult(new Intent(this$0, MonetizationActivity.class).putExtra("source", "bottom_nav").putExtra(Constants.CAMPAIGN_ID, this$0.f10666o0), i10);
                            }
                        }
                        gk.a.b(new Bundle(), "premium_click");
                        break;
                    } else {
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                        analyticsBundle.putBoolean("therapist_assigned", (stringValue == null || kotlin.jvm.internal.i.b(stringValue, "null") || kotlin.jvm.internal.i.b(stringValue, "")) ? false : false);
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null && (appConfig = user.getAppConfig()) != null) {
                            z10 = kotlin.jvm.internal.i.b(appConfig.get(Constants.TELECOMMUNICATION_CONSENT), Boolean.TRUE);
                        } else {
                            z10 = false;
                        }
                        analyticsBundle.putBoolean("disclaimer_consent", z10);
                        User user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 != null) {
                            str = user2.getVersion();
                        } else {
                            str = null;
                        }
                        analyticsBundle.putString("version", str);
                        UtilsKt.fireAnalytics("dashboard_chat_click", analyticsBundle);
                        this$0.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class), i10);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
