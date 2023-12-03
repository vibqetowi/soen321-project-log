package xu;

import is.u;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import ta.v;
import wu.b0;
import wu.c0;
import wu.i0;
import wu.m1;
import wu.o;
import wu.p0;
import wu.t0;
import wu.v0;
import wu.w0;
import wu.x0;
import wu.z;
import xu.k;
/* compiled from: IntersectionType.kt */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f38122a = new p();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntersectionType.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: u  reason: collision with root package name */
        public static final c f38123u;

        /* renamed from: v  reason: collision with root package name */
        public static final C0646a f38124v;

        /* renamed from: w  reason: collision with root package name */
        public static final d f38125w;

        /* renamed from: x  reason: collision with root package name */
        public static final b f38126x;

        /* renamed from: y  reason: collision with root package name */
        public static final /* synthetic */ a[] f38127y;

        /* compiled from: IntersectionType.kt */
        /* renamed from: xu.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0646a extends a {
            public C0646a() {
                super("ACCEPT_NULL", 1);
            }

            @Override // xu.p.a
            public final a d(m1 nextType) {
                kotlin.jvm.internal.i.g(nextType, "nextType");
                return a.f(nextType);
            }
        }

        /* compiled from: IntersectionType.kt */
        /* loaded from: classes2.dex */
        public static final class b extends a {
            public b() {
                super("NOT_NULL", 3);
            }

            @Override // xu.p.a
            public final a d(m1 nextType) {
                kotlin.jvm.internal.i.g(nextType, "nextType");
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        /* loaded from: classes2.dex */
        public static final class c extends a {
            public c() {
                super("START", 0);
            }

            @Override // xu.p.a
            public final a d(m1 nextType) {
                kotlin.jvm.internal.i.g(nextType, "nextType");
                return a.f(nextType);
            }
        }

        /* compiled from: IntersectionType.kt */
        /* loaded from: classes2.dex */
        public static final class d extends a {
            public d() {
                super("UNKNOWN", 2);
            }

            @Override // xu.p.a
            public final a d(m1 nextType) {
                kotlin.jvm.internal.i.g(nextType, "nextType");
                a f = a.f(nextType);
                if (f == a.f38124v) {
                    return this;
                }
                return f;
            }
        }

        static {
            c cVar = new c();
            f38123u = cVar;
            C0646a c0646a = new C0646a();
            f38124v = c0646a;
            d dVar = new d();
            f38125w = dVar;
            b bVar = new b();
            f38126x = bVar;
            f38127y = new a[]{cVar, c0646a, dVar, bVar};
        }

        public a() {
            throw null;
        }

        public a(String str, int i6) {
        }

        public static a f(m1 m1Var) {
            kotlin.jvm.internal.i.g(m1Var, "<this>");
            if (m1Var.P0()) {
                return f38124v;
            }
            boolean z10 = m1Var instanceof wu.o;
            b bVar = f38126x;
            if (!z10 || !(((wu.o) m1Var).f37280v instanceof p0)) {
                boolean z11 = m1Var instanceof p0;
                d dVar = f38125w;
                if (z11 || !sc.b.M(v.p(false, true, f6.b.M, null, null, 24), ca.a.V0(m1Var), w0.b.C0626b.f37310a)) {
                    return dVar;
                }
            }
            return bVar;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f38127y.clone();
        }

        public abstract a d(m1 m1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(AbstractCollection abstractCollection, ss.p pVar) {
        boolean z10;
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.i.f(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            i0 upper = (i0) it.next();
            boolean z11 = false;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    i0 lower = (i0) it2.next();
                    if (lower != upper) {
                        kotlin.jvm.internal.i.f(lower, "lower");
                        kotlin.jvm.internal.i.f(upper, "upper");
                        if (((Boolean) pVar.invoke(lower, upper)).booleanValue()) {
                            z10 = true;
                            continue;
                            if (z10) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    continue;
                    if (z10) {
                    }
                }
            }
            if (z11) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [wu.v0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [cv.d, wu.v0, cv.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v18, types: [wu.i0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [wu.i0, java.lang.Object, wu.b0] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final i0 b(ArrayList arrayList) {
        i0 i0Var;
        i0 f;
        wu.i c10;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i0 i0Var2 = (i0) it.next();
            if (i0Var2.O0() instanceof z) {
                Collection<b0> c11 = i0Var2.O0().c();
                kotlin.jvm.internal.i.f(c11, "type.constructor.supertypes");
                ArrayList arrayList3 = new ArrayList(is.i.H1(c11, 10));
                for (b0 it2 : c11) {
                    kotlin.jvm.internal.i.f(it2, "it");
                    i0 A1 = ca.a.A1(it2);
                    if (i0Var2.P0()) {
                        A1 = A1.S0(true);
                    }
                    arrayList3.add(A1);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(i0Var2);
            }
        }
        a aVar = a.f38123u;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            aVar = aVar.d((m1) it3.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            i0 i0Var3 = (i0) it4.next();
            if (aVar == a.f38126x) {
                if (i0Var3 instanceof g) {
                    g gVar = (g) i0Var3;
                    kotlin.jvm.internal.i.g(gVar, "<this>");
                    i0Var3 = new g(gVar.f38099v, gVar.f38100w, gVar.f38101x, gVar.f38102y, gVar.f38103z, true);
                }
                kotlin.jvm.internal.i.g(i0Var3, "<this>");
                i0 a10 = o.a.a(i0Var3, false);
                if (a10 == null && (a10 = kotlin.jvm.internal.h.S(i0Var3)) == null) {
                    i0Var3 = i0Var3.S0(false);
                } else {
                    i0Var3 = a10;
                }
            }
            linkedHashSet.add(i0Var3);
        }
        ArrayList arrayList4 = new ArrayList(is.i.H1(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((i0) it5.next()).N0());
        }
        Iterator it6 = arrayList4.iterator();
        if (it6.hasNext()) {
            ?? next = it6.next();
            while (true) {
                i0Var = null;
                if (!it6.hasNext()) {
                    break;
                }
                v0 other = (v0) it6.next();
                next = (v0) next;
                next.getClass();
                kotlin.jvm.internal.i.g(other, "other");
                if (!next.isEmpty() || !other.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    Collection<Number> values = v0.f37300v.f12111a.values();
                    kotlin.jvm.internal.i.f(values, "idPerType.values");
                    for (Number number : values) {
                        int intValue = number.intValue();
                        t0 t0Var = (t0) next.f12057u.get(intValue);
                        t0 t0Var2 = (t0) other.f12057u.get(intValue);
                        if (t0Var == null) {
                            if (t0Var2 != null) {
                                c10 = t0Var2.c(t0Var);
                            } else {
                                c10 = null;
                            }
                        } else {
                            c10 = t0Var.c(t0Var2);
                        }
                        ca.a.g(c10, arrayList5);
                    }
                    next = v0.a.c(arrayList5);
                }
            }
            v0 v0Var = (v0) next;
            if (linkedHashSet.size() == 1) {
                f = (i0) u.x2(linkedHashSet);
            } else {
                new q(linkedHashSet);
                ArrayList a11 = a(linkedHashSet, new r(this));
                a11.isEmpty();
                if (!a11.isEmpty()) {
                    Iterator it7 = a11.iterator();
                    if (it7.hasNext()) {
                        ?? next2 = it7.next();
                        while (it7.hasNext()) {
                            i0 i0Var4 = (i0) it7.next();
                            next2 = (i0) next2;
                            if (next2 != 0 && i0Var4 != null) {
                                x0 O0 = next2.O0();
                                x0 O02 = i0Var4.O0();
                                boolean z10 = O0 instanceof ku.m;
                                if (z10 && (O02 instanceof ku.m)) {
                                    ku.m mVar = (ku.m) O0;
                                    Set<b0> set = mVar.f23949c;
                                    Set<b0> other2 = ((ku.m) O02).f23949c;
                                    kotlin.jvm.internal.i.g(set, "<this>");
                                    kotlin.jvm.internal.i.g(other2, "other");
                                    Set L2 = u.L2(set);
                                    is.q.R1(other2, L2);
                                    ku.m mVar2 = new ku.m(mVar.f23947a, mVar.f23948b, L2);
                                    v0.f37300v.getClass();
                                    next2 = c0.d(v0.f37301w, mVar2);
                                } else if (z10) {
                                    if (((ku.m) O0).f23949c.contains(i0Var4)) {
                                        next2 = i0Var4;
                                    }
                                } else if ((O02 instanceof ku.m) && ((ku.m) O02).f23949c.contains(next2)) {
                                }
                            }
                            next2 = 0;
                        }
                        i0Var = next2;
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                }
                if (i0Var != null) {
                    f = i0Var;
                } else {
                    k.f38114b.getClass();
                    ArrayList a12 = a(a11, new s(k.a.f38116b));
                    a12.isEmpty();
                    if (a12.size() < 2) {
                        f = (i0) u.x2(a12);
                    } else {
                        f = new z(linkedHashSet).f();
                    }
                }
            }
            return f.U0(v0Var);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
