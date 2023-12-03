package d3;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class i extends a<h3.j, Path> {

    /* renamed from: i  reason: collision with root package name */
    public final h3.j f12159i;

    /* renamed from: j  reason: collision with root package name */
    public final Path f12160j;

    public i(List<n3.a<h3.j>> list) {
        super(list);
        this.f12159i = new h3.j();
        this.f12160j = new Path();
    }

    @Override // d3.a
    public final Path g(n3.a<h3.j> aVar, float f) {
        boolean z10;
        h3.j jVar = aVar.f25862b;
        h3.j jVar2 = aVar.f25863c;
        h3.j jVar3 = this.f12159i;
        if (jVar3.f17125b == null) {
            jVar3.f17125b = new PointF();
        }
        if (!jVar.f17126c && !jVar2.f17126c) {
            z10 = false;
        } else {
            z10 = true;
        }
        jVar3.f17126c = z10;
        ArrayList arrayList = jVar.f17124a;
        int size = arrayList.size();
        int size2 = jVar2.f17124a.size();
        ArrayList arrayList2 = jVar2.f17124a;
        if (size != size2) {
            m3.c.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = jVar3.f17124a;
        if (arrayList3.size() < min) {
            for (int size3 = arrayList3.size(); size3 < min; size3++) {
                arrayList3.add(new f3.a());
            }
        } else if (arrayList3.size() > min) {
            for (int size4 = arrayList3.size() - 1; size4 >= min; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = jVar.f17125b;
        PointF pointF2 = jVar2.f17125b;
        float f2 = pointF.x;
        float f10 = pointF2.x;
        PointF pointF3 = m3.f.f24798a;
        float e10 = defpackage.e.e(f10, f2, f, f2);
        float f11 = pointF.y;
        float e11 = defpackage.e.e(pointF2.y, f11, f, f11);
        if (jVar3.f17125b == null) {
            jVar3.f17125b = new PointF();
        }
        jVar3.f17125b.set(e10, e11);
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            f3.a aVar2 = (f3.a) arrayList.get(size5);
            f3.a aVar3 = (f3.a) arrayList2.get(size5);
            PointF pointF4 = aVar2.f14755a;
            PointF pointF5 = aVar3.f14755a;
            float f12 = pointF4.x;
            float e12 = defpackage.e.e(pointF5.x, f12, f, f12);
            float f13 = pointF4.y;
            ((f3.a) arrayList3.get(size5)).f14755a.set(e12, defpackage.e.e(pointF5.y, f13, f, f13));
            PointF pointF6 = aVar2.f14756b;
            float f14 = pointF6.x;
            PointF pointF7 = aVar3.f14756b;
            float e13 = defpackage.e.e(pointF7.x, f14, f, f14);
            float f15 = pointF6.y;
            ((f3.a) arrayList3.get(size5)).f14756b.set(e13, defpackage.e.e(pointF7.y, f15, f, f15));
            PointF pointF8 = aVar2.f14757c;
            float f16 = pointF8.x;
            PointF pointF9 = aVar3.f14757c;
            float e14 = defpackage.e.e(pointF9.x, f16, f, f16);
            float f17 = pointF8.y;
            ((f3.a) arrayList3.get(size5)).f14757c.set(e14, defpackage.e.e(pointF9.y, f17, f, f17));
        }
        Path path = this.f12160j;
        path.reset();
        PointF pointF10 = jVar3.f17125b;
        path.moveTo(pointF10.x, pointF10.y);
        PointF pointF11 = m3.f.f24798a;
        pointF11.set(pointF10.x, pointF10.y);
        for (int i6 = 0; i6 < arrayList3.size(); i6++) {
            f3.a aVar4 = (f3.a) arrayList3.get(i6);
            PointF pointF12 = aVar4.f14755a;
            boolean equals = pointF12.equals(pointF11);
            PointF pointF13 = aVar4.f14756b;
            PointF pointF14 = aVar4.f14757c;
            if (equals && pointF13.equals(pointF14)) {
                path.lineTo(pointF14.x, pointF14.y);
            } else {
                path.cubicTo(pointF12.x, pointF12.y, pointF13.x, pointF13.y, pointF14.x, pointF14.y);
            }
            pointF11.set(pointF14.x, pointF14.y);
        }
        if (jVar3.f17126c) {
            path.close();
        }
        return path;
    }
}
