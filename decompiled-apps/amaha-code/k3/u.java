package k3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import l3.c;
/* compiled from: ShapeDataParser.java */
/* loaded from: classes.dex */
public final class u implements a0<h3.j> {

    /* renamed from: u  reason: collision with root package name */
    public static final u f22809u = new u();

    /* renamed from: v  reason: collision with root package name */
    public static final c.a f22810v = c.a.a("c", "v", "i", "o");

    @Override // k3.a0
    public final h3.j W(l3.c cVar, float f) {
        if (cVar.J() == 1) {
            cVar.a();
        }
        cVar.e();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (cVar.m()) {
            int R = cVar.R(f22810v);
            if (R != 0) {
                if (R != 1) {
                    if (R != 2) {
                        if (R != 3) {
                            cVar.c0();
                            cVar.e0();
                        } else {
                            arrayList3 = l.c(cVar, f);
                        }
                    } else {
                        arrayList2 = l.c(cVar, f);
                    }
                } else {
                    arrayList = l.c(cVar, f);
                }
            } else {
                z10 = cVar.o();
            }
        }
        cVar.h();
        if (cVar.J() == 2) {
            cVar.g();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new h3.j(new PointF(), false, Collections.emptyList());
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i6 = 1; i6 < size; i6++) {
                PointF pointF2 = (PointF) arrayList.get(i6);
                int i10 = i6 - 1;
                arrayList4.add(new f3.a(m3.f.a((PointF) arrayList.get(i10), (PointF) arrayList3.get(i10)), m3.f.a(pointF2, (PointF) arrayList2.get(i6)), pointF2));
            }
            if (z10) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i11 = size - 1;
                arrayList4.add(new f3.a(m3.f.a((PointF) arrayList.get(i11), (PointF) arrayList3.get(i11)), m3.f.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new h3.j(pointF, z10, arrayList4);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
