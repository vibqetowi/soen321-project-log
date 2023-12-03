package xv;

import gv.n;
import gv.r;
import is.w;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.i;
import ri.e;
/* compiled from: OkHostnameVerifier.kt */
/* loaded from: classes2.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final c f38131a = new c();

    public static List a(X509Certificate x509Certificate, int i6) {
        Object obj;
        w wVar = w.f20676u;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return wVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && i.b(list.get(0), Integer.valueOf(i6)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return wVar;
        }
    }

    public static boolean b(String str) {
        boolean z10;
        boolean z11;
        int i6;
        char c10;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (length2 <= str.length()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long j10 = 0;
                int i10 = 0;
                while (i10 < length2) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        j10++;
                    } else {
                        if (charAt < 2048) {
                            i6 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i11 = i10 + 1;
                            if (i11 < length2) {
                                c10 = str.charAt(i11);
                            } else {
                                c10 = 0;
                            }
                            if (charAt <= 56319 && c10 >= 56320 && c10 <= 57343) {
                                j10 += 4;
                                i10 += 2;
                            } else {
                                j10++;
                                i10 = i11;
                            }
                        } else {
                            i6 = 3;
                        }
                        j10 += i6;
                    }
                    i10++;
                }
                if (length != ((int) j10)) {
                    return false;
                }
                return true;
            }
            StringBuilder u10 = defpackage.c.u("endIndex > string.length: ", length2, " > ");
            u10.append(str.length());
            throw new IllegalArgumentException(u10.toString().toString());
        }
        throw new IllegalArgumentException(defpackage.c.q("endIndex < beginIndex: ", length2, " < 0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0128 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String host, X509Certificate certificate) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        int length;
        i.g(host, "host");
        i.g(certificate, "certificate");
        byte[] bArr = mv.b.f25755a;
        if (mv.b.f.b(host)) {
            String i02 = hc.d.i0(host);
            List<String> a10 = a(certificate, 7);
            if (a10.isEmpty()) {
                return false;
            }
            for (String str2 : a10) {
                if (i.b(i02, hc.d.i0(str2))) {
                }
            }
            return false;
        }
        if (b(host)) {
            Locale locale = Locale.US;
            host = e.e(locale, "US", host, locale, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> a11 = a(certificate, 2);
        if (a11.isEmpty()) {
            return false;
        }
        for (String str3 : a11) {
            if (host.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !n.H0(host, ".") && !n.z0(host, "..")) {
                if (str3 != null && str3.length() != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12 && !n.H0(str3, ".") && !n.z0(str3, "..")) {
                    if (!n.z0(host, ".")) {
                        str = i.n(".", host);
                    } else {
                        str = host;
                    }
                    if (!n.z0(str3, ".")) {
                        str3 = i.n(".", str3);
                    }
                    if (b(str3)) {
                        Locale locale2 = Locale.US;
                        str3 = e.e(locale2, "US", str3, locale2, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!r.J0(str3, "*")) {
                        z11 = i.b(str, str3);
                        continue;
                    } else if (n.H0(str3, "*.") && r.N0(str3, '*', 1, false, 4) == -1 && str.length() >= str3.length() && !i.b("*.", str3)) {
                        String substring = str3.substring(1);
                        i.f(substring, "this as java.lang.String).substring(startIndex)");
                        if (n.z0(str, substring) && ((length = str.length() - substring.length()) <= 0 || r.Q0(str, '.', length - 1, 4) == -1)) {
                            z11 = true;
                            continue;
                        }
                    }
                    if (z11) {
                    }
                }
            }
            z11 = false;
            continue;
            if (z11) {
            }
        }
        return false;
        return true;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Certificate certificate;
        i.g(host, "host");
        i.g(session, "session");
        if (b(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return c(host, (X509Certificate) certificate);
    }
}
