package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import lq.d;
import lq.e;
import rr.b;
/* loaded from: classes2.dex */
public class DealingRacingMindActivity extends c {
    public ProgressBar A;

    /* renamed from: v  reason: collision with root package name */
    public y f10345v;

    /* renamed from: y  reason: collision with root package name */
    public b f10348y;

    /* renamed from: w  reason: collision with root package name */
    public int f10346w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f10347x = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f10349z = 0;

    public final void n0() {
        int i6 = this.f10349z + 1;
        this.f10349z = i6;
        this.A.setProgress(i6);
        this.f10346w++;
        o0(false, true);
    }

    public final void o0(boolean z10, boolean z11) {
        y yVar = this.f10345v;
        a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10346w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                setResult(-1, new Intent());
                                finish();
                                return;
                            }
                        } else {
                            this.f10348y = new d();
                        }
                    } else {
                        this.f10348y = new lq.c();
                    }
                } else {
                    this.f10348y = new lq.b();
                }
            } else {
                this.f10348y = new lq.a();
            }
        } else {
            this.f10348y = new e();
        }
        l2.f(R.id.root_frame_layout, this.f10348y, null);
        l2.j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.f10349z - 1;
        this.f10349z = i6;
        this.A.setProgress(i6);
        b F = this.f10348y.F();
        if (F == null) {
            int i10 = this.f10346w - 1;
            this.f10346w = i10;
            if (i10 < this.f10347x) {
                super.onBackPressed();
                return;
            } else {
                o0(true, true);
                return;
            }
        }
        this.f10348y = F;
        y yVar = this.f10345v;
        a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10348y, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_activities);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_view);
        this.A = progressBar;
        progressBar.setMax(5);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10347x = i6;
            this.f10346w = i6;
        }
        this.f10345v = getSupportFragmentManager();
        o0(false, false);
    }
}
