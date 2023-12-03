package pu;

import gt.s0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import pu.k;
import wu.g1;
import wu.j1;
/* compiled from: SubstitutingScope.kt */
/* loaded from: classes2.dex */
public final class m implements i {

    /* renamed from: b  reason: collision with root package name */
    public final i f29013b;

    /* renamed from: c  reason: collision with root package name */
    public final j1 f29014c;

    /* renamed from: d  reason: collision with root package name */
    public HashMap f29015d;

    /* renamed from: e  reason: collision with root package name */
    public final hs.i f29016e;

    /* compiled from: SubstitutingScope.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<Collection<? extends gt.j>> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final Collection<? extends gt.j> invoke() {
            m mVar = m.this;
            return mVar.i(k.a.a(mVar.f29013b, null, 3));
        }
    }

    /* compiled from: SubstitutingScope.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<j1> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ j1 f29018u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j1 j1Var) {
            super(0);
            this.f29018u = j1Var;
        }

        @Override // ss.a
        public final j1 invoke() {
            g1 g5 = this.f29018u.g();
            g5.getClass();
            return j1.e(g5);
        }
    }

    public m(i workerScope, j1 givenSubstitutor) {
        kotlin.jvm.internal.i.g(workerScope, "workerScope");
        kotlin.jvm.internal.i.g(givenSubstitutor, "givenSubstitutor");
        this.f29013b = workerScope;
        sp.b.O(new b(givenSubstitutor));
        g1 g5 = givenSubstitutor.g();
        kotlin.jvm.internal.i.f(g5, "givenSubstitutor.substitution");
        this.f29014c = j1.e(ju.d.b(g5));
        this.f29016e = sp.b.O(new a());
    }

    @Override // pu.i
    public final Collection a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return i(this.f29013b.a(name, cVar));
    }

    @Override // pu.i
    public final Set<fu.e> b() {
        return this.f29013b.b();
    }

    @Override // pu.i
    public final Collection c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return i(this.f29013b.c(name, cVar));
    }

    @Override // pu.i
    public final Set<fu.e> d() {
        return this.f29013b.d();
    }

    @Override // pu.i
    public final Set<fu.e> e() {
        return this.f29013b.e();
    }

    @Override // pu.k
    public final Collection<gt.j> f(d kindFilter, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        return (Collection) this.f29016e.getValue();
    }

    @Override // pu.k
    public final gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        gt.g g5 = this.f29013b.g(name, cVar);
        if (g5 != null) {
            return (gt.g) h(g5);
        }
        return null;
    }

    public final <D extends gt.j> D h(D d10) {
        j1 j1Var = this.f29014c;
        if (j1Var.h()) {
            return d10;
        }
        if (this.f29015d == null) {
            this.f29015d = new HashMap();
        }
        HashMap hashMap = this.f29015d;
        kotlin.jvm.internal.i.d(hashMap);
        Object obj = hashMap.get(d10);
        if (obj == null) {
            if (d10 instanceof s0) {
                obj = ((s0) d10).d(j1Var);
                if (obj != null) {
                    hashMap.put(d10, obj);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d10 + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d10).toString());
            }
        }
        return (D) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends gt.j> Collection<D> i(Collection<? extends D> collection) {
        if (this.f29014c.h()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        int i6 = 3;
        if (size >= 3) {
            i6 = (size / 3) + size + 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(i6);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((gt.j) it.next()));
        }
        return linkedHashSet;
    }
}
