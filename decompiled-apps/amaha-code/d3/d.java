package d3;

import android.graphics.PointF;
import java.util.List;
import s1.s;
/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f12151i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f12152j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i6, List list) {
        super(list);
        this.f12151i = i6;
        if (i6 != 1) {
            if (i6 != 2) {
                h3.c cVar = (h3.c) ((n3.a) list.get(0)).f25862b;
                int length = cVar != null ? cVar.f17084b.length : 0;
                this.f12152j = new h3.c(new float[length], new int[length]);
                return;
            }
            super(list);
            this.f12152j = new n3.c();
            return;
        }
        super(list);
        this.f12152j = new PointF();
    }

    @Override // d3.a
    public final Object g(n3.a aVar, float f) {
        T t3;
        T t10;
        int i6 = this.f12151i;
        Object obj = this.f12152j;
        switch (i6) {
            case 0:
                h3.c cVar = (h3.c) obj;
                h3.c cVar2 = (h3.c) aVar.f25862b;
                h3.c cVar3 = (h3.c) aVar.f25863c;
                cVar.getClass();
                int[] iArr = cVar2.f17084b;
                int length = iArr.length;
                int[] iArr2 = cVar3.f17084b;
                if (length == iArr2.length) {
                    for (int i10 = 0; i10 < iArr.length; i10++) {
                        float f2 = cVar2.f17083a[i10];
                        float f10 = cVar3.f17083a[i10];
                        PointF pointF = m3.f.f24798a;
                        cVar.f17083a[i10] = defpackage.e.e(f10, f2, f, f2);
                        cVar.f17084b[i10] = hc.d.u(f, iArr[i10], iArr2[i10]);
                    }
                    return cVar;
                }
                StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                sb2.append(iArr.length);
                sb2.append(" vs ");
                throw new IllegalArgumentException(pl.a.g(sb2, iArr2.length, ")"));
            case 1:
                T t11 = aVar.f25862b;
                if (t11 != 0 && (t10 = aVar.f25863c) != 0) {
                    PointF pointF2 = (PointF) t11;
                    PointF pointF3 = (PointF) t10;
                    s sVar = this.f12142e;
                    if (sVar != null) {
                        aVar.f.floatValue();
                        e();
                        PointF pointF4 = (PointF) sVar.z(pointF2, pointF3);
                        if (pointF4 != null) {
                            return pointF4;
                        }
                    }
                    PointF pointF5 = (PointF) obj;
                    float f11 = pointF2.x;
                    float e10 = defpackage.e.e(pointF3.x, f11, f, f11);
                    float f12 = pointF2.y;
                    pointF5.set(e10, ((pointF3.y - f12) * f) + f12);
                    return pointF5;
                }
                throw new IllegalStateException("Missing values for keyframe.");
            default:
                T t12 = aVar.f25862b;
                if (t12 != 0 && (t3 = aVar.f25863c) != 0) {
                    n3.c cVar4 = (n3.c) t12;
                    n3.c cVar5 = (n3.c) t3;
                    s sVar2 = this.f12142e;
                    if (sVar2 != null) {
                        aVar.f.floatValue();
                        e();
                        n3.c cVar6 = (n3.c) sVar2.z(cVar4, cVar5);
                        if (cVar6 != null) {
                            return cVar6;
                        }
                    }
                    n3.c cVar7 = (n3.c) obj;
                    float f13 = cVar4.f25876a;
                    float f14 = cVar5.f25876a;
                    PointF pointF6 = m3.f.f24798a;
                    float e11 = defpackage.e.e(f14, f13, f, f13);
                    float f15 = cVar4.f25877b;
                    float e12 = defpackage.e.e(cVar5.f25877b, f15, f, f15);
                    cVar7.f25876a = e11;
                    cVar7.f25877b = e12;
                    return cVar7;
                }
                throw new IllegalStateException("Missing values for keyframe.");
        }
    }
}
