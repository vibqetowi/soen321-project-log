package ut;

import dt.l;
import dt.n;
import ht.h;
import is.b0;
import is.u;
import is.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import nt.g0;
import st.j;
import ta.v;
import wt.a0;
import wt.w;
import wt.x;
import wu.a1;
import wu.c0;
import wu.d1;
import wu.f0;
import wu.f1;
import wu.i0;
import wu.k1;
import wu.m1;
import wu.n1;
import wu.v0;
import wu.x0;
import ys.m;
import yu.h;
import zu.k;
/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final q.f f34517a;

    /* renamed from: b  reason: collision with root package name */
    public final j f34518b;

    /* renamed from: c  reason: collision with root package name */
    public final e f34519c;

    /* renamed from: d  reason: collision with root package name */
    public final a1 f34520d;

    public c(q.f c10, j typeParameterResolver) {
        i.g(c10, "c");
        i.g(typeParameterResolver, "typeParameterResolver");
        this.f34517a = c10;
        this.f34518b = typeParameterResolver;
        e eVar = new e();
        this.f34519c = eVar;
        this.f34520d = new a1(eVar);
    }

    public static final yu.f d(wt.j jVar) {
        return yu.i.c(h.f39084w, jVar.q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d3, code lost:
        if ((!r0.isEmpty()) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0126, code lost:
        if (r2 == false) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i0 a(wt.j jVar, a aVar, i0 i0Var) {
        v0 v12;
        x0 x0Var;
        x0 l2;
        gt.e W0;
        a0 a0Var;
        boolean z10;
        boolean z11;
        n1 O;
        gt.e eVar;
        boolean z12;
        boolean z13;
        x0 x0Var2;
        boolean z14;
        List I2;
        k f1Var;
        n1 n1Var;
        boolean z15;
        ?? r13;
        q.f fVar;
        d1 H;
        a aVar2 = aVar;
        q.f fVar2 = this.f34517a;
        if (i0Var == null || (v12 = i0Var.N0()) == null) {
            v12 = ca.a.v1(new st.e(fVar2, jVar, false));
        }
        v0 v0Var = v12;
        wt.i f = jVar.f();
        n1 n1Var2 = n1.OUT_VARIANCE;
        int i6 = aVar2.f34507a;
        int i10 = aVar2.f34508b;
        boolean z16 = aVar2.f34510d;
        if (f == null) {
            l2 = b(jVar);
        } else if (f instanceof wt.g) {
            wt.g gVar = (wt.g) f;
            fu.c e10 = gVar.e();
            if (e10 != null) {
                if (z16 && i.b(e10, d.f34521a)) {
                    l lVar = ((st.c) fVar2.f29104v).f31948p;
                    lVar.getClass();
                    m<Object> property = l.f13377e[0];
                    lVar.f13380c.getClass();
                    i.g(property, "property");
                    fu.e j10 = fu.e.j(v.l(property.getName()));
                    gt.g g5 = ((pu.i) lVar.f13379b.getValue()).g(j10, ot.c.FROM_REFLECTION);
                    if (g5 instanceof gt.e) {
                        eVar = (gt.e) g5;
                    } else {
                        eVar = null;
                    }
                    W0 = eVar == null ? lVar.f13378a.a(new fu.b(n.f13387g, j10), ca.a.O0(1)) : eVar;
                } else {
                    W0 = ca.a.W0(ca.a.D, e10, fVar2.a().o());
                    if (W0 == null) {
                        W0 = null;
                    } else {
                        String str = ft.c.f15851a;
                        fu.d g10 = iu.g.g(W0);
                        HashMap<fu.d, fu.c> hashMap = ft.c.f15860k;
                        if (hashMap.containsKey(g10)) {
                            if (i10 != 3 && i6 != 1) {
                                w wVar = (w) u.p2(jVar.G());
                                if (wVar instanceof a0) {
                                    a0Var = (a0) wVar;
                                } else {
                                    a0Var = null;
                                }
                                if (a0Var != null && a0Var.v() != null && !a0Var.K()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    fu.d g11 = iu.g.g(W0);
                                    String str2 = ft.c.f15851a;
                                    fu.c cVar = hashMap.get(g11);
                                    if (cVar != null) {
                                        List<gt.v0> parameters = mu.a.e(W0).j(cVar).l().getParameters();
                                        i.f(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
                                        gt.v0 v0Var2 = (gt.v0) u.p2(parameters);
                                        if (v0Var2 != null && (O = v0Var2.O()) != null && O != n1Var2) {
                                            z11 = true;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Given class " + W0 + " is not a read-only collection");
                                    }
                                }
                                z11 = false;
                            }
                            W0 = ca.a.G(W0);
                        }
                    }
                }
                if (W0 == null) {
                    W0 = ((st.c) fVar2.f29104v).f31943k.a(gVar);
                }
                if (W0 == null || (l2 = W0.l()) == null) {
                    l2 = b(jVar);
                }
            } else {
                throw new AssertionError("Class type should have a FQ name: " + f);
            }
        } else if (f instanceof x) {
            gt.v0 a10 = this.f34518b.a((x) f);
            if (a10 != null) {
                l2 = a10.l();
            } else {
                x0Var = null;
                if (x0Var != null) {
                    return null;
                }
                if (i10 == 3) {
                    z13 = false;
                } else {
                    if (!z16 && i6 != 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z12;
                }
                if (i0Var != null) {
                    x0Var2 = i0Var.O0();
                } else {
                    x0Var2 = null;
                }
                if (i.b(x0Var2, x0Var) && !jVar.A() && z13) {
                    return i0Var.S0(true);
                }
                if (!jVar.A()) {
                    if (jVar.G().isEmpty()) {
                        List<gt.v0> parameters2 = x0Var.getParameters();
                        i.f(parameters2, "constructor.parameters");
                    }
                    z14 = false;
                    List<gt.v0> parameters3 = x0Var.getParameters();
                    i.f(parameters3, "constructor.parameters");
                    if (!z14) {
                        r13 = new ArrayList(is.i.H1(parameters3, 10));
                        for (gt.v0 v0Var3 : parameters3) {
                            if (hc.d.R(v0Var3, null, aVar2.f34511e)) {
                                H = k1.n(v0Var3, aVar2);
                                fVar = fVar2;
                            } else {
                                fVar = fVar2;
                                H = this.f34519c.H(v0Var3, a.e(aVar, 0, jVar.A(), null, null, 59), this.f34520d, new f0(fVar2.b(), new b(this, v0Var3, aVar, x0Var, jVar)));
                            }
                            r13.add(H);
                            aVar2 = aVar;
                            fVar2 = fVar;
                        }
                    } else {
                        if (parameters3.size() != jVar.G().size()) {
                            ArrayList arrayList = new ArrayList(is.i.H1(parameters3, 10));
                            for (gt.v0 v0Var4 : parameters3) {
                                h hVar = h.M;
                                String f2 = v0Var4.getName().f();
                                i.f(f2, "p.name.asString()");
                                arrayList.add(new f1(yu.i.c(hVar, f2)));
                            }
                            I2 = u.I2(arrayList);
                        } else {
                            is.a0 N2 = u.N2(jVar.G());
                            ArrayList arrayList2 = new ArrayList(is.i.H1(N2, 10));
                            Iterator it = N2.iterator();
                            while (true) {
                                b0 b0Var = (b0) it;
                                if (!b0Var.hasNext()) {
                                    break;
                                }
                                z zVar = (z) b0Var.next();
                                int i11 = zVar.f20679a;
                                w wVar2 = (w) zVar.f20680b;
                                parameters3.size();
                                gt.v0 parameter = parameters3.get(i11);
                                a u12 = ca.a.u1(2, false, false, null, 7);
                                i.f(parameter, "parameter");
                                boolean z17 = wVar2 instanceof a0;
                                n1 n1Var3 = n1.INVARIANT;
                                if (z17) {
                                    a0 a0Var2 = (a0) wVar2;
                                    g0 v10 = a0Var2.v();
                                    if (a0Var2.K()) {
                                        n1Var = n1Var2;
                                    } else {
                                        n1Var = n1.IN_VARIANCE;
                                    }
                                    if (v10 != null) {
                                        if (parameter.O() != n1Var3 && n1Var != parameter.O()) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (!z15) {
                                            f1Var = hc.d.n(e(v10, ca.a.u1(2, false, false, null, 7)), n1Var, parameter);
                                        }
                                    }
                                    f1Var = k1.n(parameter, u12);
                                } else {
                                    f1Var = new f1(e(wVar2, u12), n1Var3);
                                }
                                arrayList2.add(f1Var);
                            }
                            I2 = u.I2(arrayList2);
                        }
                        r13 = I2;
                    }
                    return c0.f(v0Var, x0Var, r13, z13, null);
                }
                z14 = true;
                List<gt.v0> parameters32 = x0Var.getParameters();
                i.f(parameters32, "constructor.parameters");
                if (!z14) {
                }
                return c0.f(v0Var, x0Var, r13, z13, null);
            }
        } else {
            throw new IllegalStateException("Unknown classifier kind: " + f);
        }
        x0Var = l2;
        if (x0Var != null) {
        }
    }

    public final x0 b(wt.j jVar) {
        fu.b l2 = fu.b.l(new fu.c(jVar.B()));
        su.l c10 = ((st.c) this.f34517a.f29104v).f31937d.c();
        x0 l10 = c10.f32054l.a(l2, ca.a.O0(0)).l();
        i.f(l10, "c.components.deserialize…istOf(0)).typeConstructor");
        return l10;
    }

    public final m1 c(wt.f arrayType, a aVar, boolean z10) {
        wt.u uVar;
        dt.k kVar;
        ht.h iVar;
        i.g(arrayType, "arrayType");
        g0 L = arrayType.L();
        if (L instanceof wt.u) {
            uVar = (wt.u) L;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            kVar = uVar.a();
        } else {
            kVar = null;
        }
        q.f fVar = this.f34517a;
        st.e eVar = new st.e(fVar, arrayType, true);
        boolean z11 = aVar.f34510d;
        if (kVar != null) {
            i0 r = fVar.a().o().r(kVar);
            i.f(r, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            ArrayList s22 = u.s2(eVar, r.getAnnotations());
            if (s22.isEmpty()) {
                iVar = h.a.f19495a;
            } else {
                iVar = new ht.i(s22);
            }
            hc.d.f0(r, iVar);
            if (!z11) {
                return c0.c(r, r.S0(true));
            }
            return r;
        }
        wu.b0 e10 = e(L, ca.a.u1(2, z11, false, null, 6));
        n1 n1Var = n1.OUT_VARIANCE;
        n1 n1Var2 = n1.INVARIANT;
        if (z11) {
            if (!z10) {
                n1Var = n1Var2;
            }
            return fVar.a().o().i(n1Var, e10, eVar);
        }
        return c0.c(fVar.a().o().i(n1Var2, e10, eVar), fVar.a().o().i(n1Var, e10, eVar).S0(true));
    }

    public final wu.b0 e(w wVar, a aVar) {
        i0 x10;
        boolean z10 = wVar instanceof wt.u;
        q.f fVar = this.f34517a;
        if (z10) {
            dt.k a10 = ((wt.u) wVar).a();
            if (a10 != null) {
                x10 = fVar.a().o().t(a10);
            } else {
                x10 = fVar.a().o().x();
            }
            i.f(x10, "{\n                val pr…ns.unitType\n            }");
            return x10;
        }
        boolean z11 = false;
        if (wVar instanceof wt.j) {
            wt.j jVar = (wt.j) wVar;
            if (!aVar.f34510d && aVar.f34507a != 1) {
                z11 = true;
            }
            boolean A = jVar.A();
            if (!A && !z11) {
                i0 a11 = a(jVar, aVar, null);
                if (a11 != null) {
                    return a11;
                }
                return d(jVar);
            }
            i0 a12 = a(jVar, aVar.f(3), null);
            if (a12 == null) {
                return d(jVar);
            }
            i0 a13 = a(jVar, aVar.f(2), a12);
            if (a13 == null) {
                return d(jVar);
            }
            if (A) {
                return new g(a12, a13);
            }
            return c0.c(a12, a13);
        } else if (wVar instanceof wt.f) {
            return c((wt.f) wVar, aVar, false);
        } else {
            if (wVar instanceof a0) {
                g0 v10 = ((a0) wVar).v();
                if (v10 != null) {
                    return e(v10, aVar);
                }
                return fVar.a().o().n();
            } else if (wVar == null) {
                return fVar.a().o().n();
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + wVar);
            }
        }
    }
}
