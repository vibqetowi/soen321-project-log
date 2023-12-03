package rt;

import gt.a;
import gt.b;
import gt.j;
import gt.q0;
import gt.u;
import ht.h;
import is.w;
import java.util.ArrayList;
import kt.l;
import kt.o0;
import kt.x;
import wu.b0;
/* compiled from: JavaClassConstructorDescriptor.java */
/* loaded from: classes2.dex */
public final class b extends l implements a {
    public Boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public Boolean f31015a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gt.e eVar, b bVar, h hVar, boolean z10, b.a aVar, q0 q0Var) {
        super(eVar, bVar, hVar, z10, aVar, q0Var);
        if (eVar != null) {
            if (hVar != null) {
                if (aVar != null) {
                    if (q0Var != null) {
                        this.Z = null;
                        this.f31015a0 = null;
                        return;
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
        I(0);
        throw null;
    }

    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        if (i6 != 11 && i6 != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 11 && i6 != 18) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i6 != 11) {
            if (i6 != 18) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
            } else {
                objArr[1] = "enhance";
            }
        } else {
            objArr[1] = "createSubstitutedCopy";
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 == 11 || i6 == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static b Z0(gt.e eVar, h hVar, boolean z10, vt.a aVar) {
        if (eVar != null) {
            if (aVar != null) {
                return new b(eVar, null, hVar, z10, b.a.DECLARATION, aVar);
            }
            I(6);
            throw null;
        }
        I(4);
        throw null;
    }

    @Override // kt.x, gt.a
    public final boolean E() {
        return this.f31015a0.booleanValue();
    }

    @Override // rt.a
    public final a G(b0 b0Var, ArrayList arrayList, b0 b0Var2, hs.f fVar) {
        o0 g5;
        gt.e c10 = c();
        b a12 = a1(m0(), c10, null, g(), getAnnotations());
        if (b0Var == null) {
            g5 = null;
        } else {
            g5 = iu.f.g(a12, b0Var, h.a.f19495a);
        }
        a12.P0(g5, this.D, w.f20676u, getTypeParameters(), ca.a.K(arrayList, i(), a12), b0Var2, m(), getVisibility());
        if (fVar != null) {
            a12.R0((a.InterfaceC0261a) fVar.f19464u, fVar.f19465v);
        }
        return a12;
    }

    @Override // kt.l, kt.x
    public final /* bridge */ /* synthetic */ x M0(b.a aVar, j jVar, u uVar, q0 q0Var, h hVar, fu.e eVar) {
        return a1(aVar, jVar, uVar, q0Var, hVar);
    }

    @Override // kt.x
    public final void S0(boolean z10) {
        this.Z = Boolean.valueOf(z10);
    }

    @Override // kt.x
    public final void T0(boolean z10) {
        this.f31015a0 = Boolean.valueOf(z10);
    }

    @Override // kt.l
    public final /* bridge */ /* synthetic */ l V0(b.a aVar, j jVar, u uVar, q0 q0Var, h hVar, fu.e eVar) {
        return a1(aVar, jVar, uVar, q0Var, hVar);
    }

    public final b a1(b.a aVar, j jVar, u uVar, q0 q0Var, h hVar) {
        if (jVar != null) {
            if (aVar != null) {
                if (hVar != null) {
                    if (q0Var != null) {
                        if (aVar != b.a.DECLARATION && aVar != b.a.SYNTHESIZED) {
                            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + jVar + "\nkind: " + aVar);
                        }
                        b bVar = new b((gt.e) jVar, (b) uVar, hVar, this.Y, aVar, q0Var);
                        bVar.S0(this.Z.booleanValue());
                        bVar.T0(E());
                        return bVar;
                    }
                    I(10);
                    throw null;
                }
                I(9);
                throw null;
            }
            I(8);
            throw null;
        }
        I(7);
        throw null;
    }
}
