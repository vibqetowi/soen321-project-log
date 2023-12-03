package w;

import java.io.PrintStream;
import java.util.Arrays;
/* compiled from: Easing.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f36202b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f36203c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a  reason: collision with root package name */
    public String f36204a = "identity";

    /* compiled from: Easing.java */
    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: d  reason: collision with root package name */
        public final double f36205d;

        /* renamed from: e  reason: collision with root package name */
        public final double f36206e;
        public final double f;

        /* renamed from: g  reason: collision with root package name */
        public final double f36207g;

        public a(String str) {
            this.f36204a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f36205d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i6 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i6);
            this.f36206e = Double.parseDouble(str.substring(i6, indexOf3).trim());
            int i10 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i10);
            this.f = Double.parseDouble(str.substring(i10, indexOf4).trim());
            int i11 = indexOf4 + 1;
            this.f36207g = Double.parseDouble(str.substring(i11, str.indexOf(41, i11)).trim());
        }

        @Override // w.c
        public final double a(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > 0.01d) {
                d11 *= 0.5d;
                if (d(d12) < d10) {
                    d12 += d11;
                } else {
                    d12 -= d11;
                }
            }
            double d13 = d12 - d11;
            double d14 = d(d13);
            double d15 = d12 + d11;
            double d16 = d(d15);
            double e10 = e(d13);
            return (((d10 - d14) * (e(d15) - e10)) / (d16 - d14)) + e10;
        }

        @Override // w.c
        public final double b(double d10) {
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > 1.0E-4d) {
                d11 *= 0.5d;
                if (d(d12) < d10) {
                    d12 += d11;
                } else {
                    d12 -= d11;
                }
            }
            double d13 = d12 - d11;
            double d14 = d(d13);
            double d15 = d12 + d11;
            return (e(d15) - e(d13)) / (d(d15) - d14);
        }

        public final double d(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            double d13 = d11 * d12 * d10;
            double d14 = d12 * d10 * d10;
            return (this.f * d14) + (this.f36205d * d13) + (d10 * d10 * d10);
        }

        public final double e(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            double d13 = d11 * d12 * d10;
            double d14 = d12 * d10 * d10;
            return (this.f36207g * d14) + (this.f36206e * d13) + (d10 * d10 * d10);
        }
    }

    public static c c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new m(str);
        }
        if (str.startsWith("Schlick")) {
            return new j(str);
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c10 = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new a("cubic(1, 1, 0, 0)");
            case 4:
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                printStream.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f36203c));
                return f36202b;
        }
    }

    public double b(double d10) {
        return 1.0d;
    }

    public final String toString() {
        return this.f36204a;
    }

    public double a(double d10) {
        return d10;
    }
}
