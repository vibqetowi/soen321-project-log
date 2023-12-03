package vr;

import nc.f;
import vr.g2;
import vr.n1;
/* compiled from: ForwardingConnectionClientTransport.java */
/* loaded from: classes2.dex */
public abstract class p0 implements w {
    public abstract w a();

    @Override // vr.g2
    public void c(tr.i0 i0Var) {
        a().c(i0Var);
    }

    @Override // vr.t
    public final void d(n1.c.a aVar) {
        a().d(aVar);
    }

    @Override // vr.g2
    public final Runnable e(g2.a aVar) {
        return a().e(aVar);
    }

    @Override // tr.v
    public final tr.w g() {
        return a().g();
    }

    @Override // vr.g2
    public void h(tr.i0 i0Var) {
        a().h(i0Var);
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(a(), "delegate");
        return c10.toString();
    }
}
