package com.theinnerhour.b2b.adapter;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import gq.d;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class GoalsAssessmentActivity extends a {

    /* renamed from: w  reason: collision with root package name */
    public y f10578w;

    /* renamed from: x  reason: collision with root package name */
    public int f10579x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10580y = 0;

    /* renamed from: z  reason: collision with root package name */
    public b f10581z;

    @Override // rr.a
    public final void n0() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        b F = this.f10581z.F();
        if (F == null) {
            int i6 = this.f10579x - 1;
            this.f10579x = i6;
            if (i6 < this.f10580y) {
                super.onBackPressed();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.f10581z = F;
        y yVar = this.f10578w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10581z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_goals_assessment);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10580y = i6;
            this.f10579x = i6;
        }
        this.f10578w = getSupportFragmentManager();
        u0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.f10581z = bVar;
        y yVar = this.f10578w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10581z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10579x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10578w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10579x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        n0();
                        return;
                    }
                } else {
                    this.f10581z = new gq.a();
                }
            } else {
                this.f10581z = new d();
            }
        } else {
            this.f10581z = new gq.b();
        }
        l2.f(R.id.root_frame_layout, this.f10581z, null);
        l2.j();
    }
}
