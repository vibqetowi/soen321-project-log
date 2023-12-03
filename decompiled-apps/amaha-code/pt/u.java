package pt;

import dt.n;
import gt.z0;
import iu.h;
import java.util.Iterator;
import java.util.List;
import pt.j0;
import yt.m;
/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* loaded from: classes2.dex */
public final class u implements iu.h {

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static boolean a(gt.a superDescriptor, gt.a subDescriptor) {
            kotlin.jvm.internal.i.g(superDescriptor, "superDescriptor");
            kotlin.jvm.internal.i.g(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof rt.e) && (superDescriptor instanceof gt.u)) {
                rt.e eVar = (rt.e) subDescriptor;
                eVar.i().size();
                gt.u uVar = (gt.u) superDescriptor;
                uVar.i().size();
                List<z0> i6 = eVar.b().i();
                kotlin.jvm.internal.i.f(i6, "subDescriptor.original.valueParameters");
                List<z0> i10 = uVar.b().i();
                kotlin.jvm.internal.i.f(i10, "superDescriptor.original.valueParameters");
                Iterator it = is.u.O2(i6, i10).iterator();
                while (it.hasNext()) {
                    hs.f fVar = (hs.f) it.next();
                    z0 subParameter = (z0) fVar.f19464u;
                    z0 superParameter = (z0) fVar.f19465v;
                    kotlin.jvm.internal.i.f(subParameter, "subParameter");
                    boolean z10 = b((gt.u) subDescriptor, subParameter) instanceof m.c;
                    kotlin.jvm.internal.i.f(superParameter, "superParameter");
                    if (z10 != (b(uVar, superParameter) instanceof m.c)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static yt.m b(gt.u f, z0 z0Var) {
            boolean z10;
            gt.e eVar;
            boolean z11;
            boolean z12;
            m.c cVar;
            nu.c cVar2;
            gt.u a10;
            kotlin.jvm.internal.i.g(f, "f");
            gt.e eVar2 = null;
            boolean z13 = false;
            if (kotlin.jvm.internal.i.b(f.getName().f(), "remove") && f.i().size() == 1) {
                if (!(mu.a.k(f).c() instanceof rt.c) && !dt.j.A(f)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    List<z0> i6 = f.b().i();
                    kotlin.jvm.internal.i.f(i6, "f.original.valueParameters");
                    wu.b0 a11 = ((z0) is.u.y2(i6)).a();
                    kotlin.jvm.internal.i.f(a11, "f.original.valueParameters.single().type");
                    yt.m I = ta.v.I(a11);
                    if (I instanceof m.c) {
                        cVar = (m.c) I;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        cVar2 = cVar.f39052i;
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 == nu.c.INT && (a10 = h.a(f)) != null) {
                        List<z0> i10 = a10.b().i();
                        kotlin.jvm.internal.i.f(i10, "overridden.original.valueParameters");
                        wu.b0 a12 = ((z0) is.u.y2(i10)).a();
                        kotlin.jvm.internal.i.f(a12, "overridden.original.valueParameters.single().type");
                        yt.m I2 = ta.v.I(a12);
                        gt.j c10 = a10.c();
                        kotlin.jvm.internal.i.f(c10, "overridden.containingDeclaration");
                        if (kotlin.jvm.internal.i.b(mu.a.h(c10), n.a.J.i()) && (I2 instanceof m.b) && kotlin.jvm.internal.i.b(((m.b) I2).f39051i, "java/lang/Object")) {
                            z10 = true;
                            if (!z10) {
                                if (f.i().size() == 1) {
                                    gt.j c11 = f.c();
                                    if (c11 instanceof gt.e) {
                                        eVar = (gt.e) c11;
                                    } else {
                                        eVar = null;
                                    }
                                    if (eVar != null) {
                                        List<z0> i11 = f.i();
                                        kotlin.jvm.internal.i.f(i11, "f.valueParameters");
                                        gt.g a13 = ((z0) is.u.y2(i11)).a().O0().a();
                                        if (a13 instanceof gt.e) {
                                            eVar2 = (gt.e) a13;
                                        }
                                        if (eVar2 != null) {
                                            if (dt.j.u(eVar) != null) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11 && kotlin.jvm.internal.i.b(mu.a.g(eVar), mu.a.g(eVar2))) {
                                                z13 = true;
                                            }
                                        }
                                    }
                                }
                                if (!z13) {
                                    wu.b0 a14 = z0Var.a();
                                    kotlin.jvm.internal.i.f(a14, "valueParameterDescriptor.type");
                                    return ta.v.I(a14);
                                }
                            }
                            wu.b0 a15 = z0Var.a();
                            kotlin.jvm.internal.i.f(a15, "valueParameterDescriptor.type");
                            return ta.v.I(hc.d.Y(a15));
                        }
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
            wu.b0 a152 = z0Var.a();
            kotlin.jvm.internal.i.f(a152, "valueParameterDescriptor.type");
            return ta.v.I(hc.d.Y(a152));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (pt.j0.f28931k.contains(r2) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
        if (kotlin.jvm.internal.i.b(r0, ta.v.n(r2, 2)) != false) goto L41;
     */
    @Override // iu.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h.b a(gt.a superDescriptor, gt.a subDescriptor, gt.e eVar) {
        gt.u uVar;
        boolean z10;
        kotlin.jvm.internal.i.g(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.i.g(subDescriptor, "subDescriptor");
        boolean z11 = false;
        if ((superDescriptor instanceof gt.b) && (subDescriptor instanceof gt.u) && !dt.j.A(subDescriptor)) {
            int i6 = h.f28907m;
            gt.u uVar2 = (gt.u) subDescriptor;
            fu.e name = uVar2.getName();
            kotlin.jvm.internal.i.f(name, "subDescriptor.name");
            if (!h.b(name)) {
                j0.a aVar = j0.f28922a;
                fu.e name2 = uVar2.getName();
                kotlin.jvm.internal.i.f(name2, "subDescriptor.name");
            }
            gt.b c10 = i0.c((gt.b) superDescriptor);
            boolean z12 = superDescriptor instanceof gt.u;
            if (z12) {
                uVar = (gt.u) superDescriptor;
            } else {
                uVar = null;
            }
            if (uVar != null && uVar2.x0() == uVar.x0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!z10) || (c10 != null && uVar2.x0())) {
                if ((eVar instanceof rt.c) && uVar2.e0() == null && c10 != null && !i0.d(eVar, c10)) {
                    if ((c10 instanceof gt.u) && z12 && h.a((gt.u) c10) != null) {
                        String n10 = ta.v.n(uVar2, 2);
                        gt.u b10 = ((gt.u) superDescriptor).b();
                        kotlin.jvm.internal.i.f(b10, "superDescriptor.original");
                    }
                }
            }
            z11 = true;
        }
        h.b bVar = h.b.INCOMPATIBLE;
        if (z11) {
            return bVar;
        }
        if (a.a(superDescriptor, subDescriptor)) {
            return bVar;
        }
        return h.b.UNKNOWN;
    }

    @Override // iu.h
    public h.a b() {
        return h.a.CONFLICTS_ONLY;
    }
}
