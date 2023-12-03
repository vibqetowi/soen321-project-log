package tt;

import gt.k0;
import gt.n0;
import gt.p0;
import gt.v0;
import gt.z0;
import ht.h;
import is.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kt.o0;
import mt.g;
import pu.c;
import pu.i;
import qt.h;
import qt.k;
import vu.c;
import wu.b0;
import wu.k1;
import wu.m1;
/* compiled from: LazyJavaScope.kt */
/* loaded from: classes2.dex */
public abstract class o extends pu.j {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f33657m = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(o.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(o.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(o.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b  reason: collision with root package name */
    public final q.f f33658b;

    /* renamed from: c  reason: collision with root package name */
    public final o f33659c;

    /* renamed from: d  reason: collision with root package name */
    public final vu.i<Collection<gt.j>> f33660d;

    /* renamed from: e  reason: collision with root package name */
    public final vu.i<tt.b> f33661e;
    public final vu.g<fu.e, Collection<p0>> f;

    /* renamed from: g  reason: collision with root package name */
    public final vu.h<fu.e, k0> f33662g;

    /* renamed from: h  reason: collision with root package name */
    public final vu.g<fu.e, Collection<p0>> f33663h;

    /* renamed from: i  reason: collision with root package name */
    public final vu.i f33664i;

    /* renamed from: j  reason: collision with root package name */
    public final vu.i f33665j;

    /* renamed from: k  reason: collision with root package name */
    public final vu.i f33666k;

    /* renamed from: l  reason: collision with root package name */
    public final vu.g<fu.e, List<k0>> f33667l;

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f33668a;

        /* renamed from: b  reason: collision with root package name */
        public final b0 f33669b;

        /* renamed from: c  reason: collision with root package name */
        public final List<z0> f33670c;

        /* renamed from: d  reason: collision with root package name */
        public final List<v0> f33671d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f33672e;
        public final List<String> f;

        public a(List valueParameters, ArrayList arrayList, List list, b0 b0Var) {
            kotlin.jvm.internal.i.g(valueParameters, "valueParameters");
            this.f33668a = b0Var;
            this.f33669b = null;
            this.f33670c = valueParameters;
            this.f33671d = arrayList;
            this.f33672e = false;
            this.f = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.i.b(this.f33668a, aVar.f33668a) && kotlin.jvm.internal.i.b(this.f33669b, aVar.f33669b) && kotlin.jvm.internal.i.b(this.f33670c, aVar.f33670c) && kotlin.jvm.internal.i.b(this.f33671d, aVar.f33671d) && this.f33672e == aVar.f33672e && kotlin.jvm.internal.i.b(this.f, aVar.f)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.f33668a.hashCode() * 31;
            b0 b0Var = this.f33669b;
            if (b0Var == null) {
                hashCode = 0;
            } else {
                hashCode = b0Var.hashCode();
            }
            int hashCode3 = this.f33670c.hashCode();
            int hashCode4 = (this.f33671d.hashCode() + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31)) * 31;
            boolean z10 = this.f33672e;
            int i6 = z10;
            if (z10 != 0) {
                i6 = 1;
            }
            return this.f.hashCode() + ((hashCode4 + i6) * 31);
        }

        public final String toString() {
            return "MethodSignatureData(returnType=" + this.f33668a + ", receiverType=" + this.f33669b + ", valueParameters=" + this.f33670c + ", typeParameters=" + this.f33671d + ", hasStableParameterNames=" + this.f33672e + ", errors=" + this.f + ')';
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<z0> f33673a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f33674b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends z0> list, boolean z10) {
            this.f33673a = list;
            this.f33674b = z10;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<Collection<? extends gt.j>> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final Collection<? extends gt.j> invoke() {
            pu.d kindFilter = pu.d.f28985m;
            pu.i.f29004a.getClass();
            i.a.C0490a nameFilter = i.a.f29006b;
            o oVar = o.this;
            oVar.getClass();
            kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
            kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
            ot.c cVar = ot.c.WHEN_GET_ALL_DESCRIPTORS;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (kindFilter.a(pu.d.f28984l)) {
                for (fu.e eVar : oVar.h(kindFilter, nameFilter)) {
                    if (((Boolean) nameFilter.invoke(eVar)).booleanValue()) {
                        ca.a.g(oVar.g(eVar, cVar), linkedHashSet);
                    }
                }
            }
            boolean a10 = kindFilter.a(pu.d.f28981i);
            List<pu.c> list = kindFilter.f28991a;
            if (a10 && !list.contains(c.a.f28973a)) {
                for (fu.e eVar2 : oVar.i(kindFilter, nameFilter)) {
                    if (((Boolean) nameFilter.invoke(eVar2)).booleanValue()) {
                        linkedHashSet.addAll(oVar.a(eVar2, cVar));
                    }
                }
            }
            if (kindFilter.a(pu.d.f28982j) && !list.contains(c.a.f28973a)) {
                for (fu.e eVar3 : oVar.o(kindFilter)) {
                    if (((Boolean) nameFilter.invoke(eVar3)).booleanValue()) {
                        linkedHashSet.addAll(oVar.c(eVar3, cVar));
                    }
                }
            }
            return is.u.I2(linkedHashSet);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<Set<? extends fu.e>> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final Set<? extends fu.e> invoke() {
            return o.this.h(pu.d.f28987o, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<fu.e, k0> {
        public e() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
            if (dt.r.a(r4) == false) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final k0 invoke(fu.e eVar) {
            boolean z10;
            boolean z11;
            fu.e name = eVar;
            kotlin.jvm.internal.i.g(name, "name");
            o oVar = o.this;
            o oVar2 = oVar.f33659c;
            if (oVar2 != null) {
                return oVar2.f33662g.invoke(name);
            }
            wt.n c10 = oVar.f33661e.invoke().c(name);
            if (c10 == null || c10.H()) {
                return null;
            }
            boolean z12 = true;
            boolean z13 = !c10.isFinal();
            q.f fVar = oVar.f33658b;
            st.e U = sp.b.U(fVar, c10);
            gt.j q10 = oVar.q();
            gt.q i02 = kotlin.jvm.internal.h.i0(c10.getVisibility());
            fu.e name2 = c10.getName();
            st.c cVar = (st.c) fVar.f29104v;
            g.a a10 = cVar.f31942j.a(c10);
            if (c10.isFinal() && c10.j()) {
                z10 = true;
            } else {
                z10 = false;
            }
            rt.f S0 = rt.f.S0(q10, U, i02, z13, name2, a10, z10);
            S0.P0(null, null, null, null);
            b0 e10 = ((ut.c) fVar.f29108z).e(c10.a(), ca.a.u1(2, false, false, null, 7));
            if (dt.j.H(e10) || dt.j.J(e10)) {
                if (c10.isFinal() && c10.j()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    c10.O();
                }
            }
            is.w wVar = is.w.f20676u;
            S0.R0(e10, wVar, oVar.p(), null, wVar);
            b0 a11 = S0.a();
            if (a11 != null) {
                int i6 = iu.g.f20688a;
                if (!S0.f23927z && !ta.v.E(a11)) {
                    if (!k1.b(a11)) {
                        dt.j e11 = mu.a.e(S0);
                        if (!dt.j.H(a11)) {
                            xu.l lVar = xu.c.f38095a;
                            if (!lVar.c(e11.v(), a11)) {
                                if (!lVar.c(e11.k("Number").r(), a11)) {
                                    if (!lVar.c(e11.f(), a11)) {
                                    }
                                }
                            }
                        }
                    }
                    if (z12) {
                        S0.I0(null, new q(oVar, c10, S0));
                    }
                    ((h.a) cVar.f31939g).getClass();
                    return S0;
                }
                z12 = false;
                if (z12) {
                }
                ((h.a) cVar.f31939g).getClass();
                return S0;
            }
            iu.g.a(64);
            throw null;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<fu.e, Collection<? extends p0>> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final Collection<? extends p0> invoke(fu.e eVar) {
            fu.e name = eVar;
            kotlin.jvm.internal.i.g(name, "name");
            o oVar = o.this;
            o oVar2 = oVar.f33659c;
            if (oVar2 != null) {
                return (Collection) ((c.k) oVar2.f).invoke(name);
            }
            ArrayList arrayList = new ArrayList();
            for (wt.q qVar : oVar.f33661e.invoke().f(name)) {
                rt.e t3 = oVar.t(qVar);
                if (oVar.r(t3)) {
                    ((h.a) ((st.c) oVar.f33658b.f29104v).f31939g).getClass();
                    arrayList.add(t3);
                }
            }
            oVar.j(arrayList, name);
            return arrayList;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<tt.b> {
        public g() {
            super(0);
        }

        @Override // ss.a
        public final tt.b invoke() {
            return o.this.k();
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<Set<? extends fu.e>> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final Set<? extends fu.e> invoke() {
            return o.this.i(pu.d.f28988p, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.l<fu.e, Collection<? extends p0>> {
        public i() {
            super(1);
        }

        @Override // ss.l
        public final Collection<? extends p0> invoke(fu.e eVar) {
            fu.e name = eVar;
            kotlin.jvm.internal.i.g(name, "name");
            o oVar = o.this;
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((c.k) oVar.f).invoke(name));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                String n10 = ta.v.n((p0) obj, 2);
                Object obj2 = linkedHashMap.get(n10);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(n10, obj2);
                }
                ((List) obj2).add(obj);
            }
            for (List list : linkedHashMap.values()) {
                if (list.size() != 1) {
                    Collection a10 = iu.s.a(list, r.f33690u);
                    linkedHashSet.removeAll(list);
                    linkedHashSet.addAll(a10);
                }
            }
            oVar.m(linkedHashSet, name);
            q.f fVar = oVar.f33658b;
            return is.u.I2(((st.c) fVar.f29104v).r.c(fVar, linkedHashSet));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.l<fu.e, List<? extends k0>> {
        public j() {
            super(1);
        }

        @Override // ss.l
        public final List<? extends k0> invoke(fu.e eVar) {
            fu.e name = eVar;
            kotlin.jvm.internal.i.g(name, "name");
            ArrayList arrayList = new ArrayList();
            o oVar = o.this;
            ca.a.g(oVar.f33662g.invoke(name), arrayList);
            oVar.n(arrayList, name);
            if (iu.g.n(oVar.q(), 5)) {
                return is.u.I2(arrayList);
            }
            q.f fVar = oVar.f33658b;
            return is.u.I2(((st.c) fVar.f29104v).r.c(fVar, arrayList));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<Set<? extends fu.e>> {
        public k() {
            super(0);
        }

        @Override // ss.a
        public final Set<? extends fu.e> invoke() {
            return o.this.o(pu.d.f28989q);
        }
    }

    public o(q.f c10, o oVar) {
        kotlin.jvm.internal.i.g(c10, "c");
        this.f33658b = c10;
        this.f33659c = oVar;
        this.f33660d = c10.b().g(new c());
        this.f33661e = c10.b().e(new g());
        this.f = c10.b().h(new f());
        this.f33662g = c10.b().b(new e());
        this.f33663h = c10.b().h(new i());
        this.f33664i = c10.b().e(new h());
        this.f33665j = c10.b().e(new k());
        this.f33666k = c10.b().e(new d());
        this.f33667l = c10.b().h(new j());
    }

    public static b0 l(wt.q method, q.f fVar) {
        kotlin.jvm.internal.i.g(method, "method");
        return ((ut.c) fVar.f29108z).e(method.m(), ca.a.u1(2, method.p().r(), false, null, 6));
    }

    public static b u(q.f fVar, kt.x xVar, List jValueParameters) {
        hs.f fVar2;
        fu.e name;
        kotlin.jvm.internal.i.g(jValueParameters, "jValueParameters");
        a0 N2 = is.u.N2(jValueParameters);
        ArrayList arrayList = new ArrayList(is.i.H1(N2, 10));
        Iterator it = N2.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            is.b0 b0Var = (is.b0) it;
            if (b0Var.hasNext()) {
                is.z zVar = (is.z) b0Var.next();
                int i6 = zVar.f20679a;
                wt.z zVar2 = (wt.z) zVar.f20680b;
                st.e U = sp.b.U(fVar, zVar2);
                wt.f fVar3 = null;
                ut.a u12 = ca.a.u1(2, z10, z10, null, 7);
                boolean b10 = zVar2.b();
                Object obj = fVar.f29108z;
                if (b10) {
                    wt.w a10 = zVar2.a();
                    if (a10 instanceof wt.f) {
                        fVar3 = (wt.f) a10;
                    }
                    if (fVar3 != null) {
                        m1 c10 = ((ut.c) obj).c(fVar3, u12, true);
                        fVar2 = new hs.f(c10, fVar.a().o().g(c10));
                    } else {
                        throw new AssertionError("Vararg parameter should be an array: " + zVar2);
                    }
                } else {
                    fVar2 = new hs.f(((ut.c) obj).e(zVar2.a(), u12), null);
                }
                b0 b0Var2 = (b0) fVar2.f19464u;
                b0 b0Var3 = (b0) fVar2.f19465v;
                if (kotlin.jvm.internal.i.b(xVar.getName().f(), "equals") && jValueParameters.size() == 1 && kotlin.jvm.internal.i.b(fVar.a().o().p(), b0Var2)) {
                    name = fu.e.j("other");
                } else {
                    name = zVar2.getName();
                    if (name == null) {
                        z11 = true;
                    }
                    if (name == null) {
                        name = fu.e.j("p" + i6);
                    }
                }
                arrayList.add(new kt.v0(xVar, null, i6, U, name, b0Var2, false, false, false, b0Var3, ((st.c) fVar.f29104v).f31942j.a(zVar2)));
                z10 = false;
            } else {
                return new b(is.u.I2(arrayList), z11);
            }
        }
    }

    @Override // pu.j, pu.i
    public Collection a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        if (!b().contains(name)) {
            return is.w.f20676u;
        }
        return (Collection) ((c.k) this.f33663h).invoke(name);
    }

    @Override // pu.j, pu.i
    public final Set<fu.e> b() {
        return (Set) kotlin.jvm.internal.h.C(this.f33664i, f33657m[0]);
    }

    @Override // pu.j, pu.i
    public Collection c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        if (!d().contains(name)) {
            return is.w.f20676u;
        }
        return (Collection) ((c.k) this.f33667l).invoke(name);
    }

    @Override // pu.j, pu.i
    public final Set<fu.e> d() {
        return (Set) kotlin.jvm.internal.h.C(this.f33665j, f33657m[1]);
    }

    @Override // pu.j, pu.i
    public final Set<fu.e> e() {
        return (Set) kotlin.jvm.internal.h.C(this.f33666k, f33657m[2]);
    }

    @Override // pu.j, pu.k
    public Collection<gt.j> f(pu.d kindFilter, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        return this.f33660d.invoke();
    }

    public abstract Set h(pu.d dVar, i.a.C0490a c0490a);

    public abstract Set i(pu.d dVar, i.a.C0490a c0490a);

    public void j(ArrayList arrayList, fu.e name) {
        kotlin.jvm.internal.i.g(name, "name");
    }

    public abstract tt.b k();

    public abstract void m(LinkedHashSet linkedHashSet, fu.e eVar);

    public abstract void n(ArrayList arrayList, fu.e eVar);

    public abstract Set o(pu.d dVar);

    public abstract n0 p();

    public abstract gt.j q();

    public boolean r(rt.e eVar) {
        return true;
    }

    public abstract a s(wt.q qVar, ArrayList arrayList, b0 b0Var, List list);

    public final rt.e t(wt.q method) {
        boolean z10;
        o0 o0Var;
        gt.z zVar;
        Map map;
        kotlin.jvm.internal.i.g(method, "method");
        q.f fVar = this.f33658b;
        st.e U = sp.b.U(fVar, method);
        gt.j q10 = q();
        fu.e name = method.getName();
        g.a a10 = ((st.c) fVar.f29104v).f31942j.a(method);
        if (this.f33661e.invoke().b(method.getName()) != null && method.i().isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        rt.e a12 = rt.e.a1(q10, U, name, a10, z10);
        kotlin.jvm.internal.i.g(fVar, "<this>");
        q.f fVar2 = new q.f((st.c) fVar.f29104v, new st.g(fVar, a12, method, 0), (hs.d) fVar.f29106x);
        ArrayList<wt.x> typeParameters = method.getTypeParameters();
        ArrayList arrayList = new ArrayList(is.i.H1(typeParameters, 10));
        for (wt.x xVar : typeParameters) {
            v0 a11 = ((st.j) fVar2.f29105w).a(xVar);
            kotlin.jvm.internal.i.d(a11);
            arrayList.add(a11);
        }
        b u10 = u(fVar2, a12, method.i());
        b0 l2 = l(method, fVar2);
        List<z0> list = u10.f33673a;
        a s10 = s(method, arrayList, l2, list);
        b0 b0Var = s10.f33669b;
        if (b0Var != null) {
            o0Var = iu.f.g(a12, b0Var, h.a.f19495a);
        } else {
            o0Var = null;
        }
        o0 o0Var2 = o0Var;
        n0 p10 = p();
        is.w wVar = is.w.f20676u;
        List<v0> list2 = s10.f33671d;
        List<z0> list3 = s10.f33670c;
        b0 b0Var2 = s10.f33668a;
        boolean isAbstract = method.isAbstract();
        boolean z11 = !method.isFinal();
        if (isAbstract) {
            zVar = gt.z.ABSTRACT;
        } else if (z11) {
            zVar = gt.z.OPEN;
        } else {
            zVar = gt.z.FINAL;
        }
        gt.z zVar2 = zVar;
        gt.q i02 = kotlin.jvm.internal.h.i0(method.getVisibility());
        if (s10.f33669b != null) {
            map = sp.b.Q(new hs.f(rt.e.f31016a0, is.u.g2(list)));
        } else {
            map = is.x.f20677u;
        }
        a12.Z0(o0Var2, p10, wVar, list2, list3, b0Var2, zVar2, i02, map);
        a12.b1(s10.f33672e, u10.f33674b);
        if (!(!s10.f.isEmpty())) {
            return a12;
        }
        ((k.a) ((st.c) fVar2.f29104v).f31938e).getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
