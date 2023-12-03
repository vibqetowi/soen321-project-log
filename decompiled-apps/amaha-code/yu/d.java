package yu;

import gt.a;
import gt.b;
import gt.k0;
import gt.l;
import gt.m0;
import gt.n0;
import gt.o;
import gt.p;
import gt.q;
import gt.q0;
import gt.s;
import gt.v0;
import gt.z;
import gt.z0;
import ht.h;
import is.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kt.l0;
import wu.b0;
import wu.j1;
/* compiled from: ErrorPropertyDescriptor.kt */
/* loaded from: classes2.dex */
public final class d implements k0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l0 f39074u;

    public d() {
        i iVar = i.f39090a;
        a aVar = i.f39092c;
        h.a.C0293a c0293a = h.a.f19495a;
        z zVar = z.OPEN;
        p.h hVar = p.f16804e;
        fu.e l2 = fu.e.l("<Error property>");
        b.a aVar2 = b.a.DECLARATION;
        q0.a aVar3 = q0.f16815a;
        if (aVar != null) {
            if (hVar != null) {
                l0 l0Var = new l0(aVar, null, c0293a, zVar, hVar, true, l2, aVar2, aVar3, false, false, false, false, false, false);
                f fVar = i.f39094e;
                w wVar = w.f20676u;
                l0Var.R0(fVar, wVar, null, null, wVar);
                this.f39074u = l0Var;
                return;
            }
            l0.I(10);
            throw null;
        }
        l0.I(7);
        throw null;
    }

    @Override // gt.a
    public final boolean E() {
        return this.f39074u.E();
    }

    @Override // gt.j
    public final <R, D> R F(l<R, D> lVar, D d10) {
        l0 l0Var = this.f39074u;
        l0Var.getClass();
        return lVar.j(l0Var, d10);
    }

    @Override // gt.y
    public final boolean H0() {
        return this.f39074u.K;
    }

    @Override // gt.y
    public final boolean M() {
        return this.f39074u.J;
    }

    @Override // gt.k0
    public final boolean P() {
        return this.f39074u.M;
    }

    @Override // gt.a1
    public final ku.g<?> X() {
        return this.f39074u.X();
    }

    @Override // gt.y0
    public final b0 a() {
        return this.f39074u.a();
    }

    @Override // gt.k0, gt.b, gt.a, gt.j
    public final k0 b() {
        return this.f39074u.b();
    }

    @Override // gt.k, gt.j
    public final gt.j c() {
        return this.f39074u.c();
    }

    @Override // gt.k0, gt.s0
    public final k0 d(j1 substitutor) {
        kotlin.jvm.internal.i.g(substitutor, "substitutor");
        return this.f39074u.d(substitutor);
    }

    @Override // gt.b
    public final gt.b d0(gt.j jVar, z zVar, o oVar) {
        return this.f39074u.d0(jVar, zVar, oVar);
    }

    @Override // gt.k0, gt.b, gt.a
    public final Collection<? extends k0> f() {
        return this.f39074u.f();
    }

    @Override // gt.a
    public final n0 f0() {
        return this.f39074u.O;
    }

    @Override // gt.m
    public final q0 g() {
        return this.f39074u.g();
    }

    @Override // ht.a
    public final ht.h getAnnotations() {
        ht.h annotations = this.f39074u.getAnnotations();
        kotlin.jvm.internal.i.f(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // gt.j
    public final fu.e getName() {
        return this.f39074u.getName();
    }

    @Override // gt.a
    public final b0 getReturnType() {
        return this.f39074u.getReturnType();
    }

    @Override // gt.a
    public final List<v0> getTypeParameters() {
        return this.f39074u.getTypeParameters();
    }

    @Override // gt.n, gt.y
    public final q getVisibility() {
        return this.f39074u.getVisibility();
    }

    @Override // gt.k0
    public final m0 h() {
        return this.f39074u.S;
    }

    @Override // gt.a
    public final List<z0> i() {
        return this.f39074u.i();
    }

    @Override // gt.a1
    public final boolean i0() {
        return this.f39074u.f23927z;
    }

    @Override // gt.y
    public final boolean isExternal() {
        return this.f39074u.isExternal();
    }

    @Override // gt.a
    public final n0 k0() {
        return this.f39074u.P;
    }

    @Override // gt.k0
    public final s l0() {
        return this.f39074u.U;
    }

    @Override // gt.y
    public final z m() {
        return this.f39074u.m();
    }

    @Override // gt.b
    public final b.a m0() {
        return this.f39074u.m0();
    }

    @Override // gt.k0
    public final kt.m0 n() {
        return this.f39074u.R;
    }

    @Override // gt.k0
    public final s q0() {
        return this.f39074u.T;
    }

    @Override // gt.a
    public final List<n0> r0() {
        return this.f39074u.r0();
    }

    @Override // gt.a1
    public final boolean t0() {
        return this.f39074u.H;
    }

    @Override // gt.k0
    public final ArrayList u() {
        return this.f39074u.u();
    }

    @Override // gt.a
    public final <V> V v(a.InterfaceC0261a<V> interfaceC0261a) {
        this.f39074u.getClass();
        return null;
    }

    @Override // gt.a1
    public final boolean x() {
        return this.f39074u.I;
    }

    @Override // gt.b
    public final void y0(Collection<? extends gt.b> collection) {
        this.f39074u.y0(collection);
    }
}
