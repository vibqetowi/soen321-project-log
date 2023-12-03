package io.grpc;

import io.grpc.e;
import java.util.concurrent.TimeUnit;
import nc.f;
/* compiled from: ForwardingChannelBuilder.java */
/* loaded from: classes2.dex */
public abstract class e<T extends e<T>> extends k<T> {
    @Override // io.grpc.k
    public final void b(TimeUnit timeUnit) {
        ((ur.a) this).f34493a.b(timeUnit);
    }

    @Override // io.grpc.k
    public final void c() {
        ((ur.a) this).f34493a.c();
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(((ur.a) this).f34493a, "delegate");
        return c10.toString();
    }
}
