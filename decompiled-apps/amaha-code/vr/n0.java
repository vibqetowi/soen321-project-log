package vr;

import java.io.InputStream;
import nc.f;
import vr.c1;
/* compiled from: ForwardingClientStream.java */
/* loaded from: classes2.dex */
public abstract class n0 implements r {
    @Override // vr.h3
    public final void a(tr.h hVar) {
        ((c1.b.a) this).f35464a.a(hVar);
    }

    @Override // vr.h3
    public final void b(InputStream inputStream) {
        ((c1.b.a) this).f35464a.b(inputStream);
    }

    @Override // vr.h3
    public final void c() {
        ((c1.b.a) this).f35464a.c();
    }

    @Override // vr.h3
    public final void e(int i6) {
        ((c1.b.a) this).f35464a.e(i6);
    }

    @Override // vr.h3
    public final void flush() {
        ((c1.b.a) this).f35464a.flush();
    }

    @Override // vr.r
    public final void g(int i6) {
        ((c1.b.a) this).f35464a.g(i6);
    }

    @Override // vr.r
    public final void h(int i6) {
        ((c1.b.a) this).f35464a.h(i6);
    }

    @Override // vr.r
    public final void i(tr.m mVar) {
        ((c1.b.a) this).f35464a.i(mVar);
    }

    @Override // vr.h3
    public final boolean isReady() {
        return ((c1.b.a) this).f35464a.isReady();
    }

    @Override // vr.r
    public final void j(b1 b1Var) {
        ((c1.b.a) this).f35464a.j(b1Var);
    }

    @Override // vr.r
    public final void k(tr.o oVar) {
        ((c1.b.a) this).f35464a.k(oVar);
    }

    @Override // vr.r
    public final void l(String str) {
        ((c1.b.a) this).f35464a.l(str);
    }

    @Override // vr.r
    public final void m() {
        ((c1.b.a) this).f35464a.m();
    }

    @Override // vr.r
    public final void o(tr.i0 i0Var) {
        ((c1.b.a) this).f35464a.o(i0Var);
    }

    @Override // vr.r
    public final void p(boolean z10) {
        ((c1.b.a) this).f35464a.p(z10);
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(((c1.b.a) this).f35464a, "delegate");
        return c10.toString();
    }
}
