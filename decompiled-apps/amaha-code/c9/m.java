package c9;

import java.util.Arrays;
import u7.x;
/* compiled from: NalUnitUtil.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f5155a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f5156b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f5157c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static int[] f5158d = new int[10];

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f5159a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5160b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5161c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5162d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f5163e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public final float f5164g;

        public a(int i6, boolean z10, int i10, int i11, int[] iArr, int i12, int i13, int i14, float f) {
            this.f5159a = i6;
            this.f5160b = z10;
            this.f5161c = i10;
            this.f5162d = i11;
            this.f5163e = iArr;
            this.f = i12;
            this.f5164g = f;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5165a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5166b;

        public b(int i6, int i10, boolean z10) {
            this.f5165a = i10;
            this.f5166b = z10;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f5167a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5168b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5169c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5170d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5171e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public final float f5172g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f5173h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f5174i;

        /* renamed from: j  reason: collision with root package name */
        public final int f5175j;

        /* renamed from: k  reason: collision with root package name */
        public final int f5176k;

        /* renamed from: l  reason: collision with root package name */
        public final int f5177l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f5178m;

        public c(int i6, int i10, int i11, int i12, int i13, int i14, float f, boolean z10, boolean z11, int i15, int i16, int i17, boolean z12) {
            this.f5167a = i6;
            this.f5168b = i10;
            this.f5169c = i11;
            this.f5170d = i12;
            this.f5171e = i13;
            this.f = i14;
            this.f5172g = f;
            this.f5173h = z10;
            this.f5174i = z11;
            this.f5175j = i15;
            this.f5176k = i16;
            this.f5177l = i17;
            this.f5178m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i6, int i10, boolean[] zArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = i10 - i6;
        boolean z13 = false;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            a(zArr);
            return i6 - 3;
        } else if (i11 > 1 && zArr[1] && bArr[i6] == 1) {
            a(zArr);
            return i6 - 2;
        } else if (i11 > 2 && zArr[2] && bArr[i6] == 0 && bArr[i6 + 1] == 1) {
            a(zArr);
            return i6 - 1;
        } else {
            int i12 = i10 - 1;
            int i13 = i6 + 2;
            while (i13 < i12) {
                byte b10 = bArr[i13];
                if ((b10 & 254) == 0) {
                    int i14 = i13 - 2;
                    if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                        a(zArr);
                        return i14;
                    }
                    i13 -= 2;
                }
                i13 += 3;
            }
            if (i11 <= 2 ? i11 != 2 ? !zArr[1] || bArr[i12] != 1 : !zArr[2] || bArr[i10 - 2] != 0 || bArr[i12] != 1 : bArr[i10 - 3] != 0 || bArr[i10 - 2] != 0 || bArr[i12] != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            zArr[0] = z11;
            if (i11 <= 1 ? !(!zArr[2] || bArr[i12] != 0) : !(bArr[i10 - 2] != 0 || bArr[i12] != 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
            zArr[1] = z12;
            if (bArr[i12] == 0) {
                z13 = true;
            }
            zArr[2] = z13;
            return i10;
        }
    }

    public static a c(int i6, byte[] bArr, int i10) {
        int i11;
        float f;
        int i12;
        int i13;
        int i14;
        int i15 = 2;
        x xVar = new x(i6 + 2, bArr, i10);
        xVar.r(4);
        int i16 = xVar.i(3);
        xVar.q();
        int i17 = xVar.i(2);
        boolean h10 = xVar.h();
        int i18 = xVar.i(5);
        int i19 = 0;
        for (int i20 = 0; i20 < 32; i20++) {
            if (xVar.h()) {
                i19 |= 1 << i20;
            }
        }
        int i21 = 6;
        int[] iArr = new int[6];
        for (int i22 = 0; i22 < 6; i22++) {
            iArr[i22] = xVar.i(8);
        }
        int i23 = xVar.i(8);
        int i24 = 0;
        for (int i25 = 0; i25 < i16; i25++) {
            if (xVar.h()) {
                i24 += 89;
            }
            if (xVar.h()) {
                i24 += 8;
            }
        }
        xVar.r(i24);
        if (i16 > 0) {
            xVar.r((8 - i16) * 2);
        }
        xVar.l();
        int l2 = xVar.l();
        if (l2 == 3) {
            xVar.q();
        }
        int l10 = xVar.l();
        int l11 = xVar.l();
        if (xVar.h()) {
            int l12 = xVar.l();
            int l13 = xVar.l();
            int l14 = xVar.l();
            int l15 = xVar.l();
            if (l2 != 1 && l2 != 2) {
                i13 = 1;
            } else {
                i13 = 2;
            }
            if (l2 == 1) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            l10 -= (l12 + l13) * i13;
            l11 -= (l14 + l15) * i14;
        }
        xVar.l();
        xVar.l();
        int l16 = xVar.l();
        if (xVar.h()) {
            i11 = 0;
        } else {
            i11 = i16;
        }
        for (int i26 = i11; i26 <= i16; i26++) {
            xVar.l();
            xVar.l();
            xVar.l();
        }
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        if (xVar.h() && xVar.h()) {
            int i27 = 0;
            int i28 = 4;
            while (i27 < i28) {
                int i29 = 0;
                while (i29 < i21) {
                    if (!xVar.h()) {
                        xVar.l();
                    } else {
                        int min = Math.min(64, 1 << ((i27 << 1) + 4));
                        if (i27 > 1) {
                            xVar.m();
                        }
                        for (int i30 = 0; i30 < min; i30++) {
                            xVar.m();
                        }
                    }
                    if (i27 == 3) {
                        i12 = 3;
                    } else {
                        i12 = 1;
                    }
                    i29 += i12;
                    i21 = 6;
                }
                i27++;
                i28 = 4;
                i21 = 6;
                i15 = 2;
            }
        }
        xVar.r(i15);
        if (xVar.h()) {
            xVar.r(8);
            xVar.l();
            xVar.l();
            xVar.q();
        }
        int l17 = xVar.l();
        boolean z10 = false;
        int i31 = 0;
        for (int i32 = 0; i32 < l17; i32++) {
            if (i32 != 0) {
                z10 = xVar.h();
            }
            if (z10) {
                xVar.q();
                xVar.l();
                for (int i33 = 0; i33 <= i31; i33++) {
                    if (xVar.h()) {
                        xVar.q();
                    }
                }
            } else {
                int l18 = xVar.l();
                int l19 = xVar.l();
                int i34 = l18 + l19;
                for (int i35 = 0; i35 < l18; i35++) {
                    xVar.l();
                    xVar.q();
                }
                for (int i36 = 0; i36 < l19; i36++) {
                    xVar.l();
                    xVar.q();
                }
                i31 = i34;
            }
        }
        if (xVar.h()) {
            for (int i37 = 0; i37 < xVar.l(); i37++) {
                xVar.r(l16 + 4 + 1);
            }
        }
        xVar.r(2);
        float f2 = 1.0f;
        if (xVar.h()) {
            if (xVar.h()) {
                int i38 = xVar.i(8);
                if (i38 == 255) {
                    int i39 = xVar.i(16);
                    int i40 = xVar.i(16);
                    if (i39 != 0 && i40 != 0) {
                        f2 = i39 / i40;
                    }
                } else if (i38 < 17) {
                    f2 = f5156b[i38];
                } else {
                    defpackage.d.k(46, "Unexpected aspect_ratio_idc value: ", i38, "NalUnitUtil");
                }
            }
            if (xVar.h()) {
                xVar.q();
            }
            if (xVar.h()) {
                xVar.r(4);
                if (xVar.h()) {
                    xVar.r(24);
                }
            }
            if (xVar.h()) {
                xVar.l();
                xVar.l();
            }
            xVar.q();
            if (xVar.h()) {
                l11 *= 2;
            }
            f = f2;
        } else {
            f = 1.0f;
        }
        return new a(i17, h10, i18, i19, iArr, i23, l10, l11, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c d(int i6, byte[] bArr, int i10) {
        int l2;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        int i15;
        boolean h10;
        int i16;
        float f;
        int i17;
        int i18;
        int i19;
        x xVar = new x(i6 + 1, bArr, i10);
        int i20 = xVar.i(8);
        int i21 = xVar.i(8);
        int i22 = xVar.i(8);
        int l10 = xVar.l();
        if (i20 != 100 && i20 != 110 && i20 != 122 && i20 != 244 && i20 != 44 && i20 != 83 && i20 != 86 && i20 != 118 && i20 != 128 && i20 != 138) {
            l2 = 1;
            z11 = false;
        } else {
            l2 = xVar.l();
            if (l2 == 3) {
                z10 = xVar.h();
            } else {
                z10 = false;
            }
            xVar.l();
            xVar.l();
            xVar.q();
            if (xVar.h()) {
                if (l2 != 3) {
                    i11 = 8;
                } else {
                    i11 = 12;
                }
                for (int i23 = 0; i23 < i11; i23++) {
                    if (xVar.h()) {
                        if (i23 < 6) {
                            i12 = 16;
                        } else {
                            i12 = 64;
                        }
                        int i24 = 8;
                        int i25 = 8;
                        for (int i26 = 0; i26 < i12; i26++) {
                            if (i24 != 0) {
                                i24 = ((xVar.m() + i25) + 256) % 256;
                            }
                            if (i24 != 0) {
                                i25 = i24;
                            }
                        }
                    }
                }
            }
            z11 = z10;
        }
        int l11 = xVar.l() + 4;
        int l12 = xVar.l();
        if (l12 == 0) {
            i14 = xVar.l() + 4;
            i13 = l12;
        } else if (l12 == 1) {
            boolean h11 = xVar.h();
            xVar.m();
            xVar.m();
            long l13 = xVar.l();
            i13 = l12;
            for (int i27 = 0; i27 < l13; i27++) {
                xVar.l();
            }
            z12 = h11;
            i15 = 0;
            xVar.l();
            xVar.q();
            int l14 = xVar.l() + 1;
            h10 = xVar.h();
            int i28 = 2 - (h10 ? 1 : 0);
            int l15 = (xVar.l() + 1) * i28;
            if (!h10) {
                xVar.q();
            }
            xVar.q();
            int i29 = l14 * 16;
            int i30 = l15 * 16;
            if (!xVar.h()) {
                int l16 = xVar.l();
                int l17 = xVar.l();
                int l18 = xVar.l();
                int l19 = xVar.l();
                if (l2 == 0) {
                    i19 = 1;
                    i16 = i15;
                } else {
                    i16 = i15;
                    if (l2 == 3) {
                        i18 = 1;
                    } else {
                        i18 = 2;
                    }
                    int i31 = 1;
                    if (l2 == 1) {
                        i31 = 2;
                    }
                    i28 *= i31;
                    i19 = i18;
                }
                i29 -= (l16 + l17) * i19;
                i30 -= (l18 + l19) * i28;
            } else {
                i16 = i15;
            }
            int i32 = i29;
            int i33 = i30;
            if (xVar.h() && xVar.h()) {
                i17 = xVar.i(8);
                if (i17 != 255) {
                    int i34 = xVar.i(16);
                    int i35 = xVar.i(16);
                    if (i34 != 0 && i35 != 0) {
                        f = i34 / i35;
                    }
                } else if (i17 < 17) {
                    f = f5156b[i17];
                } else {
                    defpackage.d.k(46, "Unexpected aspect_ratio_idc value: ", i17, "NalUnitUtil");
                }
                return new c(i20, i21, i22, l10, i32, i33, f, z11, h10, l11, i13, i16, z12);
            }
            f = 1.0f;
            return new c(i20, i21, i22, l10, i32, i33, f, z11, h10, l11, i13, i16, z12);
        } else {
            i13 = l12;
            i14 = 0;
        }
        i15 = i14;
        z12 = false;
        xVar.l();
        xVar.q();
        int l142 = xVar.l() + 1;
        h10 = xVar.h();
        int i282 = 2 - (h10 ? 1 : 0);
        int l152 = (xVar.l() + 1) * i282;
        if (!h10) {
        }
        xVar.q();
        int i292 = l142 * 16;
        int i302 = l152 * 16;
        if (!xVar.h()) {
        }
        int i322 = i292;
        int i332 = i302;
        if (xVar.h()) {
            i17 = xVar.i(8);
            if (i17 != 255) {
            }
            return new c(i20, i21, i22, l10, i322, i332, f, z11, h10, l11, i13, i16, z12);
        }
        f = 1.0f;
        return new c(i20, i21, i22, l10, i322, i332, f, z11, h10, l11, i13, i16, z12);
    }

    public static int e(byte[] bArr, int i6) {
        int i10;
        synchronized (f5157c) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i6) {
                while (true) {
                    if (i11 < i6 - 2) {
                        if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = i6;
                        break;
                    }
                }
                if (i11 < i6) {
                    int[] iArr = f5158d;
                    if (iArr.length <= i12) {
                        f5158d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f5158d[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i6 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f5158d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i18 + 1;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }
}
