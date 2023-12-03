package k3;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import l3.c;
/* compiled from: KeyframeParser.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static t.i<WeakReference<Interpolator>> f22795b;

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f22794a = new LinearInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f22796c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    public static <T> n3.a<T> a(l3.c cVar, a3.c cVar2, float f, a0<T> a0Var, boolean z10) {
        LinearInterpolator linearInterpolator;
        T t3;
        int i6;
        WeakReference weakReference;
        if (z10) {
            cVar.e();
            Interpolator interpolator = null;
            PointF pointF = null;
            PointF pointF2 = null;
            T t10 = null;
            T t11 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            boolean z11 = false;
            float f2 = 0.0f;
            while (cVar.m()) {
                switch (cVar.R(f22796c)) {
                    case 0:
                        f2 = (float) cVar.s();
                        break;
                    case 1:
                        t11 = a0Var.W(cVar, f);
                        break;
                    case 2:
                        t10 = a0Var.W(cVar, f);
                        break;
                    case 3:
                        pointF = l.b(cVar, f);
                        break;
                    case 4:
                        pointF2 = l.b(cVar, f);
                        break;
                    case 5:
                        if (cVar.G() == 1) {
                            z11 = true;
                            break;
                        } else {
                            z11 = false;
                            break;
                        }
                    case 6:
                        pointF4 = l.b(cVar, f);
                        break;
                    case 7:
                        pointF3 = l.b(cVar, f);
                        break;
                    default:
                        cVar.e0();
                        break;
                }
            }
            cVar.h();
            if (z11) {
                linearInterpolator = f22794a;
                t3 = t11;
            } else {
                if (pointF != null && pointF2 != null) {
                    float f10 = -f;
                    pointF.x = m3.f.b(pointF.x, f10, f);
                    pointF.y = m3.f.b(pointF.y, -100.0f, 100.0f);
                    pointF2.x = m3.f.b(pointF2.x, f10, f);
                    float b10 = m3.f.b(pointF2.y, -100.0f, 100.0f);
                    pointF2.y = b10;
                    float f11 = pointF.x;
                    float f12 = pointF.y;
                    float f13 = pointF2.x;
                    PathMeasure pathMeasure = m3.g.f24799a;
                    if (f11 != 0.0f) {
                        i6 = (int) (527 * f11);
                    } else {
                        i6 = 17;
                    }
                    if (f12 != 0.0f) {
                        i6 = (int) (i6 * 31 * f12);
                    }
                    if (f13 != 0.0f) {
                        i6 = (int) (i6 * 31 * f13);
                    }
                    if (b10 != 0.0f) {
                        i6 = (int) (i6 * 31 * b10);
                    }
                    synchronized (m.class) {
                        if (f22795b == null) {
                            f22795b = new t.i<>();
                        }
                        weakReference = (WeakReference) f22795b.d(i6, null);
                    }
                    if (weakReference != null) {
                        interpolator = (Interpolator) weakReference.get();
                    }
                    if (weakReference == null || interpolator == null) {
                        interpolator = v0.a.b(pointF.x / f, pointF.y / f, pointF2.x / f, pointF2.y / f);
                        try {
                            b(i6, new WeakReference(interpolator));
                        } catch (ArrayIndexOutOfBoundsException unused) {
                        }
                    }
                } else {
                    interpolator = f22794a;
                }
                linearInterpolator = interpolator;
                t3 = t10;
            }
            n3.a<T> aVar = new n3.a<>(cVar2, t11, t3, linearInterpolator, f2, null);
            aVar.f25872m = pointF4;
            aVar.f25873n = pointF3;
            return aVar;
        }
        return new n3.a<>(a0Var.W(cVar, f));
    }

    public static void b(int i6, WeakReference<Interpolator> weakReference) {
        synchronized (m.class) {
            f22795b.e(i6, weakReference);
        }
    }
}
