package y;
/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public final class j extends p {
    public j(x.e eVar) {
        super(eVar);
        eVar.f37365d.f();
        eVar.f37367e.f();
        this.f = ((x.h) eVar).A0;
    }

    @Override // y.p, y.d
    public final void a(d dVar) {
        f fVar = this.f38182h;
        if (!fVar.f38155c || fVar.f38161j) {
            return;
        }
        fVar.d((int) ((((f) fVar.f38163l.get(0)).f38158g * ((x.h) this.f38177b).f37434w0) + 0.5f));
    }

    @Override // y.p
    public final void d() {
        x.e eVar = this.f38177b;
        x.h hVar = (x.h) eVar;
        int i6 = hVar.f37435x0;
        int i10 = hVar.f37436y0;
        int i11 = hVar.A0;
        f fVar = this.f38182h;
        if (i11 == 1) {
            if (i6 != -1) {
                fVar.f38163l.add(eVar.W.f37365d.f38182h);
                this.f38177b.W.f37365d.f38182h.f38162k.add(fVar);
                fVar.f = i6;
            } else if (i10 != -1) {
                fVar.f38163l.add(eVar.W.f37365d.f38183i);
                this.f38177b.W.f37365d.f38183i.f38162k.add(fVar);
                fVar.f = -i10;
            } else {
                fVar.f38154b = true;
                fVar.f38163l.add(eVar.W.f37365d.f38183i);
                this.f38177b.W.f37365d.f38183i.f38162k.add(fVar);
            }
            m(this.f38177b.f37365d.f38182h);
            m(this.f38177b.f37365d.f38183i);
            return;
        }
        if (i6 != -1) {
            fVar.f38163l.add(eVar.W.f37367e.f38182h);
            this.f38177b.W.f37367e.f38182h.f38162k.add(fVar);
            fVar.f = i6;
        } else if (i10 != -1) {
            fVar.f38163l.add(eVar.W.f37367e.f38183i);
            this.f38177b.W.f37367e.f38183i.f38162k.add(fVar);
            fVar.f = -i10;
        } else {
            fVar.f38154b = true;
            fVar.f38163l.add(eVar.W.f37367e.f38183i);
            this.f38177b.W.f37367e.f38183i.f38162k.add(fVar);
        }
        m(this.f38177b.f37367e.f38182h);
        m(this.f38177b.f37367e.f38183i);
    }

    @Override // y.p
    public final void e() {
        x.e eVar = this.f38177b;
        int i6 = ((x.h) eVar).A0;
        f fVar = this.f38182h;
        if (i6 == 1) {
            eVar.f37363b0 = fVar.f38158g;
        } else {
            eVar.c0 = fVar.f38158g;
        }
    }

    @Override // y.p
    public final void f() {
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
