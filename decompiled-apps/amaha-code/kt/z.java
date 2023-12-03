package kt;

import ht.h;
import java.util.ArrayList;
import java.util.List;
import pu.b;
import pu.i;
/* compiled from: LazyPackageViewDescriptorImpl.kt */
/* loaded from: classes2.dex */
public final class z extends p implements gt.h0 {
    public static final /* synthetic */ ys.m<Object>[] B = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(z.class), "fragments", "getFragments()Ljava/util/List;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(z.class), "empty", "getEmpty()Z"))};
    public final pu.h A;

    /* renamed from: w  reason: collision with root package name */
    public final g0 f23930w;

    /* renamed from: x  reason: collision with root package name */
    public final fu.c f23931x;

    /* renamed from: y  reason: collision with root package name */
    public final vu.i f23932y;

    /* renamed from: z  reason: collision with root package name */
    public final vu.i f23933z;

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final Boolean invoke() {
            z zVar = z.this;
            g0 g0Var = zVar.f23930w;
            g0Var.D0();
            return Boolean.valueOf(kotlin.jvm.internal.h.G((o) g0Var.E.getValue(), zVar.f23931x));
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<List<? extends gt.d0>> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final List<? extends gt.d0> invoke() {
            z zVar = z.this;
            g0 g0Var = zVar.f23930w;
            g0Var.D0();
            return kotlin.jvm.internal.h.U((o) g0Var.E.getValue(), zVar.f23931x);
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<pu.i> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final pu.i invoke() {
            z zVar = z.this;
            if (zVar.isEmpty()) {
                return i.b.f29008b;
            }
            List<gt.d0> J = zVar.J();
            ArrayList arrayList = new ArrayList(is.i.H1(J, 10));
            for (gt.d0 d0Var : J) {
                arrayList.add(d0Var.p());
            }
            g0 g0Var = zVar.f23930w;
            fu.c cVar = zVar.f23931x;
            ArrayList v22 = is.u.v2(new q0(g0Var, cVar), arrayList);
            return b.a.a("package view scope for " + cVar + " in " + g0Var.getName(), v22);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g0 module, fu.c fqName, vu.l storageManager) {
        super(h.a.f19495a, fqName.g());
        kotlin.jvm.internal.i.g(module, "module");
        kotlin.jvm.internal.i.g(fqName, "fqName");
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        this.f23930w = module;
        this.f23931x = fqName;
        this.f23932y = storageManager.e(new b());
        this.f23933z = storageManager.e(new a());
        this.A = new pu.h(storageManager, new c());
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.i(this, d10);
    }

    @Override // gt.h0
    public final List<gt.d0> J() {
        return (List) kotlin.jvm.internal.h.C(this.f23932y, B[0]);
    }

    @Override // gt.j
    public final gt.j c() {
        fu.c cVar = this.f23931x;
        if (cVar.d()) {
            return null;
        }
        fu.c e10 = cVar.e();
        kotlin.jvm.internal.i.f(e10, "fqName.parent()");
        return this.f23930w.H(e10);
    }

    @Override // gt.h0
    public final fu.c e() {
        return this.f23931x;
    }

    public final boolean equals(Object obj) {
        gt.h0 h0Var;
        if (obj instanceof gt.h0) {
            h0Var = (gt.h0) obj;
        } else {
            h0Var = null;
        }
        if (h0Var == null) {
            return false;
        }
        if (!kotlin.jvm.internal.i.b(this.f23931x, h0Var.e())) {
            return false;
        }
        if (!kotlin.jvm.internal.i.b(this.f23930w, h0Var.w0())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f23931x.hashCode() + (this.f23930w.hashCode() * 31);
    }

    @Override // gt.h0
    public final boolean isEmpty() {
        return ((Boolean) kotlin.jvm.internal.h.C(this.f23933z, B[1])).booleanValue();
    }

    @Override // gt.h0
    public final pu.i p() {
        return this.A;
    }

    @Override // gt.h0
    public final g0 w0() {
        return this.f23930w;
    }
}
