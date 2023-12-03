package pu;

import gt.u0;
import is.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
/* compiled from: InnerClassesScopeWrapper.kt */
/* loaded from: classes2.dex */
public final class g extends j {

    /* renamed from: b  reason: collision with root package name */
    public final i f29001b;

    public g(i workerScope) {
        kotlin.jvm.internal.i.g(workerScope, "workerScope");
        this.f29001b = workerScope;
    }

    @Override // pu.j, pu.i
    public final Set<fu.e> b() {
        return this.f29001b.b();
    }

    @Override // pu.j, pu.i
    public final Set<fu.e> d() {
        return this.f29001b.d();
    }

    @Override // pu.j, pu.i
    public final Set<fu.e> e() {
        return this.f29001b.e();
    }

    @Override // pu.j, pu.k
    public final Collection f(d kindFilter, ss.l nameFilter) {
        d dVar;
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        int i6 = d.f28984l & kindFilter.f28992b;
        if (i6 == 0) {
            dVar = null;
        } else {
            dVar = new d(i6, kindFilter.f28991a);
        }
        if (dVar == null) {
            return w.f20676u;
        }
        Collection<gt.j> f = this.f29001b.f(dVar, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (obj instanceof gt.h) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // pu.j, pu.k
    public final gt.g g(fu.e name, ot.c cVar) {
        gt.e eVar;
        kotlin.jvm.internal.i.g(name, "name");
        gt.g g5 = this.f29001b.g(name, cVar);
        if (g5 == null) {
            return null;
        }
        if (g5 instanceof gt.e) {
            eVar = (gt.e) g5;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        if (!(g5 instanceof u0)) {
            return null;
        }
        return (u0) g5;
    }

    public final String toString() {
        return "Classes from " + this.f29001b;
    }
}
