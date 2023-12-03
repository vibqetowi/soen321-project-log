package kt;

import gt.b;
import gt.z0;
import java.util.ArrayList;
import java.util.List;
import kt.x;
import wu.j1;
/* compiled from: TypeAliasConstructorDescriptor.kt */
/* loaded from: classes2.dex */
public final class s0 extends x implements r0 {
    public final vu.l Y;
    public final gt.u0 Z;

    /* renamed from: a0  reason: collision with root package name */
    public final vu.j f23891a0;

    /* renamed from: b0  reason: collision with root package name */
    public gt.d f23892b0;

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f23890d0 = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(s0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final a c0 = new a();

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<s0> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ gt.d f23894v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gt.d dVar) {
            super(0);
            this.f23894v = dVar;
        }

        @Override // ss.a
        public final s0 invoke() {
            j1 d10;
            s0 s0Var = s0.this;
            vu.l lVar = s0Var.Y;
            gt.u0 u0Var = s0Var.Z;
            gt.d dVar = this.f23894v;
            ht.h annotations = dVar.getAnnotations();
            b.a m02 = dVar.m0();
            kotlin.jvm.internal.i.f(m02, "underlyingConstructorDescriptor.kind");
            gt.u0 u0Var2 = s0Var.Z;
            gt.q0 g5 = u0Var2.g();
            kotlin.jvm.internal.i.f(g5, "typeAliasDescriptor.source");
            s0 s0Var2 = new s0(lVar, u0Var, dVar, s0Var, annotations, m02, g5);
            s0.c0.getClass();
            d dVar2 = null;
            if (u0Var2.q() == null) {
                d10 = null;
            } else {
                d10 = j1.d(u0Var2.W());
            }
            if (d10 == null) {
                return null;
            }
            gt.n0 f02 = dVar.f0();
            if (f02 != null) {
                dVar2 = f02.d(d10);
            }
            d dVar3 = dVar2;
            List<gt.n0> r02 = dVar.r0();
            kotlin.jvm.internal.i.f(r02, "underlyingConstructorDes…contextReceiverParameters");
            ArrayList arrayList = new ArrayList(is.i.H1(r02, 10));
            for (gt.n0 n0Var : r02) {
                arrayList.add(n0Var.d(d10));
            }
            List<gt.v0> t3 = u0Var2.t();
            List<z0> i6 = s0Var.i();
            wu.b0 b0Var = s0Var.A;
            kotlin.jvm.internal.i.d(b0Var);
            s0Var2.P0(null, dVar3, arrayList, t3, i6, b0Var, gt.z.FINAL, u0Var2.getVisibility());
            return s0Var2;
        }
    }

    public /* synthetic */ s0() {
        throw null;
    }

    public s0(vu.l lVar, gt.u0 u0Var, gt.d dVar, r0 r0Var, ht.h hVar, b.a aVar, gt.q0 q0Var) {
        super(aVar, u0Var, r0Var, q0Var, hVar, fu.g.f15937e);
        this.Y = lVar;
        this.Z = u0Var;
        this.M = u0Var.H0();
        this.f23891a0 = lVar.f(new b(dVar));
        this.f23892b0 = dVar;
    }

    @Override // gt.i
    public final gt.e A() {
        gt.e A = this.f23892b0.A();
        kotlin.jvm.internal.i.f(A, "underlyingConstructorDescriptor.constructedClass");
        return A;
    }

    @Override // kt.x
    public final x M0(b.a kind, gt.j newOwner, gt.u uVar, gt.q0 q0Var, ht.h annotations, fu.e eVar) {
        kotlin.jvm.internal.i.g(newOwner, "newOwner");
        kotlin.jvm.internal.i.g(kind, "kind");
        kotlin.jvm.internal.i.g(annotations, "annotations");
        return new s0(this.Y, this.Z, this.f23892b0, this, annotations, b.a.DECLARATION, q0Var);
    }

    @Override // kt.x, gt.b
    /* renamed from: V0 */
    public final r0 d0(gt.j newOwner, gt.z zVar, gt.o visibility) {
        b.a aVar = b.a.FAKE_OVERRIDE;
        kotlin.jvm.internal.i.g(newOwner, "newOwner");
        kotlin.jvm.internal.i.g(visibility, "visibility");
        x.a aVar2 = (x.a) s();
        aVar2.a(newOwner);
        aVar2.d(zVar);
        aVar2.k(visibility);
        aVar2.q(aVar);
        aVar2.f23916m = false;
        gt.u build = aVar2.build();
        kotlin.jvm.internal.i.e(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (r0) build;
    }

    @Override // kt.x, kt.q, kt.p, gt.j
    /* renamed from: W0 */
    public final r0 b() {
        gt.u b10 = super.b();
        kotlin.jvm.internal.i.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (r0) b10;
    }

    @Override // kt.x, gt.u, gt.s0
    /* renamed from: X0 */
    public final s0 d(j1 substitutor) {
        kotlin.jvm.internal.i.g(substitutor, "substitutor");
        gt.u d10 = super.d(substitutor);
        kotlin.jvm.internal.i.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        s0 s0Var = (s0) d10;
        wu.b0 b0Var = s0Var.A;
        kotlin.jvm.internal.i.d(b0Var);
        gt.d d11 = this.f23892b0.b().d(j1.d(b0Var));
        if (d11 == null) {
            return null;
        }
        s0Var.f23892b0 = d11;
        return s0Var;
    }

    @Override // kt.q, gt.j
    public final gt.h c() {
        return this.Z;
    }

    @Override // kt.x, gt.u, gt.s0
    public final /* bridge */ /* synthetic */ gt.i d(j1 j1Var) {
        throw null;
    }

    @Override // kt.x, gt.a
    public final wu.b0 getReturnType() {
        wu.b0 b0Var = this.A;
        kotlin.jvm.internal.i.d(b0Var);
        return b0Var;
    }

    @Override // kt.r0
    public final gt.d o0() {
        return this.f23892b0;
    }

    @Override // gt.i
    public final boolean z() {
        return this.f23892b0.z();
    }

    @Override // kt.q, gt.j
    public final gt.j c() {
        return this.Z;
    }
}
