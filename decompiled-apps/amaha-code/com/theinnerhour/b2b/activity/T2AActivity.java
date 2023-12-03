package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import fq.e0;
import fq.i0;
import fq.n0;
import fq.o0;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import rr.b;
import yq.f;
/* compiled from: T2AActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/T2AActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class T2AActivity extends a {
    public b A;
    public String B;

    /* renamed from: w  reason: collision with root package name */
    public y f10521w;

    /* renamed from: x  reason: collision with root package name */
    public int f10522x;

    /* renamed from: y  reason: collision with root package name */
    public int f10523y;

    /* renamed from: z  reason: collision with root package name */
    public final String f10524z;

    public T2AActivity() {
        new LinkedHashMap();
        this.f10524z = "assesment_pos";
        new HashMap();
        this.B = "";
    }

    @Override // rr.a
    public final void n0() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (v0().H() > 0) {
            v0().W();
            return;
        }
        b F = u0().F();
        if (F == null) {
            int i6 = this.f10522x - 1;
            this.f10522x = i6;
            if (i6 < this.f10523y) {
                super.onBackPressed();
                return;
            } else {
                w0(true, true);
                return;
            }
        }
        this.A = F;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), null);
        k10.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_t2a);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt(this.f10524z, 0);
            this.f10523y = i6;
            this.f10522x = i6;
            String string = extras.getString(Constants.API_COURSE_LINK, "");
            i.f(string, "bundle.getString(Constants.API_COURSE_LINK,\"\")");
            this.B = string;
        }
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10521w = supportFragmentManager;
        if (FirebasePersistence.getInstance().getUser() == null) {
            finish();
        } else {
            w0(false, false);
        }
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.A = bVar;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), null);
        k10.j();
    }

    @Override // rr.a
    public final void s0(b bVar) {
        this.A = bVar;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), String.valueOf(Calendar.getInstance().getTimeInMillis()));
        u0().setArguments(getIntent().getExtras());
        k10.d(null);
        k10.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10522x++;
        w0(false, true);
    }

    public final b u0() {
        b bVar = this.A;
        if (bVar != null) {
            return bVar;
        }
        i.q("customFragment");
        throw null;
    }

    public final y v0() {
        y yVar = this.f10521w;
        if (yVar != null) {
            return yVar;
        }
        i.q("fragmentManager");
        throw null;
    }

    public final void w0(boolean z10, boolean z11) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(v0());
        if (z11) {
            if (z10) {
                aVar.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10522x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 != 5) {
                                n0();
                                return;
                            }
                            this.A = new n0();
                        } else {
                            this.A = new o0();
                        }
                    } else {
                        this.A = new e0();
                    }
                } else {
                    this.A = new f();
                }
            } else {
                this.A = new i0();
            }
        } else {
            this.A = new e0();
        }
        Bundle extras = getIntent().getExtras();
        i.d(extras);
        extras.putInt(Constants.DAYMODEL_POSITION, this.f10522x);
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        if (i.b(this.B, Constants.GROUNDING) && i.b(courseById.getCourseName(), Constants.COURSE_STRESS)) {
            extras.putString("mindfulness_model", Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_GROUNDING);
        } else if (i.b(this.B, Constants.SCREEN_T2A) && i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION)) {
            extras.putString("mindfulness_model", Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_FOCUSSED_MEDITATION);
        } else if (i.b(this.B, Constants.FOCUSSED_ATTENTION_MEDITATION) && i.b(courseById.getCourseName(), Constants.COURSE_WORRY)) {
            extras.putString("mindfulness_model", Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_FOCUSSED_ATTENTION_MEDITATION);
        } else if (i.b(this.B, Constants.GROUNDING_LOWER_BODY) && i.b(courseById.getCourseName(), Constants.COURSE_WORRY)) {
            extras.putString("mindfulness_model", Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_GROUNDING_LOWER_BODY);
        } else if (i.b(this.B, Constants.TOE_TENSING) && i.b(courseById.getCourseName(), Constants.COURSE_SLEEP)) {
            extras.putString("mindfulness_model", Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_TOE_TENSING);
        } else if (i.b(this.B, Constants.HUMMING) && i.b(courseById.getCourseName(), Constants.COURSE_SLEEP)) {
            extras.putString("mindfulness_model", Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_HUMMING);
        } else if (i.b(this.B, Constants.THREE_MINUTE_BREATHING_SPACE) && i.b(courseById.getCourseName(), Constants.COURSE_ANGER)) {
            extras.putString("mindfulness_model", Constants.DAILY_ACTIVITY_GOAL_ID_ANGER_THREE_MINUTE_BREATHING);
        } else if (i.b(this.B, Constants.SCREEN_T2A) && i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS)) {
            extras.putString("mindfulness_model", Constants.DAILY_ACTIVITY_GOAL_ID_HAPPINESS_ALTERNATE_BREATHING);
        }
        u0().setArguments(extras);
        aVar.f(R.id.root_frame_layout, u0(), null);
        aVar.j();
    }
}
