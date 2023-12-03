package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public class a5 extends z4 {

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f8302w;

    public a5(byte[] bArr) {
        bArr.getClass();
        this.f8302w = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public byte e(int i6) {
        return this.f8302w[i6];
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b5) || m() != ((b5) obj).m()) {
            return false;
        }
        if (m() == 0) {
            return true;
        }
        if (obj instanceof a5) {
            a5 a5Var = (a5) obj;
            int i6 = this.f8312u;
            int i10 = a5Var.f8312u;
            if (i6 != 0 && i10 != 0 && i6 != i10) {
                return false;
            }
            int m10 = m();
            if (m10 <= a5Var.m()) {
                if (m10 <= a5Var.m()) {
                    a5Var.C();
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < m10) {
                        if (this.f8302w[i11] != a5Var.f8302w[i12]) {
                            return false;
                        }
                        i11++;
                        i12++;
                    }
                    return true;
                }
                throw new IllegalArgumentException(defpackage.b.j("Ran off end of other: 0, ", m10, ", ", a5Var.m()));
            }
            int m11 = m();
            throw new IllegalArgumentException("Length too large: " + m10 + m11);
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public byte g(int i6) {
        return this.f8302w[i6];
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public int m() {
        return this.f8302w.length;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final int o(int i6, int i10) {
        Charset charset = c6.f8318a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + this.f8302w[i11];
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final a5 q() {
        int v10 = b5.v(0, 47, m());
        if (v10 == 0) {
            return b5.f8311v;
        }
        return new x4(this.f8302w, v10);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final String r(Charset charset) {
        return new String(this.f8302w, 0, m(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final void s(e5 e5Var) {
        ((d5) e5Var).r0(this.f8302w, m());
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final boolean t() {
        return c8.d(0, this.f8302w, m());
    }

    public void C() {
    }
}
