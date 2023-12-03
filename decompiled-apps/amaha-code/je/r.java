package je;

import com.google.firebase.database.collection.ImmutableSortedMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import ke.l;
/* compiled from: MemoryIndexManager.java */
/* loaded from: classes.dex */
public final class r implements f {

    /* renamed from: a  reason: collision with root package name */
    public final a f21912a = new a();

    /* compiled from: MemoryIndexManager.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<String, HashSet<ke.p>> f21913a = new HashMap<>();

        public final boolean a(ke.p pVar) {
            boolean z10 = true;
            if (pVar.p() % 2 != 1) {
                z10 = false;
            }
            ca.a.u0(z10, "Expected a collection path.", new Object[0]);
            String k10 = pVar.k();
            ke.p t3 = pVar.t();
            HashMap<String, HashSet<ke.p>> hashMap = this.f21913a;
            HashSet<ke.p> hashSet = hashMap.get(k10);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                hashMap.put(k10, hashSet);
            }
            return hashSet.add(t3);
        }
    }

    @Override // je.f
    public final void b(ke.p pVar) {
        this.f21912a.a(pVar);
    }

    @Override // je.f
    public final List<ke.i> c(he.d0 d0Var) {
        return null;
    }

    @Override // je.f
    public final String e() {
        return null;
    }

    @Override // je.f
    public final int f(he.d0 d0Var) {
        return 1;
    }

    @Override // je.f
    public final List<ke.p> g(String str) {
        HashSet<ke.p> hashSet = this.f21912a.f21913a.get(str);
        if (hashSet != null) {
            return new ArrayList(hashSet);
        }
        return Collections.emptyList();
    }

    @Override // je.f
    public final ke.b h(he.d0 d0Var) {
        return l.a.f23281u;
    }

    @Override // je.f
    public final ke.b i(String str) {
        return l.a.f23281u;
    }

    @Override // je.f
    public final void start() {
    }

    @Override // je.f
    public final void a(ImmutableSortedMap<ke.i, ke.g> immutableSortedMap) {
    }

    @Override // je.f
    public final void d(String str, ke.b bVar) {
    }
}
