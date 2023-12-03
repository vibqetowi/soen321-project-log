package le;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import ke.r;
/* compiled from: PatchMutation.java */
/* loaded from: classes.dex */
public final class k extends f {

    /* renamed from: d  reason: collision with root package name */
    public final ke.o f24225d;

    /* renamed from: e  reason: collision with root package name */
    public final d f24226e;

    public k(ke.i iVar, ke.o oVar, d dVar, l lVar) {
        this(iVar, oVar, dVar, lVar, new ArrayList());
    }

    @Override // le.f
    public final d a(ke.n nVar, d dVar, sc.h hVar) {
        j(nVar);
        if (!this.f24216b.a(nVar)) {
            return dVar;
        }
        HashMap h10 = h(hVar, nVar);
        HashMap k10 = k();
        ke.o oVar = nVar.f;
        oVar.h(k10);
        oVar.h(h10);
        nVar.j(nVar.f23287d, nVar.f);
        nVar.f23289g = 1;
        nVar.f23287d = r.f23293v;
        if (dVar == null) {
            return null;
        }
        HashSet hashSet = new HashSet(dVar.f24212a);
        hashSet.addAll(this.f24226e.f24212a);
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f24217c) {
            arrayList.add(eVar.f24213a);
        }
        hashSet.addAll(arrayList);
        return new d(hashSet);
    }

    @Override // le.f
    public final void b(ke.n nVar, h hVar) {
        j(nVar);
        if (!this.f24216b.a(nVar)) {
            nVar.f23287d = hVar.f24222a;
            nVar.f23286c = 4;
            nVar.f = new ke.o();
            nVar.f23289g = 2;
            return;
        }
        HashMap i6 = i(nVar, hVar.f24223b);
        ke.o oVar = nVar.f;
        oVar.h(k());
        oVar.h(i6);
        nVar.j(hVar.f24222a, nVar.f);
        nVar.f23289g = 2;
    }

    @Override // le.f
    public final d d() {
        return this.f24226e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (e(kVar) && this.f24225d.equals(kVar.f24225d) && this.f24217c.equals(kVar.f24217c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24225d.hashCode() + (f() * 31);
    }

    public final HashMap k() {
        HashMap hashMap = new HashMap();
        for (ke.m mVar : this.f24226e.f24212a) {
            if (!mVar.isEmpty()) {
                hashMap.put(mVar, ke.o.d(mVar, this.f24225d.b()));
            }
        }
        return hashMap;
    }

    public final String toString() {
        return "PatchMutation{" + g() + ", mask=" + this.f24226e + ", value=" + this.f24225d + "}";
    }

    public k(ke.i iVar, ke.o oVar, d dVar, l lVar, List<e> list) {
        super(iVar, lVar, list);
        this.f24225d = oVar;
        this.f24226e = dVar;
    }
}
