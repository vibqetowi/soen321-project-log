package xu;

import dt.n;
import gt.v0;
import gt.z;
import is.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.y;
import t0.l0;
import ta.v;
import wu.b0;
import wu.c0;
import wu.d1;
import wu.f1;
import wu.h0;
import wu.i0;
import wu.j1;
import wu.k1;
import wu.m1;
import wu.n1;
import wu.p0;
import wu.t;
import wu.x0;
import wu.z0;
import xu.d;
/* compiled from: ClassicTypeSystemContext.kt */
/* loaded from: classes2.dex */
public interface a extends zu.n {

    /* compiled from: ClassicTypeSystemContext.kt */
    /* renamed from: xu.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0645a {
        public static List A(zu.m mVar) {
            if (mVar instanceof v0) {
                List<b0> upperBounds = ((v0) mVar).getUpperBounds();
                kotlin.jvm.internal.i.f(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + y.a(mVar.getClass())).toString());
        }

        public static int B(zu.k receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof d1) {
                n1 b10 = ((d1) receiver).b();
                kotlin.jvm.internal.i.f(b10, "this.projectionKind");
                return l0.g(b10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static int C(zu.m receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                n1 O = ((v0) receiver).O();
                kotlin.jvm.internal.i.f(O, "this.variance");
                return l0.g(O);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean D(zu.h receiver, fu.c cVar) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof b0) {
                return ((b0) receiver).getAnnotations().H(cVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean E(zu.m mVar, zu.l lVar) {
            boolean z10;
            if (mVar instanceof v0) {
                if (lVar == null) {
                    z10 = true;
                } else {
                    z10 = lVar instanceof x0;
                }
                if (z10) {
                    return hc.d.R((v0) mVar, (x0) lVar, null);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + y.a(mVar.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + y.a(mVar.getClass())).toString());
        }

        public static boolean F(zu.i a10, zu.i b10) {
            kotlin.jvm.internal.i.g(a10, "a");
            kotlin.jvm.internal.i.g(b10, "b");
            if (a10 instanceof i0) {
                if (b10 instanceof i0) {
                    if (((i0) a10).M0() == ((i0) b10).M0()) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b10 + ", " + y.a(b10.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a10 + ", " + y.a(a10.getClass())).toString());
        }

        public static boolean G(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                return dt.j.K((x0) receiver, n.a.f13395a);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean H(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                return ((x0) receiver).a() instanceof gt.e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean I(zu.l lVar) {
            gt.e eVar;
            boolean z10;
            if (lVar instanceof x0) {
                gt.g a10 = ((x0) lVar).a();
                if (a10 instanceof gt.e) {
                    eVar = (gt.e) a10;
                } else {
                    eVar = null;
                }
                if (eVar == null) {
                    return false;
                }
                if (eVar.m() == z.FINAL && eVar.j() != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || eVar.j() == 4 || eVar.j() == 5) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + y.a(lVar.getClass())).toString());
        }

        public static boolean J(a aVar, zu.h receiver) {
            wu.o oVar;
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            i0 e10 = aVar.e(receiver);
            if (e10 != null) {
                oVar = aVar.v(e10);
            } else {
                oVar = null;
            }
            if (oVar != null) {
                return true;
            }
            return false;
        }

        public static boolean K(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                return ((x0) receiver).d();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean L(zu.h receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof b0) {
                return v.E((b0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean M(zu.l receiver) {
            gt.e eVar;
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                gt.g a10 = ((x0) receiver).a();
                gt.x0<i0> x0Var = null;
                if (a10 instanceof gt.e) {
                    eVar = (gt.e) a10;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    x0Var = eVar.B0();
                }
                return x0Var instanceof gt.v;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean N(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                return receiver instanceof ku.m;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean O(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                return receiver instanceof wu.z;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean P(zu.i receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof i0) {
                return ((i0) receiver).P0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean Q(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                return dt.j.K((x0) receiver, n.a.f13397b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean R(zu.h receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof b0) {
                return k1.g((b0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean S(zu.i receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof b0) {
                return dt.j.H((b0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean T(zu.d dVar) {
            if (dVar instanceof g) {
                return ((g) dVar).A;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + y.a(dVar.getClass())).toString());
        }

        public static boolean U(zu.k receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof d1) {
                return ((d1) receiver).d();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean V(zu.i receiver) {
            boolean z10;
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof i0) {
                b0 b0Var = (b0) receiver;
                if (b0Var instanceof wu.c) {
                    return true;
                }
                if ((b0Var instanceof wu.o) && (((wu.o) b0Var).f37280v instanceof wu.c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean W(zu.i receiver) {
            boolean z10;
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof i0) {
                b0 b0Var = (b0) receiver;
                if (b0Var instanceof p0) {
                    return true;
                }
                if ((b0Var instanceof wu.o) && (((wu.o) b0Var).f37280v instanceof p0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static boolean X(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                gt.g a10 = ((x0) receiver).a();
                if (a10 != null && dt.j.L(a10)) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static i0 Y(zu.f fVar) {
            if (fVar instanceof wu.v) {
                return ((wu.v) fVar).f37298v;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + y.a(fVar.getClass())).toString());
        }

        public static zu.i Z(a aVar, zu.h receiver) {
            i0 c10;
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            wu.v y10 = aVar.y(receiver);
            if (y10 == null || (c10 = aVar.c(y10)) == null) {
                i0 e10 = aVar.e(receiver);
                kotlin.jvm.internal.i.d(e10);
                return e10;
            }
            return c10;
        }

        public static boolean a(zu.l c12, zu.l c22) {
            kotlin.jvm.internal.i.g(c12, "c1");
            kotlin.jvm.internal.i.g(c22, "c2");
            if (c12 instanceof x0) {
                if (c22 instanceof x0) {
                    return kotlin.jvm.internal.i.b(c12, c22);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c22 + ", " + y.a(c22.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + y.a(c12.getClass())).toString());
        }

        public static m1 a0(zu.d dVar) {
            if (dVar instanceof g) {
                return ((g) dVar).f38101x;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + y.a(dVar.getClass())).toString());
        }

        public static int b(zu.h receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof b0) {
                return ((b0) receiver).M0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static m1 b0(zu.h hVar) {
            if (hVar instanceof m1) {
                return kotlin.jvm.internal.h.R((m1) hVar, false);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + y.a(hVar.getClass())).toString());
        }

        public static zu.j c(zu.i receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof i0) {
                return (zu.j) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static i0 c0(zu.e eVar) {
            if (eVar instanceof wu.o) {
                return ((wu.o) eVar).f37280v;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + eVar + ", " + y.a(eVar.getClass())).toString());
        }

        public static zu.d d(a aVar, zu.i receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof i0) {
                if (receiver instanceof wu.l0) {
                    return aVar.g(((wu.l0) receiver).f37267v);
                }
                if (receiver instanceof g) {
                    return (g) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static int d0(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                return ((x0) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static wu.o e(zu.i receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof i0) {
                if (receiver instanceof wu.o) {
                    return (wu.o) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static Set e0(a aVar, zu.i receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            x0 b10 = aVar.b(receiver);
            if (b10 instanceof ku.m) {
                return ((ku.m) b10).f23949c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static t f(zu.f fVar) {
            if (fVar instanceof wu.v) {
                if (fVar instanceof t) {
                    return (t) fVar;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + y.a(fVar.getClass())).toString());
        }

        public static d1 f0(zu.c receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).f38105a;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static wu.v g(zu.h receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof b0) {
                m1 R0 = ((b0) receiver).R0();
                if (R0 instanceof wu.v) {
                    return (wu.v) R0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static int g0(a aVar, zu.j receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof zu.i) {
                return aVar.I((zu.h) receiver);
            }
            if (receiver instanceof zu.a) {
                return ((zu.a) receiver).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static h0 h(wu.v vVar) {
            if (vVar instanceof h0) {
                return (h0) vVar;
            }
            return null;
        }

        public static b h0(a aVar, zu.i iVar) {
            if (iVar instanceof i0) {
                return new b(aVar, j1.e(z0.f37326b.a((b0) iVar)));
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + y.a(iVar.getClass())).toString());
        }

        public static i0 i(zu.h receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof b0) {
                m1 R0 = ((b0) receiver).R0();
                if (R0 instanceof i0) {
                    return (i0) R0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static Collection i0(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                Collection<b0> c10 = ((x0) receiver).c();
                kotlin.jvm.internal.i.f(c10, "this.supertypes");
                return c10;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static f1 j(zu.h receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof b0) {
                return hc.d.g((b0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static x0 j0(zu.i receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof i0) {
                return ((i0) receiver).O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static i0 k(zu.i iVar) {
            ArrayList arrayList;
            boolean z10;
            m1 m1Var;
            zu.b bVar = zu.b.FOR_SUBTYPING;
            if (iVar instanceof i0) {
                i0 i0Var = (i0) iVar;
                if (i0Var.M0().size() == i0Var.O0().getParameters().size()) {
                    List<d1> M0 = i0Var.M0();
                    boolean z11 = M0 instanceof Collection;
                    n1 n1Var = n1.INVARIANT;
                    boolean z12 = true;
                    if (!z11 || !M0.isEmpty()) {
                        Iterator<T> it = M0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((d1) it.next()).b() == n1Var) {
                                z10 = true;
                                continue;
                            } else {
                                z10 = false;
                                continue;
                            }
                            if (!z10) {
                                z12 = false;
                                break;
                            }
                        }
                    }
                    if (!z12) {
                        List<v0> parameters = i0Var.O0().getParameters();
                        kotlin.jvm.internal.i.f(parameters, "type.constructor.parameters");
                        ArrayList O2 = u.O2(M0, parameters);
                        arrayList = new ArrayList(is.i.H1(O2, 10));
                        Iterator it2 = O2.iterator();
                        while (it2.hasNext()) {
                            hs.f fVar = (hs.f) it2.next();
                            d1 d1Var = (d1) fVar.f19464u;
                            v0 parameter = (v0) fVar.f19465v;
                            if (d1Var.b() != n1Var) {
                                if (!d1Var.d() && d1Var.b() == n1.IN_VARIANCE) {
                                    m1Var = d1Var.a().R0();
                                } else {
                                    m1Var = null;
                                }
                                kotlin.jvm.internal.i.f(parameter, "parameter");
                                d1Var = hc.d.g(new g(bVar, new i(d1Var, null, null, parameter, 6), m1Var, (wu.v0) null, false, 56));
                            }
                            arrayList.add(d1Var);
                        }
                        j1 e10 = j1.e(z0.f37326b.b(i0Var.O0(), arrayList));
                        int size = M0.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            d1 d1Var2 = M0.get(i6);
                            d1 d1Var3 = (d1) arrayList.get(i6);
                            if (d1Var2.b() != n1Var) {
                                List<b0> upperBounds = i0Var.O0().getParameters().get(i6).getUpperBounds();
                                kotlin.jvm.internal.i.f(upperBounds, "type.constructor.parameters[index].upperBounds");
                                ArrayList arrayList2 = new ArrayList();
                                for (b0 b0Var : upperBounds) {
                                    arrayList2.add(d.a.f38096v.p(e10.i(b0Var, n1Var).R0()));
                                }
                                if (!d1Var2.d() && d1Var2.b() == n1.OUT_VARIANCE) {
                                    arrayList2.add(d.a.f38096v.p(d1Var2.a().R0()));
                                }
                                b0 a10 = d1Var3.a();
                                kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                i iVar2 = ((g) a10).f38100w;
                                iVar2.getClass();
                                iVar2.f38106b = new j(arrayList2);
                            }
                        }
                        if (arrayList != null) {
                            return null;
                        }
                        return c0.f(i0Var.N0(), i0Var.O0(), arrayList, i0Var.P0(), null);
                    }
                }
                arrayList = null;
                if (arrayList != null) {
                }
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + y.a(iVar.getClass())).toString());
            }
        }

        public static i k0(zu.d receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof g) {
                return ((g) receiver).f38100w;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static zu.b l(zu.d receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof g) {
                return ((g) receiver).f38099v;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static zu.l l0(a aVar, zu.h receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            zu.i e10 = aVar.e(receiver);
            if (e10 == null) {
                e10 = aVar.o0(receiver);
            }
            return aVar.b(e10);
        }

        public static m1 m(a aVar, zu.i lowerBound, zu.i upperBound) {
            kotlin.jvm.internal.i.g(lowerBound, "lowerBound");
            kotlin.jvm.internal.i.g(upperBound, "upperBound");
            if (lowerBound instanceof i0) {
                if (upperBound instanceof i0) {
                    return c0.c((i0) lowerBound, (i0) upperBound);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + aVar + ", " + y.a(aVar.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + aVar + ", " + y.a(aVar.getClass())).toString());
        }

        public static i0 m0(zu.f fVar) {
            if (fVar instanceof wu.v) {
                return ((wu.v) fVar).f37299w;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + y.a(fVar.getClass())).toString());
        }

        public static zu.k n(a aVar, zu.j receiver, int i6) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof zu.i) {
                return aVar.T((zu.h) receiver, i6);
            }
            if (receiver instanceof zu.a) {
                zu.k kVar = ((zu.a) receiver).get(i6);
                kotlin.jvm.internal.i.f(kVar, "get(index)");
                return kVar;
            }
            throw new IllegalStateException(("unknown type argument list type: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static zu.i n0(a aVar, zu.h receiver) {
            i0 d10;
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            wu.v y10 = aVar.y(receiver);
            if (y10 == null || (d10 = aVar.d(y10)) == null) {
                i0 e10 = aVar.e(receiver);
                kotlin.jvm.internal.i.d(e10);
                return e10;
            }
            return d10;
        }

        public static zu.k o(zu.h receiver, int i6) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof b0) {
                return ((b0) receiver).M0().get(i6);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static i0 o0(zu.i receiver, boolean z10) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof i0) {
                return ((i0) receiver).S0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static List p(zu.h receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof b0) {
                return ((b0) receiver).M0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static zu.h p0(a aVar, zu.h hVar) {
            if (hVar instanceof zu.i) {
                return aVar.f((zu.i) hVar, true);
            }
            if (hVar instanceof zu.f) {
                zu.f fVar = (zu.f) hVar;
                return aVar.m0(aVar.f(aVar.c(fVar), true), aVar.f(aVar.d(fVar), true));
            }
            throw new IllegalStateException("sealed".toString());
        }

        public static fu.d q(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                gt.g a10 = ((x0) receiver).a();
                kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return mu.a.h((gt.e) a10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static zu.m r(zu.l receiver, int i6) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                v0 v0Var = ((x0) receiver).getParameters().get(i6);
                kotlin.jvm.internal.i.f(v0Var, "this.parameters[index]");
                return v0Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static List s(zu.l lVar) {
            if (lVar instanceof x0) {
                List<v0> parameters = ((x0) lVar).getParameters();
                kotlin.jvm.internal.i.f(parameters, "this.parameters");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + y.a(lVar.getClass())).toString());
        }

        public static dt.k t(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                gt.g a10 = ((x0) receiver).a();
                kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return dt.j.s((gt.e) a10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static dt.k u(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                gt.g a10 = ((x0) receiver).a();
                kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return dt.j.u((gt.e) a10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static b0 v(zu.m mVar) {
            if (mVar instanceof v0) {
                return hc.d.M((v0) mVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + y.a(mVar.getClass())).toString());
        }

        public static m1 w(zu.k receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof d1) {
                return ((d1) receiver).a().R0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static v0 x(zu.p pVar) {
            if (pVar instanceof m) {
                return ((m) pVar).b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + y.a(pVar.getClass())).toString());
        }

        public static v0 y(zu.l receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof x0) {
                gt.g a10 = ((x0) receiver).a();
                if (a10 instanceof v0) {
                    return (v0) a10;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }

        public static i0 z(zu.h receiver) {
            kotlin.jvm.internal.i.g(receiver, "$receiver");
            if (receiver instanceof b0) {
                return iu.i.e((b0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + y.a(receiver.getClass())).toString());
        }
    }

    @Override // zu.n
    x0 b(zu.i iVar);

    @Override // zu.n
    i0 c(zu.f fVar);

    @Override // zu.n
    i0 d(zu.f fVar);

    @Override // zu.n
    i0 e(zu.h hVar);

    @Override // zu.n
    i0 f(zu.i iVar, boolean z10);

    @Override // zu.n
    zu.d g(zu.i iVar);

    m1 m0(zu.i iVar, zu.i iVar2);
}
