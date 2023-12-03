package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t3  reason: invalid package */
/* loaded from: classes.dex */
public final class t3 implements u3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b7 f8149a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p6 f8150b;

    public t3(b7 b7Var, s4 s4Var) {
        this.f8149a = b7Var;
        this.f8150b = s4Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u3
    public final q3 b() {
        b7 b7Var = this.f8149a;
        return new j4(b7Var, this.f8150b, b7Var.f8048c);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u3
    public final Class c() {
        return this.f8149a.getClass();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u3
    public final Set d() {
        return this.f8149a.f8047b.keySet();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u3
    public final Class e() {
        return this.f8150b.getClass();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u3
    public final q3 f(Class cls) {
        try {
            return new j4(this.f8149a, this.f8150b, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }
}
