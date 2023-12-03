package com.theinnerhour.b2b.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.DownloadUtil;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.b;
/* compiled from: DevFragmentTestActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DevFragmentTestActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DevFragmentTestActivity extends rr.a {

    /* renamed from: w  reason: collision with root package name */
    public y f10392w;

    /* renamed from: x  reason: collision with root package name */
    public int f10393x;

    /* renamed from: y  reason: collision with root package name */
    public b f10394y;

    /* compiled from: DevFragmentTestActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            i.g(context, "context");
            i.g(intent, "intent");
            if (intent.getIntExtra(DownloadUtil.DOWNLOAD_STATUS, 1) == 100) {
                DevFragmentTestActivity devFragmentTestActivity = DevFragmentTestActivity.this;
                n1.a.a(devFragmentTestActivity).d(this);
                devFragmentTestActivity.getClass();
            }
        }
    }

    public DevFragmentTestActivity() {
        new LinkedHashMap();
        new a();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        setContentView(R.layout.layout_matching_question);
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10392w = supportFragmentManager;
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.f10394y = bVar;
        y yVar = this.f10392w;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            b bVar2 = this.f10394y;
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
    public final void s0(b bVar) {
        this.f10394y = bVar;
        y yVar = this.f10392w;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            b bVar2 = this.f10394y;
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
        this.f10393x++;
        y yVar = this.f10392w;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            if (this.f10393x == 0) {
                ik.b bVar = new ik.b();
                this.f10394y = bVar;
                k10.f(R.id.root_frame_layout, bVar, null);
                k10.j();
                return;
            }
            n0();
            return;
        }
        i.q("fragmentManager");
        throw null;
    }
}
