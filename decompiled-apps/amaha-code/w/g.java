package w;
/* compiled from: LinearCurveFit.java */
/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    public final double[] f36226a;

    /* renamed from: b  reason: collision with root package name */
    public final double[][] f36227b;

    /* renamed from: c  reason: collision with root package name */
    public final double[] f36228c;

    public g(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f36228c = new double[length2];
        this.f36226a = dArr;
        this.f36227b = dArr2;
        if (length2 > 2) {
            double d10 = 0.0d;
            int i6 = 0;
            while (i6 < dArr.length) {
                double d11 = dArr2[i6][0];
                if (i6 > 0) {
                    double d12 = d11 - d10;
                    Math.hypot(d12, d12);
                }
                i6++;
                d10 = d11;
            }
        }
    }

    @Override // w.b
    public final double b(double d10) {
        double d11;
        double d12;
        double g5;
        double[] dArr = this.f36226a;
        int length = dArr.length;
        double d13 = dArr[0];
        double[][] dArr2 = this.f36227b;
        if (d10 <= d13) {
            d11 = dArr2[0][0];
            d12 = d10 - d13;
            g5 = g(d13);
        } else {
            int i6 = length - 1;
            double d14 = dArr[i6];
            if (d10 >= d14) {
                d11 = dArr2[i6][0];
                d12 = d10 - d14;
                g5 = g(d14);
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
                        double d17 = (d10 - d15) / (d16 - d15);
                        return (dArr2[i11][0] * d17) + ((1.0d - d17) * dArr2[i10][0]);
                    }
                    i10 = i11;
                }
                return 0.0d;
            }
        }
        return (g5 * d12) + d11;
    }

    @Override // w.b
    public final void c(double d10, double[] dArr) {
        double[] dArr2 = this.f36226a;
        int length = dArr2.length;
        double[][] dArr3 = this.f36227b;
        int i6 = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        double[] dArr4 = this.f36228c;
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
                double d15 = (d10 - d14) / (d13 - d14);
                while (i6 < length2) {
                    dArr[i6] = (dArr3[i14][i6] * d15) + ((1.0d - d15) * dArr3[i12][i6]);
                    i6++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // w.b
    public final void d(double d10, float[] fArr) {
        double[] dArr = this.f36226a;
        int length = dArr.length;
        double[][] dArr2 = this.f36227b;
        int i6 = 0;
        int length2 = dArr2[0].length;
        double d11 = dArr[0];
        double[] dArr3 = this.f36228c;
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
                double d15 = (d10 - d14) / (d13 - d14);
                while (i6 < length2) {
                    fArr[i6] = (float) ((dArr2[i14][i6] * d15) + ((1.0d - d15) * dArr2[i12][i6]));
                    i6++;
                }
                return;
            }
            i12 = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r12 >= r5) goto L3;
     */
    @Override // w.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(double d10, double[] dArr) {
        double[] dArr2 = this.f36226a;
        int length = dArr2.length;
        double[][] dArr3 = this.f36227b;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d10 > d11) {
            d11 = dArr2[length - 1];
        }
        d10 = d11;
        int i6 = 0;
        while (i6 < length - 1) {
            int i10 = i6 + 1;
            double d12 = dArr2[i10];
            if (d10 <= d12) {
                double d13 = d12 - dArr2[i6];
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = (dArr3[i10][i11] - dArr3[i6][i11]) / d13;
                }
                return;
            }
            i6 = i10;
        }
    }

    @Override // w.b
    public final double[] f() {
        return this.f36226a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r9 >= r3) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double g(double d10) {
        double[] dArr = this.f36226a;
        int length = dArr.length;
        double d11 = dArr[0];
        if (d10 >= d11) {
            d11 = dArr[length - 1];
        }
        d10 = d11;
        int i6 = 0;
        while (i6 < length - 1) {
            int i10 = i6 + 1;
            double d12 = dArr[i10];
            if (d10 <= d12) {
                double d13 = d12 - dArr[i6];
                double[][] dArr2 = this.f36227b;
                return (dArr2[i10][0] - dArr2[i6][0]) / d13;
            }
            i6 = i10;
        }
        return 0.0d;
    }
}
