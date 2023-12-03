package c3;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import d3.a;
import java.util.ArrayList;
import java.util.List;
import s1.s;
/* compiled from: RectangleContent.java */
/* loaded from: classes.dex */
public final class n implements a.InterfaceC0183a, j, l {

    /* renamed from: c  reason: collision with root package name */
    public final String f4850c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4851d;

    /* renamed from: e  reason: collision with root package name */
    public final a3.j f4852e;
    public final d3.a<?, PointF> f;

    /* renamed from: g  reason: collision with root package name */
    public final d3.a<?, PointF> f4853g;

    /* renamed from: h  reason: collision with root package name */
    public final d3.c f4854h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4856j;

    /* renamed from: a  reason: collision with root package name */
    public final Path f4848a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f4849b = new RectF();

    /* renamed from: i  reason: collision with root package name */
    public final k1.c f4855i = new k1.c(1);

    public n(a3.j jVar, i3.b bVar, h3.i iVar) {
        this.f4850c = iVar.f17120b;
        this.f4851d = iVar.f17122d;
        this.f4852e = jVar;
        d3.a<?, PointF> k10 = iVar.f17123e.k();
        this.f = k10;
        d3.a<?, PointF> k11 = ((g3.a) iVar.f).k();
        this.f4853g = k11;
        d3.a<?, ?> k12 = iVar.f17121c.k();
        this.f4854h = (d3.c) k12;
        bVar.f(k10);
        bVar.f(k11);
        bVar.f(k12);
        k10.a(this);
        k11.a(this);
        k12.a(this);
    }

    @Override // f3.f
    public final void a(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
        m3.f.d(eVar, i6, arrayList, eVar2, this);
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        this.f4856j = false;
        this.f4852e.invalidateSelf();
    }

    @Override // c3.b
    public final void c(List<b> list, List<b> list2) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i6 < arrayList.size()) {
                b bVar = (b) arrayList.get(i6);
                if (bVar instanceof r) {
                    r rVar = (r) bVar;
                    if (rVar.f4877c == 1) {
                        this.f4855i.f22768a.add(rVar);
                        rVar.a(this);
                    }
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // f3.f
    public final void d(s sVar, Object obj) {
        if (obj == a3.o.f250h) {
            this.f4853g.j(sVar);
        } else if (obj == a3.o.f252j) {
            this.f.j(sVar);
        } else if (obj == a3.o.f251i) {
            this.f4854h.j(sVar);
        }
    }

    @Override // c3.b
    public final String getName() {
        return this.f4850c;
    }

    @Override // c3.l
    public final Path getPath() {
        float k10;
        boolean z10 = this.f4856j;
        Path path = this.f4848a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f4851d) {
            this.f4856j = true;
            return path;
        }
        PointF f = this.f4853g.f();
        float f2 = f.x / 2.0f;
        float f10 = f.y / 2.0f;
        d3.c cVar = this.f4854h;
        if (cVar == null) {
            k10 = 0.0f;
        } else {
            k10 = cVar.k();
        }
        float min = Math.min(f2, f10);
        if (k10 > min) {
            k10 = min;
        }
        PointF f11 = this.f.f();
        path.moveTo(f11.x + f2, (f11.y - f10) + k10);
        path.lineTo(f11.x + f2, (f11.y + f10) - k10);
        RectF rectF = this.f4849b;
        int i6 = (k10 > 0.0f ? 1 : (k10 == 0.0f ? 0 : -1));
        if (i6 > 0) {
            float f12 = f11.x + f2;
            float f13 = k10 * 2.0f;
            float f14 = f11.y + f10;
            rectF.set(f12 - f13, f14 - f13, f12, f14);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((f11.x - f2) + k10, f11.y + f10);
        if (i6 > 0) {
            float f15 = f11.x - f2;
            float f16 = f11.y + f10;
            float f17 = k10 * 2.0f;
            rectF.set(f15, f16 - f17, f17 + f15, f16);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(f11.x - f2, (f11.y - f10) + k10);
        if (i6 > 0) {
            float f18 = f11.x - f2;
            float f19 = f11.y - f10;
            float f20 = k10 * 2.0f;
            rectF.set(f18, f19, f18 + f20, f20 + f19);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((f11.x + f2) - k10, f11.y - f10);
        if (i6 > 0) {
            float f21 = f11.x + f2;
            float f22 = k10 * 2.0f;
            float f23 = f11.y - f10;
            rectF.set(f21 - f22, f23, f21, f22 + f23);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f4855i.a(path);
        this.f4856j = true;
        return path;
    }
}
