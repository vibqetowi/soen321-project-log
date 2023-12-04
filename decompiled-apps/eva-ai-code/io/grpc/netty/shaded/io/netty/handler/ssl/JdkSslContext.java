package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import io.grpc.netty.shaded.io.netty.handler.ssl.ApplicationProtocolConfig;
import io.grpc.netty.shaded.io.netty.handler.ssl.JdkApplicationProtocolNegotiator;
import io.grpc.netty.shaded.io.netty.util.ReferenceCountUtil;
import io.grpc.netty.shaded.io.netty.util.internal.EmptyArrays;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.NoSuchPaddingException;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSessionContext;
/* loaded from: classes4.dex */
public class JdkSslContext extends SslContext {
    private static final List<String> DEFAULT_CIPHERS;
    private static final List<String> DEFAULT_CIPHERS_NON_TLSV13;
    private static final String[] DEFAULT_PROTOCOLS;
    private static final Provider DEFAULT_PROVIDER;
    static final String PROTOCOL = "TLS";
    private static final Set<String> SUPPORTED_CIPHERS;
    private static final Set<String> SUPPORTED_CIPHERS_NON_TLSV13;
    private static final InternalLogger logger;
    private final JdkApplicationProtocolNegotiator apn;
    private final String[] cipherSuites;
    private final ClientAuth clientAuth;
    private final boolean isClient;
    private final String[] protocols;
    private final SSLContext sslContext;
    private final List<String> unmodifiableCipherSuites;

