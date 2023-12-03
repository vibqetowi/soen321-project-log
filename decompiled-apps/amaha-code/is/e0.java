package is;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: _MapsJvm.kt */
/* loaded from: classes2.dex */
public class e0 extends sp.b {
    public static final Object r0(Map map, Comparable comparable) {
        kotlin.jvm.internal.i.g(map, "<this>");
        if (map instanceof d0) {
            return ((d0) map).e();
        }
        Object obj = map.get(comparable);
        if (obj == null && !map.containsKey(comparable)) {
            throw new NoSuchElementException("Key " + comparable + " is missing in the map.");
        }
        return obj;
    }

    public static final HashMap s0(hs.f... fVarArr) {
        HashMap hashMap = new HashMap(sp.b.P(fVarArr.length));
        v0(hashMap, fVarArr);
        return hashMap;
    }

    public static final LinkedHashMap t0(hs.f... fVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(sp.b.P(fVarArr.length));
        v0(linkedHashMap, fVarArr);
        return linkedHashMap;
    }

    public static final Map u0(hs.f... fVarArr) {
        if (fVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(sp.b.P(fVarArr.length));
            v0(linkedHashMap, fVarArr);
            return linkedHashMap;
        }
        return x.f20677u;
    }

    public static final void v0(HashMap hashMap, hs.f[] fVarArr) {
        for (hs.f fVar : fVarArr) {
            hashMap.put(fVar.f19464u, fVar.f19465v);
        }
    }

    public static final Map w0(ArrayList arrayList) {
        x xVar = x.f20677u;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(sp.b.P(arrayList.size()));
                y0(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            return sp.b.Q((hs.f) arrayList.get(0));
        }
        return xVar;
    }

    public static final Map x0(Map map) {
        kotlin.jvm.internal.i.g(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return z0(map);
            }
            return sp.b.g0(map);
        }
        return x.f20677u;
    }

    public static final void y0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hs.f fVar = (hs.f) it.next();
            linkedHashMap.put(fVar.f19464u, fVar.f19465v);
        }
    }

    public static final LinkedHashMap z0(Map map) {
        kotlin.jvm.internal.i.g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
