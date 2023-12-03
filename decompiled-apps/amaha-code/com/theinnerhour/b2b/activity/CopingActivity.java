package com.theinnerhour.b2b.activity;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Coping;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import kq.c;
import kq.k;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class CopingActivity extends a {
    public String B;
    public ProgressBar C;

    /* renamed from: w  reason: collision with root package name */
    public y f10333w;

    /* renamed from: z  reason: collision with root package name */
    public b f10336z;

    /* renamed from: x  reason: collision with root package name */
    public int f10334x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10335y = 0;
    public Coping A = new Coping();
    public int D = 0;

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f10333w.H() > 0) {
            this.f10333w.W();
            return;
        }
        int i6 = this.D - 1;
        this.D = i6;
        this.C.setProgress(i6);
        b F = this.f10336z.F();
        if (F == null) {
            int i10 = this.f10334x - 1;
            this.f10334x = i10;
            if (i10 < this.f10335y) {
                super.onBackPressed();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.f10336z = F;
        y yVar = this.f10333w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10336z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_coping);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_view);
        this.C = progressBar;
        progressBar.setMax(7);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10335y = i6;
            this.f10334x = i6;
        }
        if (FirebasePersistence.getInstance().getUser() != null && b.g() != null) {
            this.B = b.g();
        }
        this.f10333w = getSupportFragmentManager();
        u0(false, false);
        Bundle bundle2 = new Bundle();
        if (FirebasePersistence.getInstance().getUser() != null && b.g() != null) {
            d.m(bundle2, "course");
        }
        gk.a.b(bundle2, "coping_activity");
    }

    @Override // rr.a
    public final String p0() {
        throw null;
    }

    @Override // rr.a
    public final void r0(b bVar) {
        int i6 = this.D + 1;
        this.D = i6;
        this.C.setProgress(i6);
        this.f10336z = bVar;
        y yVar = this.f10333w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10336z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        int i6 = this.D + 1;
        this.D = i6;
        this.C.setProgress(i6);
        this.f10334x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10333w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.f10334x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                n0();
                                return;
                            }
                        } else {
                            Bundle k10 = c.k("step", 2);
                            c cVar = new c();
                            this.f10336z = cVar;
                            cVar.setArguments(k10);
                        }
                    } else {
                        this.f10336z = new k();
                    }
                } else {
                    this.f10336z = new kq.a();
                }
            } else {
                Bundle k11 = c.k("step", 1);
                c cVar2 = new c();
                this.f10336z = cVar2;
                cVar2.setArguments(k11);
            }
        } else {
            this.f10336z = new kq.b();
        }
        l2.f(R.id.root_frame_layout, this.f10336z, null);
        l2.k();
    }
}
