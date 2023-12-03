package q7;

import java.util.Arrays;
/* compiled from: Sonic.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final int f29305a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29306b;

    /* renamed from: c  reason: collision with root package name */
    public final float f29307c;

    /* renamed from: d  reason: collision with root package name */
    public final float f29308d;

    /* renamed from: e  reason: collision with root package name */
    public final float f29309e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f29310g;

    /* renamed from: h  reason: collision with root package name */
    public final int f29311h;

    /* renamed from: i  reason: collision with root package name */
    public final short[] f29312i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f29313j;

    /* renamed from: k  reason: collision with root package name */
    public int f29314k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f29315l;

    /* renamed from: m  reason: collision with root package name */
    public int f29316m;

    /* renamed from: n  reason: collision with root package name */
    public short[] f29317n;

    /* renamed from: o  reason: collision with root package name */
    public int f29318o;

    /* renamed from: p  reason: collision with root package name */
    public int f29319p;

    /* renamed from: q  reason: collision with root package name */
    public int f29320q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public int f29321s;

    /* renamed from: t  reason: collision with root package name */
    public int f29322t;

    /* renamed from: u  reason: collision with root package name */
    public int f29323u;

    /* renamed from: v  reason: collision with root package name */
    public int f29324v;

    public q(int i6, int i10, float f, float f2, int i11) {
        this.f29305a = i6;
        this.f29306b = i10;
        this.f29307c = f;
        this.f29308d = f2;
        this.f29309e = i6 / i11;
        this.f = i6 / 400;
        int i12 = i6 / 65;
        this.f29310g = i12;
        int i13 = i12 * 2;
        this.f29311h = i13;
        this.f29312i = new short[i13];
        this.f29313j = new short[i13 * i10];
        this.f29315l = new short[i13 * i10];
        this.f29317n = new short[i13 * i10];
    }

    public static void e(int i6, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i6; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i6 - i18) * sArr2[i17])) / i6);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public final void a(short[] sArr, int i6, int i10) {
        short[] c10 = c(this.f29315l, this.f29316m, i10);
        this.f29315l = c10;
        int i11 = this.f29306b;
        System.arraycopy(sArr, i6 * i11, c10, this.f29316m * i11, i11 * i10);
        this.f29316m += i10;
    }

    public final void b(short[] sArr, int i6, int i10) {
        int i11 = this.f29311h / i10;
        int i12 = this.f29306b;
        int i13 = i10 * i12;
        int i14 = i6 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.f29312i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] c(short[] sArr, int i6, int i10) {
        int length = sArr.length;
        int i11 = this.f29306b;
        int i12 = length / i11;
        if (i6 + i10 <= i12) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int d(short[] sArr, int i6, int i10, int i11) {
        int i12 = i6 * this.f29306b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i10) + i18]);
            }
            if (i17 * i15 < i14 * i10) {
                i15 = i10;
                i14 = i17;
            }
            if (i17 * i13 > i16 * i10) {
                i13 = i10;
                i16 = i17;
            }
            i10++;
        }
        this.f29323u = i14 / i15;
        this.f29324v = i16 / i13;
        return i15;
    }

    public final void f() {
        int i6;
        int i10;
        int i11;
        float f;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        int i21 = this.f29316m;
        float f2 = this.f29307c;
        float f10 = this.f29308d;
        float f11 = f2 / f10;
        float f12 = this.f29309e * f10;
        double d10 = f11;
        int i22 = this.f29305a;
        int i23 = this.f29306b;
        int i24 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            a(this.f29313j, 0, this.f29314k);
            this.f29314k = 0;
        } else {
            int i25 = this.f29314k;
            int i26 = this.f29311h;
            if (i25 >= i26) {
                int i27 = 0;
                while (true) {
                    int i28 = this.r;
                    if (i28 > 0) {
                        int min = Math.min(i26, i28);
                        a(this.f29313j, i27, min);
                        this.r -= min;
                        i27 += min;
                        i11 = i21;
                        f = f12;
                        i10 = i22;
                    } else {
                        short[] sArr = this.f29313j;
                        if (i22 > 4000) {
                            i6 = i22 / 4000;
                        } else {
                            i6 = 1;
                        }
                        int i29 = this.f29310g;
                        int i30 = this.f;
                        if (i23 == i24 && i6 == i24) {
                            i12 = d(sArr, i27, i30, i29);
                            i11 = i21;
                            f = f12;
                            i10 = i22;
                        } else {
                            b(sArr, i27, i6);
                            i10 = i22;
                            i11 = i21;
                            short[] sArr2 = this.f29312i;
                            f = f12;
                            int d11 = d(sArr2, 0, i30 / i6, i29 / i6);
                            if (i6 != 1) {
                                int i31 = d11 * i6;
                                int i32 = i6 * 4;
                                int i33 = i31 - i32;
                                int i34 = i31 + i32;
                                if (i33 >= i30) {
                                    i30 = i33;
                                }
                                if (i34 <= i29) {
                                    i29 = i34;
                                }
                                if (i23 == 1) {
                                    i12 = d(sArr, i27, i30, i29);
                                } else {
                                    b(sArr, i27, 1);
                                    i12 = d(sArr2, 0, i30, i29);
                                }
                            } else {
                                i12 = d11;
                            }
                        }
                        int i35 = this.f29323u;
                        int i36 = this.f29324v;
                        if (i35 != 0 && this.f29321s != 0 && i36 <= i35 * 3 && i35 * 2 > this.f29322t * 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i13 = this.f29321s;
                        } else {
                            i13 = i12;
                        }
                        this.f29322t = i35;
                        this.f29321s = i12;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.f29313j;
                            if (f11 >= 2.0f) {
                                i15 = (int) (i13 / (f11 - 1.0f));
                            } else {
                                this.r = (int) (((2.0f - f11) * i13) / (f11 - 1.0f));
                                i15 = i13;
                            }
                            short[] c10 = c(this.f29315l, this.f29316m, i15);
                            this.f29315l = c10;
                            int i37 = i27;
                            e(i15, this.f29306b, c10, this.f29316m, sArr3, i37, sArr3, i27 + i13);
                            this.f29316m += i15;
                            i27 = i13 + i15 + i37;
                        } else {
                            int i38 = i27;
                            short[] sArr4 = this.f29313j;
                            if (f11 < 0.5f) {
                                i14 = (int) ((i13 * f11) / (1.0f - f11));
                            } else {
                                this.r = (int) ((((2.0f * f11) - 1.0f) * i13) / (1.0f - f11));
                                i14 = i13;
                            }
                            int i39 = i13 + i14;
                            short[] c11 = c(this.f29315l, this.f29316m, i39);
                            this.f29315l = c11;
                            System.arraycopy(sArr4, i38 * i23, c11, this.f29316m * i23, i23 * i13);
                            e(i14, this.f29306b, this.f29315l, this.f29316m + i13, sArr4, i38 + i13, sArr4, i38);
                            this.f29316m += i39;
                            i27 = i38 + i14;
                        }
                    }
                    if (i27 + i26 > i25) {
                        break;
                    }
                    i22 = i10;
                    i21 = i11;
                    f12 = f;
                    i24 = 1;
                }
                int i40 = this.f29314k - i27;
                short[] sArr5 = this.f29313j;
                System.arraycopy(sArr5, i27 * i23, sArr5, 0, i23 * i40);
                this.f29314k = i40;
                if (f == 1.0f && this.f29316m != (i16 = i11)) {
                    int i41 = i10;
                    int i42 = (int) (i41 / f);
                    int i43 = i41;
                    while (true) {
                        if (i42 <= 16384 && i43 <= 16384) {
                            break;
                        }
                        i42 /= 2;
                        i43 /= 2;
                    }
                    int i44 = this.f29316m - i16;
                    short[] c12 = c(this.f29317n, this.f29318o, i44);
                    this.f29317n = c12;
                    System.arraycopy(this.f29315l, i16 * i23, c12, this.f29318o * i23, i23 * i44);
                    this.f29316m = i16;
                    this.f29318o += i44;
                    int i45 = 0;
                    while (true) {
                        i17 = this.f29318o;
                        i18 = i17 - 1;
                        if (i45 >= i18) {
                            break;
                        }
                        while (true) {
                            i19 = this.f29319p + 1;
                            int i46 = i19 * i42;
                            i20 = this.f29320q;
                            if (i46 <= i20 * i43) {
                                break;
                            }
                            this.f29315l = c(this.f29315l, this.f29316m, 1);
                            for (int i47 = 0; i47 < i23; i47++) {
                                short[] sArr6 = this.f29317n;
                                int i48 = (i45 * i23) + i47;
                                short s10 = sArr6[i48];
                                short s11 = sArr6[i48 + i23];
                                int i49 = this.f29319p;
                                int i50 = i49 * i42;
                                int i51 = (i49 + 1) * i42;
                                int i52 = i51 - (this.f29320q * i43);
                                int i53 = i51 - i50;
                                this.f29315l[(this.f29316m * i23) + i47] = (short) ((((i53 - i52) * s11) + (s10 * i52)) / i53);
                            }
                            this.f29320q++;
                            this.f29316m++;
                        }
                        this.f29319p = i19;
                        if (i19 == i43) {
                            this.f29319p = 0;
                            if (i20 == i42) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            sc.b.C(z11);
                            this.f29320q = 0;
                        }
                        i45++;
                    }
                    if (i18 != 0) {
                        short[] sArr7 = this.f29317n;
                        System.arraycopy(sArr7, i18 * i23, sArr7, 0, (i17 - i18) * i23);
                        this.f29318o -= i18;
                        return;
                    }
                    return;
                }
            }
        }
        i11 = i21;
        f = f12;
        i10 = i22;
        if (f == 1.0f) {
        }
    }
}
