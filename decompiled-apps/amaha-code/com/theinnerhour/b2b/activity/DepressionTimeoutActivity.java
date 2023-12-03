package com.theinnerhour.b2b.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import g6.g;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import rr.b;
import sq.e;
import sq.h;
import sq.j;
import sq.k;
import sq.n;
import sq.r;
import sq.u;
import t0.r0;
import yi.d;
/* compiled from: DepressionTimeoutActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DepressionTimeoutActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DepressionTimeoutActivity extends a {
    public static final /* synthetic */ int C = 0;
    public boolean A;
    public String B;

    /* renamed from: w  reason: collision with root package name */
    public final String f10384w;

    /* renamed from: x  reason: collision with root package name */
    public y f10385x;

    /* renamed from: y  reason: collision with root package name */
    public int f10386y;

    /* renamed from: z  reason: collision with root package name */
    public b f10387z;

    public DepressionTimeoutActivity() {
        new LinkedHashMap();
        this.f10384w = LogHelper.INSTANCE.makeLogTag(DepressionTimeoutActivity.class);
        this.B = "";
    }

    @Override // rr.a
    public final void o0() {
        try {
            b.a aVar = new b.a(this);
            aVar.f1046a.f1031g = "Are you sure you want to quit this activity?";
            aVar.b("Ok", new g(8, this));
            aVar.a("Cancel", new d(8));
            aVar.create().show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10384w, e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        o0();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_depression_mastery);
        r0.a(getWindow(), false);
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10385x = supportFragmentManager;
        w0(false, false);
    }

    @Override // rr.a
    public final void r0(rr.b bVar) {
        this.f10387z = bVar;
        y yVar = this.f10385x;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            rr.b bVar2 = this.f10387z;
            if (bVar2 != null) {
                k10.f(R.id.root_frame_layout, bVar2, null);
                k10.j();
                return;
            }
            i.q("customFragment");
            throw null;
        }
        i.q("fragmentManager");
        throw null;
    }

    @Override // rr.a
    public final void t0() {
        this.f10386y++;
        w0(false, true);
    }

    public final void u0(androidx.fragment.app.a aVar, boolean z10, boolean z11) {
        try {
            if (z10) {
                aVar.h(R.anim.fade_in_activity, R.anim.fade_out_activity, 0, 0);
            } else if (z10) {
                aVar.h(R.anim.fade_in_activity, R.anim.fade_out_activity, 0, 0);
            } else {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10384w, e10);
        }
    }

    public final void v0() {
        try {
            Window window = getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            } else {
                window.setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10384w, "Error in setting custom status bar", e10);
        }
    }

    public final void w0(boolean z10, boolean z11) {
        y yVar = this.f10385x;
        if (yVar != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            v0();
            switch (this.f10386y) {
                case 0:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new h();
                    break;
                case 1:
                    v0();
                    u0(aVar, true, true);
                    this.f10387z = new h();
                    break;
                case 2:
                    v0();
                    u0(aVar, true, true);
                    this.f10387z = new h();
                    break;
                case 3:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new k();
                    break;
                case 4:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new u();
                    break;
                case 5:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new n();
                    Bundle k10 = c.k("prompt", 1);
                    rr.b bVar = this.f10387z;
                    if (bVar != null) {
                        bVar.setArguments(k10);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 6:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new n();
                    Bundle k11 = c.k("prompt", 2);
                    rr.b bVar2 = this.f10387z;
                    if (bVar2 != null) {
                        bVar2.setArguments(k11);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 7:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new n();
                    Bundle k12 = c.k("prompt", 3);
                    rr.b bVar3 = this.f10387z;
                    if (bVar3 != null) {
                        bVar3.setArguments(k12);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 8:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new e();
                    break;
                case 9:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new r();
                    break;
                case 10:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new sq.i();
                    break;
                case 11:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new sq.d();
                    break;
                case 12:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new j();
                    break;
                case 13:
                    v0();
                    u0(aVar, false, true);
                    this.f10387z = new sq.b();
                    break;
                default:
                    n0();
                    return;
            }
            rr.b bVar4 = this.f10387z;
            if (bVar4 != null) {
                aVar.f(R.id.root_frame_layout, bVar4, null);
                aVar.j();
                return;
            }
            i.q("customFragment");
            throw null;
        }
        i.q("fragmentManager");
        throw null;
    }
}
