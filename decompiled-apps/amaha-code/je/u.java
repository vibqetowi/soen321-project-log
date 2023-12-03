package je;

import com.google.firebase.database.collection.ImmutableSortedMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ke.l;
/* compiled from: MemoryRemoteDocumentCache.java */
/* loaded from: classes.dex */
public final class u implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public ImmutableSortedMap<ke.i, ke.g> f21953a = ke.h.f23272a;

    /* renamed from: b  reason: collision with root package name */
    public f f21954b;

    @Override // je.c0
    public final void a(ke.n nVar, ke.r rVar) {
        boolean z10;
        if (this.f21954b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "setIndexManager() not called", new Object[0]);
        ca.a.u0(!rVar.equals(ke.r.f23293v), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        ImmutableSortedMap<ke.i, ke.g> immutableSortedMap = this.f21953a;
        ke.n a10 = nVar.a();
        a10.f23288e = rVar;
        ke.i iVar = nVar.f23285b;
        this.f21953a = immutableSortedMap.insert(iVar, a10);
        this.f21954b.b(iVar.i());
    }

    @Override // je.c0
    public final ke.n b(ke.i iVar) {
        ke.g gVar = this.f21953a.get(iVar);
        if (gVar != null) {
            return gVar.a();
        }
        return ke.n.m(iVar);
    }

    @Override // je.c0
    public final void c(f fVar) {
        this.f21954b = fVar;
    }

    @Override // je.c0
    public final HashMap d(he.y yVar, l.a aVar, Set set) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<ke.i, ke.g>> iteratorFrom = this.f21953a.iteratorFrom(new ke.i(yVar.f17581e.d("")));
        while (iteratorFrom.hasNext()) {
            Map.Entry<ke.i, ke.g> next = iteratorFrom.next();
            ke.g value = next.getValue();
            ke.i key = next.getKey();
            ke.p pVar = key.f23275u;
            ke.p pVar2 = yVar.f17581e;
            if (!pVar2.n(pVar)) {
                break;
            } else if (key.f23275u.p() <= pVar2.p() + 1 && l.a.f(value).compareTo(aVar) > 0 && (set.contains(value.getKey()) || yVar.i(value))) {
                hashMap.put(value.getKey(), value.a());
            }
        }
        return hashMap;
    }

    @Override // je.c0
    public final HashMap e(Iterable iterable) {
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ke.i iVar = (ke.i) it.next();
            hashMap.put(iVar, b(iVar));
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je.c0
    public final void f(ArrayList arrayList) {
        boolean z10;
        if (this.f21954b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "setIndexManager() not called", new Object[0]);
        ImmutableSortedMap<ke.i, ?> immutableSortedMap = ke.h.f23272a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ke.i iVar = (ke.i) it.next();
            this.f21953a = this.f21953a.remove(iVar);
            immutableSortedMap = immutableSortedMap.insert(iVar, ke.n.n(iVar, ke.r.f23293v));
        }
        this.f21954b.a(immutableSortedMap);
    }

    @Override // je.c0
    public final Map<ke.i, ke.n> g(String str, l.a aVar, int i6) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }
}
