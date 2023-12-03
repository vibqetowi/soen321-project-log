package pu;

import java.util.Collection;
import java.util.Set;
/* compiled from: AbstractScopeAdapter.kt */
/* loaded from: classes2.dex */
public abstract class a implements i {
    @Override // pu.i
    public Collection a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return i().a(name, cVar);
    }

    @Override // pu.i
    public final Set<fu.e> b() {
        return i().b();
    }

    @Override // pu.i
    public Collection c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return i().c(name, cVar);
    }

    @Override // pu.i
    public final Set<fu.e> d() {
        return i().d();
    }

    @Override // pu.i
    public final Set<fu.e> e() {
        return i().e();
    }

    @Override // pu.k
    public Collection<gt.j> f(d kindFilter, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        return i().f(kindFilter, nameFilter);
    }

    @Override // pu.k
    public final gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return i().g(name, cVar);
    }

    public final i h() {
        if (i() instanceof a) {
            i i6 = i();
            kotlin.jvm.internal.i.e(i6, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
            return ((a) i6).h();
        }
        return i();
    }

    public abstract i i();
}
