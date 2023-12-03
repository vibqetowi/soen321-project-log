package is;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public final class h0 extends ca.a {
    public static final LinkedHashSet G1(Set set, Object obj) {
        kotlin.jvm.internal.i.g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(sp.b.P(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.i.b(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static final LinkedHashSet H1(Set set, Object obj) {
        kotlin.jvm.internal.i.g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(sp.b.P(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final LinkedHashSet I1(Set set, Collection elements) {
        int size;
        kotlin.jvm.internal.i.g(set, "<this>");
        kotlin.jvm.internal.i.g(elements, "elements");
        Integer valueOf = Integer.valueOf(elements.size());
        if (valueOf != null) {
            size = set.size() + valueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(sp.b.P(size));
        linkedHashSet.addAll(set);
        q.R1(elements, linkedHashSet);
        return linkedHashSet;
    }
}
