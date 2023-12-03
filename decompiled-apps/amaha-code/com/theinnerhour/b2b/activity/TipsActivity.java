package com.theinnerhour.b2b.activity;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import ir.d;
import jr.c;
import jr.e;
import jr.f;
import jr.g;
import jr.h;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class TipsActivity extends a {
    public b A;
    public Course B;

    /* renamed from: w  reason: collision with root package name */
    public y f10556w;

    /* renamed from: x  reason: collision with root package name */
    public int f10557x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10558y = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f10559z = 0;

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        b F = this.A.F();
        if (F == null) {
            int i6 = this.f10557x - 1;
            this.f10557x = i6;
            if (i6 < this.f10558y) {
                super.onBackPressed();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.A = F;
        y yVar = this.f10556w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.A, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_activities);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ((ProgressBar) findViewById(R.id.progress_view)).setVisibility(8);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10558y = i6;
            this.f10557x = i6;
            this.f10559z = extras.getInt("final_pos", 0);
        }
        this.f10556w = getSupportFragmentManager();
        this.B = FirebasePersistence.getInstance().getCourseById(c.n());
        u0(false, false);
    }

    @Override // androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(bundle);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.A = bVar;
        y yVar = this.f10556w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.A, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10557x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        int i6 = this.f10559z;
        if (i6 != 0 && this.f10557x > i6) {
            n0();
            return;
        }
        y yVar = this.f10556w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        if (this.B.getCourseName().equals(Constants.COURSE_STRESS)) {
            int i10 = this.f10557x;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    n0();
                                    return;
                                }
                            } else {
                                this.A = new d();
                            }
                        } else {
                            this.A = new h();
                        }
                    } else {
                        this.A = new e();
                    }
                } else {
                    this.A = new f();
                }
            } else {
                this.A = new g();
            }
        } else if (this.B.getCourseName().equals(Constants.COURSE_SLEEP)) {
            int i11 = this.f10557x;
            if (i11 != 0) {
                if (i11 == 1) {
                    n0();
                    return;
                }
            } else {
                this.A = new jr.d();
            }
        } else if (FirebasePersistence.getInstance().getUser().getVersion().equals("v2.3") && this.B.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
            int i12 = this.f10557x;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                n0();
                                return;
                            }
                        } else {
                            this.A = new c();
                        }
                    } else {
                        this.A = new c();
                    }
                } else {
                    this.A = new c();
                }
            } else {
                this.A = new c();
            }
        } else if (this.B.getCourseName().equals(Constants.COURSE_HAPPINESS) || this.B.getCourseName().equals(Constants.COURSE_DEPRESSION) || this.B.getCourseName().equals(Constants.COURSE_WORRY) || this.B.getCourseName().equals(Constants.COURSE_ANGER)) {
            int i13 = this.f10557x;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 4) {
                        if (i13 == 5) {
                            n0();
                            return;
                        }
                    } else {
                        this.A = new d();
                    }
                } else {
                    this.A = new jr.b();
                }
            } else {
                this.A = new jr.a();
            }
        }
        l2.f(R.id.root_frame_layout, this.A, null);
        l2.j();
    }
}
