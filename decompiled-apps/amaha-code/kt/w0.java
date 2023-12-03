package kt;

import com.theinnerhour.b2b.utils.SessionManager;
import gt.a1;
import gt.z0;
import java.util.Collections;
import java.util.List;
/* compiled from: VariableDescriptorImpl.java */
/* loaded from: classes2.dex */
public abstract class w0 extends q implements a1 {

    /* renamed from: y  reason: collision with root package name */
    public wu.b0 f23902y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(gt.j jVar, ht.h hVar, fu.e eVar, wu.b0 b0Var, gt.q0 q0Var) {
        super(jVar, hVar, eVar, q0Var);
        if (jVar != null) {
            if (hVar != null) {
                if (eVar != null) {
                    if (q0Var != null) {
                        this.f23902y = b0Var;
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
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i6) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // gt.a
    public boolean E() {
        return false;
    }

    @Override // gt.y0
    public final wu.b0 a() {
        wu.b0 b0Var = this.f23902y;
        if (b0Var != null) {
            return b0Var;
        }
        I(4);
        throw null;
    }

    public gt.n0 f0() {
        return null;
    }

    public wu.b0 getReturnType() {
        wu.b0 a10 = a();
        if (a10 != null) {
            return a10;
        }
        I(10);
        throw null;
    }

    public List<gt.v0> getTypeParameters() {
        List<gt.v0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        I(8);
        throw null;
    }

    @Override // gt.a
    public final List<z0> i() {
        List<z0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        I(6);
        throw null;
    }

    public gt.n0 k0() {
        return null;
    }
}
