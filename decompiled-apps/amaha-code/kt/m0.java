package kt;

import gt.b;
import gt.z0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: PropertyGetterDescriptorImpl.java */
/* loaded from: classes2.dex */
public final class m0 extends k0 implements gt.l0 {
    public wu.b0 G;
    public final gt.l0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(gt.k0 k0Var, ht.h hVar, gt.z zVar, gt.q qVar, boolean z10, boolean z11, boolean z12, b.a aVar, gt.l0 l0Var, gt.q0 q0Var) {
        super(zVar, qVar, k0Var, hVar, fu.e.l("<get-" + k0Var.getName() + ">"), z10, z11, z12, aVar, q0Var);
        m0 m0Var;
        m0 m0Var2;
        if (hVar != null) {
            if (zVar != null) {
                if (qVar != null) {
                    if (aVar != null) {
                        if (q0Var != null) {
                            if (l0Var != 0) {
                                m0Var2 = this;
                                m0Var = l0Var;
                            } else {
                                m0Var = this;
                                m0Var2 = m0Var;
                            }
                            m0Var2.H = m0Var;
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
        if (i6 != 6 && i6 != 7 && i6 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 6 && i6 != 7 && i6 != 8) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i6 != 6) {
            if (i6 != 7) {
                if (i6 != 8) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                } else {
                    objArr[1] = "getOriginal";
                }
            } else {
                objArr[1] = "getValueParameters";
            }
        } else {
            objArr[1] = "getOverriddenDescriptors";
        }
        if (i6 != 6 && i6 != 7 && i6 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i6 == 6 || i6 == 7 || i6 == 8) {
            throw new IllegalStateException(format);
        }
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.h(this, d10);
    }

    @Override // kt.k0, kt.q, kt.p, gt.j
    /* renamed from: N0 */
    public final gt.l0 b() {
        gt.l0 l0Var = this.H;
        if (l0Var != null) {
            return l0Var;
        }
        I(8);
        throw null;
    }

    public final void O0(wu.b0 b0Var) {
        if (b0Var == null) {
            b0Var = E0().a();
        }
        this.G = b0Var;
    }

    @Override // gt.u, gt.b, gt.a
    public final Collection<? extends gt.l0> f() {
        return M0(true);
    }

    @Override // gt.a
    public final wu.b0 getReturnType() {
        return this.G;
    }

    @Override // gt.a
    public final List<z0> i() {
        List<z0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        I(7);
        throw null;
    }
}
