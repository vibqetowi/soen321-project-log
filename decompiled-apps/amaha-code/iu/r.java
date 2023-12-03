package iu;

import gt.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import ta.v;
import wu.b0;
import wu.d1;
import wu.f1;
import wu.i0;
import wu.m1;
import wu.x0;
import xu.a;
import xu.c;
/* compiled from: OverridingUtilTypeSystemContext.kt */
/* loaded from: classes2.dex */
public final class r implements xu.a {

    /* renamed from: u  reason: collision with root package name */
    public final Map<x0, x0> f20710u;

    /* renamed from: v  reason: collision with root package name */
    public final c.a f20711v;

    /* renamed from: w  reason: collision with root package name */
    public final xu.e f20712w;

    /* renamed from: x  reason: collision with root package name */
    public final xu.d f20713x;

    /* renamed from: y  reason: collision with root package name */
    public final ss.p<b0, b0, Boolean> f20714y;

    public r(HashMap hashMap, c.a equalityAxioms, xu.e kotlinTypeRefiner, xu.d kotlinTypePreparator, ss.p pVar) {
        kotlin.jvm.internal.i.g(equalityAxioms, "equalityAxioms");
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlin.jvm.internal.i.g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f20710u = hashMap;
        this.f20711v = equalityAxioms;
        this.f20712w = kotlinTypeRefiner;
        this.f20713x = kotlinTypePreparator;
        this.f20714y = pVar;
    }

    @Override // zu.n
    public final boolean A(zu.k kVar) {
        return a.C0645a.U(kVar);
    }

    @Override // zu.n
    public final boolean B(zu.i iVar) {
        return a.C0645a.L(iVar);
    }

    @Override // zu.n
    public final xu.i C(zu.d dVar) {
        return a.C0645a.k0(dVar);
    }

    @Override // zu.n
    public final boolean D(zu.i iVar) {
        return a.C0645a.P(iVar);
    }

    @Override // zu.n
    public final zu.k E(zu.i receiver, int i6) {
        boolean z10;
        kotlin.jvm.internal.i.g(receiver, "$receiver");
        if (i6 >= 0 && i6 < I(receiver)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return T(receiver, i6);
        }
        return null;
    }

