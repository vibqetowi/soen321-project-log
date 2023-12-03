package d3;

import java.util.List;
import s1.s;
/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class b extends f<Integer> {
    public b(List<n3.a<Integer>> list) {
        super(list);
    }

    @Override // d3.a
    public final Object g(n3.a aVar, float f) {
        return Integer.valueOf(k(aVar, f));
    }

    public final int k(n3.a<Integer> aVar, float f) {
        Integer num = aVar.f25862b;
        if (num != null && aVar.f25863c != null) {
            int intValue = num.intValue();
            int intValue2 = aVar.f25863c.intValue();
            s sVar = this.f12142e;
            if (sVar != null) {
                aVar.f.floatValue();
                Integer valueOf = Integer.valueOf(intValue);
                Integer valueOf2 = Integer.valueOf(intValue2);
                e();
                Integer num2 = (Integer) sVar.z(valueOf, valueOf2);
                if (num2 != null) {
                    return num2.intValue();
                }
            }
            return hc.d.u(m3.f.b(f, 0.0f, 1.0f), intValue, intValue2);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
