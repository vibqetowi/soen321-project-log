package tt;

import dt.n;
import gt.k0;
import gt.l0;
import gt.p0;
import gt.u;
import gt.v0;
import gt.z0;
import ht.h;
import is.h0;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kt.m0;
import kt.n0;
import nt.g0;
import pt.c0;
import pt.d0;
import pt.i0;
import pt.j0;
import pt.q;
import pt.u;
import pu.i;
import qt.h;
import qt.k;
import tt.o;
import wu.b0;
import wu.k1;
import wu.m1;
/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes2.dex */
public final class k extends o {

    /* renamed from: n  reason: collision with root package name */
    public final gt.e f33626n;

    /* renamed from: o  reason: collision with root package name */
    public final wt.g f33627o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f33628p;

    /* renamed from: q  reason: collision with root package name */
    public final vu.i<List<gt.d>> f33629q;
    public final vu.i<Set<fu.e>> r;

    /* renamed from: s  reason: collision with root package name */
    public final vu.i<Map<fu.e, wt.n>> f33630s;

    /* renamed from: t  reason: collision with root package name */
    public final vu.h<fu.e, kt.m> f33631t;

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<List<? extends gt.d>> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ q.f f33633v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q.f fVar) {
            super(0);
            this.f33633v = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r14v1, types: [kt.x, rt.b, kt.l] */
        @Override // ss.a
        public final List<? extends gt.d> invoke() {
            q.f fVar;
            gt.e eVar;
            k kVar;
            q.f fVar2;
            int i6;
            q.f fVar3;
            String str;
            String str2;
            ?? emptyList;
            Object obj;
            int i10;
            String str3;
            hs.f fVar4;
            Object obj2;
            boolean z10;
            b0 b0Var;
            k kVar2 = k.this;
            List k10 = kVar2.f33627o.k();
            ArrayList arrayList = new ArrayList(k10.size());
            Iterator it = k10.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                fVar = kVar2.f33658b;
                eVar = kVar2.f33626n;
                if (!hasNext) {
                    break;
                }
                wt.k kVar3 = (wt.k) it.next();
                st.e U = sp.b.U(fVar, kVar3);
                Object obj3 = fVar.f29104v;
                rt.b Z0 = rt.b.Z0(eVar, U, false, ((st.c) obj3).f31942j.a(kVar3));
                q.f fVar5 = new q.f((st.c) obj3, new st.g(fVar, Z0, kVar3, eVar.t().size()), (hs.d) fVar.f29106x);
                o.b u10 = o.u(fVar5, Z0, kVar3.i());
                List<v0> t3 = eVar.t();
                kotlin.jvm.internal.i.f(t3, "classDescriptor.declaredTypeParameters");
                ArrayList<wt.x> typeParameters = kVar3.getTypeParameters();
                ArrayList arrayList2 = new ArrayList(is.i.H1(typeParameters, 10));
                for (wt.x xVar : typeParameters) {
                    v0 a10 = ((st.j) fVar5.f29105w).a(xVar);
                    kotlin.jvm.internal.i.d(a10);
                    arrayList2.add(a10);
                }
                ArrayList u22 = is.u.u2(arrayList2, t3);
                Z0.Y0(u10.f33673a, kotlin.jvm.internal.h.i0(kVar3.getVisibility()), u22);
                Z0.S0(false);
                Z0.T0(u10.f33674b);
                Z0.U0(eVar.r());
                ((h.a) ((st.c) fVar5.f29104v).f31939g).getClass();
                arrayList.add(Z0);
            }
            wt.g gVar = kVar2.f33627o;
            boolean u11 = gVar.u();
            h.a.C0293a c0293a = h.a.f19495a;
            q.f fVar6 = this.f33633v;
            if (u11) {
                rt.b Z02 = rt.b.Z0(eVar, c0293a, true, ((st.c) fVar.f29104v).f31942j.a(gVar));
                ArrayList<wt.v> n10 = gVar.n();
                ArrayList arrayList3 = new ArrayList(n10.size());
                ut.a u12 = ca.a.u1(2, false, false, null, 6);
                int i11 = 0;
                for (wt.v vVar : n10) {
                    int i12 = i11 + 1;
                    b0 e10 = ((ut.c) fVar.f29108z).e(vVar.a(), u12);
                    boolean b10 = vVar.b();
                    Object obj4 = fVar.f29104v;
                    if (b10) {
                        b0Var = ((st.c) obj4).f31947o.o().g(e10);
                    } else {
                        b0Var = null;
                    }
                    arrayList3.add(new kt.v0(Z02, null, i11, c0293a, vVar.getName(), e10, false, false, false, b0Var, ((st.c) obj4).f31942j.a(vVar)));
                    fVar6 = fVar6;
                    i11 = i12;
                    u12 = u12;
                    kVar2 = kVar2;
                }
                kVar = kVar2;
                fVar2 = fVar6;
                Z02.T0(false);
                gt.q PROTECTED_AND_PACKAGE = eVar.getVisibility();
                kotlin.jvm.internal.i.f(PROTECTED_AND_PACKAGE, "classDescriptor.visibility");
                if (kotlin.jvm.internal.i.b(PROTECTED_AND_PACKAGE, pt.t.f28955b)) {
                    PROTECTED_AND_PACKAGE = pt.t.f28956c;
                    kotlin.jvm.internal.i.f(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                }
                Z02.X0(arrayList3, PROTECTED_AND_PACKAGE);
                Z02.S0(false);
                Z02.U0(eVar.r());
                i6 = 2;
                String n11 = ta.v.n(Z02, 2);
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (kotlin.jvm.internal.i.b(ta.v.n((gt.d) it2.next(), 2), n11)) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    arrayList.add(Z02);
                    ((h.a) ((st.c) fVar2.f29104v).f31939g).getClass();
                }
            } else {
                kVar = kVar2;
                fVar2 = fVar6;
                i6 = 2;
            }
            ((st.c) fVar2.f29104v).f31955x.c(eVar, arrayList);
            xt.s sVar = ((st.c) fVar2.f29104v).r;
            boolean isEmpty = arrayList.isEmpty();
            Collection collection = arrayList;
            if (isEmpty) {
                boolean r = gVar.r();
                if (!gVar.I()) {
                    gVar.w();
                }
                if (!r) {
                    fVar3 = fVar2;
                    obj2 = null;
                } else {
                    ?? Z03 = rt.b.Z0(eVar, c0293a, true, ((st.c) fVar.f29104v).f31942j.a(gVar));
                    if (r) {
                        List x10 = gVar.x();
                        emptyList = new ArrayList(x10.size());
                        ut.a u13 = ca.a.u1(i6, true, false, null, 6);
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj5 : x10) {
                            if (kotlin.jvm.internal.i.b(((wt.q) obj5).getName(), d0.f28871b)) {
                                arrayList4.add(obj5);
                            } else {
                                arrayList5.add(obj5);
                            }
                        }
                        arrayList4.size();
                        wt.q qVar = (wt.q) is.u.i2(arrayList4);
                        Object obj6 = fVar.f29108z;
                        if (qVar != null) {
                            g0 m10 = qVar.m();
                            if (!(m10 instanceof wt.f)) {
                                str3 = "classDescriptor.visibility";
                                fVar4 = new hs.f(((ut.c) obj6).e(m10, u13), null);
                            } else {
                                ut.c cVar = (ut.c) obj6;
                                wt.f fVar7 = (wt.f) m10;
                                str3 = "classDescriptor.visibility";
                                fVar4 = new hs.f(cVar.c(fVar7, u13, true), cVar.e(fVar7.L(), u13));
                            }
                            obj = obj6;
                            str = str3;
                            fVar3 = fVar2;
                            str2 = "PROTECTED_AND_PACKAGE";
                            kVar.x(emptyList, Z03, 0, qVar, (b0) fVar4.f19464u, (b0) fVar4.f19465v);
                        } else {
                            fVar3 = fVar2;
                            obj = obj6;
                            str = "classDescriptor.visibility";
                            str2 = "PROTECTED_AND_PACKAGE";
                        }
                        if (qVar != null) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        Iterator it3 = arrayList5.iterator();
                        int i13 = 0;
                        while (it3.hasNext()) {
                            int i14 = i13 + 1;
                            wt.q qVar2 = (wt.q) it3.next();
                            int i15 = i13 + i10;
                            kVar.x(emptyList, Z03, i15, qVar2, ((ut.c) obj).e(qVar2.m(), u13), null);
                            i13 = i14;
                        }
                    } else {
                        fVar3 = fVar2;
                        str = "classDescriptor.visibility";
                        str2 = "PROTECTED_AND_PACKAGE";
                        emptyList = Collections.emptyList();
                    }
                    Z03.T0(false);
                    gt.q visibility = eVar.getVisibility();
                    kotlin.jvm.internal.i.f(visibility, str);
                    if (kotlin.jvm.internal.i.b(visibility, pt.t.f28955b)) {
                        visibility = pt.t.f28956c;
                        kotlin.jvm.internal.i.f(visibility, str2);
                    }
                    Z03.X0(emptyList, visibility);
                    Z03.S0(true);
                    Z03.U0(eVar.r());
                    ((h.a) ((st.c) fVar.f29104v).f31939g).getClass();
                    obj2 = Z03;
                }
                fVar2 = fVar3;
                collection = ca.a.Q0(obj2);
            }
            return is.u.I2(sVar.c(fVar2, collection));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<Map<fu.e, ? extends wt.n>> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final Map<fu.e, ? extends wt.n> invoke() {
            List t3 = k.this.f33627o.t();
            ArrayList arrayList = new ArrayList();
            for (Object obj : t3) {
                if (((wt.n) obj).H()) {
                    arrayList.add(obj);
                }
            }
            int P = sp.b.P(is.i.H1(arrayList, 10));
            if (P < 16) {
                P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(P);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(((wt.n) next).getName(), next);
            }
            return linkedHashMap;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<fu.e, Collection<? extends p0>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ p0 f33635u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ k f33636v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p0 p0Var, k kVar) {
            super(1);
            this.f33635u = p0Var;
            this.f33636v = kVar;
        }

        @Override // ss.l
        public final Collection<? extends p0> invoke(fu.e eVar) {
            fu.e accessorName = eVar;
            kotlin.jvm.internal.i.g(accessorName, "accessorName");
            p0 p0Var = this.f33635u;
            if (kotlin.jvm.internal.i.b(p0Var.getName(), accessorName)) {
                return ca.a.O0(p0Var);
            }
            k kVar = this.f33636v;
            return is.u.u2(k.w(kVar, accessorName), k.v(kVar, accessorName));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<Set<? extends fu.e>> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final Set<? extends fu.e> invoke() {
            return is.u.M2(k.this.f33627o.Q());
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<fu.e, kt.m> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ q.f f33639v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q.f fVar) {
            super(1);
            this.f33639v = fVar;
        }

        @Override // ss.l
        public final kt.m invoke(fu.e eVar) {
            fu.e name = eVar;
            kotlin.jvm.internal.i.g(name, "name");
            k kVar = k.this;
            boolean contains = kVar.r.invoke().contains(name);
            q.f fVar = this.f33639v;
            if (!contains) {
                wt.n nVar = kVar.f33630s.invoke().get(name);
                if (nVar == null) {
                    return null;
                }
                return kt.s.M0(fVar.b(), kVar.f33626n, name, fVar.b().e(new l(kVar)), sp.b.U(fVar, nVar), ((st.c) fVar.f29104v).f31942j.a(nVar));
            }
            pt.q qVar = ((st.c) fVar.f29104v).f31935b;
            gt.e eVar2 = kVar.f33626n;
            fu.b f = mu.a.f(eVar2);
            kotlin.jvm.internal.i.d(f);
            nt.s b10 = qVar.b(new q.a(f.d(name), kVar.f33627o, 2));
            if (b10 == null) {
                return null;
            }
            tt.e eVar3 = new tt.e(fVar, eVar2, b10, null);
            ((st.c) fVar.f29104v).f31950s.a(eVar3);
            return eVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q.f c10, gt.e ownerDescriptor, wt.g jClass, boolean z10, k kVar) {
        super(c10, kVar);
        kotlin.jvm.internal.i.g(c10, "c");
        kotlin.jvm.internal.i.g(ownerDescriptor, "ownerDescriptor");
        kotlin.jvm.internal.i.g(jClass, "jClass");
        this.f33626n = ownerDescriptor;
        this.f33627o = jClass;
        this.f33628p = z10;
        this.f33629q = c10.b().e(new a(c10));
        this.r = c10.b().e(new d());
        this.f33630s = c10.b().e(new b());
        this.f33631t = c10.b().b(new e(c10));
    }

    public static p0 C(p0 p0Var, gt.u uVar, AbstractCollection abstractCollection) {
        boolean z10;
        boolean z11 = true;
        if (!abstractCollection.isEmpty()) {
            Iterator it = abstractCollection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p0 p0Var2 = (p0) it.next();
                if (!kotlin.jvm.internal.i.b(p0Var, p0Var2) && p0Var2.e0() == null && F(p0Var2, uVar)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    z11 = false;
                    break;
                }
            }
        }
        if (!z11) {
            p0 build = p0Var.s().l().build();
            kotlin.jvm.internal.i.d(build);
            return build;
        }
        return p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p0 D(p0 p0Var) {
        fu.c cVar;
        List<z0> valueParameters = p0Var.i();
        kotlin.jvm.internal.i.f(valueParameters, "valueParameters");
        z0 z0Var = (z0) is.u.p2(valueParameters);
        if (z0Var != null) {
            gt.g a10 = z0Var.a().O0().a();
            if (a10 != null) {
                fu.d h10 = mu.a.h(a10);
                if (!h10.e()) {
                    h10 = null;
                }
                if (h10 != null) {
                    cVar = h10.h();
                    if (!kotlin.jvm.internal.i.b(cVar, dt.n.f13386e)) {
                        z0Var = null;
                    }
                    if (z0Var != null) {
                        u.a<? extends p0> s10 = p0Var.s();
                        List<z0> valueParameters2 = p0Var.i();
                        kotlin.jvm.internal.i.f(valueParameters2, "valueParameters");
                        p0 build = s10.b(is.u.c2(valueParameters2)).n(z0Var.a().M0().get(0).a()).build();
                        kt.p0 p0Var2 = (kt.p0) build;
                        if (p0Var2 != null) {
                            p0Var2.P = true;
                        }
                        return build;
                    }
                }
            }
            cVar = null;
            if (!kotlin.jvm.internal.i.b(cVar, dt.n.f13386e)) {
            }
            if (z0Var != null) {
            }
        }
        return null;
    }

    public static boolean F(gt.a aVar, gt.a aVar2) {
        int c10 = iu.l.f.n(aVar2, aVar, true).c();
        defpackage.c.y(c10, "DEFAULT.isOverridableByW…iptor, this, true).result");
        if (c10 == 1 && !u.a.a(aVar2, aVar)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [gt.p0, gt.u] */
    /* JADX WARN: Type inference failed for: r3v1, types: [gt.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [gt.u] */
    public static boolean G(p0 p0Var, p0 p0Var2) {
        boolean z10;
        int i6 = pt.g.f28903m;
        kotlin.jvm.internal.i.g(p0Var, "<this>");
        if (kotlin.jvm.internal.i.b(p0Var.getName().f(), "removeAt") && kotlin.jvm.internal.i.b(ta.v.o(p0Var), j0.f28928h.f28934b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            p0Var2 = p0Var2.b();
        }
        kotlin.jvm.internal.i.f(p0Var2, "if (superDescriptor.isRe…iginal else subDescriptor");
        return F(p0Var2, p0Var);
    }

    public static p0 H(k0 k0Var, String str, ss.l lVar) {
        p0 p0Var;
        boolean d10;
        Iterator it = ((Iterable) lVar.invoke(fu.e.j(str))).iterator();
        do {
            p0Var = null;
            if (!it.hasNext()) {
                break;
            }
            p0 p0Var2 = (p0) it.next();
            if (p0Var2.i().size() == 0) {
                xu.l lVar2 = xu.c.f38095a;
                b0 returnType = p0Var2.getReturnType();
                if (returnType == null) {
                    d10 = false;
                } else {
                    d10 = lVar2.d(returnType, k0Var.a());
                }
                if (d10) {
                    p0Var = p0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (p0Var == null);
        return p0Var;
    }

    public static p0 J(k0 k0Var, ss.l lVar) {
        p0 p0Var;
        b0 returnType;
        String f = k0Var.getName().f();
        kotlin.jvm.internal.i.f(f, "name.asString()");
        Iterator it = ((Iterable) lVar.invoke(fu.e.j(c0.b(f)))).iterator();
        do {
            p0Var = null;
            if (!it.hasNext()) {
                break;
            }
            p0 p0Var2 = (p0) it.next();
            if (p0Var2.i().size() == 1 && (returnType = p0Var2.getReturnType()) != null) {
                fu.e eVar = dt.j.f13360e;
                if (dt.j.E(returnType, n.a.f13400d)) {
                    xu.l lVar2 = xu.c.f38095a;
                    List<z0> i6 = p0Var2.i();
                    kotlin.jvm.internal.i.f(i6, "descriptor.valueParameters");
                    if (lVar2.c(((z0) is.u.y2(i6)).a(), k0Var.a())) {
                        p0Var = p0Var2;
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        } while (p0Var == null);
        return p0Var;
    }

    public static boolean M(p0 p0Var, gt.u uVar) {
        String n10 = ta.v.n(p0Var, 2);
        gt.u b10 = uVar.b();
        kotlin.jvm.internal.i.f(b10, "builtinWithErasedParameters.original");
        if (kotlin.jvm.internal.i.b(n10, ta.v.n(b10, 2)) && !F(p0Var, uVar)) {
            return true;
        }
        return false;
    }

    public static final ArrayList v(k kVar, fu.e eVar) {
        Collection<wt.q> f = kVar.f33661e.invoke().f(eVar);
        ArrayList arrayList = new ArrayList(is.i.H1(f, 10));
        for (wt.q qVar : f) {
            arrayList.add(kVar.t(qVar));
        }
        return arrayList;
    }

    public static final ArrayList w(k kVar, fu.e eVar) {
        boolean z10;
        LinkedHashSet K = kVar.K(eVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : K) {
            p0 p0Var = (p0) obj;
            kotlin.jvm.internal.i.g(p0Var, "<this>");
            boolean z11 = true;
            if (i0.b(p0Var) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && pt.h.a(p0Var) == null) {
                z11 = false;
            }
            if (!z11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, dv.e eVar, ss.l lVar) {
        p0 p0Var;
        n0 n0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            k0 k0Var = (k0) it.next();
            rt.d dVar = null;
            if (E(k0Var, lVar)) {
                p0 I = I(k0Var, lVar);
                kotlin.jvm.internal.i.d(I);
                if (k0Var.i0()) {
                    p0Var = J(k0Var, lVar);
                    kotlin.jvm.internal.i.d(p0Var);
                } else {
                    p0Var = null;
                }
                if (p0Var != null) {
                    p0Var.m();
                    I.m();
                }
                rt.d dVar2 = new rt.d(this.f33626n, I, p0Var, k0Var);
                b0 returnType = I.getReturnType();
                kotlin.jvm.internal.i.d(returnType);
                is.w wVar = is.w.f20676u;
                dVar2.R0(returnType, wVar, p(), null, wVar);
                m0 h10 = iu.f.h(dVar2, I.getAnnotations(), false, I.g());
                h10.F = I;
                h10.O0(dVar2.a());
                if (p0Var != null) {
                    List<z0> i6 = p0Var.i();
                    kotlin.jvm.internal.i.f(i6, "setterMethod.valueParameters");
                    z0 z0Var = (z0) is.u.i2(i6);
                    if (z0Var != null) {
                        n0Var = iu.f.i(dVar2, p0Var.getAnnotations(), z0Var.getAnnotations(), false, p0Var.getVisibility(), p0Var.g());
                        n0Var.F = p0Var;
                    } else {
                        throw new AssertionError("No parameter found for " + p0Var);
                    }
                } else {
                    n0Var = null;
                }
                dVar2.P0(h10, n0Var, null, null);
                dVar = dVar2;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (eVar != null) {
                    eVar.add(k0Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection<b0> B() {
        boolean z10 = this.f33628p;
        gt.e eVar = this.f33626n;
        if (z10) {
            Collection<b0> c10 = eVar.l().c();
            kotlin.jvm.internal.i.f(c10, "ownerDescriptor.typeConstructor.supertypes");
            return c10;
        }
        return ((st.c) this.f33658b.f29104v).f31952u.b().G(eVar);
    }

    public final boolean E(k0 k0Var, ss.l<? super fu.e, ? extends Collection<? extends p0>> lVar) {
        if (kotlin.jvm.internal.h.I(k0Var)) {
            return false;
        }
        p0 I = I(k0Var, lVar);
        p0 J = J(k0Var, lVar);
        if (I == null) {
            return false;
        }
        if (!k0Var.i0()) {
            return true;
        }
        if (J == null || J.m() != I.m()) {
            return false;
        }
        return true;
    }

    public final p0 I(k0 k0Var, ss.l<? super fu.e, ? extends Collection<? extends p0>> lVar) {
        l0 l0Var;
        fu.e eVar;
        m0 n10 = k0Var.n();
        String str = null;
        if (n10 != null) {
            l0Var = (l0) i0.b(n10);
        } else {
            l0Var = null;
        }
        if (l0Var != null) {
            dt.j.A(l0Var);
            gt.b b10 = mu.a.b(mu.a.k(l0Var), pt.k.f28941u);
            if (b10 != null && (eVar = pt.j.f28918a.get(mu.a.g(b10))) != null) {
                str = eVar.f();
            }
        }
        if (str != null && !i0.d(this.f33626n, l0Var)) {
            return H(k0Var, str, lVar);
        }
        String f = k0Var.getName().f();
        kotlin.jvm.internal.i.f(f, "name.asString()");
        return H(k0Var, c0.a(f), lVar);
    }

    public final LinkedHashSet K(fu.e eVar) {
        Collection<b0> B = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (b0 b0Var : B) {
            is.q.R1(b0Var.p().a(eVar, ot.c.WHEN_GET_SUPER_MEMBERS), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set<k0> L(fu.e eVar) {
        Collection<b0> B = B();
        ArrayList arrayList = new ArrayList();
        for (b0 b0Var : B) {
            Collection<k0> c10 = b0Var.p().c(eVar, ot.c.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(is.i.H1(c10, 10));
            for (k0 k0Var : c10) {
                arrayList2.add(k0Var);
            }
            is.q.R1(arrayList2, arrayList);
        }
        return is.u.M2(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
        if (gv.n.H0(r2, "set") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N(p0 p0Var) {
        boolean z10;
        Collection<fu.e> collection;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        fu.e name = p0Var.getName();
        kotlin.jvm.internal.i.f(name, "function.name");
        String f = name.f();
        kotlin.jvm.internal.i.f(f, "name.asString()");
        fu.c cVar = c0.f28861a;
        if (!gv.n.H0(f, "get") && !gv.n.H0(f, "is")) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            fu.e S = sp.b.S(name, "get", null, 12);
            if (S == null) {
                S = sp.b.S(name, "is", null, 8);
            }
            collection = ca.a.Q0(S);
        } else if (gv.n.H0(f, "set")) {
            collection = is.k.R1(new fu.e[]{sp.b.S(name, "set", null, 4), sp.b.S(name, "set", "is", 4)});
        } else {
            collection = (List) pt.j.f28919b.get(name);
            if (collection == null) {
                collection = is.w.f20676u;
            }
        }
        if (!collection.isEmpty()) {
            for (fu.e eVar : collection) {
                Set<k0> L = L(eVar);
                if (!L.isEmpty()) {
                    for (k0 k0Var : L) {
                        if (E(k0Var, new c(p0Var, this))) {
                            if (!k0Var.i0()) {
                                String f2 = p0Var.getName().f();
                                kotlin.jvm.internal.i.f(f2, "function.name.asString()");
                            }
                            z18 = true;
                            continue;
                            if (z18) {
                                z17 = true;
                                continue;
                                break;
                            }
                        }
                        z18 = false;
                        continue;
                        if (z18) {
                        }
                    }
                }
                z17 = false;
                continue;
                if (z17) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (z11) {
            return false;
        }
        j0.a aVar = j0.f28922a;
        fu.e name2 = p0Var.getName();
        kotlin.jvm.internal.i.f(name2, "name");
        fu.e eVar2 = (fu.e) j0.f28932l.get(name2);
        if (eVar2 != null) {
            LinkedHashSet K = K(eVar2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : K) {
                p0 p0Var2 = (p0) obj;
                kotlin.jvm.internal.i.g(p0Var2, "<this>");
                if (i0.b(p0Var2) != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                u.a<? extends p0> s10 = p0Var.s();
                s10.m(eVar2);
                s10.r();
                s10.e();
                p0 build = s10.build();
                kotlin.jvm.internal.i.d(build);
                p0 p0Var3 = build;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (G((p0) it.next(), p0Var3)) {
                            z12 = true;
                            break;
                        }
                    }
                }
            }
        }
        z12 = false;
        if (z12) {
            return false;
        }
        int i6 = pt.h.f28907m;
        fu.e name3 = p0Var.getName();
        kotlin.jvm.internal.i.f(name3, "name");
        if (pt.h.b(name3)) {
            fu.e name4 = p0Var.getName();
            kotlin.jvm.internal.i.f(name4, "name");
            LinkedHashSet<p0> K2 = K(name4);
            ArrayList arrayList2 = new ArrayList();
            for (p0 p0Var4 : K2) {
                gt.u a10 = pt.h.a(p0Var4);
                if (a10 != null) {
                    arrayList2.add(a10);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (M(p0Var, (gt.u) it2.next())) {
                        z13 = true;
                        break;
                    }
                }
            }
        }
        z13 = false;
        if (z13) {
            return false;
        }
        p0 D = D(p0Var);
        if (D != null) {
            fu.e name5 = p0Var.getName();
            kotlin.jvm.internal.i.f(name5, "name");
            LinkedHashSet<p0> K3 = K(name5);
            if (!K3.isEmpty()) {
                for (p0 p0Var5 : K3) {
                    if (p0Var5.isSuspend() && F(D, p0Var5)) {
                        z15 = true;
                        continue;
                    } else {
                        z15 = false;
                        continue;
                    }
                    if (z15) {
                        z14 = true;
                        break;
                    }
                }
            }
        }
        z14 = false;
        if (z14) {
            return false;
        }
        return true;
    }

    public final void O(fu.e name, ot.a aVar) {
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.h.X(((st.c) this.f33658b.f29104v).f31946n, (ot.c) aVar, this.f33626n, name);
    }

    @Override // tt.o, pu.j, pu.i
    public final Collection a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        O(name, cVar);
        return super.a(name, cVar);
    }

    @Override // tt.o, pu.j, pu.i
    public final Collection c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        O(name, cVar);
        return super.c(name, cVar);
    }

    @Override // pu.j, pu.k
    public final gt.g g(fu.e name, ot.c cVar) {
        vu.h<fu.e, kt.m> hVar;
        kt.m invoke;
        kotlin.jvm.internal.i.g(name, "name");
        O(name, cVar);
        k kVar = (k) this.f33659c;
        if (kVar == null || (hVar = kVar.f33631t) == null || (invoke = hVar.invoke(name)) == null) {
            return this.f33631t.invoke(name);
        }
        return invoke;
    }

    @Override // tt.o
    public final Set h(pu.d kindFilter, i.a.C0490a c0490a) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        return h0.I1(this.r.invoke(), this.f33630s.invoke().keySet());
    }

    @Override // tt.o
    public final Set i(pu.d kindFilter, i.a.C0490a c0490a) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        gt.e eVar = this.f33626n;
        Collection<b0> c10 = eVar.l().c();
        kotlin.jvm.internal.i.f(c10, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (b0 b0Var : c10) {
            is.q.R1(b0Var.p().b(), linkedHashSet);
        }
        vu.i<tt.b> iVar = this.f33661e;
        linkedHashSet.addAll(iVar.invoke().a());
        linkedHashSet.addAll(iVar.invoke().d());
        linkedHashSet.addAll(h(kindFilter, c0490a));
        linkedHashSet.addAll(((st.c) this.f33658b.f29104v).f31955x.b(eVar));
        return linkedHashSet;
    }

    @Override // tt.o
    public final void j(ArrayList arrayList, fu.e name) {
        boolean z10;
        kotlin.jvm.internal.i.g(name, "name");
        boolean u10 = this.f33627o.u();
        gt.e eVar = this.f33626n;
        q.f fVar = this.f33658b;
        if (u10) {
            vu.i<tt.b> iVar = this.f33661e;
            if (iVar.invoke().b(name) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((p0) it.next()).i().isEmpty()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    wt.v b10 = iVar.invoke().b(name);
                    kotlin.jvm.internal.i.d(b10);
                    st.e U = sp.b.U(fVar, b10);
                    fu.e name2 = b10.getName();
                    st.c cVar = (st.c) fVar.f29104v;
                    rt.e a12 = rt.e.a1(eVar, U, name2, cVar.f31942j.a(b10), true);
                    b0 e10 = ((ut.c) fVar.f29108z).e(b10.a(), ca.a.u1(2, false, false, null, 6));
                    gt.n0 p10 = p();
                    is.w wVar = is.w.f20676u;
                    a12.Z0(null, p10, wVar, wVar, wVar, e10, gt.z.OPEN, gt.p.f16804e, null);
                    a12.b1(false, false);
                    ((h.a) cVar.f31939g).getClass();
                    arrayList.add(a12);
                }
            }
        }
        ((st.c) fVar.f29104v).f31955x.e(eVar, name, arrayList);
    }

    @Override // tt.o
    public final tt.b k() {
        return new tt.a(this.f33627o, f.f33623u);
    }

    @Override // tt.o
    public final void m(LinkedHashSet linkedHashSet, fu.e name) {
        boolean z10;
        kotlin.jvm.internal.i.g(name, "name");
        LinkedHashSet<gt.u> K = K(name);
        j0.a aVar = j0.f28922a;
        if (!j0.f28931k.contains(name)) {
            int i6 = pt.h.f28907m;
            if (!pt.h.b(name)) {
                if (!K.isEmpty()) {
                    for (gt.u uVar : K) {
                        if (uVar.isSuspend()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : K) {
                        if (N((p0) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    y(linkedHashSet, name, arrayList, false);
                    return;
                }
            }
        }
        dv.e eVar = new dv.e();
        LinkedHashSet a02 = sc.b.a0(name, K, is.w.f20676u, this.f33626n, su.t.r, ((st.c) this.f33658b.f29104v).f31952u.a());
        z(name, linkedHashSet, a02, linkedHashSet, new g(this));
        z(name, linkedHashSet, a02, eVar, new h(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : K) {
            if (N((p0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        y(linkedHashSet, name, is.u.u2(eVar, arrayList2), true);
    }

    @Override // tt.o
    public final void n(ArrayList arrayList, fu.e name) {
        LinkedHashSet linkedHashSet;
        Set set;
        wt.q qVar;
        kotlin.jvm.internal.i.g(name, "name");
        boolean r = this.f33627o.r();
        q.f fVar = this.f33658b;
        if (r && (qVar = (wt.q) is.u.z2(this.f33661e.invoke().f(name))) != null) {
            rt.f S0 = rt.f.S0(this.f33626n, sp.b.U(fVar, qVar), kotlin.jvm.internal.h.i0(qVar.getVisibility()), false, qVar.getName(), ((st.c) fVar.f29104v).f31942j.a(qVar), false);
            m0 c10 = iu.f.c(S0, h.a.f19495a);
            S0.P0(c10, null, null, null);
            kotlin.jvm.internal.i.g(fVar, "<this>");
            b0 l2 = o.l(qVar, new q.f((st.c) fVar.f29104v, new st.g(fVar, S0, qVar, 0), (hs.d) fVar.f29106x));
            is.w wVar = is.w.f20676u;
            S0.R0(l2, wVar, p(), null, wVar);
            c10.O0(l2);
            arrayList.add(S0);
        }
        Set<k0> L = L(name);
        if (L.isEmpty()) {
            return;
        }
        dv.e eVar = new dv.e();
        dv.e eVar2 = new dv.e();
        A(L, arrayList, eVar, new i(this));
        Collection<?> H = ca.a.H(eVar, L);
        if (H.isEmpty()) {
            set = is.u.M2(L);
        } else {
            if (H instanceof Set) {
                linkedHashSet = new LinkedHashSet();
                for (Object obj : L) {
                    if (!H.contains(obj)) {
                        linkedHashSet.add(obj);
                    }
                }
            } else {
                linkedHashSet = new LinkedHashSet(L);
                linkedHashSet.removeAll(H);
            }
            set = linkedHashSet;
        }
        A(set, eVar2, null, new j(this));
        LinkedHashSet I1 = h0.I1(L, eVar2);
        gt.e eVar3 = this.f33626n;
        st.c cVar = (st.c) fVar.f29104v;
        arrayList.addAll(sc.b.a0(name, I1, arrayList, eVar3, cVar.f, cVar.f31952u.a()));
    }

    @Override // tt.o
    public final Set o(pu.d kindFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        if (this.f33627o.r()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f33661e.invoke().e());
        Collection<b0> c10 = this.f33626n.l().c();
        kotlin.jvm.internal.i.f(c10, "ownerDescriptor.typeConstructor.supertypes");
        for (b0 b0Var : c10) {
            is.q.R1(b0Var.p().d(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // tt.o
    public final gt.n0 p() {
        gt.e eVar = this.f33626n;
        if (eVar != null) {
            int i6 = iu.g.f20688a;
            return eVar.L0();
        }
        iu.g.a(0);
        throw null;
    }

    @Override // tt.o
    public final gt.j q() {
        return this.f33626n;
    }

    @Override // tt.o
    public final boolean r(rt.e eVar) {
        if (this.f33627o.r()) {
            return false;
        }
        return N(eVar);
    }

    @Override // tt.o
    public final o.a s(wt.q method, ArrayList arrayList, b0 b0Var, List valueParameters) {
        kotlin.jvm.internal.i.g(method, "method");
        kotlin.jvm.internal.i.g(valueParameters, "valueParameters");
        ((k.a) ((st.c) this.f33658b.f29104v).f31938e).getClass();
        if (this.f33626n != null) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return new o.a(valueParameters, arrayList, emptyList, b0Var);
            }
            k.b.a(3);
            throw null;
        }
        k.a.a(1);
        throw null;
    }

    @Override // tt.o
    public final String toString() {
        return "Lazy Java member scope for " + this.f33627o.e();
    }

    public final void x(ArrayList arrayList, rt.b bVar, int i6, wt.q qVar, b0 b0Var, b0 b0Var2) {
        m1 m1Var;
        h.a.C0293a c0293a = h.a.f19495a;
        fu.e name = qVar.getName();
        m1 i10 = k1.i(b0Var);
        boolean M = qVar.M();
        if (b0Var2 != null) {
            m1Var = k1.i(b0Var2);
        } else {
            m1Var = null;
        }
        arrayList.add(new kt.v0(bVar, null, i6, c0293a, name, i10, M, false, false, m1Var, ((st.c) this.f33658b.f29104v).f31942j.a(qVar)));
    }

    public final void y(LinkedHashSet linkedHashSet, fu.e eVar, ArrayList arrayList, boolean z10) {
        gt.e eVar2 = this.f33626n;
        st.c cVar = (st.c) this.f33658b.f29104v;
        LinkedHashSet<p0> a02 = sc.b.a0(eVar, arrayList, linkedHashSet, eVar2, cVar.f, cVar.f31952u.a());
        if (!z10) {
            linkedHashSet.addAll(a02);
            return;
        }
        ArrayList u22 = is.u.u2(a02, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(is.i.H1(a02, 10));
        for (p0 p0Var : a02) {
            p0 p0Var2 = (p0) i0.c(p0Var);
            if (p0Var2 != null) {
                p0Var = C(p0Var, p0Var2, u22);
            }
            arrayList2.add(p0Var);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(fu.e eVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, ss.l lVar) {
        p0 p0Var;
        p0 p0Var2;
        Object obj;
        p0 p0Var3;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            p0 p0Var4 = (p0) it.next();
            p0 p0Var5 = (p0) i0.b(p0Var4);
            p0 p0Var6 = null;
            if (p0Var5 != null) {
                String a10 = i0.a(p0Var5);
                kotlin.jvm.internal.i.d(a10);
                for (p0 p0Var7 : (Collection) lVar.invoke(fu.e.j(a10))) {
                    u.a<? extends p0> s10 = p0Var7.s();
                    s10.m(eVar);
                    s10.r();
                    s10.e();
                    p0 build = s10.build();
                    kotlin.jvm.internal.i.d(build);
                    p0 p0Var8 = build;
                    if (G(p0Var5, p0Var8)) {
                        p0Var = C(p0Var8, p0Var5, linkedHashSet);
                        break;
                    }
                }
            }
            p0Var = null;
            ca.a.g(p0Var, abstractSet);
            gt.u a11 = pt.h.a(p0Var4);
            if (a11 != null) {
                fu.e name = a11.getName();
                kotlin.jvm.internal.i.f(name, "overridden.name");
                Iterator it2 = ((Iterable) lVar.invoke(name)).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (M((p0) obj, a11)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                p0 p0Var9 = (p0) obj;
                if (p0Var9 != null) {
                    u.a<? extends p0> s11 = p0Var9.s();
                    List<z0> i6 = a11.i();
                    kotlin.jvm.internal.i.f(i6, "overridden.valueParameters");
                    ArrayList arrayList = new ArrayList(is.i.H1(i6, 10));
                    for (z0 z0Var : i6) {
                        arrayList.add(z0Var.a());
                    }
                    List<z0> i10 = p0Var9.i();
                    kotlin.jvm.internal.i.f(i10, "override.valueParameters");
                    s11.b(ca.a.K(arrayList, i10, a11));
                    s11.r();
                    s11.e();
                    s11.c(Boolean.TRUE);
                    p0Var3 = s11.build();
                } else {
                    p0Var3 = null;
                }
                if (p0Var3 != null) {
                    if (!N(p0Var3)) {
                        p0Var3 = null;
                    }
                    if (p0Var3 != null) {
                        p0Var2 = C(p0Var3, a11, linkedHashSet);
                        ca.a.g(p0Var2, abstractSet);
                        if (!p0Var4.isSuspend()) {
                            fu.e name2 = p0Var4.getName();
                            kotlin.jvm.internal.i.f(name2, "descriptor.name");
                            Iterator it3 = ((Iterable) lVar.invoke(name2)).iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                p0 D = D((p0) it3.next());
                                if (D == null || !F(D, p0Var4)) {
                                    D = null;
                                    continue;
                                }
                                if (D != null) {
                                    p0Var6 = D;
                                    break;
                                }
                            }
                        }
                        ca.a.g(p0Var6, abstractSet);
                    }
                }
            }
            p0Var2 = null;
            ca.a.g(p0Var2, abstractSet);
            if (!p0Var4.isSuspend()) {
            }
            ca.a.g(p0Var6, abstractSet);
        }
    }
}
