package zj;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.animation.DecelerateInterpolator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
/* compiled from: RoundedRectangle.kt */
/* loaded from: classes.dex */
public final class b implements c {
    public static final long f = TimeUnit.MILLISECONDS.toMillis(500);

    /* renamed from: g  reason: collision with root package name */
    public static final DecelerateInterpolator f39412g = new DecelerateInterpolator(2.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f39413a;

    /* renamed from: b  reason: collision with root package name */
    public final float f39414b;

    /* renamed from: c  reason: collision with root package name */
    public final float f39415c;

    /* renamed from: d  reason: collision with root package name */
    public final long f39416d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f39417e;

    public b(float f2, float f10, float f11) {
        DecelerateInterpolator interpolator = f39412g;
        i.g(interpolator, "interpolator");
        this.f39413a = f2;
        this.f39414b = f10;
        this.f39415c = f11;
        this.f39416d = f;
        this.f39417e = interpolator;
    }

    @Override // zj.c
    public final TimeInterpolator a() {
        return this.f39417e;
    }

    @Override // zj.c
    public final void b(Canvas canvas, PointF point, float f2, Paint paint) {
        i.g(canvas, "canvas");
        i.g(point, "point");
        i.g(paint, "paint");
        float f10 = 2;
        float f11 = (this.f39414b / f10) * f2;
        float f12 = (this.f39413a / f10) * f2;
        float f13 = point.x;
        float f14 = point.y;
        RectF rectF = new RectF(f13 - f11, f14 - f12, f13 + f11, f14 + f12);
        float f15 = this.f39415c;
        canvas.drawRoundRect(rectF, f15, f15, paint);
    }

    @Override // zj.c
    public final long getDuration() {
        return this.f39416d;
    }
}
