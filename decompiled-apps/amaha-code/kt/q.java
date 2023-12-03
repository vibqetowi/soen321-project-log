package kt;

import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: DeclarationDescriptorNonRootImpl.java */
/* loaded from: classes2.dex */
public abstract class q extends p implements gt.k {

    /* renamed from: w  reason: collision with root package name */
    public final gt.j f23879w;

    /* renamed from: x  reason: collision with root package name */
    public final gt.q0 f23880x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(gt.j jVar, ht.h hVar, fu.e eVar, gt.q0 q0Var) {
        super(hVar, eVar);
        if (jVar != null) {
            if (hVar != null) {
                if (eVar != null) {
                    if (q0Var != null) {
                        this.f23879w = jVar;
                        this.f23880x = q0Var;
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
        if (i6 != 4 && i6 != 5 && i6 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 4 && i6 != 5 && i6 != 6) {
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
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i6 != 4) {
            if (i6 != 5) {
                if (i6 != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                } else {
                    objArr[1] = "getSource";
                }
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getOriginal";
        }
        if (i6 != 4 && i6 != 5 && i6 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i6 == 4 || i6 == 5 || i6 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public gt.j c() {
        gt.j jVar = this.f23879w;
        if (jVar != null) {
            return jVar;
        }
        I(5);
        throw null;
    }

    public gt.q0 g() {
        gt.q0 q0Var = this.f23880x;
        if (q0Var != null) {
            return q0Var;
        }
        I(6);
        throw null;
    }

    @Override // kt.p, gt.j
    /* renamed from: D0 */
    public gt.m b() {
        return this;
    }
}
