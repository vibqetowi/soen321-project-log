package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import gr.d;
import gr.e;
import gr.f;
import gr.g;
import gr.h;
import gr.i;
import rr.b;
/* loaded from: classes2.dex */
public class SymptomsActivity extends c {
    public static String B = "";
    public ProgressBar A;

    /* renamed from: v  reason: collision with root package name */
    public y f10508v;

    /* renamed from: y  reason: collision with root package name */
    public b f10511y;

    /* renamed from: w  reason: collision with root package name */
    public int f10509w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f10510x = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f10512z = 0;

    public final void n0() {
        setResult(-1, new Intent());
        finish();
    }

    public final void o0() {
        int i6 = this.f10512z + 1;
        this.f10512z = i6;
        this.A.setProgress(i6);
        this.f10509w++;
        p0(false, true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.f10512z - 1;
        this.f10512z = i6;
        this.A.setProgress(i6);
        b F = this.f10511y.F();
        if (F == null) {
            int i10 = this.f10509w - 1;
            this.f10509w = i10;
            if (i10 < this.f10510x) {
                super.onBackPressed();
                return;
            } else {
                p0(true, true);
                return;
            }
        }
        this.f10511y = F;
        y yVar = this.f10508v;
        a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10511y, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_activities);
        this.A = (ProgressBar) findViewById(R.id.progress_view);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10510x = i6;
            this.f10509w = i6;
        }
        this.f10508v = getSupportFragmentManager();
        String courseName = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getCourseName();
        B = courseName;
        if (courseName.equals(Constants.COURSE_DEPRESSION)) {
            this.A.setMax(6);
        } else {
            this.A.setMax(7);
        }
        p0(false, false);
    }

    public final void p0(boolean z10, boolean z11) {
        y yVar = this.f10508v;
        a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        if (B.equals(Constants.COURSE_DEPRESSION)) {
            switch (this.f10509w) {
                case 0:
                    this.f10511y = new e();
                    break;
                case 1:
                    this.f10511y = new g();
                    break;
                case 2:
                    this.f10511y = new gr.b();
                    break;
                case 3:
                    this.f10511y = new f();
                    break;
                case 4:
                    this.f10511y = new gr.a();
                    break;
                case 5:
                    if (gr.c.f16711y.size() == 0) {
                        this.f10511y = new i();
                        break;
                    } else {
                        this.f10511y = new zp.a();
                        break;
                    }
                case 6:
                    n0();
                    return;
            }
        } else if (B.equals(Constants.COURSE_STRESS)) {
            switch (this.f10509w) {
                case 0:
                    this.f10511y = new e();
                    break;
                case 1:
                    this.f10511y = new d();
                    break;
                case 2:
                    this.f10511y = new h();
                    break;
                case 3:
                    this.f10511y = new g();
                    break;
                case 4:
                    this.f10511y = new gr.b();
                    break;
                case 5:
                    this.f10511y = new f();
                    break;
                case 6:
                    if (gr.c.f16711y.size() == 0) {
                        this.f10511y = new i();
                        break;
                    } else {
                        this.f10511y = new zp.a();
                        break;
                    }
                case 7:
                    n0();
                    return;
            }
        } else if (B.equals(Constants.COURSE_WORRY)) {
            switch (this.f10509w) {
                case 0:
                    this.f10511y = new e();
                    break;
                case 1:
                    this.f10511y = new d();
                    break;
                case 2:
                    this.f10511y = new f();
                    break;
                case 3:
                    this.f10511y = new gr.b();
                    break;
                case 4:
                    this.f10511y = new gr.a();
                    break;
                case 5:
                    this.f10511y = new g();
                    break;
                case 6:
                    if (gr.c.f16711y.size() == 0) {
                        this.f10511y = new i();
                        break;
                    } else {
                        this.f10511y = new zp.a();
                        break;
                    }
                case 7:
                    n0();
                    return;
            }
        } else if (B.equals(Constants.COURSE_ANGER)) {
            switch (this.f10509w) {
                case 0:
                    this.f10511y = new e();
                    break;
                case 1:
                    this.f10511y = new d();
                    break;
                case 2:
                    this.f10511y = new h();
                    break;
                case 3:
                    this.f10511y = new g();
                    break;
                case 4:
                    this.f10511y = new gr.a();
                    break;
                case 5:
                    this.f10511y = new gr.b();
                    break;
                case 6:
                    if (gr.c.f16711y.size() == 0) {
                        this.f10511y = new i();
                        break;
                    } else {
                        this.f10511y = new zp.a();
                        break;
                    }
                case 7:
                    n0();
                    return;
            }
        }
        l2.f(R.id.root_frame_layout, this.f10511y, null);
        l2.j();
    }
}
