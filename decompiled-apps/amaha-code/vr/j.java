package vr;

import io.grpc.h;
import vr.q1;
/* compiled from: AutoConfiguredLoadBalancerFactory.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final io.grpc.j f35714a;

    /* renamed from: b  reason: collision with root package name */
    public final String f35715b;

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h.c f35716a;

        /* renamed from: b  reason: collision with root package name */
        public io.grpc.h f35717b;

        /* renamed from: c  reason: collision with root package name */
        public io.grpc.i f35718c;

        public a(q1.l lVar) {
            this.f35716a = lVar;
            io.grpc.j jVar = j.this.f35714a;
            String str = j.this.f35715b;
            io.grpc.i c10 = jVar.c(str);
            this.f35718c = c10;
            if (c10 != null) {
                this.f35717b = c10.a(lVar);
                return;
            }
            throw new IllegalStateException(defpackage.b.m("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.AbstractC0310h {
        @Override // io.grpc.h.AbstractC0310h
        public final h.d a(h.e eVar) {
            return h.d.f20470e;
        }

        public final String toString() {
            return nc.f.b(b.class).toString();
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* loaded from: classes2.dex */
    public static final class c extends h.AbstractC0310h {

        /* renamed from: a  reason: collision with root package name */
        public final tr.i0 f35720a;

        public c(tr.i0 i0Var) {
            this.f35720a = i0Var;
        }

        @Override // io.grpc.h.AbstractC0310h
        public final h.d a(h.e eVar) {
            return h.d.a(this.f35720a);
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* loaded from: classes2.dex */
    public static final class e extends Exception {
        public e(String str) {
            super(str);
        }
    }

    public j(String str) {
        io.grpc.j b10 = io.grpc.j.b();
        sc.b.w(b10, "registry");
        this.f35714a = b10;
        sc.b.w(str, "defaultPolicy");
        this.f35715b = str;
    }

    public static io.grpc.i a(j jVar, String str) {
        io.grpc.i c10 = jVar.f35714a.c(str);
        if (c10 != null) {
            return c10;
        }
        throw new e(defpackage.b.m("Trying to load '", str, "' because using default policy, but it's unavailable"));
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* loaded from: classes2.dex */
    public static final class d extends io.grpc.h {
        @Override // io.grpc.h
        public final boolean a(h.f fVar) {
            return true;
        }

        @Override // io.grpc.h
        public final void f() {
        }

        @Override // io.grpc.h
        public final void c(tr.i0 i0Var) {
        }

        @Override // io.grpc.h
        @Deprecated
        public final void d(h.f fVar) {
        }
    }
}
