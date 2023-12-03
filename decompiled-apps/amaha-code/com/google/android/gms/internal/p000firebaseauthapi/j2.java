package com.google.android.gms.internal.p000firebaseauthapi;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j2  reason: invalid package */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: c  reason: collision with root package name */
    public static final j2 f7908c = new j2();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f7910b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final u1 f7909a = new u1();

    public final m2 a(Class cls) {
        f2 f2Var;
        Class cls2;
        Charset charset = i1.f7886a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f7910b;
            m2 m2Var = (m2) concurrentHashMap.get(cls);
            if (m2Var == null) {
                u1 u1Var = this.f7909a;
                u1Var.getClass();
                Class cls3 = n2.f7998a;
                if (!e1.class.isAssignableFrom(cls) && (cls2 = n2.f7998a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                z1 a10 = u1Var.f8163a.a(cls);
                if (a10.b()) {
                    if (e1.class.isAssignableFrom(cls)) {
                        f2Var = new f2(n2.f8001d, u0.f8160a, a10.a());
                    } else {
                        x2 x2Var = n2.f7999b;
                        s0 s0Var = u0.f8161b;
                        if (s0Var != null) {
                            f2Var = new f2(x2Var, s0Var, a10.a());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    m2Var = f2Var;
                } else {
                    boolean z10 = false;
                    if (e1.class.isAssignableFrom(cls)) {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            int i6 = h2.f7871a;
                            m2Var = e2.K(a10, p1.f8036b, n2.f8001d, u0.f8160a, y1.f8251b);
                        } else {
                            int i10 = h2.f7871a;
                            m2Var = e2.K(a10, p1.f8036b, n2.f8001d, null, y1.f8251b);
                        }
                    } else {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            int i11 = h2.f7871a;
                            n1 n1Var = p1.f8035a;
                            x2 x2Var2 = n2.f7999b;
                            s0 s0Var2 = u0.f8161b;
                            if (s0Var2 != null) {
                                m2Var = e2.K(a10, n1Var, x2Var2, s0Var2, y1.f8250a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            int i12 = h2.f7871a;
                            m2Var = e2.K(a10, p1.f8035a, n2.f8000c, null, y1.f8250a);
                        }
                    }
                }
                m2 m2Var2 = (m2) concurrentHashMap.putIfAbsent(cls, m2Var);
                if (m2Var2 != null) {
                    return m2Var2;
                }
            }
            return m2Var;
        }
        throw new NullPointerException("messageType");
    }
}
