package ge;

import r1.b0;
/* compiled from: User.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final e f16467b = new e(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f16468a;

    public e(String str) {
        this.f16468a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        String str = ((e) obj).f16468a;
        String str2 = this.f16468a;
        if (str2 != null) {
            return str2.equals(str);
        }
        if (str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16468a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return b0.b(new StringBuilder("User(uid:"), this.f16468a, ")");
    }
}
