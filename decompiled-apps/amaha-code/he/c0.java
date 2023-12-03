package he;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import he.g0;
import he.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import je.b1;
import ne.x;
import tr.i0;
/* compiled from: SyncEngine.java */
/* loaded from: classes.dex */
public final class c0 implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public final je.k f17452a;

    /* renamed from: b  reason: collision with root package name */
    public final ne.x f17453b;

    /* renamed from: e  reason: collision with root package name */
    public final int f17456e;

    /* renamed from: m  reason: collision with root package name */
    public ge.e f17463m;

    /* renamed from: n  reason: collision with root package name */
    public b f17464n;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f17454c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f17455d = new HashMap();
    public final LinkedHashSet<ke.i> f = new LinkedHashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f17457g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f17458h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final nd.z f17459i = new nd.z(5);

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f17460j = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public final e0 f17462l = new e0(1, 1, 0);

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f17461k = new HashMap();

    /* compiled from: SyncEngine.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ke.i f17465a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17466b;

        public a(ke.i iVar) {
            this.f17465a = iVar;
        }
    }

    /* compiled from: SyncEngine.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public c0(je.k kVar, ne.x xVar, ge.e eVar, int i6) {
        this.f17452a = kVar;
        this.f17453b = xVar;
        this.f17456e = i6;
        this.f17463m = eVar;
    }

    public static void i(i0 i0Var, String str, Object... objArr) {
        boolean z10;
        i0.a aVar = i0Var.f33491a;
        String str2 = i0Var.f33492b;
        if (str2 == null) {
            str2 = "";
        }
        if ((aVar == i0.a.FAILED_PRECONDITION && str2.contains("requires an index")) || aVar == i0.a.PERMISSION_DENIED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            kc.f.A(2, "Firestore", "%s: %s", String.format(str, objArr), i0Var);
        }
    }

    @Override // ne.x.a
    public final void a(int i6, i0 i0Var) {
        g("handleRejectedWrite");
        je.k kVar = this.f17452a;
        kVar.getClass();
        ImmutableSortedMap<ke.i, ke.g> immutableSortedMap = (ImmutableSortedMap) kVar.f21846a.z("Reject batch", new o7.k(i6, kVar));
        if (!immutableSortedMap.isEmpty()) {
            i(i0Var, "Write failed at %s", immutableSortedMap.getMinKey().f23275u);
        }
        j(i6, i0Var);
        n(i6);
        h(immutableSortedMap, null);
    }

    @Override // ne.x.a
    public final void b(int i6, i0 i0Var) {
        ke.i iVar;
        g("handleRejectedListen");
        HashMap hashMap = this.f17458h;
        a aVar = (a) hashMap.get(Integer.valueOf(i6));
        if (aVar != null) {
            iVar = aVar.f17465a;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            this.f17457g.remove(iVar);
            hashMap.remove(Integer.valueOf(i6));
            k();
            ke.r rVar = ke.r.f23293v;
            e(new q.f(rVar, Collections.emptyMap(), Collections.emptySet(), Collections.singletonMap(iVar, ke.n.n(iVar, rVar)), Collections.singleton(iVar), 5));
            return;
        }
        je.k kVar = this.f17452a;
        kVar.getClass();
        kVar.f21846a.A("Release target", new i0.g(i6, 3, kVar));
        l(i6, i0Var);
    }

    @Override // ne.x.a
    public final void c(w wVar) {
        boolean z10;
        nd.z zVar;
        g("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f17454c.entrySet()) {
            g0 g0Var = ((a0) entry.getValue()).f17451c;
            if (g0Var.f17504c && wVar == w.OFFLINE) {
                g0Var.f17504c = false;
                zVar = g0Var.a(new g0.a(g0Var.f17505d, new i(), g0Var.f17507g, false), null);
            } else {
                zVar = new nd.z(null, 3, Collections.emptyList());
            }
            ca.a.u0(((List) zVar.f26149c).isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            h0 h0Var = (h0) zVar.f26148b;
            if (h0Var != null) {
                arrayList.add(h0Var);
            }
        }
        ((j) this.f17464n).a(arrayList);
        j jVar = (j) this.f17464n;
        jVar.f17531d = wVar;
        boolean z11 = false;
        for (j.b bVar : jVar.f17529b.values()) {
            Iterator it = bVar.f17535a.iterator();
            while (it.hasNext()) {
                z zVar2 = (z) it.next();
                zVar2.f17591e = wVar;
                h0 h0Var2 = zVar2.f;
                if (h0Var2 != null && !zVar2.f17590d && zVar2.c(h0Var2, wVar)) {
                    zVar2.b(zVar2.f);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            jVar.b();
        }
    }

    @Override // ne.x.a
    public final void d(q.f fVar) {
        g("handleSuccessfulWrite");
        Object obj = fVar.f29104v;
        j(((le.g) obj).f24218a, null);
        n(((le.g) obj).f24218a);
        je.k kVar = this.f17452a;
        kVar.getClass();
        h((ImmutableSortedMap) kVar.f21846a.z("Acknowledge batch", new dd.a(kVar, 20, fVar)), null);
    }

    @Override // ne.x.a
    public final void e(q.f fVar) {
        boolean z10;
        g("handleRemoteEvent");
        for (Map.Entry entry : ((Map) fVar.f29105w).entrySet()) {
            ne.a0 a0Var = (ne.a0) entry.getValue();
            a aVar = (a) this.f17458h.get((Integer) entry.getKey());
            if (aVar != null) {
                int size = a0Var.f26154c.size();
                ImmutableSortedSet<ke.i> immutableSortedSet = a0Var.f26155d;
                int size2 = immutableSortedSet.size() + size;
                ImmutableSortedSet<ke.i> immutableSortedSet2 = a0Var.f26156e;
                if (immutableSortedSet2.size() + size2 <= 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (a0Var.f26154c.size() > 0) {
                    aVar.f17466b = true;
                } else if (immutableSortedSet.size() > 0) {
                    ca.a.u0(aVar.f17466b, "Received change for limbo target document without add.", new Object[0]);
                } else if (immutableSortedSet2.size() > 0) {
                    ca.a.u0(aVar.f17466b, "Received remove for limbo target document without add.", new Object[0]);
                    aVar.f17466b = false;
                }
            }
        }
        je.k kVar = this.f17452a;
        kVar.getClass();
        h((ImmutableSortedMap) kVar.f21846a.z("Apply remote event", new i7.a(7, kVar, fVar, (ke.r) fVar.f29104v)), fVar);
    }

    @Override // ne.x.a
    public final ImmutableSortedSet<ke.i> f(int i6) {
        a aVar = (a) this.f17458h.get(Integer.valueOf(i6));
        if (aVar != null && aVar.f17466b) {
            return ke.i.f23274w.insert(aVar.f17465a);
        }
        ImmutableSortedSet<ke.i> immutableSortedSet = ke.i.f23274w;
        HashMap hashMap = this.f17455d;
        if (hashMap.containsKey(Integer.valueOf(i6))) {
            for (y yVar : (List) hashMap.get(Integer.valueOf(i6))) {
                HashMap hashMap2 = this.f17454c;
                if (hashMap2.containsKey(yVar)) {
                    immutableSortedSet = immutableSortedSet.unionWith(((a0) hashMap2.get(yVar)).f17451c.f17506e);
                }
            }
        }
        return immutableSortedSet;
    }

    public final void g(String str) {
        boolean z10;
        if (this.f17464n != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Trying to call %s before setting callback", str);
    }

    public final void h(ImmutableSortedMap<ke.i, ke.g> immutableSortedMap, q.f fVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f17454c.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            je.k kVar = this.f17452a;
            if (hasNext) {
                a0 a0Var = (a0) ((Map.Entry) it.next()).getValue();
                g0 g0Var = a0Var.f17451c;
                ne.a0 a0Var2 = null;
                g0.a c10 = g0Var.c(immutableSortedMap, null);
                if (c10.f17510c) {
                    c10 = g0Var.c((ImmutableSortedMap) kVar.a(a0Var.f17449a, false).f26148b, c10);
                }
                int i6 = a0Var.f17450b;
                if (fVar != null) {
                    a0Var2 = (ne.a0) ((Map) fVar.f29105w).get(Integer.valueOf(i6));
                }
                nd.z a10 = a0Var.f17451c.a(c10, a0Var2);
                o(i6, (List) a10.f26149c);
                h0 h0Var = (h0) a10.f26148b;
                if (h0Var != null) {
                    arrayList.add(h0Var);
                    h0 h0Var2 = (h0) a10.f26148b;
                    ArrayList arrayList3 = new ArrayList();
                    p0.d dVar = ke.i.f23273v;
                    ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(arrayList3, dVar);
                    ImmutableSortedSet immutableSortedSet2 = new ImmutableSortedSet(new ArrayList(), dVar);
                    for (h hVar : h0Var2.f17522d) {
                        int ordinal = hVar.f17512a.ordinal();
                        ke.g gVar = hVar.f17513b;
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                immutableSortedSet = immutableSortedSet.insert(gVar.getKey());
                            }
                        } else {
                            immutableSortedSet2 = immutableSortedSet2.insert(gVar.getKey());
                        }
                    }
                    arrayList2.add(new je.l(i6, h0Var2.f17523e, immutableSortedSet, immutableSortedSet2));
                }
            } else {
                ((j) this.f17464n).a(arrayList);
                kVar.getClass();
                kVar.f21846a.A("notifyLocalViewChanges", new q7.f(kVar, 23, arrayList2));
                return;
            }
        }
    }

    public final void j(int i6, i0 i0Var) {
        Map map = (Map) this.f17460j.get(this.f17463m);
        if (map != null) {
            Integer valueOf = Integer.valueOf(i6);
            ya.i iVar = (ya.i) map.get(valueOf);
            if (iVar != null) {
                if (i0Var != null) {
                    iVar.a(oe.n.f(i0Var));
                } else {
                    iVar.b(null);
                }
                map.remove(valueOf);
            }
        }
    }

    public final void k() {
        while (true) {
            LinkedHashSet<ke.i> linkedHashSet = this.f;
            if (!linkedHashSet.isEmpty()) {
                HashMap hashMap = this.f17457g;
                if (hashMap.size() < this.f17456e) {
                    Iterator<ke.i> it = linkedHashSet.iterator();
                    ke.i next = it.next();
                    it.remove();
                    e0 e0Var = this.f17462l;
                    int i6 = e0Var.f17480b;
                    e0Var.f17480b = i6 + 2;
                    this.f17458h.put(Integer.valueOf(i6), new a(next));
                    hashMap.put(next, Integer.valueOf(i6));
                    this.f17453b.c(new b1(y.a(next.f23275u).k(), i6, -1L, je.a0.LIMBO_RESOLUTION));
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void l(int i6, i0 i0Var) {
        HashMap hashMap = this.f17455d;
        for (y yVar : (List) hashMap.get(Integer.valueOf(i6))) {
            this.f17454c.remove(yVar);
            if (!i0Var.e()) {
                HashMap hashMap2 = ((j) this.f17464n).f17529b;
                j.b bVar = (j.b) hashMap2.get(yVar);
                if (bVar != null) {
                    Iterator it = bVar.f17535a.iterator();
                    while (it.hasNext()) {
                        ((z) it.next()).f17589c.a(null, oe.n.f(i0Var));
                    }
                }
                hashMap2.remove(yVar);
                i(i0Var, "Listen for %s failed", yVar);
            }
        }
        hashMap.remove(Integer.valueOf(i6));
        nd.z zVar = this.f17459i;
        ImmutableSortedSet j10 = zVar.j(i6);
        zVar.l(i6);
        Iterator it2 = j10.iterator();
        while (it2.hasNext()) {
            ke.i iVar = (ke.i) it2.next();
            if (!zVar.d(iVar)) {
                m(iVar);
            }
        }
    }

    public final void m(ke.i iVar) {
        this.f.remove(iVar);
        HashMap hashMap = this.f17457g;
        Integer num = (Integer) hashMap.get(iVar);
        if (num != null) {
            this.f17453b.j(num.intValue());
            hashMap.remove(iVar);
            this.f17458h.remove(num);
            k();
        }
    }

    public final void n(int i6) {
        HashMap hashMap = this.f17461k;
        if (hashMap.containsKey(Integer.valueOf(i6))) {
            for (ya.i iVar : (List) hashMap.get(Integer.valueOf(i6))) {
                iVar.b(null);
            }
            hashMap.remove(Integer.valueOf(i6));
        }
    }

    public final void o(int i6, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            int ordinal = sVar.f17560a.ordinal();
            nd.z zVar = this.f17459i;
            ke.i iVar = sVar.f17561b;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    kc.f.A(1, "c0", "Document no longer in limbo: %s", iVar);
                    zVar.getClass();
                    je.c cVar = new je.c(i6, iVar);
                    zVar.f26148b = ((ImmutableSortedSet) zVar.f26148b).remove(cVar);
                    zVar.f26149c = ((ImmutableSortedSet) zVar.f26149c).remove(cVar);
                    if (!zVar.d(iVar)) {
                        m(iVar);
                    }
                } else {
                    ca.a.V("Unknown limbo change type: %s", sVar.f17560a);
                    throw null;
                }
            } else {
                zVar.getClass();
                je.c cVar2 = new je.c(i6, iVar);
                zVar.f26148b = ((ImmutableSortedSet) zVar.f26148b).insert(cVar2);
                zVar.f26149c = ((ImmutableSortedSet) zVar.f26149c).insert(cVar2);
                if (!this.f17457g.containsKey(iVar)) {
                    LinkedHashSet<ke.i> linkedHashSet = this.f;
                    if (!linkedHashSet.contains(iVar)) {
                        kc.f.A(1, "c0", "New document in limbo: %s", iVar);
                        linkedHashSet.add(iVar);
                        k();
                    }
                }
            }
        }
    }
}
