package com.theinnerhour.b2b.activity;

import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class MultipleActivitiesActivity extends a {
    public Course A;

    /* renamed from: w  reason: collision with root package name */
    public y f10453w;

    /* renamed from: x  reason: collision with root package name */
    public int f10454x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10455y = 0;

    /* renamed from: z  reason: collision with root package name */
    public b f10456z;

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f10453w.H() > 0) {
            this.f10453w.W();
            return;
        }
        b F = this.f10456z.F();
        if (F == null) {
            int i6 = this.f10454x - 1;
            this.f10454x = i6;
            if (i6 < this.f10455y) {
                n0();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.f10456z = F;
        y yVar = this.f10453w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10456z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_coping);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        findViewById(R.id.progress_view).setVisibility(8);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10455y = i6;
            this.f10454x = i6;
        }
        this.f10453w = getSupportFragmentManager();
        this.A = FirebasePersistence.getInstance().getCourseById(c.n());
        u0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.f10456z = bVar;
        y yVar = this.f10453w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10456z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10454x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10453w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10454x;
        if (i6 != 0) {
            if (i6 != 1) {
                n0();
                return;
            }
            this.f10456z = new com.theinnerhour.b2b.fragment.coping.a();
            Bundle bundle = new Bundle();
            if (this.A.getCourseName().equals(Constants.COURSE_STRESS)) {
                bundle.putString("activity_id", Constants.ACTIVITY_ID_STRESS_GENTLE_MASSAGES);
            } else if (this.A.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                bundle.putString("activity_id", Constants.ACTIVITY_ID_DEPRESSION_GENTLE_MASSAGES);
            } else if (this.A.getCourseName().equals(Constants.COURSE_ANGER)) {
                bundle.putString("activity_id", Constants.ACTIVITY_ID_ANGER_GENTLE_MASSAGES);
            } else if (this.A.getCourseName().equals(Constants.COURSE_WORRY)) {
                bundle.putString("activity_id", Constants.ACTIVITY_ID_WORRY_GENTLE_MASSAGES);
            }
            bundle.putBoolean("proceed_on_schedule", true);
            this.f10456z.setArguments(bundle);
        } else {
            this.f10456z = new com.theinnerhour.b2b.fragment.coping.a();
            Bundle bundle2 = new Bundle();
            if (this.A.getCourseName().equals(Constants.COURSE_STRESS)) {
                bundle2.putString("activity_id", Constants.ACTIVITY_ID_STRESS_GUIDED_IMAGERY);
            } else if (this.A.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                bundle2.putString("activity_id", Constants.ACTIVITY_ID_DEPRESSION_GUIDED_IMAGERY);
            } else if (this.A.getCourseName().equals(Constants.COURSE_ANGER)) {
                bundle2.putString("activity_id", Constants.ACTIVITY_ID_ANGER_RUNNING);
            } else if (this.A.getCourseName().equals(Constants.COURSE_WORRY)) {
                bundle2.putString("activity_id", Constants.ACTIVITY_ID_WORRY_RUNNING);
            }
            bundle2.putBoolean("proceed_on_schedule", true);
            this.f10456z.setArguments(bundle2);
        }
        l2.f(R.id.root_frame_layout, this.f10456z, null);
        l2.j();
    }
}
