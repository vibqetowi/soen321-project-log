package com.theinnerhour.b2b.activity;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class GratitudeJournalComponentActivity extends a {

    /* renamed from: w  reason: collision with root package name */
    public y f10415w;

    /* renamed from: y  reason: collision with root package name */
    public b f10417y;

    /* renamed from: x  reason: collision with root package name */
    public int f10416x = 0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f10418z = false;
    public int A = 0;

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        b F = this.f10417y.F();
        if (F == null) {
            int i6 = this.f10416x - 1;
            this.f10416x = i6;
            if (i6 < 0) {
                super.onBackPressed();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.f10417y = F;
        y yVar = this.f10415w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10417y, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ((ProgressBar) findViewById(R.id.progress_view)).setVisibility(8);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f10418z = extras.getBoolean("Dashboard");
            this.A = extras.getInt("Journal");
        }
        this.f10415w = getSupportFragmentManager();
        u0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.f10417y = bVar;
        y yVar = this.f10415w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10417y, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10416x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10415w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        if (!this.f10418z) {
            Bundle bundle = new Bundle();
            int i6 = this.f10416x;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            n0();
                            return;
                        }
                        bundle.putInt("Gratitude", 3);
                        vq.b bVar = new vq.b();
                        this.f10417y = bVar;
                        bVar.setArguments(bundle);
                    } else {
                        bundle.putInt("Gratitude", 2);
                        vq.b bVar2 = new vq.b();
                        this.f10417y = bVar2;
                        bVar2.setArguments(bundle);
                    }
                } else {
                    bundle.putInt("Gratitude", 1);
                    vq.b bVar3 = new vq.b();
                    this.f10417y = bVar3;
                    bVar3.setArguments(bundle);
                }
            } else {
                this.f10417y = new vq.a();
            }
        } else {
            Bundle bundle2 = new Bundle();
            int i10 = this.A;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        bundle2.putInt("Dash", 3);
                        bundle2.putBoolean("DashBoolean", true);
                        vq.b bVar4 = new vq.b();
                        this.f10417y = bVar4;
                        bVar4.setArguments(bundle2);
                    }
                } else {
                    bundle2.putInt("Dash", 2);
                    bundle2.putBoolean("DashBoolean", true);
                    vq.b bVar5 = new vq.b();
                    this.f10417y = bVar5;
                    bVar5.setArguments(bundle2);
                }
            } else {
                bundle2.putInt("Dash", 1);
                bundle2.putBoolean("DashBoolean", true);
                vq.b bVar6 = new vq.b();
                this.f10417y = bVar6;
                bVar6.setArguments(bundle2);
            }
        }
        l2.f(R.id.root_frame_layout, this.f10417y, null);
        l2.j();
    }
}
