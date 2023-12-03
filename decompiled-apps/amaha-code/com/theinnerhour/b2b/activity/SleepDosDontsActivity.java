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
public class SleepDosDontsActivity extends c {

    /* renamed from: v  reason: collision with root package name */
    public y f10495v;

    /* renamed from: x  reason: collision with root package name */
    public b f10497x;

    /* renamed from: z  reason: collision with root package name */
    public ProgressBar f10499z;

    /* renamed from: w  reason: collision with root package name */
    public int f10496w = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10498y = 0;

    public final void n0() {
        int i6 = this.f10498y + 1;
        this.f10498y = i6;
        this.f10499z.setProgress(i6);
        this.f10496w++;
        o0(false, true);
    }

    public final void o0(boolean z10, boolean z11) {
        y yVar = this.f10495v;
        a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10496w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        setResult(-1, new Intent());
                        finish();
                        return;
                    }
                } else {
                    this.f10497x = new aq.c();
                }
            } else {
                this.f10497x = new aq.b();
            }
        } else {
            this.f10497x = new aq.a();
        }
        l2.f(R.id.root_frame_layout, this.f10497x, null);
        l2.j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.f10498y - 1;
        this.f10498y = i6;
        this.f10499z.setProgress(i6);
        b F = this.f10497x.F();
        if (F == null) {
            int i10 = this.f10496w - 1;
            this.f10496w = i10;
            if (i10 < 0) {
                super.onBackPressed();
                return;
            } else {
                o0(true, true);
                return;
            }
        }
        this.f10497x = F;
        y yVar = this.f10495v;
        a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10497x, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sleep_dos_donts);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_view);
        this.f10499z = progressBar;
        progressBar.setMax(3);
        this.f10495v = getSupportFragmentManager();
        o0(false, false);
    }
}
