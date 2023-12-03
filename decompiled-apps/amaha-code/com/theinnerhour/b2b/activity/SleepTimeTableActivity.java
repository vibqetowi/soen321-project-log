package com.theinnerhour.b2b.activity;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import er.c;
import er.d;
import er.h;
import er.j;
import er.k;
import er.o;
import java.util.HashMap;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class SleepTimeTableActivity extends a {
    public ProgressBar C;

    /* renamed from: w  reason: collision with root package name */
    public y f10500w;

    /* renamed from: z  reason: collision with root package name */
    public b f10503z;

    /* renamed from: x  reason: collision with root package name */
    public int f10501x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10502y = 0;
    public final HashMap<String, Boolean> A = new HashMap<>();
    public int B = 0;

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.B - 1;
        this.B = i6;
        this.C.setProgress(i6);
        b F = this.f10503z.F();
        if (F == null) {
            int i10 = this.f10501x - 1;
            this.f10501x = i10;
            if (i10 < this.f10502y) {
                super.onBackPressed();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.f10503z = F;
        y yVar = this.f10500w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10503z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_activities);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_view);
        this.C = progressBar;
        progressBar.setMax(8);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10502y = i6;
            this.f10501x = i6;
        }
        this.f10500w = getSupportFragmentManager();
        u0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        int i6 = this.B + 1;
        this.B = i6;
        this.C.setProgress(i6);
        this.f10503z = bVar;
        y yVar = this.f10500w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10503z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        int i6 = this.B + 1;
        this.B = i6;
        this.C.setProgress(i6);
        this.f10501x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10500w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        switch (this.f10501x) {
            case 0:
                this.f10503z = new o();
                break;
            case 1:
                Bundle k10 = c.k("screen_sequence", 1);
                er.b bVar = new er.b();
                this.f10503z = bVar;
                bVar.setArguments(k10);
                break;
            case 2:
                this.f10503z = new d();
                break;
            case 3:
                this.f10503z = new h();
                Bundle bundle = new Bundle();
                bundle.putBoolean("back_pressed", z10);
                this.f10503z.setArguments(bundle);
                break;
            case 4:
                Bundle k11 = c.k("screen_sequence", 2);
                er.b bVar2 = new er.b();
                this.f10503z = bVar2;
                bVar2.setArguments(k11);
                break;
            case 5:
                this.f10503z = new c();
                break;
            case 6:
                this.f10503z = new j();
                break;
            case 7:
                if (this.A.size() == 0) {
                    t0();
                    return;
                } else {
                    this.f10503z = new k();
                    break;
                }
            case 8:
                n0();
                return;
        }
        l2.f(R.id.root_frame_layout, this.f10503z, null);
        l2.j();
    }
}
