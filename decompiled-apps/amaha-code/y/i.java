package y;

import java.util.ArrayList;
import x.e;
/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public final class i {
    public static o a(x.e eVar, int i6, ArrayList<o> arrayList, o oVar) {
        int i10;
        boolean z10;
        int i11;
        if (i6 == 0) {
            i10 = eVar.f37397u0;
        } else {
            i10 = eVar.f37399v0;
        }
        int i12 = 0;
        if (i10 != -1 && (oVar == null || i10 != oVar.f38172b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i13);
                if (oVar2.f38172b == i10) {
                    if (oVar != null) {
                        oVar.c(i6, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i13++;
                }
            }
        } else if (i10 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (eVar instanceof x.j) {
                x.j jVar = (x.j) eVar;
                int i14 = 0;
                while (true) {
                    if (i14 < jVar.f37439x0) {
                        x.e eVar2 = jVar.f37438w0[i14];
                        if ((i6 == 0 && (i11 = eVar2.f37397u0) != -1) || (i6 == 1 && (i11 = eVar2.f37399v0) != -1)) {
                            break;
                        }
                        i14++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 != -1) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i15);
                        if (oVar3.f38172b == i11) {
                            oVar = oVar3;
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i6);
            }
            arrayList.add(oVar);
        }
        ArrayList<x.e> arrayList2 = oVar.f38171a;
        if (arrayList2.contains(eVar)) {
            z10 = false;
        } else {
            arrayList2.add(eVar);
            z10 = true;
        }
        if (z10) {
            if (eVar instanceof x.h) {
                x.h hVar = (x.h) eVar;
                x.d dVar = hVar.f37437z0;
                if (hVar.A0 == 0) {
                    i12 = 1;
                }
                dVar.c(i12, oVar, arrayList);
            }
            int i16 = oVar.f38172b;
            if (i6 == 0) {
                eVar.f37397u0 = i16;
                eVar.K.c(i6, oVar, arrayList);
                eVar.M.c(i6, oVar, arrayList);
            } else {
                eVar.f37399v0 = i16;
                eVar.L.c(i6, oVar, arrayList);
                eVar.O.c(i6, oVar, arrayList);
                eVar.N.c(i6, oVar, arrayList);
            }
            eVar.R.c(i6, oVar, arrayList);
        }
        return oVar;
    }

    public static boolean b(e.a aVar, e.a aVar2, e.a aVar3, e.a aVar4) {
        boolean z10;
        boolean z11;
        e.a aVar5 = e.a.FIXED;
        e.a aVar6 = e.a.MATCH_PARENT;
        e.a aVar7 = e.a.WRAP_CONTENT;
        if (aVar3 != aVar5 && aVar3 != aVar7 && (aVar3 != aVar6 || aVar == aVar7)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (aVar4 != aVar5 && aVar4 != aVar7 && (aVar4 != aVar6 || aVar2 == aVar7)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }
}
