package tt;

import gt.q0;
import ht.h;
import is.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kt.i0;
import zt.a;
/* compiled from: LazyJavaPackageFragment.kt */
/* loaded from: classes2.dex */
public final class m extends i0 {
    public static final /* synthetic */ ys.m<Object>[] G = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(m.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(m.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    public final wt.t A;
    public final q.f B;
    public final vu.i C;
    public final tt.c D;
    public final vu.i<List<fu.c>> E;
    public final ht.h F;

    /* compiled from: LazyJavaPackageFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<Map<String, ? extends yt.o>> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final Map<String, ? extends yt.o> invoke() {
            m mVar = m.this;
            ((st.c) mVar.B.f29104v).f31944l.a(mVar.f23848y.b());
            return e0.w0(new ArrayList());
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<HashMap<nu.b, nu.b>> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final HashMap<nu.b, nu.b> invoke() {
            boolean z10;
            String str;
            HashMap<nu.b, nu.b> hashMap = new HashMap<>();
            m mVar = m.this;
            mVar.getClass();
            for (Map.Entry entry : ((Map) kotlin.jvm.internal.h.C(mVar.C, m.G[0])).entrySet()) {
                nu.b d10 = nu.b.d((String) entry.getKey());
                zt.a a10 = ((yt.o) entry.getValue()).a();
                int ordinal = a10.f39838a.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        if (a10.f39838a == a.EnumC0686a.MULTIFILE_CLASS_PART) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            str = a10.f;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            hashMap.put(d10, nu.b.d(str));
                        }
                    }
                } else {
                    hashMap.put(d10, d10);
                }
            }
            return hashMap;
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<List<? extends fu.c>> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final List<? extends fu.c> invoke() {
            m.this.A.C();
            return new ArrayList(is.i.H1(is.w.f20676u, 10));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q.f outerContext, wt.t jPackage) {
        super(outerContext.a(), jPackage.e());
        ht.h U;
        kotlin.jvm.internal.i.g(outerContext, "outerContext");
        kotlin.jvm.internal.i.g(jPackage, "jPackage");
        this.A = jPackage;
        q.f a10 = st.b.a(outerContext, this, null, 6);
        this.B = a10;
        this.C = a10.b().e(new a());
        this.D = new tt.c(a10, jPackage, this);
        this.E = a10.b().g(new c());
        if (((st.c) a10.f29104v).f31953v.f28968c) {
            U = h.a.f19495a;
        } else {
            U = sp.b.U(a10, jPackage);
        }
        this.F = U;
        a10.b().e(new b());
    }

    @Override // kt.i0, kt.q, gt.m
    public final q0 g() {
        return new yt.p(this);
    }

    @Override // ht.b, ht.a
    public final ht.h getAnnotations() {
        return this.F;
    }

    @Override // gt.d0
    public final pu.i p() {
        return this.D;
    }

    @Override // kt.i0, kt.p
    public final String toString() {
        return "Lazy Java package fragment: " + this.f23848y + " of module " + ((st.c) this.B.f29104v).f31947o;
    }
}
