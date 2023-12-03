package lv;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: HttpUrl.kt */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f24685k;

    /* renamed from: a  reason: collision with root package name */
    public final String f24686a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24687b;

    /* renamed from: c  reason: collision with root package name */
    public final String f24688c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24689d;

    /* renamed from: e  reason: collision with root package name */
    public final int f24690e;
    public final List<String> f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f24691g;

    /* renamed from: h  reason: collision with root package name */
    public final String f24692h;

    /* renamed from: i  reason: collision with root package name */
    public final String f24693i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f24694j;

    /* compiled from: HttpUrl.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f24695a;

        /* renamed from: d  reason: collision with root package name */
        public String f24698d;
        public final ArrayList f;

        /* renamed from: g  reason: collision with root package name */
        public List<String> f24700g;

        /* renamed from: h  reason: collision with root package name */
        public String f24701h;

        /* renamed from: b  reason: collision with root package name */
        public String f24696b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f24697c = "";

        /* renamed from: e  reason: collision with root package name */
        public int f24699e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final t a() {
            ArrayList arrayList;
            String d10;
            String str = this.f24695a;
            if (str != null) {
                String d11 = b.d(this.f24696b, 0, 0, false, 7);
                String d12 = b.d(this.f24697c, 0, 0, false, 7);
                String str2 = this.f24698d;
                if (str2 != null) {
                    int b10 = b();
                    ArrayList arrayList2 = this.f;
                    ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(b.d((String) it.next(), 0, 0, false, 7));
                    }
                    List<String> list = this.f24700g;
                    String str3 = null;
                    if (list == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(is.i.H1(list, 10));
                        for (String str4 : list) {
                            if (str4 == null) {
                                d10 = null;
                            } else {
                                d10 = b.d(str4, 0, 0, true, 3);
                            }
                            arrayList.add(d10);
                        }
                    }
                    String str5 = this.f24701h;
                    if (str5 != null) {
                        str3 = b.d(str5, 0, 0, false, 7);
                    }
                    return new t(str, d11, d12, str2, b10, arrayList3, arrayList, str3, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int b() {
            int i6 = this.f24699e;
            if (i6 == -1) {
                String str = this.f24695a;
                kotlin.jvm.internal.i.d(str);
                if (kotlin.jvm.internal.i.b(str, "http")) {
                    return 80;
                }
                if (kotlin.jvm.internal.i.b(str, "https")) {
                    return 443;
                }
                return -1;
            }
            return i6;
        }

        public final void c(String str) {
            ArrayList e10;
            if (str == null) {
                e10 = null;
            } else {
                e10 = b.e(b.a(str, 0, 0, " \"'<>#", true, false, true, false, null, 211));
            }
            this.f24700g = e10;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:141:0x0284
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public final void d(lv.t r27, java.lang.String r28) {
            /*
                Method dump skipped, instructions count: 1133
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lv.t.a.d(lv.t, java.lang.String):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            if (r1 != false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
            if (r1 != r3) goto L45;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String toString() {
            boolean z10;
            boolean z11;
            StringBuilder sb2 = new StringBuilder();
            String str = this.f24695a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            boolean z12 = true;
            if (this.f24696b.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (this.f24697c.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            sb2.append(this.f24696b);
            if (this.f24697c.length() <= 0) {
                z12 = false;
            }
            if (z12) {
                sb2.append(':');
                sb2.append(this.f24697c);
            }
            sb2.append('@');
            String str2 = this.f24698d;
            if (str2 != null) {
                if (gv.r.I0(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.f24698d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f24698d);
                }
            }
            int i6 = -1;
            if (this.f24699e != -1 || this.f24695a != null) {
                int b10 = b();
                String str3 = this.f24695a;
                if (str3 != null) {
                    if (kotlin.jvm.internal.i.b(str3, "http")) {
                        i6 = 80;
                    } else if (kotlin.jvm.internal.i.b(str3, "https")) {
                        i6 = 443;
                    }
                }
                sb2.append(':');
                sb2.append(b10);
            }
            ArrayList arrayList = this.f;
            kotlin.jvm.internal.i.g(arrayList, "<this>");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append((String) arrayList.get(i10));
            }
            if (this.f24700g != null) {
                sb2.append('?');
                List<String> list = this.f24700g;
                kotlin.jvm.internal.i.d(list);
                b.f(sb2, list);
            }
            if (this.f24701h != null) {
                sb2.append('#');
                sb2.append(this.f24701h);
            }
            String sb3 = sb2.toString();
            kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }

    /* compiled from: HttpUrl.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public static String a(String str, int i6, int i10, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i11) {
            boolean z14;
            boolean z15;
            String str3;
            if ((i11 & 1) != 0) {
                i6 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 8) != 0) {
                z10 = false;
            }
            if ((i11 & 16) != 0) {
                z11 = false;
            }
            if ((i11 & 32) != 0) {
                z12 = false;
            }
            if ((i11 & 64) != 0) {
                z13 = false;
            }
            int i12 = 128;
            if ((i11 & 128) != 0) {
                charset = null;
            }
            kotlin.jvm.internal.i.g(str, "<this>");
            int i13 = i6;
            while (i13 < i10) {
                int codePointAt = str.codePointAt(i13);
                int i14 = 43;
                int i15 = 32;
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < i12 || z13) && !gv.r.I0(str2, (char) codePointAt) && ((codePointAt != 37 || (z10 && (!z11 || c(i13, i10, str)))) && (codePointAt != 43 || !z12)))) {
                    i13 += Character.charCount(codePointAt);
                    i12 = 128;
                } else {
                    zv.e eVar = new zv.e();
                    eVar.Q0(i6, i13, str);
                    zv.e eVar2 = null;
                    while (i13 < i10) {
                        int codePointAt2 = str.codePointAt(i13);
                        if (!z10 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                            if (codePointAt2 == i14 && z12) {
                                if (z10) {
                                    str3 = "+";
                                } else {
                                    str3 = "%2B";
                                }
                                eVar.R0(str3);
                            } else if (codePointAt2 >= i15 && codePointAt2 != 127 && ((codePointAt2 < 128 || z13) && !gv.r.I0(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z10 && (!z11 || c(i13, i10, str)))))) {
                                eVar.S0(codePointAt2);
                            } else {
                                if (eVar2 == null) {
                                    eVar2 = new zv.e();
                                }
                                if (charset != null && !kotlin.jvm.internal.i.b(charset, StandardCharsets.UTF_8)) {
                                    int charCount = Character.charCount(codePointAt2) + i13;
                                    boolean z16 = true;
                                    if (i13 >= 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        if (charCount >= i13) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            if (charCount > str.length()) {
                                                z16 = false;
                                            }
                                            if (z16) {
                                                if (kotlin.jvm.internal.i.b(charset, gv.a.f16927b)) {
                                                    eVar2.Q0(i13, charCount, str);
                                                } else {
                                                    String substring = str.substring(i13, charCount);
                                                    kotlin.jvm.internal.i.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                                    byte[] bytes = substring.getBytes(charset);
                                                    kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
                                                    eVar2.y0(0, bytes, bytes.length);
                                                }
                                            } else {
                                                StringBuilder u10 = defpackage.c.u("endIndex > string.length: ", charCount, " > ");
                                                u10.append(str.length());
                                                throw new IllegalArgumentException(u10.toString().toString());
                                            }
                                        } else {
                                            throw new IllegalArgumentException(defpackage.b.j("endIndex < beginIndex: ", charCount, " < ", i13).toString());
                                        }
                                    } else {
                                        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Integer.valueOf(i13), "beginIndex < 0: ").toString());
                                    }
                                } else {
                                    eVar2.S0(codePointAt2);
                                }
                                while (!eVar2.B()) {
                                    int readByte = eVar2.readByte() & 255;
                                    eVar.L0(37);
                                    char[] cArr = t.f24685k;
                                    eVar.L0(cArr[(readByte >> 4) & 15]);
                                    eVar.L0(cArr[readByte & 15]);
                                }
                            }
                        }
                        i13 += Character.charCount(codePointAt2);
                        i15 = 32;
                        i14 = 43;
                    }
                    return eVar.k0();
                }
            }
            String substring2 = str.substring(i6, i10);
            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }

        public static int b(String scheme) {
            kotlin.jvm.internal.i.g(scheme, "scheme");
            if (kotlin.jvm.internal.i.b(scheme, "http")) {
                return 80;
            }
            if (kotlin.jvm.internal.i.b(scheme, "https")) {
                return 443;
            }
            return -1;
        }

        public static boolean c(int i6, int i10, String str) {
            int i11 = i6 + 2;
            if (i11 < i10 && str.charAt(i6) == '%' && mv.b.r(str.charAt(i6 + 1)) != -1 && mv.b.r(str.charAt(i11)) != -1) {
                return true;
            }
            return false;
        }

        public static String d(String str, int i6, int i10, boolean z10, int i11) {
            int i12;
            if ((i11 & 1) != 0) {
                i6 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            kotlin.jvm.internal.i.g(str, "<this>");
            int i13 = i6;
            while (i13 < i10) {
                int i14 = i13 + 1;
                char charAt = str.charAt(i13);
                if (charAt != '%' && (charAt != '+' || !z10)) {
                    i13 = i14;
                } else {
                    zv.e eVar = new zv.e();
                    eVar.Q0(i6, i13, str);
                    while (i13 < i10) {
                        int codePointAt = str.codePointAt(i13);
                        if (codePointAt == 37 && (i12 = i13 + 2) < i10) {
                            int r = mv.b.r(str.charAt(i13 + 1));
                            int r10 = mv.b.r(str.charAt(i12));
                            if (r != -1 && r10 != -1) {
                                eVar.L0((r << 4) + r10);
                                i13 = Character.charCount(codePointAt) + i12;
                            }
                            eVar.S0(codePointAt);
                            i13 += Character.charCount(codePointAt);
                        } else {
                            if (codePointAt == 43 && z10) {
                                eVar.L0(32);
                                i13++;
                            }
                            eVar.S0(codePointAt);
                            i13 += Character.charCount(codePointAt);
                        }
                    }
                    return eVar.k0();
                }
            }
            String substring = str.substring(i6, i10);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public static ArrayList e(String str) {
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            while (i6 <= str.length()) {
                int N0 = gv.r.N0(str, '&', i6, false, 4);
                if (N0 == -1) {
                    N0 = str.length();
                }
                int N02 = gv.r.N0(str, '=', i6, false, 4);
                if (N02 != -1 && N02 <= N0) {
                    String substring = str.substring(i6, N02);
                    kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(N02 + 1, N0);
                    kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i6, N0);
                    kotlin.jvm.internal.i.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i6 = N0 + 1;
            }
            return arrayList;
        }

        public static void f(StringBuilder sb2, List list) {
            kotlin.jvm.internal.i.g(list, "<this>");
            xs.d h02 = kotlin.jvm.internal.h.h0(kotlin.jvm.internal.h.k0(0, list.size()), 2);
            int i6 = h02.f37996u;
            int i10 = h02.f37997v;
            int i11 = h02.f37998w;
            if ((i11 <= 0 || i6 > i10) && (i11 >= 0 || i10 > i6)) {
                return;
            }
            while (true) {
                int i12 = i6 + i11;
                String str = (String) list.get(i6);
                String str2 = (String) list.get(i6 + 1);
                if (i6 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i6 != i10) {
                    i6 = i12;
                } else {
                    return;
                }
            }
        }
    }

    static {
        new b();
        f24685k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public t(String str, String str2, String str3, String str4, int i6, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f24686a = str;
        this.f24687b = str2;
        this.f24688c = str3;
        this.f24689d = str4;
        this.f24690e = i6;
        this.f = arrayList;
        this.f24691g = arrayList2;
        this.f24692h = str5;
        this.f24693i = str6;
        this.f24694j = kotlin.jvm.internal.i.b(str, "https");
    }

    public final String a() {
        boolean z10;
        if (this.f24688c.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        String str = this.f24693i;
        String substring = str.substring(gv.r.N0(str, ':', this.f24686a.length() + 3, false, 4) + 1, gv.r.N0(str, '@', 0, false, 6));
        kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        String str = this.f24693i;
        int N0 = gv.r.N0(str, '/', this.f24686a.length() + 3, false, 4);
        String substring = str.substring(N0, mv.b.g(str, N0, str.length(), "?#"));
        kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        String str = this.f24693i;
        int N0 = gv.r.N0(str, '/', this.f24686a.length() + 3, false, 4);
        int g5 = mv.b.g(str, N0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (N0 < g5) {
            int i6 = N0 + 1;
            int f = mv.b.f(str, '/', i6, g5);
            String substring = str.substring(i6, f);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            N0 = f;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f24691g == null) {
            return null;
        }
        String str = this.f24693i;
        int N0 = gv.r.N0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(N0, mv.b.f(str, '#', N0, str.length()));
        kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        boolean z10;
        if (this.f24687b.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        int length = this.f24686a.length() + 3;
        String str = this.f24693i;
        String substring = str.substring(length, mv.b.g(str, length, str.length(), ":@"));
        kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof t) && kotlin.jvm.internal.i.b(((t) obj).f24693i, this.f24693i)) {
            return true;
        }
        return false;
    }

    public final a f() {
        String substring;
        a aVar = new a();
        String str = this.f24686a;
        aVar.f24695a = str;
        aVar.f24696b = e();
        aVar.f24697c = a();
        aVar.f24698d = this.f24689d;
        int b10 = b.b(str);
        int i6 = this.f24690e;
        if (i6 == b10) {
            i6 = -1;
        }
        aVar.f24699e = i6;
        ArrayList arrayList = aVar.f;
        arrayList.clear();
        arrayList.addAll(c());
        aVar.c(d());
        if (this.f24692h == null) {
            substring = null;
        } else {
            String str2 = this.f24693i;
            substring = str2.substring(gv.r.N0(str2, '#', 0, false, 6) + 1);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
        }
        aVar.f24701h = substring;
        return aVar;
    }

    public final URI g() {
        String replaceAll;
        String a10;
        a f = f();
        String str = f.f24698d;
        String str2 = null;
        if (str == null) {
            replaceAll = null;
        } else {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.i.f(compile, "compile(pattern)");
            replaceAll = compile.matcher(str).replaceAll("");
            kotlin.jvm.internal.i.f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        }
        f.f24698d = replaceAll;
        ArrayList arrayList = f.f;
        int size = arrayList.size();
        int i6 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.set(i10, b.a((String) arrayList.get(i10), 0, 0, "[]", true, true, false, false, null, 227));
        }
        List<String> list = f.f24700g;
        if (list != null) {
            int size2 = list.size();
            while (i6 < size2) {
                int i11 = i6 + 1;
                String str3 = list.get(i6);
                if (str3 == null) {
                    a10 = null;
                } else {
                    a10 = b.a(str3, 0, 0, "\\^`{|}", true, true, true, false, null, 195);
                }
                list.set(i6, a10);
                i6 = i11;
            }
        }
        String str4 = f.f24701h;
        if (str4 != null) {
            str2 = b.a(str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163);
        }
        f.f24701h = str2;
        String aVar = f.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.i.f(compile2, "compile(pattern)");
                String replaceAll2 = compile2.matcher(aVar).replaceAll("");
                kotlin.jvm.internal.i.f(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll2);
                kotlin.jvm.internal.i.f(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f24693i.hashCode();
    }

    public final String toString() {
        return this.f24693i;
    }
}
