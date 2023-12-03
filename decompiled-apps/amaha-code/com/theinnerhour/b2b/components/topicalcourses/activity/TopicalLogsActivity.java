package com.theinnerhour.b2b.components.topicalcourses.activity;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import rr.b;
import wp.e;
/* compiled from: TopicalLogsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/topicalcourses/activity/TopicalLogsActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TopicalLogsActivity extends a {

    /* renamed from: w  reason: collision with root package name */
    public final String f11681w;

    /* renamed from: x  reason: collision with root package name */
    public y f11682x;

    /* renamed from: y  reason: collision with root package name */
    public int f11683y;

    /* renamed from: z  reason: collision with root package name */
    public b f11684z;

    public TopicalLogsActivity() {
        new LinkedHashMap();
        this.f11681w = LogHelper.INSTANCE.makeLogTag(TopicalLogsActivity.class);
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.f11683y;
        if (i6 == 0) {
            finish();
            return;
        }
        this.f11683y = i6 - 1;
        y yVar = this.f11682x;
        if (yVar != null) {
            yVar.W();
        } else {
            i.q("fragmentManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_depression_mastery);
            if (Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
                getWindow().setStatusBarColor(g0.a.b(this, R.color.dashboard_grey));
            } else {
                getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
            y supportFragmentManager = getSupportFragmentManager();
            i.f(supportFragmentManager, "supportFragmentManager");
            this.f11682x = supportFragmentManager;
            getIntent().getStringExtra("title");
            u0(false, false);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11681w, e10);
        }
    }

    @Override // rr.a
    public final void s0(b bVar) {
        this.f11683y++;
        this.f11684z = bVar;
        y yVar = this.f11682x;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            b bVar2 = this.f11684z;
            if (bVar2 != null) {
                k10.f(R.id.root_frame_layout, bVar2, null);
                k10.d(null);
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
        this.f11683y++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f11682x;
        if (yVar != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            if (z11) {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
            if (this.f11683y == 0) {
                e eVar = new e();
                this.f11684z = eVar;
                aVar.f(R.id.root_frame_layout, eVar, null);
                aVar.j();
                return;
            }
            n0();
            return;
        }
        i.q("fragmentManager");
        throw null;
    }
}
