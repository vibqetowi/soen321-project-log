package com.google.protobuf;

import com.google.protobuf.g0;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: c  reason: collision with root package name */
    public static final b1 f9887c = new b1();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f9889b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final i0 f9888a = new i0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.protobuf.u0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.protobuf.u0] */
    public final <T> g1<T> a(Class<T> cls) {
        t0 D;
        t0 t0Var;
        Class<?> cls2;
        Charset charset = y.f10086a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f9889b;
            g1<T> g1Var = (g1) concurrentHashMap.get(cls);
            if (g1Var == null) {
                i0 i0Var = this.f9888a;
                i0Var.getClass();
                Class<?> cls3 = h1.f9933a;
                if (!v.class.isAssignableFrom(cls) && (cls2 = h1.f9933a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
                o0 a10 = i0Var.f9965a.a(cls);
                if (a10.a()) {
                    if (v.class.isAssignableFrom(cls)) {
                        t0Var = new u0(h1.f9936d, q.f10015a, a10.b());
                    } else {
                        m1<?, ?> m1Var = h1.f9934b;
                        o<?> oVar = q.f10016b;
                        if (oVar != null) {
                            t0Var = new u0(m1Var, oVar, a10.b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    D = t0Var;
                } else {
                    boolean z10 = false;
                    if (v.class.isAssignableFrom(cls)) {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            D = t0.D(a10, x0.f10085b, g0.f9920b, h1.f9936d, q.f10015a, n0.f10006b);
                        } else {
                            D = t0.D(a10, x0.f10085b, g0.f9920b, h1.f9936d, null, n0.f10006b);
                        }
                    } else {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            v0 v0Var = x0.f10084a;
                            g0.a aVar = g0.f9919a;
                            m1<?, ?> m1Var2 = h1.f9934b;
                            o<?> oVar2 = q.f10016b;
                            if (oVar2 != null) {
                                D = t0.D(a10, v0Var, aVar, m1Var2, oVar2, n0.f10005a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            D = t0.D(a10, x0.f10084a, g0.f9919a, h1.f9935c, null, n0.f10005a);
                        }
                    }
                }
                g1<T> g1Var2 = (g1) concurrentHashMap.putIfAbsent(cls, D);
                if (g1Var2 != null) {
                    return g1Var2;
                }
                return D;
            }
            return g1Var;
        }
        throw new NullPointerException("messageType");
    }
}
