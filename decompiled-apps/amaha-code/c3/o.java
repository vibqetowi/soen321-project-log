package c3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import d3.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import s1.s;
/* compiled from: RepeaterContent.java */
/* loaded from: classes.dex */
public final class o implements d, l, i, a.InterfaceC0183a, j {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f4857a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Path f4858b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final a3.j f4859c;

    /* renamed from: d  reason: collision with root package name */
    public final i3.b f4860d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4861e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final d3.c f4862g;

    /* renamed from: h  reason: collision with root package name */
    public final d3.c f4863h;

    /* renamed from: i  reason: collision with root package name */
    public final d3.l f4864i;

    /* renamed from: j  reason: collision with root package name */
    public c f4865j;

    public o(a3.j jVar, i3.b bVar, h3.i iVar) {
        this.f4859c = jVar;
        this.f4860d = bVar;
        this.f4861e = iVar.f17120b;
        this.f = iVar.f17122d;
        d3.a<Float, Float> k10 = iVar.f17121c.k();
        this.f4862g = (d3.c) k10;
        bVar.f(k10);
        k10.a(this);
        d3.a<Float, Float> k11 = ((g3.b) iVar.f17123e).k();
        this.f4863h = (d3.c) k11;
        bVar.f(k11);
        k11.a(this);
        g3.d dVar = (g3.d) iVar.f;
        dVar.getClass();
        d3.l lVar = new d3.l(dVar);
        this.f4864i = lVar;
        lVar.a(bVar);
        lVar.b(this);
    }

    @Override // f3.f
    public final void a(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
        m3.f.d(eVar, i6, arrayList, eVar2, this);
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        this.f4859c.invalidateSelf();
    }

    @Override // c3.b
    public final void c(List<b> list, List<b> list2) {
        this.f4865j.c(list, list2);
    }

    @Override // f3.f
    public final void d(s sVar, Object obj) {
        if (this.f4864i.c(sVar, obj)) {
            return;
        }
        if (obj == a3.o.f259q) {
            this.f4862g.j(sVar);
        } else if (obj == a3.o.r) {
            this.f4863h.j(sVar);
        }
    }

    @Override // c3.d
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f4865j.e(rectF, matrix, z10);
    }

    @Override // c3.i
    public final void f(ListIterator<b> listIterator) {
        if (this.f4865j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f4865j = new c(this.f4859c, this.f4860d, "Repeater", this.f, arrayList, null);
    }

    @Override // c3.d
    public final void g(Canvas canvas, Matrix matrix, int i6) {
        float floatValue = this.f4862g.f().floatValue();
        float floatValue2 = this.f4863h.f().floatValue();
        d3.l lVar = this.f4864i;
        float floatValue3 = lVar.f12175m.f().floatValue() / 100.0f;
        float floatValue4 = lVar.f12176n.f().floatValue() / 100.0f;
        int i10 = (int) floatValue;
        while (true) {
            i10--;
            if (i10 >= 0) {
                Matrix matrix2 = this.f4857a;
                matrix2.set(matrix);
                float f = i10;
                matrix2.preConcat(lVar.e(f + floatValue2));
                PointF pointF = m3.f.f24798a;
                this.f4865j.g(canvas, matrix2, (int) ((((floatValue4 - floatValue3) * (f / floatValue)) + floatValue3) * i6));
            } else {
                return;
            }
        }
    }

    @Override // c3.b
    public final String getName() {
        return this.f4861e;
    }

    @Override // c3.l
    public final Path getPath() {
        Path path = this.f4865j.getPath();
        Path path2 = this.f4858b;
        path2.reset();
        float floatValue = this.f4862g.f().floatValue();
        float floatValue2 = this.f4863h.f().floatValue();
        int i6 = (int) floatValue;
        while (true) {
            i6--;
            if (i6 >= 0) {
                Matrix matrix = this.f4857a;
                matrix.set(this.f4864i.e(i6 + floatValue2));
                path2.addPath(path, matrix);
            } else {
                return path2;
            }
        }
    }
}
