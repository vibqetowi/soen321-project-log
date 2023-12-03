package gt;

import gt.b;
import java.util.Collection;
import java.util.List;
import wu.g1;
import wu.j1;
/* compiled from: FunctionDescriptor.java */
/* loaded from: classes2.dex */
public interface u extends b {

    /* compiled from: FunctionDescriptor.java */
    /* loaded from: classes2.dex */
    public interface a<D extends u> {
        a<D> a(j jVar);

        a<D> b(List<z0> list);

        D build();

        a c(Boolean bool);

        a<D> d(z zVar);

        a<D> e();

        a<D> f();

        a g(d dVar);

        a<D> h(n0 n0Var);

        a i();

        a j();

        a<D> k(q qVar);

        a<D> l();

        a<D> m(fu.e eVar);

        a<D> n(wu.b0 b0Var);

        a<D> o(g1 g1Var);

        a<D> p(ht.h hVar);

        a<D> q(b.a aVar);

        a<D> r();
    }

    boolean F0();

    boolean Q();

    @Override // gt.b, gt.a, gt.j
    u b();

    @Override // gt.k, gt.j
    j c();

    u d(j1 j1Var);

    u e0();

    @Override // gt.b, gt.a
    Collection<? extends u> f();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    a<? extends u> s();

    boolean x0();
}
