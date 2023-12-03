package at;

import at.d;
import at.n0;
import du.a;
import eu.d;
import gt.b;
import gv.d;
import ht.h;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import ys.h;
/* compiled from: KPropertyImpl.kt */
/* loaded from: classes2.dex */
public abstract class g0<V> extends at.e<V> implements ys.m<V> {
    public static final Object E = new Object();
    public final String A;
    public final Object B;
    public final n0.b<Field> C;
    public final n0.a<gt.k0> D;

    /* renamed from: y  reason: collision with root package name */
    public final o f3507y;

    /* renamed from: z  reason: collision with root package name */
    public final String f3508z;

    /* compiled from: KPropertyImpl.kt */
    /* loaded from: classes2.dex */
    public static abstract class a<PropertyType, ReturnType> extends at.e<ReturnType> implements ys.g<ReturnType> {
        public abstract g0<PropertyType> A();

        @Override // ys.g
        public final boolean isExternal() {
            return z().isExternal();
        }

        @Override // ys.g
        public final boolean isInfix() {
            return z().isInfix();
        }

        @Override // ys.g
        public final boolean isInline() {
            return z().isInline();
        }

        @Override // ys.g
        public final boolean isOperator() {
            return z().isOperator();
        }

        @Override // ys.c
        public final boolean isSuspend() {
            return z().isSuspend();
        }

        @Override // at.e
        public final o p() {
            return A().f3507y;
        }

        @Override // at.e
        public final bt.e<?> s() {
            return null;
        }

        @Override // at.e
        public final boolean w() {
            return A().w();
        }

        public abstract gt.j0 z();
    }

