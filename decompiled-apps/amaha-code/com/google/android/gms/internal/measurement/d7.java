package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class d7 {

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f8338c = new d7();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f8340b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final o6 f8339a = new o6();

    public final g7 a(Class cls) {
        z6 z6Var;
        Class cls2;
        Charset charset = c6.f8318a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f8340b;
            g7 g7Var = (g7) concurrentHashMap.get(cls);
            if (g7Var == null) {
                o6 o6Var = this.f8339a;
                o6Var.getClass();
                Class cls3 = h7.f8413a;
                if (!w5.class.isAssignableFrom(cls) && (cls2 = h7.f8413a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                t6 a10 = o6Var.f8538a.a(cls);
                if (a10.b()) {
                    if (w5.class.isAssignableFrom(cls)) {
                        z6Var = new z6(h7.f8416d, l5.f8454a, a10.a());
                    } else {
                        r7 r7Var = h7.f8414b;
                        j5 j5Var = l5.f8455b;
                        if (j5Var != null) {
                            z6Var = new z6(r7Var, j5Var, a10.a());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    g7Var = z6Var;
                } else {
                    boolean z10 = false;
                    if (w5.class.isAssignableFrom(cls)) {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            int i6 = b7.f8313a;
                            g7Var = y6.F(a10, k6.f8449b, h7.f8416d, l5.f8454a, s6.f8594b);
                        } else {
                            int i10 = b7.f8313a;
                            g7Var = y6.F(a10, k6.f8449b, h7.f8416d, null, s6.f8594b);
                        }
                    } else {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            int i11 = b7.f8313a;
                            h6 h6Var = k6.f8448a;
                            r7 r7Var2 = h7.f8414b;
                            j5 j5Var2 = l5.f8455b;
                            if (j5Var2 != null) {
                                g7Var = y6.F(a10, h6Var, r7Var2, j5Var2, s6.f8593a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            int i12 = b7.f8313a;
                            g7Var = y6.F(a10, k6.f8448a, h7.f8415c, null, s6.f8593a);
                        }
                    }
                }
                g7 g7Var2 = (g7) concurrentHashMap.putIfAbsent(cls, g7Var);
                if (g7Var2 != null) {
                    return g7Var2;
                }
            }
            return g7Var;
        }
        throw new NullPointerException("messageType");
    }
}
