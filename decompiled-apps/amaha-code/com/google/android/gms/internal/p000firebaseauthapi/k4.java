package com.google.android.gms.internal.p000firebaseauthapi;

import g.x;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k4  reason: invalid package */
/* loaded from: classes.dex */
public final class k4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7938a = Logger.getLogger(k4.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f7939b = new AtomicReference(new v3());

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap f7940c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap f7941d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap f7942e;
    public static final ConcurrentHashMap f;

    static {
        new ConcurrentHashMap();
        f7942e = new ConcurrentHashMap();
        f = new ConcurrentHashMap();
    }

    public static synchronized ya a(ab abVar) {
        ya f2;
        synchronized (k4.class) {
            q3 b10 = ((v3) f7939b.get()).d(abVar.A()).b();
            if (((Boolean) f7941d.get(abVar.A())).booleanValue()) {
                f2 = b10.f(abVar.z());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(abVar.A())));
            }
        }
        return f2;
    }

    public static synchronized b2 b(ab abVar) {
        b2 e10;
        synchronized (k4.class) {
            q3 b10 = ((v3) f7939b.get()).d(abVar.A()).b();
            if (((Boolean) f7941d.get(abVar.A())).booleanValue()) {
                e10 = b10.e(abVar.z());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(abVar.A())));
            }
        }
        return e10;
    }

    public static Object c(String str, e1 e1Var, Class cls) {
        return ((v3) f7939b.get()).c(cls, str).b(e1Var);
    }

    public static Object d(String str, byte[] bArr) {
        g0 g0Var = h0.f7869v;
        return ((v3) f7939b.get()).c(m3.class, str).c(h0.J(0, bArr, bArr.length));
    }

    public static synchronized void e(b7 b7Var, s4 s4Var) {
        synchronized (k4.class) {
            AtomicReference atomicReference = f7939b;
            v3 v3Var = new v3((v3) atomicReference.get());
            v3Var.a(b7Var, s4Var);
            String d10 = b7Var.d();
            String d11 = s4Var.d();
            h(d10, b7Var.a().c(), true);
            h(d11, Collections.emptyMap(), false);
            if (!((v3) atomicReference.get()).f8195a.containsKey(d10)) {
                f7940c.put(d10, new x(16, b7Var));
                i(b7Var.d(), b7Var.a().c());
            }
            ConcurrentHashMap concurrentHashMap = f7941d;
            concurrentHashMap.put(d10, Boolean.TRUE);
            concurrentHashMap.put(d11, Boolean.FALSE);
            atomicReference.set(v3Var);
        }
    }

    public static synchronized void f(p6 p6Var) {
        synchronized (k4.class) {
            AtomicReference atomicReference = f7939b;
            v3 v3Var = new v3((v3) atomicReference.get());
            v3Var.b(p6Var);
            String d10 = p6Var.d();
            h(d10, p6Var.a().c(), true);
            if (!((v3) atomicReference.get()).f8195a.containsKey(d10)) {
                f7940c.put(d10, new x(16, p6Var));
                i(d10, p6Var.a().c());
            }
            f7941d.put(d10, Boolean.TRUE);
            atomicReference.set(v3Var);
        }
    }

    public static synchronized void g(h4 h4Var) {
        synchronized (k4.class) {
            Class b10 = h4Var.b();
            ConcurrentHashMap concurrentHashMap = f7942e;
            if (concurrentHashMap.containsKey(b10)) {
                h4 h4Var2 = (h4) concurrentHashMap.get(b10);
                if (!h4Var.getClass().getName().equals(h4Var2.getClass().getName())) {
                    f7938a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(b10.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", b10.getName(), h4Var2.getClass().getName(), h4Var.getClass().getName()));
                }
            }
            concurrentHashMap.put(b10, h4Var);
        }
    }

    public static synchronized void h(String str, Map map, boolean z10) {
        synchronized (k4.class) {
            if (z10) {
                ConcurrentHashMap concurrentHashMap = f7941d;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((v3) f7939b.get()).f8195a.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, com.google.android.gms.internal.firebase-auth-api.b2] */
    public static void i(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f.put((String) entry.getKey(), x3.a(((n6) entry.getValue()).f8006b, str, ((n6) entry.getValue()).f8005a.p()));
        }
    }
}
