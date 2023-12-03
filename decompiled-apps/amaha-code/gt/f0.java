package gt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: PackageFragmentProviderImpl.kt */
/* loaded from: classes2.dex */
public final class f0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final Collection<d0> f16790a;

    /* compiled from: PackageFragmentProviderImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<d0, fu.c> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f16791u = new a();

        public a() {
            super(1);
        }

        @Override // ss.l
        public final fu.c invoke(d0 d0Var) {
            d0 it = d0Var;
            kotlin.jvm.internal.i.g(it, "it");
            return it.e();
        }
    }

    /* compiled from: PackageFragmentProviderImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<fu.c, Boolean> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ fu.c f16792u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fu.c cVar) {
            super(1);
            this.f16792u = cVar;
        }

        @Override // ss.l
        public final Boolean invoke(fu.c cVar) {
            boolean z10;
            fu.c it = cVar;
            kotlin.jvm.internal.i.g(it, "it");
            if (!it.d() && kotlin.jvm.internal.i.b(it.e(), this.f16792u)) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public f0(ArrayList arrayList) {
        this.f16790a = arrayList;
    }

    @Override // gt.g0
    public final void a(fu.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        for (Object obj : this.f16790a) {
            if (kotlin.jvm.internal.i.b(((d0) obj).e(), fqName)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // gt.g0
    public final boolean b(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        Collection<d0> collection = this.f16790a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (d0 d0Var : collection) {
            if (kotlin.jvm.internal.i.b(d0Var.e(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // gt.e0
    public final List<d0> c(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f16790a) {
            if (kotlin.jvm.internal.i.b(((d0) obj).e(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // gt.e0
    public final Collection<fu.c> k(fu.c fqName, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        return ca.a.a1(fv.t.J0(fv.t.B0(fv.t.G0(is.u.X1(this.f16790a), a.f16791u), new b(fqName))));
    }
}
