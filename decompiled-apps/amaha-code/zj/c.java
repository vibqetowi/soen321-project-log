package zj;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
/* compiled from: Shape.kt */
/* loaded from: classes.dex */
public interface c {
    TimeInterpolator a();

    void b(Canvas canvas, PointF pointF, float f, Paint paint);

    long getDuration();
}
