package w;
/* compiled from: CurveFit.java */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: CurveFit.java */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final double f36200a;

        /* renamed from: b  reason: collision with root package name */
        public final double[] f36201b;

        public a(double d10, double[] dArr) {
            this.f36200a = d10;
            this.f36201b = dArr;
        }

        @Override // w.b
        public final double b(double d10) {
            return this.f36201b[0];
        }

        @Override // w.b
        public final void c(double d10, double[] dArr) {
            double[] dArr2 = this.f36201b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // w.b
        public final void d(double d10, float[] fArr) {
            int i6 = 0;
            while (true) {
                double[] dArr = this.f36201b;
                if (i6 < dArr.length) {
                    fArr[i6] = (float) dArr[i6];
                    i6++;
                } else {
                    return;
                }
            }
        }

        @Override // w.b
        public final void e(double d10, double[] dArr) {
            for (int i6 = 0; i6 < this.f36201b.length; i6++) {
                dArr[i6] = 0.0d;
            }
        }

        @Override // w.b
        public final double[] f() {
            return new double[]{this.f36200a};
        }
    }

    public static b a(int i6, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i6 = 2;
        }
        if (i6 != 0) {
            if (i6 != 2) {
                return new g(dArr, dArr2);
            }
            return new a(dArr[0], dArr2[0]);
        }
        return new h(dArr, dArr2);
    }

    public abstract double b(double d10);

    public abstract void c(double d10, double[] dArr);

    public abstract void d(double d10, float[] fArr);

    public abstract void e(double d10, double[] dArr);

    public abstract double[] f();
}
