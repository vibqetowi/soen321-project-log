package com.theinnerhour.b2b.components.dashboard.utils;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.e;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ActivitiesInfoActivity;
import com.theinnerhour.b2b.activity.AllMiniCoursesActivity;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.activity.DeeplinkCodeActivationActivity;
import com.theinnerhour.b2b.activity.GratitudeJournalComponentActivity;
import com.theinnerhour.b2b.activity.LearningHubActivity;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.activity.PushActivity;
import com.theinnerhour.b2b.activity.RelaxationActivity;
import com.theinnerhour.b2b.activity.SevenDayProgressActivity;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.utils.V3DashboardUtils;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertCareInfoActivity;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesExperimentActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.DbDynamicCardsModel;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.AnimUtils;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.RoutingType;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import gv.n;
import hs.k;
import ik.l1;
import is.q;
import is.u;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.e0;
import pp.c;
import sp.b;
import tr.r;
/* compiled from: V3DashboardUtils.kt */
/* loaded from: classes2.dex */
public final class V3DashboardUtils {

    /* renamed from: a  reason: collision with root package name */
    public final String f10899a = LogHelper.INSTANCE.makeLogTag(V3DashboardUtils.class);

    /* renamed from: b  reason: collision with root package name */
    public V3DashboardActivity f10900b;

