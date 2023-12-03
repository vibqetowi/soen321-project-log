package at;

import gt.v0;
import gt.z0;
/* compiled from: util.kt */
/* loaded from: classes2.dex */
public class a implements gt.l<e<?>, hs.k> {

    /* renamed from: a  reason: collision with root package name */
    public final o f3464a;

    public a(o container) {
        kotlin.jvm.internal.i.g(container, "container");
        this.f3464a = container;
    }

    @Override // gt.l
    public final /* bridge */ /* synthetic */ e<?> a(gt.d0 d0Var, hs.k kVar) {
        return null;
    }

    @Override // gt.l
    public final /* bridge */ /* synthetic */ e<?> b(gt.n0 n0Var, hs.k kVar) {
        return null;
    }

    @Override // gt.l
    public final /* bridge */ /* synthetic */ e<?> c(gt.e eVar, hs.k kVar) {
        return null;
    }

    @Override // gt.l
    public final /* bridge */ /* synthetic */ e<?> d(z0 z0Var, hs.k kVar) {
        return null;
    }

    @Override // gt.l
    public final e<?> e(gt.m0 m0Var, hs.k kVar) {
        return g(m0Var, kVar);
    }

    @Override // gt.l
    public final /* bridge */ /* synthetic */ e<?> f(v0 v0Var, hs.k kVar) {
        return null;
    }

    @Override // gt.l
    public final e<?> g(gt.u descriptor, hs.k kVar) {
        hs.k data = kVar;
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        kotlin.jvm.internal.i.g(data, "data");
        return new t(this.f3464a, descriptor);
    }

    @Override // gt.l
    public final e<?> h(gt.l0 l0Var, hs.k kVar) {
        return g(l0Var, kVar);
    }

    @Override // gt.l
    public final /* bridge */ /* synthetic */ e<?> i(gt.h0 h0Var, hs.k kVar) {
        return null;
    }

    @Override // gt.l
    public final e<?> j(gt.k0 descriptor, hs.k kVar) {
        int i6;
        hs.k data = kVar;
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        kotlin.jvm.internal.i.g(data, "data");
        int i10 = 0;
        if (descriptor.f0() != null) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        if (descriptor.k0() != null) {
            i10 = 1;
        }
        int i11 = i6 + i10;
        boolean i02 = descriptor.i0();
        o oVar = this.f3464a;
        if (i02) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return new w(oVar, descriptor);
                    }
                } else {
                    return new v(oVar, descriptor);
                }
            } else {
                return new u(oVar, descriptor);
            }
        } else if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return new e0(oVar, descriptor);
                }
            } else {
                return new d0(oVar, descriptor);
            }
        } else {
            return new c0(oVar, descriptor);
        }
        throw new hs.e("Unsupported property: " + descriptor, 2);
    }

    @Override // gt.l
    public e<?> k(gt.i iVar, hs.k kVar) {
        return g(iVar, kVar);
    }

    @Override // gt.l
    public final /* bridge */ /* synthetic */ e<?> l(gt.a0 a0Var, hs.k kVar) {
        return null;
    }

    @Override // gt.l
    public final /* bridge */ /* synthetic */ e<?> m(gt.u0 u0Var, hs.k kVar) {
        return null;
    }
}
