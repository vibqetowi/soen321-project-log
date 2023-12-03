package kt;

import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: DeclarationDescriptorImpl.java */
/* loaded from: classes2.dex */
public abstract class p extends ht.b implements gt.j {

    /* renamed from: v  reason: collision with root package name */
    public final fu.e f23878v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ht.h hVar, fu.e eVar) {
        super(hVar);
        if (hVar != null) {
            if (eVar != null) {
                this.f23878v = eVar;
                return;
            }
            I(1);
            throw null;
        }
        I(0);
        throw null;
    }

    public static String C0(gt.j jVar) {
        if (jVar != null) {
            try {
                String str = hu.c.f19529b.G(jVar) + "[" + jVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(jVar)) + "]";
                if (str != null) {
                    return str;
                }
                I(5);
                throw null;
            } catch (Throwable unused) {
                String str2 = jVar.getClass().getSimpleName() + " " + jVar.getName();
                if (str2 != null) {
                    return str2;
                }
                I(6);
                throw null;
            }
        }
        I(4);
        throw null;
    }

    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        if (i6 != 2 && i6 != 3 && i6 != 5 && i6 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 2 && i6 != 3 && i6 != 5 && i6 != 6) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 5 && i6 != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                } else {
                    objArr[1] = "toString";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        if (i6 != 2 && i6 != 3) {
            if (i6 != 4) {
                if (i6 != 5 && i6 != 6) {
                    objArr[2] = "<init>";
                }
            } else {
                objArr[2] = "toString";
            }
        }
        String format = String.format(str, objArr);
        if (i6 == 2 || i6 == 3 || i6 == 5 || i6 == 6) {
            throw new IllegalStateException(format);
        }
    }

    @Override // gt.j
    public final fu.e getName() {
        fu.e eVar = this.f23878v;
        if (eVar != null) {
            return eVar;
        }
        I(2);
        throw null;
    }

    public String toString() {
        return C0(this);
    }

    public gt.j b() {
        return this;
    }
}
