package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.StandardCharsets;
import javax.crypto.Mac;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a6  reason: invalid package */
/* loaded from: classes.dex */
public final class a6 implements w5 {

    /* renamed from: u  reason: collision with root package name */
    public final s5 f7704u;

    /* renamed from: v  reason: collision with root package name */
    public final int f7705v;

    public a6(s5 s5Var, int i6) {
        this.f7704u = s5Var;
        this.f7705v = i6;
    }

    public static a6 a(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                return new a6(new s5("HmacSha512", 0, 0), 3);
            }
            return new a6(new s5("HmacSha384", 0, 0), 2);
        }
        return new a6(new s5("HmacSha256", 0, 0), 1);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w5
    public final byte[] b() {
        int i6 = this.f7705v - 1;
        if (i6 != 0) {
            if (i6 != 1) {
                return z5.f8280e;
            }
            return z5.f8279d;
        }
        return z5.f8278c;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w5
    public final byte[] q(byte[] bArr, x5 x5Var) {
        b6 b6Var = (b6) x5Var;
        byte[] bArr2 = b6Var.f7727a.f8012a;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        int i6 = this.f7705v;
        byte[] f = bc.f(bc.g(bArr3, i6), bc.h(bc.i(i6), 1, bArr));
        byte[] bArr4 = b6Var.f7728b.f8012a;
        int length2 = bArr4.length;
        byte[] bArr5 = new byte[length2];
        System.arraycopy(bArr4, 0, bArr5, 0, length2);
        byte[] Q = r.Q(bArr, bArr5);
        byte[] Q2 = r.Q(z5.f8287m, b());
        s5 s5Var = this.f7704u;
        int macLength = Mac.getInstance(s5Var.f8126v).getMacLength();
        return s5Var.n(s5Var.o(r.Q(z5.f8289o, Q2, "eae_prk".getBytes(StandardCharsets.UTF_8), f), null), z5.c("shared_secret", Q, Q2, macLength), macLength);
    }
}
