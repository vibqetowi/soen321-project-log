package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.b;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import g6.g;
import rr.a;
import rr.b;
import yi.d;
/* loaded from: classes2.dex */
public class ActivitiesInfoActivity extends a {
    public static final /* synthetic */ int A = 0;

    /* renamed from: w  reason: collision with root package name */
    public y f10288w;

    /* renamed from: x  reason: collision with root package name */
    public int f10289x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10290y = 0;

    /* renamed from: z  reason: collision with root package name */
    public b f10291z;

    @Override // rr.a
    public final void o0() {
        b.a aVar = new b.a(this);
        aVar.f1046a.f1031g = "Are you sure you want to exit?";
        aVar.b("Ok", new g(1, this));
        aVar.a("Cancel", new d(1));
        aVar.create().show();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f10288w.H() > 0) {
            this.f10288w.Y();
            return;
        }
        rr.b F = this.f10291z.F();
        if (F == null) {
            int i6 = this.f10289x - 1;
            this.f10289x = i6;
            if (i6 < this.f10290y) {
                if (getIntent().hasExtra("source")) {
                    o0();
                    return;
                } else {
                    n0();
                    return;
                }
            }
            u0(true, true);
            return;
        }
        this.f10291z = F;
        y yVar = this.f10288w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10291z, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_coping);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        findViewById(R.id.progress_view).setVisibility(8);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10290y = i6;
            this.f10289x = i6;
        }
        this.f10288w = getSupportFragmentManager();
        u0(false, false);
        Bundle bundle2 = new Bundle();
        if (FirebasePersistence.getInstance().getUser() != null && b.g() != null) {
            d.m(bundle2, "course");
        }
        gk.a.b(bundle2, "activity_detail");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(bundle);
    }

    @Override // rr.a
    public final void r0(rr.b bVar) {
        this.f10291z = bVar;
        y yVar = this.f10288w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10291z, null);
        l2.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10289x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10288w;
        androidx.fragment.app.a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        if (this.f10289x != 0) {
            n0();
            return;
        }
        this.f10291z = new com.theinnerhour.b2b.fragment.coping.a();
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putBoolean("showFeedback", true);
        this.f10291z.setArguments(extras);
        l2.f(R.id.root_frame_layout, this.f10291z, null);
        l2.j();
    }
}
