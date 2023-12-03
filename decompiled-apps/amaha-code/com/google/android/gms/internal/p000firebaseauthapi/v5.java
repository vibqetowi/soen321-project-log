package com.google.android.gms.internal.p000firebaseauthapi;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v5  reason: invalid package */
/* loaded from: classes.dex */
public final class v5 implements o3 {
    public static final byte[] f = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final x5 f8197a;

    /* renamed from: b  reason: collision with root package name */
    public final w5 f8198b;

    /* renamed from: c  reason: collision with root package name */
    public final t5 f8199c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8200d;

    /* renamed from: e  reason: collision with root package name */
    public final s5 f8201e;

    public v5(b6 b6Var, w5 w5Var, s5 s5Var, t5 t5Var, int i6) {
        this.f8197a = b6Var;
        this.f8198b = w5Var;
        this.f8201e = s5Var;
        this.f8199c = t5Var;
        this.f8200d = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o3
    public final byte[] a(byte[] bArr) {
        byte[] S;
        int length = bArr.length;
        int i6 = this.f8200d;
        if (length >= i6) {
            byte[] copyOf = Arrays.copyOf(bArr, i6);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f8200d, length);
            x5 x5Var = this.f8197a;
            w5 w5Var = this.f8198b;
            s5 s5Var = this.f8201e;
            t5 t5Var = this.f8199c;
            byte[] q10 = w5Var.q(copyOf, x5Var);
            byte[] Q = r.Q(z5.f8288n, w5Var.b(), s5Var.m(), t5Var.b());
            byte[] bArr2 = z5.f8286l;
            byte[] bArr3 = u5.f8168d;
            byte[] bArr4 = z5.f8289o;
            byte[] Q2 = r.Q(z5.f8276a, s5Var.o(r.Q(bArr4, Q, "psk_id_hash".getBytes(StandardCharsets.UTF_8), bArr3), bArr2), s5Var.o(r.Q(bArr4, Q, "info_hash".getBytes(StandardCharsets.UTF_8), new byte[0]), bArr2));
            byte[] o10 = s5Var.o(r.Q(bArr4, Q, "secret".getBytes(StandardCharsets.UTF_8), bArr3), q10);
            int a10 = t5Var.a();
            byte[] n10 = s5Var.n(o10, z5.c("key", Q2, Q, a10), a10);
            byte[] n11 = s5Var.n(o10, z5.c("base_nonce", Q2, Q, 12), 12);
            BigInteger bigInteger = BigInteger.ONE;
            u5 u5Var = new u5(n10, n11, bigInteger.shiftLeft(96).subtract(bigInteger), t5Var);
            byte[] bArr5 = f;
            synchronized (u5Var) {
                byte[] byteArray = u5Var.f8171c.toByteArray();
                int length2 = byteArray.length;
                if (length2 != 12) {
                    if (length2 <= 13) {
                        if (length2 == 13) {
                            if (byteArray[0] == 0) {
                                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                            } else {
                                throw new GeneralSecurityException("integer too large");
                            }
                        } else {
                            byte[] bArr6 = new byte[12];
                            System.arraycopy(byteArray, 0, bArr6, 12 - length2, length2);
                            byteArray = bArr6;
                        }
                    } else {
                        throw new GeneralSecurityException("integer too large");
                    }
                }
                S = r.S(n11, byteArray);
                if (u5Var.f8171c.compareTo(u5Var.f8170b) < 0) {
                    u5Var.f8171c = u5Var.f8171c.add(bigInteger);
                } else {
                    throw new GeneralSecurityException("message limit reached");
                }
            }
            return u5Var.f8169a.c(n10, S, copyOfRange, bArr5);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
