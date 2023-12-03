package xt;

import gt.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import st.d;
import wu.b0;
import wu.c0;
import wu.d1;
import wu.h0;
import wu.i0;
import wu.k1;
import wu.m1;
import wu.n1;
import wu.x0;
import xt.w;
/* compiled from: typeEnhancement.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final st.d f38012a = d.a.f31956a;

    /* compiled from: typeEnhancement.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f38013a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38014b;

        public a(m1 m1Var, int i6) {
            this.f38013a = m1Var;
            this.f38014b = i6;
        }
    }

    /* compiled from: typeEnhancement.kt */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final i0 f38015a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38016b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f38017c;

        public b(i0 i0Var, int i6, boolean z10) {
            this.f38015a = i0Var;
            this.f38016b = i6;
            this.f38017c = z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e1  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b a(i0 i0Var, xt.b bVar, int i6, int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        gt.e eVar;
        boolean z15;
        Boolean bool;
        x0 O0;
        int i11;
        Iterator<T> it;
        ArrayList arrayList;
        boolean z16;
        boolean z17;
        int size;
        ht.h hVar;
        boolean P0;
        boolean z18;
        boolean z19;
        a aVar;
        b0 b0Var;
        zu.k kVar;
        int i12;
        xt.b bVar2 = bVar;
        defpackage.d.j(i10, "<this>");
        ?? r62 = 0;
        if (i10 != 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && z10) {
            z13 = false;
        } else {
            z13 = true;
        }
        m1 m1Var = null;
        if (!z12 && i0Var.M0().isEmpty()) {
            return new b(null, 1, false);
        }
        gt.g a10 = i0Var.O0().a();
        if (a10 == null) {
            return new b(null, 1, false);
        }
        g gVar = (g) bVar2.invoke(Integer.valueOf(i6));
        ht.i iVar = w.f38090a;
        defpackage.d.j(i10, "<this>");
        if (i10 != 3) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 && (a10 instanceof gt.e)) {
            if (gVar.f38020b == h.READ_ONLY && i10 == 1) {
                gt.e eVar2 = (gt.e) a10;
                String str = ft.c.f15851a;
                fu.d g5 = iu.g.g(eVar2);
                HashMap<fu.d, fu.c> hashMap = ft.c.f15859j;
                if (hashMap.containsKey(g5)) {
                    fu.c cVar = hashMap.get(iu.g.g(eVar2));
                    if (cVar != null) {
                        eVar = mu.a.e(eVar2).j(cVar);
                        defpackage.d.j(i10, "<this>");
                        if (i10 != 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            j jVar = gVar.f38019a;
                            if (jVar == null) {
                                i12 = -1;
                            } else {
                                i12 = w.a.f38092a[jVar.ordinal()];
                            }
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    bool = Boolean.FALSE;
                                }
                            } else {
                                bool = Boolean.TRUE;
                            }
                            if (eVar != null || (O0 = eVar.l()) == null) {
                                O0 = i0Var.O0();
                            }
                            kotlin.jvm.internal.i.f(O0, "enhancedClassifier?.typeConstructor ?: constructor");
                            i11 = i6 + 1;
                            List<d1> M0 = i0Var.M0();
                            List<v0> parameters = O0.getParameters();
                            kotlin.jvm.internal.i.f(parameters, "typeConstructor.parameters");
                            it = parameters.iterator();
                            arrayList = new ArrayList(Math.min(is.i.H1(M0, 10), is.i.H1(parameters, 10)));
                            while (r13.hasNext() && it.hasNext()) {
                                v0 v0Var = (v0) it.next();
                                d1 d1Var = (d1) r14;
                                if (z13) {
                                    aVar = new a(m1Var, r62);
                                } else if (!d1Var.d()) {
                                    aVar = b(d1Var.a().R0(), bVar2, i11, z11);
                                } else if (((g) bVar2.invoke(Integer.valueOf(i11))).f38019a == j.FORCE_FLEXIBILITY) {
                                    m1 R0 = d1Var.a().R0();
                                    aVar = new a(c0.c(ca.a.V0(R0).S0(r62), ca.a.A1(R0).S0(true)), 1);
                                } else {
                                    aVar = new a(null, 1);
                                }
                                i11 += aVar.f38014b;
                                b0Var = aVar.f38013a;
                                if (b0Var == null) {
                                    n1 b10 = d1Var.b();
                                    kotlin.jvm.internal.i.f(b10, "arg.projectionKind");
                                    kVar = hc.d.n(b0Var, b10, v0Var);
                                } else if (eVar != null && !d1Var.d()) {
                                    b0 a11 = d1Var.a();
                                    kotlin.jvm.internal.i.f(a11, "arg.type");
                                    n1 b11 = d1Var.b();
                                    kotlin.jvm.internal.i.f(b11, "arg.projectionKind");
                                    kVar = hc.d.n(a11, b11, v0Var);
                                } else if (eVar != null) {
                                    kVar = k1.m(v0Var);
                                } else {
                                    kVar = null;
                                }
                                arrayList.add(kVar);
                                bVar2 = bVar;
                                r62 = 0;
                                m1Var = null;
                            }
                            int i13 = i11 - i6;
                            if (eVar == null && bool == null) {
                                if (!arrayList.isEmpty()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        if (((d1) it2.next()) == null) {
                                            z19 = true;
                                            continue;
                                        } else {
                                            z19 = false;
                                            continue;
                                        }
                                        if (!z19) {
                                            z18 = false;
                                            break;
                                        }
                                    }
                                }
                                z18 = true;
                                if (z18) {
                                    return new b(null, i13, false);
                                }
                            }
                            boolean z20 = false;
                            ht.h[] hVarArr = new ht.h[3];
                            hVarArr[0] = i0Var.getAnnotations();
                            ht.i iVar2 = w.f38091b;
                            if (eVar == null) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (!z16) {
                                iVar2 = null;
                            }
                            hVarArr[1] = iVar2;
                            ht.i iVar3 = w.f38090a;
                            if (bool == null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (!z17) {
                                iVar3 = null;
                            }
                            hVarArr[2] = iVar3;
                            ArrayList R1 = is.k.R1(hVarArr);
                            size = R1.size();
                            if (size == 0) {
                                if (size != 1) {
                                    hVar = new ht.k(is.u.I2(R1));
                                } else {
                                    hVar = (ht.h) is.u.y2(R1);
                                }
                                wu.v0 v12 = ca.a.v1(hVar);
                                List<d1> M02 = i0Var.M0();
                                Iterator it3 = arrayList.iterator();
                                Iterator<T> it4 = M02.iterator();
                                ArrayList arrayList2 = new ArrayList(Math.min(is.i.H1(arrayList, 10), is.i.H1(M02, 10)));
                                while (it3.hasNext() && it4.hasNext()) {
                                    Object next = it3.next();
                                    d1 d1Var2 = (d1) it4.next();
                                    d1 d1Var3 = (d1) next;
                                    if (d1Var3 != null) {
                                        d1Var2 = d1Var3;
                                    }
                                    arrayList2.add(d1Var2);
                                }
                                if (bool != null) {
                                    P0 = bool.booleanValue();
                                } else {
                                    P0 = i0Var.P0();
                                }
                                i0 f = c0.f(v12, O0, arrayList2, P0, null);
                                if (gVar.f38021c) {
                                    this.f38012a.a();
                                    f = new i(f);
                                }
                                if (bool != null && gVar.f38022d) {
                                    z20 = true;
                                }
                                return new b(f, i13, z20);
                            }
                            throw new IllegalStateException("At least one Annotations object expected".toString());
                        }
                        bool = null;
                        if (eVar != null) {
                        }
                        O0 = i0Var.O0();
                        kotlin.jvm.internal.i.f(O0, "enhancedClassifier?.typeConstructor ?: constructor");
                        i11 = i6 + 1;
                        List<d1> M03 = i0Var.M0();
                        List<v0> parameters2 = O0.getParameters();
                        kotlin.jvm.internal.i.f(parameters2, "typeConstructor.parameters");
                        it = parameters2.iterator();
                        arrayList = new ArrayList(Math.min(is.i.H1(M03, 10), is.i.H1(parameters2, 10)));
                        for (Object obj : M03) {
                            v0 v0Var2 = (v0) it.next();
                            d1 d1Var4 = (d1) obj;
                            if (z13) {
                            }
                            i11 += aVar.f38014b;
                            b0Var = aVar.f38013a;
                            if (b0Var == null) {
                            }
                            arrayList.add(kVar);
                            bVar2 = bVar;
                            r62 = 0;
                            m1Var = null;
                        }
                        int i132 = i11 - i6;
                        if (eVar == null) {
                            if (!arrayList.isEmpty()) {
                            }
                            z18 = true;
                            if (z18) {
                            }
                        }
                        boolean z202 = false;
                        ht.h[] hVarArr2 = new ht.h[3];
                        hVarArr2[0] = i0Var.getAnnotations();
                        ht.i iVar22 = w.f38091b;
                        if (eVar == null) {
                        }
                        if (!z16) {
                        }
                        hVarArr2[1] = iVar22;
                        ht.i iVar32 = w.f38090a;
                        if (bool == null) {
                        }
                        if (!z17) {
                        }
                        hVarArr2[2] = iVar32;
                        ArrayList R12 = is.k.R1(hVarArr2);
                        size = R12.size();
                        if (size == 0) {
                        }
                    } else {
                        throw new IllegalArgumentException("Given class " + eVar2 + " is not a mutable collection");
                    }
                }
            }
            if (gVar.f38020b == h.MUTABLE && i10 == 2) {
                gt.e eVar3 = (gt.e) a10;
                String str2 = ft.c.f15851a;
                if (ft.c.f15860k.containsKey(iu.g.g(eVar3))) {
                    eVar = ca.a.G(eVar3);
                    defpackage.d.j(i10, "<this>");
                    if (i10 != 3) {
                    }
                    if (z15) {
                    }
                    bool = null;
                    if (eVar != null) {
                    }
                    O0 = i0Var.O0();
                    kotlin.jvm.internal.i.f(O0, "enhancedClassifier?.typeConstructor ?: constructor");
                    i11 = i6 + 1;
                    List<d1> M032 = i0Var.M0();
                    List<v0> parameters22 = O0.getParameters();
                    kotlin.jvm.internal.i.f(parameters22, "typeConstructor.parameters");
                    it = parameters22.iterator();
                    arrayList = new ArrayList(Math.min(is.i.H1(M032, 10), is.i.H1(parameters22, 10)));
                    while (r13.hasNext()) {
                    }
                    int i1322 = i11 - i6;
                    if (eVar == null) {
                    }
                    boolean z2022 = false;
                    ht.h[] hVarArr22 = new ht.h[3];
                    hVarArr22[0] = i0Var.getAnnotations();
                    ht.i iVar222 = w.f38091b;
                    if (eVar == null) {
                    }
                    if (!z16) {
                    }
                    hVarArr22[1] = iVar222;
                    ht.i iVar322 = w.f38090a;
                    if (bool == null) {
                    }
                    if (!z17) {
                    }
                    hVarArr22[2] = iVar322;
                    ArrayList R122 = is.k.R1(hVarArr22);
                    size = R122.size();
                    if (size == 0) {
                    }
                }
            }
        }
        eVar = null;
        defpackage.d.j(i10, "<this>");
        if (i10 != 3) {
        }
        if (z15) {
        }
        bool = null;
        if (eVar != null) {
        }
        O0 = i0Var.O0();
        kotlin.jvm.internal.i.f(O0, "enhancedClassifier?.typeConstructor ?: constructor");
        i11 = i6 + 1;
        List<d1> M0322 = i0Var.M0();
        List<v0> parameters222 = O0.getParameters();
        kotlin.jvm.internal.i.f(parameters222, "typeConstructor.parameters");
        it = parameters222.iterator();
        arrayList = new ArrayList(Math.min(is.i.H1(M0322, 10), is.i.H1(parameters222, 10)));
        while (r13.hasNext()) {
        }
        int i13222 = i11 - i6;
        if (eVar == null) {
        }
        boolean z20222 = false;
        ht.h[] hVarArr222 = new ht.h[3];
        hVarArr222[0] = i0Var.getAnnotations();
        ht.i iVar2222 = w.f38091b;
        if (eVar == null) {
        }
        if (!z16) {
        }
        hVarArr222[1] = iVar2222;
        ht.i iVar3222 = w.f38090a;
        if (bool == null) {
        }
        if (!z17) {
        }
        hVarArr222[2] = iVar3222;
        ArrayList R1222 = is.k.R1(hVarArr222);
        size = R1222.size();
        if (size == 0) {
        }
    }

    public final a b(m1 m1Var, xt.b bVar, int i6, boolean z10) {
        b0 b0Var;
        m1 m1Var2 = null;
        if (ta.v.E(m1Var)) {
            return new a(null, 1);
        }
        if (m1Var instanceof wu.v) {
            boolean z11 = m1Var instanceof h0;
            wu.v vVar = (wu.v) m1Var;
            b a10 = a(vVar.f37298v, bVar, i6, 1, z11, z10);
            b a11 = a(vVar.f37299w, bVar, i6, 2, z11, z10);
            i0 i0Var = a11.f38015a;
            i0 i0Var2 = a10.f38015a;
            if (i0Var2 != null || i0Var != null) {
                if (!a10.f38017c && !a11.f38017c) {
                    i0 i0Var3 = vVar.f37299w;
                    i0 i0Var4 = vVar.f37298v;
                    i0 i0Var5 = i0Var2;
                    if (z11) {
                        i0 i0Var6 = i0Var2;
                        if (i0Var2 == null) {
                            i0Var6 = i0Var4;
                        }
                        if (i0Var == null) {
                            i0Var = i0Var3;
                        }
                        m1Var2 = new ut.g(i0Var6, i0Var);
                    } else {
                        if (i0Var2 == null) {
                            i0Var5 = i0Var4;
                        }
                        if (i0Var == null) {
                            i0Var = i0Var3;
                        }
                        m1Var2 = c0.c(i0Var5, i0Var);
                    }
                } else {
                    if (i0Var != null) {
                        if (i0Var2 == null) {
                            i0Var2 = i0Var;
                        }
                        b0Var = c0.c(i0Var2, i0Var);
                    } else {
                        kotlin.jvm.internal.i.d(i0Var2);
                        b0Var = i0Var2;
                    }
                    m1Var2 = ca.a.C1(m1Var, b0Var);
                }
            }
            return new a(m1Var2, a10.f38016b);
        } else if (m1Var instanceof i0) {
            b a12 = a((i0) m1Var, bVar, i6, 3, false, z10);
            boolean z12 = a12.f38017c;
            m1 m1Var3 = a12.f38015a;
            if (z12) {
                m1Var3 = ca.a.C1(m1Var, m1Var3);
            }
            return new a(m1Var3, a12.f38016b);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
