package com.theinnerhour.b2b.components.goals.activity;

import a3.t;
import am.b0;
import am.d0;
import android.animation.Animator;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import androidx.fragment.app.y;
import androidx.lifecycle.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import androidx.viewpager.widget.ViewPager;
import bm.m;
import bm.o;
import bm.r;
import cm.c0;
import cm.z;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AddGoalsActivity;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.onboarding.model.UserOnboardingModel;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesExperimentActivity;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserGamificationModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.CustomViewPager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.k1;
import fm.m1;
import gv.n;
import ik.l1;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.w0;
import ss.l;
import ss.p;
import ss.q;
import ta.v;
import w5.h0;
/* compiled from: V3GoalsActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/theinnerhour/b2b/components/goals/activity/V3GoalsActivity;", "Landroidx/appcompat/app/c;", "Lbm/o$b;", "Lbm/m$b;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class V3GoalsActivity extends androidx.appcompat.app.c implements o.b, m.b {
    public static final /* synthetic */ int X = 0;
    public long A;
    public boolean B;
    public final GoalHelper C;
    public ProgressDialog D;
    public boolean E;
    public int F;
    public final int G;
    public int H;
    public String I;
    public final int J;
    public int K;
    public String L;
    public final c0 M;
    public final z N;
    public Date O;
    public a P;
    public final ArrayList<RobertoTextView> Q;
    public int R;
    public final w0 S;
    public m1 T;
    public final androidx.activity.result.c<Intent> U;
    public final androidx.activity.result.c<Intent> V;

    /* renamed from: w  reason: collision with root package name */
    public r f11188w;

    /* renamed from: z  reason: collision with root package name */
    public Date f11191z;
    public final LinkedHashMap W = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11187v = LogHelper.INSTANCE.makeLogTag(V3GoalsActivity.class);

    /* renamed from: x  reason: collision with root package name */
    public final int f11189x = 23924;

    /* renamed from: y  reason: collision with root package name */
    public final int f11190y = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;

    /* compiled from: V3GoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f0 {

        /* renamed from: j  reason: collision with root package name */
        public final Fragment f11192j;

        /* renamed from: k  reason: collision with root package name */
        public final Fragment f11193k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, c0 regularGoalsFragment, z customGoalsFragment) {
            super(yVar);
            kotlin.jvm.internal.i.g(regularGoalsFragment, "regularGoalsFragment");
            kotlin.jvm.internal.i.g(customGoalsFragment, "customGoalsFragment");
            this.f11192j = regularGoalsFragment;
            this.f11193k = customGoalsFragment;
        }

        @Override // k2.a
        public final int g() {
            return 2;
        }

        @Override // androidx.fragment.app.f0
        public final Fragment q(int i6) {
            if (i6 == 0) {
                return this.f11192j;
            }
            return this.f11193k;
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Animation.AnimationListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ boolean f11194u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ V3GoalsActivity f11195v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f11196w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Animation f11197x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Animation f11198y;

        public b(boolean z10, V3GoalsActivity v3GoalsActivity, boolean z11, Animation animation, Animation animation2) {
            this.f11194u = z10;
            this.f11195v = v3GoalsActivity;
            this.f11196w = z11;
            this.f11197x = animation;
            this.f11198y = animation2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            Fragment fragment;
            Fragment fragment2;
            kotlin.jvm.internal.i.g(animation, "animation");
            boolean z10 = this.f11194u;
            V3GoalsActivity v3GoalsActivity = this.f11195v;
            if (z10) {
                ((CardView) v3GoalsActivity.n0(R.id.goalFeedbackLayout)).setVisibility(8);
                a aVar = v3GoalsActivity.P;
                if (aVar != null) {
                    fragment = aVar.q(0);
                } else {
                    fragment = null;
                }
                kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsRegularFragment");
                ((c0) fragment).J();
                a aVar2 = v3GoalsActivity.P;
                if (aVar2 != null) {
                    fragment2 = aVar2.q(1);
                } else {
                    fragment2 = null;
                }
                kotlin.jvm.internal.i.e(fragment2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsCustomFragment");
                ((z) fragment2).J();
            } else {
                boolean z11 = this.f11196w;
                Animation animation2 = this.f11197x;
                if (z11) {
                    UtilsKt.fireAnalytics("goal_negative_feedback_show", UtilsKt.getAnalyticsBundle());
                    ((ConstraintLayout) v3GoalsActivity.n0(R.id.goalFeedbackCardFront)).setVisibility(8);
                    ((ConstraintLayout) v3GoalsActivity.n0(R.id.goalFeedbackCardBack)).setVisibility(0);
                    ((CardView) v3GoalsActivity.n0(R.id.goalFeedbackLayout)).startAnimation(animation2);
                    ((RobertoTextView) v3GoalsActivity.n0(R.id.submitCTA)).setOnClickListener(new am.z(v3GoalsActivity, 4));
                } else {
                    UtilsKt.fireAnalytics("goal_play_store_feedback_show", UtilsKt.getAnalyticsBundle());
                    ((RobertoTextView) v3GoalsActivity.n0(R.id.goalFeedbackHeader)).setText(v3GoalsActivity.getString(R.string.goalsFeedbackPositive));
                    ((RobertoButton) v3GoalsActivity.n0(R.id.goalFeedbackNo)).setText(v3GoalsActivity.getString(R.string.rateUsNo));
                    ((RobertoButton) v3GoalsActivity.n0(R.id.goalFeedbackYes)).setText(v3GoalsActivity.getString(R.string.goalsFeedbackYesCta));
                    ((RobertoButton) v3GoalsActivity.n0(R.id.goalFeedbackYes)).setOnClickListener(new am.z(v3GoalsActivity, 5));
                    ((RobertoButton) v3GoalsActivity.n0(R.id.goalFeedbackNo)).setOnClickListener(new am.z(v3GoalsActivity, 6));
                    ((CardView) v3GoalsActivity.n0(R.id.goalFeedbackLayout)).startAnimation(animation2);
                }
            }
            this.f11198y.setAnimationListener(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements q<Date, Integer, Boolean, hs.k> {
        public c() {
            super(3);
        }

        @Override // ss.q
        public final hs.k invoke(Date date, Integer num, Boolean bool) {
            Date date2 = date;
            num.intValue();
            bool.booleanValue();
            kotlin.jvm.internal.i.g(date2, "date");
            V3GoalsActivity v3GoalsActivity = V3GoalsActivity.this;
            v3GoalsActivity.f11191z = date2;
            v3GoalsActivity.E0(date2);
            v3GoalsActivity.x0(date2);
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends RecyclerView.r {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                V3GoalsActivity v3GoalsActivity = V3GoalsActivity.this;
                if (v3GoalsActivity.f11188w != null) {
                    RecyclerView.m layoutManager = ((RecyclerView) v3GoalsActivity.n0(R.id.rvGoalsListCalendar)).getLayoutManager();
                    kotlin.jvm.internal.i.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                    if (v3GoalsActivity.R != findFirstVisibleItemPosition) {
                        r rVar = v3GoalsActivity.f11188w;
                        if (rVar != null) {
                            rVar.x(findFirstVisibleItemPosition);
                            v3GoalsActivity.R = findFirstVisibleItemPosition;
                            return;
                        }
                        kotlin.jvm.internal.i.q("goalsCalendarAdapter");
                        throw null;
                    }
                }
            }
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements l<SingleUseEvent<? extends RecommendedActivityModel>, hs.k> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends RecommendedActivityModel> singleUseEvent) {
            RecommendedActivityModel contentIfNotHandled;
            SingleUseEvent<? extends RecommendedActivityModel> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                int i6 = V3GoalsActivity.X;
                V3GoalsActivity.this.D0(contentIfNotHandled);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends k implements l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f11203u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(x<com.google.android.material.bottomsheet.f> xVar) {
            super(1);
            this.f11203u = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            bool.booleanValue();
            com.google.android.material.bottomsheet.f fVar = this.f11203u.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Dialog f11204a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f11205b;

        public h(Dialog dialog, LottieAnimationView lottieAnimationView) {
            this.f11204a = dialog;
            this.f11205b = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            this.f11204a.dismiss();
            this.f11205b.i();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            this.f11204a.dismiss();
            this.f11205b.i();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    public V3GoalsActivity() {
        Utils utils = Utils.INSTANCE;
        Date time = utils.getTodayCalendar().getTime();
        kotlin.jvm.internal.i.f(time, "Utils.todayCalendar.time");
        this.f11191z = time;
        this.A = utils.getTodayTimeInSeconds();
        this.C = new GoalHelper();
        this.G = 15648;
        this.H = -1;
        this.I = "";
        this.J = 31296;
        this.K = -1;
        this.L = "";
        this.M = new c0();
        this.N = new z();
        this.O = utils.getTodayCalendar().getTime();
        this.Q = new ArrayList<>();
        this.R = -1;
        final AtomicInteger atomicInteger = new AtomicInteger();
        this.S = new w0(Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: kotlinx.coroutines.u1

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ int f23705u = 1;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ String f23706v = "goalUpdateExecutor";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i6 = this.f23705u;
                String str = this.f23706v;
                if (i6 != 1) {
                    str = str + '-' + atomicInteger.incrementAndGet();
                }
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(true);
                return thread;
            }
        }));
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: am.a0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ V3GoalsActivity f614v;

            {
                this.f614v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                boolean z11;
                int i6 = r2;
                V3GoalsActivity this$0 = this.f614v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = V3GoalsActivity.X;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                                ((ConstraintLayout) this$0.n0(R.id.goalInfoLayout)).setVisibility(8);
                            }
                            Intent intent = aVar.f977v;
                            if (intent != null && intent.getBooleanExtra("isCompleted", false)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 && this$0.H != -1 && !kotlin.jvm.internal.i.b(this$0.I, "null")) {
                                this$0.A0(false);
                                this$0.b0(this$0.I, true);
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f11187v, e10);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i11 = V3GoalsActivity.X;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                            ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                            ((ConstraintLayout) this$0.n0(R.id.goalInfoLayout)).setVisibility(8);
                        }
                        if (aVar2.f976u == -1) {
                            Intent intent2 = aVar2.f977v;
                            if (intent2 != null && intent2.getBooleanExtra("markGoalComplete", false)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && this$0.H != -1 && !kotlin.jvm.internal.i.b(this$0.I, "null")) {
                                this$0.A0(false);
                                this$0.b0(this$0.I, true);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.U = registerForActivityResult;
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: am.a0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ V3GoalsActivity f614v;

            {
                this.f614v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                boolean z11;
                int i6 = r2;
                V3GoalsActivity this$0 = this.f614v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = V3GoalsActivity.X;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                                ((ConstraintLayout) this$0.n0(R.id.goalInfoLayout)).setVisibility(8);
                            }
                            Intent intent = aVar.f977v;
                            if (intent != null && intent.getBooleanExtra("isCompleted", false)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 && this$0.H != -1 && !kotlin.jvm.internal.i.b(this$0.I, "null")) {
                                this$0.A0(false);
                                this$0.b0(this$0.I, true);
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f11187v, e10);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i11 = V3GoalsActivity.X;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                            ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                            ((ConstraintLayout) this$0.n0(R.id.goalInfoLayout)).setVisibility(8);
                        }
                        if (aVar2.f976u == -1) {
                            Intent intent2 = aVar2.f977v;
                            if (intent2 != null && intent2.getBooleanExtra("markGoalComplete", false)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && this$0.H != -1 && !kotlin.jvm.internal.i.b(this$0.I, "null")) {
                                this$0.A0(false);
                                this$0.b0(this$0.I, true);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…on, true)\n        }\n    }");
        this.V = registerForActivityResult2;
    }

    public static final void o0(V3GoalsActivity v3GoalsActivity, Goal goal, Date date, GamificationModel gamificationModel) {
        try {
            ArrayList arrayList = new ArrayList();
            HashMap<Date, GoalDateObj> goalDateObjMap = goal.getGoalDateObjMap();
            GoalDateObj goalDateObj = goalDateObjMap.get(date);
            kotlin.jvm.internal.i.d(goalDateObj);
            boolean z10 = true;
            if (!goalDateObj.isConsecutive3DaysHP()) {
                Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
                todayCalendar.setTime(date);
                boolean z11 = true;
                for (int i6 = 0; i6 < 2; i6++) {
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
                    for (int i10 = 0; i10 < 3; i10++) {
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
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                UserGamificationModel userGamificationModel = FirebasePersistence.getInstance().getUser().getUserGamificationModel();
                userGamificationModel.setTotalGamificationPoints(userGamificationModel.getTotalGamificationPoints() + ((GamificationModel) arrayList.get(i11)).getPoints());
            }
            if (FirebasePersistence.getInstance().getUser().getUserGamificationModel().getTotalGamificationPoints() >= 100 && !FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.REACHED_100_POINTS_BADGE)) {
                HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                kotlin.jvm.internal.i.f(badges, "getInstance().user.userGamificationModel.badges");
                badges.put(Constants.REACHED_100_POINTS_BADGE, Constants.BADGE_ATTAINED);
            }
            if (FirebasePersistence.getInstance().getUser().getUserGamificationModel().getTotalGamificationPoints() >= 500 && !FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.REACHED_500_POINTS_BADGE)) {
                HashMap<String, String> badges2 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                kotlin.jvm.internal.i.f(badges2, "getInstance().user.userGamificationModel.badges");
                badges2.put(Constants.REACHED_500_POINTS_BADGE, Constants.BADGE_ATTAINED);
            }
            if (FirebasePersistence.getInstance().getUser().getUserGamificationModel().getTotalGamificationPoints() >= 1000 && !FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.REACHED_1000_POINTS_BADGE)) {
                HashMap<String, String> badges3 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                kotlin.jvm.internal.i.f(badges3, "getInstance().user.userGamificationModel.badges");
                badges3.put(Constants.REACHED_1000_POINTS_BADGE, Constants.BADGE_ATTAINED);
            }
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
                    HashMap<String, String> badges4 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                    kotlin.jvm.internal.i.f(badges4, "getInstance().user.userGamificationModel.badges");
                    badges4.put(Constants.TRACKING_GOALS_FOR_A_WEEK_BADGE, Constants.BADGE_ATTAINED);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    public final void A0(boolean z10) {
        try {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_goal_check, this, R.style.Theme_Dialog_Fullscreen);
            if (z10) {
                ((LottieAnimationView) styledDialog.findViewById(R.id.goalCheckAnimation)).setAnimation(R.raw.goal_check_custom);
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) styledDialog.findViewById(R.id.goalCheckAnimation);
            if (Build.VERSION.SDK_INT < 25) {
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRenderMode(t.SOFTWARE);
                }
            } else if (lottieAnimationView != null) {
                lottieAnimationView.setRenderMode(t.HARDWARE);
            }
            lottieAnimationView.c(new h(styledDialog, lottieAnimationView));
            styledDialog.setCancelable(false);
            styledDialog.show();
            lottieAnimationView.h();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    public final void B0(int i6) {
        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
        v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.internal.k.f23608a), null, 0, new i(i6, null), 3);
        String str = gk.a.f16573a;
        Bundle bundle = new Bundle();
        defpackage.e.s(bundle, "course", "type", "goals");
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "self_care_nps_display");
    }

    public final void C0(Intent intent, boolean z10) {
        int i6 = this.f11189x;
        if (z10) {
            startActivityForResult(intent, i6);
        } else {
            startActivityForResult(new Intent(this, RecommendedActivitiesExperimentActivity.class), i6);
        }
    }

    public final void D0(RecommendedActivityModel recommendedActivityModel) {
        Fragment fragment;
        this.V.a(new Intent(this, RecommendedActivitiesPlaybackActivity.class).putExtra("model", recommendedActivityModel).putExtra("source", "goals"));
        a aVar = this.P;
        if (aVar != null) {
            fragment = aVar.q(0);
        } else {
            fragment = null;
        }
        kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsRegularFragment");
        ((c0) fragment).P(false);
    }

    public final void E0(Date date) {
        Fragment fragment;
        try {
            this.O = date;
            a aVar = this.P;
            Fragment fragment2 = null;
            if (aVar != null) {
                fragment = aVar.q(0);
            } else {
                fragment = null;
            }
            kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsRegularFragment");
            Date date2 = this.O;
            kotlin.jvm.internal.i.f(date2, "this.displayDate");
            ((c0) fragment).Q(date2);
            a aVar2 = this.P;
            if (aVar2 != null) {
                fragment2 = aVar2.q(1);
            }
            kotlin.jvm.internal.i.e(fragment2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsCustomFragment");
            Date date3 = this.O;
            kotlin.jvm.internal.i.f(date3, "this.displayDate");
            ((z) fragment2).M(date3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, "Exception", e10);
        }
    }

    public final void F0() {
        Fragment fragment;
        try {
            a aVar = this.P;
            Fragment fragment2 = null;
            if (aVar != null) {
                fragment = aVar.q(0);
            } else {
                fragment = null;
            }
            kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsRegularFragment");
            Date date = this.O;
            kotlin.jvm.internal.i.f(date, "this.displayDate");
            ((c0) fragment).S(date);
            a aVar2 = this.P;
            if (aVar2 != null) {
                fragment2 = aVar2.q(1);
            }
            kotlin.jvm.internal.i.e(fragment2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsCustomFragment");
            Date date2 = this.O;
            kotlin.jvm.internal.i.f(date2, "this.displayDate");
            ((z) fragment2).O(date2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    @Override // bm.m.b
    public final void K(String goalId, boolean z10, long j10) {
        kotlin.jvm.internal.i.g(goalId, "goalId");
        try {
            if (n.B0(goalId)) {
                return;
            }
            v.H(kotlin.jvm.internal.h.c(this.S), null, 0, new am.c0(goalId, this, j10, z10, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    @Override // bm.m.b
    public final void V() {
        Fragment fragment;
        try {
            a aVar = this.P;
            if (aVar != null) {
                fragment = aVar.q(1);
            } else {
                fragment = null;
            }
            kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsCustomFragment");
            Date date = this.O;
            kotlin.jvm.internal.i.f(date, "this.displayDate");
            ((z) fragment).O(date);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    @Override // bm.o.b
    public final void b() {
        Fragment fragment;
        try {
            a aVar = this.P;
            if (aVar != null) {
                fragment = aVar.q(0);
            } else {
                fragment = null;
            }
            kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsRegularFragment");
            Date date = this.O;
            kotlin.jvm.internal.i.f(date, "this.displayDate");
            ((c0) fragment).S(date);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    @Override // bm.o.b
    public final void b0(String goalId, boolean z10) {
        kotlin.jvm.internal.i.g(goalId, "goalId");
        try {
            if (n.B0(goalId)) {
                return;
            }
            v.H(kotlin.jvm.internal.h.c(this.S), null, 0, new d0(goalId, this, z10, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.W;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        boolean z10;
        Fragment fragment;
        int i11 = this.f11189x;
        String str = this.f11187v;
        super.onActivityResult(i6, i10, intent);
        try {
            LogHelper.INSTANCE.i(str, "on activity result " + i6 + ' ' + i11);
            Fragment fragment2 = null;
            if (i6 == i11) {
                F0();
            } else if (i6 == this.G) {
                if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                    ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                    ((ConstraintLayout) n0(R.id.goalInfoLayout)).setVisibility(8);
                }
                if (i10 == -1 && this.H != -1 && !kotlin.jvm.internal.i.b(this.I, "null")) {
                    A0(false);
                    b0(this.I, true);
                }
            } else if (i6 == this.J) {
                if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                    ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                    ((ConstraintLayout) n0(R.id.goalInfoLayout)).setVisibility(8);
                }
                if (i10 == -1 && this.K != -1 && !kotlin.jvm.internal.i.b(this.L, "null")) {
                    A0(true);
                    long j10 = -1;
                    if (intent != null) {
                        j10 = intent.getLongExtra("task_completion_seconds", -1L);
                    }
                    K(this.L, true, j10);
                }
            } else if (i6 == this.f11190y && i10 == -1) {
                if (intent != null && intent.getBooleanExtra("purchase_successful", false)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    a aVar = this.P;
                    if (aVar != null) {
                        fragment = aVar.q(1);
                    } else {
                        fragment = null;
                    }
                    kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsCustomFragment");
                    z zVar = (z) fragment;
                    try {
                        m mVar = zVar.f5393x;
                        if (mVar != null) {
                            mVar.D = true;
                            mVar.j(0);
                        }
                        ((RecyclerView) zVar._$_findCachedViewById(R.id.goalRecyclerView)).setAdapter(zVar.f5393x);
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(zVar.f5390u, e10);
                    }
                }
            }
            if (this.E) {
                a aVar2 = this.P;
                if (aVar2 != null) {
                    fragment2 = aVar2.q(0);
                }
                kotlin.jvm.internal.i.e(fragment2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsRegularFragment");
                c0 c0Var = (c0) fragment2;
                int i12 = c0.J;
                try {
                    o oVar = c0Var.f5319x;
                    if (oVar != null) {
                        oVar.i();
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(c0Var.f5316u, e11);
                }
            }
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str, e12);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        try {
            if (BottomSheetBehavior.from((ConstraintLayout) n0(R.id.clNPSBottomSheet)).getState() == 3) {
                BottomSheetBehavior.from((ConstraintLayout) n0(R.id.clNPSBottomSheet)).setState(4);
                return;
            }
            Intent intent = new Intent();
            setResult(-1, intent);
            if (!this.E) {
                intent.putExtra("tooltipshow", this.B);
            }
            finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0141 A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x000d, B:5:0x003b, B:7:0x00aa, B:11:0x00bd, B:15:0x00f8, B:17:0x0135, B:23:0x0141, B:24:0x0156, B:26:0x0160, B:28:0x0168, B:29:0x0172, B:31:0x017c, B:37:0x0188, B:39:0x018f, B:41:0x01a0, B:42:0x01a9, B:45:0x01e7, B:47:0x01ed, B:49:0x01fe, B:50:0x0204, B:52:0x020c, B:54:0x0217, B:56:0x0225, B:58:0x022f, B:14:0x00f5, B:10:0x00ba, B:59:0x024f, B:60:0x0254), top: B:64:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0160 A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x000d, B:5:0x003b, B:7:0x00aa, B:11:0x00bd, B:15:0x00f8, B:17:0x0135, B:23:0x0141, B:24:0x0156, B:26:0x0160, B:28:0x0168, B:29:0x0172, B:31:0x017c, B:37:0x0188, B:39:0x018f, B:41:0x01a0, B:42:0x01a9, B:45:0x01e7, B:47:0x01ed, B:49:0x01fe, B:50:0x0204, B:52:0x020c, B:54:0x0217, B:56:0x0225, B:58:0x022f, B:14:0x00f5, B:10:0x00ba, B:59:0x024f, B:60:0x0254), top: B:64:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a0 A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x000d, B:5:0x003b, B:7:0x00aa, B:11:0x00bd, B:15:0x00f8, B:17:0x0135, B:23:0x0141, B:24:0x0156, B:26:0x0160, B:28:0x0168, B:29:0x0172, B:31:0x017c, B:37:0x0188, B:39:0x018f, B:41:0x01a0, B:42:0x01a9, B:45:0x01e7, B:47:0x01ed, B:49:0x01fe, B:50:0x0204, B:52:0x020c, B:54:0x0217, B:56:0x0225, B:58:0x022f, B:14:0x00f5, B:10:0x00ba, B:59:0x024f, B:60:0x0254), top: B:64:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e7 A[Catch: Exception -> 0x0255, TRY_ENTER, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x000d, B:5:0x003b, B:7:0x00aa, B:11:0x00bd, B:15:0x00f8, B:17:0x0135, B:23:0x0141, B:24:0x0156, B:26:0x0160, B:28:0x0168, B:29:0x0172, B:31:0x017c, B:37:0x0188, B:39:0x018f, B:41:0x01a0, B:42:0x01a9, B:45:0x01e7, B:47:0x01ed, B:49:0x01fe, B:50:0x0204, B:52:0x020c, B:54:0x0217, B:56:0x0225, B:58:0x022f, B:14:0x00f5, B:10:0x00ba, B:59:0x024f, B:60:0x0254), top: B:64:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fe A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x000d, B:5:0x003b, B:7:0x00aa, B:11:0x00bd, B:15:0x00f8, B:17:0x0135, B:23:0x0141, B:24:0x0156, B:26:0x0160, B:28:0x0168, B:29:0x0172, B:31:0x017c, B:37:0x0188, B:39:0x018f, B:41:0x01a0, B:42:0x01a9, B:45:0x01e7, B:47:0x01ed, B:49:0x01fe, B:50:0x0204, B:52:0x020c, B:54:0x0217, B:56:0x0225, B:58:0x022f, B:14:0x00f5, B:10:0x00ba, B:59:0x024f, B:60:0x0254), top: B:64:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020c A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x000d, B:5:0x003b, B:7:0x00aa, B:11:0x00bd, B:15:0x00f8, B:17:0x0135, B:23:0x0141, B:24:0x0156, B:26:0x0160, B:28:0x0168, B:29:0x0172, B:31:0x017c, B:37:0x0188, B:39:0x018f, B:41:0x01a0, B:42:0x01a9, B:45:0x01e7, B:47:0x01ed, B:49:0x01fe, B:50:0x0204, B:52:0x020c, B:54:0x0217, B:56:0x0225, B:58:0x022f, B:14:0x00f5, B:10:0x00ba, B:59:0x024f, B:60:0x0254), top: B:64:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        Bundle extras;
        Intent intent;
        String str;
        Intent intent2;
        boolean z11;
        String substring;
        super.onCreate(bundle);
        setContentView(R.layout.activity_v3_goals);
        try {
            getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
            boolean booleanExtra = getIntent().getBooleanExtra("tutorial", false);
            this.B = booleanExtra;
            this.E = booleanExtra;
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.D = progressDialog;
            progressDialog.setMessage("Loading...");
            ProgressDialog progressDialog2 = this.D;
            String str2 = null;
            if (progressDialog2 != null) {
                progressDialog2.setCancelable(false);
                ((TabLayout) n0(R.id.tabsLayout)).setVisibility(0);
                y supportFragmentManager = getSupportFragmentManager();
                kotlin.jvm.internal.i.f(supportFragmentManager, "supportFragmentManager");
                this.P = new a(supportFragmentManager, this.M, this.N);
                ((CustomViewPager) n0(R.id.viewpager)).setAdapter(this.P);
                ((TabLayout) n0(R.id.tabsLayout)).setupWithViewPager((CustomViewPager) n0(R.id.viewpager));
                View inflate = getLayoutInflater().inflate(R.layout.row_textview, (ViewGroup) null);
                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                RobertoTextView robertoTextView = (RobertoTextView) inflate;
                robertoTextView.setText(getString(R.string.customGoalRegularHeader));
                robertoTextView.setFont("Lato-Bold.ttf");
                robertoTextView.setTextSize(2, 14.0f);
                robertoTextView.setTextColor(g0.a.b(this, R.color.orange));
                ArrayList<RobertoTextView> arrayList = this.Q;
                arrayList.add(robertoTextView);
                TabLayout.g h10 = ((TabLayout) n0(R.id.tabsLayout)).h(0);
                if (h10 != null) {
                    h10.b(robertoTextView);
                }
                View inflate2 = getLayoutInflater().inflate(R.layout.row_textview, (ViewGroup) null);
                kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                RobertoTextView robertoTextView2 = (RobertoTextView) inflate2;
                robertoTextView2.setText(getString(R.string.customGoalCustomHeader));
                robertoTextView2.setFont("Lato-Bold.ttf");
                robertoTextView2.setTextSize(2, 14.0f);
                robertoTextView2.setTextColor(g0.a.b(this, R.color.learning_hub_grey_3));
                arrayList.add(robertoTextView2);
                TabLayout.g h11 = ((TabLayout) n0(R.id.tabsLayout)).h(1);
                if (h11 != null) {
                    h11.b(robertoTextView2);
                }
                ((CustomViewPager) n0(R.id.viewpager)).b(new e());
                Date time = Calendar.getInstance().getTime();
                kotlin.jvm.internal.i.f(time, "getInstance().time");
                x0(time);
                ((ImageView) n0(R.id.header_arrow_back)).setOnClickListener(new am.z(this, 2));
                String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
                if (currentCourse != null && currentCourse.length() != 0) {
                    z10 = false;
                    if (!z10) {
                        t0();
                        ((RobertoTextView) n0(R.id.ivMenu)).setOnClickListener(new am.z(this, 3));
                    }
                    extras = getIntent().getExtras();
                    if (extras != null) {
                        if (extras.getBoolean("add_goal", false)) {
                            C0(new Intent(this, AddGoalsActivity.class), false);
                        }
                        String string = extras.getString(Constants.GOAL_ID, "");
                        if (string != null && !n.B0(string)) {
                            z11 = false;
                            if (!z11 && string.length() >= 7) {
                                substring = string.substring(0, 7);
                                kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                                    ((CustomViewPager) n0(R.id.viewpager)).setCurrentItem(1);
                                }
                            }
                        }
                        z11 = true;
                        if (!z11) {
                            substring = string.substring(0, 7);
                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                            }
                        }
                    }
                    l0 a102 = new androidx.lifecycle.o0(this, new ok.c(new dm.f())).a(m1.class);
                    ((m1) a102).f15453z.e(this, new tl.m(14, new f()));
                    this.T = (m1) a102;
                    String str32 = gk.a.f16573a;
                    Bundle bundle22 = new Bundle();
                    intent = getIntent();
                    if (intent == null) {
                        str = intent.getStringExtra("source");
                    } else {
                        str = null;
                    }
                    bundle22.putString("source", str);
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle22, "v3_goals_page_open");
                    p0();
                    intent2 = getIntent();
                    if (intent2 != null) {
                        str2 = intent2.getStringExtra("entry_point_click");
                    }
                    if (!kotlin.jvm.internal.i.b(str2, Constants.SCREEN_DASHBOARD)) {
                        yn.a aVar = new yn.a();
                        if (!yn.a.b()) {
                            hs.f<Boolean, Boolean> a11 = aVar.a(false);
                            if (a11.f19464u.booleanValue() || a11.f19465v.booleanValue()) {
                                x xVar = new x();
                                ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("goals_soft_trigger", a11, "goals", aVar, new g(xVar));
                                xVar.f23469u = notificationPermissionBottomSheet;
                                notificationPermissionBottomSheet.show(getSupportFragmentManager(), "permission");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                z10 = true;
                if (!z10) {
                }
                extras = getIntent().getExtras();
                if (extras != null) {
                }
                l0 a1022 = new androidx.lifecycle.o0(this, new ok.c(new dm.f())).a(m1.class);
                ((m1) a1022).f15453z.e(this, new tl.m(14, new f()));
                this.T = (m1) a1022;
                String str322 = gk.a.f16573a;
                Bundle bundle222 = new Bundle();
                intent = getIntent();
                if (intent == null) {
                }
                bundle222.putString("source", str);
                hs.k kVar22 = hs.k.f19476a;
                gk.a.b(bundle222, "v3_goals_page_open");
                p0();
                intent2 = getIntent();
                if (intent2 != null) {
                }
                if (!kotlin.jvm.internal.i.b(str2, Constants.SCREEN_DASHBOARD)) {
                }
            } else {
                kotlin.jvm.internal.i.q("progressDialog");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        try {
            this.S.close();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        String str = this.f11187v;
        try {
            long j10 = this.A;
            Utils utils = Utils.INSTANCE;
            if (j10 != utils.getTodayTimeInSeconds()) {
                LogHelper.INSTANCE.i(str, "day change updates");
                this.A = utils.getTodayTimeInSeconds();
                q0();
            }
            if (ApplicationPersistence.getInstance().getLongValue("goal_feedback_count", 0L) >= 10) {
                z0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, e10);
        }
        super.onResume();
    }

    @Override // bm.m.b
    public final void p(Goal goal, int i6) {
        try {
            this.K = i6;
            this.L = String.valueOf(goal.getGoalId());
            Intent intent = new Intent(this, TrackCustomGoalActivity.class);
            intent.putExtra("goalName", goal.getGoalName());
            startActivityForResult(intent, this.J);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    public final void p0() {
        ConstraintLayout constraintLayout = (ConstraintLayout) n0(R.id.clNPSBottomSheet);
        if (constraintLayout != null) {
            constraintLayout.setOnTouchListener(new h0(10));
        }
        NpsPersistence npsPersistence = NpsPersistence.INSTANCE;
        Integer npsGoalTrackCount = npsPersistence.getNpsGoalTrackCount();
        if (npsGoalTrackCount != null) {
            if (npsGoalTrackCount.intValue() >= 45 && !npsPersistence.isNpsForGoalTrackComplete(45)) {
                npsPersistence.updateNpsGoalStatusForTrack(45, true);
                if (npsPersistence.isNpsSlotAvailable()) {
                    B0(45);
                    NpsPersistence.updateNpsSlot$default(npsPersistence, false, 1, null);
                }
            } else if (npsGoalTrackCount.intValue() >= 30 && !npsPersistence.isNpsForGoalTrackComplete(30) && npsPersistence.getHighestNpsGoalTrackCount() < 30) {
                npsPersistence.updateNpsGoalStatusForTrack(30, true);
                if (npsPersistence.isNpsSlotAvailable()) {
                    B0(30);
                    NpsPersistence.updateNpsSlot$default(npsPersistence, false, 1, null);
                }
            } else if (npsGoalTrackCount.intValue() >= 15 && !npsPersistence.isNpsForGoalTrackComplete(15) && npsPersistence.getHighestNpsGoalTrackCount() < 15) {
                npsPersistence.updateNpsGoalStatusForTrack(15, true);
                if (npsPersistence.isNpsSlotAvailable()) {
                    B0(15);
                    NpsPersistence.updateNpsSlot$default(npsPersistence, false, 1, null);
                }
            }
        }
    }

    public final void q0() {
        try {
            r rVar = this.f11188w;
            if (rVar != null) {
                rVar.v();
                rVar.i();
                u0();
                Date time = Utils.INSTANCE.getTodayCalendar().getTime();
                kotlin.jvm.internal.i.f(time, "Utils.todayCalendar.time");
                E0(time);
                return;
            }
            kotlin.jvm.internal.i.q("goalsCalendarAdapter");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    public final void r0(boolean z10, boolean z11) {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_fade_out_left);
            loadAnimation.setAnimationListener(new b(z10, this, z11, AnimationUtils.loadAnimation(this, R.anim.slide_fade_in_right), loadAnimation));
            ((CardView) n0(R.id.goalFeedbackLayout)).startAnimation(loadAnimation);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:664)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:522)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:79)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:2:0x0000, B:4:0x0019, B:60:0x013d, B:5:0x0047, B:8:0x0059, B:10:0x006e, B:12:0x0074, B:13:0x0078, B:15:0x007d, B:59:0x0120, B:18:0x0087, B:21:0x0091, B:30:0x00af, B:32:0x00b5, B:34:0x00bb, B:36:0x00c9, B:38:0x00cd, B:39:0x00d1, B:41:0x00d7, B:45:0x00ee, B:47:0x00f2, B:48:0x00f6, B:50:0x00fa, B:52:0x0100, B:24:0x009b, B:27:0x00a5, B:53:0x010e, B:56:0x0117), top: B:65:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:2:0x0000, B:4:0x0019, B:60:0x013d, B:5:0x0047, B:8:0x0059, B:10:0x006e, B:12:0x0074, B:13:0x0078, B:15:0x007d, B:59:0x0120, B:18:0x0087, B:21:0x0091, B:30:0x00af, B:32:0x00b5, B:34:0x00bb, B:36:0x00c9, B:38:0x00cd, B:39:0x00d1, B:41:0x00d7, B:45:0x00ee, B:47:0x00f2, B:48:0x00f6, B:50:0x00fa, B:52:0x0100, B:24:0x009b, B:27:0x00a5, B:53:0x010e, B:56:0x0117), top: B:65:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:2:0x0000, B:4:0x0019, B:60:0x013d, B:5:0x0047, B:8:0x0059, B:10:0x006e, B:12:0x0074, B:13:0x0078, B:15:0x007d, B:59:0x0120, B:18:0x0087, B:21:0x0091, B:30:0x00af, B:32:0x00b5, B:34:0x00bb, B:36:0x00c9, B:38:0x00cd, B:39:0x00d1, B:41:0x00d7, B:45:0x00ee, B:47:0x00f2, B:48:0x00f6, B:50:0x00fa, B:52:0x0100, B:24:0x009b, B:27:0x00a5, B:53:0x010e, B:56:0x0117), top: B:65:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed A[SYNTHETIC] */
    @Override // bm.o.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(com.theinnerhour.b2b.model.Goal r6, int r7) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity.s(com.theinnerhour.b2b.model.Goal, int):void");
    }

    public final Date s0() {
        Date displayDate = this.O;
        kotlin.jvm.internal.i.f(displayDate, "displayDate");
        return displayDate;
    }

    public final void t0() {
        String str;
        long time;
        String str2;
        boolean z10;
        try {
            String[] strArr = {Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC};
            User user = FirebasePersistence.getInstance().getUser();
            Long l2 = null;
            if (user != null) {
                str = user.getCurrentCourseName();
            } else {
                str = null;
            }
            if (is.k.Q1(str, strArr)) {
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                UserOnboardingModel userOnboardingModel = firebasePersistence.getUserOnboardingModel();
                User user2 = firebasePersistence.getUser();
                if (user2 != null) {
                    str2 = user2.getCurrentCourseName();
                } else {
                    str2 = null;
                }
                Long valueOf = Long.valueOf(userOnboardingModel.getCourseStartDate(str2));
                if (valueOf.longValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    l2 = valueOf;
                }
                if (l2 != null) {
                    time = l2.longValue();
                } else {
                    time = Utils.INSTANCE.getTodayTimeInSeconds();
                }
            } else {
                FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                time = firebasePersistence2.getCourseById(firebasePersistence2.getUser().getCurrentCourse()).getStartDate().getTime();
            }
            ArrayList<Course> courses = FirebasePersistence.getInstance().getCourses();
            if (courses != null) {
                Iterator<Course> it = courses.iterator();
                while (it.hasNext()) {
                    Course next = it.next();
                    if (time > next.getStartDate().getTime()) {
                        time = next.getStartDate().getTime();
                    }
                }
            }
            ((RecyclerView) n0(R.id.rvGoalsListCalendar)).setLayoutManager(new LinearLayoutManager(this, 0, false));
            r rVar = new r(this, time * 1000, null, new c());
            this.f11188w = rVar;
            ((RecyclerView) n0(R.id.rvGoalsListCalendar)).setAdapter(rVar);
            u0();
            new w().a((RecyclerView) n0(R.id.rvGoalsListCalendar));
            ((RecyclerView) n0(R.id.rvGoalsListCalendar)).i(new d());
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, "Exception", e10);
        }
    }

    public final void u0() {
        try {
            if (this.f11188w != null) {
                RecyclerView recyclerView = (RecyclerView) n0(R.id.rvGoalsListCalendar);
                r rVar = this.f11188w;
                if (rVar != null) {
                    recyclerView.h0(rVar.H - 1);
                    r rVar2 = this.f11188w;
                    if (rVar2 != null) {
                        if (rVar2 != null) {
                            rVar2.w(rVar2.H - 1, false);
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("goalsCalendarAdapter");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.i.q("goalsCalendarAdapter");
                    throw null;
                }
                kotlin.jvm.internal.i.q("goalsCalendarAdapter");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    @Override // bm.o.b
    public final void v(Goal goal, long j10, int i6) {
        WindowManager.LayoutParams layoutParams;
        try {
            long j11 = 1000;
            CharSequence format = DateFormat.format("EEEE", goal.getScheduledDate().getTime() * j11);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(goal.getScheduledDate().getTime() * j11);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            calendar2.set(11, calendar.get(11));
            calendar2.set(12, calendar.get(12));
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_reschedule_goal, this, R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            if (window != null) {
                layoutParams = window.getAttributes();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
            }
            ((AppCompatImageView) styledDialog.findViewById(R.id.resetBanner)).setImageResource(R.drawable.ic_weekly_goal_banner);
            ((RobertoTextView) styledDialog.findViewById(R.id.resetDialogTitle)).setText(getString(R.string.weeklyGoalHeader, format));
            ((RobertoTextView) styledDialog.findViewById(R.id.resetQuestion)).setText(getString(R.string.weeklyGoalBody, format));
            ((RobertoTextView) styledDialog.findViewById(R.id.f39931no)).setText(getString(R.string.cancel));
            ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setText(getString(R.string.weeklyGoalReschedule));
            ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setOnClickListener(new b0(goal, calendar2, this, i6, styledDialog, 0));
            ((RobertoTextView) styledDialog.findViewById(R.id.f39931no)).setOnClickListener(new dk.n(styledDialog, 22));
            styledDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    public final void v0(String str) {
        try {
            ((RobertoTextView) n0(R.id.ivMenu)).setText(str);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    @Override // bm.m.b
    public final void w(Goal goal, long j10, int i6) {
        WindowManager.LayoutParams layoutParams;
        try {
            long j11 = 1000;
            CharSequence format = DateFormat.format("EEEE", goal.getScheduledDate().getTime() * j11);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(goal.getScheduledDate().getTime() * j11);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            calendar2.set(11, calendar.get(11));
            calendar2.set(12, calendar.get(12));
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_reschedule_goal, this, R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            if (window != null) {
                layoutParams = window.getAttributes();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
            }
            ((AppCompatImageView) styledDialog.findViewById(R.id.resetBanner)).setImageResource(R.drawable.ic_weekly_goal_banner);
            ((RobertoTextView) styledDialog.findViewById(R.id.resetDialogTitle)).setText(getString(R.string.weeklyGoalHeader, format));
            ((RobertoTextView) styledDialog.findViewById(R.id.resetQuestion)).setText(getString(R.string.weeklyGoalBody, format));
            ((RobertoTextView) styledDialog.findViewById(R.id.f39931no)).setText(getString(R.string.cancel));
            ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setText(getString(R.string.weeklyGoalReschedule));
            ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setOnClickListener(new b0(goal, calendar2, this, i6, styledDialog, 1));
            ((RobertoTextView) styledDialog.findViewById(R.id.f39931no)).setOnClickListener(new dk.n(styledDialog, 23));
            styledDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    public final void w0(boolean z10) {
        int i6;
        try {
            RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.ivMenu);
            if (z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            robertoTextView.setVisibility(i6);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    public final void x0(Date date) {
        try {
            ((RobertoTextView) n0(R.id.tvCurrentMonth)).setText(LocalDateTime.ofEpochSecond(date.getTime() / 1000, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date.getTime()))).format(DateTimeFormatter.ofPattern("MMMM yyyy").withLocale(Locale.ENGLISH)));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    public final void y0(boolean z10) {
        int i6;
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) n0(R.id.goalInfoLayout);
            if (z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            constraintLayout.setVisibility(i6);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11187v, e10);
        }
    }

    public final void z0() {
        Fragment fragment;
        try {
            if (!ApplicationPersistence.getInstance().getBooleanValue("goal_feedback_shown", false)) {
                UtilsKt.fireAnalytics("goal_feedback_show", UtilsKt.getAnalyticsBundle());
                ((CardView) n0(R.id.goalFeedbackLayout)).setVisibility(0);
                a aVar = this.P;
                Fragment fragment2 = null;
                if (aVar != null) {
                    fragment = aVar.q(0);
                } else {
                    fragment = null;
                }
                kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsRegularFragment");
                c0 c0Var = (c0) fragment;
                try {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) c0Var._$_findCachedViewById(R.id.ivEmptyState);
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(8);
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) c0Var._$_findCachedViewById(R.id.tvEmptyState);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(c0Var.f5316u, e10);
                }
                a aVar2 = this.P;
                if (aVar2 != null) {
                    fragment2 = aVar2.q(1);
                }
                kotlin.jvm.internal.i.e(fragment2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsCustomFragment");
                z zVar = (z) fragment2;
                try {
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) zVar._$_findCachedViewById(R.id.ivEmptyState);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setVisibility(8);
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) zVar._$_findCachedViewById(R.id.tvEmptyState);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setVisibility(8);
                    }
                    RobertoTextView robertoTextView3 = (RobertoTextView) zVar._$_findCachedViewById(R.id.tvEmptyStateTitle);
                    if (robertoTextView3 != null) {
                        robertoTextView3.setVisibility(8);
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(zVar.f5390u, e11);
                }
                ((RobertoButton) n0(R.id.goalFeedbackYes)).setOnClickListener(new am.z(this, 0));
                ((RobertoButton) n0(R.id.goalFeedbackNo)).setOnClickListener(new am.z(this, 1));
                NpsPersistence.INSTANCE.updateNpsSlot(true);
            }
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(this.f11187v, e12);
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity$showNPSBottomSheetForTrack$1", f = "V3GoalsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends ns.i implements p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f11207v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i6, ls.d<? super i> dVar) {
            super(2, dVar);
            this.f11207v = i6;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new i(this.f11207v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            V3GoalsActivity v3GoalsActivity = V3GoalsActivity.this;
            View n02 = v3GoalsActivity.n0(R.id.viewDashboardBlanketForeground);
            if (n02 != null) {
                n02.setVisibility(0);
            }
            BottomSheetBehavior.from((ConstraintLayout) v3GoalsActivity.n0(R.id.clNPSBottomSheet)).addBottomSheetCallback(new a(v3GoalsActivity));
            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
            vVar.f23467u = -1;
            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) v3GoalsActivity.n0(R.id.sbNPSSelector);
            if (appCompatSeekBar != null) {
                appCompatSeekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(v3GoalsActivity, R.color.transparent)));
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) v3GoalsActivity.n0(R.id.ivNPSRatingImage);
            if (appCompatImageView != null) {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(g0.a.b(v3GoalsActivity, R.color.login_grey_background)));
            }
            AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) v3GoalsActivity.n0(R.id.sbNPSSelector);
            if (appCompatSeekBar2 != null) {
                appCompatSeekBar2.setOnSeekBarChangeListener(new b(v3GoalsActivity, vVar));
            }
            RobertoButton robertoButton = (RobertoButton) v3GoalsActivity.n0(R.id.rbNPSSubmit1);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new l1(vVar, v3GoalsActivity, this.f11207v, 8));
            }
            BottomSheetBehavior.from((ConstraintLayout) v3GoalsActivity.n0(R.id.clNPSBottomSheet)).setState(3);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) v3GoalsActivity.n0(R.id.ivNPSBottomSheetClose);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setOnClickListener(new am.z(v3GoalsActivity, 10));
            }
            RobertoTextView robertoTextView = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSSeekLevel0);
            if (robertoTextView != null) {
                robertoTextView.setOnClickListener(new am.z(v3GoalsActivity, 11));
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSSeekLevel1);
            if (robertoTextView2 != null) {
                robertoTextView2.setOnClickListener(new am.z(v3GoalsActivity, 12));
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSSeekLevel2);
            if (robertoTextView3 != null) {
                robertoTextView3.setOnClickListener(new am.z(v3GoalsActivity, 13));
            }
            RobertoTextView robertoTextView4 = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSSeekLevel3);
            if (robertoTextView4 != null) {
                robertoTextView4.setOnClickListener(new am.z(v3GoalsActivity, 14));
            }
            RobertoTextView robertoTextView5 = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSSeekLevel4);
            if (robertoTextView5 != null) {
                robertoTextView5.setOnClickListener(new am.z(v3GoalsActivity, 15));
            }
            RobertoTextView robertoTextView6 = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSSeekLevel5);
            if (robertoTextView6 != null) {
                robertoTextView6.setOnClickListener(new am.z(v3GoalsActivity, 16));
            }
            RobertoTextView robertoTextView7 = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSSeekLevel6);
            if (robertoTextView7 != null) {
                robertoTextView7.setOnClickListener(new am.z(v3GoalsActivity, 17));
            }
            RobertoTextView robertoTextView8 = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSSeekLevel7);
            if (robertoTextView8 != null) {
                robertoTextView8.setOnClickListener(new am.z(v3GoalsActivity, 18));
            }
            RobertoTextView robertoTextView9 = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSSeekLevel8);
            if (robertoTextView9 != null) {
                robertoTextView9.setOnClickListener(new am.z(v3GoalsActivity, 7));
            }
            RobertoTextView robertoTextView10 = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSSeekLevel9);
            if (robertoTextView10 != null) {
                robertoTextView10.setOnClickListener(new am.z(v3GoalsActivity, 8));
            }
            RobertoTextView robertoTextView11 = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSSeekLevel10);
            if (robertoTextView11 != null) {
                robertoTextView11.setOnClickListener(new am.z(v3GoalsActivity, 9));
            }
            return hs.k.f19476a;
        }

        /* compiled from: V3GoalsActivity.kt */
        /* loaded from: classes2.dex */
        public static final class a extends BottomSheetBehavior.f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ V3GoalsActivity f11208a;

            public a(V3GoalsActivity v3GoalsActivity) {
                this.f11208a = v3GoalsActivity;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public final void c(int i6, View view) {
                View n02;
                V3GoalsActivity v3GoalsActivity = this.f11208a;
                if (i6 != 1 && i6 != 3) {
                    if (i6 == 4 && (n02 = v3GoalsActivity.n0(R.id.viewDashboardBlanketForeground)) != null) {
                        n02.setVisibility(8);
                        return;
                    }
                    return;
                }
                View n03 = v3GoalsActivity.n0(R.id.viewDashboardBlanketForeground);
                if (n03 != null) {
                    n03.setVisibility(0);
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public final void b(View view) {
            }
        }

        /* compiled from: V3GoalsActivity.kt */
        /* loaded from: classes2.dex */
        public static final class b implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ V3GoalsActivity f11209a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.v f11210b;

            public b(V3GoalsActivity v3GoalsActivity, kotlin.jvm.internal.v vVar) {
                this.f11209a = v3GoalsActivity;
                this.f11210b = vVar;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
                hs.f fVar;
                float dimensionPixelSize;
                boolean z11;
                boolean z12;
                AppCompatImageView appCompatImageView;
                V3GoalsActivity v3GoalsActivity = this.f11209a;
                if (seekBar != null) {
                    seekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(v3GoalsActivity, R.color.sea)));
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) v3GoalsActivity.n0(R.id.ivNPSRatingImage);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setImageTintList(null);
                }
                kotlin.jvm.internal.v vVar = this.f11210b;
                vVar.f23467u = i6;
                RobertoTextView robertoTextView = (RobertoTextView) v3GoalsActivity.n0(R.id.tvNPSFooterPrompt);
                if (robertoTextView != null) {
                    robertoTextView.setVisibility(8);
                }
                RobertoButton robertoButton = (RobertoButton) v3GoalsActivity.n0(R.id.rbNPSSubmit1);
                boolean z13 = false;
                if (robertoButton != null) {
                    robertoButton.setVisibility(0);
                }
                int i10 = vVar.f23467u;
                v3GoalsActivity.getClass();
                Integer valueOf = Integer.valueOf((int) R.dimen._4sdp);
                Integer valueOf2 = Integer.valueOf((int) R.dimen._3sdp);
                switch (i10) {
                    case 0:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel0), 0);
                        break;
                    case 1:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel1), 0);
                        break;
                    case 2:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel2), 0);
                        break;
                    case 3:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel3), Integer.valueOf((int) R.dimen._1sdp));
                        break;
                    case 4:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel4), Integer.valueOf((int) R.dimen._2sdp));
                        break;
                    case 5:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel5), valueOf2);
                        break;
                    case 6:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel6), valueOf2);
                        break;
                    case 7:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel7), valueOf);
                        break;
                    case 8:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel8), valueOf);
                        break;
                    case 9:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel9), Integer.valueOf((int) R.dimen._5sdp));
                        break;
                    default:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel10), 0);
                        break;
                }
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                bVar.f((ConstraintLayout) v3GoalsActivity.n0(R.id.clNPSBottomSheet));
                Number number = (Number) fVar.f19464u;
                bVar.h(R.id.ivNPSSeekSelector, 3, number.intValue(), 3);
                bVar.h(R.id.ivNPSSeekSelector, 7, number.intValue(), 7);
                bVar.h(R.id.ivNPSSeekSelector, 6, number.intValue(), 6);
                bVar.h(R.id.ivNPSSeekSelector, 4, number.intValue(), 4);
                bVar.b((ConstraintLayout) v3GoalsActivity.n0(R.id.clNPSBottomSheet));
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) v3GoalsActivity.n0(R.id.ivNPSSeekSelector);
                Number number2 = (Number) fVar.f19465v;
                if (number2.intValue() == 0) {
                    dimensionPixelSize = 0.0f;
                } else {
                    dimensionPixelSize = v3GoalsActivity.getResources().getDimensionPixelSize(number2.intValue());
                }
                appCompatImageView3.setTranslationX(dimensionPixelSize);
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) v3GoalsActivity.n0(R.id.ivNPSSeekSelector);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setVisibility(0);
                }
                if (i6 >= 0 && i6 < 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) v3GoalsActivity.n0(R.id.ivNPSRatingImage);
                    if (appCompatImageView5 != null) {
                        appCompatImageView5.setImageResource(R.drawable.ic_nps_allie_1);
                        return;
                    }
                    return;
                }
                if (4 <= i6 && i6 < 7) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) v3GoalsActivity.n0(R.id.ivNPSRatingImage);
                    if (appCompatImageView6 != null) {
                        appCompatImageView6.setImageResource(R.drawable.ic_nps_allie_2);
                        return;
                    }
                    return;
                }
                if (7 <= i6 && i6 < 10) {
                    z13 = true;
                }
                if (z13) {
                    AppCompatImageView appCompatImageView7 = (AppCompatImageView) v3GoalsActivity.n0(R.id.ivNPSRatingImage);
                    if (appCompatImageView7 != null) {
                        appCompatImageView7.setImageResource(R.drawable.ic_nps_allie_3);
                    }
                } else if (i6 == 10 && (appCompatImageView = (AppCompatImageView) v3GoalsActivity.n0(R.id.ivNPSRatingImage)) != null) {
                    appCompatImageView.setImageResource(R.drawable.ic_nps_allie_4);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
            }
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e implements ViewPager.i {
        public e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10;
            V3GoalsActivity v3GoalsActivity = V3GoalsActivity.this;
            try {
                v3GoalsActivity.F = i6;
                Iterator<RobertoTextView> it = v3GoalsActivity.Q.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    int i12 = i11 + 1;
                    RobertoTextView next = it.next();
                    int i13 = R.color.orange;
                    if (i11 == i6) {
                        TabLayout tabLayout = (TabLayout) v3GoalsActivity.n0(R.id.tabsLayout);
                        if (i6 == 0) {
                            i10 = R.color.orange;
                        } else {
                            i10 = R.color.sea;
                        }
                        tabLayout.setSelectedTabIndicatorColor(g0.a.b(v3GoalsActivity, i10));
                        if (i6 != 0) {
                            i13 = R.color.sea;
                        }
                        next.setTextColor(g0.a.b(v3GoalsActivity, i13));
                        next.setTextSize(2, 14.0f);
                        next.setFont("Lato-Bold.ttf");
                    } else {
                        TabLayout tabLayout2 = (TabLayout) v3GoalsActivity.n0(R.id.tabsLayout);
                        if (i6 != 0) {
                            i13 = R.color.sea;
                        }
                        tabLayout2.setSelectedTabIndicatorColor(g0.a.b(v3GoalsActivity, i13));
                        next.setTextColor(g0.a.b(v3GoalsActivity, R.color.learning_hub_grey_3));
                        next.setTextSize(2, 14.0f);
                        next.setFont("Lato-Bold.ttf");
                    }
                    i11 = i12;
                }
                Fragment fragment = null;
                if (v3GoalsActivity.F == 0) {
                    a aVar = v3GoalsActivity.P;
                    if (aVar != null) {
                        fragment = aVar.q(0);
                    }
                    kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsRegularFragment");
                    ((c0) fragment).J();
                    return;
                }
                a aVar2 = v3GoalsActivity.P;
                if (aVar2 != null) {
                    fragment = aVar2.q(1);
                }
                kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsCustomFragment");
                ((z) fragment).J();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(v3GoalsActivity.f11187v, e10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
