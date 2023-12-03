package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l0  reason: invalid package */
/* loaded from: classes.dex */
public final class l0 extends n0 {
    public int A;

    /* renamed from: y  reason: collision with root package name */
    public final byte[] f7952y;

    /* renamed from: z  reason: collision with root package name */
    public final int f7953z;

    public l0(byte[] bArr, int i6) {
        super(0);
        int length = bArr.length;
        if (((length - i6) | i6) >= 0) {
            this.f7952y = bArr;
            this.A = 0;
            this.f7953z = i6;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i6)));
    }

    @Override // com.android.volley.toolbox.a
    public final void A(byte[] bArr, int i6) {
        try {
            System.arraycopy(bArr, 0, this.f7952y, this.A, i6);
            this.A += i6;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f7953z), Integer.valueOf(i6)), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void P(byte b10) {
        try {
            byte[] bArr = this.f7952y;
            int i6 = this.A;
            this.A = i6 + 1;
            bArr[i6] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f7953z), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void Q(int i6, boolean z10) {
        c0(i6 << 3);
        P(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void R(int i6, h0 h0Var) {
        c0((i6 << 3) | 2);
        c0(h0Var.m());
        h0Var.v(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void S(int i6, int i10) {
        c0((i6 << 3) | 5);
        T(i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void T(int i6) {
        try {
            byte[] bArr = this.f7952y;
            int i10 = this.A;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (i6 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((i6 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i6 >> 16) & 255);
            this.A = i13 + 1;
            bArr[i13] = (byte) ((i6 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f7953z), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void U(int i6, long j10) {
        c0((i6 << 3) | 1);
        V(j10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void V(long j10) {
        try {
            byte[] bArr = this.f7952y;
            int i6 = this.A;
            int i10 = i6 + 1;
            bArr[i6] = (byte) (((int) j10) & 255);
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) (j10 >> 8)) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 16)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 24)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
            this.A = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f7953z), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void W(int i6, int i10) {
        c0(i6 << 3);
        X(i10);
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
        int i10 = this.A;
        try {
            int L = n0.L(str.length() * 3);
            int L2 = n0.L(str.length());
            int i11 = this.f7953z;
            byte[] bArr = this.f7952y;
            if (L2 == L) {
                int i12 = i10 + L2;
                this.A = i12;
                int b10 = j3.b(str, bArr, i12, i11 - i12);
                this.A = i10;
                c0((b10 - i10) - L2);
                this.A = b10;
            } else {
                c0(j3.c(str));
                int i13 = this.A;
                this.A = j3.b(str, bArr, i13, i11 - i13);
            }
        } catch (i3 e10) {
            this.A = i10;
            N(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzack(e11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void a0(int i6, int i10) {
        c0((i6 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void b0(int i6, int i10) {
        c0(i6 << 3);
        c0(i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void c0(int i6) {
        while (true) {
            int i10 = i6 & (-128);
            byte[] bArr = this.f7952y;
            if (i10 == 0) {
                int i11 = this.A;
                this.A = i11 + 1;
                bArr[i11] = (byte) i6;
                return;
            }
            try {
                int i12 = this.A;
                this.A = i12 + 1;
                bArr[i12] = (byte) ((i6 & 127) | 128);
                i6 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzack(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f7953z), 1), e10);
            }
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f7953z), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void d0(int i6, long j10) {
        c0(i6 << 3);
        e0(j10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void e0(long j10) {
        boolean z10 = n0.f7995x;
        int i6 = this.f7953z;
        byte[] bArr = this.f7952y;
        if (z10 && i6 - this.A >= 10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.A;
                this.A = i10 + 1;
                f3.n(bArr, (byte) ((((int) j10) & 127) | 128), i10);
                j10 >>>= 7;
            }
            int i11 = this.A;
            this.A = i11 + 1;
            f3.n(bArr, (byte) j10, i11);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i12 = this.A;
                this.A = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzack(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(i6), 1), e10);
            }
        }
        int i13 = this.A;
        this.A = i13 + 1;
        bArr[i13] = (byte) j10;
    }
}
