package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r5  reason: invalid package */
/* loaded from: classes.dex */
public final class r5 implements t5 {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.t5
    public final int a() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t5
    public final byte[] b() {
        return z5.f8285k;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t5
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new z4(bArr, 0).a(ByteBuffer.wrap(bArr3), bArr2, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }
}
