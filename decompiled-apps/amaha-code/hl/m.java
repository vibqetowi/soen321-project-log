package hl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NewDashboardSavedItemsActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4RecentActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerInsightsActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserGamificationModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
import java.util.HashMap;
import jl.m1;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17711u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s f17712v;

    public /* synthetic */ m(s sVar, int i6) {
        this.f17711u = i6;
        this.f17712v = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        boolean z10;
        CourseDayModelV1 courseDayModelV1;
        ArrayList<CourseDayModelV1> planV3;
        String str2;
        CourseDayModelV1 courseDayModelV12;
        boolean z11;
        String str3;
        boolean z12;
        CourseDayModelV1 courseDayModelV13;
        ArrayList<CourseDayModelV1> planV32;
        ArrayList<CourseDayModelV1> planV33;
        boolean z13;
        UserGamificationModel userGamificationModel;
        HashMap<String, String> badges;
        UserGamificationModel userGamificationModel2;
        HashMap<String, String> badges2;
        String str4;
        Intent putExtra;
        String str5;
        String str6;
        String str7;
        String str8;
        pp.c cVar = pp.c.DB_FILTER_APPLIED;
        int i6 = this.f17711u;
        s this$0 = this.f17712v;
        switch (i6) {
            case 0:
                int i10 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                Intent putExtra2 = tr.r.s(requireActivity, false).putExtra("source", Constants.SCREEN_DASHBOARD);
                kotlin.jvm.internal.i.f(putExtra2, "SellingScreenSelectionUt…ra(\"source\", \"dashboard\")");
                this$0.f17730b0.a(putExtra2);
                return;
            case 1:
                int i11 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle = new Bundle();
                bundle.putString("action", "main_card");
                bundle.putString("source", Constants.SCREEN_DASHBOARD);
                Intent intent = new Intent(this$0.requireActivity(), JournalActivity.class);
                if (!this$0.L) {
                    this$0.L = true;
                    intent.putExtra("type", "template_question");
                }
                gk.a.b(bundle, "journal_card_click");
                this$0.f17731d0.a(intent);
                return;
            case 2:
                int i12 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.W.a(new Intent(this$0.requireActivity(), ExperimentProfileActivity.class));
                return;
            case 3:
                int i13 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                    Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                    analyticsBundle.putString("source", "bottom_nav");
                    UtilsKt.fireAnalytics("dashboard_cope_click", analyticsBundle);
                    this$0.T.a(new Intent(this$0.requireActivity(), BotPwaActivity.class));
                    return;
                }
                return;
            case 4:
                int i14 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                    Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                    analyticsBundle2.putString("source", "home_screen");
                    UtilsKt.fireAnalytics("dashboard_cope_click", analyticsBundle2);
                    this$0.T.a(new Intent(this$0.requireActivity(), BotPwaActivity.class));
                    return;
                }
                return;
            case 5:
                int i15 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str9 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "new_tracker_db_insights_click");
                this$0.S.a(new Intent(this$0.requireActivity(), MultiTrackerInsightsActivity.class));
                return;
            case 6:
                int i16 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.f17729a0.a(new Intent(this$0.requireContext(), NotV4RecentActivity.class));
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "homescreen");
                UtilsKt.fireAnalytics("lib_recent_view_all", bundle2);
                return;
            case 7:
                int i17 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                il.d dVar = this$0.A;
                if (dVar != null) {
                    dVar.F();
                }
                UtilsKt.fireAnalytics("domain_switch_dropdown_click", UtilsKt.getAnalyticsBundle());
                return;
            case 8:
                int i18 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                User user = firebasePersistence.getUser();
                if (user != null) {
                    str = user.getCurrentCourse();
                } else {
                    str = null;
                }
                Course courseById = firebasePersistence.getCourseById(str);
                if (courseById != null && (planV3 = courseById.getPlanV3()) != null) {
                    z10 = false;
                    courseDayModelV1 = (CourseDayModelV1) is.u.j2(0, planV3);
                } else {
                    z10 = false;
                    courseDayModelV1 = null;
                }
                s.F(this$0, courseDayModelV1, z10, null, 6);
                Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                analyticsBundle3.putString("source", "homescreen");
                UtilsKt.fireAnalytics("suggested_activities_start_assessment", analyticsBundle3);
                return;
            case 9:
                int i19 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                il.d dVar2 = this$0.A;
                if (dVar2 != null) {
                    dVar2.I();
                    return;
                }
                return;
            case 10:
                int i20 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                    NotV4DashboardViewModel O = this$0.O();
                    ta.v.H(kc.f.H(O), null, 0, new m1(O, null), 3);
                    Bundle analyticsBundle4 = UtilsKt.getAnalyticsBundle();
                    analyticsBundle4.putString("source", "homescreen");
                    UtilsKt.fireAnalytics("suggested_activities_plan_create_retry", analyticsBundle4);
                    return;
                }
                return;
            case 11:
                int i21 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                User user2 = firebasePersistence2.getUser();
                if (user2 != null) {
                    str2 = user2.getCurrentCourse();
                } else {
                    str2 = null;
                }
                Course courseById2 = firebasePersistence2.getCourseById(str2);
                if (courseById2 != null && (planV33 = courseById2.getPlanV3()) != null) {
                    courseDayModelV12 = (CourseDayModelV1) is.u.j2(0, planV33);
                } else {
                    courseDayModelV12 = null;
                }
                if (courseDayModelV12 != null && courseDayModelV12.isCompleted()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    FirebasePersistence firebasePersistence3 = FirebasePersistence.getInstance();
                    User user3 = firebasePersistence3.getUser();
                    if (user3 != null) {
                        str3 = user3.getCurrentCourse();
                    } else {
                        str3 = null;
                    }
                    Course courseById3 = firebasePersistence3.getCourseById(str3);
                    if (courseById3 != null && (planV32 = courseById3.getPlanV3()) != null) {
                        z12 = false;
                        courseDayModelV13 = (CourseDayModelV1) is.u.j2(0, planV32);
                    } else {
                        z12 = false;
                        courseDayModelV13 = null;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("showTopNav", true);
                    hs.k kVar = hs.k.f19476a;
                    s.F(this$0, courseDayModelV13, z12, bundle3, 2);
                    Bundle analyticsBundle5 = UtilsKt.getAnalyticsBundle();
                    analyticsBundle5.putString("source", "homescreen");
                    UtilsKt.fireAnalytics("db_lib_view_assessment_result", analyticsBundle5);
                    return;
                }
                return;
            case 12:
                int i22 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", "Hey there! Check out the Amaha App to live a happier life. https://innerhour.page.link/ih");
                this$0.startActivity(Intent.createChooser(intent2, "Share using"));
                FirebasePersistence firebasePersistence4 = FirebasePersistence.getInstance();
                User user4 = firebasePersistence4.getUser();
                if (user4 != null && (userGamificationModel2 = user4.getUserGamificationModel()) != null && (badges2 = userGamificationModel2.getBadges()) != null && !badges2.containsKey(Constants.SHARE_APP_BADGE)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    User user5 = firebasePersistence4.getUser();
                    if (user5 != null && (userGamificationModel = user5.getUserGamificationModel()) != null && (badges = userGamificationModel.getBadges()) != null) {
                        badges.put(Constants.SHARE_APP_BADGE, Constants.BADGE_ATTAINED);
                    }
                    firebasePersistence4.updateUserOnFirebase();
                    return;
                }
                return;
            case 13:
                int i23 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                NestedScrollView nestedScrollView = (NestedScrollView) this$0._$_findCachedViewById(R.id.nsvNotV4Db);
                if (nestedScrollView != null) {
                    nestedScrollView.post(new n(this$0, 5));
                    return;
                }
                return;
            case 14:
                int i24 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                UtilsKt.fireAnalytics("dashboard_play_store_click", UtilsKt.getAnalyticsBundle());
                ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.requireActivity().getPackageName()));
                intent3.addFlags(1208483840);
                try {
                    this$0.startActivity(intent3);
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e10);
                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.requireActivity().getPackageName())));
                    return;
                }
            case 15:
                int i25 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                this$0.f17730b0.a(tr.r.s(requireActivity2, false).putExtra("source", "dashboard_gpa"));
                String str10 = gk.a.f16573a;
                Bundle bundle4 = new Bundle();
                User user6 = FirebasePersistence.getInstance().getUser();
                if (user6 != null) {
                    str4 = user6.getVersion();
                } else {
                    str4 = null;
                }
                bundle4.putString("user_version", str4);
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle4, "gpa_click_db");
                return;
            case 16:
                int i26 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.Z(1);
                return;
            case 17:
                int i27 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.Z(2);
                return;
            case 18:
                int i28 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.Z(3);
                return;
            case 19:
                int i29 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.Z(4);
                return;
            case 20:
                int i30 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.Z(5);
                return;
            case 21:
                int i31 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.f17729a0.a(new Intent(this$0.requireActivity(), LibraryActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD));
                return;
            case 22:
                int i32 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.R) {
                    if (sp.b.K()) {
                        putExtra = new Intent(this$0.requireContext(), FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD).putExtra("entry_point_click", Constants.SCREEN_DASHBOARD);
                    } else {
                        putExtra = new Intent(this$0.requireContext(), V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD).putExtra("entry_point_click", Constants.SCREEN_DASHBOARD);
                    }
                    this$0.S.a(putExtra);
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("source", "homescreen_top");
                    UtilsKt.fireAnalytics("dashboard_goals_click", bundle5);
                    return;
                }
                Extensions extensions = Extensions.INSTANCE;
                Context requireContext = this$0.requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                String string = this$0.getString(R.string.goalMigrationProgress);
                kotlin.jvm.internal.i.f(string, "getString(R.string.goalMigrationProgress)");
                extensions.toast(requireContext, string, 1);
                return;
            case 23:
                int i33 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.c0.a(new Intent(this$0.requireActivity(), NewDashboardSavedItemsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD));
                Bundle bundle6 = new Bundle();
                bundle6.putString("source", "homescreen_top");
                UtilsKt.fireAnalytics("lib_saved_items_db_entry", bundle6);
                return;
            case 24:
                int i34 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Intent putExtra3 = new Intent(this$0.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
                User user7 = FirebasePersistence.getInstance().getUser();
                if (user7 != null) {
                    str5 = user7.getCurrentCourseName();
                } else {
                    str5 = null;
                }
                this$0.D.getClass();
                this$0.V.a(putExtra3.putExtra("db_filter", s5.d(str5)));
                String str11 = gk.a.f16573a;
                Bundle analyticsBundle6 = UtilsKt.getAnalyticsBundle();
                User user8 = FirebasePersistence.getInstance().getUser();
                if (user8 != null) {
                    str6 = user8.getCurrentCourseName();
                } else {
                    str6 = null;
                }
                analyticsBundle6.putString("course", str6);
                analyticsBundle6.putString("variant", "e");
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(analyticsBundle6, "therapy_psychiatry_db_card_click");
                return;
            default:
                int i35 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Intent putExtra4 = new Intent(this$0.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
                User user9 = FirebasePersistence.getInstance().getUser();
                if (user9 != null) {
                    str7 = user9.getCurrentCourseName();
                } else {
                    str7 = null;
                }
                this$0.D.getClass();
                this$0.V.a(putExtra4.putExtra("db_filter", s5.d(str7)));
                String str12 = gk.a.f16573a;
                Bundle analyticsBundle7 = UtilsKt.getAnalyticsBundle();
                User user10 = FirebasePersistence.getInstance().getUser();
                if (user10 != null) {
                    str8 = user10.getCurrentCourseName();
                } else {
                    str8 = null;
                }
                analyticsBundle7.putString("course", str8);
                analyticsBundle7.putString("variant", "d");
                hs.k kVar4 = hs.k.f19476a;
                gk.a.b(analyticsBundle7, "therapy_psychiatry_db_card_click");
                return;
        }
    }
}
