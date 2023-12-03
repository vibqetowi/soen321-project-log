package kt;

import com.theinnerhour.b2b.utils.SessionManager;
import gt.t0;
import ht.h;
import java.util.ArrayList;
import java.util.List;
import wu.n1;
/* compiled from: TypeParameterDescriptorImpl.java */
/* loaded from: classes2.dex */
public final class t0 extends k {
    public final ss.l<wu.b0, Void> E;
    public final ArrayList F;
    public boolean G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t0(gt.j jVar, ht.h hVar, boolean z10, n1 n1Var, fu.e eVar, int i6, vu.l lVar) {
        super(lVar, jVar, hVar, eVar, n1Var, z10, i6, r8);
        t0.a aVar = t0.a.f16820a;
        if (jVar != null) {
            if (hVar != null) {
                if (n1Var != null) {
                    if (eVar != null) {
                        if (lVar != null) {
                            this.F = new ArrayList(1);
                            this.G = false;
                            this.E = null;
                            return;
                        }
                        I(25);
                        throw null;
                    }
                    I(22);
                    throw null;
                }
                I(21);
                throw null;
            }
            I(20);
            throw null;
        }
        I(19);
        throw null;
    }

    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        if (i6 != 5 && i6 != 28) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 5 && i6 != 28) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i6 != 5) {
            if (i6 != 28) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
            } else {
                objArr[1] = "resolveUpperBounds";
            }
        } else {
            objArr[1] = "createWithDefaultBound";
        }
        switch (i6) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 == 5 || i6 == 28) {
            throw new IllegalStateException(format);
        }
    }

    public static t0 P0(gt.j jVar, ht.h hVar, boolean z10, n1 n1Var, fu.e eVar, int i6, vu.l lVar) {
        if (jVar != null) {
            if (hVar != null) {
                if (n1Var != null) {
                    if (eVar != null) {
                        if (lVar != null) {
                            return new t0(jVar, hVar, z10, n1Var, eVar, i6, lVar);
                        }
                        I(11);
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
        I(6);
        throw null;
    }

    public static t0 Q0(gt.j jVar, n1 n1Var, fu.e eVar, int i6, vu.l lVar) {
        h.a.C0293a c0293a = h.a.f19495a;
        if (jVar != null) {
            if (lVar != null) {
                t0 P0 = P0(jVar, c0293a, false, n1Var, eVar, i6, lVar);
                wu.i0 n10 = mu.a.e(jVar).n();
                P0.O0();
                if (!ta.v.E(n10)) {
                    P0.F.add(n10);
                }
                P0.O0();
                P0.G = true;
                return P0;
            }
            I(4);
            throw null;
        }
        I(0);
        throw null;
    }

    @Override // kt.k
    public final void M0(wu.b0 b0Var) {
        if (b0Var != null) {
            ss.l<wu.b0, Void> lVar = this.E;
            if (lVar == null) {
                return;
            }
            lVar.invoke(b0Var);
            return;
        }
        I(27);
        throw null;
    }

    @Override // kt.k
    public final List<wu.b0> N0() {
        if (this.G) {
            ArrayList arrayList = this.F;
            if (arrayList != null) {
                return arrayList;
            }
            I(28);
            throw null;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + R0());
    }

    public final void O0() {
        if (!this.G) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + R0());
    }

    public final String R0() {
        return getName() + " declared in " + iu.g.g(c());
    }
}
