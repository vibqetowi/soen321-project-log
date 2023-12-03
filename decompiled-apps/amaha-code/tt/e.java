package tt;

import gt.a0;
import gt.c0;
import gt.c1;
import gt.o0;
import gt.p;
import gt.t0;
import gt.v0;
import gt.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import pt.d0;
import pt.t;
import qt.h;
import wu.b0;
import wu.c0;
import wu.f1;
import wu.i0;
import wu.j1;
import wu.n1;
import wu.x0;
/* compiled from: LazyJavaClassDescriptor.kt */
/* loaded from: classes2.dex */
public final class e extends kt.m implements rt.c {
    public final q.f B;
    public final wt.g C;
    public final gt.e D;
    public final q.f E;
    public final hs.i F;
    public final int G;
    public final gt.z H;
    public final c1 I;
    public final boolean J;
    public final a K;
    public final k L;
    public final o0<k> M;
    public final pu.g N;
    public final x O;
    public final st.e P;
    public final vu.i<List<v0>> Q;

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public final class a extends wu.b {

        /* renamed from: c  reason: collision with root package name */
        public final vu.i<List<v0>> f33617c;

        /* compiled from: LazyJavaClassDescriptor.kt */
        /* renamed from: tt.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0560a extends kotlin.jvm.internal.k implements ss.a<List<? extends v0>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ e f33619u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0560a(e eVar) {
                super(0);
                this.f33619u = eVar;
            }

            @Override // ss.a
            public final List<? extends v0> invoke() {
                return w0.b(this.f33619u);
            }
        }

        public a() {
            super(e.this.E.b());
            this.f33617c = e.this.E.b().e(new C0560a(e.this));
        }

        @Override // wu.b, wu.l, wu.x0
        public final gt.g a() {
            return e.this;
        }

        @Override // wu.x0
        public final boolean d() {
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
            if (r6 != false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00b6, code lost:
            if (r10 == null) goto L103;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x025d  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0262  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
        @Override // wu.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Collection<b0> g() {
            fu.c cVar;
            fu.c cVar2;
            i0 i0Var;
            gt.e eVar;
            b0 b0Var;
            x0 x0Var;
            gt.g g5;
            gt.e eVar2;
            ArrayList arrayList;
            boolean z10;
            ku.u uVar;
            String str;
            boolean z11;
            e eVar3 = e.this;
            Collection<wt.j> c10 = eVar3.C.c();
            ArrayList arrayList2 = new ArrayList(c10.size());
            ArrayList arrayList3 = new ArrayList(0);
            fu.c PURELY_IMPLEMENTS_ANNOTATION = d0.f28882n;
            kotlin.jvm.internal.i.f(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            ht.c l2 = eVar3.P.l(PURELY_IMPLEMENTS_ANNOTATION);
            kt.k kVar = null;
            if (l2 != null) {
                Object z22 = is.u.z2(l2.b().values());
                if (z22 instanceof ku.u) {
                    uVar = (ku.u) z22;
                } else {
                    uVar = null;
                }
                if (uVar != null && (str = (String) uVar.f23941a) != null) {
                    int i6 = 0;
                    int i10 = 1;
                    while (true) {
                        if (i6 < str.length()) {
                            char charAt = str.charAt(i6);
                            int d10 = v.h.d(i10);
                            if (d10 != 0) {
                                if (d10 != 1) {
                                    if (d10 != 2) {
                                        continue;
                                    }
                                } else if (charAt == '.') {
                                    i10 = 3;
                                } else if (!Character.isJavaIdentifierPart(charAt)) {
                                    break;
                                }
                                i6++;
                            }
                            if (!Character.isJavaIdentifierPart(charAt)) {
                                break;
                            }
                            i10 = 2;
                            i6++;
                        } else if (i10 != 3) {
                            z11 = true;
                        }
                    }
                    z11 = false;
                    if (z11) {
                        cVar = new fu.c(str);
                        if (cVar != null) {
                            if (!cVar.d() && cVar.h(dt.n.f13389i)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        cVar = null;
                        n1 n1Var = n1.INVARIANT;
                        q.f fVar = eVar3.E;
                        if (cVar != null) {
                            LinkedHashMap linkedHashMap = pt.o.f28945a;
                            cVar2 = pt.o.f28946b.get(mu.a.g(eVar3));
                        } else {
                            cVar2 = cVar;
                        }
                        a0 a10 = fVar.a();
                        ot.c cVar3 = ot.c.FROM_JAVA_LOADER;
                        int i11 = mu.a.f25746a;
                        kotlin.jvm.internal.i.g(a10, "<this>");
                        cVar2.d();
                        fu.c e10 = cVar2.e();
                        kotlin.jvm.internal.i.f(e10, "topLevelClassFqName.parent()");
                        pu.i p10 = a10.H(e10).p();
                        fu.e f = cVar2.f();
                        kotlin.jvm.internal.i.f(f, "topLevelClassFqName.shortName()");
                        g5 = p10.g(f, cVar3);
                        if (!(g5 instanceof gt.e)) {
                            eVar2 = (gt.e) g5;
                        } else {
                            eVar2 = null;
                        }
                        if (eVar2 != null) {
                            int size = eVar2.l().getParameters().size();
                            List<v0> parameters = eVar3.K.getParameters();
                            kotlin.jvm.internal.i.f(parameters, "getTypeConstructor().parameters");
                            int size2 = parameters.size();
                            if (size2 == size) {
                                arrayList = new ArrayList(is.i.H1(parameters, 10));
                                for (v0 v0Var : parameters) {
                                    arrayList.add(new f1(v0Var.r(), n1Var));
                                }
                            } else if (size2 == 1 && size > 1 && cVar == null) {
                                f1 f1Var = new f1(((v0) is.u.y2(parameters)).r(), n1Var);
                                xs.f fVar2 = new xs.f(1, size);
                                ArrayList arrayList4 = new ArrayList(is.i.H1(fVar2, 10));
                                xs.e it = fVar2.iterator();
                                while (it.f38001w) {
                                    it.nextInt();
                                    arrayList4.add(f1Var);
                                }
                                arrayList = arrayList4;
                            }
                            wu.v0.f37300v.getClass();
                            i0Var = c0.e(wu.v0.f37301w, eVar2, arrayList);
                            for (wt.j jVar : c10) {
                                b0 e11 = ((ut.c) fVar.f29108z).e(jVar, ca.a.u1(1, false, false, kVar, 7));
                                xt.s sVar = ((st.c) fVar.f29104v).r;
                                sVar.getClass();
                                q.f fVar3 = fVar;
                                b0 b10 = sVar.b(new xt.u(null, false, fVar, pt.c.TYPE_USE, true), e11, is.w.f20676u, null, false);
                                if (b10 == null) {
                                    b10 = e11;
                                }
                                if (b10.O0().a() instanceof c0.b) {
                                    arrayList3.add(jVar);
                                }
                                x0 O0 = b10.O0();
                                if (i0Var != null) {
                                    x0Var = i0Var.O0();
                                } else {
                                    x0Var = null;
                                }
                                if (!kotlin.jvm.internal.i.b(O0, x0Var) && !dt.j.y(b10)) {
                                    arrayList2.add(b10);
                                }
                                fVar = fVar3;
                                kVar = null;
                            }
                            q.f fVar4 = fVar;
                            eVar = eVar3.D;
                            if (eVar != null) {
                                b0Var = j1.e(sp.b.l(eVar, eVar3)).k(eVar.r(), n1Var);
                            } else {
                                b0Var = null;
                            }
                            ca.a.g(b0Var, arrayList2);
                            ca.a.g(i0Var, arrayList2);
                            if (!arrayList3.isEmpty()) {
                                su.t tVar = ((st.c) fVar4.f29104v).f;
                                ArrayList arrayList5 = new ArrayList(is.i.H1(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    wt.w wVar = (wt.w) it2.next();
                                    kotlin.jvm.internal.i.e(wVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                                    arrayList5.add(((wt.j) wVar).q());
                                }
                                tVar.b(eVar3, arrayList5);
                            }
                            if (!arrayList2.isEmpty()) {
                                return is.u.I2(arrayList2);
                            }
                            return ca.a.O0(fVar4.a().o().f());
                        }
                        i0Var = null;
                        while (r2.hasNext()) {
                        }
                        q.f fVar42 = fVar;
                        eVar = eVar3.D;
                        if (eVar != null) {
                        }
                        ca.a.g(b0Var, arrayList2);
                        ca.a.g(i0Var, arrayList2);
                        if (!arrayList3.isEmpty()) {
                        }
                        if (!arrayList2.isEmpty()) {
                        }
                    }
                }
            }
            cVar = null;
            if (cVar != null) {
            }
            cVar = null;
            n1 n1Var2 = n1.INVARIANT;
            q.f fVar5 = eVar3.E;
            if (cVar != null) {
            }
            a0 a102 = fVar5.a();
            ot.c cVar32 = ot.c.FROM_JAVA_LOADER;
            int i112 = mu.a.f25746a;
            kotlin.jvm.internal.i.g(a102, "<this>");
            cVar2.d();
            fu.c e102 = cVar2.e();
            kotlin.jvm.internal.i.f(e102, "topLevelClassFqName.parent()");
            pu.i p102 = a102.H(e102).p();
            fu.e f2 = cVar2.f();
            kotlin.jvm.internal.i.f(f2, "topLevelClassFqName.shortName()");
            g5 = p102.g(f2, cVar32);
            if (!(g5 instanceof gt.e)) {
            }
            if (eVar2 != null) {
            }
            i0Var = null;
            while (r2.hasNext()) {
            }
            q.f fVar422 = fVar5;
            eVar = eVar3.D;
            if (eVar != null) {
            }
            ca.a.g(b0Var, arrayList2);
            ca.a.g(i0Var, arrayList2);
            if (!arrayList3.isEmpty()) {
            }
            if (!arrayList2.isEmpty()) {
            }
        }

        @Override // wu.x0
        public final List<v0> getParameters() {
            return this.f33617c.invoke();
        }

        @Override // wu.f
        public final t0 j() {
            return ((st.c) e.this.E.f29104v).f31945m;
        }

        @Override // wu.b
        public final gt.e p() {
            return e.this;
        }

        public final String toString() {
            String f = e.this.getName().f();
            kotlin.jvm.internal.i.f(f, "name.asString()");
            return f;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<List<? extends v0>> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final List<? extends v0> invoke() {
            e eVar = e.this;
            ArrayList<wt.x> typeParameters = eVar.C.getTypeParameters();
            ArrayList arrayList = new ArrayList(is.i.H1(typeParameters, 10));
            for (wt.x xVar : typeParameters) {
                v0 a10 = ((st.j) eVar.E.f29105w).a(xVar);
                if (a10 != null) {
                    arrayList.add(a10);
                } else {
                    throw new AssertionError("Parameter " + xVar + " surely belongs to class " + eVar.C + ", so it must be resolved");
                }
            }
            return arrayList;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return sp.b.g(mu.a.g((gt.e) t3).b(), mu.a.g((gt.e) t10).b());
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<List<? extends wt.a>> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final List<? extends wt.a> invoke() {
            e eVar = e.this;
            fu.b f = mu.a.f(eVar);
            if (f != null) {
                ((st.c) eVar.B.f29104v).f31954w.a(f);
                return null;
            }
            return null;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: tt.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0561e extends kotlin.jvm.internal.k implements ss.l<xu.e, k> {
        public C0561e() {
            super(1);
        }

        @Override // ss.l
        public final k invoke(xu.e eVar) {
            boolean z10;
            xu.e it = eVar;
            kotlin.jvm.internal.i.g(it, "it");
            e eVar2 = e.this;
            q.f fVar = eVar2.E;
            wt.g gVar = eVar2.C;
            if (eVar2.D != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new k(fVar, eVar2, gVar, z10, eVar2.L);
        }
    }

    static {
        ca.a.m1("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q.f outerContext, gt.j containingDeclaration, wt.g jClass, gt.e eVar) {
        super(outerContext.b(), containingDeclaration, jClass.getName(), ((st.c) outerContext.f29104v).f31942j.a(jClass));
        int i6;
        boolean z10;
        boolean z11;
        boolean z12;
        gt.z zVar;
        kotlin.jvm.internal.i.g(outerContext, "outerContext");
        kotlin.jvm.internal.i.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.i.g(jClass, "jClass");
        this.B = outerContext;
        this.C = jClass;
        this.D = eVar;
        q.f a10 = st.b.a(outerContext, this, jClass, 4);
        this.E = a10;
        st.c cVar = (st.c) a10.f29104v;
        ((h.a) cVar.f31939g).getClass();
        jClass.J();
        this.F = sp.b.O(new d());
        if (jClass.r()) {
            i6 = 5;
        } else if (jClass.I()) {
            i6 = 2;
        } else if (jClass.D()) {
            i6 = 3;
        } else {
            i6 = 1;
        }
        this.G = i6;
        boolean r = jClass.r();
        gt.z zVar2 = gt.z.FINAL;
        if (!r && !jClass.D()) {
            boolean F = jClass.F();
            if (!jClass.F() && !jClass.isAbstract() && !jClass.I()) {
                z12 = false;
            } else {
                z12 = true;
            }
            boolean z13 = !jClass.isFinal();
            if (F) {
                zVar = gt.z.SEALED;
            } else if (z12) {
                zVar = gt.z.ABSTRACT;
            } else if (z13) {
                zVar = gt.z.OPEN;
            }
            zVar2 = zVar;
        }
        this.H = zVar2;
        this.I = jClass.getVisibility();
        if (jClass.s() != null && !jClass.j()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.J = z10;
        this.K = new a();
        if (eVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        k kVar = new k(a10, this, jClass, z11, null);
        this.L = kVar;
        o0.a aVar = o0.f16794e;
        vu.l b10 = a10.b();
        xu.e b11 = cVar.f31952u.b();
        C0561e c0561e = new C0561e();
        aVar.getClass();
        this.M = o0.a.a(c0561e, this, b10, b11);
        this.N = new pu.g(kVar);
        this.O = new x(a10, jClass, this);
        this.P = sp.b.U(a10, jClass);
        this.Q = a10.b().e(new b());
    }

    @Override // kt.b, gt.e
    public final pu.i A0() {
        return this.N;
    }

    @Override // gt.e
    public final boolean B() {
        return false;
    }

    @Override // gt.e
    public final gt.x0<i0> B0() {
        return null;
    }

    @Override // kt.b0
    public final pu.i C0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.M.a(kotlinTypeRefiner);
    }

    @Override // gt.y
    public final boolean H0() {
        return false;
    }

    @Override // gt.e
    public final Collection<gt.e> K() {
        gt.e eVar;
        if (this.H == gt.z.SEALED) {
            ut.a u12 = ca.a.u1(2, false, false, null, 7);
            Collection<wt.j> N = this.C.N();
            ArrayList arrayList = new ArrayList();
            for (wt.j jVar : N) {
                gt.g a10 = ((ut.c) this.E.f29108z).e(jVar, u12).O0().a();
                if (a10 instanceof gt.e) {
                    eVar = (gt.e) a10;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    arrayList.add(eVar);
                }
            }
            return is.u.D2(arrayList, new c());
        }
        return is.w.f20676u;
    }

    @Override // gt.e
    public final boolean K0() {
        return false;
    }

    @Override // gt.e
    public final boolean L() {
        return false;
    }

    @Override // gt.y
    public final boolean M() {
        return false;
    }

    @Override // kt.b, gt.e
    /* renamed from: M0 */
    public final k G0() {
        pu.i G0 = super.G0();
        kotlin.jvm.internal.i.e(G0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (k) G0;
    }

    @Override // gt.h
    public final boolean N() {
        return this.J;
    }

    @Override // gt.e
    public final gt.d R() {
        return null;
    }

    @Override // gt.e
    public final pu.i S() {
        return this.O;
    }

    @Override // gt.e
    public final gt.e U() {
        return null;
    }

    @Override // ht.a
    public final ht.h getAnnotations() {
        return this.P;
    }

    @Override // gt.e, gt.n, gt.y
    public final gt.q getVisibility() {
        p.d dVar = gt.p.f16800a;
        c1 c1Var = this.I;
        if (kotlin.jvm.internal.i.b(c1Var, dVar) && this.C.s() == null) {
            t.a aVar = pt.t.f28954a;
            kotlin.jvm.internal.i.f(aVar, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
            return aVar;
        }
        return kotlin.jvm.internal.h.i0(c1Var);
    }

    @Override // gt.e
    public final boolean isInline() {
        return false;
    }

    @Override // gt.e
    public final int j() {
        return this.G;
    }

    @Override // gt.g
    public final x0 l() {
        return this.K;
    }

    @Override // gt.e, gt.y
    public final gt.z m() {
        return this.H;
    }

    @Override // gt.e, gt.h
    public final List<v0> t() {
        return this.Q.invoke();
    }

    public final String toString() {
        return "Lazy Java class " + mu.a.h(this);
    }

    @Override // gt.e
    public final boolean w() {
        return false;
    }

    @Override // gt.e
    public final Collection y() {
        return this.L.f33629q.invoke();
    }
}
