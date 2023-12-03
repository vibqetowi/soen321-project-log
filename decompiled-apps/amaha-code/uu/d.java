package uu;

import au.b;
import au.p;
import au.q;
import au.r;
import cu.f;
import gt.c0;
import gt.d0;
import gt.k0;
import gt.n0;
import gt.o0;
import gt.p0;
import gt.q0;
import gt.t0;
import gt.v0;
import gt.w0;
import gt.x0;
import gt.z;
import gt.z0;
import ht.h;
import is.h0;
import is.u;
import is.w;
import iu.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kt.s;
import pu.i;
import pu.k;
import su.f0;
import su.g0;
import su.j0;
import su.t;
import su.y;
import ta.v;
import wu.b0;
import wu.i0;
/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes2.dex */
public final class d extends kt.b implements gt.j {
    public final q0 A;
    public final fu.b B;
    public final z C;
    public final gt.o D;
    public final int E;
    public final j7.k F;
    public final pu.j G;
    public final b H;
    public final o0<a> I;
    public final c J;
    public final gt.j K;
    public final vu.j<gt.d> L;
    public final vu.i<Collection<gt.d>> M;
    public final vu.j<gt.e> N;
    public final vu.i<Collection<gt.e>> O;
    public final vu.j<x0<i0>> P;
    public final f0.a Q;
    public final ht.h R;

    /* renamed from: y  reason: collision with root package name */
    public final au.b f34533y;

