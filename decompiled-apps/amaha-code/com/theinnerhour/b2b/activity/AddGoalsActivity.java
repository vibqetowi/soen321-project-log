package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import cq.g;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import rr.b;
/* compiled from: AddGoalsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/AddGoalsActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AddGoalsActivity extends a {

    /* renamed from: w  reason: collision with root package name */
    public y f10301w;

    /* renamed from: x  reason: collision with root package name */
    public int f10302x;

    /* renamed from: y  reason: collision with root package name */
    public b f10303y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f10304z;

    public AddGoalsActivity() {
        new LinkedHashMap();
    }

    @Override // rr.a
    public final void n0() {
        Intent intent = new Intent();
        intent.putExtra("removeRecommendedFFM", this.f10304z);
        setResult(-1, intent);
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        y yVar = this.f10301w;
        if (yVar != null) {
            if (yVar.H() > 0) {
                y yVar2 = this.f10301w;
                if (yVar2 != null) {
                    yVar2.Y();
                    return;
                } else {
                    i.q("fragmentManager");
                    throw null;
                }
            }
            b bVar = this.f10303y;
            if (bVar != null) {
                b F = bVar.F();
                if (F == null) {
                    int i6 = this.f10302x - 1;
                    this.f10302x = i6;
                    if (i6 < 0) {
                        super.onBackPressed();
                        return;
                    } else {
                        u0(true, true);
                        return;
                    }
                }
                this.f10303y = F;
                y yVar3 = this.f10301w;
                if (yVar3 != null) {
                    androidx.fragment.app.a k10 = e.k(yVar3, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
                    b bVar2 = this.f10303y;
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
            i.q("customFragment");
            throw null;
        }
        i.q("fragmentManager");
        throw null;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_goals);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10301w = supportFragmentManager;
        u0(false, false);
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.f10303y = bVar;
        y yVar = this.f10301w;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            b bVar2 = this.f10303y;
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
        this.f10303y = bVar;
        y yVar = this.f10301w;
        if (yVar != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            String valueOf = String.valueOf(Calendar.getInstance().getTimeInMillis());
            aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            b bVar2 = this.f10303y;
            if (bVar2 != null) {
                aVar.f(R.id.root_frame_layout, bVar2, valueOf);
                aVar.d(null);
                aVar.j();
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
        this.f10302x++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        y yVar = this.f10301w;
        if (yVar != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            if (z11) {
                if (z10) {
                    aVar.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
                } else {
                    aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
                }
            }
            int i6 = this.f10302x;
            if (i6 != 0) {
                if (i6 == 1) {
                    n0();
                    return;
                }
            } else {
                this.f10303y = new g();
            }
            b bVar = this.f10303y;
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
