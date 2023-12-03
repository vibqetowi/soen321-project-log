package p9;

import java.util.concurrent.atomic.AtomicReference;
import v9.q0;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class x extends f {

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<y> f28062b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.gms.internal.cast.f f28063c;

    public x(y yVar) {
        this.f28062b = new AtomicReference<>(yVar);
        this.f28063c = new com.google.android.gms.internal.cast.f(yVar.f34843x);
    }

    @Override // p9.g
    public final void D(int i6) {
        if (this.f28062b.get() == null) {
            return;
        }
        synchronized (y.f28066r0) {
        }
    }

    @Override // p9.g
    public final void F1(long j10) {
        y yVar = this.f28062b.get();
        if (yVar == null) {
            return;
        }
        y.J(yVar, j10, 0);
    }

    @Override // p9.g
    public final void J(c cVar) {
        y yVar = this.f28062b.get();
        if (yVar == null) {
            return;
        }
        y.f28064p0.b("onApplicationStatusChanged", new Object[0]);
        this.f28063c.post(new androidx.work.n(4, yVar, cVar));
    }

    @Override // p9.g
    public final void O1(k9.d dVar, String str, String str2, boolean z10) {
        y yVar = this.f28062b.get();
        if (yVar == null) {
            return;
        }
        yVar.W = dVar;
        yVar.f28076l0 = dVar.f23098u;
        yVar.f28077m0 = str2;
        yVar.f28069d0 = str;
        synchronized (y.f28065q0) {
        }
    }

    @Override // p9.g
    public final void S(String str, byte[] bArr) {
        if (this.f28062b.get() == null) {
            return;
        }
        y.f28064p0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // p9.g
    public final void a(String str, String str2) {
        y yVar = this.f28062b.get();
        if (yVar == null) {
            return;
        }
        y.f28064p0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f28063c.post(new w(yVar, str, str2));
    }

    @Override // p9.g
    public final void j(int i6) {
        if (this.f28062b.get() == null) {
            return;
        }
        synchronized (y.f28065q0) {
        }
    }

    @Override // p9.g
    public final void k1(long j10, int i6) {
        y yVar = this.f28062b.get();
        if (yVar == null) {
            return;
        }
        y.J(yVar, j10, i6);
    }

    @Override // p9.g
    public final void l0(int i6) {
        y yVar = null;
        y andSet = this.f28062b.getAndSet(null);
        if (andSet != null) {
            andSet.f28074j0 = -1;
            andSet.f28075k0 = -1;
            andSet.W = null;
            andSet.f28069d0 = null;
            andSet.f28072h0 = 0.0d;
            andSet.I();
            andSet.e0 = false;
            andSet.f28073i0 = null;
            yVar = andSet;
        }
        if (yVar == null) {
            return;
        }
        y.f28064p0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i6));
        if (i6 != 0) {
            int i10 = yVar.R.get();
            q0 q0Var = yVar.A;
            q0Var.sendMessage(q0Var.obtainMessage(6, i10, 2));
        }
    }

    @Override // p9.g
    public final void p0() {
        y.f28064p0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // p9.g
    public final void w1(a0 a0Var) {
        y yVar = this.f28062b.get();
        if (yVar == null) {
            return;
        }
        y.f28064p0.b("onDeviceStatusChanged", new Object[0]);
        this.f28063c.post(new androidx.work.n(3, yVar, a0Var));
    }

    @Override // p9.g
    public final void x(int i6) {
        y yVar = this.f28062b.get();
        if (yVar == null) {
            return;
        }
        yVar.f28076l0 = null;
        yVar.f28077m0 = null;
        synchronized (y.f28066r0) {
        }
        if (yVar.Y != null) {
            this.f28063c.post(new v(yVar, i6));
        }
    }

    @Override // p9.g
    public final void y1(int i6) {
        if (this.f28062b.get() == null) {
            return;
        }
        synchronized (y.f28066r0) {
        }
    }

    @Override // p9.g
    public final void k(int i6) {
    }

    @Override // p9.g
    public final void u(int i6) {
    }
}
