package u7;
/* compiled from: VorbisBitArray.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f33923a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f33924b;

    /* renamed from: c  reason: collision with root package name */
    public int f33925c;

    /* renamed from: d  reason: collision with root package name */
    public int f33926d;

    /* renamed from: e  reason: collision with root package name */
    public int f33927e;

    public x() {
        this.f33923a = 1;
        this.f33924b = c9.w.f;
    }

    public final void a() {
        int i6;
        int i10;
        int i11;
        boolean z10 = false;
        switch (this.f33923a) {
            case 0:
                int i12 = this.f33926d;
                if (i12 >= 0 && (i12 < (i10 = this.f33925c) || (i12 == i10 && this.f33927e == 0))) {
                    z10 = true;
                }
                sc.b.C(z10);
                return;
            case 1:
                int i13 = this.f33925c;
                if (i13 >= 0 && (i13 < (i11 = this.f33927e) || (i13 == i11 && this.f33926d == 0))) {
                    z10 = true;
                }
                sc.b.C(z10);
                return;
            default:
                int i14 = this.f33926d;
                if (i14 >= 0 && (i14 < (i6 = this.f33925c) || (i14 == i6 && this.f33927e == 0))) {
                    z10 = true;
                }
                sc.b.C(z10);
                return;
        }
    }

    public final int b() {
        return ((this.f33927e - this.f33925c) * 8) - this.f33926d;
    }

    public final void c() {
        if (this.f33926d == 0) {
            return;
        }
        this.f33926d = 0;
        this.f33925c++;
        a();
    }

    public final boolean d(int i6) {
        int i10 = this.f33926d;
        int i11 = i6 / 8;
        int i12 = i10 + i11;
        int i13 = (this.f33927e + i6) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f33925c) {
                break;
            } else if (p(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f33925c;
        if (i12 < i14) {
            return true;
        }
        if (i12 == i14 && i13 == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        boolean z10;
        int i6 = this.f33926d;
        int i10 = this.f33927e;
        int i11 = 0;
        while (this.f33926d < this.f33925c && !h()) {
            i11++;
        }
        if (this.f33926d == this.f33925c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33926d = i6;
        this.f33927e = i10;
        if (z10 || !d((i11 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public final int f() {
        boolean z10;
        if (this.f33926d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        return this.f33925c;
    }

    public final int g() {
        int i6;
        int i10;
        switch (this.f33923a) {
            case 0:
                i6 = this.f33926d * 8;
                i10 = this.f33927e;
                break;
            default:
                i6 = this.f33925c * 8;
                i10 = this.f33926d;
                break;
        }
        return i6 + i10;
    }

    public final boolean h() {
        boolean z10 = false;
        switch (this.f33923a) {
            case 0:
                if ((((this.f33924b[this.f33926d] & 255) >> this.f33927e) & 1) == 1) {
                    z10 = true;
                }
                r(1);
                return z10;
            case 1:
                if ((this.f33924b[this.f33925c] & (128 >> this.f33926d)) != 0) {
                    z10 = true;
                }
                q();
                return z10;
            default:
                if ((this.f33924b[this.f33926d] & (128 >> this.f33927e)) != 0) {
                    z10 = true;
                }
                q();
                return z10;
        }
    }

    public final int i(int i6) {
        int i10 = 1;
        switch (this.f33923a) {
            case 0:
                int i11 = this.f33926d;
                int min = Math.min(i6, 8 - this.f33927e);
                int i12 = i11 + 1;
                int i13 = ((this.f33924b[i11] & 255) >> this.f33927e) & (255 >> (8 - min));
                while (min < i6) {
                    i13 |= (this.f33924b[i12] & 255) << min;
                    min += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i6));
                r(i6);
                return i14;
            case 1:
                if (i6 == 0) {
                    return 0;
                }
                this.f33926d += i6;
                int i15 = 0;
                while (true) {
                    int i16 = this.f33926d;
                    if (i16 > 8) {
                        int i17 = i16 - 8;
                        this.f33926d = i17;
                        byte[] bArr = this.f33924b;
                        int i18 = this.f33925c;
                        this.f33925c = i18 + 1;
                        i15 |= (bArr[i18] & 255) << i17;
                    } else {
                        byte[] bArr2 = this.f33924b;
                        int i19 = this.f33925c;
                        int i20 = ((-1) >>> (32 - i6)) & (i15 | ((255 & bArr2[i19]) >> (8 - i16)));
                        if (i16 == 8) {
                            this.f33926d = 0;
                            this.f33925c = i19 + 1;
                        }
                        a();
                        return i20;
                    }
                }
            default:
                this.f33927e += i6;
                int i21 = 0;
                while (true) {
                    int i22 = this.f33927e;
                    int i23 = 2;
                    if (i22 > 8) {
                        int i24 = i22 - 8;
                        this.f33927e = i24;
                        byte[] bArr3 = this.f33924b;
                        int i25 = this.f33926d;
                        i21 |= (bArr3[i25] & 255) << i24;
                        if (!p(i25 + 1)) {
                            i23 = 1;
                        }
                        this.f33926d = i25 + i23;
                    } else {
                        byte[] bArr4 = this.f33924b;
                        int i26 = this.f33926d;
                        int i27 = ((-1) >>> (32 - i6)) & (i21 | ((255 & bArr4[i26]) >> (8 - i22)));
                        if (i22 == 8) {
                            this.f33927e = 0;
                            if (p(i26 + 1)) {
                                i10 = 2;
                            }
                            this.f33926d = i26 + i10;
                        }
                        a();
                        return i27;
                    }
                }
        }
    }

    public final void j(byte[] bArr, int i6) {
        int i10 = (i6 >> 3) + 0;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f33924b;
            int i12 = this.f33925c;
            int i13 = i12 + 1;
            this.f33925c = i13;
            byte b10 = bArr2[i12];
            int i14 = this.f33926d;
            byte b11 = (byte) (b10 << i14);
            bArr[i11] = b11;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b11);
        }
        int i15 = i6 & 7;
        if (i15 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b12;
        int i16 = this.f33926d;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f33924b;
            int i17 = this.f33925c;
            this.f33925c = i17 + 1;
            bArr[i10] = (byte) (b12 | ((bArr3[i17] & 255) << i16));
            this.f33926d = i16 - 8;
        }
        int i18 = this.f33926d + i15;
        this.f33926d = i18;
        byte[] bArr4 = this.f33924b;
        int i19 = this.f33925c;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.f33926d = 0;
            this.f33925c = i19 + 1;
        }
        a();
    }

    public final void k(byte[] bArr, int i6) {
        boolean z10;
        if (this.f33926d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        System.arraycopy(this.f33924b, this.f33925c, bArr, 0, i6);
        this.f33925c += i6;
        a();
    }

    public final int l() {
        int i6 = 0;
        int i10 = 0;
        while (!h()) {
            i10++;
        }
        int i11 = (1 << i10) - 1;
        if (i10 > 0) {
            i6 = i(i10);
        }
        return i11 + i6;
    }

    public final int m() {
        int i6;
        int l2 = l();
        if (l2 % 2 == 0) {
            i6 = -1;
        } else {
            i6 = 1;
        }
        return ((l2 + 1) / 2) * i6;
    }

    public final void n(byte[] bArr, int i6) {
        this.f33924b = bArr;
        this.f33925c = 0;
        this.f33926d = 0;
        this.f33927e = i6;
    }

    public final void o(int i6) {
        int i10 = i6 / 8;
        this.f33925c = i10;
        this.f33926d = i6 - (i10 * 8);
        a();
    }

    public final boolean p(int i6) {
        if (2 <= i6 && i6 < this.f33925c) {
            byte[] bArr = this.f33924b;
            if (bArr[i6] == 3 && bArr[i6 - 2] == 0 && bArr[i6 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void q() {
        int i6 = 1;
        switch (this.f33923a) {
            case 1:
                int i10 = this.f33926d + 1;
                this.f33926d = i10;
                if (i10 == 8) {
                    this.f33926d = 0;
                    this.f33925c++;
                }
                a();
                return;
            default:
                int i11 = this.f33927e + 1;
                this.f33927e = i11;
                if (i11 == 8) {
                    this.f33927e = 0;
                    int i12 = this.f33926d;
                    if (p(i12 + 1)) {
                        i6 = 2;
                    }
                    this.f33926d = i12 + i6;
                }
                a();
                return;
        }
    }

    public final void r(int i6) {
        switch (this.f33923a) {
            case 0:
                int i10 = i6 / 8;
                int i11 = this.f33926d + i10;
                this.f33926d = i11;
                int i12 = (i6 - (i10 * 8)) + this.f33927e;
                this.f33927e = i12;
                if (i12 > 7) {
                    this.f33926d = i11 + 1;
                    this.f33927e = i12 - 8;
                }
                a();
                return;
            case 1:
                int i13 = i6 / 8;
                int i14 = this.f33925c + i13;
                this.f33925c = i14;
                int i15 = (i6 - (i13 * 8)) + this.f33926d;
                this.f33926d = i15;
                if (i15 > 7) {
                    this.f33925c = i14 + 1;
                    this.f33926d = i15 - 8;
                }
                a();
                return;
            default:
                int i16 = this.f33926d;
                int i17 = i6 / 8;
                int i18 = i16 + i17;
                this.f33926d = i18;
                int i19 = (i6 - (i17 * 8)) + this.f33927e;
                this.f33927e = i19;
                if (i19 > 7) {
                    this.f33926d = i18 + 1;
                    this.f33927e = i19 - 8;
                }
                while (true) {
                    i16++;
                    if (i16 <= this.f33926d) {
                        if (p(i16)) {
                            this.f33926d++;
                            i16 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
        }
    }

    public final void s(int i6) {
        boolean z10;
        if (this.f33926d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        this.f33925c += i6;
        a();
    }

    public x(int i6, byte[] bArr, int i10) {
        this.f33923a = 2;
        this.f33924b = bArr;
        this.f33926d = i6;
        this.f33925c = i10;
        this.f33927e = 0;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(byte[] bArr, int i6, int i10) {
        this(bArr, bArr.length);
        this.f33923a = i6;
        if (i6 != 1) {
            this.f33924b = bArr;
            this.f33925c = bArr.length;
            return;
        }
    }

    public x(byte[] bArr, int i6) {
        this.f33923a = 1;
        this.f33924b = bArr;
        this.f33927e = i6;
    }
}
