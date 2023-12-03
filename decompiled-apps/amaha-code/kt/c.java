package kt;

import com.theinnerhour.b2b.utils.SessionManager;
import wu.n1;
/* compiled from: AbstractLazyTypeParameterDescriptor.java */
/* loaded from: classes2.dex */
public abstract class c extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vu.l lVar, gt.j jVar, ht.h hVar, fu.e eVar, n1 n1Var, boolean z10, int i6, gt.t0 t0Var) {
        super(lVar, jVar, hVar, eVar, n1Var, z10, i6, t0Var);
        if (lVar != null) {
            if (jVar != null) {
                if (eVar != null) {
                    if (t0Var != null) {
                        return;
                    } else {
                        I(6);
                        throw null;
                    }
                }
                I(3);
                throw null;
            }
            I(1);
            throw null;
        }
        I(0);
        throw null;
    }

    public static /* synthetic */ void I(int i6) {
        Object[] objArr = new Object[3];
        switch (i6) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kt.p
    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        String str2 = "";
        if (!this.f23857z) {
            str = "";
        } else {
            str = "reified ";
        }
        objArr[0] = str;
        if (O() != n1.INVARIANT) {
            str2 = O() + " ";
        }
        objArr[1] = str2;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
