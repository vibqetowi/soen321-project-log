package qv;

import gv.n;
import gv.r;
import is.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import lv.d0;
import lv.k;
import lv.l;
import lv.s;
import lv.t;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import zv.i;
/* compiled from: HttpHeaders.kt */
/* loaded from: classes2.dex */
public final class e {
    static {
        zv.i iVar = zv.i.f39888x;
        i.a.c("\"\\");
        i.a.c("\t ,=");
    }

    public static final boolean a(d0 d0Var) {
        if (kotlin.jvm.internal.i.b(d0Var.f24583u.f24752b, "HEAD")) {
            return false;
        }
        int i6 = d0Var.f24586x;
        if (((i6 >= 100 && i6 < 200) || i6 == 204 || i6 == 304) && mv.b.k(d0Var) == -1 && !n.A0("chunked", d0.e(d0Var, "Transfer-Encoding"), true)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c0, code lost:
        if (r5 == false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(l lVar, t url, s headers) {
        List<k> list;
        boolean z10;
        long j10;
        k kVar;
        String str;
        String str2;
        kotlin.jvm.internal.i.g(lVar, "<this>");
        kotlin.jvm.internal.i.g(url, "url");
        kotlin.jvm.internal.i.g(headers, "headers");
        if (lVar == l.f24663p) {
            return;
        }
        Pattern pattern = k.f24651j;
        List<String> r = headers.r("Set-Cookie");
        int size = r.size();
        int i6 = 0;
        int i10 = 0;
        ArrayList arrayList = null;
        while (i10 < size) {
            int i11 = i10 + 1;
            String setCookie = r.get(i10);
            kotlin.jvm.internal.i.g(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = mv.b.f25755a;
            char c10 = ';';
            int f = mv.b.f(setCookie, ';', i6, setCookie.length());
            char c11 = '=';
            int f2 = mv.b.f(setCookie, '=', i6, f);
            if (f2 != f) {
                String z11 = mv.b.z(i6, f2, setCookie);
                boolean z12 = true;
                if (z11.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && mv.b.m(z11) == -1) {
                    String z13 = mv.b.z(f2 + 1, f, setCookie);
                    if (mv.b.m(z13) == -1) {
                        int i12 = f + 1;
                        int length = setCookie.length();
                        long j11 = -1;
                        boolean z14 = false;
                        boolean z15 = false;
                        boolean z16 = false;
                        boolean z17 = true;
                        long j12 = 253402300799999L;
                        String str3 = null;
                        String str4 = null;
                        while (true) {
                            long j13 = Long.MAX_VALUE;
                            long j14 = Long.MIN_VALUE;
                            if (i12 < length) {
                                int f10 = mv.b.f(setCookie, c10, i12, length);
                                int f11 = mv.b.f(setCookie, c11, i12, f10);
                                String z18 = mv.b.z(i12, f11, setCookie);
                                if (f11 < f10) {
                                    str2 = mv.b.z(f11 + 1, f10, setCookie);
                                } else {
                                    str2 = "";
                                }
                                if (n.A0(z18, "expires", true)) {
                                    try {
                                        j12 = k.a.b(str2.length(), str2);
                                        z16 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i12 = f10 + 1;
                                    c10 = ';';
                                    c11 = '=';
                                } else if (n.A0(z18, "max-age", true)) {
                                    try {
                                        long parseLong = Long.parseLong(str2);
                                        if (parseLong > 0) {
                                            j14 = parseLong;
                                        }
                                        j11 = j14;
                                    } catch (NumberFormatException e10) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        kotlin.jvm.internal.i.f(compile, "compile(pattern)");
                                        if (compile.matcher(str2).matches()) {
                                            if (n.H0(str2, "-")) {
                                                j13 = Long.MIN_VALUE;
                                            }
                                            j11 = j13;
                                        } else {
                                            throw e10;
                                        }
                                    }
                                    z16 = true;
                                    i12 = f10 + 1;
                                    c10 = ';';
                                    c11 = '=';
                                } else {
                                    if (n.A0(z18, "domain", true)) {
                                        if (!n.z0(str2, ".")) {
                                            String i02 = hc.d.i0(r.V0(".", str2));
                                            if (i02 != null) {
                                                str3 = i02;
                                                z17 = false;
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Failed requirement.".toString());
                                        }
                                    } else if (n.A0(z18, "path", true)) {
                                        str4 = str2;
                                    } else if (n.A0(z18, "secure", true)) {
                                        z14 = true;
                                    } else if (n.A0(z18, "httponly", true)) {
                                        z15 = true;
                                    }
                                    i12 = f10 + 1;
                                    c10 = ';';
                                    c11 = '=';
                                }
                            } else {
                                if (j11 == Long.MIN_VALUE) {
                                    j10 = Long.MIN_VALUE;
                                } else if (j11 != -1) {
                                    if (j11 <= 9223372036854775L) {
                                        j13 = j11 * 1000;
                                    }
                                    long j15 = currentTimeMillis + j13;
                                    if (j15 >= currentTimeMillis && j15 <= 253402300799999L) {
                                        j10 = j15;
                                    } else {
                                        j10 = 253402300799999L;
                                    }
                                } else {
                                    j10 = j12;
                                }
                                String str5 = url.f24689d;
                                String str6 = str3;
                                if (str6 == null) {
                                    str6 = str5;
                                } else if (!kotlin.jvm.internal.i.b(str5, str6) && (!n.z0(str5, str6) || str5.charAt((str5.length() - str6.length()) - 1) != '.' || mv.b.f.b(str5))) {
                                    z12 = false;
                                }
                                if (str5.length() == str6.length() || PublicSuffixDatabase.f27608g.a(str6) != null) {
                                    String str7 = "/";
                                    String str8 = str4;
                                    if (str8 != null && n.H0(str8, "/")) {
                                        str = str8;
                                    } else {
                                        String b10 = url.b();
                                        int Q0 = r.Q0(b10, '/', 0, 6);
                                        if (Q0 != 0) {
                                            str7 = b10.substring(0, Q0);
                                            kotlin.jvm.internal.i.f(str7, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str7;
                                    }
                                    kVar = new k(z11, z13, j10, str6, str, z14, z15, z16, z17);
                                }
                                kVar = null;
                            }
                        }
                    }
                }
            }
            kVar = null;
            if (kVar != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVar);
            }
            i10 = i11;
            i6 = 0;
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.i.f(list, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            list = w.f20676u;
        }
        if (list.isEmpty()) {
            return;
        }
        lVar.b(url, list);
    }
}
