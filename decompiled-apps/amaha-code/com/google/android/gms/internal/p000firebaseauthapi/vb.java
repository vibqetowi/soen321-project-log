package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.internal.d1;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vb  reason: invalid package */
/* loaded from: classes.dex */
public final class vb implements m3 {

    /* renamed from: e  reason: collision with root package name */
    public static final d1 f8208e = new d1(5);
    public static final d1 f = new d1(6);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f8209a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f8210b;

    /* renamed from: c  reason: collision with root package name */
    public final SecretKeySpec f8211c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8212d;

    public vb(byte[] bArr, int i6) {
        if (r.F(1)) {
            if (i6 != 12 && i6 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.f8212d = i6;
            mc.b(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f8211c = secretKeySpec;
            Cipher cipher = (Cipher) f8208e.get();
            cipher.init(1, secretKeySpec);
            byte[] c10 = c(cipher.doFinal(new byte[16]));
            this.f8209a = c10;
            this.f8210b = c(c10);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i6 = 0;
        while (i6 < 15) {
            byte b10 = bArr[i6];
            int i10 = i6 + 1;
            bArr2[i6] = (byte) (((b10 + b10) ^ ((bArr[i10] & 255) >>> 7)) & 255);
            i6 = i10;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b11 + b11));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            bArr3[i6] = (byte) (bArr[i6] ^ bArr2[i6]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i6 = this.f8212d;
        int i10 = (length - i6) - 16;
        if (i10 >= 0) {
            Cipher cipher = (Cipher) f8208e.get();
            SecretKeySpec secretKeySpec = this.f8211c;
            cipher.init(1, secretKeySpec);
            byte[] d10 = d(cipher, 0, bArr, 0, this.f8212d);
            byte[] d11 = d(cipher, 1, bArr2, 0, 0);
            byte[] d12 = d(cipher, 2, bArr, this.f8212d, i10);
            int i11 = length - 16;
            byte b10 = 0;
            for (int i12 = 0; i12 < 16; i12++) {
                b10 = (byte) (b10 | (((bArr[i11 + i12] ^ d11[i12]) ^ d10[i12]) ^ d12[i12]));
            }
            if (b10 == 0) {
                Cipher cipher2 = (Cipher) f.get();
                cipher2.init(1, secretKeySpec, new IvParameterSpec(d10));
                return cipher2.doFinal(bArr, i6, i10);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m3
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] d(Cipher cipher, int i6, byte[] bArr, int i10, int i11) {
        byte[] copyOf;
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i6;
        byte[] bArr3 = this.f8209a;
        if (i11 == 0) {
            return cipher.doFinal(e(bArr2, bArr3));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i12 = 0;
        int i13 = 0;
        while (i11 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                doFinal[i14] = (byte) (doFinal[i14] ^ bArr[(i10 + i13) + i14]);
            }
            doFinal = cipher.doFinal(doFinal);
            i13 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i13 + i10, i10 + i11);
        if (copyOfRange.length == 16) {
            copyOf = e(copyOfRange, bArr3);
        } else {
            copyOf = Arrays.copyOf(this.f8210b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i12 >= length) {
                    break;
                }
                copyOf[i12] = (byte) (copyOf[i12] ^ copyOfRange[i12]);
                i12++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
        }
        return cipher.doFinal(e(doFinal, copyOf));
    }
}
