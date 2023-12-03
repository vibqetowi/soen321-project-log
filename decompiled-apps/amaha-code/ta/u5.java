package ta;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.internal.measurement.v8;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class u5 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v5 f32899a;

    public u5(v5 v5Var) {
        this.f32899a = v5Var;
    }

    public final void a() {
        v5 v5Var = this.f32899a;
        v5Var.h();
        y3 y3Var = v5Var.f32943u;
        j3 j3Var = y3Var.B;
        y3.i(j3Var);
        y3Var.H.getClass();
        if (j3Var.r(System.currentTimeMillis())) {
            j3 j3Var2 = y3Var.B;
            y3.i(j3Var2);
            j3Var2.E.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.H.b("Detected application was in foreground");
                y3Var.H.getClass();
                c(false, System.currentTimeMillis());
            }
        }
    }

    public final void b(boolean z10, long j10) {
        v5 v5Var = this.f32899a;
        v5Var.h();
        v5Var.l();
        y3 y3Var = v5Var.f32943u;
        j3 j3Var = y3Var.B;
        y3.i(j3Var);
        if (j3Var.r(j10)) {
            j3 j3Var2 = y3Var.B;
            y3.i(j3Var2);
            j3Var2.E.a(true);
            ca.c();
            if (y3Var.A.q(null, j2.f32653i0)) {
                y3Var.p().o();
            }
        }
        j3 j3Var3 = y3Var.B;
        y3.i(j3Var3);
        j3Var3.H.b(j10);
        j3 j3Var4 = y3Var.B;
        y3.i(j3Var4);
        if (j3Var4.E.b()) {
            c(z10, j10);
        }
    }

    public final void c(boolean z10, long j10) {
        v5 v5Var = this.f32899a;
        v5Var.h();
        y3 y3Var = v5Var.f32943u;
        if (!y3Var.g()) {
            return;
        }
        j3 j3Var = y3Var.B;
        y3.i(j3Var);
        j3Var.H.b(j10);
        y3Var.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        w2Var.H.c(Long.valueOf(elapsedRealtime), "Session started, time");
        Long valueOf = Long.valueOf(j10 / 1000);
        t4 t4Var = y3Var.J;
        y3.j(t4Var);
        t4Var.x(j10, valueOf, "auto", "_sid");
        j3 j3Var2 = y3Var.B;
        y3.i(j3Var2);
        j3Var2.I.b(valueOf.longValue());
        j3 j3Var3 = y3Var.B;
        y3.i(j3Var3);
        j3Var3.E.a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (y3Var.A.q(null, j2.Z) && z10) {
            bundle.putLong("_aib", 1L);
        }
        t4 t4Var2 = y3Var.J;
        y3.j(t4Var2);
        t4Var2.p(j10, bundle, "auto", "_s");
        ((v8) u8.f8623v.f8624u.a()).a();
        if (y3Var.A.q(null, j2.c0)) {
            j3 j3Var4 = y3Var.B;
            y3.i(j3Var4);
            String a10 = j3Var4.N.a();
            if (!TextUtils.isEmpty(a10)) {
                Bundle a11 = r1.b0.a("_ffr", a10);
                t4 t4Var3 = y3Var.J;
                y3.j(t4Var3);
                t4Var3.p(j10, a11, "auto", "_ssr");
            }
        }
    }
}
