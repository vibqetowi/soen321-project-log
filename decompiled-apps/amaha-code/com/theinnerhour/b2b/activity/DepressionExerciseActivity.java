package com.theinnerhour.b2b.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import g6.g;
import hs.k;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import mq.c;
import mq.e;
import mq.j;
import mq.n;
import mq.o;
import mq.p;
import mq.q;
import mq.s;
import rr.a;
import rr.b;
import t0.r0;
import yi.d;
/* compiled from: DepressionExerciseActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DepressionExerciseActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DepressionExerciseActivity extends a {
    public static final /* synthetic */ int C = 0;
    public b A;
    public boolean B;

    /* renamed from: w  reason: collision with root package name */
    public final String f10360w;

    /* renamed from: x  reason: collision with root package name */
    public String f10361x;

    /* renamed from: y  reason: collision with root package name */
    public y f10362y;

    /* renamed from: z  reason: collision with root package name */
    public int f10363z;

    public DepressionExerciseActivity() {
        new LinkedHashMap();
        this.f10360w = LogHelper.INSTANCE.makeLogTag(DepressionExerciseActivity.class);
        this.f10361x = "";
    }

    @Override // rr.a
    public final void o0() {
        try {
            b.a aVar = new b.a(this);
            aVar.f1046a.f1031g = "Are you sure you want to quit this activity?";
            aVar.b("Ok", new g(2, this));
            aVar.a("Cancel", new d(2));
            aVar.create().show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10360w, e10);
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
        this.f10362y = supportFragmentManager;
        w0(false, false);
    }

    @Override // rr.a
    public final void r0(rr.b bVar) {
        this.A = bVar;
        y yVar = this.f10362y;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            rr.b bVar2 = this.A;
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
        this.f10363z++;
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
            LogHelper.INSTANCE.e(this.f10360w, e10);
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
            LogHelper.INSTANCE.e(this.f10360w, "Error in setting custom status bar", e10);
        }
    }

    public final void w0(boolean z10, boolean z11) {
        y yVar = this.f10362y;
        if (yVar != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            v0();
            switch (this.f10363z) {
                case 0:
                    this.A = new j();
                    v0();
                    u0(aVar, false, true);
                    k kVar = k.f19476a;
                    break;
                case 1:
                    this.A = new j();
                    v0();
                    u0(aVar, true, true);
                    k kVar2 = k.f19476a;
                    break;
                case 2:
                    this.A = new mq.k();
                    v0();
                    u0(aVar, false, true);
                    k kVar3 = k.f19476a;
                    break;
                case 3:
                    this.A = new q();
                    v0();
                    u0(aVar, false, true);
                    k kVar4 = k.f19476a;
                    break;
                case 4:
                    this.A = new mq.g();
                    v0();
                    u0(aVar, false, true);
                    k kVar5 = k.f19476a;
                    break;
                case 5:
                    this.A = new s();
                    Bundle c10 = d.c(this, aVar, false, true);
                    c10.putInt("set", 1);
                    rr.b bVar = this.A;
                    if (bVar != null) {
                        bVar.setArguments(c10);
                        k kVar6 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 6:
                    this.A = new mq.a();
                    Bundle c11 = d.c(this, aVar, false, true);
                    c11.putInt("breathing", 1);
                    rr.b bVar2 = this.A;
                    if (bVar2 != null) {
                        bVar2.setArguments(c11);
                        k kVar7 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 7:
                    this.A = new n();
                    Bundle c12 = d.c(this, aVar, false, true);
                    c12.putInt("play", 1);
                    rr.b bVar3 = this.A;
                    if (bVar3 != null) {
                        bVar3.setArguments(c12);
                        k kVar8 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 8:
                    this.A = new n();
                    Bundle c13 = d.c(this, aVar, false, true);
                    c13.putInt("play", 2);
                    rr.b bVar4 = this.A;
                    if (bVar4 != null) {
                        bVar4.setArguments(c13);
                        k kVar9 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 9:
                    this.A = new n();
                    Bundle c14 = d.c(this, aVar, false, true);
                    c14.putInt("play", 3);
                    rr.b bVar5 = this.A;
                    if (bVar5 != null) {
                        bVar5.setArguments(c14);
                        k kVar10 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 10:
                    this.A = new n();
                    Bundle c15 = d.c(this, aVar, false, true);
                    c15.putInt("play", 4);
                    rr.b bVar6 = this.A;
                    if (bVar6 != null) {
                        bVar6.setArguments(c15);
                        k kVar11 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 11:
                    this.A = new n();
                    Bundle c16 = d.c(this, aVar, false, true);
                    c16.putInt("play", 5);
                    rr.b bVar7 = this.A;
                    if (bVar7 != null) {
                        bVar7.setArguments(c16);
                        k kVar12 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 12:
                    this.A = new mq.a();
                    Bundle c17 = d.c(this, aVar, false, true);
                    c17.putInt("breathing", 2);
                    rr.b bVar8 = this.A;
                    if (bVar8 != null) {
                        bVar8.setArguments(c17);
                        k kVar13 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 13:
                    this.A = new s();
                    Bundle c18 = d.c(this, aVar, false, true);
                    c18.putInt("set", 2);
                    rr.b bVar9 = this.A;
                    if (bVar9 != null) {
                        bVar9.setArguments(c18);
                        k kVar14 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 14:
                    this.A = new mq.a();
                    Bundle c19 = d.c(this, aVar, false, true);
                    c19.putInt("breathing", 3);
                    rr.b bVar10 = this.A;
                    if (bVar10 != null) {
                        bVar10.setArguments(c19);
                        k kVar15 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 15:
                    this.A = new n();
                    Bundle c20 = d.c(this, aVar, false, true);
                    c20.putInt("play", 6);
                    rr.b bVar11 = this.A;
                    if (bVar11 != null) {
                        bVar11.setArguments(c20);
                        k kVar16 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 16:
                    this.A = new n();
                    Bundle c21 = d.c(this, aVar, false, true);
                    c21.putInt("play", 7);
                    rr.b bVar12 = this.A;
                    if (bVar12 != null) {
                        bVar12.setArguments(c21);
                        k kVar17 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 17:
                    this.A = new n();
                    Bundle c22 = d.c(this, aVar, false, true);
                    c22.putInt("play", 8);
                    rr.b bVar13 = this.A;
                    if (bVar13 != null) {
                        bVar13.setArguments(c22);
                        k kVar18 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 18:
                    this.A = new mq.a();
                    Bundle c23 = d.c(this, aVar, false, true);
                    c23.putInt("breathing", 4);
                    rr.b bVar14 = this.A;
                    if (bVar14 != null) {
                        bVar14.setArguments(c23);
                        k kVar19 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 19:
                    this.A = new s();
                    Bundle c24 = d.c(this, aVar, false, true);
                    c24.putInt("set", 3);
                    rr.b bVar15 = this.A;
                    if (bVar15 != null) {
                        bVar15.setArguments(c24);
                        k kVar20 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 20:
                    this.A = new mq.a();
                    Bundle c25 = d.c(this, aVar, false, true);
                    c25.putInt("breathing", 5);
                    rr.b bVar16 = this.A;
                    if (bVar16 != null) {
                        bVar16.setArguments(c25);
                        k kVar21 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 21:
                    this.A = new n();
                    Bundle c26 = d.c(this, aVar, false, true);
                    c26.putInt("play", 9);
                    rr.b bVar17 = this.A;
                    if (bVar17 != null) {
                        bVar17.setArguments(c26);
                        k kVar22 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 22:
                    this.A = new n();
                    Bundle c27 = d.c(this, aVar, false, true);
                    c27.putInt("play", 10);
                    rr.b bVar18 = this.A;
                    if (bVar18 != null) {
                        bVar18.setArguments(c27);
                        k kVar23 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 23:
                    this.A = new n();
                    Bundle c28 = d.c(this, aVar, false, true);
                    c28.putInt("play", 11);
                    rr.b bVar19 = this.A;
                    if (bVar19 != null) {
                        bVar19.setArguments(c28);
                        k kVar24 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 24:
                    this.A = new mq.a();
                    Bundle c29 = d.c(this, aVar, false, true);
                    c29.putInt("breathing", 6);
                    rr.b bVar20 = this.A;
                    if (bVar20 != null) {
                        bVar20.setArguments(c29);
                        k kVar25 = k.f19476a;
                        break;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                case 25:
                    this.A = new o();
                    v0();
                    u0(aVar, false, true);
                    k kVar26 = k.f19476a;
                    break;
                case 26:
                    this.A = new e();
                    v0();
                    u0(aVar, false, true);
                    k kVar27 = k.f19476a;
                    break;
                case 27:
                    this.A = new p();
                    v0();
                    u0(aVar, false, true);
                    k kVar28 = k.f19476a;
                    break;
                case 28:
                    this.A = new c();
                    v0();
                    u0(aVar, false, true);
                    k kVar29 = k.f19476a;
                    break;
                default:
                    n0();
                    return;
            }
            rr.b bVar21 = this.A;
            if (bVar21 != null) {
                aVar.f(R.id.root_frame_layout, bVar21, null);
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
