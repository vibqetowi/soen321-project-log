package m3;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import java.io.Closeable;
/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final PathMeasure f24799a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public static final Path f24800b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public static final Path f24801c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f24802d = new float[4];

    /* renamed from: e  reason: collision with root package name */
    public static final float f24803e = (float) (Math.sqrt(2.0d) / 2.0d);
    public static float f = -1.0f;

    public static void a(Path path, float f2, float f10, float f11) {
        PathMeasure pathMeasure = f24799a;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 == 1.0f && f10 == 0.0f) {
            hc.d.s();
        } else if (length >= 1.0f && Math.abs((f10 - f2) - 1.0f) >= 0.01d) {
            float f12 = f2 * length;
            float f13 = f10 * length;
            float f14 = f11 * length;
            float min = Math.min(f12, f13) + f14;
            float max = Math.max(f12, f13) + f14;
            if (min >= length && max >= length) {
                min = f.c(min, length);
                max = f.c(max, length);
            }
            if (min < 0.0f) {
                min = f.c(min, length);
            }
            if (max < 0.0f) {
                max = f.c(max, length);
            }
            int i6 = (min > max ? 1 : (min == max ? 0 : -1));
            if (i6 == 0) {
                path.reset();
                hc.d.s();
                return;
            }
            if (i6 >= 0) {
                min -= length;
            }
            Path path2 = f24800b;
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            Path path3 = f24801c;
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            hc.d.s();
        } else {
            hc.d.s();
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        if (f == -1.0f) {
            f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f;
    }

    public static float d(Matrix matrix) {
        float[] fArr = f24802d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = f24803e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void e(Canvas canvas, RectF rectF, Paint paint, int i6) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i6);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        hc.d.s();
    }
}