    /* compiled from: KPropertyImpl.kt */
    /* loaded from: classes2.dex */
    public static abstract class b<V> extends a<V, V> {
        public static final /* synthetic */ ys.m<Object>[] A = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(b.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(b.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: y  reason: collision with root package name */
        public final n0.a f3509y = n0.c(new C0056b(this));

        /* renamed from: z  reason: collision with root package name */
        public final n0.b f3510z = n0.b(new a(this));

        /* compiled from: KPropertyImpl.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.a<bt.e<?>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ b<V> f3511u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? extends V> bVar) {
                super(0);
                this.f3511u = bVar;
            }

            @Override // ss.a
            public final bt.e<?> invoke() {
                return sp.b.b(this.f3511u, true);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        /* renamed from: at.g0$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0056b extends kotlin.jvm.internal.k implements ss.a<gt.l0> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ b<V> f3512u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0056b(b<? extends V> bVar) {
                super(0);
                this.f3512u = bVar;
            }

            @Override // ss.a
            public final gt.l0 invoke() {
                b<V> bVar = this.f3512u;
                kt.m0 n10 = bVar.A().t().n();
                if (n10 == null) {
                    return iu.f.c(bVar.A().t(), h.a.f19495a);
                }
                return n10;
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof b) && kotlin.jvm.internal.i.b(A(), ((b) obj).A())) {
                return true;
            }
            return false;
        }

        @Override // ys.c
        public final String getName() {
            return v.g.c(new StringBuilder("<get-"), A().f3508z, '>');
        }

        public final int hashCode() {
            return A().hashCode();
        }

        @Override // at.e
        public final bt.e<?> o() {
            ys.m<Object> mVar = A[1];
            Object invoke = this.f3510z.invoke();
            kotlin.jvm.internal.i.f(invoke, "<get-caller>(...)");
            return (bt.e) invoke;
        }

        @Override // at.e
        public final gt.b t() {
            ys.m<Object> mVar = A[0];
            Object invoke = this.f3509y.invoke();
            kotlin.jvm.internal.i.f(invoke, "<get-descriptor>(...)");
            return (gt.l0) invoke;
        }

        public final String toString() {
            return "getter of " + A();
        }

        @Override // at.g0.a
        public final gt.j0 z() {
            ys.m<Object> mVar = A[0];
            Object invoke = this.f3509y.invoke();
            kotlin.jvm.internal.i.f(invoke, "<get-descriptor>(...)");
            return (gt.l0) invoke;
        }
    }

    /* compiled from: KPropertyImpl.kt */
    /* loaded from: classes2.dex */
    public static abstract class c<V> extends a<V, hs.k> implements h.a<V> {
        public static final /* synthetic */ ys.m<Object>[] A = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(c.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: y  reason: collision with root package name */
        public final n0.a f3513y = n0.c(new b(this));

        /* renamed from: z  reason: collision with root package name */
        public final n0.b f3514z = n0.b(new a(this));

        /* compiled from: KPropertyImpl.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.a<bt.e<?>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ c<V> f3515u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c<V> cVar) {
                super(0);
                this.f3515u = cVar;
            }

            @Override // ss.a
            public final bt.e<?> invoke() {
                return sp.b.b(this.f3515u, false);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        /* loaded from: classes2.dex */
        public static final class b extends kotlin.jvm.internal.k implements ss.a<gt.m0> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ c<V> f3516u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c<V> cVar) {
                super(0);
                this.f3516u = cVar;
            }

            @Override // ss.a
            public final gt.m0 invoke() {
                c<V> cVar = this.f3516u;
                gt.m0 h10 = cVar.A().t().h();
                if (h10 == null) {
                    return iu.f.d(cVar.A().t(), h.a.f19495a);
                }
                return h10;
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof c) && kotlin.jvm.internal.i.b(A(), ((c) obj).A())) {
                return true;
            }
            return false;
        }

        @Override // ys.c
        public final String getName() {
            return v.g.c(new StringBuilder("<set-"), A().f3508z, '>');
        }

        public final int hashCode() {
            return A().hashCode();
        }

        @Override // at.e
        public final bt.e<?> o() {
            ys.m<Object> mVar = A[1];
            Object invoke = this.f3514z.invoke();
            kotlin.jvm.internal.i.f(invoke, "<get-caller>(...)");
            return (bt.e) invoke;
        }

        @Override // at.e
        public final gt.b t() {
            ys.m<Object> mVar = A[0];
            Object invoke = this.f3513y.invoke();
            kotlin.jvm.internal.i.f(invoke, "<get-descriptor>(...)");
            return (gt.m0) invoke;
        }

        public final String toString() {
            return "setter of " + A();
        }

        @Override // at.g0.a
        public final gt.j0 z() {
            ys.m<Object> mVar = A[0];
            Object invoke = this.f3513y.invoke();
            kotlin.jvm.internal.i.f(invoke, "<get-descriptor>(...)");
            return (gt.m0) invoke;
        }
    }

