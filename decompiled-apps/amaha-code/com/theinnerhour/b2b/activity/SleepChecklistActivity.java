package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class SleepChecklistActivity extends a {

    /* renamed from: w  reason: collision with root package name */
    public y f10491w;

    /* renamed from: x  reason: collision with root package name */
    public int f10492x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10493y = 0;

    /* renamed from: z  reason: collision with root package name */
    public b f10494z;

    @Override // rr.a
    public final void n0() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        b F = this.f10494z.F();
        if (F == null) {
            int i6 = this.f10492x - 1;
            this.f10492x = i6;
            if (i6 < this.f10493y) {
                super.onBackPressed();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.f10494z = F;
        y yVar = this.f10491w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10494z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sleep_checklist);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10493y = i6;
            this.f10492x = i6;
        }
        this.f10491w = getSupportFragmentManager();
        u0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.f10494z = bVar;
        y yVar = this.f10491w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10494z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10492x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10491w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10492x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    n0();
                }
            } else {
                this.f10494z = new cr.b();
            }
        } else {
            this.f10494z = new cr.a();
        }
        l2.f(R.id.root_frame_layout, this.f10494z, null);
        l2.j();
    }
}
