package nu;
/* compiled from: JvmClassName.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f26836a;

    public b(String str) {
        if (str != null) {
            this.f26836a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        if (i6 != 3 && i6 != 6 && i6 != 7 && i6 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 3 && i6 != 6 && i6 != 7 && i6 != 8) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i6 != 3) {
            if (i6 != 6) {
                if (i6 != 7) {
                    if (i6 != 8) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    } else {
                        objArr[1] = "getInternalName";
                    }
                } else {
                    objArr[1] = "getPackageFqName";
                }
            } else {
                objArr[1] = "getFqNameForClassNameWithoutDollars";
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i6) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 == 3 || i6 == 6 || i6 == 7 || i6 == 8) {
            throw new IllegalStateException(format);
        }
    }

    public static b b(fu.b bVar) {
        if (bVar != null) {
            fu.c h10 = bVar.h();
            String replace = bVar.i().b().replace('.', '$');
            if (h10.d()) {
                return new b(replace);
            }
            return new b(h10.b().replace('.', '/') + "/" + replace);
        }
        a(1);
        throw null;
    }

    public static b c(fu.c cVar) {
        if (cVar != null) {
            return new b(cVar.b().replace('.', '/'));
        }
        a(2);
        throw null;
    }

    public static b d(String str) {
        if (str != null) {
            return new b(str);
        }
        a(0);
        throw null;
    }

    public final String e() {
        String str = this.f26836a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            return this.f26836a.equals(((b) obj).f26836a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26836a.hashCode();
    }

    public final String toString() {
        return this.f26836a;
    }
}
