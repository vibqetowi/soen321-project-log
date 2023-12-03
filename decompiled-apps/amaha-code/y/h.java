package y;

import java.util.HashSet;
import java.util.Iterator;
import x.d;
import x.e;
import y.b;
/* compiled from: Direct.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f38165a = new b.a();

    public static boolean a(x.e eVar) {
        x.f fVar;
        boolean z10;
        boolean z11;
        e.a[] aVarArr = eVar.V;
        e.a aVar = aVarArr[0];
        e.a aVar2 = aVarArr[1];
        x.e eVar2 = eVar.W;
        if (eVar2 != null) {
            fVar = (x.f) eVar2;
        } else {
            fVar = null;
        }
        e.a aVar3 = e.a.FIXED;
        if (fVar != null) {
            e.a aVar4 = fVar.V[0];
        }
        if (fVar != null) {
            e.a aVar5 = fVar.V[1];
        }
        e.a aVar6 = e.a.MATCH_CONSTRAINT;
        e.a aVar7 = e.a.WRAP_CONTENT;
        if (aVar != aVar3 && !eVar.E() && aVar != aVar7 && ((aVar != aVar6 || eVar.f37392s != 0 || eVar.Z != 0.0f || !eVar.x(0)) && (aVar != aVar6 || eVar.f37392s != 1 || !eVar.y(0, eVar.u())))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (aVar2 != aVar3 && !eVar.F() && aVar2 != aVar7 && ((aVar2 != aVar6 || eVar.f37394t != 0 || eVar.Z != 0.0f || !eVar.x(1)) && (aVar2 != aVar6 || eVar.f37394t != 1 || !eVar.y(1, eVar.o())))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (eVar.Z > 0.0f && (z10 || z11)) {
            return true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public static void b(int i6, x.e eVar, b.InterfaceC0647b interfaceC0647b, boolean z10) {
        boolean z11;
        x.d dVar;
        x.d dVar2;
        Iterator<x.d> it;
        boolean z12;
        x.d dVar3;
        x.d dVar4;
        if (eVar.f37383n) {
            return;
        }
        if (!(eVar instanceof x.f) && eVar.D() && a(eVar)) {
            x.f.Y(eVar, interfaceC0647b, new b.a());
        }
        x.d m10 = eVar.m(d.a.LEFT);
        x.d m11 = eVar.m(d.a.RIGHT);
        int d10 = m10.d();
        int d11 = m11.d();
        HashSet<x.d> hashSet = m10.f37346a;
        e.a aVar = e.a.MATCH_CONSTRAINT;
        if (hashSet != null && m10.f37348c) {
            Iterator<x.d> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                x.d next = it2.next();
                x.e eVar2 = next.f37349d;
                int i10 = i6 + 1;
                boolean a10 = a(eVar2);
                if (eVar2.D() && a10) {
                    x.f.Y(eVar2, interfaceC0647b, new b.a());
                }
                x.d dVar5 = eVar2.K;
                x.d dVar6 = eVar2.M;
                if ((next == dVar5 && (dVar4 = dVar6.f) != null && dVar4.f37348c) || (next == dVar6 && (dVar3 = dVar5.f) != null && dVar3.f37348c)) {
                    it = it2;
                    z12 = true;
                } else {
                    it = it2;
                    z12 = false;
                }
                e.a aVar2 = eVar2.V[0];
                if (aVar2 == aVar && !a10) {
                    if (aVar2 == aVar && eVar2.f37400w >= 0 && eVar2.f37398v >= 0 && ((eVar2.f37376j0 == 8 || (eVar2.f37392s == 0 && eVar2.Z == 0.0f)) && !eVar2.B() && !eVar2.H && z12 && !eVar2.B())) {
                        d(i10, eVar, interfaceC0647b, eVar2, z10);
                    }
                } else if (!eVar2.D()) {
                    if (next == dVar5 && dVar6.f == null) {
                        int e10 = dVar5.e() + d10;
                        eVar2.M(e10, eVar2.u() + e10);
                        b(i10, eVar2, interfaceC0647b, z10);
                    } else if (next == dVar6 && dVar5.f == null) {
                        int e11 = d10 - dVar6.e();
                        eVar2.M(e11 - eVar2.u(), e11);
                        b(i10, eVar2, interfaceC0647b, z10);
                    } else if (z12 && !eVar2.B()) {
                        c(i10, eVar2, interfaceC0647b, z10);
                    }
                }
                it2 = it;
            }
        }
        if (eVar instanceof x.h) {
            return;
        }
        HashSet<x.d> hashSet2 = m11.f37346a;
        if (hashSet2 != null && m11.f37348c) {
            Iterator<x.d> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                x.d next2 = it3.next();
                x.e eVar3 = next2.f37349d;
                int i11 = i6 + 1;
                boolean a11 = a(eVar3);
                if (eVar3.D() && a11) {
                    x.f.Y(eVar3, interfaceC0647b, new b.a());
                }
                x.d dVar7 = eVar3.K;
                x.d dVar8 = eVar3.M;
                if ((next2 == dVar7 && (dVar2 = dVar8.f) != null && dVar2.f37348c) || (next2 == dVar8 && (dVar = dVar7.f) != null && dVar.f37348c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e.a aVar3 = eVar3.V[0];
                if (aVar3 == aVar && !a11) {
                    if (aVar3 == aVar && eVar3.f37400w >= 0 && eVar3.f37398v >= 0) {
                        if (eVar3.f37376j0 != 8) {
                            if (eVar3.f37392s == 0) {
                                if (eVar3.Z == 0.0f) {
                                }
                            }
                        }
                        if (!eVar3.B() && !eVar3.H && z11 && !eVar3.B()) {
                            d(i11, eVar, interfaceC0647b, eVar3, z10);
                        }
                    }
                } else if (!eVar3.D()) {
                    if (next2 == dVar7 && dVar8.f == null) {
                        int e12 = dVar7.e() + d11;
                        eVar3.M(e12, eVar3.u() + e12);
                        b(i11, eVar3, interfaceC0647b, z10);
                    } else if (next2 == dVar8 && dVar7.f == null) {
                        int e13 = d11 - dVar8.e();
                        eVar3.M(e13 - eVar3.u(), e13);
                        b(i11, eVar3, interfaceC0647b, z10);
                    } else if (z11 && !eVar3.B()) {
                        c(i11, eVar3, interfaceC0647b, z10);
                    }
                }
            }
        }
        eVar.f37383n = true;
    }

    public static void c(int i6, x.e eVar, b.InterfaceC0647b interfaceC0647b, boolean z10) {
        float f;
        float f2 = eVar.f37370g0;
        x.d dVar = eVar.K;
        int d10 = dVar.f.d();
        x.d dVar2 = eVar.M;
        int d11 = dVar2.f.d();
        int e10 = dVar.e() + d10;
        int e11 = d11 - dVar2.e();
        if (d10 == d11) {
            f2 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int u10 = eVar.u();
        int i10 = (d11 - d10) - u10;
        if (d10 > d11) {
            i10 = (d10 - d11) - u10;
        }
        if (i10 > 0) {
            f = (f2 * i10) + 0.5f;
        } else {
            f = f2 * i10;
        }
        int i11 = ((int) f) + d10;
        int i12 = i11 + u10;
        if (d10 > d11) {
            i12 = i11 - u10;
        }
        eVar.M(i11, i12);
        b(i6 + 1, eVar, interfaceC0647b, z10);
    }

    public static void d(int i6, x.e eVar, b.InterfaceC0647b interfaceC0647b, x.e eVar2, boolean z10) {
        int u10;
        float f = eVar2.f37370g0;
        x.d dVar = eVar2.K;
        int e10 = dVar.e() + dVar.f.d();
        x.d dVar2 = eVar2.M;
        int d10 = dVar2.f.d() - dVar2.e();
        if (d10 >= e10) {
            int u11 = eVar2.u();
            if (eVar2.f37376j0 != 8) {
                int i10 = eVar2.f37392s;
                if (i10 == 2) {
                    if (eVar instanceof x.f) {
                        u10 = eVar.u();
                    } else {
                        u10 = eVar.W.u();
                    }
                    u11 = (int) (eVar2.f37370g0 * 0.5f * u10);
                } else if (i10 == 0) {
                    u11 = d10 - e10;
                }
                u11 = Math.max(eVar2.f37398v, u11);
                int i11 = eVar2.f37400w;
                if (i11 > 0) {
                    u11 = Math.min(i11, u11);
                }
            }
            int i12 = e10 + ((int) ((f * ((d10 - e10) - u11)) + 0.5f));
            eVar2.M(i12, u11 + i12);
            b(i6 + 1, eVar2, interfaceC0647b, z10);
        }
    }

    public static void e(int i6, x.e eVar, b.InterfaceC0647b interfaceC0647b) {
        float f;
        float f2 = eVar.f37372h0;
        x.d dVar = eVar.L;
        int d10 = dVar.f.d();
        x.d dVar2 = eVar.N;
        int d11 = dVar2.f.d();
        int e10 = dVar.e() + d10;
        int e11 = d11 - dVar2.e();
        if (d10 == d11) {
            f2 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int o10 = eVar.o();
        int i10 = (d11 - d10) - o10;
        if (d10 > d11) {
            i10 = (d10 - d11) - o10;
        }
        if (i10 > 0) {
            f = (f2 * i10) + 0.5f;
        } else {
            f = f2 * i10;
        }
        int i11 = (int) f;
        int i12 = d10 + i11;
        int i13 = i12 + o10;
        if (d10 > d11) {
            i12 = d10 - i11;
            i13 = i12 - o10;
        }
        eVar.N(i12, i13);
        g(i6 + 1, eVar, interfaceC0647b);
    }

    public static void f(int i6, x.e eVar, b.InterfaceC0647b interfaceC0647b, x.e eVar2) {
        int o10;
        float f = eVar2.f37372h0;
        x.d dVar = eVar2.L;
        int e10 = dVar.e() + dVar.f.d();
        x.d dVar2 = eVar2.N;
        int d10 = dVar2.f.d() - dVar2.e();
        if (d10 >= e10) {
            int o11 = eVar2.o();
            if (eVar2.f37376j0 != 8) {
                int i10 = eVar2.f37394t;
                if (i10 == 2) {
                    if (eVar instanceof x.f) {
                        o10 = eVar.o();
                    } else {
                        o10 = eVar.W.o();
                    }
                    o11 = (int) (f * 0.5f * o10);
                } else if (i10 == 0) {
                    o11 = d10 - e10;
                }
                o11 = Math.max(eVar2.f37402y, o11);
                int i11 = eVar2.f37403z;
                if (i11 > 0) {
                    o11 = Math.min(i11, o11);
                }
            }
            int i12 = e10 + ((int) ((f * ((d10 - e10) - o11)) + 0.5f));
            eVar2.N(i12, o11 + i12);
            g(i6 + 1, eVar2, interfaceC0647b);
        }
    }

    public static void g(int i6, x.e eVar, b.InterfaceC0647b interfaceC0647b) {
        x.d dVar;
        boolean z10;
        x.d dVar2;
        x.d dVar3;
        boolean z11;
        x.d dVar4;
        x.d dVar5;
        if (eVar.f37385o) {
            return;
        }
        if (!(eVar instanceof x.f) && eVar.D() && a(eVar)) {
            x.f.Y(eVar, interfaceC0647b, new b.a());
        }
        x.d m10 = eVar.m(d.a.TOP);
        x.d m11 = eVar.m(d.a.BOTTOM);
        int d10 = m10.d();
        int d11 = m11.d();
        HashSet<x.d> hashSet = m10.f37346a;
        e.a aVar = e.a.MATCH_CONSTRAINT;
        if (hashSet != null && m10.f37348c) {
            Iterator<x.d> it = hashSet.iterator();
            while (it.hasNext()) {
                x.d next = it.next();
                x.e eVar2 = next.f37349d;
                int i10 = i6 + 1;
                boolean a10 = a(eVar2);
                if (eVar2.D() && a10) {
                    x.f.Y(eVar2, interfaceC0647b, new b.a());
                }
                x.d dVar6 = eVar2.L;
                x.d dVar7 = eVar2.N;
                if ((next == dVar6 && (dVar5 = dVar7.f) != null && dVar5.f37348c) || (next == dVar7 && (dVar4 = dVar6.f) != null && dVar4.f37348c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e.a aVar2 = eVar2.V[1];
                if (aVar2 == aVar && !a10) {
                    if (aVar2 == aVar && eVar2.f37403z >= 0 && eVar2.f37402y >= 0 && (eVar2.f37376j0 == 8 || (eVar2.f37394t == 0 && eVar2.Z == 0.0f))) {
                        if (!eVar2.C() && !eVar2.H && z11 && !eVar2.C()) {
                            f(i10, eVar, interfaceC0647b, eVar2);
                        }
                    }
                } else if (!eVar2.D()) {
                    if (next == dVar6 && dVar7.f == null) {
                        int e10 = dVar6.e() + d10;
                        eVar2.N(e10, eVar2.o() + e10);
                        g(i10, eVar2, interfaceC0647b);
                    } else if (next == dVar7 && dVar6.f == null) {
                        int e11 = d10 - dVar7.e();
                        eVar2.N(e11 - eVar2.o(), e11);
                        g(i10, eVar2, interfaceC0647b);
                    } else if (z11 && !eVar2.C()) {
                        e(i10, eVar2, interfaceC0647b);
                    }
                }
            }
        }
        if (eVar instanceof x.h) {
            return;
        }
        HashSet<x.d> hashSet2 = m11.f37346a;
        if (hashSet2 != null && m11.f37348c) {
            Iterator<x.d> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                x.d next2 = it2.next();
                x.e eVar3 = next2.f37349d;
                int i11 = i6 + 1;
                boolean a11 = a(eVar3);
                if (eVar3.D() && a11) {
                    x.f.Y(eVar3, interfaceC0647b, new b.a());
                }
                x.d dVar8 = eVar3.L;
                x.d dVar9 = eVar3.N;
                if ((next2 == dVar8 && (dVar3 = dVar9.f) != null && dVar3.f37348c) || (next2 == dVar9 && (dVar2 = dVar8.f) != null && dVar2.f37348c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e.a aVar3 = eVar3.V[1];
                if (aVar3 == aVar && !a11) {
                    if (aVar3 == aVar && eVar3.f37403z >= 0 && eVar3.f37402y >= 0) {
                        if (eVar3.f37376j0 != 8) {
                            if (eVar3.f37394t == 0) {
                                if (eVar3.Z == 0.0f) {
                                }
                            }
                        }
                        if (!eVar3.C() && !eVar3.H && z10 && !eVar3.C()) {
                            f(i11, eVar, interfaceC0647b, eVar3);
                        }
                    }
                } else if (!eVar3.D()) {
                    if (next2 == dVar8 && dVar9.f == null) {
                        int e12 = dVar8.e() + d11;
                        eVar3.N(e12, eVar3.o() + e12);
                        g(i11, eVar3, interfaceC0647b);
                    } else if (next2 == dVar9 && dVar8.f == null) {
                        int e13 = d11 - dVar9.e();
                        eVar3.N(e13 - eVar3.o(), e13);
                        g(i11, eVar3, interfaceC0647b);
                    } else if (z10 && !eVar3.C()) {
                        e(i11, eVar3, interfaceC0647b);
                    }
                }
            }
        }
        x.d m12 = eVar.m(d.a.BASELINE);
        if (m12.f37346a != null && m12.f37348c) {
            int d12 = m12.d();
            Iterator<x.d> it3 = m12.f37346a.iterator();
            while (it3.hasNext()) {
                x.d next3 = it3.next();
                x.e eVar4 = next3.f37349d;
                int i12 = i6 + 1;
                boolean a12 = a(eVar4);
                if (eVar4.D() && a12) {
                    x.f.Y(eVar4, interfaceC0647b, new b.a());
                }
                if (eVar4.V[1] != aVar || a12) {
                    if (!eVar4.D() && next3 == (dVar = eVar4.O)) {
                        int e14 = next3.e() + d12;
                        if (eVar4.F) {
                            int i13 = e14 - eVar4.f37366d0;
                            int i14 = eVar4.Y + i13;
                            eVar4.c0 = i13;
                            eVar4.L.l(i13);
                            eVar4.N.l(i14);
                            dVar.l(e14);
                            eVar4.f37381m = true;
                        }
                        g(i12, eVar4, interfaceC0647b);
                    }
                }
            }
        }
        eVar.f37385o = true;
    }
}
