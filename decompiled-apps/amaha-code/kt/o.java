package kt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
/* compiled from: CompositePackageFragmentProvider.kt */
/* loaded from: classes2.dex */
public final class o implements gt.g0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<gt.e0> f23874a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23875b;

    public o(String debugName, List list) {
        kotlin.jvm.internal.i.g(debugName, "debugName");
        this.f23874a = list;
        this.f23875b = debugName;
        list.size();
        is.u.M2(list).size();
    }

    @Override // gt.g0
    public final void a(fu.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        for (gt.e0 e0Var : this.f23874a) {
            kotlin.jvm.internal.h.n(e0Var, fqName, arrayList);
        }
    }

    @Override // gt.g0
    public final boolean b(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        List<gt.e0> list = this.f23874a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (gt.e0 e0Var : list) {
            if (!kotlin.jvm.internal.h.G(e0Var, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // gt.e0
    public final List<gt.d0> c(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        for (gt.e0 e0Var : this.f23874a) {
            kotlin.jvm.internal.h.n(e0Var, fqName, arrayList);
        }
        return is.u.I2(arrayList);
    }

    @Override // gt.e0
    public final Collection<fu.c> k(fu.c fqName, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        for (gt.e0 e0Var : this.f23874a) {
            hashSet.addAll(e0Var.k(fqName, nameFilter));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f23875b;
    }
}
