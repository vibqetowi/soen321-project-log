package t6;

import java.util.ArrayList;
import q6.i;
import r6.j;
import u6.b;
/* compiled from: ChartHighlighter.java */
/* loaded from: classes.dex */
public class b<T extends u6.b> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final T f32417a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f32418b = new ArrayList();

    public b(T t3) {
        this.f32417a = t3;
    }

    public static float f(ArrayList arrayList, float f, i.a aVar) {
        float f2 = Float.MAX_VALUE;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            c cVar = (c) arrayList.get(i6);
            if (cVar.f32425h == aVar) {
                float abs = Math.abs(cVar.f32422d - f);
                if (abs < f2) {
                    f2 = abs;
                }
            }
        }
        return f2;
    }

    @Override // t6.d
    public c a(float f, float f2) {
        y6.b b10 = this.f32417a.c(i.a.LEFT).b(f, f2);
        y6.b.c(b10);
        return e((float) b10.f38273b, f, f2);
    }

    public ArrayList b(v6.d dVar, int i6, float f) {
        j k10;
        ArrayList arrayList = new ArrayList();
        ArrayList<j> Q = dVar.Q(f);
        if (Q.size() == 0 && (k10 = dVar.k(f, Float.NaN)) != null) {
            Q = dVar.Q(k10.b());
        }
        if (Q.size() == 0) {
            return arrayList;
        }
        for (j jVar : Q) {
            y6.b a10 = this.f32417a.c(dVar.a0()).a(jVar.b(), jVar.a());
            arrayList.add(new c(jVar.b(), jVar.a(), (float) a10.f38273b, (float) a10.f38274c, i6, dVar.a0()));
        }
        return arrayList;
    }

    public r6.d c() {
        return this.f32417a.getData();
    }

    public float d(float f, float f2, float f10, float f11) {
        return (float) Math.hypot(f - f10, f2 - f11);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [v6.d] */
    public final c e(float f, float f2, float f10) {
        ArrayList arrayList = this.f32418b;
        arrayList.clear();
        r6.d c10 = c();
        if (c10 != null) {
            int c11 = c10.c();
            for (int i6 = 0; i6 < c11; i6++) {
                ?? b10 = c10.b(i6);
                if (b10.f0()) {
                    arrayList.addAll(b(b10, i6, f));
                }
            }
        }
        c cVar = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        i.a aVar = i.a.LEFT;
        float f11 = f(arrayList, f10, aVar);
        i.a aVar2 = i.a.RIGHT;
        if (f11 >= f(arrayList, f10, aVar2)) {
            aVar = aVar2;
        }
        float maxHighlightDistance = this.f32417a.getMaxHighlightDistance();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar2 = (c) arrayList.get(i10);
            if (cVar2.f32425h == aVar) {
                float d10 = d(f2, f10, cVar2.f32421c, cVar2.f32422d);
                if (d10 < maxHighlightDistance) {
                    cVar = cVar2;
                    maxHighlightDistance = d10;
                }
            }
        }
        return cVar;
    }
}
