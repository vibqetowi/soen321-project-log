package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import r1.b0;
import rr.a;
import rr.b;
import yq.f;
import yq.g;
/* loaded from: classes2.dex */
public class HappinessMindfulnessActivity extends a {
    public ProgressBar B;

    /* renamed from: w  reason: collision with root package name */
    public y f10427w;

    /* renamed from: z  reason: collision with root package name */
    public b f10430z;

    /* renamed from: x  reason: collision with root package name */
    public int f10428x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10429y = 0;
    public int A = 0;
    public boolean C = false;

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.A - 1;
        this.A = i6;
        this.B.setProgress(i6);
        b F = this.f10430z.F();
        if (F == null) {
            int i10 = this.f10428x - 1;
            this.f10428x = i10;
            if (i10 < this.f10429y) {
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
        this.f10430z = F;
        y yVar = this.f10427w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10430z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_view);
        this.B = progressBar;
        progressBar.setMax(3);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10429y = i6;
            this.f10428x = i6;
        }
        this.f10427w = getSupportFragmentManager();
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
        this.f10430z = bVar;
        y yVar = this.f10427w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10430z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        int i6 = this.A + 1;
        this.A = i6;
        this.B.setProgress(i6);
        this.f10428x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10427w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10428x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            n0();
                            return;
                        }
                        this.C = true;
                        this.f10430z = new f();
                        this.f10430z.setArguments(b0.a("mindfulness_model", "walking-meditation"));
                    } else {
                        this.f10430z = new yq.a();
                        this.f10430z.setArguments(c.k("screen_sequence", 2));
                    }
                } else {
                    n0();
                }
            } else {
                this.f10430z = new g();
            }
        } else {
            this.f10430z = new yq.a();
            this.f10430z.setArguments(c.k("screen_sequence", 1));
        }
        l2.f(R.id.root_frame_layout, this.f10430z, null);
        l2.j();
    }
}
