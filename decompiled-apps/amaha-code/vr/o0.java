package vr;

import nc.f;
import vr.c1;
import vr.i3;
/* compiled from: ForwardingClientStreamListener.java */
/* loaded from: classes2.dex */
public abstract class o0 implements s {
    @Override // vr.i3
    public final void a(i3.a aVar) {
        ((c1.b.a.C0603a) this).f35466a.a(aVar);
    }

    @Override // vr.s
    public final void c(tr.c0 c0Var) {
        ((c1.b.a.C0603a) this).f35466a.c(c0Var);
    }

    @Override // vr.i3
    public final void onReady() {
        ((c1.b.a.C0603a) this).f35466a.onReady();
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(((c1.b.a.C0603a) this).f35466a, "delegate");
        return c10.toString();
    }
}
