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
import fq.k0;
import fq.n0;
import fq.q0;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import r1.b0;
import rr.a;
import rr.b;
/* compiled from: T5Activity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/T5Activity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class T5Activity extends a {
    public b A;
    public final HashMap<String, Object> B;
    public String C;
    public boolean D;

    /* renamed from: w  reason: collision with root package name */
    public y f10529w;

    /* renamed from: x  reason: collision with root package name */
    public int f10530x;

    /* renamed from: y  reason: collision with root package name */
    public int f10531y;

    /* renamed from: z  reason: collision with root package name */
    public final String f10532z;

    public T5Activity() {
        new LinkedHashMap();
        LogHelper.INSTANCE.makeLogTag(T5Activity.class);
        this.f10532z = "assesment_pos";
        this.B = new HashMap<>();
        this.C = "";
    }

    @Override // rr.a
    public final void n0() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getIntent().hasExtra("source") && i.b(getIntent().getStringExtra("source"), "goals")) {
            finish();
        } else if (v0().H() > 0) {
            v0().W();
        } else {
            b F = u0().F();
            if (F == null) {
                int i6 = this.f10530x - 1;
                this.f10530x = i6;
                if (i6 < this.f10531y) {
                    super.onBackPressed();
                    return;
                } else {
                    x0(true, true);
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
        setContentView(R.layout.activity_t5);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt(this.f10532z, 0);
            this.f10531y = i6;
            this.f10530x = i6;
        }
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10529w = supportFragmentManager;
        if (FirebasePersistence.getInstance().getUser() == null) {
            finish();
        } else {
            x0(false, false);
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
        u0().setArguments(getIntent().getExtras());
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), String.valueOf(Calendar.getInstance().getTimeInMillis()));
        k10.d(null);
        k10.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10530x++;
        x0(false, true);
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
        y yVar = this.f10529w;
        if (yVar != null) {
            return yVar;
        }
        i.q("fragmentManager");
        throw null;
    }

    public final void w0(b bVar, String resultKey) {
        i.g(resultKey, "resultKey");
        this.A = bVar;
        u0().setArguments(b0.a("resultKey", resultKey));
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), String.valueOf(Calendar.getInstance().getTimeInMillis()));
        k10.d(null);
        k10.j();
    }

    public final void x0(boolean z10, boolean z11) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(v0());
        if (z11) {
            if (z10) {
                aVar.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        String stringExtra = getIntent().getStringExtra(Constants.API_COURSE_LINK);
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -808718474) {
                if (hashCode != 1629903212) {
                    if (hashCode == 2089255915 && stringExtra.equals(Constants.SCREEN_T5B)) {
                        switch (this.f10530x) {
                            case 0:
                                this.A = new e0();
                                break;
                            case 1:
                                this.A = new i0();
                                break;
                            case 2:
                                this.A = new b1();
                                break;
                            case 3:
                                this.A = new q0();
                                this.C = "s39";
                                break;
                            case 4:
                                this.A = new e0();
                                break;
                            case 5:
                                this.A = new k0();
                                break;
                            case 6:
                                this.A = new n0();
                                break;
                            default:
                                n0();
                                return;
                        }
                    }
                } else if (stringExtra.equals(Constants.NOTIFICATION_WORRY)) {
                    this.A = new fq.b();
                }
            } else if (stringExtra.equals(Constants.SCREEN_T5A)) {
                int i6 = this.f10530x;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 != 4) {
                                    n0();
                                    return;
                                }
                                this.A = new n0();
                            } else {
                                this.A = new e0();
                            }
                        } else {
                            this.A = new q0();
                            this.C = "s38";
                        }
                    } else {
                        this.A = new i0();
                    }
                } else {
                    this.A = new e0();
                }
            }
        }
        if (this.A != null) {
            Bundle extras = getIntent().getExtras();
            i.d(extras);
            extras.putInt(Constants.DAYMODEL_POSITION, this.f10530x);
            u0().setArguments(extras);
            aVar.f(R.id.root_frame_layout, u0(), null);
            aVar.j();
            return;
        }
        finish();
    }
}
