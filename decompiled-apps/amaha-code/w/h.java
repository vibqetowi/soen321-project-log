package w;

import java.lang.reflect.Array;
/* compiled from: MonotonicCurveFit.java */
/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: a  reason: collision with root package name */
    public final double[] f36229a;

    /* renamed from: b  reason: collision with root package name */
    public final double[][] f36230b;

    /* renamed from: c  reason: collision with root package name */
    public final double[][] f36231c;

    /* renamed from: d  reason: collision with root package name */
    public final double[] f36232d;

    public h(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f36232d = new double[length2];
        int i6 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, i6, length2);
        double[][] dArr4 = (double[][]) Array.newInstance(Double.TYPE, length, length2);
        for (int i10 = 0; i10 < length2; i10++) {
            int i11 = 0;
            while (i11 < i6) {
                int i12 = i11 + 1;
                double d10 = dArr[i12] - dArr[i11];
                double[] dArr5 = dArr3[i11];
                double d11 = (dArr2[i12][i10] - dArr2[i11][i10]) / d10;
                dArr5[i10] = d11;
                if (i11 == 0) {
                    dArr4[i11][i10] = d11;
                } else {
                    dArr4[i11][i10] = (dArr3[i11 - 1][i10] + d11) * 0.5d;
                }
                i11 = i12;
            }
            dArr4[i6][i10] = dArr3[length - 2][i10];
        }
        for (int i13 = 0; i13 < i6; i13++) {
            for (int i14 = 0; i14 < length2; i14++) {
                double d12 = dArr3[i13][i14];
                if (d12 == 0.0d) {
                    dArr4[i13][i14] = 0.0d;
                    dArr4[i13 + 1][i14] = 0.0d;
                } else {
                    double d13 = dArr4[i13][i14] / d12;
                    int i15 = i13 + 1;
                    double d14 = dArr4[i15][i14] / d12;
                    double hypot = Math.hypot(d13, d14);
                    if (hypot > 9.0d) {
                        double d15 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i13];
                        double[] dArr7 = dArr3[i13];
                        dArr6[i14] = d13 * d15 * dArr7[i14];
                        dArr4[i15][i14] = d15 * d14 * dArr7[i14];
                    }
                }
            }
        }
        this.f36229a = dArr;
        this.f36230b = dArr2;
        this.f36231c = dArr4;
    }

    public static double g(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d11 * 6.0d;
        double d18 = 6.0d * d16 * d12;
        double d19 = 3.0d * d10;
        double d20 = d19 * d14 * d16;
        return (d10 * d14) + (((d20 + (((d19 * d15) * d16) + ((d18 + ((d17 * d13) + (((-6.0d) * d16) * d13))) - (d17 * d12)))) - (((2.0d * d10) * d15) * d11)) - (((4.0d * d10) * d14) * d11));
    }

    public static double i(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d16 * d11;
        double d18 = 3.0d * d16;
        double d19 = d18 * d13;
        double d20 = d10 * d15;
        double d21 = d20 * d17;
        double d22 = d10 * d14;
        return (d22 * d11) + ((((d17 * d22) + (d21 + (((((d17 * 2.0d) * d12) + (d19 + (((-2.0d) * d17) * d13))) - (d18 * d12)) + d12))) - (d20 * d16)) - (((2.0d * d10) * d14) * d16));
    }

    @Override // w.b
    public final double b(double d10) {
        double d11;
        double d12;
        double h10;
        double[] dArr = this.f36229a;
        int length = dArr.length;
        double d13 = dArr[0];
        double[][] dArr2 = this.f36230b;
        if (d10 <= d13) {
            d11 = dArr2[0][0];
            d12 = d10 - d13;
            h10 = h(d13);
        } else {
            int i6 = length - 1;
            double d14 = dArr[i6];
            if (d10 >= d14) {
                d11 = dArr2[i6][0];
                d12 = d10 - d14;
                h10 = h(d14);
            } else {
                int i10 = 0;
                while (i10 < i6) {
                    double d15 = dArr[i10];
                    if (d10 == d15) {
                        return dArr2[i10][0];
                    }
                    int i11 = i10 + 1;
                    double d16 = dArr[i11];
                    if (d10 < d16) {
                        double d17 = d16 - d15;
                        double d18 = (d10 - d15) / d17;
                        double d19 = dArr2[i10][0];
                        double d20 = dArr2[i11][0];
                        double[][] dArr3 = this.f36231c;
                        return i(d17, d18, d19, d20, dArr3[i10][0], dArr3[i11][0]);
                    }
                    i10 = i11;
                }
                return 0.0d;
            }
        }
        return (h10 * d12) + d11;
    }

    @Override // w.b
    public final void c(double d10, double[] dArr) {
        double[] dArr2 = this.f36229a;
        int length = dArr2.length;
        double[][] dArr3 = this.f36230b;
        int i6 = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        double[] dArr4 = this.f36232d;
        if (d10 <= d11) {
            e(d11, dArr4);
            for (int i10 = 0; i10 < length2; i10++) {
                dArr[i10] = ((d10 - dArr2[0]) * dArr4[i10]) + dArr3[0][i10];
            }
            return;
        }
        int i11 = length - 1;
        double d12 = dArr2[i11];
        if (d10 >= d12) {
            e(d12, dArr4);
            while (i6 < length2) {
                dArr[i6] = ((d10 - dArr2[i11]) * dArr4[i6]) + dArr3[i11][i6];
                i6++;
            }
            return;
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d10 == dArr2[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = dArr3[i12][i13];
                }
            }
            int i14 = i12 + 1;
            double d13 = dArr2[i14];
            if (d10 < d13) {
                double d14 = dArr2[i12];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i6 < length2) {
                    double d17 = dArr3[i12][i6];
                    double d18 = dArr3[i14][i6];
                    double[][] dArr5 = this.f36231c;
                    dArr[i6] = i(d15, d16, d17, d18, dArr5[i12][i6], dArr5[i14][i6]);
                    i6++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // w.b
    public final void d(double d10, float[] fArr) {
        double[] dArr = this.f36229a;
        int length = dArr.length;
        double[][] dArr2 = this.f36230b;
        int i6 = 0;
        int length2 = dArr2[0].length;
        double d11 = dArr[0];
        double[] dArr3 = this.f36232d;
        if (d10 <= d11) {
            e(d11, dArr3);
            for (int i10 = 0; i10 < length2; i10++) {
                fArr[i10] = (float) (((d10 - dArr[0]) * dArr3[i10]) + dArr2[0][i10]);
            }
            return;
        }
        int i11 = length - 1;
        double d12 = dArr[i11];
        if (d10 >= d12) {
            e(d12, dArr3);
            while (i6 < length2) {
                fArr[i6] = (float) (((d10 - dArr[i11]) * dArr3[i6]) + dArr2[i11][i6]);
                i6++;
            }
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            if (d10 == dArr[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) dArr2[i12][i13];
                }
            }
            int i14 = i12 + 1;
            double d13 = dArr[i14];
            if (d10 < d13) {
                double d14 = dArr[i12];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i6 < length2) {
                    double d17 = dArr2[i12][i6];
                    double d18 = dArr2[i14][i6];
                    double[][] dArr4 = this.f36231c;
                    fArr[i6] = (float) i(d15, d16, d17, d18, dArr4[i12][i6], dArr4[i14][i6]);
                    i6++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // w.b
    public final void e(double d10, double[] dArr) {
        double[] dArr2 = this.f36229a;
        int length = dArr2.length;
        double[][] dArr3 = this.f36230b;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d10 > d11) {
            d11 = dArr2[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            int i10 = i6 + 1;
            double d12 = dArr2[i10];
            if (d11 <= d12) {
                double d13 = dArr2[i6];
                double d14 = d12 - d13;
                double d15 = (d11 - d13) / d14;
                for (int i11 = 0; i11 < length2; i11++) {
                    double d16 = dArr3[i6][i11];
                    double d17 = dArr3[i10][i11];
                    double[][] dArr4 = this.f36231c;
                    dArr[i11] = g(d14, d15, d16, d17, dArr4[i6][i11], dArr4[i10][i11]) / d14;
                }
                return;
            }
            i6 = i10;
        }
    }

    @Override // w.b
    public final double[] f() {
        return this.f36229a;
    }

    public final double h(double d10) {
        double[] dArr = this.f36229a;
        int length = dArr.length;
        double d11 = dArr[0];
        if (d10 >= d11) {
            d11 = dArr[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            int i10 = i6 + 1;
            double d12 = dArr[i10];
            if (d11 <= d12) {
                double d13 = dArr[i6];
                double d14 = d12 - d13;
                double[][] dArr2 = this.f36230b;
                double d15 = dArr2[i6][0];
                double d16 = dArr2[i10][0];
                double[][] dArr3 = this.f36231c;
                return g(d14, (d11 - d13) / d14, d15, d16, dArr3[i6][0], dArr3[i10][0]) / d14;
            }
            i6 = i10;
        }
        return 0.0d;
    }
}
