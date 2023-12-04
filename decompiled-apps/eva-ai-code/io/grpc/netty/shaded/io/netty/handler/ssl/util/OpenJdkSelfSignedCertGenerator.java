package io.grpc.netty.shaded.io.netty.handler.ssl.util;

import com.facebook.internal.security.OidcSecurityUtil;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.Date;
import sun.security.x509.AlgorithmId;
import sun.security.x509.CertificateAlgorithmId;
import sun.security.x509.CertificateIssuerName;
import sun.security.x509.CertificateSerialNumber;
import sun.security.x509.CertificateSubjectName;
import sun.security.x509.CertificateValidity;
import sun.security.x509.CertificateVersion;
import sun.security.x509.CertificateX509Key;
import sun.security.x509.X500Name;
import sun.security.x509.X509CertImpl;
import sun.security.x509.X509CertInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class OpenJdkSelfSignedCertGenerator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] generate(String str, KeyPair keyPair, SecureRandom secureRandom, Date date, Date date2, String str2) throws Exception {
        PrivateKey privateKey = keyPair.getPrivate();
        X509CertInfo x509CertInfo = new X509CertInfo();
        X500Name x500Name = new X500Name("CN=" + str);
        x509CertInfo.set("version", new CertificateVersion(2));
        x509CertInfo.set("serialNumber", new CertificateSerialNumber(new BigInteger(64, secureRandom)));
        try {
            x509CertInfo.set("subject", new CertificateSubjectName(x500Name));
        } catch (CertificateException unused) {
            x509CertInfo.set("subject", x500Name);
        }
        try {
            x509CertInfo.set("issuer", new CertificateIssuerName(x500Name));
        } catch (CertificateException unused2) {
            x509CertInfo.set("issuer", x500Name);
        }
        x509CertInfo.set("validity", new CertificateValidity(date, date2));
        x509CertInfo.set("key", new CertificateX509Key(keyPair.getPublic()));
        x509CertInfo.set("algorithmID", new CertificateAlgorithmId(AlgorithmId.get("1.2.840.113549.1.1.11")));
        X509CertImpl x509CertImpl = new X509CertImpl(x509CertInfo);
        x509CertImpl.sign(privateKey, str2.equalsIgnoreCase("EC") ? "SHA256withECDSA" : OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256);
        x509CertInfo.set("algorithmID.algorithm", x509CertImpl.get("x509.algorithm"));
        X509CertImpl x509CertImpl2 = new X509CertImpl(x509CertInfo);
        x509CertImpl2.sign(privateKey, str2.equalsIgnoreCase("EC") ? "SHA256withECDSA" : OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256);
        x509CertImpl2.verify(keyPair.getPublic());
        return SelfSignedCertificate.newSelfSignedCertificate(str, privateKey, x509CertImpl2);
    }

    private OpenJdkSelfSignedCertGenerator() {
    }
}
