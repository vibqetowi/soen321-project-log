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
import rq.c;
import rq.e;
import rq.h;
import rq.j;
import rq.k;
import rq.l;
import rq.n;
import rq.o;
import rq.p;
import rq.q;
import rq.t;
import rq.u;
import rr.a;
import rr.b;
import t0.r0;
import yi.d;
/* compiled from: DepressionThoughtsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DepressionThoughtsActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DepressionThoughtsActivity extends a {
    public static final /* synthetic */ int E = 0;
    public String A;
    public String B;
    public String C;
    public final ArrayList<String> D;

    /* renamed from: w  reason: collision with root package name */
    public final String f10380w;

    /* renamed from: x  reason: collision with root package name */
    public y f10381x;

    /* renamed from: y  reason: collision with root package name */
    public int f10382y;

    /* renamed from: z  reason: collision with root package name */
    public b f10383z;

    public DepressionThoughtsActivity() {
        new LinkedHashMap();
        this.f10380w = LogHelper.INSTANCE.makeLogTag(DepressionThoughtsActivity.class);
        this.A = "";
        this.B = "";
        this.C = "";
        this.D = new ArrayList<>();
    }

    @Override // rr.a
    public final void o0() {
        try {
            b.a aVar = new b.a(this);
            aVar.f1046a.f1031g = "Are you sure you want to quit this activity?";
            aVar.b("Ok", new g(7, this));
            aVar.a("Cancel", new d(7));
            aVar.create().show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10380w, e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        o0();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_depression_thoughts);
        r0.a(getWindow(), false);
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10381x = supportFragmentManager;
        w0(false, false);
    }

    @Override // rr.a
    public final void r0(rr.b bVar) {
        this.f10383z = bVar;
        y yVar = this.f10381x;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            rr.b bVar2 = this.f10383z;
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
        this.f10382y++;
        w0(false, true);
    }

    public final void u0(androidx.fragment.app.a aVar, boolean z10, boolean z11) {
        try {
            aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10380w, e10);
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
        y yVar = this.f10381x;
        if (yVar != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            switch (this.f10382y) {
                case 0:
                    v0();
                    this.f10383z = new h();
                    u0(aVar, false, true);
                    break;
                case 1:
                    v0();
                    u0(aVar, false, true);
                    u uVar = new u();
                    Bundle bundle = new Bundle();
                    bundle.putInt("Wait", 1);
                    uVar.setArguments(bundle);
                    this.f10383z = uVar;
                    break;
                case 2:
                    v0();
                    u0(aVar, false, true);
                    u uVar2 = new u();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("Wait", 2);
                    uVar2.setArguments(bundle2);
                    this.f10383z = uVar2;
                    break;
                case 3:
                    v0();
                    u0(aVar, false, true);
                    this.f10383z = new l();
                    break;
                case 4:
                    v0();
                    u0(aVar, false, true);
                    this.f10383z = new p();
                    break;
                case 5:
                    v0();
                    u0(aVar, false, true);
                    u uVar3 = new u();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("Wait", 3);
                    uVar3.setArguments(bundle3);
                    this.f10383z = uVar3;
                    break;
                case 6:
                    v0();
                    u0(aVar, false, true);
                    u uVar4 = new u();
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("Wait", 4);
                    uVar4.setArguments(bundle4);
                    this.f10383z = uVar4;
                    break;
                case 7:
                    v0();
                    u0(aVar, false, true);
                    u uVar5 = new u();
                    Bundle bundle5 = new Bundle();
                    bundle5.putInt("Wait", 5);
                    uVar5.setArguments(bundle5);
                    this.f10383z = uVar5;
                    break;
                case 8:
                    v0();
                    u0(aVar, false, true);
                    u uVar6 = new u();
                    Bundle bundle6 = new Bundle();
                    bundle6.putInt("Wait", 6);
                    uVar6.setArguments(bundle6);
                    this.f10383z = uVar6;
                    break;
                case 9:
                    v0();
                    u0(aVar, false, true);
                    rq.i iVar = new rq.i();
                    Bundle bundle7 = new Bundle();
                    bundle7.putInt("Reflection", 1);
                    iVar.setArguments(bundle7);
                    this.f10383z = iVar;
                    break;
                case 10:
                    v0();
                    u0(aVar, false, true);
                    rq.i iVar2 = new rq.i();
                    Bundle bundle8 = new Bundle();
                    bundle8.putInt("Reflection", 2);
                    iVar2.setArguments(bundle8);
                    this.f10383z = iVar2;
                    break;
                case 11:
                    v0();
                    u0(aVar, false, true);
                    u uVar7 = new u();
                    Bundle bundle9 = new Bundle();
                    bundle9.putInt("Wait", 7);
                    uVar7.setArguments(bundle9);
                    this.f10383z = uVar7;
                    break;
                case 12:
                    v0();
                    u0(aVar, false, true);
                    rq.i iVar3 = new rq.i();
                    Bundle bundle10 = new Bundle();
                    bundle10.putInt("Reflection", 3);
                    iVar3.setArguments(bundle10);
                    this.f10383z = iVar3;
                    break;
                case 13:
                    v0();
                    u0(aVar, false, true);
                    this.f10383z = new c();
                    break;
                case 14:
                    v0();
                    u0(aVar, false, true);
                    q qVar = new q();
                    Bundle bundle11 = new Bundle();
                    bundle11.putInt("ViewPager", 1);
                    qVar.setArguments(bundle11);
                    this.f10383z = qVar;
                    break;
                case 15:
                    v0();
                    u0(aVar, false, true);
                    rq.b bVar = new rq.b();
                    Bundle bundle12 = new Bundle();
                    bundle12.putInt("Quiz", 1);
                    bVar.setArguments(bundle12);
                    this.f10383z = bVar;
                    break;
                case 16:
                    v0();
                    u0(aVar, false, true);
                    q qVar2 = new q();
                    Bundle bundle13 = new Bundle();
                    bundle13.putInt("ViewPager", 2);
                    qVar2.setArguments(bundle13);
                    this.f10383z = qVar2;
                    break;
                case 17:
                    v0();
                    u0(aVar, false, true);
                    rq.b bVar2 = new rq.b();
                    Bundle bundle14 = new Bundle();
                    bundle14.putInt("Quiz", 2);
                    bVar2.setArguments(bundle14);
                    this.f10383z = bVar2;
                    break;
                case 18:
                    v0();
                    u0(aVar, false, true);
                    q qVar3 = new q();
                    Bundle bundle15 = new Bundle();
                    bundle15.putInt("ViewPager", 3);
                    qVar3.setArguments(bundle15);
                    this.f10383z = qVar3;
                    break;
                case 19:
                    v0();
                    u0(aVar, false, true);
                    rq.b bVar3 = new rq.b();
                    Bundle bundle16 = new Bundle();
                    bundle16.putInt("Quiz", 3);
                    bVar3.setArguments(bundle16);
                    this.f10383z = bVar3;
                    break;
                case 20:
                    v0();
                    u0(aVar, false, true);
                    q qVar4 = new q();
                    Bundle bundle17 = new Bundle();
                    bundle17.putInt("ViewPager", 4);
                    qVar4.setArguments(bundle17);
                    this.f10383z = qVar4;
                    break;
                case 21:
                    v0();
                    u0(aVar, false, true);
                    rq.b bVar4 = new rq.b();
                    Bundle bundle18 = new Bundle();
                    bundle18.putInt("Quiz", 4);
                    bVar4.setArguments(bundle18);
                    this.f10383z = bVar4;
                    break;
                case 22:
                    v0();
                    u0(aVar, false, true);
                    t tVar = new t();
                    Bundle bundle19 = new Bundle();
                    bundle19.putInt("Wait2", 1);
                    tVar.setArguments(bundle19);
                    this.f10383z = tVar;
                    break;
                case 23:
                    v0();
                    u0(aVar, false, true);
                    t tVar2 = new t();
                    Bundle bundle20 = new Bundle();
                    bundle20.putInt("Wait2", 2);
                    tVar2.setArguments(bundle20);
                    this.f10383z = tVar2;
                    break;
                case 24:
                    v0();
                    u0(aVar, false, true);
                    t tVar3 = new t();
                    Bundle bundle21 = new Bundle();
                    bundle21.putInt("Wait2", 3);
                    tVar3.setArguments(bundle21);
                    this.f10383z = tVar3;
                    break;
                case 25:
                    v0();
                    u0(aVar, false, true);
                    t tVar4 = new t();
                    Bundle bundle22 = new Bundle();
                    bundle22.putInt("Wait2", 4);
                    tVar4.setArguments(bundle22);
                    this.f10383z = tVar4;
                    break;
                case 26:
                    v0();
                    u0(aVar, false, true);
                    n nVar = new n();
                    Bundle bundle23 = new Bundle();
                    bundle23.putInt("Situation", 1);
                    nVar.setArguments(bundle23);
                    this.f10383z = nVar;
                    break;
                case 27:
                    v0();
                    u0(aVar, false, true);
                    this.f10383z = new rq.g();
                    break;
                case 28:
                    v0();
                    u0(aVar, false, true);
                    n nVar2 = new n();
                    Bundle bundle24 = new Bundle();
                    bundle24.putInt("Situation", 2);
                    nVar2.setArguments(bundle24);
                    this.f10383z = nVar2;
                    break;
                case 29:
                    v0();
                    u0(aVar, false, true);
                    this.f10383z = new o();
                    break;
                case com.appsflyer.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    v0();
                    u0(aVar, false, true);
                    u uVar8 = new u();
                    Bundle bundle25 = new Bundle();
                    bundle25.putInt("Wait", 8);
                    uVar8.setArguments(bundle25);
                    this.f10383z = uVar8;
                    break;
                case com.appsflyer.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    v0();
                    u0(aVar, false, true);
                    u uVar9 = new u();
                    Bundle bundle26 = new Bundle();
                    bundle26.putInt("Wait", 9);
                    uVar9.setArguments(bundle26);
                    this.f10383z = uVar9;
                    break;
                case 32:
                    v0();
                    u0(aVar, false, true);
                    this.f10383z = new j();
                    break;
                case com.appsflyer.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    v0();
                    u0(aVar, false, true);
                    this.f10383z = new k();
                    break;
                case com.appsflyer.R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    v0();
                    u0(aVar, false, true);
                    this.f10383z = new e();
                    break;
                default:
                    n0();
                    return;
            }
            rr.b bVar5 = this.f10383z;
            if (bVar5 != null) {
                aVar.f(R.id.root_frame_layout, bVar5, null);
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
