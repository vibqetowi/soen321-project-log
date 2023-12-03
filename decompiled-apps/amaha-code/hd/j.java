package hd;

import r1.b0;
/* compiled from: Dependency.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final o<?> f17423a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17424b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17425c;

    public j(int i6, int i10, Class cls) {
        this(o.a(cls), i6, i10);
    }

    public static j a(Class<?> cls) {
        return new j(0, 2, cls);
    }

    public static j b(Class<?> cls) {
        return new j(0, 1, cls);
    }

    public static j c(Class<?> cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.f17423a.equals(jVar.f17423a) || this.f17424b != jVar.f17424b || this.f17425c != jVar.f17425c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f17423a.hashCode() ^ 1000003) * 1000003) ^ this.f17424b) * 1000003) ^ this.f17425c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f17423a);
        sb2.append(", type=");
        int i6 = this.f17424b;
        if (i6 == 1) {
            str = "required";
        } else if (i6 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f17425c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(defpackage.c.p("Unsupported injection: ", i10));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return b0.b(sb2, str2, "}");
    }

    public j(o<?> oVar, int i6, int i10) {
        this.f17423a = oVar;
        this.f17424b = i6;
        this.f17425c = i10;
    }
}
