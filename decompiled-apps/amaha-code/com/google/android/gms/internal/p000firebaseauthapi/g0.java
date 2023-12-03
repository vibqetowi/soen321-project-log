package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g0  reason: invalid package */
/* loaded from: classes.dex */
public class g0 extends f0 {

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f7860w;

    public g0(byte[] bArr) {
        bArr.getClass();
        this.f7860w = bArr;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h0
    public byte e(int i6) {
        return this.f7860w[i6];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0) || m() != ((h0) obj).m()) {
            return false;
        }
        if (m() == 0) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            int i6 = this.f7870u;
            int i10 = g0Var.f7870u;
            if (i6 != 0 && i10 != 0 && i6 != i10) {
                return false;
            }
            int m10 = m();
            if (m10 <= g0Var.m()) {
                if (m10 <= g0Var.m()) {
                    g0Var.L();
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < m10) {
                        if (this.f7860w[i11] != g0Var.f7860w[i12]) {
                            return false;
                        }
                        i11++;
                        i12++;
                    }
                    return true;
                }
                throw new IllegalArgumentException(b.j("Ran off end of other: 0, ", m10, ", ", g0Var.m()));
            }
            int m11 = m();
            throw new IllegalArgumentException("Length too large: " + m10 + m11);
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h0
    public byte g(int i6) {
        return this.f7860w[i6];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h0
    public int m() {
        return this.f7860w.length;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h0
    public void o(int i6, byte[] bArr) {
        System.arraycopy(this.f7860w, 0, bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h0
    public final int q(int i6, int i10) {
        Charset charset = i1.f7886a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + this.f7860w[i11];
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h0
    public final g0 r() {
        int C = h0.C(0, 47, m());
        if (C == 0) {
            return h0.f7869v;
        }
        return new e0(this.f7860w, C);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h0
    public final i0 s() {
        int m10 = m();
        i0 i0Var = new i0(this.f7860w, m10);
        try {
            i0Var.a(m10);
            return i0Var;
        } catch (zzadn e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h0
    public final String t(Charset charset) {
        return new String(this.f7860w, 0, m(), charset);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h0
    public final void v(n0 n0Var) {
        n0Var.A(this.f7860w, m());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h0
    public final boolean z() {
        return j3.e(0, this.f7860w, m());
    }

    public void L() {
    }
}