    @Override // zu.n
    public final zu.l F(zu.h hVar) {
        return a.C0645a.l0(this, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (kotlin.jvm.internal.i.b(r3, r6) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (kotlin.jvm.internal.i.b(r0, r5) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // zu.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(zu.l c12, zu.l c22) {
        boolean z10;
        kotlin.jvm.internal.i.g(c12, "c1");
        kotlin.jvm.internal.i.g(c22, "c2");
        if (c12 instanceof x0) {
            if (c22 instanceof x0) {
                if (a.C0645a.a(c12, c22)) {
                    return true;
                }
                x0 x0Var = (x0) c12;
                x0 x0Var2 = (x0) c22;
                if (!this.f20711v.a(x0Var, x0Var2)) {
                    Map<x0, x0> map = this.f20710u;
                    if (map != null) {
                        x0 x0Var3 = map.get(x0Var);
                        x0 x0Var4 = map.get(x0Var2);
                        if (x0Var3 != null) {
                        }
                        if (x0Var4 != null) {
                        }
                    }
                    z10 = false;
                    if (!z10) {
                        return true;
                    }
                    return false;
                }
                z10 = true;
                if (!z10) {
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // zu.n
    public final i0 H(zu.i iVar) {
        return a.C0645a.k(iVar);
    }

    @Override // zu.n
    public final int I(zu.h hVar) {
        return a.C0645a.b(hVar);
    }

    @Override // zu.n
    public final boolean J(zu.d receiver) {
        kotlin.jvm.internal.i.g(receiver, "$receiver");
        return receiver instanceof ju.a;
    }

    @Override // zu.n
    public final zu.j K(zu.i iVar) {
        return a.C0645a.c(iVar);
    }

    @Override // zu.n
    public final d1 L(zu.c cVar) {
        return a.C0645a.f0(cVar);
    }

    @Override // zu.n
    public final boolean M(zu.i receiver) {
        kotlin.jvm.internal.i.g(receiver, "$receiver");
        return r(b(receiver));
    }

    @Override // zu.n
    public final int N(zu.m mVar) {
        return a.C0645a.C(mVar);
    }

    @Override // zu.n
    public final boolean P(zu.d dVar) {
        return a.C0645a.T(dVar);
    }

    @Override // zu.n
    public final int Q(zu.l lVar) {
        return a.C0645a.d0(lVar);
    }

    @Override // zu.n
    public final boolean R(zu.h receiver) {
        kotlin.jvm.internal.i.g(receiver, "$receiver");
        if (D(o0(receiver)) != D(q(receiver))) {
            return true;
        }
        return false;
    }

    @Override // zu.n
    public final m1 S(ArrayList arrayList) {
        return v.B(arrayList);
    }

    @Override // zu.n
    public final zu.k T(zu.h hVar, int i6) {
        return a.C0645a.o(hVar, i6);
    }

    @Override // zu.n
    public final boolean U(zu.h hVar) {
        return a.C0645a.J(this, hVar);
    }

    @Override // zu.n
    public final Collection<zu.h> V(zu.l lVar) {
        return a.C0645a.i0(lVar);
    }

    @Override // zu.n
    public final boolean X(zu.i iVar) {
        return a.C0645a.W(iVar);
    }

    @Override // zu.n
    public final boolean Y(zu.m mVar, zu.l lVar) {
        return a.C0645a.E(mVar, lVar);
    }

    @Override // zu.n
    public final f1 Z(zu.h hVar) {
        return a.C0645a.j(hVar);
    }

    public final wu.t a(zu.f fVar) {
        return a.C0645a.f(fVar);
    }

    @Override // zu.n
    public final boolean a0(zu.l lVar) {
        return a.C0645a.G(lVar);
    }

    @Override // xu.a, zu.n
    public final x0 b(zu.i iVar) {
        return a.C0645a.j0(iVar);
    }

    @Override // zu.n
    public final v0 b0(zu.p pVar) {
        return a.C0645a.x(pVar);
    }

    @Override // xu.a, zu.n
    public final i0 c(zu.f fVar) {
        return a.C0645a.Y(fVar);
    }

    @Override // zu.n
    public final boolean c0(zu.l lVar) {
        return a.C0645a.O(lVar);
    }

    @Override // xu.a, zu.n
    public final i0 d(zu.f fVar) {
        return a.C0645a.m0(fVar);
    }

    @Override // zu.n
    public final boolean d0(zu.i receiver) {
        kotlin.jvm.internal.i.g(receiver, "$receiver");
        return e0(b(receiver));
    }

    @Override // xu.a, zu.n
    public final i0 e(zu.h hVar) {
        return a.C0645a.i(hVar);
    }

    @Override // zu.n
    public final boolean e0(zu.l lVar) {
        return a.C0645a.N(lVar);
    }

    @Override // xu.a, zu.n
    public final i0 f(zu.i iVar, boolean z10) {
        return a.C0645a.o0(iVar, z10);
    }

    @Override // zu.n
    public final Set f0(zu.i iVar) {
        return a.C0645a.e0(this, iVar);
    }

    @Override // xu.a, zu.n
    public final zu.d g(zu.i iVar) {
        return a.C0645a.d(this, iVar);
    }

    @Override // zu.n
    public final boolean g0(zu.l lVar) {
        return a.C0645a.Q(lVar);
    }

    @Override // zu.n
    public final zu.b h(zu.d dVar) {
        return a.C0645a.l(dVar);
    }

    @Override // zu.n
    public final boolean h0(zu.i iVar) {
        return a.C0645a.V(iVar);
    }

    public final boolean i(zu.h hVar) {
        return a.C0645a.R(hVar);
    }

    @Override // zu.n
    public final xu.b i0(zu.i iVar) {
        return a.C0645a.h0(this, iVar);
    }

    @Override // zu.n
    public final m1 j(zu.d dVar) {
        return a.C0645a.a0(dVar);
    }

    @Override // zu.n
    public final int j0(zu.j jVar) {
        return a.C0645a.g0(this, jVar);
    }

    @Override // zu.n
    public final i0 k(zu.e eVar) {
        return a.C0645a.c0(eVar);
    }

    @Override // zu.n
    public final boolean k0(zu.l lVar) {
        return a.C0645a.I(lVar);
    }

    @Override // zu.n
    public final boolean l(zu.h receiver) {
        kotlin.jvm.internal.i.g(receiver, "$receiver");
        return receiver instanceof xt.i;
    }

    @Override // zu.n
    public final boolean l0(zu.h receiver) {
        kotlin.jvm.internal.i.g(receiver, "$receiver");
        if (g0(F(receiver)) && !i(receiver)) {
            return true;
        }
        return false;
    }

    @Override // xu.a
    public final m1 m0(zu.i iVar, zu.i iVar2) {
        return a.C0645a.m(this, iVar, iVar2);
    }

    @Override // zu.n
    public final zu.k n(zu.j jVar, int i6) {
        return a.C0645a.n(this, jVar, i6);
    }

    @Override // zu.n
    public final zu.m n0(zu.l lVar, int i6) {
        return a.C0645a.r(lVar, i6);
    }

    @Override // zu.n
    public final m1 o(zu.h hVar) {
        return a.C0645a.b0(hVar);
    }

    @Override // zu.n
    public final zu.i o0(zu.h hVar) {
        return a.C0645a.Z(this, hVar);
    }

    @Override // zu.n
    public final boolean p(zu.i receiver) {
        zu.d dVar;
        kotlin.jvm.internal.i.g(receiver, "$receiver");
        i0 e10 = e(receiver);
        if (e10 != null) {
            dVar = g(e10);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return true;
        }
        return false;
    }

    @Override // zu.n
    public final boolean p0(zu.h receiver) {
        wu.t tVar;
        kotlin.jvm.internal.i.g(receiver, "$receiver");
        wu.v y10 = y(receiver);
        if (y10 != null) {
            tVar = a(y10);
        } else {
            tVar = null;
        }
        if (tVar != null) {
            return true;
        }
        return false;
    }

    @Override // zu.n
    public final zu.i q(zu.h hVar) {
        return a.C0645a.n0(this, hVar);
    }

    @Override // zu.n
    public final boolean r(zu.l lVar) {
        return a.C0645a.H(lVar);
    }

    @Override // zu.n
    public final int s(zu.k kVar) {
        return a.C0645a.B(kVar);
    }

    @Override // zu.o
    public final boolean t(zu.i iVar, zu.i iVar2) {
        return a.C0645a.F(iVar, iVar2);
    }

    @Override // zu.n
    public final wu.o v(zu.i iVar) {
        return a.C0645a.e(iVar);
    }

    @Override // zu.n
    public final m1 w(zu.k kVar) {
        return a.C0645a.w(kVar);
    }

    @Override // zu.n
    public final zu.h x(zu.h hVar) {
        return a.C0645a.p0(this, hVar);
    }

    @Override // zu.n
    public final wu.v y(zu.h hVar) {
        return a.C0645a.g(hVar);
    }

    @Override // zu.n
    public final boolean z(zu.l lVar) {
        return a.C0645a.K(lVar);
    }

    @Override // zu.n
    public final void u(zu.i iVar, zu.l lVar) {
    }
}
