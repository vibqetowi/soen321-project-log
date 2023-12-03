package vr;

import io.grpc.h;
import nc.f;
/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public final class u1 extends h.AbstractC0310h {

    /* renamed from: a  reason: collision with root package name */
    public final h.d f35996a;

    public u1(Throwable th2) {
        tr.i0 f = tr.i0.f33487l.g("Panic! This is a bug!").f(th2);
        h.d dVar = h.d.f20470e;
        sc.b.s("drop status shouldn't be OK", !f.e());
        this.f35996a = new h.d(null, null, f, true);
    }

    @Override // io.grpc.h.AbstractC0310h
    public final h.d a(h.e eVar) {
        return this.f35996a;
    }

    public final String toString() {
        f.a aVar = new f.a(u1.class.getSimpleName());
        aVar.c(this.f35996a, "panicPickResult");
        return aVar.toString();
    }
}
