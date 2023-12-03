package je;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ke.l;
/* compiled from: QueryEngine.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public h f21978a;

    /* renamed from: b  reason: collision with root package name */
    public f f21979b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21980c;

    public static ImmutableSortedSet b(he.y yVar, ImmutableSortedMap immutableSortedMap) {
        ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(Collections.emptyList(), yVar.b());
        Iterator it = immutableSortedMap.iterator();
        while (it.hasNext()) {
            ke.g gVar = (ke.g) ((Map.Entry) it.next()).getValue();
            if (yVar.i(gVar)) {
                immutableSortedSet = immutableSortedSet.insert(gVar);
            }
        }
        return immutableSortedSet;
    }

    public static boolean c(he.y yVar, int i6, ImmutableSortedSet immutableSortedSet, ke.r rVar) {
        boolean z10;
        ke.g gVar;
        if (yVar.f17582g != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (i6 != immutableSortedSet.size()) {
            return true;
        }
        if (yVar.f17583h == 1) {
            gVar = (ke.g) immutableSortedSet.getMaxEntry();
        } else {
            gVar = (ke.g) immutableSortedSet.getMinEntry();
        }
        if (gVar == null) {
            return false;
        }
        if (!gVar.f() && gVar.i().f23294u.compareTo(rVar.f23294u) <= 0) {
            return false;
        }
        return true;
    }

    public final ImmutableSortedMap a(ImmutableSortedSet immutableSortedSet, he.y yVar, l.a aVar) {
        ImmutableSortedMap<ke.i, ke.g> d10 = this.f21978a.d(yVar, aVar);
        Iterator<T> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            ke.g gVar = (ke.g) it.next();
            d10 = d10.insert(gVar.getKey(), gVar);
        }
        return d10;
    }

    public final ImmutableSortedMap<ke.i, ke.g> d(he.y yVar) {
        boolean z10;
        if (yVar.j()) {
            return null;
        }
        he.d0 k10 = yVar.k();
        int f = this.f21979b.f(k10);
        boolean z11 = true;
        if (v.h.b(f, 1)) {
            return null;
        }
        if (yVar.f17582g != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && v.h.b(f, 2)) {
            return d(yVar.h(-1L));
        }
        List<ke.i> c10 = this.f21979b.c(k10);
        if (c10 == null) {
            z11 = false;
        }
        ca.a.u0(z11, "index manager must return results for partial and full indexes.", new Object[0]);
        ImmutableSortedMap<ke.i, ke.g> b10 = this.f21978a.b(c10);
        ke.b h10 = this.f21979b.h(k10);
        ImmutableSortedSet b11 = b(yVar, b10);
        if (c(yVar, c10.size(), b11, h10.f23261w)) {
            return d(yVar.h(-1L));
        }
        return a(b11, yVar, h10);
    }
}
