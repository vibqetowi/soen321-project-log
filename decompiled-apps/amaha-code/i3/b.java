package i3;

import a3.j;
import a3.s;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import d3.a;
import d3.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r1.b0;
import s1.s;
import t.g;
/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public abstract class b implements c3.d, a.InterfaceC0183a, f3.f {

    /* renamed from: a  reason: collision with root package name */
    public final Path f19743a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f19744b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final b3.a f19745c = new b3.a(1);

    /* renamed from: d  reason: collision with root package name */
    public final b3.a f19746d = new b3.a(PorterDuff.Mode.DST_IN, 0);

    /* renamed from: e  reason: collision with root package name */
    public final b3.a f19747e = new b3.a(PorterDuff.Mode.DST_OUT, 0);
    public final b3.a f;

    /* renamed from: g  reason: collision with root package name */
    public final b3.a f19748g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f19749h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f19750i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f19751j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f19752k;

    /* renamed from: l  reason: collision with root package name */
    public final Matrix f19753l;

    /* renamed from: m  reason: collision with root package name */
    public final j f19754m;

    /* renamed from: n  reason: collision with root package name */
    public final e f19755n;

    /* renamed from: o  reason: collision with root package name */
    public final s f19756o;

    /* renamed from: p  reason: collision with root package name */
    public b f19757p;

    /* renamed from: q  reason: collision with root package name */
    public b f19758q;
    public List<b> r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f19759s;

    /* renamed from: t  reason: collision with root package name */
    public final l f19760t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f19761u;

    public b(j jVar, e eVar) {
        b3.a aVar = new b3.a(1);
        this.f = aVar;
        this.f19748g = new b3.a(PorterDuff.Mode.CLEAR);
        this.f19749h = new RectF();
        this.f19750i = new RectF();
        this.f19751j = new RectF();
        this.f19752k = new RectF();
        this.f19753l = new Matrix();
        this.f19759s = new ArrayList();
        this.f19761u = true;
        this.f19754m = jVar;
        this.f19755n = eVar;
        b0.b(new StringBuilder(), eVar.f19773c, "#draw");
        if (eVar.f19789u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        g3.d dVar = eVar.f19778i;
        dVar.getClass();
        l lVar = new l(dVar);
        this.f19760t = lVar;
        lVar.b(this);
        List<h3.f> list = eVar.f19777h;
        if (list != null && !list.isEmpty()) {
            s sVar = new s(list);
            this.f19756o = sVar;
            for (d3.a aVar2 : (List) sVar.f31224v) {
                aVar2.a(this);
            }
            for (d3.a<?, ?> aVar3 : (List) this.f19756o.f31225w) {
                f(aVar3);
                aVar3.a(this);
            }
        }
        e eVar2 = this.f19755n;
        if (!eVar2.f19788t.isEmpty()) {
            d3.c cVar = new d3.c(eVar2.f19788t);
            cVar.f12139b = true;
            cVar.a(new a(this, cVar));
            boolean z10 = cVar.f().floatValue() == 1.0f;
            if (z10 != this.f19761u) {
                this.f19761u = z10;
                this.f19754m.invalidateSelf();
            }
            f(cVar);
        } else if (true != this.f19761u) {
            this.f19761u = true;
            this.f19754m.invalidateSelf();
        }
    }

    @Override // f3.f
    public final void a(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
        e eVar3 = this.f19755n;
        if (!eVar.c(i6, eVar3.f19773c)) {
            return;
        }
        String str = eVar3.f19773c;
        if (!"__container".equals(str)) {
            eVar2.getClass();
            f3.e eVar4 = new f3.e(eVar2);
            eVar4.f14775a.add(str);
            if (eVar.a(i6, str)) {
                f3.e eVar5 = new f3.e(eVar4);
                eVar5.f14776b = this;
                arrayList.add(eVar5);
            }
            eVar2 = eVar4;
        }
        if (eVar.d(i6, str)) {
            n(eVar, eVar.b(i6, str) + i6, arrayList, eVar2);
        }
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        this.f19754m.invalidateSelf();
    }

    @Override // f3.f
    public void d(s sVar, Object obj) {
        this.f19760t.c(sVar, obj);
    }

    @Override // c3.d
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f19749h.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        Matrix matrix2 = this.f19753l;
        matrix2.set(matrix);
        if (z10) {
            List<b> list = this.r;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(this.r.get(size).f19760t.d());
                }
            } else {
                b bVar = this.f19758q;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f19760t.d());
                }
            }
        }
        matrix2.preConcat(this.f19760t.d());
    }

    public final void f(d3.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f19759s.add(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0207  */
    @Override // c3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas, Matrix matrix, int i6) {
        int intValue;
        boolean z10;
        boolean z11;
        float f;
        boolean z12;
        boolean z13;
        if (this.f19761u) {
            e eVar = this.f19755n;
            if (!eVar.f19790v) {
                h();
                Matrix matrix2 = this.f19744b;
                matrix2.reset();
                matrix2.set(matrix);
                int i10 = 1;
                for (int size = this.r.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.r.get(size).f19760t.d());
                }
                hc.d.s();
                l lVar = this.f19760t;
                d3.a<Integer, Integer> aVar = lVar.f12172j;
                if (aVar == null) {
                    intValue = 100;
                } else {
                    intValue = aVar.f().intValue();
                }
                int i11 = (int) ((((i6 / 255.0f) * intValue) / 100.0f) * 255.0f);
                if (this.f19757p != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !k()) {
                    matrix2.preConcat(lVar.d());
                    j(canvas, matrix2, i11);
                    hc.d.s();
                    hc.d.s();
                    l();
                    return;
                }
                RectF rectF = this.f19749h;
                e(rectF, matrix2, false);
                if (this.f19757p != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i12 = 3;
                if (z11 && eVar.f19789u != 3) {
                    RectF rectF2 = this.f19751j;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.f19757p.e(rectF2, matrix, true);
                    if (!rectF.intersect(rectF2)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                matrix2.preConcat(lVar.d());
                RectF rectF3 = this.f19750i;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                boolean k10 = k();
                Path path = this.f19743a;
                int i13 = 2;
                s sVar = this.f19756o;
                if (k10) {
                    int size2 = ((List) sVar.f31226x).size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size2) {
                            h3.f fVar = (h3.f) ((List) sVar.f31226x).get(i14);
                            path.set((Path) ((d3.a) ((List) sVar.f31224v).get(i14)).f());
                            path.transform(matrix2);
                            int d10 = v.h.d(fVar.f17104a);
                            if (d10 != 0) {
                                if (d10 == i10) {
                                    break;
                                } else if (d10 != i13) {
                                    if (d10 == i12) {
                                        break;
                                    }
                                    RectF rectF4 = this.f19752k;
                                    path.computeBounds(rectF4, false);
                                    if (i14 != 0) {
                                        rectF3.set(rectF4);
                                    } else {
                                        rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                                    }
                                    i14++;
                                    i10 = 1;
                                    i12 = 3;
                                    i13 = 2;
                                }
                            }
                            if (fVar.f17107d) {
                                break;
                            }
                            RectF rectF42 = this.f19752k;
                            path.computeBounds(rectF42, false);
                            if (i14 != 0) {
                            }
                            i14++;
                            i10 = 1;
                            i12 = 3;
                            i13 = 2;
                        } else if (!rectF.intersect(rectF3)) {
                            f = 0.0f;
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
                f = 0.0f;
                if (!rectF.intersect(f, f, canvas.getWidth(), canvas.getHeight())) {
                    rectF.set(f, f, f, f);
                }
                hc.d.s();
                if (!rectF.isEmpty()) {
                    b3.a aVar2 = this.f19745c;
                    aVar2.setAlpha(255);
                    m3.g.e(canvas, rectF, aVar2, 31);
                    hc.d.s();
                    i(canvas);
                    j(canvas, matrix2, i11);
                    hc.d.s();
                    if (k()) {
                        b3.a aVar3 = this.f19746d;
                        m3.g.e(canvas, rectF, aVar3, 19);
                        if (Build.VERSION.SDK_INT < 28) {
                            canvas.drawColor(0);
                        }
                        hc.d.s();
                        for (int i15 = 0; i15 < ((List) sVar.f31226x).size(); i15++) {
                            h3.f fVar2 = (h3.f) ((List) sVar.f31226x).get(i15);
                            d3.a aVar4 = (d3.a) ((List) sVar.f31224v).get(i15);
                            d3.a aVar5 = (d3.a) ((List) sVar.f31225w).get(i15);
                            int d11 = v.h.d(fVar2.f17104a);
                            b3.a aVar6 = this.f19747e;
                            boolean z14 = fVar2.f17107d;
                            if (d11 != 0) {
                                if (d11 != 1) {
                                    if (d11 != 2) {
                                        if (d11 == 3) {
                                            if (!((List) sVar.f31224v).isEmpty()) {
                                                for (int i16 = 0; i16 < ((List) sVar.f31226x).size(); i16++) {
                                                    if (((h3.f) ((List) sVar.f31226x).get(i16)).f17104a == 4) {
                                                    }
                                                }
                                                z13 = true;
                                                if (z13) {
                                                    aVar2.setAlpha(255);
                                                    canvas.drawRect(rectF, aVar2);
                                                }
                                            }
                                            z13 = false;
                                            if (z13) {
                                            }
                                        }
                                    } else if (z14) {
                                        m3.g.e(canvas, rectF, aVar3, 31);
                                        canvas.drawRect(rectF, aVar2);
                                        aVar6.setAlpha((int) (((Integer) aVar5.f()).intValue() * 2.55f));
                                        path.set((Path) aVar4.f());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, aVar6);
                                        canvas.restore();
                                    } else {
                                        m3.g.e(canvas, rectF, aVar3, 31);
                                        path.set((Path) aVar4.f());
                                        path.transform(matrix2);
                                        aVar2.setAlpha((int) (((Integer) aVar5.f()).intValue() * 2.55f));
                                        canvas.drawPath(path, aVar2);
                                        canvas.restore();
                                    }
                                } else {
                                    if (i15 == 0) {
                                        aVar2.setColor(-16777216);
                                        aVar2.setAlpha(255);
                                        canvas.drawRect(rectF, aVar2);
                                    }
                                    if (z14) {
                                        m3.g.e(canvas, rectF, aVar6, 31);
                                        canvas.drawRect(rectF, aVar2);
                                        aVar6.setAlpha((int) (((Integer) aVar5.f()).intValue() * 2.55f));
                                        path.set((Path) aVar4.f());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, aVar6);
                                        canvas.restore();
                                    } else {
                                        path.set((Path) aVar4.f());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, aVar6);
                                    }
                                }
                            } else if (z14) {
                                m3.g.e(canvas, rectF, aVar2, 31);
                                canvas.drawRect(rectF, aVar2);
                                path.set((Path) aVar4.f());
                                path.transform(matrix2);
                                aVar2.setAlpha((int) (((Integer) aVar5.f()).intValue() * 2.55f));
                                canvas.drawPath(path, aVar6);
                                canvas.restore();
                            } else {
                                path.set((Path) aVar4.f());
                                path.transform(matrix2);
                                aVar2.setAlpha((int) (((Integer) aVar5.f()).intValue() * 2.55f));
                                canvas.drawPath(path, aVar2);
                            }
                        }
                        canvas.restore();
                        hc.d.s();
                    }
                    if (this.f19757p != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        m3.g.e(canvas, rectF, this.f, 19);
                        hc.d.s();
                        i(canvas);
                        this.f19757p.g(canvas, matrix, i11);
                        canvas.restore();
                        hc.d.s();
                        hc.d.s();
                    }
                    canvas.restore();
                    hc.d.s();
                }
                hc.d.s();
                l();
                return;
            }
        }
        hc.d.s();
    }

    @Override // c3.b
    public final String getName() {
        return this.f19755n.f19773c;
    }

    public final void h() {
        if (this.r != null) {
            return;
        }
        if (this.f19758q == null) {
            this.r = Collections.emptyList();
            return;
        }
        this.r = new ArrayList();
        for (b bVar = this.f19758q; bVar != null; bVar = bVar.f19758q) {
            this.r.add(bVar);
        }
    }

    public final void i(Canvas canvas) {
        RectF rectF = this.f19749h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f19748g);
        hc.d.s();
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i6);

    public final boolean k() {
        s sVar = this.f19756o;
        if (sVar != null && !((List) sVar.f31224v).isEmpty()) {
            return true;
        }
        return false;
    }

    public final void l() {
        a3.s sVar = this.f19754m.f207v.f176a;
        String str = this.f19755n.f19773c;
        if (sVar.f277a) {
            HashMap hashMap = sVar.f279c;
            m3.e eVar = (m3.e) hashMap.get(str);
            if (eVar == null) {
                eVar = new m3.e();
                hashMap.put(str, eVar);
            }
            int i6 = eVar.f24797a + 1;
            eVar.f24797a = i6;
            if (i6 == Integer.MAX_VALUE) {
                eVar.f24797a = i6 / 2;
            }
            if (str.equals("__container")) {
                Iterator it = sVar.f278b.iterator();
                while (true) {
                    g.a aVar = (g.a) it;
                    if (aVar.hasNext()) {
                        ((s.a) aVar.next()).a();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void m(d3.a<?, ?> aVar) {
        this.f19759s.remove(aVar);
    }

    public void o(float f) {
        l lVar = this.f19760t;
        d3.a<Integer, Integer> aVar = lVar.f12172j;
        if (aVar != null) {
            aVar.i(f);
        }
        d3.a<?, Float> aVar2 = lVar.f12175m;
        if (aVar2 != null) {
            aVar2.i(f);
        }
        d3.a<?, Float> aVar3 = lVar.f12176n;
        if (aVar3 != null) {
            aVar3.i(f);
        }
        d3.a<PointF, PointF> aVar4 = lVar.f;
        if (aVar4 != null) {
            aVar4.i(f);
        }
        d3.a<?, PointF> aVar5 = lVar.f12169g;
        if (aVar5 != null) {
            aVar5.i(f);
        }
        d3.a<n3.c, n3.c> aVar6 = lVar.f12170h;
        if (aVar6 != null) {
            aVar6.i(f);
        }
        d3.a<Float, Float> aVar7 = lVar.f12171i;
        if (aVar7 != null) {
            aVar7.i(f);
        }
        d3.c cVar = lVar.f12173k;
        if (cVar != null) {
            cVar.i(f);
        }
        d3.c cVar2 = lVar.f12174l;
        if (cVar2 != null) {
            cVar2.i(f);
        }
        int i6 = 0;
        s1.s sVar = this.f19756o;
        if (sVar != null) {
            for (int i10 = 0; i10 < ((List) sVar.f31224v).size(); i10++) {
                ((d3.a) ((List) sVar.f31224v).get(i10)).i(f);
            }
        }
        float f2 = this.f19755n.f19782m;
        if (f2 != 0.0f) {
            f /= f2;
        }
        b bVar = this.f19757p;
        if (bVar != null) {
            bVar.o(bVar.f19755n.f19782m * f);
        }
        while (true) {
            ArrayList arrayList = this.f19759s;
            if (i6 < arrayList.size()) {
                ((d3.a) arrayList.get(i6)).i(f);
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // c3.b
    public final void c(List<c3.b> list, List<c3.b> list2) {
    }

    public void n(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
    }
}
