package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public class m2 extends n2 {

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f7589w;

    public m2(byte[] bArr) {
        bArr.getClass();
        this.f7589w = bArr;
    }

    @Override // com.google.android.gms.internal.cast.n2
    public byte e(int i6) {
        return this.f7589w[i6];
    }

    @Override // com.google.android.gms.internal.cast.n2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n2) || m() != ((n2) obj).m()) {
            return false;
        }
        if (m() == 0) {
            return true;
        }
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            int i6 = this.f7605u;
            int i10 = m2Var.f7605u;
            if (i6 != 0 && i10 != 0 && i6 != i10) {
                return false;
            }
            int m10 = m();
            if (m10 <= m2Var.m()) {
                if (m10 <= m2Var.m()) {
                    m2Var.z();
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < m10) {
                        if (this.f7589w[i11] != m2Var.f7589w[i12]) {
                            return false;
                        }
                        i11++;
                        i12++;
                    }
                    return true;
                }
                int m11 = m2Var.m();
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("Ran off end of other: 0, ");
                sb2.append(m10);
                sb2.append(", ");
                sb2.append(m11);
                throw new IllegalArgumentException(sb2.toString());
            }
            int m12 = m();
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Length too large: ");
            sb3.append(m10);
            sb3.append(m12);
            throw new IllegalArgumentException(sb3.toString());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.cast.n2
    public byte g(int i6) {
        return this.f7589w[i6];
    }

    @Override // com.google.android.gms.internal.cast.n2
    public int m() {
        return this.f7589w.length;
    }

    @Override // com.google.android.gms.internal.cast.n2
    public final m2 o() {
        n2.v(m());
        return new l2(this.f7589w);
    }

    @Override // com.google.android.gms.internal.cast.n2
    public final void q(q2 q2Var) {
        ((p2) q2Var).r0(this.f7589w, m());
    }

    @Override // com.google.android.gms.internal.cast.n2
    public final String r(Charset charset) {
        return new String(this.f7589w, 0, m(), charset);
    }

    @Override // com.google.android.gms.internal.cast.n2
    public final boolean s() {
        int m10 = m();
        k5.f7572a.getClass();
        return tr.r.G(this.f7589w, m10);
    }

    @Override // com.google.android.gms.internal.cast.n2
    public final int t(int i6, int i10) {
        Charset charset = k3.f7570a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + this.f7589w[i11];
        }
        return i6;
    }

    public void z() {
    }
}
