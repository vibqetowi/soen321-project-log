package je;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
/* compiled from: MemoryDocumentOverlayCache.java */
/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap<ke.i, le.j> f21905a = new TreeMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f21906b = new HashMap();

    @Override // je.b
    public final void a(int i6, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            le.f fVar = (le.f) entry.getValue();
            Object[] objArr = {entry.getKey()};
            if (fVar != null) {
                TreeMap<ke.i, le.j> treeMap = this.f21905a;
                ke.i iVar = fVar.f24215a;
                le.j jVar = treeMap.get(iVar);
                HashMap hashMap2 = this.f21906b;
                if (jVar != null) {
                    ((Set) hashMap2.get(Integer.valueOf(jVar.b()))).remove(iVar);
                }
                treeMap.put(iVar, new le.b(i6, fVar));
                if (hashMap2.get(Integer.valueOf(i6)) == null) {
                    hashMap2.put(Integer.valueOf(i6), new HashSet());
                }
                ((Set) hashMap2.get(Integer.valueOf(i6))).add(iVar);
            } else {
                throw new NullPointerException(String.format(Locale.US, "null value for key: %s", objArr));
            }
        }
    }

    @Override // je.b
    public final le.j b(ke.i iVar) {
        return this.f21905a.get(iVar);
    }

    @Override // je.b
    public final HashMap c(int i6, int i10, String str) {
        TreeMap treeMap = new TreeMap();
        for (le.j jVar : this.f21905a.values()) {
            ke.p pVar = jVar.a().f23275u;
            if (pVar.l(pVar.p() - 2).equals(str) && jVar.b() > i6) {
                Map map = (Map) treeMap.get(Integer.valueOf(jVar.b()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(jVar.b()), map);
                }
                map.put(jVar.a(), jVar);
            }
        }
        HashMap hashMap = new HashMap();
        for (Map map2 : treeMap.values()) {
            hashMap.putAll(map2);
            if (hashMap.size() >= i10) {
                break;
            }
        }
        return hashMap;
    }

    @Override // je.b
    public final HashMap d(TreeSet treeSet) {
        HashMap hashMap = new HashMap();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            ke.i iVar = (ke.i) it.next();
            le.j jVar = this.f21905a.get(iVar);
            if (jVar != null) {
                hashMap.put(iVar, jVar);
            }
        }
        return hashMap;
    }

    @Override // je.b
    public final void e(int i6) {
        HashMap hashMap = this.f21906b;
        if (hashMap.containsKey(Integer.valueOf(i6))) {
            hashMap.remove(Integer.valueOf(i6));
            for (ke.i iVar : (Set) hashMap.get(Integer.valueOf(i6))) {
                this.f21905a.remove(iVar);
            }
        }
    }

    @Override // je.b
    public final HashMap f(ke.p pVar, int i6) {
        HashMap hashMap = new HashMap();
        int p10 = pVar.p() + 1;
        for (le.j jVar : this.f21905a.tailMap(new ke.i(pVar.d(""))).values()) {
            ke.i a10 = jVar.a();
            if (!pVar.n(a10.f23275u)) {
                break;
            } else if (a10.f23275u.p() == p10 && jVar.b() > i6) {
                hashMap.put(jVar.a(), jVar);
            }
        }
        return hashMap;
    }
}
