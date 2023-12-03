package ke;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.Iterator;
/* compiled from: DocumentSet.java */
/* loaded from: classes.dex */
public final class k implements Iterable<g> {

    /* renamed from: u  reason: collision with root package name */
    public final ImmutableSortedMap<i, g> f23278u;

    /* renamed from: v  reason: collision with root package name */
    public final ImmutableSortedSet<g> f23279v;

    public k(ImmutableSortedMap<i, g> immutableSortedMap, ImmutableSortedSet<g> immutableSortedSet) {
        this.f23278u = immutableSortedMap;
        this.f23279v = immutableSortedSet;
    }

    public final k e(i iVar) {
        ImmutableSortedMap<i, g> immutableSortedMap = this.f23278u;
        g gVar = immutableSortedMap.get(iVar);
        if (gVar == null) {
            return this;
        }
        return new k(immutableSortedMap.remove(iVar), this.f23279v.remove(gVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (size() != kVar.size()) {
            return false;
        }
        Iterator<g> it = iterator();
        Iterator<g> it2 = kVar.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator<g> it = iterator();
        int i6 = 0;
        while (it.hasNext()) {
            g next = it.next();
            int hashCode = next.getKey().hashCode();
            i6 = next.getData().hashCode() + ((hashCode + (i6 * 31)) * 31);
        }
        return i6;
    }

    @Override // java.lang.Iterable
    public final Iterator<g> iterator() {
        return this.f23279v.iterator();
    }

    public final int size() {
        return this.f23278u.size();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<g> it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            g next = it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(next);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
