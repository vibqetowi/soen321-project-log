package tt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import pt.q;
import pu.d;
import pu.i;
import tt.b;
import yt.n;
import zt.a;
/* compiled from: LazyJavaPackageScope.kt */
/* loaded from: classes2.dex */
public final class n extends y {

    /* renamed from: n  reason: collision with root package name */
    public final wt.t f33644n;

    /* renamed from: o  reason: collision with root package name */
    public final m f33645o;

    /* renamed from: p  reason: collision with root package name */
    public final vu.j<Set<String>> f33646p;

    /* renamed from: q  reason: collision with root package name */
    public final vu.h<a, gt.e> f33647q;

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final fu.e f33648a;

        /* renamed from: b  reason: collision with root package name */
        public final wt.g f33649b;

        public a(fu.e name, wt.g gVar) {
            kotlin.jvm.internal.i.g(name, "name");
            this.f33648a = name;
            this.f33649b = gVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (kotlin.jvm.internal.i.b(this.f33648a, ((a) obj).f33648a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f33648a.hashCode();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: LazyJavaPackageScope.kt */
        /* loaded from: classes2.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public final gt.e f33650a;

            public a(gt.e eVar) {
                this.f33650a = eVar;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: tt.n$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0562b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0562b f33651a = new C0562b();
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* loaded from: classes2.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f33652a = new c();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<a, gt.e> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ n f33653u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ q.f f33654v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q.f fVar, n nVar) {
            super(1);
            this.f33653u = nVar;
            this.f33654v = fVar;
        }

        @Override // ss.l
        public final gt.e invoke(a aVar) {
            n.a.b a10;
            yt.o oVar;
            fu.b bVar;
            b bVar2;
            gt.e a11;
            fu.c cVar;
            a request = aVar;
            kotlin.jvm.internal.i.g(request, "request");
            n nVar = this.f33653u;
            fu.b bVar3 = new fu.b(nVar.f33645o.f23848y, request.f33648a);
            q.f fVar = this.f33654v;
            wt.g gVar = request.f33649b;
            if (gVar != null) {
                a10 = ((st.c) fVar.f29104v).f31936c.c(gVar);
            } else {
                a10 = ((st.c) fVar.f29104v).f31936c.a(bVar3);
            }
            if (a10 != null) {
                oVar = a10.f39053a;
            } else {
                oVar = null;
            }
            if (oVar != null) {
                bVar = oVar.g();
            } else {
                bVar = null;
            }
            if (bVar != null && (bVar.k() || bVar.f15920c)) {
                return null;
            }
            if (oVar == null) {
                bVar2 = b.C0562b.f33651a;
            } else if (oVar.a().f39838a == a.EnumC0686a.CLASS) {
                yt.j jVar = ((st.c) nVar.f33658b.f29104v).f31937d;
                jVar.getClass();
                su.h f = jVar.f(oVar);
                if (f == null) {
                    a11 = null;
                } else {
                    a11 = jVar.c().f32061t.a(oVar.g(), f);
                }
                if (a11 != null) {
                    bVar2 = new b.a(a11);
                } else {
                    bVar2 = b.C0562b.f33651a;
                }
            } else {
                bVar2 = b.c.f33652a;
            }
            if (bVar2 instanceof b.a) {
                return ((b.a) bVar2).f33650a;
            }
            if (bVar2 instanceof b.c) {
                return null;
            }
            if (bVar2 instanceof b.C0562b) {
                if (gVar == null) {
                    pt.q qVar = ((st.c) fVar.f29104v).f31935b;
                    if (a10 != null) {
                        if (!(a10 instanceof n.a.C0663a)) {
                            a10 = null;
                        }
                        n.a.C0663a c0663a = (n.a.C0663a) a10;
                    }
                    gVar = qVar.b(new q.a(bVar3, null, 4));
                }
                if (gVar != null) {
                    gVar.J();
                }
                if (gVar != null) {
                    cVar = gVar.e();
                } else {
                    cVar = null;
                }
                if (cVar == null || cVar.d()) {
                    return null;
                }
                fu.c e10 = cVar.e();
                m mVar = nVar.f33645o;
                if (!kotlin.jvm.internal.i.b(e10, mVar.f23848y)) {
                    return null;
                }
                e eVar = new e(fVar, mVar, gVar, null);
                ((st.c) fVar.f29104v).f31950s.a(eVar);
                return eVar;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<Set<? extends String>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ q.f f33655u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ n f33656v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q.f fVar, n nVar) {
            super(0);
            this.f33655u = fVar;
            this.f33656v = nVar;
        }

        @Override // ss.a
        public final Set<? extends String> invoke() {
            ((st.c) this.f33655u.f29104v).f31935b.a(this.f33656v.f33645o.f23848y);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q.f fVar, wt.t jPackage, m ownerDescriptor) {
        super(fVar);
        kotlin.jvm.internal.i.g(jPackage, "jPackage");
        kotlin.jvm.internal.i.g(ownerDescriptor, "ownerDescriptor");
        this.f33644n = jPackage;
        this.f33645o = ownerDescriptor;
        this.f33646p = fVar.b().f(new d(fVar, this));
        this.f33647q = fVar.b().b(new c(fVar, this));
    }

    @Override // tt.o, pu.j, pu.i
    public final Collection c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return is.w.f20676u;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002b A[SYNTHETIC] */
    @Override // tt.o, pu.j, pu.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection<gt.j> f(pu.d kindFilter, ss.l<? super fu.e, Boolean> nameFilter) {
        boolean z10;
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        d.a aVar = pu.d.f28976c;
        if (!kindFilter.a(pu.d.f28984l | pu.d.f28978e)) {
            return is.w.f20676u;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f33660d.invoke()) {
            gt.j jVar = (gt.j) obj;
            if (jVar instanceof gt.e) {
                fu.e name = ((gt.e) jVar).getName();
                kotlin.jvm.internal.i.f(name, "it.name");
                if (nameFilter.invoke(name).booleanValue()) {
                    z10 = true;
                    if (!z10) {
                        arrayList.add(obj);
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
        return arrayList;
    }

    @Override // pu.j, pu.k
    public final gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return v(name, null);
    }

    @Override // tt.o
    public final Set h(pu.d kindFilter, i.a.C0490a c0490a) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        if (!kindFilter.a(pu.d.f28978e)) {
            return is.y.f20678u;
        }
        Set<String> invoke = this.f33646p.invoke();
        ss.l lVar = c0490a;
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            for (String str : invoke) {
                hashSet.add(fu.e.j(str));
            }
            return hashSet;
        }
        if (c0490a == null) {
            lVar = dv.c.f13506a;
        }
        this.f33644n.P(lVar);
        return new LinkedHashSet();
    }

    @Override // tt.o
    public final Set i(pu.d kindFilter, i.a.C0490a c0490a) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        return is.y.f20678u;
    }

    @Override // tt.o
    public final tt.b k() {
        return b.a.f33600a;
    }

    @Override // tt.o
    public final void m(LinkedHashSet linkedHashSet, fu.e name) {
        kotlin.jvm.internal.i.g(name, "name");
    }

    @Override // tt.o
    public final Set o(pu.d kindFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        return is.y.f20678u;
    }

    @Override // tt.o
    public final gt.j q() {
        return this.f33645o;
    }

    public final gt.e v(fu.e name, wt.g gVar) {
        boolean z10;
        fu.e eVar = fu.g.f15933a;
        kotlin.jvm.internal.i.g(name, "name");
        String f = name.f();
        kotlin.jvm.internal.i.f(f, "name.asString()");
        boolean z11 = false;
        if (f.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !name.f15931v) {
            z11 = true;
        }
        if (!z11) {
            return null;
        }
        Set<String> invoke = this.f33646p.invoke();
        if (gVar == null && invoke != null && !invoke.contains(name.f())) {
            return null;
        }
        return this.f33647q.invoke(new a(name, gVar));
    }
}
