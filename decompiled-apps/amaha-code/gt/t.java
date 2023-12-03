package gt;

import java.util.List;
/* compiled from: findClassInModule.kt */
/* loaded from: classes2.dex */
public final class t {

    /* compiled from: findClassInModule.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.f implements ss.l<fu.b, fu.b> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f16818u = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.a, ys.c
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.a
        public final ys.f getOwner() {
            return kotlin.jvm.internal.y.a(fu.b.class);
        }

        @Override // kotlin.jvm.internal.a
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // ss.l
        public final fu.b invoke(fu.b bVar) {
            fu.b p02 = bVar;
            kotlin.jvm.internal.i.g(p02, "p0");
            return p02.g();
        }
    }

    /* compiled from: findClassInModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<fu.b, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f16819u = new b();

        public b() {
            super(1);
        }

        @Override // ss.l
        public final Integer invoke(fu.b bVar) {
            fu.b it = bVar;
            kotlin.jvm.internal.i.g(it, "it");
            return 0;
        }
    }

    public static final e a(a0 a0Var, fu.b classId) {
        kotlin.jvm.internal.i.g(a0Var, "<this>");
        kotlin.jvm.internal.i.g(classId, "classId");
        g b10 = b(a0Var, classId);
        if (b10 instanceof e) {
            return (e) b10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g b(a0 a0Var, fu.b classId) {
        a0 a0Var2;
        g g5;
        kotlin.jvm.internal.i.g(a0Var, "<this>");
        kotlin.jvm.internal.i.g(classId, "classId");
        iu.t tVar = (iu.t) a0Var.s0(iu.u.f20716a);
        if (tVar != null) {
            a0Var2 = tVar.a();
        } else {
            a0Var2 = null;
        }
        ot.c cVar = ot.c.FROM_DESERIALIZATION;
        if (a0Var2 == null) {
            fu.c h10 = classId.h();
            kotlin.jvm.internal.i.f(h10, "classId.packageFqName");
            h0 H = a0Var.H(h10);
            List<fu.e> f = classId.i().f15922a.f();
            pu.i p10 = H.p();
            Object g22 = is.u.g2(f);
            kotlin.jvm.internal.i.f(g22, "segments.first()");
            g5 = p10.g((fu.e) g22, cVar);
            if (g5 == null) {
                return null;
            }
            for (fu.e name : f.subList(1, f.size())) {
                if (!(g5 instanceof e)) {
                    return null;
                }
                pu.i A0 = ((e) g5).A0();
                kotlin.jvm.internal.i.f(name, "name");
                g g10 = A0.g(name, cVar);
                if (g10 instanceof e) {
                    g5 = (e) g10;
                    continue;
                } else {
                    g5 = null;
                    continue;
                }
                if (g5 == null) {
                    return null;
                }
            }
        } else {
            fu.c h11 = classId.h();
            kotlin.jvm.internal.i.f(h11, "classId.packageFqName");
            h0 H2 = a0Var2.H(h11);
            List<fu.e> f2 = classId.i().f15922a.f();
            pu.i p11 = H2.p();
            Object g23 = is.u.g2(f2);
            kotlin.jvm.internal.i.f(g23, "segments.first()");
            g g11 = p11.g((fu.e) g23, cVar);
            if (g11 != null) {
                for (fu.e name2 : f2.subList(1, f2.size())) {
                    if (g11 instanceof e) {
                        pu.i A02 = ((e) g11).A0();
                        kotlin.jvm.internal.i.f(name2, "name");
                        g g12 = A02.g(name2, cVar);
                        if (g12 instanceof e) {
                            g11 = (e) g12;
                            continue;
                        } else {
                            g11 = null;
                            continue;
                        }
                        if (g11 == null) {
                        }
                    }
                }
                if (g11 != null) {
                    fu.c h12 = classId.h();
                    kotlin.jvm.internal.i.f(h12, "classId.packageFqName");
                    h0 H3 = a0Var.H(h12);
                    List<fu.e> f10 = classId.i().f15922a.f();
                    pu.i p12 = H3.p();
                    Object g24 = is.u.g2(f10);
                    kotlin.jvm.internal.i.f(g24, "segments.first()");
                    g5 = p12.g((fu.e) g24, cVar);
                    if (g5 == null) {
                        return null;
                    }
                    for (fu.e name3 : f10.subList(1, f10.size())) {
                        if (!(g5 instanceof e)) {
                            return null;
                        }
                        pu.i A03 = ((e) g5).A0();
                        kotlin.jvm.internal.i.f(name3, "name");
                        g g13 = A03.g(name3, cVar);
                        if (g13 instanceof e) {
                            g5 = (e) g13;
                            continue;
                        } else {
                            g5 = null;
                            continue;
                        }
                        if (g5 == null) {
                            return null;
                        }
                    }
                } else {
                    return g11;
                }
            }
            g11 = null;
            if (g11 != null) {
            }
        }
        return g5;
    }

    public static final e c(a0 a0Var, fu.b classId, c0 notFoundClasses) {
        kotlin.jvm.internal.i.g(a0Var, "<this>");
        kotlin.jvm.internal.i.g(classId, "classId");
        kotlin.jvm.internal.i.g(notFoundClasses, "notFoundClasses");
        e a10 = a(a0Var, classId);
        if (a10 != null) {
            return a10;
        }
        return notFoundClasses.a(classId, ca.a.a1(fv.t.J0(fv.t.G0(fv.k.x0(a.f16818u, classId), b.f16819u))));
    }
}
