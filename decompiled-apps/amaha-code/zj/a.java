package zj;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
/* compiled from: Circle.kt */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: d  reason: collision with root package name */
    public static final long f39407d = TimeUnit.MILLISECONDS.toMillis(500);

    /* renamed from: e  reason: collision with root package name */
    public static final DecelerateInterpolator f39408e = new DecelerateInterpolator(2.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f39409a;

    /* renamed from: b  reason: collision with root package name */
    public final long f39410b;

    /* renamed from: c  reason: collision with root package name */
    public final TimeInterpolator f39411c;

    public a(float f) {
        DecelerateInterpolator interpolator = f39408e;
        i.g(interpolator, "interpolator");
        this.f39409a = f;
        this.f39410b = f39407d;
        this.f39411c = interpolator;
    }

    @Override // zj.c
    public final TimeInterpolator a() {
        return this.f39411c;
    }

    @Override // zj.c
    public final void b(Canvas canvas, PointF point, float f, Paint paint) {
        i.g(canvas, "canvas");
        i.g(point, "point");
        i.g(paint, "paint");
        canvas.drawCircle(point.x, point.y, f * this.f39409a, paint);
    }

    @Override // zj.c
    public final long getDuration() {
        return this.f39410b;
    }
}
