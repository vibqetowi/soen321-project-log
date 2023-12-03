package x;

import java.util.HashMap;
import r1.b0;
import x.d;
import x.e;
/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: y0  reason: collision with root package name */
    public int f37328y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f37329z0 = true;
    public int A0 = 0;
    public boolean B0 = false;

    @Override // x.e
    public final boolean E() {
        return this.B0;
    }

    @Override // x.e
    public final boolean F() {
        return this.B0;
    }

    public final boolean V() {
        int i6;
        int i10;
        int i11;
        int i12 = 0;
        boolean z10 = true;
        while (true) {
            i6 = this.f37439x0;
            if (i12 >= i6) {
                break;
            }
            e eVar = this.f37438w0[i12];
            if ((this.f37329z0 || eVar.f()) && ((((i10 = this.f37328y0) == 0 || i10 == 1) && !eVar.E()) || (((i11 = this.f37328y0) == 2 || i11 == 3) && !eVar.F()))) {
                z10 = false;
            }
            i12++;
        }
        if (!z10 || i6 <= 0) {
            return false;
        }
        int i13 = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f37439x0; i14++) {
            e eVar2 = this.f37438w0[i14];
            if (this.f37329z0 || eVar2.f()) {
                d.a aVar = d.a.BOTTOM;
                d.a aVar2 = d.a.TOP;
                d.a aVar3 = d.a.RIGHT;
                d.a aVar4 = d.a.LEFT;
                if (!z11) {
                    int i15 = this.f37328y0;
                    if (i15 == 0) {
                        i13 = eVar2.m(aVar4).d();
                    } else if (i15 == 1) {
                        i13 = eVar2.m(aVar3).d();
                    } else if (i15 == 2) {
                        i13 = eVar2.m(aVar2).d();
                    } else if (i15 == 3) {
                        i13 = eVar2.m(aVar).d();
                    }
                    z11 = true;
                }
                int i16 = this.f37328y0;
                if (i16 == 0) {
                    i13 = Math.min(i13, eVar2.m(aVar4).d());
                } else if (i16 == 1) {
                    i13 = Math.max(i13, eVar2.m(aVar3).d());
                } else if (i16 == 2) {
                    i13 = Math.min(i13, eVar2.m(aVar2).d());
                } else if (i16 == 3) {
                    i13 = Math.max(i13, eVar2.m(aVar).d());
                }
            }
        }
        int i17 = i13 + this.A0;
        int i18 = this.f37328y0;
        if (i18 != 0 && i18 != 1) {
            N(i17, i17);
        } else {
            M(i17, i17);
        }
        this.B0 = true;
        return true;
    }

    public final int W() {
        int i6 = this.f37328y0;
        if (i6 != 0 && i6 != 1) {
            if (i6 == 2 || i6 == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // x.e
    public final void e(v.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i6;
        int i10;
        int i11;
        d[] dVarArr = this.S;
        d dVar2 = this.K;
        dVarArr[0] = dVar2;
        int i12 = 2;
        d dVar3 = this.L;
        dVarArr[2] = dVar3;
        d dVar4 = this.M;
        dVarArr[1] = dVar4;
        d dVar5 = this.N;
        dVarArr[3] = dVar5;
        for (d dVar6 : dVarArr) {
            dVar6.f37353i = dVar.k(dVar6);
        }
        int i13 = this.f37328y0;
        if (i13 >= 0 && i13 < 4) {
            d dVar7 = dVarArr[i13];
            if (!this.B0) {
                V();
            }
            if (this.B0) {
                this.B0 = false;
                int i14 = this.f37328y0;
                if (i14 != 0 && i14 != 1) {
                    if (i14 == 2 || i14 == 3) {
                        dVar.d(dVar3.f37353i, this.c0);
                        dVar.d(dVar5.f37353i, this.c0);
                        return;
                    }
                    return;
                }
                dVar.d(dVar2.f37353i, this.f37363b0);
                dVar.d(dVar4.f37353i, this.f37363b0);
                return;
            }
            for (int i15 = 0; i15 < this.f37439x0; i15++) {
                e eVar = this.f37438w0[i15];
                if (this.f37329z0 || eVar.f()) {
                    int i16 = this.f37328y0;
                    e.a aVar = e.a.MATCH_CONSTRAINT;
                    if (((i16 == 0 || i16 == 1) && eVar.V[0] == aVar && eVar.K.f != null && eVar.M.f != null) || ((i16 == 2 || i16 == 3) && eVar.V[1] == aVar && eVar.L.f != null && eVar.N.f != null)) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            if (!dVar2.g() && !dVar4.g()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!dVar3.g() && !dVar5.g()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z11 && (((i11 = this.f37328y0) == 0 && z12) || ((i11 == 2 && z13) || ((i11 == 1 && z12) || (i11 == 3 && z13))))) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                i6 = 4;
            } else {
                i6 = 5;
            }
            int i17 = 0;
            while (i17 < this.f37439x0) {
                e eVar2 = this.f37438w0[i17];
                if (this.f37329z0 || eVar2.f()) {
                    v.i k10 = dVar.k(eVar2.S[this.f37328y0]);
                    int i18 = this.f37328y0;
                    d dVar8 = eVar2.S[i18];
                    dVar8.f37353i = k10;
                    d dVar9 = dVar8.f;
                    if (dVar9 != null && dVar9.f37349d == this) {
                        i10 = dVar8.f37351g + 0;
                    } else {
                        i10 = 0;
                    }
                    if (i18 != 0 && i18 != i12) {
                        v.b l2 = dVar.l();
                        v.i m10 = dVar.m();
                        m10.f34663x = 0;
                        l2.c(dVar7.f37353i, k10, m10, this.A0 + i10);
                        dVar.c(l2);
                    } else {
                        v.b l10 = dVar.l();
                        v.i m11 = dVar.m();
                        m11.f34663x = 0;
                        l10.d(dVar7.f37353i, k10, m11, this.A0 - i10);
                        dVar.c(l10);
                    }
                    dVar.e(dVar7.f37353i, k10, this.A0 + i10, i6);
                }
                i17++;
                i12 = 2;
            }
            int i19 = this.f37328y0;
            if (i19 == 0) {
                dVar.e(dVar4.f37353i, dVar2.f37353i, 0, 8);
                dVar.e(dVar2.f37353i, this.W.M.f37353i, 0, 4);
                dVar.e(dVar2.f37353i, this.W.K.f37353i, 0, 0);
            } else if (i19 == 1) {
                dVar.e(dVar2.f37353i, dVar4.f37353i, 0, 8);
                dVar.e(dVar2.f37353i, this.W.K.f37353i, 0, 4);
                dVar.e(dVar2.f37353i, this.W.M.f37353i, 0, 0);
            } else if (i19 == 2) {
                dVar.e(dVar5.f37353i, dVar3.f37353i, 0, 8);
                dVar.e(dVar3.f37353i, this.W.N.f37353i, 0, 4);
                dVar.e(dVar3.f37353i, this.W.L.f37353i, 0, 0);
            } else if (i19 == 3) {
                dVar.e(dVar3.f37353i, dVar5.f37353i, 0, 8);
                dVar.e(dVar3.f37353i, this.W.L.f37353i, 0, 4);
                dVar.e(dVar3.f37353i, this.W.N.f37353i, 0, 0);
            }
        }
    }

    @Override // x.e
    public final boolean f() {
        return true;
    }

    @Override // x.j, x.e
    public final void j(e eVar, HashMap<e, e> hashMap) {
        super.j(eVar, hashMap);
        a aVar = (a) eVar;
        this.f37328y0 = aVar.f37328y0;
        this.f37329z0 = aVar.f37329z0;
        this.A0 = aVar.A0;
    }

    @Override // x.e
    public final String toString() {
        String b10 = b0.b(new StringBuilder("[Barrier] "), this.f37380l0, " {");
        for (int i6 = 0; i6 < this.f37439x0; i6++) {
            e eVar = this.f37438w0[i6];
            if (i6 > 0) {
                b10 = pl.a.f(b10, ", ");
            }
            StringBuilder c10 = v.h.c(b10);
            c10.append(eVar.f37380l0);
            b10 = c10.toString();
        }
        return pl.a.f(b10, "}");
    }
}
