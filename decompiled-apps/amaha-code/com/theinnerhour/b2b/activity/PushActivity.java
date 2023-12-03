package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class PushActivity extends a {
    public Course A;
    public String B;

    /* renamed from: w  reason: collision with root package name */
    public y f10466w;

    /* renamed from: z  reason: collision with root package name */
    public b f10469z;

    /* renamed from: x  reason: collision with root package name */
    public int f10467x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10468y = 0;
    public boolean C = false;

    @Override // rr.a
    public final void n0() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f10466w.H() > 0) {
            this.f10466w.W();
            return;
        }
        b F = this.f10469z.F();
        if (F == null) {
            int i6 = this.f10467x - 1;
            this.f10467x = i6;
            if (i6 < this.f10468y) {
                if (this.C) {
                    n0();
                    return;
                } else {
                    super.onBackPressed();
                    return;
                }
            }
            u0(true, true);
            return;
        }
        this.f10469z = F;
        y yVar = this.f10466w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10469z, null);
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
            this.f10468y = i6;
            this.f10467x = i6;
        }
        if (FirebasePersistence.getInstance().getUser() == null) {
            finish();
            return;
        }
        this.A = FirebasePersistence.getInstance().getCourseById(c.n());
        this.B = getIntent().getExtras().getString(Constants.API_COURSE_LINK, Constants.SCREEN_ACTIVITY_1);
        this.f10466w = getSupportFragmentManager();
        u0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.f10469z = bVar;
        y yVar = this.f10466w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10469z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10467x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10466w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10467x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    n0();
                    return;
                }
            } else {
                Bundle bundle = new Bundle();
                if (this.A.getCourseName().equals(Constants.COURSE_SLEEP)) {
                    if (this.B.equals(Constants.SCREEN_ACTIVITY_1)) {
                        bundle.putString("activity_id", Constants.ACTIVITY_ID_SLEEP_DEEP_BREATHING);
                    } else if (this.B.equals(Constants.SCREEN_ACTIVITY_2)) {
                        bundle.putString("activity_id", Constants.ACTIVITY_ID_SLEEP_CLIMBING_STAIRS);
                    }
                } else if (this.A.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                    if (this.B.equals(Constants.SCREEN_ACTIVITY_1)) {
                        bundle.putString("activity_id", Constants.ACTIVITY_ID_DEPRESSION_DEEP_BREATHING);
                    } else if (this.B.equals(Constants.SCREEN_ACTIVITY_2)) {
                        bundle.putString("activity_id", Constants.ACTIVITY_ID_DEPRESSION_CLIMBING_STAIRS);
                    }
                } else if (this.A.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                    if (this.B.equals(Constants.SCREEN_ACTIVITY_1)) {
                        bundle.putString("activity_id", Constants.ACTIVITY_ID_HAPPINESS_DEEP_BREATHING);
                    } else if (this.B.equals(Constants.SCREEN_ACTIVITY_2)) {
                        bundle.putString("activity_id", Constants.ACTIVITY_ID_HAPPINESS_CLIMBING_STAIRS);
                    }
                } else if (this.A.getCourseName().equals(Constants.COURSE_WORRY)) {
                    if (this.B.equals(Constants.SCREEN_ACTIVITY_1)) {
                        bundle.putString("activity_id", Constants.ACTIVITY_ID_WORRY_DEEP_BREATHING);
                    } else if (this.B.equals(Constants.SCREEN_ACTIVITY_2)) {
                        bundle.putString("activity_id", Constants.ACTIVITY_ID_WORRY_CYCLING);
                    }
                } else if (this.A.getCourseName().equals(Constants.COURSE_ANGER)) {
                    if (this.B.equals(Constants.SCREEN_ACTIVITY_1)) {
                        bundle.putString("activity_id", Constants.ACTIVITY_ID_ANGER_DEEP_BREATHING);
                    } else if (this.B.equals(Constants.SCREEN_ACTIVITY_2)) {
                        bundle.putString("activity_id", Constants.ACTIVITY_ID_ANGER_RUNNING);
                    }
                }
                bundle.putBoolean("proceed_on_schedule", true);
                com.theinnerhour.b2b.fragment.coping.a aVar = new com.theinnerhour.b2b.fragment.coping.a();
                this.f10469z = aVar;
                aVar.setArguments(bundle);
                this.C = true;
            }
        } else {
            br.a aVar2 = new br.a();
            this.f10469z = aVar2;
            aVar2.setArguments(getIntent().getExtras());
        }
        l2.f(R.id.root_frame_layout, this.f10469z, null);
        l2.j();
    }
}