    /* renamed from: z  reason: collision with root package name */
    public final cu.a f34534z;

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public final class a extends uu.i {

        /* renamed from: g  reason: collision with root package name */
        public final xu.e f34535g;

        /* renamed from: h  reason: collision with root package name */
        public final vu.i<Collection<gt.j>> f34536h;

        /* renamed from: i  reason: collision with root package name */
        public final vu.i<Collection<b0>> f34537i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ d f34538j;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: uu.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0584a extends kotlin.jvm.internal.k implements ss.a<List<? extends fu.e>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ List<fu.e> f34539u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0584a(ArrayList arrayList) {
                super(0);
                this.f34539u = arrayList;
            }

            @Override // ss.a
            public final List<? extends fu.e> invoke() {
                return this.f34539u;
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes2.dex */
        public static final class b extends kotlin.jvm.internal.k implements ss.a<Collection<? extends gt.j>> {
            public b() {
                super(0);
            }

            @Override // ss.a
            public final Collection<? extends gt.j> invoke() {
                pu.d dVar = pu.d.f28985m;
                pu.i.f29004a.getClass();
                return a.this.i(dVar, i.a.f29006b);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes2.dex */
        public static final class c extends kotlin.jvm.internal.k implements ss.a<Collection<? extends b0>> {
            public c() {
                super(0);
            }

            @Override // ss.a
            public final Collection<? extends b0> invoke() {
                a aVar = a.this;
                return aVar.f34535g.G(aVar.f34538j);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(d dVar, xu.e kotlinTypeRefiner) {
            super(r2, r3, r4, r5, new C0584a(r1));
            kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f34538j = dVar;
            j7.k kVar = dVar.F;
            au.b bVar = dVar.f34533y;
            List<au.h> list = bVar.K;
            kotlin.jvm.internal.i.f(list, "classProto.functionList");
            List<au.m> list2 = bVar.L;
            kotlin.jvm.internal.i.f(list2, "classProto.propertyList");
            List<q> list3 = bVar.M;
            kotlin.jvm.internal.i.f(list3, "classProto.typeAliasList");
            List<Integer> list4 = bVar.E;
            kotlin.jvm.internal.i.f(list4, "classProto.nestedClassNameList");
            cu.c cVar = (cu.c) dVar.F.f21733v;
            ArrayList arrayList = new ArrayList(is.i.H1(list4, 10));
            for (Number number : list4) {
                arrayList.add(v.x(cVar, number.intValue()));
            }
            this.f34535g = kotlinTypeRefiner;
            this.f34536h = this.f34561b.c().e(new b());
            this.f34537i = this.f34561b.c().e(new c());
        }

        @Override // uu.i, pu.j, pu.i
        public final Collection a(fu.e name, ot.c cVar) {
            kotlin.jvm.internal.i.g(name, "name");
            t(name, cVar);
            return super.a(name, cVar);
        }

        @Override // uu.i, pu.j, pu.i
        public final Collection c(fu.e name, ot.c cVar) {
            kotlin.jvm.internal.i.g(name, "name");
            t(name, cVar);
            return super.c(name, cVar);
        }

        @Override // pu.j, pu.k
        public final Collection<gt.j> f(pu.d kindFilter, ss.l<? super fu.e, Boolean> nameFilter) {
            kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
            kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
            return this.f34536h.invoke();
        }

        @Override // uu.i, pu.j, pu.k
        public final gt.g g(fu.e name, ot.c cVar) {
            gt.e invoke;
            kotlin.jvm.internal.i.g(name, "name");
            t(name, cVar);
            c cVar2 = this.f34538j.J;
            if (cVar2 != null && (invoke = cVar2.f34546b.invoke(name)) != null) {
                return invoke;
            }
            return super.g(name, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r1v3, types: [is.w] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        @Override // uu.i
        public final void h(ArrayList arrayList, ss.l nameFilter) {
            ?? r12;
            kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
            c cVar = this.f34538j.J;
            if (cVar != null) {
                Set<fu.e> keySet = cVar.f34545a.keySet();
                r12 = new ArrayList();
                for (fu.e name : keySet) {
                    kotlin.jvm.internal.i.g(name, "name");
                    gt.e invoke = cVar.f34546b.invoke(name);
                    if (invoke != null) {
                        r12.add(invoke);
                    }
                }
            } else {
                r12 = 0;
            }
            if (r12 == 0) {
                r12 = w.f20676u;
            }
            arrayList.addAll(r12);
        }

        @Override // uu.i
        public final void j(fu.e name, ArrayList arrayList) {
            kotlin.jvm.internal.i.g(name, "name");
            ArrayList arrayList2 = new ArrayList();
            for (b0 b0Var : this.f34537i.invoke()) {
                arrayList2.addAll(b0Var.p().a(name, ot.c.FOR_ALREADY_TRACKED));
            }
            arrayList.addAll(((su.l) this.f34561b.f21732u).f32056n.c(name, this.f34538j));
            s(name, arrayList2, arrayList);
        }

        @Override // uu.i
        public final void k(fu.e name, ArrayList arrayList) {
            kotlin.jvm.internal.i.g(name, "name");
            ArrayList arrayList2 = new ArrayList();
            for (b0 b0Var : this.f34537i.invoke()) {
                arrayList2.addAll(b0Var.p().c(name, ot.c.FOR_ALREADY_TRACKED));
            }
            s(name, arrayList2, arrayList);
        }

        @Override // uu.i
        public final fu.b l(fu.e name) {
            kotlin.jvm.internal.i.g(name, "name");
            return this.f34538j.B.d(name);
        }

        @Override // uu.i
        public final Set<fu.e> n() {
            List<b0> c10 = this.f34538j.H.c();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (b0 b0Var : c10) {
                Set<fu.e> e10 = b0Var.p().e();
                if (e10 == null) {
                    return null;
                }
                is.q.R1(e10, linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // uu.i
        public final Set<fu.e> o() {
            d dVar = this.f34538j;
            List<b0> c10 = dVar.H.c();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (b0 b0Var : c10) {
                is.q.R1(b0Var.p().b(), linkedHashSet);
            }
            linkedHashSet.addAll(((su.l) this.f34561b.f21732u).f32056n.e(dVar));
            return linkedHashSet;
        }

        @Override // uu.i
        public final Set<fu.e> p() {
            List<b0> c10 = this.f34538j.H.c();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (b0 b0Var : c10) {
                is.q.R1(b0Var.p().d(), linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // uu.i
        public final boolean r(l lVar) {
            return ((su.l) this.f34561b.f21732u).f32057o.d(this.f34538j, lVar);
        }

        public final void s(fu.e eVar, ArrayList arrayList, ArrayList arrayList2) {
            ((su.l) this.f34561b.f21732u).f32059q.a().h(eVar, arrayList, new ArrayList(arrayList2), this.f34538j, new uu.e(arrayList2));
        }

        public final void t(fu.e name, ot.a aVar) {
            kotlin.jvm.internal.i.g(name, "name");
            kotlin.jvm.internal.h.X(((su.l) this.f34561b.f21732u).f32051i, (ot.c) aVar, this.f34538j, name);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public final class b extends wu.b {

        /* renamed from: c  reason: collision with root package name */
        public final vu.i<List<v0>> f34542c;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.a<List<? extends v0>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ d f34544u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(0);
                this.f34544u = dVar;
            }

            @Override // ss.a
            public final List<? extends v0> invoke() {
                return w0.b(this.f34544u);
            }
        }

        public b() {
            super(d.this.F.c());
            this.f34542c = d.this.F.c().e(new a(d.this));
        }

        @Override // wu.b, wu.l, wu.x0
        public final gt.g a() {
            return d.this;
        }

        @Override // wu.x0
        public final boolean d() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v16 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable] */
        @Override // wu.f
        public final Collection<b0> g() {
            String f;
            fu.c b10;
            c0.b bVar;
            d dVar = d.this;
            au.b bVar2 = dVar.f34533y;
            j7.k kVar = dVar.F;
            cu.e typeTable = (cu.e) kVar.f21735x;
            kotlin.jvm.internal.i.g(bVar2, "<this>");
            kotlin.jvm.internal.i.g(typeTable, "typeTable");
            List<p> list = bVar2.B;
            boolean z10 = !list.isEmpty();
            ?? r42 = list;
            if (!z10) {
                r42 = 0;
            }
            if (r42 == 0) {
                List<Integer> supertypeIdList = bVar2.C;
                kotlin.jvm.internal.i.f(supertypeIdList, "supertypeIdList");
                r42 = new ArrayList(is.i.H1(supertypeIdList, 10));
                for (Integer it : supertypeIdList) {
                    kotlin.jvm.internal.i.f(it, "it");
                    r42.add(typeTable.a(it.intValue()));
                }
            }
            ArrayList arrayList = new ArrayList(is.i.H1(r42, 10));
            for (p pVar : r42) {
                arrayList.add(((j0) kVar.B).g(pVar));
            }
            ArrayList u22 = u.u2(((su.l) kVar.f21732u).f32056n.b(dVar), arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = u22.iterator();
            while (it2.hasNext()) {
                gt.g a10 = ((b0) it2.next()).O0().a();
                if (a10 instanceof c0.b) {
                    bVar = (c0.b) a10;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                t tVar = ((su.l) kVar.f21732u).f32050h;
                ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    c0.b bVar3 = (c0.b) it3.next();
                    fu.b f2 = mu.a.f(bVar3);
                    if (f2 != null && (b10 = f2.b()) != null) {
                        f = b10.b();
                    } else {
                        f = bVar3.getName().f();
                    }
                    arrayList3.add(f);
                }
                tVar.b(dVar, arrayList3);
            }
            return u.I2(u22);
        }

        @Override // wu.x0
        public final List<v0> getParameters() {
            return this.f34542c.invoke();
        }

        @Override // wu.f
        public final t0 j() {
            return t0.a.f16820a;
        }

        @Override // wu.b
        public final gt.e p() {
            return d.this;
        }

        public final String toString() {
            String str = d.this.getName().f15930u;
            kotlin.jvm.internal.i.f(str, "name.toString()");
            return str;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap f34545a;

        /* renamed from: b  reason: collision with root package name */
        public final vu.h<fu.e, gt.e> f34546b;

        /* renamed from: c  reason: collision with root package name */
        public final vu.i<Set<fu.e>> f34547c;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.l<fu.e, gt.e> {

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f34550v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.f34550v = dVar;
            }

            @Override // ss.l
            public final gt.e invoke(fu.e eVar) {
                fu.e name = eVar;
                kotlin.jvm.internal.i.g(name, "name");
                c cVar = c.this;
                au.f fVar = (au.f) cVar.f34545a.get(name);
                if (fVar != null) {
                    d dVar = this.f34550v;
                    return s.M0(dVar.F.c(), dVar, name, cVar.f34547c, new uu.a(dVar.F.c(), new uu.f(dVar, fVar)), q0.f16815a);
                }
                return null;
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes2.dex */
        public static final class b extends kotlin.jvm.internal.k implements ss.a<Set<? extends fu.e>> {
            public b() {
                super(0);
            }

            @Override // ss.a
            public final Set<? extends fu.e> invoke() {
                j7.k kVar;
                c cVar = c.this;
                cVar.getClass();
                HashSet hashSet = new HashSet();
                d dVar = d.this;
                for (b0 b0Var : dVar.H.c()) {
                    for (gt.j jVar : k.a.a(b0Var.p(), null, 3)) {
                        if ((jVar instanceof p0) || (jVar instanceof k0)) {
                            hashSet.add(jVar.getName());
                        }
                    }
                }
                au.b bVar = dVar.f34533y;
                List<au.h> list = bVar.K;
                kotlin.jvm.internal.i.f(list, "classProto.functionList");
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    kVar = dVar.F;
                    if (!hasNext) {
                        break;
                    }
                    hashSet.add(v.x((cu.c) kVar.f21733v, ((au.h) it.next()).f3743z));
                }
                List<au.m> list2 = bVar.L;
                kotlin.jvm.internal.i.f(list2, "classProto.propertyList");
                for (au.m mVar : list2) {
                    hashSet.add(v.x((cu.c) kVar.f21733v, mVar.f3771z));
                }
                return h0.I1(hashSet, hashSet);
            }
        }

        public c() {
            List<au.f> list = d.this.f34533y.N;
            kotlin.jvm.internal.i.f(list, "classProto.enumEntryList");
            int P = sp.b.P(is.i.H1(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(P < 16 ? 16 : P);
            for (Object obj : list) {
                linkedHashMap.put(v.x((cu.c) d.this.F.f21733v, ((au.f) obj).f3718x), obj);
            }
            this.f34545a = linkedHashMap;
            this.f34546b = d.this.F.c().b(new a(d.this));
            this.f34547c = d.this.F.c().e(new b());
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: uu.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0585d extends kotlin.jvm.internal.k implements ss.a<List<? extends ht.c>> {
        public C0585d() {
            super(0);
        }

        @Override // ss.a
        public final List<? extends ht.c> invoke() {
            d dVar = d.this;
            return u.I2(((su.l) dVar.F.f21732u).f32048e.a(dVar.Q));
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<gt.e> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final gt.e invoke() {
            boolean z10;
            d dVar = d.this;
            au.b bVar = dVar.f34533y;
            if ((bVar.f3666w & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                gt.g g5 = dVar.M0().g(v.x((cu.c) dVar.F.f21733v, bVar.f3669z), ot.c.FROM_DESERIALIZATION);
                if (g5 instanceof gt.e) {
                    return (gt.e) g5;
                }
            }
            return null;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<Collection<? extends gt.d>> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final Collection<? extends gt.d> invoke() {
            d dVar = d.this;
            List<au.c> list = dVar.f34533y.J;
            kotlin.jvm.internal.i.f(list, "classProto.constructorList");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (ri.e.g(cu.b.f12030m, ((au.c) obj).f3681x, "IS_SECONDARY.get(it.flags)")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j7.k kVar = dVar.F;
                if (hasNext) {
                    au.c it2 = (au.c) it.next();
                    kotlin.jvm.internal.i.f(it2, "it");
                    arrayList2.add(((y) kVar.C).d(it2, false));
                } else {
                    return u.u2(((su.l) kVar.f21732u).f32056n.a(dVar), u.u2(ca.a.Q0(dVar.R()), arrayList2));
                }
            }
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class g extends kotlin.jvm.internal.f implements ss.l<xu.e, a> {
        public g(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.a, ys.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.a
        public final ys.f getOwner() {
            return kotlin.jvm.internal.y.a(a.class);
        }

        @Override // kotlin.jvm.internal.a
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        @Override // ss.l
        public final a invoke(xu.e eVar) {
            xu.e p02 = eVar;
            kotlin.jvm.internal.i.g(p02, "p0");
            return new a((d) this.receiver, p02);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<gt.d> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final gt.d invoke() {
            Object obj;
            d dVar = d.this;
            if (defpackage.e.b(dVar.E)) {
                f.a aVar = new f.a(dVar);
                aVar.U0(dVar.r());
                return aVar;
            }
            List<au.c> list = dVar.f34533y.J;
            kotlin.jvm.internal.i.f(list, "classProto.constructorList");
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (!cu.b.f12030m.c(((au.c) obj).f3681x).booleanValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            au.c cVar = (au.c) obj;
            if (cVar == null) {
                return null;
            }
            return ((y) dVar.F.C).d(cVar, true);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<Collection<? extends gt.e>> {
        public i() {
            super(0);
        }

        @Override // ss.a
        public final Collection<? extends gt.e> invoke() {
            z zVar = z.SEALED;
            w wVar = w.f20676u;
            d dVar = d.this;
            if (dVar.C == zVar) {
                List<Integer> fqNames = dVar.f34533y.O;
                kotlin.jvm.internal.i.f(fqNames, "fqNames");
                if (!fqNames.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Integer index : fqNames) {
                        j7.k kVar = dVar.F;
                        kotlin.jvm.internal.i.f(index, "index");
                        gt.e b10 = ((su.l) kVar.f21732u).b(v.w((cu.c) kVar.f21733v, index.intValue()));
                        if (b10 != null) {
                            arrayList.add(b10);
                        }
                    }
                    return arrayList;
                } else if (dVar.C == zVar) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    gt.j jVar = dVar.K;
                    if (jVar instanceof d0) {
                        iu.b.J(dVar, linkedHashSet, ((d0) jVar).p(), false);
                    }
                    pu.i A0 = dVar.A0();
                    kotlin.jvm.internal.i.f(A0, "sealedClass.unsubstitutedInnerClassesScope");
                    iu.b.J(dVar, linkedHashSet, A0, true);
                    return u.D2(linkedHashSet, new iu.a());
                } else {
                    return wVar;
                }
            }
            return wVar;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<x0<i0>> {
        public j() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
            if (r6.T.size() > 0) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00eb, code lost:
            if (r9 == false) goto L100;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00ed, code lost:
            r10 = null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0121 A[LOOP:0: B:72:0x0119->B:74:0x0121, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0147  */
        /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<au.p>] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
        @Override // ss.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final x0<i0> invoke() {
            boolean z10;
            fu.e name;
            boolean z11;
            boolean z12;
            p pVar;
            i0 i0Var;
            boolean z13;
            gt.v vVar;
            boolean z14;
            boolean z15;
            boolean z16;
            ArrayList arrayList;
            ?? r42;
            d dVar = d.this;
            boolean isInline = dVar.isInline();
            j7.k kVar = dVar.F;
            au.b bVar = dVar.f34533y;
            gt.b0 b0Var = null;
            if (isInline || dVar.L()) {
                if (dVar.L()) {
                    int i6 = bVar.f3666w;
                    if ((i6 & 8) == 8) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        if ((i6 & 16) == 16) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (!z15) {
                            if ((i6 & 32) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (!z16) {
                            }
                        }
                    }
                }
                if ((bVar.f3666w & 8) == 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    name = v.x((cu.c) kVar.f21733v, bVar.Q);
                } else if (!dVar.f34534z.a(1, 5, 1)) {
                    gt.d R = dVar.R();
                    if (R != null) {
                        List<z0> i10 = R.i();
                        kotlin.jvm.internal.i.f(i10, "constructor.valueParameters");
                        name = ((z0) u.g2(i10)).getName();
                        kotlin.jvm.internal.i.f(name, "{\n                // Bef…irst().name\n            }");
                    } else {
                        throw new IllegalStateException(("Inline class has no primary constructor: " + dVar).toString());
                    }
                } else {
                    throw new IllegalStateException(("Inline class has no underlying property name in metadata: " + dVar).toString());
                }
                cu.e typeTable = (cu.e) kVar.f21735x;
                kotlin.jvm.internal.i.g(typeTable, "typeTable");
                int i11 = bVar.f3666w;
                if ((i11 & 16) == 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    pVar = bVar.R;
                } else {
                    if ((i11 & 32) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        pVar = typeTable.a(bVar.S);
                    } else {
                        pVar = null;
                    }
                }
                if (pVar == null || (i0Var = ((j0) kVar.B).d(pVar, true)) == null) {
                    Iterator it = dVar.M0().c(name, ot.c.FROM_DESERIALIZATION).iterator();
                    k0 k0Var = null;
                    boolean z17 = false;
                    while (true) {
                        if (it.hasNext()) {
                            ?? next = it.next();
                            if (((k0) next).k0() == null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (z17) {
                                    break;
                                }
                                k0Var = next;
                                z17 = true;
                            }
                        }
                    }
                    k0 k0Var2 = k0Var;
                    if (k0Var2 != null) {
                        b0 a10 = k0Var2.a();
                        kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
                        i0Var = (i0) a10;
                    } else {
                        throw new IllegalStateException(("Value class has no underlying property: " + dVar).toString());
                    }
                }
                vVar = new gt.v(name, i0Var);
                List<Integer> list = bVar.T;
                kotlin.jvm.internal.i.f(list, "classProto.multiFieldValueClassUnderlyingNameList");
                arrayList = new ArrayList(is.i.H1(list, 10));
                for (Integer it2 : list) {
                    kotlin.jvm.internal.i.f(it2, "it");
                    arrayList.add(v.x((cu.c) kVar.f21733v, it2.intValue()));
                }
                if (!(!arrayList.isEmpty())) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    if (dVar.L()) {
                        hs.f fVar = new hs.f(Integer.valueOf(bVar.W.size()), Integer.valueOf(bVar.V.size()));
                        if (kotlin.jvm.internal.i.b(fVar, new hs.f(Integer.valueOf(arrayList.size()), 0))) {
                            List<Integer> list2 = bVar.W;
                            kotlin.jvm.internal.i.f(list2, "classProto.multiFieldVal…ClassUnderlyingTypeIdList");
                            r42 = new ArrayList(is.i.H1(list2, 10));
                            for (Integer it3 : list2) {
                                kotlin.jvm.internal.i.f(it3, "it");
                                r42.add(((cu.e) kVar.f21735x).a(it3.intValue()));
                            }
                        } else if (kotlin.jvm.internal.i.b(fVar, new hs.f(0, Integer.valueOf(arrayList.size())))) {
                            r42 = bVar.V;
                        } else {
                            throw new IllegalStateException(("Illegal multi-field value class representation: " + dVar).toString());
                        }
                        kotlin.jvm.internal.i.f(r42, "when (typeIdCount to typ…tation: $this\")\n        }");
                        ArrayList arrayList2 = new ArrayList(is.i.H1(r42, 10));
                        for (p it4 : r42) {
                            kotlin.jvm.internal.i.f(it4, "it");
                            arrayList2.add(((j0) kVar.B).d(it4, true));
                        }
                        b0Var = new gt.b0(u.O2(arrayList, arrayList2));
                    } else {
                        throw new IllegalArgumentException(("Not a value class: " + dVar).toString());
                    }
                }
                if (vVar == null && b0Var != null) {
                    throw new IllegalArgumentException("Class cannot have both inline class representation and multi field class representation: " + dVar);
                } else if ((!dVar.L() || dVar.isInline()) && vVar == null && b0Var == null) {
                    throw new IllegalArgumentException("Value class has no value class representation: " + dVar);
                } else if (vVar == null) {
                    return b0Var;
                } else {
                    return vVar;
                }
            }
            vVar = null;
            List<Integer> list3 = bVar.T;
            kotlin.jvm.internal.i.f(list3, "classProto.multiFieldValueClassUnderlyingNameList");
            arrayList = new ArrayList(is.i.H1(list3, 10));
            while (r1.hasNext()) {
            }
            if (!(!arrayList.isEmpty())) {
            }
            if (arrayList != null) {
            }
            if (vVar == null) {
            }
            if (!dVar.L()) {
            }
            throw new IllegalArgumentException("Value class has no value class representation: " + dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j7.k outerContext, au.b classProto, cu.c nameResolver, cu.a metadataVersion, q0 sourceElement) {
        super(outerContext.c(), v.w(nameResolver, classProto.f3668y).j());
        int i6;
        int i10;
        pu.j jVar;
        c cVar;
        d dVar;
        ht.h oVar;
        kotlin.jvm.internal.i.g(outerContext, "outerContext");
        kotlin.jvm.internal.i.g(classProto, "classProto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.i.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.i.g(sourceElement, "sourceElement");
        this.f34533y = classProto;
        this.f34534z = metadataVersion;
        this.A = sourceElement;
        this.B = v.w(nameResolver, classProto.f3668y);
        this.C = g0.a((au.j) cu.b.f12023e.c(classProto.f3667x));
        this.D = su.h0.a((au.w) cu.b.f12022d.c(classProto.f3667x));
        b.c cVar2 = (b.c) cu.b.f.c(classProto.f3667x);
        if (cVar2 == null) {
            i6 = -1;
        } else {
            i6 = g0.a.f32015b[cVar2.ordinal()];
        }
        switch (i6) {
            case 2:
                i10 = 2;
                break;
            case 3:
                i10 = 3;
                break;
            case 4:
                i10 = 4;
                break;
            case 5:
                i10 = 5;
                break;
            case 6:
            case 7:
                i10 = 6;
                break;
            default:
                i10 = 1;
                break;
        }
        this.E = i10;
        List<r> list = classProto.A;
        kotlin.jvm.internal.i.f(list, "classProto.typeParameterList");
        au.s sVar = classProto.Y;
        kotlin.jvm.internal.i.f(sVar, "classProto.typeTable");
        cu.e eVar = new cu.e(sVar);
        cu.f fVar = cu.f.f12049b;
        au.v vVar = classProto.f3663a0;
        kotlin.jvm.internal.i.f(vVar, "classProto.versionRequirementTable");
        j7.k a10 = outerContext.a(this, list, nameResolver, eVar, f.a.a(vVar), metadataVersion);
        this.F = a10;
        if (i10 == 3) {
            jVar = new pu.l(a10.c(), this);
        } else {
            jVar = i.b.f29008b;
        }
        this.G = jVar;
        this.H = new b();
        o0.a aVar = o0.f16794e;
        vu.l c10 = a10.c();
        xu.e b10 = ((su.l) a10.f21732u).f32059q.b();
        g gVar = new g(this);
        aVar.getClass();
        this.I = o0.a.a(gVar, this, c10, b10);
        if (i10 == 3) {
            cVar = new c();
        } else {
            cVar = null;
        }
        this.J = cVar;
        gt.j jVar2 = (gt.j) outerContext.f21734w;
        this.K = jVar2;
        this.L = a10.c().f(new h());
        this.M = a10.c().e(new f());
        this.N = a10.c().f(new e());
        this.O = a10.c().e(new i());
        this.P = a10.c().f(new j());
        cu.c cVar3 = (cu.c) a10.f21733v;
        cu.e eVar2 = (cu.e) a10.f21735x;
        if (jVar2 instanceof d) {
            dVar = (d) jVar2;
        } else {
            dVar = null;
        }
        this.Q = new f0.a(classProto, cVar3, eVar2, sourceElement, dVar != null ? dVar.Q : null);
        if (!cu.b.f12021c.c(classProto.f3667x).booleanValue()) {
            oVar = h.a.f19495a;
        } else {
            oVar = new o(a10.c(), new C0585d());
        }
        this.R = oVar;
    }

    @Override // gt.e
    public final boolean B() {
        return ri.e.g(cu.b.f12029l, this.f34533y.f3667x, "IS_FUN_INTERFACE.get(classProto.flags)");
    }

    @Override // gt.e
    public final x0<i0> B0() {
        return this.P.invoke();
    }

    @Override // kt.b0
    public final pu.i C0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.I.a(kotlinTypeRefiner);
    }

    @Override // gt.y
    public final boolean H0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable] */
    @Override // kt.b, gt.e
    public final List<n0> J0() {
        j7.k kVar = this.F;
        cu.e typeTable = (cu.e) kVar.f21735x;
        au.b bVar = this.f34533y;
        kotlin.jvm.internal.i.g(bVar, "<this>");
        kotlin.jvm.internal.i.g(typeTable, "typeTable");
        List<p> list = bVar.G;
        boolean z10 = !list.isEmpty();
        ?? r32 = list;
        if (!z10) {
            r32 = 0;
        }
        if (r32 == 0) {
            List<Integer> contextReceiverTypeIdList = bVar.H;
            kotlin.jvm.internal.i.f(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            r32 = new ArrayList(is.i.H1(contextReceiverTypeIdList, 10));
            for (Integer it : contextReceiverTypeIdList) {
                kotlin.jvm.internal.i.f(it, "it");
                r32.add(typeTable.a(it.intValue()));
            }
        }
        ArrayList arrayList = new ArrayList(is.i.H1(r32, 10));
        for (p pVar : r32) {
            arrayList.add(new kt.o0(L0(), new qu.b(this, ((j0) kVar.B).g(pVar)), h.a.f19495a));
        }
        return arrayList;
    }

    @Override // gt.e
    public final Collection<gt.e> K() {
        return this.O.invoke();
    }

    @Override // gt.e
    public final boolean K0() {
        return ri.e.g(cu.b.f12025h, this.f34533y.f3667x, "IS_DATA.get(classProto.flags)");
    }

    @Override // gt.e
    public final boolean L() {
        if (ri.e.g(cu.b.f12028k, this.f34533y.f3667x, "IS_VALUE_CLASS.get(classProto.flags)") && this.f34534z.a(1, 4, 2)) {
            return true;
        }
        return false;
    }

    @Override // gt.y
    public final boolean M() {
        return ri.e.g(cu.b.f12027j, this.f34533y.f3667x, "IS_EXPECT_CLASS.get(classProto.flags)");
    }

    public final a M0() {
        return this.I.a(((su.l) this.F.f21732u).f32059q.b());
    }

    @Override // gt.h
    public final boolean N() {
        return ri.e.g(cu.b.f12024g, this.f34533y.f3667x, "IS_INNER.get(classProto.flags)");
    }

    @Override // gt.e
    public final gt.d R() {
        return this.L.invoke();
    }

    @Override // gt.e
    public final pu.i S() {
        return this.G;
    }

    @Override // gt.e
    public final gt.e U() {
        return this.N.invoke();
    }

    @Override // gt.e, gt.k, gt.j
    public final gt.j c() {
        return this.K;
    }

    @Override // gt.m
    public final q0 g() {
        return this.A;
    }

    @Override // ht.a
    public final ht.h getAnnotations() {
        return this.R;
    }

    @Override // gt.e, gt.n, gt.y
    public final gt.q getVisibility() {
        return this.D;
    }

    @Override // gt.y
    public final boolean isExternal() {
        return ri.e.g(cu.b.f12026i, this.f34533y.f3667x, "IS_EXTERNAL_CLASS.get(classProto.flags)");
    }

    @Override // gt.e
    public final boolean isInline() {
        boolean z10;
        int i6;
        if (!ri.e.g(cu.b.f12028k, this.f34533y.f3667x, "IS_VALUE_CLASS.get(classProto.flags)")) {
            return false;
        }
        cu.a aVar = this.f34534z;
        int i10 = aVar.f12015b;
        if (i10 < 1 || (i10 <= 1 && ((i6 = aVar.f12016c) < 4 || (i6 <= 4 && aVar.f12017d <= 1)))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // gt.e
    public final int j() {
        return this.E;
    }

    @Override // gt.g
    public final wu.x0 l() {
        return this.H;
    }

    @Override // gt.e, gt.y
    public final z m() {
        return this.C;
    }

    @Override // gt.e, gt.h
    public final List<v0> t() {
        return ((j0) this.F.B).b();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("deserialized ");
        if (M()) {
            str = "expect ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // gt.e
    public final boolean w() {
        if (cu.b.f.c(this.f34533y.f3667x) == b.c.COMPANION_OBJECT) {
            return true;
        }
        return false;
    }

    @Override // gt.e
    public final Collection<gt.d> y() {
        return this.M.invoke();
    }
}
