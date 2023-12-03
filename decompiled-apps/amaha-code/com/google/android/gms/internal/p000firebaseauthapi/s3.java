package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s3  reason: invalid package */
/* loaded from: classes.dex */
public final class s3 implements u3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p6 f8123a;

    public s3(p6 p6Var) {
        this.f8123a = p6Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u3
    public final q3 b() {
        p6 p6Var = this.f8123a;
        return new r3(p6Var, p6Var.f8048c);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u3
    public final Class c() {
        return this.f8123a.getClass();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u3
    public final Set d() {
        return this.f8123a.f8047b.keySet();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u3
    public final Class e() {
        return null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u3
    public final q3 f(Class cls) {
        try {
            return new r3(this.f8123a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }
}
