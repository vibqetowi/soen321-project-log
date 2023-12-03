package com.google.android.gms.internal.p000firebaseauthapi;

import f6.b;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z5  reason: invalid package */
/* loaded from: classes.dex */
public final class z5 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f8276a = b(1, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f8277b = b(2, 32);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f8278c = b(2, 16);

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f8279d = b(2, 17);

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f8280e = b(2, 18);
    public static final byte[] f = b(2, 1);

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f8281g = b(2, 2);

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f8282h = b(2, 3);

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f8283i = b(2, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f8284j = b(2, 2);

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f8285k = b(2, 3);

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f8286l = new byte[0];

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f8287m = "KEM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f8288n = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f8289o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    public static void a(sa saVar) {
        if (saVar.A() != 2 && saVar.A() != 1) {
            String str = "UNRECOGNIZED";
            if (saVar.z() != 2 && saVar.z() != 1) {
                if (saVar.y() != 2 && saVar.y() != 1) {
                    return;
                }
                int y10 = saVar.y();
                if (y10 != 2) {
                    if (y10 != 3) {
                        if (y10 != 4) {
                            if (y10 == 5) {
                                str = "CHACHA20_POLY1305";
                            }
                        } else {
                            str = "AES_256_GCM";
                        }
                    } else {
                        str = "AES_128_GCM";
                    }
                } else {
                    str = "AEAD_UNKNOWN";
                }
                throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
            }
            int z10 = saVar.z();
            if (z10 != 2) {
                if (z10 != 3) {
                    if (z10 != 4) {
                        if (z10 == 5) {
                            str = "HKDF_SHA512";
                        }
                    } else {
                        str = "HKDF_SHA384";
                    }
                } else {
                    str = "HKDF_SHA256";
                }
            } else {
                str = "KDF_UNKNOWN";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        throw new GeneralSecurityException("Invalid KEM param: ".concat(b.X0(saVar.A())));
    }

    public static byte[] b(int i6, int i10) {
        byte[] bArr = new byte[i6];
        for (int i11 = 0; i11 < i6; i11++) {
            bArr[i11] = (byte) ((i10 >> (((i6 - i11) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] c(String str, byte[] bArr, byte[] bArr2, int i6) {
        return r.Q(b(2, i6), f8289o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
