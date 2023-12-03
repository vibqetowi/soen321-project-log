package j0;

import android.graphics.Insets;
/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final e f21622e = new e(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f21623a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21624b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21625c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21626d;

    /* compiled from: Insets.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Insets a(int i6, int i10, int i11, int i12) {
            Insets of2;
            of2 = Insets.of(i6, i10, i11, i12);
            return of2;
        }
    }

    public e(int i6, int i10, int i11, int i12) {
        this.f21623a = i6;
        this.f21624b = i10;
        this.f21625c = i11;
        this.f21626d = i12;
    }

    public static e a(int i6, int i10, int i11, int i12) {
        if (i6 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f21622e;
        }
        return new e(i6, i10, i11, i12);
    }

    public static e b(Insets insets) {
        int i6;
        int i10;
        int i11;
        int i12;
        i6 = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return a(i6, i10, i11, i12);
    }

    public final Insets c() {
        return a.a(this.f21623a, this.f21624b, this.f21625c, this.f21626d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f21626d == eVar.f21626d && this.f21623a == eVar.f21623a && this.f21625c == eVar.f21625c && this.f21624b == eVar.f21624b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f21623a * 31) + this.f21624b) * 31) + this.f21625c) * 31) + this.f21626d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f21623a);
        sb2.append(", top=");
        sb2.append(this.f21624b);
        sb2.append(", right=");
        sb2.append(this.f21625c);
        sb2.append(", bottom=");
        return defpackage.c.s(sb2, this.f21626d, '}');
    }
}
