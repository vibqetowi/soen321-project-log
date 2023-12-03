package c3;

import d3.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TrimPathContent.java */
/* loaded from: classes.dex */
public final class r implements b, a.InterfaceC0183a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4875a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4876b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final int f4877c;

    /* renamed from: d  reason: collision with root package name */
    public final d3.c f4878d;

    /* renamed from: e  reason: collision with root package name */
    public final d3.c f4879e;
    public final d3.c f;

    public r(i3.b bVar, h3.o oVar) {
        oVar.getClass();
        this.f4875a = oVar.f17152e;
        this.f4877c = oVar.f17148a;
        d3.a<Float, Float> k10 = oVar.f17149b.k();
        this.f4878d = (d3.c) k10;
        d3.a<Float, Float> k11 = oVar.f17150c.k();
        this.f4879e = (d3.c) k11;
        d3.a<Float, Float> k12 = oVar.f17151d.k();
        this.f = (d3.c) k12;
        bVar.f(k10);
        bVar.f(k11);
        bVar.f(k12);
        k10.a(this);
        k11.a(this);
        k12.a(this);
    }

    public final void a(a.InterfaceC0183a interfaceC0183a) {
        this.f4876b.add(interfaceC0183a);
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4876b;
            if (i6 < arrayList.size()) {
                ((a.InterfaceC0183a) arrayList.get(i6)).b();
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // c3.b
    public final void c(List<b> list, List<b> list2) {
    }
}
