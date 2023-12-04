package io.grpc.netty.shaded.io.netty.handler.ssl;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.grpc.alts.CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import io.grpc.netty.shaded.io.netty.handler.ssl.ApplicationProtocolConfig;
import io.grpc.netty.shaded.io.netty.internal.tcnative.CertificateVerifier;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSLContext;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSLPrivateKeyMethod;
import io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted;
import io.grpc.netty.shaded.io.netty.util.ReferenceCounted;
import io.grpc.netty.shaded.io.netty.util.ResourceLeakDetector;
import io.grpc.netty.shaded.io.netty.util.ResourceLeakDetectorFactory;
import io.grpc.netty.shaded.io.netty.util.ResourceLeakTracker;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import io.grpc.netty.shaded.io.netty.util.internal.SystemPropertyUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes4.dex */
public abstract class ReferenceCountedOpenSslContext extends SslContext implements ReferenceCounted {
    private static final Integer DH_KEY_LENGTH;
    protected static final int VERIFY_DEPTH = 10;
    private final OpenSslApplicationProtocolNegotiator apn;
    private volatile int bioNonApplicationBufferSize;
    final ClientAuth clientAuth;
    protected long ctx;
    final ReadWriteLock ctxLock;
    final boolean enableOcsp;
    final OpenSslEngineMap engineMap;
    final Certificate[] keyCertChain;
    private final ResourceLeakTracker<ReferenceCountedOpenSslContext> leak;
    private final int mode;
    final String[] protocols;
    private final AbstractReferenceCounted refCnt;
    private final long sessionCacheSize;
    private final long sessionTimeout;
    private final List<String> unmodifiableCiphers;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(ReferenceCountedOpenSslContext.class);
    private static final int DEFAULT_BIO_NON_APPLICATION_BUFFER_SIZE = Math.max(1, SystemPropertyUtil.getInt("io.grpc.netty.shaded.io.netty.handler.ssl.openssl.bioNonApplicationBufferSize", 2048));
    static final boolean USE_TASKS = SystemPropertyUtil.getBoolean("io.grpc.netty.shaded.io.netty.handler.ssl.openssl.useTasks", false);
    private static final ResourceLeakDetector<ReferenceCountedOpenSslContext> leakDetector = ResourceLeakDetectorFactory.instance().newResourceLeakDetector(ReferenceCountedOpenSslContext.class);
    static final OpenSslApplicationProtocolNegotiator NONE_PROTOCOL_NEGOTIATOR = new OpenSslApplicationProtocolNegotiator() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslContext.2
        @Override // io.grpc.netty.shaded.io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator
        public ApplicationProtocolConfig.Protocol protocol() {
            return ApplicationProtocolConfig.Protocol.NONE;
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.ssl.ApplicationProtocolNegotiator
        public List<String> protocols() {
            return Collections.emptyList();
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator
        public ApplicationProtocolConfig.SelectorFailureBehavior selectorFailureBehavior() {
            return ApplicationProtocolConfig.SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL;
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator
        public ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedListenerFailureBehavior() {
            return ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT;
        }
    };

    @Deprecated
    public boolean getRejectRemoteInitiatedRenegotiation() {
        return true;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public abstract OpenSslSessionContext sessionContext();

    static {
        Integer num = null;
        try {
            String str = SystemPropertyUtil.get("jdk.tls.ephemeralDHKeySize");
            if (str != null) {
                try {
                    num = Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    logger.debug("ReferenceCountedOpenSslContext supports -Djdk.tls.ephemeralDHKeySize={int}, but got: " + str);
                }
            }
        } catch (Throwable unused2) {
        }
        DH_KEY_LENGTH = num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReferenceCountedOpenSslContext(Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2, int i, Certificate[] certificateArr, ClientAuth clientAuth, String[] strArr, boolean z, boolean z2, boolean z3) throws SSLException {
        this(iterable, cipherSuiteFilter, toNegotiator(applicationProtocolConfig), j, j2, i, certificateArr, clientAuth, strArr, z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReferenceCountedOpenSslContext(Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, OpenSslApplicationProtocolNegotiator openSslApplicationProtocolNegotiator, long j, long j2, int i, Certificate[] certificateArr, ClientAuth clientAuth, String[] strArr, boolean z, boolean z2, boolean z3) throws SSLException {
        super(z);
        this.refCnt = new AbstractReferenceCounted() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslContext.1
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
            public ReferenceCounted touch(Object obj) {
                if (ReferenceCountedOpenSslContext.this.leak != null) {
                    ReferenceCountedOpenSslContext.this.leak.record(obj);
                }
                return ReferenceCountedOpenSslContext.this;
            }

            @Override // io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted
            protected void deallocate() {
                ReferenceCountedOpenSslContext.this.destroy();
                if (ReferenceCountedOpenSslContext.this.leak != null) {
                    ReferenceCountedOpenSslContext.this.leak.close(ReferenceCountedOpenSslContext.this);
                }
            }
        };
        this.engineMap = new DefaultOpenSslEngineMap();
        this.ctxLock = new ReentrantReadWriteLock();
        this.bioNonApplicationBufferSize = DEFAULT_BIO_NON_APPLICATION_BUFFER_SIZE;
        OpenSsl.ensureAvailability();
        if (z2 && !OpenSsl.isOcspSupported()) {
            throw new IllegalStateException("OCSP is not supported.");
        }
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException("mode most be either SSL.SSL_MODE_SERVER or SSL.SSL_MODE_CLIENT");
        }
        this.leak = z3 ? leakDetector.track(this) : null;
        this.mode = i;
        this.clientAuth = isServer() ? (ClientAuth) ObjectUtil.checkNotNull(clientAuth, "clientAuth") : ClientAuth.NONE;
        this.protocols = strArr;
        this.enableOcsp = z2;
        this.keyCertChain = certificateArr != null ? (Certificate[]) certificateArr.clone() : null;
        List<String> asList = Arrays.asList(((CipherSuiteFilter) ObjectUtil.checkNotNull(cipherSuiteFilter, "cipherFilter")).filterCipherSuites(iterable, OpenSsl.DEFAULT_CIPHERS, OpenSsl.availableJavaCipherSuites()));
        this.unmodifiableCiphers = asList;
        this.apn = (OpenSslApplicationProtocolNegotiator) ObjectUtil.checkNotNull(openSslApplicationProtocolNegotiator, "apn");
        try {
            boolean isTlsv13Supported = OpenSsl.isTlsv13Supported();
            try {
                this.ctx = SSLContext.make(isTlsv13Supported ? 62 : 30, i);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                try {
                    try {
                        if (asList.isEmpty()) {
                            SSLContext.setCipherSuite(this.ctx, "", false);
                            if (isTlsv13Supported) {
                                SSLContext.setCipherSuite(this.ctx, "", true);
                            }
                        } else {
                            CipherSuiteConverter.convertToCipherStrings(asList, sb, sb2, OpenSsl.isBoringSSL());
                            SSLContext.setCipherSuite(this.ctx, sb.toString(), false);
                            if (isTlsv13Supported) {
                                SSLContext.setCipherSuite(this.ctx, sb2.toString(), true);
                            }
                        }
                        int options = SSLContext.getOptions(this.ctx) | SSL.SSL_OP_NO_SSLv2 | SSL.SSL_OP_NO_SSLv3 | SSL.SSL_OP_CIPHER_SERVER_PREFERENCE | SSL.SSL_OP_NO_COMPRESSION | SSL.SSL_OP_NO_TICKET;
                        SSLContext.setOptions(this.ctx, sb.length() == 0 ? options | SSL.SSL_OP_NO_SSLv2 | SSL.SSL_OP_NO_SSLv3 | SSL.SSL_OP_NO_TLSv1 | SSL.SSL_OP_NO_TLSv1_1 | SSL.SSL_OP_NO_TLSv1_2 : options);
                        long j3 = this.ctx;
                        SSLContext.setMode(j3, SSLContext.getMode(j3) | SSL.SSL_MODE_ACCEPT_MOVING_WRITE_BUFFER);
                        Integer num = DH_KEY_LENGTH;
                        if (num != null) {
                            SSLContext.setTmpDHLength(this.ctx, num.intValue());
                        }
                        List<String> protocols = openSslApplicationProtocolNegotiator.protocols();
                        if (!protocols.isEmpty()) {
                            String[] strArr2 = (String[]) protocols.toArray(new String[0]);
                            int opensslSelectorFailureBehavior = opensslSelectorFailureBehavior(openSslApplicationProtocolNegotiator.selectorFailureBehavior());
                            int i2 = AnonymousClass3.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[openSslApplicationProtocolNegotiator.protocol().ordinal()];
                            if (i2 == 1) {
                                SSLContext.setNpnProtos(this.ctx, strArr2, opensslSelectorFailureBehavior);
                            } else if (i2 == 2) {
                                SSLContext.setAlpnProtos(this.ctx, strArr2, opensslSelectorFailureBehavior);
                            } else if (i2 == 3) {
                                SSLContext.setNpnProtos(this.ctx, strArr2, opensslSelectorFailureBehavior);
                                SSLContext.setAlpnProtos(this.ctx, strArr2, opensslSelectorFailureBehavior);
                            } else {
                                throw new Error();
                            }
                        }
                        long sessionCacheSize = j <= 0 ? SSLContext.setSessionCacheSize(this.ctx, 20480L) : j;
                        this.sessionCacheSize = sessionCacheSize;
                        SSLContext.setSessionCacheSize(this.ctx, sessionCacheSize);
                        long sessionCacheTimeout = j2 <= 0 ? SSLContext.setSessionCacheTimeout(this.ctx, 300L) : j2;
                        this.sessionTimeout = sessionCacheTimeout;
                        SSLContext.setSessionCacheTimeout(this.ctx, sessionCacheTimeout);
                        if (z2) {
                            SSLContext.enableOcsp(this.ctx, isClient());
                        }
                        SSLContext.setUseTasks(this.ctx, USE_TASKS);
                    } catch (SSLException e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw new SSLException("failed to set cipher suite: " + this.unmodifiableCiphers, e2);
                }
            } catch (Exception e3) {
                throw new SSLException("failed to create an SSL_CTX", e3);
            }
        } catch (Throwable th) {
            release();
            throw th;
        }
    }

    private static int opensslSelectorFailureBehavior(ApplicationProtocolConfig.SelectorFailureBehavior selectorFailureBehavior) {
        int i = AnonymousClass3.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior[selectorFailureBehavior.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new Error();
        }
        return 0;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final List<String> cipherSuites() {
        return this.unmodifiableCiphers;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final long sessionCacheSize() {
        return this.sessionCacheSize;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final long sessionTimeout() {
        return this.sessionTimeout;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public ApplicationProtocolNegotiator applicationProtocolNegotiator() {
        return this.apn;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final boolean isClient() {
        return this.mode == 0;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final SSLEngine newEngine(ByteBufAllocator byteBufAllocator, String str, int i) {
        return newEngine0(byteBufAllocator, str, i, true);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    protected final SslHandler newHandler(ByteBufAllocator byteBufAllocator, boolean z) {
        return new SslHandler(newEngine0(byteBufAllocator, null, -1, false), z);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    protected final SslHandler newHandler(ByteBufAllocator byteBufAllocator, String str, int i, boolean z) {
        return new SslHandler(newEngine0(byteBufAllocator, str, i, false), z);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    protected SslHandler newHandler(ByteBufAllocator byteBufAllocator, boolean z, Executor executor) {
        return new SslHandler(newEngine0(byteBufAllocator, null, -1, false), z, executor);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    protected SslHandler newHandler(ByteBufAllocator byteBufAllocator, String str, int i, boolean z, Executor executor) {
        return new SslHandler(newEngine0(byteBufAllocator, str, i, false), executor);
    }

    SSLEngine newEngine0(ByteBufAllocator byteBufAllocator, String str, int i, boolean z) {
        return new ReferenceCountedOpenSslEngine(this, byteBufAllocator, str, i, z, true);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslContext
    public final SSLEngine newEngine(ByteBufAllocator byteBufAllocator) {
        return newEngine(byteBufAllocator, null, -1);
    }

    @Deprecated
    public final long context() {
        return sslCtxPointer();
    }

    @Deprecated
    public final OpenSslSessionStats stats() {
        return sessionContext().stats();
    }

    @Deprecated
    public void setRejectRemoteInitiatedRenegotiation(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Renegotiation is not supported");
        }
    }

    public void setBioNonApplicationBufferSize(int i) {
        this.bioNonApplicationBufferSize = ObjectUtil.checkPositiveOrZero(i, "bioNonApplicationBufferSize");
    }

    public int getBioNonApplicationBufferSize() {
        return this.bioNonApplicationBufferSize;
    }

    @Deprecated
    public final void setTicketKeys(byte[] bArr) {
        sessionContext().setTicketKeys(bArr);
    }

    @Deprecated
    public final long sslCtxPointer() {
        Lock readLock = this.ctxLock.readLock();
        readLock.lock();
        try {
            return SSLContext.getSslCtx(this.ctx);
        } finally {
            readLock.unlock();
        }
    }

    public final void setPrivateKeyMethod(OpenSslPrivateKeyMethod openSslPrivateKeyMethod) {
        ObjectUtil.checkNotNull(openSslPrivateKeyMethod, FirebaseAnalytics.Param.METHOD);
        Lock writeLock = this.ctxLock.writeLock();
        writeLock.lock();
        try {
            SSLContext.setPrivateKeyMethod(this.ctx, new PrivateKeyMethod(this.engineMap, openSslPrivateKeyMethod));
        } finally {
            writeLock.unlock();
        }
    }

    public final void setUseTasks(boolean z) {
        Lock writeLock = this.ctxLock.writeLock();
        writeLock.lock();
        try {
            SSLContext.setUseTasks(this.ctx, z);
        } finally {
            writeLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        Lock writeLock = this.ctxLock.writeLock();
        writeLock.lock();
        try {
            long j = this.ctx;
            if (j != 0) {
                if (this.enableOcsp) {
                    SSLContext.disableOcsp(j);
                }
                SSLContext.free(this.ctx);
                this.ctx = 0L;
                OpenSslSessionContext sessionContext = sessionContext();
                if (sessionContext != null) {
                    sessionContext.destroy();
                }
            }
        } finally {
            writeLock.unlock();
        }
    }

    protected static X509Certificate[] certificates(byte[][] bArr) {
        int length = bArr.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i = 0; i < length; i++) {
            x509CertificateArr[i] = new OpenSslX509Certificate(bArr[i]);
        }
        return x509CertificateArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static X509TrustManager chooseTrustManager(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                if (PlatformDependent.javaVersion() >= 7) {
                    return OpenSslX509TrustManagerWrapper.wrapIfNeeded((X509TrustManager) trustManager);
                }
                return (X509TrustManager) trustManager;
            }
        }
        throw new IllegalStateException("no X509TrustManager found");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static X509KeyManager chooseX509KeyManager(KeyManager[] keyManagerArr) {
        for (KeyManager keyManager : keyManagerArr) {
            if (keyManager instanceof X509KeyManager) {
                return (X509KeyManager) keyManager;
            }
        }
        throw new IllegalStateException("no X509KeyManager found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OpenSslApplicationProtocolNegotiator toNegotiator(ApplicationProtocolConfig applicationProtocolConfig) {
        if (applicationProtocolConfig == null) {
            return NONE_PROTOCOL_NEGOTIATOR;
        }
        int i = AnonymousClass3.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[applicationProtocolConfig.protocol().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                return NONE_PROTOCOL_NEGOTIATOR;
            }
            throw new Error();
        }
        int i2 = AnonymousClass3.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior[applicationProtocolConfig.selectedListenerFailureBehavior().ordinal()];
        if (i2 == 1 || i2 == 2) {
            int i3 = AnonymousClass3.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior[applicationProtocolConfig.selectorFailureBehavior().ordinal()];
            if (i3 == 1 || i3 == 2) {
                return new OpenSslDefaultApplicationProtocolNegotiator(applicationProtocolConfig);
            }
            throw new UnsupportedOperationException("OpenSSL provider does not support " + applicationProtocolConfig.selectorFailureBehavior() + " behavior");
        }
        throw new UnsupportedOperationException("OpenSSL provider does not support " + applicationProtocolConfig.selectedListenerFailureBehavior() + " behavior");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslContext$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior;

        static {
            int[] iArr = new int[ApplicationProtocolConfig.SelectedListenerFailureBehavior.values().length];
            $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior = iArr;
            try {
                iArr[ApplicationProtocolConfig.SelectedListenerFailureBehavior.CHOOSE_MY_LAST_PROTOCOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior[ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ApplicationProtocolConfig.SelectorFailureBehavior.values().length];
            $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior = iArr2;
            try {
                iArr2[ApplicationProtocolConfig.SelectorFailureBehavior.NO_ADVERTISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior[ApplicationProtocolConfig.SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[ApplicationProtocolConfig.Protocol.values().length];
            $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol = iArr3;
            try {
                iArr3[ApplicationProtocolConfig.Protocol.NPN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[ApplicationProtocolConfig.Protocol.ALPN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[ApplicationProtocolConfig.Protocol.NPN_AND_ALPN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[ApplicationProtocolConfig.Protocol.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean useExtendedTrustManager(X509TrustManager x509TrustManager) {
        return PlatformDependent.javaVersion() >= 7 && CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m$2(x509TrustManager);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public final int refCnt() {
        return this.refCnt.refCnt();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public final ReferenceCounted retain() {
        this.refCnt.retain();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public final ReferenceCounted retain(int i) {
        this.refCnt.retain(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public final ReferenceCounted touch() {
        this.refCnt.touch();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public final ReferenceCounted touch(Object obj) {
        this.refCnt.touch(obj);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public final boolean release() {
        return this.refCnt.release();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public final boolean release(int i) {
        return this.refCnt.release(i);
    }

    /* loaded from: classes4.dex */
    static abstract class AbstractCertificateVerifier extends CertificateVerifier {
        private final OpenSslEngineMap engineMap;

        abstract void verify(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine, X509Certificate[] x509CertificateArr, String str) throws Exception;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractCertificateVerifier(OpenSslEngineMap openSslEngineMap) {
            this.engineMap = openSslEngineMap;
        }

        @Override // io.grpc.netty.shaded.io.netty.internal.tcnative.CertificateVerifier
        public final int verify(long j, byte[][] bArr, String str) {
            ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine = this.engineMap.get(j);
            if (referenceCountedOpenSslEngine == null) {
                return CertificateVerifier.X509_V_ERR_UNSPECIFIED;
            }
            try {
                verify(referenceCountedOpenSslEngine, ReferenceCountedOpenSslContext.certificates(bArr), str);
                return CertificateVerifier.X509_V_OK;
            } catch (Throwable th) {
                ReferenceCountedOpenSslContext.logger.debug("verification of certificate failed", (Throwable) th);
                referenceCountedOpenSslEngine.initHandshakeException(th);
                if (th instanceof OpenSslCertificateException) {
                    return th.errorCode();
                }
                if (th instanceof CertificateExpiredException) {
                    return CertificateVerifier.X509_V_ERR_CERT_HAS_EXPIRED;
                }
                if (th instanceof CertificateNotYetValidException) {
                    return CertificateVerifier.X509_V_ERR_CERT_NOT_YET_VALID;
                }
                if (PlatformDependent.javaVersion() >= 7) {
                    return translateToError(th);
                }
                return CertificateVerifier.X509_V_ERR_UNSPECIFIED;
            }
        }

        private static int translateToError(Throwable th) {
            CertPathValidatorException.Reason reason;
            CertPathValidatorException.BasicReason basicReason;
            CertPathValidatorException.BasicReason basicReason2;
            CertPathValidatorException.BasicReason basicReason3;
            if (CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m$3(th)) {
                return CertificateVerifier.X509_V_ERR_CERT_REVOKED;
            }
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                if (cause instanceof CertPathValidatorException) {
                    reason = ((CertPathValidatorException) cause).getReason();
                    basicReason = CertPathValidatorException.BasicReason.EXPIRED;
                    if (reason == basicReason) {
                        return CertificateVerifier.X509_V_ERR_CERT_HAS_EXPIRED;
                    }
                    basicReason2 = CertPathValidatorException.BasicReason.NOT_YET_VALID;
                    if (reason == basicReason2) {
                        return CertificateVerifier.X509_V_ERR_CERT_NOT_YET_VALID;
                    }
                    basicReason3 = CertPathValidatorException.BasicReason.REVOKED;
                    if (reason == basicReason3) {
                        return CertificateVerifier.X509_V_ERR_CERT_REVOKED;
                    }
                }
            }
            return CertificateVerifier.X509_V_ERR_UNSPECIFIED;
        }
    }

    /* loaded from: classes4.dex */
    private static final class DefaultOpenSslEngineMap implements OpenSslEngineMap {
        private final Map<Long, ReferenceCountedOpenSslEngine> engines;

        private DefaultOpenSslEngineMap() {
            this.engines = PlatformDependent.newConcurrentHashMap();
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.ssl.OpenSslEngineMap
        public ReferenceCountedOpenSslEngine remove(long j) {
            return this.engines.remove(Long.valueOf(j));
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.ssl.OpenSslEngineMap
        public void add(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine) {
            this.engines.put(Long.valueOf(referenceCountedOpenSslEngine.sslPointer()), referenceCountedOpenSslEngine);
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.ssl.OpenSslEngineMap
        public ReferenceCountedOpenSslEngine get(long j) {
            return this.engines.get(Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setKeyMaterial(long j, X509Certificate[] x509CertificateArr, PrivateKey privateKey, String str) throws SSLException {
        long j2;
        long j3;
        long j4 = 0;
        PemEncoded pemEncoded = null;
        try {
            try {
                pemEncoded = PemX509Certificate.toPEM(ByteBufAllocator.DEFAULT, true, x509CertificateArr);
            } catch (Throwable th) {
                th = th;
            }
            try {
                j3 = toBIO(ByteBufAllocator.DEFAULT, pemEncoded.retain());
                try {
                    long bio = toBIO(ByteBufAllocator.DEFAULT, pemEncoded.retain());
                    if (privateKey != null) {
                        try {
                            j4 = toBIO(ByteBufAllocator.DEFAULT, privateKey);
                        } catch (SSLException e) {
                            e = e;
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            throw new SSLException("failed to set certificate and key", e);
                        }
                    }
                    try {
                        SSLContext.setCertificateBio(j, j3, j4, str == null ? "" : str);
                        SSLContext.setCertificateChainBio(j, bio, true);
                        freeBio(j4);
                        freeBio(j3);
                        freeBio(bio);
                        if (pemEncoded != null) {
                            pemEncoded.release();
                        }
                    } catch (SSLException e3) {
                        e = e3;
                        throw e;
                    } catch (Exception e4) {
                        e = e4;
                        throw new SSLException("failed to set certificate and key", e);
                    } catch (Throwable th2) {
                        th = th2;
                        j2 = bio;
                        pemEncoded = pemEncoded;
                        freeBio(j4);
                        freeBio(j3);
                        freeBio(j2);
                        if (pemEncoded != null) {
                            pemEncoded.release();
                        }
                        throw th;
                    }
                } catch (SSLException e5) {
                    e = e5;
                } catch (Exception e6) {
                    e = e6;
                } catch (Throwable th3) {
                    th = th3;
                    j2 = 0;
                }
            } catch (SSLException e7) {
                e = e7;
                throw e;
            } catch (Exception e8) {
                e = e8;
                throw new SSLException("failed to set certificate and key", e);
            } catch (Throwable th4) {
                th = th4;
                j2 = 0;
                j3 = 0;
                freeBio(j4);
                freeBio(j3);
                freeBio(j2);
                if (pemEncoded != null) {
                }
                throw th;
            }
        } catch (SSLException e9) {
            e = e9;
        } catch (Exception e10) {
            e = e10;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void freeBio(long j) {
        if (j != 0) {
            SSL.freeBIO(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long toBIO(ByteBufAllocator byteBufAllocator, PrivateKey privateKey) throws Exception {
        if (privateKey == null) {
            return 0L;
        }
        PemEncoded pem = PemPrivateKey.toPEM(byteBufAllocator, true, privateKey);
        try {
            return toBIO(byteBufAllocator, pem.retain());
        } finally {
            pem.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long toBIO(ByteBufAllocator byteBufAllocator, X509Certificate... x509CertificateArr) throws Exception {
        if (x509CertificateArr == null) {
            return 0L;
        }
        if (x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("certChain can't be empty");
        }
        PemEncoded pem = PemX509Certificate.toPEM(byteBufAllocator, true, x509CertificateArr);
        try {
            return toBIO(byteBufAllocator, pem.retain());
        } finally {
            pem.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long toBIO(ByteBufAllocator byteBufAllocator, PemEncoded pemEncoded) throws Exception {
        try {
            ByteBuf content = pemEncoded.content();
            if (content.isDirect()) {
                return newBIO(content.retainedSlice());
            }
            ByteBuf directBuffer = byteBufAllocator.directBuffer(content.readableBytes());
            directBuffer.writeBytes(content, content.readerIndex(), content.readableBytes());
            long newBIO = newBIO(directBuffer.retainedSlice());
            if (pemEncoded.isSensitive()) {
                SslUtils.zeroout(directBuffer);
            }
            directBuffer.release();
            return newBIO;
        } finally {
            pemEncoded.release();
        }
    }

    private static long newBIO(ByteBuf byteBuf) throws Exception {
        try {
            long newMemBIO = SSL.newMemBIO();
            int readableBytes = byteBuf.readableBytes();
            if (SSL.bioWrite(newMemBIO, OpenSsl.memoryAddress(byteBuf) + byteBuf.readerIndex(), readableBytes) == readableBytes) {
                return newMemBIO;
            }
            SSL.freeBIO(newMemBIO);
            throw new IllegalStateException("Could not write data to memory BIO");
        } finally {
            byteBuf.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OpenSslKeyMaterialProvider providerFor(KeyManagerFactory keyManagerFactory, String str) {
        if (keyManagerFactory instanceof OpenSslX509KeyManagerFactory) {
            return ((OpenSslX509KeyManagerFactory) keyManagerFactory).newProvider();
        }
        if (keyManagerFactory instanceof OpenSslCachingX509KeyManagerFactory) {
            return ((OpenSslCachingX509KeyManagerFactory) keyManagerFactory).newProvider(str);
        }
        return new OpenSslKeyMaterialProvider(chooseX509KeyManager(keyManagerFactory.getKeyManagers()), str);
    }

    /* loaded from: classes4.dex */
    private static final class PrivateKeyMethod implements SSLPrivateKeyMethod {
        private final OpenSslEngineMap engineMap;
        private final OpenSslPrivateKeyMethod keyMethod;

        PrivateKeyMethod(OpenSslEngineMap openSslEngineMap, OpenSslPrivateKeyMethod openSslPrivateKeyMethod) {
            this.engineMap = openSslEngineMap;
            this.keyMethod = openSslPrivateKeyMethod;
        }

        private ReferenceCountedOpenSslEngine retrieveEngine(long j) throws SSLException {
            ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine = this.engineMap.get(j);
            if (referenceCountedOpenSslEngine != null) {
                return referenceCountedOpenSslEngine;
            }
            throw new SSLException("Could not find a " + StringUtil.simpleClassName((Class<?>) ReferenceCountedOpenSslEngine.class) + " for sslPointer " + j);
        }

        @Override // io.grpc.netty.shaded.io.netty.internal.tcnative.SSLPrivateKeyMethod
        public byte[] sign(long j, int i, byte[] bArr) throws Exception {
            ReferenceCountedOpenSslEngine retrieveEngine = retrieveEngine(j);
            try {
                return verifyResult(this.keyMethod.sign(retrieveEngine, i, bArr));
            } catch (Exception e) {
                retrieveEngine.initHandshakeException(e);
                throw e;
            }
        }

        @Override // io.grpc.netty.shaded.io.netty.internal.tcnative.SSLPrivateKeyMethod
        public byte[] decrypt(long j, byte[] bArr) throws Exception {
            ReferenceCountedOpenSslEngine retrieveEngine = retrieveEngine(j);
            try {
                return verifyResult(this.keyMethod.decrypt(retrieveEngine, bArr));
            } catch (Exception e) {
                retrieveEngine.initHandshakeException(e);
                throw e;
            }
        }

        private static byte[] verifyResult(byte[] bArr) throws SignatureException {
            if (bArr != null) {
                return bArr;
            }
            throw new SignatureException();
        }
    }
}
