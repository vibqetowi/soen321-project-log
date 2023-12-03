package fu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: StandardClassIds.kt */
/* loaded from: classes2.dex */
public final class i {
    static {
        new c("java.lang").c(e.j("annotation"));
    }

    public static final b a(String str) {
        c cVar = h.f15939a;
        return new b(h.f15939a, e.j(str));
    }

    public static final b b(String str) {
        c cVar = h.f15939a;
        return new b(h.f15941c, e.j(str));
    }

    public static final LinkedHashMap c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        int P = sp.b.P(is.i.H1(entrySet, 10));
        if (P < 16) {
            P = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P);
        for (Map.Entry entry : entrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final b d(e eVar) {
        c cVar = h.f15939a;
        b bVar = h.f15944g;
        c h10 = bVar.h();
        return new b(h10, e.j(eVar.h() + bVar.j().h()));
    }

    public static final void e(String str) {
        c cVar = h.f15939a;
        new b(h.f15942d, e.j(str));
    }

    public static final b f(String str) {
        c cVar = h.f15939a;
        return new b(h.f15940b, e.j(str));
    }

    public static final b g(b bVar) {
        c cVar = h.f15939a;
        c cVar2 = h.f15939a;
        return new b(cVar2, e.j("U" + bVar.j().h()));
    }
}
