package cs;

import io.grpc.h;
import java.util.concurrent.ScheduledExecutorService;
import nc.f;
import tr.l0;
/* compiled from: ForwardingLoadBalancerHelper.java */
/* loaded from: classes2.dex */
public abstract class b extends h.c {
    @Override // io.grpc.h.c
    public h.g a(h.a aVar) {
        return g().a(aVar);
    }

    @Override // io.grpc.h.c
    public final tr.b b() {
        return g().b();
    }

    @Override // io.grpc.h.c
    public final ScheduledExecutorService c() {
        return g().c();
    }

    @Override // io.grpc.h.c
    public final l0 d() {
        return g().d();
    }

    @Override // io.grpc.h.c
    public final void e() {
        g().e();
    }

    public abstract h.c g();

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(g(), "delegate");
        return c10.toString();
    }
}
