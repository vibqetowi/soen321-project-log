package k3;

import java.util.ArrayList;
import l3.c;
/* compiled from: KeyframesParser.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f22797a = c.a.a("k");

    public static ArrayList a(float f, a3.c cVar, a0 a0Var, l3.c cVar2) {
        ArrayList arrayList = new ArrayList();
        if (cVar2.J() == 6) {
            cVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar2.e();
        while (cVar2.m()) {
            if (cVar2.R(f22797a) != 0) {
                cVar2.e0();
            } else if (cVar2.J() == 1) {
                cVar2.a();
                if (cVar2.J() == 7) {
                    arrayList.add(m.a(cVar2, cVar, f, a0Var, false));
                } else {
                    while (cVar2.m()) {
                        arrayList.add(m.a(cVar2, cVar, f, a0Var, true));
                    }
                }
                cVar2.g();
            } else {
                arrayList.add(m.a(cVar2, cVar, f, a0Var, false));
            }
        }
        cVar2.h();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i6;
        T t3;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            i6 = size - 1;
            if (i10 >= i6) {
                break;
            }
            n3.a aVar = (n3.a) arrayList.get(i10);
            i10++;
            n3.a aVar2 = (n3.a) arrayList.get(i10);
            aVar.f = Float.valueOf(aVar2.f25865e);
            if (aVar.f25863c == 0 && (t3 = aVar2.f25862b) != 0) {
                aVar.f25863c = t3;
                if (aVar instanceof d3.g) {
                    ((d3.g) aVar).d();
                }
            }
        }
        n3.a aVar3 = (n3.a) arrayList.get(i6);
        if ((aVar3.f25862b == 0 || aVar3.f25863c == 0) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
