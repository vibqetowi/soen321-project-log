package su;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tu.c;
import vu.c;
/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* loaded from: classes2.dex */
public abstract class b implements gt.g0 {

    /* renamed from: a  reason: collision with root package name */
    public final vu.l f31978a;

    /* renamed from: b  reason: collision with root package name */
    public final w f31979b;

    /* renamed from: c  reason: collision with root package name */
    public final gt.a0 f31980c;

    /* renamed from: d  reason: collision with root package name */
    public l f31981d;

    /* renamed from: e  reason: collision with root package name */
    public final vu.h<fu.c, gt.d0> f31982e;

    public b(vu.c cVar, mt.d dVar, kt.g0 g0Var) {
        this.f31978a = cVar;
        this.f31979b = dVar;
        this.f31980c = g0Var;
        this.f31982e = cVar.b(new a(this));
    }

    @Override // gt.g0
    public final void a(fu.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        ca.a.g(this.f31982e.invoke(fqName), arrayList);
    }

    @Override // gt.g0
    public final boolean b(fu.c fqName) {
        boolean z10;
        gt.d0 d0Var;
        kotlin.jvm.internal.i.g(fqName, "fqName");
        vu.h<fu.c, gt.d0> hVar = this.f31982e;
        Object obj = ((c.j) hVar).f36152v.get(fqName);
        if (obj != null && obj != c.l.COMPUTING) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d0Var = hVar.invoke(fqName);
        } else {
            ft.u uVar = (ft.u) this;
            InputStream b10 = uVar.f31979b.b(fqName);
            if (b10 != null) {
                d0Var = c.a.a(fqName, uVar.f31978a, uVar.f31980c, b10, false);
            } else {
                d0Var = null;
            }
        }
        if (d0Var != null) {
            return false;
        }
        return true;
    }

    @Override // gt.e0
    public final List<gt.d0> c(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        return ca.a.Q0(this.f31982e.invoke(fqName));
    }

    @Override // gt.e0
    public final Collection<fu.c> k(fu.c fqName, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        return is.y.f20678u;
    }
}
