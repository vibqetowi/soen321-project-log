package fu;

import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: Name.java */
/* loaded from: classes2.dex */
public final class e implements Comparable<e> {

    /* renamed from: u  reason: collision with root package name */
    public final String f15930u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f15931v;

    public e(String str, boolean z10) {
        if (str != null) {
            this.f15930u = str;
            this.f15931v = z10;
            return;
        }
        d(0);
        throw null;
    }

    public static /* synthetic */ void d(int i6) {
        String str;
        int i10;
        if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4) {
            objArr[0] = SessionManager.KEY_NAME;
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3 && i6 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
                } else {
                    objArr[1] = "asStringStripSpecialMarkers";
                }
            } else {
                objArr[1] = "getIdentifier";
            }
        } else {
            objArr[1] = "asString";
        }
        switch (i6) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static e i(String str) {
        if (str != null) {
            if (str.startsWith("<")) {
                return l(str);
            }
            return j(str);
        }
        d(8);
        throw null;
    }

    public static e j(String str) {
        if (str != null) {
            return new e(str, false);
        }
        d(5);
        throw null;
    }

    public static boolean k(String str) {
        if (str != null) {
            if (str.isEmpty() || str.startsWith("<")) {
                return false;
            }
            for (int i6 = 0; i6 < str.length(); i6++) {
                char charAt = str.charAt(i6);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
        d(6);
        throw null;
    }

    public static e l(String str) {
        if (str != null) {
            if (str.startsWith("<")) {
                return new e(str, true);
            }
            throw new IllegalArgumentException("special name must start with '<': ".concat(str));
        }
        d(7);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        return this.f15930u.compareTo(eVar.f15930u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f15931v == eVar.f15931v && this.f15930u.equals(eVar.f15930u)) {
            return true;
        }
        return false;
    }

    public final String f() {
        String str = this.f15930u;
        if (str != null) {
            return str;
        }
        d(1);
        throw null;
    }

    public final String h() {
        if (!this.f15931v) {
            String f = f();
            if (f != null) {
                return f;
            }
            d(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public final int hashCode() {
        return (this.f15930u.hashCode() * 31) + (this.f15931v ? 1 : 0);
    }

    public final String toString() {
        return this.f15930u;
    }
}
