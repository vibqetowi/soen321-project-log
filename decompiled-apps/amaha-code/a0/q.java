package a0;

import androidx.constraintlayout.widget.b;
import com.theinnerhour.b2b.utils.Constants;
import java.util.LinkedHashMap;
/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
public final class q implements Comparable<q> {
    public static final String[] L = {Constants.DAYMODEL_POSITION, "x", "y", "width", "height", "pathRotate"};
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public float F;
    public n G;
    public final LinkedHashMap<String, b0.a> H;
    public int I;
    public double[] J;
    public double[] K;

    /* renamed from: u  reason: collision with root package name */
    public w.c f121u;

    /* renamed from: v  reason: collision with root package name */
    public int f122v;

    /* renamed from: w  reason: collision with root package name */
    public float f123w;

    /* renamed from: x  reason: collision with root package name */
    public float f124x;

    /* renamed from: y  reason: collision with root package name */
    public float f125y;

    /* renamed from: z  reason: collision with root package name */
    public float f126z;

    public q() {
        this.f122v = 0;
        this.C = Float.NaN;
        this.D = -1;
        this.E = -1;
        this.F = Float.NaN;
        this.G = null;
        this.H = new LinkedHashMap<>();
        this.I = 0;
        this.J = new double[18];
        this.K = new double[18];
    }

