package kt;

import gt.a1;
import gt.b;
import gt.p;
import gt.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import wu.j1;
/* compiled from: ValueParameterDescriptorImpl.kt */
/* loaded from: classes2.dex */
public class v0 extends w0 implements z0 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final wu.b0 D;
    public final z0 E;

    /* renamed from: z  reason: collision with root package name */
    public final int f23900z;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends v0 {
        public final hs.i F;

        public a(gt.a aVar, z0 z0Var, int i6, ht.h hVar, fu.e eVar, wu.b0 b0Var, boolean z10, boolean z11, boolean z12, wu.b0 b0Var2, gt.q0 q0Var, ss.a<? extends List<? extends a1>> aVar2) {
            super(aVar, z0Var, i6, hVar, eVar, b0Var, z10, z11, z12, b0Var2, q0Var);
            this.F = sp.b.O(aVar2);
        }

        @Override // kt.v0, gt.z0
        public final z0 a0(et.e eVar, fu.e eVar2, int i6) {
            ht.h annotations = getAnnotations();
            kotlin.jvm.internal.i.f(annotations, "annotations");
            wu.b0 type = a();
            kotlin.jvm.internal.i.f(type, "type");
            return new a(eVar, null, i6, annotations, eVar2, type, v0(), this.B, this.C, this.D, gt.q0.f16815a, new u0(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(gt.a containingDeclaration, z0 z0Var, int i6, ht.h annotations, fu.e name, wu.b0 outType, boolean z10, boolean z11, boolean z12, wu.b0 b0Var, gt.q0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        z0 z0Var2;
        kotlin.jvm.internal.i.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.i.g(annotations, "annotations");
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(outType, "outType");
        kotlin.jvm.internal.i.g(source, "source");
        this.f23900z = i6;
        this.A = z10;
        this.B = z11;
        this.C = z12;
        this.D = b0Var;
        if (z0Var == null) {
            z0Var2 = this;
        } else {
            z0Var2 = z0Var;
        }
        this.E = z0Var2;
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.d(this, d10);
    }

    @Override // gt.a1
    public final /* bridge */ /* synthetic */ ku.g X() {
        return null;
    }

    @Override // gt.z0
    public final boolean Y() {
        return this.C;
    }

    @Override // gt.z0
    public z0 a0(et.e eVar, fu.e eVar2, int i6) {
        ht.h annotations = getAnnotations();
        kotlin.jvm.internal.i.f(annotations, "annotations");
        wu.b0 type = a();
        kotlin.jvm.internal.i.f(type, "type");
        return new v0(eVar, null, i6, annotations, eVar2, type, v0(), this.B, this.C, this.D, gt.q0.f16815a);
    }

    @Override // gt.z0
    public final boolean b0() {
        return this.B;
    }

    @Override // gt.s0
    public final gt.k d(j1 substitutor) {
        kotlin.jvm.internal.i.g(substitutor, "substitutor");
        if (substitutor.h()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // gt.a
    public final Collection<z0> f() {
        Collection<? extends gt.a> f = c().f();
        kotlin.jvm.internal.i.f(f, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(is.i.H1(f, 10));
        for (gt.a aVar : f) {
            arrayList.add(aVar.i().get(this.f23900z));
        }
        return arrayList;
    }

    @Override // gt.z0
    public final int getIndex() {
        return this.f23900z;
    }

    @Override // gt.n, gt.y
    public final gt.q getVisibility() {
        p.i LOCAL = gt.p.f;
        kotlin.jvm.internal.i.f(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // gt.a1
    public final boolean i0() {
        return false;
    }

    @Override // gt.z0
    public final wu.b0 j0() {
        return this.D;
    }

    @Override // gt.z0
    public final boolean v0() {
        boolean z10;
        if (!this.A) {
            return false;
        }
        b.a m02 = ((gt.b) c()).m0();
        m02.getClass();
        if (m02 != b.a.FAKE_OVERRIDE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // kt.q, gt.j
    public final gt.a c() {
        gt.j c10 = super.c();
        kotlin.jvm.internal.i.e(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (gt.a) c10;
    }

    @Override // kt.q, kt.p, gt.j
    public final z0 b() {
        z0 z0Var = this.E;
        return z0Var == this ? this : z0Var.b();
    }
}
