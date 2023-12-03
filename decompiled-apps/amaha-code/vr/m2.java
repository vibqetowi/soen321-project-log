package vr;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* compiled from: OobChannel.java */
/* loaded from: classes2.dex */
public final class m2 extends tr.b0 implements tr.v<Object> {
    static {
        Logger.getLogger(m2.class.getName());
    }

    @Override // tr.b0
    public final tr.j E() {
        return tr.j.IDLE;
    }

    @Override // tr.b0
    public final tr.b0 G() {
        tr.i0.f33488m.g("OobChannel.shutdownNow() called");
        throw null;
    }

    @Override // tr.v
    public final tr.w g() {
        return null;
    }

    @Override // androidx.work.k
    public final String i() {
        return null;
    }

    public final String toString() {
        nc.f.c(this);
        throw null;
    }

    @Override // androidx.work.k
    public final <RequestT, ResponseT> tr.c<RequestT, ResponseT> w(tr.d0<RequestT, ResponseT> d0Var, io.grpc.b bVar) {
        Executor executor = bVar.f20433b;
        if (executor == null) {
            executor = null;
        }
        return new p(d0Var, executor, bVar, null, null, null);
    }
}
