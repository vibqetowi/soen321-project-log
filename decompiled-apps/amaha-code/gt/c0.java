package gt;

import gt.p;
import ht.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pu.i;
import vu.c;
import wu.n1;
/* compiled from: NotFoundClasses.kt */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final vu.l f16780a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f16781b;

    /* renamed from: c  reason: collision with root package name */
    public final vu.g<fu.c, d0> f16782c;

    /* renamed from: d  reason: collision with root package name */
    public final vu.g<a, e> f16783d;

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final fu.b f16784a;

        /* renamed from: b  reason: collision with root package name */
        public final List<Integer> f16785b;

        public a(fu.b classId, List<Integer> list) {
            kotlin.jvm.internal.i.g(classId, "classId");
            this.f16784a = classId;
            this.f16785b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.i.b(this.f16784a, aVar.f16784a) && kotlin.jvm.internal.i.b(this.f16785b, aVar.f16785b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f16785b.hashCode() + (this.f16784a.hashCode() * 31);
        }

        public final String toString() {
            return "ClassRequest(classId=" + this.f16784a + ", typeParametersCount=" + this.f16785b + ')';
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kt.m {
        public final boolean B;
        public final ArrayList C;
        public final wu.k D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vu.l storageManager, f container, fu.e eVar, boolean z10, int i6) {
            super(storageManager, container, eVar, q0.f16815a);
            kotlin.jvm.internal.i.g(storageManager, "storageManager");
            kotlin.jvm.internal.i.g(container, "container");
            this.B = z10;
            xs.f k02 = kotlin.jvm.internal.h.k0(0, i6);
            ArrayList arrayList = new ArrayList(is.i.H1(k02, 10));
            xs.e it = k02.iterator();
            while (it.f38001w) {
                int nextInt = it.nextInt();
                n1 n1Var = n1.INVARIANT;
                arrayList.add(kt.t0.Q0(this, n1Var, fu.e.j("T" + nextInt), nextInt, storageManager));
            }
            this.C = arrayList;
            this.D = new wu.k(this, w0.b(this), ca.a.l1(mu.a.j(this).o().f()), storageManager);
        }

        @Override // gt.e
        public final boolean B() {
            return false;
        }

        @Override // gt.e
        public final x0<wu.i0> B0() {
            return null;
        }

        @Override // kt.b0
        public final pu.i C0(xu.e kotlinTypeRefiner) {
            kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return i.b.f29008b;
        }

        @Override // gt.y
        public final boolean H0() {
            return false;
        }

        @Override // gt.e
        public final Collection<e> K() {
            return is.w.f20676u;
        }

        @Override // gt.e
        public final boolean K0() {
            return false;
        }

        @Override // gt.e
        public final boolean L() {
            return false;
        }

        @Override // gt.y
        public final boolean M() {
            return false;
        }

        @Override // gt.h
        public final boolean N() {
            return this.B;
        }

        @Override // gt.e
        public final gt.d R() {
            return null;
        }

        @Override // gt.e
        public final pu.i S() {
            return i.b.f29008b;
        }

        @Override // gt.e
        public final e U() {
            return null;
        }

        @Override // ht.a
        public final ht.h getAnnotations() {
            return h.a.f19495a;
        }

        @Override // gt.e, gt.n, gt.y
        public final q getVisibility() {
            p.h PUBLIC = p.f16804e;
            kotlin.jvm.internal.i.f(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // kt.m, gt.y
        public final boolean isExternal() {
            return false;
        }

        @Override // gt.e
        public final boolean isInline() {
            return false;
        }

        @Override // gt.e
        public final int j() {
            return 1;
        }

        @Override // gt.g
        public final wu.x0 l() {
            return this.D;
        }

        @Override // gt.e, gt.y
        public final z m() {
            return z.FINAL;
        }

        @Override // gt.e, gt.h
        public final List<v0> t() {
            return this.C;
        }

        public final String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // gt.e
        public final boolean w() {
            return false;
        }

        @Override // gt.e
        public final Collection<gt.d> y() {
            return is.y.f20678u;
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<a, e> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final e invoke(a aVar) {
            f fVar;
            int i6;
            a aVar2 = aVar;
            kotlin.jvm.internal.i.g(aVar2, "<name for destructuring parameter 0>");
            fu.b bVar = aVar2.f16784a;
            if (!bVar.f15920c) {
                fu.b g5 = bVar.g();
                c0 c0Var = c0.this;
                List<Integer> list = aVar2.f16785b;
                if (g5 == null || (fVar = c0Var.a(g5, is.u.b2(list, 1))) == null) {
                    vu.g<fu.c, d0> gVar = c0Var.f16782c;
                    fu.c h10 = bVar.h();
                    kotlin.jvm.internal.i.f(h10, "classId.packageFqName");
                    fVar = (f) ((c.k) gVar).invoke(h10);
                }
                f fVar2 = fVar;
                boolean k10 = bVar.k();
                vu.l lVar = c0Var.f16780a;
                fu.e j10 = bVar.j();
                kotlin.jvm.internal.i.f(j10, "classId.shortClassName");
                Integer num = (Integer) is.u.i2(list);
                if (num != null) {
                    i6 = num.intValue();
                } else {
                    i6 = 0;
                }
                return new b(lVar, fVar2, j10, k10, i6);
            }
            throw new UnsupportedOperationException("Unresolved local class: " + bVar);
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<fu.c, d0> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final d0 invoke(fu.c cVar) {
            fu.c fqName = cVar;
            kotlin.jvm.internal.i.g(fqName, "fqName");
            return new kt.r(c0.this.f16781b, fqName);
        }
    }

    public c0(vu.l storageManager, a0 module) {
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        kotlin.jvm.internal.i.g(module, "module");
        this.f16780a = storageManager;
        this.f16781b = module;
        this.f16782c = storageManager.h(new d());
        this.f16783d = storageManager.h(new c());
    }

    public final e a(fu.b classId, List<Integer> list) {
        kotlin.jvm.internal.i.g(classId, "classId");
        return (e) ((c.k) this.f16783d).invoke(new a(classId, list));
    }
}
