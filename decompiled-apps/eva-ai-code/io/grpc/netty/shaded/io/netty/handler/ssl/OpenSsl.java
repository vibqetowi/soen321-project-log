package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import io.grpc.netty.shaded.io.netty.buffer.UnpooledByteBufAllocator;
import io.grpc.netty.shaded.io.netty.internal.tcnative.Buffer;
import io.grpc.netty.shaded.io.netty.internal.tcnative.Library;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSLContext;
import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
import io.grpc.netty.shaded.io.netty.util.ReferenceCountUtil;
import io.grpc.netty.shaded.io.netty.util.ReferenceCounted;
import io.grpc.netty.shaded.io.netty.util.internal.EmptyArrays;
import io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import io.grpc.netty.shaded.io.netty.util.internal.SystemPropertyUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.bm.Rule;
/* loaded from: classes4.dex */
public final class OpenSsl {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Set<String> AVAILABLE_CIPHER_SUITES;
    private static final Set<String> AVAILABLE_JAVA_CIPHER_SUITES;
    private static final Set<String> AVAILABLE_OPENSSL_CIPHER_SUITES;
    private static final String CERT = "-----BEGIN CERTIFICATE-----\nMIICrjCCAZagAwIBAgIIdSvQPv1QAZQwDQYJKoZIhvcNAQELBQAwFjEUMBIGA1UEAxMLZXhhbXBs\nZS5jb20wIBcNMTgwNDA2MjIwNjU5WhgPOTk5OTEyMzEyMzU5NTlaMBYxFDASBgNVBAMTC2V4YW1w\nbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAggbWsmDQ6zNzRZ5AW8E3eoGl\nqWvOBDb5Fs1oBRrVQHuYmVAoaqwDzXYJ0LOwa293AgWEQ1jpcbZ2hpoYQzqEZBTLnFhMrhRFlH6K\nbJND8Y33kZ/iSVBBDuGbdSbJShlM+4WwQ9IAso4MZ4vW3S1iv5fGGpLgbtXRmBf/RU8omN0Gijlv\nWlLWHWijLN8xQtySFuBQ7ssW8RcKAary3pUm6UUQB+Co6lnfti0Tzag8PgjhAJq2Z3wbsGRnP2YS\nvYoaK6qzmHXRYlp/PxrjBAZAmkLJs4YTm/XFF+fkeYx4i9zqHbyone5yerRibsHaXZWLnUL+rFoe\nMdKvr0VS3sGmhQIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQADQi441pKmXf9FvUV5EHU4v8nJT9Iq\nyqwsKwXnr7AsUlDGHBD7jGrjAXnG5rGxuNKBQ35wRxJATKrUtyaquFUL6H8O6aGQehiFTk6zmPbe\n12Gu44vqqTgIUxnv3JQJiox8S2hMxsSddpeCmSdvmalvD6WG4NthH6B9ZaBEiep1+0s0RUaBYn73\nI7CCUaAtbjfR6pcJjrFk5ei7uwdQZFSJtkP2z8r7zfeANJddAKFlkaMWn7u+OIVuB4XPooWicObk\nNAHFtP65bocUYnDpTVdiyvn8DdqyZ/EO8n1bBKBzuSLplk2msW4pdgaFgY7Vw/0wzcFXfUXmL1uy\nG8sQD/wx\n-----END CERTIFICATE-----";
    static final List<String> DEFAULT_CIPHERS;
    static final String[] EXTRA_SUPPORTED_TLS_1_3_CIPHERS;
    private static final boolean IS_BORINGSSL;
    private static final String KEY = "-----BEGIN PRIVATE KEY-----\nMIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCCBtayYNDrM3NFnkBbwTd6gaWp\na84ENvkWzWgFGtVAe5iZUChqrAPNdgnQs7Brb3cCBYRDWOlxtnaGmhhDOoRkFMucWEyuFEWUfops\nk0PxjfeRn+JJUEEO4Zt1JslKGUz7hbBD0gCyjgxni9bdLWK/l8YakuBu1dGYF/9FTyiY3QaKOW9a\nUtYdaKMs3zFC3JIW4FDuyxbxFwoBqvLelSbpRRAH4KjqWd+2LRPNqDw+COEAmrZnfBuwZGc/ZhK9\nihorqrOYddFiWn8/GuMEBkCaQsmzhhOb9cUX5+R5jHiL3OodvKid7nJ6tGJuwdpdlYudQv6sWh4x\n0q+vRVLewaaFAgMBAAECggEAP8tPJvFtTxhNJAkCloHz0D0vpDHqQBMgntlkgayqmBqLwhyb18pR\ni0qwgh7HHc7wWqOOQuSqlEnrWRrdcI6TSe8R/sErzfTQNoznKWIPYcI/hskk4sdnQ//Yn9/Jvnsv\nU/BBjOTJxtD+sQbhAl80JcA3R+5sArURQkfzzHOL/YMqzAsn5hTzp7HZCxUqBk3KaHRxV7NefeOE\nxlZuWSmxYWfbFIs4kx19/1t7h8CHQWezw+G60G2VBtSBBxDnhBWvqG6R/wpzJ3nEhPLLY9T+XIHe\nipzdMOOOUZorfIg7M+pyYPji+ZIZxIpY5OjrOzXHciAjRtr5Y7l99K1CG1LguQKBgQDrQfIMxxtZ\nvxU/1cRmUV9l7pt5bjV5R6byXq178LxPKVYNjdZ840Q0/OpZEVqaT1xKVi35ohP1QfNjxPLlHD+K\niDAR9z6zkwjIrbwPCnb5kuXy4lpwPcmmmkva25fI7qlpHtbcuQdoBdCfr/KkKaUCMPyY89LCXgEw\n5KTDj64UywKBgQCNfbO+eZLGzhiHhtNJurresCsIGWlInv322gL8CSfBMYl6eNfUTZvUDdFhPISL\nUljKWzXDrjw0ujFSPR0XhUGtiq89H+HUTuPPYv25gVXO+HTgBFZEPl4PpA+BUsSVZy0NddneyqLk\n42Wey9omY9Q8WsdNQS5cbUvy0uG6WFoX7wKBgQDZ1jpW8pa0x2bZsQsm4vo+3G5CRnZlUp+XlWt2\ndDcp5dC0xD1zbs1dc0NcLeGDOTDv9FSl7hok42iHXXq8AygjEm/QcuwwQ1nC2HxmQP5holAiUs4D\nWHM8PWs3wFYPzE459EBoKTxeaeP/uWAn+he8q7d5uWvSZlEcANs/6e77eQKBgD21Ar0hfFfj7mK8\n9E0FeRZBsqK3omkfnhcYgZC11Xa2SgT1yvs2Va2n0RcdM5kncr3eBZav2GYOhhAdwyBM55XuE/sO\neokDVutNeuZ6d5fqV96TRaRBpvgfTvvRwxZ9hvKF4Vz+9wfn/JvCwANaKmegF6ejs7pvmF3whq2k\ndrZVAoGAX5YxQ5XMTD0QbMAl7/6qp6S58xNoVdfCkmkj1ZLKaHKIjS/benkKGlySVQVPexPfnkZx\np/Vv9yyphBoudiTBS9Uog66ueLYZqpgxlM/6OhYg86Gm3U2ycvMxYjBM1NFiyze21AqAhI+HX+Ot\nmraV2/guSgDgZAhukRZzeQ2RucI=\n-----END PRIVATE KEY-----";
    static final Set<String> SUPPORTED_PROTOCOLS_SET;
    private static final boolean SUPPORTS_KEYMANAGER_FACTORY;
    private static final boolean SUPPORTS_OCSP;
    private static final boolean TLSV13_SUPPORTED;
    private static final Throwable UNAVAILABILITY_CAUSE;
    private static final boolean USE_KEYMANAGER_FACTORY;
    private static final InternalLogger logger;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0229 A[Catch: all -> 0x0277, TryCatch #7 {all -> 0x0277, blocks: (B:116:0x0222, B:118:0x0229, B:121:0x0230, B:124:0x0237, B:127:0x023e, B:137:0x0257, B:139:0x025e, B:142:0x0265, B:145:0x026c, B:148:0x0273, B:149:0x0276), top: B:199:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0230 A[Catch: all -> 0x0277, TryCatch #7 {all -> 0x0277, blocks: (B:116:0x0222, B:118:0x0229, B:121:0x0230, B:124:0x0237, B:127:0x023e, B:137:0x0257, B:139:0x025e, B:142:0x0265, B:145:0x026c, B:148:0x0273, B:149:0x0276), top: B:199:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0237 A[Catch: all -> 0x0277, TryCatch #7 {all -> 0x0277, blocks: (B:116:0x0222, B:118:0x0229, B:121:0x0230, B:124:0x0237, B:127:0x023e, B:137:0x0257, B:139:0x025e, B:142:0x0265, B:145:0x026c, B:148:0x0273, B:149:0x0276), top: B:199:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023e A[Catch: all -> 0x0277, TRY_LEAVE, TryCatch #7 {all -> 0x0277, blocks: (B:116:0x0222, B:118:0x0229, B:121:0x0230, B:124:0x0237, B:127:0x023e, B:137:0x0257, B:139:0x025e, B:142:0x0265, B:145:0x026c, B:148:0x0273, B:149:0x0276), top: B:199:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object, java.lang.String] */
    static {
        Throwable th;
        boolean z;
        boolean z2;
        InternalLogger internalLogger;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z3;
        long j6;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        String str = "io.grpc.netty.shaded.io.netty.handler.ssl.openssl.useKeyManagerFactory";
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance(OpenSsl.class);
        logger = internalLoggerFactory;
        boolean z11 = false;
        if (SystemPropertyUtil.getBoolean("io.grpc.netty.shaded.io.netty.handler.ssl.noOpenSsl", false)) {
            e = new UnsupportedOperationException("OpenSSL was explicit disabled with -Dio.netty.handler.ssl.noOpenSsl=true");
            internalLoggerFactory.debug("netty-tcnative explicit disabled; OpenSslEngine will be unavailable.", e);
        } else {
            try {
                Class.forName("io.grpc.netty.shaded.io.netty.internal.tcnative.SSLContext", false, PlatformDependent.getClassLoader(OpenSsl.class));
                e = null;
            } catch (ClassNotFoundException e) {
                e = e;
                logger.debug("netty-tcnative not in the classpath; OpenSslEngine will be unavailable.");
            }
            if (e == null) {
                try {
                    loadTcNative();
                    th = e;
                } catch (Throwable th2) {
                    th = th2;
                    logger.debug("Failed to load netty-tcnative; OpenSslEngine will be unavailable, unless the application has already loaded the symbols by some other means. See https://netty.io/wiki/forked-tomcat-native.html for more information.", th);
                }
                try {
                    String str2 = SystemPropertyUtil.get("io.grpc.netty.shaded.io.netty.handler.ssl.openssl.engine", null);
                    if (str2 == null) {
                        logger.debug("Initialize netty-tcnative using engine: 'default'");
                    } else {
                        logger.debug("Initialize netty-tcnative using engine: '{}'", str2);
                    }
                    initializeTcNative(str2);
                    e = null;
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                    logger.debug("Failed to initialize netty-tcnative; OpenSslEngine will be unavailable. See https://netty.io/wiki/forked-tomcat-native.html for more information.", th3);
                    e = th;
                }
            }
        }
        UNAVAILABILITY_CAUSE = e;
        if (e == null) {
            logger.debug("netty-tcnative using native library: {}", SSL.versionString());
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet(128);
            boolean equals = "BoringSSL".equals(versionString());
            IS_BORINGSSL = equals;
            if (equals) {
                EXTRA_SUPPORTED_TLS_1_3_CIPHERS = new String[]{"TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256"};
            } else {
                EXTRA_SUPPORTED_TLS_1_3_CIPHERS = EmptyArrays.EMPTY_STRINGS;
            }
            try {
                try {
                    long make = SSLContext.make(63, 1);
                    try {
                        StringBuilder sb = new StringBuilder();
                        for (String str3 : SslUtils.TLSV13_CIPHERS) {
                            String openSsl = CipherSuiteConverter.toOpenSsl(str3, IS_BORINGSSL);
                            if (openSsl != null) {
                                sb.append(openSsl);
                                sb.append(AbstractJsonLexerKt.COLON);
                            }
                        }
                        if (sb.length() == 0) {
                            z10 = false;
                        } else {
                            sb.setLength(sb.length() - 1);
                            SSLContext.setCipherSuite(make, sb.toString(), true);
                            z10 = true;
                        }
                        z = z10;
                    } catch (Exception unused) {
                        z = false;
                    } catch (Throwable th4) {
                        th = th4;
                        SSLContext.free(make);
                        throw th;
                    }
                    try {
                        SSLContext.setCipherSuite(make, Rule.ALL, false);
                        long newSSL = SSL.newSSL(make, true);
                        try {
                            try {
                                String[] ciphers = SSL.getCiphers(newSSL);
                                int length = ciphers.length;
                                for (int i = 0; i < length; i++) {
                                    j = ciphers[i];
                                    if (j != 0 && !j.isEmpty() && !linkedHashSet.contains(j) && (z || !SslUtils.isTLSv13Cipher(j))) {
                                        linkedHashSet.add(j);
                                    }
                                }
                                boolean z12 = IS_BORINGSSL;
                                if (z12) {
                                    Collections.addAll(linkedHashSet, EXTRA_SUPPORTED_TLS_1_3_CIPHERS);
                                    Collections.addAll(linkedHashSet, "AEAD-AES128-GCM-SHA256", "AEAD-AES256-GCM-SHA384", "AEAD-CHACHA20-POLY1305-SHA256");
                                }
                                try {
                                    PemPrivateKey valueOf = PemPrivateKey.valueOf(KEY.getBytes(CharsetUtil.US_ASCII));
                                    try {
                                        SSLContext.setCertificateCallback(make, null);
                                        j2 = ReferenceCountedOpenSslContext.toBIO(ByteBufAllocator.DEFAULT, selfSignedCertificate());
                                        try {
                                            j3 = SSL.parseX509Chain(j2);
                                            try {
                                                j6 = ReferenceCountedOpenSslContext.toBIO(UnpooledByteBufAllocator.DEFAULT, valueOf.retain());
                                                try {
                                                    j4 = SSL.parsePrivateKey(j6, null);
                                                    try {
                                                        SSL.setKeyMaterial(newSSL, j3, j4);
                                                        try {
                                                            boolean contains = SystemPropertyUtil.contains("io.grpc.netty.shaded.io.netty.handler.ssl.openssl.useKeyManagerFactory");
                                                            if (z12) {
                                                                if (contains) {
                                                                    try {
                                                                        logger.info("System property 'io.netty.handler.ssl.openssl.useKeyManagerFactory' is deprecated and will be ignored when using BoringSSL");
                                                                    } catch (Throwable unused2) {
                                                                        z7 = true;
                                                                        logger.debug("Failed to get useKeyManagerFactory system property.");
                                                                        z8 = z7;
                                                                        valueOf.release();
                                                                        z11 = true;
                                                                        j6 = j6;
                                                                        z5 = z8;
                                                                        SSL.freeSSL(newSSL);
                                                                        if (j2 != 0) {
                                                                        }
                                                                        if (j6 != 0) {
                                                                        }
                                                                        if (j3 != 0) {
                                                                        }
                                                                        if (j4 != 0) {
                                                                        }
                                                                        SSLContext.free(make);
                                                                        z2 = z5;
                                                                        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                                                                        AVAILABLE_OPENSSL_CIPHER_SUITES = unmodifiableSet;
                                                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet(unmodifiableSet.size() * 2);
                                                                        while (r0.hasNext()) {
                                                                        }
                                                                        SslUtils.addIfSupported(linkedHashSet2, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                                                                        SslUtils.addIfSupported(linkedHashSet2, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                                                                        SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet2);
                                                                        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
                                                                        DEFAULT_CIPHERS = unmodifiableList;
                                                                        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(linkedHashSet2);
                                                                        AVAILABLE_JAVA_CIPHER_SUITES = unmodifiableSet2;
                                                                        Set<String> set = AVAILABLE_OPENSSL_CIPHER_SUITES;
                                                                        LinkedHashSet linkedHashSet3 = new LinkedHashSet(set.size() + unmodifiableSet2.size());
                                                                        linkedHashSet3.addAll(set);
                                                                        linkedHashSet3.addAll(unmodifiableSet2);
                                                                        AVAILABLE_CIPHER_SUITES = linkedHashSet3;
                                                                        SUPPORTS_KEYMANAGER_FACTORY = z11;
                                                                        USE_KEYMANAGER_FACTORY = z2;
                                                                        LinkedHashSet linkedHashSet4 = new LinkedHashSet(6);
                                                                        linkedHashSet4.add("SSLv2Hello");
                                                                        if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                                                                        }
                                                                        if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                                                                        }
                                                                        if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                                                                        }
                                                                        if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                                                                        }
                                                                        if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                                                                        }
                                                                        if (!z) {
                                                                        }
                                                                        TLSV13_SUPPORTED = false;
                                                                        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(linkedHashSet4);
                                                                        SUPPORTED_PROTOCOLS_SET = unmodifiableSet3;
                                                                        SUPPORTS_OCSP = doesSupportOcsp();
                                                                        internalLogger = logger;
                                                                        if (internalLogger.isDebugEnabled()) {
                                                                        }
                                                                    }
                                                                }
                                                                z9 = true;
                                                            } else {
                                                                z9 = SystemPropertyUtil.getBoolean("io.grpc.netty.shaded.io.netty.handler.ssl.openssl.useKeyManagerFactory", true);
                                                                if (contains) {
                                                                    try {
                                                                        logger.info("System property 'io.netty.handler.ssl.openssl.useKeyManagerFactory' is deprecated and so will be ignored in the future");
                                                                    } catch (Throwable unused3) {
                                                                        z7 = z9;
                                                                        try {
                                                                            logger.debug("Failed to get useKeyManagerFactory system property.");
                                                                            z8 = z7;
                                                                            valueOf.release();
                                                                            z11 = true;
                                                                            j6 = j6;
                                                                            z5 = z8;
                                                                        } catch (Error unused4) {
                                                                            z11 = true;
                                                                            z6 = z7;
                                                                            j6 = j6;
                                                                            z4 = z6;
                                                                            try {
                                                                                logger.debug("KeyManagerFactory not supported.");
                                                                                valueOf.release();
                                                                                z5 = z4;
                                                                                SSL.freeSSL(newSSL);
                                                                                if (j2 != 0) {
                                                                                }
                                                                                if (j6 != 0) {
                                                                                }
                                                                                if (j3 != 0) {
                                                                                }
                                                                                if (j4 != 0) {
                                                                                }
                                                                                SSLContext.free(make);
                                                                                z2 = z5;
                                                                                Set<String> unmodifiableSet4 = Collections.unmodifiableSet(linkedHashSet);
                                                                                AVAILABLE_OPENSSL_CIPHER_SUITES = unmodifiableSet4;
                                                                                LinkedHashSet linkedHashSet22 = new LinkedHashSet(unmodifiableSet4.size() * 2);
                                                                                while (r0.hasNext()) {
                                                                                }
                                                                                SslUtils.addIfSupported(linkedHashSet22, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                                                                                SslUtils.addIfSupported(linkedHashSet22, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                                                                                SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet22);
                                                                                List<String> unmodifiableList2 = Collections.unmodifiableList(arrayList);
                                                                                DEFAULT_CIPHERS = unmodifiableList2;
                                                                                Set<String> unmodifiableSet22 = Collections.unmodifiableSet(linkedHashSet22);
                                                                                AVAILABLE_JAVA_CIPHER_SUITES = unmodifiableSet22;
                                                                                Set<String> set2 = AVAILABLE_OPENSSL_CIPHER_SUITES;
                                                                                LinkedHashSet linkedHashSet32 = new LinkedHashSet(set2.size() + unmodifiableSet22.size());
                                                                                linkedHashSet32.addAll(set2);
                                                                                linkedHashSet32.addAll(unmodifiableSet22);
                                                                                AVAILABLE_CIPHER_SUITES = linkedHashSet32;
                                                                                SUPPORTS_KEYMANAGER_FACTORY = z11;
                                                                                USE_KEYMANAGER_FACTORY = z2;
                                                                                LinkedHashSet linkedHashSet42 = new LinkedHashSet(6);
                                                                                linkedHashSet42.add("SSLv2Hello");
                                                                                if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                                                                                }
                                                                                if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                                                                                }
                                                                                if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                                                                                }
                                                                                if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                                                                                }
                                                                                if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                                                                                }
                                                                                if (!z) {
                                                                                }
                                                                                TLSV13_SUPPORTED = false;
                                                                                Set<String> unmodifiableSet32 = Collections.unmodifiableSet(linkedHashSet42);
                                                                                SUPPORTED_PROTOCOLS_SET = unmodifiableSet32;
                                                                                SUPPORTS_OCSP = doesSupportOcsp();
                                                                                internalLogger = logger;
                                                                                if (internalLogger.isDebugEnabled()) {
                                                                                }
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                valueOf.release();
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            valueOf.release();
                                                                            throw th;
                                                                        }
                                                                        SSL.freeSSL(newSSL);
                                                                        if (j2 != 0) {
                                                                        }
                                                                        if (j6 != 0) {
                                                                        }
                                                                        if (j3 != 0) {
                                                                        }
                                                                        if (j4 != 0) {
                                                                        }
                                                                        SSLContext.free(make);
                                                                        z2 = z5;
                                                                        Set<String> unmodifiableSet42 = Collections.unmodifiableSet(linkedHashSet);
                                                                        AVAILABLE_OPENSSL_CIPHER_SUITES = unmodifiableSet42;
                                                                        LinkedHashSet linkedHashSet222 = new LinkedHashSet(unmodifiableSet42.size() * 2);
                                                                        while (r0.hasNext()) {
                                                                        }
                                                                        SslUtils.addIfSupported(linkedHashSet222, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                                                                        SslUtils.addIfSupported(linkedHashSet222, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                                                                        SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet222);
                                                                        List<String> unmodifiableList22 = Collections.unmodifiableList(arrayList);
                                                                        DEFAULT_CIPHERS = unmodifiableList22;
                                                                        Set<String> unmodifiableSet222 = Collections.unmodifiableSet(linkedHashSet222);
                                                                        AVAILABLE_JAVA_CIPHER_SUITES = unmodifiableSet222;
                                                                        Set<String> set22 = AVAILABLE_OPENSSL_CIPHER_SUITES;
                                                                        LinkedHashSet linkedHashSet322 = new LinkedHashSet(set22.size() + unmodifiableSet222.size());
                                                                        linkedHashSet322.addAll(set22);
                                                                        linkedHashSet322.addAll(unmodifiableSet222);
                                                                        AVAILABLE_CIPHER_SUITES = linkedHashSet322;
                                                                        SUPPORTS_KEYMANAGER_FACTORY = z11;
                                                                        USE_KEYMANAGER_FACTORY = z2;
                                                                        LinkedHashSet linkedHashSet422 = new LinkedHashSet(6);
                                                                        linkedHashSet422.add("SSLv2Hello");
                                                                        if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                                                                        }
                                                                        if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                                                                        }
                                                                        if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                                                                        }
                                                                        if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                                                                        }
                                                                        if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                                                                        }
                                                                        if (!z) {
                                                                        }
                                                                        TLSV13_SUPPORTED = false;
                                                                        Set<String> unmodifiableSet322 = Collections.unmodifiableSet(linkedHashSet422);
                                                                        SUPPORTED_PROTOCOLS_SET = unmodifiableSet322;
                                                                        SUPPORTS_OCSP = doesSupportOcsp();
                                                                        internalLogger = logger;
                                                                        if (internalLogger.isDebugEnabled()) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z8 = z9;
                                                        } catch (Throwable unused5) {
                                                            z7 = false;
                                                        }
                                                        try {
                                                            valueOf.release();
                                                            z11 = true;
                                                            j6 = j6;
                                                            z5 = z8;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            j = j6;
                                                            SSL.freeSSL(newSSL);
                                                            if (j2 != 0) {
                                                                SSL.freeBIO(j2);
                                                            }
                                                            if (j != 0) {
                                                                SSL.freeBIO(j);
                                                            }
                                                            if (j3 != 0) {
                                                                SSL.freeX509Chain(j3);
                                                            }
                                                            if (j4 != 0) {
                                                                SSL.freePrivateKey(j4);
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Error unused6) {
                                                        z6 = false;
                                                        z11 = false;
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                    }
                                                } catch (Error unused7) {
                                                    z4 = false;
                                                    z11 = false;
                                                    j4 = 0;
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                }
                                            } catch (Error unused8) {
                                                z4 = false;
                                                z11 = false;
                                                j6 = 0;
                                                j4 = 0;
                                            } catch (Throwable th10) {
                                                th = th10;
                                            }
                                        } catch (Error unused9) {
                                            z3 = false;
                                            z11 = false;
                                            j6 = 0;
                                            j3 = 0;
                                            j4 = j3;
                                            z4 = z3;
                                            logger.debug("KeyManagerFactory not supported.");
                                            valueOf.release();
                                            z5 = z4;
                                            SSL.freeSSL(newSSL);
                                            if (j2 != 0) {
                                            }
                                            if (j6 != 0) {
                                            }
                                            if (j3 != 0) {
                                            }
                                            if (j4 != 0) {
                                            }
                                            SSLContext.free(make);
                                            z2 = z5;
                                            Set<String> unmodifiableSet422 = Collections.unmodifiableSet(linkedHashSet);
                                            AVAILABLE_OPENSSL_CIPHER_SUITES = unmodifiableSet422;
                                            LinkedHashSet linkedHashSet2222 = new LinkedHashSet(unmodifiableSet422.size() * 2);
                                            while (r0.hasNext()) {
                                            }
                                            SslUtils.addIfSupported(linkedHashSet2222, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                                            SslUtils.addIfSupported(linkedHashSet2222, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                                            SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet2222);
                                            List<String> unmodifiableList222 = Collections.unmodifiableList(arrayList);
                                            DEFAULT_CIPHERS = unmodifiableList222;
                                            Set<String> unmodifiableSet2222 = Collections.unmodifiableSet(linkedHashSet2222);
                                            AVAILABLE_JAVA_CIPHER_SUITES = unmodifiableSet2222;
                                            Set<String> set222 = AVAILABLE_OPENSSL_CIPHER_SUITES;
                                            LinkedHashSet linkedHashSet3222 = new LinkedHashSet(set222.size() + unmodifiableSet2222.size());
                                            linkedHashSet3222.addAll(set222);
                                            linkedHashSet3222.addAll(unmodifiableSet2222);
                                            AVAILABLE_CIPHER_SUITES = linkedHashSet3222;
                                            SUPPORTS_KEYMANAGER_FACTORY = z11;
                                            USE_KEYMANAGER_FACTORY = z2;
                                            LinkedHashSet linkedHashSet4222 = new LinkedHashSet(6);
                                            linkedHashSet4222.add("SSLv2Hello");
                                            if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                                            }
                                            if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                                            }
                                            if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                                            }
                                            if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                                            }
                                            if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                                            }
                                            if (!z) {
                                            }
                                            TLSV13_SUPPORTED = false;
                                            Set<String> unmodifiableSet3222 = Collections.unmodifiableSet(linkedHashSet4222);
                                            SUPPORTED_PROTOCOLS_SET = unmodifiableSet3222;
                                            SUPPORTS_OCSP = doesSupportOcsp();
                                            internalLogger = logger;
                                            if (internalLogger.isDebugEnabled()) {
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            j5 = 0;
                                            valueOf.release();
                                            throw th;
                                        }
                                    } catch (Error unused10) {
                                        z3 = false;
                                        z11 = false;
                                        j6 = 0;
                                        j2 = 0;
                                        j3 = 0;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        j5 = 0;
                                    }
                                    SSL.freeSSL(newSSL);
                                    if (j2 != 0) {
                                        SSL.freeBIO(j2);
                                    }
                                    if (j6 != 0) {
                                        SSL.freeBIO(j6);
                                    }
                                    if (j3 != 0) {
                                        SSL.freeX509Chain(j3);
                                    }
                                    if (j4 != 0) {
                                        SSL.freePrivateKey(j4);
                                    }
                                    SSLContext.free(make);
                                    z2 = z5;
                                } catch (Throwable th13) {
                                    th = th13;
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                SSLContext.free(make);
                                throw th;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                            j4 = 0;
                        }
                    } catch (Throwable th16) {
                        th = th16;
                    }
                } catch (Exception e2) {
                    e = e2;
                    logger.warn("Failed to get the list of available OpenSSL cipher suites.", (Throwable) e);
                    z2 = str;
                    Set<String> unmodifiableSet4222 = Collections.unmodifiableSet(linkedHashSet);
                    AVAILABLE_OPENSSL_CIPHER_SUITES = unmodifiableSet4222;
                    LinkedHashSet linkedHashSet22222 = new LinkedHashSet(unmodifiableSet4222.size() * 2);
                    while (r0.hasNext()) {
                    }
                    SslUtils.addIfSupported(linkedHashSet22222, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                    SslUtils.addIfSupported(linkedHashSet22222, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                    SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet22222);
                    List<String> unmodifiableList2222 = Collections.unmodifiableList(arrayList);
                    DEFAULT_CIPHERS = unmodifiableList2222;
                    Set<String> unmodifiableSet22222 = Collections.unmodifiableSet(linkedHashSet22222);
                    AVAILABLE_JAVA_CIPHER_SUITES = unmodifiableSet22222;
                    Set<String> set2222 = AVAILABLE_OPENSSL_CIPHER_SUITES;
                    LinkedHashSet linkedHashSet32222 = new LinkedHashSet(set2222.size() + unmodifiableSet22222.size());
                    linkedHashSet32222.addAll(set2222);
                    linkedHashSet32222.addAll(unmodifiableSet22222);
                    AVAILABLE_CIPHER_SUITES = linkedHashSet32222;
                    SUPPORTS_KEYMANAGER_FACTORY = z11;
                    USE_KEYMANAGER_FACTORY = z2;
                    LinkedHashSet linkedHashSet42222 = new LinkedHashSet(6);
                    linkedHashSet42222.add("SSLv2Hello");
                    if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                    }
                    if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                    }
                    if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                    }
                    if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                    }
                    if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                    }
                    if (!z) {
                    }
                    TLSV13_SUPPORTED = false;
                    Set<String> unmodifiableSet32222 = Collections.unmodifiableSet(linkedHashSet42222);
                    SUPPORTED_PROTOCOLS_SET = unmodifiableSet32222;
                    SUPPORTS_OCSP = doesSupportOcsp();
                    internalLogger = logger;
                    if (internalLogger.isDebugEnabled()) {
                    }
                }
            } catch (Exception e3) {
                e = e3;
                str = null;
                z11 = false;
                z = false;
                logger.warn("Failed to get the list of available OpenSSL cipher suites.", (Throwable) e);
                z2 = str;
                Set<String> unmodifiableSet42222 = Collections.unmodifiableSet(linkedHashSet);
                AVAILABLE_OPENSSL_CIPHER_SUITES = unmodifiableSet42222;
                LinkedHashSet linkedHashSet222222 = new LinkedHashSet(unmodifiableSet42222.size() * 2);
                while (r0.hasNext()) {
                }
                SslUtils.addIfSupported(linkedHashSet222222, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                SslUtils.addIfSupported(linkedHashSet222222, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet222222);
                List<String> unmodifiableList22222 = Collections.unmodifiableList(arrayList);
                DEFAULT_CIPHERS = unmodifiableList22222;
                Set<String> unmodifiableSet222222 = Collections.unmodifiableSet(linkedHashSet222222);
                AVAILABLE_JAVA_CIPHER_SUITES = unmodifiableSet222222;
                Set<String> set22222 = AVAILABLE_OPENSSL_CIPHER_SUITES;
                LinkedHashSet linkedHashSet322222 = new LinkedHashSet(set22222.size() + unmodifiableSet222222.size());
                linkedHashSet322222.addAll(set22222);
                linkedHashSet322222.addAll(unmodifiableSet222222);
                AVAILABLE_CIPHER_SUITES = linkedHashSet322222;
                SUPPORTS_KEYMANAGER_FACTORY = z11;
                USE_KEYMANAGER_FACTORY = z2;
                LinkedHashSet linkedHashSet422222 = new LinkedHashSet(6);
                linkedHashSet422222.add("SSLv2Hello");
                if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                }
                if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                }
                if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                }
                if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                }
                if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                }
                if (!z) {
                }
                TLSV13_SUPPORTED = false;
                Set<String> unmodifiableSet322222 = Collections.unmodifiableSet(linkedHashSet422222);
                SUPPORTED_PROTOCOLS_SET = unmodifiableSet322222;
                SUPPORTS_OCSP = doesSupportOcsp();
                internalLogger = logger;
                if (internalLogger.isDebugEnabled()) {
                }
            }
            Set<String> unmodifiableSet422222 = Collections.unmodifiableSet(linkedHashSet);
            AVAILABLE_OPENSSL_CIPHER_SUITES = unmodifiableSet422222;
            LinkedHashSet linkedHashSet2222222 = new LinkedHashSet(unmodifiableSet422222.size() * 2);
            for (String str4 : unmodifiableSet422222) {
                if (!SslUtils.isTLSv13Cipher(str4)) {
                    linkedHashSet2222222.add(CipherSuiteConverter.toJava(str4, "TLS"));
                    linkedHashSet2222222.add(CipherSuiteConverter.toJava(str4, "SSL"));
                } else {
                    linkedHashSet2222222.add(str4);
                }
            }
            SslUtils.addIfSupported(linkedHashSet2222222, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
            SslUtils.addIfSupported(linkedHashSet2222222, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
            SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet2222222);
            List<String> unmodifiableList222222 = Collections.unmodifiableList(arrayList);
            DEFAULT_CIPHERS = unmodifiableList222222;
            Set<String> unmodifiableSet2222222 = Collections.unmodifiableSet(linkedHashSet2222222);
            AVAILABLE_JAVA_CIPHER_SUITES = unmodifiableSet2222222;
            Set<String> set222222 = AVAILABLE_OPENSSL_CIPHER_SUITES;
            LinkedHashSet linkedHashSet3222222 = new LinkedHashSet(set222222.size() + unmodifiableSet2222222.size());
            linkedHashSet3222222.addAll(set222222);
            linkedHashSet3222222.addAll(unmodifiableSet2222222);
            AVAILABLE_CIPHER_SUITES = linkedHashSet3222222;
            SUPPORTS_KEYMANAGER_FACTORY = z11;
            USE_KEYMANAGER_FACTORY = z2;
            LinkedHashSet linkedHashSet4222222 = new LinkedHashSet(6);
            linkedHashSet4222222.add("SSLv2Hello");
            if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                linkedHashSet4222222.add("SSLv2");
            }
            if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                linkedHashSet4222222.add("SSLv3");
            }
            if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                linkedHashSet4222222.add("TLSv1");
            }
            if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                linkedHashSet4222222.add("TLSv1.1");
            }
            if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                linkedHashSet4222222.add("TLSv1.2");
            }
            if (!z && doesSupportProtocol(32, SSL.SSL_OP_NO_TLSv1_3)) {
                linkedHashSet4222222.add("TLSv1.3");
                TLSV13_SUPPORTED = true;
            } else {
                TLSV13_SUPPORTED = false;
            }
            Set<String> unmodifiableSet3222222 = Collections.unmodifiableSet(linkedHashSet4222222);
            SUPPORTED_PROTOCOLS_SET = unmodifiableSet3222222;
            SUPPORTS_OCSP = doesSupportOcsp();
            internalLogger = logger;
            if (internalLogger.isDebugEnabled()) {
                internalLogger.debug("Supported protocols (OpenSSL): {} ", unmodifiableSet3222222);
                internalLogger.debug("Default cipher suites (OpenSSL): {}", unmodifiableList222222);
                return;
            }
            return;
        }
        DEFAULT_CIPHERS = Collections.emptyList();
        AVAILABLE_OPENSSL_CIPHER_SUITES = Collections.emptySet();
        AVAILABLE_JAVA_CIPHER_SUITES = Collections.emptySet();
        AVAILABLE_CIPHER_SUITES = Collections.emptySet();
        SUPPORTS_KEYMANAGER_FACTORY = false;
        USE_KEYMANAGER_FACTORY = false;
        SUPPORTED_PROTOCOLS_SET = Collections.emptySet();
        SUPPORTS_OCSP = false;
        TLSV13_SUPPORTED = false;
        IS_BORINGSSL = false;
        EXTRA_SUPPORTED_TLS_1_3_CIPHERS = EmptyArrays.EMPTY_STRINGS;
    }

    static X509Certificate selfSignedCertificate() throws CertificateException {
        return (X509Certificate) SslContext.X509_CERT_FACTORY.generateCertificate(new ByteArrayInputStream(CERT.getBytes(CharsetUtil.US_ASCII)));
    }

    private static boolean doesSupportOcsp() {
        long j;
        if (version() < 268443648) {
            return false;
        }
        try {
            j = SSLContext.make(16, 1);
            try {
                SSLContext.enableOcsp(j, false);
                if (j != -1) {
                    SSLContext.free(j);
                }
                return true;
            } catch (Exception unused) {
                if (j != -1) {
                    SSLContext.free(j);
                    return false;
                }
                return false;
            } catch (Throwable th) {
                th = th;
                if (j != -1) {
                    SSLContext.free(j);
                }
                throw th;
            }
        } catch (Exception unused2) {
            j = -1;
        } catch (Throwable th2) {
            th = th2;
            j = -1;
        }
    }

    private static boolean doesSupportProtocol(int i, int i2) {
        if (i2 == 0) {
            return false;
        }
        try {
            long make = SSLContext.make(i, 2);
            if (make != -1) {
                SSLContext.free(make);
                return true;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isAvailable() {
        return UNAVAILABILITY_CAUSE == null;
    }

    @Deprecated
    public static boolean isAlpnSupported() {
        return ((long) version()) >= 268443648;
    }

    public static boolean isOcspSupported() {
        return SUPPORTS_OCSP;
    }

    public static int version() {
        if (isAvailable()) {
            return SSL.version();
        }
        return -1;
    }

    public static String versionString() {
        if (isAvailable()) {
            return SSL.versionString();
        }
        return null;
    }

    public static void ensureAvailability() {
        Throwable th = UNAVAILABILITY_CAUSE;
        if (th != null) {
            throw ((Error) new UnsatisfiedLinkError("failed to load the required native library").initCause(th));
        }
    }

    public static Throwable unavailabilityCause() {
        return UNAVAILABILITY_CAUSE;
    }

    @Deprecated
    public static Set<String> availableCipherSuites() {
        return availableOpenSslCipherSuites();
    }

    public static Set<String> availableOpenSslCipherSuites() {
        return AVAILABLE_OPENSSL_CIPHER_SUITES;
    }

    public static Set<String> availableJavaCipherSuites() {
        return AVAILABLE_JAVA_CIPHER_SUITES;
    }

    public static boolean isCipherSuiteAvailable(String str) {
        String openSsl = CipherSuiteConverter.toOpenSsl(str, IS_BORINGSSL);
        if (openSsl != null) {
            str = openSsl;
        }
        return AVAILABLE_OPENSSL_CIPHER_SUITES.contains(str);
    }

    public static boolean supportsKeyManagerFactory() {
        return SUPPORTS_KEYMANAGER_FACTORY;
    }

    @Deprecated
    public static boolean supportsHostnameValidation() {
        return isAvailable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean useKeyManagerFactory() {
        return USE_KEYMANAGER_FACTORY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long memoryAddress(ByteBuf byteBuf) {
        return byteBuf.hasMemoryAddress() ? byteBuf.memoryAddress() : Buffer.address(byteBuf.nioBuffer());
    }

    private OpenSsl() {
    }

    private static void loadTcNative() throws Exception {
        String normalizedOs = PlatformDependent.normalizedOs();
        String normalizedArch = PlatformDependent.normalizedArch();
        LinkedHashSet linkedHashSet = new LinkedHashSet(5);
        if ("linux".equalsIgnoreCase(normalizedOs)) {
            Iterator<String> it = PlatformDependent.normalizedLinuxClassifiers().iterator();
            while (it.hasNext()) {
                linkedHashSet.add("netty_tcnative_" + normalizedOs + '_' + normalizedArch + "_" + it.next());
            }
            linkedHashSet.add("netty_tcnative_" + normalizedOs + '_' + normalizedArch);
            linkedHashSet.add("netty_tcnative_" + normalizedOs + '_' + normalizedArch + "_fedora");
        } else {
            linkedHashSet.add("netty_tcnative_" + normalizedOs + '_' + normalizedArch);
        }
        linkedHashSet.add("netty_tcnative_" + normalizedArch);
        linkedHashSet.add("netty_tcnative");
        NativeLibraryLoader.loadFirstAvailable(PlatformDependent.getClassLoader(SSLContext.class), (String[]) linkedHashSet.toArray(new String[0]));
    }

    private static boolean initializeTcNative(String str) throws Exception {
        return Library.initialize("provided", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void releaseIfNeeded(ReferenceCounted referenceCounted) {
        if (referenceCounted.refCnt() > 0) {
            ReferenceCountUtil.safeRelease(referenceCounted);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isTlsv13Supported() {
        return TLSV13_SUPPORTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isBoringSSL() {
        return IS_BORINGSSL;
    }
}
