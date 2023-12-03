package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jc  reason: invalid package */
/* loaded from: classes.dex */
public final class jc implements d4 {

    /* renamed from: a  reason: collision with root package name */
    public final f8 f7919a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7920b;

    public jc(f8 f8Var, int i6) {
        this.f7919a = f8Var;
        this.f7920b = i6;
        if (i6 >= 10) {
            f8Var.a(new byte[0], i6);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d4
    public final void a(byte[] bArr, byte[] bArr2) {
        if (r.M(this.f7919a.a(bArr2, this.f7920b), bArr)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