    /* compiled from: KPropertyImpl.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<gt.k0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ g0<V> f3517u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(g0<? extends V> g0Var) {
            super(0);
            this.f3517u = g0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ss.a
        public final gt.k0 invoke() {
            gv.d dVar;
            String concat;
            g0<V> g0Var = this.f3517u;
            o oVar = g0Var.f3507y;
            oVar.getClass();
            String name = g0Var.f3508z;
            kotlin.jvm.internal.i.g(name, "name");
            String signature = g0Var.A;
            kotlin.jvm.internal.i.g(signature, "signature");
            gv.e eVar = o.f3587u;
            eVar.getClass();
            Matcher matcher = eVar.f16945u.matcher(signature);
            kotlin.jvm.internal.i.f(matcher, "nativePattern.matcher(input)");
            if (!matcher.matches()) {
                dVar = null;
            } else {
                dVar = new gv.d(matcher, signature);
            }
            boolean z10 = true;
            if (dVar != null) {
                String str = (String) ((d.a) dVar.a()).get(1);
                gt.k0 q10 = oVar.q(Integer.parseInt(str));
                if (q10 == null) {
                    StringBuilder g5 = defpackage.d.g("Local property #", str, " not found in ");
                    g5.append(oVar.e());
                    throw new hs.e(g5.toString(), 2);
                }
                return q10;
            }
            Collection<gt.k0> t3 = oVar.t(fu.e.j(name));
            ArrayList arrayList = new ArrayList();
            for (Object obj : t3) {
                if (kotlin.jvm.internal.i.b(r0.b((gt.k0) obj).a(), signature)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        gt.q visibility = ((gt.k0) next).getVisibility();
                        Object obj2 = linkedHashMap.get(visibility);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(visibility, obj2);
                        }
                        ((List) obj2).add(next);
                    }
                    TreeMap treeMap = new TreeMap(r.f3596u);
                    treeMap.putAll(linkedHashMap);
                    Collection<V> values = treeMap.values();
                    kotlin.jvm.internal.i.f(values, "properties\n             …\n                }.values");
                    List list = (List) is.u.n2(values);
                    if (list.size() == 1) {
                        return (gt.k0) is.u.g2(list);
                    }
                    String m22 = is.u.m2(oVar.t(fu.e.j(name)), "\n", null, null, q.f3594u, 30);
                    StringBuilder sb2 = new StringBuilder("Property '");
                    sb2.append(name);
                    sb2.append("' (JVM signature: ");
                    sb2.append(signature);
                    sb2.append(") not resolved in ");
                    sb2.append(oVar);
                    sb2.append(':');
                    if (m22.length() != 0) {
                        z10 = false;
                    }
                    if (z10) {
                        concat = " no members found";
                    } else {
                        concat = "\n".concat(m22);
                    }
                    sb2.append(concat);
                    throw new hs.e(sb2.toString(), 2);
                }
                return (gt.k0) is.u.y2(arrayList);
            }
            throw new hs.e("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + oVar, 2);
        }
    }

    /* compiled from: KPropertyImpl.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<Field> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ g0<V> f3518u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(g0<? extends V> g0Var) {
            super(0);
            this.f3518u = g0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
            if (r7 != false) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
        @Override // ss.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Field invoke() {
            o oVar;
            Class<?> enclosingClass;
            boolean z10;
            boolean H;
            boolean z11;
            fu.b bVar = r0.f3597a;
            g0<V> g0Var = this.f3518u;
            at.d b10 = r0.b(g0Var.t());
            if (b10 instanceof d.c) {
                d.c cVar = (d.c) b10;
                gu.e eVar = eu.h.f14568a;
                au.m mVar = cVar.f3487b;
                boolean z12 = true;
                d.a b11 = eu.h.b(mVar, cVar.f3489d, cVar.f3490e, true);
                if (b11 == null) {
                    return null;
                }
                gt.k0 k0Var = cVar.f3486a;
                if (k0Var != null) {
                    if (k0Var.m0() != b.a.FAKE_OVERRIDE) {
                        gt.j c10 = k0Var.c();
                        if (c10 != null) {
                            if (iu.g.l(c10)) {
                                gt.j c11 = c10.c();
                                if (!iu.g.n(c11, 1) && !iu.g.n(c11, 3)) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (z11) {
                                    LinkedHashSet linkedHashSet = dt.c.f13354a;
                                    if (!kotlin.jvm.internal.h.J((gt.e) c10)) {
                                        z10 = true;
                                        if (!z10) {
                                            if (iu.g.l(k0Var.c())) {
                                                gt.s q02 = k0Var.q0();
                                                if (q02 != null && q02.getAnnotations().H(pt.c0.f28861a)) {
                                                    H = true;
                                                } else {
                                                    H = k0Var.getAnnotations().H(pt.c0.f28861a);
                                                }
                                            }
                                        }
                                        oVar = g0Var.f3507y;
                                        if (z12 && !eu.h.d(mVar)) {
                                            gt.j c12 = k0Var.c();
                                            if (c12 instanceof gt.e) {
                                                enclosingClass = t0.j((gt.e) c12);
                                            } else {
                                                enclosingClass = oVar.e();
                                            }
                                        } else {
                                            enclosingClass = oVar.e().getEnclosingClass();
                                        }
                                        if (enclosingClass == null) {
                                            return null;
                                        }
                                        try {
                                            return enclosingClass.getDeclaredField(b11.f14559a);
                                        } catch (NoSuchFieldException unused) {
                                            return null;
                                        }
                                    }
                                }
                            }
                            z10 = false;
                            if (!z10) {
                            }
                            oVar = g0Var.f3507y;
                            if (z12) {
                            }
                            enclosingClass = oVar.e().getEnclosingClass();
                            if (enclosingClass == null) {
                            }
                        } else {
                            pt.m.a(1);
                            throw null;
                        }
                    }
                    z12 = false;
                    oVar = g0Var.f3507y;
                    if (z12) {
                    }
                    enclosingClass = oVar.e().getEnclosingClass();
                    if (enclosingClass == null) {
                    }
                } else {
                    pt.m.a(0);
                    throw null;
                }
            } else if (b10 instanceof d.a) {
                return ((d.a) b10).f3483a;
            } else {
                if ((b10 instanceof d.b) || (b10 instanceof d.C0055d)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public g0(o oVar, String str, String str2, gt.k0 k0Var, Object obj) {
        this.f3507y = oVar;
        this.f3508z = str;
        this.A = str2;
        this.B = obj;
        this.C = new n0.b<>(new e(this));
        this.D = new n0.a<>(k0Var, new d(this));
    }

    @Override // at.e
    /* renamed from: A */
    public final gt.k0 t() {
        gt.k0 invoke = this.D.invoke();
        kotlin.jvm.internal.i.f(invoke, "_descriptor()");
        return invoke;
    }

