package io.grpc.okhttp.internal;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* loaded from: classes4.dex */
public final class ConnectionSpec {
    private static final CipherSuite[] APPROVED_CIPHER_SUITES;
    public static final ConnectionSpec CLEARTEXT;
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final ConnectionSpec MODERN_TLS;
    private final String[] cipherSuites;
    final boolean supportsTlsExtensions;
    final boolean tls;
    private final String[] tlsVersions;

    static {
        CipherSuite[] cipherSuiteArr = {CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = cipherSuiteArr;
        ConnectionSpec build = new Builder(true).cipherSuites(cipherSuiteArr).tlsVersions(TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        MODERN_TLS = build;
        COMPATIBLE_TLS = new Builder(build).tlsVersions(TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new Builder(false).build();
    }

    private ConnectionSpec(Builder builder) {
        this.tls = builder.tls;
        this.cipherSuites = builder.cipherSuites;
        this.tlsVersions = builder.tlsVersions;
        this.supportsTlsExtensions = builder.supportsTlsExtensions;
    }

    public boolean isTls() {
        return this.tls;
    }

    public List<CipherSuite> cipherSuites() {
        String[] strArr = this.cipherSuites;
        if (strArr == null) {
            return null;
        }
        CipherSuite[] cipherSuiteArr = new CipherSuite[strArr.length];
        int i = 0;
        while (true) {
            String[] strArr2 = this.cipherSuites;
            if (i < strArr2.length) {
                cipherSuiteArr[i] = CipherSuite.forJavaName(strArr2[i]);
                i++;
            } else {
                return Util.immutableList(cipherSuiteArr);
            }
        }
    }

    public List<TlsVersion> tlsVersions() {
        TlsVersion[] tlsVersionArr = new TlsVersion[this.tlsVersions.length];
        int i = 0;
        while (true) {
            String[] strArr = this.tlsVersions;
            if (i < strArr.length) {
                tlsVersionArr[i] = TlsVersion.forJavaName(strArr[i]);
                i++;
            } else {
                return Util.immutableList(tlsVersionArr);
            }
        }
    }

    public boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public void apply(SSLSocket sSLSocket, boolean z) {
        ConnectionSpec supportedSpec = supportedSpec(sSLSocket, z);
        sSLSocket.setEnabledProtocols(supportedSpec.tlsVersions);
        String[] strArr = supportedSpec.cipherSuites;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    private ConnectionSpec supportedSpec(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        if (this.cipherSuites != null) {
            strArr = (String[]) Util.intersect(String.class, this.cipherSuites, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        return new Builder(this).cipherSuites(strArr).tlsVersions((String[]) Util.intersect(String.class, this.tlsVersions, enabledProtocols)).build();
    }

    public boolean isCompatible(SSLSocket sSLSocket) {
        if (this.tls) {
            if (nonEmptyIntersection(this.tlsVersions, sSLSocket.getEnabledProtocols())) {
                if (this.cipherSuites == null) {
                    return sSLSocket.getEnabledCipherSuites().length > 0;
                }
                return nonEmptyIntersection(this.cipherSuites, sSLSocket.getEnabledCipherSuites());
            }
            return false;
        }
        return false;
    }

    private static boolean nonEmptyIntersection(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                if (contains(strArr2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static <T> boolean contains(T[] tArr, T t) {
        for (T t2 : tArr) {
            if (Util.equal(t, t2)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ConnectionSpec) {
            if (obj == this) {
                return true;
            }
            ConnectionSpec connectionSpec = (ConnectionSpec) obj;
            boolean z = this.tls;
            if (z != connectionSpec.tls) {
                return false;
            }
            return !z || (Arrays.equals(this.cipherSuites, connectionSpec.cipherSuites) && Arrays.equals(this.tlsVersions, connectionSpec.tlsVersions) && this.supportsTlsExtensions == connectionSpec.supportsTlsExtensions);
        }
        return false;
    }

    public int hashCode() {
        if (this.tls) {
            return ((((527 + Arrays.hashCode(this.cipherSuites)) * 31) + Arrays.hashCode(this.tlsVersions)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (this.tls) {
            List<CipherSuite> cipherSuites = cipherSuites();
            String obj = cipherSuites == null ? "[use default]" : cipherSuites.toString();
            return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + tlsVersions() + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ")";
        }
        return "ConnectionSpec()";
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private String[] tlsVersions;

        public Builder(boolean z) {
            this.tls = z;
        }

        public Builder(ConnectionSpec connectionSpec) {
            this.tls = connectionSpec.tls;
            this.cipherSuites = connectionSpec.cipherSuites;
            this.tlsVersions = connectionSpec.tlsVersions;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions;
        }

        public Builder cipherSuites(CipherSuite... cipherSuiteArr) {
            if (!this.tls) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[cipherSuiteArr.length];
            for (int i = 0; i < cipherSuiteArr.length; i++) {
                strArr[i] = cipherSuiteArr[i].javaName;
            }
            this.cipherSuites = strArr;
            return this;
        }

        public Builder cipherSuites(String... strArr) {
            if (this.tls) {
                if (strArr == null) {
                    this.cipherSuites = null;
                } else {
                    this.cipherSuites = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public Builder tlsVersions(TlsVersion... tlsVersionArr) {
            if (!this.tls) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (tlsVersionArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i = 0; i < tlsVersionArr.length; i++) {
                strArr[i] = tlsVersionArr[i].javaName;
            }
            this.tlsVersions = strArr;
            return this;
        }

        public Builder tlsVersions(String... strArr) {
            if (this.tls) {
                if (strArr == null) {
                    this.tlsVersions = null;
                } else {
                    this.tlsVersions = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public Builder supportsTlsExtensions(boolean z) {
            if (!this.tls) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.supportsTlsExtensions = z;
            return this;
        }

        public ConnectionSpec build() {
            return new ConnectionSpec(this);
        }
    }
}
