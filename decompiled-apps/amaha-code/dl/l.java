package dl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.appsflyer.AppsFlyerLib;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.activity.DynamicCardsNotificationActivity;
import com.theinnerhour.b2b.activity.GratitudeJournalComponentActivity;
import com.theinnerhour.b2b.activity.LearningHubActivity;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesExperimentActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13062u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13063v;

    public /* synthetic */ l(V2DashboardActivity v2DashboardActivity, int i6) {
        this.f13062u = i6;
        this.f13063v = v2DashboardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        Object obj2;
        HashMap<String, Object> appConfig;
        HashMap<String, Object> appConfig2;
        Object obj3;
        Object obj4;
        HashMap<String, Object> appConfig3;
        HashMap<String, Object> appConfig4;
        int i6 = this.f13062u;
        V2DashboardActivity this$0 = this.f13063v;
        switch (i6) {
            case 0:
                int i10 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle = new Bundle();
                bundle.putString("user_version", FirebasePersistence.getInstance().getUser().getVersion());
                gk.a.b(bundle, "gpa_click_db");
                this$0.startActivityForResult(new Intent(this$0, MonetizationActivity.class).putExtra("source", "dashboard_gpa"), this$0.M);
                return;
            case 1:
                int i11 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    this$0.startActivityForResult(new Intent(this$0, LearningHubActivity.class).putExtra("learningHubList", this$0.O).putExtra("showPage", true).putExtra("source", Constants.SCREEN_DASHBOARD), this$0.H);
                    UtilsKt.fireAnalytics("dashboard_cm_show_all_click", UtilsKt.getAnalyticsBundle());
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f10673v, "exception", e10);
                    return;
                }
            case 2:
                int i12 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$0.getPackageName())));
                return;
            case 3:
                int i13 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                    String str = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null && (appConfig2 = user.getAppConfig()) != null) {
                        obj = appConfig2.get("dashboard_communities_card");
                    } else {
                        obj = null;
                    }
                    bundle2.putBoolean("group_joined", kotlin.jvm.internal.i.b(obj, "show_card_two"));
                    bundle2.putString(Constants.DAYMODEL_POSITION, "a");
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle2, "communities_db_card_click");
                    if (new gk.e().a()) {
                        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                        Context applicationContext = this$0.getApplicationContext();
                        HashMap hashMap = new HashMap();
                        hashMap.put("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        User user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
                            obj2 = appConfig.get("dashboard_communities_card");
                        } else {
                            obj2 = null;
                        }
                        hashMap.put("group_joined", Boolean.valueOf(kotlin.jvm.internal.i.b(obj2, "show_card_two")));
                        hashMap.put(Constants.DAYMODEL_POSITION, "a");
                        appsFlyerLib.logEvent(applicationContext, "communities_db_card_click", hashMap);
                    }
                    this$0.f10680y0.a(new Intent(this$0, CommunitiesPwaActivity.class));
                    return;
                }
                return;
            case 4:
                int i14 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                    String str2 = gk.a.f16573a;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null && (appConfig4 = user3.getAppConfig()) != null) {
                        obj3 = appConfig4.get("dashboard_communities_card");
                    } else {
                        obj3 = null;
                    }
                    bundle3.putBoolean("group_joined", kotlin.jvm.internal.i.b(obj3, "show_card_two"));
                    bundle3.putString(Constants.DAYMODEL_POSITION, "a");
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle3, "communities_db_card_click");
                    if (new gk.e().a()) {
                        AppsFlyerLib appsFlyerLib2 = AppsFlyerLib.getInstance();
                        Context applicationContext2 = this$0.getApplicationContext();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        User user4 = FirebasePersistence.getInstance().getUser();
                        if (user4 != null && (appConfig3 = user4.getAppConfig()) != null) {
                            obj4 = appConfig3.get("dashboard_communities_card");
                        } else {
                            obj4 = null;
                        }
                        hashMap2.put("group_joined", Boolean.valueOf(kotlin.jvm.internal.i.b(obj4, "show_card_two")));
                        hashMap2.put(Constants.DAYMODEL_POSITION, "a");
                        appsFlyerLib2.logEvent(applicationContext2, "communities_db_card_click", hashMap2);
                    }
                    this$0.f10680y0.a(new Intent(this$0, CommunitiesPwaActivity.class));
                    return;
                }
                return;
            case 5:
                int i15 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.C0();
                return;
            case 6:
                int i16 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().setBooleanValue("topical_card_clicked", true);
                this$0.startActivity(new Intent(this$0, AllTopicalCoursesActivity.class));
                String str3 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_dashboard_card_open");
                return;
            case 7:
                int i17 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.C0();
                return;
            case 8:
                int i18 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.B0();
                return;
            case 9:
                int i19 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.B0();
                return;
            case 10:
                int i20 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.B0();
                return;
            case 11:
                int i21 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.n0(R.id.layoutProfileBottomToolTip).setVisibility(8);
                return;
            case 12:
                int i22 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                    UtilsKt.fireAnalytics("dashboard_cope_click", UtilsKt.getAnalyticsBundle());
                    this$0.startActivityForResult(new Intent(this$0, BotPwaActivity.class), this$0.K);
                    return;
                }
                return;
            case 13:
                int i23 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                nd.z zVar = this$0.f10669r0;
                zVar.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", "Hey there! Check out the Amaha App to live a happier life. https://innerhour.page.link/ih");
                zVar.g().startActivity(Intent.createChooser(intent, "Share using"));
                if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.SHARE_APP_BADGE)) {
                    HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                    kotlin.jvm.internal.i.f(badges, "getInstance().user.userGamificationModel.badges");
                    badges.put(Constants.SHARE_APP_BADGE, Constants.BADGE_ATTAINED);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    return;
                }
                return;
            case 14:
                int i24 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                UtilsKt.fireAnalytics("dashboard_play_store_click", UtilsKt.getAnalyticsBundle());
                ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.getPackageName()));
                intent2.addFlags(1208483840);
                try {
                    this$0.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e11);
                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.getPackageName())));
                    return;
                }
            case 15:
                int i25 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivity(new Intent(this$0, DynamicCardsNotificationActivity.class));
                return;
            case 16:
                int i26 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.n0(R.id.cvDailyPlanBookmarkingToolTip).setVisibility(8);
                return;
            case 17:
                int i27 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                    this$0.finish();
                    this$0.startActivity(tr.r.r(this$0));
                    return;
                }
                return;
            case 18:
                int i28 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivityForResult(new Intent(this$0, GratitudeJournalComponentActivity.class), this$0.K);
                return;
            case 19:
                int i29 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivityForResult(new Intent(this$0, GratitudeJournalComponentActivity.class), this$0.K);
                return;
            case 20:
                int i30 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((DrawerLayout) this$0.n0(R.id.dashboardNavigationDrawer)).p();
                return;
            case 21:
                int i31 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((DrawerLayout) this$0.n0(R.id.dashboardNavigationDrawer)).c();
                return;
            case 22:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    String str4 = gk.a.f16573a;
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(bundle4, "dashboard_activity_view_all_click");
                    this$0.startActivity(new Intent(this$0, RecommendedActivitiesExperimentActivity.class));
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$0.f10673v, "exception", e12);
                    return;
                }
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivity(new Intent(this$0, WebviewActivity.class).putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/org/dashboard").putExtra("requireAccessToken", true));
                String str5 = gk.a.f16573a;
                Bundle bundle5 = new Bundle();
                bundle5.putString("org_id", SessionManager.getInstance().getStringValue(SessionManager.KEY_ORGANISATION_ID));
                bundle5.putString("org_name", SessionManager.getInstance().getStringValue(SessionManager.KEY_ORGANISATION_NAME));
                hs.k kVar4 = hs.k.f19476a;
                gk.a.b(bundle5, "app_entry_emp_lp_click");
                return;
        }
    }
}
