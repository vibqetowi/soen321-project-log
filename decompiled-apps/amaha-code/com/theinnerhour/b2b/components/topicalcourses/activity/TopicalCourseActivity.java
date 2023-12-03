package com.theinnerhour.b2b.components.topicalcourses.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.R;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import tp.e;
import tp.f;
/* compiled from: TopicalCourseActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/topicalcourses/activity/TopicalCourseActivity;", "Lrr/a;", "Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence$SubscriptionInitialiseListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TopicalCourseActivity extends rr.a implements SubscriptionPersistence.SubscriptionInitialiseListener {

    /* renamed from: z  reason: collision with root package name */
    public MiniCourse f11670z;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11667w = LogHelper.INSTANCE.makeLogTag(TopicalCourseActivity.class);

    /* renamed from: x  reason: collision with root package name */
    public final int f11668x = R.styleable.AppCompatTheme_windowFixedWidthMinor;

    /* renamed from: y  reason: collision with root package name */
    public int f11669y = -1;
    public String A = "";
    public final int B = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
    public String C = "";

    /* compiled from: TopicalCourseActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<hs.k> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            TopicalCourseActivity topicalCourseActivity;
            Iterator<MiniCourse> it = FirebasePersistence.getInstance().getUser().getTopicalCourseList().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                topicalCourseActivity = TopicalCourseActivity.this;
                if (!hasNext) {
                    break;
                }
                MiniCourse next = it.next();
                if (i.b(next.getDomain(), topicalCourseActivity.A)) {
                    topicalCourseActivity.f11670z = next;
                    break;
                }
            }
            if (((RecyclerView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.basicCourseRecyclerView)).getAdapter() != null) {
                RecyclerView.e adapter = ((RecyclerView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.basicCourseRecyclerView)).getAdapter();
                i.e(adapter, "null cannot be cast to non-null type com.theinnerhour.b2b.adapter.BasicCourseAdapter");
                h hVar = (h) adapter;
                MiniCourse miniCourse = topicalCourseActivity.f11670z;
                i.d(miniCourse);
                ArrayList<CourseDayModelV1> plan = miniCourse.getPlan();
                i.g(plan, "plan");
                hVar.f14149y = plan;
                hVar.i();
                RecyclerView.e adapter2 = ((RecyclerView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.basicCourseRecyclerView)).getAdapter();
                i.d(adapter2);
                adapter2.i();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TopicalCourseActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<hs.k> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            TopicalCourseActivity topicalCourseActivity = TopicalCourseActivity.this;
            ((AppCompatImageView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.header_arrow_back)).setOnClickListener(new tp.c(topicalCourseActivity, 0));
            String str = topicalCourseActivity.A;
            switch (str.hashCode()) {
                case -1552422584:
                    if (str.equals(Constants.TOPICAL_2022_TIME_MANAGEMENT)) {
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseTitle)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topical2022TimeManagementTitle));
                        ((AppCompatImageView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseIllustration)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_banner_2022_topical_time_management);
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalBottomShareText)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topical2022TimeManagementSubscriptionText));
                        break;
                    }
                    break;
                case -1190562844:
                    if (str.equals(Constants.TOPICAL_2022_HEALTH_ANXIETY)) {
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseTitle)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topicalHealthAnxietyTitle));
                        ((AppCompatImageView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseIllustration)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_banner_2022_topical_health_anxiety);
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalBottomShareText)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topicalHealthAnxietySubscriptionText));
                        break;
                    }
                    break;
                case 58855846:
                    if (str.equals(Constants.TOPICAL_2022_COVID)) {
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseTitle)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topical2022CovidTitle));
                        ((AppCompatImageView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseIllustration)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_banner_2022_topical_covid);
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalBottomShareText)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topical2022CovidSubscriptionText));
                        break;
                    }
                    break;
                case 378061269:
                    if (str.equals(Constants.TOPICAL_2022_MOTIVATION)) {
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseTitle)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topical2022MotivationTitle));
                        ((AppCompatImageView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseIllustration)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_banner_2023_topical_motivation);
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalBottomShareText)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topical2022MotivationSubscriptionText));
                        break;
                    }
                    break;
                case 416780353:
                    if (str.equals(Constants.TOPICAL_2022_NURTURING_RELATIONSHIP)) {
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseTitle)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topical2022NurturingRelationshipsTitle));
                        ((AppCompatImageView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseIllustration)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_banner_2022_topical_nurturing_relationship);
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalBottomShareText)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topical2022NurturingRelationshipsSubscriptionText));
                        break;
                    }
                    break;
                case 1196421508:
                    if (str.equals(Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY)) {
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseTitle)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topical2022ConflictEmpathyTitle));
                        ((AppCompatImageView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalCourseIllustration)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_banner_2022_topical_conflict_empathy);
                        ((RobertoTextView) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalBottomShareText)).setText(topicalCourseActivity.getString(com.theinnerhour.b2b.R.string.topical2022ConflictEmpathySubscriptionText));
                        break;
                    }
                    break;
            }
            f fVar = new f(topicalCourseActivity);
            String str2 = topicalCourseActivity.f11667w;
            UtilsKt.logError$default(str2, null, fVar, 2, null);
            UtilsKt.logError$default(str2, null, new e(topicalCourseActivity), 2, null);
            ((RobertoButton) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalBottomShareButton)).setOnClickListener(new tp.c(topicalCourseActivity, 1));
            if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                ((RobertoButton) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalSubscriptionButton)).setVisibility(0);
                ((RobertoButton) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalSubscriptionButton)).setOnClickListener(new tp.c(topicalCourseActivity, 2));
            } else {
                ((RobertoButton) topicalCourseActivity.u0(com.theinnerhour.b2b.R.id.topicalSubscriptionButton)).setVisibility(8);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TopicalCourseActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<hs.k> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            int i6;
            TopicalCourseActivity topicalCourseActivity = TopicalCourseActivity.this;
            if (topicalCourseActivity.getIntent().hasExtra("mccourse")) {
                String stringExtra = topicalCourseActivity.getIntent().getStringExtra("mccourse");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                topicalCourseActivity.A = stringExtra;
                Iterator<MiniCourse> it = FirebasePersistence.getInstance().getUser().getTopicalCourseList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MiniCourse next = it.next();
                    if (i.b(next.getDomain(), topicalCourseActivity.A)) {
                        topicalCourseActivity.f11670z = next;
                        break;
                    }
                }
                if (topicalCourseActivity.f11670z == null) {
                    topicalCourseActivity.finish();
                }
            } else {
                topicalCourseActivity.finish();
            }
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    Window window = topicalCourseActivity.getWindow();
                    String str = topicalCourseActivity.A;
                    switch (str.hashCode()) {
                        case -1552422584:
                            if (str.equals(Constants.TOPICAL_2022_TIME_MANAGEMENT)) {
                                i6 = com.theinnerhour.b2b.R.color.topicalCourseTimeManagement;
                                break;
                            } else {
                                i6 = com.theinnerhour.b2b.R.color.covidColorAccent;
                                break;
                            }
                        case -1190562844:
                            if (str.equals(Constants.TOPICAL_2022_HEALTH_ANXIETY)) {
                                i6 = com.theinnerhour.b2b.R.color.topicalCourseHealthAnxiety;
                                break;
                            } else {
                                i6 = com.theinnerhour.b2b.R.color.covidColorAccent;
                                break;
                            }
                        case 58855846:
                            if (str.equals(Constants.TOPICAL_2022_COVID)) {
                                i6 = com.theinnerhour.b2b.R.color.topicalCourseCovid;
                                break;
                            } else {
                                i6 = com.theinnerhour.b2b.R.color.covidColorAccent;
                                break;
                            }
                        case 378061269:
                            if (str.equals(Constants.TOPICAL_2022_MOTIVATION)) {
                                i6 = com.theinnerhour.b2b.R.color.topicalCourseMotivation;
                                break;
                            } else {
                                i6 = com.theinnerhour.b2b.R.color.covidColorAccent;
                                break;
                            }
                        case 416780353:
                            if (str.equals(Constants.TOPICAL_2022_NURTURING_RELATIONSHIP)) {
                                i6 = com.theinnerhour.b2b.R.color.topicalCourseNurturingRelationship;
                                break;
                            } else {
                                i6 = com.theinnerhour.b2b.R.color.covidColorAccent;
                                break;
                            }
                        case 1196421508:
                            if (str.equals(Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY)) {
                                i6 = com.theinnerhour.b2b.R.color.topicalCourseConflictResolution;
                                break;
                            } else {
                                i6 = com.theinnerhour.b2b.R.color.covidColorAccent;
                                break;
                            }
                        default:
                            i6 = com.theinnerhour.b2b.R.color.covidColorAccent;
                            break;
                    }
                    window.setStatusBarColor(g0.a.b(topicalCourseActivity, i6));
                    topicalCourseActivity.getWindow().getDecorView().setSystemUiVisibility(topicalCourseActivity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
                } else {
                    topicalCourseActivity.getWindow().setStatusBarColor(g0.a.b(topicalCourseActivity, com.theinnerhour.b2b.R.color.status_bar_grey));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(topicalCourseActivity.f11667w, "Error in setting custom status bar", e10);
            }
            topicalCourseActivity.init();
            return hs.k.f19476a;
        }
    }

    public final void init() {
        UtilsKt.logError$default(this.f11667w, null, new b(), 2, null);
    }

    @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
    public final void initialiseComplete(boolean z10) {
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
            ((RobertoButton) u0(com.theinnerhour.b2b.R.id.topicalSubscriptionButton)).setVisibility(0);
        } else {
            ((RobertoButton) u0(com.theinnerhour.b2b.R.id.topicalSubscriptionButton)).setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        CourseDayModelV1 courseDayModelV1;
        super.onActivityResult(i6, i10, intent);
        try {
            if (i6 == this.f11668x) {
                Bundle bundle = new Bundle();
                bundle.putString("topicalCourse", this.A);
                bundle.putString("course", rr.a.q0());
                bundle.putString("activity_id", this.C);
                bundle.putInt("activity_position", this.f11669y);
                if (((RecyclerView) u0(com.theinnerhour.b2b.R.id.basicCourseRecyclerView)).getAdapter() != null) {
                    RecyclerView.e adapter = ((RecyclerView) u0(com.theinnerhour.b2b.R.id.basicCourseRecyclerView)).getAdapter();
                    i.e(adapter, "null cannot be cast to non-null type com.theinnerhour.b2b.adapter.BasicCourseAdapter");
                    h hVar = (h) adapter;
                    MiniCourse miniCourse = this.f11670z;
                    i.d(miniCourse);
                    ArrayList<CourseDayModelV1> plan = miniCourse.getPlan();
                    i.g(plan, "plan");
                    hVar.f14149y = plan;
                    hVar.i();
                }
                if (i10 == -1) {
                    v0();
                    MiniCourse miniCourse2 = this.f11670z;
                    i.d(miniCourse2);
                    Iterator<CourseDayModelV1> it = miniCourse2.getPlan().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            courseDayModelV1 = it.next();
                            if (i.b(courseDayModelV1.getContent_id(), this.C)) {
                                break;
                            }
                        } else {
                            courseDayModelV1 = null;
                            break;
                        }
                    }
                    if (courseDayModelV1 != null) {
                        courseDayModelV1.isCompleted();
                        if (!courseDayModelV1.isCompleted()) {
                            MiniCourse miniCourse3 = this.f11670z;
                            i.d(miniCourse3);
                            Iterator<CourseDayModelV1> it2 = miniCourse3.getPlan().iterator();
                            while (it2.hasNext()) {
                                CourseDayModelV1 next = it2.next();
                                if (i.b(courseDayModelV1.getContent_id(), next.getContent_id())) {
                                    next.setCompleted(true);
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    v0();
                                }
                            }
                        }
                    }
                    gk.a.b(bundle, "topical_activity_finish");
                    return;
                }
                gk.a.b(bundle, "topical_activity_incomplete");
            } else if (i6 == this.B) {
                if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() || (i10 == -1 && intent != null && intent.getBooleanExtra("purchase_successful", false))) {
                    ((RobertoButton) u0(com.theinnerhour.b2b.R.id.topicalSubscriptionButton)).setVisibility(8);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11667w, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.theinnerhour.b2b.R.layout.activity_topical_course);
        UtilsKt.logError$default(this.f11667w, null, new c(), 2, null);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(this);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        v0();
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

    public final void v0() {
        UtilsKt.logError$default(this.f11667w, null, new a(), 2, null);
    }
}
