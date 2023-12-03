package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import java.util.HashSet;
import rr.a;
import rr.b;
import uq.c;
import uq.g;
import uq.i;
/* loaded from: classes2.dex */
public class EnduringActivity extends a {
    public ProgressBar E;

    /* renamed from: w  reason: collision with root package name */
    public y f10398w;

    /* renamed from: z  reason: collision with root package name */
    public b f10401z;

    /* renamed from: x  reason: collision with root package name */
    public int f10399x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10400y = 0;
    public final HashSet<String> A = new HashSet<>();
    public String B = Constants.COURSE_STRESS;
    public Course C = null;
    public int D = 0;

    @Override // rr.a
    public final void n0() {
        if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.COMPLETES_ENDURING_GOAL_SECTION_BADGE)) {
            FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().put(Constants.COMPLETES_ENDURING_GOAL_SECTION_BADGE, Constants.BADGE_ATTAINED);
            FirebasePersistence.getInstance().updateUserOnFirebase();
        }
        setResult(-1, new Intent());
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.D - 1;
        this.D = i6;
        this.E.setProgress(i6);
        b F = this.f10401z.F();
        if (F == null) {
            int i10 = this.f10399x - 1;
            this.f10399x = i10;
            if (i10 < this.f10400y) {
                super.onBackPressed();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.f10401z = F;
        y yVar = this.f10398w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10401z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_enduring);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        this.E = (ProgressBar) findViewById(R.id.progress_view);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10400y = i6;
            this.f10399x = i6;
        }
        this.f10398w = getSupportFragmentManager();
        if (FirebasePersistence.getInstance().getUser() == null) {
            finish();
            return;
        }
        this.B = c.n();
        Course courseById = FirebasePersistence.getInstance().getCourseById(this.B);
        this.C = courseById;
        if (courseById != null) {
            if (!courseById.getCourseName().equals(Constants.COURSE_STRESS) && !this.C.getCourseName().equals(Constants.COURSE_DEPRESSION) && !this.C.getCourseName().equals(Constants.COURSE_HAPPINESS) && !this.C.getCourseName().equals(Constants.COURSE_WORRY) && !this.C.getCourseName().equals(Constants.COURSE_ANGER)) {
                if (this.C.getCourseName().equals(Constants.COURSE_SLEEP)) {
                    this.E.setMax(3);
                }
            } else {
                this.E.setMax(4);
            }
            u0(false, false);
        }
    }

    @Override // rr.a
    public final void r0(b bVar) {
        int i6 = this.D + 1;
        this.D = i6;
        this.E.setProgress(i6);
        this.f10401z = bVar;
        y yVar = this.f10398w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10401z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        int i6 = this.D + 1;
        this.D = i6;
        this.E.setProgress(i6);
        this.f10399x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10398w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        boolean equals = this.C.getCourseName().equals(Constants.COURSE_STRESS);
        HashSet<String> hashSet = this.A;
        if (!equals && !this.C.getCourseName().equals(Constants.COURSE_DEPRESSION) && !this.C.getCourseName().equals(Constants.COURSE_HAPPINESS) && !this.C.getCourseName().equals(Constants.COURSE_WORRY) && !this.C.getCourseName().equals(Constants.COURSE_ANGER)) {
            if (this.C.getCourseName().equals(Constants.COURSE_SLEEP)) {
                int i6 = this.f10399x;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            n0();
                            return;
                        } else if (hashSet.size() == 0) {
                            this.f10401z = new uq.b();
                        } else {
                            this.f10401z = new c();
                        }
                    } else {
                        this.f10401z = new i();
                    }
                } else {
                    this.f10401z = new uq.a();
                }
            }
        } else {
            int i10 = this.f10399x;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            n0();
                            return;
                        } else if (hashSet.size() == 0) {
                            this.f10401z = new uq.b();
                        } else {
                            this.f10401z = new c();
                        }
                    } else {
                        this.f10401z = new i();
                    }
                } else {
                    this.f10401z = new g();
                }
            } else {
                this.f10401z = new uq.a();
            }
        }
        l2.f(R.id.root_frame_layout, this.f10401z, null);
        l2.j();
    }
}
