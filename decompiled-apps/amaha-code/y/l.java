package y;

import java.util.ArrayList;
import x.d;
import x.e;
/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f38166k = new int[2];

    public l(x.e eVar) {
        super(eVar);
        this.f38182h.f38157e = 4;
        this.f38183i.f38157e = 5;
        this.f = 0;
    }

    public static void m(int[] iArr, int i6, int i10, int i11, int i12, float f, int i13) {
        int i14 = i10 - i6;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    iArr[0] = i14;
                    iArr[1] = (int) ((i14 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i15 * f) + 0.5f);
            iArr[1] = i15;
            return;
        }
        int i16 = (int) ((i15 * f) + 0.5f);
        int i17 = (int) ((i14 / f) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x024c, code lost:
        if (r9 != 1) goto L127;
     */
    @Override // y.p, y.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        g gVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f;
        float f2;
        float f10;
        int i6;
        if (v.h.d(this.f38184j) != 3) {
            g gVar2 = this.f38180e;
            boolean z14 = gVar2.f38161j;
            e.a aVar = e.a.MATCH_CONSTRAINT;
            f fVar = this.f38182h;
            f fVar2 = this.f38183i;
            if (!z14 && this.f38179d == aVar) {
                x.e eVar = this.f38177b;
                int i10 = eVar.f37392s;
                if (i10 != 2) {
                    if (i10 == 3) {
                        int i11 = eVar.f37394t;
                        if (i11 != 0 && i11 != 3) {
                            int i12 = eVar.f37361a0;
                            if (i12 != -1) {
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        i6 = 0;
                                        gVar2.d(i6);
                                    } else {
                                        f = eVar.f37367e.f38180e.f38158g;
                                        f2 = eVar.Z;
                                    }
                                } else {
                                    f10 = eVar.f37367e.f38180e.f38158g / eVar.Z;
                                    i6 = (int) (f10 + 0.5f);
                                    gVar2.d(i6);
                                }
                            } else {
                                f = eVar.f37367e.f38180e.f38158g;
                                f2 = eVar.Z;
                            }
                            f10 = f * f2;
                            i6 = (int) (f10 + 0.5f);
                            gVar2.d(i6);
                        } else {
                            n nVar = eVar.f37367e;
                            f fVar3 = nVar.f38182h;
                            f fVar4 = nVar.f38183i;
                            if (eVar.K.f != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (eVar.L.f != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (eVar.M.f != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (eVar.N.f != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            int i13 = eVar.f37361a0;
                            if (z10 && z11 && z12 && z13) {
                                float f11 = eVar.Z;
                                boolean z15 = fVar3.f38161j;
                                int[] iArr = f38166k;
                                if (z15 && fVar4.f38161j) {
                                    if (fVar.f38155c && fVar2.f38155c) {
                                        m(iArr, ((f) fVar.f38163l.get(0)).f38158g + fVar.f, ((f) fVar2.f38163l.get(0)).f38158g - fVar2.f, fVar3.f38158g + fVar3.f, fVar4.f38158g - fVar4.f, f11, i13);
                                        gVar2.d(iArr[0]);
                                        this.f38177b.f37367e.f38180e.d(iArr[1]);
                                        return;
                                    }
                                    return;
                                }
                                boolean z16 = fVar.f38161j;
                                ArrayList arrayList = fVar3.f38163l;
                                if (z16 && fVar2.f38161j) {
                                    if (fVar3.f38155c && fVar4.f38155c) {
                                        m(iArr, fVar.f38158g + fVar.f, fVar2.f38158g - fVar2.f, ((f) arrayList.get(0)).f38158g + fVar3.f, ((f) fVar4.f38163l.get(0)).f38158g - fVar4.f, f11, i13);
                                        gVar2.d(iArr[0]);
                                        this.f38177b.f37367e.f38180e.d(iArr[1]);
                                    } else {
                                        return;
                                    }
                                }
                                if (fVar.f38155c && fVar2.f38155c && fVar3.f38155c && fVar4.f38155c) {
                                    m(iArr, ((f) fVar.f38163l.get(0)).f38158g + fVar.f, ((f) fVar2.f38163l.get(0)).f38158g - fVar2.f, ((f) arrayList.get(0)).f38158g + fVar3.f, ((f) fVar4.f38163l.get(0)).f38158g - fVar4.f, f11, i13);
                                    gVar2.d(iArr[0]);
                                    this.f38177b.f37367e.f38180e.d(iArr[1]);
                                } else {
                                    return;
                                }
                            } else if (z10 && z12) {
                                if (fVar.f38155c && fVar2.f38155c) {
                                    float f12 = eVar.Z;
                                    int i14 = ((f) fVar.f38163l.get(0)).f38158g + fVar.f;
                                    int i15 = ((f) fVar2.f38163l.get(0)).f38158g - fVar2.f;
                                    if (i13 != -1 && i13 != 0) {
                                        if (i13 == 1) {
                                            int g5 = g(i15 - i14, 0);
                                            int i16 = (int) ((g5 / f12) + 0.5f);
                                            int g10 = g(i16, 1);
                                            if (i16 != g10) {
                                                g5 = (int) ((g10 * f12) + 0.5f);
                                            }
                                            gVar2.d(g5);
                                            this.f38177b.f37367e.f38180e.d(g10);
                                        }
                                    } else {
                                        int g11 = g(i15 - i14, 0);
                                        int i17 = (int) ((g11 * f12) + 0.5f);
                                        int g12 = g(i17, 1);
                                        if (i17 != g12) {
                                            g11 = (int) ((g12 / f12) + 0.5f);
                                        }
                                        gVar2.d(g11);
                                        this.f38177b.f37367e.f38180e.d(g12);
                                    }
                                } else {
                                    return;
                                }
                            } else if (z11 && z13) {
                                if (fVar3.f38155c && fVar4.f38155c) {
                                    float f13 = eVar.Z;
                                    int i18 = ((f) fVar3.f38163l.get(0)).f38158g + fVar3.f;
                                    int i19 = ((f) fVar4.f38163l.get(0)).f38158g - fVar4.f;
                                    if (i13 != -1) {
                                        if (i13 == 0) {
                                            int g13 = g(i19 - i18, 1);
                                            int i20 = (int) ((g13 * f13) + 0.5f);
                                            int g14 = g(i20, 0);
                                            if (i20 != g14) {
                                                g13 = (int) ((g14 / f13) + 0.5f);
                                            }
                                            gVar2.d(g14);
                                            this.f38177b.f37367e.f38180e.d(g13);
                                        }
                                    }
                                    int g15 = g(i19 - i18, 1);
                                    int i21 = (int) ((g15 / f13) + 0.5f);
                                    int g16 = g(i21, 0);
                                    if (i21 != g16) {
                                        g15 = (int) ((g16 * f13) + 0.5f);
                                    }
                                    gVar2.d(g16);
                                    this.f38177b.f37367e.f38180e.d(g15);
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    x.e eVar2 = eVar.W;
                    if (eVar2 != null) {
                        if (eVar2.f37365d.f38180e.f38161j) {
                            gVar2.d((int) ((gVar.f38158g * eVar.f37401x) + 0.5f));
                        }
                    }
                }
            }
            if (fVar.f38155c && fVar2.f38155c) {
                if (fVar.f38161j && fVar2.f38161j && gVar2.f38161j) {
                    return;
                }
                boolean z17 = gVar2.f38161j;
                ArrayList arrayList2 = fVar.f38163l;
                ArrayList arrayList3 = fVar2.f38163l;
                if (!z17 && this.f38179d == aVar) {
                    x.e eVar3 = this.f38177b;
                    if (eVar3.f37392s == 0 && !eVar3.B()) {
                        int i22 = ((f) arrayList2.get(0)).f38158g + fVar.f;
                        int i23 = ((f) arrayList3.get(0)).f38158g + fVar2.f;
                        fVar.d(i22);
                        fVar2.d(i23);
                        gVar2.d(i23 - i22);
                        return;
                    }
                }
                if (!gVar2.f38161j && this.f38179d == aVar && this.f38176a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((f) arrayList3.get(0)).f38158g + fVar2.f) - (((f) arrayList2.get(0)).f38158g + fVar.f), gVar2.f38164m);
                    x.e eVar4 = this.f38177b;
                    int i24 = eVar4.f37400w;
                    int max = Math.max(eVar4.f37398v, min);
                    if (i24 > 0) {
                        max = Math.min(i24, max);
                    }
                    gVar2.d(max);
                }
                if (!gVar2.f38161j) {
                    return;
                }
                f fVar5 = (f) arrayList2.get(0);
                f fVar6 = (f) arrayList3.get(0);
                int i25 = fVar5.f38158g;
                int i26 = fVar.f + i25;
                int i27 = fVar6.f38158g;
                int i28 = fVar2.f + i27;
                float f14 = this.f38177b.f37370g0;
                if (fVar5 == fVar6) {
                    f14 = 0.5f;
                } else {
                    i25 = i26;
                    i27 = i28;
                }
                fVar.d((int) ((((i27 - i25) - gVar2.f38158g) * f14) + i25 + 0.5f));
                fVar2.d(fVar.f38158g + gVar2.f38158g);
                return;
            }
            return;
        }
        x.e eVar5 = this.f38177b;
        l(eVar5.K, eVar5.M, 0);
    }

    @Override // y.p
    public final void d() {
        x.e eVar;
        x.e eVar2;
        e.a aVar;
        x.e eVar3;
        x.e eVar4;
        e.a aVar2;
        x.e eVar5 = this.f38177b;
        boolean z10 = eVar5.f37360a;
        g gVar = this.f38180e;
        if (z10) {
            gVar.d(eVar5.u());
        }
        boolean z11 = gVar.f38161j;
        e.a aVar3 = e.a.MATCH_CONSTRAINT;
        e.a aVar4 = e.a.MATCH_PARENT;
        e.a aVar5 = e.a.FIXED;
        f fVar = this.f38183i;
        f fVar2 = this.f38182h;
        if (!z11) {
            x.e eVar6 = this.f38177b;
            e.a aVar6 = eVar6.V[0];
            this.f38179d = aVar6;
            if (aVar6 != aVar3) {
                if (aVar6 == aVar4 && (eVar4 = eVar6.W) != null && ((aVar2 = eVar4.V[0]) == aVar5 || aVar2 == aVar4)) {
                    int u10 = (eVar4.u() - this.f38177b.K.e()) - this.f38177b.M.e();
                    p.b(fVar2, eVar4.f37365d.f38182h, this.f38177b.K.e());
                    p.b(fVar, eVar4.f37365d.f38183i, -this.f38177b.M.e());
                    gVar.d(u10);
                    return;
                } else if (aVar6 == aVar5) {
                    gVar.d(eVar6.u());
                }
            }
        } else if (this.f38179d == aVar4 && (eVar2 = (eVar = this.f38177b).W) != null && ((aVar = eVar2.V[0]) == aVar5 || aVar == aVar4)) {
            p.b(fVar2, eVar2.f37365d.f38182h, eVar.K.e());
            p.b(fVar, eVar2.f37365d.f38183i, -this.f38177b.M.e());
            return;
        }
        if (gVar.f38161j) {
            x.e eVar7 = this.f38177b;
            if (eVar7.f37360a) {
                x.d[] dVarArr = eVar7.S;
                x.d dVar = dVarArr[0];
                x.d dVar2 = dVar.f;
                if (dVar2 != null && dVarArr[1].f != null) {
                    if (eVar7.B()) {
                        fVar2.f = this.f38177b.S[0].e();
                        fVar.f = -this.f38177b.S[1].e();
                        return;
                    }
                    f h10 = p.h(this.f38177b.S[0]);
                    if (h10 != null) {
                        p.b(fVar2, h10, this.f38177b.S[0].e());
                    }
                    f h11 = p.h(this.f38177b.S[1]);
                    if (h11 != null) {
                        p.b(fVar, h11, -this.f38177b.S[1].e());
                    }
                    fVar2.f38154b = true;
                    fVar.f38154b = true;
                    return;
                } else if (dVar2 != null) {
                    f h12 = p.h(dVar);
                    if (h12 != null) {
                        p.b(fVar2, h12, this.f38177b.S[0].e());
                        p.b(fVar, fVar2, gVar.f38158g);
                        return;
                    }
                    return;
                } else {
                    x.d dVar3 = dVarArr[1];
                    if (dVar3.f != null) {
                        f h13 = p.h(dVar3);
                        if (h13 != null) {
                            p.b(fVar, h13, -this.f38177b.S[1].e());
                            p.b(fVar2, fVar, -gVar.f38158g);
                            return;
                        }
                        return;
                    } else if (!(eVar7 instanceof x.i) && eVar7.W != null && eVar7.m(d.a.CENTER).f == null) {
                        x.e eVar8 = this.f38177b;
                        p.b(fVar2, eVar8.W.f37365d.f38182h, eVar8.v());
                        p.b(fVar, fVar2, gVar.f38158g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.f38179d == aVar3) {
            x.e eVar9 = this.f38177b;
            int i6 = eVar9.f37392s;
            ArrayList arrayList = gVar.f38162k;
            ArrayList arrayList2 = gVar.f38163l;
            if (i6 != 2) {
                if (i6 == 3) {
                    if (eVar9.f37394t == 3) {
                        fVar2.f38153a = this;
                        fVar.f38153a = this;
                        n nVar = eVar9.f37367e;
                        nVar.f38182h.f38153a = this;
                        nVar.f38183i.f38153a = this;
                        gVar.f38153a = this;
                        if (eVar9.C()) {
                            arrayList2.add(this.f38177b.f37367e.f38180e);
                            this.f38177b.f37367e.f38180e.f38162k.add(gVar);
                            n nVar2 = this.f38177b.f37367e;
                            nVar2.f38180e.f38153a = this;
                            arrayList2.add(nVar2.f38182h);
                            arrayList2.add(this.f38177b.f37367e.f38183i);
                            this.f38177b.f37367e.f38182h.f38162k.add(gVar);
                            this.f38177b.f37367e.f38183i.f38162k.add(gVar);
                        } else if (this.f38177b.B()) {
                            this.f38177b.f37367e.f38180e.f38163l.add(gVar);
                            arrayList.add(this.f38177b.f37367e.f38180e);
                        } else {
                            this.f38177b.f37367e.f38180e.f38163l.add(gVar);
                        }
                    } else {
                        g gVar2 = eVar9.f37367e.f38180e;
                        arrayList2.add(gVar2);
                        gVar2.f38162k.add(gVar);
                        this.f38177b.f37367e.f38182h.f38162k.add(gVar);
                        this.f38177b.f37367e.f38183i.f38162k.add(gVar);
                        gVar.f38154b = true;
                        arrayList.add(fVar2);
                        arrayList.add(fVar);
                        fVar2.f38163l.add(gVar);
                        fVar.f38163l.add(gVar);
                    }
                }
            } else {
                x.e eVar10 = eVar9.W;
                if (eVar10 != null) {
                    g gVar3 = eVar10.f37367e.f38180e;
                    arrayList2.add(gVar3);
                    gVar3.f38162k.add(gVar);
                    gVar.f38154b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            }
        }
        x.e eVar11 = this.f38177b;
        x.d[] dVarArr2 = eVar11.S;
        x.d dVar4 = dVarArr2[0];
        x.d dVar5 = dVar4.f;
        if (dVar5 != null && dVarArr2[1].f != null) {
            if (eVar11.B()) {
                fVar2.f = this.f38177b.S[0].e();
                fVar.f = -this.f38177b.S[1].e();
                return;
            }
            f h14 = p.h(this.f38177b.S[0]);
            f h15 = p.h(this.f38177b.S[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f38184j = 4;
        } else if (dVar5 != null) {
            f h16 = p.h(dVar4);
            if (h16 != null) {
                p.b(fVar2, h16, this.f38177b.S[0].e());
                c(fVar, fVar2, 1, gVar);
            }
        } else {
            x.d dVar6 = dVarArr2[1];
            if (dVar6.f != null) {
                f h17 = p.h(dVar6);
                if (h17 != null) {
                    p.b(fVar, h17, -this.f38177b.S[1].e());
                    c(fVar2, fVar, -1, gVar);
                }
            } else if (!(eVar11 instanceof x.i) && (eVar3 = eVar11.W) != null) {
                p.b(fVar2, eVar3.f37365d.f38182h, eVar11.v());
                c(fVar, fVar2, 1, gVar);
            }
        }
    }

    @Override // y.p
    public final void e() {
        f fVar = this.f38182h;
        if (fVar.f38161j) {
            this.f38177b.f37363b0 = fVar.f38158g;
        }
    }

    @Override // y.p
    public final void f() {
        this.f38178c = null;
        this.f38182h.c();
        this.f38183i.c();
        this.f38180e.c();
        this.f38181g = false;
    }

    @Override // y.p
    public final boolean k() {
        if (this.f38179d != e.a.MATCH_CONSTRAINT || this.f38177b.f37392s == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f38181g = false;
        f fVar = this.f38182h;
        fVar.c();
        fVar.f38161j = false;
        f fVar2 = this.f38183i;
        fVar2.c();
        fVar2.f38161j = false;
        this.f38180e.f38161j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f38177b.f37380l0;
    }
}
