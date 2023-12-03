package wu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import pu.i;
import wu.r0;
import wu.s0;
import wu.v0;
/* compiled from: TypeAliasExpander.kt */
/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final s0 f37286a = s0.a.f37296a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f37287b = false;

    public static v0 b(b0 b0Var, v0 v0Var) {
        i a10;
        if (ta.v.E(b0Var)) {
            return b0Var.N0();
        }
        v0 other = b0Var.N0();
        v0Var.getClass();
        kotlin.jvm.internal.i.g(other, "other");
        if (!v0Var.isEmpty() || !other.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Collection<Integer> values = v0.f37300v.f12111a.values();
            kotlin.jvm.internal.i.f(values, "idPerType.values");
            for (Integer num : values) {
                int intValue = num.intValue();
                t0 t0Var = (t0) v0Var.f12057u.get(intValue);
                t0 t0Var2 = (t0) other.f12057u.get(intValue);
                if (t0Var == null) {
                    if (t0Var2 != null) {
                        a10 = t0Var2.a(t0Var);
                    } else {
                        a10 = null;
                    }
                } else {
                    a10 = t0Var.a(t0Var2);
                }
                ca.a.g(a10, arrayList);
            }
            return v0.a.c(arrayList);
        }
        return v0Var;
    }

    public final void a(ht.h hVar, ht.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator<ht.c> it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().e());
        }
        for (ht.c cVar : hVar2) {
            if (hashSet.contains(cVar.e())) {
                this.f37286a.c(cVar);
            }
        }
    }

    public final i0 c(r0 r0Var, v0 v0Var, boolean z10, int i6, boolean z11) {
        n1 n1Var = n1.INVARIANT;
        gt.u0 u0Var = r0Var.f37290b;
        d1 d10 = d(new f1(u0Var.g0(), n1Var), r0Var, null, i6);
        b0 a10 = d10.a();
        kotlin.jvm.internal.i.f(a10, "expandedProjection.type");
        i0 f = kotlin.jvm.internal.h.f(a10);
        if (ta.v.E(f)) {
            return f;
        }
        d10.b();
        a(f.getAnnotations(), j.a(v0Var));
        if (!ta.v.E(f)) {
            f = kotlin.jvm.internal.h.d0(f, null, b(f, v0Var), 1);
        }
        i0 l2 = k1.l(f, z10);
        kotlin.jvm.internal.i.f(l2, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        if (z11) {
            x0 l10 = u0Var.l();
            kotlin.jvm.internal.i.f(l10, "descriptor.typeConstructor");
            return kotlin.jvm.internal.h.m0(l2, c0.g(r0Var.f37291c, i.b.f29008b, v0Var, l10, z10));
        }
        return l2;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d1 d(d1 d1Var, r0 r0Var, gt.v0 v0Var, int i6) {
        d1 d1Var2;
        n1 n1Var;
        m1 d02;
        gt.u0 u0Var = r0Var.f37290b;
        if (i6 <= 100) {
            if (d1Var.d()) {
                kotlin.jvm.internal.i.d(v0Var);
                return k1.m(v0Var);
            }
            b0 a10 = d1Var.a();
            kotlin.jvm.internal.i.f(a10, "underlyingProjection.type");
            x0 constructor = a10.O0();
            kotlin.jvm.internal.i.g(constructor, "constructor");
            gt.g a11 = constructor.a();
            if (a11 instanceof gt.v0) {
                d1Var2 = r0Var.f37292d.get(a11);
            } else {
                d1Var2 = null;
            }
            n1 n1Var2 = n1.INVARIANT;
            s0 s0Var = this.f37286a;
            if (d1Var2 == null) {
                m1 R0 = d1Var.a().R0();
                if (!ta.v.D(R0)) {
                    i0 f = kotlin.jvm.internal.h.f(R0);
                    if (!ta.v.E(f)) {
                        av.b predicate = av.b.f3900u;
                        kotlin.jvm.internal.i.g(predicate, "predicate");
                        if (k1.c(f, predicate)) {
                            x0 O0 = f.O0();
                            gt.g a12 = O0.a();
                            O0.getParameters().size();
                            f.M0().size();
                            if (!(a12 instanceof gt.v0)) {
                                int i10 = 0;
                                if (a12 instanceof gt.u0) {
                                    gt.u0 u0Var2 = (gt.u0) a12;
                                    if (r0Var.a(u0Var2)) {
                                        s0Var.d(u0Var2);
                                        yu.h hVar = yu.h.f39087z;
                                        String str = u0Var2.getName().f15930u;
                                        kotlin.jvm.internal.i.f(str, "typeDescriptor.name.toString()");
                                        return new f1(yu.i.c(hVar, str), n1Var2);
                                    }
                                    List<d1> M0 = f.M0();
                                    ArrayList arrayList = new ArrayList(is.i.H1(M0, 10));
                                    for (Object obj : M0) {
                                        int i11 = i10 + 1;
                                        if (i10 >= 0) {
                                            arrayList.add(d((d1) obj, r0Var, O0.getParameters().get(i10), i6 + 1));
                                            i10 = i11;
                                        } else {
                                            ca.a.t1();
                                            throw null;
                                        }
                                    }
                                    i0 c10 = c(r0.a.a(r0Var, u0Var2, arrayList), f.N0(), f.P0(), i6 + 1, false);
                                    i0 e10 = e(f, r0Var, i6);
                                    if (!ta.v.D(c10)) {
                                        c10 = kotlin.jvm.internal.h.m0(c10, e10);
                                    }
                                    return new f1(c10, d1Var.b());
                                }
                                i0 e11 = e(f, r0Var, i6);
                                j1 d10 = j1.d(e11);
                                for (Object obj2 : e11.M0()) {
                                    int i12 = i10 + 1;
                                    if (i10 >= 0) {
                                        d1 d1Var3 = (d1) obj2;
                                        if (!d1Var3.d()) {
                                            b0 a13 = d1Var3.a();
                                            kotlin.jvm.internal.i.f(a13, "substitutedArgument.type");
                                            av.a predicate2 = av.a.f3899u;
                                            kotlin.jvm.internal.i.g(predicate2, "predicate");
                                            if (!k1.c(a13, predicate2)) {
                                                d1 d1Var4 = f.M0().get(i10);
                                                gt.v0 typeParameter = f.O0().getParameters().get(i10);
                                                if (this.f37287b) {
                                                    b0 a14 = d1Var4.a();
                                                    kotlin.jvm.internal.i.f(a14, "unsubstitutedArgument.type");
                                                    b0 a15 = d1Var3.a();
                                                    kotlin.jvm.internal.i.f(a15, "substitutedArgument.type");
                                                    kotlin.jvm.internal.i.f(typeParameter, "typeParameter");
                                                    s0Var.a(d10, a14, a15, typeParameter);
                                                }
                                            }
                                        }
                                        i10 = i12;
                                    } else {
                                        ca.a.t1();
                                        throw null;
                                    }
                                }
                                return new f1(e11, d1Var.b());
                            }
                        }
                    }
                }
                return d1Var;
            } else if (d1Var2.d()) {
                kotlin.jvm.internal.i.d(v0Var);
                return k1.m(v0Var);
            } else {
                m1 R02 = d1Var2.a().R0();
                n1 b10 = d1Var2.b();
                kotlin.jvm.internal.i.f(b10, "argument.projectionKind");
                n1 b11 = d1Var.b();
                kotlin.jvm.internal.i.f(b11, "underlyingProjection.projectionKind");
                if (b11 != b10 && b11 != n1Var2) {
                    if (b10 == n1Var2) {
                        b10 = b11;
                    } else {
                        s0Var.b(u0Var, R02);
                    }
                }
                if (v0Var == null || (n1Var = v0Var.O()) == null) {
                    n1Var = n1Var2;
                }
                if (n1Var != b10 && n1Var != n1Var2) {
                    if (b10 != n1Var2) {
                        s0Var.b(u0Var, R02);
                    }
                    a(a10.getAnnotations(), R02.getAnnotations());
                    if (!(R02 instanceof t)) {
                        t tVar = (t) R02;
                        v0 newAttributes = b(tVar, a10.N0());
                        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
                        d02 = new t(hc.d.F(tVar.f37299w), newAttributes);
                    } else {
                        i0 l2 = k1.l(kotlin.jvm.internal.h.f(R02), a10.P0());
                        kotlin.jvm.internal.i.f(l2, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
                        v0 N0 = a10.N0();
                        boolean E = ta.v.E(l2);
                        d02 = l2;
                        if (!E) {
                            d02 = kotlin.jvm.internal.h.d0(l2, null, b(l2, N0), 1);
                        }
                    }
                    return new f1(d02, n1Var2);
                }
                n1Var2 = b10;
                a(a10.getAnnotations(), R02.getAnnotations());
                if (!(R02 instanceof t)) {
                }
                return new f1(d02, n1Var2);
            }
        }
        throw new AssertionError("Too deep recursion while expanding type alias " + u0Var.getName());
    }

    public final i0 e(i0 i0Var, r0 r0Var, int i6) {
        x0 O0 = i0Var.O0();
        List<d1> M0 = i0Var.M0();
        ArrayList arrayList = new ArrayList(is.i.H1(M0, 10));
        int i10 = 0;
        for (Object obj : M0) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                d1 d1Var = (d1) obj;
                d1 d10 = d(d1Var, r0Var, O0.getParameters().get(i10), i6 + 1);
                if (!d10.d()) {
                    d10 = new f1(k1.k(d10.a(), d1Var.a().P0()), d10.b());
                }
                arrayList.add(d10);
                i10 = i11;
            } else {
                ca.a.t1();
                throw null;
            }
        }
        return kotlin.jvm.internal.h.d0(i0Var, arrayList, null, 2);
    }
}
