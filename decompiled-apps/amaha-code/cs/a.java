package cs;

import io.grpc.h;
import nc.f;
import tr.i0;
/* compiled from: ForwardingLoadBalancer.java */
/* loaded from: classes2.dex */
public abstract class a extends io.grpc.h {
    @Override // io.grpc.h
    public final boolean b() {
        d dVar = (d) this;
        io.grpc.h hVar = dVar.f11944h;
        if (hVar == dVar.f11940c) {
            hVar = dVar.f;
        }
        return hVar.b();
    }

    @Override // io.grpc.h
    public final void c(i0 i0Var) {
        d dVar = (d) this;
        io.grpc.h hVar = dVar.f11944h;
        if (hVar == dVar.f11940c) {
            hVar = dVar.f;
        }
        hVar.c(i0Var);
    }

    @Override // io.grpc.h
    public final void d(h.f fVar) {
        d dVar = (d) this;
        io.grpc.h hVar = dVar.f11944h;
        if (hVar == dVar.f11940c) {
            hVar = dVar.f;
        }
        hVar.d(fVar);
    }

    @Override // io.grpc.h
    public final void e() {
        d dVar = (d) this;
        io.grpc.h hVar = dVar.f11944h;
        if (hVar == dVar.f11940c) {
            hVar = dVar.f;
        }
        hVar.e();
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        d dVar = (d) this;
        io.grpc.h hVar = dVar.f11944h;
        if (hVar == dVar.f11940c) {
            hVar = dVar.f;
        }
        c10.c(hVar, "delegate");
        return c10.toString();
    }
}
