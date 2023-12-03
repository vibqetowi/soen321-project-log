package pu;

import gt.p0;
import is.w;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: MemberScopeImpl.kt */
/* loaded from: classes2.dex */
public abstract class j implements i {
    @Override // pu.i
    public Collection a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return w.f20676u;
    }

    @Override // pu.i
    public Set<fu.e> b() {
        Collection<gt.j> f = f(d.f28988p, dv.c.f13506a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : f) {
            if (obj instanceof p0) {
                fu.e name = ((p0) obj).getName();
                kotlin.jvm.internal.i.f(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // pu.i
    public Collection c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return w.f20676u;
    }

    @Override // pu.i
    public Set<fu.e> d() {
        Collection<gt.j> f = f(d.f28989q, dv.c.f13506a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : f) {
            if (obj instanceof p0) {
                fu.e name = ((p0) obj).getName();
                kotlin.jvm.internal.i.f(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // pu.i
    public Set<fu.e> e() {
        return null;
    }

    @Override // pu.k
    public Collection<gt.j> f(d kindFilter, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        return w.f20676u;
    }

    @Override // pu.k
    public gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return null;
    }
}
