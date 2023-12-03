package com.theinnerhour.b2b.components.logs.activity;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GratitudeJournalAnswerModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import jn.e;
import jn.g;
import kn.a;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import rr.b;
/* compiled from: ScreenLogsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/logs/activity/ScreenLogsActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ScreenLogsActivity extends a {
    public String A;
    public ArrayList<GratitudeJournalAnswerModel> B;
    public boolean C;
    public a.EnumC0358a D;

    /* renamed from: w  reason: collision with root package name */
    public final String f11374w;

    /* renamed from: x  reason: collision with root package name */
    public y f11375x;

    /* renamed from: y  reason: collision with root package name */
    public int f11376y;

    /* renamed from: z  reason: collision with root package name */
    public b f11377z;

    public ScreenLogsActivity() {
        new LinkedHashMap();
        this.f11374w = LogHelper.INSTANCE.makeLogTag(ScreenLogsActivity.class);
        this.A = "";
        this.D = a.EnumC0358a.MAIN_PLAN_LOGS;
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.f11376y;
        if (i6 == 0) {
            finish();
            return;
        }
        this.f11376y = i6 - 1;
        y yVar = this.f11375x;
        if (yVar != null) {
            yVar.W();
        } else {
            i.q("fragmentManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a.EnumC0358a enumC0358a;
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_depression_mastery);
            if (Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
            } else {
                getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
            y supportFragmentManager = getSupportFragmentManager();
            i.f(supportFragmentManager, "supportFragmentManager");
            this.f11375x = supportFragmentManager;
            String stringExtra = getIntent().getStringExtra("title");
            if (stringExtra != null) {
                this.A = stringExtra;
            }
            if (getIntent().hasExtra("logType")) {
                this.C = true;
                Serializable serializableExtra = getIntent().getSerializableExtra("logType");
                if (serializableExtra instanceof a.EnumC0358a) {
                    enumC0358a = (a.EnumC0358a) serializableExtra;
                } else {
                    enumC0358a = null;
                }
                if (enumC0358a == null) {
                    enumC0358a = a.EnumC0358a.MAIN_PLAN_LOGS;
                }
                this.D = enumC0358a;
            }
            u0(false, false);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11374w, e10);
        }
    }

    @Override // rr.a
    public final void s0(b bVar) {
        this.f11376y++;
        this.f11377z = bVar;
        y yVar = this.f11375x;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            b bVar2 = this.f11377z;
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
        this.f11376y++;
        u0(false, true);
    }

    public final void u0(boolean z10, boolean z11) {
        b gVar;
        y yVar = this.f11375x;
        if (yVar != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            if (z11) {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
            if (this.f11376y == 0) {
                if (!this.C) {
                    gVar = new e();
                } else {
                    gVar = new g();
                }
                this.f11377z = gVar;
                if (this.C) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("logType", this.D);
                    gVar.setArguments(bundle);
                }
                b bVar = this.f11377z;
                if (bVar != null) {
                    aVar.f(R.id.root_frame_layout, bVar, null);
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
