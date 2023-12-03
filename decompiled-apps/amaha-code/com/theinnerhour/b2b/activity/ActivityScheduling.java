package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import dq.c;
import dq.d;
import dq.e;
import dq.f;
import dq.g;
import dq.h;
import dq.i;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class ActivityScheduling extends a {
    public ProgressBar B;

    /* renamed from: w  reason: collision with root package name */
    public y f10292w;

    /* renamed from: z  reason: collision with root package name */
    public b f10295z;

    /* renamed from: x  reason: collision with root package name */
    public int f10293x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10294y = 0;
    public int A = 0;

    @Override // rr.a
    public final void n0() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.A - 1;
        this.A = i6;
        this.B.setProgress(i6);
        b F = this.f10295z.F();
        if (F == null) {
            int i10 = this.f10293x - 1;
            this.f10293x = i10;
            if (i10 < this.f10294y) {
                super.onBackPressed();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.f10295z = F;
        y yVar = this.f10292w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10295z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_view);
        this.B = progressBar;
        progressBar.setMax(9);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10294y = i6;
            this.f10293x = i6;
        }
        this.f10292w = getSupportFragmentManager();
        u0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        int i6 = this.A + 1;
        this.A = i6;
        this.B.setProgress(i6);
        this.f10295z = bVar;
        y yVar = this.f10292w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10295z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        int i6 = this.A + 1;
        this.A = i6;
        this.B.setProgress(i6);
        this.f10293x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10292w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        switch (this.f10293x) {
            case 0:
                this.f10295z = new c();
                break;
            case 1:
                this.f10295z = new dq.a();
                break;
            case 2:
                this.f10295z = new g();
                break;
            case 3:
                this.f10295z = new e();
                break;
            case 4:
                this.f10295z = new i();
                break;
            case 5:
                this.f10295z = new d();
                break;
            case 6:
                this.f10295z = new h();
                break;
            case 7:
                this.f10295z = new f();
                break;
            case 8:
                this.f10295z = new dq.b();
                break;
            case 9:
                n0();
                return;
        }
        l2.f(R.id.root_frame_layout, this.f10295z, null);
        l2.j();
    }
}
