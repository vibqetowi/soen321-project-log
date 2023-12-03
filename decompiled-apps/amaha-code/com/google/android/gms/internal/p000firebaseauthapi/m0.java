package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.OutputStream;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m0  reason: invalid package */
/* loaded from: classes.dex */
public final class m0 extends n0 {
    public int A;
    public final OutputStream B;

    /* renamed from: y  reason: collision with root package name */
    public final byte[] f7976y;

    /* renamed from: z  reason: collision with root package name */
    public final int f7977z;

    public m0(OutputStream outputStream, int i6) {
        super(0);
        if (i6 >= 0) {
            int max = Math.max(i6, 20);
            this.f7976y = new byte[max];
            this.f7977z = max;
            this.B = outputStream;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // com.android.volley.toolbox.a
    public final void A(byte[] bArr, int i6) {
        n0(bArr, i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void P(byte b10) {
        if (this.A == this.f7977z) {
            h0();
        }
        int i6 = this.A;
        this.A = i6 + 1;
        this.f7976y[i6] = b10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void Q(int i6, boolean z10) {
        i0(11);
        l0(i6 << 3);
        int i10 = this.A;
        this.A = i10 + 1;
        this.f7976y[i10] = z10 ? (byte) 1 : (byte) 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void R(int i6, h0 h0Var) {
        c0((i6 << 3) | 2);
        c0(h0Var.m());
        h0Var.v(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void S(int i6, int i10) {
        i0(14);
        l0((i6 << 3) | 5);
        j0(i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void T(int i6) {
        i0(4);
        j0(i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void U(int i6, long j10) {
        i0(18);
        l0((i6 << 3) | 1);
        k0(j10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void V(long j10) {
        i0(8);
        k0(j10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void W(int i6, int i10) {
        i0(20);
        l0(i6 << 3);
        if (i10 >= 0) {
            l0(i10);
        } else {
            m0(i10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void X(int i6) {
        if (i6 >= 0) {
            c0(i6);
        } else {
            e0(i6);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void Y(int i6, b2 b2Var, m2 m2Var) {
        c0((i6 << 3) | 2);
        c0(((w) b2Var).b(m2Var));
        m2Var.j(b2Var, this.f7996v);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void Z(int i6, String str) {
        c0((i6 << 3) | 2);
        try {
            int length = str.length() * 3;
            int L = n0.L(length);
            int i10 = L + length;
            int i11 = this.f7977z;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int b10 = j3.b(str, bArr, 0, length);
                c0(b10);
                n0(bArr, b10);
                return;
            }
            if (i10 > i11 - this.A) {
                h0();
            }
            int L2 = n0.L(str.length());
            int i12 = this.A;
            byte[] bArr2 = this.f7976y;
            try {
                if (L2 == L) {
                    int i13 = i12 + L2;
                    this.A = i13;
                    int b11 = j3.b(str, bArr2, i13, i11 - i13);
                    this.A = i12;
                    l0((b11 - i12) - L2);
                    this.A = b11;
                } else {
                    int c10 = j3.c(str);
                    l0(c10);
                    this.A = j3.b(str, bArr2, this.A, c10);
                }
            } catch (i3 e10) {
                this.A = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzack(e11);
            }
        } catch (i3 e12) {
            N(str, e12);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void a0(int i6, int i10) {
        c0((i6 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void b0(int i6, int i10) {
        i0(20);
        l0(i6 << 3);
        l0(i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void c0(int i6) {
        i0(5);
        l0(i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void d0(int i6, long j10) {
        i0(20);
        l0(i6 << 3);
        m0(j10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void e0(long j10) {
        i0(10);
        m0(j10);
    }

    public final void h0() {
        this.B.write(this.f7976y, 0, this.A);
        this.A = 0;
    }

    public final void i0(int i6) {
        if (this.f7977z - this.A < i6) {
            h0();
        }
    }

    public final void j0(int i6) {
        int i10 = this.A;
        int i11 = i10 + 1;
        byte[] bArr = this.f7976y;
        bArr[i10] = (byte) (i6 & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i6 >> 8) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i6 >> 16) & 255);
        this.A = i13 + 1;
        bArr[i13] = (byte) ((i6 >> 24) & 255);
    }

    public final void k0(long j10) {
        int i6 = this.A;
        int i10 = i6 + 1;
        byte[] bArr = this.f7976y;
        bArr[i6] = (byte) (j10 & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j10 >> 8) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j10 >> 16) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (255 & (j10 >> 24));
        int i14 = i13 + 1;
        bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
        this.A = i16 + 1;
        bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
    }

    public final void l0(int i6) {
        boolean z10 = n0.f7995x;
        byte[] bArr = this.f7976y;
        if (z10) {
            while ((i6 & (-128)) != 0) {
                int i10 = this.A;
                this.A = i10 + 1;
                f3.n(bArr, (byte) ((i6 & 127) | 128), i10);
                i6 >>>= 7;
            }
            int i11 = this.A;
            this.A = i11 + 1;
            f3.n(bArr, (byte) i6, i11);
            return;
        }
        while ((i6 & (-128)) != 0) {
            int i12 = this.A;
            this.A = i12 + 1;
            bArr[i12] = (byte) ((i6 & 127) | 128);
            i6 >>>= 7;
        }
        int i13 = this.A;
        this.A = i13 + 1;
        bArr[i13] = (byte) i6;
    }

    public final void m0(long j10) {
        boolean z10 = n0.f7995x;
        byte[] bArr = this.f7976y;
        if (z10) {
            while ((j10 & (-128)) != 0) {
                int i6 = this.A;
                this.A = i6 + 1;
                f3.n(bArr, (byte) ((((int) j10) & 127) | 128), i6);
                j10 >>>= 7;
            }
            int i10 = this.A;
            this.A = i10 + 1;
            f3.n(bArr, (byte) j10, i10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i11 = this.A;
            this.A = i11 + 1;
            bArr[i11] = (byte) ((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        int i12 = this.A;
        this.A = i12 + 1;
        bArr[i12] = (byte) j10;
    }

    public final void n0(byte[] bArr, int i6) {
        int i10 = this.A;
        int i11 = this.f7977z;
        int i12 = i11 - i10;
        byte[] bArr2 = this.f7976y;
        if (i12 >= i6) {
            System.arraycopy(bArr, 0, bArr2, i10, i6);
            this.A += i6;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i12);
        int i13 = i6 - i12;
        this.A = i11;
        h0();
        if (i13 <= i11) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.A = i13;
            return;
        }
        this.B.write(bArr, i12, i13);
    }
}
