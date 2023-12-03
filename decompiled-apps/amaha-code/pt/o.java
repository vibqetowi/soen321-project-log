package pt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: FakePureImplementationsProvider.kt */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap f28945a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<fu.c, fu.c> f28946b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f28945a = linkedHashMap;
        b(fu.h.f15953p, a("java.util.ArrayList", "java.util.LinkedList"));
        b(fu.h.f15954q, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(fu.h.r, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(fu.b.l(new fu.c("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(fu.b.l(new fu.c("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new hs.f(((fu.b) entry.getKey()).b(), ((fu.b) entry.getValue()).b()));
        }
        f28946b = is.e0.w0(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(fu.b.l(new fu.c(str)));
        }
        return arrayList;
    }

    public static void b(fu.b bVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            fu.b bVar2 = (fu.b) next;
            f28945a.put(next, bVar);
        }
    }
}
