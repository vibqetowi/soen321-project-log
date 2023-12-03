package com.theinnerhour.b2b.components.topicalcourses.activity;

import a3.t;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import bm.r;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalGoalsActivity;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import ss.q;
import tp.g;
import tp.j;
import tp.l;
import tp.m;
import up.c;
import xp.d;
/* compiled from: TopicalGoalsActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/theinnerhour/b2b/components/topicalcourses/activity/TopicalGoalsActivity;", "Landroidx/appcompat/app/c;", "Lup/c$b;", "Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence$SubscriptionInitialiseListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TopicalGoalsActivity extends c implements c.b, SubscriptionPersistence.SubscriptionInitialiseListener {
    public static final /* synthetic */ int P = 0;
    public Date B;
    public final ArrayList<String> C;
    public final ArrayList<Goal> D;
    public Date E;
    public up.c F;
    public final int G;
    public int H;
    public String I;
    public d J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;

    /* renamed from: w  reason: collision with root package name */
    public r f11675w;
    public final LinkedHashMap O = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11674v = LogHelper.INSTANCE.makeLogTag(TopicalGoalsActivity.class);

    /* renamed from: x  reason: collision with root package name */
    public final int f11676x = 23924;

    /* renamed from: y  reason: collision with root package name */
    public final int f11677y = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;

    /* renamed from: z  reason: collision with root package name */
    public int f11678z = -1;
    public int A = -1;

    /* compiled from: TopicalGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements q<Date, Integer, Boolean, hs.k> {
        public a() {
            super(3);
        }

        @Override // ss.q
        public final hs.k invoke(Date date, Integer num, Boolean bool) {
            Date date2 = date;
            num.intValue();
            boolean booleanValue = bool.booleanValue();
            i.g(date2, "date");
            TopicalGoalsActivity topicalGoalsActivity = TopicalGoalsActivity.this;
            topicalGoalsActivity.B = date2;
            topicalGoalsActivity.u0(date2);
            if (booleanValue) {
                Bundle bundle = new Bundle();
                bundle.putString("date", new SimpleDateFormat("yyyy-MM-dd").format(date2));
                gk.a.b(bundle, "topical_goal_calendar_select");
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TopicalGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                TopicalGoalsActivity topicalGoalsActivity = TopicalGoalsActivity.this;
                if (topicalGoalsActivity.f11675w != null) {
                    RecyclerView.m layoutManager = ((RecyclerView) topicalGoalsActivity.n0(R.id.rvGoalsListCalendar)).getLayoutManager();
                    i.d(layoutManager);
                    int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                    if (topicalGoalsActivity.N != findFirstVisibleItemPosition) {
                        r rVar = topicalGoalsActivity.f11675w;
                        if (rVar != null) {
                            rVar.x(findFirstVisibleItemPosition);
                            topicalGoalsActivity.N = findFirstVisibleItemPosition;
                            return;
                        }
                        i.q("goalsCalendarAdapter");
                        throw null;
                    }
                }
            }
        }
    }

    public TopicalGoalsActivity() {
        Utils utils = Utils.INSTANCE;
        Date time = utils.getTodayCalendar().getTime();
        i.f(time, "Utils.todayCalendar.time");
        this.B = time;
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.E = utils.getTodayCalendar().getTime();
        this.G = 15648;
        this.H = -1;
        this.I = "";
        this.N = -1;
    }

    @Override // up.c.b
    public final void b() {
        d dVar = this.J;
        if (dVar != null) {
            Date displayDate = this.E;
            i.f(displayDate, "displayDate");
            dVar.e(displayDate);
            return;
        }
        i.q("goalViewModel");
        throw null;
    }

    @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
    public final void initialiseComplete(boolean z10) {
        o0();
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.O;
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

    public final void o0() {
        if (this.D.isEmpty()) {
            ((ConstraintLayout) n0(R.id.bottom_sheet)).setVisibility(8);
            ((CircularProgressBar) n0(R.id.habitCircularProgress)).setVisibility(8);
            ((RobertoTextView) n0(R.id.dateText)).setVisibility(8);
            ((RobertoTextView) n0(R.id.trackText)).setVisibility(8);
            ((AppCompatImageView) n0(R.id.ivMenu)).setVisibility(8);
            ((RobertoTextView) n0(R.id.dateText)).setVisibility(8);
            ((RobertoTextView) n0(R.id.tvEmptyState)).setVisibility(0);
            ((AppCompatImageView) n0(R.id.ivEmptyState)).setVisibility(0);
            ((RecyclerView) n0(R.id.goalRecyclerView)).setVisibility(8);
        } else {
            ((ConstraintLayout) n0(R.id.bottom_sheet)).setVisibility(0);
            ((CircularProgressBar) n0(R.id.habitCircularProgress)).setVisibility(0);
            ((RobertoTextView) n0(R.id.dateText)).setVisibility(0);
            ((RobertoTextView) n0(R.id.trackText)).setVisibility(0);
            ((AppCompatImageView) n0(R.id.ivMenu)).setVisibility(0);
            ((RobertoTextView) n0(R.id.dateText)).setVisibility(0);
            ((RecyclerView) n0(R.id.goalRecyclerView)).setVisibility(0);
            ((AppCompatImageView) n0(R.id.ivEmptyState)).setVisibility(8);
            ((RobertoTextView) n0(R.id.tvEmptyState)).setVisibility(8);
        }
        t0(null);
        if (this.B.before(Utils.INSTANCE.getTodayCalendar().getTime())) {
            ((RobertoTextView) n0(R.id.tvEmptyState)).setText("You didn't have any goals added for this day.");
        } else {
            ((RobertoTextView) n0(R.id.tvEmptyState)).setText(getString(R.string.topicalGoalsAddPrompt));
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.i(this.f11674v, "on activity result " + i6 + ' ' + this.f11676x);
        if (i6 == this.G) {
            if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info_topical", false)) {
                ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info_topical", true);
            }
            if (i10 == -1 && this.H != -1 && !i.b(this.I, "null")) {
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_goal_check_topical, this, R.style.Theme_Dialog_Fullscreen);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) styledDialog.findViewById(R.id.goalCheckAnimation);
                if (Build.VERSION.SDK_INT < 25) {
                    if (lottieAnimationView != null) {
                        lottieAnimationView.setRenderMode(t.SOFTWARE);
                    }
                } else if (lottieAnimationView != null) {
                    lottieAnimationView.setRenderMode(t.HARDWARE);
                }
                lottieAnimationView.c(new j(styledDialog, lottieAnimationView));
                styledDialog.setCancelable(false);
                styledDialog.show();
                lottieAnimationView.h();
                Goal topicalGoalById = FirebasePersistence.getInstance().getTopicalGoalById(this.I);
                if (topicalGoalById != null) {
                    topicalGoalById.getType();
                    q(topicalGoalById, 2, this.H);
                }
            }
        } else if (i6 == this.f11677y) {
            if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() || (i10 == -1 && intent != null && intent.getBooleanExtra("purchase_successful", false))) {
                t0(Boolean.TRUE);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_topical_goals);
        try {
            Window window = getWindow();
            window.setStatusBarColor(g0.a.b(this, R.color.statusBarGrey));
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 23) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            }
            this.J = (d) new o0(this).a(d.class);
            ((ImageView) n0(R.id.header_arrow_back)).setOnClickListener(new g(this, 0));
            s0();
            q0();
            ((AppCompatImageView) n0(R.id.ivMenu)).setOnClickListener(new g(this, 1));
            ((AppCompatImageView) n0(R.id.ivCalendar)).setOnClickListener(new g(this, 2));
            RobertoButton robertoButton = (RobertoButton) n0(R.id.addGoalButton);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new g(this, 3));
            }
            RobertoButton robertoButton2 = (RobertoButton) n0(R.id.goalsSheetAddGoalButton);
            if (robertoButton2 != null) {
                robertoButton2.setOnClickListener(new g(this, 4));
            }
            Glide.c(this).d(this).o(Integer.valueOf((int) R.drawable.ic_goals_null_state)).B((AppCompatImageView) n0(R.id.ivEmptyState));
            CircularProgressBar circularProgressBar = (CircularProgressBar) n0(R.id.habitCircularProgress);
            if (circularProgressBar != null) {
                circularProgressBar.setRoundBorder(true);
            }
            CircularProgressBar circularProgressBar2 = (CircularProgressBar) n0(R.id.habitCircularProgress);
            if (circularProgressBar2 != null) {
                circularProgressBar2.post(new Runnable(this) { // from class: tp.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ TopicalGoalsActivity f33410v;

                    {
                        this.f33410v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = r2;
                        TopicalGoalsActivity this$0 = this.f33410v;
                        switch (i10) {
                            case 0:
                                int i11 = TopicalGoalsActivity.P;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K = true;
                                this$0.r0();
                                return;
                            case 1:
                                int i12 = TopicalGoalsActivity.P;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.L = true;
                                this$0.r0();
                                return;
                            default:
                                int i13 = TopicalGoalsActivity.P;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.M = true;
                                this$0.r0();
                                return;
                        }
                    }
                });
            }
            RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.dateText);
            if (robertoTextView != null) {
                robertoTextView.post(new Runnable(this) { // from class: tp.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ TopicalGoalsActivity f33410v;

                    {
                        this.f33410v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = r2;
                        TopicalGoalsActivity this$0 = this.f33410v;
                        switch (i10) {
                            case 0:
                                int i11 = TopicalGoalsActivity.P;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K = true;
                                this$0.r0();
                                return;
                            case 1:
                                int i12 = TopicalGoalsActivity.P;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.L = true;
                                this$0.r0();
                                return;
                            default:
                                int i13 = TopicalGoalsActivity.P;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.M = true;
                                this$0.r0();
                                return;
                        }
                    }
                });
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) n0(R.id.trackText);
            if (robertoTextView2 != null) {
                robertoTextView2.post(new Runnable(this) { // from class: tp.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ TopicalGoalsActivity f33410v;

                    {
                        this.f33410v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = r2;
                        TopicalGoalsActivity this$0 = this.f33410v;
                        switch (i10) {
                            case 0:
                                int i11 = TopicalGoalsActivity.P;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K = true;
                                this$0.r0();
                                return;
                            case 1:
                                int i12 = TopicalGoalsActivity.P;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.L = true;
                                this$0.r0();
                                return;
                            default:
                                int i13 = TopicalGoalsActivity.P;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.M = true;
                                this$0.r0();
                                return;
                        }
                    }
                });
            }
            if (i6 < 25) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) n0(R.id.completionAnimation);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRenderMode(t.SOFTWARE);
                    return;
                }
                return;
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) n0(R.id.completionAnimation);
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setRenderMode(t.HARDWARE);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11674v, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(this);
        d dVar = this.J;
        if (dVar != null) {
            dVar.f37888y.k(this);
            d dVar2 = this.J;
            if (dVar2 != null) {
                dVar2.A.k(this);
                d dVar3 = this.J;
                if (dVar3 != null) {
                    dVar3.f37889z.k(this);
                    return;
                } else {
                    i.q("goalViewModel");
                    throw null;
                }
            }
            i.q("goalViewModel");
            throw null;
        }
        i.q("goalViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        r rVar = this.f11675w;
        if (rVar != null) {
            rVar.v();
            rVar.i();
            if (this.f11675w != null) {
                RecyclerView recyclerView = (RecyclerView) n0(R.id.rvGoalsListCalendar);
                r rVar2 = this.f11675w;
                if (rVar2 != null) {
                    recyclerView.h0(rVar2.H - 1);
                    r rVar3 = this.f11675w;
                    if (rVar3 != null) {
                        rVar3.w(rVar3.H - 1, false);
                    } else {
                        i.q("goalsCalendarAdapter");
                        throw null;
                    }
                } else {
                    i.q("goalsCalendarAdapter");
                    throw null;
                }
            }
            Date time = Utils.INSTANCE.getTodayCalendar().getTime();
            i.f(time, "Utils.todayCalendar.time");
            u0(time);
            up.c cVar = this.F;
            if (cVar != null && cVar.D) {
                p0();
            }
            super.onResume();
            return;
        }
        i.q("goalsCalendarAdapter");
        throw null;
    }

    public final void p0() {
        up.c cVar = this.F;
        if (cVar != null) {
            i.d(cVar);
            up.c cVar2 = this.F;
            i.d(cVar2);
            cVar.D = !cVar2.D;
            up.c cVar3 = this.F;
            i.d(cVar3);
            cVar3.i();
            up.c cVar4 = this.F;
            i.d(cVar4);
            if (cVar4.D) {
                ((AppCompatImageView) n0(R.id.ivCalendar)).setVisibility(8);
                ((RecyclerView) n0(R.id.rvGoalsListCalendar)).setVisibility(8);
                ((AppCompatImageView) n0(R.id.ivMenu)).setVisibility(8);
                ((ImageView) n0(R.id.header_arrow_back)).setImageResource(R.drawable.ic_close_icon);
                ((ImageView) n0(R.id.header_arrow_back)).setOnClickListener(new g(this, 5));
                ((RobertoTextView) n0(R.id.heading)).setText("Edit Goals");
                return;
            }
            ((AppCompatImageView) n0(R.id.ivCalendar)).setVisibility(0);
            ((AppCompatImageView) n0(R.id.ivMenu)).setVisibility(0);
            ((ImageView) n0(R.id.header_arrow_back)).setImageResource(R.drawable.ic_arrow_back);
            ((ImageView) n0(R.id.header_arrow_back)).setOnClickListener(new g(this, 6));
            ((RobertoTextView) n0(R.id.heading)).setText("Your Goals");
            if (this.A == 0) {
                ((AppCompatImageView) n0(R.id.ivMenu)).setVisibility(8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.theinnerhour.b2b.model.GamificationModel] */
    @Override // up.c.b
    public final void q(Goal goal, int i6, int i10) {
        boolean z10;
        boolean z11;
        x xVar = new x();
        ArrayList<GoalDateObj> trackList = goal.getTrackList();
        Iterator<GoalDateObj> it = trackList.iterator();
        while (true) {
            z10 = false;
            if (it.hasNext()) {
                GoalDateObj next = it.next();
                if (next.getDate().getTime() * 1000 == this.E.getTime()) {
                    next.setVal(i6);
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        if (!z11) {
            Date date = this.E;
            i.f(date, "this.displayDate");
            trackList.add(new GoalDateObj(date, i6));
            xVar.f23469u = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
        }
        new Handler().postDelayed(new ni.c(14, this, goal, xVar), 750L);
        FirebasePersistence.getInstance().updateTopicalGoal(goal);
        d dVar = this.J;
        if (dVar != null) {
            Date displayDate = this.E;
            i.f(displayDate, "displayDate");
            dVar.e(displayDate);
            up.c cVar = this.F;
            if (cVar != null) {
                cVar.j(i10);
            }
            Bundle bundle = new Bundle();
            if (i6 == 2) {
                z10 = true;
            }
            bundle.putBoolean("tracked", z10);
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            bundle.putString(Constants.GOAL_ID, goal.getGoalId());
            bundle.putString(Constants.GOAL_NAME, goal.getGoalName());
            bundle.putString("type", goal.getType());
            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            gk.a.b(bundle, "topical_goal_track_update");
            return;
        }
        i.q("goalViewModel");
        throw null;
    }

    public final void q0() {
        long timeInMillis;
        try {
            Iterator<MiniCourse> it = FirebasePersistence.getInstance().getUser().getTopicalCourseList().iterator();
            long j10 = 0;
            while (it.hasNext()) {
                Iterator<CourseDayModelV1> it2 = it.next().getPlan().iterator();
                while (it2.hasNext()) {
                    CourseDayModelV1 next = it2.next();
                    if (next.getStart_date() != 0 && (j10 == 0 || next.getStart_date() < j10)) {
                        j10 = next.getStart_date();
                    }
                }
            }
            ((RecyclerView) n0(R.id.rvGoalsListCalendar)).setLayoutManager(new LinearLayoutManager(this, 0, false));
            RecyclerView recyclerView = (RecyclerView) n0(R.id.rvGoalsListCalendar);
            if (j10 != 0) {
                timeInMillis = j10 * 1000;
            } else {
                timeInMillis = Calendar.getInstance().getTimeInMillis();
            }
            r rVar = new r(this, timeInMillis, Integer.valueOf((int) R.color.topicalGreen), new a());
            this.f11675w = rVar;
            recyclerView.setAdapter(rVar);
            new w().a((RecyclerView) n0(R.id.rvGoalsListCalendar));
            ((RecyclerView) n0(R.id.rvGoalsListCalendar)).i(new b());
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11674v, "Exception", e10);
        }
    }

    public final void r0() {
        if (this.M && this.L && this.K) {
            BottomSheetBehavior from = BottomSheetBehavior.from((ConstraintLayout) n0(R.id.bottom_sheet));
            i.f(from, "from(bottom_sheet)");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int height = (displayMetrics.heightPixels - (((RobertoTextView) n0(R.id.trackText)).getHeight() + (((RobertoTextView) n0(R.id.dateText)).getHeight() + ((CircularProgressBar) n0(R.id.habitCircularProgress)).getHeight()))) - 465;
            if (((ConstraintLayout) n0(R.id.goalInfoLayout)).getVisibility() == 0) {
                height -= 175;
            }
            from.setPeekHeight(height);
        }
    }

    public final void s0() {
        ArrayList<String> arrayList;
        Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
        int i6 = 0;
        while (true) {
            arrayList = this.C;
            if (i6 >= 7) {
                break;
            }
            CharSequence format = DateFormat.format("EEEE", todayCalendar.getTime());
            i.e(format, "null cannot be cast to non-null type kotlin.String");
            String substring = ((String) format).substring(0, 1);
            i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            todayCalendar.add(5, -1);
            i6++;
        }
        is.r.W1(arrayList);
        d dVar = this.J;
        if (dVar != null) {
            Date displayDate = this.E;
            i.f(displayDate, "displayDate");
            dVar.e(displayDate);
            Date date = this.E;
            i.f(date, "this.displayDate");
            this.F = new up.c(this, date, this, arrayList, this.D);
            ((RecyclerView) n0(R.id.goalRecyclerView)).setLayoutManager(new LinearLayoutManager(this, 1, false));
            ((RecyclerView) n0(R.id.goalRecyclerView)).setHasFixedSize(true);
            ((RecyclerView) n0(R.id.goalRecyclerView)).setItemAnimator(new androidx.recyclerview.widget.c());
            ((RecyclerView) n0(R.id.goalRecyclerView)).setAdapter(this.F);
            ((RecyclerView) n0(R.id.goalRecyclerView)).getViewTreeObserver().addOnGlobalLayoutListener(new tp.i(this));
            d dVar2 = this.J;
            if (dVar2 != null) {
                dVar2.f37888y.e(this, new pp.b(1, new tp.k(this)));
                d dVar3 = this.J;
                if (dVar3 != null) {
                    dVar3.A.e(this, new pp.b(2, new l(this)));
                    d dVar4 = this.J;
                    if (dVar4 != null) {
                        dVar4.f37889z.e(this, new pp.b(3, new m(this)));
                        return;
                    } else {
                        i.q("goalViewModel");
                        throw null;
                    }
                }
                i.q("goalViewModel");
                throw null;
            }
            i.q("goalViewModel");
            throw null;
        }
        i.q("goalViewModel");
        throw null;
    }

    @Override // up.c.b
    public final void t(Goal goal, int i6) {
        int hashCode;
        this.H = i6;
        this.I = String.valueOf(goal.getGoalId());
        boolean b10 = i.b(goal.getGoalId(), "wRiML8ebB1zu56mdNwmN");
        int i10 = this.G;
        if (b10) {
            Intent intent = new Intent(this, T5Activity.class);
            intent.putExtra(Constants.API_COURSE_LINK, Constants.NOTIFICATION_WORRY);
            intent.putExtra("source", "goals");
            startActivityForResult(intent, i10);
            return;
        }
        String type = goal.getType();
        if (type != null && ((hashCode = type.hashCode()) == -2070778647 ? type.equals(Constants.GOAL_TYPE_ACTIVITY_DAILY) : hashCode == -1408757131 ? type.equals(Constants.GOAL_TYPE_DAILY_ACTIVITY) : !(hashCode != 99033460 || !type.equals(Constants.GOAL_TYPE_HABIT)))) {
            Intent intent2 = new Intent(this, TemplateActivity.class);
            intent2.putExtra("source", "goals");
            intent2.putExtra("topicalGoalsClick", true);
            intent2.putExtra("goalId", goal.getGoalId());
            intent2.putExtra("type", "daily");
            startActivityForResult(intent2, i10);
        }
        ApplicationPersistence.getInstance().setBooleanValue("topical_clickable_goal_info", true);
        Bundle bundle = new Bundle();
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putString("topicalCourse", goal.getSource());
        bundle.putString(Constants.GOAL_ID, goal.getGoalId());
        bundle.putString(Constants.GOAL_NAME, goal.getGoalName());
        bundle.putString(Constants.GOAL_TYPE, goal.getType());
        bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
        gk.a.b(bundle, "topical_goal_card_click");
    }

    public final void t0(Boolean bool) {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (bool != null) {
            RobertoButton robertoButton = (RobertoButton) n0(R.id.addGoalButton);
            if (robertoButton != null) {
                if (bool.booleanValue()) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                robertoButton.setVisibility(i14);
            }
            RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.ctaPrompt);
            if (robertoTextView != null) {
                if (bool.booleanValue()) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                robertoTextView.setVisibility(i13);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) n0(R.id.bottomIllus);
            if (appCompatImageView != null) {
                if (bool.booleanValue()) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                appCompatImageView.setVisibility(i12);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) n0(R.id.goalsSheetBottomLayout);
            if (constraintLayout != null) {
                if (bool.booleanValue()) {
                    i15 = 8;
                }
                constraintLayout.setVisibility(i15);
            }
        } else if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
            RobertoButton robertoButton2 = (RobertoButton) n0(R.id.addGoalButton);
            if (robertoButton2 != null) {
                robertoButton2.setVisibility(8);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) n0(R.id.ctaPrompt);
            if (robertoTextView2 != null) {
                robertoTextView2.setVisibility(8);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) n0(R.id.bottomIllus);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(8);
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) n0(R.id.goalsSheetBottomLayout);
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
        } else {
            boolean z10 = !this.D.isEmpty();
            RobertoButton robertoButton3 = (RobertoButton) n0(R.id.addGoalButton);
            if (robertoButton3 != null) {
                if (z10) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                robertoButton3.setVisibility(i11);
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) n0(R.id.ctaPrompt);
            if (robertoTextView3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                robertoTextView3.setVisibility(i10);
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) n0(R.id.bottomIllus);
            if (appCompatImageView3 != null) {
                if (z10) {
                    i6 = 8;
                } else {
                    i6 = 0;
                }
                appCompatImageView3.setVisibility(i6);
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) n0(R.id.goalsSheetBottomLayout);
            if (constraintLayout3 != null) {
                if (!z10) {
                    i15 = 8;
                }
                constraintLayout3.setVisibility(i15);
            }
        }
    }

    public final void u0(Date date) {
        try {
            this.E = date;
            ((RobertoTextView) n0(R.id.dateText)).setText(new SimpleDateFormat("dd MMMM").format(Long.valueOf(date.getTime())));
            up.c cVar = this.F;
            int i6 = 0;
            if (cVar != null) {
                Date displayDate = this.E;
                i.f(displayDate, "displayDate");
                cVar.A = displayDate;
                Calendar calendar = cVar.f34442y.getWeekOf(displayDate.getTime()).get(0);
                i.f(calendar, "goalHelper.getWeekOf(this.date.time)[0]");
                cVar.f34443z = calendar;
                d dVar = this.J;
                if (dVar != null) {
                    Date displayDate2 = this.E;
                    i.f(displayDate2, "displayDate");
                    dVar.e(displayDate2);
                } else {
                    i.q("goalViewModel");
                    throw null;
                }
            }
            ((AppCompatImageView) n0(R.id.ivMenu)).setVisibility((!i.b(date, Utils.INSTANCE.getTodayCalendar().getTime()) || this.D.isEmpty()) ? 8 : 8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11674v, "Exception", e10);
        }
    }
}
