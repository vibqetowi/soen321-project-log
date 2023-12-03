package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p6  reason: invalid package */
/* loaded from: classes.dex */
public abstract class p6 {

    /* renamed from: a  reason: collision with root package name */
    public final Class f8046a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f8047b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f8048c;

    @SafeVarargs
    public p6(Class cls, a7... a7VarArr) {
        this.f8046a = cls;
        HashMap hashMap = new HashMap();
        for (int i6 = 0; i6 <= 0; i6++) {
            a7 a7Var = a7VarArr[i6];
            boolean containsKey = hashMap.containsKey(a7Var.f7706a);
            Class cls2 = a7Var.f7706a;
            if (!containsKey) {
                hashMap.put(cls2, a7Var);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls2.getCanonicalName())));
            }
        }
        this.f8048c = a7VarArr[0].f7706a;
        this.f8047b = Collections.unmodifiableMap(hashMap);
    }

    public abstract o6 a();

    public abstract int b();

    public abstract b2 c(h0 h0Var);

    public abstract String d();

    public abstract void e(b2 b2Var);

    public int f() {
        return 1;
    }

    public final Object g(b2 b2Var, Class cls) {
        a7 a7Var = (a7) this.f8047b.get(cls);
        if (a7Var != null) {
            return a7Var.a(b2Var);
        }
        throw new IllegalArgumentException(b.m("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }
}
