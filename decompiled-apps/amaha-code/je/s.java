package je;

import com.google.firebase.database.collection.ImmutableSortedSet;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: MemoryMutationQueue.java */
/* loaded from: classes.dex */
public final class s implements w {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f21915a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public ImmutableSortedSet<c> f21916b = new ImmutableSortedSet<>(Collections.emptyList(), c.f21802c);

    /* renamed from: c  reason: collision with root package name */
    public int f21917c = 1;

    /* renamed from: d  reason: collision with root package name */
    public com.google.protobuf.h f21918d = ne.f0.f26217v;

    /* renamed from: e  reason: collision with root package name */
    public final t f21919e;
    public final r f;

    public s(t tVar) {
        this.f21919e = tVar;
        this.f = tVar.f21942d;
    }

    @Override // je.w
    public final void a() {
        if (this.f21915a.isEmpty()) {
            ca.a.u0(this.f21916b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // je.w
    public final void b(le.g gVar, com.google.protobuf.h hVar) {
        boolean z10;
        boolean z11;
        int i6 = gVar.f24218a;
        int l2 = l(i6, "acknowledged");
        if (l2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        le.g gVar2 = (le.g) this.f21915a.get(l2);
        if (i6 == gVar2.f24218a) {
            z11 = true;
        } else {
            z11 = false;
        }
        ca.a.u0(z11, "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(i6), Integer.valueOf(gVar2.f24218a));
        hVar.getClass();
        this.f21918d = hVar;
    }

    @Override // je.w
    public final void c(le.g gVar) {
        boolean z10;
        if (l(gVar.f24218a, "removed") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f21915a.remove(0);
        ImmutableSortedSet<c> immutableSortedSet = this.f21916b;
        for (le.f fVar : gVar.f24221d) {
            ke.i iVar = fVar.f24215a;
            this.f21919e.f21945h.f(iVar);
            immutableSortedSet = immutableSortedSet.remove(new c(gVar.f24218a, iVar));
        }
        this.f21916b = immutableSortedSet;
    }

    @Override // je.w
    public final void d(com.google.protobuf.h hVar) {
        hVar.getClass();
        this.f21918d = hVar;
    }

    @Override // je.w
    public final ArrayList e(Set set) {
        List emptyList = Collections.emptyList();
        SecureRandom secureRandom = oe.n.f27432a;
        ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(emptyList, new p0.d(28));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ke.i iVar = (ke.i) it.next();
            Iterator<c> iteratorFrom = this.f21916b.iteratorFrom(new c(0, iVar));
            while (iteratorFrom.hasNext()) {
                c next = iteratorFrom.next();
                if (!iVar.equals(next.f21804a)) {
                    break;
                }
                immutableSortedSet = immutableSortedSet.insert(Integer.valueOf(next.f21805b));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = immutableSortedSet.iterator();
        while (it2.hasNext()) {
            le.g g5 = g(((Integer) it2.next()).intValue());
            if (g5 != null) {
                arrayList.add(g5);
            }
        }
        return arrayList;
    }

    @Override // je.w
    public final le.g f(int i6) {
        int k10 = k(i6 + 1);
        if (k10 < 0) {
            k10 = 0;
        }
        ArrayList arrayList = this.f21915a;
        if (arrayList.size() > k10) {
            return (le.g) arrayList.get(k10);
        }
        return null;
    }

    @Override // je.w
    public final le.g g(int i6) {
        boolean z10;
        int k10 = k(i6);
        if (k10 >= 0) {
            ArrayList arrayList = this.f21915a;
            if (k10 < arrayList.size()) {
                le.g gVar = (le.g) arrayList.get(k10);
                if (gVar.f24218a == i6) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "If found batch must match", new Object[0]);
                return gVar;
            }
            return null;
        }
        return null;
    }

    @Override // je.w
    public final com.google.protobuf.h h() {
        return this.f21918d;
    }

    @Override // je.w
    public final le.g i(sc.h hVar, ArrayList arrayList, List list) {
        boolean z10 = true;
        ca.a.u0(!list.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i6 = this.f21917c;
        this.f21917c = i6 + 1;
        ArrayList arrayList2 = this.f21915a;
        int size = arrayList2.size();
        if (size > 0) {
            if (((le.g) arrayList2.get(size - 1)).f24218a >= i6) {
                z10 = false;
            }
            ca.a.u0(z10, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        le.g gVar = new le.g(i6, hVar, arrayList, list);
        arrayList2.add(gVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            le.f fVar = (le.f) it.next();
            this.f21916b = this.f21916b.insert(new c(i6, fVar.f24215a));
            this.f.b(fVar.f24215a.i());
        }
        return gVar;
    }

    @Override // je.w
    public final List<le.g> j() {
        return Collections.unmodifiableList(this.f21915a);
    }

    public final int k(int i6) {
        ArrayList arrayList = this.f21915a;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return i6 - ((le.g) arrayList.get(0)).f24218a;
    }

    public final int l(int i6, String str) {
        boolean z10;
        int k10 = k(i6);
        if (k10 >= 0 && k10 < this.f21915a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Batches must exist to be %s", str);
        return k10;
    }

    @Override // je.w
    public final void start() {
        if (this.f21915a.isEmpty()) {
            this.f21917c = 1;
        }
    }
}
