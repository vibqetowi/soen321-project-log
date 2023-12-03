package ta;

import android.os.Bundle;
import java.util.Iterator;
import t.g;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class q1 extends p2 {

    /* renamed from: v  reason: collision with root package name */
    public final t.b f32821v;

    /* renamed from: w  reason: collision with root package name */
    public final t.b f32822w;

    /* renamed from: x  reason: collision with root package name */
    public long f32823x;

    public q1(y3 y3Var) {
        super(y3Var);
        this.f32822w = new t.b();
        this.f32821v = new t.b();
    }

    public final void i(long j10, String str) {
        y3 y3Var = this.f32943u;
        if (str != null && str.length() != 0) {
            w3 w3Var = y3Var.D;
            y3.k(w3Var);
            w3Var.p(new a(this, str, j10, 0));
            return;
        }
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        w2Var.f32925z.b("Ad unit id must be a non-empty string");
    }

    public final void j(long j10, String str) {
        y3 y3Var = this.f32943u;
        if (str != null && str.length() != 0) {
            w3 w3Var = y3Var.D;
            y3.k(w3Var);
            w3Var.p(new a(this, str, j10, 1));
            return;
        }
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        w2Var.f32925z.b("Ad unit id must be a non-empty string");
    }

    public final void k(long j10) {
        c5 c5Var = this.f32943u.I;
        y3.j(c5Var);
        z4 n10 = c5Var.n(false);
        t.b bVar = this.f32821v;
        Iterator it = ((g.c) bVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m(str, j10 - ((Long) bVar.getOrDefault(str, null)).longValue(), n10);
        }
        if (!bVar.isEmpty()) {
            l(j10 - this.f32823x, n10);
        }
        n(j10);
    }

    public final void l(long j10, z4 z4Var) {
        y3 y3Var = this.f32943u;
        if (z4Var == null) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.H.b("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.H.c(Long.valueOf(j10), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            k6.u(z4Var, bundle, true);
            t4 t4Var = y3Var.J;
            y3.j(t4Var);
            t4Var.o("am", "_xa", bundle);
        }
    }

    public final void m(String str, long j10, z4 z4Var) {
        y3 y3Var = this.f32943u;
        if (z4Var == null) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.H.b("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.H.c(Long.valueOf(j10), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            k6.u(z4Var, bundle, true);
            t4 t4Var = y3Var.J;
            y3.j(t4Var);
            t4Var.o("am", "_xu", bundle);
        }
    }

    public final void n(long j10) {
        t.b bVar = this.f32821v;
        Iterator it = ((g.c) bVar.keySet()).iterator();
        while (it.hasNext()) {
            bVar.put((String) it.next(), Long.valueOf(j10));
        }
        if (!bVar.isEmpty()) {
            this.f32823x = j10;
        }
    }
}
