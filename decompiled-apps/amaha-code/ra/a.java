package ra;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.e0;
import r9.i;
import ta.c5;
import ta.g6;
import ta.k6;
import ta.o4;
import ta.q1;
import ta.t4;
import ta.w2;
import ta.w3;
import ta.y3;
import ta.z4;
import v9.o;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final y3 f30650a;

    /* renamed from: b  reason: collision with root package name */
    public final t4 f30651b;

    public a(y3 y3Var) {
        o.h(y3Var);
        this.f30650a = y3Var;
        t4 t4Var = y3Var.J;
        y3.j(t4Var);
        this.f30651b = t4Var;
    }

    @Override // ta.u4
    public final List a(String str, String str2) {
        t4 t4Var = this.f30651b;
        y3 y3Var = t4Var.f32943u;
        w3 w3Var = y3Var.D;
        y3.k(w3Var);
        boolean r = w3Var.r();
        w2 w2Var = y3Var.C;
        if (r) {
            y3.k(w2Var);
            w2Var.f32925z.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        } else if (e0.x()) {
            y3.k(w2Var);
            w2Var.f32925z.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            w3 w3Var2 = y3Var.D;
            y3.k(w3Var2);
            w3Var2.m(atomicReference, 5000L, "get conditional user properties", new o4(t4Var, atomicReference, str, str2));
            List list = (List) atomicReference.get();
            if (list == null) {
                y3.k(w2Var);
                w2Var.f32925z.c(null, "Timed out waiting for get conditional user properties");
                return new ArrayList();
            }
            return k6.r(list);
        }
    }

    @Override // ta.u4
    public final long b() {
        k6 k6Var = this.f30650a.F;
        y3.i(k6Var);
        return k6Var.j0();
    }

    @Override // ta.u4
    public final Map c(String str, String str2, boolean z10) {
        t4 t4Var = this.f30651b;
        y3 y3Var = t4Var.f32943u;
        w3 w3Var = y3Var.D;
        y3.k(w3Var);
        boolean r = w3Var.r();
        w2 w2Var = y3Var.C;
        if (r) {
            y3.k(w2Var);
            w2Var.f32925z.b("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (e0.x()) {
            y3.k(w2Var);
            w2Var.f32925z.b("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            w3 w3Var2 = y3Var.D;
            y3.k(w3Var2);
            w3Var2.m(atomicReference, 5000L, "get user properties", new i(t4Var, atomicReference, str, str2, z10));
            List<g6> list = (List) atomicReference.get();
            if (list == null) {
                y3.k(w2Var);
                w2Var.f32925z.c(Boolean.valueOf(z10), "Timed out waiting for handle get user properties, includeInternal");
                return Collections.emptyMap();
            }
            t.b bVar = new t.b(list.size());
            for (g6 g6Var : list) {
                Object f02 = g6Var.f0();
                if (f02 != null) {
                    bVar.put(g6Var.f32578v, f02);
                }
            }
            return bVar;
        }
    }

    @Override // ta.u4
    public final void d(Bundle bundle) {
        t4 t4Var = this.f30651b;
        t4Var.f32943u.H.getClass();
        t4Var.s(bundle, System.currentTimeMillis());
    }

    @Override // ta.u4
    public final int e(String str) {
        t4 t4Var = this.f30651b;
        t4Var.getClass();
        o.e(str);
        t4Var.f32943u.getClass();
        return 25;
    }

    @Override // ta.u4
    public final String f() {
        return this.f30651b.A();
    }

    @Override // ta.u4
    public final String g() {
        c5 c5Var = this.f30651b.f32943u.I;
        y3.j(c5Var);
        z4 z4Var = c5Var.f32509w;
        if (z4Var != null) {
            return z4Var.f32975b;
        }
        return null;
    }

    @Override // ta.u4
    public final void h(String str, String str2, Bundle bundle) {
        t4 t4Var = this.f30651b;
        t4Var.f32943u.H.getClass();
        t4Var.n(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // ta.u4
    public final void i(String str) {
        y3 y3Var = this.f30650a;
        q1 m10 = y3Var.m();
        y3Var.H.getClass();
        m10.i(SystemClock.elapsedRealtime(), str);
    }

    @Override // ta.u4
    public final void j(String str, String str2, Bundle bundle) {
        t4 t4Var = this.f30650a.J;
        y3.j(t4Var);
        t4Var.l(str, str2, bundle);
    }

    @Override // ta.u4
    public final void k(String str) {
        y3 y3Var = this.f30650a;
        q1 m10 = y3Var.m();
        y3Var.H.getClass();
        m10.j(SystemClock.elapsedRealtime(), str);
    }

    @Override // ta.u4
    public final String s() {
        return this.f30651b.A();
    }

    @Override // ta.u4
    public final String t() {
        c5 c5Var = this.f30651b.f32943u.I;
        y3.j(c5Var);
        z4 z4Var = c5Var.f32509w;
        if (z4Var != null) {
            return z4Var.f32974a;
        }
        return null;
    }
}
