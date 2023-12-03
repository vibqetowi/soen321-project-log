package vr;

import nc.f;
/* compiled from: ForwardingManagedChannel.java */
/* loaded from: classes2.dex */
public abstract class r0 extends tr.b0 {

    /* renamed from: b  reason: collision with root package name */
    public final tr.b0 f35944b;

    public r0(q1 q1Var) {
        this.f35944b = q1Var;
    }

    @Override // tr.b0
    public final void D() {
        this.f35944b.D();
    }

    @Override // tr.b0
    public final tr.j E() {
        return this.f35944b.E();
    }

    @Override // tr.b0
    public final void F(tr.j jVar, ne.o oVar) {
        this.f35944b.F(jVar, oVar);
    }

    @Override // androidx.work.k
    public final String i() {
        return this.f35944b.i();
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(this.f35944b, "delegate");
        return c10.toString();
    }

    @Override // androidx.work.k
    public final <RequestT, ResponseT> tr.c<RequestT, ResponseT> w(tr.d0<RequestT, ResponseT> d0Var, io.grpc.b bVar) {
        return this.f35944b.w(d0Var, bVar);
    }
}
