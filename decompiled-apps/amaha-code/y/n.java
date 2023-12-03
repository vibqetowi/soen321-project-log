package y;

import java.util.ArrayList;
import x.d;
import x.e;
/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public final f f38169k;

    /* renamed from: l  reason: collision with root package name */
    public a f38170l;

    public n(x.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f38169k = fVar;
        this.f38170l = null;
        this.f38182h.f38157e = 6;
        this.f38183i.f38157e = 7;
        fVar.f38157e = 8;
        this.f = 1;
    }

    @Override // y.p, y.d
    public final void a(d dVar) {
        g gVar;
        float f;
        float f2;
        float f10;
        int i6;
        if (v.h.d(this.f38184j) != 3) {
            g gVar2 = this.f38180e;
            boolean z10 = gVar2.f38155c;
            e.a aVar = e.a.MATCH_CONSTRAINT;
            if (z10 && !gVar2.f38161j && this.f38179d == aVar) {
                x.e eVar = this.f38177b;
                int i10 = eVar.f37394t;
                if (i10 != 2) {
                    if (i10 == 3) {
                        g gVar3 = eVar.f37365d.f38180e;
                        if (gVar3.f38161j) {
                            int i11 = eVar.f37361a0;
                            if (i11 != -1) {
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        i6 = 0;
                                        gVar2.d(i6);
                                    } else {
                                        f = gVar3.f38158g;
                                        f2 = eVar.Z;
                                    }
                                } else {
                                    f10 = gVar3.f38158g * eVar.Z;
                                    i6 = (int) (f10 + 0.5f);
                                    gVar2.d(i6);
                                }
                            } else {
                                f = gVar3.f38158g;
                                f2 = eVar.Z;
                            }
                            f10 = f / f2;
                            i6 = (int) (f10 + 0.5f);
                            gVar2.d(i6);
                        }
                    }
                } else {
                    x.e eVar2 = eVar.W;
                    if (eVar2 != null) {
                        if (eVar2.f37367e.f38180e.f38161j) {
                            gVar2.d((int) ((gVar.f38158g * eVar.A) + 0.5f));
                        }
                    }
                }
            }
            f fVar = this.f38182h;
            if (fVar.f38155c) {
                f fVar2 = this.f38183i;
                if (fVar2.f38155c) {
                    if (fVar.f38161j && fVar2.f38161j && gVar2.f38161j) {
                        return;
                    }
                    boolean z11 = gVar2.f38161j;
                    ArrayList arrayList = fVar.f38163l;
                    ArrayList arrayList2 = fVar2.f38163l;
                    if (!z11 && this.f38179d == aVar) {
                        x.e eVar3 = this.f38177b;
                        if (eVar3.f37392s == 0 && !eVar3.C()) {
                            int i12 = ((f) arrayList.get(0)).f38158g + fVar.f;
                            int i13 = ((f) arrayList2.get(0)).f38158g + fVar2.f;
                            fVar.d(i12);
                            fVar2.d(i13);
                            gVar2.d(i13 - i12);
                            return;
                        }
                    }
                    if (!gVar2.f38161j && this.f38179d == aVar && this.f38176a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        int i14 = (((f) arrayList2.get(0)).f38158g + fVar2.f) - (((f) arrayList.get(0)).f38158g + fVar.f);
                        int i15 = gVar2.f38164m;
                        if (i14 < i15) {
                            gVar2.d(i14);
                        } else {
                            gVar2.d(i15);
                        }
                    }
                    if (gVar2.f38161j && arrayList.size() > 0 && arrayList2.size() > 0) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i16 = fVar3.f38158g;
                        int i17 = fVar.f + i16;
                        int i18 = fVar4.f38158g;
                        int i19 = fVar2.f + i18;
                        float f11 = this.f38177b.f37372h0;
                        if (fVar3 == fVar4) {
                            f11 = 0.5f;
                        } else {
                            i16 = i17;
                            i18 = i19;
                        }
                        fVar.d((int) ((((i18 - i16) - gVar2.f38158g) * f11) + i16 + 0.5f));
                        fVar2.d(fVar.f38158g + gVar2.f38158g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        x.e eVar4 = this.f38177b;
        l(eVar4.L, eVar4.N, 1);
    }

    @Override // y.p
    public final void d() {
        x.e eVar;
        x.e eVar2;
        x.e eVar3;
        x.e eVar4;
        x.e eVar5 = this.f38177b;
        boolean z10 = eVar5.f37360a;
        g gVar = this.f38180e;
        if (z10) {
            gVar.d(eVar5.o());
        }
        boolean z11 = gVar.f38161j;
        e.a aVar = e.a.MATCH_PARENT;
        e.a aVar2 = e.a.FIXED;
        e.a aVar3 = e.a.MATCH_CONSTRAINT;
        f fVar = this.f38183i;
        f fVar2 = this.f38182h;
        if (!z11) {
            x.e eVar6 = this.f38177b;
            this.f38179d = eVar6.V[1];
            if (eVar6.F) {
                this.f38170l = new a(this);
            }
            e.a aVar4 = this.f38179d;
            if (aVar4 != aVar3) {
                if (aVar4 == aVar && (eVar4 = this.f38177b.W) != null && eVar4.V[1] == aVar2) {
                    int o10 = (eVar4.o() - this.f38177b.L.e()) - this.f38177b.N.e();
                    p.b(fVar2, eVar4.f37367e.f38182h, this.f38177b.L.e());
                    p.b(fVar, eVar4.f37367e.f38183i, -this.f38177b.N.e());
                    gVar.d(o10);
                    return;
                } else if (aVar4 == aVar2) {
                    gVar.d(this.f38177b.o());
                }
            }
        } else if (this.f38179d == aVar && (eVar2 = (eVar = this.f38177b).W) != null && eVar2.V[1] == aVar2) {
            p.b(fVar2, eVar2.f37367e.f38182h, eVar.L.e());
            p.b(fVar, eVar2.f37367e.f38183i, -this.f38177b.N.e());
            return;
        }
        boolean z12 = gVar.f38161j;
        f fVar3 = this.f38169k;
        if (z12) {
            x.e eVar7 = this.f38177b;
            if (eVar7.f37360a) {
                x.d[] dVarArr = eVar7.S;
                x.d dVar = dVarArr[2];
                x.d dVar2 = dVar.f;
                if (dVar2 != null && dVarArr[3].f != null) {
                    if (eVar7.C()) {
                        fVar2.f = this.f38177b.S[2].e();
                        fVar.f = -this.f38177b.S[3].e();
                    } else {
                        f h10 = p.h(this.f38177b.S[2]);
                        if (h10 != null) {
                            p.b(fVar2, h10, this.f38177b.S[2].e());
                        }
                        f h11 = p.h(this.f38177b.S[3]);
                        if (h11 != null) {
                            p.b(fVar, h11, -this.f38177b.S[3].e());
                        }
                        fVar2.f38154b = true;
                        fVar.f38154b = true;
                    }
                    x.e eVar8 = this.f38177b;
                    if (eVar8.F) {
                        p.b(fVar3, fVar2, eVar8.f37366d0);
                        return;
                    }
                    return;
                } else if (dVar2 != null) {
                    f h12 = p.h(dVar);
                    if (h12 != null) {
                        p.b(fVar2, h12, this.f38177b.S[2].e());
                        p.b(fVar, fVar2, gVar.f38158g);
                        x.e eVar9 = this.f38177b;
                        if (eVar9.F) {
                            p.b(fVar3, fVar2, eVar9.f37366d0);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    x.d dVar3 = dVarArr[3];
                    if (dVar3.f != null) {
                        f h13 = p.h(dVar3);
                        if (h13 != null) {
                            p.b(fVar, h13, -this.f38177b.S[3].e());
                            p.b(fVar2, fVar, -gVar.f38158g);
                        }
                        x.e eVar10 = this.f38177b;
                        if (eVar10.F) {
                            p.b(fVar3, fVar2, eVar10.f37366d0);
                            return;
                        }
                        return;
                    }
                    x.d dVar4 = dVarArr[4];
                    if (dVar4.f != null) {
                        f h14 = p.h(dVar4);
                        if (h14 != null) {
                            p.b(fVar3, h14, 0);
                            p.b(fVar2, fVar3, -this.f38177b.f37366d0);
                            p.b(fVar, fVar2, gVar.f38158g);
                            return;
                        }
                        return;
                    } else if (!(eVar7 instanceof x.i) && eVar7.W != null && eVar7.m(d.a.CENTER).f == null) {
                        x.e eVar11 = this.f38177b;
                        p.b(fVar2, eVar11.W.f37367e.f38182h, eVar11.w());
                        p.b(fVar, fVar2, gVar.f38158g);
                        x.e eVar12 = this.f38177b;
                        if (eVar12.F) {
                            p.b(fVar3, fVar2, eVar12.f37366d0);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        ArrayList arrayList = gVar.f38163l;
        if (!z12 && this.f38179d == aVar3) {
            x.e eVar13 = this.f38177b;
            int i6 = eVar13.f37394t;
            ArrayList arrayList2 = gVar.f38162k;
            if (i6 != 2) {
                if (i6 == 3 && !eVar13.C()) {
                    x.e eVar14 = this.f38177b;
                    if (eVar14.f37392s != 3) {
                        g gVar2 = eVar14.f37365d.f38180e;
                        arrayList.add(gVar2);
                        gVar2.f38162k.add(gVar);
                        gVar.f38154b = true;
                        arrayList2.add(fVar2);
                        arrayList2.add(fVar);
                    }
                }
            } else {
                x.e eVar15 = eVar13.W;
                if (eVar15 != null) {
                    g gVar3 = eVar15.f37367e.f38180e;
                    arrayList.add(gVar3);
                    gVar3.f38162k.add(gVar);
                    gVar.f38154b = true;
                    arrayList2.add(fVar2);
                    arrayList2.add(fVar);
                }
            }
        } else {
            gVar.b(this);
        }
        x.e eVar16 = this.f38177b;
        x.d[] dVarArr2 = eVar16.S;
        x.d dVar5 = dVarArr2[2];
        x.d dVar6 = dVar5.f;
        if (dVar6 != null && dVarArr2[3].f != null) {
            if (eVar16.C()) {
                fVar2.f = this.f38177b.S[2].e();
                fVar.f = -this.f38177b.S[3].e();
            } else {
                f h15 = p.h(this.f38177b.S[2]);
                f h16 = p.h(this.f38177b.S[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f38184j = 4;
            }
            if (this.f38177b.F) {
                c(fVar3, fVar2, 1, this.f38170l);
            }
        } else if (dVar6 != null) {
            f h17 = p.h(dVar5);
            if (h17 != null) {
                p.b(fVar2, h17, this.f38177b.S[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f38177b.F) {
                    c(fVar3, fVar2, 1, this.f38170l);
                }
                if (this.f38179d == aVar3) {
                    x.e eVar17 = this.f38177b;
                    if (eVar17.Z > 0.0f) {
                        l lVar = eVar17.f37365d;
                        if (lVar.f38179d == aVar3) {
                            lVar.f38180e.f38162k.add(gVar);
                            arrayList.add(this.f38177b.f37365d.f38180e);
                            gVar.f38153a = this;
                        }
                    }
                }
            }
        } else {
            x.d dVar7 = dVarArr2[3];
            if (dVar7.f != null) {
                f h18 = p.h(dVar7);
                if (h18 != null) {
                    p.b(fVar, h18, -this.f38177b.S[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f38177b.F) {
                        c(fVar3, fVar2, 1, this.f38170l);
                    }
                }
            } else {
                x.d dVar8 = dVarArr2[4];
                if (dVar8.f != null) {
                    f h19 = p.h(dVar8);
                    if (h19 != null) {
                        p.b(fVar3, h19, 0);
                        c(fVar2, fVar3, -1, this.f38170l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(eVar16 instanceof x.i) && (eVar3 = eVar16.W) != null) {
                    p.b(fVar2, eVar3.f37367e.f38182h, eVar16.w());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f38177b.F) {
                        c(fVar3, fVar2, 1, this.f38170l);
                    }
                    if (this.f38179d == aVar3) {
                        x.e eVar18 = this.f38177b;
                        if (eVar18.Z > 0.0f) {
                            l lVar2 = eVar18.f37365d;
                            if (lVar2.f38179d == aVar3) {
                                lVar2.f38180e.f38162k.add(gVar);
                                arrayList.add(this.f38177b.f37365d.f38180e);
                                gVar.f38153a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            gVar.f38155c = true;
        }
    }

    @Override // y.p
    public final void e() {
        f fVar = this.f38182h;
        if (fVar.f38161j) {
            this.f38177b.c0 = fVar.f38158g;
        }
    }

    @Override // y.p
    public final void f() {
        this.f38178c = null;
        this.f38182h.c();
        this.f38183i.c();
        this.f38169k.c();
        this.f38180e.c();
        this.f38181g = false;
    }

    @Override // y.p
    public final boolean k() {
        if (this.f38179d != e.a.MATCH_CONSTRAINT || this.f38177b.f37394t == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f38181g = false;
        f fVar = this.f38182h;
        fVar.c();
        fVar.f38161j = false;
        f fVar2 = this.f38183i;
        fVar2.c();
        fVar2.f38161j = false;
        f fVar3 = this.f38169k;
        fVar3.c();
        fVar3.f38161j = false;
        this.f38180e.f38161j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f38177b.f37380l0;
    }
}
