package tt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: JvmPackageScope.kt */
/* loaded from: classes2.dex */
public final class c implements pu.i {
    public static final /* synthetic */ ys.m<Object>[] f = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(c.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b  reason: collision with root package name */
    public final q.f f33601b;

    /* renamed from: c  reason: collision with root package name */
    public final m f33602c;

    /* renamed from: d  reason: collision with root package name */
    public final n f33603d;

    /* renamed from: e  reason: collision with root package name */
    public final vu.i f33604e;

    /* compiled from: JvmPackageScope.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<pu.i[]> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final pu.i[] invoke() {
            c cVar = c.this;
            m mVar = cVar.f33602c;
            mVar.getClass();
            Collection<yt.o> values = ((Map) kotlin.jvm.internal.h.C(mVar.C, m.G[0])).values();
            ArrayList arrayList = new ArrayList();
            for (yt.o oVar : values) {
                uu.j a10 = ((st.c) cVar.f33601b.f29104v).f31937d.a(cVar.f33602c, oVar);
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
            Object[] array = kotlin.jvm.internal.h.Q(arrayList).toArray(new pu.i[0]);
            kotlin.jvm.internal.i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (pu.i[]) array;
        }
    }

    public c(q.f fVar, wt.t jPackage, m packageFragment) {
        kotlin.jvm.internal.i.g(jPackage, "jPackage");
        kotlin.jvm.internal.i.g(packageFragment, "packageFragment");
        this.f33601b = fVar;
        this.f33602c = packageFragment;
        this.f33603d = new n(fVar, jPackage, packageFragment);
        this.f33604e = fVar.b().e(new a());
    }

    @Override // pu.i
    public final Collection a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        i(name, cVar);
        pu.i[] h10 = h();
        Collection a10 = this.f33603d.a(name, cVar);
        for (pu.i iVar : h10) {
            a10 = kotlin.jvm.internal.h.p(a10, iVar.a(name, cVar));
        }
        if (a10 == null) {
            return is.y.f20678u;
        }
        return a10;
    }

    @Override // pu.i
    public final Set<fu.e> b() {
        pu.i[] h10 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (pu.i iVar : h10) {
            is.q.R1(iVar.b(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f33603d.b());
        return linkedHashSet;
    }

    @Override // pu.i
    public final Collection c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        i(name, cVar);
        pu.i[] h10 = h();
        this.f33603d.getClass();
        Collection collection = is.w.f20676u;
        for (pu.i iVar : h10) {
            collection = kotlin.jvm.internal.h.p(collection, iVar.c(name, cVar));
        }
        if (collection == null) {
            return is.y.f20678u;
        }
        return collection;
    }

    @Override // pu.i
    public final Set<fu.e> d() {
        pu.i[] h10 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (pu.i iVar : h10) {
            is.q.R1(iVar.d(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f33603d.d());
        return linkedHashSet;
    }

    @Override // pu.i
    public final Set<fu.e> e() {
        boolean z10;
        Iterable jVar;
        pu.i[] h10 = h();
        kotlin.jvm.internal.i.g(h10, "<this>");
        if (h10.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jVar = is.w.f20676u;
        } else {
            jVar = new is.j(h10);
        }
        HashSet Y = ca.a.Y(jVar);
        if (Y != null) {
            Y.addAll(this.f33603d.e());
            return Y;
        }
        return null;
    }

    @Override // pu.k
    public final Collection<gt.j> f(pu.d kindFilter, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        pu.i[] h10 = h();
        Collection<gt.j> f2 = this.f33603d.f(kindFilter, nameFilter);
        for (pu.i iVar : h10) {
            f2 = kotlin.jvm.internal.h.p(f2, iVar.f(kindFilter, nameFilter));
        }
        if (f2 == null) {
            return is.y.f20678u;
        }
        return f2;
    }

    @Override // pu.k
    public final gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        i(name, cVar);
        n nVar = this.f33603d;
        nVar.getClass();
        gt.g gVar = null;
        gt.e v10 = nVar.v(name, null);
        if (v10 != null) {
            return v10;
        }
        for (pu.i iVar : h()) {
            gt.g g5 = iVar.g(name, cVar);
            if (g5 != null) {
                if ((g5 instanceof gt.h) && ((gt.h) g5).M()) {
                    if (gVar == null) {
                        gVar = g5;
                    }
                } else {
                    return g5;
                }
            }
        }
        return gVar;
    }

    public final pu.i[] h() {
        return (pu.i[]) kotlin.jvm.internal.h.C(this.f33604e, f[0]);
    }

    public final void i(fu.e name, ot.a aVar) {
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.h.Y(((st.c) this.f33601b.f29104v).f31946n, (ot.c) aVar, this.f33602c, name);
    }

    public final String toString() {
        return "scope for " + this.f33602c;
    }
}
