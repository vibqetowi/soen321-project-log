package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import ir.e;
import ir.f;
import ir.g;
import ir.h;
import ir.i;
import ir.j;
import rr.b;
/* loaded from: classes2.dex */
public class ThoughtsActivity extends c {
    public static String B = "work";
    public static String C = "I can usually tell what someone is thinking about me.";
    public ProgressBar A;

    /* renamed from: v  reason: collision with root package name */
    public y f10551v;

    /* renamed from: y  reason: collision with root package name */
    public b f10554y;

    /* renamed from: w  reason: collision with root package name */
    public int f10552w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f10553x = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f10555z = 0;

    public final void n0() {
        int i6 = this.f10555z + 1;
        this.f10555z = i6;
        this.A.setProgress(i6);
    }

    public final void o0() {
        n0();
        this.f10552w++;
        p0(false, true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.f10555z - 1;
        this.f10555z = i6;
        this.A.setProgress(i6);
        b F = this.f10554y.F();
        if (F == null) {
            if (this.f10554y.I()) {
                int i10 = this.f10552w - 1;
                this.f10552w = i10;
                if (i10 < this.f10553x) {
                    super.onBackPressed();
                    return;
                } else {
                    p0(true, true);
                    return;
                }
            }
            return;
        }
        this.f10554y = F;
        y yVar = this.f10551v;
        a l2 = e.l(yVar, yVar);
        l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        l2.f(R.id.root_frame_layout, this.f10554y, null);
        l2.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_thoughts);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_view);
        this.A = progressBar;
        progressBar.setMax(20);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt("assesment_pos", 0);
            this.f10553x = i6;
            this.f10552w = i6;
        }
        this.f10551v = getSupportFragmentManager();
        p0(false, false);
    }

    public final void p0(boolean z10, boolean z11) {
        y yVar = this.f10551v;
        a l2 = e.l(yVar, yVar);
        if (z11) {
            if (z10) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        switch (this.f10552w) {
            case 0:
                this.f10554y = new i();
                this.f10554y.setArguments(c.k("screen_pos", 1));
                break;
            case 1:
                this.f10554y = new j();
                break;
            case 2:
                this.f10554y = new i();
                this.f10554y.setArguments(c.k("screen_pos", 2));
                break;
            case 3:
                this.f10554y = new e();
                break;
            case 4:
                this.f10554y = new f();
                break;
            case 5:
                this.f10554y = new g();
                break;
            case 6:
                this.f10554y = new h();
                break;
            case 7:
                this.f10554y = new ir.c();
                break;
            case 8:
                this.f10554y = new i();
                this.f10554y.setArguments(c.k("screen_pos", 3));
                break;
            case 9:
                this.f10554y = new ir.a();
                break;
            default:
                if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.COMPLETED_THOUGHTS_FLOW_BADGE)) {
                    FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().put(Constants.COMPLETED_THOUGHTS_FLOW_BADGE, Constants.BADGE_ATTAINED);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
                setResult(-1, new Intent());
                finish();
                break;
        }
        l2.f(R.id.root_frame_layout, this.f10554y, null);
        l2.j();
    }
}
