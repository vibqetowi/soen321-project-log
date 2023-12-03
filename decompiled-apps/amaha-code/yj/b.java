package yj;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.animation.LinearInterpolator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
/* compiled from: EmptyEffect.kt */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final long f38654d = TimeUnit.MILLISECONDS.toMillis(0);

    /* renamed from: e  reason: collision with root package name */
    public static final LinearInterpolator f38655e = new LinearInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public final long f38656a;

    /* renamed from: b  reason: collision with root package name */
    public final TimeInterpolator f38657b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38658c;

    public b() {
        LinearInterpolator interpolator = f38655e;
        i.g(interpolator, "interpolator");
        this.f38656a = f38654d;
        this.f38657b = interpolator;
        this.f38658c = 2;
    }

    @Override // yj.a
    public final TimeInterpolator a() {
        return this.f38657b;
    }

    @Override // yj.a
    public final void b(Canvas canvas, PointF point, Paint paint) {
        i.g(canvas, "canvas");
        i.g(point, "point");
        i.g(paint, "paint");
    }

    @Override // yj.a
    public final long getDuration() {
        return this.f38656a;
    }

    @Override // yj.a
    public final int r() {
        return this.f38658c;
    }
}