    public static ArrayList b(int i6, Course course) {
        ArrayList arrayList = new ArrayList();
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        for (int i10 = 23; i10 < 31; i10++) {
                            if (course.getPlanV3().size() > i10) {
                                arrayList.add(course.getPlanV3().get(i10));
                            }
                        }
                    }
                } else {
                    for (int i11 = 15; i11 < 23; i11++) {
                        if (course.getPlanV3().size() > i11) {
                            arrayList.add(course.getPlanV3().get(i11));
                        }
                    }
                }
            } else {
                for (int i12 = 8; i12 < 15; i12++) {
                    if (course.getPlanV3().size() > i12) {
                        arrayList.add(course.getPlanV3().get(i12));
                    }
                }
            }
        } else {
            for (int i13 = 0; i13 < 8; i13++) {
                if (course.getPlanV3().size() > i13) {
                    arrayList.add(course.getPlanV3().get(i13));
                }
            }
        }
        return arrayList;
    }

    public static String g(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2114782937:
                    if (str.equals(Constants.COURSE_HAPPINESS)) {
                        return "Happiness";
                    }
                    break;
                case -1617042330:
                    if (str.equals(Constants.COURSE_DEPRESSION)) {
                        return "Depression";
                    }
                    break;
                case -891989580:
                    if (str.equals(Constants.COURSE_STRESS)) {
                        return "Stress";
                    }
                    break;
                case 92960775:
                    if (str.equals(Constants.COURSE_ANGER)) {
                        return "Anger management";
                    }
                    break;
                case 109522647:
                    if (str.equals(Constants.COURSE_SLEEP)) {
                        return "Sleep";
                    }
                    break;
                case 113319009:
                    if (str.equals(Constants.COURSE_WORRY)) {
                        return "Anxiety";
                    }
                    break;
            }
        }
        return "";
    }

    public static boolean i() {
        String g5 = b.g();
        if (g5 != null) {
            switch (g5.hashCode()) {
                case -2114782937:
                    if (g5.equals(Constants.COURSE_HAPPINESS)) {
                        boolean booleanValue = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_HAPPY, true);
                        if (booleanValue) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_HAPPY, false);
                        }
                        return booleanValue;
                    }
                    break;
                case -1617042330:
                    if (g5.equals(Constants.COURSE_DEPRESSION)) {
                        boolean booleanValue2 = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_MOOD, true);
                        if (booleanValue2) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_MOOD, false);
                        }
                        return booleanValue2;
                    }
                    break;
                case -891989580:
                    if (g5.equals(Constants.COURSE_STRESS)) {
                        boolean booleanValue3 = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_STRESS, true);
                        if (booleanValue3) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_STRESS, false);
                        }
                        return booleanValue3;
                    }
                    break;
                case 92960775:
                    if (g5.equals(Constants.COURSE_ANGER)) {
                        boolean booleanValue4 = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_ANGER, true);
                        if (booleanValue4) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_ANGER, false);
                        }
                        return booleanValue4;
                    }
                    break;
                case 109522647:
                    if (g5.equals(Constants.COURSE_SLEEP)) {
                        boolean booleanValue5 = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_SLEEP, true);
                        if (booleanValue5) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_SLEEP, false);
                        }
                        return booleanValue5;
                    }
                    break;
                case 113319009:
                    if (g5.equals(Constants.COURSE_WORRY)) {
                        boolean booleanValue6 = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_ANXIETY, true);
                        if (booleanValue6) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_ANXIETY, false);
                        }
                        return booleanValue6;
                    }
                    break;
            }
        }
        return false;
    }

    public static boolean j(int i6, Course course) {
        boolean z10;
        ArrayList b10 = b(i6, course);
        CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) u.p2(b10);
        if (courseDayModelV1 != null) {
            z10 = i.b(courseDayModelV1.isAssessment(), Boolean.TRUE);
        } else {
            z10 = false;
        }
        if (z10) {
            q.V1(b10);
        }
        if (b10.isEmpty() || !((CourseDayModelV1) u.o2(b10)).isCompleted()) {
            return false;
        }
        if (((CourseDayModelV1) u.o2(b10)).getStart_date() != 0 && ((CourseDayModelV1) u.o2(b10)).getStart_date() > Utils.INSTANCE.getTodayTimeInSeconds()) {
            return false;
        }
        return true;
    }

    public final void a(int i6) {
        Boolean bool;
        if (f().f10756z == 1 && i6 == 7) {
            f().startActivity(new Intent(f(), SevenDayProgressActivity.class));
        } else if (f().f10756z == 2 && i6 == 14) {
            f().startActivity(new Intent(f(), SevenDayProgressActivity.class));
        } else if (f().f10756z == 3 && i6 == 22) {
            f().startActivity(new Intent(f(), SevenDayProgressActivity.class));
        } else if (f().f10756z == 4 && i6 == 29) {
            f().startActivity(new Intent(f(), SevenDayProgressActivity.class));
        }
        try {
            if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION) && i6 == 0 && FirebasePersistence.getInstance().getUserCourse().size() == 1 && !ApplicationPersistence.getInstance().getBooleanValue("onboarding_complete", false)) {
                if (FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3().size() > 1) {
                    ApplicationPersistence.getInstance().setBooleanValue("onboarding_complete", true);
                    f();
                    if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        p();
                    } else if (!i.b(ApplicationPersistence.getInstance().getStringValue(Constants.PR_COUPON_CODE), "")) {
                        V3DashboardActivity f = f();
                        f.startActivity(new Intent(f, DeeplinkCodeActivationActivity.class));
                    } else {
                        V3DashboardActivity f2 = f();
                        Intent putExtra = r.s(f(), false).putExtra("source", "assessment").putExtra("tutorial", true);
                        Intent intent = f().getIntent();
                        if (intent != null) {
                            bool = Boolean.valueOf(intent.getBooleanExtra("onboarding_flow_new_user", false));
                        } else {
                            bool = null;
                        }
                        f2.startActivityForResult(putExtra.putExtra("onboarding_flow_new_user", bool), f().Q);
                    }
                }
            } else if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && i6 == 0 && FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3().size() > 1) {
                f().startActivityForResult(r.s(f(), false).putExtra("source", "assessment"), f().N);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("Exception when setting up onboarding tutorial", e10);
        }
        Intent intent2 = f().getIntent();
        if (intent2 != null) {
            intent2.removeExtra("onboarding_flow_new_user");
        }
    }

    public final void c() {
        try {
            if (BottomSheetBehavior.from((ConstraintLayout) f().n0(R.id.clPlanExperimentWeekSwitcherLayout)).getState() == 4) {
                BottomSheetBehavior.from((ConstraintLayout) f().n0(R.id.clPlanExperimentWeekSwitcherLayout)).setState(3);
            } else {
                BottomSheetBehavior.from((ConstraintLayout) f().n0(R.id.clPlanExperimentWeekSwitcherLayout)).setState(4);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10899a, "exception", e10);
        }
    }

    public final void d() {
        try {
            if (((LinearLayout) f().n0(R.id.llSwitchCourse)).getVisibility() == 0) {
                Utils utils = Utils.INSTANCE;
                LinearLayout linearLayout = (LinearLayout) f().n0(R.id.llSwitchCourse);
                i.f(linearLayout, "activity.llSwitchCourse");
                Utils.collapse$default(utils, linearLayout, 0L, 2, null);
                f().n0(R.id.viewSwitchCourseBG).setVisibility(8);
                ((AppCompatImageView) f().n0(R.id.ivSwitchCourse)).startAnimation(utils.rotateBy180(180.0f, 360.0f));
            } else {
                Utils utils2 = Utils.INSTANCE;
                LinearLayout linearLayout2 = (LinearLayout) f().n0(R.id.llSwitchCourse);
                i.f(linearLayout2, "activity.llSwitchCourse");
                Utils.expand$default(utils2, linearLayout2, 0L, 2, null);
                f().n0(R.id.viewSwitchCourseBG).setVisibility(0);
                ((AppCompatImageView) f().n0(R.id.ivSwitchCourse)).startAnimation(utils2.rotateBy180(0.0f, 180.0f));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10899a, "exception", e10);
        }
    }

    public final void e() {
        try {
            if (((LinearLayout) f().n0(R.id.switchWeekLayout)).getVisibility() == 0) {
                Utils utils = Utils.INSTANCE;
                LinearLayout linearLayout = (LinearLayout) f().n0(R.id.switchWeekLayout);
                i.f(linearLayout, "activity.switchWeekLayout");
                Utils.collapse$default(utils, linearLayout, 0L, 2, null);
                f().n0(R.id.viewSwitchWeekBG).setVisibility(8);
            } else {
                Utils utils2 = Utils.INSTANCE;
                LinearLayout linearLayout2 = (LinearLayout) f().n0(R.id.switchWeekLayout);
                i.f(linearLayout2, "activity.switchWeekLayout");
                Utils.expand$default(utils2, linearLayout2, 0L, 2, null);
                f().n0(R.id.viewSwitchWeekBG).setVisibility(0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10899a, "exception", e10);
        }
    }

    public final V3DashboardActivity f() {
        V3DashboardActivity v3DashboardActivity = this.f10900b;
        if (v3DashboardActivity != null) {
            return v3DashboardActivity;
        }
        i.q(Constants.SCREEN_ACTIVITY);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, com.theinnerhour.b2b.model.DbDynamicCardsModel] */
    public final void h(final FrameLayout frameLayout, Course course, final int i6) {
        String str;
        boolean z10;
        Type type;
        long j10;
        sf.i iVar;
        String str2;
        x xVar;
        final Type type2;
        String str3;
        DbDynamicCardsModel dbDynamicCardsModel;
        DbDynamicCardsModel dbDynamicCardsModel2;
        String str4 = this.f10899a;
        try {
            frameLayout.removeAllViews();
            frameLayout.setVisibility(8);
            final x xVar2 = new x();
            xVar2.f23469u = new ArrayList();
            Utils utils = Utils.INSTANCE;
            Calendar todayCalendar = utils.getTodayCalendar();
            String stringValue = ApplicationPersistence.getInstance().getStringValue("dynamic_cards_v2");
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.i(str4, "dynamic cards data " + stringValue);
            final sf.i iVar2 = new sf.i();
            Type type3 = new TypeToken<ArrayList<DbDynamicCardsModel>>() { // from class: com.theinnerhour.b2b.components.dashboard.utils.V3DashboardUtils$initDynamicCards$typeToken$1
            }.getType();
            if (stringValue != null && stringValue.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                DbDynamicCardsModel dbDynamicCardsModel3 = new DbDynamicCardsModel();
                dbDynamicCardsModel3.setType("db_day2");
                ((ArrayList) xVar2.f23469u).add(dbDynamicCardsModel3);
                DbDynamicCardsModel dbDynamicCardsModel4 = new DbDynamicCardsModel();
                dbDynamicCardsModel4.setType("db_day3");
                ((ArrayList) xVar2.f23469u).add(dbDynamicCardsModel4);
                ApplicationPersistence.getInstance().setStringValueAsync("dynamic_cards_v2", iVar2.h(xVar2.f23469u, type3));
                ApplicationPersistence.getInstance().setLongValueAsync("dc_v2_app_open_date", todayCalendar.getTimeInMillis());
                ApplicationPersistence.getInstance().setLongValueAsync("dc_v2_app_open_seq", 1L);
                type = type3;
                j10 = 1;
            } else {
                ?? c10 = iVar2.c(stringValue, type3);
                i.f(c10, "gson.fromJson(dcStr, typeToken)");
                xVar2.f23469u = c10;
                type = type3;
                todayCalendar.setTimeInMillis(ApplicationPersistence.getInstance().getLongValue("dc_v2_app_open_date", utils.getTodayCalendar().getTimeInMillis()));
                long longValue = ApplicationPersistence.getInstance().getLongValue("dc_v2_app_open_seq", 1L);
                if (todayCalendar.getTimeInMillis() < utils.getTodayCalendar().getTimeInMillis()) {
                    todayCalendar.setTimeInMillis(utils.getTodayCalendar().getTimeInMillis());
                    long j11 = longValue + 1;
                    ApplicationPersistence.getInstance().setLongValueAsync("dc_v2_app_open_date", todayCalendar.getTimeInMillis());
                    ApplicationPersistence.getInstance().setLongValueAsync("dc_v2_app_open_seq", j11);
                    j10 = j11;
                } else {
                    j10 = longValue;
                }
            }
            int i10 = (j10 > 3L ? 1 : (j10 == 3L ? 0 : -1));
            if (i10 <= 0 || j10 >= 10) {
                final x xVar3 = new x();
                Iterator it = ((Iterable) xVar2.f23469u).iterator();
                while (it.hasNext()) {
                    ?? r72 = (DbDynamicCardsModel) it.next();
                    Iterator it2 = it;
                    if (r72.getCard_status() < 2) {
                        if (i.b(r72.getType(), "db_day2") && j10 == 2) {
                            xVar3.f23469u = r72;
                            if (FirebasePersistence.getInstance().getUser().getUserGoals().size() > 0 && (dbDynamicCardsModel2 = (DbDynamicCardsModel) xVar3.f23469u) != null) {
                                dbDynamicCardsModel2.setCard_status(100);
                            }
                        } else if (i.b(r72.getType(), "db_day3") && i10 == 0) {
                            xVar3.f23469u = r72;
                            if (ApplicationPersistence.getInstance().getBooleanValue("relief_box_open", false) && (dbDynamicCardsModel = (DbDynamicCardsModel) xVar3.f23469u) != null) {
                                dbDynamicCardsModel.setCard_status(100);
                            }
                        }
                    }
                    it = it2;
                }
                final DbDynamicCardsModel dbDynamicCardsModel5 = (DbDynamicCardsModel) xVar3.f23469u;
                if (dbDynamicCardsModel5 != null) {
                    try {
                        if (dbDynamicCardsModel5.getCard_status() < 2) {
                            final View card = f().getLayoutInflater().inflate(R.layout.row_dashboard_dynamic_card, (ViewGroup) frameLayout, false);
                            V3DashboardActivity f = f();
                            i.f(card, "card");
                            final Intent dynamicCard = CourseUtilKt.setDynamicCard(dbDynamicCardsModel5, f, card);
                            str = str4;
                            type2 = type;
                            str3 = "card";
                            iVar = iVar2;
                            xVar = xVar2;
                            str2 = "dynamic_cards_v2";
                            try {
                                ((CardView) card.findViewById(R.id.dynamicCardContainer)).setOnClickListener(new View.OnClickListener() { // from class: ll.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        View view2 = card;
                                        Type type4 = type2;
                                        int i11 = i6;
                                        x finalCardObj = x.this;
                                        i.g(finalCardObj, "$finalCardObj");
                                        FrameLayout flDynamicCards = frameLayout;
                                        i.g(flDynamicCards, "$flDynamicCards");
                                        DbDynamicCardsModel cardObj = dbDynamicCardsModel5;
                                        i.g(cardObj, "$cardObj");
                                        sf.i gson = iVar2;
                                        i.g(gson, "$gson");
                                        x dbCardList = xVar2;
                                        i.g(dbCardList, "$dbCardList");
                                        V3DashboardUtils this$0 = this;
                                        i.g(this$0, "this$0");
                                        try {
                                            T t3 = finalCardObj.f23469u;
                                            i.d(t3);
                                            if (i.b(((DbDynamicCardsModel) t3).getType(), "db_day2")) {
                                                ApplicationPersistence.getInstance().setBooleanValue("show_notification_cm", true);
                                            }
                                            flDynamicCards.setVisibility(8);
                                            flDynamicCards.removeView(view2);
                                            Intent intent = dynamicCard;
                                            if (intent != null) {
                                                this$0.f().startActivityForResult(intent, i11);
                                            }
                                            cardObj.setCard_status(2);
                                            ApplicationPersistence.getInstance().setStringValueAsync("dynamic_cards_v2", gson.h(dbCardList.f23469u, type4));
                                            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                                            analyticsBundle.putString("type", cardObj.getType());
                                            UtilsKt.fireAnalytics("dashboard_dc_click", analyticsBundle);
                                        } catch (Exception e10) {
                                            LogHelper.INSTANCE.e(this$0.f10899a, "Exception", e10);
                                        }
                                    }
                                });
                                frameLayout.setVisibility(8);
                                frameLayout.addView(card);
                                dbDynamicCardsModel5.setCard_status(1);
                            } catch (Exception e10) {
                                e = e10;
                                LogHelper.INSTANCE.e(str, "exception", e);
                                return;
                            }
                        } else {
                            iVar = iVar2;
                            str2 = "dynamic_cards_v2";
                            str = str4;
                            xVar = xVar2;
                            type2 = type;
                            str3 = "card";
                        }
                        ApplicationPersistence.getInstance().setStringValueAsync(str2, iVar.h(xVar.f23469u, type2));
                        if (course.getCourseOpenDay() < 10 && !FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("isSurveyShown")) {
                            DbDynamicCardsModel dbDynamicCardsModel6 = new DbDynamicCardsModel();
                            dbDynamicCardsModel6.setType("db_day10");
                            View inflate = f().getLayoutInflater().inflate(R.layout.row_dashboard_dynamic_card, (ViewGroup) frameLayout, false);
                            V3DashboardActivity f2 = f();
                            i.f(inflate, str3);
                            try {
                                ((CardView) inflate.findViewById(R.id.dynamicCardContainer)).setOnClickListener(new l1(CourseUtilKt.setDynamicCard(dbDynamicCardsModel6, f2, inflate), this, i6, 4));
                                frameLayout.setVisibility(0);
                                frameLayout.addView(inflate);
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                LogHelper.INSTANCE.e(str, "exception", e);
                                return;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str = str4;
                        LogHelper.INSTANCE.e(str, "exception", e);
                        return;
                    }
                }
            }
            str3 = "card";
            str = str4;
            if (course.getCourseOpenDay() < 10) {
            }
        } catch (Exception e13) {
            e = e13;
            str = str4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:371:0x0a1e A[Catch: Exception -> 0x0d02, TRY_LEAVE, TryCatch #1 {Exception -> 0x0d02, blocks: (B:3:0x0010, B:6:0x0022, B:371:0x0a1e, B:374:0x0a38, B:376:0x0a68, B:377:0x0a88, B:379:0x0a9a, B:381:0x0aae, B:383:0x0ac1, B:385:0x0aca, B:387:0x0add, B:388:0x0ae6, B:390:0x0af0, B:391:0x0afb, B:393:0x0b1a, B:395:0x0b49, B:397:0x0b51, B:399:0x0b5b, B:401:0x0b61, B:405:0x0b6b, B:394:0x0b32, B:384:0x0ac6, B:406:0x0b75, B:408:0x0b81, B:410:0x0b92, B:412:0x0ba7, B:414:0x0bc6, B:416:0x0be7, B:417:0x0c07, B:419:0x0c19, B:421:0x0c2d, B:423:0x0c40, B:425:0x0c4a, B:427:0x0c5d, B:428:0x0c64, B:430:0x0c6e, B:431:0x0c79, B:433:0x0c98, B:435:0x0cc7, B:437:0x0ccf, B:439:0x0cd9, B:441:0x0cdf, B:445:0x0ce9, B:434:0x0cb0, B:424:0x0c46, B:413:0x0bb7, B:446:0x0cf2, B:9:0x0038, B:11:0x0040, B:12:0x0050, B:14:0x0058, B:15:0x0068, B:18:0x007a, B:19:0x0092, B:22:0x00a2, B:23:0x00c3, B:25:0x00cb, B:26:0x00d8, B:28:0x00e0, B:30:0x00f8, B:32:0x0100, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:42:0x0123, B:44:0x0130, B:49:0x013c, B:51:0x0145, B:56:0x0151, B:58:0x015a, B:63:0x0166, B:64:0x016d, B:69:0x0179, B:70:0x0180, B:75:0x018c, B:76:0x0193, B:81:0x019f, B:82:0x01a6, B:87:0x01b2, B:88:0x01b9, B:93:0x01c5, B:96:0x01d4, B:98:0x01dc, B:99:0x01e9, B:102:0x01f3, B:104:0x0220, B:105:0x0230, B:107:0x023c, B:109:0x0256, B:111:0x026c, B:114:0x0276, B:117:0x028f, B:119:0x0297, B:120:0x02aa, B:123:0x02b4, B:124:0x02c7, B:126:0x02cf, B:129:0x02d9, B:132:0x02e9, B:134:0x02f3, B:136:0x02f9, B:138:0x02ff, B:140:0x0309, B:141:0x031f, B:143:0x0327, B:145:0x0331, B:147:0x0337, B:149:0x033d, B:151:0x0347, B:153:0x0361, B:156:0x036d, B:158:0x0377, B:160:0x037d, B:162:0x0383, B:164:0x038d, B:166:0x039a, B:168:0x03b6, B:167:0x03aa, B:169:0x03d4, B:173:0x03eb, B:176:0x0415, B:178:0x041f, B:179:0x042c, B:181:0x0434, B:182:0x043f, B:185:0x0449, B:186:0x0464, B:188:0x046c, B:189:0x0477, B:191:0x047f, B:193:0x0487, B:196:0x049b, B:198:0x04a5, B:200:0x04ab, B:201:0x04ba, B:202:0x04c9, B:203:0x04e3, B:205:0x04eb, B:207:0x04f5, B:209:0x04fb, B:210:0x050a, B:211:0x0519, B:212:0x0533, B:214:0x053b, B:215:0x0548, B:217:0x0550, B:218:0x055d, B:220:0x0565, B:222:0x0573, B:223:0x0584, B:225:0x058c, B:227:0x0594, B:230:0x059e, B:232:0x05a6, B:234:0x05ae, B:235:0x05d6, B:240:0x05e3, B:242:0x05f1, B:244:0x0628, B:246:0x0630, B:248:0x0640, B:250:0x0646, B:253:0x064d, B:255:0x0655, B:256:0x0662, B:258:0x066a, B:259:0x067a, B:261:0x0682, B:263:0x0696, B:267:0x06ba, B:269:0x06c2, B:270:0x06d2, B:272:0x06da, B:273:0x06ea, B:275:0x06f2, B:276:0x0701, B:278:0x0709, B:279:0x0718, B:281:0x0720, B:282:0x072f, B:284:0x0737, B:286:0x0741, B:288:0x0747, B:289:0x0755, B:291:0x0766, B:292:0x0780, B:294:0x0788, B:295:0x0797, B:297:0x079f, B:298:0x07ae, B:300:0x07b6, B:301:0x07c5, B:303:0x07cd, B:304:0x07e4, B:306:0x07ec, B:308:0x0805, B:310:0x080a, B:309:0x0808, B:311:0x0816, B:313:0x081e, B:314:0x0837, B:316:0x083f, B:318:0x0847, B:321:0x0851, B:323:0x0859, B:324:0x0874, B:326:0x087c, B:327:0x0895, B:329:0x089d, B:330:0x08c1, B:332:0x08c9, B:333:0x08f7, B:335:0x08ff, B:337:0x0909, B:339:0x090f, B:341:0x0917, B:343:0x091f, B:344:0x0939, B:346:0x0941, B:348:0x094b, B:350:0x0951, B:352:0x0959, B:354:0x0961, B:355:0x097b, B:357:0x0983, B:359:0x099c, B:361:0x09b6, B:363:0x09d3, B:364:0x09e0, B:366:0x09e8, B:265:0x06a8, B:368:0x09f4, B:369:0x0a01), top: B:453:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0add A[Catch: Exception -> 0x0d02, TryCatch #1 {Exception -> 0x0d02, blocks: (B:3:0x0010, B:6:0x0022, B:371:0x0a1e, B:374:0x0a38, B:376:0x0a68, B:377:0x0a88, B:379:0x0a9a, B:381:0x0aae, B:383:0x0ac1, B:385:0x0aca, B:387:0x0add, B:388:0x0ae6, B:390:0x0af0, B:391:0x0afb, B:393:0x0b1a, B:395:0x0b49, B:397:0x0b51, B:399:0x0b5b, B:401:0x0b61, B:405:0x0b6b, B:394:0x0b32, B:384:0x0ac6, B:406:0x0b75, B:408:0x0b81, B:410:0x0b92, B:412:0x0ba7, B:414:0x0bc6, B:416:0x0be7, B:417:0x0c07, B:419:0x0c19, B:421:0x0c2d, B:423:0x0c40, B:425:0x0c4a, B:427:0x0c5d, B:428:0x0c64, B:430:0x0c6e, B:431:0x0c79, B:433:0x0c98, B:435:0x0cc7, B:437:0x0ccf, B:439:0x0cd9, B:441:0x0cdf, B:445:0x0ce9, B:434:0x0cb0, B:424:0x0c46, B:413:0x0bb7, B:446:0x0cf2, B:9:0x0038, B:11:0x0040, B:12:0x0050, B:14:0x0058, B:15:0x0068, B:18:0x007a, B:19:0x0092, B:22:0x00a2, B:23:0x00c3, B:25:0x00cb, B:26:0x00d8, B:28:0x00e0, B:30:0x00f8, B:32:0x0100, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:42:0x0123, B:44:0x0130, B:49:0x013c, B:51:0x0145, B:56:0x0151, B:58:0x015a, B:63:0x0166, B:64:0x016d, B:69:0x0179, B:70:0x0180, B:75:0x018c, B:76:0x0193, B:81:0x019f, B:82:0x01a6, B:87:0x01b2, B:88:0x01b9, B:93:0x01c5, B:96:0x01d4, B:98:0x01dc, B:99:0x01e9, B:102:0x01f3, B:104:0x0220, B:105:0x0230, B:107:0x023c, B:109:0x0256, B:111:0x026c, B:114:0x0276, B:117:0x028f, B:119:0x0297, B:120:0x02aa, B:123:0x02b4, B:124:0x02c7, B:126:0x02cf, B:129:0x02d9, B:132:0x02e9, B:134:0x02f3, B:136:0x02f9, B:138:0x02ff, B:140:0x0309, B:141:0x031f, B:143:0x0327, B:145:0x0331, B:147:0x0337, B:149:0x033d, B:151:0x0347, B:153:0x0361, B:156:0x036d, B:158:0x0377, B:160:0x037d, B:162:0x0383, B:164:0x038d, B:166:0x039a, B:168:0x03b6, B:167:0x03aa, B:169:0x03d4, B:173:0x03eb, B:176:0x0415, B:178:0x041f, B:179:0x042c, B:181:0x0434, B:182:0x043f, B:185:0x0449, B:186:0x0464, B:188:0x046c, B:189:0x0477, B:191:0x047f, B:193:0x0487, B:196:0x049b, B:198:0x04a5, B:200:0x04ab, B:201:0x04ba, B:202:0x04c9, B:203:0x04e3, B:205:0x04eb, B:207:0x04f5, B:209:0x04fb, B:210:0x050a, B:211:0x0519, B:212:0x0533, B:214:0x053b, B:215:0x0548, B:217:0x0550, B:218:0x055d, B:220:0x0565, B:222:0x0573, B:223:0x0584, B:225:0x058c, B:227:0x0594, B:230:0x059e, B:232:0x05a6, B:234:0x05ae, B:235:0x05d6, B:240:0x05e3, B:242:0x05f1, B:244:0x0628, B:246:0x0630, B:248:0x0640, B:250:0x0646, B:253:0x064d, B:255:0x0655, B:256:0x0662, B:258:0x066a, B:259:0x067a, B:261:0x0682, B:263:0x0696, B:267:0x06ba, B:269:0x06c2, B:270:0x06d2, B:272:0x06da, B:273:0x06ea, B:275:0x06f2, B:276:0x0701, B:278:0x0709, B:279:0x0718, B:281:0x0720, B:282:0x072f, B:284:0x0737, B:286:0x0741, B:288:0x0747, B:289:0x0755, B:291:0x0766, B:292:0x0780, B:294:0x0788, B:295:0x0797, B:297:0x079f, B:298:0x07ae, B:300:0x07b6, B:301:0x07c5, B:303:0x07cd, B:304:0x07e4, B:306:0x07ec, B:308:0x0805, B:310:0x080a, B:309:0x0808, B:311:0x0816, B:313:0x081e, B:314:0x0837, B:316:0x083f, B:318:0x0847, B:321:0x0851, B:323:0x0859, B:324:0x0874, B:326:0x087c, B:327:0x0895, B:329:0x089d, B:330:0x08c1, B:332:0x08c9, B:333:0x08f7, B:335:0x08ff, B:337:0x0909, B:339:0x090f, B:341:0x0917, B:343:0x091f, B:344:0x0939, B:346:0x0941, B:348:0x094b, B:350:0x0951, B:352:0x0959, B:354:0x0961, B:355:0x097b, B:357:0x0983, B:359:0x099c, B:361:0x09b6, B:363:0x09d3, B:364:0x09e0, B:366:0x09e8, B:265:0x06a8, B:368:0x09f4, B:369:0x0a01), top: B:453:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0af0 A[Catch: Exception -> 0x0d02, TryCatch #1 {Exception -> 0x0d02, blocks: (B:3:0x0010, B:6:0x0022, B:371:0x0a1e, B:374:0x0a38, B:376:0x0a68, B:377:0x0a88, B:379:0x0a9a, B:381:0x0aae, B:383:0x0ac1, B:385:0x0aca, B:387:0x0add, B:388:0x0ae6, B:390:0x0af0, B:391:0x0afb, B:393:0x0b1a, B:395:0x0b49, B:397:0x0b51, B:399:0x0b5b, B:401:0x0b61, B:405:0x0b6b, B:394:0x0b32, B:384:0x0ac6, B:406:0x0b75, B:408:0x0b81, B:410:0x0b92, B:412:0x0ba7, B:414:0x0bc6, B:416:0x0be7, B:417:0x0c07, B:419:0x0c19, B:421:0x0c2d, B:423:0x0c40, B:425:0x0c4a, B:427:0x0c5d, B:428:0x0c64, B:430:0x0c6e, B:431:0x0c79, B:433:0x0c98, B:435:0x0cc7, B:437:0x0ccf, B:439:0x0cd9, B:441:0x0cdf, B:445:0x0ce9, B:434:0x0cb0, B:424:0x0c46, B:413:0x0bb7, B:446:0x0cf2, B:9:0x0038, B:11:0x0040, B:12:0x0050, B:14:0x0058, B:15:0x0068, B:18:0x007a, B:19:0x0092, B:22:0x00a2, B:23:0x00c3, B:25:0x00cb, B:26:0x00d8, B:28:0x00e0, B:30:0x00f8, B:32:0x0100, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:42:0x0123, B:44:0x0130, B:49:0x013c, B:51:0x0145, B:56:0x0151, B:58:0x015a, B:63:0x0166, B:64:0x016d, B:69:0x0179, B:70:0x0180, B:75:0x018c, B:76:0x0193, B:81:0x019f, B:82:0x01a6, B:87:0x01b2, B:88:0x01b9, B:93:0x01c5, B:96:0x01d4, B:98:0x01dc, B:99:0x01e9, B:102:0x01f3, B:104:0x0220, B:105:0x0230, B:107:0x023c, B:109:0x0256, B:111:0x026c, B:114:0x0276, B:117:0x028f, B:119:0x0297, B:120:0x02aa, B:123:0x02b4, B:124:0x02c7, B:126:0x02cf, B:129:0x02d9, B:132:0x02e9, B:134:0x02f3, B:136:0x02f9, B:138:0x02ff, B:140:0x0309, B:141:0x031f, B:143:0x0327, B:145:0x0331, B:147:0x0337, B:149:0x033d, B:151:0x0347, B:153:0x0361, B:156:0x036d, B:158:0x0377, B:160:0x037d, B:162:0x0383, B:164:0x038d, B:166:0x039a, B:168:0x03b6, B:167:0x03aa, B:169:0x03d4, B:173:0x03eb, B:176:0x0415, B:178:0x041f, B:179:0x042c, B:181:0x0434, B:182:0x043f, B:185:0x0449, B:186:0x0464, B:188:0x046c, B:189:0x0477, B:191:0x047f, B:193:0x0487, B:196:0x049b, B:198:0x04a5, B:200:0x04ab, B:201:0x04ba, B:202:0x04c9, B:203:0x04e3, B:205:0x04eb, B:207:0x04f5, B:209:0x04fb, B:210:0x050a, B:211:0x0519, B:212:0x0533, B:214:0x053b, B:215:0x0548, B:217:0x0550, B:218:0x055d, B:220:0x0565, B:222:0x0573, B:223:0x0584, B:225:0x058c, B:227:0x0594, B:230:0x059e, B:232:0x05a6, B:234:0x05ae, B:235:0x05d6, B:240:0x05e3, B:242:0x05f1, B:244:0x0628, B:246:0x0630, B:248:0x0640, B:250:0x0646, B:253:0x064d, B:255:0x0655, B:256:0x0662, B:258:0x066a, B:259:0x067a, B:261:0x0682, B:263:0x0696, B:267:0x06ba, B:269:0x06c2, B:270:0x06d2, B:272:0x06da, B:273:0x06ea, B:275:0x06f2, B:276:0x0701, B:278:0x0709, B:279:0x0718, B:281:0x0720, B:282:0x072f, B:284:0x0737, B:286:0x0741, B:288:0x0747, B:289:0x0755, B:291:0x0766, B:292:0x0780, B:294:0x0788, B:295:0x0797, B:297:0x079f, B:298:0x07ae, B:300:0x07b6, B:301:0x07c5, B:303:0x07cd, B:304:0x07e4, B:306:0x07ec, B:308:0x0805, B:310:0x080a, B:309:0x0808, B:311:0x0816, B:313:0x081e, B:314:0x0837, B:316:0x083f, B:318:0x0847, B:321:0x0851, B:323:0x0859, B:324:0x0874, B:326:0x087c, B:327:0x0895, B:329:0x089d, B:330:0x08c1, B:332:0x08c9, B:333:0x08f7, B:335:0x08ff, B:337:0x0909, B:339:0x090f, B:341:0x0917, B:343:0x091f, B:344:0x0939, B:346:0x0941, B:348:0x094b, B:350:0x0951, B:352:0x0959, B:354:0x0961, B:355:0x097b, B:357:0x0983, B:359:0x099c, B:361:0x09b6, B:363:0x09d3, B:364:0x09e0, B:366:0x09e8, B:265:0x06a8, B:368:0x09f4, B:369:0x0a01), top: B:453:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0b1a A[Catch: Exception -> 0x0d02, TryCatch #1 {Exception -> 0x0d02, blocks: (B:3:0x0010, B:6:0x0022, B:371:0x0a1e, B:374:0x0a38, B:376:0x0a68, B:377:0x0a88, B:379:0x0a9a, B:381:0x0aae, B:383:0x0ac1, B:385:0x0aca, B:387:0x0add, B:388:0x0ae6, B:390:0x0af0, B:391:0x0afb, B:393:0x0b1a, B:395:0x0b49, B:397:0x0b51, B:399:0x0b5b, B:401:0x0b61, B:405:0x0b6b, B:394:0x0b32, B:384:0x0ac6, B:406:0x0b75, B:408:0x0b81, B:410:0x0b92, B:412:0x0ba7, B:414:0x0bc6, B:416:0x0be7, B:417:0x0c07, B:419:0x0c19, B:421:0x0c2d, B:423:0x0c40, B:425:0x0c4a, B:427:0x0c5d, B:428:0x0c64, B:430:0x0c6e, B:431:0x0c79, B:433:0x0c98, B:435:0x0cc7, B:437:0x0ccf, B:439:0x0cd9, B:441:0x0cdf, B:445:0x0ce9, B:434:0x0cb0, B:424:0x0c46, B:413:0x0bb7, B:446:0x0cf2, B:9:0x0038, B:11:0x0040, B:12:0x0050, B:14:0x0058, B:15:0x0068, B:18:0x007a, B:19:0x0092, B:22:0x00a2, B:23:0x00c3, B:25:0x00cb, B:26:0x00d8, B:28:0x00e0, B:30:0x00f8, B:32:0x0100, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:42:0x0123, B:44:0x0130, B:49:0x013c, B:51:0x0145, B:56:0x0151, B:58:0x015a, B:63:0x0166, B:64:0x016d, B:69:0x0179, B:70:0x0180, B:75:0x018c, B:76:0x0193, B:81:0x019f, B:82:0x01a6, B:87:0x01b2, B:88:0x01b9, B:93:0x01c5, B:96:0x01d4, B:98:0x01dc, B:99:0x01e9, B:102:0x01f3, B:104:0x0220, B:105:0x0230, B:107:0x023c, B:109:0x0256, B:111:0x026c, B:114:0x0276, B:117:0x028f, B:119:0x0297, B:120:0x02aa, B:123:0x02b4, B:124:0x02c7, B:126:0x02cf, B:129:0x02d9, B:132:0x02e9, B:134:0x02f3, B:136:0x02f9, B:138:0x02ff, B:140:0x0309, B:141:0x031f, B:143:0x0327, B:145:0x0331, B:147:0x0337, B:149:0x033d, B:151:0x0347, B:153:0x0361, B:156:0x036d, B:158:0x0377, B:160:0x037d, B:162:0x0383, B:164:0x038d, B:166:0x039a, B:168:0x03b6, B:167:0x03aa, B:169:0x03d4, B:173:0x03eb, B:176:0x0415, B:178:0x041f, B:179:0x042c, B:181:0x0434, B:182:0x043f, B:185:0x0449, B:186:0x0464, B:188:0x046c, B:189:0x0477, B:191:0x047f, B:193:0x0487, B:196:0x049b, B:198:0x04a5, B:200:0x04ab, B:201:0x04ba, B:202:0x04c9, B:203:0x04e3, B:205:0x04eb, B:207:0x04f5, B:209:0x04fb, B:210:0x050a, B:211:0x0519, B:212:0x0533, B:214:0x053b, B:215:0x0548, B:217:0x0550, B:218:0x055d, B:220:0x0565, B:222:0x0573, B:223:0x0584, B:225:0x058c, B:227:0x0594, B:230:0x059e, B:232:0x05a6, B:234:0x05ae, B:235:0x05d6, B:240:0x05e3, B:242:0x05f1, B:244:0x0628, B:246:0x0630, B:248:0x0640, B:250:0x0646, B:253:0x064d, B:255:0x0655, B:256:0x0662, B:258:0x066a, B:259:0x067a, B:261:0x0682, B:263:0x0696, B:267:0x06ba, B:269:0x06c2, B:270:0x06d2, B:272:0x06da, B:273:0x06ea, B:275:0x06f2, B:276:0x0701, B:278:0x0709, B:279:0x0718, B:281:0x0720, B:282:0x072f, B:284:0x0737, B:286:0x0741, B:288:0x0747, B:289:0x0755, B:291:0x0766, B:292:0x0780, B:294:0x0788, B:295:0x0797, B:297:0x079f, B:298:0x07ae, B:300:0x07b6, B:301:0x07c5, B:303:0x07cd, B:304:0x07e4, B:306:0x07ec, B:308:0x0805, B:310:0x080a, B:309:0x0808, B:311:0x0816, B:313:0x081e, B:314:0x0837, B:316:0x083f, B:318:0x0847, B:321:0x0851, B:323:0x0859, B:324:0x0874, B:326:0x087c, B:327:0x0895, B:329:0x089d, B:330:0x08c1, B:332:0x08c9, B:333:0x08f7, B:335:0x08ff, B:337:0x0909, B:339:0x090f, B:341:0x0917, B:343:0x091f, B:344:0x0939, B:346:0x0941, B:348:0x094b, B:350:0x0951, B:352:0x0959, B:354:0x0961, B:355:0x097b, B:357:0x0983, B:359:0x099c, B:361:0x09b6, B:363:0x09d3, B:364:0x09e0, B:366:0x09e8, B:265:0x06a8, B:368:0x09f4, B:369:0x0a01), top: B:453:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0b32 A[Catch: Exception -> 0x0d02, TryCatch #1 {Exception -> 0x0d02, blocks: (B:3:0x0010, B:6:0x0022, B:371:0x0a1e, B:374:0x0a38, B:376:0x0a68, B:377:0x0a88, B:379:0x0a9a, B:381:0x0aae, B:383:0x0ac1, B:385:0x0aca, B:387:0x0add, B:388:0x0ae6, B:390:0x0af0, B:391:0x0afb, B:393:0x0b1a, B:395:0x0b49, B:397:0x0b51, B:399:0x0b5b, B:401:0x0b61, B:405:0x0b6b, B:394:0x0b32, B:384:0x0ac6, B:406:0x0b75, B:408:0x0b81, B:410:0x0b92, B:412:0x0ba7, B:414:0x0bc6, B:416:0x0be7, B:417:0x0c07, B:419:0x0c19, B:421:0x0c2d, B:423:0x0c40, B:425:0x0c4a, B:427:0x0c5d, B:428:0x0c64, B:430:0x0c6e, B:431:0x0c79, B:433:0x0c98, B:435:0x0cc7, B:437:0x0ccf, B:439:0x0cd9, B:441:0x0cdf, B:445:0x0ce9, B:434:0x0cb0, B:424:0x0c46, B:413:0x0bb7, B:446:0x0cf2, B:9:0x0038, B:11:0x0040, B:12:0x0050, B:14:0x0058, B:15:0x0068, B:18:0x007a, B:19:0x0092, B:22:0x00a2, B:23:0x00c3, B:25:0x00cb, B:26:0x00d8, B:28:0x00e0, B:30:0x00f8, B:32:0x0100, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:42:0x0123, B:44:0x0130, B:49:0x013c, B:51:0x0145, B:56:0x0151, B:58:0x015a, B:63:0x0166, B:64:0x016d, B:69:0x0179, B:70:0x0180, B:75:0x018c, B:76:0x0193, B:81:0x019f, B:82:0x01a6, B:87:0x01b2, B:88:0x01b9, B:93:0x01c5, B:96:0x01d4, B:98:0x01dc, B:99:0x01e9, B:102:0x01f3, B:104:0x0220, B:105:0x0230, B:107:0x023c, B:109:0x0256, B:111:0x026c, B:114:0x0276, B:117:0x028f, B:119:0x0297, B:120:0x02aa, B:123:0x02b4, B:124:0x02c7, B:126:0x02cf, B:129:0x02d9, B:132:0x02e9, B:134:0x02f3, B:136:0x02f9, B:138:0x02ff, B:140:0x0309, B:141:0x031f, B:143:0x0327, B:145:0x0331, B:147:0x0337, B:149:0x033d, B:151:0x0347, B:153:0x0361, B:156:0x036d, B:158:0x0377, B:160:0x037d, B:162:0x0383, B:164:0x038d, B:166:0x039a, B:168:0x03b6, B:167:0x03aa, B:169:0x03d4, B:173:0x03eb, B:176:0x0415, B:178:0x041f, B:179:0x042c, B:181:0x0434, B:182:0x043f, B:185:0x0449, B:186:0x0464, B:188:0x046c, B:189:0x0477, B:191:0x047f, B:193:0x0487, B:196:0x049b, B:198:0x04a5, B:200:0x04ab, B:201:0x04ba, B:202:0x04c9, B:203:0x04e3, B:205:0x04eb, B:207:0x04f5, B:209:0x04fb, B:210:0x050a, B:211:0x0519, B:212:0x0533, B:214:0x053b, B:215:0x0548, B:217:0x0550, B:218:0x055d, B:220:0x0565, B:222:0x0573, B:223:0x0584, B:225:0x058c, B:227:0x0594, B:230:0x059e, B:232:0x05a6, B:234:0x05ae, B:235:0x05d6, B:240:0x05e3, B:242:0x05f1, B:244:0x0628, B:246:0x0630, B:248:0x0640, B:250:0x0646, B:253:0x064d, B:255:0x0655, B:256:0x0662, B:258:0x066a, B:259:0x067a, B:261:0x0682, B:263:0x0696, B:267:0x06ba, B:269:0x06c2, B:270:0x06d2, B:272:0x06da, B:273:0x06ea, B:275:0x06f2, B:276:0x0701, B:278:0x0709, B:279:0x0718, B:281:0x0720, B:282:0x072f, B:284:0x0737, B:286:0x0741, B:288:0x0747, B:289:0x0755, B:291:0x0766, B:292:0x0780, B:294:0x0788, B:295:0x0797, B:297:0x079f, B:298:0x07ae, B:300:0x07b6, B:301:0x07c5, B:303:0x07cd, B:304:0x07e4, B:306:0x07ec, B:308:0x0805, B:310:0x080a, B:309:0x0808, B:311:0x0816, B:313:0x081e, B:314:0x0837, B:316:0x083f, B:318:0x0847, B:321:0x0851, B:323:0x0859, B:324:0x0874, B:326:0x087c, B:327:0x0895, B:329:0x089d, B:330:0x08c1, B:332:0x08c9, B:333:0x08f7, B:335:0x08ff, B:337:0x0909, B:339:0x090f, B:341:0x0917, B:343:0x091f, B:344:0x0939, B:346:0x0941, B:348:0x094b, B:350:0x0951, B:352:0x0959, B:354:0x0961, B:355:0x097b, B:357:0x0983, B:359:0x099c, B:361:0x09b6, B:363:0x09d3, B:364:0x09e0, B:366:0x09e8, B:265:0x06a8, B:368:0x09f4, B:369:0x0a01), top: B:453:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0b51 A[Catch: Exception -> 0x0d02, TryCatch #1 {Exception -> 0x0d02, blocks: (B:3:0x0010, B:6:0x0022, B:371:0x0a1e, B:374:0x0a38, B:376:0x0a68, B:377:0x0a88, B:379:0x0a9a, B:381:0x0aae, B:383:0x0ac1, B:385:0x0aca, B:387:0x0add, B:388:0x0ae6, B:390:0x0af0, B:391:0x0afb, B:393:0x0b1a, B:395:0x0b49, B:397:0x0b51, B:399:0x0b5b, B:401:0x0b61, B:405:0x0b6b, B:394:0x0b32, B:384:0x0ac6, B:406:0x0b75, B:408:0x0b81, B:410:0x0b92, B:412:0x0ba7, B:414:0x0bc6, B:416:0x0be7, B:417:0x0c07, B:419:0x0c19, B:421:0x0c2d, B:423:0x0c40, B:425:0x0c4a, B:427:0x0c5d, B:428:0x0c64, B:430:0x0c6e, B:431:0x0c79, B:433:0x0c98, B:435:0x0cc7, B:437:0x0ccf, B:439:0x0cd9, B:441:0x0cdf, B:445:0x0ce9, B:434:0x0cb0, B:424:0x0c46, B:413:0x0bb7, B:446:0x0cf2, B:9:0x0038, B:11:0x0040, B:12:0x0050, B:14:0x0058, B:15:0x0068, B:18:0x007a, B:19:0x0092, B:22:0x00a2, B:23:0x00c3, B:25:0x00cb, B:26:0x00d8, B:28:0x00e0, B:30:0x00f8, B:32:0x0100, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:42:0x0123, B:44:0x0130, B:49:0x013c, B:51:0x0145, B:56:0x0151, B:58:0x015a, B:63:0x0166, B:64:0x016d, B:69:0x0179, B:70:0x0180, B:75:0x018c, B:76:0x0193, B:81:0x019f, B:82:0x01a6, B:87:0x01b2, B:88:0x01b9, B:93:0x01c5, B:96:0x01d4, B:98:0x01dc, B:99:0x01e9, B:102:0x01f3, B:104:0x0220, B:105:0x0230, B:107:0x023c, B:109:0x0256, B:111:0x026c, B:114:0x0276, B:117:0x028f, B:119:0x0297, B:120:0x02aa, B:123:0x02b4, B:124:0x02c7, B:126:0x02cf, B:129:0x02d9, B:132:0x02e9, B:134:0x02f3, B:136:0x02f9, B:138:0x02ff, B:140:0x0309, B:141:0x031f, B:143:0x0327, B:145:0x0331, B:147:0x0337, B:149:0x033d, B:151:0x0347, B:153:0x0361, B:156:0x036d, B:158:0x0377, B:160:0x037d, B:162:0x0383, B:164:0x038d, B:166:0x039a, B:168:0x03b6, B:167:0x03aa, B:169:0x03d4, B:173:0x03eb, B:176:0x0415, B:178:0x041f, B:179:0x042c, B:181:0x0434, B:182:0x043f, B:185:0x0449, B:186:0x0464, B:188:0x046c, B:189:0x0477, B:191:0x047f, B:193:0x0487, B:196:0x049b, B:198:0x04a5, B:200:0x04ab, B:201:0x04ba, B:202:0x04c9, B:203:0x04e3, B:205:0x04eb, B:207:0x04f5, B:209:0x04fb, B:210:0x050a, B:211:0x0519, B:212:0x0533, B:214:0x053b, B:215:0x0548, B:217:0x0550, B:218:0x055d, B:220:0x0565, B:222:0x0573, B:223:0x0584, B:225:0x058c, B:227:0x0594, B:230:0x059e, B:232:0x05a6, B:234:0x05ae, B:235:0x05d6, B:240:0x05e3, B:242:0x05f1, B:244:0x0628, B:246:0x0630, B:248:0x0640, B:250:0x0646, B:253:0x064d, B:255:0x0655, B:256:0x0662, B:258:0x066a, B:259:0x067a, B:261:0x0682, B:263:0x0696, B:267:0x06ba, B:269:0x06c2, B:270:0x06d2, B:272:0x06da, B:273:0x06ea, B:275:0x06f2, B:276:0x0701, B:278:0x0709, B:279:0x0718, B:281:0x0720, B:282:0x072f, B:284:0x0737, B:286:0x0741, B:288:0x0747, B:289:0x0755, B:291:0x0766, B:292:0x0780, B:294:0x0788, B:295:0x0797, B:297:0x079f, B:298:0x07ae, B:300:0x07b6, B:301:0x07c5, B:303:0x07cd, B:304:0x07e4, B:306:0x07ec, B:308:0x0805, B:310:0x080a, B:309:0x0808, B:311:0x0816, B:313:0x081e, B:314:0x0837, B:316:0x083f, B:318:0x0847, B:321:0x0851, B:323:0x0859, B:324:0x0874, B:326:0x087c, B:327:0x0895, B:329:0x089d, B:330:0x08c1, B:332:0x08c9, B:333:0x08f7, B:335:0x08ff, B:337:0x0909, B:339:0x090f, B:341:0x0917, B:343:0x091f, B:344:0x0939, B:346:0x0941, B:348:0x094b, B:350:0x0951, B:352:0x0959, B:354:0x0961, B:355:0x097b, B:357:0x0983, B:359:0x099c, B:361:0x09b6, B:363:0x09d3, B:364:0x09e0, B:366:0x09e8, B:265:0x06a8, B:368:0x09f4, B:369:0x0a01), top: B:453:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0c5d A[Catch: Exception -> 0x0d02, TryCatch #1 {Exception -> 0x0d02, blocks: (B:3:0x0010, B:6:0x0022, B:371:0x0a1e, B:374:0x0a38, B:376:0x0a68, B:377:0x0a88, B:379:0x0a9a, B:381:0x0aae, B:383:0x0ac1, B:385:0x0aca, B:387:0x0add, B:388:0x0ae6, B:390:0x0af0, B:391:0x0afb, B:393:0x0b1a, B:395:0x0b49, B:397:0x0b51, B:399:0x0b5b, B:401:0x0b61, B:405:0x0b6b, B:394:0x0b32, B:384:0x0ac6, B:406:0x0b75, B:408:0x0b81, B:410:0x0b92, B:412:0x0ba7, B:414:0x0bc6, B:416:0x0be7, B:417:0x0c07, B:419:0x0c19, B:421:0x0c2d, B:423:0x0c40, B:425:0x0c4a, B:427:0x0c5d, B:428:0x0c64, B:430:0x0c6e, B:431:0x0c79, B:433:0x0c98, B:435:0x0cc7, B:437:0x0ccf, B:439:0x0cd9, B:441:0x0cdf, B:445:0x0ce9, B:434:0x0cb0, B:424:0x0c46, B:413:0x0bb7, B:446:0x0cf2, B:9:0x0038, B:11:0x0040, B:12:0x0050, B:14:0x0058, B:15:0x0068, B:18:0x007a, B:19:0x0092, B:22:0x00a2, B:23:0x00c3, B:25:0x00cb, B:26:0x00d8, B:28:0x00e0, B:30:0x00f8, B:32:0x0100, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:42:0x0123, B:44:0x0130, B:49:0x013c, B:51:0x0145, B:56:0x0151, B:58:0x015a, B:63:0x0166, B:64:0x016d, B:69:0x0179, B:70:0x0180, B:75:0x018c, B:76:0x0193, B:81:0x019f, B:82:0x01a6, B:87:0x01b2, B:88:0x01b9, B:93:0x01c5, B:96:0x01d4, B:98:0x01dc, B:99:0x01e9, B:102:0x01f3, B:104:0x0220, B:105:0x0230, B:107:0x023c, B:109:0x0256, B:111:0x026c, B:114:0x0276, B:117:0x028f, B:119:0x0297, B:120:0x02aa, B:123:0x02b4, B:124:0x02c7, B:126:0x02cf, B:129:0x02d9, B:132:0x02e9, B:134:0x02f3, B:136:0x02f9, B:138:0x02ff, B:140:0x0309, B:141:0x031f, B:143:0x0327, B:145:0x0331, B:147:0x0337, B:149:0x033d, B:151:0x0347, B:153:0x0361, B:156:0x036d, B:158:0x0377, B:160:0x037d, B:162:0x0383, B:164:0x038d, B:166:0x039a, B:168:0x03b6, B:167:0x03aa, B:169:0x03d4, B:173:0x03eb, B:176:0x0415, B:178:0x041f, B:179:0x042c, B:181:0x0434, B:182:0x043f, B:185:0x0449, B:186:0x0464, B:188:0x046c, B:189:0x0477, B:191:0x047f, B:193:0x0487, B:196:0x049b, B:198:0x04a5, B:200:0x04ab, B:201:0x04ba, B:202:0x04c9, B:203:0x04e3, B:205:0x04eb, B:207:0x04f5, B:209:0x04fb, B:210:0x050a, B:211:0x0519, B:212:0x0533, B:214:0x053b, B:215:0x0548, B:217:0x0550, B:218:0x055d, B:220:0x0565, B:222:0x0573, B:223:0x0584, B:225:0x058c, B:227:0x0594, B:230:0x059e, B:232:0x05a6, B:234:0x05ae, B:235:0x05d6, B:240:0x05e3, B:242:0x05f1, B:244:0x0628, B:246:0x0630, B:248:0x0640, B:250:0x0646, B:253:0x064d, B:255:0x0655, B:256:0x0662, B:258:0x066a, B:259:0x067a, B:261:0x0682, B:263:0x0696, B:267:0x06ba, B:269:0x06c2, B:270:0x06d2, B:272:0x06da, B:273:0x06ea, B:275:0x06f2, B:276:0x0701, B:278:0x0709, B:279:0x0718, B:281:0x0720, B:282:0x072f, B:284:0x0737, B:286:0x0741, B:288:0x0747, B:289:0x0755, B:291:0x0766, B:292:0x0780, B:294:0x0788, B:295:0x0797, B:297:0x079f, B:298:0x07ae, B:300:0x07b6, B:301:0x07c5, B:303:0x07cd, B:304:0x07e4, B:306:0x07ec, B:308:0x0805, B:310:0x080a, B:309:0x0808, B:311:0x0816, B:313:0x081e, B:314:0x0837, B:316:0x083f, B:318:0x0847, B:321:0x0851, B:323:0x0859, B:324:0x0874, B:326:0x087c, B:327:0x0895, B:329:0x089d, B:330:0x08c1, B:332:0x08c9, B:333:0x08f7, B:335:0x08ff, B:337:0x0909, B:339:0x090f, B:341:0x0917, B:343:0x091f, B:344:0x0939, B:346:0x0941, B:348:0x094b, B:350:0x0951, B:352:0x0959, B:354:0x0961, B:355:0x097b, B:357:0x0983, B:359:0x099c, B:361:0x09b6, B:363:0x09d3, B:364:0x09e0, B:366:0x09e8, B:265:0x06a8, B:368:0x09f4, B:369:0x0a01), top: B:453:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0c6e A[Catch: Exception -> 0x0d02, TryCatch #1 {Exception -> 0x0d02, blocks: (B:3:0x0010, B:6:0x0022, B:371:0x0a1e, B:374:0x0a38, B:376:0x0a68, B:377:0x0a88, B:379:0x0a9a, B:381:0x0aae, B:383:0x0ac1, B:385:0x0aca, B:387:0x0add, B:388:0x0ae6, B:390:0x0af0, B:391:0x0afb, B:393:0x0b1a, B:395:0x0b49, B:397:0x0b51, B:399:0x0b5b, B:401:0x0b61, B:405:0x0b6b, B:394:0x0b32, B:384:0x0ac6, B:406:0x0b75, B:408:0x0b81, B:410:0x0b92, B:412:0x0ba7, B:414:0x0bc6, B:416:0x0be7, B:417:0x0c07, B:419:0x0c19, B:421:0x0c2d, B:423:0x0c40, B:425:0x0c4a, B:427:0x0c5d, B:428:0x0c64, B:430:0x0c6e, B:431:0x0c79, B:433:0x0c98, B:435:0x0cc7, B:437:0x0ccf, B:439:0x0cd9, B:441:0x0cdf, B:445:0x0ce9, B:434:0x0cb0, B:424:0x0c46, B:413:0x0bb7, B:446:0x0cf2, B:9:0x0038, B:11:0x0040, B:12:0x0050, B:14:0x0058, B:15:0x0068, B:18:0x007a, B:19:0x0092, B:22:0x00a2, B:23:0x00c3, B:25:0x00cb, B:26:0x00d8, B:28:0x00e0, B:30:0x00f8, B:32:0x0100, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:42:0x0123, B:44:0x0130, B:49:0x013c, B:51:0x0145, B:56:0x0151, B:58:0x015a, B:63:0x0166, B:64:0x016d, B:69:0x0179, B:70:0x0180, B:75:0x018c, B:76:0x0193, B:81:0x019f, B:82:0x01a6, B:87:0x01b2, B:88:0x01b9, B:93:0x01c5, B:96:0x01d4, B:98:0x01dc, B:99:0x01e9, B:102:0x01f3, B:104:0x0220, B:105:0x0230, B:107:0x023c, B:109:0x0256, B:111:0x026c, B:114:0x0276, B:117:0x028f, B:119:0x0297, B:120:0x02aa, B:123:0x02b4, B:124:0x02c7, B:126:0x02cf, B:129:0x02d9, B:132:0x02e9, B:134:0x02f3, B:136:0x02f9, B:138:0x02ff, B:140:0x0309, B:141:0x031f, B:143:0x0327, B:145:0x0331, B:147:0x0337, B:149:0x033d, B:151:0x0347, B:153:0x0361, B:156:0x036d, B:158:0x0377, B:160:0x037d, B:162:0x0383, B:164:0x038d, B:166:0x039a, B:168:0x03b6, B:167:0x03aa, B:169:0x03d4, B:173:0x03eb, B:176:0x0415, B:178:0x041f, B:179:0x042c, B:181:0x0434, B:182:0x043f, B:185:0x0449, B:186:0x0464, B:188:0x046c, B:189:0x0477, B:191:0x047f, B:193:0x0487, B:196:0x049b, B:198:0x04a5, B:200:0x04ab, B:201:0x04ba, B:202:0x04c9, B:203:0x04e3, B:205:0x04eb, B:207:0x04f5, B:209:0x04fb, B:210:0x050a, B:211:0x0519, B:212:0x0533, B:214:0x053b, B:215:0x0548, B:217:0x0550, B:218:0x055d, B:220:0x0565, B:222:0x0573, B:223:0x0584, B:225:0x058c, B:227:0x0594, B:230:0x059e, B:232:0x05a6, B:234:0x05ae, B:235:0x05d6, B:240:0x05e3, B:242:0x05f1, B:244:0x0628, B:246:0x0630, B:248:0x0640, B:250:0x0646, B:253:0x064d, B:255:0x0655, B:256:0x0662, B:258:0x066a, B:259:0x067a, B:261:0x0682, B:263:0x0696, B:267:0x06ba, B:269:0x06c2, B:270:0x06d2, B:272:0x06da, B:273:0x06ea, B:275:0x06f2, B:276:0x0701, B:278:0x0709, B:279:0x0718, B:281:0x0720, B:282:0x072f, B:284:0x0737, B:286:0x0741, B:288:0x0747, B:289:0x0755, B:291:0x0766, B:292:0x0780, B:294:0x0788, B:295:0x0797, B:297:0x079f, B:298:0x07ae, B:300:0x07b6, B:301:0x07c5, B:303:0x07cd, B:304:0x07e4, B:306:0x07ec, B:308:0x0805, B:310:0x080a, B:309:0x0808, B:311:0x0816, B:313:0x081e, B:314:0x0837, B:316:0x083f, B:318:0x0847, B:321:0x0851, B:323:0x0859, B:324:0x0874, B:326:0x087c, B:327:0x0895, B:329:0x089d, B:330:0x08c1, B:332:0x08c9, B:333:0x08f7, B:335:0x08ff, B:337:0x0909, B:339:0x090f, B:341:0x0917, B:343:0x091f, B:344:0x0939, B:346:0x0941, B:348:0x094b, B:350:0x0951, B:352:0x0959, B:354:0x0961, B:355:0x097b, B:357:0x0983, B:359:0x099c, B:361:0x09b6, B:363:0x09d3, B:364:0x09e0, B:366:0x09e8, B:265:0x06a8, B:368:0x09f4, B:369:0x0a01), top: B:453:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0c98 A[Catch: Exception -> 0x0d02, TryCatch #1 {Exception -> 0x0d02, blocks: (B:3:0x0010, B:6:0x0022, B:371:0x0a1e, B:374:0x0a38, B:376:0x0a68, B:377:0x0a88, B:379:0x0a9a, B:381:0x0aae, B:383:0x0ac1, B:385:0x0aca, B:387:0x0add, B:388:0x0ae6, B:390:0x0af0, B:391:0x0afb, B:393:0x0b1a, B:395:0x0b49, B:397:0x0b51, B:399:0x0b5b, B:401:0x0b61, B:405:0x0b6b, B:394:0x0b32, B:384:0x0ac6, B:406:0x0b75, B:408:0x0b81, B:410:0x0b92, B:412:0x0ba7, B:414:0x0bc6, B:416:0x0be7, B:417:0x0c07, B:419:0x0c19, B:421:0x0c2d, B:423:0x0c40, B:425:0x0c4a, B:427:0x0c5d, B:428:0x0c64, B:430:0x0c6e, B:431:0x0c79, B:433:0x0c98, B:435:0x0cc7, B:437:0x0ccf, B:439:0x0cd9, B:441:0x0cdf, B:445:0x0ce9, B:434:0x0cb0, B:424:0x0c46, B:413:0x0bb7, B:446:0x0cf2, B:9:0x0038, B:11:0x0040, B:12:0x0050, B:14:0x0058, B:15:0x0068, B:18:0x007a, B:19:0x0092, B:22:0x00a2, B:23:0x00c3, B:25:0x00cb, B:26:0x00d8, B:28:0x00e0, B:30:0x00f8, B:32:0x0100, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:42:0x0123, B:44:0x0130, B:49:0x013c, B:51:0x0145, B:56:0x0151, B:58:0x015a, B:63:0x0166, B:64:0x016d, B:69:0x0179, B:70:0x0180, B:75:0x018c, B:76:0x0193, B:81:0x019f, B:82:0x01a6, B:87:0x01b2, B:88:0x01b9, B:93:0x01c5, B:96:0x01d4, B:98:0x01dc, B:99:0x01e9, B:102:0x01f3, B:104:0x0220, B:105:0x0230, B:107:0x023c, B:109:0x0256, B:111:0x026c, B:114:0x0276, B:117:0x028f, B:119:0x0297, B:120:0x02aa, B:123:0x02b4, B:124:0x02c7, B:126:0x02cf, B:129:0x02d9, B:132:0x02e9, B:134:0x02f3, B:136:0x02f9, B:138:0x02ff, B:140:0x0309, B:141:0x031f, B:143:0x0327, B:145:0x0331, B:147:0x0337, B:149:0x033d, B:151:0x0347, B:153:0x0361, B:156:0x036d, B:158:0x0377, B:160:0x037d, B:162:0x0383, B:164:0x038d, B:166:0x039a, B:168:0x03b6, B:167:0x03aa, B:169:0x03d4, B:173:0x03eb, B:176:0x0415, B:178:0x041f, B:179:0x042c, B:181:0x0434, B:182:0x043f, B:185:0x0449, B:186:0x0464, B:188:0x046c, B:189:0x0477, B:191:0x047f, B:193:0x0487, B:196:0x049b, B:198:0x04a5, B:200:0x04ab, B:201:0x04ba, B:202:0x04c9, B:203:0x04e3, B:205:0x04eb, B:207:0x04f5, B:209:0x04fb, B:210:0x050a, B:211:0x0519, B:212:0x0533, B:214:0x053b, B:215:0x0548, B:217:0x0550, B:218:0x055d, B:220:0x0565, B:222:0x0573, B:223:0x0584, B:225:0x058c, B:227:0x0594, B:230:0x059e, B:232:0x05a6, B:234:0x05ae, B:235:0x05d6, B:240:0x05e3, B:242:0x05f1, B:244:0x0628, B:246:0x0630, B:248:0x0640, B:250:0x0646, B:253:0x064d, B:255:0x0655, B:256:0x0662, B:258:0x066a, B:259:0x067a, B:261:0x0682, B:263:0x0696, B:267:0x06ba, B:269:0x06c2, B:270:0x06d2, B:272:0x06da, B:273:0x06ea, B:275:0x06f2, B:276:0x0701, B:278:0x0709, B:279:0x0718, B:281:0x0720, B:282:0x072f, B:284:0x0737, B:286:0x0741, B:288:0x0747, B:289:0x0755, B:291:0x0766, B:292:0x0780, B:294:0x0788, B:295:0x0797, B:297:0x079f, B:298:0x07ae, B:300:0x07b6, B:301:0x07c5, B:303:0x07cd, B:304:0x07e4, B:306:0x07ec, B:308:0x0805, B:310:0x080a, B:309:0x0808, B:311:0x0816, B:313:0x081e, B:314:0x0837, B:316:0x083f, B:318:0x0847, B:321:0x0851, B:323:0x0859, B:324:0x0874, B:326:0x087c, B:327:0x0895, B:329:0x089d, B:330:0x08c1, B:332:0x08c9, B:333:0x08f7, B:335:0x08ff, B:337:0x0909, B:339:0x090f, B:341:0x0917, B:343:0x091f, B:344:0x0939, B:346:0x0941, B:348:0x094b, B:350:0x0951, B:352:0x0959, B:354:0x0961, B:355:0x097b, B:357:0x0983, B:359:0x099c, B:361:0x09b6, B:363:0x09d3, B:364:0x09e0, B:366:0x09e8, B:265:0x06a8, B:368:0x09f4, B:369:0x0a01), top: B:453:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0cb0 A[Catch: Exception -> 0x0d02, TryCatch #1 {Exception -> 0x0d02, blocks: (B:3:0x0010, B:6:0x0022, B:371:0x0a1e, B:374:0x0a38, B:376:0x0a68, B:377:0x0a88, B:379:0x0a9a, B:381:0x0aae, B:383:0x0ac1, B:385:0x0aca, B:387:0x0add, B:388:0x0ae6, B:390:0x0af0, B:391:0x0afb, B:393:0x0b1a, B:395:0x0b49, B:397:0x0b51, B:399:0x0b5b, B:401:0x0b61, B:405:0x0b6b, B:394:0x0b32, B:384:0x0ac6, B:406:0x0b75, B:408:0x0b81, B:410:0x0b92, B:412:0x0ba7, B:414:0x0bc6, B:416:0x0be7, B:417:0x0c07, B:419:0x0c19, B:421:0x0c2d, B:423:0x0c40, B:425:0x0c4a, B:427:0x0c5d, B:428:0x0c64, B:430:0x0c6e, B:431:0x0c79, B:433:0x0c98, B:435:0x0cc7, B:437:0x0ccf, B:439:0x0cd9, B:441:0x0cdf, B:445:0x0ce9, B:434:0x0cb0, B:424:0x0c46, B:413:0x0bb7, B:446:0x0cf2, B:9:0x0038, B:11:0x0040, B:12:0x0050, B:14:0x0058, B:15:0x0068, B:18:0x007a, B:19:0x0092, B:22:0x00a2, B:23:0x00c3, B:25:0x00cb, B:26:0x00d8, B:28:0x00e0, B:30:0x00f8, B:32:0x0100, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:42:0x0123, B:44:0x0130, B:49:0x013c, B:51:0x0145, B:56:0x0151, B:58:0x015a, B:63:0x0166, B:64:0x016d, B:69:0x0179, B:70:0x0180, B:75:0x018c, B:76:0x0193, B:81:0x019f, B:82:0x01a6, B:87:0x01b2, B:88:0x01b9, B:93:0x01c5, B:96:0x01d4, B:98:0x01dc, B:99:0x01e9, B:102:0x01f3, B:104:0x0220, B:105:0x0230, B:107:0x023c, B:109:0x0256, B:111:0x026c, B:114:0x0276, B:117:0x028f, B:119:0x0297, B:120:0x02aa, B:123:0x02b4, B:124:0x02c7, B:126:0x02cf, B:129:0x02d9, B:132:0x02e9, B:134:0x02f3, B:136:0x02f9, B:138:0x02ff, B:140:0x0309, B:141:0x031f, B:143:0x0327, B:145:0x0331, B:147:0x0337, B:149:0x033d, B:151:0x0347, B:153:0x0361, B:156:0x036d, B:158:0x0377, B:160:0x037d, B:162:0x0383, B:164:0x038d, B:166:0x039a, B:168:0x03b6, B:167:0x03aa, B:169:0x03d4, B:173:0x03eb, B:176:0x0415, B:178:0x041f, B:179:0x042c, B:181:0x0434, B:182:0x043f, B:185:0x0449, B:186:0x0464, B:188:0x046c, B:189:0x0477, B:191:0x047f, B:193:0x0487, B:196:0x049b, B:198:0x04a5, B:200:0x04ab, B:201:0x04ba, B:202:0x04c9, B:203:0x04e3, B:205:0x04eb, B:207:0x04f5, B:209:0x04fb, B:210:0x050a, B:211:0x0519, B:212:0x0533, B:214:0x053b, B:215:0x0548, B:217:0x0550, B:218:0x055d, B:220:0x0565, B:222:0x0573, B:223:0x0584, B:225:0x058c, B:227:0x0594, B:230:0x059e, B:232:0x05a6, B:234:0x05ae, B:235:0x05d6, B:240:0x05e3, B:242:0x05f1, B:244:0x0628, B:246:0x0630, B:248:0x0640, B:250:0x0646, B:253:0x064d, B:255:0x0655, B:256:0x0662, B:258:0x066a, B:259:0x067a, B:261:0x0682, B:263:0x0696, B:267:0x06ba, B:269:0x06c2, B:270:0x06d2, B:272:0x06da, B:273:0x06ea, B:275:0x06f2, B:276:0x0701, B:278:0x0709, B:279:0x0718, B:281:0x0720, B:282:0x072f, B:284:0x0737, B:286:0x0741, B:288:0x0747, B:289:0x0755, B:291:0x0766, B:292:0x0780, B:294:0x0788, B:295:0x0797, B:297:0x079f, B:298:0x07ae, B:300:0x07b6, B:301:0x07c5, B:303:0x07cd, B:304:0x07e4, B:306:0x07ec, B:308:0x0805, B:310:0x080a, B:309:0x0808, B:311:0x0816, B:313:0x081e, B:314:0x0837, B:316:0x083f, B:318:0x0847, B:321:0x0851, B:323:0x0859, B:324:0x0874, B:326:0x087c, B:327:0x0895, B:329:0x089d, B:330:0x08c1, B:332:0x08c9, B:333:0x08f7, B:335:0x08ff, B:337:0x0909, B:339:0x090f, B:341:0x0917, B:343:0x091f, B:344:0x0939, B:346:0x0941, B:348:0x094b, B:350:0x0951, B:352:0x0959, B:354:0x0961, B:355:0x097b, B:357:0x0983, B:359:0x099c, B:361:0x09b6, B:363:0x09d3, B:364:0x09e0, B:366:0x09e8, B:265:0x06a8, B:368:0x09f4, B:369:0x0a01), top: B:453:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0ccf A[Catch: Exception -> 0x0d02, TryCatch #1 {Exception -> 0x0d02, blocks: (B:3:0x0010, B:6:0x0022, B:371:0x0a1e, B:374:0x0a38, B:376:0x0a68, B:377:0x0a88, B:379:0x0a9a, B:381:0x0aae, B:383:0x0ac1, B:385:0x0aca, B:387:0x0add, B:388:0x0ae6, B:390:0x0af0, B:391:0x0afb, B:393:0x0b1a, B:395:0x0b49, B:397:0x0b51, B:399:0x0b5b, B:401:0x0b61, B:405:0x0b6b, B:394:0x0b32, B:384:0x0ac6, B:406:0x0b75, B:408:0x0b81, B:410:0x0b92, B:412:0x0ba7, B:414:0x0bc6, B:416:0x0be7, B:417:0x0c07, B:419:0x0c19, B:421:0x0c2d, B:423:0x0c40, B:425:0x0c4a, B:427:0x0c5d, B:428:0x0c64, B:430:0x0c6e, B:431:0x0c79, B:433:0x0c98, B:435:0x0cc7, B:437:0x0ccf, B:439:0x0cd9, B:441:0x0cdf, B:445:0x0ce9, B:434:0x0cb0, B:424:0x0c46, B:413:0x0bb7, B:446:0x0cf2, B:9:0x0038, B:11:0x0040, B:12:0x0050, B:14:0x0058, B:15:0x0068, B:18:0x007a, B:19:0x0092, B:22:0x00a2, B:23:0x00c3, B:25:0x00cb, B:26:0x00d8, B:28:0x00e0, B:30:0x00f8, B:32:0x0100, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:42:0x0123, B:44:0x0130, B:49:0x013c, B:51:0x0145, B:56:0x0151, B:58:0x015a, B:63:0x0166, B:64:0x016d, B:69:0x0179, B:70:0x0180, B:75:0x018c, B:76:0x0193, B:81:0x019f, B:82:0x01a6, B:87:0x01b2, B:88:0x01b9, B:93:0x01c5, B:96:0x01d4, B:98:0x01dc, B:99:0x01e9, B:102:0x01f3, B:104:0x0220, B:105:0x0230, B:107:0x023c, B:109:0x0256, B:111:0x026c, B:114:0x0276, B:117:0x028f, B:119:0x0297, B:120:0x02aa, B:123:0x02b4, B:124:0x02c7, B:126:0x02cf, B:129:0x02d9, B:132:0x02e9, B:134:0x02f3, B:136:0x02f9, B:138:0x02ff, B:140:0x0309, B:141:0x031f, B:143:0x0327, B:145:0x0331, B:147:0x0337, B:149:0x033d, B:151:0x0347, B:153:0x0361, B:156:0x036d, B:158:0x0377, B:160:0x037d, B:162:0x0383, B:164:0x038d, B:166:0x039a, B:168:0x03b6, B:167:0x03aa, B:169:0x03d4, B:173:0x03eb, B:176:0x0415, B:178:0x041f, B:179:0x042c, B:181:0x0434, B:182:0x043f, B:185:0x0449, B:186:0x0464, B:188:0x046c, B:189:0x0477, B:191:0x047f, B:193:0x0487, B:196:0x049b, B:198:0x04a5, B:200:0x04ab, B:201:0x04ba, B:202:0x04c9, B:203:0x04e3, B:205:0x04eb, B:207:0x04f5, B:209:0x04fb, B:210:0x050a, B:211:0x0519, B:212:0x0533, B:214:0x053b, B:215:0x0548, B:217:0x0550, B:218:0x055d, B:220:0x0565, B:222:0x0573, B:223:0x0584, B:225:0x058c, B:227:0x0594, B:230:0x059e, B:232:0x05a6, B:234:0x05ae, B:235:0x05d6, B:240:0x05e3, B:242:0x05f1, B:244:0x0628, B:246:0x0630, B:248:0x0640, B:250:0x0646, B:253:0x064d, B:255:0x0655, B:256:0x0662, B:258:0x066a, B:259:0x067a, B:261:0x0682, B:263:0x0696, B:267:0x06ba, B:269:0x06c2, B:270:0x06d2, B:272:0x06da, B:273:0x06ea, B:275:0x06f2, B:276:0x0701, B:278:0x0709, B:279:0x0718, B:281:0x0720, B:282:0x072f, B:284:0x0737, B:286:0x0741, B:288:0x0747, B:289:0x0755, B:291:0x0766, B:292:0x0780, B:294:0x0788, B:295:0x0797, B:297:0x079f, B:298:0x07ae, B:300:0x07b6, B:301:0x07c5, B:303:0x07cd, B:304:0x07e4, B:306:0x07ec, B:308:0x0805, B:310:0x080a, B:309:0x0808, B:311:0x0816, B:313:0x081e, B:314:0x0837, B:316:0x083f, B:318:0x0847, B:321:0x0851, B:323:0x0859, B:324:0x0874, B:326:0x087c, B:327:0x0895, B:329:0x089d, B:330:0x08c1, B:332:0x08c9, B:333:0x08f7, B:335:0x08ff, B:337:0x0909, B:339:0x090f, B:341:0x0917, B:343:0x091f, B:344:0x0939, B:346:0x0941, B:348:0x094b, B:350:0x0951, B:352:0x0959, B:354:0x0961, B:355:0x097b, B:357:0x0983, B:359:0x099c, B:361:0x09b6, B:363:0x09d3, B:364:0x09e0, B:366:0x09e8, B:265:0x06a8, B:368:0x09f4, B:369:0x0a01), top: B:453:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:459:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(String str, Bundle bundle, Integer num) {
        Object obj;
        String str2;
        String str3;
        String str4;
        Intent intent;
        String str5;
        HashMap<String, Object> appConfig;
        HashMap<String, Object> appConfig2;
        Intent s10;
        Intent s11;
        Intent s12;
        Intent s13;
        Intent s14;
        Intent s15;
        Intent s16;
        Intent s17;
        Intent s18;
        Intent intent2;
        HashMap<String, Object> appConfig3;
        CourseDayModelV1 O0;
        int intValue;
        CourseDayModelV1 courseDayModelV1;
        String content_id;
        boolean z10;
        CourseDayModelV1 O02;
        int intValue2;
        CourseDayModelV1 courseDayModelV12;
        String content_id2;
        boolean z11;
        try {
            if (i.b(str, "mo_therapist_listing")) {
                intent = new Intent(f(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.THERAPIST_LISTING);
            } else if (i.b(str, "mo_psychiatrist_listing")) {
                intent = new Intent(f(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.PSYCHIATRIST_LISTING);
            } else if (i.b(str, "mo_couples_listing")) {
                intent = new Intent(f(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.COUPLES_LISTING);
            } else {
                boolean b10 = i.b(str, "mo_pending_tools");
                obj = Constants.SCREEN_SLIDER_ASSESSMENT;
                if (b10) {
                    intent = new Intent(f(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.PENDING_PROVIDER_TOOLS).putExtra("type", bundle.getString("provider_type", ""));
                    str2 = Constants.DAYMODEL_POSITION;
                    str4 = Constants.API_COURSE_LINK;
                    if (intent != null) {
                        intent.putExtras(bundle);
                        intent.putExtra(str4, str);
                        if (i.b(str, obj)) {
                            f().startActivityForResult(intent, f().M0());
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            bundle2.putString(str4, str);
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(user.getCourseReminderTime() * 1000);
                                bundle2.putString("reminder_time", new SimpleDateFormat("hh:mm").format(calendar.getTime()));
                                k kVar = k.f19476a;
                            }
                            if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.21") && i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.COURSE_DEPRESSION)) {
                                CourseDayModelV1 O03 = f().O0();
                                i.d(O03);
                                if (O03.getPosition() < 8) {
                                    bundle2.putBoolean("isNewActivities", true);
                                    bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                    if (num != null) {
                                        bundle2.putInt(str2, num.intValue());
                                    }
                                    O02 = f().O0();
                                    if (O02 != null) {
                                        bundle2.putBoolean("bookmark_status", O02.isFavorite());
                                        k kVar2 = k.f19476a;
                                    }
                                    ArrayList<CourseDayModelV1> planV3 = f().N0().getPlanV3();
                                    Utils utils = Utils.INSTANCE;
                                    Integer dayPlanPositionForDateV3 = CourseUtilKt.getDayPlanPositionForDateV3(planV3, utils.getTodayTimeInSeconds());
                                    i.d(dayPlanPositionForDateV3);
                                    intValue2 = dayPlanPositionForDateV3.intValue();
                                    if (intValue2 != 0) {
                                        courseDayModelV12 = CourseUtilKt.getDayPlanForDateV3(f().N0().getPlanV3(), utils.getTodayTimeInSeconds());
                                        i.d(courseDayModelV12);
                                    } else {
                                        CourseDayModelV1 courseDayModelV13 = f().N0().getPlanV3().get(intValue2);
                                        i.f(courseDayModelV13, "{\n                      …os]\n                    }");
                                        courseDayModelV12 = courseDayModelV13;
                                    }
                                    content_id2 = courseDayModelV12.getContent_id();
                                    if (content_id2 != null) {
                                        CourseDayModelV1 O04 = f().O0();
                                        if (content_id2.equals(O04 != null ? O04.getContent_id() : null)) {
                                            z11 = true;
                                            bundle2.putBoolean("today_activity", z11);
                                            UtilsKt.fireAnalytics("dashboard_component_start", bundle2);
                                            return;
                                        }
                                    }
                                    z11 = false;
                                    bundle2.putBoolean("today_activity", z11);
                                    UtilsKt.fireAnalytics("dashboard_component_start", bundle2);
                                    return;
                                }
                            }
                            bundle2.putBoolean("isNewActivities", false);
                            bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                            if (num != null) {
                            }
                            O02 = f().O0();
                            if (O02 != null) {
                            }
                            ArrayList<CourseDayModelV1> planV32 = f().N0().getPlanV3();
                            Utils utils2 = Utils.INSTANCE;
                            Integer dayPlanPositionForDateV32 = CourseUtilKt.getDayPlanPositionForDateV3(planV32, utils2.getTodayTimeInSeconds());
                            i.d(dayPlanPositionForDateV32);
                            intValue2 = dayPlanPositionForDateV32.intValue();
                            if (intValue2 != 0) {
                            }
                            content_id2 = courseDayModelV12.getContent_id();
                            if (content_id2 != null) {
                            }
                            z11 = false;
                            bundle2.putBoolean("today_activity", z11);
                            UtilsKt.fireAnalytics("dashboard_component_start", bundle2);
                            return;
                        }
                        String str6 = str2;
                        if (f().O0() != null) {
                            CourseDayModelV1 O05 = f().O0();
                            i.d(O05);
                            if (!O05.isCompleted()) {
                                CourseDayModelV1 O06 = f().O0();
                                i.d(O06);
                                if (i.b(str, O06.getContent_id())) {
                                    f().startActivityForResult(intent, f().M0());
                                } else {
                                    f().startActivityForResult(intent, f().R0());
                                }
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                bundle3.putString(str4, str);
                                User user2 = FirebasePersistence.getInstance().getUser();
                                if (user2 != null) {
                                    Calendar calendar2 = Calendar.getInstance();
                                    calendar2.setTimeInMillis(user2.getCourseReminderTime() * 1000);
                                    bundle3.putString("reminder_time", new SimpleDateFormat("hh:mm").format(calendar2.getTime()));
                                    k kVar3 = k.f19476a;
                                }
                                if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.21") && i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.COURSE_DEPRESSION)) {
                                    CourseDayModelV1 O07 = f().O0();
                                    i.d(O07);
                                    if (O07.getPosition() < 8) {
                                        bundle3.putBoolean("isNewActivities", true);
                                        bundle3.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                        if (num != null) {
                                            bundle3.putInt(str6, num.intValue());
                                        }
                                        O0 = f().O0();
                                        if (O0 != null) {
                                            bundle3.putBoolean("bookmark_status", O0.isFavorite());
                                            k kVar4 = k.f19476a;
                                        }
                                        ArrayList<CourseDayModelV1> planV33 = f().N0().getPlanV3();
                                        Utils utils3 = Utils.INSTANCE;
                                        Integer dayPlanPositionForDateV33 = CourseUtilKt.getDayPlanPositionForDateV3(planV33, utils3.getTodayTimeInSeconds());
                                        i.d(dayPlanPositionForDateV33);
                                        intValue = dayPlanPositionForDateV33.intValue();
                                        if (intValue != 0) {
                                            courseDayModelV1 = CourseUtilKt.getDayPlanForDateV3(f().N0().getPlanV3(), utils3.getTodayTimeInSeconds());
                                            i.d(courseDayModelV1);
                                        } else {
                                            CourseDayModelV1 courseDayModelV14 = f().N0().getPlanV3().get(intValue);
                                            i.f(courseDayModelV14, "{\n                      …os]\n                    }");
                                            courseDayModelV1 = courseDayModelV14;
                                        }
                                        content_id = courseDayModelV1.getContent_id();
                                        if (content_id != null) {
                                            CourseDayModelV1 O08 = f().O0();
                                            if (content_id.equals(O08 != null ? O08.getContent_id() : null)) {
                                                z10 = true;
                                                bundle3.putBoolean("today_activity", z10);
                                                UtilsKt.fireAnalytics("dashboard_component_start", bundle3);
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        bundle3.putBoolean("today_activity", z10);
                                        UtilsKt.fireAnalytics("dashboard_component_start", bundle3);
                                        return;
                                    }
                                }
                                bundle3.putBoolean("isNewActivities", false);
                                bundle3.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                if (num != null) {
                                }
                                O0 = f().O0();
                                if (O0 != null) {
                                }
                                ArrayList<CourseDayModelV1> planV332 = f().N0().getPlanV3();
                                Utils utils32 = Utils.INSTANCE;
                                Integer dayPlanPositionForDateV332 = CourseUtilKt.getDayPlanPositionForDateV3(planV332, utils32.getTodayTimeInSeconds());
                                i.d(dayPlanPositionForDateV332);
                                intValue = dayPlanPositionForDateV332.intValue();
                                if (intValue != 0) {
                                }
                                content_id = courseDayModelV1.getContent_id();
                                if (content_id != null) {
                                }
                                z10 = false;
                                bundle3.putBoolean("today_activity", z10);
                                UtilsKt.fireAnalytics("dashboard_component_start", bundle3);
                                return;
                            }
                        }
                        f().startActivityForResult(intent, f().R0());
                        return;
                    }
                    return;
                }
                boolean b11 = i.b(str, "mo_provider_package");
                str2 = Constants.DAYMODEL_POSITION;
                String str7 = Constants.API_COURSE_LINK;
                if (b11) {
                    intent = new Intent(f(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.PROVIDER_PACKAGE).putExtra(SessionManager.KEY_UUID, bundle.getString("provider_uuid", "")).putExtra("type", bundle.getString("provider_type", ""));
                } else if (i.b(str, "mo_db_recommended_activity")) {
                    intent = new Intent(f(), RecommendedActivitiesExperimentActivity.class);
                } else if (i.b(str, "mo_tracker")) {
                    f().P0().n(new RoutingIntentHandler(null, RoutingType.MOOD_TRACKER_DASHBOARD_SMOOTH_SCROLL, false, 4, null));
                    return;
                } else if (i.b(str, "mo_library")) {
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (i.b((String) ((user3 == null || (appConfig3 = user3.getAppConfig()) == null || (r8 = appConfig3.get(Constants.LIBRARY_EXPERIMENT_V3)) == null) ? "default" : "default"), "default")) {
                        return;
                    }
                    Intent intent3 = new Intent(f(), LibraryActivity.class);
                    if (bundle.containsKey("highlight")) {
                        intent3.putExtra("highlight", bundle.getString("highlight"));
                    }
                    if (bundle.containsKey("view_all")) {
                        intent3.putExtra("view_all", bundle.getString("view_all"));
                    }
                    if (bundle.containsKey("operation")) {
                        intent3.putExtra("operation", bundle.getString("operation"));
                    }
                    if (bundle.containsKey("parentType")) {
                        intent3.putExtra("parentType", bundle.getString("parentType"));
                    }
                    if (bundle.containsKey("parentId")) {
                        intent3.putExtra("parentId", bundle.getString("parentId"));
                    }
                    if (bundle.containsKey("itemType")) {
                        intent3.putExtra("itemType", bundle.getString("itemType"));
                    }
                    if (bundle.containsKey("id")) {
                        intent3.putExtra("id", bundle.getString("id"));
                    }
                    if (bundle.containsKey("finish_on_back_pressed")) {
                        intent3.putExtra("finish_on_back_pressed", Boolean.parseBoolean(bundle.getString("finish_on_back_pressed")));
                    }
                    intent = intent3;
                } else if (i.b(str, "mo_all_mini_courses")) {
                    intent = new Intent(f(), AllMiniCoursesActivity.class);
                } else {
                    if (i.b(str, "mo_assessment")) {
                        intent = e0.s(f());
                        str4 = str7;
                        intent.putExtra(str4, str);
                        str3 = str2;
                        intent.putExtra(str3, Integer.parseInt(String.valueOf(bundle.get(str3))));
                        if (f().getIntent().getBooleanExtra(Constants.NEW_COURSE_FLAG, false)) {
                            intent.putExtra(Constants.NEW_COURSE_FLAG, true);
                            f().getIntent().putExtra(Constants.NEW_COURSE_FLAG, false);
                        }
                    } else {
                        str3 = str2;
                        str4 = str7;
                        if (i.b(str, obj)) {
                            Intent s19 = e0.s(f());
                            s19.putExtra(str4, str);
                            if (f().getIntent().getBooleanExtra(Constants.NEW_COURSE_FLAG, false)) {
                                s19.putExtra(Constants.NEW_COURSE_FLAG, true);
                                f().getIntent().putExtra(Constants.NEW_COURSE_FLAG, false);
                            }
                            obj = obj;
                            str2 = str3;
                            intent = s19;
                        } else {
                            if (i.b(str, Constants.SCREEN_THOUGHTS_ACTIVITY)) {
                                intent2 = new Intent(f(), RelaxationActivity.class);
                                bundle.putString("activity_id", Constants.ACTIVITY_ID_STRESS_DEEP_BREATHING);
                                k kVar5 = k.f19476a;
                            } else if (i.b(str, "physical_activity")) {
                                intent2 = new Intent(f(), RelaxationActivity.class);
                                bundle.putString("activity_id", Constants.ACTIVITY_ID_STRESS_CLIMBING_STAIRS);
                                k kVar6 = k.f19476a;
                            } else if (i.b(str, Constants.SCREEN_BROWSER)) {
                                intent2 = new Intent(f(), WebviewActivity.class);
                                intent2.putExtra(Constants.NOTIFICATION_URL, bundle.getString(Constants.NOTIFICATION_URL));
                            } else {
                                if (!i.b(str, Constants.SCREEN_ACTIVITY_1) && !i.b(str, Constants.SCREEN_ACTIVITY_2)) {
                                    str2 = str3;
                                    obj = obj;
                                    if (i.b(str, Constants.SCREEN_FIREBASE_CHAT)) {
                                        String a10 = FirebaseAuth.getInstance().a();
                                        if (a10 != null && !i.b(a10, "") && bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a10)) {
                                            intent = new Intent(f(), TelecommunicationsPWAActivity.class).putExtra("chat", true).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.FLOW_THERAPY);
                                        }
                                        str7 = str4;
                                    } else if (i.b(str, Constants.SCREEN_PSYCHIATRIST_CHAT)) {
                                        String a11 = FirebaseAuth.getInstance().a();
                                        if (a11 != null && !i.b(a11, "") && bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a11)) {
                                            intent = new Intent(f(), TelecommunicationsPWAActivity.class).putExtra("chat", true).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.FLOW_PSYCHIATRY);
                                        }
                                        str7 = str4;
                                    } else {
                                        str7 = str4;
                                        if (i.b(str, Constants.SCREEN_COACH_CHAT)) {
                                            String a12 = FirebaseAuth.getInstance().a();
                                            if (a12 != null && !i.b(a12, "") && bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a12)) {
                                                Boolean SKIP_MONETIZATION = Constants.SKIP_MONETIZATION;
                                                i.f(SKIP_MONETIZATION, "SKIP_MONETIZATION");
                                                if (!SKIP_MONETIZATION.booleanValue()) {
                                                    s18 = r.s(f(), false);
                                                    intent = s18.putExtra("source", "chat");
                                                } else {
                                                    intent = new Intent(f(), ProInitialAssessmentActivity.class).putExtra("source", "chat");
                                                }
                                                ChatUser chatUser = new ChatUser();
                                                chatUser.setKey(bundle.getString(Constants.FIREBASE_CHAT_FROM_USER_ID));
                                                chatUser.setFirstName(bundle.getString(Constants.FIREBASE_CHAT_USERNAME));
                                                intent.putExtra("user", chatUser);
                                            }
                                        } else if (i.b(str, Constants.SCREEN_NOTIFICATION_ACTIVITY)) {
                                            try {
                                                intent = new Intent(f(), ActivitiesInfoActivity.class);
                                                LogHelper logHelper = LogHelper.INSTANCE;
                                                String str8 = this.f10899a;
                                                String string = bundle.getString(Constants.GOAL_ID);
                                                i.d(string);
                                                logHelper.i(str8, "goal id of notification ".concat(string));
                                                bundle.putString("activity_id", bundle.getString(Constants.GOAL_ID));
                                            } catch (Exception e10) {
                                                e = e10;
                                                LogHelper.INSTANCE.e(e);
                                                return;
                                            }
                                        } else if (i.b(str, Constants.SCREEN_GRATITUDE_JOURNAL)) {
                                            intent = new Intent(f(), GratitudeJournalComponentActivity.class);
                                        } else if (i.b(str, Constants.SCREEN_THERAPIST_DETAIL)) {
                                            intent = new Intent(f(), TelecommunicationsPWAActivity.class);
                                        } else if (i.b(str, Constants.SCREEN_THERAPIST_PACKAGES)) {
                                            intent = new Intent(f(), TelecommunicationsPWAActivity.class);
                                            intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.CROSS_PROVIDER);
                                            intent.putExtra("isTherapy", true);
                                            intent.putExtra("providerType", "therapist");
                                        } else if (i.b(str, Constants.SCREEN_THERAPY_PSYCHIATRY_CHOICE)) {
                                            intent = new Intent(f(), TelecommunicationsPWAActivity.class);
                                        } else if (i.b(str, Constants.SCREEN_THERAPY_PSYCHIATRY_DRAWER_OPEN)) {
                                            f().j1();
                                            return;
                                        } else if (i.b(str, Constants.SCREEN_COACHMARKS_1)) {
                                            if (f().K0()) {
                                                intent = b.K() ? new Intent(f(), FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD) : new Intent(f(), V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                                            } else {
                                                Extensions extensions = Extensions.INSTANCE;
                                                V3DashboardActivity f = f();
                                                String string2 = f().getString(R.string.goalMigrationProgress);
                                                i.f(string2, "activity.getString(R.string.goalMigrationProgress)");
                                                extensions.toast(f, string2, 1);
                                            }
                                        } else if (i.b(str, Constants.SCREEN_GOALS_LIST)) {
                                            if (f().K0()) {
                                                intent = b.K() ? new Intent(f(), FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD) : new Intent(f(), V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                                            } else {
                                                Extensions extensions2 = Extensions.INSTANCE;
                                                V3DashboardActivity f2 = f();
                                                String string3 = f().getString(R.string.goalMigrationProgress);
                                                i.f(string3, "activity.getString(R.string.goalMigrationProgress)");
                                                extensions2.toast(f2, string3, 1);
                                            }
                                        } else if (i.b(str, Constants.SCREEN_RELIEF_BOX)) {
                                            intent = new Intent(f(), BotPwaActivity.class);
                                        } else if (i.b(str, Constants.SCREEN_PROFILE)) {
                                            intent = new Intent(f(), ExperimentProfileActivity.class);
                                        } else if (i.b(str, Constants.SCREEN_CONTENT_MARKETING_LIST)) {
                                            if (f().T0().size() > 0) {
                                                ((RobertoButton) f().n0(R.id.buttonLearningHub)).performClick();
                                                return;
                                            } else {
                                                f().u1();
                                                return;
                                            }
                                        } else {
                                            if (!i.b(str, Constants.SCREEN_COMMUNITY) && !i.b(str, Constants.SCREEN_COMMUNITY_POST)) {
                                                if (i.b(str, Constants.SCREEN_CURRENT_ACTIVITY)) {
                                                    if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                                        FirebasePersistence.getInstance().getUser();
                                                        V3DashboardActivity f10 = f();
                                                        CourseDayModelV1 dayPlanForDateV3 = CourseUtilKt.getDayPlanForDateV3(f().N0().getPlanV3(), Utils.INSTANCE.getTodayTimeInSeconds());
                                                        i.d(dayPlanForDateV3);
                                                        f10.t0(dayPlanForDateV3);
                                                        return;
                                                    }
                                                    if (!(f().G != null) || f().U0().isEmpty()) {
                                                        return;
                                                    }
                                                    V3DashboardActivity f11 = f();
                                                    Intent intent4 = new Intent(f(), MiniCourseActivity.class);
                                                    String domain = f().U0().get(0).getDomain();
                                                    i.d(domain);
                                                    f11.startActivityForResult(intent4.putExtra("mccourse", domain), f().L0());
                                                    return;
                                                } else if (i.b(str, Constants.SCREEN_APP_FEEDBACK)) {
                                                    Dialog showFeedbackPopup = f().Q0().showFeedbackPopup(Constants.FEEDBACK_TOP_MENU);
                                                    if (showFeedbackPopup != null) {
                                                        showFeedbackPopup.show();
                                                        k kVar7 = k.f19476a;
                                                        return;
                                                    }
                                                    return;
                                                } else if (i.b(str, Constants.SCREEN_DASHBOARD)) {
                                                    return;
                                                } else {
                                                    if (i.b(str, Constants.NOTIFICATION_WORRY)) {
                                                        intent = new Intent(f(), T5Activity.class);
                                                    } else if (i.b(str, Constants.SCREEN_MONETIZATION)) {
                                                        s17 = r.s(f(), false);
                                                        intent = s17.putExtra("source", "offer");
                                                    } else {
                                                        if (i.b(str, Constants.SCREEN_IN_REPURCHASE)) {
                                                            str5 = "provider_uuid";
                                                            if (i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                                                                s16 = r.s(f(), false);
                                                                intent = s16.putExtra("source", "repurchase");
                                                            }
                                                        } else {
                                                            str5 = "provider_uuid";
                                                        }
                                                        if (i.b(str, Constants.LINK_OFFER_PLUS_ANNUAL_PLUS_CLICK_4)) {
                                                            s15 = r.s(f(), false);
                                                            intent = s15.putExtra("source", Constants.LINK_OFFER_PLUS_ANNUAL_PLUS_CLICK_4);
                                                        } else if (i.b(str, Constants.LINK_OFFER_PRO_QUARTERLY_PRO_CLICK_3)) {
                                                            s14 = r.s(f(), false);
                                                            intent = s14.putExtra("source", Constants.LINK_OFFER_PRO_QUARTERLY_PRO_CLICK_3);
                                                        } else if (i.b(str, Constants.LINK_OFFER_PRO_QUARTERLY_FREE_TRIAL)) {
                                                            s13 = r.s(f(), false);
                                                            intent = s13.putExtra("source", Constants.LINK_OFFER_PRO_QUARTERLY_FREE_TRIAL);
                                                        } else if (i.b(str, Constants.LINK_OFFER_PRO_QUARTERLY_PLUS_PURCHASE_CANCELLED)) {
                                                            s12 = r.s(f(), false);
                                                            intent = s12.putExtra("source", Constants.LINK_OFFER_PRO_QUARTERLY_PLUS_PURCHASE_CANCELLED);
                                                        } else if (i.b(str, Constants.LINK_OFFER_60_PLUS_ANNUAL)) {
                                                            s11 = r.s(f(), false);
                                                            intent = s11.putExtra("source", Constants.LINK_OFFER_60_PLUS_ANNUAL);
                                                        } else if (i.b(str, Constants.SCREEN_V3_ACTIVITY)) {
                                                            if (f().K0()) {
                                                                intent = b.K() ? new Intent(f(), FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD) : new Intent(f(), V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                                                            } else {
                                                                Extensions extensions3 = Extensions.INSTANCE;
                                                                V3DashboardActivity f12 = f();
                                                                String string4 = f().getString(R.string.goalMigrationProgress);
                                                                i.f(string4, "activity.getString(R.string.goalMigrationProgress)");
                                                                extensions3.toast(f12, string4, 1);
                                                            }
                                                        } else if (i.b(str, Constants.LINK_DYNAMIC_CAMPAIGN)) {
                                                            s10 = r.s(f(), false);
                                                            intent = s10.putExtra("source", Constants.LINK_DYNAMIC_CAMPAIGN);
                                                        } else if (i.b(str, Constants.SESSION_DASHBOARD_THERAPY)) {
                                                            intent = new Intent(f(), TelecommunicationsPWAActivity.class);
                                                            intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.FLOW_THERAPY);
                                                        } else if (i.b(str, Constants.SESSION_DASHBOARD_PSYCHIATRY)) {
                                                            intent = new Intent(f(), TelecommunicationsPWAActivity.class);
                                                            intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.FLOW_PSYCHIATRY);
                                                        } else if (i.b(str, Constants.LINK_COMMUNITIES_NOTIFICATION)) {
                                                            intent = new Intent(f(), CommunitiesPwaActivity.class).putExtra("redirect_url", bundle.getString(Constants.NOTIFICATION_URL, ""));
                                                        } else if (i.b(str, Constants.NOTIFICATION_PROVIDER_PROFILE)) {
                                                            intent = new Intent(f(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, i.b(bundle.getString("provider_type", "therapist"), "therapist") ? c.PROFILE : c.PROFILE_PSYCHIATRIST).putExtra(SessionManager.KEY_UUID, bundle.getString(str5, ""));
                                                        } else if (i.b(str, "tele_dashboard_listing")) {
                                                            f().P0().n(new RoutingIntentHandler(null, RoutingType.TELE_DASHBOARD_SMOOTH_SCROLL, false, 4, null));
                                                        } else {
                                                            if (!i.b(str, "topical_courses_listing") && !i.b(str, "topical_course_activity") && !i.b(str, "topical_courses_goals")) {
                                                                if (i.b(str, Constants.LINK_TELECOMMUNICATION_CUSTOM_URL)) {
                                                                    intent = new Intent(f(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.FLOW_REDIRECT).putExtra("redirect_url", bundle.getString(Constants.NOTIFICATION_URL, ""));
                                                                } else if (i.b(str, "journal_entry_card")) {
                                                                    f().P0().n(new RoutingIntentHandler(null, RoutingType.JOURNAL_DASHBOARD_SMOOTH_SCROLL, false, 4, null));
                                                                } else if (i.b(str, "journal_listing")) {
                                                                    f().P0().n(new RoutingIntentHandler(null, RoutingType.JOURNAL_DASHBOARD_SMOOTH_SCROLL, false, 4, null));
                                                                    intent = new Intent(f(), JournalActivity.class);
                                                                } else if (i.b(str, "new_journal")) {
                                                                    f().P0().n(new RoutingIntentHandler(null, RoutingType.JOURNAL_DASHBOARD_SMOOTH_SCROLL, false, 4, null));
                                                                    intent = new Intent(f(), JournalActivity.class).putExtra("type", bundle.getString("type", ""));
                                                                } else if (i.b(str, "app_consult_therapy")) {
                                                                    User user4 = FirebasePersistence.getInstance().getUser();
                                                                    if (i.b((user4 == null || (appConfig2 = user4.getAppConfig()) == null) ? null : appConfig2.get(Constants.TELE_ENTRY_POINT_EXPERIMENT), "f")) {
                                                                        intent = new Intent(f(), ExpertCareInfoActivity.class).putExtra("isPsychiatryFlow", false).putExtra("source", "homescreen");
                                                                    }
                                                                } else if (i.b(str, "app_consult_psychiatry")) {
                                                                    User user5 = FirebasePersistence.getInstance().getUser();
                                                                    if (i.b((user5 == null || (appConfig = user5.getAppConfig()) == null) ? null : appConfig.get(Constants.TELE_ENTRY_POINT_EXPERIMENT), "f")) {
                                                                        intent = new Intent(f(), ExpertCareInfoActivity.class).putExtra("isPsychiatryFlow", true).putExtra("source", "homescreen");
                                                                    }
                                                                } else if (!i.b(str, "app_entry_comm_card")) {
                                                                    return;
                                                                } else {
                                                                    f().P0().n(new RoutingIntentHandler(null, RoutingType.COMMUNITY_DASHBOARD_SMOOTH_SCROLL, false, 4, null));
                                                                }
                                                            }
                                                            Extensions extensions4 = Extensions.INSTANCE;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) f().n0(R.id.clTopicalCardContainer);
                                                            i.f(constraintLayout, "activity.clTopicalCardContainer");
                                                            if (extensions4.isVisible(constraintLayout)) {
                                                                ApplicationPersistence.getInstance().setBooleanValue("topical_card_clicked", true);
                                                                intent = new Intent(f(), AllTopicalCoursesActivity.class);
                                                                if (i.b(str, "topical_course_activity")) {
                                                                    intent.putExtra("topical_course", bundle.getString("topical_course"));
                                                                } else if (i.b(str, "topical_courses_goals")) {
                                                                    intent.putExtra("isGoalScreen", true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            intent = new Intent(f(), CommunitiesPwaActivity.class);
                                        }
                                    }
                                    str4 = str7;
                                    intent = null;
                                }
                                obj = obj;
                                str2 = str3;
                                intent = new Intent(f(), PushActivity.class);
                                str4 = str4;
                                new Bundle().putString(str4, str);
                            }
                            obj = obj;
                            intent = intent2;
                        }
                        if (intent != null) {
                        }
                    }
                    str2 = str3;
                    if (intent != null) {
                    }
                }
                str4 = str7;
                if (intent != null) {
                }
            }
            obj = Constants.SCREEN_SLIDER_ASSESSMENT;
            str2 = Constants.DAYMODEL_POSITION;
            str4 = Constants.API_COURSE_LINK;
            if (intent != null) {
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x062d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x058f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026c A[Catch: Exception -> 0x065d, TryCatch #0 {Exception -> 0x065d, blocks: (B:4:0x0026, B:6:0x002c, B:7:0x0036, B:9:0x003b, B:12:0x0043, B:34:0x0254, B:36:0x025a, B:43:0x026c, B:70:0x0523, B:71:0x0538, B:73:0x053e, B:75:0x0552, B:76:0x0555, B:78:0x0568, B:80:0x056c, B:82:0x0587, B:83:0x058f, B:85:0x0595, B:87:0x05ae, B:89:0x05b6, B:92:0x05bc, B:97:0x05c9, B:99:0x05d3, B:101:0x05f7, B:105:0x0608, B:107:0x0616, B:112:0x061e, B:113:0x0621, B:115:0x062d, B:117:0x063e, B:120:0x0644, B:121:0x0649, B:81:0x057a, B:44:0x028e, B:13:0x008b, B:16:0x0093, B:17:0x00de, B:20:0x00e6, B:21:0x0127, B:24:0x012f, B:25:0x017a, B:28:0x0184, B:29:0x01d9, B:32:0x01e0, B:33:0x0227, B:45:0x02a2, B:47:0x02a8, B:48:0x02af, B:50:0x02b4, B:53:0x02bc, B:54:0x033a, B:57:0x0342, B:58:0x03c0, B:61:0x03c8, B:62:0x0430, B:65:0x0438, B:66:0x04a0, B:69:0x04a7), top: B:126:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x028e A[Catch: Exception -> 0x065d, TryCatch #0 {Exception -> 0x065d, blocks: (B:4:0x0026, B:6:0x002c, B:7:0x0036, B:9:0x003b, B:12:0x0043, B:34:0x0254, B:36:0x025a, B:43:0x026c, B:70:0x0523, B:71:0x0538, B:73:0x053e, B:75:0x0552, B:76:0x0555, B:78:0x0568, B:80:0x056c, B:82:0x0587, B:83:0x058f, B:85:0x0595, B:87:0x05ae, B:89:0x05b6, B:92:0x05bc, B:97:0x05c9, B:99:0x05d3, B:101:0x05f7, B:105:0x0608, B:107:0x0616, B:112:0x061e, B:113:0x0621, B:115:0x062d, B:117:0x063e, B:120:0x0644, B:121:0x0649, B:81:0x057a, B:44:0x028e, B:13:0x008b, B:16:0x0093, B:17:0x00de, B:20:0x00e6, B:21:0x0127, B:24:0x012f, B:25:0x017a, B:28:0x0184, B:29:0x01d9, B:32:0x01e0, B:33:0x0227, B:45:0x02a2, B:47:0x02a8, B:48:0x02af, B:50:0x02b4, B:53:0x02bc, B:54:0x033a, B:57:0x0342, B:58:0x03c0, B:61:0x03c8, B:62:0x0430, B:65:0x0438, B:66:0x04a0, B:69:0x04a7), top: B:126:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(final View view, final LearningHubModel model, final boolean z10) {
        String duration;
        boolean z11;
        i.g(model, "model");
        try {
            if (z10) {
                String post_type = model.getPost_type();
                if (post_type != null) {
                    switch (post_type.hashCode()) {
                        case -1864532585:
                            if (!post_type.equals("Quotes")) {
                                break;
                            } else {
                                view.findViewById(R.id.tint).setVisibility(8);
                                ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.quotes));
                                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.white));
                                ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(f(), R.drawable.ic_learning_hub_quotes_bg));
                                break;
                            }
                        case -1732810888:
                            if (!post_type.equals("Videos")) {
                                break;
                            } else {
                                view.findViewById(R.id.tint).setVisibility(8);
                                ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(0);
                                ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageResource(0);
                                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.white));
                                ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(f(), R.drawable.ic_video));
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.video));
                                break;
                            }
                        case -1692490108:
                            if (!post_type.equals("Creatives")) {
                                break;
                            } else {
                                view.findViewById(R.id.tint).setVisibility(8);
                                ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.creatives));
                                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.white));
                                ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(f(), R.drawable.ic_learning_hub_creative_bg));
                                break;
                            }
                        case -1164233123:
                            if (!post_type.equals("Articles")) {
                                break;
                            } else {
                                view.findViewById(R.id.tint).setVisibility(8);
                                ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                                ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageResource(0);
                                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.white));
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.article));
                                break;
                            }
                        case -312086034:
                            if (!post_type.equals("Therapist says")) {
                                break;
                            } else {
                                view.findViewById(R.id.tint).setVisibility(8);
                                ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.therapistSays));
                                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.white));
                                ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(f(), R.drawable.ic_learning_hub_therapist_says_bg));
                                break;
                            }
                        case 2606936:
                            if (!post_type.equals("Tips")) {
                                break;
                            } else {
                                view.findViewById(R.id.tint).setVisibility(8);
                                ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.quotes));
                                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.white));
                                ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(f(), R.drawable.ic_learning_hub_tips_bg));
                                break;
                            }
                    }
                    duration = model.getDuration();
                    if (duration != null && duration.length() != 0) {
                        z11 = false;
                        if (z11) {
                            ((RobertoTextView) view.findViewById(R.id.tvDuration)).setText(model.getDuration());
                            ((RobertoTextView) view.findViewById(R.id.tvDuration)).setVisibility(0);
                            ((RobertoTextView) view.findViewById(R.id.robertoTextView8)).setVisibility(0);
                        } else {
                            ((RobertoTextView) view.findViewById(R.id.tvDuration)).setVisibility(8);
                            ((RobertoTextView) view.findViewById(R.id.robertoTextView8)).setVisibility(8);
                        }
                    }
                    z11 = true;
                    if (z11) {
                    }
                }
                view.findViewById(R.id.tint).setVisibility(0);
                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.white));
                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.different));
                duration = model.getDuration();
                if (duration != null) {
                    z11 = false;
                    if (z11) {
                    }
                }
                z11 = true;
                if (z11) {
                }
            } else {
                String post_type2 = model.getPost_type();
                if (post_type2 != null) {
                    switch (post_type2.hashCode()) {
                        case -1864532585:
                            if (!post_type2.equals("Quotes")) {
                                break;
                            } else {
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderQuotes));
                                view.findViewById(R.id.tint).setVisibility(8);
                                ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(a.b(f(), R.color.white));
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(a.b(f(), R.color.white));
                                ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(a.b(f(), R.color.white));
                                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.solid_dark_blue));
                                ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(f(), R.drawable.ic_quote_background));
                                break;
                            }
                        case -1692490108:
                            if (!post_type2.equals("Creatives")) {
                                break;
                            } else {
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderCreatives));
                                view.findViewById(R.id.tint).setVisibility(0);
                                ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(a.b(f(), R.color.white));
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(a.b(f(), R.color.white));
                                ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(a.b(f(), R.color.white));
                                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.grey_2));
                                break;
                            }
                        case -1164233123:
                            if (!post_type2.equals("Articles")) {
                                break;
                            } else {
                                view.findViewById(R.id.tint).setVisibility(0);
                                ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(a.b(f(), R.color.white));
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(a.b(f(), R.color.white));
                                ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(a.b(f(), R.color.white));
                                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.grey_2));
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderArticles));
                                break;
                            }
                        case -312086034:
                            if (!post_type2.equals("Therapist says")) {
                                break;
                            } else {
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderTherapistSays));
                                view.findViewById(R.id.tint).setVisibility(8);
                                ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(a.b(f(), R.color.white));
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(a.b(f(), R.color.white));
                                ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(a.b(f(), R.color.white));
                                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.alt_orange_light));
                                ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(f(), R.drawable.ic_therapist_says_background));
                                break;
                            }
                        case 2606936:
                            if (!post_type2.equals("Tips")) {
                                break;
                            } else {
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderTips));
                                view.findViewById(R.id.tint).setVisibility(8);
                                ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(a.b(f(), R.color.white));
                                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(a.b(f(), R.color.white));
                                ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(a.b(f(), R.color.white));
                                ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(a.b(f(), R.color.goalBlue));
                                ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(f(), R.drawable.ic_tips_background));
                                break;
                            }
                    }
                }
            }
            final kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            final ArrayList<PostsRead> postsRead = FirebasePersistence.getInstance().getUser().getPostsRead();
            Iterator<PostsRead> it = postsRead.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i.b(it.next().getPostId(), model.getId())) {
                        uVar.f23466u = true;
                    }
                }
            }
            if (model.getDay() == ((int) f().N0().getCourseOpenDay()) && !uVar.f23466u) {
                ((RobertoTextView) view.findViewById(R.id.tvNew)).setVisibility(0);
            } else {
                ((RobertoTextView) view.findViewById(R.id.tvNew)).setVisibility(8);
            }
            final ArrayList<LearningHubFieldModel> fields = model.getFields();
            Iterator<LearningHubFieldModel> it2 = fields.iterator();
            while (it2.hasNext()) {
                LearningHubFieldModel next = it2.next();
                if (is.k.Q1(next.getData_title(), new String[]{"cover", "thumbnail"})) {
                    Object value = next.getValue();
                    String str = value instanceof String ? (String) value : null;
                    if ((str != null && (n.B0(str) ^ true)) && !f().isFinishing()) {
                        e<Bitmap> a10 = Glide.g(f().getApplicationContext()).a();
                        a10.Z = next.getValue();
                        a10.f5953b0 = true;
                        a10.B((AppCompatImageView) view.findViewById(R.id.ivTitleCard));
                        if (i.b(next.getData_title(), "title")) {
                            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvTitleCard);
                            Object value2 = next.getValue();
                            String str2 = value2 instanceof String ? (String) value2 : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            robertoTextView.setText(str2);
                        }
                        if (!i.b(next.getData_title(), "short_desc")) {
                            RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvTitleCard);
                            Object value3 = next.getValue();
                            String str3 = value3 instanceof String ? (String) value3 : null;
                            robertoTextView2.setText(str3 != null ? str3 : "");
                        }
                    }
                }
                if (i.b(next.getData_title(), "title")) {
                }
                if (!i.b(next.getData_title(), "short_desc")) {
                }
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: ll.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str4;
                    String str5;
                    String str6;
                    kotlin.jvm.internal.u added = kotlin.jvm.internal.u.this;
                    i.g(added, "$added");
                    LearningHubModel model2 = model;
                    i.g(model2, "$model");
                    View row = view;
                    i.g(row, "$row");
                    V3DashboardUtils this$0 = this;
                    i.g(this$0, "this$0");
                    ArrayList values = fields;
                    i.g(values, "$values");
                    if (!added.f23466u) {
                        PostsRead postsRead2 = new PostsRead();
                        postsRead2.setCourseName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        postsRead2.setPostId(model2.getId());
                        ArrayList<PostsRead> arrayList = postsRead;
                        arrayList.add(postsRead2);
                        FirebasePersistence.getInstance().getUser().setPostsRead(arrayList);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        ((RobertoTextView) row.findViewById(R.id.tvNew)).setVisibility(8);
                    }
                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_LEARNING_HUB, false) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        ApplicationPersistence.getInstance().setBooleanValue(Constants.FFM_LEARNING_HUB, true);
                        this$0.f().f10727i0 = true;
                    }
                    if (z10) {
                        Bundle bundle = new Bundle();
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        bundle.putString("post_id", model2.getId());
                        bundle.putString("post_type", model2.getPost_type());
                        Iterator it3 = values.iterator();
                        while (it3.hasNext()) {
                            LearningHubFieldModel learningHubFieldModel = (LearningHubFieldModel) it3.next();
                            String str7 = "";
                            if (i.b(learningHubFieldModel.getData_title(), "title")) {
                                Object value4 = learningHubFieldModel.getValue();
                                if (value4 instanceof String) {
                                    str5 = (String) value4;
                                } else {
                                    str5 = null;
                                }
                                if (str5 != null) {
                                    str7 = str5;
                                }
                                bundle.putString("post_name", str7);
                            } else if (i.b(learningHubFieldModel.getData_title(), "short_desc")) {
                                Object value5 = learningHubFieldModel.getValue();
                                if (value5 instanceof String) {
                                    str6 = (String) value5;
                                } else {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    str7 = str6;
                                }
                                bundle.putString("post_name", str7);
                            }
                        }
                        bundle.putString("post_course", model2.getProgramme());
                        if (added.f23466u) {
                            str4 = "read";
                        } else {
                            str4 = "unread";
                        }
                        bundle.putString("status", str4);
                        bundle.putString("source", "home_screen");
                        bundle.putString("section", "today");
                        gk.a.b(bundle, "cm_post_detail");
                        this$0.f().startActivityForResult(new Intent(this$0.f(), LearningHubExperimentActivity.class).putExtra("learningHubList", this$0.f().V).putExtra("model", model2).putExtra("showPage", false).putExtra("source", Constants.SCREEN_DASHBOARD), this$0.f().K);
                        return;
                    }
                    this$0.f().startActivityForResult(new Intent(this$0.f(), LearningHubActivity.class).putExtra("learningHubList", this$0.f().V).putExtra("model", model2).putExtra("showPage", false).putExtra("source", Constants.SCREEN_DASHBOARD), this$0.f().K);
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10899a, "exception", e10);
        }
    }

    public final void m() {
        if (f().f10725h0) {
            return;
        }
        boolean z10 = true;
        f().f10725h0 = true;
        Integer dayPlanPositionForDateV3 = CourseUtilKt.getDayPlanPositionForDateV3(f().N0().getPlanV3(), Utils.INSTANCE.getTodayTimeInSeconds());
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
            if (!i.b(FirebasePersistence.getInstance().getUser().getCurrentMiniCourse(), "")) {
                ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
                i.f(miniCourses, "getInstance().user.miniCourses");
                ArrayList arrayList = new ArrayList();
                for (Object obj : miniCourses) {
                    if (i.b(((MiniCourse) obj).getDomain(), FirebasePersistence.getInstance().getUser().getCurrentMiniCourse())) {
                        arrayList.add(obj);
                    }
                }
                if ((!arrayList.isEmpty()) && ((MiniCourse) arrayList.get(0)).getPlan().size() >= 2 && ((MiniCourse) arrayList.get(0)).getPlan().get(1).getStart_date() == 0 && ((MiniCourse) arrayList.get(0)).getPlan().get(0).getStart_date() != 0 && ((MiniCourse) arrayList.get(0)).getPlan().get(0).getStart_date() < Utils.INSTANCE.getTodayTimeInSeconds() && i()) {
                    n();
                }
            }
        } else if (dayPlanPositionForDateV3 != null && dayPlanPositionForDateV3.intValue() == 2 && i()) {
            CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) u.j2(dayPlanPositionForDateV3.intValue(), f().N0().getPlanV3());
            if ((courseDayModelV1 == null || courseDayModelV1.getStart_date() != 0) ? false : false) {
                n();
            }
        }
    }

    public final void n() {
        if (ApplicationPersistence.getInstance().getBooleanValue("welcome_popup_displayed", false)) {
            return;
        }
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.activity_welcome_back, f(), R.style.Theme_Dialog);
        ((RobertoTextView) styledDialog.findViewById(R.id.letsBegin)).setOnClickListener(new ll.e(styledDialog, this, 0));
        ((RobertoTextView) styledDialog.findViewById(R.id.go_home)).setOnClickListener(new ll.e(styledDialog, this, 1));
        styledDialog.show();
        ApplicationPersistence.getInstance().setBooleanValue("welcome_popup_displayed", true);
    }

    public final void o() {
        boolean z10;
        try {
            if (f().G != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !f().U0().isEmpty() && f().c0) {
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_course_welcome_monetized, f(), R.style.Theme_Dialog_Fullscreen);
                View findViewById = styledDialog.findViewById(R.id.miniCourseWelcomeHeading);
                i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                ((RobertoTextView) findViewById).setText(f().getString(R.string.onboardingBasicDialogHeader, FirebasePersistence.getInstance().getUser().getFirstName()));
                ((ConstraintLayout) styledDialog.findViewById(R.id.basicCourseContainer)).setVisibility(8);
                ((CardView) styledDialog.findViewById(R.id.miniCourseCardPortrait)).setVisibility(0);
                ((CardView) styledDialog.findViewById(R.id.miniCourseCard)).getLayoutParams().width = -2;
                ((CardView) styledDialog.findViewById(R.id.miniCourseCard)).setBackgroundResource(R.color.white);
                CardView cardView = (CardView) styledDialog.findViewById(R.id.miniCourseCardPortrait);
                MiniCoursesViewModel V0 = f().V0();
                String domain = f().U0().get(0).getDomain();
                i.d(domain);
                ((RobertoTextView) cardView.findViewById(R.id.tvRowMiniCourseName)).setText(V0.h(domain));
                ((RobertoTextView) cardView.findViewById(R.id.tvRowMiniCourseStatus)).setText(f().getString(R.string.begin_today));
                ((AppCompatImageView) cardView.findViewById(R.id.lockedImg)).setVisibility(8);
                ((RobertoTextView) cardView.findViewById(R.id.tvRowMiniCourseSessions)).setText(f().U0().get(0).getPlan().size() + " days");
                String domain2 = f().U0().get(0).getDomain();
                i.d(domain2);
                Integer[] miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(domain2);
                if (miniCourseImage != null) {
                    V3DashboardActivity f = f();
                    Glide.c(f).d(f).o(miniCourseImage[0]).B((AppCompatImageView) cardView.findViewById(R.id.tvRowMiniCourseBg));
                    ((AppCompatImageView) cardView.findViewById(R.id.tvRowMiniCourseBg)).setBackgroundResource(miniCourseImage[1].intValue());
                    ((ConstraintLayout) cardView.findViewById(R.id.parentLayout)).setBackgroundResource(miniCourseImage[1].intValue());
                    ((RobertoTextView) ((ConstraintLayout) cardView.findViewById(R.id.parentLayout)).findViewById(R.id.tvRowMiniCourseName)).setTextColor(a.b(f(), R.color.title_high_contrast));
                    ((RobertoTextView) ((ConstraintLayout) cardView.findViewById(R.id.parentLayout)).findViewById(R.id.tvRowMiniCourseSessions)).setTextColor(a.b(f(), R.color.title_high_contrast));
                    ((RobertoTextView) ((ConstraintLayout) cardView.findViewById(R.id.parentLayout)).findViewById(R.id.tvRowMiniCourseStatus)).setTextColor(a.b(f(), R.color.title_high_contrast));
                    ((CardView) styledDialog.findViewById(R.id.monetizedPulseBackground)).setCardBackgroundColor(a.b(f(), miniCourseImage[1].intValue()));
                }
                cardView.setOnClickListener(new ll.e(this, styledDialog, 2));
                AnimUtils animUtils = AnimUtils.INSTANCE;
                CardView cardView2 = (CardView) styledDialog.findViewById(R.id.monetizedPulseBackground);
                i.f(cardView2, "dialog.monetizedPulseBackground");
                AnimUtils.showPulseEffect$default(animUtils, cardView2, 2500L, 1.3f, 0.0f, 0, 24, null);
                Window window = styledDialog.getWindow();
                if (window != null) {
                    window.setLayout(-1, -1);
                }
                styledDialog.show();
                Bundle bundle = new Bundle();
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle.putBoolean("isMonetized", true);
                gk.a.b(bundle, "plan_onboarding_start");
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10899a, e10);
        }
    }

    public final void p() {
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_mini_course_welcome_unmonetized, f(), R.style.Theme_Dialog_Fullscreen);
        if (FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3().size() > 1) {
            f().f10717b0 = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3().get(1);
        }
        if (f().f10717b0 != null) {
            View findViewById = styledDialog.findViewById(R.id.miniCourseWelcomeTitle);
            i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            CourseDayModelV1 courseDayModelV1 = f().f10717b0;
            i.d(courseDayModelV1);
            ((RobertoTextView) findViewById).setText(courseDayModelV1.getContent_label());
            View findViewById2 = styledDialog.findViewById(R.id.miniCourseWelcomeHeading);
            i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById2).setText(f().getResources().getString(R.string.onboardingDailyPlanDialogTitle, FirebasePersistence.getInstance().getUser().getFirstName()));
            styledDialog.findViewById(R.id.miniCourseWelcomeImage).setOnClickListener(new ll.e(this, styledDialog, 3));
            AnimUtils animUtils = AnimUtils.INSTANCE;
            View findViewById3 = styledDialog.findViewById(R.id.unmonetizedPulseBackground);
            i.f(findViewById3, "dialog.findViewById(R.id…monetizedPulseBackground)");
            AnimUtils.showPulseEffect$default(animUtils, findViewById3, 2500L, 0.0f, 0.0f, 0, 28, null);
            Window window = styledDialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            styledDialog.show();
            return;
        }
        o();
    }
}
