package com.theinnerhour.b2b.components.dashboard.experiment.activity;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.LinkedHashMap;
import jn.c;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import rr.b;
/* compiled from: LibraryScreenLogsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/experiment/activity/LibraryScreenLogsActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LibraryScreenLogsActivity extends a {

    /* renamed from: w  reason: collision with root package name */
    public final String f10813w;

    /* renamed from: x  reason: collision with root package name */
    public y f10814x;

    /* renamed from: y  reason: collision with root package name */
    public int f10815y;

    /* renamed from: z  reason: collision with root package name */
    public b f10816z;

    public LibraryScreenLogsActivity() {
        new LinkedHashMap();
        this.f10813w = LogHelper.INSTANCE.makeLogTag("LibraryScreenLogActivity");
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.f10815y;
        if (i6 == 0) {
            finish();
            return;
        }
        this.f10815y = i6 - 1;
        y yVar = this.f10814x;
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
            setContentView(R.layout.activity_library_screen_log);
            if (Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
            } else {
                getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
            y supportFragmentManager = getSupportFragmentManager();
            i.f(supportFragmentManager, "supportFragmentManager");
            this.f10814x = supportFragmentManager;
            getIntent().getStringExtra("title");
            u0(false, false);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10813w, e10);
        }
    }

    @Override // rr.a
    public final void s0(b bVar) {
        this.f10815y++;
        this.f10816z = bVar;
        y yVar = this.f10814x;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            b bVar2 = this.f10816z;
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
        this.f10815y++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10814x;
        if (yVar != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            if (z11) {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
            if (this.f10815y == 0) {
                c cVar = new c();
                this.f10816z = cVar;
                aVar.f(R.id.root_frame_layout, cVar, null);
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
