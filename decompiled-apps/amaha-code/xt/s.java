package xt;

import gt.b;
import gt.k0;
import gt.n0;
import gt.v0;
import gt.z0;
import ht.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.y;
import kt.m0;
import pt.e0;
import pt.h0;
import pt.z;
import t0.l0;
import wu.b0;
import wu.k1;
import wu.n1;
import xt.a;
import xu.a;
/* compiled from: signatureEnhancement.kt */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final f f38077a;

    public s(f fVar) {
        this.f38077a = fVar;
    }

    public final b0 a(gt.b bVar, ht.a aVar, boolean z10, q.f fVar, pt.c cVar, v vVar, boolean z11, ss.l<? super gt.b, ? extends b0> lVar) {
        u uVar = new u(aVar, z10, fVar, cVar);
        b0 invoke = lVar.invoke(bVar);
        Collection<? extends gt.b> overriddenDescriptors = bVar.f();
        kotlin.jvm.internal.i.f(overriddenDescriptors, "overriddenDescriptors");
        ArrayList arrayList = new ArrayList(is.i.H1(overriddenDescriptors, 10));
        for (gt.b it : overriddenDescriptors) {
            kotlin.jvm.internal.i.f(it, "it");
            arrayList.add(lVar.invoke(it));
        }
        return b(uVar, invoke, arrayList, vVar, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x024d, code lost:
        if ((r4 != null && r4.f28953c) != false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x028a, code lost:
        if (r5.compareTo(r6) <= 0) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0427, code lost:
        if (r12 != false) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x033d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x042e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b0 b(u uVar, b0 b0Var, List<? extends b0> list, v vVar, boolean z10) {
        boolean z11;
        int size;
        int i6;
        g[] gVarArr;
        h hVar;
        Iterable iterable;
        h hVar2;
        v0 v0Var;
        boolean z12;
        ht.a aVar;
        f6.b bVar;
        q.f fVar;
        int i10;
        k kVar;
        boolean z13;
        k kVar2;
        g gVar;
        boolean z14;
        Iterator it;
        k kVar3;
        h hVar3;
        ht.h hVar4;
        zu.l l02;
        Iterator it2;
        int i11;
        boolean z15;
        boolean z16;
        Iterator it3;
        j jVar;
        Iterator it4;
        j jVar2;
        boolean z17;
        boolean z18;
        f6.b bVar2;
        g gVar2;
        zu.h hVar5;
        j jVar3;
        h hVar6;
        int i12;
        boolean z19;
        kotlin.jvm.internal.i.g(b0Var, "<this>");
        ArrayList d10 = uVar.d(b0Var);
        ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
        for (zu.h hVar7 : list) {
            arrayList.add(uVar.d(hVar7));
        }
        q.f fVar2 = uVar.f38086c;
        boolean z20 = uVar.f38085b;
        if (z20) {
            if (!list.isEmpty()) {
                for (zu.h other : list) {
                    kotlin.jvm.internal.i.g(other, "other");
                    if (!((st.c) fVar2.f29104v).f31952u.c(b0Var, (b0) other)) {
                        z19 = true;
                        break;
                    }
                }
            }
            z19 = false;
            if (z19) {
                z11 = true;
                size = !z11 ? 1 : d10.size();
                g[] gVarArr2 = new g[size];
                i6 = 0;
                while (i6 < size) {
                    a.C0642a c0642a = (a.C0642a) d10.get(i6);
                    zu.h hVar8 = c0642a.f38004a;
                    j jVar4 = j.NULLABLE;
                    j jVar5 = j.NOT_NULL;
                    f6.b bVar3 = f6.b.M;
                    h hVar9 = h.MUTABLE;
                    h hVar10 = h.READ_ONLY;
                    j jVar6 = j.FORCE_FLEXIBILITY;
                    ArrayList arrayList2 = d10;
                    ht.a aVar2 = uVar.f38084a;
                    int i13 = size;
                    zu.m mVar = c0642a.f38006c;
                    if (hVar8 == null) {
                        if (mVar == null) {
                            gVarArr = gVarArr2;
                            i12 = 0;
                        } else if (mVar instanceof v0) {
                            n1 O = ((v0) mVar).O();
                            gVarArr = gVarArr2;
                            kotlin.jvm.internal.i.f(O, "this.variance");
                            i12 = l0.g(O);
                        } else {
                            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + y.a(mVar.getClass())).toString());
                        }
                        if (i12 == 1) {
                            gVar = g.f38018e;
                            aVar = aVar2;
                            hVar = hVar10;
                            fVar = fVar2;
                            hVar2 = hVar9;
                            z12 = z20;
                            i10 = i6;
                            bVar = bVar3;
                            ArrayList arrayList3 = new ArrayList();
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                int i14 = i10;
                                a.C0642a c0642a2 = (a.C0642a) is.u.j2(i14, (List) it2.next());
                                if (c0642a2 == null || (hVar5 = c0642a2.f38004a) == null) {
                                    bVar2 = bVar;
                                    gVar2 = null;
                                } else {
                                    j c10 = a.c(hVar5);
                                    if (c10 == null) {
                                        b0 h02 = ca.a.h0((b0) hVar5);
                                        jVar3 = h02 != null ? a.c(h02) : null;
                                    } else {
                                        jVar3 = c10;
                                    }
                                    String str = ft.c.f15851a;
                                    bVar2 = bVar;
                                    if (ft.c.f15860k.containsKey(uVar.e(a.C0645a.Z(bVar2, hVar5)))) {
                                        hVar6 = hVar;
                                    } else {
                                        hVar6 = ft.c.f15859j.containsKey(uVar.e(a.C0645a.n0(bVar2, hVar5))) ? hVar2 : null;
                                    }
                                    gVar2 = new g(jVar3, hVar6, a.C0645a.J(bVar2, hVar5) || (((b0) hVar5).R0() instanceof i), jVar3 != c10);
                                }
                                if (gVar2 != null) {
                                    arrayList3.add(gVar2);
                                }
                                i10 = i14;
                                bVar = bVar2;
                            }
                            i11 = i10;
                            z15 = i11 != 0 && z12;
                            if (i11 == 0) {
                                ht.a aVar3 = aVar;
                                if ((aVar3 instanceof z0) && ((z0) aVar3).j0() != null) {
                                    z16 = true;
                                    ArrayList arrayList4 = new ArrayList();
                                    it3 = arrayList3.iterator();
                                    while (it3.hasNext()) {
                                        g gVar3 = (g) it3.next();
                                        j jVar7 = gVar3.f38022d ? null : gVar3.f38019a;
                                        if (jVar7 != null) {
                                            arrayList4.add(jVar7);
                                        }
                                    }
                                    Set M2 = is.u.M2(arrayList4);
                                    boolean z21 = gVar.f38022d;
                                    j jVar8 = gVar.f38019a;
                                    j jVar9 = z21 ? null : jVar8;
                                    jVar = jVar9 == jVar6 ? jVar6 : (j) ta.v.L(M2, jVar5, jVar4, jVar9, z15);
                                    if (jVar == null) {
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator it5 = arrayList3.iterator();
                                        while (it5.hasNext()) {
                                            j jVar10 = ((g) it5.next()).f38019a;
                                            if (jVar10 != null) {
                                                arrayList5.add(jVar10);
                                            }
                                        }
                                        Set M22 = is.u.M2(arrayList5);
                                        if (jVar8 != jVar6) {
                                            jVar6 = (j) ta.v.L(M22, jVar5, jVar4, jVar8, z15);
                                        }
                                    } else {
                                        jVar6 = jVar;
                                    }
                                    ArrayList arrayList6 = new ArrayList();
                                    it4 = arrayList3.iterator();
                                    while (it4.hasNext()) {
                                        h hVar11 = ((g) it4.next()).f38020b;
                                        if (hVar11 != null) {
                                            arrayList6.add(hVar11);
                                        }
                                    }
                                    h hVar12 = (h) ta.v.L(is.u.M2(arrayList6), hVar2, hVar, gVar.f38020b, z15);
                                    if (jVar6 != null) {
                                        if (!(z10 || (z16 && jVar6 == jVar4))) {
                                            jVar2 = jVar6;
                                            if (jVar2 == jVar5) {
                                                if (!gVar.f38021c) {
                                                    if (!arrayList3.isEmpty()) {
                                                        Iterator it6 = arrayList3.iterator();
                                                        while (it6.hasNext()) {
                                                            if (((g) it6.next()).f38021c) {
                                                                z18 = true;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    z18 = false;
                                                }
                                                z17 = true;
                                                gVarArr[i11] = new g(jVar2, hVar12, z17, jVar2 == null && jVar != jVar6);
                                                i6 = i11 + 1;
                                                size = i13;
                                                d10 = arrayList2;
                                                gVarArr2 = gVarArr;
                                                fVar2 = fVar;
                                                z20 = z12;
                                            }
                                            z17 = false;
                                            gVarArr[i11] = new g(jVar2, hVar12, z17, jVar2 == null && jVar != jVar6);
                                            i6 = i11 + 1;
                                            size = i13;
                                            d10 = arrayList2;
                                            gVarArr2 = gVarArr;
                                            fVar2 = fVar;
                                            z20 = z12;
                                        }
                                    }
                                    jVar2 = null;
                                    if (jVar2 == jVar5) {
                                    }
                                    z17 = false;
                                    gVarArr[i11] = new g(jVar2, hVar12, z17, jVar2 == null && jVar != jVar6);
                                    i6 = i11 + 1;
                                    size = i13;
                                    d10 = arrayList2;
                                    gVarArr2 = gVarArr;
                                    fVar2 = fVar;
                                    z20 = z12;
                                }
                            }
                            z16 = false;
                            ArrayList arrayList42 = new ArrayList();
                            it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                            }
                            Set M23 = is.u.M2(arrayList42);
                            boolean z212 = gVar.f38022d;
                            j jVar82 = gVar.f38019a;
                            if (z212) {
                            }
                            if (jVar9 == jVar6) {
                            }
                            if (jVar == null) {
                            }
                            ArrayList arrayList62 = new ArrayList();
                            it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                            }
                            h hVar122 = (h) ta.v.L(is.u.M2(arrayList62), hVar2, hVar, gVar.f38020b, z15);
                            if (jVar6 != null) {
                            }
                            jVar2 = null;
                            if (jVar2 == jVar5) {
                            }
                            z17 = false;
                            gVarArr[i11] = new g(jVar2, hVar122, z17, jVar2 == null && jVar != jVar6);
                            i6 = i11 + 1;
                            size = i13;
                            d10 = arrayList2;
                            gVarArr2 = gVarArr;
                            fVar2 = fVar;
                            z20 = z12;
                        }
                    } else {
                        gVarArr = gVarArr2;
                    }
                    boolean z22 = mVar == null;
                    Iterable iterable2 = is.w.f20676u;
                    zu.h hVar13 = c0642a.f38004a;
                    if (hVar13 != null) {
                        hVar = hVar10;
                        iterable = ((b0) hVar13).getAnnotations();
                    } else {
                        hVar = hVar10;
                        iterable = iterable2;
                    }
                    if (hVar13 == null || (l02 = a.C0645a.l0(bVar3, hVar13)) == null) {
                        hVar2 = hVar9;
                        v0Var = null;
                    } else {
                        v0Var = a.C0645a.y(l02);
                        hVar2 = hVar9;
                    }
                    pt.c cVar = pt.c.TYPE_PARAMETER_BOUNDS;
                    z12 = z20;
                    pt.c cVar2 = uVar.f38087d;
                    boolean z23 = cVar2 == cVar;
                    if (z22) {
                        if (!z23) {
                            ((st.c) fVar2.f29104v).f31951t.c();
                        }
                        if (aVar2 == null || (hVar4 = aVar2.getAnnotations()) == null) {
                            hVar4 = iterable2;
                        }
                        iterable = is.u.s2(hVar4, iterable);
                    }
                    pt.e eVar = ((st.c) fVar2.f29104v).f31949q;
                    eVar.getClass();
                    Iterator it7 = iterable.iterator();
                    aVar = aVar2;
                    h hVar14 = null;
                    pt.e eVar2 = eVar;
                    while (true) {
                        if (!it7.hasNext()) {
                            bVar = bVar3;
                            break;
                        }
                        bVar = bVar3;
                        fu.c e10 = eVar2.e(it7.next());
                        pt.e eVar3 = eVar2;
                        if (e0.f28896l.contains(e10)) {
                            hVar3 = hVar;
                        } else if (e0.f28897m.contains(e10)) {
                            hVar3 = hVar2;
                        } else {
                            continue;
                            bVar3 = bVar;
                            eVar2 = eVar3;
                        }
                        if (hVar14 != null && hVar14 != hVar3) {
                            hVar14 = null;
                            break;
                        }
                        hVar14 = hVar3;
                        bVar3 = bVar;
                        eVar2 = eVar3;
                    }
                    pt.e eVar4 = ((st.c) fVar2.f29104v).f31949q;
                    c cVar3 = new c(uVar);
                    eVar4.getClass();
                    Iterator it8 = iterable.iterator();
                    fVar = fVar2;
                    k kVar4 = null;
                    while (it8.hasNext()) {
                        i10 = i6;
                        k c11 = eVar4.c(cVar3, it8.next());
                        if (kVar4 == null) {
                            it = it8;
                        } else {
                            if (c11 != null && !kotlin.jvm.internal.i.b(c11, kVar4)) {
                                it = it8;
                                boolean z24 = kVar4.f38032b;
                                kVar3 = kVar4;
                                boolean z25 = c11.f38032b;
                                if (!z25 || z24) {
                                    if (z25 || !z24) {
                                        kVar4 = null;
                                        break;
                                    }
                                }
                            } else {
                                it = it8;
                                kVar3 = kVar4;
                            }
                            kVar4 = kVar3;
                            i6 = i10;
                            it8 = it;
                        }
                        kVar4 = c11;
                        i6 = i10;
                        it8 = it;
                    }
                    i10 = i6;
                    if (kVar4 != null) {
                        j jVar11 = kVar4.f38031a;
                        gVar = new g(jVar11, hVar14, jVar11 == jVar5 && v0Var != null, kVar4.f38032b);
                        ArrayList arrayList32 = new ArrayList();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                        }
                        i11 = i10;
                        if (i11 != 0) {
                        }
                        if (i11 == 0) {
                        }
                        z16 = false;
                        ArrayList arrayList422 = new ArrayList();
                        it3 = arrayList32.iterator();
                        while (it3.hasNext()) {
                        }
                        Set M232 = is.u.M2(arrayList422);
                        boolean z2122 = gVar.f38022d;
                        j jVar822 = gVar.f38019a;
                        if (z2122) {
                        }
                        if (jVar9 == jVar6) {
                        }
                        if (jVar == null) {
                        }
                        ArrayList arrayList622 = new ArrayList();
                        it4 = arrayList32.iterator();
                        while (it4.hasNext()) {
                        }
                        h hVar1222 = (h) ta.v.L(is.u.M2(arrayList622), hVar2, hVar, gVar.f38020b, z15);
                        if (jVar6 != null) {
                        }
                        jVar2 = null;
                        if (jVar2 == jVar5) {
                        }
                        z17 = false;
                        gVarArr[i11] = new g(jVar2, hVar1222, z17, jVar2 == null && jVar != jVar6);
                        i6 = i11 + 1;
                        size = i13;
                        d10 = arrayList2;
                        gVarArr2 = gVarArr;
                        fVar2 = fVar;
                        z20 = z12;
                    } else {
                        pt.c cVar4 = (z22 || z23) ? cVar2 : pt.c.TYPE_USE;
                        z zVar = c0642a.f38005b;
                        pt.s sVar = zVar != null ? zVar.f28970a.get(cVar4) : null;
                        k b10 = v0Var != null ? uVar.b(v0Var) : null;
                        if (b10 != null) {
                            kVar = k.a(b10, jVar5, false, 2);
                        } else {
                            kVar = sVar != null ? sVar.f28951a : null;
                        }
                        if ((b10 != null ? b10.f38031a : null) != jVar5) {
                            if (v0Var != null) {
                            }
                            z13 = false;
                            if (mVar != null || (kVar2 = uVar.b(mVar)) == null) {
                                kVar2 = null;
                            } else if (kVar2.f38031a == jVar4) {
                                kVar2 = k.a(kVar2, jVar6, false, 2);
                            }
                            if (kVar2 != null) {
                                if (kVar != null) {
                                    boolean z26 = kVar.f38032b;
                                    boolean z27 = kVar2.f38032b;
                                    if (!z27 || z26) {
                                        if (z27 || !z26) {
                                            j jVar12 = kVar2.f38031a;
                                            j jVar13 = kVar.f38031a;
                                            if (jVar12.compareTo(jVar13) >= 0) {
                                            }
                                        }
                                    }
                                }
                                kVar = kVar2;
                            }
                            j jVar14 = kVar == null ? kVar.f38031a : null;
                            if (kVar != null && kVar.f38032b) {
                                z14 = true;
                                gVar = new g(jVar14, hVar14, z13, z14);
                                ArrayList arrayList322 = new ArrayList();
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                }
                                i11 = i10;
                                if (i11 != 0) {
                                }
                                if (i11 == 0) {
                                }
                                z16 = false;
                                ArrayList arrayList4222 = new ArrayList();
                                it3 = arrayList322.iterator();
                                while (it3.hasNext()) {
                                }
                                Set M2322 = is.u.M2(arrayList4222);
                                boolean z21222 = gVar.f38022d;
                                j jVar8222 = gVar.f38019a;
                                if (z21222) {
                                }
                                if (jVar9 == jVar6) {
                                }
                                if (jVar == null) {
                                }
                                ArrayList arrayList6222 = new ArrayList();
                                it4 = arrayList322.iterator();
                                while (it4.hasNext()) {
                                }
                                h hVar12222 = (h) ta.v.L(is.u.M2(arrayList6222), hVar2, hVar, gVar.f38020b, z15);
                                if (jVar6 != null) {
                                }
                                jVar2 = null;
                                if (jVar2 == jVar5) {
                                }
                                z17 = false;
                                gVarArr[i11] = new g(jVar2, hVar12222, z17, jVar2 == null && jVar != jVar6);
                                i6 = i11 + 1;
                                size = i13;
                                d10 = arrayList2;
                                gVarArr2 = gVarArr;
                                fVar2 = fVar;
                                z20 = z12;
                            }
                            z14 = false;
                            gVar = new g(jVar14, hVar14, z13, z14);
                            ArrayList arrayList3222 = new ArrayList();
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                            }
                            i11 = i10;
                            if (i11 != 0) {
                            }
                            if (i11 == 0) {
                            }
                            z16 = false;
                            ArrayList arrayList42222 = new ArrayList();
                            it3 = arrayList3222.iterator();
                            while (it3.hasNext()) {
                            }
                            Set M23222 = is.u.M2(arrayList42222);
                            boolean z212222 = gVar.f38022d;
                            j jVar82222 = gVar.f38019a;
                            if (z212222) {
                            }
                            if (jVar9 == jVar6) {
                            }
                            if (jVar == null) {
                            }
                            ArrayList arrayList62222 = new ArrayList();
                            it4 = arrayList3222.iterator();
                            while (it4.hasNext()) {
                            }
                            h hVar122222 = (h) ta.v.L(is.u.M2(arrayList62222), hVar2, hVar, gVar.f38020b, z15);
                            if (jVar6 != null) {
                            }
                            jVar2 = null;
                            if (jVar2 == jVar5) {
                            }
                            z17 = false;
                            gVarArr[i11] = new g(jVar2, hVar122222, z17, jVar2 == null && jVar != jVar6);
                            i6 = i11 + 1;
                            size = i13;
                            d10 = arrayList2;
                            gVarArr2 = gVarArr;
                            fVar2 = fVar;
                            z20 = z12;
                        }
                        z13 = true;
                        if (mVar != null) {
                        }
                        kVar2 = null;
                        if (kVar2 != null) {
                        }
                        if (kVar == null) {
                        }
                        if (kVar != null) {
                            z14 = true;
                            gVar = new g(jVar14, hVar14, z13, z14);
                            ArrayList arrayList32222 = new ArrayList();
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                            }
                            i11 = i10;
                            if (i11 != 0) {
                            }
                            if (i11 == 0) {
                            }
                            z16 = false;
                            ArrayList arrayList422222 = new ArrayList();
                            it3 = arrayList32222.iterator();
                            while (it3.hasNext()) {
                            }
                            Set M232222 = is.u.M2(arrayList422222);
                            boolean z2122222 = gVar.f38022d;
                            j jVar822222 = gVar.f38019a;
                            if (z2122222) {
                            }
                            if (jVar9 == jVar6) {
                            }
                            if (jVar == null) {
                            }
                            ArrayList arrayList622222 = new ArrayList();
                            it4 = arrayList32222.iterator();
                            while (it4.hasNext()) {
                            }
                            h hVar1222222 = (h) ta.v.L(is.u.M2(arrayList622222), hVar2, hVar, gVar.f38020b, z15);
                            if (jVar6 != null) {
                            }
                            jVar2 = null;
                            if (jVar2 == jVar5) {
                            }
                            z17 = false;
                            gVarArr[i11] = new g(jVar2, hVar1222222, z17, jVar2 == null && jVar != jVar6);
                            i6 = i11 + 1;
                            size = i13;
                            d10 = arrayList2;
                            gVarArr2 = gVarArr;
                            fVar2 = fVar;
                            z20 = z12;
                        }
                        z14 = false;
                        gVar = new g(jVar14, hVar14, z13, z14);
                        ArrayList arrayList322222 = new ArrayList();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                        }
                        i11 = i10;
                        if (i11 != 0) {
                        }
                        if (i11 == 0) {
                        }
                        z16 = false;
                        ArrayList arrayList4222222 = new ArrayList();
                        it3 = arrayList322222.iterator();
                        while (it3.hasNext()) {
                        }
                        Set M2322222 = is.u.M2(arrayList4222222);
                        boolean z21222222 = gVar.f38022d;
                        j jVar8222222 = gVar.f38019a;
                        if (z21222222) {
                        }
                        if (jVar9 == jVar6) {
                        }
                        if (jVar == null) {
                        }
                        ArrayList arrayList6222222 = new ArrayList();
                        it4 = arrayList322222.iterator();
                        while (it4.hasNext()) {
                        }
                        h hVar12222222 = (h) ta.v.L(is.u.M2(arrayList6222222), hVar2, hVar, gVar.f38020b, z15);
                        if (jVar6 != null) {
                        }
                        jVar2 = null;
                        if (jVar2 == jVar5) {
                        }
                        z17 = false;
                        gVarArr[i11] = new g(jVar2, hVar12222222, z17, jVar2 == null && jVar != jVar6);
                        i6 = i11 + 1;
                        size = i13;
                        d10 = arrayList2;
                        gVarArr2 = gVarArr;
                        fVar2 = fVar;
                        z20 = z12;
                    }
                }
                b bVar4 = new b(vVar, gVarArr2);
                f fVar3 = this.f38077a;
                fVar3.getClass();
                return fVar3.b(b0Var.R0(), bVar4, 0, uVar.f38088e).f38013a;
            }
        }
        z11 = false;
        if (!z11) {
        }
        g[] gVarArr22 = new g[size];
        i6 = 0;
        while (i6 < size) {
        }
        b bVar42 = new b(vVar, gVarArr22);
        f fVar32 = this.f38077a;
        fVar32.getClass();
        return fVar32.b(b0Var.R0(), bVar42, 0, uVar.f38088e).f38013a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x02cd, code lost:
        if (r8 == null) goto L195;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList c(q.f c10, Collection collection) {
        tt.e eVar;
        List<wt.a> list;
        boolean z10;
        ht.h iVar;
        gt.b bVar;
        n0 k02;
        rt.a aVar;
        gt.b bVar2;
        q.f fVar;
        b0 b0Var;
        rt.e eVar2;
        m mVar;
        pt.y javaTypeEnhancementState;
        boolean z11;
        boolean z12;
        boolean z13;
        m mVar2;
        gt.b bVar3;
        k0 k0Var;
        boolean z14;
        pt.c cVar;
        v vVar;
        b0 a10;
        b0 returnType;
        n nVar;
        boolean z15;
        hs.f fVar2;
        b0 b0Var2;
        Iterator it;
        boolean z16;
        boolean z17;
        boolean z18;
        b0 a11;
        v vVar2;
        q.f fVar3;
        List<v> list2;
        gt.b bVar4;
        ht.a aVar2;
        q.f fVar4;
        boolean z19;
        kotlin.jvm.internal.i.g(c10, "c");
        int i6 = 10;
        ArrayList arrayList = new ArrayList(is.i.H1(collection, 10));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            gt.b bVar5 = (gt.b) it2.next();
            if (bVar5 instanceof rt.a) {
                rt.a aVar3 = (rt.a) bVar5;
                boolean z20 = true;
                if (aVar3.m0() != b.a.FAKE_OVERRIDE || aVar3.b().f().size() != 1) {
                    gt.g r02 = ca.a.r0(bVar5);
                    if (r02 == null) {
                        iVar = bVar5.getAnnotations();
                    } else {
                        if (r02 instanceof tt.e) {
                            eVar = (tt.e) r02;
                        } else {
                            eVar = null;
                        }
                        if (eVar != null) {
                            list = (List) eVar.F.getValue();
                        } else {
                            list = null;
                        }
                        if (list != null && !list.isEmpty()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            iVar = bVar5.getAnnotations();
                        } else {
                            ArrayList arrayList2 = new ArrayList(is.i.H1(list, i6));
                            for (wt.a aVar4 : list) {
                                arrayList2.add(new tt.d(c10, aVar4, true));
                            }
                            ArrayList s22 = is.u.s2(bVar5.getAnnotations(), arrayList2);
                            if (s22.isEmpty()) {
                                iVar = h.a.f19495a;
                            } else {
                                iVar = new ht.i(s22);
                            }
                        }
                    }
                    q.f b10 = st.b.b(c10, iVar);
                    if (bVar5 instanceof rt.f) {
                        m0 m0Var = ((rt.f) bVar5).R;
                        if (m0Var != null && !m0Var.f23860y) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            kotlin.jvm.internal.i.d(m0Var);
                            bVar = m0Var;
                            rt.a aVar5 = (rt.a) bVar5;
                            k02 = aVar5.k0();
                            pt.c cVar2 = pt.c.VALUE_PARAMETER;
                            if (k02 == null) {
                                if (!(bVar instanceof gt.u)) {
                                    bVar4 = null;
                                } else {
                                    bVar4 = bVar;
                                }
                                gt.u uVar = (gt.u) bVar4;
                                if (uVar != null) {
                                    aVar2 = (z0) uVar.v(rt.e.f31016a0);
                                } else {
                                    aVar2 = null;
                                }
                                ss.l<? super gt.b, ? extends b0> lVar = o.f38073u;
                                if (aVar2 != null) {
                                    fVar4 = st.b.b(b10, aVar2.getAnnotations());
                                } else {
                                    fVar4 = b10;
                                }
                                aVar = aVar5;
                                bVar2 = bVar;
                                fVar = b10;
                                b0Var = a(bVar5, aVar2, false, fVar4, cVar2, null, false, lVar);
                            } else {
                                aVar = aVar5;
                                bVar2 = bVar;
                                fVar = b10;
                                b0Var = null;
                            }
                            if (!(bVar5 instanceof rt.e)) {
                                eVar2 = (rt.e) bVar5;
                            } else {
                                eVar2 = null;
                            }
                            if (eVar2 != null) {
                                gt.j c11 = eVar2.c();
                                kotlin.jvm.internal.i.e(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                String n12 = ca.a.n1((gt.e) c11, ta.v.n(eVar2, 3));
                                if (n12 != null) {
                                    mVar = (m) l.f38036d.get(n12);
                                    if (mVar != null) {
                                        mVar.f38071b.size();
                                        aVar.i().size();
                                    }
                                    javaTypeEnhancementState = ((st.c) c10.f29104v).f31953v;
                                    kotlin.jvm.internal.i.g(javaTypeEnhancementState, "javaTypeEnhancementState");
                                    if (javaTypeEnhancementState.f28967b.invoke(pt.w.f28958a) == h0.STRICT) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (!z11) {
                                        ((st.c) fVar.f29104v).f31951t.b();
                                    } else {
                                        if ((bVar5 instanceof gt.u) && kotlin.jvm.internal.i.b(bVar5.v(rt.e.f31017b0), Boolean.TRUE)) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12) {
                                            z13 = true;
                                            List<z0> i10 = bVar2.i();
                                            kotlin.jvm.internal.i.f(i10, "annotationOwnerForMember.valueParameters");
                                            ArrayList arrayList3 = new ArrayList(is.i.H1(i10, i6));
                                            for (z0 z0Var : i10) {
                                                if (mVar != null && (list2 = mVar.f38071b) != null) {
                                                    vVar2 = (v) is.u.j2(z0Var.getIndex(), list2);
                                                } else {
                                                    vVar2 = null;
                                                }
                                                ss.l<? super gt.b, ? extends b0> qVar = new q(z0Var);
                                                if (z0Var != null) {
                                                    fVar3 = st.b.b(fVar, z0Var.getAnnotations());
                                                } else {
                                                    fVar3 = fVar;
                                                }
                                                ArrayList arrayList4 = arrayList3;
                                                arrayList4.add(a(bVar5, z0Var, false, fVar3, cVar2, vVar2, z13, qVar));
                                                arrayList3 = arrayList4;
                                                mVar = mVar;
                                            }
                                            ArrayList arrayList5 = arrayList3;
                                            mVar2 = mVar;
                                            if (bVar5 instanceof k0) {
                                                bVar3 = null;
                                            } else {
                                                bVar3 = bVar5;
                                            }
                                            k0Var = (k0) bVar3;
                                            if (k0Var == null && kotlin.jvm.internal.h.I(k0Var)) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (!z14) {
                                                cVar = pt.c.FIELD;
                                            } else {
                                                cVar = pt.c.METHOD_RETURN_TYPE;
                                            }
                                            pt.c cVar3 = cVar;
                                            if (mVar2 == null) {
                                                vVar = mVar2.f38070a;
                                            } else {
                                                vVar = null;
                                            }
                                            a10 = a(bVar5, bVar2, true, fVar, cVar3, vVar, false, p.f38074u);
                                            returnType = aVar.getReturnType();
                                            kotlin.jvm.internal.i.d(returnType);
                                            nVar = n.f38072u;
                                            if (!k1.c(returnType, nVar)) {
                                                n0 k03 = aVar.k0();
                                                if (k03 != null && (a11 = k03.a()) != null) {
                                                    z17 = k1.c(a11, nVar);
                                                } else {
                                                    z17 = false;
                                                }
                                                if (!z17) {
                                                    List<z0> valueParameters = aVar.i();
                                                    kotlin.jvm.internal.i.f(valueParameters, "valueParameters");
                                                    if (!valueParameters.isEmpty()) {
                                                        for (z0 z0Var2 : valueParameters) {
                                                            b0 a12 = z0Var2.a();
                                                            kotlin.jvm.internal.i.f(a12, "it.type");
                                                            if (k1.c(a12, n.f38072u)) {
                                                                z18 = true;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    z18 = false;
                                                    if (!z18) {
                                                        z15 = false;
                                                        if (z15) {
                                                            fVar2 = new hs.f(lu.b.f24527a, new pt.l(bVar5));
                                                        } else {
                                                            fVar2 = null;
                                                        }
                                                        if (b0Var == null && a10 == null) {
                                                            if (!arrayList5.isEmpty()) {
                                                                Iterator it3 = arrayList5.iterator();
                                                                while (it3.hasNext()) {
                                                                    if (((b0) it3.next()) != null) {
                                                                        z16 = true;
                                                                        continue;
                                                                    } else {
                                                                        z16 = false;
                                                                        continue;
                                                                    }
                                                                    if (z16) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            z20 = false;
                                                            if (!z20) {
                                                            }
                                                        }
                                                        if (b0Var == null) {
                                                            n0 k04 = aVar.k0();
                                                            if (k04 != null) {
                                                                b0Var = k04.a();
                                                            } else {
                                                                b0Var2 = null;
                                                                ArrayList arrayList6 = new ArrayList(is.i.H1(arrayList5, 10));
                                                                it = arrayList5.iterator();
                                                                int i11 = 0;
                                                                while (it.hasNext()) {
                                                                    Object next = it.next();
                                                                    int i12 = i11 + 1;
                                                                    if (i11 >= 0) {
                                                                        b0 b0Var3 = (b0) next;
                                                                        if (b0Var3 == null) {
                                                                            b0Var3 = aVar.i().get(i11).a();
                                                                            kotlin.jvm.internal.i.f(b0Var3, "valueParameters[index].type");
                                                                        }
                                                                        arrayList6.add(b0Var3);
                                                                        i11 = i12;
                                                                    } else {
                                                                        ca.a.t1();
                                                                        throw null;
                                                                    }
                                                                }
                                                                if (a10 == null) {
                                                                    a10 = aVar.getReturnType();
                                                                    kotlin.jvm.internal.i.d(a10);
                                                                }
                                                                bVar5 = aVar.G(b0Var2, arrayList6, a10, fVar2);
                                                                kotlin.jvm.internal.i.e(bVar5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                                                arrayList.add(bVar5);
                                                                i6 = 10;
                                                            }
                                                        }
                                                        b0Var2 = b0Var;
                                                        ArrayList arrayList62 = new ArrayList(is.i.H1(arrayList5, 10));
                                                        it = arrayList5.iterator();
                                                        int i112 = 0;
                                                        while (it.hasNext()) {
                                                        }
                                                        if (a10 == null) {
                                                        }
                                                        bVar5 = aVar.G(b0Var2, arrayList62, a10, fVar2);
                                                        kotlin.jvm.internal.i.e(bVar5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                                        arrayList.add(bVar5);
                                                        i6 = 10;
                                                    }
                                                }
                                            }
                                            z15 = true;
                                            if (z15) {
                                            }
                                            if (b0Var == null) {
                                                if (!arrayList5.isEmpty()) {
                                                }
                                                z20 = false;
                                                if (!z20) {
                                                }
                                            }
                                            if (b0Var == null) {
                                            }
                                            b0Var2 = b0Var;
                                            ArrayList arrayList622 = new ArrayList(is.i.H1(arrayList5, 10));
                                            it = arrayList5.iterator();
                                            int i1122 = 0;
                                            while (it.hasNext()) {
                                            }
                                            if (a10 == null) {
                                            }
                                            bVar5 = aVar.G(b0Var2, arrayList622, a10, fVar2);
                                            kotlin.jvm.internal.i.e(bVar5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                            arrayList.add(bVar5);
                                            i6 = 10;
                                        }
                                    }
                                    z13 = false;
                                    List<z0> i102 = bVar2.i();
                                    kotlin.jvm.internal.i.f(i102, "annotationOwnerForMember.valueParameters");
                                    ArrayList arrayList32 = new ArrayList(is.i.H1(i102, i6));
                                    while (r22.hasNext()) {
                                    }
                                    ArrayList arrayList52 = arrayList32;
                                    mVar2 = mVar;
                                    if (bVar5 instanceof k0) {
                                    }
                                    k0Var = (k0) bVar3;
                                    if (k0Var == null) {
                                    }
                                    z14 = false;
                                    if (!z14) {
                                    }
                                    pt.c cVar32 = cVar;
                                    if (mVar2 == null) {
                                    }
                                    a10 = a(bVar5, bVar2, true, fVar, cVar32, vVar, false, p.f38074u);
                                    returnType = aVar.getReturnType();
                                    kotlin.jvm.internal.i.d(returnType);
                                    nVar = n.f38072u;
                                    if (!k1.c(returnType, nVar)) {
                                    }
                                    z15 = true;
                                    if (z15) {
                                    }
                                    if (b0Var == null) {
                                    }
                                    if (b0Var == null) {
                                    }
                                    b0Var2 = b0Var;
                                    ArrayList arrayList6222 = new ArrayList(is.i.H1(arrayList52, 10));
                                    it = arrayList52.iterator();
                                    int i11222 = 0;
                                    while (it.hasNext()) {
                                    }
                                    if (a10 == null) {
                                    }
                                    bVar5 = aVar.G(b0Var2, arrayList6222, a10, fVar2);
                                    kotlin.jvm.internal.i.e(bVar5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                    arrayList.add(bVar5);
                                    i6 = 10;
                                }
                            }
                            mVar = null;
                            if (mVar != null) {
                            }
                            javaTypeEnhancementState = ((st.c) c10.f29104v).f31953v;
                            kotlin.jvm.internal.i.g(javaTypeEnhancementState, "javaTypeEnhancementState");
                            if (javaTypeEnhancementState.f28967b.invoke(pt.w.f28958a) == h0.STRICT) {
                            }
                            if (!z11) {
                            }
                            z13 = false;
                            List<z0> i1022 = bVar2.i();
                            kotlin.jvm.internal.i.f(i1022, "annotationOwnerForMember.valueParameters");
                            ArrayList arrayList322 = new ArrayList(is.i.H1(i1022, i6));
                            while (r22.hasNext()) {
                            }
                            ArrayList arrayList522 = arrayList322;
                            mVar2 = mVar;
                            if (bVar5 instanceof k0) {
                            }
                            k0Var = (k0) bVar3;
                            if (k0Var == null) {
                            }
                            z14 = false;
                            if (!z14) {
                            }
                            pt.c cVar322 = cVar;
                            if (mVar2 == null) {
                            }
                            a10 = a(bVar5, bVar2, true, fVar, cVar322, vVar, false, p.f38074u);
                            returnType = aVar.getReturnType();
                            kotlin.jvm.internal.i.d(returnType);
                            nVar = n.f38072u;
                            if (!k1.c(returnType, nVar)) {
                            }
                            z15 = true;
                            if (z15) {
                            }
                            if (b0Var == null) {
                            }
                            if (b0Var == null) {
                            }
                            b0Var2 = b0Var;
                            ArrayList arrayList62222 = new ArrayList(is.i.H1(arrayList522, 10));
                            it = arrayList522.iterator();
                            int i112222 = 0;
                            while (it.hasNext()) {
                            }
                            if (a10 == null) {
                            }
                            bVar5 = aVar.G(b0Var2, arrayList62222, a10, fVar2);
                            kotlin.jvm.internal.i.e(bVar5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                            arrayList.add(bVar5);
                            i6 = 10;
                        }
                    }
                    bVar = bVar5;
                    rt.a aVar52 = (rt.a) bVar5;
                    k02 = aVar52.k0();
                    pt.c cVar22 = pt.c.VALUE_PARAMETER;
                    if (k02 == null) {
                    }
                    if (!(bVar5 instanceof rt.e)) {
                    }
                    if (eVar2 != null) {
                    }
                    mVar = null;
                    if (mVar != null) {
                    }
                    javaTypeEnhancementState = ((st.c) c10.f29104v).f31953v;
                    kotlin.jvm.internal.i.g(javaTypeEnhancementState, "javaTypeEnhancementState");
                    if (javaTypeEnhancementState.f28967b.invoke(pt.w.f28958a) == h0.STRICT) {
                    }
                    if (!z11) {
                    }
                    z13 = false;
                    List<z0> i10222 = bVar2.i();
                    kotlin.jvm.internal.i.f(i10222, "annotationOwnerForMember.valueParameters");
                    ArrayList arrayList3222 = new ArrayList(is.i.H1(i10222, i6));
                    while (r22.hasNext()) {
                    }
                    ArrayList arrayList5222 = arrayList3222;
                    mVar2 = mVar;
                    if (bVar5 instanceof k0) {
                    }
                    k0Var = (k0) bVar3;
                    if (k0Var == null) {
                    }
                    z14 = false;
                    if (!z14) {
                    }
                    pt.c cVar3222 = cVar;
                    if (mVar2 == null) {
                    }
                    a10 = a(bVar5, bVar2, true, fVar, cVar3222, vVar, false, p.f38074u);
                    returnType = aVar.getReturnType();
                    kotlin.jvm.internal.i.d(returnType);
                    nVar = n.f38072u;
                    if (!k1.c(returnType, nVar)) {
                    }
                    z15 = true;
                    if (z15) {
                    }
                    if (b0Var == null) {
                    }
                    if (b0Var == null) {
                    }
                    b0Var2 = b0Var;
                    ArrayList arrayList622222 = new ArrayList(is.i.H1(arrayList5222, 10));
                    it = arrayList5222.iterator();
                    int i1122222 = 0;
                    while (it.hasNext()) {
                    }
                    if (a10 == null) {
                    }
                    bVar5 = aVar.G(b0Var2, arrayList622222, a10, fVar2);
                    kotlin.jvm.internal.i.e(bVar5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    arrayList.add(bVar5);
                    i6 = 10;
                }
            }
            arrayList.add(bVar5);
            i6 = 10;
        }
        return arrayList;
    }
}
