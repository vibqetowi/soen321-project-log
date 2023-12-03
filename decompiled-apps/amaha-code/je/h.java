package je;

import com.google.firebase.database.collection.ImmutableSortedMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import ke.l;
/* compiled from: LocalDocumentsView.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f21830a;

    /* renamed from: b  reason: collision with root package name */
    public final w f21831b;

    /* renamed from: c  reason: collision with root package name */
    public final b f21832c;

    /* renamed from: d  reason: collision with root package name */
    public final f f21833d;

    public h(c0 c0Var, w wVar, b bVar, f fVar) {
        this.f21830a = c0Var;
        this.f21831b = wVar;
        this.f21832c = bVar;
        this.f21833d = fVar;
    }

    public final HashMap a(Map map, Map map2, Set set) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (ke.n nVar : map.values()) {
            le.j jVar = (le.j) map2.get(nVar.f23285b);
            ke.i iVar = nVar.f23285b;
            if (set.contains(iVar) && (jVar == null || (jVar.c() instanceof le.k))) {
                hashMap.put(iVar, nVar);
            } else if (jVar != null) {
                hashMap2.put(iVar, jVar.c().d());
                jVar.c().a(nVar, jVar.c().d(), new sc.h(new Date()));
            } else {
                hashMap2.put(iVar, le.d.f24211b);
            }
        }
        hashMap2.putAll(g(hashMap));
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap3.put((ke.i) entry.getKey(), new y((ke.g) entry.getValue(), (le.d) hashMap2.get(entry.getKey())));
        }
        return hashMap3;
    }

    public final ImmutableSortedMap<ke.i, ke.g> b(Iterable<ke.i> iterable) {
        return e(this.f21830a.e(iterable), new HashSet());
    }

    public final ImmutableSortedMap<ke.i, ke.g> c(he.y yVar, l.a aVar) {
        HashMap f = this.f21832c.f(yVar.f17581e, aVar.i());
        HashMap d10 = this.f21830a.d(yVar, aVar, f.keySet());
        for (Map.Entry entry : f.entrySet()) {
            if (!d10.containsKey(entry.getKey())) {
                d10.put((ke.i) entry.getKey(), ke.n.m((ke.i) entry.getKey()));
            }
        }
        ImmutableSortedMap immutableSortedMap = ke.h.f23272a;
        for (Map.Entry entry2 : d10.entrySet()) {
            le.j jVar = (le.j) f.get(entry2.getKey());
            if (jVar != null) {
                jVar.c().a((ke.n) entry2.getValue(), le.d.f24211b, new sc.h(new Date()));
            }
            if (yVar.i((ke.g) entry2.getValue())) {
                immutableSortedMap = immutableSortedMap.insert((ke.i) entry2.getKey(), (ke.g) entry2.getValue());
            }
        }
        return immutableSortedMap;
    }

    public final ImmutableSortedMap<ke.i, ke.g> d(he.y yVar, l.a aVar) {
        boolean z10;
        ke.n b10;
        ke.p pVar = yVar.f17581e;
        if (yVar.g()) {
            ImmutableSortedMap immutableSortedMap = ke.h.f23272a;
            ke.i iVar = new ke.i(pVar);
            le.j b11 = this.f21832c.b(iVar);
            if (b11 != null && !(b11.c() instanceof le.k)) {
                b10 = ke.n.m(iVar);
            } else {
                b10 = this.f21830a.b(iVar);
            }
            if (b11 != null) {
                b11.c().a(b10, le.d.f24211b, new sc.h(new Date()));
            }
            if (b10.b()) {
                return immutableSortedMap.insert(b10.f23285b, b10);
            }
            return immutableSortedMap;
        }
        String str = yVar.f;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ca.a.u0(yVar.f17581e.isEmpty(), "Currently we only support collection group queries at the root.", new Object[0]);
            ImmutableSortedMap immutableSortedMap2 = ke.h.f23272a;
            for (ke.p pVar2 : this.f21833d.g(str)) {
                Iterator<Map.Entry<ke.i, ke.g>> it = c(new he.y(pVar2.d(str), null, yVar.f17580d, yVar.f17577a, yVar.f17582g, yVar.f17583h, yVar.f17584i, yVar.f17585j), aVar).iterator();
                immutableSortedMap2 = immutableSortedMap2;
                while (it.hasNext()) {
                    Map.Entry<ke.i, ke.g> next = it.next();
                    immutableSortedMap2 = immutableSortedMap2.insert(next.getKey(), next.getValue());
                }
            }
            return immutableSortedMap2;
        }
        return c(yVar, aVar);
    }

    public final ImmutableSortedMap e(Map map, HashSet hashSet) {
        HashMap hashMap = new HashMap();
        f(hashMap, map.keySet());
        ImmutableSortedMap<ke.i, ?> immutableSortedMap = ke.h.f23272a;
        for (Map.Entry entry : a(map, hashMap, hashSet).entrySet()) {
            immutableSortedMap = immutableSortedMap.insert((ke.i) entry.getKey(), ((y) entry.getValue()).f21969a);
        }
        return immutableSortedMap;
    }

    public final void f(Map<ke.i, le.j> map, Set<ke.i> set) {
        TreeSet treeSet = new TreeSet();
        for (ke.i iVar : set) {
            if (!map.containsKey(iVar)) {
                treeSet.add(iVar);
            }
        }
        map.putAll(this.f21832c.d(treeSet));
    }

    public final HashMap g(Map map) {
        le.d dVar;
        ArrayList<le.g> e10 = this.f21831b.e(map.keySet());
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (le.g gVar : e10) {
            Iterator it = gVar.b().iterator();
            while (it.hasNext()) {
                ke.i iVar = (ke.i) it.next();
                ke.n nVar = (ke.n) map.get(iVar);
                if (nVar != null) {
                    if (hashMap.containsKey(iVar)) {
                        dVar = (le.d) hashMap.get(iVar);
                    } else {
                        dVar = le.d.f24211b;
                    }
                    hashMap.put(iVar, gVar.a(nVar, dVar));
                    int i6 = gVar.f24218a;
                    if (!treeMap.containsKey(Integer.valueOf(i6))) {
                        treeMap.put(Integer.valueOf(i6), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(i6))).add(iVar);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (ke.i iVar2 : (Set) entry.getValue()) {
                if (!hashSet.contains(iVar2)) {
                    le.f c10 = le.f.c((ke.n) map.get(iVar2), (le.d) hashMap.get(iVar2));
                    if (c10 != null) {
                        hashMap2.put(iVar2, c10);
                    }
                    hashSet.add(iVar2);
                }
            }
            this.f21832c.a(((Integer) entry.getKey()).intValue(), hashMap2);
        }
        return hashMap;
    }
}
