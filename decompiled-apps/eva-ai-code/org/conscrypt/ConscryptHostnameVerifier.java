package org.conscrypt;

import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSession;
/* loaded from: classes5.dex */
public interface ConscryptHostnameVerifier {
    boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession);
}
