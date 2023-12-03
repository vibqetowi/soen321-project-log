package oe;

import he.k;
import he.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rf.s;
/* compiled from: LogicUtils.java */
/* loaded from: classes.dex */
public final class k {
    public static he.l a(he.l lVar) {
        boolean z10;
        int i6;
        d(lVar);
        if (lVar instanceof he.k) {
            return lVar;
        }
        he.g gVar = (he.g) lVar;
        List<he.l> b10 = gVar.b();
        if (b10.size() == 1) {
            return a(b10.get(0));
        }
        Iterator it = gVar.f17499a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((he.l) it.next()) instanceof he.g) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return gVar;
        }
        ArrayList arrayList = new ArrayList();
        for (he.l lVar2 : b10) {
            arrayList.add(a(lVar2));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i6 = gVar.f17500b;
            if (!hasNext) {
                break;
            }
            he.l lVar3 = (he.l) it2.next();
            if (lVar3 instanceof he.k) {
                arrayList2.add(lVar3);
            } else if (lVar3 instanceof he.g) {
                he.g gVar2 = (he.g) lVar3;
                if (v.h.b(gVar2.f17500b, i6)) {
                    arrayList2.addAll(gVar2.b());
                } else {
                    arrayList2.add(gVar2);
                }
            }
        }
        if (arrayList2.size() == 1) {
            return (he.l) arrayList2.get(0);
        }
        return new he.g(arrayList2, i6);
    }

    public static he.g b(he.k kVar, he.g gVar) {
        if (gVar.f()) {
            List singletonList = Collections.singletonList(kVar);
            ArrayList arrayList = new ArrayList(gVar.f17499a);
            arrayList.addAll(singletonList);
            return new he.g(arrayList, gVar.f17500b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (he.l lVar : gVar.b()) {
            arrayList2.add(c(kVar, lVar));
        }
        return new he.g(arrayList2, 2);
    }

    public static he.l c(he.l lVar, he.l lVar2) {
        boolean z10;
        boolean z11;
        he.g gVar;
        he.g gVar2;
        he.g gVar3;
        d(lVar);
        d(lVar2);
        boolean z12 = lVar instanceof he.k;
        boolean z13 = true;
        if (z12 && (lVar2 instanceof he.k)) {
            gVar3 = new he.g(Arrays.asList((he.k) lVar, (he.k) lVar2), 1);
        } else if (z12 && (lVar2 instanceof he.g)) {
            gVar3 = b((he.k) lVar, (he.g) lVar2);
        } else if ((lVar instanceof he.g) && (lVar2 instanceof he.k)) {
            gVar3 = b((he.k) lVar2, (he.g) lVar);
        } else {
            he.g gVar4 = (he.g) lVar;
            he.g gVar5 = (he.g) lVar2;
            if (!gVar4.b().isEmpty() && !gVar5.b().isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ca.a.u0(z10, "Found an empty composite filter", new Object[0]);
            boolean f = gVar4.f();
            int i6 = gVar4.f17500b;
            if (f && gVar5.f()) {
                List<he.l> b10 = gVar5.b();
                ArrayList arrayList = new ArrayList(gVar4.f17499a);
                arrayList.addAll(b10);
                gVar2 = new he.g(arrayList, i6);
            } else {
                if (i6 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    gVar = gVar4;
                } else {
                    gVar = gVar5;
                }
                if (i6 != 2) {
                    z13 = false;
                }
                if (z13) {
                    gVar4 = gVar5;
                }
                ArrayList arrayList2 = new ArrayList();
                for (he.l lVar3 : gVar.b()) {
                    arrayList2.add(c(lVar3, gVar4));
                }
                gVar2 = new he.g(arrayList2, 2);
            }
            gVar3 = gVar2;
        }
        return a(gVar3);
    }

    public static void d(he.l lVar) {
        boolean z10;
        if (!(lVar instanceof he.k) && !(lVar instanceof he.g)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ca.a.u0(z10, "Only field filters and composite filters are accepted.", new Object[0]);
    }

    public static he.l e(he.l lVar) {
        boolean z10;
        d(lVar);
        if (lVar instanceof he.k) {
            return lVar;
        }
        he.g gVar = (he.g) lVar;
        if (gVar.b().size() == 1) {
            return e(lVar.b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        for (he.l lVar2 : gVar.b()) {
            arrayList.add(e(lVar2));
        }
        he.l a10 = a(new he.g(arrayList, gVar.f17500b));
        if (g(a10)) {
            return a10;
        }
        ca.a.u0(a10 instanceof he.g, "field filters are already in DNF form.", new Object[0]);
        he.g gVar2 = (he.g) a10;
        ca.a.u0(gVar2.f(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        if (gVar2.b().size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Single-filter composite filters are already in DNF form.", new Object[0]);
        he.l lVar3 = gVar2.b().get(0);
        for (int i6 = 1; i6 < gVar2.b().size(); i6++) {
            lVar3 = c(lVar3, gVar2.b().get(i6));
        }
        return lVar3;
    }

    public static he.l f(he.l lVar) {
        d(lVar);
        ArrayList arrayList = new ArrayList();
        if (lVar instanceof he.k) {
            if (lVar instanceof o) {
                o oVar = (o) lVar;
                for (s sVar : oVar.f17538b.X().p()) {
                    k.a aVar = k.a.EQUAL;
                    arrayList.add(he.k.f(oVar.f17539c, aVar, sVar));
                }
                return new he.g(arrayList, 2);
            }
            return lVar;
        }
        he.g gVar = (he.g) lVar;
        for (he.l lVar2 : gVar.b()) {
            arrayList.add(f(lVar2));
        }
        return new he.g(arrayList, gVar.f17500b);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g(he.l lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        if (lVar instanceof he.k) {
            return true;
        }
        boolean z18 = lVar instanceof he.g;
        if (z18) {
            he.g gVar = (he.g) lVar;
            Iterator it = gVar.f17499a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((he.l) it.next()) instanceof he.g) {
                        z16 = false;
                        break;
                    }
                } else {
                    z16 = true;
                    break;
                }
            }
            if (z16 && gVar.f()) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                z10 = true;
                if (!z10) {
                    return true;
                }
                if (z18) {
                    he.g gVar2 = (he.g) lVar;
                    if (gVar2.f17500b == 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        for (he.l lVar2 : gVar2.b()) {
                            if (!(lVar2 instanceof he.k)) {
                                if (lVar2 instanceof he.g) {
                                    he.g gVar3 = (he.g) lVar2;
                                    Iterator it2 = gVar3.f17499a.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (((he.l) it2.next()) instanceof he.g) {
                                                z14 = false;
                                                break;
                                            }
                                        } else {
                                            z14 = true;
                                            break;
                                        }
                                    }
                                    if (z14 && gVar3.f()) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        z13 = true;
                                        if (z13) {
                                        }
                                    }
                                }
                                z13 = false;
                                if (z13) {
                                }
                            }
                        }
                        z11 = true;
                        if (!z11) {
                            return true;
                        }
                        return false;
                    }
                }
                z11 = false;
                if (!z11) {
                }
            }
        }
        z10 = false;
        if (!z10) {
        }
    }
}
