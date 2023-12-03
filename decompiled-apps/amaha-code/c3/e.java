package c3;

import android.graphics.Path;
import android.graphics.PointF;
import d3.a;
import java.util.ArrayList;
import java.util.List;
import s1.s;
/* compiled from: EllipseContent.java */
/* loaded from: classes.dex */
public final class e implements l, a.InterfaceC0183a, j {

    /* renamed from: b  reason: collision with root package name */
    public final String f4789b;

    /* renamed from: c  reason: collision with root package name */
    public final a3.j f4790c;

    /* renamed from: d  reason: collision with root package name */
    public final d3.a<?, PointF> f4791d;

    /* renamed from: e  reason: collision with root package name */
    public final d3.a<?, PointF> f4792e;
    public final h3.a f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4794h;

    /* renamed from: a  reason: collision with root package name */
    public final Path f4788a = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final k1.c f4793g = new k1.c(1);

    public e(a3.j jVar, i3.b bVar, h3.a aVar) {
        this.f4789b = aVar.f17078a;
        this.f4790c = jVar;
        d3.a<?, PointF> k10 = aVar.f17080c.k();
        this.f4791d = k10;
        d3.a<PointF, PointF> k11 = aVar.f17079b.k();
        this.f4792e = k11;
        this.f = aVar;
        bVar.f(k10);
        bVar.f(k11);
        k10.a(this);
        k11.a(this);
    }

    @Override // f3.f
    public final void a(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
        m3.f.d(eVar, i6, arrayList, eVar2, this);
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        this.f4794h = false;
        this.f4790c.invalidateSelf();
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
                        this.f4793g.f22768a.add(rVar);
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
        if (obj == a3.o.f249g) {
            this.f4791d.j(sVar);
        } else if (obj == a3.o.f252j) {
            this.f4792e.j(sVar);
        }
    }

    @Override // c3.b
    public final String getName() {
        return this.f4789b;
    }

    @Override // c3.l
    public final Path getPath() {
        boolean z10 = this.f4794h;
        Path path = this.f4788a;
        if (z10) {
            return path;
        }
        path.reset();
        h3.a aVar = this.f;
        if (aVar.f17082e) {
            this.f4794h = true;
            return path;
        }
        PointF f = this.f4791d.f();
        float f2 = f.x / 2.0f;
        float f10 = f.y / 2.0f;
        float f11 = f2 * 0.55228f;
        float f12 = f10 * 0.55228f;
        path.reset();
        if (aVar.f17081d) {
            float f13 = -f10;
            path.moveTo(0.0f, f13);
            float f14 = 0.0f - f11;
            float f15 = -f2;
            float f16 = 0.0f - f12;
            path.cubicTo(f14, f13, f15, f16, f15, 0.0f);
            float f17 = f12 + 0.0f;
            path.cubicTo(f15, f17, f14, f10, 0.0f, f10);
            float f18 = f11 + 0.0f;
            path.cubicTo(f18, f10, f2, f17, f2, 0.0f);
            path.cubicTo(f2, f16, f18, f13, 0.0f, f13);
        } else {
            float f19 = -f10;
            path.moveTo(0.0f, f19);
            float f20 = f11 + 0.0f;
            float f21 = 0.0f - f12;
            path.cubicTo(f20, f19, f2, f21, f2, 0.0f);
            float f22 = f12 + 0.0f;
            path.cubicTo(f2, f22, f20, f10, 0.0f, f10);
            float f23 = 0.0f - f11;
            float f24 = -f2;
            path.cubicTo(f23, f10, f24, f22, f24, 0.0f);
            path.cubicTo(f24, f21, f23, f19, 0.0f, f19);
        }
        PointF f25 = this.f4792e.f();
        path.offset(f25.x, f25.y);
        path.close();
        this.f4793g.a(path);
        this.f4794h = true;
        return path;
    }
}
