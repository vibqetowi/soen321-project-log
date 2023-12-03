package ni;

import an.d0;
import an.n;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.moengage.pushbase.push.PushMessageListener;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalGoalsActivity;
import com.theinnerhour.b2b.model.AppFeedback;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AnimUtils;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.RoutingType;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dw.h;
import fj.c0;
import fj.z;
import hh.g;
import hl.s;
import ik.j1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;
import java.util.WeakHashMap;
import mi.i1;
import t0.d0;
import t0.o0;
import zm.f;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26322u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f26323v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f26324w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f26325x;

    public /* synthetic */ c(int i6, Object obj, Object obj2, Object obj3) {
        this.f26322u = i6;
        this.f26323v = obj;
        this.f26324w = obj2;
        this.f26325x = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[Catch: Exception -> 0x00a7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a7, blocks: (B:3:0x001b, B:5:0x0024, B:6:0x0027, B:8:0x002f, B:9:0x0037, B:14:0x0044, B:16:0x004c, B:18:0x0052, B:20:0x005d, B:22:0x0067, B:30:0x0088, B:23:0x006f, B:25:0x0077, B:27:0x007d), top: B:35:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        View childAt;
        View findViewById;
        RecyclerView recyclerView;
        View childAt2;
        LinearLayout linearLayout;
        View childAt3;
        an.n this$0 = (an.n) this.f26323v;
        Float f = (Float) this.f26324w;
        f.b indexInfo = (f.b) this.f26325x;
        int i6 = an.n.I;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(indexInfo, "$indexInfo");
        try {
            NestedScrollView nestedScrollView = (NestedScrollView) this$0._$_findCachedViewById(R.id.nsvAcScrollContainer);
            if (nestedScrollView != null) {
                nestedScrollView.fling(0);
            }
            NestedScrollView nestedScrollView2 = (NestedScrollView) this$0._$_findCachedViewById(R.id.nsvAcScrollContainer);
            if (nestedScrollView2 != null) {
                nestedScrollView2.smoothScrollTo(0, (int) f.floatValue());
            }
            boolean z10 = indexInfo.f39648c;
            int i10 = indexInfo.f39646a;
            if (z10) {
                Integer num = indexInfo.f39647b;
                if (num != null && (recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler)) != null && (childAt2 = recyclerView.getChildAt(i10)) != null && (linearLayout = (LinearLayout) childAt2.findViewById(R.id.llRowCACFillerActivityContainer)) != null && (childAt3 = linearLayout.getChildAt(num.intValue())) != null) {
                    findViewById = childAt3.findViewById(R.id.viewRowCAFPulseBg);
                    if (findViewById == null) {
                        findViewById.setVisibility(0);
                        AnimatorSet showPulseEffect$default = AnimUtils.showPulseEffect$default(AnimUtils.INSTANCE, findViewById, 1500L, 1.3f, 0.0f, 0, 24, null);
                        showPulseEffect$default.addListener(new n.g(findViewById, this$0));
                        this$0.C = showPulseEffect$default;
                        return;
                    }
                    return;
                }
                findViewById = null;
                if (findViewById == null) {
                }
            } else {
                RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                if (recyclerView2 != null && (childAt = recyclerView2.getChildAt(i10)) != null) {
                    findViewById = childAt.findViewById(R.id.viewRowCACPulseBg);
                    if (findViewById == null) {
                    }
                }
                findViewById = null;
                if (findViewById == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f744u, e10);
        }
    }

    private final void b() {
        NestedScrollView nestedScrollView;
        View childAt;
        ArrayList dayPlanList = (ArrayList) this.f26323v;
        d0 this$0 = (d0) this.f26325x;
        String it = (String) this.f26324w;
        int i6 = d0.N;
        kotlin.jvm.internal.i.g(dayPlanList, "$dayPlanList");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(it, "$it");
        try {
            Iterator it2 = dayPlanList.iterator();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (kotlin.jvm.internal.i.b(((CourseDayModelV1) it2.next()).getContent_id(), it)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i10);
            if (valueOf.intValue() == -1) {
                z10 = true;
            }
            Float f = null;
            if (z10) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvShortCoursesDayPlan);
                if (recyclerView != null && (childAt = recyclerView.getChildAt(intValue)) != null) {
                    f = Float.valueOf(childAt.getY());
                }
                if (f != null && (nestedScrollView = (NestedScrollView) this$0._$_findCachedViewById(R.id.nsvShorCoursesScrollContainer)) != null) {
                    nestedScrollView.post(new s7.b(this$0, f, intValue, 4));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f688u, e10);
        }
    }

    private final void c() {
        RecyclerView this_apply = (RecyclerView) this.f26323v;
        op.a this_run = (op.a) this.f26324w;
        op.a this$0 = (op.a) this.f26325x;
        int i6 = op.a.D;
        kotlin.jvm.internal.i.g(this_apply, "$this_apply");
        kotlin.jvm.internal.i.g(this_run, "$this_run");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        try {
            this_apply.h0(5000);
            this_apply.j0(10, 0);
            Timer timer = new Timer();
            this_run.f27699z = timer;
            timer.scheduleAtFixedRate(new op.d(this$0, this_run), 8000L, 5000L);
            this_apply.h(new op.e(this_run));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this_run.f27695v, e10);
        }
    }

    private final void d() {
        TopicalGoalsActivity this$0 = (TopicalGoalsActivity) this.f26323v;
        Goal goal = (Goal) this.f26324w;
        kotlin.jvm.internal.x updationModel = (kotlin.jvm.internal.x) this.f26325x;
        int i6 = TopicalGoalsActivity.P;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(goal, "$goal");
        kotlin.jvm.internal.i.g(updationModel, "$updationModel");
        Date date = this$0.E;
        kotlin.jvm.internal.i.f(date, "this.displayDate");
        GamificationModel gamificationModel = (GamificationModel) updationModel.f23469u;
        try {
            ArrayList<GamificationModel> arrayList = new ArrayList<>();
            HashMap<Date, GoalDateObj> goalDateObjMap = goal.getGoalDateObjMap();
            GoalDateObj goalDateObj = goalDateObjMap.get(date);
            kotlin.jvm.internal.i.d(goalDateObj);
            boolean z10 = true;
            if (!goalDateObj.isConsecutive3DaysHP()) {
                Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
                todayCalendar.setTime(date);
                boolean z11 = true;
                for (int i10 = 0; i10 < 2; i10++) {
                    todayCalendar.add(5, -1);
                    if (goalDateObjMap.containsKey(todayCalendar.getTime())) {
                        GoalDateObj goalDateObj2 = goalDateObjMap.get(todayCalendar.getTime());
                        kotlin.jvm.internal.i.d(goalDateObj2);
                        if (!goalDateObj2.isConsecutive3DaysHP()) {
                        }
                    }
                    z11 = false;
                }
                if (z11) {
                    Calendar todayCalendar2 = Utils.INSTANCE.getTodayCalendar();
                    todayCalendar2.setTime(date);
                    for (int i11 = 0; i11 < 3; i11++) {
                        Iterator<GoalDateObj> it = goal.getTrackList().iterator();
                        while (it.hasNext()) {
                            GoalDateObj next = it.next();
                            if (next.getmDate().getTime() == todayCalendar2.getTime().getTime()) {
                                next.setConsecutive3DaysHP(true);
                            }
                        }
                        todayCalendar2.add(5, -1);
                    }
                    GamificationModel gamificationModel2 = new GamificationModel(20, Constants.GAMIFICATION_GOAL_3DAYS_COMPLETITION_TASK, FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.getGoalName(goal.getGoalId()));
                    goal.getGoalgamificationList().add(gamificationModel2);
                    arrayList.add(gamificationModel2);
                }
            }
            if (gamificationModel != null) {
                goal.getGoalgamificationList().add(gamificationModel);
                arrayList.add(gamificationModel);
            }
            FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(arrayList);
            if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.TRACKING_GOALS_FOR_A_WEEK_BADGE)) {
                Calendar todayCalendar3 = Utils.INSTANCE.getTodayCalendar();
                todayCalendar3.setTime(date);
                HashMap<Date, GoalDateObj> goalDateObjMap2 = goal.getGoalDateObjMap();
                for (int i12 = 0; i12 < 7; i12++) {
                    if (!goalDateObjMap2.containsKey(todayCalendar3.getTime())) {
                        z10 = false;
                    }
                    todayCalendar3.add(5, -1);
                }
                if (z10) {
                    HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                    kotlin.jvm.internal.i.f(badges, "getInstance().user.userGamificationModel.badges");
                    badges.put(Constants.TRACKING_GOALS_FOR_A_WEEK_BADGE, Constants.BADGE_ATTAINED);
                }
            }
            FirebasePersistence.getInstance().updateTopicalGoal(goal);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        int i6 = this.f26322u;
        int i10 = -1;
        Object obj = this.f26325x;
        Object obj2 = this.f26324w;
        Object obj3 = this.f26323v;
        boolean z13 = true;
        switch (i6) {
            case 0:
                n this$0 = (n) obj3;
                String assetsPath = (String) obj2;
                ViewGroup containerLayout = (ViewGroup) obj;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(assetsPath, "$assetsPath");
                kotlin.jvm.internal.i.g(containerLayout, "$containerLayout");
                Activity activity = this$0.f26318a;
                pi.h hVar = this$0.f26341d;
                ih.p pVar = this$0.f26340c;
                try {
                    hh.g.b(pVar.f20105d, 0, new l(this$0), 3);
                    oi.b bVar = new oi.b(activity);
                    WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                    bVar.setId(d0.e.a());
                    WebSettings settings = bVar.getSettings();
                    bh.a.f4292a.getClass();
                    bh.a.f4296e.getClass();
                    settings.setJavaScriptEnabled(true);
                    settings.setUseWideViewPort(true);
                    settings.setLoadWithOverviewMode(true);
                    settings.setDisplayZoomControls(false);
                    settings.setDomStorageEnabled(true);
                    settings.setAllowFileAccess(true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    bVar.setWebViewClient(new oi.c(hVar));
                    bVar.addJavascriptInterface(new oi.a(activity, hVar, this$0.f, pVar), "moengageInternal");
                    bVar.loadDataWithBaseURL("file://" + assetsPath + '/', hVar.f28479q, "text/html", "utf-8", null);
                    bVar.setLayoutParams(layoutParams);
                    bVar.setBackgroundColor(0);
                    containerLayout.addView(bVar);
                    return;
                } catch (Throwable th2) {
                    hh.a aVar = hh.g.f17610d;
                    g.a.a(1, th2, new m(this$0));
                    i1.f25206a.getClass();
                    i1.a(pVar).f35176i = true;
                    return;
                }
            case 1:
                Context context = (Context) obj3;
                ih.p sdkInstance = (ih.p) obj2;
                Bundle payload = (Bundle) obj;
                kotlin.jvm.internal.i.g(context, "$context");
                kotlin.jvm.internal.i.g(sdkInstance, "$sdkInstance");
                kotlin.jvm.internal.i.g(payload, "$payload");
                try {
                    pj.b d10 = new lj.h(sdkInstance).d(payload);
                    String str = d10.f28527b;
                    if (!gv.n.B0(str) && !d10.f28532h.f28521e) {
                        ai.d dVar = new ai.d(context, sdkInstance);
                        if (dVar.d(str)) {
                            dVar.c(str);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    sdkInstance.f20105d.a(1, th3, z.f15117u);
                    return;
                }
            case 2:
                Set<oj.b> listeners = (Set) obj3;
                String token = (String) obj2;
                pj.c pushService = (pj.c) obj;
                kotlin.jvm.internal.i.g(listeners, "$listeners");
                kotlin.jvm.internal.i.g(token, "$token");
                kotlin.jvm.internal.i.g(pushService, "$pushService");
                try {
                    for (oj.b bVar2 : listeners) {
                        bVar2.a();
                    }
                    return;
                } catch (Throwable th4) {
                    hh.a aVar2 = hh.g.f17610d;
                    g.a.a(1, th4, c0.f15070u);
                    return;
                }
            case 3:
                PushMessageListener this$02 = (PushMessageListener) obj3;
                Context context2 = (Context) obj2;
                Intent intent = (Intent) obj;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(context2, "$context");
                kotlin.jvm.internal.i.g(intent, "$intent");
                fj.n nVar = this$02.f10243i;
                ih.p pVar2 = nVar.f15088a;
                try {
                    fj.d.f15071a.getClass();
                    if (!fj.d.b(context2, pVar2).d()) {
                        hh.g.b(pVar2.f20105d, 0, new fj.l(nVar), 3);
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            nVar.b(context2, extras);
                            intent.removeExtra("moe_template_meta");
                            intent.removeExtra("shownOffline");
                            intent.removeExtra("moe_push_source");
                            intent.removeExtra("from_appOpen");
                            intent.removeExtra("moe_cid_attr");
                        }
                    }
                    return;
                } catch (Exception e10) {
                    pVar2.f20105d.a(1, e10, new fj.m(nVar));
                    return;
                }
            case 4:
                String str2 = (String) obj2;
                WebviewActivity this$03 = (WebviewActivity) obj3;
                String str3 = (String) obj;
                int i11 = WebviewActivity.F;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                try {
                    if (str2 != null) {
                        WebView webView = (WebView) this$03.n0(R.id.wvCommunitiesPwa);
                        if (webView != null) {
                            webView.loadUrl(str3 + "?token=" + str2);
                        }
                    } else {
                        WebView webView2 = (WebView) this$03.n0(R.id.wvCommunitiesPwa);
                        if (webView2 != null) {
                            webView2.loadUrl(str3);
                        }
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$03.f10563v, e11);
                    return;
                }
            case 5:
                String feedback = (String) obj2;
                V2DashboardActivity this$04 = (V2DashboardActivity) obj3;
                Dialog dialog = (Dialog) obj;
                int i12 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(feedback, "$feedback");
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                switch (feedback.hashCode()) {
                    case -2111852769:
                        if (feedback.equals(Constants.FEEDBACK_POPUP_THOUGHTS)) {
                            this$04.h1(this$04.f10679y, Constants.FEEDBACK_ISPLATFORM);
                            FirebasePersistence.getInstance().getUser().getAppFeedback().setThoughtsFeedback(this$04.P0());
                            FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                            break;
                        }
                        break;
                    case -1142683118:
                        if (feedback.equals(Constants.FEEDBACK_POPUP_BOOK_SESSION)) {
                            this$04.h1(this$04.f10679y, Constants.FEEDBACK_ISPLATFORM);
                            FirebasePersistence.getInstance().getUser().getAppFeedback().setBookSessionFeedback(this$04.P0());
                            FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                            break;
                        }
                        break;
                    case -1043740647:
                        if (feedback.equals(Constants.FEEDBACK_TOP_MENU)) {
                            this$04.h1(this$04.f10679y, Constants.FEEDBACK_TOP_MENU);
                            FirebasePersistence.getInstance().getUser().getAppFeedback().setTopMenuFeedback(this$04.P0());
                            int i13 = this$04.f10679y;
                            if (i13 <= 3) {
                                this$04.w1();
                            } else {
                                this$04.B1();
                            }
                            Bundle bundle = new Bundle();
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                bundle.putString("course", user.getCurrentCourseName());
                            }
                            bundle.putInt("rating", i13);
                            gk.a.b(bundle, "af_rating_submit");
                            break;
                        }
                        break;
                    case -305564209:
                        if (feedback.equals(Constants.FEEDBACK_POPUP_ENDURING)) {
                            this$04.h1(this$04.f10679y, Constants.FEEDBACK_ISPLATFORM);
                            FirebasePersistence.getInstance().getUser().getAppFeedback().setEnduringFeedback(this$04.P0());
                            FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                            break;
                        }
                        break;
                    case 64545891:
                        if (feedback.equals(Constants.FEEDBACK_POPUP_COPING_FEELING)) {
                            this$04.h1(this$04.f10679y, Constants.FEEDBACK_ISPLATFORM);
                            FirebasePersistence.getInstance().getUser().getAppFeedback().setCopingFeelingFeedback(this$04.P0());
                            FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                            break;
                        }
                        break;
                    case 159760162:
                        if (feedback.equals(Constants.FEEDBACK_POPUP_COMPANY)) {
                            this$04.h1(this$04.f10679y, Constants.FEEDBACK_ISCOMPANY);
                            FirebasePersistence.getInstance().getUser().getAppFeedback().setCompanyFeedback(this$04.P0());
                            FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                            break;
                        }
                        break;
                    case 813387410:
                        if (feedback.equals(Constants.FEEDBACK_POPUP_ACTIVITIES)) {
                            this$04.h1(this$04.f10679y, Constants.FEEDBACK_ISPLATFORM);
                            FirebasePersistence.getInstance().getUser().getAppFeedback().setActivitiesFeedback(this$04.P0());
                            FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                            break;
                        }
                        break;
                    case 1367467770:
                        if (feedback.equals(Constants.FEEDBACK_POPUP_MOOD_SELECTION)) {
                            this$04.h1(this$04.f10679y, Constants.FEEDBACK_ISPLATFORM);
                            FirebasePersistence.getInstance().getUser().getAppFeedback().setMoodSelectionFeedback(this$04.P0());
                            FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                            break;
                        }
                        break;
                }
                FirebasePersistence.getInstance().updateUserOnFirebase();
                dialog.dismiss();
                return;
            case 6:
                hl.s this$05 = (hl.s) obj3;
                RoutingIntentHandler routingIntentHandler = (RoutingIntentHandler) obj2;
                NotV4DashboardViewModel this_apply = (NotV4DashboardViewModel) obj;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                try {
                    if (!this$05.isDetached() && this$05.isAdded() && this$05.getView() != null) {
                        RoutingType routingType = routingIntentHandler.getRoutingType();
                        if (routingType != null) {
                            i10 = s.f.a.f17746a[routingType.ordinal()];
                        }
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3 && i10 != 4) {
                                    if (i10 == 5) {
                                        FrameLayout frameLayout = (FrameLayout) this$05._$_findCachedViewById(R.id.llNotV4NewCommunityEntryPoint);
                                        if (frameLayout != null && Extensions.INSTANCE.isVisible(frameLayout)) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12) {
                                            this$05.M();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                View _$_findCachedViewById = this$05._$_findCachedViewById(R.id.layoutNotV4DbJournalCard);
                                if (_$_findCachedViewById != null && Extensions.INSTANCE.isVisible(_$_findCachedViewById)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    ((NestedScrollView) this$05._$_findCachedViewById(R.id.nsvNotV4Db)).smoothScrollTo(0, ((int) this$05._$_findCachedViewById(R.id.layoutNotV4DbJournalCard).getY()) - 300, 800);
                                    RoutingIntentHandler d11 = this$05.O().T.d();
                                    if (d11 != null) {
                                        d11.setRoutingCompleted(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (this$05.M) {
                                ((NestedScrollView) this$05._$_findCachedViewById(R.id.nsvNotV4Db)).smoothScrollTo(0, ((int) ((FrameLayout) this$05._$_findCachedViewById(R.id.flExpertCareContainer)).getY()) - 300, 800);
                                RoutingIntentHandler d12 = this$05.O().T.d();
                                if (d12 != null) {
                                    d12.setRoutingCompleted(true);
                                    return;
                                }
                                return;
                            } else {
                                View _$_findCachedViewById2 = this$05._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint);
                                if (_$_findCachedViewById2 != null && Extensions.INSTANCE.isVisible(_$_findCachedViewById2)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    ((NestedScrollView) this$05._$_findCachedViewById(R.id.nsvNotV4Db)).smoothScrollTo(0, ((int) this$05._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint).getY()) - 300, 800);
                                    RoutingIntentHandler d13 = this$05.O().T.d();
                                    if (d13 != null) {
                                        d13.setRoutingCompleted(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        NestedScrollView nestedScrollView = (NestedScrollView) this$05._$_findCachedViewById(R.id.nsvNotV4Db);
                        if (nestedScrollView != null) {
                            nestedScrollView.smoothScrollTo(0, ((int) this$05._$_findCachedViewById(R.id.layoutNotV4DbMoodTrackCard).getY()) - 300, 800);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this_apply.A, e12);
                    return;
                }
            case 7:
                il.q this$06 = (il.q) obj3;
                String feedbackSource = (String) obj2;
                Dialog dialog2 = (Dialog) obj;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(feedbackSource, "$feedbackSource");
                kotlin.jvm.internal.i.g(dialog2, "$dialog");
                this$06.f20385b.H(this$06.f20387d, feedbackSource);
                AppFeedback appFeedback = FirebasePersistence.getInstance().getUser().getAppFeedback();
                String str4 = this$06.f20388e;
                if (str4 != null) {
                    appFeedback.setTopMenuFeedback(str4);
                    int i14 = this$06.f20387d;
                    Activity activity2 = this$06.f20384a;
                    String str5 = this$06.f20386c;
                    if (i14 <= 3) {
                        try {
                            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_feedback_library, activity2, R.style.Theme_Dialog);
                            Window window = styledDialog.getWindow();
                            kotlin.jvm.internal.i.d(window);
                            window.getAttributes().windowAnimations = R.style.DialogSlideInAndShrinkOut;
                            View findViewById = styledDialog.findViewById(R.id.btnSubmit);
                            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            ((RobertoTextView) findViewById).setOnClickListener(new il.o(styledDialog, this$06, uVar, feedbackSource));
                            styledDialog.setOnDismissListener(new il.p(uVar, feedbackSource, 2));
                            styledDialog.show();
                            String str6 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("trigger_reason", feedbackSource);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle2, "rating_low_feedback_popup_show");
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(str5, "exception", e13);
                        }
                    } else {
                        try {
                            kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_play_store_feedback, activity2, R.style.Theme_Dialog);
                            Window window2 = styledDialog2.getWindow();
                            kotlin.jvm.internal.i.d(window2);
                            window2.getAttributes().windowAnimations = R.style.DialogSlideInAndShrinkOut;
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.feedbackBanner1)).setImageResource(R.drawable.ic_feedback_banner_new_3);
                            View findViewById2 = styledDialog2.findViewById(R.id.yes);
                            kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            ((RobertoTextView) findViewById2).setOnClickListener(new il.o(this$06, uVar2, styledDialog2, feedbackSource));
                            View findViewById3 = styledDialog2.findViewById(R.id.f39931no);
                            kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            ((RobertoTextView) findViewById3).setOnClickListener(new j1(styledDialog2, 21, this$06));
                            styledDialog2.setOnDismissListener(new il.p(uVar2, feedbackSource, 1));
                            styledDialog2.show();
                            String str7 = gk.a.f16573a;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("trigger_reason", feedbackSource);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle3, "rating_playstore_popup_show");
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(str5, "exception", e14);
                        }
                    }
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    dialog2.dismiss();
                    return;
                }
                kotlin.jvm.internal.i.q("rating");
                throw null;
            case 8:
                V2GoalsActivity this$07 = (V2GoalsActivity) obj3;
                kotlin.jvm.internal.w minCourseStartTime = (kotlin.jvm.internal.w) obj2;
                kotlin.jvm.internal.v lastPos = (kotlin.jvm.internal.v) obj;
                int i15 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(minCourseStartTime, "$minCourseStartTime");
                kotlin.jvm.internal.i.g(lastPos, "$lastPos");
                ((RecyclerView) this$07.n0(R.id.rvGoalsListCalendar)).i(new V2GoalsActivity.c(minCourseStartTime, lastPos));
                return;
            case 9:
                V2GoalsActivity this$08 = (V2GoalsActivity) obj3;
                Goal goal = (Goal) obj2;
                kotlin.jvm.internal.x updationModel = (kotlin.jvm.internal.x) obj;
                int i16 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(goal, "$goal");
                kotlin.jvm.internal.i.g(updationModel, "$updationModel");
                Date date = this$08.M;
                kotlin.jvm.internal.i.f(date, "this.displayDate");
                GamificationModel gamificationModel = (GamificationModel) updationModel.f23469u;
                try {
                    ArrayList<GamificationModel> arrayList = new ArrayList<>();
                    HashMap<Date, GoalDateObj> goalDateObjMap = goal.getGoalDateObjMap();
                    GoalDateObj goalDateObj = goalDateObjMap.get(date);
                    kotlin.jvm.internal.i.d(goalDateObj);
                    if (!goalDateObj.isConsecutive3DaysHP()) {
                        Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
                        todayCalendar.setTime(date);
                        boolean z14 = true;
                        for (int i17 = 0; i17 < 2; i17++) {
                            todayCalendar.add(5, -1);
                            if (goalDateObjMap.containsKey(todayCalendar.getTime())) {
                                GoalDateObj goalDateObj2 = goalDateObjMap.get(todayCalendar.getTime());
                                kotlin.jvm.internal.i.d(goalDateObj2);
                                if (!goalDateObj2.isConsecutive3DaysHP()) {
                                }
                            }
                            z14 = false;
                        }
                        if (z14) {
                            Calendar todayCalendar2 = Utils.INSTANCE.getTodayCalendar();
                            todayCalendar2.setTime(date);
                            for (int i18 = 0; i18 < 3; i18++) {
                                Iterator<GoalDateObj> it = goal.getTrackList().iterator();
                                while (it.hasNext()) {
                                    GoalDateObj next = it.next();
                                    if (next.getmDate().getTime() == todayCalendar2.getTime().getTime()) {
                                        next.setConsecutive3DaysHP(true);
                                    }
                                }
                                todayCalendar2.add(5, -1);
                            }
                            GamificationModel gamificationModel2 = new GamificationModel(20, Constants.GAMIFICATION_GOAL_3DAYS_COMPLETITION_TASK, FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.getGoalName(goal.getGoalId()));
                            goal.getGoalgamificationList().add(gamificationModel2);
                            arrayList.add(gamificationModel2);
                        }
                    }
                    if (gamificationModel != null) {
                        goal.getGoalgamificationList().add(gamificationModel);
                        arrayList.add(gamificationModel);
                    }
                    FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(arrayList);
                    if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.TRACKING_GOALS_FOR_A_WEEK_BADGE)) {
                        Calendar todayCalendar3 = Utils.INSTANCE.getTodayCalendar();
                        todayCalendar3.setTime(date);
                        HashMap<Date, GoalDateObj> goalDateObjMap2 = goal.getGoalDateObjMap();
                        for (int i19 = 0; i19 < 7; i19++) {
                            if (!goalDateObjMap2.containsKey(todayCalendar3.getTime())) {
                                z13 = false;
                            }
                            todayCalendar3.add(5, -1);
                        }
                        if (z13) {
                            HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                            kotlin.jvm.internal.i.f(badges, "getInstance().user.userGamificationModel.badges");
                            badges.put(Constants.TRACKING_GOALS_FOR_A_WEEK_BADGE, Constants.BADGE_ATTAINED);
                        }
                    }
                    FirebasePersistence.getInstance().updateGoal(goal, Boolean.TRUE);
                    return;
                } catch (Exception e15) {
                    LogHelper.INSTANCE.e(e15);
                    return;
                }
            case 10:
                a();
                return;
            case 11:
                b();
                return;
            case 12:
                RobertoTextView robertoTextView = (RobertoTextView) obj3;
                kotlin.jvm.internal.x valueText = (kotlin.jvm.internal.x) obj2;
                ExperimentProfileActivity this$09 = (ExperimentProfileActivity) obj;
                int i20 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(valueText, "$valueText");
                kotlin.jvm.internal.i.g(this$09, "this$0");
                if (robertoTextView != null) {
                    try {
                        robertoTextView.setText((CharSequence) valueText.f23469u);
                        return;
                    } catch (Exception e16) {
                        LogHelper.INSTANCE.e(this$09.f11575w, e16);
                        return;
                    }
                }
                return;
            case 13:
                c();
                return;
            case 14:
                d();
                return;
            case 15:
                dw.d dVar2 = (dw.d) obj2;
                dw.z zVar = (dw.z) obj;
                h.a aVar3 = h.a.this;
                if (aVar3.f13565v.o()) {
                    dVar2.onFailure(aVar3, new IOException("Canceled"));
                    return;
                } else {
                    dVar2.onResponse(aVar3, zVar);
                    return;
                }
            default:
                ((dw.d) obj2).onFailure(h.a.this, (Throwable) obj);
                return;
        }
    }

    public /* synthetic */ c(String str, androidx.appcompat.app.c cVar, Object obj, int i6) {
        this.f26322u = i6;
        this.f26324w = str;
        this.f26323v = cVar;
        this.f26325x = obj;
    }

    public /* synthetic */ c(ArrayList arrayList, an.d0 d0Var, String str) {
        this.f26322u = 11;
        this.f26323v = arrayList;
        this.f26325x = d0Var;
        this.f26324w = str;
    }
}
