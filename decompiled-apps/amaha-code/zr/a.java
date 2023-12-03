package zr;
/* compiled from: HttpUrl.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f39827a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39828b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39829c;

    /* compiled from: HttpUrl.java */
    /* renamed from: zr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0685a {

        /* renamed from: a  reason: collision with root package name */
        public String f39830a;

        /* renamed from: b  reason: collision with root package name */
        public String f39831b;

        /* renamed from: c  reason: collision with root package name */
        public int f39832c = -1;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f39830a);
            sb2.append("://");
            int i6 = -1;
            if (this.f39831b.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.f39831b);
                sb2.append(']');
            } else {
                sb2.append(this.f39831b);
            }
            int i10 = this.f39832c;
            if (i10 == -1) {
                String str = this.f39830a;
                if (str.equals("http")) {
                    i10 = 80;
                } else if (str.equals("https")) {
                    i10 = 443;
                } else {
                    i10 = -1;
                }
            }
            String str2 = this.f39830a;
            if (str2.equals("http")) {
                i6 = 80;
            } else if (str2.equals("https")) {
                i6 = 443;
            }
            if (i10 != i6) {
                sb2.append(':');
                sb2.append(i10);
            }
            return sb2.toString();
        }
    }

    public a(C0685a c0685a) {
        String str = c0685a.f39830a;
        this.f39827a = c0685a.f39831b;
        int i6 = c0685a.f39832c;
        if (i6 == -1) {
            if (str.equals("http")) {
                i6 = 80;
            } else if (str.equals("https")) {
                i6 = 443;
            } else {
                i6 = -1;
            }
        }
        this.f39828b = i6;
        this.f39829c = c0685a.toString();
    }

    public static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && ((a) obj).f39829c.equals(this.f39829c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39829c.hashCode();
    }

    public final String toString() {
        return this.f39829c;
    }
}
