package com.theinnerhour.b2b.components.multiTracker.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import rr.b;
import tn.j;
import tn.k;
/* compiled from: MultiTrackerInsightsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/multiTracker/activity/MultiTrackerInsightsActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MultiTrackerInsightsActivity extends a {

    /* renamed from: w  reason: collision with root package name */
    public final String f11484w;

    /* renamed from: x  reason: collision with root package name */
    public y f11485x;

    /* renamed from: y  reason: collision with root package name */
    public b f11486y;

    /* renamed from: z  reason: collision with root package name */
    public int f11487z;

    public MultiTrackerInsightsActivity() {
        new LinkedHashMap();
        this.f11484w = LogHelper.INSTANCE.makeLogTag(MultiTrackerInsightsActivity.class);
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_multi_tracker_insights);
            InsetsUtils.INSTANCE.setStatusBarColor(R.color.login_grey_background, this, false, true);
            new ProgressDialog(this);
            y supportFragmentManager = getSupportFragmentManager();
            i.f(supportFragmentManager, "supportFragmentManager");
            this.f11485x = supportFragmentManager;
            u0(false, false);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11484w, e10);
        }
    }

    @Override // rr.a
    public final void r0(b bVar) {
        try {
            this.f11486y = bVar;
            y yVar = this.f11485x;
            if (yVar != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
                b bVar2 = this.f11486y;
                if (bVar2 != null) {
                    aVar.f(R.id.insightsFragmentContainer, bVar2, null);
                    aVar.j();
                    return;
                }
                i.q("customFragment");
                throw null;
            }
            i.q("fragmentManager");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11484w, e10);
        }
    }

    @Override // rr.a
    public final void s0(b bVar) {
        try {
            this.f11486y = bVar;
            y yVar = this.f11485x;
            if (yVar != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
                b bVar2 = this.f11486y;
                if (bVar2 != null) {
                    aVar.f(R.id.insightsFragmentContainer, bVar2, null);
                    aVar.d(null);
                    aVar.j();
                    return;
                }
                i.q("customFragment");
                throw null;
            }
            i.q("fragmentManager");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11484w, e10);
        }
    }

    @Override // rr.a
    public final void t0() {
        this.f11487z++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        b jVar;
        try {
            y yVar = this.f11485x;
            if (yVar != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                if (z11) {
                    aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
                }
                if (this.f11487z == 0) {
                    if (getIntent().getBooleanExtra("show_logs", false)) {
                        k kVar = new k();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("show_logs", true);
                        hs.k kVar2 = hs.k.f19476a;
                        jVar = UtilsKt.withArgs(kVar, bundle);
                    } else {
                        jVar = new j();
                    }
                    this.f11486y = jVar;
                    if (jVar != null) {
                        if (jVar.getArguments() == null) {
                            b bVar = this.f11486y;
                            if (bVar != null) {
                                bVar.setArguments(new Bundle());
                            } else {
                                i.q("customFragment");
                                throw null;
                            }
                        }
                        b bVar2 = this.f11486y;
                        if (bVar2 != null) {
                            aVar.f(R.id.insightsFragmentContainer, bVar2, null);
                            aVar.j();
                            return;
                        }
                        i.q("customFragment");
                        throw null;
                    }
                    i.q("customFragment");
                    throw null;
                }
                n0();
                return;
            }
            i.q("fragmentManager");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11484w, e10);
        }
    }
}
