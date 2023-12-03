package nc;
/* compiled from: CharMatcher.java */
/* loaded from: classes.dex */
public abstract class b implements h<Character> {

    /* compiled from: CharMatcher.java */
    /* loaded from: classes.dex */
    public static abstract class a extends b {
        @Override // nc.h
        @Deprecated
        public final boolean apply(Character ch2) {
            return b(ch2.charValue());
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: nc.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0427b extends a {

        /* renamed from: u  reason: collision with root package name */
        public final char f25981u;

        public C0427b(char c10) {
            this.f25981u = c10;
        }

        @Override // nc.b
        public final boolean b(char c10) {
            if (c10 == this.f25981u) {
                return true;
            }
            return false;
        }

        public final String toString() {
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            char c10 = this.f25981u;
            for (int i6 = 0; i6 < 4; i6++) {
                cArr[5 - i6] = "0123456789ABCDEF".charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
            }
            String copyValueOf = String.copyValueOf(cArr);
            StringBuilder sb2 = new StringBuilder(ri.e.c(copyValueOf, 18));
            sb2.append("CharMatcher.is('");
            sb2.append(copyValueOf);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* compiled from: CharMatcher.java */
    /* loaded from: classes.dex */
    public static abstract class c extends a {

        /* renamed from: u  reason: collision with root package name */
        public final String f25982u;

        public c(String str) {
            this.f25982u = str;
        }

        public final String toString() {
            return this.f25982u;
        }
    }

    /* compiled from: CharMatcher.java */
    /* loaded from: classes.dex */
    public static final class d extends c {

        /* renamed from: v  reason: collision with root package name */
        public static final d f25983v = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // nc.b
        public final int a(int i6, CharSequence charSequence) {
            sc.b.x(i6, charSequence.length());
            return -1;
        }

        @Override // nc.b
        public final boolean b(char c10) {
            return false;
        }
    }

    /* compiled from: CharMatcher.java */
    /* loaded from: classes.dex */
    public static final class e extends c {

        /* renamed from: v  reason: collision with root package name */
        public static final int f25984v = Integer.numberOfLeadingZeros(31);

        /* renamed from: w  reason: collision with root package name */
        public static final e f25985w = new e();

        public e() {
            super("CharMatcher.whitespace()");
        }

        @Override // nc.b
        public final boolean b(char c10) {
            if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f25984v) == c10) {
                return true;
            }
            return false;
        }
    }

    public int a(int i6, CharSequence charSequence) {
        int length = charSequence.length();
        sc.b.x(i6, length);
        while (i6 < length) {
            if (b(charSequence.charAt(i6))) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public abstract boolean b(char c10);
}
