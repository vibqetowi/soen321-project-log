package y6;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import i5.n;
/* compiled from: Utils.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static DisplayMetrics f38290a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f38291b = 50;

    /* renamed from: c  reason: collision with root package name */
    public static int f38292c = 8000;

    /* renamed from: d  reason: collision with root package name */
    public static final float f38293d;

    /* renamed from: e  reason: collision with root package name */
    public static final Rect f38294e;
    public static final Paint.FontMetrics f;

    /* renamed from: g  reason: collision with root package name */
    public static final Rect f38295g;

    /* renamed from: h  reason: collision with root package name */
    public static final n f38296h;

    /* renamed from: i  reason: collision with root package name */
    public static final Rect f38297i;

    /* renamed from: j  reason: collision with root package name */
    public static final Paint.FontMetrics f38298j;

    static {
        Double.longBitsToDouble(1L);
        f38293d = Float.intBitsToFloat(1);
        f38294e = new Rect();
        f = new Paint.FontMetrics();
        f38295g = new Rect();
        f38296h = new n(1, 1);
        new Rect();
        f38297i = new Rect();
        f38298j = new Paint.FontMetrics();
    }

    public static int a(Paint paint, String str) {
        Rect rect = f38294e;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static a b(Paint paint, String str) {
        a b10 = a.b(0.0f, 0.0f);
        Rect rect = f38295g;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        b10.f38270b = rect.width();
        b10.f38271c = rect.height();
        return b10;
    }

    public static float c(float f2) {
        DisplayMetrics displayMetrics = f38290a;
        if (displayMetrics == null) {
            Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
            return f2;
        }
        return f2 * displayMetrics.density;
    }

    public static void d(c cVar, float f2, float f10, c cVar2) {
        double d10 = f2;
        double d11 = f10;
        cVar2.f38276b = (float) ((Math.cos(Math.toRadians(d11)) * d10) + cVar.f38276b);
        cVar2.f38277c = (float) ((Math.sin(Math.toRadians(d11)) * d10) + cVar.f38277c);
    }

    public static a e(float f2, float f10) {
        double d10 = 0.0f;
        return a.b(Math.abs(((float) Math.sin(d10)) * f10) + Math.abs(((float) Math.cos(d10)) * f2), Math.abs(f10 * ((float) Math.cos(d10))) + Math.abs(f2 * ((float) Math.sin(d10))));
    }

    public static double f(double d10) {
        long j10;
        if (d10 == Double.POSITIVE_INFINITY) {
            return d10;
        }
        double d11 = d10 + 0.0d;
        long doubleToRawLongBits = Double.doubleToRawLongBits(d11);
        if (d11 >= 0.0d) {
            j10 = 1;
        } else {
            j10 = -1;
        }
        return Double.longBitsToDouble(doubleToRawLongBits + j10);
    }

    public static float g(double d10) {
        double d11;
        if (!Double.isInfinite(d10) && !Double.isNaN(d10) && d10 != 0.0d) {
            if (d10 < 0.0d) {
                d11 = -d10;
            } else {
                d11 = d10;
            }
            float pow = (float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d11))));
            return ((float) Math.round(d10 * pow)) / pow;
        }
        return 0.0f;
    }
}
