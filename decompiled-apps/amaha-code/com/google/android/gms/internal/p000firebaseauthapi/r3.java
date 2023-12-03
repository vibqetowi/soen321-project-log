package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r3  reason: invalid package */
/* loaded from: classes.dex */
public class r3 implements q3 {

    /* renamed from: a  reason: collision with root package name */
    public final p6 f8103a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f8104b;

    public r3(p6 p6Var, Class cls) {
        if (!p6Var.f8047b.keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", p6Var.toString(), cls.getName()));
        }
        this.f8103a = p6Var;
        this.f8104b = cls;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q3
    public final Object b(e1 e1Var) {
        p6 p6Var = this.f8103a;
        String concat = "Expected proto of type ".concat(p6Var.f8046a.getName());
        if (p6Var.f8046a.isInstance(e1Var)) {
            Class cls = this.f8104b;
            if (!Void.class.equals(cls)) {
                p6Var.e(e1Var);
                return p6Var.g(e1Var, cls);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q3
    public final Object c(h0 h0Var) {
        p6 p6Var = this.f8103a;
        try {
            b2 c10 = p6Var.c(h0Var);
            Class cls = this.f8104b;
            if (!Void.class.equals(cls)) {
                p6Var.e(c10);
                return p6Var.g(c10, cls);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        } catch (zzadn e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(p6Var.f8046a.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q3
    public final String d() {
        return this.f8103a.d();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q3
    public final b2 e(h0 h0Var) {
        p6 p6Var = this.f8103a;
        try {
            o6 a10 = p6Var.a();
            b2 b10 = a10.b(h0Var);
            a10.d(b10);
            return a10.a(b10);
        } catch (zzadn e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(p6Var.a().f8023a.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q3
    public final ya f(h0 h0Var) {
        p6 p6Var = this.f8103a;
        try {
            o6 a10 = p6Var.a();
            b2 b10 = a10.b(h0Var);
            a10.d(b10);
            b2 a11 = a10.a(b10);
            xa v10 = ya.v();
            String d10 = p6Var.d();
            v10.e();
            ((ya) v10.f7723v).zzd = d10;
            g0 n10 = a11.n();
            v10.e();
            ((ya) v10.f7723v).zze = n10;
            int b11 = p6Var.b();
            v10.e();
            ya.D((ya) v10.f7723v, b11);
            return (ya) v10.c();
        } catch (zzadn e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }
}
