package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import rr.b;
/* loaded from: classes2.dex */
public class ProblemSolvingActivity extends c {
    public ProgressBar A;

    /* renamed from: v  reason: collision with root package name */
    public y f10461v;

    /* renamed from: y  reason: collision with root package name */
    public b f10464y;

    /* renamed from: w  reason: collision with root package name */
    public int f10462w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f10463x = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f10465z = 0;

    public final void n0() {
        int i6 = this.f10465z - 1;
        this.f10465z = i6;
        this.A.setProgress(i6);
    }

    public final void o0() {
        int i6 = this.f10465z + 1;
        this.f10465z = i6;
        this.A.setProgress(i6);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        n0();
        b F = this.f10464y.F();
        if (F == null) {
            if (this.f10464y.I()) {
                int i6 = this.f10462w - 1;
                this.f10462w = i6;
                if (i6 < this.f10463x) {
                    super.onBackPressed();
                    return;
                } else {
                    p0(true, true);
                    return;
                }
            }
            return;
        }
        this.f10464y = F;
        y yVar = this.f10461v;
        a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10464y, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_thoughts);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_view);
        this.A = progressBar;
        progressBar.setMax(20);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10463x = i6;
            this.f10462w = i6;
        }
        this.f10461v = getSupportFragmentManager();
        p0(false, false);
    }

    public final void p0(boolean z10, boolean z11) {
        y yVar = this.f10461v;
        a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10462w;
        if (i6 != 0) {
            if (i6 != 1) {
                setResult(-1, new Intent());
                finish();
            } else {
                this.f10464y = new zq.a();
            }
        } else {
            this.f10464y = new zq.c();
        }
        l2.f(R.id.root_frame_layout, this.f10464y, null);
        l2.j();
    }
}
