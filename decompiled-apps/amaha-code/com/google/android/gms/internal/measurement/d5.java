package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class d5 extends e5 {

    /* renamed from: w0  reason: collision with root package name */
    public final byte[] f8329w0;

    /* renamed from: x0  reason: collision with root package name */
    public final int f8330x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f8331y0;

    public d5(byte[] bArr, int i6) {
        super(0);
        int length = bArr.length;
        if (((length - i6) | i6) >= 0) {
            this.f8329w0 = bArr;
            this.f8331y0 = 0;
            this.f8330x0 = i6;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i6)));
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void Y(byte b10) {
        try {
            byte[] bArr = this.f8329w0;
            int i6 = this.f8331y0;
            this.f8331y0 = i6 + 1;
            bArr[i6] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8331y0), Integer.valueOf(this.f8330x0), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void Z(int i6, boolean z10) {
        k0(i6 << 3);
        Y(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void a0(int i6, b5 b5Var) {
        k0((i6 << 3) | 2);
        k0(b5Var.m());
        b5Var.s(this);
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void b0(int i6, int i10) {
        k0((i6 << 3) | 5);
        c0(i10);
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void c0(int i6) {
        try {
            byte[] bArr = this.f8329w0;
            int i10 = this.f8331y0;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (i6 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((i6 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i6 >> 16) & 255);
            this.f8331y0 = i13 + 1;
            bArr[i13] = (byte) ((i6 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8331y0), Integer.valueOf(this.f8330x0), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void d0(int i6, long j10) {
        k0((i6 << 3) | 1);
        e0(j10);
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void e0(long j10) {
        try {
            byte[] bArr = this.f8329w0;
            int i6 = this.f8331y0;
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
            this.f8331y0 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8331y0), Integer.valueOf(this.f8330x0), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void f0(int i6, int i10) {
        k0(i6 << 3);
        g0(i10);
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void g0(int i6) {
        if (i6 >= 0) {
            k0(i6);
        } else {
            m0(i6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void h0(int i6, String str) {
        k0((i6 << 3) | 2);
        int i10 = this.f8331y0;
        try {
            int V = e5.V(str.length() * 3);
            int V2 = e5.V(str.length());
            int i11 = this.f8330x0;
            byte[] bArr = this.f8329w0;
            if (V2 == V) {
                int i12 = i10 + V2;
                this.f8331y0 = i12;
                int b10 = c8.b(str, bArr, i12, i11 - i12);
                this.f8331y0 = i10;
                k0((b10 - i10) - V2);
                this.f8331y0 = b10;
            } else {
                k0(c8.c(str));
                int i13 = this.f8331y0;
                this.f8331y0 = c8.b(str, bArr, i13, i11 - i13);
            }
        } catch (b8 e10) {
            this.f8331y0 = i10;
            e5.f8355u0.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(c6.f8318a);
            try {
                int length = bytes.length;
                k0(length);
                r0(bytes, length);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzjk(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new zzjk(e12);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void i0(int i6, int i10) {
        k0((i6 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void j0(int i6, int i10) {
        k0(i6 << 3);
        k0(i10);
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void k0(int i6) {
        while (true) {
            int i10 = i6 & (-128);
            byte[] bArr = this.f8329w0;
            if (i10 == 0) {
                int i11 = this.f8331y0;
                this.f8331y0 = i11 + 1;
                bArr[i11] = (byte) i6;
                return;
            }
            try {
                int i12 = this.f8331y0;
                this.f8331y0 = i12 + 1;
                bArr[i12] = (byte) ((i6 & 127) | 128);
                i6 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8331y0), Integer.valueOf(this.f8330x0), 1), e10);
            }
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8331y0), Integer.valueOf(this.f8330x0), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void l0(int i6, long j10) {
        k0(i6 << 3);
        m0(j10);
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final void m0(long j10) {
        boolean z10 = e5.f8356v0;
        int i6 = this.f8330x0;
        byte[] bArr = this.f8329w0;
        if (z10 && i6 - this.f8331y0 >= 10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f8331y0;
                this.f8331y0 = i10 + 1;
                y7.n(bArr, (byte) ((((int) j10) & 127) | 128), i10);
                j10 >>>= 7;
            }
            int i11 = this.f8331y0;
            this.f8331y0 = i11 + 1;
            y7.n(bArr, (byte) j10, i11);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i12 = this.f8331y0;
                this.f8331y0 = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8331y0), Integer.valueOf(i6), 1), e10);
            }
        }
        int i13 = this.f8331y0;
        this.f8331y0 = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    public final void r0(byte[] bArr, int i6) {
        try {
            System.arraycopy(bArr, 0, this.f8329w0, this.f8331y0, i6);
            this.f8331y0 += i6;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8331y0), Integer.valueOf(this.f8330x0), Integer.valueOf(i6)), e10);
        }
    }
}
