package d3;

import android.graphics.PointF;
import java.util.List;
import s1.s;
/* compiled from: IntegerKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class e extends f<Integer> {
    public e(List<n3.a<Integer>> list) {
        super(list);
    }

    @Override // d3.a
    public final Object g(n3.a aVar, float f) {
        return Integer.valueOf(k(aVar, f));
    }

    public final int k(n3.a<Integer> aVar, float f) {
        if (aVar.f25862b != null && aVar.f25863c != null) {
            s sVar = this.f12142e;
            Integer num = aVar.f25862b;
            if (sVar != null) {
                aVar.f.floatValue();
                Integer num2 = aVar.f25863c;
                e();
                Integer num3 = (Integer) sVar.z(num, num2);
                if (num3 != null) {
                    return num3.intValue();
                }
            }
            if (aVar.f25868i == 784923401) {
                aVar.f25868i = num.intValue();
            }
            int i6 = aVar.f25868i;
            if (aVar.f25869j == 784923401) {
                aVar.f25869j = aVar.f25863c.intValue();
            }
            int i10 = aVar.f25869j;
            PointF pointF = m3.f.f24798a;
            return (int) ((f * (i10 - i6)) + i6);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
