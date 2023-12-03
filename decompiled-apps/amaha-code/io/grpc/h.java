package io.grpc;

import cs.f;
import io.grpc.a;
import io.grpc.c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import nc.f;
import tr.i0;
import tr.l0;
/* compiled from: LoadBalancer.java */
/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a.b<Map<String, ?>> f20462b = new a.b<>("internal:health-checking-config");

    /* renamed from: a  reason: collision with root package name */
    public int f20463a;

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<io.grpc.d> f20464a;

        /* renamed from: b  reason: collision with root package name */
        public final io.grpc.a f20465b;

        /* renamed from: c  reason: collision with root package name */
        public final Object[][] f20466c;

        /* compiled from: LoadBalancer.java */
        /* renamed from: io.grpc.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0309a {

            /* renamed from: a  reason: collision with root package name */
            public List<io.grpc.d> f20467a;

            /* renamed from: b  reason: collision with root package name */
            public io.grpc.a f20468b = io.grpc.a.f20426b;

            /* renamed from: c  reason: collision with root package name */
            public Object[][] f20469c = (Object[][]) Array.newInstance(Object.class, 0, 2);

            public final void a(List list) {
                sc.b.s("addrs is empty", !list.isEmpty());
                this.f20467a = Collections.unmodifiableList(new ArrayList(list));
            }
        }

        public a(List list, io.grpc.a aVar, Object[][] objArr) {
            sc.b.w(list, "addresses are not set");
            this.f20464a = list;
            sc.b.w(aVar, "attrs");
            this.f20465b = aVar;
            sc.b.w(objArr, "customOptions");
            this.f20466c = objArr;
        }

        public final String toString() {
            f.a c10 = nc.f.c(this);
            c10.c(this.f20464a, "addrs");
            c10.c(this.f20465b, "attrs");
            c10.c(Arrays.deepToString(this.f20466c), "customOptions");
            return c10.toString();
        }
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static abstract class b {
        public abstract h a(c cVar);
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static abstract class c {
        public abstract g a(a aVar);

        public abstract tr.b b();

        public abstract ScheduledExecutorService c();

        public abstract l0 d();

        public abstract void e();

        public abstract void f(tr.j jVar, AbstractC0310h abstractC0310h);
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: e  reason: collision with root package name */
        public static final d f20470e = new d(null, null, i0.f33481e, false);

        /* renamed from: a  reason: collision with root package name */
        public final g f20471a;

        /* renamed from: b  reason: collision with root package name */
        public final c.a f20472b;

        /* renamed from: c  reason: collision with root package name */
        public final i0 f20473c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f20474d;

        public d(g gVar, f.g.b bVar, i0 i0Var, boolean z10) {
            this.f20471a = gVar;
            this.f20472b = bVar;
            sc.b.w(i0Var, "status");
            this.f20473c = i0Var;
            this.f20474d = z10;
        }

        public static d a(i0 i0Var) {
            sc.b.s("error status shouldn't be OK", !i0Var.e());
            return new d(null, null, i0Var, false);
        }

        public static d b(g gVar, f.g.b bVar) {
            sc.b.w(gVar, "subchannel");
            return new d(gVar, bVar, i0.f33481e, false);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!f6.b.v0(this.f20471a, dVar.f20471a) || !f6.b.v0(this.f20473c, dVar.f20473c) || !f6.b.v0(this.f20472b, dVar.f20472b) || this.f20474d != dVar.f20474d) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f20471a, this.f20473c, this.f20472b, Boolean.valueOf(this.f20474d)});
        }

        public final String toString() {
            f.a c10 = nc.f.c(this);
            c10.c(this.f20471a, "subchannel");
            c10.c(this.f20472b, "streamTracerFactory");
            c10.c(this.f20473c, "status");
            c10.d("drop", this.f20474d);
            return c10.toString();
        }
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static abstract class e {
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final List<io.grpc.d> f20475a;

        /* renamed from: b  reason: collision with root package name */
        public final io.grpc.a f20476b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f20477c;

        public f() {
            throw null;
        }

        public f(List list, io.grpc.a aVar, Object obj) {
            sc.b.w(list, "addresses");
            this.f20475a = Collections.unmodifiableList(new ArrayList(list));
            sc.b.w(aVar, "attributes");
            this.f20476b = aVar;
            this.f20477c = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (!f6.b.v0(this.f20475a, fVar.f20475a) || !f6.b.v0(this.f20476b, fVar.f20476b) || !f6.b.v0(this.f20477c, fVar.f20477c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f20475a, this.f20476b, this.f20477c});
        }

        public final String toString() {
            f.a c10 = nc.f.c(this);
            c10.c(this.f20475a, "addresses");
            c10.c(this.f20476b, "attributes");
            c10.c(this.f20477c, "loadBalancingPolicyConfig");
            return c10.toString();
        }
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static abstract class g {
        public final io.grpc.d a() {
            List<io.grpc.d> b10 = b();
            boolean z10 = true;
            if (b10.size() != 1) {
                z10 = false;
            }
            sc.b.z(b10, "%s does not have exactly one group", z10);
            return b10.get(0);
        }

        public List<io.grpc.d> b() {
            throw new UnsupportedOperationException();
        }

        public abstract io.grpc.a c();

        public Object d() {
            throw new UnsupportedOperationException();
        }

        public abstract void e();

        public abstract void f();

        public void g(i iVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void h(List<io.grpc.d> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: LoadBalancer.java */
    /* renamed from: io.grpc.h$h  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0310h {
        public abstract d a(e eVar);
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public interface i {
        void a(tr.k kVar);
    }

    public boolean a(f fVar) {
        List<io.grpc.d> list = fVar.f20475a;
        if (list.isEmpty() && !b()) {
            i0 i0Var = i0.f33488m;
            c(i0Var.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + fVar.f20476b));
            return false;
        }
        int i6 = this.f20463a;
        this.f20463a = i6 + 1;
        if (i6 == 0) {
            d(fVar);
        }
        this.f20463a = 0;
        return true;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(i0 i0Var);

    public void d(f fVar) {
        int i6 = this.f20463a;
        this.f20463a = i6 + 1;
        if (i6 == 0) {
            a(fVar);
        }
        this.f20463a = 0;
    }

    public abstract void f();

    public void e() {
    }
}
