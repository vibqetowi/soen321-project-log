package ne;

import android.content.Context;
import oe.a;
/* compiled from: GrpcCallProvider.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public ya.v f26256a = ya.k.c(oe.g.f27422c, new w2.f(3, this));

    /* renamed from: b  reason: collision with root package name */
    public final oe.a f26257b;

    /* renamed from: c  reason: collision with root package name */
    public io.grpc.b f26258c;

    /* renamed from: d  reason: collision with root package name */
    public a.C0452a f26259d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f26260e;
    public final e9.c f;

    /* renamed from: g  reason: collision with root package name */
    public final tr.a f26261g;

    public p(oe.a aVar, Context context, e9.c cVar, j jVar) {
        this.f26257b = aVar;
        this.f26260e = context;
        this.f = cVar;
        this.f26261g = jVar;
    }

    public final void a(tr.b0 b0Var) {
        tr.j E = b0Var.E();
        kc.f.A(1, "GrpcCallProvider", "Current gRPC connectivity state: " + E, new Object[0]);
        if (this.f26259d != null) {
            kc.f.z("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f26259d.a();
            this.f26259d = null;
        }
        if (E == tr.j.CONNECTING) {
            kc.f.A(1, "GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f26259d = this.f26257b.a(a.c.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new o(this, b0Var, 1));
        }
        b0Var.F(E, new o(this, b0Var, 2));
    }
}
