package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q5  reason: invalid package */
/* loaded from: classes.dex */
public final class q5 implements t5 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8079a;

    public q5(int i6) {
        if (i6 != 16 && i6 != 32) {
            throw new InvalidAlgorithmParameterException(c.p("Unsupported key length: ", i6));
        }
        this.f8079a = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t5
    public final int a() {
        return this.f8079a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t5
    public final byte[] b() {
        int i6 = this.f8079a;
        if (i6 != 16) {
            if (i6 == 32) {
                return z5.f8284j;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return z5.f8283i;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t5
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.f8079a) {
            return new w4(bArr, false).a(bArr2, bArr3);
        }
        throw new InvalidAlgorithmParameterException(c.p("Unexpected key length: ", length));
    }
}
