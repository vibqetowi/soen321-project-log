package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import sc.b;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xb  reason: invalid package */
/* loaded from: classes.dex */
public final class xb implements n3 {

    /* renamed from: c  reason: collision with root package name */
    public static final List f8243c = Arrays.asList(64);

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f8244d = new byte[16];

    /* renamed from: a  reason: collision with root package name */
    public final q f8245a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f8246b;

    public xb(byte[] bArr) {
        if (r.F(1)) {
            int length = bArr.length;
            if (f8243c.contains(Integer.valueOf(length))) {
                int i6 = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i6);
                this.f8246b = Arrays.copyOfRange(bArr, i6, length);
                this.f8245a = new q(copyOfRange);
                return;
            }
            throw new InvalidKeyException(c.q("invalid key size: ", length, " bytes; key must have 64 bytes"));
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] S;
        int length = bArr.length;
        if (length >= 16) {
            Cipher cipher = (Cipher) dc.f7781e.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f8246b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && lc.a()) {
                doFinal = new byte[0];
            }
            byte[][] bArr4 = {bArr2, doFinal};
            q qVar = this.f8245a;
            byte[] a10 = qVar.a(f8244d, 16);
            for (int i6 = 0; i6 <= 0; i6++) {
                byte[] bArr5 = bArr4[i6];
                if (bArr5 == null) {
                    bArr5 = new byte[0];
                }
                a10 = r.S(b.r0(a10), qVar.a(bArr5, 16));
            }
            byte[] bArr6 = bArr4[1];
            int length2 = bArr6.length;
            if (length2 >= 16) {
                int length3 = a10.length;
                if (length2 >= length3) {
                    int i10 = length2 - length3;
                    S = Arrays.copyOf(bArr6, length2);
                    for (int i11 = 0; i11 < a10.length; i11++) {
                        int i12 = i10 + i11;
                        S[i12] = (byte) (S[i12] ^ a10[i11]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                int length4 = bArr6.length;
                if (length4 < 16) {
                    byte[] copyOf = Arrays.copyOf(bArr6, 16);
                    copyOf[length4] = Byte.MIN_VALUE;
                    S = r.S(copyOf, b.r0(a10));
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            if (r.M(copyOfRange, qVar.a(S, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
