package k3;

import android.graphics.PointF;
import java.util.List;
import l3.c;
/* compiled from: AnimatableTransformParser.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f22778a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f22779b = c.a.a("k");

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b2, code lost:
        if (r0 != false) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g3.d a(l3.d dVar, a3.c cVar) {
        boolean z10;
        boolean z11;
        k1.c cVar2;
        g3.e eVar;
        boolean z12;
        g3.e eVar2;
        boolean z13;
        boolean z14;
        g3.a aVar;
        boolean z15;
        boolean z16;
        g3.b bVar;
        boolean z17;
        g3.a aVar2;
        g3.e eVar3;
        List list;
        g3.b bVar2;
        if (dVar.J() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            dVar.e();
        }
        g3.b bVar3 = null;
        g3.a aVar3 = null;
        g3.e eVar4 = null;
        g3.b bVar4 = null;
        g3.b bVar5 = null;
        k1.c cVar3 = null;
        g3.a aVar4 = null;
        g3.b bVar6 = null;
        g3.b bVar7 = null;
        while (dVar.m()) {
            switch (dVar.R(f22778a)) {
                case 0:
                    aVar2 = aVar3;
                    eVar3 = eVar4;
                    dVar.e();
                    while (dVar.m()) {
                        if (dVar.R(f22779b) != 0) {
                            dVar.c0();
                            dVar.e0();
                        } else {
                            cVar3 = a.a(dVar, cVar);
                        }
                    }
                    dVar.h();
                    aVar3 = aVar2;
                    break;
                case 1:
                    eVar4 = a.b(dVar, cVar);
                    continue;
                case 2:
                    eVar3 = eVar4;
                    aVar3 = new g3.a(4, n.a(1.0f, cVar, hc.d.U, dVar));
                    break;
                case 3:
                    cVar.a("Lottie doesn't support 3D layers.");
                    g3.b W = sc.b.W(dVar, cVar, false);
                    list = (List) W.f16181b;
                    if (!list.isEmpty()) {
                        bVar2 = W;
                        aVar2 = aVar3;
                        eVar3 = eVar4;
                        list.add(new n3.a(cVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(cVar.f186l)));
                    } else {
                        bVar2 = W;
                        aVar2 = aVar3;
                        eVar3 = eVar4;
                        if (((n3.a) list.get(0)).f25862b == 0) {
                            list.set(0, new n3.a(cVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(cVar.f186l)));
                        }
                    }
                    bVar3 = bVar2;
                    aVar3 = aVar2;
                    break;
                case 4:
                    g3.b W2 = sc.b.W(dVar, cVar, false);
                    list = (List) W2.f16181b;
                    if (!list.isEmpty()) {
                    }
                    bVar3 = bVar2;
                    aVar3 = aVar2;
                    break;
                case 5:
                    aVar4 = sc.b.X(dVar, cVar);
                    continue;
                case 6:
                    bVar6 = sc.b.W(dVar, cVar, false);
                    continue;
                case 7:
                    bVar7 = sc.b.W(dVar, cVar, false);
                    continue;
                case 8:
                    bVar5 = sc.b.W(dVar, cVar, false);
                    continue;
                case 9:
                    bVar4 = sc.b.W(dVar, cVar, false);
                    continue;
                default:
                    dVar.c0();
                    dVar.e0();
                    continue;
            }
            eVar4 = eVar3;
        }
        g3.a aVar5 = aVar3;
        g3.e eVar5 = eVar4;
        if (z10) {
            dVar.h();
        }
        if (cVar3 != null && (!cVar3.j() || !((PointF) ((n3.a) cVar3.f22768a.get(0)).f25862b).equals(0.0f, 0.0f))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            eVar = eVar5;
            cVar2 = null;
        } else {
            cVar2 = cVar3;
            eVar = eVar5;
        }
        if (eVar != null && ((eVar instanceof g3.c) || !eVar.j() || !((PointF) ((n3.a) eVar.l().get(0)).f25862b).equals(0.0f, 0.0f))) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            eVar2 = null;
        } else {
            eVar2 = eVar;
        }
        if (bVar3 != null && (!bVar3.j() || ((Float) ((n3.a) ((List) bVar3.f16181b).get(0)).f25862b).floatValue() != 0.0f)) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            bVar3 = null;
        }
        if (aVar5 != null) {
            if (aVar5.j()) {
                n3.c cVar4 = (n3.c) ((n3.a) ((List) aVar5.f16181b).get(0)).f25862b;
                if (cVar4.f25876a == 1.0f && cVar4.f25877b == 1.0f) {
                    z17 = true;
                } else {
                    z17 = false;
                }
            }
            z14 = false;
            if (!z14) {
                aVar = null;
            } else {
                aVar = aVar5;
            }
            if (bVar5 == null && (!bVar5.j() || ((Float) ((n3.a) ((List) bVar5.f16181b).get(0)).f25862b).floatValue() != 0.0f)) {
                z15 = false;
            } else {
                z15 = true;
            }
            if (z15) {
                bVar5 = null;
            }
            if (bVar4 == null && (!bVar4.j() || ((Float) ((n3.a) ((List) bVar4.f16181b).get(0)).f25862b).floatValue() != 0.0f)) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (!z16) {
                bVar = null;
            } else {
                bVar = bVar4;
            }
            return new g3.d(cVar2, eVar2, aVar, bVar3, aVar4, bVar6, bVar7, bVar5, bVar);
        }
        z14 = true;
        if (!z14) {
        }
        if (bVar5 == null) {
        }
        z15 = true;
        if (z15) {
        }
        if (bVar4 == null) {
        }
        z16 = true;
        if (!z16) {
        }
        return new g3.d(cVar2, eVar2, aVar, bVar3, aVar4, bVar6, bVar7, bVar5, bVar);
    }
}
