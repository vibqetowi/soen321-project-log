package cs;

import cs.f;
import io.grpc.h;
import nc.f;
import tr.i0;
import tr.j;
/* compiled from: GracefulSwitchLoadBalancer.java */
/* loaded from: classes2.dex */
public final class d extends cs.a {

    /* renamed from: l  reason: collision with root package name */
    public static final b f11939l = new b();

    /* renamed from: c  reason: collision with root package name */
    public final a f11940c;

    /* renamed from: d  reason: collision with root package name */
    public final h.c f11941d;

    /* renamed from: e  reason: collision with root package name */
    public h.b f11942e;
    public io.grpc.h f;

    /* renamed from: g  reason: collision with root package name */
    public h.b f11943g;

    /* renamed from: h  reason: collision with root package name */
    public io.grpc.h f11944h;

    /* renamed from: i  reason: collision with root package name */
    public j f11945i;

    /* renamed from: j  reason: collision with root package name */
    public h.AbstractC0310h f11946j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11947k;

    /* compiled from: GracefulSwitchLoadBalancer.java */
    /* loaded from: classes2.dex */
    public class b extends h.AbstractC0310h {
        @Override // io.grpc.h.AbstractC0310h
        public final h.d a(h.e eVar) {
            return h.d.f20470e;
        }

        public final String toString() {
            return "BUFFER_PICKER";
        }
    }

    public d(f.c cVar) {
        a aVar = new a();
        this.f11940c = aVar;
        this.f = aVar;
        this.f11944h = aVar;
        this.f11941d = cVar;
    }

    @Override // io.grpc.h
    public final void f() {
        this.f11944h.f();
        this.f.f();
    }

    public final void g() {
        this.f11941d.f(this.f11945i, this.f11946j);
        this.f.f();
        this.f = this.f11944h;
        this.f11942e = this.f11943g;
        this.f11944h = this.f11940c;
        this.f11943g = null;
    }

    /* compiled from: GracefulSwitchLoadBalancer.java */
    /* loaded from: classes2.dex */
    public class a extends io.grpc.h {

        /* compiled from: GracefulSwitchLoadBalancer.java */
        /* renamed from: cs.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0176a extends h.AbstractC0310h {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ i0 f11949a;

            public C0176a(i0 i0Var) {
                this.f11949a = i0Var;
            }

            @Override // io.grpc.h.AbstractC0310h
            public final h.d a(h.e eVar) {
                return h.d.a(this.f11949a);
            }

            public final String toString() {
                f.a aVar = new f.a(C0176a.class.getSimpleName());
                aVar.c(this.f11949a, "error");
                return aVar.toString();
            }
        }

        public a() {
        }

        @Override // io.grpc.h
        public final void c(i0 i0Var) {
            d.this.f11941d.f(j.TRANSIENT_FAILURE, new C0176a(i0Var));
        }

        @Override // io.grpc.h
        public final void d(h.f fVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // io.grpc.h
        public final void f() {
        }
    }
}
