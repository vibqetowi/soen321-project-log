package pt;

import fv.f;
import gt.n0;
import gt.p0;
import gt.v0;
import gt.z0;
import iu.h;
import iu.l;
import java.util.List;
import wu.j1;
/* compiled from: ErasedOverridabilityCondition.kt */
/* loaded from: classes2.dex */
public final class n implements iu.h {

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28943a;

        static {
            int[] iArr = new int[v.h.e(3).length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f28943a = iArr;
        }
    }

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<z0, wu.b0> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f28944u = new b();

        public b() {
            super(1);
        }

        @Override // ss.l
        public final wu.b0 invoke(z0 z0Var) {
            return z0Var.a();
        }
    }

    @Override // iu.h
    public h.b a(gt.a superDescriptor, gt.a subDescriptor, gt.e eVar) {
        int i6;
        wu.b0 b0Var;
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.i.g(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.i.g(subDescriptor, "subDescriptor");
        boolean z12 = subDescriptor instanceof rt.e;
        h.b bVar = h.b.UNKNOWN;
        if (z12) {
            rt.e eVar2 = (rt.e) subDescriptor;
            if (!(!eVar2.getTypeParameters().isEmpty())) {
                l.b i10 = iu.l.i(superDescriptor, subDescriptor);
                if (i10 != null) {
                    i6 = i10.c();
                } else {
                    i6 = 0;
                }
                if (i6 != 0) {
                    return bVar;
                }
                List<z0> i11 = eVar2.i();
                kotlin.jvm.internal.i.f(i11, "subDescriptor.valueParameters");
                fv.v G0 = fv.t.G0(is.u.X1(i11), b.f28944u);
                wu.b0 b0Var2 = eVar2.A;
                kotlin.jvm.internal.i.d(b0Var2);
                fv.f I0 = fv.t.I0(G0, b0Var2);
                n0 n0Var = eVar2.C;
                if (n0Var != null) {
                    b0Var = n0Var.a();
                } else {
                    b0Var = null;
                }
                f.a aVar = new f.a(fv.k.w0(fv.k.y0(I0, is.u.X1(ca.a.Q0(b0Var)))));
                while (true) {
                    if (aVar.a()) {
                        wu.b0 b0Var3 = (wu.b0) aVar.next();
                        if ((!b0Var3.M0().isEmpty()) && !(b0Var3.R0() instanceof ut.g)) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return bVar;
                }
                gt.a d10 = superDescriptor.d(j1.e(new ut.f()));
                if (d10 == null) {
                    return bVar;
                }
                if (d10 instanceof p0) {
                    p0 p0Var = (p0) d10;
                    List<v0> typeParameters = p0Var.getTypeParameters();
                    kotlin.jvm.internal.i.f(typeParameters, "erasedSuper.typeParameters");
                    if (!typeParameters.isEmpty()) {
                        d10 = p0Var.s().j().build();
                        kotlin.jvm.internal.i.d(d10);
                    }
                }
                int c10 = iu.l.f.n(d10, subDescriptor, false).c();
                defpackage.c.y(c10, "DEFAULT.isOverridableByW…Descriptor, false).result");
                if (a.f28943a[v.h.d(c10)] == 1) {
                    return h.b.OVERRIDABLE;
                }
                return bVar;
            }
            return bVar;
        }
        return bVar;
    }

    @Override // iu.h
    public h.a b() {
        return h.a.SUCCESS_ONLY;
    }
}
