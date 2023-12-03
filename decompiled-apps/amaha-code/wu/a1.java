package wu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import vu.c;
/* compiled from: TypeParameterUpperBoundEraser.kt */
/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public final sc.b f37202a;

    /* renamed from: b  reason: collision with root package name */
    public final sc.b f37203b;

    /* renamed from: c  reason: collision with root package name */
    public final hs.i f37204c;

    /* renamed from: d  reason: collision with root package name */
    public final c.k f37205d;

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final gt.v0 f37206a;

        /* renamed from: b  reason: collision with root package name */
        public final u f37207b;

        public a(gt.v0 typeParameter, u typeAttr) {
            kotlin.jvm.internal.i.g(typeParameter, "typeParameter");
            kotlin.jvm.internal.i.g(typeAttr, "typeAttr");
            this.f37206a = typeParameter;
            this.f37207b = typeAttr;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!kotlin.jvm.internal.i.b(aVar.f37206a, this.f37206a) || !kotlin.jvm.internal.i.b(aVar.f37207b, this.f37207b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = this.f37206a.hashCode();
            return this.f37207b.hashCode() + (hashCode * 31) + hashCode;
        }

        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f37206a + ", typeAttr=" + this.f37207b + ')';
        }
    }

    public a1(ut.e eVar) {
        sc.b bVar = new sc.b(0);
        this.f37202a = eVar;
        this.f37203b = bVar;
        vu.c cVar = new vu.c("Type parameter upper bound erasure results");
        this.f37204c = sp.b.O(new b1(this));
        this.f37205d = cVar.h(new c1(this));
    }

    public final m1 a(u uVar) {
        m1 g02;
        i0 a10 = uVar.a();
        if (a10 == null || (g02 = hc.d.g0(a10)) == null) {
            return (yu.f) this.f37204c.getValue();
        }
        return g02;
    }

    public final b0 b(gt.v0 typeParameter, u typeAttr) {
        kotlin.jvm.internal.i.g(typeParameter, "typeParameter");
        kotlin.jvm.internal.i.g(typeAttr, "typeAttr");
        Object invoke = this.f37205d.invoke(new a(typeParameter, typeAttr));
        kotlin.jvm.internal.i.f(invoke, "getErasedUpperBound(Data…typeParameter, typeAttr))");
        return (b0) invoke;
    }

    public final js.g c(j1 j1Var, List list, u uVar) {
        boolean z10;
        m1 m1Var;
        boolean z11;
        boolean z12;
        boolean z13;
        Iterator it;
        js.g gVar = new js.g();
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            b0 b0Var = (b0) it2.next();
            gt.g a10 = b0Var.O0().a();
            boolean z14 = a10 instanceof gt.e;
            sc.b bVar = this.f37203b;
            if (z14) {
                Set<gt.v0> c10 = uVar.c();
                bVar.getClass();
                m1 R0 = b0Var.R0();
                if (R0 instanceof v) {
                    v vVar = (v) R0;
                    i0 i0Var = vVar.f37298v;
                    if (!i0Var.O0().getParameters().isEmpty() && i0Var.O0().a() != null) {
                        List<gt.v0> parameters = i0Var.O0().getParameters();
                        kotlin.jvm.internal.i.f(parameters, "constructor.parameters");
                        ArrayList arrayList = new ArrayList(is.i.H1(parameters, 10));
                        Iterator it3 = parameters.iterator();
                        while (it3.hasNext()) {
                            gt.v0 v0Var = (gt.v0) it3.next();
                            d1 d1Var = (d1) is.u.j2(v0Var.getIndex(), b0Var.M0());
                            if (c10 != null && c10.contains(v0Var)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (d1Var != null && !z13) {
                                g1 g5 = j1Var.g();
                                it = it3;
                                b0 a11 = d1Var.a();
                                kotlin.jvm.internal.i.f(a11, "argument.type");
                                if (g5.d(a11) != null) {
                                    arrayList.add(d1Var);
                                    it3 = it;
                                }
                            } else {
                                it = it3;
                            }
                            d1Var = new n0(v0Var);
                            arrayList.add(d1Var);
                            it3 = it;
                        }
                        i0Var = kotlin.jvm.internal.h.d0(i0Var, arrayList, null, 2);
                    }
                    i0 i0Var2 = vVar.f37299w;
                    if (!i0Var2.O0().getParameters().isEmpty() && i0Var2.O0().a() != null) {
                        List<gt.v0> parameters2 = i0Var2.O0().getParameters();
                        kotlin.jvm.internal.i.f(parameters2, "constructor.parameters");
                        ArrayList arrayList2 = new ArrayList(is.i.H1(parameters2, 10));
                        for (gt.v0 v0Var2 : parameters2) {
                            d1 d1Var2 = (d1) is.u.j2(v0Var2.getIndex(), b0Var.M0());
                            if (c10 != null && c10.contains(v0Var2)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (d1Var2 != null && !z12) {
                                g1 g10 = j1Var.g();
                                b0 a12 = d1Var2.a();
                                kotlin.jvm.internal.i.f(a12, "argument.type");
                                if (g10.d(a12) != null) {
                                    arrayList2.add(d1Var2);
                                }
                            }
                            d1Var2 = new n0(v0Var2);
                            arrayList2.add(d1Var2);
                        }
                        i0Var2 = kotlin.jvm.internal.h.d0(i0Var2, arrayList2, null, 2);
                    }
                    m1Var = c0.c(i0Var, i0Var2);
                } else if (R0 instanceof i0) {
                    i0 i0Var3 = (i0) R0;
                    if (!i0Var3.O0().getParameters().isEmpty() && i0Var3.O0().a() != null) {
                        List<gt.v0> parameters3 = i0Var3.O0().getParameters();
                        kotlin.jvm.internal.i.f(parameters3, "constructor.parameters");
                        ArrayList arrayList3 = new ArrayList(is.i.H1(parameters3, 10));
                        for (gt.v0 v0Var3 : parameters3) {
                            d1 d1Var3 = (d1) is.u.j2(v0Var3.getIndex(), b0Var.M0());
                            if (c10 != null && c10.contains(v0Var3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (d1Var3 != null && !z11) {
                                g1 g11 = j1Var.g();
                                b0 a13 = d1Var3.a();
                                kotlin.jvm.internal.i.f(a13, "argument.type");
                                if (g11.d(a13) != null) {
                                    arrayList3.add(d1Var3);
                                }
                            }
                            d1Var3 = new n0(v0Var3);
                            arrayList3.add(d1Var3);
                        }
                        m1Var = kotlin.jvm.internal.h.d0(i0Var3, arrayList3, null, 2);
                    } else {
                        m1Var = i0Var3;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                gVar.add(j1Var.i(ca.a.B0(m1Var, R0), n1.OUT_VARIANCE));
            } else if (a10 instanceof gt.v0) {
                Set<gt.v0> c11 = uVar.c();
                if (c11 != null && c11.contains(a10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    gVar.add(a(uVar));
                } else {
                    List<b0> upperBounds = ((gt.v0) a10).getUpperBounds();
                    kotlin.jvm.internal.i.f(upperBounds, "declaration.upperBounds");
                    gVar.addAll(c(j1Var, upperBounds, uVar));
                }
            }
            bVar.getClass();
        }
        ca.a.q(gVar);
        return gVar;
    }
}
