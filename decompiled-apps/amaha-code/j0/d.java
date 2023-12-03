package j0;

import android.graphics.Color;
/* compiled from: ColorUtils.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<double[]> f21621a = new ThreadLocal<>();

    public static void a(int i6, int i10, int i11, float[] fArr) {
        float f;
        float abs;
        float min;
        float min2;
        float f2 = i6 / 255.0f;
        float f10 = i10 / 255.0f;
        float f11 = i11 / 255.0f;
        float max = Math.max(f2, Math.max(f10, f11));
        float min3 = Math.min(f2, Math.min(f10, f11));
        float f12 = max - min3;
        float f13 = (max + min3) / 2.0f;
        float f14 = 0.0f;
        if (max == min3) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f2) {
                f = ((f10 - f11) / f12) % 6.0f;
            } else if (max == f10) {
                f = ((f11 - f2) / f12) + 2.0f;
            } else {
                f = 4.0f + ((f2 - f10) / f12);
            }
            abs = f12 / (1.0f - Math.abs((2.0f * f13) - 1.0f));
        }
        float f15 = (f * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        if (f15 < 0.0f) {
            min = 0.0f;
        } else {
            min = Math.min(f15, 360.0f);
        }
        fArr[0] = min;
        if (abs < 0.0f) {
            min2 = 0.0f;
        } else {
            min2 = Math.min(abs, 1.0f);
        }
        fArr[1] = min2;
        if (f13 >= 0.0f) {
            f14 = Math.min(f13, 1.0f);
        }
        fArr[2] = f14;
    }

    public static int b(double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        int min;
        int min2;
        double d16 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d17 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d18 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        if (d17 > 0.0031308d) {
            d14 = (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d14 = d17 * 12.92d;
        }
        if (d18 > 0.0031308d) {
            d15 = (Math.pow(d18, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d15 = d18 * 12.92d;
        }
        int round = (int) Math.round(d13 * 255.0d);
        int i6 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d14 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d15 * 255.0d);
        if (round3 >= 0) {
            i6 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i6);
    }

    public static double c(int i6, int i10) {
        if (Color.alpha(i10) == 255) {
            if (Color.alpha(i6) < 255) {
                i6 = f(i6, i10);
            }
            double d10 = d(i6) + 0.05d;
            double d11 = d(i10) + 0.05d;
            return Math.max(d10, d11) / Math.min(d10, d11);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
    }

    public static double d(int i6) {
        double pow;
        double pow2;
        double pow3;
        ThreadLocal<double[]> threadLocal = f21621a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i6);
        int green = Color.green(i6);
        int blue = Color.blue(i6);
        if (dArr.length == 3) {
            double d10 = red / 255.0d;
            if (d10 < 0.04045d) {
                pow = d10 / 12.92d;
            } else {
                pow = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            }
            double d11 = green / 255.0d;
            if (d11 < 0.04045d) {
                pow2 = d11 / 12.92d;
            } else {
                pow2 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            }
            double d12 = blue / 255.0d;
            if (d12 < 0.04045d) {
                pow3 = d12 / 12.92d;
            } else {
                pow3 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d13;
            double d14 = pow3 * 0.9505d;
            dArr[2] = (d14 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return d13 / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int e(float f, int i6, int i10) {
        int i11 = 255;
        if (Color.alpha(i10) == 255) {
            double d10 = f;
            if (c(h(i6, 255), i10) < d10) {
                return -1;
            }
            int i12 = 0;
            for (int i13 = 0; i13 <= 10 && i11 - i12 > 1; i13++) {
                int i14 = (i12 + i11) / 2;
                if (c(h(i6, i14), i10) < d10) {
                    i12 = i14;
                } else {
                    i11 = i14;
                }
            }
            return i11;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
    }

    public static int f(int i6, int i10) {
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i6);
        int i11 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i11, g(Color.red(i6), alpha2, Color.red(i10), alpha, i11), g(Color.green(i6), alpha2, Color.green(i10), alpha, i11), g(Color.blue(i6), alpha2, Color.blue(i10), alpha, i11));
    }

    public static int g(int i6, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((255 - i10) * (i11 * i12)) + ((i6 * 255) * i10)) / (i13 * 255);
    }

    public static int h(int i6, int i10) {
        if (i10 >= 0 && i10 <= 255) {
            return (i6 & 16777215) | (i10 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
