package com.theinnerhour.b2b.components.goals.activity;

import am.t;
import am.u;
import am.x;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateFormat;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.i;
import bm.k;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AddGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.n;
import fm.o1;
import is.r;
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
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import ss.p;
/* compiled from: V2GoalsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/goals/activity/V2GoalsActivity;", "Landroidx/appcompat/app/c;", "Lbm/i$b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class V2GoalsActivity extends androidx.appcompat.app.c implements i.b {
    public static final /* synthetic */ int Q = 0;
    public final ArrayList<Course> A;
    public int B;
    public int C;
    public int D;
    public Date E;
    public long F;
    public boolean G;
    public ProgressDialog H;
    public boolean I;
    public o1 J;
    public final ArrayList<String> K;
    public final ArrayList<Object> L;
    public Date M;
    public final HashMap<String, GoalType> N;
    public i O;
    public final LinkedHashMap P = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11173v = LogHelper.INSTANCE.makeLogTag(V2GoalsActivity.class);

    /* renamed from: w  reason: collision with root package name */
    public Course f11174w;

    /* renamed from: x  reason: collision with root package name */
    public k f11175x;

    /* renamed from: y  reason: collision with root package name */
    public final CourseDayModel f11176y;

    /* renamed from: z  reason: collision with root package name */
    public final int f11177z;

    /* compiled from: V2GoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animation.AnimationListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ boolean f11178u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ V2GoalsActivity f11179v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f11180w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Animation f11181x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Animation f11182y;

        public a(boolean z10, V2GoalsActivity v2GoalsActivity, boolean z11, Animation animation, Animation animation2) {
            this.f11178u = z10;
            this.f11179v = v2GoalsActivity;
            this.f11180w = z11;
            this.f11181x = animation;
            this.f11182y = animation2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            boolean z10 = this.f11178u;
            V2GoalsActivity v2GoalsActivity = this.f11179v;
            if (z10) {
                ((CardView) v2GoalsActivity.n0(R.id.goalFeedbackLayout)).setVisibility(8);
                v2GoalsActivity.o0();
            } else {
                boolean z11 = this.f11180w;
                Animation animation2 = this.f11181x;
                if (z11) {
                    UtilsKt.fireAnalytics("goal_negative_feedback_show", UtilsKt.getAnalyticsBundle());
                    ((ConstraintLayout) v2GoalsActivity.n0(R.id.goalFeedbackCardFront)).setVisibility(8);
                    ((ConstraintLayout) v2GoalsActivity.n0(R.id.goalFeedbackCardBack)).setVisibility(0);
                    ((CardView) v2GoalsActivity.n0(R.id.goalFeedbackLayout)).startAnimation(animation2);
                    ((RobertoTextView) v2GoalsActivity.n0(R.id.submitCTA)).setOnClickListener(new u(v2GoalsActivity, 5));
                } else {
                    UtilsKt.fireAnalytics("goal_play_store_feedback_show", UtilsKt.getAnalyticsBundle());
                    ((RobertoTextView) v2GoalsActivity.n0(R.id.goalFeedbackHeader)).setText(v2GoalsActivity.getString(R.string.goalsFeedbackPositive));
                    ((RobertoButton) v2GoalsActivity.n0(R.id.goalFeedbackNo)).setText(v2GoalsActivity.getString(R.string.rateUsNo));
                    ((RobertoButton) v2GoalsActivity.n0(R.id.goalFeedbackYes)).setText(v2GoalsActivity.getString(R.string.goalsFeedbackYesCta));
                    ((RobertoButton) v2GoalsActivity.n0(R.id.goalFeedbackYes)).setOnClickListener(new u(v2GoalsActivity, 6));
                    ((RobertoButton) v2GoalsActivity.n0(R.id.goalFeedbackNo)).setOnClickListener(new u(v2GoalsActivity, 7));
                    ((CardView) v2GoalsActivity.n0(R.id.goalFeedbackLayout)).startAnimation(animation2);
                }
            }
            this.f11182y.setAnimationListener(null);
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

    /* compiled from: V2GoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements p<Date, Integer, hs.k> {
        public b() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Date date, Integer num) {
            Date date2 = date;
            num.intValue();
            kotlin.jvm.internal.i.g(date2, "date");
            int i6 = V2GoalsActivity.Q;
            V2GoalsActivity v2GoalsActivity = V2GoalsActivity.this;
            v2GoalsActivity.u0(date2);
            v2GoalsActivity.v0(date2);
            v2GoalsActivity.r0(date2);
            return hs.k.f19476a;
        }
    }

    /* compiled from: V2GoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.r {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ w f11185b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ v f11186c;

        public c(w wVar, v vVar) {
            this.f11185b = wVar;
            this.f11186c = vVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i6, int i10) {
            kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
            V2GoalsActivity v2GoalsActivity = V2GoalsActivity.this;
            RecyclerView.m layoutManager = ((RecyclerView) v2GoalsActivity.n0(R.id.rvGoalsListCalendar)).getLayoutManager();
            kotlin.jvm.internal.i.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            Calendar calendar = Calendar.getInstance();
            long j10 = 1000;
            calendar.setTimeInMillis(this.f11185b.f23468u * j10);
            calendar.clear(11);
            calendar.clear(9);
            calendar.clear(12);
            calendar.clear(10);
            calendar.clear(13);
            calendar.clear(14);
            v vVar = this.f11186c;
            int i11 = vVar.f23467u;
            if (i11 != findFirstVisibleItemPosition) {
                if (i6 > 0) {
                    calendar.add(5, findFirstVisibleItemPosition);
                } else {
                    calendar.add(5, i11);
                    calendar.add(5, -(vVar.f23467u - findFirstVisibleItemPosition));
                }
                ((RobertoTextView) v2GoalsActivity.n0(R.id.tvCurrentMonth)).setText(LocalDateTime.ofEpochSecond(calendar.getTimeInMillis() / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(calendar.getTimeInMillis()))).format(DateTimeFormatter.ofPattern("MMMM yyyy").withLocale(Locale.ENGLISH)));
                vVar.f23467u = findFirstVisibleItemPosition;
            }
        }
    }

    public V2GoalsActivity() {
        new CourseDayModel();
        this.f11176y = new CourseDayModel();
        this.f11177z = 23924;
        ArrayList<Course> courses = FirebasePersistence.getInstance().getCourses();
        kotlin.jvm.internal.i.d(courses);
        this.A = courses;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        Utils utils = Utils.INSTANCE;
        Date time = utils.getTodayCalendar().getTime();
        kotlin.jvm.internal.i.f(time, "Utils.todayCalendar.time");
        this.E = time;
        this.F = utils.getTodayTimeInSeconds();
        this.K = new ArrayList<>();
        this.L = new ArrayList<>();
        this.M = utils.getTodayCalendar().getTime();
        this.N = Constants.getGoalsHashMap();
    }

    @Override // bm.i.b
    public final void b() {
        o1 o1Var = this.J;
        if (o1Var != null) {
            Date displayDate = this.M;
            kotlin.jvm.internal.i.f(displayDate, "displayDate");
            o1Var.e(displayDate);
            return;
        }
        kotlin.jvm.internal.i.q("goalViewModel");
        throw null;
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.P;
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
        if (this.L.isEmpty()) {
            ((RobertoTextView) n0(R.id.ivMenu)).setVisibility(8);
            ((RobertoTextView) n0(R.id.tvEmptyState)).setVisibility(0);
            if (((CardView) n0(R.id.goalFeedbackLayout)).getVisibility() == 8) {
                ((AppCompatImageView) n0(R.id.ivEmptyState)).setVisibility(0);
            }
            ((RecyclerView) n0(R.id.goalRecyclerView)).setVisibility(8);
            ((RobertoButton) n0(R.id.addGoalsButtonMain)).setVisibility(0);
        } else {
            ((RobertoTextView) n0(R.id.ivMenu)).setVisibility(0);
            ((RecyclerView) n0(R.id.goalRecyclerView)).setVisibility(0);
            ((AppCompatImageView) n0(R.id.ivEmptyState)).setVisibility(8);
            ((RobertoTextView) n0(R.id.tvEmptyState)).setVisibility(8);
            ((RobertoButton) n0(R.id.addGoalsButtonMain)).setVisibility(8);
        }
        if (this.E.before(Utils.INSTANCE.getTodayCalendar().getTime())) {
            ((RobertoButton) n0(R.id.addGoalsButtonMain)).setVisibility(8);
            ((RobertoTextView) n0(R.id.tvEmptyState)).setText("You had not set any goals for this day!");
            return;
        }
        ((RobertoTextView) n0(R.id.tvEmptyState)).setText("Goals will be added as you go through your day-wise plan. For now, you can add goals from our list of Recommended Activities!");
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        LogHelper logHelper = LogHelper.INSTANCE;
        StringBuilder sb2 = new StringBuilder("on activity result ");
        sb2.append(i6);
        sb2.append(' ');
        int i11 = this.f11177z;
        sb2.append(i11);
        logHelper.i(this.f11173v, sb2.toString());
        if (i6 == i11 && this.O != null) {
            o1 o1Var = this.J;
            if (o1Var != null) {
                Date displayDate = this.M;
                kotlin.jvm.internal.i.f(displayDate, "displayDate");
                o1Var.e(displayDate);
            } else {
                kotlin.jvm.internal.i.q("goalViewModel");
                throw null;
            }
        }
        if (this.I) {
            ((RecyclerView) n0(R.id.goalRecyclerView)).post(new t(this, 1));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        setResult(-1, intent);
        if (!this.I) {
            intent.putExtra("tooltipshow", this.G);
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:3:0x0009, B:5:0x0052, B:7:0x009e, B:14:0x00b0, B:16:0x00f9, B:18:0x0112, B:20:0x011a, B:21:0x0126, B:24:0x0156, B:25:0x015a, B:15:0x00d7, B:26:0x0163, B:27:0x0168), top: B:31:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:3:0x0009, B:5:0x0052, B:7:0x009e, B:14:0x00b0, B:16:0x00f9, B:18:0x0112, B:20:0x011a, B:21:0x0126, B:24:0x0156, B:25:0x015a, B:15:0x00d7, B:26:0x0163, B:27:0x0168), top: B:31:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0156 A[Catch: Exception -> 0x0169, TRY_ENTER, TryCatch #0 {Exception -> 0x0169, blocks: (B:3:0x0009, B:5:0x0052, B:7:0x009e, B:14:0x00b0, B:16:0x00f9, B:18:0x0112, B:20:0x011a, B:21:0x0126, B:24:0x0156, B:25:0x015a, B:15:0x00d7, B:26:0x0163, B:27:0x0168), top: B:31:0x0009 }] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        Bundle extras;
        Intent intent;
        super.onCreate(bundle);
        setContentView(R.layout.activity_v2_goals);
        try {
            getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
            this.f11174w = courseById;
            boolean booleanExtra = getIntent().getBooleanExtra("tutorial", false);
            this.G = booleanExtra;
            this.I = booleanExtra;
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.H = progressDialog;
            progressDialog.setMessage("Loading...");
            ProgressDialog progressDialog2 = this.H;
            String str = null;
            if (progressDialog2 != null) {
                progressDialog2.setCancelable(false);
                this.J = (o1) new o0(this, new ok.c(new dm.c())).a(o1.class);
                Date time = Calendar.getInstance().getTime();
                kotlin.jvm.internal.i.f(time, "getInstance().time");
                r0(time);
                ((ImageView) n0(R.id.header_arrow_back)).setOnClickListener(new u(this, 0));
                String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
                if (currentCourse != null && currentCourse.length() != 0) {
                    z10 = false;
                    if (z10) {
                        Date time2 = Utils.INSTANCE.getTodayCalendar().getTime();
                        kotlin.jvm.internal.i.f(time2, "Utils.todayCalendar.time");
                        u0(time2);
                        q0();
                        s0();
                        ((RobertoTextView) n0(R.id.ivMenu)).setOnClickListener(new u(this, 1));
                    } else {
                        ((RobertoTextView) n0(R.id.tvEmptyState)).setText("Goals will be added as you go through your day-wise plan.");
                        ((RobertoButton) n0(R.id.addGoalsButtonMain)).setVisibility(8);
                        ((RobertoTextView) n0(R.id.ivMenu)).setVisibility(8);
                    }
                    ((RobertoButton) n0(R.id.addGoalsButtonMain)).setOnClickListener(new u(this, 2));
                    extras = getIntent().getExtras();
                    if (extras != null && extras.getBoolean("add_goal", false)) {
                        startActivityForResult(new Intent(this, AddGoalsActivity.class), this.f11177z);
                    }
                    Glide.c(this).d(this).o(Integer.valueOf((int) R.drawable.ic_goals_null_state)).B((AppCompatImageView) n0(R.id.ivEmptyState));
                    String str2 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    intent = getIntent();
                    if (intent != null) {
                        str = intent.getStringExtra("source");
                    }
                    bundle2.putString("source", str);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle2, "v2_goals_page_open");
                    return;
                }
                z10 = true;
                if (z10) {
                }
                ((RobertoButton) n0(R.id.addGoalsButtonMain)).setOnClickListener(new u(this, 2));
                extras = getIntent().getExtras();
                if (extras != null) {
                    startActivityForResult(new Intent(this, AddGoalsActivity.class), this.f11177z);
                }
                Glide.c(this).d(this).o(Integer.valueOf((int) R.drawable.ic_goals_null_state)).B((AppCompatImageView) n0(R.id.ivEmptyState));
                String str22 = gk.a.f16573a;
                Bundle bundle22 = new Bundle();
                intent = getIntent();
                if (intent != null) {
                }
                bundle22.putString("source", str);
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle22, "v2_goals_page_open");
                return;
            }
            kotlin.jvm.internal.i.q("progressDialog");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11173v, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o1 o1Var = this.J;
        if (o1Var != null) {
            if (o1Var != null) {
                o1Var.f15483z.k(this);
                o1 o1Var2 = this.J;
                if (o1Var2 != null) {
                    o1Var2.D.k(this);
                    o1 o1Var3 = this.J;
                    if (o1Var3 != null) {
                        o1Var3.E.k(this);
                        o1 o1Var4 = this.J;
                        if (o1Var4 != null) {
                            o1Var4.F.k(this);
                            o1 o1Var5 = this.J;
                            if (o1Var5 != null) {
                                o1Var5.A.k(this);
                                o1 o1Var6 = this.J;
                                if (o1Var6 != null) {
                                    o1Var6.B.k(this);
                                    o1 o1Var7 = this.J;
                                    if (o1Var7 != null) {
                                        o1Var7.C.k(this);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("goalViewModel");
                                        throw null;
                                    }
                                }
                                kotlin.jvm.internal.i.q("goalViewModel");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("goalViewModel");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("goalViewModel");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("goalViewModel");
                    throw null;
                }
                kotlin.jvm.internal.i.q("goalViewModel");
                throw null;
            }
            kotlin.jvm.internal.i.q("goalViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        long j10 = this.F;
        Utils utils = Utils.INSTANCE;
        if (j10 != utils.getTodayTimeInSeconds()) {
            LogHelper.INSTANCE.i(this.f11173v, "day change updates");
            this.F = utils.getTodayTimeInSeconds();
            k kVar = this.f11175x;
            if (kVar != null) {
                kVar.v();
                kVar.i();
                ((RecyclerView) n0(R.id.rvGoalsListCalendar)).post(new t(this, 0));
                Date time = utils.getTodayCalendar().getTime();
                kotlin.jvm.internal.i.f(time, "Utils.todayCalendar.time");
                v0(time);
            } else {
                kotlin.jvm.internal.i.q("goalsCalendarAdapter");
                throw null;
            }
        }
        i iVar = this.O;
        if (iVar != null && iVar.D) {
            if (iVar != null) {
                i iVar2 = this.O;
                kotlin.jvm.internal.i.d(iVar2);
                iVar.D = !iVar2.D;
                i iVar3 = this.O;
                kotlin.jvm.internal.i.d(iVar3);
                iVar3.i();
            }
            ((RobertoTextView) n0(R.id.ivMenu)).setText("Edit Goals");
        }
        if (ApplicationPersistence.getInstance().getLongValue("goal_feedback_count", 0L) >= 10) {
            t0();
        }
        super.onResume();
    }

    public final void p0(boolean z10, boolean z11) {
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_fade_out_left);
        loadAnimation.setAnimationListener(new a(z10, this, z11, AnimationUtils.loadAnimation(this, R.anim.slide_fade_in_right), loadAnimation));
        ((CardView) n0(R.id.goalFeedbackLayout)).startAnimation(loadAnimation);
    }

    public final void q0() {
        try {
            w wVar = new w();
            Course course = this.f11174w;
            if (course != null) {
                wVar.f23468u = course.getStartDate().getTime();
                Iterator<Course> it = this.A.iterator();
                while (it.hasNext()) {
                    Course next = it.next();
                    if (wVar.f23468u > next.getStartDate().getTime()) {
                        wVar.f23468u = next.getStartDate().getTime();
                    }
                }
                ((RecyclerView) n0(R.id.rvGoalsListCalendar)).setLayoutManager(new LinearLayoutManager(this, 0, false));
                k kVar = new k(this, wVar.f23468u * 1000, new b());
                this.f11175x = kVar;
                ((RecyclerView) n0(R.id.rvGoalsListCalendar)).setAdapter(kVar);
                ((RecyclerView) n0(R.id.rvGoalsListCalendar)).post(new t(this, 0));
                ((RecyclerView) n0(R.id.rvGoalsListCalendar)).postDelayed(new ni.c(8, this, wVar, new v()), 2000L);
                return;
            }
            kotlin.jvm.internal.i.q("course");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11173v, "Exception", e10);
        }
    }

    public final void r0(Date date) {
        ((RobertoTextView) n0(R.id.tvCurrentMonth)).setText(LocalDateTime.ofEpochSecond(date.getTime() / 1000, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date.getTime()))).format(DateTimeFormatter.ofPattern("MMMM yyyy").withLocale(Locale.ENGLISH)));
    }

    public final void s0() {
        ArrayList<String> arrayList;
        Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
        int i6 = 0;
        while (true) {
            arrayList = this.K;
            if (i6 >= 7) {
                break;
            }
            CharSequence format = DateFormat.format("EEEE", todayCalendar.getTime());
            kotlin.jvm.internal.i.e(format, "null cannot be cast to non-null type kotlin.String");
            String substring = ((String) format).substring(0, 1);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            todayCalendar.add(5, -1);
            i6++;
        }
        r.W1(arrayList);
        o1 o1Var = this.J;
        if (o1Var != null) {
            Date displayDate = this.M;
            kotlin.jvm.internal.i.f(displayDate, "displayDate");
            o1Var.e(displayDate);
            Date date = this.M;
            kotlin.jvm.internal.i.f(date, "this.displayDate");
            this.O = new i(this, date, this, arrayList, this.L);
            ((RecyclerView) n0(R.id.goalRecyclerView)).setLayoutManager(new LinearLayoutManager(this, 1, false));
            ((RecyclerView) n0(R.id.goalRecyclerView)).setHasFixedSize(true);
            ((RecyclerView) n0(R.id.goalRecyclerView)).setItemAnimator(new androidx.recyclerview.widget.c());
            ((RecyclerView) n0(R.id.goalRecyclerView)).setAdapter(this.O);
            ((RecyclerView) n0(R.id.goalRecyclerView)).getViewTreeObserver().addOnGlobalLayoutListener(new x(this));
            o1 o1Var2 = this.J;
            if (o1Var2 != null) {
                o1Var2.f15483z.e(this, new androidx.lifecycle.x(this) { // from class: am.v

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ V2GoalsActivity f669b;

                    {
                        this.f669b = this;
                    }

                    @Override // androidx.lifecycle.x
                    public final void a(Object obj) {
                        int i10 = r2;
                        V2GoalsActivity this$0 = this.f669b;
                        switch (i10) {
                            case 0:
                                int i11 = V2GoalsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ArrayList<Object> arrayList2 = this$0.L;
                                arrayList2.clear();
                                arrayList2.addAll((ArrayList) obj);
                                this$0.o0();
                                bm.i iVar = this$0.O;
                                kotlin.jvm.internal.i.d(iVar);
                                iVar.i();
                                return;
                            case 1:
                                Integer it = (Integer) obj;
                                int i12 = V2GoalsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                bm.i iVar2 = this$0.O;
                                if (iVar2 != null) {
                                    kotlin.jvm.internal.i.f(it, "it");
                                    iVar2.v(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                    return;
                                }
                                return;
                            case 2:
                                Integer it2 = (Integer) obj;
                                int i13 = V2GoalsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                bm.i iVar3 = this$0.O;
                                if (iVar3 != null) {
                                    kotlin.jvm.internal.i.f(it2, "it");
                                    iVar3.v(it2.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                    return;
                                }
                                return;
                            case 3:
                                Integer it3 = (Integer) obj;
                                int i14 = V2GoalsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                bm.i iVar4 = this$0.O;
                                if (iVar4 != null) {
                                    kotlin.jvm.internal.i.f(it3, "it");
                                    iVar4.v(it3.intValue(), "activity_scheduling");
                                    return;
                                }
                                return;
                            case 4:
                                Integer it4 = (Integer) obj;
                                int i15 = V2GoalsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                bm.i iVar5 = this$0.O;
                                if (iVar5 != null) {
                                    kotlin.jvm.internal.i.f(it4, "it");
                                    iVar5.w(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                    return;
                                }
                                return;
                            case 5:
                                Integer it5 = (Integer) obj;
                                int i16 = V2GoalsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                bm.i iVar6 = this$0.O;
                                if (iVar6 != null) {
                                    kotlin.jvm.internal.i.f(it5, "it");
                                    iVar6.w(it5.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                    return;
                                }
                                return;
                            case 6:
                                Integer it6 = (Integer) obj;
                                int i17 = V2GoalsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                bm.i iVar7 = this$0.O;
                                if (iVar7 != null) {
                                    kotlin.jvm.internal.i.f(it6, "it");
                                    iVar7.w(it6.intValue(), "activity_scheduling");
                                    return;
                                }
                                return;
                            case 7:
                                Integer it7 = (Integer) obj;
                                int i18 = V2GoalsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (it7 == null || it7.intValue() != -1) {
                                    int i19 = this$0.B;
                                    if (it7 == null || it7.intValue() != i19) {
                                        kotlin.jvm.internal.i.f(it7, "it");
                                        this$0.B = it7.intValue();
                                        bm.i iVar8 = this$0.O;
                                        kotlin.jvm.internal.i.d(iVar8);
                                        iVar8.x(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 8:
                                Integer it8 = (Integer) obj;
                                int i20 = V2GoalsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (it8 == null || it8.intValue() != -1) {
                                    int i21 = this$0.C;
                                    if (it8 == null || it8.intValue() != i21) {
                                        kotlin.jvm.internal.i.f(it8, "it");
                                        this$0.C = it8.intValue();
                                        bm.i iVar9 = this$0.O;
                                        kotlin.jvm.internal.i.d(iVar9);
                                        iVar9.x(it8.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                Integer it9 = (Integer) obj;
                                int i22 = V2GoalsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (it9 == null || it9.intValue() != -1) {
                                    int i23 = this$0.D;
                                    if (it9 == null || i23 != it9.intValue()) {
                                        kotlin.jvm.internal.i.f(it9, "it");
                                        this$0.D = it9.intValue();
                                        bm.i iVar10 = this$0.O;
                                        kotlin.jvm.internal.i.d(iVar10);
                                        iVar10.x(it9.intValue(), "activity_scheduling");
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                o1 o1Var3 = this.J;
                if (o1Var3 != null) {
                    o1Var3.D.e(this, new androidx.lifecycle.x(this) { // from class: am.v

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ V2GoalsActivity f669b;

                        {
                            this.f669b = this;
                        }

                        @Override // androidx.lifecycle.x
                        public final void a(Object obj) {
                            int i10 = r2;
                            V2GoalsActivity this$0 = this.f669b;
                            switch (i10) {
                                case 0:
                                    int i11 = V2GoalsActivity.Q;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    ArrayList<Object> arrayList2 = this$0.L;
                                    arrayList2.clear();
                                    arrayList2.addAll((ArrayList) obj);
                                    this$0.o0();
                                    bm.i iVar = this$0.O;
                                    kotlin.jvm.internal.i.d(iVar);
                                    iVar.i();
                                    return;
                                case 1:
                                    Integer it = (Integer) obj;
                                    int i12 = V2GoalsActivity.Q;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    bm.i iVar2 = this$0.O;
                                    if (iVar2 != null) {
                                        kotlin.jvm.internal.i.f(it, "it");
                                        iVar2.v(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                        return;
                                    }
                                    return;
                                case 2:
                                    Integer it2 = (Integer) obj;
                                    int i13 = V2GoalsActivity.Q;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    bm.i iVar3 = this$0.O;
                                    if (iVar3 != null) {
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        iVar3.v(it2.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                        return;
                                    }
                                    return;
                                case 3:
                                    Integer it3 = (Integer) obj;
                                    int i14 = V2GoalsActivity.Q;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    bm.i iVar4 = this$0.O;
                                    if (iVar4 != null) {
                                        kotlin.jvm.internal.i.f(it3, "it");
                                        iVar4.v(it3.intValue(), "activity_scheduling");
                                        return;
                                    }
                                    return;
                                case 4:
                                    Integer it4 = (Integer) obj;
                                    int i15 = V2GoalsActivity.Q;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    bm.i iVar5 = this$0.O;
                                    if (iVar5 != null) {
                                        kotlin.jvm.internal.i.f(it4, "it");
                                        iVar5.w(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                        return;
                                    }
                                    return;
                                case 5:
                                    Integer it5 = (Integer) obj;
                                    int i16 = V2GoalsActivity.Q;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    bm.i iVar6 = this$0.O;
                                    if (iVar6 != null) {
                                        kotlin.jvm.internal.i.f(it5, "it");
                                        iVar6.w(it5.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                        return;
                                    }
                                    return;
                                case 6:
                                    Integer it6 = (Integer) obj;
                                    int i17 = V2GoalsActivity.Q;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    bm.i iVar7 = this$0.O;
                                    if (iVar7 != null) {
                                        kotlin.jvm.internal.i.f(it6, "it");
                                        iVar7.w(it6.intValue(), "activity_scheduling");
                                        return;
                                    }
                                    return;
                                case 7:
                                    Integer it7 = (Integer) obj;
                                    int i18 = V2GoalsActivity.Q;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    if (it7 == null || it7.intValue() != -1) {
                                        int i19 = this$0.B;
                                        if (it7 == null || it7.intValue() != i19) {
                                            kotlin.jvm.internal.i.f(it7, "it");
                                            this$0.B = it7.intValue();
                                            bm.i iVar8 = this$0.O;
                                            kotlin.jvm.internal.i.d(iVar8);
                                            iVar8.x(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 8:
                                    Integer it8 = (Integer) obj;
                                    int i20 = V2GoalsActivity.Q;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    if (it8 == null || it8.intValue() != -1) {
                                        int i21 = this$0.C;
                                        if (it8 == null || it8.intValue() != i21) {
                                            kotlin.jvm.internal.i.f(it8, "it");
                                            this$0.C = it8.intValue();
                                            bm.i iVar9 = this$0.O;
                                            kotlin.jvm.internal.i.d(iVar9);
                                            iVar9.x(it8.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    Integer it9 = (Integer) obj;
                                    int i22 = V2GoalsActivity.Q;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    if (it9 == null || it9.intValue() != -1) {
                                        int i23 = this$0.D;
                                        if (it9 == null || i23 != it9.intValue()) {
                                            kotlin.jvm.internal.i.f(it9, "it");
                                            this$0.D = it9.intValue();
                                            bm.i iVar10 = this$0.O;
                                            kotlin.jvm.internal.i.d(iVar10);
                                            iVar10.x(it9.intValue(), "activity_scheduling");
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    o1 o1Var4 = this.J;
                    if (o1Var4 != null) {
                        o1Var4.E.e(this, new androidx.lifecycle.x(this) { // from class: am.v

                            /* renamed from: b  reason: collision with root package name */
                            public final /* synthetic */ V2GoalsActivity f669b;

                            {
                                this.f669b = this;
                            }

                            @Override // androidx.lifecycle.x
                            public final void a(Object obj) {
                                int i10 = r2;
                                V2GoalsActivity this$0 = this.f669b;
                                switch (i10) {
                                    case 0:
                                        int i11 = V2GoalsActivity.Q;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        ArrayList<Object> arrayList2 = this$0.L;
                                        arrayList2.clear();
                                        arrayList2.addAll((ArrayList) obj);
                                        this$0.o0();
                                        bm.i iVar = this$0.O;
                                        kotlin.jvm.internal.i.d(iVar);
                                        iVar.i();
                                        return;
                                    case 1:
                                        Integer it = (Integer) obj;
                                        int i12 = V2GoalsActivity.Q;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.i iVar2 = this$0.O;
                                        if (iVar2 != null) {
                                            kotlin.jvm.internal.i.f(it, "it");
                                            iVar2.v(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        Integer it2 = (Integer) obj;
                                        int i13 = V2GoalsActivity.Q;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.i iVar3 = this$0.O;
                                        if (iVar3 != null) {
                                            kotlin.jvm.internal.i.f(it2, "it");
                                            iVar3.v(it2.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        Integer it3 = (Integer) obj;
                                        int i14 = V2GoalsActivity.Q;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.i iVar4 = this$0.O;
                                        if (iVar4 != null) {
                                            kotlin.jvm.internal.i.f(it3, "it");
                                            iVar4.v(it3.intValue(), "activity_scheduling");
                                            return;
                                        }
                                        return;
                                    case 4:
                                        Integer it4 = (Integer) obj;
                                        int i15 = V2GoalsActivity.Q;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.i iVar5 = this$0.O;
                                        if (iVar5 != null) {
                                            kotlin.jvm.internal.i.f(it4, "it");
                                            iVar5.w(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        Integer it5 = (Integer) obj;
                                        int i16 = V2GoalsActivity.Q;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.i iVar6 = this$0.O;
                                        if (iVar6 != null) {
                                            kotlin.jvm.internal.i.f(it5, "it");
                                            iVar6.w(it5.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        Integer it6 = (Integer) obj;
                                        int i17 = V2GoalsActivity.Q;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.i iVar7 = this$0.O;
                                        if (iVar7 != null) {
                                            kotlin.jvm.internal.i.f(it6, "it");
                                            iVar7.w(it6.intValue(), "activity_scheduling");
                                            return;
                                        }
                                        return;
                                    case 7:
                                        Integer it7 = (Integer) obj;
                                        int i18 = V2GoalsActivity.Q;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (it7 == null || it7.intValue() != -1) {
                                            int i19 = this$0.B;
                                            if (it7 == null || it7.intValue() != i19) {
                                                kotlin.jvm.internal.i.f(it7, "it");
                                                this$0.B = it7.intValue();
                                                bm.i iVar8 = this$0.O;
                                                kotlin.jvm.internal.i.d(iVar8);
                                                iVar8.x(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 8:
                                        Integer it8 = (Integer) obj;
                                        int i20 = V2GoalsActivity.Q;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (it8 == null || it8.intValue() != -1) {
                                            int i21 = this$0.C;
                                            if (it8 == null || it8.intValue() != i21) {
                                                kotlin.jvm.internal.i.f(it8, "it");
                                                this$0.C = it8.intValue();
                                                bm.i iVar9 = this$0.O;
                                                kotlin.jvm.internal.i.d(iVar9);
                                                iVar9.x(it8.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        Integer it9 = (Integer) obj;
                                        int i22 = V2GoalsActivity.Q;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (it9 == null || it9.intValue() != -1) {
                                            int i23 = this$0.D;
                                            if (it9 == null || i23 != it9.intValue()) {
                                                kotlin.jvm.internal.i.f(it9, "it");
                                                this$0.D = it9.intValue();
                                                bm.i iVar10 = this$0.O;
                                                kotlin.jvm.internal.i.d(iVar10);
                                                iVar10.x(it9.intValue(), "activity_scheduling");
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        o1 o1Var5 = this.J;
                        if (o1Var5 != null) {
                            o1Var5.F.e(this, new androidx.lifecycle.x(this) { // from class: am.v

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ V2GoalsActivity f669b;

                                {
                                    this.f669b = this;
                                }

                                @Override // androidx.lifecycle.x
                                public final void a(Object obj) {
                                    int i10 = r2;
                                    V2GoalsActivity this$0 = this.f669b;
                                    switch (i10) {
                                        case 0:
                                            int i11 = V2GoalsActivity.Q;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            ArrayList<Object> arrayList2 = this$0.L;
                                            arrayList2.clear();
                                            arrayList2.addAll((ArrayList) obj);
                                            this$0.o0();
                                            bm.i iVar = this$0.O;
                                            kotlin.jvm.internal.i.d(iVar);
                                            iVar.i();
                                            return;
                                        case 1:
                                            Integer it = (Integer) obj;
                                            int i12 = V2GoalsActivity.Q;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.i iVar2 = this$0.O;
                                            if (iVar2 != null) {
                                                kotlin.jvm.internal.i.f(it, "it");
                                                iVar2.v(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            Integer it2 = (Integer) obj;
                                            int i13 = V2GoalsActivity.Q;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.i iVar3 = this$0.O;
                                            if (iVar3 != null) {
                                                kotlin.jvm.internal.i.f(it2, "it");
                                                iVar3.v(it2.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            Integer it3 = (Integer) obj;
                                            int i14 = V2GoalsActivity.Q;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.i iVar4 = this$0.O;
                                            if (iVar4 != null) {
                                                kotlin.jvm.internal.i.f(it3, "it");
                                                iVar4.v(it3.intValue(), "activity_scheduling");
                                                return;
                                            }
                                            return;
                                        case 4:
                                            Integer it4 = (Integer) obj;
                                            int i15 = V2GoalsActivity.Q;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.i iVar5 = this$0.O;
                                            if (iVar5 != null) {
                                                kotlin.jvm.internal.i.f(it4, "it");
                                                iVar5.w(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            Integer it5 = (Integer) obj;
                                            int i16 = V2GoalsActivity.Q;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.i iVar6 = this$0.O;
                                            if (iVar6 != null) {
                                                kotlin.jvm.internal.i.f(it5, "it");
                                                iVar6.w(it5.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            Integer it6 = (Integer) obj;
                                            int i17 = V2GoalsActivity.Q;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.i iVar7 = this$0.O;
                                            if (iVar7 != null) {
                                                kotlin.jvm.internal.i.f(it6, "it");
                                                iVar7.w(it6.intValue(), "activity_scheduling");
                                                return;
                                            }
                                            return;
                                        case 7:
                                            Integer it7 = (Integer) obj;
                                            int i18 = V2GoalsActivity.Q;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (it7 == null || it7.intValue() != -1) {
                                                int i19 = this$0.B;
                                                if (it7 == null || it7.intValue() != i19) {
                                                    kotlin.jvm.internal.i.f(it7, "it");
                                                    this$0.B = it7.intValue();
                                                    bm.i iVar8 = this$0.O;
                                                    kotlin.jvm.internal.i.d(iVar8);
                                                    iVar8.x(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        case 8:
                                            Integer it8 = (Integer) obj;
                                            int i20 = V2GoalsActivity.Q;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (it8 == null || it8.intValue() != -1) {
                                                int i21 = this$0.C;
                                                if (it8 == null || it8.intValue() != i21) {
                                                    kotlin.jvm.internal.i.f(it8, "it");
                                                    this$0.C = it8.intValue();
                                                    bm.i iVar9 = this$0.O;
                                                    kotlin.jvm.internal.i.d(iVar9);
                                                    iVar9.x(it8.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            Integer it9 = (Integer) obj;
                                            int i22 = V2GoalsActivity.Q;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (it9 == null || it9.intValue() != -1) {
                                                int i23 = this$0.D;
                                                if (it9 == null || i23 != it9.intValue()) {
                                                    kotlin.jvm.internal.i.f(it9, "it");
                                                    this$0.D = it9.intValue();
                                                    bm.i iVar10 = this$0.O;
                                                    kotlin.jvm.internal.i.d(iVar10);
                                                    iVar10.x(it9.intValue(), "activity_scheduling");
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            o1 o1Var6 = this.J;
                            if (o1Var6 != null) {
                                o1Var6.G.e(this, new androidx.lifecycle.x(this) { // from class: am.v

                                    /* renamed from: b  reason: collision with root package name */
                                    public final /* synthetic */ V2GoalsActivity f669b;

                                    {
                                        this.f669b = this;
                                    }

                                    @Override // androidx.lifecycle.x
                                    public final void a(Object obj) {
                                        int i10 = r2;
                                        V2GoalsActivity this$0 = this.f669b;
                                        switch (i10) {
                                            case 0:
                                                int i11 = V2GoalsActivity.Q;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                ArrayList<Object> arrayList2 = this$0.L;
                                                arrayList2.clear();
                                                arrayList2.addAll((ArrayList) obj);
                                                this$0.o0();
                                                bm.i iVar = this$0.O;
                                                kotlin.jvm.internal.i.d(iVar);
                                                iVar.i();
                                                return;
                                            case 1:
                                                Integer it = (Integer) obj;
                                                int i12 = V2GoalsActivity.Q;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.i iVar2 = this$0.O;
                                                if (iVar2 != null) {
                                                    kotlin.jvm.internal.i.f(it, "it");
                                                    iVar2.v(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                    return;
                                                }
                                                return;
                                            case 2:
                                                Integer it2 = (Integer) obj;
                                                int i13 = V2GoalsActivity.Q;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.i iVar3 = this$0.O;
                                                if (iVar3 != null) {
                                                    kotlin.jvm.internal.i.f(it2, "it");
                                                    iVar3.v(it2.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                    return;
                                                }
                                                return;
                                            case 3:
                                                Integer it3 = (Integer) obj;
                                                int i14 = V2GoalsActivity.Q;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.i iVar4 = this$0.O;
                                                if (iVar4 != null) {
                                                    kotlin.jvm.internal.i.f(it3, "it");
                                                    iVar4.v(it3.intValue(), "activity_scheduling");
                                                    return;
                                                }
                                                return;
                                            case 4:
                                                Integer it4 = (Integer) obj;
                                                int i15 = V2GoalsActivity.Q;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.i iVar5 = this$0.O;
                                                if (iVar5 != null) {
                                                    kotlin.jvm.internal.i.f(it4, "it");
                                                    iVar5.w(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                    return;
                                                }
                                                return;
                                            case 5:
                                                Integer it5 = (Integer) obj;
                                                int i16 = V2GoalsActivity.Q;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.i iVar6 = this$0.O;
                                                if (iVar6 != null) {
                                                    kotlin.jvm.internal.i.f(it5, "it");
                                                    iVar6.w(it5.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                    return;
                                                }
                                                return;
                                            case 6:
                                                Integer it6 = (Integer) obj;
                                                int i17 = V2GoalsActivity.Q;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.i iVar7 = this$0.O;
                                                if (iVar7 != null) {
                                                    kotlin.jvm.internal.i.f(it6, "it");
                                                    iVar7.w(it6.intValue(), "activity_scheduling");
                                                    return;
                                                }
                                                return;
                                            case 7:
                                                Integer it7 = (Integer) obj;
                                                int i18 = V2GoalsActivity.Q;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (it7 == null || it7.intValue() != -1) {
                                                    int i19 = this$0.B;
                                                    if (it7 == null || it7.intValue() != i19) {
                                                        kotlin.jvm.internal.i.f(it7, "it");
                                                        this$0.B = it7.intValue();
                                                        bm.i iVar8 = this$0.O;
                                                        kotlin.jvm.internal.i.d(iVar8);
                                                        iVar8.x(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            case 8:
                                                Integer it8 = (Integer) obj;
                                                int i20 = V2GoalsActivity.Q;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (it8 == null || it8.intValue() != -1) {
                                                    int i21 = this$0.C;
                                                    if (it8 == null || it8.intValue() != i21) {
                                                        kotlin.jvm.internal.i.f(it8, "it");
                                                        this$0.C = it8.intValue();
                                                        bm.i iVar9 = this$0.O;
                                                        kotlin.jvm.internal.i.d(iVar9);
                                                        iVar9.x(it8.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                Integer it9 = (Integer) obj;
                                                int i22 = V2GoalsActivity.Q;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (it9 == null || it9.intValue() != -1) {
                                                    int i23 = this$0.D;
                                                    if (it9 == null || i23 != it9.intValue()) {
                                                        kotlin.jvm.internal.i.f(it9, "it");
                                                        this$0.D = it9.intValue();
                                                        bm.i iVar10 = this$0.O;
                                                        kotlin.jvm.internal.i.d(iVar10);
                                                        iVar10.x(it9.intValue(), "activity_scheduling");
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                o1 o1Var7 = this.J;
                                if (o1Var7 != null) {
                                    o1Var7.H.e(this, new androidx.lifecycle.x(this) { // from class: am.v

                                        /* renamed from: b  reason: collision with root package name */
                                        public final /* synthetic */ V2GoalsActivity f669b;

                                        {
                                            this.f669b = this;
                                        }

                                        @Override // androidx.lifecycle.x
                                        public final void a(Object obj) {
                                            int i10 = r2;
                                            V2GoalsActivity this$0 = this.f669b;
                                            switch (i10) {
                                                case 0:
                                                    int i11 = V2GoalsActivity.Q;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    ArrayList<Object> arrayList2 = this$0.L;
                                                    arrayList2.clear();
                                                    arrayList2.addAll((ArrayList) obj);
                                                    this$0.o0();
                                                    bm.i iVar = this$0.O;
                                                    kotlin.jvm.internal.i.d(iVar);
                                                    iVar.i();
                                                    return;
                                                case 1:
                                                    Integer it = (Integer) obj;
                                                    int i12 = V2GoalsActivity.Q;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.i iVar2 = this$0.O;
                                                    if (iVar2 != null) {
                                                        kotlin.jvm.internal.i.f(it, "it");
                                                        iVar2.v(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                        return;
                                                    }
                                                    return;
                                                case 2:
                                                    Integer it2 = (Integer) obj;
                                                    int i13 = V2GoalsActivity.Q;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.i iVar3 = this$0.O;
                                                    if (iVar3 != null) {
                                                        kotlin.jvm.internal.i.f(it2, "it");
                                                        iVar3.v(it2.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                        return;
                                                    }
                                                    return;
                                                case 3:
                                                    Integer it3 = (Integer) obj;
                                                    int i14 = V2GoalsActivity.Q;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.i iVar4 = this$0.O;
                                                    if (iVar4 != null) {
                                                        kotlin.jvm.internal.i.f(it3, "it");
                                                        iVar4.v(it3.intValue(), "activity_scheduling");
                                                        return;
                                                    }
                                                    return;
                                                case 4:
                                                    Integer it4 = (Integer) obj;
                                                    int i15 = V2GoalsActivity.Q;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.i iVar5 = this$0.O;
                                                    if (iVar5 != null) {
                                                        kotlin.jvm.internal.i.f(it4, "it");
                                                        iVar5.w(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                        return;
                                                    }
                                                    return;
                                                case 5:
                                                    Integer it5 = (Integer) obj;
                                                    int i16 = V2GoalsActivity.Q;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.i iVar6 = this$0.O;
                                                    if (iVar6 != null) {
                                                        kotlin.jvm.internal.i.f(it5, "it");
                                                        iVar6.w(it5.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                        return;
                                                    }
                                                    return;
                                                case 6:
                                                    Integer it6 = (Integer) obj;
                                                    int i17 = V2GoalsActivity.Q;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.i iVar7 = this$0.O;
                                                    if (iVar7 != null) {
                                                        kotlin.jvm.internal.i.f(it6, "it");
                                                        iVar7.w(it6.intValue(), "activity_scheduling");
                                                        return;
                                                    }
                                                    return;
                                                case 7:
                                                    Integer it7 = (Integer) obj;
                                                    int i18 = V2GoalsActivity.Q;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    if (it7 == null || it7.intValue() != -1) {
                                                        int i19 = this$0.B;
                                                        if (it7 == null || it7.intValue() != i19) {
                                                            kotlin.jvm.internal.i.f(it7, "it");
                                                            this$0.B = it7.intValue();
                                                            bm.i iVar8 = this$0.O;
                                                            kotlin.jvm.internal.i.d(iVar8);
                                                            iVar8.x(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                case 8:
                                                    Integer it8 = (Integer) obj;
                                                    int i20 = V2GoalsActivity.Q;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    if (it8 == null || it8.intValue() != -1) {
                                                        int i21 = this$0.C;
                                                        if (it8 == null || it8.intValue() != i21) {
                                                            kotlin.jvm.internal.i.f(it8, "it");
                                                            this$0.C = it8.intValue();
                                                            bm.i iVar9 = this$0.O;
                                                            kotlin.jvm.internal.i.d(iVar9);
                                                            iVar9.x(it8.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    Integer it9 = (Integer) obj;
                                                    int i22 = V2GoalsActivity.Q;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    if (it9 == null || it9.intValue() != -1) {
                                                        int i23 = this$0.D;
                                                        if (it9 == null || i23 != it9.intValue()) {
                                                            kotlin.jvm.internal.i.f(it9, "it");
                                                            this$0.D = it9.intValue();
                                                            bm.i iVar10 = this$0.O;
                                                            kotlin.jvm.internal.i.d(iVar10);
                                                            iVar10.x(it9.intValue(), "activity_scheduling");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    o1 o1Var8 = this.J;
                                    if (o1Var8 != null) {
                                        o1Var8.I.e(this, new androidx.lifecycle.x(this) { // from class: am.v

                                            /* renamed from: b  reason: collision with root package name */
                                            public final /* synthetic */ V2GoalsActivity f669b;

                                            {
                                                this.f669b = this;
                                            }

                                            @Override // androidx.lifecycle.x
                                            public final void a(Object obj) {
                                                int i10 = r2;
                                                V2GoalsActivity this$0 = this.f669b;
                                                switch (i10) {
                                                    case 0:
                                                        int i11 = V2GoalsActivity.Q;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        ArrayList<Object> arrayList2 = this$0.L;
                                                        arrayList2.clear();
                                                        arrayList2.addAll((ArrayList) obj);
                                                        this$0.o0();
                                                        bm.i iVar = this$0.O;
                                                        kotlin.jvm.internal.i.d(iVar);
                                                        iVar.i();
                                                        return;
                                                    case 1:
                                                        Integer it = (Integer) obj;
                                                        int i12 = V2GoalsActivity.Q;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.i iVar2 = this$0.O;
                                                        if (iVar2 != null) {
                                                            kotlin.jvm.internal.i.f(it, "it");
                                                            iVar2.v(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                            return;
                                                        }
                                                        return;
                                                    case 2:
                                                        Integer it2 = (Integer) obj;
                                                        int i13 = V2GoalsActivity.Q;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.i iVar3 = this$0.O;
                                                        if (iVar3 != null) {
                                                            kotlin.jvm.internal.i.f(it2, "it");
                                                            iVar3.v(it2.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                            return;
                                                        }
                                                        return;
                                                    case 3:
                                                        Integer it3 = (Integer) obj;
                                                        int i14 = V2GoalsActivity.Q;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.i iVar4 = this$0.O;
                                                        if (iVar4 != null) {
                                                            kotlin.jvm.internal.i.f(it3, "it");
                                                            iVar4.v(it3.intValue(), "activity_scheduling");
                                                            return;
                                                        }
                                                        return;
                                                    case 4:
                                                        Integer it4 = (Integer) obj;
                                                        int i15 = V2GoalsActivity.Q;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.i iVar5 = this$0.O;
                                                        if (iVar5 != null) {
                                                            kotlin.jvm.internal.i.f(it4, "it");
                                                            iVar5.w(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                            return;
                                                        }
                                                        return;
                                                    case 5:
                                                        Integer it5 = (Integer) obj;
                                                        int i16 = V2GoalsActivity.Q;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.i iVar6 = this$0.O;
                                                        if (iVar6 != null) {
                                                            kotlin.jvm.internal.i.f(it5, "it");
                                                            iVar6.w(it5.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                            return;
                                                        }
                                                        return;
                                                    case 6:
                                                        Integer it6 = (Integer) obj;
                                                        int i17 = V2GoalsActivity.Q;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.i iVar7 = this$0.O;
                                                        if (iVar7 != null) {
                                                            kotlin.jvm.internal.i.f(it6, "it");
                                                            iVar7.w(it6.intValue(), "activity_scheduling");
                                                            return;
                                                        }
                                                        return;
                                                    case 7:
                                                        Integer it7 = (Integer) obj;
                                                        int i18 = V2GoalsActivity.Q;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (it7 == null || it7.intValue() != -1) {
                                                            int i19 = this$0.B;
                                                            if (it7 == null || it7.intValue() != i19) {
                                                                kotlin.jvm.internal.i.f(it7, "it");
                                                                this$0.B = it7.intValue();
                                                                bm.i iVar8 = this$0.O;
                                                                kotlin.jvm.internal.i.d(iVar8);
                                                                iVar8.x(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    case 8:
                                                        Integer it8 = (Integer) obj;
                                                        int i20 = V2GoalsActivity.Q;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (it8 == null || it8.intValue() != -1) {
                                                            int i21 = this$0.C;
                                                            if (it8 == null || it8.intValue() != i21) {
                                                                kotlin.jvm.internal.i.f(it8, "it");
                                                                this$0.C = it8.intValue();
                                                                bm.i iVar9 = this$0.O;
                                                                kotlin.jvm.internal.i.d(iVar9);
                                                                iVar9.x(it8.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        Integer it9 = (Integer) obj;
                                                        int i22 = V2GoalsActivity.Q;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (it9 == null || it9.intValue() != -1) {
                                                            int i23 = this$0.D;
                                                            if (it9 == null || i23 != it9.intValue()) {
                                                                kotlin.jvm.internal.i.f(it9, "it");
                                                                this$0.D = it9.intValue();
                                                                bm.i iVar10 = this$0.O;
                                                                kotlin.jvm.internal.i.d(iVar10);
                                                                iVar10.x(it9.intValue(), "activity_scheduling");
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        o1 o1Var9 = this.J;
                                        if (o1Var9 != null) {
                                            o1Var9.A.e(this, new androidx.lifecycle.x(this) { // from class: am.v

                                                /* renamed from: b  reason: collision with root package name */
                                                public final /* synthetic */ V2GoalsActivity f669b;

                                                {
                                                    this.f669b = this;
                                                }

                                                @Override // androidx.lifecycle.x
                                                public final void a(Object obj) {
                                                    int i10 = r2;
                                                    V2GoalsActivity this$0 = this.f669b;
                                                    switch (i10) {
                                                        case 0:
                                                            int i11 = V2GoalsActivity.Q;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            ArrayList<Object> arrayList2 = this$0.L;
                                                            arrayList2.clear();
                                                            arrayList2.addAll((ArrayList) obj);
                                                            this$0.o0();
                                                            bm.i iVar = this$0.O;
                                                            kotlin.jvm.internal.i.d(iVar);
                                                            iVar.i();
                                                            return;
                                                        case 1:
                                                            Integer it = (Integer) obj;
                                                            int i12 = V2GoalsActivity.Q;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.i iVar2 = this$0.O;
                                                            if (iVar2 != null) {
                                                                kotlin.jvm.internal.i.f(it, "it");
                                                                iVar2.v(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                return;
                                                            }
                                                            return;
                                                        case 2:
                                                            Integer it2 = (Integer) obj;
                                                            int i13 = V2GoalsActivity.Q;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.i iVar3 = this$0.O;
                                                            if (iVar3 != null) {
                                                                kotlin.jvm.internal.i.f(it2, "it");
                                                                iVar3.v(it2.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                                return;
                                                            }
                                                            return;
                                                        case 3:
                                                            Integer it3 = (Integer) obj;
                                                            int i14 = V2GoalsActivity.Q;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.i iVar4 = this$0.O;
                                                            if (iVar4 != null) {
                                                                kotlin.jvm.internal.i.f(it3, "it");
                                                                iVar4.v(it3.intValue(), "activity_scheduling");
                                                                return;
                                                            }
                                                            return;
                                                        case 4:
                                                            Integer it4 = (Integer) obj;
                                                            int i15 = V2GoalsActivity.Q;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.i iVar5 = this$0.O;
                                                            if (iVar5 != null) {
                                                                kotlin.jvm.internal.i.f(it4, "it");
                                                                iVar5.w(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                return;
                                                            }
                                                            return;
                                                        case 5:
                                                            Integer it5 = (Integer) obj;
                                                            int i16 = V2GoalsActivity.Q;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.i iVar6 = this$0.O;
                                                            if (iVar6 != null) {
                                                                kotlin.jvm.internal.i.f(it5, "it");
                                                                iVar6.w(it5.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                                return;
                                                            }
                                                            return;
                                                        case 6:
                                                            Integer it6 = (Integer) obj;
                                                            int i17 = V2GoalsActivity.Q;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.i iVar7 = this$0.O;
                                                            if (iVar7 != null) {
                                                                kotlin.jvm.internal.i.f(it6, "it");
                                                                iVar7.w(it6.intValue(), "activity_scheduling");
                                                                return;
                                                            }
                                                            return;
                                                        case 7:
                                                            Integer it7 = (Integer) obj;
                                                            int i18 = V2GoalsActivity.Q;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            if (it7 == null || it7.intValue() != -1) {
                                                                int i19 = this$0.B;
                                                                if (it7 == null || it7.intValue() != i19) {
                                                                    kotlin.jvm.internal.i.f(it7, "it");
                                                                    this$0.B = it7.intValue();
                                                                    bm.i iVar8 = this$0.O;
                                                                    kotlin.jvm.internal.i.d(iVar8);
                                                                    iVar8.x(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        case 8:
                                                            Integer it8 = (Integer) obj;
                                                            int i20 = V2GoalsActivity.Q;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            if (it8 == null || it8.intValue() != -1) {
                                                                int i21 = this$0.C;
                                                                if (it8 == null || it8.intValue() != i21) {
                                                                    kotlin.jvm.internal.i.f(it8, "it");
                                                                    this$0.C = it8.intValue();
                                                                    bm.i iVar9 = this$0.O;
                                                                    kotlin.jvm.internal.i.d(iVar9);
                                                                    iVar9.x(it8.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            Integer it9 = (Integer) obj;
                                                            int i22 = V2GoalsActivity.Q;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            if (it9 == null || it9.intValue() != -1) {
                                                                int i23 = this$0.D;
                                                                if (it9 == null || i23 != it9.intValue()) {
                                                                    kotlin.jvm.internal.i.f(it9, "it");
                                                                    this$0.D = it9.intValue();
                                                                    bm.i iVar10 = this$0.O;
                                                                    kotlin.jvm.internal.i.d(iVar10);
                                                                    iVar10.x(it9.intValue(), "activity_scheduling");
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            o1 o1Var10 = this.J;
                                            if (o1Var10 != null) {
                                                o1Var10.B.e(this, new androidx.lifecycle.x(this) { // from class: am.v

                                                    /* renamed from: b  reason: collision with root package name */
                                                    public final /* synthetic */ V2GoalsActivity f669b;

                                                    {
                                                        this.f669b = this;
                                                    }

                                                    @Override // androidx.lifecycle.x
                                                    public final void a(Object obj) {
                                                        int i10 = r2;
                                                        V2GoalsActivity this$0 = this.f669b;
                                                        switch (i10) {
                                                            case 0:
                                                                int i11 = V2GoalsActivity.Q;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                ArrayList<Object> arrayList2 = this$0.L;
                                                                arrayList2.clear();
                                                                arrayList2.addAll((ArrayList) obj);
                                                                this$0.o0();
                                                                bm.i iVar = this$0.O;
                                                                kotlin.jvm.internal.i.d(iVar);
                                                                iVar.i();
                                                                return;
                                                            case 1:
                                                                Integer it = (Integer) obj;
                                                                int i12 = V2GoalsActivity.Q;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.i iVar2 = this$0.O;
                                                                if (iVar2 != null) {
                                                                    kotlin.jvm.internal.i.f(it, "it");
                                                                    iVar2.v(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                    return;
                                                                }
                                                                return;
                                                            case 2:
                                                                Integer it2 = (Integer) obj;
                                                                int i13 = V2GoalsActivity.Q;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.i iVar3 = this$0.O;
                                                                if (iVar3 != null) {
                                                                    kotlin.jvm.internal.i.f(it2, "it");
                                                                    iVar3.v(it2.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                                    return;
                                                                }
                                                                return;
                                                            case 3:
                                                                Integer it3 = (Integer) obj;
                                                                int i14 = V2GoalsActivity.Q;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.i iVar4 = this$0.O;
                                                                if (iVar4 != null) {
                                                                    kotlin.jvm.internal.i.f(it3, "it");
                                                                    iVar4.v(it3.intValue(), "activity_scheduling");
                                                                    return;
                                                                }
                                                                return;
                                                            case 4:
                                                                Integer it4 = (Integer) obj;
                                                                int i15 = V2GoalsActivity.Q;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.i iVar5 = this$0.O;
                                                                if (iVar5 != null) {
                                                                    kotlin.jvm.internal.i.f(it4, "it");
                                                                    iVar5.w(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                    return;
                                                                }
                                                                return;
                                                            case 5:
                                                                Integer it5 = (Integer) obj;
                                                                int i16 = V2GoalsActivity.Q;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.i iVar6 = this$0.O;
                                                                if (iVar6 != null) {
                                                                    kotlin.jvm.internal.i.f(it5, "it");
                                                                    iVar6.w(it5.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                                    return;
                                                                }
                                                                return;
                                                            case 6:
                                                                Integer it6 = (Integer) obj;
                                                                int i17 = V2GoalsActivity.Q;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.i iVar7 = this$0.O;
                                                                if (iVar7 != null) {
                                                                    kotlin.jvm.internal.i.f(it6, "it");
                                                                    iVar7.w(it6.intValue(), "activity_scheduling");
                                                                    return;
                                                                }
                                                                return;
                                                            case 7:
                                                                Integer it7 = (Integer) obj;
                                                                int i18 = V2GoalsActivity.Q;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                if (it7 == null || it7.intValue() != -1) {
                                                                    int i19 = this$0.B;
                                                                    if (it7 == null || it7.intValue() != i19) {
                                                                        kotlin.jvm.internal.i.f(it7, "it");
                                                                        this$0.B = it7.intValue();
                                                                        bm.i iVar8 = this$0.O;
                                                                        kotlin.jvm.internal.i.d(iVar8);
                                                                        iVar8.x(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            case 8:
                                                                Integer it8 = (Integer) obj;
                                                                int i20 = V2GoalsActivity.Q;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                if (it8 == null || it8.intValue() != -1) {
                                                                    int i21 = this$0.C;
                                                                    if (it8 == null || it8.intValue() != i21) {
                                                                        kotlin.jvm.internal.i.f(it8, "it");
                                                                        this$0.C = it8.intValue();
                                                                        bm.i iVar9 = this$0.O;
                                                                        kotlin.jvm.internal.i.d(iVar9);
                                                                        iVar9.x(it8.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                Integer it9 = (Integer) obj;
                                                                int i22 = V2GoalsActivity.Q;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                if (it9 == null || it9.intValue() != -1) {
                                                                    int i23 = this$0.D;
                                                                    if (it9 == null || i23 != it9.intValue()) {
                                                                        kotlin.jvm.internal.i.f(it9, "it");
                                                                        this$0.D = it9.intValue();
                                                                        bm.i iVar10 = this$0.O;
                                                                        kotlin.jvm.internal.i.d(iVar10);
                                                                        iVar10.x(it9.intValue(), "activity_scheduling");
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                o1 o1Var11 = this.J;
                                                if (o1Var11 != null) {
                                                    o1Var11.C.e(this, new androidx.lifecycle.x(this) { // from class: am.v

                                                        /* renamed from: b  reason: collision with root package name */
                                                        public final /* synthetic */ V2GoalsActivity f669b;

                                                        {
                                                            this.f669b = this;
                                                        }

                                                        @Override // androidx.lifecycle.x
                                                        public final void a(Object obj) {
                                                            int i10 = r2;
                                                            V2GoalsActivity this$0 = this.f669b;
                                                            switch (i10) {
                                                                case 0:
                                                                    int i11 = V2GoalsActivity.Q;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    ArrayList<Object> arrayList2 = this$0.L;
                                                                    arrayList2.clear();
                                                                    arrayList2.addAll((ArrayList) obj);
                                                                    this$0.o0();
                                                                    bm.i iVar = this$0.O;
                                                                    kotlin.jvm.internal.i.d(iVar);
                                                                    iVar.i();
                                                                    return;
                                                                case 1:
                                                                    Integer it = (Integer) obj;
                                                                    int i12 = V2GoalsActivity.Q;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.i iVar2 = this$0.O;
                                                                    if (iVar2 != null) {
                                                                        kotlin.jvm.internal.i.f(it, "it");
                                                                        iVar2.v(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 2:
                                                                    Integer it2 = (Integer) obj;
                                                                    int i13 = V2GoalsActivity.Q;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.i iVar3 = this$0.O;
                                                                    if (iVar3 != null) {
                                                                        kotlin.jvm.internal.i.f(it2, "it");
                                                                        iVar3.v(it2.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 3:
                                                                    Integer it3 = (Integer) obj;
                                                                    int i14 = V2GoalsActivity.Q;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.i iVar4 = this$0.O;
                                                                    if (iVar4 != null) {
                                                                        kotlin.jvm.internal.i.f(it3, "it");
                                                                        iVar4.v(it3.intValue(), "activity_scheduling");
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 4:
                                                                    Integer it4 = (Integer) obj;
                                                                    int i15 = V2GoalsActivity.Q;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.i iVar5 = this$0.O;
                                                                    if (iVar5 != null) {
                                                                        kotlin.jvm.internal.i.f(it4, "it");
                                                                        iVar5.w(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 5:
                                                                    Integer it5 = (Integer) obj;
                                                                    int i16 = V2GoalsActivity.Q;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.i iVar6 = this$0.O;
                                                                    if (iVar6 != null) {
                                                                        kotlin.jvm.internal.i.f(it5, "it");
                                                                        iVar6.w(it5.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 6:
                                                                    Integer it6 = (Integer) obj;
                                                                    int i17 = V2GoalsActivity.Q;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.i iVar7 = this$0.O;
                                                                    if (iVar7 != null) {
                                                                        kotlin.jvm.internal.i.f(it6, "it");
                                                                        iVar7.w(it6.intValue(), "activity_scheduling");
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 7:
                                                                    Integer it7 = (Integer) obj;
                                                                    int i18 = V2GoalsActivity.Q;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    if (it7 == null || it7.intValue() != -1) {
                                                                        int i19 = this$0.B;
                                                                        if (it7 == null || it7.intValue() != i19) {
                                                                            kotlin.jvm.internal.i.f(it7, "it");
                                                                            this$0.B = it7.intValue();
                                                                            bm.i iVar8 = this$0.O;
                                                                            kotlin.jvm.internal.i.d(iVar8);
                                                                            iVar8.x(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 8:
                                                                    Integer it8 = (Integer) obj;
                                                                    int i20 = V2GoalsActivity.Q;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    if (it8 == null || it8.intValue() != -1) {
                                                                        int i21 = this$0.C;
                                                                        if (it8 == null || it8.intValue() != i21) {
                                                                            kotlin.jvm.internal.i.f(it8, "it");
                                                                            this$0.C = it8.intValue();
                                                                            bm.i iVar9 = this$0.O;
                                                                            kotlin.jvm.internal.i.d(iVar9);
                                                                            iVar9.x(it8.intValue(), Constants.GOAL_TYPE_THOUGHT);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                default:
                                                                    Integer it9 = (Integer) obj;
                                                                    int i22 = V2GoalsActivity.Q;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    if (it9 == null || it9.intValue() != -1) {
                                                                        int i23 = this$0.D;
                                                                        if (it9 == null || i23 != it9.intValue()) {
                                                                            kotlin.jvm.internal.i.f(it9, "it");
                                                                            this$0.D = it9.intValue();
                                                                            bm.i iVar10 = this$0.O;
                                                                            kotlin.jvm.internal.i.d(iVar10);
                                                                            iVar10.x(it9.intValue(), "activity_scheduling");
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.i.q("goalViewModel");
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.i.q("goalViewModel");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.i.q("goalViewModel");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("goalViewModel");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("goalViewModel");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("goalViewModel");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("goalViewModel");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("goalViewModel");
                    throw null;
                }
                kotlin.jvm.internal.i.q("goalViewModel");
                throw null;
            }
            kotlin.jvm.internal.i.q("goalViewModel");
            throw null;
        }
        kotlin.jvm.internal.i.q("goalViewModel");
        throw null;
    }

    public final void t0() {
        if (!ApplicationPersistence.getInstance().getBooleanValue("goal_feedback_shown", false)) {
            UtilsKt.fireAnalytics("goal_feedback_show", UtilsKt.getAnalyticsBundle());
            ((CardView) n0(R.id.goalFeedbackLayout)).setVisibility(0);
            ((AppCompatImageView) n0(R.id.ivEmptyState)).setVisibility(8);
            ((RobertoButton) n0(R.id.goalFeedbackYes)).setOnClickListener(new u(this, 3));
            ((RobertoButton) n0(R.id.goalFeedbackNo)).setOnClickListener(new u(this, 4));
        }
    }

    @Override // bm.i.b
    public final void u(Goal goal) {
        HashMap<Date, Integer> last7DayMap;
        int convert;
        int i6;
        Integer num;
        String type = goal.getType();
        if (type != null) {
            int hashCode = type.hashCode();
            HashMap<String, GoalType> hashMap = this.N;
            switch (hashCode) {
                case -1408757131:
                    if (!type.equals(Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                        return;
                    }
                    break;
                case -1340224999:
                    if (type.equals(Constants.GOAL_TYPE_THOUGHT)) {
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dashboard_thought_popup, this, R.style.Theme_Dialog);
                        if (hashMap.get(goal.getGoalId()) != null) {
                            View findViewById = styledDialog.findViewById(R.id.dialogHeader);
                            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            GoalType goalType = hashMap.get(goal.getGoalId());
                            kotlin.jvm.internal.i.d(goalType);
                            ((RobertoTextView) findViewById).setText(goalType.getText1());
                        } else {
                            View findViewById2 = styledDialog.findViewById(R.id.dialogHeader);
                            kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            ((RobertoTextView) findViewById2).setText(goal.getGoalName());
                        }
                        int i10 = 0;
                        for (Integer num2 : goal.getLast7DayMap().values()) {
                            if (num2 != null && num2.intValue() == 2) {
                                i10++;
                            }
                        }
                        View findViewById3 = styledDialog.findViewById(R.id.txt2);
                        kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                        ((RobertoTextView) findViewById3).setText(last7DayMap.size() + "");
                        View findViewById4 = styledDialog.findViewById(R.id.txt3);
                        kotlin.jvm.internal.i.e(findViewById4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                        ((RobertoTextView) findViewById4).setText(i10 + "");
                        styledDialog.show();
                        return;
                    }
                    return;
                case -1142639703:
                    if (!type.equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                        return;
                    }
                    break;
                case -961591945:
                    if (!type.equals("physical_activity")) {
                        return;
                    }
                    break;
                case -517891900:
                    if (type.equals("activity_scheduling")) {
                        Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dashboard_thought_popup, this, R.style.Theme_Dialog);
                        if (hashMap.get(goal.getGoalId()) != null) {
                            View findViewById5 = styledDialog2.findViewById(R.id.dialogHeader);
                            kotlin.jvm.internal.i.e(findViewById5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            GoalType goalType2 = hashMap.get(goal.getGoalId());
                            kotlin.jvm.internal.i.d(goalType2);
                            ((RobertoTextView) findViewById5).setText(goalType2.getDashboardTxt());
                        } else {
                            View findViewById6 = styledDialog2.findViewById(R.id.dialogHeader);
                            kotlin.jvm.internal.i.e(findViewById6, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            ((RobertoTextView) findViewById6).setText(goal.getGoalName());
                        }
                        HashMap<Date, Integer> last7DayMap2 = goal.getLast7DayMap();
                        int i11 = 0;
                        for (Integer num3 : last7DayMap2.values()) {
                            kotlin.jvm.internal.i.f(num3, "`in`");
                            i11 += num3.intValue();
                        }
                        if (last7DayMap2.size() > 0) {
                            i11 /= last7DayMap2.size();
                        }
                        if (i11 == -1) {
                            i11 = 0;
                        }
                        View findViewById7 = styledDialog2.findViewById(R.id.txt2);
                        kotlin.jvm.internal.i.e(findViewById7, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                        ((RobertoTextView) findViewById7).setText(String.valueOf(last7DayMap2.size()));
                        View findViewById8 = styledDialog2.findViewById(R.id.txt3);
                        kotlin.jvm.internal.i.e(findViewById8, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                        ((RobertoTextView) findViewById8).setText(String.valueOf(i11));
                        View findViewById9 = styledDialog2.findViewById(R.id.text2);
                        kotlin.jvm.internal.i.e(findViewById9, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                        ((RobertoTextView) findViewById9).setText("Days I completed the task");
                        View findViewById10 = styledDialog2.findViewById(R.id.text3);
                        kotlin.jvm.internal.i.e(findViewById10, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                        ((RobertoTextView) findViewById10).setText("Your Mood Score");
                        styledDialog2.show();
                        return;
                    }
                    return;
                case 99033460:
                    if (!type.equals(Constants.GOAL_TYPE_HABIT)) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            bundle.putString(Constants.GOAL_ID, goal.getGoalId());
            bundle.putString(Constants.GOAL_NAME, goal.getGoalName());
            bundle.putString("type", goal.getType());
            gk.a.b(bundle, "goal_track_click");
            Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dashboard_habit_popup_v1, this, R.style.Theme_Dialog);
            Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
            HashMap<Date, Integer> last7DayMap3 = goal.getLast7DayMap();
            long timeInMillis = todayCalendar.getTimeInMillis() - goal.getmStartDate().getTime();
            TimeUnit timeUnit = TimeUnit.DAYS;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            if (timeUnit.convert(timeInMillis, timeUnit2) > 7) {
                convert = 7;
            } else {
                convert = (int) timeUnit.convert(timeInMillis, timeUnit2);
            }
            if (convert < 7) {
                convert++;
            }
            String str = "Followed " + last7DayMap3.size() + " out of " + convert + " days";
            todayCalendar.add(5, -6);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 7; i12 < i14; i14 = 7) {
                View findViewById11 = styledDialog3.findViewById(getResources().getIdentifier(defpackage.c.p("tday", i12), "id", getPackageName()));
                kotlin.jvm.internal.i.e(findViewById11, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                ((RobertoTextView) findViewById11).setText(this.K.get(i12));
                if (last7DayMap3.containsKey(todayCalendar.getTime()) && (num = last7DayMap3.get(todayCalendar.getTime())) != null && num.intValue() == 2) {
                    i13++;
                    View findViewById12 = styledDialog3.findViewById(getResources().getIdentifier(defpackage.c.p("iday", i12), "id", getPackageName()));
                    kotlin.jvm.internal.i.e(findViewById12, "null cannot be cast to non-null type android.widget.ImageView");
                    ((ImageView) findViewById12).setBackgroundResource(R.drawable.circle_tracker);
                }
                todayCalendar.add(5, 1);
                i12++;
            }
            View findViewById13 = styledDialog3.findViewById(R.id.ringProgressText);
            kotlin.jvm.internal.i.e(findViewById13, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            StringBuilder sb2 = new StringBuilder();
            sb2.append((i13 * 100) / convert);
            sb2.append('%');
            ((RobertoTextView) findViewById13).setText(sb2.toString());
            RobertoTextView robertoTextView = (RobertoTextView) styledDialog3.findViewById(R.id.dialogHeader);
            RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog3.findViewById(R.id.dialogDetail);
            ((RobertoButton) styledDialog3.findViewById(R.id.ll_submit)).setOnClickListener(new n(styledDialog3, 21));
            if (hashMap.get(goal.getGoalId()) != null) {
                GoalType goalType3 = hashMap.get(goal.getGoalId());
                kotlin.jvm.internal.i.d(goalType3);
                robertoTextView.setText(goalType3.getDashboardTxt());
            } else {
                robertoTextView.setText(goal.getGoalName());
            }
            robertoTextView2.setText(str);
            CircularProgressBar circularProgressBar = (CircularProgressBar) styledDialog3.findViewById(R.id.lv_ringp);
            circularProgressBar.setProgressMax(200.0f);
            circularProgressBar.c(i6 * 2, 700);
            styledDialog3.show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[Catch: Exception -> 0x0179, TRY_LEAVE, TryCatch #0 {Exception -> 0x0179, blocks: (B:3:0x0006, B:5:0x000c, B:31:0x0091, B:32:0x00a5, B:34:0x00ab, B:59:0x0133, B:61:0x013c, B:66:0x0146, B:68:0x014f, B:73:0x0159, B:75:0x0162, B:80:0x016c, B:58:0x012a, B:30:0x0088, B:81:0x0172, B:82:0x0178), top: B:86:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f A[Catch: Exception -> 0x0179, TryCatch #0 {Exception -> 0x0179, blocks: (B:3:0x0006, B:5:0x000c, B:31:0x0091, B:32:0x00a5, B:34:0x00ab, B:59:0x0133, B:61:0x013c, B:66:0x0146, B:68:0x014f, B:73:0x0159, B:75:0x0162, B:80:0x016c, B:58:0x012a, B:30:0x0088, B:81:0x0172, B:82:0x0178), top: B:86:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162 A[Catch: Exception -> 0x0179, TryCatch #0 {Exception -> 0x0179, blocks: (B:3:0x0006, B:5:0x000c, B:31:0x0091, B:32:0x00a5, B:34:0x00ab, B:59:0x0133, B:61:0x013c, B:66:0x0146, B:68:0x014f, B:73:0x0159, B:75:0x0162, B:80:0x016c, B:58:0x012a, B:30:0x0088, B:81:0x0172, B:82:0x0178), top: B:86:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(Date date) {
        CourseDayModel courseDayModel;
        Iterator<Course> it;
        CourseDayModel courseDayModel2;
        boolean z10;
        boolean z11;
        boolean z12;
        try {
            this.E = date;
            Course course = this.f11174w;
            if (course != null) {
                ArrayList<CourseDayModel> plan = course.getPlan();
                long j10 = 1000;
                long time = date.getTime() / j10;
                try {
                    int size = plan.size();
                    courseDayModel = null;
                    for (int i6 = 0; i6 < size; i6++) {
                        try {
                            if (plan.get(i6).getPosition() != 1 && (plan.get(i6).getStart_date() == 0 || plan.get(i6).getStart_date() > time)) {
                                if (i6 > 0 && plan.get(i6).getStart_date() == 0) {
                                    int i10 = i6 - 1;
                                    if (plan.get(i10).getStart_date() != 0) {
                                        if (plan.get(i10).getStart_date() >= time) {
                                        }
                                    }
                                }
                            }
                            courseDayModel = plan.get(i6);
                        } catch (Exception e10) {
                            e = e10;
                            LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e);
                            kotlin.jvm.internal.i.d(courseDayModel);
                            CourseDayModel courseDayModel3 = this.f11176y;
                            courseDayModel3.setShow_goals(false);
                            courseDayModel3.setShow_thoughts(false);
                            courseDayModel3.setShow_scheduling(false);
                            it = this.A.iterator();
                            while (it.hasNext()) {
                            }
                            return;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    courseDayModel = null;
                }
                kotlin.jvm.internal.i.d(courseDayModel);
                CourseDayModel courseDayModel32 = this.f11176y;
                courseDayModel32.setShow_goals(false);
                courseDayModel32.setShow_thoughts(false);
                courseDayModel32.setShow_scheduling(false);
                it = this.A.iterator();
                while (it.hasNext()) {
                    ArrayList<CourseDayModel> plan2 = it.next().getPlan();
                    long time2 = date.getTime() / j10;
                    try {
                        int size2 = plan2.size();
                        courseDayModel2 = null;
                        for (int i11 = 0; i11 < size2; i11++) {
                            try {
                                if (plan2.get(i11).getPosition() != 1 && (plan2.get(i11).getStart_date() == 0 || plan2.get(i11).getStart_date() > time2)) {
                                    if (i11 > 0 && plan2.get(i11).getStart_date() == 0) {
                                        int i12 = i11 - 1;
                                        if (plan2.get(i12).getStart_date() != 0) {
                                            if (plan2.get(i12).getStart_date() >= time2) {
                                            }
                                        }
                                    }
                                }
                                courseDayModel2 = plan2.get(i11);
                            } catch (Exception e12) {
                                e = e12;
                                LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e);
                                kotlin.jvm.internal.i.d(courseDayModel2);
                                if (!courseDayModel32.isShow_goals()) {
                                    z10 = false;
                                    courseDayModel32.setShow_goals(z10);
                                    if (!courseDayModel32.isShow_thoughts()) {
                                    }
                                    z11 = true;
                                    courseDayModel32.setShow_thoughts(z11);
                                    if (!courseDayModel32.isShow_scheduling()) {
                                    }
                                    z12 = true;
                                    courseDayModel32.setShow_scheduling(z12);
                                }
                                z10 = true;
                                courseDayModel32.setShow_goals(z10);
                                if (!courseDayModel32.isShow_thoughts()) {
                                }
                                z11 = true;
                                courseDayModel32.setShow_thoughts(z11);
                                if (!courseDayModel32.isShow_scheduling()) {
                                }
                                z12 = true;
                                courseDayModel32.setShow_scheduling(z12);
                            }
                        }
                    } catch (Exception e13) {
                        e = e13;
                        courseDayModel2 = null;
                    }
                    kotlin.jvm.internal.i.d(courseDayModel2);
                    if (!courseDayModel32.isShow_goals() && !courseDayModel2.isShow_goals()) {
                        z10 = false;
                        courseDayModel32.setShow_goals(z10);
                        if (!courseDayModel32.isShow_thoughts() && !courseDayModel2.isShow_thoughts()) {
                            z11 = false;
                            courseDayModel32.setShow_thoughts(z11);
                            if (!courseDayModel32.isShow_scheduling() && !courseDayModel2.isShow_scheduling()) {
                                z12 = false;
                                courseDayModel32.setShow_scheduling(z12);
                            }
                            z12 = true;
                            courseDayModel32.setShow_scheduling(z12);
                        }
                        z11 = true;
                        courseDayModel32.setShow_thoughts(z11);
                        if (!courseDayModel32.isShow_scheduling()) {
                            z12 = false;
                            courseDayModel32.setShow_scheduling(z12);
                        }
                        z12 = true;
                        courseDayModel32.setShow_scheduling(z12);
                    }
                    z10 = true;
                    courseDayModel32.setShow_goals(z10);
                    if (!courseDayModel32.isShow_thoughts()) {
                        z11 = false;
                        courseDayModel32.setShow_thoughts(z11);
                        if (!courseDayModel32.isShow_scheduling()) {
                        }
                        z12 = true;
                        courseDayModel32.setShow_scheduling(z12);
                    }
                    z11 = true;
                    courseDayModel32.setShow_thoughts(z11);
                    if (!courseDayModel32.isShow_scheduling()) {
                    }
                    z12 = true;
                    courseDayModel32.setShow_scheduling(z12);
                }
                return;
            }
            kotlin.jvm.internal.i.q("course");
            throw null;
        } catch (Exception e14) {
            LogHelper.INSTANCE.e(this.f11173v, "exception", e14);
        }
    }

    public final void v0(Date displayDate) {
        try {
            this.M = displayDate;
            i iVar = this.O;
            if (iVar != null) {
                kotlin.jvm.internal.i.f(displayDate, "displayDate");
                iVar.f4467y = displayDate;
                o1 o1Var = this.J;
                if (o1Var != null) {
                    Date displayDate2 = this.M;
                    kotlin.jvm.internal.i.f(displayDate2, "displayDate");
                    o1Var.e(displayDate2);
                    return;
                }
                kotlin.jvm.internal.i.q("goalViewModel");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11173v, "Exception", e10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.theinnerhour.b2b.model.GamificationModel] */
    @Override // bm.i.b
    public final void y(Goal goal, int i6) {
        boolean z10;
        boolean z11;
        ArrayList<GoalDateObj> trackList = goal.getTrackList();
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        Iterator<GoalDateObj> it = trackList.iterator();
        while (true) {
            z10 = false;
            if (it.hasNext()) {
                GoalDateObj next = it.next();
                if (next.getDate().getTime() * 1000 == this.M.getTime()) {
                    next.setVal(i6);
                    FirebasePersistence.getInstance().updateGoal(goal, Boolean.FALSE);
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        if (!z11) {
            long longValue = ApplicationPersistence.getInstance().getLongValue("goal_feedback_count", 0L) + 1;
            ApplicationPersistence.getInstance().setLongValue("goal_feedback_count", longValue);
            if (longValue >= 10) {
                t0();
            }
            Date date = this.M;
            kotlin.jvm.internal.i.f(date, "this.displayDate");
            trackList.add(new GoalDateObj(date, i6));
            xVar.f23469u = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
        }
        new Handler().postDelayed(new ni.c(9, this, goal, xVar), 750L);
        FirebasePersistence.getInstance().updateGoal(goal, Boolean.FALSE);
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
        gk.a.b(bundle, "goal_track_update");
        o1 o1Var = this.J;
        if (o1Var != null) {
            Date displayDate = this.M;
            kotlin.jvm.internal.i.f(displayDate, "displayDate");
            o1Var.e(displayDate);
            return;
        }
        kotlin.jvm.internal.i.q("goalViewModel");
        throw null;
    }
}
