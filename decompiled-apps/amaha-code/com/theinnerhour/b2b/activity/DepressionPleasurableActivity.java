package com.theinnerhour.b2b.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import g6.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import nq.u;
import qq.a0;
import qq.b0;
import qq.c;
import qq.e;
import qq.l;
import qq.m;
import qq.o;
import qq.p;
import qq.r;
import qq.s;
import qq.x;
import qq.z;
import rr.a;
import rr.b;
import t0.r0;
import yi.d;
/* compiled from: DepressionPleasurableActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DepressionPleasurableActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DepressionPleasurableActivity extends a {
    public static final /* synthetic */ int G = 0;
    public final ArrayList<String> A;
    public final ArrayList<String> B;
    public String C;
    public String D;
    public boolean E;
    public boolean F;

    /* renamed from: w  reason: collision with root package name */
    public int f10376w;

    /* renamed from: x  reason: collision with root package name */
    public y f10377x;

    /* renamed from: y  reason: collision with root package name */
    public b f10378y;

    /* renamed from: z  reason: collision with root package name */
    public final String f10379z;

    public DepressionPleasurableActivity() {
        new LinkedHashMap();
        this.f10379z = LogHelper.INSTANCE.makeLogTag(DepressionPleasurableActivity.class);
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        this.C = "";
        this.D = "";
        this.E = true;
        this.F = true;
    }

    @Override // rr.a
    public final void o0() {
        try {
            b.a aVar = new b.a(this);
            aVar.f1046a.f1031g = "Are you sure you want to quit this activity?";
            aVar.b("Ok", new g(6, this));
            aVar.a("Cancel", new d(6));
            aVar.create().show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10379z, e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        o0();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_depression_pleasurable);
        r0.a(getWindow(), false);
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10377x = supportFragmentManager;
        w0(false, true);
    }

    @Override // rr.a
    public final void t0() {
        this.f10376w++;
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
            LogHelper.INSTANCE.e(this.f10379z, e10);
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
            LogHelper.INSTANCE.e(this.f10379z, "Error in setting custom status bar", e10);
        }
    }

    public final void w0(boolean z10, boolean z11) {
        rr.b oVar;
        rr.b rVar;
        rr.b iVar;
        rr.b bVar;
        rr.b a0Var;
        try {
            y yVar = this.f10377x;
            if (yVar != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                switch (this.f10376w) {
                    case 0:
                        this.f10378y = new l();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 1:
                        this.f10378y = new l();
                        v0();
                        u0(aVar, true, true);
                        break;
                    case 2:
                        this.f10378y = new l();
                        v0();
                        u0(aVar, true, true);
                        break;
                    case 3:
                        this.f10378y = new a0();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 4:
                        this.f10378y = new x();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 5:
                        this.f10378y = new qq.i();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 6:
                        this.f10378y = new qq.i();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 7:
                        this.f10378y = new qq.i();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 8:
                        this.f10378y = new qq.i();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 9:
                        this.f10378y = new z();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 10:
                        if (this.E) {
                            oVar = new e();
                        } else {
                            oVar = new o();
                        }
                        this.f10378y = oVar;
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 11:
                        if (this.E) {
                            rVar = new c();
                        } else {
                            rVar = new r();
                        }
                        this.f10378y = rVar;
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 12:
                        if (this.E) {
                            iVar = new a0();
                        } else {
                            iVar = new qq.i();
                        }
                        this.f10378y = iVar;
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 13:
                        if (this.E) {
                            bVar = new p();
                        } else {
                            bVar = new qq.b();
                        }
                        this.f10378y = bVar;
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 14:
                        if (this.E) {
                            this.f10378y = new b0();
                            v0();
                            u0(aVar, false, true);
                            break;
                        } else if (this.F) {
                            this.f10378y = new hq.e();
                            v0();
                            u0(aVar, false, true);
                            break;
                        } else {
                            this.f10378y = new m();
                            v0();
                            u0(aVar, false, true);
                            break;
                        }
                    case 15:
                        if (this.E) {
                            a0Var = new qq.d();
                        } else {
                            a0Var = new a0();
                        }
                        this.f10378y = a0Var;
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 16:
                        this.f10378y = new qq.g();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 17:
                        this.f10378y = new s();
                        v0();
                        u0(aVar, false, true);
                        break;
                    case 18:
                        this.f10378y = new u();
                        v0();
                        u0(aVar, false, true);
                        break;
                    default:
                        n0();
                        return;
                }
                rr.b bVar2 = this.f10378y;
                if (bVar2 != null) {
                    aVar.f(R.id.pleasurableFragmentContainer, bVar2, null);
                    aVar.j();
                    return;
                }
                i.q("customFragment");
                throw null;
            }
            i.q("fragmentManager");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10379z, e10);
        }
    }
}
