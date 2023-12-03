package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.internal.d1;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ub  reason: invalid package */
/* loaded from: classes.dex */
public final class ub implements gc {

    /* renamed from: d  reason: collision with root package name */
    public static final d1 f8179d = new d1(4);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f8180a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8181b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8182c;

    public ub(byte[] bArr, int i6) {
        if (r.F(2)) {
            mc.b(bArr.length);
            this.f8180a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f8179d.get()).getBlockSize();
            this.f8182c = blockSize;
            if (i6 >= 12 && i6 <= blockSize) {
                this.f8181b = i6;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gc
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i6 = this.f8181b;
        if (length >= i6) {
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, 0, bArr2, 0, i6);
            int i10 = this.f8181b;
            int i11 = length - i10;
            byte[] bArr3 = new byte[i11];
            Cipher cipher = (Cipher) f8179d.get();
            byte[] bArr4 = new byte[this.f8182c];
            System.arraycopy(bArr2, 0, bArr4, 0, i6);
            cipher.init(2, this.f8180a, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i10, i11, bArr3, 0) == i11) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
