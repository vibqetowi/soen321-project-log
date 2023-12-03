package kt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import pu.c;
/* compiled from: SubpackagesScope.kt */
/* loaded from: classes2.dex */
public final class q0 extends pu.j {

    /* renamed from: b  reason: collision with root package name */
    public final gt.a0 f23881b;

    /* renamed from: c  reason: collision with root package name */
    public final fu.c f23882c;

    public q0(g0 moduleDescriptor, fu.c fqName) {
        kotlin.jvm.internal.i.g(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.i.g(fqName, "fqName");
        this.f23881b = moduleDescriptor;
        this.f23882c = fqName;
    }

    @Override // pu.j, pu.i
    public final Set<fu.e> e() {
        return is.y.f20678u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r3.isEmpty() != false) goto L23;
     */
    @Override // pu.j, pu.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection<gt.j> f(pu.d kindFilter, ss.l<? super fu.e, Boolean> nameFilter) {
        gt.h0 h0Var;
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        boolean a10 = kindFilter.a(pu.d.f28980h);
        is.w wVar = is.w.f20676u;
        if (!a10) {
            return wVar;
        }
        fu.c cVar = this.f23882c;
        if (cVar.d()) {
            if (kindFilter.f28991a.contains(c.b.f28975a)) {
                return wVar;
            }
        }
        gt.a0 a0Var = this.f23881b;
        Collection<fu.c> k10 = a0Var.k(cVar, nameFilter);
        ArrayList arrayList = new ArrayList(k10.size());
        for (fu.c cVar2 : k10) {
            fu.e f = cVar2.f();
            kotlin.jvm.internal.i.f(f, "subFqName.shortName()");
            if (nameFilter.invoke(f).booleanValue()) {
                if (!f.f15931v) {
                    h0Var = a0Var.H(cVar.c(f));
                }
                h0Var = null;
                ca.a.g(h0Var, arrayList);
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "subpackages of " + this.f23882c + " from " + this.f23881b;
    }
}
