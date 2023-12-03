package fu;

import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: FqName.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f15921c = new c("");

    /* renamed from: a  reason: collision with root package name */
    public final d f15922a;

    /* renamed from: b  reason: collision with root package name */
    public transient c f15923b;

    public c(String str) {
        if (str != null) {
            this.f15922a = new d(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i10 = 2;
                break;
            case 8:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i6) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i6) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static c j(e eVar) {
        if (eVar != null) {
            if (eVar != null) {
                return new c(new d(eVar.f(), f15921c.i(), eVar));
            }
            d.a(16);
            throw null;
        }
        a(13);
        throw null;
    }

    public final String b() {
        String str = this.f15922a.f15926a;
        if (str != null) {
            return str;
        }
        d.a(4);
        throw null;
    }

    public final c c(e eVar) {
        if (eVar != null) {
            return new c(this.f15922a.b(eVar), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.f15922a.d();
    }

    public final c e() {
        c cVar = this.f15923b;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            a(6);
            throw null;
        } else if (!d()) {
            d dVar = this.f15922a;
            d dVar2 = dVar.f15928c;
            if (dVar2 == null) {
                if (!dVar.d()) {
                    dVar.c();
                    dVar2 = dVar.f15928c;
                    if (dVar2 == null) {
                        d.a(8);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("root");
                }
            }
            c cVar2 = new c(dVar2);
            this.f15923b = cVar2;
            return cVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f15922a.equals(((c) obj).f15922a)) {
            return true;
        }
        return false;
    }

    public final e f() {
        e g5 = this.f15922a.g();
        if (g5 != null) {
            return g5;
        }
        a(9);
        throw null;
    }

    public final e g() {
        e g5;
        d dVar = this.f15922a;
        if (dVar.d()) {
            g5 = d.f15924e;
            if (g5 == null) {
                d.a(12);
                throw null;
            }
        } else {
            g5 = dVar.g();
            if (g5 == null) {
                d.a(13);
                throw null;
            }
        }
        return g5;
    }

    public final boolean h(e eVar) {
        if (eVar != null) {
            d dVar = this.f15922a;
            if (dVar.d()) {
                return false;
            }
            String str = dVar.f15926a;
            int indexOf = str.indexOf(46);
            String f = eVar.f();
            if (indexOf == -1) {
                indexOf = str.length();
            }
            return str.regionMatches(0, f, 0, indexOf);
        }
        a(12);
        throw null;
    }

    public final int hashCode() {
        return this.f15922a.hashCode();
    }

    public final d i() {
        d dVar = this.f15922a;
        if (dVar != null) {
            return dVar;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.f15922a.toString();
    }

    public c(d dVar) {
        if (dVar != null) {
            this.f15922a = dVar;
        } else {
            a(2);
            throw null;
        }
    }

    public c(d dVar, c cVar) {
        this.f15922a = dVar;
        this.f15923b = cVar;
    }
}
