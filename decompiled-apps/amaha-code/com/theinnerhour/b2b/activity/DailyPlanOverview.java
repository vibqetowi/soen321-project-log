package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
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
/* compiled from: DailyPlanOverview.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DailyPlanOverview;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DailyPlanOverview extends a {
    public boolean A;
    public boolean B;

    /* renamed from: w  reason: collision with root package name */
    public y f10337w;

    /* renamed from: x  reason: collision with root package name */
    public int f10338x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f10339y;

    /* renamed from: z  reason: collision with root package name */
    public b f10340z;

    public DailyPlanOverview() {
        new LinkedHashMap();
        LogHelper.INSTANCE.makeLogTag(DailyPlanOverview.class);
    }

    @Override // rr.a
    public final void n0() {
        Intent intent = new Intent();
        intent.putExtra("tutorial", false);
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
            this.f10339y = z10;
            if (z10 && ApplicationPersistence.getInstance().getBooleanValue(Constants.getKeyForFirstDay(FirebasePersistence.getInstance().getUser().getCurrentCourseName()), true)) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            this.f10338x = i6;
            if (this.f10339y) {
                ApplicationPersistence.getInstance().getBooleanValue(Constants.getKeyForFirstDay(FirebasePersistence.getInstance().getUser().getCurrentCourseName()), true);
            }
            this.B = extras.getBoolean("tutorial");
        }
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10337w = supportFragmentManager;
        x0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.f10340z = bVar;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), null);
        k10.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10338x++;
        x0(false, true);
    }

    public final b u0() {
        b bVar = this.f10340z;
        if (bVar != null) {
            return bVar;
        }
        i.q("customFragment");
        throw null;
    }

    public final y v0() {
        y yVar = this.f10337w;
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
            this.f10338x--;
            if (this.A) {
                n0();
                return;
            } else {
                finish();
                return;
            }
        }
        this.f10340z = F;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), null);
        k10.j();
    }

    public final void x0(boolean z10, boolean z11) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(v0());
        if (z11) {
            aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        }
        int i6 = this.f10338x;
        if (i6 != 0) {
            if (i6 != 1) {
                n0();
                return;
            }
            this.f10340z = new bl.i();
            u0().setArguments(getIntent().getExtras());
            aVar.f(R.id.root_frame_layout, u0(), "dailyplandetail");
        } else {
            this.f10340z = new q();
            u0().setArguments(getIntent().getExtras());
            aVar.f(R.id.root_frame_layout, u0(), "dailyplanfirst");
        }
        aVar.j();
    }
}
