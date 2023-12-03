package d3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
/* compiled from: PathKeyframe.java */
/* loaded from: classes.dex */
public final class g extends n3.a<PointF> {

    /* renamed from: o  reason: collision with root package name */
    public Path f12153o;

    /* renamed from: p  reason: collision with root package name */
    public final n3.a<PointF> f12154p;

    public g(a3.c cVar, n3.a<PointF> aVar) {
        super(cVar, aVar.f25862b, aVar.f25863c, aVar.f25864d, aVar.f25865e, aVar.f);
        this.f12154p = aVar;
        d();
    }

    public final void d() {
        boolean z10;
        T t3 = this.f25863c;
        T t10 = this.f25862b;
        if (t3 != 0 && t10 != 0 && ((PointF) t10).equals(((PointF) t3).x, ((PointF) t3).y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        T t11 = this.f25863c;
        if (t11 != 0 && !z10) {
            PointF pointF = (PointF) t10;
            PointF pointF2 = (PointF) t11;
            n3.a<PointF> aVar = this.f12154p;
            PointF pointF3 = aVar.f25872m;
            PointF pointF4 = aVar.f25873n;
            PathMeasure pathMeasure = m3.g.f24799a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
                float f = pointF.x;
                float f2 = pointF2.x;
                float f10 = pointF2.y;
                path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f10 + pointF4.y, f2, f10);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.f12153o = path;
        }
    }
}
