package le;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import rf.s;
/* compiled from: Mutation.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public final ke.i f24215a;

    /* renamed from: b  reason: collision with root package name */
    public final l f24216b;

    /* renamed from: c  reason: collision with root package name */
    public final List<e> f24217c;

    public f(ke.i iVar, l lVar) {
        this(iVar, lVar, new ArrayList());
    }

    public static f c(ke.n nVar, d dVar) {
        if (nVar.d()) {
            if (dVar == null || !dVar.f24212a.isEmpty()) {
                ke.i iVar = nVar.f23285b;
                if (dVar == null) {
                    if (nVar.h()) {
                        return new c(iVar, l.f24227c);
                    }
                    return new n(iVar, nVar.f, l.f24227c, new ArrayList());
                }
                ke.o oVar = nVar.f;
                ke.o oVar2 = new ke.o();
                HashSet hashSet = new HashSet();
                for (ke.m mVar : dVar.f24212a) {
                    if (!hashSet.contains(mVar)) {
                        if (ke.o.d(mVar, oVar.b()) == null && mVar.p() > 1) {
                            mVar = mVar.t();
                        }
                        oVar2.f(mVar, ke.o.d(mVar, oVar.b()));
                        hashSet.add(mVar);
                    }
                }
                return new k(iVar, oVar2, new d(hashSet), l.f24227c);
            }
            return null;
        }
        return null;
    }

    public abstract d a(ke.n nVar, d dVar, sc.h hVar);

    public abstract void b(ke.n nVar, h hVar);

    public abstract d d();

    public final boolean e(f fVar) {
        if (this.f24215a.equals(fVar.f24215a) && this.f24216b.equals(fVar.f24216b)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f24216b.hashCode() + (this.f24215a.hashCode() * 31);
    }

    public final String g() {
        return "key=" + this.f24215a + ", precondition=" + this.f24216b;
    }

    public final HashMap h(sc.h hVar, ke.n nVar) {
        List<e> list = this.f24217c;
        HashMap hashMap = new HashMap(list.size());
        for (e eVar : list) {
            o oVar = eVar.f24214b;
            ke.m mVar = eVar.f24213a;
            hashMap.put(mVar, oVar.a(hVar, nVar.e(mVar)));
        }
        return hashMap;
    }

    public final HashMap i(ke.n nVar, List list) {
        boolean z10;
        List<e> list2 = this.f24217c;
        HashMap hashMap = new HashMap(list2.size());
        if (list2.size() == list.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
        for (int i6 = 0; i6 < list.size(); i6++) {
            e eVar = list2.get(i6);
            o oVar = eVar.f24214b;
            ke.m mVar = eVar.f24213a;
            hashMap.put(mVar, oVar.b(nVar.e(mVar), (s) list.get(i6)));
        }
        return hashMap;
    }

    public final void j(ke.n nVar) {
        ca.a.u0(nVar.f23285b.equals(this.f24215a), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    public f(ke.i iVar, l lVar, List<e> list) {
        this.f24215a = iVar;
        this.f24216b = lVar;
        this.f24217c = list;
    }
}
