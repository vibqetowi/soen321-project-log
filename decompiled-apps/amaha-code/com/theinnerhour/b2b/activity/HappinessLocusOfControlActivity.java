package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import rr.a;
import rr.b;
import xq.c;
import xq.e;
/* loaded from: classes2.dex */
public class HappinessLocusOfControlActivity extends a {
    public ProgressBar B;

    /* renamed from: w  reason: collision with root package name */
    public y f10423w;

    /* renamed from: z  reason: collision with root package name */
    public b f10426z;

    /* renamed from: x  reason: collision with root package name */
    public int f10424x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10425y = 0;
    public int A = 0;

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.A - 1;
        this.A = i6;
        this.B.setProgress(i6);
        b F = this.f10426z.F();
        if (F == null) {
            int i10 = this.f10424x - 1;
            this.f10424x = i10;
            if (i10 < this.f10425y) {
                super.onBackPressed();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.f10426z = F;
        y yVar = this.f10423w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10426z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_view);
        this.B = progressBar;
        progressBar.setMax(8);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10425y = i6;
            this.f10424x = i6;
        }
        this.f10423w = getSupportFragmentManager();
        u0(false, false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        int i6 = this.A + 1;
        this.A = i6;
        this.B.setProgress(i6);
        this.f10426z = bVar;
        y yVar = this.f10423w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10426z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        int i6 = this.A + 1;
        this.A = i6;
        this.B.setProgress(i6);
        this.f10424x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10423w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        switch (this.f10424x) {
            case 0:
                this.f10426z = new xq.b();
                this.f10426z.setArguments(c.k("screen_sequence", 1));
                break;
            case 1:
                this.f10426z = new e();
                this.f10426z.setArguments(c.k("screen_sequence", 1));
                break;
            case 2:
                this.f10426z = new e();
                this.f10426z.setArguments(c.k("screen_sequence", 2));
                break;
            case 3:
                this.f10426z = new e();
                this.f10426z.setArguments(c.k("screen_sequence", 3));
                break;
            case 4:
                this.f10426z = new xq.b();
                this.f10426z.setArguments(c.k("screen_sequence", 2));
                break;
            case 5:
                this.f10426z = new c();
                break;
            case 6:
                this.f10426z = new xq.b();
                this.f10426z.setArguments(c.k("screen_sequence", 3));
                break;
            case 7:
                this.f10426z = new xq.a();
                break;
            default:
                n0();
                return;
        }
        l2.f(R.id.root_frame_layout, this.f10426z, null);
        l2.j();
    }
}
