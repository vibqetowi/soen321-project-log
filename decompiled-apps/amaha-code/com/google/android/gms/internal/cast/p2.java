package com.google.android.gms.internal.cast;

import java.util.logging.Level;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class p2 extends q2 {

    /* renamed from: w0  reason: collision with root package name */
    public final byte[] f7617w0;

    /* renamed from: x0  reason: collision with root package name */
    public final int f7618x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f7619y0;

    public p2(byte[] bArr, int i6) {
        super(0);
        int length = bArr.length;
        if (((length - i6) | i6) >= 0) {
            this.f7617w0 = bArr;
            this.f7619y0 = 0;
            this.f7618x0 = i6;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i6)));
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void X(int i6, int i10) {
        i0((i6 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void Y(int i6, int i10) {
        i0(i6 << 3);
        h0(i10);
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void Z(int i6, int i10) {
        i0(i6 << 3);
        i0(i10);
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void a0(int i6, int i10) {
        i0((i6 << 3) | 5);
        j0(i10);
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void b0(int i6, long j10) {
        i0(i6 << 3);
        k0(j10);
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void c0(int i6, long j10) {
        i0((i6 << 3) | 1);
        l0(j10);
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void d0(int i6, boolean z10) {
        i0(i6 << 3);
        g0(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void e0(int i6, String str) {
        i0((i6 << 3) | 2);
        int i10 = this.f7619y0;
        try {
            int o02 = q2.o0(str.length() * 3);
            int o03 = q2.o0(str.length());
            int i11 = this.f7618x0;
            byte[] bArr = this.f7617w0;
            if (o03 == o02) {
                int i12 = i10 + o03;
                this.f7619y0 = i12;
                int b10 = k5.b(str, bArr, i12, i11 - i12);
                this.f7619y0 = i10;
                i0((b10 - i10) - o03);
                this.f7619y0 = b10;
            } else {
                i0(k5.a(str));
                int i13 = this.f7619y0;
                this.f7619y0 = k5.b(str, bArr, i13, i11 - i13);
            }
        } catch (j5 e10) {
            this.f7619y0 = i10;
            q2.f7626u0.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(k3.f7570a);
            try {
                int length = bytes.length;
                i0(length);
                r0(bytes, length);
            } catch (zzoe e11) {
                throw e11;
            } catch (IndexOutOfBoundsException e12) {
                throw new zzoe(e12);
            }
        } catch (IndexOutOfBoundsException e13) {
            throw new zzoe(e13);
        }
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void f0(int i6, n2 n2Var) {
        i0((i6 << 3) | 2);
        i0(n2Var.m());
        n2Var.q(this);
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void g0(byte b10) {
        try {
            byte[] bArr = this.f7617w0;
            int i6 = this.f7619y0;
            this.f7619y0 = i6 + 1;
            bArr[i6] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzoe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7619y0), Integer.valueOf(this.f7618x0), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void h0(int i6) {
        if (i6 >= 0) {
            i0(i6);
        } else {
            k0(i6);
        }
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void i0(int i6) {
        if (q2.f7627v0) {
            int i10 = i2.f7554a;
        }
        while (true) {
            int i11 = i6 & (-128);
            byte[] bArr = this.f7617w0;
            if (i11 == 0) {
                int i12 = this.f7619y0;
                this.f7619y0 = i12 + 1;
                bArr[i12] = (byte) i6;
                return;
            }
            try {
                int i13 = this.f7619y0;
                this.f7619y0 = i13 + 1;
                bArr[i13] = (byte) ((i6 & 127) | 128);
                i6 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzoe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7619y0), Integer.valueOf(this.f7618x0), 1), e10);
            }
            throw new zzoe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7619y0), Integer.valueOf(this.f7618x0), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void j0(int i6) {
        try {
            byte[] bArr = this.f7617w0;
            int i10 = this.f7619y0;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (i6 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((i6 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i6 >> 16) & 255);
            this.f7619y0 = i13 + 1;
            bArr[i13] = (byte) ((i6 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzoe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7619y0), Integer.valueOf(this.f7618x0), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void k0(long j10) {
        boolean z10 = q2.f7627v0;
        int i6 = this.f7618x0;
        byte[] bArr = this.f7617w0;
        if (z10 && i6 - this.f7619y0 >= 10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f7619y0;
                this.f7619y0 = i10 + 1;
                i5.n(bArr, (byte) ((((int) j10) & 127) | 128), i10);
                j10 >>>= 7;
            }
            int i11 = this.f7619y0;
            this.f7619y0 = i11 + 1;
            i5.n(bArr, (byte) j10, i11);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i12 = this.f7619y0;
                this.f7619y0 = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzoe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7619y0), Integer.valueOf(i6), 1), e10);
            }
        }
        int i13 = this.f7619y0;
        this.f7619y0 = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    @Override // com.google.android.gms.internal.cast.q2
    public final void l0(long j10) {
        try {
            byte[] bArr = this.f7617w0;
            int i6 = this.f7619y0;
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
            this.f7619y0 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzoe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7619y0), Integer.valueOf(this.f7618x0), 1), e10);
        }
    }

    public final void r0(byte[] bArr, int i6) {
        try {
            System.arraycopy(bArr, 0, this.f7617w0, this.f7619y0, i6);
            this.f7619y0 += i6;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzoe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7619y0), Integer.valueOf(this.f7618x0), Integer.valueOf(i6)), e10);
        }
    }
}
