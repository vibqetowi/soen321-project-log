package c9;

import java.nio.charset.Charset;
import java.util.Arrays;
/* compiled from: ParsableByteArray.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f5186a;

    /* renamed from: b  reason: collision with root package name */
    public int f5187b;

    /* renamed from: c  reason: collision with root package name */
    public int f5188c;

    public q() {
        this.f5186a = w.f;
    }

    public final void A(int i6) {
        boolean z10;
        if (i6 >= 0 && i6 <= this.f5188c) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        this.f5187b = i6;
    }

    public final void B(int i6) {
        A(this.f5187b + i6);
    }

    public final void a(int i6) {
        byte[] bArr = this.f5186a;
        if (i6 > bArr.length) {
            this.f5186a = Arrays.copyOf(bArr, i6);
        }
    }

    public final void b(int i6, byte[] bArr, int i10) {
        System.arraycopy(this.f5186a, this.f5187b, bArr, i6, i10);
        this.f5187b += i10;
    }

    public final int c() {
        byte[] bArr = this.f5186a;
        int i6 = this.f5187b;
        int i10 = i6 + 1;
        int i11 = i10 + 1;
        int i12 = ((bArr[i6] & 255) << 24) | ((bArr[i10] & 255) << 16);
        int i13 = i11 + 1;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        this.f5187b = i13 + 1;
        return (bArr[i13] & 255) | i14;
    }

    public final String d() {
        boolean z10;
        int i6 = this.f5188c;
        int i10 = this.f5187b;
        if (i6 - i10 == 0) {
            return null;
        }
        while (i10 < this.f5188c) {
            byte b10 = this.f5186a[i10];
            int i11 = w.f5205a;
            if (b10 != 10 && b10 != 13) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                break;
            }
            i10++;
        }
        int i12 = this.f5187b;
        if (i10 - i12 >= 3) {
            byte[] bArr = this.f5186a;
            if (bArr[i12] == -17 && bArr[i12 + 1] == -69 && bArr[i12 + 2] == -65) {
                this.f5187b = i12 + 3;
            }
        }
        byte[] bArr2 = this.f5186a;
        int i13 = this.f5187b;
        String l2 = w.l(i13, bArr2, i10 - i13);
        this.f5187b = i10;
        int i14 = this.f5188c;
        if (i10 == i14) {
            return l2;
        }
        byte[] bArr3 = this.f5186a;
        if (bArr3[i10] == 13) {
            int i15 = i10 + 1;
            this.f5187b = i15;
            if (i15 == i14) {
                return l2;
            }
        }
        int i16 = this.f5187b;
        if (bArr3[i16] == 10) {
            this.f5187b = i16 + 1;
        }
        return l2;
    }

    public final int e() {
        byte[] bArr = this.f5186a;
        int i6 = this.f5187b;
        int i10 = i6 + 1;
        int i11 = i10 + 1;
        int i12 = (bArr[i6] & 255) | ((bArr[i10] & 255) << 8);
        int i13 = i11 + 1;
        int i14 = i12 | ((bArr[i11] & 255) << 16);
        this.f5187b = i13 + 1;
        return ((bArr[i13] & 255) << 24) | i14;
    }

    public final short f() {
        byte[] bArr = this.f5186a;
        int i6 = this.f5187b;
        int i10 = i6 + 1;
        this.f5187b = i10 + 1;
        return (short) (((bArr[i10] & 255) << 8) | (bArr[i6] & 255));
    }

    public final long g() {
        byte[] bArr = this.f5186a;
        int i6 = this.f5187b;
        int i10 = i6 + 1;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        this.f5187b = i12 + 1;
        return (bArr[i6] & 255) | ((bArr[i10] & 255) << 8) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 24);
    }

    public final int h() {
        int e10 = e();
        if (e10 >= 0) {
            return e10;
        }
        throw new IllegalStateException(defpackage.b.h(29, "Top bit not zero: ", e10));
    }

    public final int i() {
        byte[] bArr = this.f5186a;
        int i6 = this.f5187b;
        int i10 = i6 + 1;
        this.f5187b = i10 + 1;
        return ((bArr[i10] & 255) << 8) | (bArr[i6] & 255);
    }

    public final long j() {
        byte[] bArr = this.f5186a;
        int i6 = this.f5187b;
        int i10 = i6 + 1;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = i13 + 1;
        int i15 = i14 + 1;
        int i16 = i15 + 1;
        this.f5187b = i16 + 1;
        return ((bArr[i6] & 255) << 56) | ((bArr[i10] & 255) << 48) | ((bArr[i11] & 255) << 40) | ((bArr[i12] & 255) << 32) | ((bArr[i13] & 255) << 24) | ((bArr[i14] & 255) << 16) | ((bArr[i15] & 255) << 8) | (bArr[i16] & 255);
    }

    public final String k() {
        int i6 = this.f5188c;
        int i10 = this.f5187b;
        if (i6 - i10 == 0) {
            return null;
        }
        while (i10 < this.f5188c && this.f5186a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f5186a;
        int i11 = this.f5187b;
        String l2 = w.l(i11, bArr, i10 - i11);
        this.f5187b = i10;
        if (i10 < this.f5188c) {
            this.f5187b = i10 + 1;
            return l2;
        }
        return l2;
    }

    public final String l(int i6) {
        int i10;
        if (i6 == 0) {
            return "";
        }
        int i11 = this.f5187b;
        int i12 = (i11 + i6) - 1;
        if (i12 < this.f5188c && this.f5186a[i12] == 0) {
            i10 = i6 - 1;
        } else {
            i10 = i6;
        }
        String l2 = w.l(i11, this.f5186a, i10);
        this.f5187b += i6;
        return l2;
    }

    public final short m() {
        byte[] bArr = this.f5186a;
        int i6 = this.f5187b;
        int i10 = i6 + 1;
        this.f5187b = i10 + 1;
        return (short) ((bArr[i10] & 255) | ((bArr[i6] & 255) << 8));
    }

    public final String n(int i6) {
        return o(i6, nc.c.f25988c);
    }

    public final String o(int i6, Charset charset) {
        String str = new String(this.f5186a, this.f5187b, i6, charset);
        this.f5187b += i6;
        return str;
    }

    public final int p() {
        return (q() << 21) | (q() << 14) | (q() << 7) | q();
    }

    public final int q() {
        byte[] bArr = this.f5186a;
        int i6 = this.f5187b;
        this.f5187b = i6 + 1;
        return bArr[i6] & 255;
    }

    public final long r() {
        byte[] bArr = this.f5186a;
        int i6 = this.f5187b;
        int i10 = i6 + 1;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        this.f5187b = i12 + 1;
        return ((bArr[i6] & 255) << 24) | ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8) | (bArr[i12] & 255);
    }

    public final int s() {
        byte[] bArr = this.f5186a;
        int i6 = this.f5187b;
        int i10 = i6 + 1;
        int i11 = i10 + 1;
        int i12 = ((bArr[i6] & 255) << 16) | ((bArr[i10] & 255) << 8);
        this.f5187b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    public final int t() {
        int c10 = c();
        if (c10 >= 0) {
            return c10;
        }
        throw new IllegalStateException(defpackage.b.h(29, "Top bit not zero: ", c10));
    }

    public final long u() {
        long j10 = j();
        if (j10 >= 0) {
            return j10;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(j10);
        throw new IllegalStateException(sb2.toString());
    }

    public final int v() {
        byte[] bArr = this.f5186a;
        int i6 = this.f5187b;
        int i10 = i6 + 1;
        this.f5187b = i10 + 1;
        return (bArr[i10] & 255) | ((bArr[i6] & 255) << 8);
    }

    public final long w() {
        int i6;
        int i10;
        byte b10;
        int i11;
        long j10 = this.f5186a[this.f5187b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= i11 - 1;
                i10 = 7 - i12;
            } else if (i12 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 != 0) {
            for (i6 = 1; i6 < i10; i6++) {
                if ((this.f5186a[this.f5187b + i6] & 192) == 128) {
                    j10 = (j10 << 6) | (b10 & 63);
                } else {
                    StringBuilder sb2 = new StringBuilder(62);
                    sb2.append("Invalid UTF-8 sequence continuation byte: ");
                    sb2.append(j10);
                    throw new NumberFormatException(sb2.toString());
                }
            }
            this.f5187b += i10;
            return j10;
        }
        StringBuilder sb3 = new StringBuilder(55);
        sb3.append("Invalid UTF-8 sequence first byte: ");
        sb3.append(j10);
        throw new NumberFormatException(sb3.toString());
    }

    public final void x(int i6) {
        byte[] bArr = this.f5186a;
        if (bArr.length < i6) {
            bArr = new byte[i6];
        }
        y(bArr, i6);
    }

    public final void y(byte[] bArr, int i6) {
        this.f5186a = bArr;
        this.f5188c = i6;
        this.f5187b = 0;
    }

    public final void z(int i6) {
        boolean z10;
        if (i6 >= 0 && i6 <= this.f5186a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        this.f5188c = i6;
    }

    public q(int i6) {
        this.f5186a = new byte[i6];
        this.f5188c = i6;
    }

    public q(byte[] bArr) {
        this.f5186a = bArr;
        this.f5188c = bArr.length;
    }

    public q(byte[] bArr, int i6) {
        this.f5186a = bArr;
        this.f5188c = i6;
    }
}
