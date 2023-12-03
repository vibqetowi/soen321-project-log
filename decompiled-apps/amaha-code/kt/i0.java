package kt;

import ht.h;
/* compiled from: PackageFragmentDescriptorImpl.kt */
/* loaded from: classes2.dex */
public abstract class i0 extends q implements gt.d0 {

    /* renamed from: y  reason: collision with root package name */
    public final fu.c f23848y;

    /* renamed from: z  reason: collision with root package name */
    public final String f23849z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(gt.a0 module, fu.c fqName) {
        super(module, h.a.f19495a, fqName.g(), gt.q0.f16815a);
        kotlin.jvm.internal.i.g(module, "module");
        kotlin.jvm.internal.i.g(fqName, "fqName");
        this.f23848y = fqName;
        this.f23849z = "package " + fqName + " of " + module;
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.a(this, d10);
    }

    @Override // gt.d0
    public final fu.c e() {
        return this.f23848y;
    }

    @Override // kt.q, gt.m
    public gt.q0 g() {
        return gt.q0.f16815a;
    }

    @Override // kt.p
    public String toString() {
        return this.f23849z;
    }

    @Override // kt.q, gt.j
    public final gt.a0 c() {
        gt.j c10 = super.c();
        kotlin.jvm.internal.i.e(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (gt.a0) c10;
    }
}
