package vr;

import vr.s;
/* compiled from: FailingClientTransport.java */
/* loaded from: classes2.dex */
public final class l0 implements t {

    /* renamed from: a  reason: collision with root package name */
    public final tr.i0 f35759a;

    /* renamed from: b  reason: collision with root package name */
    public final s.a f35760b;

    public l0(tr.i0 i0Var, s.a aVar) {
        sc.b.s("error must not be OK", !i0Var.e());
        this.f35759a = i0Var;
        this.f35760b = aVar;
    }

    @Override // vr.t
    public final r f(tr.d0<?, ?> d0Var, tr.c0 c0Var, io.grpc.b bVar, io.grpc.c[] cVarArr) {
        return new k0(this.f35759a, this.f35760b, cVarArr);
    }

    @Override // tr.v
    public final tr.w g() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
