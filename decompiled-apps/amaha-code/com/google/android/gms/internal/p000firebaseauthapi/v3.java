package com.google.android.gms.internal.p000firebaseauthapi;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v3  reason: invalid package */
/* loaded from: classes.dex */
public final class v3 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f8194b = Logger.getLogger(v3.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f8195a;

    public v3() {
        this.f8195a = new ConcurrentHashMap();
    }

    public final synchronized void a(b7 b7Var, s4 s4Var) {
        Class e10;
        int f = s4Var.f();
        if (r.F(1)) {
            if (r.F(f)) {
                String d10 = b7Var.d();
                String d11 = s4Var.d();
                if (this.f8195a.containsKey(d10) && ((u3) this.f8195a.get(d10)).e() != null && (e10 = ((u3) this.f8195a.get(d10)).e()) != null && !e10.getName().equals(s4.class.getName())) {
                    Logger logger = f8194b;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + d10 + " with inconsistent public key type " + d11);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", b7Var.getClass().getName(), e10.getName(), s4.class.getName()));
                }
                e(new t3(b7Var, s4Var), true);
                e(new s3(s4Var), false);
            } else {
                String valueOf = String.valueOf(s4.class);
                throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
            }
        } else {
            String valueOf2 = String.valueOf(b7Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void b(p6 p6Var) {
        if (r.F(p6Var.f())) {
            e(new s3(p6Var), false);
        } else {
            String valueOf = String.valueOf(p6Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    public final q3 c(Class cls, String str) {
        u3 d10 = d(str);
        if (cls == null) {
            return d10.b();
        }
        if (d10.d().contains(cls)) {
            return d10.f(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(d10.c());
        Set<Class> d11 = d10.d();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class cls2 : d11) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        String sb3 = sb2.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb3);
    }

    public final synchronized u3 d(String str) {
        if (this.f8195a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (u3) this.f8195a.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        r6.f8195a.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(u3 u3Var, boolean z10) {
        String d10 = u3Var.b().d();
        u3 u3Var2 = (u3) this.f8195a.get(d10);
        if (u3Var2 != null && !u3Var2.c().equals(u3Var.c())) {
            f8194b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(d10));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", d10, u3Var2.c().getName(), u3Var.c().getName()));
        }
        this.f8195a.put(d10, u3Var);
    }

    public v3(v3 v3Var) {
        this.f8195a = new ConcurrentHashMap(v3Var.f8195a);
    }
}
