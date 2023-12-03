package tr;

import nc.f;
/* compiled from: PartialForwardingClientCall.java */
/* loaded from: classes2.dex */
public abstract class e0<ReqT, RespT> extends c<ReqT, RespT> {
    @Override // tr.c
    public void a(String str, Throwable th2) {
        f().a(str, th2);
    }

    @Override // tr.c
    public void b() {
        f().b();
    }

    @Override // tr.c
    public final void c(int i6) {
        f().c(i6);
    }

    public abstract c<?, ?> f();

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(f(), "delegate");
        return c10.toString();
    }
}
