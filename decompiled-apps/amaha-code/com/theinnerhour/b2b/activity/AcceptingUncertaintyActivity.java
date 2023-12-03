package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import bq.d;
import bq.e;
import bq.f;
import com.theinnerhour.b2b.R;
import rr.b;
/* loaded from: classes2.dex */
public class AcceptingUncertaintyActivity extends c {
    public ProgressBar A;

    /* renamed from: v  reason: collision with root package name */
    public y f10279v;

    /* renamed from: y  reason: collision with root package name */
    public b f10282y;

    /* renamed from: w  reason: collision with root package name */
    public int f10280w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f10281x = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f10283z = 0;

    public final void n0() {
        int i6 = this.f10283z + 1;
        this.f10283z = i6;
        this.A.setProgress(i6);
        this.f10280w++;
        o0(false, true);
    }

    public final void o0(boolean z10, boolean z11) {
        y yVar = this.f10279v;
        a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        switch (this.f10280w) {
            case 0:
                this.f10282y = new bq.a();
                break;
            case 1:
                this.f10282y = new bq.b();
                break;
            case 2:
                this.f10282y = new bq.c();
                break;
            case 3:
                this.f10282y = new d();
                break;
            case 4:
                this.f10282y = new e();
                break;
            case 5:
                this.f10282y = new f();
                break;
            case 6:
                setResult(-1, new Intent());
                finish();
                return;
        }
        l2.f(R.id.root_frame_layout, this.f10282y, null);
        l2.j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.f10283z - 1;
        this.f10283z = i6;
        this.A.setProgress(i6);
        b F = this.f10282y.F();
        if (F == null) {
            int i10 = this.f10280w - 1;
            this.f10280w = i10;
            if (i10 < this.f10281x) {
                super.onBackPressed();
                return;
            } else {
                o0(true, true);
                return;
            }
        }
        this.f10282y = F;
        y yVar = this.f10279v;
        a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10282y, null);
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
            this.f10281x = i6;
            this.f10280w = i6;
        }
        this.f10279v = getSupportFragmentManager();
        o0(false, false);
    }
}
