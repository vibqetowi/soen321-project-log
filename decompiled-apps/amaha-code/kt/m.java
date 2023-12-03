package kt;

import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: ClassDescriptorBase.java */
/* loaded from: classes2.dex */
public abstract class m extends b {
    public final boolean A;

    /* renamed from: y  reason: collision with root package name */
    public final gt.j f23872y;

    /* renamed from: z  reason: collision with root package name */
    public final gt.q0 f23873z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(vu.l lVar, gt.j jVar, fu.e eVar, gt.q0 q0Var) {
        super(lVar, eVar);
        if (lVar != null) {
            if (jVar != null) {
                if (eVar != null) {
                    if (q0Var != null) {
                        this.f23872y = jVar;
                        this.f23873z = q0Var;
                        this.A = false;
                        return;
                    }
                    D0(3);
                    throw null;
                }
                D0(2);
                throw null;
            }
            D0(1);
            throw null;
        }
        D0(0);
        throw null;
    }

    public static /* synthetic */ void D0(int i6) {
        String str;
        int i10;
        if (i6 != 4 && i6 != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 4 && i6 != 5) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4 && i6 != 5) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
                    }
                } else {
                    objArr[0] = "source";
                }
            } else {
                objArr[0] = SessionManager.KEY_NAME;
            }
        } else {
            objArr[0] = "containingDeclaration";
        }
        if (i6 != 4) {
            if (i6 != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
            } else {
                objArr[1] = "getSource";
            }
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i6 != 4 && i6 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i6 == 4 || i6 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // gt.e, gt.k, gt.j
    public final gt.j c() {
        gt.j jVar = this.f23872y;
        if (jVar != null) {
            return jVar;
        }
        D0(4);
        throw null;
    }

    @Override // gt.m
    public final gt.q0 g() {
        gt.q0 q0Var = this.f23873z;
        if (q0Var != null) {
            return q0Var;
        }
        D0(5);
        throw null;
    }

    public boolean isExternal() {
        return this.A;
    }
}
