package kt;

import gt.b;
import gt.z0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: PropertySetterDescriptorImpl.java */
/* loaded from: classes2.dex */
public final class n0 extends k0 implements gt.m0 {
    public z0 G;
    public final gt.m0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(gt.k0 k0Var, ht.h hVar, gt.z zVar, gt.q qVar, boolean z10, boolean z11, boolean z12, b.a aVar, gt.m0 m0Var, gt.q0 q0Var) {
        super(zVar, qVar, k0Var, hVar, fu.e.l("<set-" + k0Var.getName() + ">"), z10, z11, z12, aVar, q0Var);
        n0 n0Var;
        n0 n0Var2;
        if (hVar != null) {
            if (zVar != null) {
                if (qVar != null) {
                    if (aVar != null) {
                        if (q0Var != null) {
                            if (m0Var != 0) {
                                n0Var2 = this;
                                n0Var = m0Var;
                            } else {
                                n0Var = this;
                                n0Var2 = n0Var;
                            }
                            n0Var2.H = n0Var;
                            return;
                        }
                        I(5);
                        throw null;
                    }
                    I(4);
                    throw null;
                }
                I(3);
                throw null;
            }
            I(2);
            throw null;
        }
        I(1);
        throw null;
    }

    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        switch (i6) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 10:
            case 11:
            case 12:
            case 13:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i6) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i6) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static v0 N0(n0 n0Var, wu.b0 b0Var, ht.h hVar) {
        if (b0Var != null) {
            if (hVar != null) {
                return new v0(n0Var, null, 0, hVar, fu.g.f15938g, b0Var, false, false, false, null, gt.q0.f16815a);
            }
            I(9);
            throw null;
        }
        I(8);
        throw null;
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.e(this, d10);
    }

    @Override // kt.k0, kt.q, kt.p, gt.j
    /* renamed from: O0 */
    public final gt.m0 b() {
        gt.m0 m0Var = this.H;
        if (m0Var != null) {
            return m0Var;
        }
        I(13);
        throw null;
    }

    @Override // gt.u, gt.b, gt.a
    public final Collection<? extends gt.m0> f() {
        return M0(false);
    }

    @Override // gt.a
    public final wu.b0 getReturnType() {
        wu.i0 x10 = mu.a.e(this).x();
        if (x10 != null) {
            return x10;
        }
        I(12);
        throw null;
    }

    @Override // gt.a
    public final List<z0> i() {
        z0 z0Var = this.G;
        if (z0Var != null) {
            List<z0> singletonList = Collections.singletonList(z0Var);
            if (singletonList != null) {
                return singletonList;
            }
            I(11);
            throw null;
        }
        throw new IllegalStateException();
    }
}
