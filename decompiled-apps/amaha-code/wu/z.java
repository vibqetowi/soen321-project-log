package wu;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import pu.n;
/* compiled from: IntersectionTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class z implements x0, zu.g {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f37320a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet<b0> f37321b;

    /* renamed from: c  reason: collision with root package name */
    public final int f37322c;

    /* compiled from: IntersectionTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<xu.e, i0> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final i0 invoke(xu.e eVar) {
            xu.e kotlinTypeRefiner = eVar;
            kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return z.this.h(kotlinTypeRefiner).f();
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ss.l f37324u;

        public b(ss.l lVar) {
            this.f37324u = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            b0 it = (b0) t3;
            kotlin.jvm.internal.i.f(it, "it");
            ss.l lVar = this.f37324u;
            String obj = lVar.invoke(it).toString();
            b0 it2 = (b0) t10;
            kotlin.jvm.internal.i.f(it2, "it");
            return sp.b.g(obj, lVar.invoke(it2).toString());
        }
    }

    /* compiled from: IntersectionTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<b0, CharSequence> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ss.l<b0, Object> f37325u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ss.l<? super b0, ? extends Object> lVar) {
            super(1);
            this.f37325u = lVar;
        }

        @Override // ss.l
        public final CharSequence invoke(b0 b0Var) {
            b0 it = b0Var;
            kotlin.jvm.internal.i.f(it, "it");
            return this.f37325u.invoke(it).toString();
        }
    }

    public z(AbstractCollection typesToIntersect) {
        kotlin.jvm.internal.i.g(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<b0> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f37321b = linkedHashSet;
        this.f37322c = linkedHashSet.hashCode();
    }

    @Override // wu.x0
    public final gt.g a() {
        return null;
    }

    @Override // wu.x0
    public final Collection<b0> c() {
        return this.f37321b;
    }

    @Override // wu.x0
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        return kotlin.jvm.internal.i.b(this.f37321b, ((z) obj).f37321b);
    }

    public final i0 f() {
        v0.f37300v.getClass();
        return c0.h(v0.f37301w, this, is.w.f20676u, false, n.a.a("member scope for intersection type", this.f37321b), new a());
    }

    public final String g(ss.l<? super b0, ? extends Object> getProperTypeRelatedToStringify) {
        kotlin.jvm.internal.i.g(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return is.u.m2(is.u.D2(this.f37321b, new b(getProperTypeRelatedToStringify)), " & ", "{", "}", new c(getProperTypeRelatedToStringify), 24);
    }

    @Override // wu.x0
    public final List<gt.v0> getParameters() {
        return is.w.f20676u;
    }

    public final z h(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        LinkedHashSet<b0> linkedHashSet = this.f37321b;
        ArrayList arrayList = new ArrayList(is.i.H1(linkedHashSet, 10));
        boolean z10 = false;
        for (b0 b0Var : linkedHashSet) {
            arrayList.add(b0Var.Q0(kotlinTypeRefiner));
            z10 = true;
        }
        z zVar = null;
        b0 b0Var2 = null;
        if (z10) {
            b0 b0Var3 = this.f37320a;
            if (b0Var3 != null) {
                b0Var2 = b0Var3.Q0(kotlinTypeRefiner);
            }
            zVar = new z(new z(arrayList).f37321b, b0Var2);
        }
        if (zVar == null) {
            return this;
        }
        return zVar;
    }

    public final int hashCode() {
        return this.f37322c;
    }

    @Override // wu.x0
    public final dt.j o() {
        dt.j o10 = this.f37321b.iterator().next().O0().o();
        kotlin.jvm.internal.i.f(o10, "intersectedTypes.iterato…xt().constructor.builtIns");
        return o10;
    }

    public final String toString() {
        return g(a0.f37201u);
    }

    public z(LinkedHashSet linkedHashSet, b0 b0Var) {
        this(linkedHashSet);
        this.f37320a = b0Var;
    }
}
