package xr;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* compiled from: OkHostnameVerifier.java */
/* loaded from: classes2.dex */
public final class e implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final e f37957a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f37958b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List<String> a(X509Certificate x509Certificate, int i6) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i6 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ab, code lost:
        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str, X509Certificate x509Certificate) {
        String str2;
        int i6;
        char[] cArr;
        char c10;
        char[] cArr2;
        int i10;
        char c11;
        if (f37958b.matcher(str).matches()) {
            List<String> a10 = a(x509Certificate, 7);
            int size = a10.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!str.equalsIgnoreCase(a10.get(i11))) {
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        int i12 = 2;
        List<String> a11 = a(x509Certificate, 2);
        int size2 = a11.size();
        int i13 = 0;
        boolean z10 = false;
        while (i13 < size2) {
            if (!c(lowerCase, a11.get(i13))) {
                i13++;
                z10 = true;
            }
        }
        if (!z10) {
            c cVar = new c(x509Certificate.getSubjectX500Principal());
            cVar.f37951c = 0;
            cVar.f37952d = 0;
            cVar.f37953e = 0;
            cVar.f = 0;
            String str3 = cVar.f37949a;
            cVar.f37954g = str3.toCharArray();
            String c12 = cVar.c();
            if (c12 != null) {
                while (true) {
                    int i14 = cVar.f37951c;
                    int i15 = cVar.f37950b;
                    if (i14 == i15) {
                        break;
                    }
                    char c13 = cVar.f37954g[i14];
                    char c14 = '\\';
                    if (c13 != '\"') {
                        if (c13 != '#') {
                            if (c13 != '+' && c13 != ',' && c13 != ';') {
                                cVar.f37952d = i14;
                                cVar.f37953e = i14;
                                while (true) {
                                    int i16 = cVar.f37951c;
                                    if (i16 >= i15) {
                                        char[] cArr3 = cVar.f37954g;
                                        int i17 = cVar.f37952d;
                                        str2 = new String(cArr3, i17, cVar.f37953e - i17);
                                        break;
                                    }
                                    cArr2 = cVar.f37954g;
                                    char c15 = cArr2[i16];
                                    if (c15 != ' ') {
                                        if (c15 == ';') {
                                            break;
                                        }
                                        if (c15 != c14) {
                                            if (c15 == '+' || c15 == ',') {
                                                break;
                                            }
                                            int i18 = cVar.f37953e;
                                            cVar.f37953e = i18 + 1;
                                            cArr2[i18] = c15;
                                            cVar.f37951c = i16 + 1;
                                        } else {
                                            int i19 = cVar.f37953e;
                                            cVar.f37953e = i19 + 1;
                                            cArr2[i19] = cVar.b();
                                            cVar.f37951c++;
                                        }
                                        c14 = '\\';
                                    } else {
                                        int i20 = cVar.f37953e;
                                        cVar.f = i20;
                                        cVar.f37951c = i16 + 1;
                                        cVar.f37953e = i20 + 1;
                                        cArr2[i20] = ' ';
                                        while (true) {
                                            i10 = cVar.f37951c;
                                            if (i10 >= i15) {
                                                break;
                                            }
                                            char[] cArr4 = cVar.f37954g;
                                            if (cArr4[i10] != ' ') {
                                                break;
                                            }
                                            int i21 = cVar.f37953e;
                                            cVar.f37953e = i21 + 1;
                                            cArr4[i21] = ' ';
                                            cVar.f37951c = i10 + 1;
                                        }
                                        if (i10 == i15 || (c11 = cVar.f37954g[i10]) == ',' || c11 == '+' || c11 == ';') {
                                            break;
                                        }
                                        c14 = '\\';
                                    }
                                }
                                int i22 = cVar.f37952d;
                                str2 = new String(cArr2, i22, cVar.f37953e - i22);
                            } else {
                                str2 = "";
                            }
                        } else if (i14 + 4 < i15) {
                            cVar.f37952d = i14;
                            cVar.f37951c = i14 + 1;
                            while (true) {
                                i6 = cVar.f37951c;
                                if (i6 == i15 || (c10 = (cArr = cVar.f37954g)[i6]) == '+' || c10 == ',' || c10 == ';') {
                                    break;
                                } else if (c10 == ' ') {
                                    cVar.f37953e = i6;
                                    cVar.f37951c = i6 + 1;
                                    while (true) {
                                        int i23 = cVar.f37951c;
                                        if (i23 >= i15 || cVar.f37954g[i23] != ' ') {
                                            break;
                                        }
                                        cVar.f37951c = i23 + 1;
                                    }
                                } else {
                                    if (c10 >= 'A' && c10 <= 'F') {
                                        cArr[i6] = (char) (c10 + ' ');
                                    }
                                    cVar.f37951c = i6 + 1;
                                }
                            }
                            cVar.f37953e = i6;
                            int i24 = cVar.f37953e;
                            int i25 = cVar.f37952d;
                            int i26 = i24 - i25;
                            if (i26 < 5 || (i26 & 1) == 0) {
                                break;
                            }
                            int i27 = i26 / 2;
                            byte[] bArr = new byte[i27];
                            int i28 = i25 + 1;
                            for (int i29 = 0; i29 < i27; i29++) {
                                bArr[i29] = (byte) cVar.a(i28);
                                i28 += i12;
                            }
                            str2 = new String(cVar.f37954g, cVar.f37952d, i26);
                        } else {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                    } else {
                        int i30 = i14 + 1;
                        cVar.f37951c = i30;
                        cVar.f37952d = i30;
                        cVar.f37953e = i30;
                        while (true) {
                            int i31 = cVar.f37951c;
                            if (i31 != i15) {
                                char[] cArr5 = cVar.f37954g;
                                char c16 = cArr5[i31];
                                if (c16 == '\"') {
                                    cVar.f37951c = i31 + 1;
                                    while (true) {
                                        int i32 = cVar.f37951c;
                                        if (i32 >= i15 || cVar.f37954g[i32] != ' ') {
                                            break;
                                        }
                                        cVar.f37951c = i32 + 1;
                                    }
                                    char[] cArr6 = cVar.f37954g;
                                    int i33 = cVar.f37952d;
                                    str2 = new String(cArr6, i33, cVar.f37953e - i33);
                                } else {
                                    if (c16 == '\\') {
                                        cArr5[cVar.f37953e] = cVar.b();
                                    } else {
                                        cArr5[cVar.f37953e] = c16;
                                    }
                                    cVar.f37951c++;
                                    cVar.f37953e++;
                                    i12 = 2;
                                }
                            } else {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                        }
                    }
                    if ("cn".equalsIgnoreCase(c12)) {
                        break;
                    }
                    int i34 = cVar.f37951c;
                    if (i34 >= i15) {
                        break;
                    }
                    char c17 = cVar.f37954g[i34];
                    if (c17 != ',' && c17 != ';' && c17 != '+') {
                        throw new IllegalStateException("Malformed DN: ".concat(str3));
                    }
                    cVar.f37951c = i34 + 1;
                    c12 = cVar.c();
                    if (c12 == null) {
                        throw new IllegalStateException("Malformed DN: ".concat(str3));
                    }
                }
            }
            str2 = null;
            if (str2 != null) {
                return c(lowerCase, str2);
            }
        }
        return false;
        return true;
    }

    public static boolean c(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length > 0 && str.lastIndexOf(46, length - 1) != -1) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
