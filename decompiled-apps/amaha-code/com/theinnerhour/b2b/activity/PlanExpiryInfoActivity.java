package com.theinnerhour.b2b.activity;

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
/* compiled from: PlanExpiryInfoActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/PlanExpiryInfoActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PlanExpiryInfoActivity extends a {

    /* renamed from: w  reason: collision with root package name */
    public final String f10457w;

    /* renamed from: x  reason: collision with root package name */
    public y f10458x;

    /* renamed from: y  reason: collision with root package name */
    public b f10459y;

    /* renamed from: z  reason: collision with root package name */
    public int f10460z;

    public PlanExpiryInfoActivity() {
        new LinkedHashMap();
        this.f10457w = LogHelper.INSTANCE.makeLogTag(PlanExpiryInfoActivity.class);
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_custom_goals);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                getWindow().setStatusBarColor(g0.a.b(this, R.color.freeFeatureYellow));
            } else {
                getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10457w, "Error in setting custom status bar", e10);
        }
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10458x = supportFragmentManager;
        u0(false, false);
    }

    @Override // rr.a
    public final void t0() {
        this.f10460z++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10458x;
        if (yVar != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            if (z11) {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
            if (this.f10460z == 0) {
                fr.b bVar = new fr.b();
                this.f10459y = bVar;
                bVar.setArguments(getIntent().getExtras());
                b bVar2 = this.f10459y;
                if (bVar2 != null) {
                    aVar.f(R.id.root_frame_layout, bVar2, null);
                    aVar.j();
                    return;
                }
                i.q("customFragment");
                throw null;
            }
            n0();
            return;
        }
        i.q("fragmentManager");
        throw null;
    }
}
