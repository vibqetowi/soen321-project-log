package dl;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.activity.DynamicCardsNotificationActivity;
import com.theinnerhour.b2b.activity.LearningHubActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.utils.V3DashboardUtils;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.CourseResetModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13006u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13007v;

    public /* synthetic */ e0(V3DashboardActivity v3DashboardActivity, int i6) {
        this.f13006u = i6;
        this.f13007v = v3DashboardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        HashMap<String, Object> appConfig;
        Object obj;
        HashMap<String, Object> appConfig2;
        AppCompatImageView appCompatImageView;
        String str3;
        int i6 = 0;
        int i10 = this.f13006u;
        V3DashboardActivity this$0 = this.f13007v;
        switch (i10) {
            case 0:
                int i11 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivityForResult(tr.r.s(this$0, false).putExtra("source", "dashboard_gpa"), this$0.T);
                Bundle bundle = new Bundle();
                bundle.putString("user_version", FirebasePersistence.getInstance().getUser().getVersion());
                gk.a.b(bundle, "gpa_click_db");
                return;
            case 1:
                int i12 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    this$0.startActivityForResult(new Intent(this$0, LearningHubActivity.class).putExtra("learningHubList", this$0.V).putExtra("showPage", true).putExtra("source", Constants.SCREEN_DASHBOARD), this$0.K);
                    String str4 = gk.a.f16573a;
                    gk.a.b(UtilsKt.getAnalyticsBundle(), "dashboard_cm_show_all_click");
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f10748v, "exception", e10);
                    return;
                }
            case 2:
                int i13 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    this$0.startActivityForResult(new Intent(this$0, LearningHubExperimentActivity.class).putExtra("learningHubList", this$0.V).putExtra("showPage", true).putExtra("source", Constants.SCREEN_DASHBOARD), this$0.K);
                    String str5 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle2, "dashboard_cm_show_all_click");
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f10748v, "exception", e11);
                    return;
                }
            case 3:
                int i14 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((DrawerLayout) this$0.n0(R.id.dashboardNavigationDrawer)).p();
                ApplicationPersistence.getInstance().setBooleanValue("show_bookmarking_tool_tip", false);
                this$0.n0(R.id.cvDashboardBookmarkingToolTip).setVisibility(8);
                this$0.n0(R.id.viewLeftMenuBG).setVisibility(8);
                Bundle bundle3 = new Bundle();
                bundle3.putString("course", this$0.N0().getCourseName());
                if (this$0.J0 != null) {
                    bundle3.putInt("bookmarked_activity_count", this$0.P0().k());
                }
                gk.a.b(bundle3, "bookmark_repository_tooltip_click");
                return;
            case 4:
                int i15 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivity(new Intent(this$0, DynamicCardsNotificationActivity.class));
                return;
            case 5:
                int i16 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.B.d();
                return;
            case 6:
                int i17 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.B.d();
                return;
            case 7:
                int i18 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.B.d();
                return;
            case 8:
                int i19 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().setBooleanValue("topical_card_clicked", true);
                this$0.startActivity(new Intent(this$0, AllTopicalCoursesActivity.class));
                String str6 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_dashboard_card_open");
                return;
            case 9:
                int i20 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                V3DashboardUtils v3DashboardUtils = this$0.B;
                v3DashboardUtils.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", "Hey there! Check out the Amaha App to live a happier life. https://innerhour.page.link/ih");
                v3DashboardUtils.f().startActivity(Intent.createChooser(intent, "Share using"));
                if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.SHARE_APP_BADGE)) {
                    HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                    kotlin.jvm.internal.i.f(badges, "getInstance().user.userGamificationModel.badges");
                    badges.put(Constants.SHARE_APP_BADGE, Constants.BADGE_ATTAINED);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    return;
                }
                return;
            case 10:
                int i21 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                UtilsKt.fireAnalytics("dashboard_play_store_click", UtilsKt.getAnalyticsBundle());
                ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.getPackageName()));
                intent2.addFlags(1208483840);
                try {
                    this$0.startActivity(intent2);
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e12);
                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.getPackageName())));
                    return;
                }
            case 11:
                int i22 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                    UtilsKt.fireAnalytics("dashboard_cope_click", UtilsKt.getAnalyticsBundle());
                    this$0.startActivityForResult(new Intent(this$0, BotPwaActivity.class), this$0.O);
                    return;
                }
                return;
            case 12:
                int i23 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.n0(R.id.layoutProfileBottomToolTip).setVisibility(8);
                return;
            case 13:
                int i24 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.B.e();
                return;
            case 14:
                int i25 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.B.e();
                return;
            case 15:
                int i26 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.B.c();
                return;
            case 16:
                int i27 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.B.c();
                return;
            case 17:
                int i28 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.n0(R.id.planCardToolTipLayout).setVisibility(8);
                return;
            case 18:
                int i29 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.n0(R.id.planCardToolTipLayout).setVisibility(8);
                this$0.n0(R.id.viewTransparentBG).setVisibility(8);
                return;
            case 19:
                int i30 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle4 = new Bundle();
                bundle4.putString("action", "main_card");
                bundle4.putString("source", Constants.SCREEN_DASHBOARD);
                Intent intent3 = new Intent(this$0, JournalActivity.class);
                if (!this$0.P0) {
                    this$0.P0 = true;
                    intent3.putExtra("type", "template_question");
                }
                gk.a.b(bundle4, "journal_card_click");
                this$0.f10718c1.a(intent3);
                return;
            case 20:
                int i31 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                analyticsBundle.putString("source", "db_card");
                UtilsKt.fireAnalytics("dashboard_lib_explore_click", analyticsBundle);
                this$0.startActivity(new Intent(this$0, LibraryActivity.class));
                return;
            case 21:
                int i32 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.n0(R.id.layoutProfileToolTip).setVisibility(8);
                return;
            case 22:
                int i33 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str7 = gk.a.f16573a;
                Bundle a10 = r1.b0.a("source", "home_top_right");
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(a10, "dashboard_profile_click");
                this$0.f10730j1.a(new Intent(this$0, ExperimentProfileActivity.class));
                if (this$0.Q0) {
                    this$0.S0 = true;
                }
                this$0.n0(R.id.layoutProfileToolTip).setVisibility(8);
                return;
            case 23:
                Object obj2 = null;
                int i34 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Intent putExtra = new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.DB_FILTER_APPLIED);
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getCurrentCourseName();
                } else {
                    str = null;
                }
                this$0.startActivityForResult(putExtra.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str)), this$0.P);
                String str8 = gk.a.f16573a;
                Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str2 = user2.getCurrentCourseName();
                } else {
                    str2 = null;
                }
                User f = defpackage.b.f(analyticsBundle2, "course", str2);
                if (f != null && (appConfig = f.getAppConfig()) != null) {
                    obj2 = appConfig.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
                }
                String str9 = "e";
                if (!kotlin.jvm.internal.i.b(String.valueOf(obj2), "e")) {
                    str9 = "d";
                }
                analyticsBundle2.putString("variant", str9);
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(analyticsBundle2, "therapy_psychiatry_db_card_click");
                return;
            case 24:
                int i35 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                    ProgressDialog progressDialog = this$0.f10750w;
                    if (progressDialog != null) {
                        progressDialog.show();
                        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                        kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                        ArrayList k10 = ca.a.k(currentCourseName);
                        String a11 = FirebaseAuth.getInstance().a();
                        kotlin.jvm.internal.i.d(a11);
                        ((or.a) nr.b.a(or.a.class)).a("https://us-central1-gcpinnerhour.cloudfunctions.net/retryFetch", new CourseResetModel(k10, a11)).I(new V3DashboardActivity.g());
                        if (this$0.N0().getAssessments().size() != 1) {
                            i6 = 15;
                        }
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                        bundle5.putInt("day", i6);
                        User f2 = defpackage.b.f(bundle5, "source", Constants.SCREEN_DASHBOARD);
                        if (f2 != null && (appConfig2 = f2.getAppConfig()) != null) {
                            obj = appConfig2.get(Constants.ONBOARDING_EXPERIMENT);
                        } else {
                            obj = null;
                        }
                        bundle5.putString("variant", (String) obj);
                        gk.a.b(bundle5, "plan_fetch_retry");
                        return;
                    }
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
                return;
            case 25:
                int i36 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((DrawerLayout) this$0.n0(R.id.dashboardNavigationDrawer)).p();
                Extensions extensions = Extensions.INSTANCE;
                AppCompatImageView ivLeftMenuAlert = (AppCompatImageView) this$0.n0(R.id.ivLeftMenuAlert);
                kotlin.jvm.internal.i.f(ivLeftMenuAlert, "ivLeftMenuAlert");
                if (extensions.isVisible(ivLeftMenuAlert) && (appCompatImageView = (AppCompatImageView) this$0.n0(R.id.ivLeftMenuAlert)) != null) {
                    appCompatImageView.setVisibility(8);
                }
                if (ApplicationPersistence.getInstance().getBooleanValue("offering_sessions_alert", false)) {
                    ApplicationPersistence.getInstance().setBooleanValue("offering_sessions_alert", false);
                    this$0.w1();
                    return;
                }
                return;
            case 26:
                int i37 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((DrawerLayout) this$0.n0(R.id.dashboardNavigationDrawer)).c();
                return;
            case 27:
                int i38 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.B.c();
                if (((ConstraintLayout) this$0.n0(R.id.dayPlanContainer)).getVisibility() == 0) {
                    this$0.Z0();
                }
                Bundle bundle6 = new Bundle();
                User user3 = FirebasePersistence.getInstance().getUser();
                if (user3 != null) {
                    str3 = user3.getVersion();
                } else {
                    str3 = null;
                }
                bundle6.putString("version", str3);
                bundle6.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle6.putString("plan_card_variant", "multi");
                gk.a.b(bundle6, "plan_week_dropdown_click");
                return;
            case 28:
                int i39 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.Z0();
                return;
            default:
                int i40 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.n0(R.id.cvDailyPlanBookmarkingToolTip).setVisibility(8);
                return;
        }
    }
}
