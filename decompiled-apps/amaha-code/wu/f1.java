package wu;
/* compiled from: TypeProjectionImpl.java */
/* loaded from: classes2.dex */
public final class f1 extends e1 {

    /* renamed from: a  reason: collision with root package name */
    public final n1 f37240a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f37241b;

    public f1(b0 b0Var, n1 n1Var) {
        if (n1Var == null) {
            e(0);
            throw null;
        } else if (b0Var != null) {
            this.f37240a = n1Var;
            this.f37241b = b0Var;
        } else {
            e(1);
            throw null;
        }
    }

    public static /* synthetic */ void e(int i6) {
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
        switch (i6) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i6 != 4) {
            if (i6 != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
            } else {
                objArr[1] = "getType";
            }
        } else {
            objArr[1] = "getProjectionKind";
        }
        if (i6 != 3) {
            if (i6 != 4 && i6 != 5) {
                if (i6 != 6) {
                    objArr[2] = "<init>";
                } else {
                    objArr[2] = "refine";
                }
            }
        } else {
            objArr[2] = "replaceType";
        }
        String format = String.format(str, objArr);
        if (i6 == 4 || i6 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // wu.d1
    public final b0 a() {
        b0 b0Var = this.f37241b;
        if (b0Var != null) {
            return b0Var;
        }
        e(5);
        throw null;
    }

    @Override // wu.d1
    public final n1 b() {
        n1 n1Var = this.f37240a;
        if (n1Var != null) {
            return n1Var;
        }
        e(4);
        throw null;
    }

    @Override // wu.d1
    public final d1 c(xu.e eVar) {
        if (eVar != null) {
            return new f1(eVar.H(this.f37241b), this.f37240a);
        }
        e(6);
        throw null;
    }

    @Override // wu.d1
    public final boolean d() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1(b0 b0Var) {
        this(b0Var, n1.INVARIANT);
        if (b0Var != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
