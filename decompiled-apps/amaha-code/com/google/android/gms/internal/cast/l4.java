package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class l4 {

    /* renamed from: c  reason: collision with root package name */
    public static final l4 f7583c = new l4();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f7585b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final v3 f7584a = new v3();

    public final <T> o4<T> a(Class<T> cls) {
        h4 h4Var;
        Class<?> cls2;
        Charset charset = k3.f7570a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f7585b;
            o4<T> o4Var = (o4) concurrentHashMap.get(cls);
            if (o4Var == null) {
                v3 v3Var = this.f7584a;
                v3Var.getClass();
                Class<?> cls3 = p4.f7621a;
                if (!c3.class.isAssignableFrom(cls) && (cls2 = p4.f7621a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                a4 b10 = v3Var.f7665a.b(cls);
                if (b10.a()) {
                    if (c3.class.isAssignableFrom(cls)) {
                        h4Var = new h4(p4.f7624d, v2.f7662a, b10.b());
                    } else {
                        y4<?, ?> y4Var = p4.f7622b;
                        t2<?> t2Var = v2.f7663b;
                        if (t2Var != null) {
                            h4Var = new h4(y4Var, t2Var, b10.b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    o4Var = h4Var;
                } else {
                    boolean z10 = false;
                    if (c3.class.isAssignableFrom(cls)) {
                        if (b10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            int i6 = j4.f7565a;
                            o4Var = g4.n(b10, r3.f7632b, p4.f7624d, v2.f7662a, z3.f7690b);
                        } else {
                            int i10 = j4.f7565a;
                            o4Var = g4.n(b10, r3.f7632b, p4.f7624d, null, z3.f7690b);
                        }
                    } else {
                        if (b10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            int i11 = j4.f7565a;
                            p3 p3Var = r3.f7631a;
                            y4<?, ?> y4Var2 = p4.f7622b;
                            t2<?> t2Var2 = v2.f7663b;
                            if (t2Var2 != null) {
                                o4Var = g4.n(b10, p3Var, y4Var2, t2Var2, z3.f7689a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            int i12 = j4.f7565a;
                            o4Var = g4.n(b10, r3.f7631a, p4.f7623c, null, z3.f7689a);
                        }
                    }
                }
                o4<T> o4Var2 = (o4) concurrentHashMap.putIfAbsent(cls, o4Var);
                if (o4Var2 != null) {
                    return o4Var2;
                }
            }
            return o4Var;
        }
        throw new NullPointerException("messageType");
    }
}
