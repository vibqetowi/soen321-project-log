package pt;

import com.theinnerhour.b2b.utils.SessionManager;
import dt.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: BuiltinSpecialProperties.kt */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<fu.c, fu.e> f28918a;

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f28919b;

    /* renamed from: c  reason: collision with root package name */
    public static final Set<fu.c> f28920c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set<fu.e> f28921d;

    static {
        fu.d dVar = n.a.f13405j;
        fu.c cVar = n.a.F;
        Map<fu.c, fu.e> u02 = is.e0.u0(new hs.f(ca.a.f(dVar, SessionManager.KEY_NAME), fu.e.j(SessionManager.KEY_NAME)), new hs.f(ca.a.f(dVar, "ordinal"), fu.e.j("ordinal")), new hs.f(n.a.B.c(fu.e.j("size")), fu.e.j("size")), new hs.f(cVar.c(fu.e.j("size")), fu.e.j("size")), new hs.f(ca.a.f(n.a.f13401e, "length"), fu.e.j("length")), new hs.f(cVar.c(fu.e.j("keys")), fu.e.j("keySet")), new hs.f(cVar.c(fu.e.j("values")), fu.e.j("values")), new hs.f(cVar.c(fu.e.j("entries")), fu.e.j("entrySet")));
        f28918a = u02;
        Set<Map.Entry<fu.c, fu.e>> entrySet = u02.entrySet();
        ArrayList arrayList = new ArrayList(is.i.H1(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new hs.f(((fu.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            hs.f fVar = (hs.f) it2.next();
            fu.e eVar = (fu.e) fVar.f19465v;
            Object obj = linkedHashMap.get(eVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(eVar, obj);
            }
            ((List) obj).add((fu.e) fVar.f19464u);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sp.b.P(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), is.u.a2((Iterable) entry2.getValue()));
        }
        f28919b = linkedHashMap2;
        Set<fu.c> keySet = f28918a.keySet();
        f28920c = keySet;
        ArrayList arrayList2 = new ArrayList(is.i.H1(keySet, 10));
        for (fu.c cVar2 : keySet) {
            arrayList2.add(cVar2.f());
        }
        f28921d = is.u.M2(arrayList2);
    }
}