    public static boolean f(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) <= 1.0E-6f) {
                return false;
            }
            return true;
        } else if (Float.isNaN(f) == Float.isNaN(f2)) {
            return false;
        } else {
            return true;
        }
    }

    public static void j(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f14 = (float) dArr[i6];
            double d10 = dArr2[i6];
            int i10 = iArr[i6];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            f12 = f14;
                        }
                    } else {
                        f10 = f14;
                    }
                } else {
                    f13 = f14;
                }
            } else {
                f11 = f14;
            }
        }
        float f15 = f11 - ((0.0f * f10) / 2.0f);
        float f16 = f13 - ((0.0f * f12) / 2.0f);
        fArr[0] = (((f10 * 1.0f) + f15) * f) + ((1.0f - f) * f15) + 0.0f;
        fArr[1] = (((f12 * 1.0f) + f16) * f2) + ((1.0f - f2) * f16) + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(q qVar) {
        return Float.compare(this.f124x, qVar.f124x);
    }

    public final void d(b.a aVar) {
        boolean z10;
        this.f121u = w.c.c(aVar.f1822d.f1880d);
        b.c cVar = aVar.f1822d;
        this.D = cVar.f1881e;
        this.E = cVar.f1878b;
        this.C = cVar.f1883h;
        this.f122v = cVar.f;
        float f = aVar.f1821c.f1893e;
        this.F = aVar.f1823e.C;
        for (String str : aVar.f1824g.keySet()) {
            b0.a aVar2 = aVar.f1824g.get(str);
            if (aVar2 != null) {
                int d10 = v.h.d(aVar2.f3906c);
                if (d10 != 4 && d10 != 5 && d10 != 7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.H.put(str, aVar2);
                }
            }
        }
    }

    public final void h(double d10, int[] iArr, double[] dArr, float[] fArr, int i6) {
        float f = this.f125y;
        float f2 = this.f126z;
        float f10 = this.A;
        float f11 = this.B;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f12 = (float) dArr[i10];
            int i11 = iArr[i10];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            f11 = f12;
                        }
                    } else {
                        f10 = f12;
                    }
                } else {
                    f2 = f12;
                }
            } else {
                f = f12;
            }
        }
        n nVar = this.G;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.b(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = f;
            double d13 = f2;
            f = (float) (((Math.sin(d13) * d12) + d11) - (f10 / 2.0f));
            f2 = (float) ((f14 - (Math.cos(d13) * d12)) - (f11 / 2.0f));
        }
        fArr[i6] = (f10 / 2.0f) + f + 0.0f;
        fArr[i6 + 1] = (f11 / 2.0f) + f2 + 0.0f;
    }

    public final void i(float f, float f2, float f10, float f11) {
        this.f125y = f;
        this.f126z = f2;
        this.A = f10;
        this.B = f11;
    }

    public final void k(n nVar, q qVar) {
        double d10 = (((this.A / 2.0f) + this.f125y) - qVar.f125y) - (qVar.A / 2.0f);
        double d11 = (((this.B / 2.0f) + this.f126z) - qVar.f126z) - (qVar.B / 2.0f);
        this.G = nVar;
        this.f125y = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.F)) {
            this.f126z = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f126z = (float) Math.toRadians(this.F);
        }
    }

    public q(int i6, int i10, h hVar, q qVar, q qVar2) {
        float f;
        float f2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i11;
        float min;
        float f15;
        this.f122v = 0;
        this.C = Float.NaN;
        this.D = -1;
        this.E = -1;
        this.F = Float.NaN;
        this.G = null;
        this.H = new LinkedHashMap<>();
        this.I = 0;
        this.J = new double[18];
        this.K = new double[18];
        if (qVar.E != -1) {
            float f16 = hVar.f7a / 100.0f;
            this.f123w = f16;
            this.f122v = hVar.f46h;
            this.I = hVar.f53o;
            float f17 = Float.isNaN(hVar.f47i) ? f16 : hVar.f47i;
            float f18 = Float.isNaN(hVar.f48j) ? f16 : hVar.f48j;
            float f19 = qVar2.A;
            float f20 = qVar.A;
            float f21 = qVar2.B;
            float f22 = qVar.B;
            this.f124x = this.f123w;
            this.A = (int) (((f19 - f20) * f17) + f20);
            this.B = (int) (((f21 - f22) * f18) + f22);
            int i12 = hVar.f53o;
            if (i12 == 1) {
                float f23 = Float.isNaN(hVar.f49k) ? f16 : hVar.f49k;
                float f24 = qVar2.f125y;
                float f25 = qVar.f125y;
                this.f125y = defpackage.e.e(f24, f25, f23, f25);
                f16 = Float.isNaN(hVar.f50l) ? f16 : hVar.f50l;
                float f26 = qVar2.f126z;
                float f27 = qVar.f126z;
                this.f126z = defpackage.e.e(f26, f27, f16, f27);
            } else if (i12 != 2) {
                float f28 = Float.isNaN(hVar.f49k) ? f16 : hVar.f49k;
                float f29 = qVar2.f125y;
                float f30 = qVar.f125y;
                this.f125y = defpackage.e.e(f29, f30, f28, f30);
                f16 = Float.isNaN(hVar.f50l) ? f16 : hVar.f50l;
                float f31 = qVar2.f126z;
                float f32 = qVar.f126z;
                this.f126z = defpackage.e.e(f31, f32, f16, f32);
            } else {
                if (Float.isNaN(hVar.f49k)) {
                    float f33 = qVar2.f125y;
                    float f34 = qVar.f125y;
                    min = defpackage.e.e(f33, f34, f16, f34);
                } else {
                    min = hVar.f49k * Math.min(f18, f17);
                }
                this.f125y = min;
                if (Float.isNaN(hVar.f50l)) {
                    float f35 = qVar2.f126z;
                    float f36 = qVar.f126z;
                    f15 = defpackage.e.e(f35, f36, f16, f36);
                } else {
                    f15 = hVar.f50l;
                }
                this.f126z = f15;
            }
            this.E = qVar.E;
            this.f121u = w.c.c(hVar.f);
            this.D = hVar.f45g;
            return;
        }
        int i13 = hVar.f53o;
        if (i13 == 1) {
            float f37 = hVar.f7a / 100.0f;
            this.f123w = f37;
            this.f122v = hVar.f46h;
            float f38 = Float.isNaN(hVar.f47i) ? f37 : hVar.f47i;
            float f39 = Float.isNaN(hVar.f48j) ? f37 : hVar.f48j;
            float f40 = qVar2.A - qVar.A;
            float f41 = qVar2.B - qVar.B;
            this.f124x = this.f123w;
            f37 = Float.isNaN(hVar.f49k) ? f37 : hVar.f49k;
            float f42 = qVar.f125y;
            float f43 = qVar.A;
            float f44 = qVar.f126z;
            float f45 = qVar.B;
            float f46 = ((qVar2.A / 2.0f) + qVar2.f125y) - ((f43 / 2.0f) + f42);
            float f47 = ((qVar2.B / 2.0f) + qVar2.f126z) - ((f45 / 2.0f) + f44);
            float f48 = f46 * f37;
            float f49 = (f40 * f38) / 2.0f;
            this.f125y = (int) ((f42 + f48) - f49);
            float f50 = f37 * f47;
            float f51 = (f41 * f39) / 2.0f;
            this.f126z = (int) ((f44 + f50) - f51);
            this.A = (int) (f43 + f);
            this.B = (int) (f45 + f2);
            float f52 = Float.isNaN(hVar.f50l) ? 0.0f : hVar.f50l;
            this.I = 1;
            float f53 = (int) ((qVar.f125y + f48) - f49);
            float f54 = (int) ((qVar.f126z + f50) - f51);
            this.f125y = f53 + ((-f47) * f52);
            this.f126z = f54 + (f46 * f52);
            this.E = this.E;
            this.f121u = w.c.c(hVar.f);
            this.D = hVar.f45g;
        } else if (i13 != 2) {
            float f55 = hVar.f7a / 100.0f;
            this.f123w = f55;
            this.f122v = hVar.f46h;
            float f56 = Float.isNaN(hVar.f47i) ? f55 : hVar.f47i;
            float f57 = Float.isNaN(hVar.f48j) ? f55 : hVar.f48j;
            float f58 = qVar2.A;
            float f59 = qVar.A;
            float f60 = f58 - f59;
            float f61 = qVar2.B;
            float f62 = qVar.B;
            float f63 = f61 - f62;
            this.f124x = this.f123w;
            float f64 = qVar.f125y;
            float f65 = qVar.f126z;
            float f66 = ((f58 / 2.0f) + qVar2.f125y) - ((f59 / 2.0f) + f64);
            float f67 = ((f61 / 2.0f) + qVar2.f126z) - ((f62 / 2.0f) + f65);
            float f68 = (f60 * f56) / 2.0f;
            this.f125y = (int) (((f66 * f55) + f64) - f68);
            float f69 = (f67 * f55) + f65;
            float f70 = (f63 * f57) / 2.0f;
            this.f126z = (int) (f69 - f70);
            this.A = (int) (f59 + f12);
            this.B = (int) (f62 + f13);
            float f71 = Float.isNaN(hVar.f49k) ? f55 : hVar.f49k;
            float f72 = Float.isNaN(hVar.f52n) ? 0.0f : hVar.f52n;
            f55 = Float.isNaN(hVar.f50l) ? f55 : hVar.f50l;
            if (Float.isNaN(hVar.f51m)) {
                i11 = 0;
                f14 = 0.0f;
            } else {
                f14 = hVar.f51m;
                i11 = 0;
            }
            this.I = i11;
            this.f125y = (int) (((f14 * f67) + ((f71 * f66) + qVar.f125y)) - f68);
            this.f126z = (int) (((f67 * f55) + ((f66 * f72) + qVar.f126z)) - f70);
            this.f121u = w.c.c(hVar.f);
            this.D = hVar.f45g;
        } else {
            float f73 = hVar.f7a / 100.0f;
            this.f123w = f73;
            this.f122v = hVar.f46h;
            float f74 = Float.isNaN(hVar.f47i) ? f73 : hVar.f47i;
            float f75 = Float.isNaN(hVar.f48j) ? f73 : hVar.f48j;
            float f76 = qVar2.A;
            float f77 = f76 - qVar.A;
            float f78 = qVar2.B;
            float f79 = f78 - qVar.B;
            this.f124x = this.f123w;
            float f80 = qVar.f125y;
            float f81 = qVar.f126z;
            float f82 = (f76 / 2.0f) + qVar2.f125y;
            float f83 = (f78 / 2.0f) + qVar2.f126z;
            float f84 = f77 * f74;
            this.f125y = (int) ((((f82 - ((f10 / 2.0f) + f80)) * f73) + f80) - (f84 / 2.0f));
            float f85 = f79 * f75;
            this.f126z = (int) ((((f83 - ((f11 / 2.0f) + f81)) * f73) + f81) - (f85 / 2.0f));
            this.A = (int) (f10 + f84);
            this.B = (int) (f11 + f85);
            this.I = 2;
            if (!Float.isNaN(hVar.f49k)) {
                this.f125y = (int) (hVar.f49k * ((int) (i6 - this.A)));
            }
            if (!Float.isNaN(hVar.f50l)) {
                this.f126z = (int) (hVar.f50l * ((int) (i10 - this.B)));
            }
            this.E = this.E;
            this.f121u = w.c.c(hVar.f);
            this.D = hVar.f45g;
        }
    }
}
