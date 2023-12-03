package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import bl.p;
import bl.q;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import rr.b;
/* compiled from: DailyPlanOverviewV3.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DailyPlanOverviewV3;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DailyPlanOverviewV3 extends a {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;

    /* renamed from: w  reason: collision with root package name */
    public y f10341w;

    /* renamed from: x  reason: collision with root package name */
    public int f10342x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f10343y;

    /* renamed from: z  reason: collision with root package name */
    public b f10344z;

    public DailyPlanOverviewV3() {
        new LinkedHashMap();
        LogHelper.INSTANCE.makeLogTag(DailyPlanOverviewV3.class);
        this.D = -1;
    }

    @Override // rr.a
    public final void n0() {
        Intent intent = new Intent();
        intent.putExtra("tutorial", false);
        intent.putExtra(Constants.DAYMODEL_POSITION, this.D);
        setResult(-1, intent);
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        w0();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i6;
        super.onCreate(bundle);
        setContentView(R.layout.activity_daily_plan_overview);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            boolean z10 = extras.getBoolean("showPlanFirstScreen", false);
            this.f10343y = z10;
            boolean z11 = true;
            if (z10 && ApplicationPersistence.getInstance().getBooleanValue(Constants.getKeyForFirstDay(FirebasePersistence.getInstance().getUser().getCurrentCourseName()), true)) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            this.f10342x = i6;
            if (this.f10343y) {
                ApplicationPersistence.getInstance().getBooleanValue(Constants.getKeyForFirstDay(FirebasePersistence.getInstance().getUser().getCurrentCourseName()), true);
            }
            this.B = extras.getBoolean("tutorial");
            this.D = extras.getInt(Constants.DAYMODEL_POSITION, -1);
            if (extras.getInt(Constants.DAYMODEL_POSITION, -1) <= 30) {
                z11 = false;
            }
            this.C = z11;
        }
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10341w = supportFragmentManager;
        x0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.f10344z = bVar;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), null);
        k10.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10342x++;
        x0(false, true);
    }

    public final b u0() {
        b bVar = this.f10344z;
        if (bVar != null) {
            return bVar;
        }
        i.q("customFragment");
        throw null;
    }

    public final y v0() {
        y yVar = this.f10341w;
        if (yVar != null) {
            return yVar;
        }
        i.q("fragmentManager");
        throw null;
    }

    public final void w0() {
        if (v0().H() > 0) {
            v0().Y();
            return;
        }
        b F = u0().F();
        if (F == null) {
            this.f10342x--;
            if (this.A) {
                n0();
                return;
            } else {
                finish();
                return;
            }
        }
        this.f10344z = F;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), null);
        k10.j();
    }

    public final void x0(boolean z10, boolean z11) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(v0());
        if (z11) {
            aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        }
        int i6 = this.f10342x;
        if (i6 != 0) {
            if (i6 != 1) {
                n0();
                return;
            }
            this.f10344z = new p();
            u0().setArguments(getIntent().getExtras());
            aVar.f(R.id.root_frame_layout, u0(), "dailyplandetail");
        } else {
            this.f10344z = new q();
            u0().setArguments(getIntent().getExtras());
            aVar.f(R.id.root_frame_layout, u0(), "dailyplanfirst");
        }
        aVar.j();
    }
}
