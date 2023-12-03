package d3;

import android.graphics.PointF;
import java.util.List;
import s1.s;
/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class c extends f<Float> {
    public c(List<n3.a<Float>> list) {
        super(list);
    }

    @Override // d3.a
    public final Object g(n3.a aVar, float f) {
        return Float.valueOf(l(aVar, f));
    }

    public final float k() {
        return l(b(), d());
    }

    public final float l(n3.a<Float> aVar, float f) {
        if (aVar.f25862b != null && aVar.f25863c != null) {
            s sVar = this.f12142e;
            Float f2 = aVar.f25862b;
            if (sVar != null) {
                aVar.f.floatValue();
                Float f10 = aVar.f25863c;
                e();
                Float f11 = (Float) sVar.z(f2, f10);
                if (f11 != null) {
                    return f11.floatValue();
                }
            }
            if (aVar.f25866g == -3987645.8f) {
                aVar.f25866g = f2.floatValue();
            }
            float f12 = aVar.f25866g;
            if (aVar.f25867h == -3987645.8f) {
                aVar.f25867h = aVar.f25863c.floatValue();
            }
            float f13 = aVar.f25867h;
            PointF pointF = m3.f.f24798a;
            return defpackage.e.e(f13, f12, f, f12);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
