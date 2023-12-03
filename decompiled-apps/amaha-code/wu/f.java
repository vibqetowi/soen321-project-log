package wu;

import java.util.Collection;
import java.util.List;
/* compiled from: AbstractTypeConstructor.kt */
/* loaded from: classes2.dex */
public abstract class f extends l {

    /* renamed from: b  reason: collision with root package name */
    public final vu.i<a> f37231b;

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Collection<b0> f37232a;

        /* renamed from: b  reason: collision with root package name */
        public List<? extends b0> f37233b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends b0> allSupertypes) {
            kotlin.jvm.internal.i.g(allSupertypes, "allSupertypes");
            this.f37232a = allSupertypes;
            this.f37233b = ca.a.O0(yu.i.f39093d);
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<a> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final a invoke() {
            return new a(f.this.g());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Boolean, a> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f37235u = new c();

        public c() {
            super(1);
        }

        @Override // ss.l
        public final a invoke(Boolean bool) {
            bool.booleanValue();
            return new a(ca.a.O0(yu.i.f39093d));
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<a, hs.k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(a aVar) {
            a supertypes = aVar;
            kotlin.jvm.internal.i.g(supertypes, "supertypes");
            f fVar = f.this;
            Collection a10 = fVar.j().a(fVar, supertypes.f37232a, new g(fVar), new h(fVar));
            List<b0> list = null;
            if (a10.isEmpty()) {
                b0 h10 = fVar.h();
                if (h10 != null) {
                    a10 = ca.a.O0(h10);
                } else {
                    a10 = null;
                }
                if (a10 == null) {
                    a10 = is.w.f20676u;
                }
            }
            if (a10 instanceof List) {
                list = (List) a10;
            }
            if (list == null) {
                list = is.u.I2(a10);
            }
            List<b0> l2 = fVar.l(list);
            kotlin.jvm.internal.i.g(l2, "<set-?>");
            supertypes.f37233b = l2;
            return hs.k.f19476a;
        }
    }

    public f(vu.l storageManager) {
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        this.f37231b = storageManager.c(new b(), c.f37235u, new d());
    }

    public abstract Collection<b0> g();

    public b0 h() {
        return null;
    }

    public Collection i() {
        return is.w.f20676u;
    }

    public abstract gt.t0 j();

    @Override // wu.x0
    /* renamed from: k */
    public final List<b0> c() {
        return this.f37231b.invoke().f37233b;
    }

    public void m(b0 type) {
        kotlin.jvm.internal.i.g(type, "type");
    }

    public List<b0> l(List<b0> list) {
        return list;
    }
}
