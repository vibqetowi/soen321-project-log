package w;

import com.appsflyer.R;
import java.util.Arrays;
/* compiled from: ArcCurveFit.java */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final double[] f36181a;

    /* renamed from: b  reason: collision with root package name */
    public final C0609a[] f36182b;

    /* compiled from: ArcCurveFit.java */
    /* renamed from: w.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0609a {

        /* renamed from: s  reason: collision with root package name */
        public static final double[] f36183s = new double[91];

        /* renamed from: a  reason: collision with root package name */
        public final double[] f36184a;

        /* renamed from: b  reason: collision with root package name */
        public double f36185b;

        /* renamed from: c  reason: collision with root package name */
        public final double f36186c;

        /* renamed from: d  reason: collision with root package name */
        public final double f36187d;

        /* renamed from: e  reason: collision with root package name */
        public final double f36188e;
        public final double f;

        /* renamed from: g  reason: collision with root package name */
        public final double f36189g;

        /* renamed from: h  reason: collision with root package name */
        public final double f36190h;

        /* renamed from: i  reason: collision with root package name */
        public final double f36191i;

        /* renamed from: j  reason: collision with root package name */
        public final double f36192j;

        /* renamed from: k  reason: collision with root package name */
        public final double f36193k;

        /* renamed from: l  reason: collision with root package name */
        public final double f36194l;

        /* renamed from: m  reason: collision with root package name */
        public final double f36195m;

        /* renamed from: n  reason: collision with root package name */
        public final double f36196n;

        /* renamed from: o  reason: collision with root package name */
        public double f36197o;

        /* renamed from: p  reason: collision with root package name */
        public double f36198p;

        /* renamed from: q  reason: collision with root package name */
        public final boolean f36199q;
        public final boolean r;

        public C0609a(int i6, double d10, double d11, double d12, double d13, double d14, double d15) {
            int i10;
            double d16;
            double[] dArr;
            double d17 = d12;
            this.r = false;
            boolean z10 = i6 == 1;
            this.f36199q = z10;
            this.f36186c = d10;
            this.f36187d = d11;
            double d18 = 1.0d / (d11 - d10);
            this.f36191i = d18;
            if (3 == i6) {
                this.r = true;
            }
            double d19 = d14 - d17;
            double d20 = d15 - d13;
            if (!this.r && Math.abs(d19) >= 0.001d && Math.abs(d20) >= 0.001d) {
                this.f36184a = new double[R.styleable.AppCompatTheme_switchStyle];
                this.f36192j = (z10 ? -1 : 1) * d19;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                this.f36193k = d20 * i10;
                this.f36194l = z10 ? d14 : d17;
                if (z10) {
                    d16 = d13;
                } else {
                    d16 = d15;
                }
                this.f36195m = d16;
                double d21 = d13 - d15;
                int i11 = 0;
                double d22 = 0.0d;
                double d23 = 0.0d;
                double d24 = 0.0d;
                while (true) {
                    dArr = f36183s;
                    if (i11 >= 91) {
                        break;
                    }
                    double d25 = d19;
                    double radians = Math.toRadians((i11 * 90.0d) / 90);
                    double sin = Math.sin(radians) * d25;
                    double cos = Math.cos(radians) * d21;
                    if (i11 > 0) {
                        d22 += Math.hypot(sin - d23, cos - d24);
                        dArr[i11] = d22;
                    }
                    i11++;
                    d24 = cos;
                    d23 = sin;
                    d19 = d25;
                }
                this.f36185b = d22;
                for (int i12 = 0; i12 < 91; i12++) {
                    dArr[i12] = dArr[i12] / d22;
                }
                int i13 = 0;
                while (true) {
                    double[] dArr2 = this.f36184a;
                    if (i13 < dArr2.length) {
                        double length = i13 / (dArr2.length - 1);
                        int binarySearch = Arrays.binarySearch(dArr, length);
                        if (binarySearch >= 0) {
                            dArr2[i13] = binarySearch / 90;
                        } else if (binarySearch == -1) {
                            dArr2[i13] = 0.0d;
                        } else {
                            int i14 = -binarySearch;
                            int i15 = i14 - 2;
                            double d26 = dArr[i15];
                            dArr2[i13] = (((length - d26) / (dArr[i14 - 1] - d26)) + i15) / 90;
                        }
                        i13++;
                    } else {
                        this.f36196n = this.f36185b * this.f36191i;
                        return;
                    }
                }
            } else {
                this.r = true;
                this.f36188e = d17;
                this.f = d14;
                this.f36189g = d13;
                this.f36190h = d15;
                double hypot = Math.hypot(d20, d19);
                this.f36185b = hypot;
                this.f36196n = hypot * d18;
                this.f36194l = d19 / (d11 - d10);
                this.f36195m = d20 / (d11 - d10);
            }
        }

        public final double a() {
            double d10 = this.f36192j * this.f36198p;
            double hypot = this.f36196n / Math.hypot(d10, (-this.f36193k) * this.f36197o);
            if (this.f36199q) {
                d10 = -d10;
            }
            return d10 * hypot;
        }

        public final double b() {
            double d10 = this.f36192j * this.f36198p;
            double d11 = (-this.f36193k) * this.f36197o;
            double hypot = this.f36196n / Math.hypot(d10, d11);
            if (this.f36199q) {
                return (-d11) * hypot;
            }
            return d11 * hypot;
        }

        public final double c(double d10) {
            double d11 = (d10 - this.f36186c) * this.f36191i;
            double d12 = this.f;
            double d13 = this.f36188e;
            return ((d12 - d13) * d11) + d13;
        }

        public final double d(double d10) {
            double d11 = (d10 - this.f36186c) * this.f36191i;
            double d12 = this.f36190h;
            double d13 = this.f36189g;
            return ((d12 - d13) * d11) + d13;
        }

        public final double e() {
            return (this.f36192j * this.f36197o) + this.f36194l;
        }

        public final double f() {
            return (this.f36193k * this.f36198p) + this.f36195m;
        }

        public final void g(double d10) {
            double d11;
            if (this.f36199q) {
                d11 = this.f36187d - d10;
            } else {
                d11 = d10 - this.f36186c;
            }
            double d12 = d11 * this.f36191i;
            double d13 = 0.0d;
            if (d12 > 0.0d) {
                d13 = 1.0d;
                if (d12 < 1.0d) {
                    double[] dArr = this.f36184a;
                    double length = d12 * (dArr.length - 1);
                    int i6 = (int) length;
                    double d14 = dArr[i6];
                    d13 = ((dArr[i6 + 1] - d14) * (length - i6)) + d14;
                }
            }
            double d15 = d13 * 1.5707963267948966d;
            this.f36197o = Math.sin(d15);
            this.f36198p = Math.cos(d15);
        }
    }

    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f36181a = dArr;
        this.f36182b = new C0609a[dArr.length - 1];
        int i6 = 0;
        int i10 = 1;
        int i11 = 1;
        while (true) {
            C0609a[] c0609aArr = this.f36182b;
            if (i6 < c0609aArr.length) {
                int i12 = iArr[i6];
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                if (i10 == 1) {
                                    i10 = 2;
                                } else {
                                    i10 = 1;
                                }
                                i11 = i10;
                            }
                        } else {
                            i10 = 2;
                            i11 = 2;
                        }
                    } else {
                        i10 = 1;
                        i11 = 1;
                    }
                } else {
                    i11 = 3;
                }
                double d10 = dArr[i6];
                int i13 = i6 + 1;
                double d11 = dArr[i13];
                double[] dArr3 = dArr2[i6];
                double d12 = dArr3[0];
                double d13 = dArr3[1];
                double[] dArr4 = dArr2[i13];
                c0609aArr[i6] = new C0609a(i11, d10, d11, d12, d13, dArr4[0], dArr4[1]);
                i6 = i13;
            } else {
                return;
            }
        }
    }

    @Override // w.b
    public final double b(double d10) {
        C0609a[] c0609aArr = this.f36182b;
        C0609a c0609a = c0609aArr[0];
        double d11 = c0609a.f36186c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0609a.r) {
                return (d12 * c0609aArr[0].f36194l) + c0609a.c(d11);
            }
            c0609a.g(d11);
            return (c0609aArr[0].a() * d12) + c0609aArr[0].e();
        } else if (d10 > c0609aArr[c0609aArr.length - 1].f36187d) {
            double d13 = c0609aArr[c0609aArr.length - 1].f36187d;
            double d14 = d10 - d13;
            int length = c0609aArr.length - 1;
            return (d14 * c0609aArr[length].f36194l) + c0609aArr[length].c(d13);
        } else {
            for (int i6 = 0; i6 < c0609aArr.length; i6++) {
                C0609a c0609a2 = c0609aArr[i6];
                if (d10 <= c0609a2.f36187d) {
                    if (c0609a2.r) {
                        return c0609a2.c(d10);
                    }
                    c0609a2.g(d10);
                    return c0609aArr[i6].e();
                }
            }
            return Double.NaN;
        }
    }

    @Override // w.b
    public final void c(double d10, double[] dArr) {
        C0609a[] c0609aArr = this.f36182b;
        C0609a c0609a = c0609aArr[0];
        double d11 = c0609a.f36186c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0609a.r) {
                double c10 = c0609a.c(d11);
                C0609a c0609a2 = c0609aArr[0];
                dArr[0] = (c0609a2.f36194l * d12) + c10;
                dArr[1] = (d12 * c0609aArr[0].f36195m) + c0609a2.d(d11);
                return;
            }
            c0609a.g(d11);
            dArr[0] = (c0609aArr[0].a() * d12) + c0609aArr[0].e();
            dArr[1] = (c0609aArr[0].b() * d12) + c0609aArr[0].f();
        } else if (d10 > c0609aArr[c0609aArr.length - 1].f36187d) {
            double d13 = c0609aArr[c0609aArr.length - 1].f36187d;
            double d14 = d10 - d13;
            int length = c0609aArr.length - 1;
            C0609a c0609a3 = c0609aArr[length];
            if (c0609a3.r) {
                double c11 = c0609a3.c(d13);
                C0609a c0609a4 = c0609aArr[length];
                dArr[0] = (c0609a4.f36194l * d14) + c11;
                dArr[1] = (d14 * c0609aArr[length].f36195m) + c0609a4.d(d13);
                return;
            }
            c0609a3.g(d10);
            dArr[0] = (c0609aArr[length].a() * d14) + c0609aArr[length].e();
            dArr[1] = (c0609aArr[length].b() * d14) + c0609aArr[length].f();
        } else {
            for (int i6 = 0; i6 < c0609aArr.length; i6++) {
                C0609a c0609a5 = c0609aArr[i6];
                if (d10 <= c0609a5.f36187d) {
                    if (c0609a5.r) {
                        dArr[0] = c0609a5.c(d10);
                        dArr[1] = c0609aArr[i6].d(d10);
                        return;
                    }
                    c0609a5.g(d10);
                    dArr[0] = c0609aArr[i6].e();
                    dArr[1] = c0609aArr[i6].f();
                    return;
                }
            }
        }
    }

    @Override // w.b
    public final void d(double d10, float[] fArr) {
        C0609a[] c0609aArr = this.f36182b;
        C0609a c0609a = c0609aArr[0];
        double d11 = c0609a.f36186c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0609a.r) {
                double c10 = c0609a.c(d11);
                C0609a c0609a2 = c0609aArr[0];
                fArr[0] = (float) ((c0609a2.f36194l * d12) + c10);
                fArr[1] = (float) ((d12 * c0609aArr[0].f36195m) + c0609a2.d(d11));
                return;
            }
            c0609a.g(d11);
            fArr[0] = (float) ((c0609aArr[0].a() * d12) + c0609aArr[0].e());
            fArr[1] = (float) ((c0609aArr[0].b() * d12) + c0609aArr[0].f());
        } else if (d10 > c0609aArr[c0609aArr.length - 1].f36187d) {
            double d13 = c0609aArr[c0609aArr.length - 1].f36187d;
            double d14 = d10 - d13;
            int length = c0609aArr.length - 1;
            C0609a c0609a3 = c0609aArr[length];
            if (c0609a3.r) {
                double c11 = c0609a3.c(d13);
                C0609a c0609a4 = c0609aArr[length];
                fArr[0] = (float) ((c0609a4.f36194l * d14) + c11);
                fArr[1] = (float) ((d14 * c0609aArr[length].f36195m) + c0609a4.d(d13));
                return;
            }
            c0609a3.g(d10);
            fArr[0] = (float) c0609aArr[length].e();
            fArr[1] = (float) c0609aArr[length].f();
        } else {
            for (int i6 = 0; i6 < c0609aArr.length; i6++) {
                C0609a c0609a5 = c0609aArr[i6];
                if (d10 <= c0609a5.f36187d) {
                    if (c0609a5.r) {
                        fArr[0] = (float) c0609a5.c(d10);
                        fArr[1] = (float) c0609aArr[i6].d(d10);
                        return;
                    }
                    c0609a5.g(d10);
                    fArr[0] = (float) c0609aArr[i6].e();
                    fArr[1] = (float) c0609aArr[i6].f();
                    return;
                }
            }
        }
    }

    @Override // w.b
    public final void e(double d10, double[] dArr) {
        C0609a[] c0609aArr = this.f36182b;
        double d11 = c0609aArr[0].f36186c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > c0609aArr[c0609aArr.length - 1].f36187d) {
            d10 = c0609aArr[c0609aArr.length - 1].f36187d;
        }
        for (int i6 = 0; i6 < c0609aArr.length; i6++) {
            C0609a c0609a = c0609aArr[i6];
            if (d10 <= c0609a.f36187d) {
                if (c0609a.r) {
                    dArr[0] = c0609a.f36194l;
                    dArr[1] = c0609a.f36195m;
                    return;
                }
                c0609a.g(d10);
                dArr[0] = c0609aArr[i6].a();
                dArr[1] = c0609aArr[i6].b();
                return;
            }
        }
    }

    @Override // w.b
    public final double[] f() {
        return this.f36181a;
    }
}
