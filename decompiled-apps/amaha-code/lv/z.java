package lv;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import lv.s;
/* compiled from: Request.kt */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final t f24751a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24752b;

    /* renamed from: c  reason: collision with root package name */
    public final s f24753c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f24754d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f24755e;
    public d f;

    public z(t tVar, String method, s sVar, c0 c0Var, Map<Class<?>, ? extends Object> map) {
        kotlin.jvm.internal.i.g(method, "method");
        this.f24751a = tVar;
        this.f24752b = method;
        this.f24753c = sVar;
        this.f24754d = c0Var;
        this.f24755e = map;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f24752b);
        sb2.append(", url=");
        sb2.append(this.f24751a);
        s sVar = this.f24753c;
        if (sVar.f24683u.length / 2 != 0) {
            sb2.append(", headers=[");
            int i6 = 0;
            for (hs.f<? extends String, ? extends String> fVar : sVar) {
                int i10 = i6 + 1;
                if (i6 >= 0) {
                    hs.f<? extends String, ? extends String> fVar2 = fVar;
                    String str = (String) fVar2.f19464u;
                    String str2 = (String) fVar2.f19465v;
                    if (i6 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(str);
                    sb2.append(':');
                    sb2.append(str2);
                    i6 = i10;
                } else {
                    ca.a.t1();
                    throw null;
                }
            }
            sb2.append(']');
        }
        Map<Class<?>, Object> map = this.f24755e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* compiled from: Request.kt */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public t f24756a;

        /* renamed from: b  reason: collision with root package name */
        public String f24757b;

        /* renamed from: c  reason: collision with root package name */
        public s.a f24758c;

        /* renamed from: d  reason: collision with root package name */
        public c0 f24759d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f24760e;

        public a() {
            this.f24760e = new LinkedHashMap();
            this.f24757b = "GET";
            this.f24758c = new s.a();
        }

        public final z a() {
            Map unmodifiableMap;
            t tVar = this.f24756a;
            if (tVar != null) {
                String str = this.f24757b;
                s d10 = this.f24758c.d();
                c0 c0Var = this.f24759d;
                Map<Class<?>, Object> map = this.f24760e;
                byte[] bArr = mv.b.f25755a;
                kotlin.jvm.internal.i.g(map, "<this>");
                if (map.isEmpty()) {
                    unmodifiableMap = is.x.f20677u;
                } else {
                    unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
                    kotlin.jvm.internal.i.f(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                }
                return new z(tVar, str, d10, c0Var, unmodifiableMap);
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final void b(String str, String value) {
            kotlin.jvm.internal.i.g(value, "value");
            s.a aVar = this.f24758c;
            aVar.getClass();
            s.b.a(str);
            s.b.b(value, str);
            aVar.f(str);
            aVar.c(str, value);
        }

        public final void c(String method, c0 c0Var) {
            boolean z10;
            kotlin.jvm.internal.i.g(method, "method");
            boolean z11 = false;
            if (method.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (c0Var == null) {
                    if (!(!((kotlin.jvm.internal.i.b(method, "POST") || kotlin.jvm.internal.i.b(method, "PUT") || kotlin.jvm.internal.i.b(method, "PATCH") || kotlin.jvm.internal.i.b(method, "PROPPATCH") || kotlin.jvm.internal.i.b(method, "REPORT")) ? true : true))) {
                        throw new IllegalArgumentException(defpackage.b.m("method ", method, " must have a request body.").toString());
                    }
                } else if (!kotlin.jvm.internal.b0.p(method)) {
                    throw new IllegalArgumentException(defpackage.b.m("method ", method, " must not have a request body.").toString());
                }
                this.f24757b = method;
                this.f24759d = c0Var;
                return;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public final void d(Class type, Object obj) {
            kotlin.jvm.internal.i.g(type, "type");
            if (obj == null) {
                this.f24760e.remove(type);
                return;
            }
            if (this.f24760e.isEmpty()) {
                this.f24760e = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.f24760e;
            Object cast = type.cast(obj);
            kotlin.jvm.internal.i.d(cast);
            map.put(type, cast);
        }

        public a(z zVar) {
            LinkedHashMap z02;
            this.f24760e = new LinkedHashMap();
            this.f24756a = zVar.f24751a;
            this.f24757b = zVar.f24752b;
            this.f24759d = zVar.f24754d;
            Map<Class<?>, Object> map = zVar.f24755e;
            if (map.isEmpty()) {
                z02 = new LinkedHashMap();
            } else {
                z02 = is.e0.z0(map);
            }
            this.f24760e = z02;
            this.f24758c = zVar.f24753c.o();
        }
    }
}
