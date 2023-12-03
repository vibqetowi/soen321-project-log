package gt;

import java.util.List;
import wu.n1;
/* compiled from: typeParameterUtils.kt */
/* loaded from: classes2.dex */
public final class c implements v0 {

    /* renamed from: u  reason: collision with root package name */
    public final v0 f16777u;

    /* renamed from: v  reason: collision with root package name */
    public final j f16778v;

    /* renamed from: w  reason: collision with root package name */
    public final int f16779w;

    public c(v0 v0Var, j declarationDescriptor, int i6) {
        kotlin.jvm.internal.i.g(declarationDescriptor, "declarationDescriptor");
        this.f16777u = v0Var;
        this.f16778v = declarationDescriptor;
        this.f16779w = i6;
    }

    @Override // gt.v0
    public final boolean D() {
        return this.f16777u.D();
    }

    @Override // gt.j
    public final <R, D> R F(l<R, D> lVar, D d10) {
        return (R) this.f16777u.F(lVar, d10);
    }

    @Override // gt.v0
    public final n1 O() {
        return this.f16777u.O();
    }

    @Override // gt.k, gt.j
    public final j c() {
        return this.f16778v;
    }

    @Override // gt.m
    public final q0 g() {
        return this.f16777u.g();
    }

    @Override // ht.a
    public final ht.h getAnnotations() {
        return this.f16777u.getAnnotations();
    }

    @Override // gt.v0
    public final int getIndex() {
        return this.f16777u.getIndex() + this.f16779w;
    }

    @Override // gt.j
    public final fu.e getName() {
        return this.f16777u.getName();
    }

    @Override // gt.v0
    public final List<wu.b0> getUpperBounds() {
        return this.f16777u.getUpperBounds();
    }

    @Override // gt.v0
    public final vu.l h0() {
        return this.f16777u.h0();
    }

    @Override // gt.v0, gt.g
    public final wu.x0 l() {
        return this.f16777u.l();
    }

    @Override // gt.v0
    public final boolean n0() {
        return true;
    }

    @Override // gt.g
    public final wu.i0 r() {
        return this.f16777u.r();
    }

    public final String toString() {
        return this.f16777u + "[inner-copy]";
    }

    @Override // gt.v0, gt.g, gt.j
    public final v0 b() {
        v0 b10 = this.f16777u.b();
        kotlin.jvm.internal.i.f(b10, "originalDescriptor.original");
        return b10;
    }
}
