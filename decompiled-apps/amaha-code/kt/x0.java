package kt;

import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: VariableDescriptorWithInitializerImpl.java */
/* loaded from: classes2.dex */
public abstract class x0 extends w0 {
    public vu.j<ku.g<?>> A;
    public ss.a<vu.j<ku.g<?>>> B;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f23927z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(gt.j jVar, ht.h hVar, fu.e eVar, boolean z10, gt.q0 q0Var) {
        super(jVar, hVar, eVar, null, q0Var);
        if (jVar != null) {
            if (hVar != null) {
                if (eVar != null) {
                    if (q0Var != null) {
                        this.f23927z = z10;
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
        Object[] objArr = new Object[3];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4 && i6 != 5) {
                        objArr[0] = "containingDeclaration";
                    } else {
                        objArr[0] = "compileTimeInitializerFactory";
                    }
                } else {
                    objArr[0] = "source";
                }
            } else {
                objArr[0] = SessionManager.KEY_NAME;
            }
        } else {
            objArr[0] = "annotations";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i6 != 4) {
            if (i6 != 5) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setCompileTimeInitializer";
            }
        } else {
            objArr[2] = "setCompileTimeInitializerFactory";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final void I0(vu.j<ku.g<?>> jVar, ss.a<vu.j<ku.g<?>>> aVar) {
        if (aVar != null) {
            this.B = aVar;
            if (jVar == null) {
                jVar = aVar.invoke();
            }
            this.A = jVar;
            return;
        }
        I(5);
        throw null;
    }

    @Override // gt.a1
    public final ku.g<?> X() {
        vu.j<ku.g<?>> jVar = this.A;
        if (jVar != null) {
            return jVar.invoke();
        }
        return null;
    }

    @Override // gt.a1
    public final boolean i0() {
        return this.f23927z;
    }
}
