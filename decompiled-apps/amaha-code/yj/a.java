package yj;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
/* compiled from: Effect.kt */
/* loaded from: classes.dex */
public interface a {
    TimeInterpolator a();

    void b(Canvas canvas, PointF pointF, Paint paint);

    long getDuration();

    int r();
}
