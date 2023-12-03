package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import iq.e;
import iq.g;
import iq.i;
import iq.k;
import java.util.HashSet;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class CausesActivity extends a {
    public ProgressBar B;

    /* renamed from: w  reason: collision with root package name */
    public y f10329w;

    /* renamed from: z  reason: collision with root package name */
    public b f10332z;

    /* renamed from: x  reason: collision with root package name */
    public int f10330x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10331y = 0;
    public int A = 0;
    public final HashSet<String> C = new HashSet<>();

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
        b F = this.f10332z.F();
        if (F == null) {
            int i10 = this.f10330x - 1;
            this.f10330x = i10;
            if (i10 < this.f10331y) {
                super.onBackPressed();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.f10332z = F;
        y yVar = this.f10329w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10332z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_activities);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_view);
        this.B = progressBar;
        progressBar.setMax(5);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10331y = i6;
            this.f10330x = i6;
        }
        this.f10329w = getSupportFragmentManager();
        u0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        int i6 = this.A + 1;
        this.A = i6;
        this.B.setProgress(i6);
        this.f10332z = bVar;
        y yVar = this.f10329w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10332z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        int i6 = this.A + 1;
        this.A = i6;
        this.B.setProgress(i6);
        this.f10330x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10329w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10330x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                n0();
                                return;
                            }
                        } else if (this.C.size() == 0) {
                            this.f10332z = new uq.b();
                        } else {
                            this.f10332z = new iq.a();
                        }
                    } else {
                        this.f10332z = new g();
                    }
                } else {
                    this.f10332z = new e();
                }
            } else {
                this.f10332z = new i();
            }
        } else {
            this.f10332z = new k();
        }
        l2.f(R.id.root_frame_layout, this.f10332z, null);
        l2.j();
    }
}
