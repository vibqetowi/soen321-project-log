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
import pq.a0;
import pq.f;
import pq.m;
import pq.o;
import pq.p;
import pq.q;
import pq.r;
import pq.s;
import pq.u;
import pq.x;
import rr.a;
import rr.b;
import t0.r0;
import yi.d;
/* compiled from: DepressionMasteryActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DepressionMasteryActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DepressionMasteryActivity extends a {
    public static final /* synthetic */ int F = 0;
    public String A;
    public String B;
    public ArrayList<String> C;
    public ArrayList<String> D;
    public String E;

    /* renamed from: w  reason: collision with root package name */
    public final String f10372w;

    /* renamed from: x  reason: collision with root package name */
    public y f10373x;

    /* renamed from: y  reason: collision with root package name */
    public int f10374y;

    /* renamed from: z  reason: collision with root package name */
    public b f10375z;

    public DepressionMasteryActivity() {
        new LinkedHashMap();
        this.f10372w = LogHelper.INSTANCE.makeLogTag(DepressionMasteryActivity.class);
        this.A = "";
        this.B = "";
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.E = "";
    }

    @Override // rr.a
    public final void o0() {
        try {
            b.a aVar = new b.a(this);
            aVar.f1046a.f1031g = "Are you sure you want to quit this activity?";
            aVar.b("Ok", new g(5, this));
            aVar.a("Cancel", new d(5));
            aVar.create().show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10372w, e10);
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
        this.f10373x = supportFragmentManager;
        w0(false, false);
    }

    @Override // rr.a
    public final void r0(rr.b bVar) {
        this.f10375z = bVar;
        y yVar = this.f10373x;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            rr.b bVar2 = this.f10375z;
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
        this.f10374y++;
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
            LogHelper.INSTANCE.e(this.f10372w, e10);
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
            LogHelper.INSTANCE.e(this.f10372w, "Error in setting custom status bar", e10);
        }
    }

    public final void w0(boolean z10, boolean z11) {
        y yVar = this.f10373x;
        if (yVar != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            if (z11) {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
            v0();
            switch (this.f10374y) {
                case 0:
                    this.f10375z = new pq.i();
                    v0();
                    u0(aVar, false, true);
                    break;
                case 1:
                    this.f10375z = new pq.i();
                    v0();
                    u0(aVar, true, true);
                    break;
                case 2:
                    this.f10375z = new p();
                    v0();
                    u0(aVar, false, true);
                    break;
                case 3:
                    this.f10375z = new o();
                    v0();
                    u0(aVar, false, true);
                    break;
                case 4:
                    this.f10375z = new s();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle = new Bundle();
                    bundle.putInt("separator", 1);
                    rr.b bVar = this.f10375z;
                    if (bVar != null) {
                        bVar.setArguments(bundle);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 5:
                    this.f10375z = new f();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("info", 1);
                    rr.b bVar2 = this.f10375z;
                    if (bVar2 != null) {
                        bVar2.setArguments(bundle2);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 6:
                    this.f10375z = new a0();
                    v0();
                    u0(aVar, false, true);
                    break;
                case 7:
                    this.f10375z = new f();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("info", 2);
                    rr.b bVar3 = this.f10375z;
                    if (bVar3 != null) {
                        bVar3.setArguments(bundle3);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 8:
                    this.f10375z = new x();
                    v0();
                    u0(aVar, false, true);
                    break;
                case 9:
                    this.f10375z = new s();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("separator", 2);
                    rr.b bVar4 = this.f10375z;
                    if (bVar4 != null) {
                        bVar4.setArguments(bundle4);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 10:
                    this.f10375z = new m();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle5 = new Bundle();
                    bundle5.putInt("multiSelect", 1);
                    rr.b bVar5 = this.f10375z;
                    if (bVar5 != null) {
                        bVar5.setArguments(bundle5);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 11:
                    this.f10375z = new s();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle6 = new Bundle();
                    bundle6.putInt("separator", 3);
                    rr.b bVar6 = this.f10375z;
                    if (bVar6 != null) {
                        bVar6.setArguments(bundle6);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 12:
                    this.f10375z = new m();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle7 = new Bundle();
                    bundle7.putInt("multiSelect", 2);
                    rr.b bVar7 = this.f10375z;
                    if (bVar7 != null) {
                        bVar7.setArguments(bundle7);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 13:
                    this.f10375z = new s();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle8 = new Bundle();
                    bundle8.putInt("separator", 4);
                    rr.b bVar8 = this.f10375z;
                    if (bVar8 != null) {
                        bVar8.setArguments(bundle8);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 14:
                    this.f10375z = new pq.y();
                    v0();
                    u0(aVar, false, true);
                    break;
                case 15:
                    this.f10375z = new u();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle9 = new Bundle();
                    bundle9.putInt("prompt", 1);
                    rr.b bVar9 = this.f10375z;
                    if (bVar9 != null) {
                        bVar9.setArguments(bundle9);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 16:
                    this.f10375z = new u();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle10 = new Bundle();
                    bundle10.putInt("prompt", 2);
                    rr.b bVar10 = this.f10375z;
                    if (bVar10 != null) {
                        bVar10.setArguments(bundle10);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 17:
                    this.f10375z = new u();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle11 = new Bundle();
                    bundle11.putInt("prompt", 3);
                    rr.b bVar11 = this.f10375z;
                    if (bVar11 != null) {
                        bVar11.setArguments(bundle11);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 18:
                    this.f10375z = new u();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle12 = new Bundle();
                    bundle12.putInt("prompt", 4);
                    rr.b bVar12 = this.f10375z;
                    if (bVar12 != null) {
                        bVar12.setArguments(bundle12);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 19:
                    this.f10375z = new f();
                    v0();
                    u0(aVar, false, true);
                    Bundle bundle13 = new Bundle();
                    bundle13.putInt("info", 3);
                    rr.b bVar13 = this.f10375z;
                    if (bVar13 != null) {
                        bVar13.setArguments(bundle13);
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 20:
                    this.f10375z = new pq.b();
                    v0();
                    u0(aVar, false, true);
                    break;
                case 21:
                    this.f10375z = new q();
                    v0();
                    u0(aVar, false, true);
                    break;
                case 22:
                    this.f10375z = new pq.d();
                    v0();
                    u0(aVar, false, true);
                    break;
                case 23:
                    this.f10375z = new r();
                    v0();
                    u0(aVar, false, true);
                    break;
                case 24:
                    this.f10375z = new nq.s();
                    v0();
                    u0(aVar, false, true);
                    break;
                default:
                    n0();
                    return;
            }
            rr.b bVar14 = this.f10375z;
            if (bVar14 != null) {
                aVar.f(R.id.root_frame_layout, bVar14, null);
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
