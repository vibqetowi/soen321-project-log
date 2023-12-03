package d3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import s1.s;
/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class h extends f<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f12155i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f12156j;

    /* renamed from: k  reason: collision with root package name */
    public g f12157k;

    /* renamed from: l  reason: collision with root package name */
    public final PathMeasure f12158l;

    public h(List<? extends n3.a<PointF>> list) {
        super(list);
        this.f12155i = new PointF();
        this.f12156j = new float[2];
        this.f12158l = new PathMeasure();
    }

    @Override // d3.a
    public final Object g(n3.a aVar, float f) {
        g gVar = (g) aVar;
        Path path = gVar.f12153o;
        if (path == null) {
            return (PointF) aVar.f25862b;
        }
        s sVar = this.f12142e;
        if (sVar != null) {
            gVar.f.floatValue();
            Object obj = gVar.f25863c;
            e();
            PointF pointF = (PointF) sVar.z(gVar.f25862b, obj);
            if (pointF != null) {
                return pointF;
            }
        }
        g gVar2 = this.f12157k;
        PathMeasure pathMeasure = this.f12158l;
        if (gVar2 != gVar) {
            pathMeasure.setPath(path, false);
            this.f12157k = gVar;
        }
        float[] fArr = this.f12156j;
        pathMeasure.getPosTan(pathMeasure.getLength() * f, fArr, null);
        PointF pointF2 = this.f12155i;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}
