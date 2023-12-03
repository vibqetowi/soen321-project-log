package pt;

import gt.k0;
import gt.p0;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import pt.j0;
import t0.l0;
import wu.d1;
import wu.j1;
import wu.k1;
import wu.m1;
import wu.n1;
import wu.x0;
import wu.z0;
/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes2.dex */
public final class i0 {

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<gt.b, Boolean> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f28915u = new a();

        public a() {
            super(1);
        }

        @Override // ss.l
        public final Boolean invoke(gt.b bVar) {
            gt.b it = bVar;
            kotlin.jvm.internal.i.g(it, "it");
            return Boolean.valueOf(sp.b.H(mu.a.k(it)));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<gt.b, Boolean> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f28916u = new b();

        public b() {
            super(1);
        }

        @Override // ss.l
        public final Boolean invoke(gt.b bVar) {
            boolean z10;
            gt.b it = bVar;
            kotlin.jvm.internal.i.g(it, "it");
            int i6 = g.f28903m;
            p0 p0Var = (p0) it;
            if (dt.j.A(p0Var) && mu.a.b(p0Var, new f(p0Var)) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<gt.b, Boolean> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f28917u = new c();

        public c() {
            super(1);
        }

        @Override // ss.l
        public final Boolean invoke(gt.b bVar) {
            char c10;
            gt.b b10;
            String o10;
            gt.b it = bVar;
            kotlin.jvm.internal.i.g(it, "it");
            boolean z10 = false;
            if (dt.j.A(it)) {
                int i6 = h.f28907m;
                if (j0.f.contains(it.getName()) && (b10 = mu.a.b(it, i.f28914u)) != null && (o10 = ta.v.o(b10)) != null) {
                    if (j0.f28924c.contains(o10)) {
                        c10 = 1;
                    } else if (((j0.b) is.e0.r0(j0.f28926e, o10)) == j0.b.f28935v) {
                        c10 = 3;
                    } else {
                        c10 = 2;
                    }
                } else {
                    c10 = 0;
                }
                if (c10 != 0) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final String a(gt.b bVar) {
        gt.b bVar2;
        fu.e eVar;
        fu.e eVar2;
        if (dt.j.A(bVar)) {
            bVar2 = b(bVar);
        } else {
            bVar2 = null;
        }
        if (bVar2 == null) {
            return null;
        }
        gt.b k10 = mu.a.k(bVar2);
        if (k10 instanceof k0) {
            dt.j.A(k10);
            gt.b b10 = mu.a.b(mu.a.k(k10), k.f28941u);
            if (b10 == null || (eVar2 = j.f28918a.get(mu.a.g(b10))) == null) {
                return null;
            }
            return eVar2.f();
        } else if (!(k10 instanceof p0)) {
            return null;
        } else {
            int i6 = g.f28903m;
            LinkedHashMap linkedHashMap = j0.f28930j;
            String o10 = ta.v.o((p0) k10);
            if (o10 == null) {
                eVar = null;
            } else {
                eVar = (fu.e) linkedHashMap.get(o10);
            }
            if (eVar == null) {
                return null;
            }
            return eVar.f();
        }
    }

    public static final <T extends gt.b> T b(T t3) {
        boolean z10;
        kotlin.jvm.internal.i.g(t3, "<this>");
        if (!j0.f28931k.contains(t3.getName()) && !j.f28921d.contains(mu.a.k(t3).getName())) {
            return null;
        }
        if (t3 instanceof k0) {
            z10 = true;
        } else {
            z10 = t3 instanceof gt.j0;
        }
        if (z10) {
            return (T) mu.a.b(t3, a.f28915u);
        }
        if (!(t3 instanceof p0)) {
            return null;
        }
        return (T) mu.a.b(t3, b.f28916u);
    }

    public static final <T extends gt.b> T c(T t3) {
        kotlin.jvm.internal.i.g(t3, "<this>");
        T t10 = (T) b(t3);
        if (t10 != null) {
            return t10;
        }
        int i6 = h.f28907m;
        fu.e name = t3.getName();
        kotlin.jvm.internal.i.f(name, "name");
        if (!h.b(name)) {
            return null;
        }
        return (T) mu.a.b(t3, c.f28917u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
        if (r5 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0130, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
        if (r0 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
        return !dt.j.A(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(gt.e eVar, gt.b specialCallableDescriptor) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.i.g(eVar, "<this>");
        kotlin.jvm.internal.i.g(specialCallableDescriptor, "specialCallableDescriptor");
        gt.j c10 = specialCallableDescriptor.c();
        kotlin.jvm.internal.i.e(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        wu.i0 r = ((gt.e) c10).r();
        kotlin.jvm.internal.i.f(r, "specialCallableDescripto…ssDescriptor).defaultType");
        gt.e j10 = iu.g.j(eVar);
        while (true) {
            boolean z12 = false;
            if (j10 == null) {
                return false;
            }
            if (!(j10 instanceof rt.c)) {
                wu.i0 r10 = j10.r();
                if (r10 != null) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    m1 m1Var = null;
                    arrayDeque.add(new xu.o(r10, null));
                    x0 O0 = r.O0();
                    while (true) {
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        xu.o oVar = (xu.o) arrayDeque.poll();
                        wu.b0 b0Var = oVar.f38120a;
                        x0 O02 = b0Var.O0();
                        if (l0.d(O02, O0)) {
                            boolean P0 = b0Var.P0();
                            for (xu.o oVar2 = oVar.f38121b; oVar2 != null; oVar2 = oVar2.f38121b) {
                                wu.b0 b0Var2 = oVar2.f38120a;
                                List<d1> M0 = b0Var2.M0();
                                boolean z13 = M0 instanceof Collection;
                                n1 n1Var = n1.INVARIANT;
                                if (!z13 || !M0.isEmpty()) {
                                    for (d1 d1Var : M0) {
                                        if (d1Var.b() != n1Var) {
                                            z10 = true;
                                            continue;
                                        } else {
                                            z10 = false;
                                            continue;
                                        }
                                        if (z10) {
                                            z11 = true;
                                            break;
                                        }
                                    }
                                }
                                z11 = false;
                                if (z11) {
                                    b0Var = (wu.b0) kotlin.jvm.internal.h.e(j1.e(ju.d.b(z0.f37326b.a(b0Var2))).i(b0Var, n1Var)).f4720b;
                                } else {
                                    b0Var = j1.e(z0.f37326b.a(b0Var2)).i(b0Var, n1Var);
                                }
                                if (!P0 && !b0Var2.P0()) {
                                    P0 = false;
                                } else {
                                    P0 = true;
                                }
                            }
                            x0 O03 = b0Var.O0();
                            if (l0.d(O03, O0)) {
                                m1Var = k1.j(b0Var, P0);
                            } else {
                                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + ta.v.q(O03) + ", \n\nsupertype: " + ta.v.q(O0) + " \n" + l0.d(O03, O0));
                            }
                        } else {
                            for (wu.b0 immediateSupertype : O02.c()) {
                                kotlin.jvm.internal.i.f(immediateSupertype, "immediateSupertype");
                                arrayDeque.add(new xu.o(immediateSupertype, oVar));
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
            }
            j10 = iu.g.j(j10);
        }
    }
}
