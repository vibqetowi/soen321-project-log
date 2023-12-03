package y;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import x.e;
import y.b;
/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final x.f f38146a;

    /* renamed from: d  reason: collision with root package name */
    public final x.f f38149d;
    public b.InterfaceC0647b f;

    /* renamed from: g  reason: collision with root package name */
    public final b.a f38151g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<m> f38152h;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38147b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38148c = true;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<p> f38150e = new ArrayList<>();

    public e(x.f fVar) {
        new ArrayList();
        this.f = null;
        this.f38151g = new b.a();
        this.f38152h = new ArrayList<>();
        this.f38146a = fVar;
        this.f38149d = fVar;
    }

    public final void a(f fVar, int i6, int i10, ArrayList arrayList, m mVar) {
        p pVar = fVar.f38156d;
        if (pVar.f38178c == null) {
            x.f fVar2 = this.f38146a;
            if (pVar != fVar2.f37365d && pVar != fVar2.f37367e) {
                if (mVar == null) {
                    mVar = new m(pVar);
                    arrayList.add(mVar);
                }
                pVar.f38178c = mVar;
                mVar.f38168b.add(pVar);
                f fVar3 = pVar.f38182h;
                Iterator it = fVar3.f38162k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        a((f) dVar, i6, 0, arrayList, mVar);
                    }
                }
                f fVar4 = pVar.f38183i;
                Iterator it2 = fVar4.f38162k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i6, 1, arrayList, mVar);
                    }
                }
                if (i6 == 1 && (pVar instanceof n)) {
                    Iterator it3 = ((n) pVar).f38169k.f38162k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i6, 2, arrayList, mVar);
                        }
                    }
                }
                Iterator it4 = fVar3.f38163l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i6, 0, arrayList, mVar);
                }
                Iterator it5 = fVar4.f38163l.iterator();
                while (it5.hasNext()) {
                    a((f) it5.next(), i6, 1, arrayList, mVar);
                }
                if (i6 == 1 && (pVar instanceof n)) {
                    Iterator it6 = ((n) pVar).f38169k.f38163l.iterator();
                    while (it6.hasNext()) {
                        a((f) it6.next(), i6, 2, arrayList, mVar);
                    }
                }
            }
        }
    }

    public final void b(x.f fVar) {
        e.a aVar;
        int i6;
        int i10;
        e.a aVar2;
        Iterator<x.e> it = fVar.f37443w0.iterator();
        while (it.hasNext()) {
            x.e next = it.next();
            e.a[] aVarArr = next.V;
            e.a aVar3 = aVarArr[0];
            e.a aVar4 = aVarArr[1];
            if (next.f37376j0 == 8) {
                next.f37360a = true;
            } else {
                float f = next.f37401x;
                e.a aVar5 = e.a.MATCH_CONSTRAINT;
                if (f < 1.0f && aVar3 == aVar5) {
                    next.f37392s = 2;
                }
                float f2 = next.A;
                if (f2 < 1.0f && aVar4 == aVar5) {
                    next.f37394t = 2;
                }
                float f10 = next.Z;
                e.a aVar6 = e.a.WRAP_CONTENT;
                e.a aVar7 = e.a.FIXED;
                if (f10 > 0.0f) {
                    if (aVar3 == aVar5 && (aVar4 == aVar6 || aVar4 == aVar7)) {
                        next.f37392s = 3;
                    } else if (aVar4 == aVar5 && (aVar3 == aVar6 || aVar3 == aVar7)) {
                        next.f37394t = 3;
                    } else if (aVar3 == aVar5 && aVar4 == aVar5) {
                        if (next.f37392s == 0) {
                            next.f37392s = 3;
                        }
                        if (next.f37394t == 0) {
                            next.f37394t = 3;
                        }
                    }
                }
                x.d dVar = next.M;
                x.d dVar2 = next.K;
                if (aVar3 == aVar5 && next.f37392s == 1 && (dVar2.f == null || dVar.f == null)) {
                    aVar3 = aVar6;
                }
                x.d dVar3 = next.N;
                x.d dVar4 = next.L;
                if (aVar4 == aVar5 && next.f37394t == 1 && (dVar4.f == null || dVar3.f == null)) {
                    aVar = aVar6;
                } else {
                    aVar = aVar4;
                }
                l lVar = next.f37365d;
                lVar.f38179d = aVar3;
                int i11 = next.f37392s;
                lVar.f38176a = i11;
                n nVar = next.f37367e;
                nVar.f38179d = aVar;
                Iterator<x.e> it2 = it;
                int i12 = next.f37394t;
                nVar.f38176a = i12;
                e.a aVar8 = e.a.MATCH_PARENT;
                if ((aVar3 != aVar8 && aVar3 != aVar7 && aVar3 != aVar6) || (aVar != aVar8 && aVar != aVar7 && aVar != aVar6)) {
                    x.d[] dVarArr = next.S;
                    if (aVar3 == aVar5 && (aVar == aVar6 || aVar == aVar7)) {
                        if (i11 == 3) {
                            if (aVar == aVar6) {
                                f(next, aVar6, 0, aVar6, 0);
                            }
                            int o10 = next.o();
                            f(next, aVar7, (int) ((o10 * next.Z) + 0.5f), aVar7, o10);
                            next.f37365d.f38180e.d(next.u());
                            next.f37367e.f38180e.d(next.o());
                            next.f37360a = true;
                        } else if (i11 == 1) {
                            f(next, aVar6, 0, aVar, 0);
                            next.f37365d.f38180e.f38164m = next.u();
                        } else if (i11 == 2) {
                            e.a aVar9 = fVar.V[0];
                            if (aVar9 == aVar7 || aVar9 == aVar8) {
                                f(next, aVar7, (int) ((f * fVar.u()) + 0.5f), aVar, next.o());
                                next.f37365d.f38180e.d(next.u());
                                next.f37367e.f38180e.d(next.o());
                                next.f37360a = true;
                            }
                        } else if (dVarArr[0].f == null || dVarArr[1].f == null) {
                            f(next, aVar6, 0, aVar, 0);
                            next.f37365d.f38180e.d(next.u());
                            next.f37367e.f38180e.d(next.o());
                            next.f37360a = true;
                        }
                    }
                    if (aVar == aVar5 && (aVar3 == aVar6 || aVar3 == aVar7)) {
                        if (i12 == 3) {
                            if (aVar3 == aVar6) {
                                f(next, aVar6, 0, aVar6, 0);
                            }
                            int u10 = next.u();
                            float f11 = next.Z;
                            if (next.f37361a0 == -1) {
                                f11 = 1.0f / f11;
                            }
                            f(next, aVar7, u10, aVar7, (int) ((u10 * f11) + 0.5f));
                            next.f37365d.f38180e.d(next.u());
                            next.f37367e.f38180e.d(next.o());
                            next.f37360a = true;
                        } else if (i12 == 1) {
                            f(next, aVar3, 0, aVar6, 0);
                            next.f37367e.f38180e.f38164m = next.o();
                        } else if (i12 == 2) {
                            e.a aVar10 = fVar.V[1];
                            if (aVar10 == aVar7 || aVar10 == aVar8) {
                                f(next, aVar3, next.u(), aVar7, (int) ((f2 * fVar.o()) + 0.5f));
                                next.f37365d.f38180e.d(next.u());
                                next.f37367e.f38180e.d(next.o());
                                next.f37360a = true;
                            }
                        } else if (dVarArr[2].f == null || dVarArr[3].f == null) {
                            f(next, aVar6, 0, aVar, 0);
                            next.f37365d.f38180e.d(next.u());
                            next.f37367e.f38180e.d(next.o());
                            next.f37360a = true;
                        }
                    }
                    if (aVar3 == aVar5 && aVar == aVar5) {
                        if (i11 != 1 && i12 != 1) {
                            if (i12 == 2 && i11 == 2) {
                                e.a[] aVarArr2 = fVar.V;
                                if (aVarArr2[0] == aVar7 && aVarArr2[1] == aVar7) {
                                    f(next, aVar7, (int) ((f * fVar.u()) + 0.5f), aVar7, (int) ((f2 * fVar.o()) + 0.5f));
                                    next.f37365d.f38180e.d(next.u());
                                    next.f37367e.f38180e.d(next.o());
                                    next.f37360a = true;
                                }
                            }
                        } else {
                            f(next, aVar6, 0, aVar6, 0);
                            next.f37365d.f38180e.f38164m = next.u();
                            next.f37367e.f38180e.f38164m = next.o();
                        }
                    }
                } else {
                    int u11 = next.u();
                    if (aVar3 == aVar8) {
                        i6 = (fVar.u() - dVar2.f37351g) - dVar.f37351g;
                        aVar3 = aVar7;
                    } else {
                        i6 = u11;
                    }
                    int o11 = next.o();
                    if (aVar == aVar8) {
                        i10 = (fVar.o() - dVar4.f37351g) - dVar3.f37351g;
                        aVar2 = aVar7;
                    } else {
                        i10 = o11;
                        aVar2 = aVar;
                    }
                    f(next, aVar3, i6, aVar2, i10);
                    next.f37365d.f38180e.d(next.u());
                    next.f37367e.f38180e.d(next.o());
                    next.f37360a = true;
                }
                it = it2;
            }
        }
    }

    public final void c() {
        ArrayList<p> arrayList = this.f38150e;
        arrayList.clear();
        x.f fVar = this.f38149d;
        fVar.f37365d.f();
        fVar.f37367e.f();
        arrayList.add(fVar.f37365d);
        arrayList.add(fVar.f37367e);
        Iterator<x.e> it = fVar.f37443w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            x.e next = it.next();
            if (next instanceof x.h) {
                arrayList.add(new j(next));
            } else {
                if (next.B()) {
                    if (next.f37362b == null) {
                        next.f37362b = new c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f37362b);
                } else {
                    arrayList.add(next.f37365d);
                }
                if (next.C()) {
                    if (next.f37364c == null) {
                        next.f37364c = new c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f37364c);
                } else {
                    arrayList.add(next.f37367e);
                }
                if (next instanceof x.j) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f38177b != fVar) {
                next2.d();
            }
        }
        ArrayList<m> arrayList2 = this.f38152h;
        arrayList2.clear();
        x.f fVar2 = this.f38146a;
        e(fVar2.f37365d, 0, arrayList2);
        e(fVar2.f37367e, 1, arrayList2);
        this.f38147b = false;
    }

    public final int d(x.f fVar, int i6) {
        long j10;
        ArrayList<m> arrayList;
        int i10;
        p pVar;
        p pVar2;
        long max;
        float f;
        long j11;
        x.f fVar2 = fVar;
        int i11 = i6;
        ArrayList<m> arrayList2 = this.f38152h;
        int size = arrayList2.size();
        int i12 = 0;
        long j12 = 0;
        while (i12 < size) {
            p pVar3 = arrayList2.get(i12).f38167a;
            if (!(pVar3 instanceof c) ? !(i11 != 0 ? (pVar3 instanceof n) : (pVar3 instanceof l)) : ((c) pVar3).f != i11) {
                j10 = 0;
                arrayList = arrayList2;
                i10 = size;
            } else {
                if (i11 == 0) {
                    pVar = fVar2.f37365d;
                } else {
                    pVar = fVar2.f37367e;
                }
                f fVar3 = pVar.f38182h;
                if (i11 == 0) {
                    pVar2 = fVar2.f37365d;
                } else {
                    pVar2 = fVar2.f37367e;
                }
                f fVar4 = pVar2.f38183i;
                boolean contains = pVar3.f38182h.f38163l.contains(fVar3);
                f fVar5 = pVar3.f38183i;
                boolean contains2 = fVar5.f38163l.contains(fVar4);
                long j13 = pVar3.j();
                f fVar6 = pVar3.f38182h;
                if (contains && contains2) {
                    long b10 = m.b(fVar6, 0L);
                    long a10 = m.a(fVar5, 0L);
                    long j14 = b10 - j13;
                    int i13 = fVar5.f;
                    arrayList = arrayList2;
                    i10 = size;
                    if (j14 >= (-i13)) {
                        j14 += i13;
                    }
                    long j15 = j14;
                    long j16 = fVar6.f;
                    long j17 = ((-a10) - j13) - j16;
                    if (j17 >= j16) {
                        j17 -= j16;
                    }
                    x.e eVar = pVar3.f38177b;
                    if (i11 == 0) {
                        f = eVar.f37370g0;
                    } else if (i11 == 1) {
                        f = eVar.f37372h0;
                    } else {
                        eVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j11 = (((float) j15) / (1.0f - f)) + (((float) j17) / f);
                    } else {
                        j11 = 0;
                    }
                    float f2 = (float) j11;
                    j10 = (fVar6.f + ((((f2 * f) + 0.5f) + j13) + defpackage.e.e(1.0f, f, f2, 0.5f))) - fVar5.f;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    if (contains) {
                        max = Math.max(m.b(fVar6, fVar6.f), fVar6.f + j13);
                    } else if (contains2) {
                        max = Math.max(-m.a(fVar5, fVar5.f), (-fVar5.f) + j13);
                    } else {
                        j10 = (pVar3.j() + fVar6.f) - fVar5.f;
                    }
                    j10 = max;
                }
            }
            j12 = Math.max(j12, j10);
            i12++;
            fVar2 = fVar;
            i11 = i6;
            arrayList2 = arrayList;
            size = i10;
        }
        return (int) j12;
    }

    public final void e(p pVar, int i6, ArrayList<m> arrayList) {
        f fVar;
        Iterator it = pVar.f38182h.f38162k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = pVar.f38183i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i6, 0, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f38182h, i6, 0, arrayList, null);
            }
        }
        Iterator it2 = fVar.f38162k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i6, 1, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f38183i, i6, 1, arrayList, null);
            }
        }
        if (i6 == 1) {
            Iterator it3 = ((n) pVar).f38169k.f38162k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i6, 2, arrayList, null);
                }
            }
        }
    }

    public final void f(x.e eVar, e.a aVar, int i6, e.a aVar2, int i10) {
        boolean z10;
        b.a aVar3 = this.f38151g;
        aVar3.f38135a = aVar;
        aVar3.f38136b = aVar2;
        aVar3.f38137c = i6;
        aVar3.f38138d = i10;
        ((ConstraintLayout.b) this.f).b(eVar, aVar3);
        eVar.R(aVar3.f38139e);
        eVar.O(aVar3.f);
        eVar.F = aVar3.f38141h;
        int i11 = aVar3.f38140g;
        eVar.f37366d0 = i11;
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.F = z10;
    }

    public final void g() {
        boolean z10;
        a aVar;
        Iterator<x.e> it = this.f38146a.f37443w0.iterator();
        while (it.hasNext()) {
            x.e next = it.next();
            if (!next.f37360a) {
                e.a[] aVarArr = next.V;
                boolean z11 = false;
                e.a aVar2 = aVarArr[0];
                e.a aVar3 = aVarArr[1];
                int i6 = next.f37392s;
                int i10 = next.f37394t;
                e.a aVar4 = e.a.WRAP_CONTENT;
                e.a aVar5 = e.a.MATCH_CONSTRAINT;
                if (aVar2 != aVar4 && (aVar2 != aVar5 || i6 != 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (aVar3 == aVar4 || (aVar3 == aVar5 && i10 == 1)) {
                    z11 = true;
                }
                g gVar = next.f37365d.f38180e;
                boolean z12 = gVar.f38161j;
                g gVar2 = next.f37367e.f38180e;
                boolean z13 = gVar2.f38161j;
                e.a aVar6 = e.a.FIXED;
                if (z12 && z13) {
                    f(next, aVar6, gVar.f38158g, aVar6, gVar2.f38158g);
                    next.f37360a = true;
                } else if (z12 && z11) {
                    f(next, aVar6, gVar.f38158g, aVar4, gVar2.f38158g);
                    if (aVar3 == aVar5) {
                        next.f37367e.f38180e.f38164m = next.o();
                    } else {
                        next.f37367e.f38180e.d(next.o());
                        next.f37360a = true;
                    }
                } else if (z13 && z10) {
                    f(next, aVar4, gVar.f38158g, aVar6, gVar2.f38158g);
                    if (aVar2 == aVar5) {
                        next.f37365d.f38180e.f38164m = next.u();
                    } else {
                        next.f37365d.f38180e.d(next.u());
                        next.f37360a = true;
                    }
                }
                if (next.f37360a && (aVar = next.f37367e.f38170l) != null) {
                    aVar.d(next.f37366d0);
                }
            }
        }
    }
}
