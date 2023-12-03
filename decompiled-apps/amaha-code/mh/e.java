package mh;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.e9;
import kotlin.jvm.internal.i;
import ta.c5;
import ta.j2;
import ta.j3;
import ta.k6;
import ta.m;
import ta.t4;
import ta.t5;
import ta.v5;
import ta.w2;
import ta.y3;
/* compiled from: KeyValueEntity.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25068a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f25069b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f25070c;

    /* renamed from: d  reason: collision with root package name */
    public long f25071d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f25072e;

    public e(long j10, String str, String value, long j11) {
        i.g(value, "value");
        this.f25069b = j10;
        this.f25070c = str;
        this.f25072e = value;
        this.f25071d = j11;
    }

    public final long a() {
        switch (this.f25068a) {
            case 0:
                return this.f25069b;
            default:
                return this.f25069b;
        }
    }

    public final boolean b(long j10, boolean z10, boolean z11) {
        v5 v5Var = (v5) this.f25072e;
        v5Var.h();
        v5Var.i();
        ((e9) d9.f8343v.f8344u.a()).a();
        if (v5Var.f32943u.A.q(null, j2.f32645d0)) {
            if (v5Var.f32943u.g()) {
                j3 j3Var = v5Var.f32943u.B;
                y3.i(j3Var);
                v5Var.f32943u.H.getClass();
                j3Var.H.b(System.currentTimeMillis());
            }
        } else {
            j3 j3Var2 = v5Var.f32943u.B;
            y3.i(j3Var2);
            v5Var.f32943u.H.getClass();
            j3Var2.H.b(System.currentTimeMillis());
        }
        long j11 = j10 - this.f25069b;
        if (!z10 && j11 < 1000) {
            w2 w2Var = v5Var.f32943u.C;
            y3.k(w2Var);
            w2Var.H.c(Long.valueOf(j11), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f25071d;
            this.f25071d = j10;
        }
        w2 w2Var2 = v5Var.f32943u.C;
        y3.k(w2Var2);
        w2Var2.H.c(Long.valueOf(j11), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean r = v5Var.f32943u.A.r();
        c5 c5Var = v5Var.f32943u.I;
        y3.j(c5Var);
        k6.u(c5Var.n(!r), bundle, true);
        if (!z11) {
            t4 t4Var = v5Var.f32943u.J;
            y3.j(t4Var);
            t4Var.o("auto", "_e", bundle);
        }
        this.f25069b = j10;
        m mVar = (m) this.f25070c;
        mVar.a();
        mVar.c(3600000L);
        return true;
    }

    public e(String campaignId, long j10, String str) {
        i.g(campaignId, "campaignId");
        this.f25069b = -1L;
        this.f25070c = campaignId;
        this.f25071d = j10;
        this.f25072e = str;
    }

    public e(v5 v5Var) {
        this.f25072e = v5Var;
        this.f25070c = new t5(this, v5Var.f32943u, 0);
        v5Var.f32943u.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f25069b = elapsedRealtime;
        this.f25071d = elapsedRealtime;
    }
}
