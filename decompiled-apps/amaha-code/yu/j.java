package yu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import ss.l;
/* compiled from: ThrowingScope.kt */
/* loaded from: classes2.dex */
public final class j extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i6, String... formatParams) {
        super(i6, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        defpackage.d.j(i6, "kind");
        kotlin.jvm.internal.i.g(formatParams, "formatParams");
    }

    @Override // yu.e, pu.i
    public final /* bridge */ /* synthetic */ Collection a(fu.e eVar, ot.c cVar) {
        h(eVar, cVar);
        throw null;
    }

    @Override // yu.e, pu.i
    public final Set<fu.e> b() {
        throw new IllegalStateException();
    }

    @Override // yu.e, pu.i
    public final /* bridge */ /* synthetic */ Collection c(fu.e eVar, ot.c cVar) {
        i(eVar, cVar);
        throw null;
    }

    @Override // yu.e, pu.i
    public final Set<fu.e> d() {
        throw new IllegalStateException();
    }

    @Override // yu.e, pu.i
    public final Set<fu.e> e() {
        throw new IllegalStateException();
    }

    @Override // yu.e, pu.k
    public final Collection<gt.j> f(pu.d kindFilter, l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        throw new IllegalStateException(this.f39075b);
    }

    @Override // yu.e, pu.k
    public final gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        throw new IllegalStateException(this.f39075b + ", required name: " + name);
    }

    @Override // yu.e
    public final Set h(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        throw new IllegalStateException(this.f39075b + ", required name: " + name);
    }

    @Override // yu.e
    public final Set i(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        throw new IllegalStateException(this.f39075b + ", required name: " + name);
    }

    @Override // yu.e
    public final String toString() {
        return v.g.c(new StringBuilder("ThrowingScope{"), this.f39075b, '}');
    }
}
