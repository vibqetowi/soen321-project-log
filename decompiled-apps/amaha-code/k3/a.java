package k3;

import java.util.ArrayList;
import kotlin.jvm.internal.b0;
import l3.c;
/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f22775a = c.a.a("k", "x", "y");

    public static k1.c a(l3.d dVar, a3.c cVar) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (dVar.J() == 1) {
            dVar.a();
            while (dVar.m()) {
                if (dVar.J() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new d3.g(cVar, m.a(dVar, cVar, m3.g.c(), b0.L, z10)));
            }
            dVar.g();
            n.b(arrayList);
        } else {
            arrayList.add(new n3.a(l.b(dVar, m3.g.c())));
        }
        return new k1.c(2, arrayList);
    }

    public static g3.e b(l3.d dVar, a3.c cVar) {
        dVar.e();
        k1.c cVar2 = null;
        g3.b bVar = null;
        g3.b bVar2 = null;
        boolean z10 = false;
        while (dVar.J() != 4) {
            int R = dVar.R(f22775a);
            if (R != 0) {
                if (R != 1) {
                    if (R != 2) {
                        dVar.c0();
                        dVar.e0();
                    } else if (dVar.J() == 6) {
                        dVar.e0();
                        z10 = true;
                    } else {
                        bVar2 = sc.b.W(dVar, cVar, true);
                    }
                } else if (dVar.J() == 6) {
                    dVar.e0();
                    z10 = true;
                } else {
                    bVar = sc.b.W(dVar, cVar, true);
                }
            } else {
                cVar2 = a(dVar, cVar);
            }
        }
        dVar.h();
        if (z10) {
            cVar.a("Lottie doesn't support expressions.");
        }
        if (cVar2 != null) {
            return cVar2;
        }
        return new g3.c(bVar, bVar2);
    }
}
