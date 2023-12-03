package c3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import d3.a;
import java.util.ArrayList;
import java.util.List;
import s1.s;
/* compiled from: ContentGroup.java */
/* loaded from: classes.dex */
public final class c implements d, l, a.InterfaceC0183a, f3.f {

    /* renamed from: a  reason: collision with root package name */
    public final b3.a f4778a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f4779b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f4780c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f4781d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f4782e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4783g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f4784h;

    /* renamed from: i  reason: collision with root package name */
    public final a3.j f4785i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f4786j;

    /* renamed from: k  reason: collision with root package name */
    public final d3.l f4787k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(a3.j jVar, i3.b bVar, h3.l lVar) {
        this(jVar, bVar, r3, r4, r5, r6);
        g3.d dVar;
        String str = lVar.f17132a;
        boolean z10 = lVar.f17134c;
        List<h3.b> list = lVar.f17133b;
        ArrayList arrayList = new ArrayList(list.size());
        int i6 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            b a10 = list.get(i10).a(jVar, bVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        while (true) {
            if (i6 >= list.size()) {
                dVar = null;
                break;
            }
            h3.b bVar2 = list.get(i6);
            if (bVar2 instanceof g3.d) {
                dVar = (g3.d) bVar2;
                break;
            }
            i6++;
        }
    }

    @Override // f3.f
    public final void a(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
        String str = this.f;
        if (!eVar.c(i6, str)) {
            return;
        }
        if (!"__container".equals(str)) {
            eVar2.getClass();
            f3.e eVar3 = new f3.e(eVar2);
            eVar3.f14775a.add(str);
            if (eVar.a(i6, str)) {
                f3.e eVar4 = new f3.e(eVar3);
                eVar4.f14776b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (eVar.d(i6, str)) {
            int b10 = eVar.b(i6, str) + i6;
            int i10 = 0;
            while (true) {
                List<b> list = this.f4784h;
                if (i10 < list.size()) {
                    b bVar = list.get(i10);
                    if (bVar instanceof f3.f) {
                        ((f3.f) bVar).a(eVar, b10, arrayList, eVar2);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        this.f4785i.invalidateSelf();
    }

    @Override // c3.b
    public final void c(List<b> list, List<b> list2) {
        int size = list.size();
        List<b> list3 = this.f4784h;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            b bVar = list3.get(size2);
            bVar.c(arrayList, list3.subList(0, size2));
            arrayList.add(bVar);
        }
    }

    @Override // f3.f
    public final void d(s sVar, Object obj) {
        d3.l lVar = this.f4787k;
        if (lVar != null) {
            lVar.c(sVar, obj);
        }
    }

    @Override // c3.d
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f4780c;
        matrix2.set(matrix);
        d3.l lVar = this.f4787k;
        if (lVar != null) {
            matrix2.preConcat(lVar.d());
        }
        RectF rectF2 = this.f4782e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List<b> list = this.f4784h;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                b bVar = list.get(size);
                if (bVar instanceof d) {
                    ((d) bVar).e(rectF2, matrix2, z10);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    public final List<l> f() {
        if (this.f4786j == null) {
            this.f4786j = new ArrayList();
            int i6 = 0;
            while (true) {
                List<b> list = this.f4784h;
                if (i6 >= list.size()) {
                    break;
                }
                b bVar = list.get(i6);
                if (bVar instanceof l) {
                    this.f4786j.add((l) bVar);
                }
                i6++;
            }
        }
        return this.f4786j;
    }

    @Override // c3.d
    public final void g(Canvas canvas, Matrix matrix, int i6) {
        boolean z10;
        int intValue;
        if (this.f4783g) {
            return;
        }
        Matrix matrix2 = this.f4780c;
        matrix2.set(matrix);
        d3.l lVar = this.f4787k;
        if (lVar != null) {
            matrix2.preConcat(lVar.d());
            d3.a<Integer, Integer> aVar = lVar.f12172j;
            if (aVar == null) {
                intValue = 100;
            } else {
                intValue = aVar.f().intValue();
            }
            i6 = (int) ((((intValue / 100.0f) * i6) / 255.0f) * 255.0f);
        }
        boolean z11 = this.f4785i.J;
        boolean z12 = false;
        List<b> list = this.f4784h;
        if (z11) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 < list.size()) {
                    if ((list.get(i10) instanceof d) && (i11 = i11 + 1) >= 2) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10 && i6 != 255) {
                z12 = true;
            }
        }
        if (z12) {
            RectF rectF = this.f4779b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(rectF, matrix2, true);
            b3.a aVar2 = this.f4778a;
            aVar2.setAlpha(i6);
            m3.g.e(canvas, rectF, aVar2, 31);
        }
        if (z12) {
            i6 = 255;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof d) {
                ((d) bVar).g(canvas, matrix2, i6);
            }
        }
        if (z12) {
            canvas.restore();
        }
    }

    @Override // c3.b
    public final String getName() {
        return this.f;
    }

    @Override // c3.l
    public final Path getPath() {
        Matrix matrix = this.f4780c;
        matrix.reset();
        d3.l lVar = this.f4787k;
        if (lVar != null) {
            matrix.set(lVar.d());
        }
        Path path = this.f4781d;
        path.reset();
        if (this.f4783g) {
            return path;
        }
        List<b> list = this.f4784h;
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof l) {
                path.addPath(((l) bVar).getPath(), matrix);
            }
        }
        return path;
    }

    public c(a3.j jVar, i3.b bVar, String str, boolean z10, ArrayList arrayList, g3.d dVar) {
        this.f4778a = new b3.a();
        this.f4779b = new RectF();
        this.f4780c = new Matrix();
        this.f4781d = new Path();
        this.f4782e = new RectF();
        this.f = str;
        this.f4785i = jVar;
        this.f4783g = z10;
        this.f4784h = arrayList;
        if (dVar != null) {
            d3.l lVar = new d3.l(dVar);
            this.f4787k = lVar;
            lVar.a(bVar);
            lVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar2 = (b) arrayList.get(size);
            if (bVar2 instanceof i) {
                arrayList2.add((i) bVar2);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            }
            ((i) arrayList2.get(size2)).f(arrayList.listIterator(arrayList.size()));
        }
    }
}
