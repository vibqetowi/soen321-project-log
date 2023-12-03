package wu;

import java.util.List;
import pu.n;
import wu.r0;
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f37213a = 0;

    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l {

        /* renamed from: u  reason: collision with root package name */
        public static final /* synthetic */ int f37214u = 0;

        static {
            new a();
        }

        public a() {
            super(1);
        }

        @Override // ss.l
        public final Object invoke(Object obj) {
            kotlin.jvm.internal.i.g((xu.e) obj, "<anonymous parameter 0>");
            return null;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes2.dex */
    public static final class b {
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<xu.e, i0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ x0 f37215u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ List<d1> f37216v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, v0 v0Var, x0 x0Var, boolean z10) {
            super(1);
            this.f37215u = x0Var;
            this.f37216v = list;
        }

        @Override // ss.l
        public final i0 invoke(xu.e eVar) {
            xu.e refiner = eVar;
            kotlin.jvm.internal.i.g(refiner, "refiner");
            int i6 = c0.f37213a;
            c0.a(this.f37215u, refiner, this.f37216v);
            return null;
        }
    }

    static {
        int i6 = a.f37214u;
    }

    public static final b a(x0 x0Var, xu.e eVar, List list) {
        gt.g a10 = x0Var.a();
        if (a10 != null) {
            eVar.F(a10);
            return null;
        }
        return null;
    }

    public static final i0 b(gt.u0 u0Var, List<? extends d1> arguments) {
        kotlin.jvm.internal.i.g(u0Var, "<this>");
        kotlin.jvm.internal.i.g(arguments, "arguments");
        q0 q0Var = new q0();
        r0 a10 = r0.a.a(null, u0Var, arguments);
        v0.f37300v.getClass();
        v0 attributes = v0.f37301w;
        kotlin.jvm.internal.i.g(attributes, "attributes");
        return q0Var.c(a10, attributes, false, 0, true);
    }

    public static final m1 c(i0 lowerBound, i0 upperBound) {
        kotlin.jvm.internal.i.g(lowerBound, "lowerBound");
        kotlin.jvm.internal.i.g(upperBound, "upperBound");
        if (kotlin.jvm.internal.i.b(lowerBound, upperBound)) {
            return lowerBound;
        }
        return new w(lowerBound, upperBound);
    }

    public static final i0 d(v0 attributes, ku.m constructor) {
        kotlin.jvm.internal.i.g(attributes, "attributes");
        kotlin.jvm.internal.i.g(constructor, "constructor");
        return g(is.w.f20676u, yu.i.a(2, true, "unknown integer literal type"), attributes, constructor, false);
    }

    public static final i0 e(v0 attributes, gt.e descriptor, List<? extends d1> arguments) {
        kotlin.jvm.internal.i.g(attributes, "attributes");
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        kotlin.jvm.internal.i.g(arguments, "arguments");
        x0 l2 = descriptor.l();
        kotlin.jvm.internal.i.f(l2, "descriptor.typeConstructor");
        return f(attributes, l2, arguments, false, null);
    }

    public static final i0 f(v0 attributes, x0 constructor, List<? extends d1> arguments, boolean z10, xu.e kotlinTypeRefiner) {
        pu.i a10;
        kotlin.jvm.internal.i.g(attributes, "attributes");
        kotlin.jvm.internal.i.g(constructor, "constructor");
        kotlin.jvm.internal.i.g(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z10 && constructor.a() != null) {
            gt.g a11 = constructor.a();
            kotlin.jvm.internal.i.d(a11);
            i0 r = a11.r();
            kotlin.jvm.internal.i.f(r, "constructor.declarationDescriptor!!.defaultType");
            return r;
        }
        gt.g a12 = constructor.a();
        if (a12 instanceof gt.v0) {
            a10 = ((gt.v0) a12).r().p();
        } else if (a12 instanceof gt.e) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = mu.a.i(mu.a.j(a12));
            }
            kt.b0 b0Var = null;
            if (arguments.isEmpty()) {
                gt.e eVar = (gt.e) a12;
                kotlin.jvm.internal.i.g(eVar, "<this>");
                kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
                if (eVar instanceof kt.b0) {
                    b0Var = (kt.b0) eVar;
                }
                if (b0Var == null || (a10 = b0Var.C0(kotlinTypeRefiner)) == null) {
                    a10 = eVar.G0();
                    kotlin.jvm.internal.i.f(a10, "this.unsubstitutedMemberScope");
                }
            } else {
                gt.e eVar2 = (gt.e) a12;
                g1 b10 = z0.f37326b.b(constructor, arguments);
                kotlin.jvm.internal.i.g(eVar2, "<this>");
                kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
                if (eVar2 instanceof kt.b0) {
                    b0Var = (kt.b0) eVar2;
                }
                if (b0Var == null || (a10 = b0Var.I(b10, kotlinTypeRefiner)) == null) {
                    a10 = eVar2.z0(b10);
                    kotlin.jvm.internal.i.f(a10, "this.getMemberScope(\n   …ubstitution\n            )");
                }
            }
        } else if (a12 instanceof gt.u0) {
            String str = ((gt.u0) a12).getName().f15930u;
            kotlin.jvm.internal.i.f(str, "descriptor.name.toString()");
            a10 = yu.i.a(4, true, str);
        } else if (constructor instanceof z) {
            a10 = n.a.a("member scope for intersection type", ((z) constructor).f37321b);
        } else {
            throw new IllegalStateException("Unsupported classifier: " + a12 + " for constructor: " + constructor);
        }
        return h(attributes, constructor, arguments, z10, a10, new c(arguments, attributes, constructor, z10));
    }

    public static final i0 g(List arguments, pu.i memberScope, v0 attributes, x0 constructor, boolean z10) {
        kotlin.jvm.internal.i.g(attributes, "attributes");
        kotlin.jvm.internal.i.g(constructor, "constructor");
        kotlin.jvm.internal.i.g(arguments, "arguments");
        kotlin.jvm.internal.i.g(memberScope, "memberScope");
        j0 j0Var = new j0(constructor, arguments, z10, memberScope, new d0(arguments, memberScope, attributes, constructor, z10));
        if (!attributes.isEmpty()) {
            return new k0(j0Var, attributes);
        }
        return j0Var;
    }

    public static final i0 h(v0 attributes, x0 constructor, List<? extends d1> arguments, boolean z10, pu.i memberScope, ss.l<? super xu.e, ? extends i0> refinedTypeFactory) {
        kotlin.jvm.internal.i.g(attributes, "attributes");
        kotlin.jvm.internal.i.g(constructor, "constructor");
        kotlin.jvm.internal.i.g(arguments, "arguments");
        kotlin.jvm.internal.i.g(memberScope, "memberScope");
        kotlin.jvm.internal.i.g(refinedTypeFactory, "refinedTypeFactory");
        j0 j0Var = new j0(constructor, arguments, z10, memberScope, refinedTypeFactory);
        if (!attributes.isEmpty()) {
            return new k0(j0Var, attributes);
        }
        return j0Var;
    }
}
