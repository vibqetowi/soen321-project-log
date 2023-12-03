package at;

import at.c;
import at.d;
import du.a;
import eu.d;
import gu.g;
import java.lang.reflect.Method;
/* compiled from: RuntimeTypeMapper.kt */
/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final fu.b f3597a = fu.b.l(new fu.c("java.lang.Void"));

    public static c.e a(gt.u uVar) {
        String a10 = pt.i0.a(uVar);
        if (a10 == null) {
            if (uVar instanceof gt.l0) {
                String f = mu.a.k(uVar).getName().f();
                kotlin.jvm.internal.i.f(f, "descriptor.propertyIfAccessor.name.asString()");
                a10 = pt.c0.a(f);
            } else if (uVar instanceof gt.m0) {
                String f2 = mu.a.k(uVar).getName().f();
                kotlin.jvm.internal.i.f(f2, "descriptor.propertyIfAccessor.name.asString()");
                a10 = pt.c0.b(f2);
            } else {
                a10 = uVar.getName().f();
                kotlin.jvm.internal.i.f(a10, "descriptor.name.asString()");
            }
        }
        return new c.e(new d.b(a10, ta.v.n(uVar, 1)));
    }

    public static d b(gt.k0 possiblyOverriddenProperty) {
        vt.a aVar;
        nt.w wVar;
        gt.q0 q0Var;
        vt.a aVar2;
        nt.w wVar2;
        nt.b0 b0Var;
        kotlin.jvm.internal.i.g(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        gt.k0 b10 = ((gt.k0) iu.g.u(possiblyOverriddenProperty)).b();
        kotlin.jvm.internal.i.f(b10, "unwrapFakeOverride(possi…rriddenProperty).original");
        Method method = null;
        c.e eVar = null;
        if (b10 instanceof uu.k) {
            uu.k kVar = (uu.k) b10;
            g.e<au.m, a.c> propertySignature = du.a.f13439d;
            kotlin.jvm.internal.i.f(propertySignature, "propertySignature");
            au.m mVar = kVar.V;
            a.c cVar = (a.c) kotlin.jvm.internal.h.w(mVar, propertySignature);
            if (cVar != null) {
                return new d.c(b10, mVar, cVar, kVar.W, kVar.X);
            }
        } else if (b10 instanceof rt.f) {
            gt.q0 g5 = ((rt.f) b10).g();
            if (g5 instanceof vt.a) {
                aVar = (vt.a) g5;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                wVar = aVar.b();
            } else {
                wVar = null;
            }
            if (wVar instanceof nt.y) {
                return new d.a(((nt.y) wVar).f26833a);
            }
            if (wVar instanceof nt.b0) {
                Method method2 = ((nt.b0) wVar).f26790a;
                gt.m0 h10 = b10.h();
                if (h10 != null) {
                    q0Var = h10.g();
                } else {
                    q0Var = null;
                }
                if (q0Var instanceof vt.a) {
                    aVar2 = (vt.a) q0Var;
                } else {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    wVar2 = aVar2.b();
                } else {
                    wVar2 = null;
                }
                if (wVar2 instanceof nt.b0) {
                    b0Var = (nt.b0) wVar2;
                } else {
                    b0Var = null;
                }
                if (b0Var != null) {
                    method = b0Var.f26790a;
                }
                return new d.b(method2, method);
            }
            throw new hs.e("Incorrect resolution sequence for Java field " + b10 + " (source = " + wVar + ')', 2);
        }
        kt.m0 n10 = b10.n();
        kotlin.jvm.internal.i.d(n10);
        c.e a10 = a(n10);
        gt.m0 h11 = b10.h();
        if (h11 != null) {
            eVar = a(h11);
        }
        return new d.C0055d(a10, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0159, code lost:
        if (r0.i().isEmpty() != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c c(gt.u possiblySubstitutedFunction) {
        boolean z10;
        boolean z11;
        vt.a aVar;
        vt.a aVar2;
        nt.w wVar;
        Method method;
        kotlin.jvm.internal.i.g(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        gt.u b10 = ((gt.u) iu.g.u(possiblySubstitutedFunction)).b();
        kotlin.jvm.internal.i.f(b10, "unwrapFakeOverride(possi…titutedFunction).original");
        if (b10 instanceof uu.b) {
            uu.b bVar = (uu.b) b10;
            gu.n C = bVar.C();
            if (C instanceof au.h) {
                gu.e eVar = eu.h.f14568a;
                d.b c10 = eu.h.c((au.h) C, bVar.Z(), bVar.T());
                if (c10 != null) {
                    return new c.e(c10);
                }
            }
            if (C instanceof au.c) {
                gu.e eVar2 = eu.h.f14568a;
                d.b a10 = eu.h.a((au.c) C, bVar.Z(), bVar.T());
                if (a10 != null) {
                    gt.j c11 = possiblySubstitutedFunction.c();
                    kotlin.jvm.internal.i.f(c11, "possiblySubstitutedFunction.containingDeclaration");
                    if (iu.i.b(c11)) {
                        return new c.e(a10);
                    }
                    return new c.d(a10);
                }
            }
            return a(b10);
        }
        nt.w wVar2 = null;
        nt.b0 b0Var = null;
        if (b10 instanceof rt.e) {
            gt.q0 g5 = ((rt.e) b10).g();
            if (g5 instanceof vt.a) {
                aVar2 = (vt.a) g5;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                wVar = aVar2.b();
            } else {
                wVar = null;
            }
            if (wVar instanceof nt.b0) {
                b0Var = (nt.b0) wVar;
            }
            if (b0Var != null && (method = b0Var.f26790a) != null) {
                return new c.C0054c(method);
            }
            throw new hs.e("Incorrect resolution sequence for Java method " + b10, 2);
        } else if (b10 instanceof rt.b) {
            gt.q0 g10 = ((rt.b) b10).g();
            if (g10 instanceof vt.a) {
                aVar = (vt.a) g10;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                wVar2 = aVar.b();
            }
            if (wVar2 instanceof nt.v) {
                return new c.b(((nt.v) wVar2).f26831a);
            }
            if (wVar2 instanceof nt.s) {
                nt.s sVar = (nt.s) wVar2;
                if (sVar.r()) {
                    return new c.a(sVar.f26827a);
                }
            }
            throw new hs.e("Incorrect resolution sequence for Java constructor " + b10 + " (" + wVar2 + ')', 2);
        } else {
            boolean z12 = false;
            if (b10.getName().equals(dt.n.f13383b) && iu.f.j(b10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (b10.getName().equals(dt.n.f13382a) && iu.f.j(b10)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (kotlin.jvm.internal.i.b(b10.getName(), ft.a.f15850e)) {
                    }
                    if (!z12) {
                        return a(b10);
                    }
                    throw new hs.e("Unknown origin of " + b10 + " (" + b10.getClass() + ')', 2);
                }
            }
            z12 = true;
            if (!z12) {
            }
        }
    }
}
