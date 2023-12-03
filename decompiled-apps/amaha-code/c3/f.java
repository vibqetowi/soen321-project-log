package c3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import d3.a;
import java.util.ArrayList;
import java.util.List;
import s1.s;
/* compiled from: FillContent.java */
/* loaded from: classes.dex */
public final class f implements d, a.InterfaceC0183a, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f4795a;

    /* renamed from: b  reason: collision with root package name */
    public final b3.a f4796b;

    /* renamed from: c  reason: collision with root package name */
    public final i3.b f4797c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4798d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4799e;
    public final ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public final d3.a<Integer, Integer> f4800g;

    /* renamed from: h  reason: collision with root package name */
    public final d3.a<Integer, Integer> f4801h;

    /* renamed from: i  reason: collision with root package name */
    public d3.m f4802i;

    /* renamed from: j  reason: collision with root package name */
    public final a3.j f4803j;

    public f(a3.j jVar, i3.b bVar, h3.k kVar) {
        g3.a aVar;
        Path path = new Path();
        this.f4795a = path;
        this.f4796b = new b3.a(1);
        this.f = new ArrayList();
        this.f4797c = bVar;
        this.f4798d = kVar.f17129c;
        this.f4799e = kVar.f;
        this.f4803j = jVar;
        g3.a aVar2 = kVar.f17130d;
        if (aVar2 != null && (aVar = kVar.f17131e) != null) {
            path.setFillType(kVar.f17128b);
            d3.a<Integer, Integer> k10 = aVar2.k();
            this.f4800g = k10;
            k10.a(this);
            bVar.f(k10);
            d3.a<Integer, Integer> k11 = aVar.k();
            this.f4801h = k11;
            k11.a(this);
            bVar.f(k11);
            return;
        }
        this.f4800g = null;
        this.f4801h = null;
    }

    @Override // f3.f
    public final void a(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
        m3.f.d(eVar, i6, arrayList, eVar2, this);
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        this.f4803j.invalidateSelf();
    }

    @Override // c3.b
    public final void c(List<b> list, List<b> list2) {
        for (int i6 = 0; i6 < list2.size(); i6++) {
            b bVar = list2.get(i6);
            if (bVar instanceof l) {
                this.f.add((l) bVar);
            }
        }
    }

    @Override // f3.f
    public final void d(s sVar, Object obj) {
        if (obj == a3.o.f244a) {
            this.f4800g.j(sVar);
        } else if (obj == a3.o.f247d) {
            this.f4801h.j(sVar);
        } else if (obj == a3.o.C) {
            if (sVar == null) {
                this.f4802i = null;
                return;
            }
            d3.m mVar = new d3.m(sVar, null);
            this.f4802i = mVar;
            mVar.a(this);
            this.f4797c.f(this.f4802i);
        }
    }

    @Override // c3.d
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f4795a;
        path.reset();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i6 < arrayList.size()) {
                path.addPath(((l) arrayList.get(i6)).getPath(), matrix);
                i6++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // c3.d
    public final void g(Canvas canvas, Matrix matrix, int i6) {
        if (this.f4799e) {
            return;
        }
        d3.b bVar = (d3.b) this.f4800g;
        int k10 = bVar.k(bVar.b(), bVar.d());
        b3.a aVar = this.f4796b;
        aVar.setColor(k10);
        PointF pointF = m3.f.f24798a;
        int i10 = 0;
        aVar.setAlpha(Math.max(0, Math.min(255, (int) ((((i6 / 255.0f) * this.f4801h.f().intValue()) / 100.0f) * 255.0f))));
        d3.m mVar = this.f4802i;
        if (mVar != null) {
            aVar.setColorFilter((ColorFilter) mVar.f());
        }
        Path path = this.f4795a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i10 < arrayList.size()) {
                path.addPath(((l) arrayList.get(i10)).getPath(), matrix);
                i10++;
            } else {
                canvas.drawPath(path, aVar);
                hc.d.s();
                return;
            }
        }
    }

    @Override // c3.b
    public final String getName() {
        return this.f4798d;
    }
}
