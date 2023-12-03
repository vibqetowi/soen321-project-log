package io.grpc;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import nc.f;
import tr.g0;
import tr.i0;
import tr.l0;
/* compiled from: NameResolver.java */
/* loaded from: classes2.dex */
public abstract class l {

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20484a;

        /* renamed from: b  reason: collision with root package name */
        public final g0 f20485b;

        /* renamed from: c  reason: collision with root package name */
        public final l0 f20486c;

        /* renamed from: d  reason: collision with root package name */
        public final f f20487d;

        /* renamed from: e  reason: collision with root package name */
        public final ScheduledExecutorService f20488e;
        public final tr.b f;

        /* renamed from: g  reason: collision with root package name */
        public final Executor f20489g;

        /* renamed from: h  reason: collision with root package name */
        public final String f20490h;

        public a(Integer num, g0 g0Var, l0 l0Var, f fVar, ScheduledExecutorService scheduledExecutorService, tr.b bVar, Executor executor, String str) {
            sc.b.w(num, "defaultPort not set");
            this.f20484a = num.intValue();
            sc.b.w(g0Var, "proxyDetector not set");
            this.f20485b = g0Var;
            sc.b.w(l0Var, "syncContext not set");
            this.f20486c = l0Var;
            sc.b.w(fVar, "serviceConfigParser not set");
            this.f20487d = fVar;
            this.f20488e = scheduledExecutorService;
            this.f = bVar;
            this.f20489g = executor;
            this.f20490h = str;
        }

        public final String toString() {
            f.a c10 = nc.f.c(this);
            c10.a(this.f20484a, "defaultPort");
            c10.c(this.f20485b, "proxyDetector");
            c10.c(this.f20486c, "syncContext");
            c10.c(this.f20487d, "serviceConfigParser");
            c10.c(this.f20488e, "scheduledExecutorService");
            c10.c(this.f, "channelLogger");
            c10.c(this.f20489g, "executor");
            c10.c(this.f20490h, "overrideAuthority");
            return c10.toString();
        }
    }

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static abstract class c {
        public abstract String a();

        public abstract l b(URI uri, a aVar);
    }

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static abstract class d {
        public abstract void a(i0 i0Var);

        public abstract void b(e eVar);
    }

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final List<io.grpc.d> f20493a;

        /* renamed from: b  reason: collision with root package name */
        public final io.grpc.a f20494b;

        /* renamed from: c  reason: collision with root package name */
        public final b f20495c;

        public e(List<io.grpc.d> list, io.grpc.a aVar, b bVar) {
            this.f20493a = Collections.unmodifiableList(new ArrayList(list));
            sc.b.w(aVar, "attributes");
            this.f20494b = aVar;
            this.f20495c = bVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!f6.b.v0(this.f20493a, eVar.f20493a) || !f6.b.v0(this.f20494b, eVar.f20494b) || !f6.b.v0(this.f20495c, eVar.f20495c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f20493a, this.f20494b, this.f20495c});
        }

        public final String toString() {
            f.a c10 = nc.f.c(this);
            c10.c(this.f20493a, "addresses");
            c10.c(this.f20494b, "attributes");
            c10.c(this.f20495c, "serviceConfig");
            return c10.toString();
        }
    }

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static abstract class f {
        public abstract b a(Map<String, ?> map);
    }

    public abstract String a();

    public abstract void b();

    public abstract void c();

    public abstract void d(d dVar);

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final i0 f20491a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f20492b;

        public b(Object obj) {
            this.f20492b = obj;
            this.f20491a = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (f6.b.v0(this.f20491a, bVar.f20491a) && f6.b.v0(this.f20492b, bVar.f20492b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f20491a, this.f20492b});
        }

        public final String toString() {
            Object obj = this.f20492b;
            if (obj != null) {
                f.a c10 = nc.f.c(this);
                c10.c(obj, "config");
                return c10.toString();
            }
            f.a c11 = nc.f.c(this);
            c11.c(this.f20491a, "error");
            return c11.toString();
        }

        public b(i0 i0Var) {
            this.f20492b = null;
            sc.b.w(i0Var, "status");
            this.f20491a = i0Var;
            sc.b.m(i0Var, "cannot use OK status: %s", !i0Var.e());
        }
    }
}
