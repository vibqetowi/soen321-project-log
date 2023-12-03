package ft;

import dt.n;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
/* compiled from: JavaToKotlinClassMap.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f15851a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f15852b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f15853c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f15854d;

    /* renamed from: e  reason: collision with root package name */
    public static final fu.b f15855e;
    public static final fu.c f;

    /* renamed from: g  reason: collision with root package name */
    public static final fu.b f15856g;

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<fu.d, fu.b> f15857h;

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<fu.d, fu.b> f15858i;

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<fu.d, fu.c> f15859j;

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap<fu.d, fu.c> f15860k;

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap<fu.b, fu.b> f15861l;

    /* renamed from: m  reason: collision with root package name */
    public static final HashMap<fu.b, fu.b> f15862m;

    /* renamed from: n  reason: collision with root package name */
    public static final List<a> f15863n;

    /* compiled from: JavaToKotlinClassMap.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final fu.b f15864a;

        /* renamed from: b  reason: collision with root package name */
        public final fu.b f15865b;

        /* renamed from: c  reason: collision with root package name */
        public final fu.b f15866c;

        public a(fu.b bVar, fu.b bVar2, fu.b bVar3) {
            this.f15864a = bVar;
            this.f15865b = bVar2;
            this.f15866c = bVar3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.i.b(this.f15864a, aVar.f15864a) && kotlin.jvm.internal.i.b(this.f15865b, aVar.f15865b) && kotlin.jvm.internal.i.b(this.f15866c, aVar.f15866c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f15865b.hashCode();
            return this.f15866c.hashCode() + ((hashCode + (this.f15864a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f15864a + ", kotlinReadOnly=" + this.f15865b + ", kotlinMutable=" + this.f15866c + ')';
        }
    }

    static {
        nu.c[] values;
        StringBuilder sb2 = new StringBuilder();
        et.c cVar = et.c.f14549x;
        sb2.append(cVar.f14552u.toString());
        sb2.append('.');
        sb2.append(cVar.f14553v);
        f15851a = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        et.c cVar2 = et.c.f14551z;
        sb3.append(cVar2.f14552u.toString());
        sb3.append('.');
        sb3.append(cVar2.f14553v);
        f15852b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        et.c cVar3 = et.c.f14550y;
        sb4.append(cVar3.f14552u.toString());
        sb4.append('.');
        sb4.append(cVar3.f14553v);
        f15853c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        et.c cVar4 = et.c.A;
        sb5.append(cVar4.f14552u.toString());
        sb5.append('.');
        sb5.append(cVar4.f14553v);
        f15854d = sb5.toString();
        fu.b l2 = fu.b.l(new fu.c("kotlin.jvm.functions.FunctionN"));
        f15855e = l2;
        fu.c b10 = l2.b();
        kotlin.jvm.internal.i.f(b10, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f = b10;
        f15856g = fu.h.f15950m;
        d(Class.class);
        f15857h = new HashMap<>();
        f15858i = new HashMap<>();
        f15859j = new HashMap<>();
        f15860k = new HashMap<>();
        f15861l = new HashMap<>();
        f15862m = new HashMap<>();
        fu.b l10 = fu.b.l(n.a.A);
        fu.c cVar5 = n.a.I;
        fu.c h10 = l10.h();
        fu.c h11 = l10.h();
        kotlin.jvm.internal.i.f(h11, "kotlinReadOnly.packageFqName");
        fu.c c0 = sp.b.c0(cVar5, h11);
        fu.b bVar = new fu.b(h10, c0, false);
        fu.b l11 = fu.b.l(n.a.f13420z);
        fu.c cVar6 = n.a.H;
        fu.c h12 = l11.h();
        fu.c h13 = l11.h();
        kotlin.jvm.internal.i.f(h13, "kotlinReadOnly.packageFqName");
        fu.b bVar2 = new fu.b(h12, sp.b.c0(cVar6, h13), false);
        fu.b l12 = fu.b.l(n.a.B);
        fu.c cVar7 = n.a.J;
        fu.c h14 = l12.h();
        fu.c h15 = l12.h();
        kotlin.jvm.internal.i.f(h15, "kotlinReadOnly.packageFqName");
        fu.b bVar3 = new fu.b(h14, sp.b.c0(cVar7, h15), false);
        fu.b l13 = fu.b.l(n.a.C);
        fu.c cVar8 = n.a.K;
        fu.c h16 = l13.h();
        fu.c h17 = l13.h();
        kotlin.jvm.internal.i.f(h17, "kotlinReadOnly.packageFqName");
        fu.b bVar4 = new fu.b(h16, sp.b.c0(cVar8, h17), false);
        fu.b l14 = fu.b.l(n.a.E);
        fu.c cVar9 = n.a.M;
        fu.c h18 = l14.h();
        fu.c h19 = l14.h();
        kotlin.jvm.internal.i.f(h19, "kotlinReadOnly.packageFqName");
        fu.b bVar5 = new fu.b(h18, sp.b.c0(cVar9, h19), false);
        fu.b l15 = fu.b.l(n.a.D);
        fu.c cVar10 = n.a.L;
        fu.c h20 = l15.h();
        fu.c h21 = l15.h();
        kotlin.jvm.internal.i.f(h21, "kotlinReadOnly.packageFqName");
        fu.b bVar6 = new fu.b(h20, sp.b.c0(cVar10, h21), false);
        fu.c cVar11 = n.a.F;
        fu.b l16 = fu.b.l(cVar11);
        fu.c cVar12 = n.a.N;
        fu.c h22 = l16.h();
        fu.c h23 = l16.h();
        kotlin.jvm.internal.i.f(h23, "kotlinReadOnly.packageFqName");
        fu.b bVar7 = new fu.b(h22, sp.b.c0(cVar12, h23), false);
        fu.b d10 = fu.b.l(cVar11).d(n.a.G.f());
        fu.c cVar13 = n.a.O;
        fu.c h24 = d10.h();
        fu.c h25 = d10.h();
        kotlin.jvm.internal.i.f(h25, "kotlinReadOnly.packageFqName");
        List<a> P0 = ca.a.P0(new a(d(Iterable.class), l10, bVar), new a(d(Iterator.class), l11, bVar2), new a(d(Collection.class), l12, bVar3), new a(d(List.class), l13, bVar4), new a(d(Set.class), l14, bVar5), new a(d(ListIterator.class), l15, bVar6), new a(d(Map.class), l16, bVar7), new a(d(Map.Entry.class), d10, new fu.b(h24, sp.b.c0(cVar13, h25), false)));
        f15863n = P0;
        c(Object.class, n.a.f13395a);
        c(String.class, n.a.f);
        c(CharSequence.class, n.a.f13401e);
        a(d(Throwable.class), fu.b.l(n.a.f13406k));
        c(Cloneable.class, n.a.f13399c);
        c(Number.class, n.a.f13404i);
        a(d(Comparable.class), fu.b.l(n.a.f13407l));
        c(Enum.class, n.a.f13405j);
        a(d(Annotation.class), fu.b.l(n.a.f13413s));
        for (a aVar : P0) {
            fu.b bVar8 = aVar.f15864a;
            fu.b bVar9 = aVar.f15865b;
            a(bVar8, bVar9);
            fu.b bVar10 = aVar.f15866c;
            fu.c b11 = bVar10.b();
            kotlin.jvm.internal.i.f(b11, "mutableClassId.asSingleFqName()");
            b(b11, bVar8);
            f15861l.put(bVar10, bVar9);
            f15862m.put(bVar9, bVar10);
            fu.c b12 = bVar9.b();
            kotlin.jvm.internal.i.f(b12, "readOnlyClassId.asSingleFqName()");
            fu.c b13 = bVar10.b();
            kotlin.jvm.internal.i.f(b13, "mutableClassId.asSingleFqName()");
            fu.d i6 = bVar10.b().i();
            kotlin.jvm.internal.i.f(i6, "mutableClassId.asSingleFqName().toUnsafe()");
            f15859j.put(i6, b12);
            fu.d i10 = b12.i();
            kotlin.jvm.internal.i.f(i10, "readOnlyFqName.toUnsafe()");
            f15860k.put(i10, b13);
        }
        for (nu.c cVar14 : nu.c.values()) {
            fu.b l17 = fu.b.l(cVar14.j());
            dt.k i11 = cVar14.i();
            kotlin.jvm.internal.i.f(i11, "jvmType.primitiveType");
            a(l17, fu.b.l(dt.n.f13390j.c(i11.f13370u)));
        }
        for (fu.b bVar11 : dt.c.f13354a) {
            a(fu.b.l(new fu.c("kotlin.jvm.internal." + bVar11.j().f() + "CompanionObject")), bVar11.d(fu.g.f15934b));
        }
        for (int i12 = 0; i12 < 23; i12++) {
            a(fu.b.l(new fu.c(defpackage.c.p("kotlin.jvm.functions.Function", i12))), new fu.b(dt.n.f13390j, fu.e.j("Function" + i12)));
            b(new fu.c(f15852b + i12), f15856g);
        }
        for (int i13 = 0; i13 < 22; i13++) {
            et.c cVar15 = et.c.A;
            b(new fu.c((cVar15.f14552u.toString() + '.' + cVar15.f14553v) + i13), f15856g);
        }
        fu.c h26 = n.a.f13397b.h();
        kotlin.jvm.internal.i.f(h26, "nothing.toSafe()");
        b(h26, d(Void.class));
    }

    public static void a(fu.b bVar, fu.b bVar2) {
        fu.d i6 = bVar.b().i();
        kotlin.jvm.internal.i.f(i6, "javaClassId.asSingleFqName().toUnsafe()");
        f15857h.put(i6, bVar2);
        fu.c b10 = bVar2.b();
        kotlin.jvm.internal.i.f(b10, "kotlinClassId.asSingleFqName()");
        b(b10, bVar);
    }

    public static void b(fu.c cVar, fu.b bVar) {
        fu.d i6 = cVar.i();
        kotlin.jvm.internal.i.f(i6, "kotlinFqNameUnsafe.toUnsafe()");
        f15858i.put(i6, bVar);
    }

    public static void c(Class cls, fu.d dVar) {
        fu.c h10 = dVar.h();
        kotlin.jvm.internal.i.f(h10, "kotlinFqName.toSafe()");
        a(d(cls), fu.b.l(h10));
    }

    public static fu.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return fu.b.l(new fu.c(cls.getCanonicalName()));
        }
        return d(declaringClass).d(fu.e.j(cls.getSimpleName()));
    }

    public static boolean e(fu.d dVar, String str) {
        boolean z10;
        boolean z11;
        Integer w02;
        String str2 = dVar.f15926a;
        if (str2 != null) {
            String c12 = gv.r.c1(str2, str, "");
            if (c12.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (c12.length() > 0 && ca.a.S(c12.charAt(0), '0', false)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && (w02 = gv.m.w0(c12)) != null && w02.intValue() >= 23) {
                    return true;
                }
                return false;
            }
            return false;
        }
        fu.d.a(4);
        throw null;
    }

    public static fu.b f(fu.c cVar) {
        return f15857h.get(cVar.i());
    }

    public static fu.b g(fu.d dVar) {
        if (e(dVar, f15851a) || e(dVar, f15853c)) {
            return f15855e;
        }
        if (e(dVar, f15852b) || e(dVar, f15854d)) {
            return f15856g;
        }
        return f15858i.get(dVar);
    }
}
