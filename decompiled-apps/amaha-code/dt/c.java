package dt;

import dt.n;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: CompanionObjectMapping.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashSet f13354a;

    static {
        Set<k> set = k.f13368y;
        ArrayList arrayList = new ArrayList(is.i.H1(set, 10));
        for (k primitiveType : set) {
            kotlin.jvm.internal.i.g(primitiveType, "primitiveType");
            arrayList.add(n.f13390j.c(primitiveType.f13370u));
        }
        fu.c h10 = n.a.f.h();
        kotlin.jvm.internal.i.f(h10, "string.toSafe()");
        ArrayList v22 = u.v2(h10, arrayList);
        fu.c h11 = n.a.f13403h.h();
        kotlin.jvm.internal.i.f(h11, "_boolean.toSafe()");
        ArrayList v23 = u.v2(h11, v22);
        fu.c h12 = n.a.f13405j.h();
        kotlin.jvm.internal.i.f(h12, "_enum.toSafe()");
        ArrayList v24 = u.v2(h12, v23);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = v24.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(fu.b.l((fu.c) it.next()));
        }
        f13354a = linkedHashSet;
    }
}
