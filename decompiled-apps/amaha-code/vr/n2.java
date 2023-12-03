package vr;

import io.grpc.h;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.f;
/* compiled from: PickFirstLoadBalancer.java */
/* loaded from: classes2.dex */
public final class n2 extends io.grpc.h {

    /* renamed from: c  reason: collision with root package name */
    public final h.c f35789c;

    /* renamed from: d  reason: collision with root package name */
    public h.g f35790d;

    /* compiled from: PickFirstLoadBalancer.java */
    /* loaded from: classes2.dex */
    public class a implements h.i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h.g f35791a;

        public a(h.g gVar) {
            this.f35791a = gVar;
        }

        @Override // io.grpc.h.i
        public final void a(tr.k kVar) {
            h.AbstractC0310h bVar;
            n2 n2Var = n2.this;
            n2Var.getClass();
            tr.j jVar = kVar.f33510a;
            if (jVar != tr.j.SHUTDOWN) {
                tr.j jVar2 = tr.j.TRANSIENT_FAILURE;
                h.c cVar = n2Var.f35789c;
                if (jVar == jVar2 || jVar == tr.j.IDLE) {
                    cVar.e();
                }
                int ordinal = jVar.ordinal();
                if (ordinal != 0) {
                    h.g gVar = this.f35791a;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                bVar = new c(gVar);
                            } else {
                                throw new IllegalArgumentException("Unsupported state:" + jVar);
                            }
                        } else {
                            bVar = new b(h.d.a(kVar.f33511b));
                        }
                    } else {
                        bVar = new b(h.d.b(gVar, null));
                    }
                } else {
                    bVar = new b(h.d.f20470e);
                }
                cVar.f(jVar, bVar);
            }
        }
    }

    /* compiled from: PickFirstLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.AbstractC0310h {

        /* renamed from: a  reason: collision with root package name */
        public final h.d f35793a;

        public b(h.d dVar) {
            sc.b.w(dVar, "result");
            this.f35793a = dVar;
        }

        @Override // io.grpc.h.AbstractC0310h
        public final h.d a(h.e eVar) {
            return this.f35793a;
        }

        public final String toString() {
            f.a aVar = new f.a(b.class.getSimpleName());
            aVar.c(this.f35793a, "result");
            return aVar.toString();
        }
    }

    /* compiled from: PickFirstLoadBalancer.java */
    /* loaded from: classes2.dex */
    public final class c extends h.AbstractC0310h {

        /* renamed from: a  reason: collision with root package name */
        public final h.g f35794a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicBoolean f35795b = new AtomicBoolean(false);

        /* compiled from: PickFirstLoadBalancer.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.this.f35794a.e();
            }
        }

        public c(h.g gVar) {
            sc.b.w(gVar, "subchannel");
            this.f35794a = gVar;
        }

        @Override // io.grpc.h.AbstractC0310h
        public final h.d a(h.e eVar) {
            if (this.f35795b.compareAndSet(false, true)) {
                n2.this.f35789c.d().execute(new a());
            }
            return h.d.f20470e;
        }
    }

    public n2(h.c cVar) {
        sc.b.w(cVar, "helper");
        this.f35789c = cVar;
    }

    @Override // io.grpc.h
    public final boolean a(h.f fVar) {
        List<io.grpc.d> list = fVar.f20475a;
        if (list.isEmpty()) {
            tr.i0 i0Var = tr.i0.f33488m;
            c(i0Var.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + fVar.f20476b));
            return false;
        }
        h.g gVar = this.f35790d;
        if (gVar == null) {
            h.a.C0309a c0309a = new h.a.C0309a();
            c0309a.a(list);
            h.a aVar = new h.a(c0309a.f20467a, c0309a.f20468b, c0309a.f20469c);
            h.c cVar = this.f35789c;
            h.g a10 = cVar.a(aVar);
            a10.g(new a(a10));
            this.f35790d = a10;
            cVar.f(tr.j.CONNECTING, new b(h.d.b(a10, null)));
            a10.e();
            return true;
        }
        gVar.h(list);
        return true;
    }

    @Override // io.grpc.h
    public final void c(tr.i0 i0Var) {
        h.g gVar = this.f35790d;
        if (gVar != null) {
            gVar.f();
            this.f35790d = null;
        }
        this.f35789c.f(tr.j.TRANSIENT_FAILURE, new b(h.d.a(i0Var)));
    }

    @Override // io.grpc.h
    public final void e() {
        h.g gVar = this.f35790d;
        if (gVar != null) {
            gVar.e();
        }
    }

    @Override // io.grpc.h
    public final void f() {
        h.g gVar = this.f35790d;
        if (gVar != null) {
            gVar.f();
        }
    }
}
