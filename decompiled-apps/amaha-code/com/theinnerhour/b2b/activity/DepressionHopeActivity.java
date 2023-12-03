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
import oq.c;
import oq.j;
import oq.m;
import oq.n;
import oq.o;
import oq.q;
import oq.r;
import oq.s;
import oq.u;
import rr.a;
import rr.b;
import t0.r0;
import yi.d;
/* compiled from: DepressionHopeActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DepressionHopeActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DepressionHopeActivity extends a {
    public static final /* synthetic */ int C = 0;
    public ArrayList<String> A;
    public final ArrayList<String> B;

    /* renamed from: w  reason: collision with root package name */
    public final String f10368w;

    /* renamed from: x  reason: collision with root package name */
    public y f10369x;

    /* renamed from: y  reason: collision with root package name */
    public int f10370y;

    /* renamed from: z  reason: collision with root package name */
    public b f10371z;

    public DepressionHopeActivity() {
        new LinkedHashMap();
        this.f10368w = LogHelper.INSTANCE.makeLogTag(DepressionHopeActivity.class);
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
    }

    @Override // rr.a
    public final void o0() {
        try {
            b.a aVar = new b.a(this);
            aVar.f1046a.f1031g = "Are you sure you want to quit this activity?";
            aVar.b("Ok", new g(4, this));
            aVar.a("Cancel", new d(4));
            aVar.create().show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10368w, e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        o0();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_depression_hope);
        r0.a(getWindow(), false);
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10369x = supportFragmentManager;
        w0(false, false);
    }

    @Override // rr.a
    public final void r0(rr.b bVar) {
        this.f10371z = bVar;
        y yVar = this.f10369x;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            rr.b bVar2 = this.f10371z;
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
        this.f10370y++;
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
            LogHelper.INSTANCE.e(this.f10368w, e10);
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
        } catch (Exception unused) {
        }
    }

    public final void w0(boolean z10, boolean z11) {
        y yVar = this.f10369x;
        if (yVar != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            switch (this.f10370y) {
                case 0:
                    v0();
                    u0(aVar, false, true);
                    oq.g gVar = new oq.g();
                    Bundle bundle = new Bundle();
                    bundle.putInt("Intro", 1);
                    gVar.setArguments(bundle);
                    this.f10371z = gVar;
                    break;
                case 1:
                    v0();
                    u0(aVar, true, true);
                    oq.g gVar2 = new oq.g();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("Intro", 2);
                    gVar2.setArguments(bundle2);
                    this.f10371z = gVar2;
                    break;
                case 2:
                    v0();
                    u0(aVar, true, true);
                    oq.g gVar3 = new oq.g();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("Intro", 3);
                    gVar3.setArguments(bundle3);
                    this.f10371z = gVar3;
                    break;
                case 3:
                    v0();
                    u0(aVar, false, true);
                    u uVar = new u();
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("Wait", 1);
                    uVar.setArguments(bundle4);
                    this.f10371z = uVar;
                    break;
                case 4:
                    v0();
                    u0(aVar, false, true);
                    this.f10371z = new c();
                    break;
                case 5:
                    v0();
                    u0(aVar, false, true);
                    this.f10371z = new oq.d();
                    break;
                case 6:
                    v0();
                    u0(aVar, false, true);
                    this.f10371z = new r();
                    break;
                case 7:
                    v0();
                    u0(aVar, false, true);
                    s sVar = new s();
                    Bundle bundle5 = new Bundle();
                    bundle5.putInt("Wait2", 1);
                    sVar.setArguments(bundle5);
                    this.f10371z = sVar;
                    break;
                case 8:
                    v0();
                    u0(aVar, false, true);
                    s sVar2 = new s();
                    Bundle bundle6 = new Bundle();
                    bundle6.putInt("Wait2", 2);
                    sVar2.setArguments(bundle6);
                    this.f10371z = sVar2;
                    break;
                case 9:
                    v0();
                    u0(aVar, false, true);
                    j jVar = new j();
                    Bundle bundle7 = new Bundle();
                    bundle7.putInt("Part1", 1);
                    jVar.setArguments(bundle7);
                    this.f10371z = jVar;
                    break;
                case 10:
                    v0();
                    u0(aVar, false, true);
                    u uVar2 = new u();
                    Bundle bundle8 = new Bundle();
                    bundle8.putInt("Wait", 2);
                    uVar2.setArguments(bundle8);
                    this.f10371z = uVar2;
                    break;
                case 11:
                    v0();
                    u0(aVar, false, true);
                    u uVar3 = new u();
                    Bundle bundle9 = new Bundle();
                    bundle9.putInt("Wait", 3);
                    uVar3.setArguments(bundle9);
                    this.f10371z = uVar3;
                    break;
                case 12:
                    v0();
                    u0(aVar, false, true);
                    this.f10371z = new m();
                    break;
                case 13:
                    v0();
                    u0(aVar, false, true);
                    j jVar2 = new j();
                    Bundle bundle10 = new Bundle();
                    bundle10.putInt("Part1", 2);
                    jVar2.setArguments(bundle10);
                    this.f10371z = jVar2;
                    break;
                case 14:
                    v0();
                    u0(aVar, false, true);
                    j jVar3 = new j();
                    Bundle bundle11 = new Bundle();
                    bundle11.putInt("Part1", 3);
                    jVar3.setArguments(bundle11);
                    this.f10371z = jVar3;
                    break;
                case 15:
                    v0();
                    u0(aVar, false, true);
                    j jVar4 = new j();
                    Bundle bundle12 = new Bundle();
                    bundle12.putInt("Part1", 4);
                    jVar4.setArguments(bundle12);
                    this.f10371z = jVar4;
                    break;
                case 16:
                    v0();
                    u0(aVar, false, true);
                    q qVar = new q();
                    Bundle bundle13 = new Bundle();
                    bundle13.putInt("Say", 1);
                    qVar.setArguments(bundle13);
                    this.f10371z = qVar;
                    break;
                case 17:
                    v0();
                    u0(aVar, false, true);
                    u uVar4 = new u();
                    Bundle bundle14 = new Bundle();
                    bundle14.putInt("Wait", 4);
                    uVar4.setArguments(bundle14);
                    this.f10371z = uVar4;
                    break;
                case 18:
                    v0();
                    u0(aVar, false, true);
                    q qVar2 = new q();
                    Bundle bundle15 = new Bundle();
                    bundle15.putInt("Say", 2);
                    qVar2.setArguments(bundle15);
                    this.f10371z = qVar2;
                    break;
                case 19:
                    v0();
                    u0(aVar, false, true);
                    u uVar5 = new u();
                    Bundle bundle16 = new Bundle();
                    bundle16.putInt("Wait", 5);
                    uVar5.setArguments(bundle16);
                    this.f10371z = uVar5;
                    break;
                case 20:
                    v0();
                    u0(aVar, false, true);
                    q qVar3 = new q();
                    Bundle bundle17 = new Bundle();
                    bundle17.putInt("Say", 3);
                    qVar3.setArguments(bundle17);
                    this.f10371z = qVar3;
                    break;
                case 21:
                    v0();
                    u0(aVar, false, true);
                    u uVar6 = new u();
                    Bundle bundle18 = new Bundle();
                    bundle18.putInt("Wait", 6);
                    uVar6.setArguments(bundle18);
                    this.f10371z = uVar6;
                    break;
                case 22:
                    v0();
                    u0(aVar, false, true);
                    this.f10371z = new n();
                    break;
                case 23:
                    v0();
                    u0(aVar, false, true);
                    this.f10371z = new o();
                    break;
                case 24:
                    v0();
                    u0(aVar, false, true);
                    this.f10371z = new oq.b();
                    break;
                default:
                    n0();
                    return;
            }
            rr.b bVar = this.f10371z;
            if (bVar != null) {
                aVar.f(R.id.root_frame_layout, bVar, null);
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
