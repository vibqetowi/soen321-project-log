package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.internal.d1;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b5  reason: invalid package */
/* loaded from: classes.dex */
public final class b5 implements m3 {

    /* renamed from: b  reason: collision with root package name */
    public static final d1 f7725b = new d1(3);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f7726a;

    public b5(byte[] bArr) {
        mc.b(bArr.length);
        this.f7726a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec ivParameterSpec;
        if (bArr.length >= 28) {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            } catch (ClassNotFoundException unused) {
                if (lc.a()) {
                    ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            d1 d1Var = f7725b;
            ((Cipher) d1Var.get()).init(2, this.f7726a, ivParameterSpec);
            return ((Cipher) d1Var.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m3
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
