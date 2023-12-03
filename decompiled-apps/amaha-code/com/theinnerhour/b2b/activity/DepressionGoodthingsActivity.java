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
import nq.c;
import nq.e;
import nq.h;
import nq.k;
import nq.l;
import nq.o;
import nq.p;
import nq.q;
import rr.a;
import rr.b;
import t0.r0;
import yi.d;
/* compiled from: DepressionGoodthingsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DepressionGoodthingsActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DepressionGoodthingsActivity extends a {
    public static final /* synthetic */ int D = 0;
    public String A;
    public String B;
    public final String C;

    /* renamed from: w  reason: collision with root package name */
    public int f10364w;

    /* renamed from: x  reason: collision with root package name */
    public y f10365x;

    /* renamed from: y  reason: collision with root package name */
    public b f10366y;

    /* renamed from: z  reason: collision with root package name */
    public String f10367z;

    public DepressionGoodthingsActivity() {
        new LinkedHashMap();
        this.f10367z = "";
        this.A = "";
        this.B = "";
        this.C = LogHelper.INSTANCE.makeLogTag(DepressionGoodthingsActivity.class);
    }

    @Override // rr.a
    public final void o0() {
        try {
            b.a aVar = new b.a(this);
            aVar.f1046a.f1031g = "Are you sure you want to quit this activity?";
            aVar.b("Ok", new g(3, this));
            aVar.a("Cancel", new d(3));
            aVar.create().show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        o0();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_depression_goodthings);
        r0.a(getWindow(), false);
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10365x = supportFragmentManager;
        w0(false, true);
    }

    @Override // rr.a
    public final void t0() {
        this.f10364w++;
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
            LogHelper.INSTANCE.e(this.C, e10);
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
            LogHelper.INSTANCE.e(this.C, "Error in setting custom status bar", e10);
        }
    }

    public final void w0(boolean z10, boolean z11) {
        try {
            y yVar = this.f10365x;
            if (yVar != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                switch (this.f10364w) {
                    case 0:
                        this.f10366y = new k();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 1:
                        this.f10366y = new k();
                        v0();
                        u0(aVar, true, true);
                        break;
                    case 2:
                        this.f10366y = new k();
                        v0();
                        u0(aVar, true, true);
                        break;
                    case 3:
                        this.f10366y = new o();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 4:
                        this.f10366y = new q();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 5:
                        this.f10366y = new o();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 6:
                        this.f10366y = new q();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 7:
                        this.f10366y = new q();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 8:
                        this.f10366y = new p();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 9:
                        this.f10366y = new h();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 10:
                        this.f10366y = new h();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 11:
                        this.f10366y = new c();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 12:
                        this.f10366y = new e();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 13:
                        this.f10366y = new l();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 14:
                        this.f10366y = new nq.b();
                        v0();
                        u0(aVar, false, true);
                        break;
                    default:
                        n0();
                        return;
                }
                rr.b bVar = this.f10366y;
                if (bVar != null) {
                    aVar.f(R.id.fragmentContainer, bVar, null);
                    aVar.j();
                    return;
                }
                i.q("customFragment");
                throw null;
            }
            i.q("fragmentManager");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, e10);
        }
    }
}
