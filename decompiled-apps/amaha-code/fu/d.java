package fu;

import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import ss.l;
/* compiled from: FqNameUnsafe.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: e */
    public static final e f15924e = e.l("<root>");
    public static final Pattern f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final a f15925g = new a();

    /* renamed from: a */
    public final String f15926a;

    /* renamed from: b */
    public transient c f15927b;

    /* renamed from: c */
    public transient d f15928c;

    /* renamed from: d */
    public transient e f15929d;

    /* compiled from: FqNameUnsafe.java */
    /* loaded from: classes2.dex */
    public static class a implements l<String, e> {
        @Override // ss.l
        public final e invoke(String str) {
            return e.i(str);
        }
    }

    public d(String str, c cVar) {
        if (str == null) {
            a(0);
            throw null;
        } else if (cVar != null) {
            this.f15926a = str;
            this.f15927b = cVar;
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
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
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i10 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 1) {
            switch (i6) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = SessionManager.KEY_NAME;
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i6) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
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
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public final d b(e eVar) {
        String str;
        if (eVar != null) {
            if (d()) {
                str = eVar.f();
            } else {
                str = this.f15926a + "." + eVar.f();
            }
            return new d(str, this, eVar);
        }
        a(9);
        throw null;
    }

    public final void c() {
        String str = this.f15926a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f15929d = e.i(str.substring(lastIndexOf + 1));
            this.f15928c = new d(str.substring(0, lastIndexOf));
            return;
        }
        this.f15929d = e.i(str);
        this.f15928c = c.f15921c.i();
    }

    public final boolean d() {
        return this.f15926a.isEmpty();
    }

    public final boolean e() {
        if (this.f15927b == null) {
            String str = this.f15926a;
            if (str != null) {
                if (str.indexOf(60) >= 0) {
                    return false;
                }
            } else {
                a(4);
                throw null;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.f15926a.equals(((d) obj).f15926a)) {
            return true;
        }
        return false;
    }

    public final List<e> f() {
        List<e> list;
        if (d()) {
            list = Collections.emptyList();
        } else {
            String[] split = f.split(this.f15926a);
            kotlin.jvm.internal.i.g(split, "<this>");
            a transform = f15925g;
            kotlin.jvm.internal.i.g(transform, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str : split) {
                arrayList.add(transform.invoke(str));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final e g() {
        e eVar = this.f15929d;
        if (eVar != null) {
            if (eVar != null) {
                return eVar;
            }
            a(10);
            throw null;
        } else if (!d()) {
            c();
            e eVar2 = this.f15929d;
            if (eVar2 != null) {
                return eVar2;
            }
            a(11);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public final c h() {
        c cVar = this.f15927b;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            a(5);
            throw null;
        }
        c cVar2 = new c(this);
        this.f15927b = cVar2;
        return cVar2;
    }

    public final int hashCode() {
        return this.f15926a.hashCode();
    }

    public final String toString() {
        String str;
        if (d()) {
            str = f15924e.f();
        } else {
            str = this.f15926a;
        }
        if (str != null) {
            return str;
        }
        a(17);
        throw null;
    }

    public d(String str) {
        if (str != null) {
            this.f15926a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public d(String str, d dVar, e eVar) {
        if (str != null) {
            this.f15926a = str;
            this.f15928c = dVar;
            this.f15929d = eVar;
            return;
        }
        a(3);
        throw null;
    }
}