    static {
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance(JdkSslContext.class);
        logger = internalLoggerFactory;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            DEFAULT_PROVIDER = sSLContext.getProvider();
            SSLEngine createSSLEngine = sSLContext.createSSLEngine();
            String[] defaultProtocols = defaultProtocols(sSLContext, createSSLEngine);
            DEFAULT_PROTOCOLS = defaultProtocols;
            Set<String> unmodifiableSet = Collections.unmodifiableSet(supportedCiphers(createSSLEngine));
            SUPPORTED_CIPHERS = unmodifiableSet;
            List<String> unmodifiableList = Collections.unmodifiableList(defaultCiphers(createSSLEngine, unmodifiableSet));
            DEFAULT_CIPHERS = unmodifiableList;
            ArrayList arrayList = new ArrayList(unmodifiableList);
            arrayList.removeAll(Arrays.asList(SslUtils.DEFAULT_TLSV13_CIPHER_SUITES));
            DEFAULT_CIPHERS_NON_TLSV13 = Collections.unmodifiableList(arrayList);
            LinkedHashSet linkedHashSet = new LinkedHashSet(unmodifiableSet);
            linkedHashSet.removeAll(Arrays.asList(SslUtils.DEFAULT_TLSV13_CIPHER_SUITES));
            SUPPORTED_CIPHERS_NON_TLSV13 = Collections.unmodifiableSet(linkedHashSet);
            if (internalLoggerFactory.isDebugEnabled()) {
                internalLoggerFactory.debug("Default protocols (JDK): {} ", Arrays.asList(defaultProtocols));
                internalLoggerFactory.debug("Default cipher suites (JDK): {}", unmodifiableList);
            }
        } catch (Exception e) {
            throw new Error("failed to initialize the default SSL context", e);
        }
    }

    private static String[] defaultProtocols(SSLContext sSLContext, SSLEngine sSLEngine) {
        String[] protocols = sSLContext.getDefaultSSLParameters().getProtocols();
        HashSet hashSet = new HashSet(protocols.length);
        Collections.addAll(hashSet, protocols);
        ArrayList arrayList = new ArrayList();
        SslUtils.addIfSupported(hashSet, arrayList, "TLSv1.3", "TLSv1.2", "TLSv1.1", "TLSv1");
        if (!arrayList.isEmpty()) {
            return (String[]) arrayList.toArray(EmptyArrays.EMPTY_STRINGS);
        }
        return sSLEngine.getEnabledProtocols();
    }

    private static Set<String> supportedCiphers(SSLEngine sSLEngine) {
        String[] supportedCipherSuites = sSLEngine.getSupportedCipherSuites();
        LinkedHashSet linkedHashSet = new LinkedHashSet(supportedCipherSuites.length);
        for (String str : supportedCipherSuites) {
            linkedHashSet.add(str);
            if (str.startsWith("SSL_")) {
                String str2 = "TLS_" + str.substring(4);
                try {
                    sSLEngine.setEnabledCipherSuites(new String[]{str2});
                    linkedHashSet.add(str2);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return linkedHashSet;
    }

    private static List<String> defaultCiphers(SSLEngine sSLEngine, Set<String> set) {
        ArrayList arrayList = new ArrayList();
        SslUtils.addIfSupported(set, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
        SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, sSLEngine.getEnabledCipherSuites());
        return arrayList;
    }

    private static boolean isTlsV13Supported(String[] strArr) {
        for (String str : strArr) {
            if ("TLSv1.3".equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public JdkSslContext(SSLContext sSLContext, boolean z, ClientAuth clientAuth) {
        this(sSLContext, z, (Iterable<String>) null, (CipherSuiteFilter) IdentityCipherSuiteFilter.INSTANCE, (JdkApplicationProtocolNegotiator) JdkDefaultApplicationProtocolNegotiator.INSTANCE, clientAuth, (String[]) null, false);
    }

    @Deprecated
    public JdkSslContext(SSLContext sSLContext, boolean z, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, ClientAuth clientAuth) {
        this(sSLContext, z, iterable, cipherSuiteFilter, applicationProtocolConfig, clientAuth, (String[]) null, false);
    }

    public JdkSslContext(SSLContext sSLContext, boolean z, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, ClientAuth clientAuth, String[] strArr, boolean z2) {
        this(sSLContext, z, iterable, cipherSuiteFilter, toNegotiator(applicationProtocolConfig, !z), clientAuth, strArr == null ? null : (String[]) strArr.clone(), z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JdkSslContext(SSLContext sSLContext, boolean z, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, JdkApplicationProtocolNegotiator jdkApplicationProtocolNegotiator, ClientAuth clientAuth, String[] strArr, boolean z2) {
        super(z2);
        Set<String> supportedCiphers;
        List<String> list;
        String[] strArr2;
        this.apn = (JdkApplicationProtocolNegotiator) ObjectUtil.checkNotNull(jdkApplicationProtocolNegotiator, "apn");
        this.clientAuth = (ClientAuth) ObjectUtil.checkNotNull(clientAuth, "clientAuth");
        this.sslContext = (SSLContext) ObjectUtil.checkNotNull(sSLContext, "sslContext");
        if (DEFAULT_PROVIDER.equals(sSLContext.getProvider())) {
            strArr = strArr == null ? DEFAULT_PROTOCOLS : strArr;
            this.protocols = strArr;
            if (isTlsV13Supported(strArr)) {
                supportedCiphers = SUPPORTED_CIPHERS;
                list = DEFAULT_CIPHERS;
            } else {
                supportedCiphers = SUPPORTED_CIPHERS_NON_TLSV13;
                list = DEFAULT_CIPHERS_NON_TLSV13;
            }
        } else {
            SSLEngine createSSLEngine = sSLContext.createSSLEngine();
            try {
                if (strArr == null) {
                    this.protocols = defaultProtocols(sSLContext, createSSLEngine);
                } else {
                    this.protocols = strArr;
                }
                supportedCiphers = supportedCiphers(createSSLEngine);
                List<String> defaultCiphers = defaultCiphers(createSSLEngine, supportedCiphers);
                if (!isTlsV13Supported(this.protocols)) {
                    for (String str : SslUtils.DEFAULT_TLSV13_CIPHER_SUITES) {
                        supportedCiphers.remove(str);
                        defaultCiphers.remove(str);
                    }
                }
                ReferenceCountUtil.release(createSSLEngine);
                list = defaultCiphers;
            } catch (Throwable th) {
                ReferenceCountUtil.release(createSSLEngine);
                throw th;
            }
        }
        String[] filterCipherSuites = ((CipherSuiteFilter) ObjectUtil.checkNotNull(cipherSuiteFilter, "cipherFilter")).filterCipherSuites(iterable, list, supportedCiphers);
        this.cipherSuites = filterCipherSuites;
        this.unmodifiableCipherSuites = Collections.unmodifiableList(Arrays.asList(filterCipherSuites));
        this.isClient = z;
    }

    public final SSLContext context() {
        return this.sslContext;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final boolean isClient() {
        return this.isClient;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final SSLSessionContext sessionContext() {
        if (isServer()) {
            return context().getServerSessionContext();
        }
        return context().getClientSessionContext();
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final List<String> cipherSuites() {
        return this.unmodifiableCipherSuites;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final long sessionCacheSize() {
        return sessionContext().getSessionCacheSize();
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final long sessionTimeout() {
        return sessionContext().getSessionTimeout();
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final SSLEngine newEngine(ByteBufAllocator byteBufAllocator) {
        return configureAndWrapEngine(context().createSSLEngine(), byteBufAllocator);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final SSLEngine newEngine(ByteBufAllocator byteBufAllocator, String str, int i) {
        return configureAndWrapEngine(context().createSSLEngine(str, i), byteBufAllocator);
    }

    private SSLEngine configureAndWrapEngine(SSLEngine sSLEngine, ByteBufAllocator byteBufAllocator) {
        sSLEngine.setEnabledCipherSuites(this.cipherSuites);
        sSLEngine.setEnabledProtocols(this.protocols);
        sSLEngine.setUseClientMode(isClient());
        if (isServer()) {
            int i = AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ClientAuth[this.clientAuth.ordinal()];
            if (i == 1) {
                sSLEngine.setWantClientAuth(true);
            } else if (i == 2) {
                sSLEngine.setNeedClientAuth(true);
            } else if (i != 3) {
                throw new Error("Unknown auth " + this.clientAuth);
            }
        }
        JdkApplicationProtocolNegotiator.SslEngineWrapperFactory wrapperFactory = this.apn.wrapperFactory();
        if (wrapperFactory instanceof JdkApplicationProtocolNegotiator.AllocatorAwareSslEngineWrapperFactory) {
            return ((JdkApplicationProtocolNegotiator.AllocatorAwareSslEngineWrapperFactory) wrapperFactory).wrapSslEngine(sSLEngine, byteBufAllocator, this.apn, isServer());
        }
        return wrapperFactory.wrapSslEngine(sSLEngine, this.apn, isServer());
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final JdkApplicationProtocolNegotiator applicationProtocolNegotiator() {
        return this.apn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JdkApplicationProtocolNegotiator toNegotiator(ApplicationProtocolConfig applicationProtocolConfig, boolean z) {
        if (applicationProtocolConfig == null) {
            return JdkDefaultApplicationProtocolNegotiator.INSTANCE;
        }
        int i = AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[applicationProtocolConfig.protocol().ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (z) {
                    int i2 = AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior[applicationProtocolConfig.selectorFailureBehavior().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return new JdkAlpnApplicationProtocolNegotiator(false, (Iterable<String>) applicationProtocolConfig.supportedProtocols());
                        }
                        throw new UnsupportedOperationException("JDK provider does not support " + applicationProtocolConfig.selectorFailureBehavior() + " failure behavior");
                    }
                    return new JdkAlpnApplicationProtocolNegotiator(true, (Iterable<String>) applicationProtocolConfig.supportedProtocols());
                }
                int i3 = AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior[applicationProtocolConfig.selectedListenerFailureBehavior().ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return new JdkAlpnApplicationProtocolNegotiator(true, (Iterable<String>) applicationProtocolConfig.supportedProtocols());
                    }
                    throw new UnsupportedOperationException("JDK provider does not support " + applicationProtocolConfig.selectedListenerFailureBehavior() + " failure behavior");
                }
                return new JdkAlpnApplicationProtocolNegotiator(false, (Iterable<String>) applicationProtocolConfig.supportedProtocols());
            } else if (i != 3) {
                throw new UnsupportedOperationException("JDK provider does not support " + applicationProtocolConfig.protocol() + " protocol");
            } else if (z) {
                int i4 = AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior[applicationProtocolConfig.selectedListenerFailureBehavior().ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        return new JdkNpnApplicationProtocolNegotiator(true, (Iterable<String>) applicationProtocolConfig.supportedProtocols());
                    }
                    throw new UnsupportedOperationException("JDK provider does not support " + applicationProtocolConfig.selectedListenerFailureBehavior() + " failure behavior");
                }
                return new JdkNpnApplicationProtocolNegotiator(false, (Iterable<String>) applicationProtocolConfig.supportedProtocols());
            } else {
                int i5 = AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior[applicationProtocolConfig.selectorFailureBehavior().ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        return new JdkNpnApplicationProtocolNegotiator(false, (Iterable<String>) applicationProtocolConfig.supportedProtocols());
                    }
                    throw new UnsupportedOperationException("JDK provider does not support " + applicationProtocolConfig.selectorFailureBehavior() + " failure behavior");
                }
                return new JdkNpnApplicationProtocolNegotiator(true, (Iterable<String>) applicationProtocolConfig.supportedProtocols());
            }
        }
        return JdkDefaultApplicationProtocolNegotiator.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.netty.shaded.io.netty.handler.ssl.JdkSslContext$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ClientAuth;

        static {
            int[] iArr = new int[ApplicationProtocolConfig.Protocol.values().length];
            $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol = iArr;
            try {
                iArr[ApplicationProtocolConfig.Protocol.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[ApplicationProtocolConfig.Protocol.ALPN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[ApplicationProtocolConfig.Protocol.NPN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ApplicationProtocolConfig.SelectedListenerFailureBehavior.values().length];
            $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior = iArr2;
            try {
                iArr2[ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior[ApplicationProtocolConfig.SelectedListenerFailureBehavior.FATAL_ALERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[ApplicationProtocolConfig.SelectorFailureBehavior.values().length];
            $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior = iArr3;
            try {
                iArr3[ApplicationProtocolConfig.SelectorFailureBehavior.FATAL_ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior[ApplicationProtocolConfig.SelectorFailureBehavior.NO_ADVERTISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[ClientAuth.values().length];
            $SwitchMap$io$netty$handler$ssl$ClientAuth = iArr4;
            try {
                iArr4[ClientAuth.OPTIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ClientAuth[ClientAuth.REQUIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ClientAuth[ClientAuth.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static KeyManagerFactory buildKeyManagerFactory(File file, File file2, String str, KeyManagerFactory keyManagerFactory, String str2) throws UnrecoverableKeyException, KeyStoreException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException, InvalidAlgorithmParameterException, CertificateException, KeyException, IOException {
        String property = Security.getProperty("ssl.KeyManagerFactory.algorithm");
        if (property == null) {
            property = "SunX509";
        }
        return buildKeyManagerFactory(file, property, file2, str, keyManagerFactory, str2);
    }

    @Deprecated
    protected static KeyManagerFactory buildKeyManagerFactory(File file, File file2, String str, KeyManagerFactory keyManagerFactory) throws UnrecoverableKeyException, KeyStoreException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException, InvalidAlgorithmParameterException, CertificateException, KeyException, IOException {
        return buildKeyManagerFactory(file, file2, str, keyManagerFactory, KeyStore.getDefaultType());
    }

    static KeyManagerFactory buildKeyManagerFactory(File file, String str, File file2, String str2, KeyManagerFactory keyManagerFactory, String str3) throws KeyStoreException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException, InvalidAlgorithmParameterException, IOException, CertificateException, KeyException, UnrecoverableKeyException {
        return buildKeyManagerFactory(toX509Certificates(file), str, toPrivateKey(file2, str2), str2, keyManagerFactory, str3);
    }

    @Deprecated
    protected static KeyManagerFactory buildKeyManagerFactory(File file, String str, File file2, String str2, KeyManagerFactory keyManagerFactory) throws KeyStoreException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException, InvalidAlgorithmParameterException, IOException, CertificateException, KeyException, UnrecoverableKeyException {
        return buildKeyManagerFactory(toX509Certificates(file), str, toPrivateKey(file2, str2), str2, keyManagerFactory, KeyStore.getDefaultType());
    }
}
