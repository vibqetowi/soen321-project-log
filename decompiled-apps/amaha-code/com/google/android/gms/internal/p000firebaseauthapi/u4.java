package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u4  reason: invalid package */
/* loaded from: classes.dex */
public final class u4 implements m3 {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f8165c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final ab f8166a;

    /* renamed from: b  reason: collision with root package name */
    public final m3 f8167b;

    public u4(ab abVar, m3 m3Var) {
        this.f8166a = abVar;
        this.f8167b = m3Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i6 = wrap.getInt();
            if (i6 > 0 && i6 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i6];
                wrap.get(bArr3, 0, i6);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((m3) k4.d(this.f8166a.A(), this.f8167b.a(bArr3, f8165c))).a(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m3
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
