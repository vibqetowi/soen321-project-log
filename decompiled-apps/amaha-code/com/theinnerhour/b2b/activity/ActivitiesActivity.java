package com.theinnerhour.b2b.activity;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class ActivitiesActivity extends a {
    public ProgressBar B;

    /* renamed from: w  reason: collision with root package name */
    public y f10284w;

    /* renamed from: z  reason: collision with root package name */
    public b f10287z;

    /* renamed from: x  reason: collision with root package name */
    public int f10285x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10286y = 0;
    public int A = 0;
    public boolean C = false;

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f10284w.H() > 0) {
            this.f10284w.Y();
            return;
        }
        int i6 = this.A - 1;
        this.A = i6;
        this.B.setProgress(i6);
        b F = this.f10287z.F();
        if (F == null) {
            int i10 = this.f10285x - 1;
            this.f10285x = i10;
            if (i10 < this.f10286y) {
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
        this.f10287z = F;
        y yVar = this.f10284w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10287z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_activities);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_view);
        this.B = progressBar;
        progressBar.setMax(4);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10286y = i6;
            this.f10285x = i6;
        }
        this.f10284w = getSupportFragmentManager();
        u0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        int i6 = this.A + 1;
        this.A = i6;
        this.B.setProgress(i6);
        this.f10287z = bVar;
        y yVar = this.f10284w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10287z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        int i6 = this.A + 1;
        this.A = i6;
        this.B.setProgress(i6);
        this.f10285x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10284w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10285x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    n0();
                    return;
                }
            } else {
                this.f10287z = new cq.b();
            }
        } else {
            this.f10287z = new cq.a();
        }
        l2.f(R.id.root_frame_layout, this.f10287z, null);
        l2.j();
    }
}
