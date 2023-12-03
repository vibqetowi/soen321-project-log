package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import fq.b1;
import fq.e0;
import fq.i0;
import fq.n0;
import fq.o0;
import fq.s0;
import fq.z;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import rr.b;
/* compiled from: TAActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/TAActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TAActivity extends a {
    public b A;
    public String B;

    /* renamed from: w  reason: collision with root package name */
    public y f10541w;

    /* renamed from: x  reason: collision with root package name */
    public int f10542x;

    /* renamed from: y  reason: collision with root package name */
    public int f10543y;

    /* renamed from: z  reason: collision with root package name */
    public final String f10544z;

    public TAActivity() {
        new LinkedHashMap();
        LogHelper.INSTANCE.makeLogTag(TAActivity.class);
        this.f10544z = "assesment_pos";
        new HashMap();
        this.B = "";
    }

    @Override // rr.a
    public final void n0() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (u0().I()) {
            if (v0().H() > 0) {
                v0().W();
                return;
            }
            b F = u0().F();
            if (F == null) {
                int i6 = this.f10542x - 1;
                this.f10542x = i6;
                if (i6 < this.f10543y) {
                    super.onBackPressed();
                    return;
                } else {
                    w0(true, true);
                    return;
                }
            }
            this.A = F;
            androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            k10.f(R.id.root_frame_layout, u0(), null);
            k10.j();
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ta);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt(this.f10544z, 0);
            this.f10543y = i6;
            this.f10542x = i6;
        }
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10541w = supportFragmentManager;
        if (FirebasePersistence.getInstance().getUser() == null) {
            finish();
        } else {
            w0(false, false);
        }
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.A = bVar;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), null);
        k10.j();
    }

    @Override // rr.a
    public final void s0(b bVar) {
        this.A = bVar;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), String.valueOf(Calendar.getInstance().getTimeInMillis()));
        k10.d(null);
        k10.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10542x++;
        w0(false, true);
    }

    public final b u0() {
        b bVar = this.A;
        if (bVar != null) {
            return bVar;
        }
        i.q("customFragment");
        throw null;
    }

    public final y v0() {
        y yVar = this.f10541w;
        if (yVar != null) {
            return yVar;
        }
        i.q("fragmentManager");
        throw null;
    }

    public final void w0(boolean z10, boolean z11) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(v0());
        if (z11) {
            if (z10) {
                aVar.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        if (i.b(getIntent().getStringExtra(Constants.API_COURSE_LINK), Constants.SCREEN_TAE)) {
            switch (this.f10542x) {
                case 0:
                    this.A = new e0();
                    break;
                case 1:
                    this.A = new i0();
                    break;
                case 2:
                    this.A = new e0();
                    break;
                case 3:
                    this.A = new s0();
                    break;
                case 4:
                    this.A = new z();
                    this.B = "s146";
                    break;
                case 5:
                    this.A = new b1();
                    break;
                case 6:
                    this.A = new e0();
                    break;
                case 7:
                    this.A = new o0();
                    break;
                case 8:
                    this.A = new n0();
                    break;
                default:
                    n0();
                    return;
            }
            Bundle extras = getIntent().getExtras();
            i.d(extras);
            extras.putInt(Constants.DAYMODEL_POSITION, this.f10542x);
            u0().setArguments(extras);
            aVar.f(R.id.root_frame_layout, u0(), null);
            aVar.j();
            return;
        }
        finish();
    }
}
