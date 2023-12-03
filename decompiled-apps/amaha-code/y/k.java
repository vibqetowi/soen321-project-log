package y;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
public final class k extends p {
    public k(x.e eVar) {
        super(eVar);
    }

    @Override // y.p, y.d
    public final void a(d dVar) {
        x.a aVar = (x.a) this.f38177b;
        int i6 = aVar.f37328y0;
        f fVar = this.f38182h;
        Iterator it = fVar.f38163l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f38158g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (i6 != 0 && i6 != 2) {
            fVar.d(i10 + aVar.A0);
        } else {
            fVar.d(i11 + aVar.A0);
        }
    }

    @Override // y.p
    public final void d() {
        x.e eVar = this.f38177b;
        if (eVar instanceof x.a) {
            f fVar = this.f38182h;
            fVar.f38154b = true;
            x.a aVar = (x.a) eVar;
            int i6 = aVar.f37328y0;
            boolean z10 = aVar.f37329z0;
            ArrayList arrayList = fVar.f38163l;
            int i10 = 0;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            fVar.f38157e = 7;
                            while (i10 < aVar.f37439x0) {
                                x.e eVar2 = aVar.f37438w0[i10];
                                if (z10 || eVar2.f37376j0 != 8) {
                                    f fVar2 = eVar2.f37367e.f38183i;
                                    fVar2.f38162k.add(fVar);
                                    arrayList.add(fVar2);
                                }
                                i10++;
                            }
                            m(this.f38177b.f37367e.f38182h);
                            m(this.f38177b.f37367e.f38183i);
                            return;
                        }
                        return;
                    }
                    fVar.f38157e = 6;
                    while (i10 < aVar.f37439x0) {
                        x.e eVar3 = aVar.f37438w0[i10];
                        if (z10 || eVar3.f37376j0 != 8) {
                            f fVar3 = eVar3.f37367e.f38182h;
                            fVar3.f38162k.add(fVar);
                            arrayList.add(fVar3);
                        }
                        i10++;
                    }
                    m(this.f38177b.f37367e.f38182h);
                    m(this.f38177b.f37367e.f38183i);
                    return;
                }
                fVar.f38157e = 5;
                while (i10 < aVar.f37439x0) {
                    x.e eVar4 = aVar.f37438w0[i10];
                    if (z10 || eVar4.f37376j0 != 8) {
                        f fVar4 = eVar4.f37365d.f38183i;
                        fVar4.f38162k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i10++;
                }
                m(this.f38177b.f37365d.f38182h);
                m(this.f38177b.f37365d.f38183i);
                return;
            }
            fVar.f38157e = 4;
            while (i10 < aVar.f37439x0) {
                x.e eVar5 = aVar.f37438w0[i10];
                if (z10 || eVar5.f37376j0 != 8) {
                    f fVar5 = eVar5.f37365d.f38182h;
                    fVar5.f38162k.add(fVar);
                    arrayList.add(fVar5);
                }
                i10++;
            }
            m(this.f38177b.f37365d.f38182h);
            m(this.f38177b.f37365d.f38183i);
        }
    }

    @Override // y.p
    public final void e() {
        x.e eVar = this.f38177b;
        if (eVar instanceof x.a) {
            int i6 = ((x.a) eVar).f37328y0;
            f fVar = this.f38182h;
            if (i6 != 0 && i6 != 1) {
                eVar.c0 = fVar.f38158g;
            } else {
                eVar.f37363b0 = fVar.f38158g;
            }
        }
    }

    @Override // y.p
    public final void f() {
        this.f38178c = null;
        this.f38182h.c();
    }

    @Override // y.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f38182h;
        fVar2.f38162k.add(fVar);
        fVar.f38163l.add(fVar2);
    }
}
