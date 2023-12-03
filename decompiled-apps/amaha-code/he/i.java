package he;

import he.h;
import java.util.TreeMap;
/* compiled from: DocumentViewChangeSet.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap<ke.i, h> f17527a = new TreeMap<>();

    public final void a(h hVar) {
        ke.g gVar = hVar.f17513b;
        ke.i key = gVar.getKey();
        TreeMap<ke.i, h> treeMap = this.f17527a;
        h hVar2 = treeMap.get(key);
        if (hVar2 == null) {
            treeMap.put(key, hVar);
            return;
        }
        h.a aVar = h.a.ADDED;
        h.a aVar2 = h.a.METADATA;
        h.a aVar3 = hVar2.f17512a;
        h.a aVar4 = hVar.f17512a;
        if (aVar4 != aVar && aVar3 == aVar2) {
            treeMap.put(key, hVar);
            return;
        }
        h.a aVar5 = h.a.REMOVED;
        if (aVar4 == aVar2 && aVar3 != aVar5) {
            treeMap.put(key, new h(aVar3, gVar));
            return;
        }
        h.a aVar6 = h.a.MODIFIED;
        if (aVar4 == aVar6 && aVar3 == aVar6) {
            treeMap.put(key, new h(aVar6, gVar));
        } else if (aVar4 == aVar6 && aVar3 == aVar) {
            treeMap.put(key, new h(aVar, gVar));
        } else if (aVar4 == aVar5 && aVar3 == aVar) {
            treeMap.remove(key);
        } else if (aVar4 == aVar5 && aVar3 == aVar6) {
            treeMap.put(key, new h(aVar5, hVar2.f17513b));
        } else if (aVar4 == aVar && aVar3 == aVar5) {
            treeMap.put(key, new h(aVar6, gVar));
        } else {
            ca.a.V("Unsupported combination of changes %s after %s", aVar4, aVar3);
            throw null;
        }
    }
}
