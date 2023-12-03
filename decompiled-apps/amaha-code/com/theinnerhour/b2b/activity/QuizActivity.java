package com.theinnerhour.b2b.activity;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import rr.a;
import rr.b;
/* loaded from: classes2.dex */
public class QuizActivity extends a {

    /* renamed from: w  reason: collision with root package name */
    public y f10470w;

    /* renamed from: x  reason: collision with root package name */
    public int f10471x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10472y = 0;

    /* renamed from: z  reason: collision with root package name */
    public b f10473z;

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        b F = this.f10473z.F();
        if (F == null) {
            int i6 = this.f10471x - 1;
            this.f10471x = i6;
            if (i6 < this.f10472y) {
                super.onBackPressed();
                return;
            } else {
                u0(true, true);
                return;
            }
        }
        this.f10473z = F;
        y yVar = this.f10470w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10473z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_activities);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_orange));
        ((ProgressBar) findViewById(R.id.progress_view)).setVisibility(8);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10472y = i6;
            this.f10471x = i6;
        }
        this.f10470w = getSupportFragmentManager();
        u0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.f10473z = bVar;
        y yVar = this.f10470w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10473z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10471x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10470w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        if (this.f10471x != 0) {
            n0();
            return;
        }
        ar.a aVar = new ar.a();
        this.f10473z = aVar;
        l2.f(R.id.root_frame_layout, aVar, null);
        l2.j();
    }
}