    public abstract b<V> B();

    public final boolean equals(Object obj) {
        g0<?> c10 = t0.c(obj);
        if (c10 == null || !kotlin.jvm.internal.i.b(this.f3507y, c10.f3507y) || !kotlin.jvm.internal.i.b(this.f3508z, c10.f3508z) || !kotlin.jvm.internal.i.b(this.A, c10.A) || !kotlin.jvm.internal.i.b(this.B, c10.B)) {
            return false;
        }
        return true;
    }

    @Override // ys.c
    public final String getName() {
        return this.f3508z;
    }

    public final int hashCode() {
        return this.A.hashCode() + pl.a.c(this.f3508z, this.f3507y.hashCode() * 31, 31);
    }

    @Override // ys.c
    public final boolean isSuspend() {
        return false;
    }

    @Override // at.e
    public final bt.e<?> o() {
        return B().o();
    }

    @Override // at.e
    public final o p() {
        return this.f3507y;
    }

    @Override // at.e
    public final bt.e<?> s() {
        B().getClass();
        return null;
    }

    public final String toString() {
        hu.d dVar = p0.f3592a;
        return p0.c(t());
    }

    @Override // at.e
    public final boolean w() {
        return !kotlin.jvm.internal.i.b(this.B, kotlin.jvm.internal.a.NO_RECEIVER);
    }

    public final Member z() {
        boolean z10;
        boolean z11;
        if (!t().P()) {
            return null;
        }
        fu.b bVar = r0.f3597a;
        at.d b10 = r0.b(t());
        if (b10 instanceof d.c) {
            d.c cVar = (d.c) b10;
            a.c cVar2 = cVar.f3488c;
            boolean z12 = true;
            if ((cVar2.f13468v & 16) == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a.b bVar2 = cVar2.A;
                int i6 = bVar2.f13459v;
                if ((i6 & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if ((i6 & 2) != 2) {
                        z12 = false;
                    }
                    if (z12) {
                        int i10 = bVar2.f13460w;
                        cu.c cVar3 = cVar.f3489d;
                        return this.f3507y.m(cVar3.getString(i10), cVar3.getString(bVar2.f13461x));
                    }
                }
                return null;
            }
        }
        return this.C.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(o container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0(o container, gt.k0 descriptor) {
        this(container, r3, r0.b(descriptor).a(), descriptor, kotlin.jvm.internal.a.NO_RECEIVER);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        String f = descriptor.getName().f();
        kotlin.jvm.internal.i.f(f, "descriptor.name.asString()");
    }
}
