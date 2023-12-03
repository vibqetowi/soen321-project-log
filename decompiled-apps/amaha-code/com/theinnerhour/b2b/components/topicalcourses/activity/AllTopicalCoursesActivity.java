package com.theinnerhour.b2b.components.topicalcourses.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import bl.c;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalGoalsActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalLogsActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import tl.o;
import tr.r;
import up.b;
/* compiled from: AllTopicalCoursesActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/topicalcourses/activity/AllTopicalCoursesActivity;", "Lrr/a;", "Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence$SubscriptionInitialiseListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AllTopicalCoursesActivity extends a implements SubscriptionPersistence.SubscriptionInitialiseListener {
    public static final /* synthetic */ int E = 0;
    public boolean C;

    /* renamed from: x  reason: collision with root package name */
    public b f11664x;

    /* renamed from: y  reason: collision with root package name */
    public xp.b f11665y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList f11666z;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11663w = LogHelper.INSTANCE.makeLogTag(AllTopicalCoursesActivity.class);
    public final int A = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
    public final int B = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;

    @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
    public final void initialiseComplete(boolean z10) {
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
            ((ConstraintLayout) u0(R.id.bottomSheet)).setVisibility(0);
        } else {
            ((ConstraintLayout) u0(R.id.bottomSheet)).setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        if (i6 == this.A) {
            if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() || (i10 == -1 && intent != null && intent.getBooleanExtra("purchase_successful", false))) {
                ((ConstraintLayout) u0(R.id.bottomSheet)).setVisibility(8);
            }
        } else if (i6 == this.B) {
            xp.b bVar = this.f11665y;
            if (bVar != null) {
                if (bVar != null) {
                    bVar.f();
                } else {
                    i.q("topicalCourseViewModel");
                    throw null;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) u0(R.id.topicalCourseNestedScrollView);
            if (nestedScrollView != null) {
                nestedScrollView.post(new o(16, this));
            }
        }
        super.onActivityResult(i6, i10, intent);
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.activity_all_topical_courses);
        ((AppCompatImageView) u0(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener(this) { // from class: tp.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ AllTopicalCoursesActivity f33400v;

            {
                this.f33400v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                AllTopicalCoursesActivity this$0 = this.f33400v;
                switch (i6) {
                    case 0:
                        int i10 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i11 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("topical_goals_open", UtilsKt.getAnalyticsBundle());
                        if (this$0.C || ApplicationPersistence.getInstance().containsKey("topical_goals_access")) {
                            ApplicationPersistence.getInstance().setLongValue("topical_goals_access", Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                        }
                        this$0.startActivity(new Intent(this$0, TopicalGoalsActivity.class));
                        return;
                    case 2:
                        int i12 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("topical_logs_open", UtilsKt.getAnalyticsBundle());
                        this$0.startActivity(new Intent(this$0, TopicalLogsActivity.class));
                        return;
                    default:
                        int i13 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivityForResult(r.s(this$0, false).putExtra("source", "all_topical_course_activity"), this$0.A);
                        return;
                }
            }
        });
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
                getWindow().setStatusBarColor(g0.a.b(this, R.color.topicalNewYearYellow));
            } else {
                getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
            ((RecyclerView) u0(R.id.mcRecycler)).setFocusable(false);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11663w, "Error in setting custom status bar", e10);
        }
        ((AppCompatImageView) u0(R.id.goalButton)).setOnClickListener(new View.OnClickListener(this) { // from class: tp.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ AllTopicalCoursesActivity f33400v;

            {
                this.f33400v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                AllTopicalCoursesActivity this$0 = this.f33400v;
                switch (i6) {
                    case 0:
                        int i10 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i11 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("topical_goals_open", UtilsKt.getAnalyticsBundle());
                        if (this$0.C || ApplicationPersistence.getInstance().containsKey("topical_goals_access")) {
                            ApplicationPersistence.getInstance().setLongValue("topical_goals_access", Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                        }
                        this$0.startActivity(new Intent(this$0, TopicalGoalsActivity.class));
                        return;
                    case 2:
                        int i12 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("topical_logs_open", UtilsKt.getAnalyticsBundle());
                        this$0.startActivity(new Intent(this$0, TopicalLogsActivity.class));
                        return;
                    default:
                        int i13 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivityForResult(r.s(this$0, false).putExtra("source", "all_topical_course_activity"), this$0.A);
                        return;
                }
            }
        });
        ((AppCompatImageView) u0(R.id.logButton)).setOnClickListener(new View.OnClickListener(this) { // from class: tp.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ AllTopicalCoursesActivity f33400v;

            {
                this.f33400v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                AllTopicalCoursesActivity this$0 = this.f33400v;
                switch (i6) {
                    case 0:
                        int i10 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i11 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("topical_goals_open", UtilsKt.getAnalyticsBundle());
                        if (this$0.C || ApplicationPersistence.getInstance().containsKey("topical_goals_access")) {
                            ApplicationPersistence.getInstance().setLongValue("topical_goals_access", Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                        }
                        this$0.startActivity(new Intent(this$0, TopicalGoalsActivity.class));
                        return;
                    case 2:
                        int i12 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("topical_logs_open", UtilsKt.getAnalyticsBundle());
                        this$0.startActivity(new Intent(this$0, TopicalLogsActivity.class));
                        return;
                    default:
                        int i13 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivityForResult(r.s(this$0, false).putExtra("source", "all_topical_course_activity"), this$0.A);
                        return;
                }
            }
        });
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
            ((ConstraintLayout) u0(R.id.bottomSheet)).setVisibility(0);
        } else {
            ((ConstraintLayout) u0(R.id.bottomSheet)).setVisibility(8);
        }
        ((RobertoButton) u0(R.id.unlockEverythingButton)).setOnClickListener(new View.OnClickListener(this) { // from class: tp.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ AllTopicalCoursesActivity f33400v;

            {
                this.f33400v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                AllTopicalCoursesActivity this$0 = this.f33400v;
                switch (i6) {
                    case 0:
                        int i10 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i11 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("topical_goals_open", UtilsKt.getAnalyticsBundle());
                        if (this$0.C || ApplicationPersistence.getInstance().containsKey("topical_goals_access")) {
                            ApplicationPersistence.getInstance().setLongValue("topical_goals_access", Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                        }
                        this$0.startActivity(new Intent(this$0, TopicalGoalsActivity.class));
                        return;
                    case 2:
                        int i12 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("topical_logs_open", UtilsKt.getAnalyticsBundle());
                        this$0.startActivity(new Intent(this$0, TopicalLogsActivity.class));
                        return;
                    default:
                        int i13 = AllTopicalCoursesActivity.E;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivityForResult(r.s(this$0, false).putExtra("source", "all_topical_course_activity"), this$0.A);
                        return;
                }
            }
        });
        ArrayList<MiniCourse> topicalCourseList = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
        if (topicalCourseList != null && topicalCourseList.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((ShimmerFrameLayout) u0(R.id.loadingShimmer)).setVisibility(0);
            ((ShimmerFrameLayout) u0(R.id.loadingShimmer)).b();
        }
        xp.b bVar = (xp.b) new o0(this).a(xp.b.class);
        this.f11665y = bVar;
        if (bVar != null) {
            bVar.f37884y.e(this, new c(4, this));
            xp.b bVar2 = this.f11665y;
            if (bVar2 != null) {
                bVar2.f();
                if (ApplicationPersistence.getInstance().containsKey("2022_topical_fetch_end") && ApplicationPersistence.getInstance().containsKey("2022_topical_plan_end") && ApplicationPersistence.getInstance().getLongValue("2022_topical_fetch_end") < Calendar.getInstance().getTimeInMillis()) {
                    int longValue = (int) ((ApplicationPersistence.getInstance().getLongValue("2022_topical_plan_end") - Calendar.getInstance().getTimeInMillis()) / 86400000);
                    RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.expiryPrompt);
                    if (longValue > 0) {
                        string = getString(R.string.allTopicalCoursesPostExpiryPrompt, String.valueOf(longValue));
                    } else {
                        string = getString(R.string.allTopicalCoursesPostExpiryTodayPrompt);
                    }
                    robertoTextView.setText(string);
                }
                if (getIntent().hasExtra("isGoalScreen")) {
                    ((AppCompatImageView) u0(R.id.goalButton)).performClick();
                    return;
                }
                return;
            }
            i.q("topicalCourseViewModel");
            throw null;
        }
        i.q("topicalCourseViewModel");
        throw null;
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(this);
        xp.b bVar = this.f11665y;
        if (bVar != null) {
            if (bVar != null) {
                bVar.f37884y.k(this);
            } else {
                i.q("topicalCourseViewModel");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        this.C = false;
        Iterator<Goal> it = FirebasePersistence.getInstance().getUser().getTopicalGoals().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().isVisible()) {
                this.C = true;
                break;
            }
        }
        if (ApplicationPersistence.getInstance().getLongValue("topical_goals_access", -1L) != Utils.INSTANCE.getTodayCalendar().getTimeInMillis() && this.C) {
            ((AppCompatImageView) u0(R.id.goalsNotif)).setVisibility(0);
        } else {
            ((AppCompatImageView) u0(R.id.goalsNotif)).setVisibility(8);
        }
        super.onResume();
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.D;
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
}
