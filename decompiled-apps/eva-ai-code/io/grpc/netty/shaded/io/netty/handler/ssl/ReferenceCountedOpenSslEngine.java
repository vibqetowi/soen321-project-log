package io.grpc.netty.shaded.io.netty.handler.ssl;

import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreAesCbc;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import io.grpc.netty.shaded.io.netty.handler.ssl.ApplicationProtocolConfig;
import io.grpc.netty.shaded.io.netty.internal.tcnative.Buffer;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted;
import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
import io.grpc.netty.shaded.io.netty.util.ReferenceCounted;
import io.grpc.netty.shaded.io.netty.util.ResourceLeakDetector;
import io.grpc.netty.shaded.io.netty.util.ResourceLeakDetectorFactory;
import io.grpc.netty.shaded.io.netty.util.ResourceLeakTracker;
import io.grpc.netty.shaded.io.netty.util.internal.EmptyArrays;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import io.grpc.netty.shaded.io.netty.util.internal.ThrowableUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.security.AlgorithmConstraints;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
/* loaded from: classes4.dex */
public class ReferenceCountedOpenSslEngine extends SSLEngine implements ReferenceCounted, ApplicationProtocolAccessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_SSLV2 = 0;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_SSLV3 = 1;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1 = 2;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1_1 = 3;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1_2 = 4;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1_3 = 5;
    private Object algorithmConstraints;
    final ByteBufAllocator alloc;
    private final OpenSslApplicationProtocolNegotiator apn;
    private volatile String applicationProtocol;
    private volatile ClientAuth clientAuth;
    private final boolean clientMode;
    private volatile boolean destroyed;
    private final boolean enableOcsp;
    private String endPointIdentificationAlgorithm;
    private final OpenSslEngineMap engineMap;
    private HandshakeState handshakeState;
    private boolean isInboundDone;
    final boolean jdkCompatibilityMode;
    private volatile long lastAccessed;
    private final ResourceLeakTracker<ReferenceCountedOpenSslEngine> leak;
    private volatile Certificate[] localCertificateChain;
    private volatile Collection<?> matchers;
    private int maxWrapBufferSize;
    private int maxWrapOverhead;
    private volatile boolean needTask;
    private long networkBIO;
    private boolean outboundClosed;
    private final ReferenceCountedOpenSslContext parentContext;
    private Throwable pendingException;
    private boolean receivedShutdown;
    private final AbstractReferenceCounted refCnt;
    private final OpenSslSession session;
    private final ByteBuffer[] singleDstBuffer;
    private final ByteBuffer[] singleSrcBuffer;
    private List<String> sniHostNames;
    private long ssl;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(ReferenceCountedOpenSslEngine.class);
    private static final ResourceLeakDetector<ReferenceCountedOpenSslEngine> leakDetector = ResourceLeakDetectorFactory.instance().newResourceLeakDetector(ReferenceCountedOpenSslEngine.class);
    private static final int[] OPENSSL_OP_NO_PROTOCOLS = {SSL.SSL_OP_NO_SSLv2, SSL.SSL_OP_NO_SSLv3, SSL.SSL_OP_NO_TLSv1, SSL.SSL_OP_NO_TLSv1_1, SSL.SSL_OP_NO_TLSv1_2, SSL.SSL_OP_NO_TLSv1_3};
    static final int MAX_PLAINTEXT_LENGTH = SSL.SSL_MAX_PLAINTEXT_LENGTH;
    private static final int MAX_RECORD_SIZE = SSL.SSL_MAX_RECORD_LENGTH;
    private static final SSLEngineResult NEED_UNWRAP_OK = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult NEED_UNWRAP_CLOSED = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult NEED_WRAP_OK = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0);
    private static final SSLEngineResult NEED_WRAP_CLOSED = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0);
    private static final SSLEngineResult CLOSED_NOT_HANDSHAKING = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum HandshakeState {
        NOT_STARTED,
        STARTED_IMPLICITLY,
        STARTED_EXPLICITLY,
        FINISHED
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getEnableSessionCreation() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReferenceCountedOpenSslEngine(ReferenceCountedOpenSslContext referenceCountedOpenSslContext, ByteBufAllocator byteBufAllocator, String str, int i, boolean z, boolean z2) {
        super(str, i);
        this.handshakeState = HandshakeState.NOT_STARTED;
        this.refCnt = new AbstractReferenceCounted() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine.1
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
            public ReferenceCounted touch(Object obj) {
                if (ReferenceCountedOpenSslEngine.this.leak != null) {
                    ReferenceCountedOpenSslEngine.this.leak.record(obj);
                }
                return ReferenceCountedOpenSslEngine.this;
            }

            @Override // io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted
            protected void deallocate() {
                ReferenceCountedOpenSslEngine.this.shutdown();
                if (ReferenceCountedOpenSslEngine.this.leak != null) {
                    ReferenceCountedOpenSslEngine.this.leak.close(ReferenceCountedOpenSslEngine.this);
                }
                ReferenceCountedOpenSslEngine.this.parentContext.release();
            }
        };
        this.clientAuth = ClientAuth.NONE;
        this.lastAccessed = -1L;
        boolean z3 = true;
        this.singleSrcBuffer = new ByteBuffer[1];
        this.singleDstBuffer = new ByteBuffer[1];
        OpenSsl.ensureAvailability();
        this.alloc = (ByteBufAllocator) ObjectUtil.checkNotNull(byteBufAllocator, "alloc");
        this.apn = (OpenSslApplicationProtocolNegotiator) referenceCountedOpenSslContext.applicationProtocolNegotiator();
        boolean isClient = referenceCountedOpenSslContext.isClient();
        this.clientMode = isClient;
        if (PlatformDependent.javaVersion() >= 7) {
            this.session = new ExtendedOpenSslSession(new DefaultOpenSslSession(referenceCountedOpenSslContext.sessionContext())) { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine.2
                private String[] peerSupportedSignatureAlgorithms;
                private List requestedServerNames;

                @Override // io.grpc.netty.shaded.io.netty.handler.ssl.ExtendedOpenSslSession
                public List getRequestedServerNames() {
                    List list;
                    if (ReferenceCountedOpenSslEngine.this.clientMode) {
                        return Java8SslUtils.getSniHostNames(ReferenceCountedOpenSslEngine.this.sniHostNames);
                    }
                    synchronized (ReferenceCountedOpenSslEngine.this) {
                        if (this.requestedServerNames == null) {
                            if (!ReferenceCountedOpenSslEngine.this.isDestroyed()) {
                                if (SSL.getSniHostname(ReferenceCountedOpenSslEngine.this.ssl) == null) {
                                    this.requestedServerNames = Collections.emptyList();
                                } else {
                                    this.requestedServerNames = Java8SslUtils.getSniHostName(SSL.getSniHostname(ReferenceCountedOpenSslEngine.this.ssl).getBytes(CharsetUtil.UTF_8));
                                }
                            } else {
                                this.requestedServerNames = Collections.emptyList();
                            }
                        }
                        list = this.requestedServerNames;
                    }
                    return list;
                }

                public String[] getPeerSupportedSignatureAlgorithms() {
                    String[] strArr;
                    synchronized (ReferenceCountedOpenSslEngine.this) {
                        if (this.peerSupportedSignatureAlgorithms == null) {
                            if (!ReferenceCountedOpenSslEngine.this.isDestroyed()) {
                                String[] sigAlgs = SSL.getSigAlgs(ReferenceCountedOpenSslEngine.this.ssl);
                                if (sigAlgs == null) {
                                    this.peerSupportedSignatureAlgorithms = EmptyArrays.EMPTY_STRINGS;
                                } else {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet(sigAlgs.length);
                                    for (String str2 : sigAlgs) {
                                        String javaName = SignatureAlgorithmConverter.toJavaName(str2);
                                        if (javaName != null) {
                                            linkedHashSet.add(javaName);
                                        }
                                    }
                                    this.peerSupportedSignatureAlgorithms = (String[]) linkedHashSet.toArray(new String[0]);
                                }
                            } else {
                                this.peerSupportedSignatureAlgorithms = EmptyArrays.EMPTY_STRINGS;
                            }
                        }
                        strArr = (String[]) this.peerSupportedSignatureAlgorithms.clone();
                    }
                    return strArr;
                }

                @Override // io.grpc.netty.shaded.io.netty.handler.ssl.ExtendedOpenSslSession
                public List<byte[]> getStatusResponses() {
                    if (ReferenceCountedOpenSslEngine.this.enableOcsp && ReferenceCountedOpenSslEngine.this.clientMode) {
                        synchronized (ReferenceCountedOpenSslEngine.this) {
                            r1 = ReferenceCountedOpenSslEngine.this.isDestroyed() ? null : SSL.getOcspResponse(ReferenceCountedOpenSslEngine.this.ssl);
                        }
                    }
                    return r1 == null ? Collections.emptyList() : Collections.singletonList(r1);
                }
            };
        } else {
            this.session = new DefaultOpenSslSession(referenceCountedOpenSslContext.sessionContext());
        }
        this.engineMap = referenceCountedOpenSslContext.engineMap;
        boolean z4 = referenceCountedOpenSslContext.enableOcsp;
        this.enableOcsp = z4;
        if (!referenceCountedOpenSslContext.sessionContext().useKeyManager()) {
            this.localCertificateChain = referenceCountedOpenSslContext.keyCertChain;
        }
        this.jdkCompatibilityMode = z;
        Lock readLock = referenceCountedOpenSslContext.ctxLock.readLock();
        readLock.lock();
        try {
            long j = referenceCountedOpenSslContext.ctx;
            if (referenceCountedOpenSslContext.isClient()) {
                z3 = false;
            }
            long newSSL = SSL.newSSL(j, z3);
            synchronized (this) {
                this.ssl = newSSL;
                this.networkBIO = SSL.bioNewByteBuffer(newSSL, referenceCountedOpenSslContext.getBioNonApplicationBufferSize());
                setClientAuth(isClient ? ClientAuth.NONE : referenceCountedOpenSslContext.clientAuth);
                if (referenceCountedOpenSslContext.protocols != null) {
                    setEnabledProtocols(referenceCountedOpenSslContext.protocols);
                }
                if (isClient && SslUtils.isValidHostNameForSNI(str)) {
                    SSL.setTlsExtHostName(this.ssl, str);
                    this.sniHostNames = Collections.singletonList(str);
                }
                if (z4) {
                    SSL.enableOcsp(this.ssl);
                }
                if (!z) {
                    long j2 = this.ssl;
                    SSL.setMode(j2, SSL.getMode(j2) | SSL.SSL_MODE_ENABLE_PARTIAL_WRITE | SSL.SSL_MODE_ENABLE_FALSE_START);
                }
                calculateMaxWrapOverhead();
            }
            this.parentContext = referenceCountedOpenSslContext;
            referenceCountedOpenSslContext.retain();
            this.leak = z2 ? leakDetector.track(this) : null;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized String[] authMethods() {
        if (isDestroyed()) {
            return EmptyArrays.EMPTY_STRINGS;
        }
        return SSL.authenticationMethods(this.ssl);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setKeyMaterial(OpenSslKeyMaterial openSslKeyMaterial) throws Exception {
        synchronized (this) {
            if (isDestroyed()) {
                return false;
            }
            SSL.setKeyMaterial(this.ssl, openSslKeyMaterial.certificateChainAddress(), openSslKeyMaterial.privateKeyAddress());
            this.localCertificateChain = openSslKeyMaterial.certificateChain();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized SecretKeySpec masterKey() {
        if (isDestroyed()) {
            return null;
        }
        return new SecretKeySpec(SSL.getMasterKey(this.ssl), CipherStorageKeystoreAesCbc.ALGORITHM_AES);
    }

    public void setOcspResponse(byte[] bArr) {
        if (!this.enableOcsp) {
            throw new IllegalStateException("OCSP stapling is not enabled");
        }
        if (this.clientMode) {
            throw new IllegalStateException("Not a server SSLEngine");
        }
        synchronized (this) {
            if (!isDestroyed()) {
                SSL.setOcspResponse(this.ssl, bArr);
            }
        }
    }

    public byte[] getOcspResponse() {
        if (!this.enableOcsp) {
            throw new IllegalStateException("OCSP stapling is not enabled");
        }
        if (!this.clientMode) {
            throw new IllegalStateException("Not a client SSLEngine");
        }
        synchronized (this) {
            if (isDestroyed()) {
                return EmptyArrays.EMPTY_BYTES;
            }
            return SSL.getOcspResponse(this.ssl);
        }
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

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLSession getHandshakeSession() {
        int i = AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState[this.handshakeState.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        return this.session;
    }

    public final synchronized long sslPointer() {
        return this.ssl;
    }

    public final synchronized void shutdown() {
        if (!this.destroyed) {
            this.destroyed = true;
            this.engineMap.remove(this.ssl);
            SSL.freeSSL(this.ssl);
            this.networkBIO = 0L;
            this.ssl = 0L;
            this.outboundClosed = true;
            this.isInboundDone = true;
        }
        SSL.clearError();
    }

    private int writePlaintextData(ByteBuffer byteBuffer, int i) {
        int writeToSSL;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        if (byteBuffer.isDirect()) {
            writeToSSL = SSL.writeToSSL(this.ssl, bufferAddress(byteBuffer) + position, i);
            if (writeToSSL > 0) {
                byteBuffer.position(position + writeToSSL);
            }
        } else {
            ByteBuf directBuffer = this.alloc.directBuffer(i);
            try {
                byteBuffer.limit(position + i);
                directBuffer.setBytes(0, byteBuffer);
                byteBuffer.limit(limit);
                writeToSSL = SSL.writeToSSL(this.ssl, OpenSsl.memoryAddress(directBuffer), i);
                if (writeToSSL > 0) {
                    byteBuffer.position(position + writeToSSL);
                } else {
                    byteBuffer.position(position);
                }
            } finally {
                directBuffer.release();
            }
        }
        return writeToSSL;
    }

    private ByteBuf writeEncryptedData(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        if (byteBuffer.isDirect()) {
            SSL.bioSetByteBuffer(this.networkBIO, bufferAddress(byteBuffer) + position, i, false);
            return null;
        }
        ByteBuf directBuffer = this.alloc.directBuffer(i);
        try {
            int limit = byteBuffer.limit();
            byteBuffer.limit(position + i);
            directBuffer.writeBytes(byteBuffer);
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            SSL.bioSetByteBuffer(this.networkBIO, OpenSsl.memoryAddress(directBuffer), i, false);
            return directBuffer;
        } catch (Throwable th) {
            directBuffer.release();
            PlatformDependent.throwException(th);
            return null;
        }
    }

    private int readPlaintextData(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        if (byteBuffer.isDirect()) {
            int readFromSSL = SSL.readFromSSL(this.ssl, bufferAddress(byteBuffer) + position, byteBuffer.limit() - position);
            if (readFromSSL > 0) {
                byteBuffer.position(position + readFromSSL);
                return readFromSSL;
            }
            return readFromSSL;
        }
        int limit = byteBuffer.limit();
        int min = Math.min(maxEncryptedPacketLength0(), limit - position);
        ByteBuf directBuffer = this.alloc.directBuffer(min);
        try {
            int readFromSSL2 = SSL.readFromSSL(this.ssl, OpenSsl.memoryAddress(directBuffer), min);
            if (readFromSSL2 > 0) {
                byteBuffer.limit(position + readFromSSL2);
                directBuffer.getBytes(directBuffer.readerIndex(), byteBuffer);
                byteBuffer.limit(limit);
            }
            return readFromSSL2;
        } finally {
            directBuffer.release();
        }
    }

    final synchronized int maxWrapOverhead() {
        return this.maxWrapOverhead;
    }

    final synchronized int maxEncryptedPacketLength() {
        return maxEncryptedPacketLength0();
    }

    final int maxEncryptedPacketLength0() {
        return this.maxWrapOverhead + MAX_PLAINTEXT_LENGTH;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int calculateMaxLengthForWrap(int i, int i2) {
        return (int) Math.min(this.maxWrapBufferSize, i + (this.maxWrapOverhead * i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int sslPending() {
        return sslPending0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateMaxWrapOverhead() {
        this.maxWrapOverhead = SSL.getMaxWrapOverhead(this.ssl);
        this.maxWrapBufferSize = this.jdkCompatibilityMode ? maxEncryptedPacketLength0() : maxEncryptedPacketLength0() << 4;
    }

    private int sslPending0() {
        if (this.handshakeState != HandshakeState.FINISHED) {
            return 0;
        }
        return SSL.sslPending(this.ssl);
    }

    private boolean isBytesAvailableEnoughForWrap(int i, int i2, int i3) {
        return ((long) i) - (((long) this.maxWrapOverhead) * ((long) i3)) >= ((long) i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:295:0x0520 A[Catch: all -> 0x0538, TryCatch #4 {, blocks: (B:11:0x0013, B:13:0x0019, B:15:0x001f, B:18:0x0026, B:20:0x002b, B:19:0x0029, B:33:0x0084, B:35:0x008b, B:37:0x00a2, B:36:0x0094, B:42:0x00b2, B:44:0x00b9, B:46:0x00d0, B:45:0x00c2, B:51:0x00de, B:53:0x00e5, B:55:0x00fc, B:54:0x00ee, B:60:0x010b, B:62:0x0112, B:64:0x0129, B:63:0x011b, B:293:0x0519, B:295:0x0520, B:297:0x0537, B:296:0x052f, B:80:0x0159, B:82:0x0160, B:84:0x0177, B:83:0x0169, B:87:0x0181, B:89:0x0188, B:91:0x019f, B:90:0x0191, B:96:0x01b5, B:98:0x01bc, B:100:0x01d3, B:99:0x01c5, B:110:0x01f5, B:112:0x01fc, B:114:0x0213, B:113:0x0205, B:122:0x0224, B:124:0x022b, B:126:0x0242, B:125:0x0234, B:132:0x0252, B:134:0x0259, B:136:0x0270, B:135:0x0262, B:158:0x02c3, B:160:0x02ca, B:162:0x02e1, B:161:0x02d3, B:167:0x02ef, B:169:0x02f6, B:171:0x030d, B:170:0x02ff, B:204:0x038a, B:206:0x0391, B:208:0x03a8, B:207:0x039a, B:224:0x03e6, B:226:0x03ed, B:228:0x0404, B:227:0x03f6, B:231:0x040c, B:233:0x0413, B:235:0x042a, B:234:0x041c, B:240:0x0436, B:242:0x043d, B:244:0x0454, B:243:0x0446, B:250:0x0462, B:252:0x0469, B:254:0x0480, B:253:0x0472, B:257:0x0488, B:259:0x048f, B:261:0x04a6, B:260:0x0498, B:273:0x04c2, B:275:0x04c9, B:277:0x04e0, B:276:0x04d2, B:185:0x0343, B:187:0x034a, B:189:0x0361, B:188:0x0353, B:280:0x04e6, B:282:0x04ed, B:284:0x0504, B:283:0x04f6), top: B:313:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x052f A[Catch: all -> 0x0538, TryCatch #4 {, blocks: (B:11:0x0013, B:13:0x0019, B:15:0x001f, B:18:0x0026, B:20:0x002b, B:19:0x0029, B:33:0x0084, B:35:0x008b, B:37:0x00a2, B:36:0x0094, B:42:0x00b2, B:44:0x00b9, B:46:0x00d0, B:45:0x00c2, B:51:0x00de, B:53:0x00e5, B:55:0x00fc, B:54:0x00ee, B:60:0x010b, B:62:0x0112, B:64:0x0129, B:63:0x011b, B:293:0x0519, B:295:0x0520, B:297:0x0537, B:296:0x052f, B:80:0x0159, B:82:0x0160, B:84:0x0177, B:83:0x0169, B:87:0x0181, B:89:0x0188, B:91:0x019f, B:90:0x0191, B:96:0x01b5, B:98:0x01bc, B:100:0x01d3, B:99:0x01c5, B:110:0x01f5, B:112:0x01fc, B:114:0x0213, B:113:0x0205, B:122:0x0224, B:124:0x022b, B:126:0x0242, B:125:0x0234, B:132:0x0252, B:134:0x0259, B:136:0x0270, B:135:0x0262, B:158:0x02c3, B:160:0x02ca, B:162:0x02e1, B:161:0x02d3, B:167:0x02ef, B:169:0x02f6, B:171:0x030d, B:170:0x02ff, B:204:0x038a, B:206:0x0391, B:208:0x03a8, B:207:0x039a, B:224:0x03e6, B:226:0x03ed, B:228:0x0404, B:227:0x03f6, B:231:0x040c, B:233:0x0413, B:235:0x042a, B:234:0x041c, B:240:0x0436, B:242:0x043d, B:244:0x0454, B:243:0x0446, B:250:0x0462, B:252:0x0469, B:254:0x0480, B:253:0x0472, B:257:0x0488, B:259:0x048f, B:261:0x04a6, B:260:0x0498, B:273:0x04c2, B:275:0x04c9, B:277:0x04e0, B:276:0x04d2, B:185:0x0343, B:187:0x034a, B:189:0x0361, B:188:0x0353, B:280:0x04e6, B:282:0x04ed, B:284:0x0504, B:283:0x04f6), top: B:313:0x0013 }] */
    @Override // javax.net.ssl.SSLEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) throws SSLException {
        int i3;
        ByteBuf directBuffer;
        SSLEngineResult.HandshakeStatus handshakeStatus;
        int i4;
        int writePlaintextData;
        SSLEngineResult sSLEngineResult;
        if (byteBufferArr == null) {
            throw new IllegalArgumentException("srcs is null");
        }
        if (byteBuffer == null) {
            throw new IllegalArgumentException("dst is null");
        }
        if (i >= byteBufferArr.length || (i3 = i + i2) > byteBufferArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + " (expected: offset <= offset + length <= srcs.length (" + byteBufferArr.length + "))");
        } else if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else {
            synchronized (this) {
                if (isOutboundDone()) {
                    if (!isInboundDone() && !isDestroyed()) {
                        sSLEngineResult = NEED_UNWRAP_CLOSED;
                        return sSLEngineResult;
                    }
                    sSLEngineResult = CLOSED_NOT_HANDSHAKING;
                    return sSLEngineResult;
                }
                ByteBuf byteBuf = null;
                int i5 = 0;
                try {
                    if (byteBuffer.isDirect()) {
                        SSL.bioSetByteBuffer(this.networkBIO, bufferAddress(byteBuffer) + byteBuffer.position(), byteBuffer.remaining(), true);
                        directBuffer = null;
                    } else {
                        directBuffer = this.alloc.directBuffer(byteBuffer.remaining());
                        try {
                            SSL.bioSetByteBuffer(this.networkBIO, OpenSsl.memoryAddress(directBuffer), directBuffer.writableBytes(), true);
                        } catch (Throwable th) {
                            th = th;
                            byteBuf = directBuffer;
                            SSL.bioClearByteBuffer(this.networkBIO);
                            if (byteBuf != null) {
                            }
                            throw th;
                        }
                    }
                    int bioLengthByteBuffer = SSL.bioLengthByteBuffer(this.networkBIO);
                    try {
                        try {
                            if (this.outboundClosed) {
                                if (!isBytesAvailableEnoughForWrap(byteBuffer.remaining(), 2, 1)) {
                                    SSLEngineResult sSLEngineResult2 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, getHandshakeStatus(), 0, 0);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (directBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + 0);
                                    } else {
                                        byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), 0));
                                        directBuffer.release();
                                    }
                                    return sSLEngineResult2;
                                }
                                int bioFlushByteBuffer = SSL.bioFlushByteBuffer(this.networkBIO);
                                if (bioFlushByteBuffer <= 0) {
                                    SSLEngineResult newResultMayFinishHandshake = newResultMayFinishHandshake(SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (directBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + bioFlushByteBuffer);
                                    } else {
                                        byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), bioFlushByteBuffer));
                                        directBuffer.release();
                                    }
                                    return newResultMayFinishHandshake;
                                } else if (!doSSLShutdown()) {
                                    SSLEngineResult newResultMayFinishHandshake2 = newResultMayFinishHandshake(SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, bioFlushByteBuffer);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (directBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + bioFlushByteBuffer);
                                    } else {
                                        byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), bioFlushByteBuffer));
                                        directBuffer.release();
                                    }
                                    return newResultMayFinishHandshake2;
                                } else {
                                    int bioLengthByteBuffer2 = bioLengthByteBuffer - SSL.bioLengthByteBuffer(this.networkBIO);
                                    SSLEngineResult newResultMayFinishHandshake3 = newResultMayFinishHandshake(SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, bioLengthByteBuffer2);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (directBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + bioLengthByteBuffer2);
                                    } else {
                                        byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), bioLengthByteBuffer2));
                                        directBuffer.release();
                                    }
                                    return newResultMayFinishHandshake3;
                                }
                            }
                            SSLEngineResult.HandshakeStatus handshakeStatus2 = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                            if (this.handshakeState != HandshakeState.FINISHED) {
                                if (this.handshakeState != HandshakeState.STARTED_EXPLICITLY) {
                                    this.handshakeState = HandshakeState.STARTED_IMPLICITLY;
                                }
                                int bioFlushByteBuffer2 = SSL.bioFlushByteBuffer(this.networkBIO);
                                try {
                                    if (this.pendingException != null) {
                                        if (bioFlushByteBuffer2 > 0) {
                                            SSLEngineResult newResult = newResult(SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, bioFlushByteBuffer2);
                                            SSL.bioClearByteBuffer(this.networkBIO);
                                            if (directBuffer == null) {
                                                byteBuffer.position(byteBuffer.position() + bioFlushByteBuffer2);
                                            } else {
                                                byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), bioFlushByteBuffer2));
                                                directBuffer.release();
                                            }
                                            return newResult;
                                        }
                                        SSLEngineResult newResult2 = newResult(handshakeException(), 0, 0);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (directBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + bioFlushByteBuffer2);
                                        } else {
                                            byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), bioFlushByteBuffer2));
                                            directBuffer.release();
                                        }
                                        return newResult2;
                                    }
                                    handshakeStatus = handshake();
                                    i4 = bioLengthByteBuffer - SSL.bioLengthByteBuffer(this.networkBIO);
                                    if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_TASK) {
                                        SSLEngineResult newResult3 = newResult(handshakeStatus, 0, i4);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (directBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + i4);
                                        } else {
                                            byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), i4));
                                            directBuffer.release();
                                        }
                                        return newResult3;
                                    } else if (i4 > 0) {
                                        SSLEngineResult newResult4 = newResult(mayFinishHandshake(handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED ? i4 == bioLengthByteBuffer ? SSLEngineResult.HandshakeStatus.NEED_WRAP : getHandshakeStatus(SSL.bioLengthNonApplication(this.networkBIO)) : SSLEngineResult.HandshakeStatus.FINISHED), 0, i4);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (directBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + i4);
                                        } else {
                                            byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), i4));
                                            directBuffer.release();
                                        }
                                        return newResult4;
                                    } else if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                                        SSLEngineResult sSLEngineResult3 = isOutboundDone() ? NEED_UNWRAP_CLOSED : NEED_UNWRAP_OK;
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (directBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + i4);
                                        } else {
                                            byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), i4));
                                            directBuffer.release();
                                        }
                                        return sSLEngineResult3;
                                    } else if (this.outboundClosed) {
                                        int bioFlushByteBuffer3 = SSL.bioFlushByteBuffer(this.networkBIO);
                                        SSLEngineResult newResultMayFinishHandshake4 = newResultMayFinishHandshake(handshakeStatus, 0, bioFlushByteBuffer3);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (directBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + bioFlushByteBuffer3);
                                        } else {
                                            byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), bioFlushByteBuffer3));
                                            directBuffer.release();
                                        }
                                        return newResultMayFinishHandshake4;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    byteBuf = directBuffer;
                                    i5 = bioFlushByteBuffer2;
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (byteBuf != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                handshakeStatus = handshakeStatus2;
                                i4 = 0;
                            }
                            if (this.jdkCompatibilityMode) {
                                int i6 = 0;
                                for (int i7 = i; i7 < i3; i7++) {
                                    ByteBuffer byteBuffer2 = byteBufferArr[i7];
                                    if (byteBuffer2 == null) {
                                        throw new IllegalArgumentException("srcs[" + i7 + "] is null");
                                    }
                                    int i8 = MAX_PLAINTEXT_LENGTH;
                                    if (i6 != i8 && ((i6 = i6 + byteBuffer2.remaining()) > i8 || i6 < 0)) {
                                        i6 = i8;
                                    }
                                }
                                if (!isBytesAvailableEnoughForWrap(byteBuffer.remaining(), i6, 1)) {
                                    SSLEngineResult sSLEngineResult4 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, getHandshakeStatus(), 0, 0);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (directBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + i4);
                                    } else {
                                        byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), i4));
                                        directBuffer.release();
                                    }
                                    return sSLEngineResult4;
                                }
                            }
                            int bioFlushByteBuffer4 = SSL.bioFlushByteBuffer(this.networkBIO);
                            if (bioFlushByteBuffer4 > 0) {
                                SSLEngineResult newResultMayFinishHandshake5 = newResultMayFinishHandshake(handshakeStatus, 0, bioFlushByteBuffer4);
                                SSL.bioClearByteBuffer(this.networkBIO);
                                if (directBuffer == null) {
                                    byteBuffer.position(byteBuffer.position() + bioFlushByteBuffer4);
                                } else {
                                    byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), bioFlushByteBuffer4));
                                    directBuffer.release();
                                }
                                return newResultMayFinishHandshake5;
                            }
                            Throwable th3 = this.pendingException;
                            if (th3 != null) {
                                this.pendingException = null;
                                shutdown();
                                throw new SSLException(th3);
                            }
                            while (i < i3) {
                                ByteBuffer byteBuffer3 = byteBufferArr[i];
                                int remaining = byteBuffer3.remaining();
                                if (remaining != 0) {
                                    if (this.jdkCompatibilityMode) {
                                        writePlaintextData = writePlaintextData(byteBuffer3, Math.min(remaining, MAX_PLAINTEXT_LENGTH - i5));
                                    } else {
                                        int remaining2 = (byteBuffer.remaining() - bioFlushByteBuffer4) - this.maxWrapOverhead;
                                        if (remaining2 <= 0) {
                                            SSLEngineResult sSLEngineResult5 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, getHandshakeStatus(), i5, bioFlushByteBuffer4);
                                            SSL.bioClearByteBuffer(this.networkBIO);
                                            if (directBuffer == null) {
                                                byteBuffer.position(byteBuffer.position() + bioFlushByteBuffer4);
                                            } else {
                                                byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), bioFlushByteBuffer4));
                                                directBuffer.release();
                                            }
                                            return sSLEngineResult5;
                                        }
                                        writePlaintextData = writePlaintextData(byteBuffer3, Math.min(remaining, remaining2));
                                    }
                                    int bioLengthByteBuffer3 = SSL.bioLengthByteBuffer(this.networkBIO);
                                    int i9 = (bioLengthByteBuffer - bioLengthByteBuffer3) + bioFlushByteBuffer4;
                                    if (writePlaintextData > 0) {
                                        i5 += writePlaintextData;
                                        if (!this.jdkCompatibilityMode && i9 != byteBuffer.remaining()) {
                                            bioFlushByteBuffer4 = i9;
                                            bioLengthByteBuffer = bioLengthByteBuffer3;
                                        }
                                        SSLEngineResult newResultMayFinishHandshake6 = newResultMayFinishHandshake(handshakeStatus, i5, i9);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (directBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + i9);
                                        } else {
                                            byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), i9));
                                            directBuffer.release();
                                        }
                                        return newResultMayFinishHandshake6;
                                    }
                                    int error = SSL.getError(this.ssl, writePlaintextData);
                                    if (error == SSL.SSL_ERROR_ZERO_RETURN) {
                                        if (this.receivedShutdown) {
                                            SSLEngineResult newResult5 = newResult(SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, i5, i9);
                                            SSL.bioClearByteBuffer(this.networkBIO);
                                            if (directBuffer == null) {
                                                byteBuffer.position(byteBuffer.position() + i9);
                                            } else {
                                                byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), i9));
                                                directBuffer.release();
                                            }
                                            return newResult5;
                                        }
                                        closeAll();
                                        int bioLengthByteBuffer4 = i9 + (bioLengthByteBuffer3 - SSL.bioLengthByteBuffer(this.networkBIO));
                                        SSLEngineResult newResult6 = newResult(mayFinishHandshake(handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED ? bioLengthByteBuffer4 == byteBuffer.remaining() ? SSLEngineResult.HandshakeStatus.NEED_WRAP : getHandshakeStatus(SSL.bioLengthNonApplication(this.networkBIO)) : SSLEngineResult.HandshakeStatus.FINISHED), i5, bioLengthByteBuffer4);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (directBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + bioLengthByteBuffer4);
                                        } else {
                                            byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), bioLengthByteBuffer4));
                                            directBuffer.release();
                                        }
                                        return newResult6;
                                    } else if (error == SSL.SSL_ERROR_WANT_READ) {
                                        SSLEngineResult newResult7 = newResult(SSLEngineResult.HandshakeStatus.NEED_UNWRAP, i5, i9);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (directBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + i9);
                                        } else {
                                            byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), i9));
                                            directBuffer.release();
                                        }
                                        return newResult7;
                                    } else if (error != SSL.SSL_ERROR_WANT_WRITE) {
                                        if (error != SSL.SSL_ERROR_WANT_X509_LOOKUP && error != SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY && error != SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION) {
                                            throw shutdownWithError("SSL_write", error);
                                        }
                                        SSLEngineResult newResult8 = newResult(SSLEngineResult.HandshakeStatus.NEED_TASK, i5, i9);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (directBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + i9);
                                        } else {
                                            byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), i9));
                                            directBuffer.release();
                                        }
                                        return newResult8;
                                    } else if (i9 > 0) {
                                        SSLEngineResult newResult9 = newResult(SSLEngineResult.HandshakeStatus.NEED_WRAP, i5, i9);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (directBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + i9);
                                        } else {
                                            byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), i9));
                                            directBuffer.release();
                                        }
                                        return newResult9;
                                    } else {
                                        SSLEngineResult newResult10 = newResult(SSLEngineResult.Status.BUFFER_OVERFLOW, handshakeStatus, i5, i9);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (directBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + i9);
                                        } else {
                                            byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), i9));
                                            directBuffer.release();
                                        }
                                        return newResult10;
                                    }
                                }
                                i++;
                            }
                            SSLEngineResult newResultMayFinishHandshake7 = newResultMayFinishHandshake(handshakeStatus, i5, bioFlushByteBuffer4);
                            SSL.bioClearByteBuffer(this.networkBIO);
                            if (directBuffer == null) {
                                byteBuffer.position(byteBuffer.position() + bioFlushByteBuffer4);
                            } else {
                                byteBuffer.put(directBuffer.internalNioBuffer(directBuffer.readerIndex(), bioFlushByteBuffer4));
                                directBuffer.release();
                            }
                            return newResultMayFinishHandshake7;
                        } catch (Throwable th4) {
                            i5 = byteBufferArr;
                            th = th4;
                            byteBuf = directBuffer;
                            SSL.bioClearByteBuffer(this.networkBIO);
                            if (byteBuf != null) {
                                byteBuffer.put(byteBuf.internalNioBuffer(byteBuf.readerIndex(), i5));
                                byteBuf.release();
                            } else {
                                byteBuffer.position(byteBuffer.position() + i5);
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        byteBuf = directBuffer;
                        i5 = bioLengthByteBuffer;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
    }

    private SSLEngineResult newResult(SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i2) {
        return newResult(SSLEngineResult.Status.OK, handshakeStatus, i, i2);
    }

    private SSLEngineResult newResult(SSLEngineResult.Status status, SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i2) {
        if (isOutboundDone()) {
            if (isInboundDone()) {
                handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                shutdown();
            }
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, handshakeStatus, i, i2);
        }
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_TASK) {
            this.needTask = true;
        }
        return new SSLEngineResult(status, handshakeStatus, i, i2);
    }

    private SSLEngineResult newResultMayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i2) throws SSLException {
        return newResult(mayFinishHandshake(handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED ? getHandshakeStatus() : SSLEngineResult.HandshakeStatus.FINISHED), i, i2);
    }

    private SSLEngineResult newResultMayFinishHandshake(SSLEngineResult.Status status, SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i2) throws SSLException {
        return newResult(status, mayFinishHandshake(handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED ? getHandshakeStatus() : SSLEngineResult.HandshakeStatus.FINISHED), i, i2);
    }

    private SSLException shutdownWithError(String str, int i) {
        return shutdownWithError(str, i, SSL.getLastErrorNumber());
    }

    private SSLException shutdownWithError(String str, int i, int i2) {
        String errorString = SSL.getErrorString(i2);
        InternalLogger internalLogger = logger;
        if (internalLogger.isDebugEnabled()) {
            internalLogger.debug("{} failed with {}: OpenSSL error: {} {}", str, Integer.valueOf(i), Integer.valueOf(i2), errorString);
        }
        shutdown();
        if (this.handshakeState == HandshakeState.FINISHED) {
            return new SSLException(errorString);
        }
        SSLHandshakeException sSLHandshakeException = new SSLHandshakeException(errorString);
        Throwable th = this.pendingException;
        if (th != null) {
            sSLHandshakeException.initCause(th);
            this.pendingException = null;
        }
        return sSLHandshakeException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a2, code lost:
        if (r13 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a4, code lost:
        r13.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0213, code lost:
        if (r13 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x029f, code lost:
        io.grpc.netty.shaded.io.netty.internal.tcnative.SSL.bioClearByteBuffer(r18.networkBIO);
        rejectRemoteInitiatedRenegotiation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02a9, code lost:
        if (r18.receivedShutdown != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02b6, code lost:
        if ((io.grpc.netty.shaded.io.netty.internal.tcnative.SSL.getShutdown(r18.ssl) & io.grpc.netty.shaded.io.netty.internal.tcnative.SSL.SSL_RECEIVED_SHUTDOWN) != io.grpc.netty.shaded.io.netty.internal.tcnative.SSL.SSL_RECEIVED_SHUTDOWN) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02b8, code lost:
        closeAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02bf, code lost:
        if (isInboundDone() == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02c1, code lost:
        r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02c4, code lost:
        r0 = javax.net.ssl.SSLEngineResult.Status.OK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02c6, code lost:
        r0 = newResultMayFinishHandshake(r0, r6, r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x02cb, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer[] byteBufferArr2, int i3, int i4) throws SSLException {
        int i5;
        int i6;
        int i7;
        int i8;
        int min;
        int min2;
        ByteBuf writeEncryptedData;
        SSLEngineResult sSLEngineResult;
        ByteBuffer byteBuffer;
        int i9 = i;
        int i10 = i3;
        ObjectUtil.checkNotNull(byteBufferArr, "srcs");
        if (i9 >= byteBufferArr.length || (i5 = i9 + i2) > byteBufferArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i9 + ", length: " + i2 + " (expected: offset <= offset + length <= srcs.length (" + byteBufferArr.length + "))");
        } else if (byteBufferArr2 == null) {
            throw new IllegalArgumentException("dsts is null");
        } else {
            if (i10 >= byteBufferArr2.length || (i6 = i10 + i4) > byteBufferArr2.length) {
                throw new IndexOutOfBoundsException("offset: " + i10 + ", length: " + i4 + " (expected: offset <= offset + length <= dsts.length (" + byteBufferArr2.length + "))");
            }
            long j = 0;
            for (int i11 = i10; i11 < i6; i11++) {
                ByteBuffer byteBuffer2 = byteBufferArr2[i11];
                if (byteBuffer2 == null) {
                    throw new IllegalArgumentException("dsts[" + i11 + "] is null");
                } else if (byteBuffer2.isReadOnly()) {
                    throw new ReadOnlyBufferException();
                } else {
                    j += byteBuffer2.remaining();
                }
            }
            long j2 = 0;
            for (int i12 = i9; i12 < i5; i12++) {
                if (byteBufferArr[i12] == null) {
                    throw new IllegalArgumentException("srcs[" + i12 + "] is null");
                }
                j2 += byteBuffer.remaining();
            }
            synchronized (this) {
                if (isInboundDone()) {
                    if (!isOutboundDone() && !isDestroyed()) {
                        sSLEngineResult = NEED_WRAP_CLOSED;
                        return sSLEngineResult;
                    }
                    sSLEngineResult = CLOSED_NOT_HANDSHAKING;
                    return sSLEngineResult;
                }
                SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                if (this.handshakeState != HandshakeState.FINISHED) {
                    if (this.handshakeState != HandshakeState.STARTED_EXPLICITLY) {
                        this.handshakeState = HandshakeState.STARTED_IMPLICITLY;
                    }
                    handshakeStatus = handshake();
                    if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_TASK) {
                        return newResult(handshakeStatus, 0, 0);
                    }
                    if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                        return NEED_WRAP_OK;
                    }
                    if (this.isInboundDone) {
                        return NEED_WRAP_CLOSED;
                    }
                }
                int sslPending0 = sslPending0();
                if (!this.jdkCompatibilityMode) {
                    i7 = sslPending0;
                    if (j2 == 0 && i7 <= 0) {
                        return newResultMayFinishHandshake(SSLEngineResult.Status.BUFFER_UNDERFLOW, handshakeStatus, 0, 0);
                    }
                    if (j == 0) {
                        return newResultMayFinishHandshake(SSLEngineResult.Status.BUFFER_OVERFLOW, handshakeStatus, 0, 0);
                    }
                    i8 = 0;
                    min = (int) Math.min(2147483647L, j2);
                } else if (j2 < 5) {
                    return newResultMayFinishHandshake(SSLEngineResult.Status.BUFFER_UNDERFLOW, handshakeStatus, 0, 0);
                } else {
                    min = SslUtils.getEncryptedPacketLength(byteBufferArr, i);
                    if (min == -2) {
                        throw new NotSslRecordException("not an SSL/TLS record");
                    }
                    int i13 = min - 5;
                    i7 = sslPending0;
                    if (i13 > j) {
                        if (i13 <= MAX_RECORD_SIZE) {
                            this.session.tryExpandApplicationBufferSize(i13);
                            return newResultMayFinishHandshake(SSLEngineResult.Status.BUFFER_OVERFLOW, handshakeStatus, 0, 0);
                        }
                        throw new SSLException("Illegal packet length: " + i13 + " > " + this.session.getApplicationBufferSize());
                    } else if (j2 < min) {
                        return newResultMayFinishHandshake(SSLEngineResult.Status.BUFFER_UNDERFLOW, handshakeStatus, 0, 0);
                    } else {
                        i8 = 0;
                    }
                }
                int i14 = i7;
                int i15 = i8;
                loop2: while (true) {
                    ByteBuffer byteBuffer3 = byteBufferArr[i9];
                    int remaining = byteBuffer3.remaining();
                    if (remaining != 0) {
                        min2 = Math.min(min, remaining);
                        writeEncryptedData = writeEncryptedData(byteBuffer3, min2);
                    } else if (i14 <= 0) {
                        i9++;
                        if (i9 >= i5) {
                            break;
                        }
                    } else {
                        min2 = SSL.bioLengthByteBuffer(this.networkBIO);
                        writeEncryptedData = null;
                    }
                    while (true) {
                        try {
                            ByteBuffer byteBuffer4 = byteBufferArr2[i10];
                            if (byteBuffer4.hasRemaining()) {
                                int i16 = i14;
                                int readPlaintextData = readPlaintextData(byteBuffer4);
                                SSLEngineResult.HandshakeStatus handshakeStatus2 = handshakeStatus;
                                int i17 = i5;
                                int bioLengthByteBuffer = min2 - SSL.bioLengthByteBuffer(this.networkBIO);
                                i15 += bioLengthByteBuffer;
                                min -= bioLengthByteBuffer;
                                min2 -= bioLengthByteBuffer;
                                byteBuffer3.position(byteBuffer3.position() + bioLengthByteBuffer);
                                if (readPlaintextData > 0) {
                                    i8 += readPlaintextData;
                                    if (byteBuffer4.hasRemaining()) {
                                        handshakeStatus = handshakeStatus2;
                                        if (min == 0 || this.jdkCompatibilityMode) {
                                            break loop2;
                                        }
                                        i14 = i16;
                                    } else {
                                        i14 = sslPending0();
                                        i10++;
                                        if (i10 >= i6) {
                                            SSLEngineResult newResult = i14 > 0 ? newResult(SSLEngineResult.Status.BUFFER_OVERFLOW, handshakeStatus2, i15, i8) : newResultMayFinishHandshake(isInboundDone() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK, handshakeStatus2, i15, i8);
                                            SSL.bioClearByteBuffer(this.networkBIO);
                                            rejectRemoteInitiatedRenegotiation();
                                            return newResult;
                                        }
                                        handshakeStatus = handshakeStatus2;
                                    }
                                    i5 = i17;
                                } else {
                                    handshakeStatus = handshakeStatus2;
                                    int error = SSL.getError(this.ssl, readPlaintextData);
                                    if (error != SSL.SSL_ERROR_WANT_READ && error != SSL.SSL_ERROR_WANT_WRITE) {
                                        if (error == SSL.SSL_ERROR_ZERO_RETURN) {
                                            if (!this.receivedShutdown) {
                                                closeAll();
                                            }
                                            SSLEngineResult newResultMayFinishHandshake = newResultMayFinishHandshake(isInboundDone() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK, handshakeStatus, i15, i8);
                                            if (writeEncryptedData != null) {
                                                writeEncryptedData.release();
                                            }
                                            SSL.bioClearByteBuffer(this.networkBIO);
                                            rejectRemoteInitiatedRenegotiation();
                                            return newResultMayFinishHandshake;
                                        }
                                        if (error != SSL.SSL_ERROR_WANT_X509_LOOKUP && error != SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY && error != SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION) {
                                            SSLEngineResult sslReadErrorResult = sslReadErrorResult(error, SSL.getLastErrorNumber(), i15, i8);
                                            if (writeEncryptedData != null) {
                                                writeEncryptedData.release();
                                            }
                                            SSL.bioClearByteBuffer(this.networkBIO);
                                            rejectRemoteInitiatedRenegotiation();
                                            return sslReadErrorResult;
                                        }
                                        SSLEngineResult newResult2 = newResult(isInboundDone() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_TASK, i15, i8);
                                        if (writeEncryptedData != null) {
                                            writeEncryptedData.release();
                                        }
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        rejectRemoteInitiatedRenegotiation();
                                        return newResult2;
                                    }
                                    i9++;
                                    i5 = i17;
                                    if (i9 < i5) {
                                        if (writeEncryptedData != null) {
                                            writeEncryptedData.release();
                                        }
                                        i14 = i16;
                                    } else if (writeEncryptedData != null) {
                                    }
                                }
                            } else {
                                i10++;
                                if (i10 >= i6) {
                                }
                            }
                        } finally {
                            if (writeEncryptedData != null) {
                                writeEncryptedData.release();
                            }
                        }
                    }
                }
            }
        }
    }

    private SSLEngineResult sslReadErrorResult(int i, int i2, int i3, int i4) throws SSLException {
        if (SSL.bioLengthNonApplication(this.networkBIO) > 0) {
            String errorString = SSL.getErrorString(i2);
            Throwable sSLException = this.handshakeState == HandshakeState.FINISHED ? new SSLException(errorString) : new SSLHandshakeException(errorString);
            Throwable th = this.pendingException;
            if (th == null) {
                this.pendingException = sSLException;
            } else {
                ThrowableUtil.addSuppressed(th, sSLException);
            }
            SSL.clearError();
            return new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, i3, i4);
        }
        throw shutdownWithError("SSL_read", i, i2);
    }

    private void closeAll() throws SSLException {
        this.receivedShutdown = true;
        closeOutbound();
        closeInbound();
    }

    private void rejectRemoteInitiatedRenegotiation() throws SSLHandshakeException {
        if (isDestroyed() || SSL.getHandshakeCount(this.ssl) <= 1 || "TLSv1.3".equals(this.session.getProtocol()) || this.handshakeState != HandshakeState.FINISHED) {
            return;
        }
        shutdown();
        throw new SSLHandshakeException("remote-initiated renegotiation not allowed");
    }

    public final SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) throws SSLException {
        return unwrap(byteBufferArr, 0, byteBufferArr.length, byteBufferArr2, 0, byteBufferArr2.length);
    }

    private ByteBuffer[] singleSrcBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleSrcBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private void resetSingleSrcBuffer() {
        this.singleSrcBuffer[0] = null;
    }

    private ByteBuffer[] singleDstBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleDstBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private void resetSingleDstBuffer() {
        this.singleDstBuffer[0] = null;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) throws SSLException {
        SSLEngineResult unwrap;
        unwrap = unwrap(singleSrcBuffer(byteBuffer), 0, 1, byteBufferArr, i, i2);
        resetSingleSrcBuffer();
        return unwrap;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException {
        SSLEngineResult wrap;
        wrap = wrap(singleSrcBuffer(byteBuffer), byteBuffer2);
        resetSingleSrcBuffer();
        return wrap;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException {
        SSLEngineResult unwrap;
        unwrap = unwrap(singleSrcBuffer(byteBuffer), singleDstBuffer(byteBuffer2));
        resetSingleSrcBuffer();
        resetSingleDstBuffer();
        return unwrap;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) throws SSLException {
        SSLEngineResult unwrap;
        unwrap = unwrap(singleSrcBuffer(byteBuffer), byteBufferArr);
        resetSingleSrcBuffer();
        return unwrap;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized Runnable getDelegatedTask() {
        if (isDestroyed()) {
            return null;
        }
        final Runnable task = SSL.getTask(this.ssl);
        if (task == null) {
            return null;
        }
        return new Runnable() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine.3
            @Override // java.lang.Runnable
            public void run() {
                if (ReferenceCountedOpenSslEngine.this.isDestroyed()) {
                    return;
                }
                try {
                    task.run();
                } finally {
                    ReferenceCountedOpenSslEngine.this.needTask = false;
                }
            }
        };
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void closeInbound() throws SSLException {
        if (this.isInboundDone) {
            return;
        }
        this.isInboundDone = true;
        if (isOutboundDone()) {
            shutdown();
        }
        if (this.handshakeState != HandshakeState.NOT_STARTED && !this.receivedShutdown) {
            throw new SSLException("Inbound closed before receiving peer's close_notify: possible truncation attack?");
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized boolean isInboundDone() {
        return this.isInboundDone;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void closeOutbound() {
        if (this.outboundClosed) {
            return;
        }
        this.outboundClosed = true;
        if (this.handshakeState != HandshakeState.NOT_STARTED && !isDestroyed()) {
            if ((SSL.getShutdown(this.ssl) & SSL.SSL_SENT_SHUTDOWN) != SSL.SSL_SENT_SHUTDOWN) {
                doSSLShutdown();
            }
        } else {
            shutdown();
        }
    }

    private boolean doSSLShutdown() {
        if (SSL.isInInit(this.ssl) != 0) {
            return false;
        }
        int shutdownSSL = SSL.shutdownSSL(this.ssl);
        if (shutdownSSL < 0) {
            int error = SSL.getError(this.ssl, shutdownSSL);
            if (error == SSL.SSL_ERROR_SYSCALL || error == SSL.SSL_ERROR_SSL) {
                InternalLogger internalLogger = logger;
                if (internalLogger.isDebugEnabled()) {
                    int lastErrorNumber = SSL.getLastErrorNumber();
                    internalLogger.debug("SSL_shutdown failed: OpenSSL error: {} {}", Integer.valueOf(lastErrorNumber), SSL.getErrorString(lastErrorNumber));
                }
                shutdown();
                return false;
            }
            SSL.clearError();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (io.grpc.netty.shaded.io.netty.internal.tcnative.SSL.bioLengthNonApplication(r0) == 0) goto L10;
     */
    @Override // javax.net.ssl.SSLEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean isOutboundDone() {
        boolean z;
        if (this.outboundClosed) {
            long j = this.networkBIO;
            if (j != 0) {
            }
            z = true;
        }
        z = false;
        return z;
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getSupportedCipherSuites() {
        return (String[]) OpenSsl.AVAILABLE_CIPHER_SUITES.toArray(new String[0]);
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getEnabledCipherSuites() {
        String[] strArr;
        synchronized (this) {
            if (!isDestroyed()) {
                String[] ciphers = SSL.getCiphers(this.ssl);
                if (isProtocolEnabled(SSL.getOptions(this.ssl), SSL.SSL_OP_NO_TLSv1_3, "TLSv1.3")) {
                    strArr = OpenSsl.EXTRA_SUPPORTED_TLS_1_3_CIPHERS;
                } else {
                    strArr = EmptyArrays.EMPTY_STRINGS;
                }
                if (ciphers == null) {
                    return EmptyArrays.EMPTY_STRINGS;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(ciphers.length + strArr.length);
                synchronized (this) {
                    for (int i = 0; i < ciphers.length; i++) {
                        String javaCipherSuite = toJavaCipherSuite(ciphers[i]);
                        if (javaCipherSuite == null) {
                            javaCipherSuite = ciphers[i];
                        }
                        if (OpenSsl.isTlsv13Supported() || !SslUtils.isTLSv13Cipher(javaCipherSuite)) {
                            linkedHashSet.add(javaCipherSuite);
                        }
                    }
                    Collections.addAll(linkedHashSet, strArr);
                }
                return (String[]) linkedHashSet.toArray(new String[0]);
            }
            return EmptyArrays.EMPTY_STRINGS;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnabledCipherSuites(String[] strArr) {
        ObjectUtil.checkNotNull(strArr, "cipherSuites");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        CipherSuiteConverter.convertToCipherStrings(Arrays.asList(strArr), sb, sb2, OpenSsl.isBoringSSL());
        String sb3 = sb.toString();
        String sb4 = sb2.toString();
        if (!OpenSsl.isTlsv13Supported() && !sb4.isEmpty()) {
            throw new IllegalArgumentException("TLSv1.3 is not supported by this java version.");
        }
        synchronized (this) {
            if (!isDestroyed()) {
                try {
                    SSL.setCipherSuites(this.ssl, sb3, false);
                    if (OpenSsl.isTlsv13Supported()) {
                        SSL.setCipherSuites(this.ssl, sb4, true);
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("failed to enable cipher suites: " + sb3, e);
                }
            } else {
                throw new IllegalStateException("failed to enable cipher suites: " + sb3);
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getSupportedProtocols() {
        return (String[]) OpenSsl.SUPPORTED_PROTOCOLS_SET.toArray(new String[0]);
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getEnabledProtocols() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add("SSLv2Hello");
        synchronized (this) {
            if (!isDestroyed()) {
                int options = SSL.getOptions(this.ssl);
                if (isProtocolEnabled(options, SSL.SSL_OP_NO_TLSv1, "TLSv1")) {
                    arrayList.add("TLSv1");
                }
                if (isProtocolEnabled(options, SSL.SSL_OP_NO_TLSv1_1, "TLSv1.1")) {
                    arrayList.add("TLSv1.1");
                }
                if (isProtocolEnabled(options, SSL.SSL_OP_NO_TLSv1_2, "TLSv1.2")) {
                    arrayList.add("TLSv1.2");
                }
                if (isProtocolEnabled(options, SSL.SSL_OP_NO_TLSv1_3, "TLSv1.3")) {
                    arrayList.add("TLSv1.3");
                }
                if (isProtocolEnabled(options, SSL.SSL_OP_NO_SSLv2, "SSLv2")) {
                    arrayList.add("SSLv2");
                }
                if (isProtocolEnabled(options, SSL.SSL_OP_NO_SSLv3, "SSLv3")) {
                    arrayList.add("SSLv3");
                }
                return (String[]) arrayList.toArray(new String[0]);
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
    }

    private static boolean isProtocolEnabled(int i, int i2, String str) {
        return (i & i2) == 0 && OpenSsl.SUPPORTED_PROTOCOLS_SET.contains(str);
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnabledProtocols(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException();
        }
        int length = OPENSSL_OP_NO_PROTOCOLS.length;
        int length2 = strArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i < length2) {
                String str = strArr[i];
                if (!OpenSsl.SUPPORTED_PROTOCOLS_SET.contains(str)) {
                    throw new IllegalArgumentException("Protocol " + str + " is not supported.");
                }
                if (str.equals("SSLv2")) {
                    if (length > 0) {
                        length = 0;
                    }
                    if (i2 < 0) {
                        i2 = 0;
                    }
                } else if (str.equals("SSLv3")) {
                    if (length > 1) {
                        length = 1;
                    }
                    if (i2 >= 1) {
                    }
                    i2 = i3;
                } else if (str.equals("TLSv1")) {
                    i3 = 2;
                    if (length > 2) {
                        length = 2;
                    }
                    if (i2 >= 2) {
                    }
                    i2 = i3;
                } else if (str.equals("TLSv1.1")) {
                    i3 = 3;
                    if (length > 3) {
                        length = 3;
                    }
                    if (i2 >= 3) {
                    }
                    i2 = i3;
                } else if (str.equals("TLSv1.2")) {
                    i3 = 4;
                    if (length > 4) {
                        length = 4;
                    }
                    if (i2 >= 4) {
                    }
                    i2 = i3;
                } else if (str.equals("TLSv1.3")) {
                    i3 = 5;
                    if (length > 5) {
                        length = 5;
                    }
                    if (i2 >= 5) {
                    }
                    i2 = i3;
                }
                i++;
            } else {
                synchronized (this) {
                    if (!isDestroyed()) {
                        SSL.clearOptions(this.ssl, SSL.SSL_OP_NO_SSLv2 | SSL.SSL_OP_NO_SSLv3 | SSL.SSL_OP_NO_TLSv1 | SSL.SSL_OP_NO_TLSv1_1 | SSL.SSL_OP_NO_TLSv1_2 | SSL.SSL_OP_NO_TLSv1_3);
                        int i4 = 0;
                        for (int i5 = 0; i5 < length; i5++) {
                            i4 |= OPENSSL_OP_NO_PROTOCOLS[i5];
                        }
                        int i6 = i2 + 1;
                        while (true) {
                            int[] iArr = OPENSSL_OP_NO_PROTOCOLS;
                            if (i6 < iArr.length) {
                                i4 |= iArr[i6];
                                i6++;
                            } else {
                                SSL.setOptions(this.ssl, i4);
                            }
                        }
                    } else {
                        throw new IllegalStateException("failed to enable protocols: " + Arrays.asList(strArr));
                    }
                }
                return;
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final SSLSession getSession() {
        return this.session;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void beginHandshake() throws SSLException {
        int i = AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState[this.handshakeState.ordinal()];
        if (i == 1) {
            this.handshakeState = HandshakeState.STARTED_EXPLICITLY;
            if (handshake() == SSLEngineResult.HandshakeStatus.NEED_TASK) {
                this.needTask = true;
            }
            calculateMaxWrapOverhead();
        } else if (i == 2) {
            throw new SSLException("renegotiation unsupported");
        } else {
            if (i == 3) {
                checkEngineClosed();
                this.handshakeState = HandshakeState.STARTED_EXPLICITLY;
                calculateMaxWrapOverhead();
            } else if (i != 4) {
                throw new Error();
            }
        }
    }

    private void checkEngineClosed() throws SSLException {
        if (isDestroyed()) {
            throw new SSLException("engine closed");
        }
    }

    private static SSLEngineResult.HandshakeStatus pendingStatus(int i) {
        return i > 0 ? SSLEngineResult.HandshakeStatus.NEED_WRAP : SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    private SSLEngineResult.HandshakeStatus handshakeException() throws SSLException {
        if (SSL.bioLengthNonApplication(this.networkBIO) > 0) {
            return SSLEngineResult.HandshakeStatus.NEED_WRAP;
        }
        Throwable th = this.pendingException;
        this.pendingException = null;
        shutdown();
        if (th instanceof SSLHandshakeException) {
            throw ((SSLHandshakeException) th);
        }
        SSLHandshakeException sSLHandshakeException = new SSLHandshakeException("General OpenSslEngine problem");
        sSLHandshakeException.initCause(th);
        throw sSLHandshakeException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void initHandshakeException(Throwable th) {
        Throwable th2 = this.pendingException;
        if (th2 == null) {
            this.pendingException = th;
        } else {
            ThrowableUtil.addSuppressed(th2, th);
        }
    }

    private SSLEngineResult.HandshakeStatus handshake() throws SSLException {
        if (this.needTask) {
            return SSLEngineResult.HandshakeStatus.NEED_TASK;
        }
        if (this.handshakeState == HandshakeState.FINISHED) {
            return SSLEngineResult.HandshakeStatus.FINISHED;
        }
        checkEngineClosed();
        if (this.pendingException != null) {
            if (SSL.doHandshake(this.ssl) <= 0) {
                SSL.clearError();
            }
            return handshakeException();
        }
        this.engineMap.add(this);
        if (this.lastAccessed == -1) {
            this.lastAccessed = System.currentTimeMillis();
        }
        int doHandshake = SSL.doHandshake(this.ssl);
        if (doHandshake <= 0) {
            int error = SSL.getError(this.ssl, doHandshake);
            if (error == SSL.SSL_ERROR_WANT_READ || error == SSL.SSL_ERROR_WANT_WRITE) {
                return pendingStatus(SSL.bioLengthNonApplication(this.networkBIO));
            }
            if (error == SSL.SSL_ERROR_WANT_X509_LOOKUP || error == SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY || error == SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION) {
                return SSLEngineResult.HandshakeStatus.NEED_TASK;
            }
            if (this.pendingException != null) {
                return handshakeException();
            }
            throw shutdownWithError("SSL_do_handshake", error);
        } else if (SSL.bioLengthNonApplication(this.networkBIO) > 0) {
            return SSLEngineResult.HandshakeStatus.NEED_WRAP;
        } else {
            this.session.handshakeFinished();
            return SSLEngineResult.HandshakeStatus.FINISHED;
        }
    }

    private SSLEngineResult.HandshakeStatus mayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus) throws SSLException {
        return (handshakeStatus != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING || this.handshakeState == HandshakeState.FINISHED) ? handshakeStatus : handshake();
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        if (needPendingStatus()) {
            if (this.needTask) {
                return SSLEngineResult.HandshakeStatus.NEED_TASK;
            }
            return pendingStatus(SSL.bioLengthNonApplication(this.networkBIO));
        }
        return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatus(int i) {
        if (needPendingStatus()) {
            if (this.needTask) {
                return SSLEngineResult.HandshakeStatus.NEED_TASK;
            }
            return pendingStatus(i);
        }
        return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    private boolean needPendingStatus() {
        return (this.handshakeState == HandshakeState.NOT_STARTED || isDestroyed() || (this.handshakeState == HandshakeState.FINISHED && !isInboundDone() && !isOutboundDone())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String toJavaCipherSuite(String str) {
        if (str == null) {
            return null;
        }
        return CipherSuiteConverter.toJava(str, toJavaCipherSuitePrefix(SSL.getVersion(this.ssl)));
    }

    private static String toJavaCipherSuitePrefix(String str) {
        char c = 0;
        if (str != null && !str.isEmpty()) {
            c = str.charAt(0);
        }
        return c != 'S' ? c != 'T' ? "UNKNOWN" : "TLS" : "SSL";
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setUseClientMode(boolean z) {
        if (z != this.clientMode) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getUseClientMode() {
        return this.clientMode;
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setNeedClientAuth(boolean z) {
        setClientAuth(z ? ClientAuth.REQUIRE : ClientAuth.NONE);
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getNeedClientAuth() {
        return this.clientAuth == ClientAuth.REQUIRE;
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setWantClientAuth(boolean z) {
        setClientAuth(z ? ClientAuth.OPTIONAL : ClientAuth.NONE);
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getWantClientAuth() {
        return this.clientAuth == ClientAuth.OPTIONAL;
    }

    public final synchronized void setVerify(int i, int i2) {
        if (!isDestroyed()) {
            SSL.setVerify(this.ssl, i, i2);
        }
    }

    private void setClientAuth(ClientAuth clientAuth) {
        if (this.clientMode) {
            return;
        }
        synchronized (this) {
            if (this.clientAuth == clientAuth) {
                return;
            }
            if (!isDestroyed()) {
                int i = AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ClientAuth[clientAuth.ordinal()];
                if (i == 1) {
                    SSL.setVerify(this.ssl, 0, 10);
                } else if (i == 2) {
                    SSL.setVerify(this.ssl, 2, 10);
                } else if (i == 3) {
                    SSL.setVerify(this.ssl, 1, 10);
                } else {
                    throw new Error(clientAuth.toString());
                }
            }
            this.clientAuth = clientAuth;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnableSessionCreation(boolean z) {
        if (z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLParameters getSSLParameters() {
        SSLParameters sSLParameters;
        sSLParameters = super.getSSLParameters();
        int javaVersion = PlatformDependent.javaVersion();
        if (javaVersion >= 7) {
            sSLParameters.setEndpointIdentificationAlgorithm(this.endPointIdentificationAlgorithm);
            Java7SslParametersUtils.setAlgorithmConstraints(sSLParameters, this.algorithmConstraints);
            if (javaVersion >= 8) {
                List<String> list = this.sniHostNames;
                if (list != null) {
                    Java8SslUtils.setSniHostNames(sSLParameters, list);
                }
                if (!isDestroyed()) {
                    Java8SslUtils.setUseCipherSuitesOrder(sSLParameters, (SSL.getOptions(this.ssl) & SSL.SSL_OP_CIPHER_SERVER_PREFERENCE) != 0);
                }
                Java8SslUtils.setSNIMatchers(sSLParameters, this.matchers);
            }
        }
        return sSLParameters;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void setSSLParameters(SSLParameters sSLParameters) {
        AlgorithmConstraints algorithmConstraints;
        String endpointIdentificationAlgorithm;
        AlgorithmConstraints algorithmConstraints2;
        Collection<?> sNIMatchers;
        int javaVersion = PlatformDependent.javaVersion();
        if (javaVersion >= 7) {
            algorithmConstraints = sSLParameters.getAlgorithmConstraints();
            if (algorithmConstraints != null) {
                throw new IllegalArgumentException("AlgorithmConstraints are not supported.");
            }
            boolean isDestroyed = isDestroyed();
            if (javaVersion >= 8) {
                if (!isDestroyed) {
                    if (this.clientMode) {
                        List<String> sniHostNames = Java8SslUtils.getSniHostNames(sSLParameters);
                        for (String str : sniHostNames) {
                            SSL.setTlsExtHostName(this.ssl, str);
                        }
                        this.sniHostNames = sniHostNames;
                    }
                    if (Java8SslUtils.getUseCipherSuitesOrder(sSLParameters)) {
                        SSL.setOptions(this.ssl, SSL.SSL_OP_CIPHER_SERVER_PREFERENCE);
                    } else {
                        SSL.clearOptions(this.ssl, SSL.SSL_OP_CIPHER_SERVER_PREFERENCE);
                    }
                }
                sNIMatchers = sSLParameters.getSNIMatchers();
                this.matchers = sNIMatchers;
            }
            endpointIdentificationAlgorithm = sSLParameters.getEndpointIdentificationAlgorithm();
            if (!isDestroyed && this.clientMode && isEndPointVerificationEnabled(endpointIdentificationAlgorithm)) {
                SSL.setVerify(this.ssl, 2, -1);
            }
            this.endPointIdentificationAlgorithm = endpointIdentificationAlgorithm;
            algorithmConstraints2 = sSLParameters.getAlgorithmConstraints();
            this.algorithmConstraints = algorithmConstraints2;
        }
        super.setSSLParameters(sSLParameters);
    }

    private static boolean isEndPointVerificationEnabled(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroyed() {
        return this.destroyed;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean checkSniHostnameMatch(byte[] bArr) {
        return Java8SslUtils.checkSniHostnameMatch(this.matchers, bArr);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.ApplicationProtocolAccessor
    public String getNegotiatedApplicationProtocol() {
        return this.applicationProtocol;
    }

    private static long bufferAddress(ByteBuffer byteBuffer) {
        if (PlatformDependent.hasUnsafe()) {
            return PlatformDependent.directBufferAddress(byteBuffer);
        }
        return Buffer.address(byteBuffer);
    }

    /* loaded from: classes4.dex */
    private final class DefaultOpenSslSession implements OpenSslSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private volatile int applicationBufferSize = ReferenceCountedOpenSslEngine.MAX_PLAINTEXT_LENGTH;
        private String cipher;
        private long creationTime;
        private byte[] id;
        private Certificate[] peerCerts;
        private String protocol;
        private final OpenSslSessionContext sessionContext;
        private Map<String, Object> values;
        private X509Certificate[] x509PeerCerts;

        DefaultOpenSslSession(OpenSslSessionContext openSslSessionContext) {
            this.sessionContext = openSslSessionContext;
        }

        private SSLSessionBindingEvent newSSLSessionBindingEvent(String str) {
            return new SSLSessionBindingEvent(ReferenceCountedOpenSslEngine.this.session, str);
        }

        @Override // javax.net.ssl.SSLSession
        public byte[] getId() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                byte[] bArr = this.id;
                if (bArr == null) {
                    return EmptyArrays.EMPTY_BYTES;
                }
                return (byte[]) bArr.clone();
            }
        }

        @Override // javax.net.ssl.SSLSession
        public SSLSessionContext getSessionContext() {
            return this.sessionContext;
        }

        @Override // javax.net.ssl.SSLSession
        public long getCreationTime() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (this.creationTime == 0 && !ReferenceCountedOpenSslEngine.this.isDestroyed()) {
                    this.creationTime = SSL.getTime(ReferenceCountedOpenSslEngine.this.ssl) * 1000;
                }
            }
            return this.creationTime;
        }

        @Override // javax.net.ssl.SSLSession
        public long getLastAccessedTime() {
            long j = ReferenceCountedOpenSslEngine.this.lastAccessed;
            return j == -1 ? getCreationTime() : j;
        }

        @Override // javax.net.ssl.SSLSession
        public void invalidate() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (!ReferenceCountedOpenSslEngine.this.isDestroyed()) {
                    SSL.setTimeout(ReferenceCountedOpenSslEngine.this.ssl, 0L);
                }
            }
        }

        @Override // javax.net.ssl.SSLSession
        public boolean isValid() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (ReferenceCountedOpenSslEngine.this.isDestroyed()) {
                    return false;
                }
                return System.currentTimeMillis() - (SSL.getTimeout(ReferenceCountedOpenSslEngine.this.ssl) * 1000) < SSL.getTime(ReferenceCountedOpenSslEngine.this.ssl) * 1000;
            }
        }

        @Override // javax.net.ssl.SSLSession
        public void putValue(String str, Object obj) {
            Object put;
            ObjectUtil.checkNotNull(str, "name");
            ObjectUtil.checkNotNull(obj, "value");
            synchronized (this) {
                Map map = this.values;
                if (map == null) {
                    map = new HashMap(2);
                    this.values = map;
                }
                put = map.put(str, obj);
            }
            if (obj instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) obj).valueBound(newSSLSessionBindingEvent(str));
            }
            notifyUnbound(put, str);
        }

        @Override // javax.net.ssl.SSLSession
        public Object getValue(String str) {
            ObjectUtil.checkNotNull(str, "name");
            synchronized (this) {
                Map<String, Object> map = this.values;
                if (map == null) {
                    return null;
                }
                return map.get(str);
            }
        }

        @Override // javax.net.ssl.SSLSession
        public void removeValue(String str) {
            ObjectUtil.checkNotNull(str, "name");
            synchronized (this) {
                Map<String, Object> map = this.values;
                if (map == null) {
                    return;
                }
                notifyUnbound(map.remove(str), str);
            }
        }

        @Override // javax.net.ssl.SSLSession
        public String[] getValueNames() {
            synchronized (this) {
                Map<String, Object> map = this.values;
                if (map != null && !map.isEmpty()) {
                    return (String[]) map.keySet().toArray(new String[0]);
                }
                return EmptyArrays.EMPTY_STRINGS;
            }
        }

        private void notifyUnbound(Object obj, String str) {
            if (obj instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) obj).valueUnbound(newSSLSessionBindingEvent(str));
            }
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.ssl.OpenSslSession
        public void handshakeFinished() throws SSLException {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (!ReferenceCountedOpenSslEngine.this.isDestroyed()) {
                    this.id = SSL.getSessionId(ReferenceCountedOpenSslEngine.this.ssl);
                    ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine = ReferenceCountedOpenSslEngine.this;
                    this.cipher = referenceCountedOpenSslEngine.toJavaCipherSuite(SSL.getCipherForSSL(referenceCountedOpenSslEngine.ssl));
                    this.protocol = SSL.getVersion(ReferenceCountedOpenSslEngine.this.ssl);
                    initPeerCerts();
                    selectApplicationProtocol();
                    ReferenceCountedOpenSslEngine.this.calculateMaxWrapOverhead();
                    ReferenceCountedOpenSslEngine.this.handshakeState = HandshakeState.FINISHED;
                } else {
                    throw new SSLException("Already closed");
                }
            }
        }

        private void initPeerCerts() {
            byte[][] peerCertChain = SSL.getPeerCertChain(ReferenceCountedOpenSslEngine.this.ssl);
            if (ReferenceCountedOpenSslEngine.this.clientMode) {
                if (ReferenceCountedOpenSslEngine.isEmpty(peerCertChain)) {
                    this.peerCerts = EmptyArrays.EMPTY_CERTIFICATES;
                    this.x509PeerCerts = EmptyArrays.EMPTY_JAVAX_X509_CERTIFICATES;
                    return;
                }
                this.peerCerts = new Certificate[peerCertChain.length];
                this.x509PeerCerts = new X509Certificate[peerCertChain.length];
                initCerts(peerCertChain, 0);
                return;
            }
            byte[] peerCertificate = SSL.getPeerCertificate(ReferenceCountedOpenSslEngine.this.ssl);
            if (!ReferenceCountedOpenSslEngine.isEmpty(peerCertificate)) {
                if (ReferenceCountedOpenSslEngine.isEmpty(peerCertChain)) {
                    this.peerCerts = new Certificate[]{new OpenSslX509Certificate(peerCertificate)};
                    this.x509PeerCerts = new X509Certificate[]{new OpenSslJavaxX509Certificate(peerCertificate)};
                    return;
                }
                Certificate[] certificateArr = new Certificate[peerCertChain.length + 1];
                this.peerCerts = certificateArr;
                this.x509PeerCerts = new X509Certificate[peerCertChain.length + 1];
                certificateArr[0] = new OpenSslX509Certificate(peerCertificate);
                this.x509PeerCerts[0] = new OpenSslJavaxX509Certificate(peerCertificate);
                initCerts(peerCertChain, 1);
                return;
            }
            this.peerCerts = EmptyArrays.EMPTY_CERTIFICATES;
            this.x509PeerCerts = EmptyArrays.EMPTY_JAVAX_X509_CERTIFICATES;
        }

        private void initCerts(byte[][] bArr, int i) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                int i3 = i + i2;
                this.peerCerts[i3] = new OpenSslX509Certificate(bArr[i2]);
                this.x509PeerCerts[i3] = new OpenSslJavaxX509Certificate(bArr[i2]);
            }
        }

        private void selectApplicationProtocol() throws SSLException {
            ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedListenerFailureBehavior = ReferenceCountedOpenSslEngine.this.apn.selectedListenerFailureBehavior();
            List<String> protocols = ReferenceCountedOpenSslEngine.this.apn.protocols();
            int i = AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[ReferenceCountedOpenSslEngine.this.apn.protocol().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    String alpnSelected = SSL.getAlpnSelected(ReferenceCountedOpenSslEngine.this.ssl);
                    if (alpnSelected != null) {
                        ReferenceCountedOpenSslEngine.this.applicationProtocol = selectApplicationProtocol(protocols, selectedListenerFailureBehavior, alpnSelected);
                    }
                } else if (i == 3) {
                    String nextProtoNegotiated = SSL.getNextProtoNegotiated(ReferenceCountedOpenSslEngine.this.ssl);
                    if (nextProtoNegotiated != null) {
                        ReferenceCountedOpenSslEngine.this.applicationProtocol = selectApplicationProtocol(protocols, selectedListenerFailureBehavior, nextProtoNegotiated);
                    }
                } else if (i == 4) {
                    String alpnSelected2 = SSL.getAlpnSelected(ReferenceCountedOpenSslEngine.this.ssl);
                    if (alpnSelected2 == null) {
                        alpnSelected2 = SSL.getNextProtoNegotiated(ReferenceCountedOpenSslEngine.this.ssl);
                    }
                    if (alpnSelected2 != null) {
                        ReferenceCountedOpenSslEngine.this.applicationProtocol = selectApplicationProtocol(protocols, selectedListenerFailureBehavior, alpnSelected2);
                    }
                } else {
                    throw new Error();
                }
            }
        }

        private String selectApplicationProtocol(List<String> list, ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedListenerFailureBehavior, String str) throws SSLException {
            if (selectedListenerFailureBehavior == ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT) {
                return str;
            }
            int size = list.size();
            if (list.contains(str)) {
                return str;
            }
            if (selectedListenerFailureBehavior == ApplicationProtocolConfig.SelectedListenerFailureBehavior.CHOOSE_MY_LAST_PROTOCOL) {
                return list.get(size - 1);
            }
            throw new SSLException("unknown protocol " + str);
        }

        @Override // javax.net.ssl.SSLSession
        public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
            Certificate[] certificateArr;
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (ReferenceCountedOpenSslEngine.isEmpty(this.peerCerts)) {
                    throw new SSLPeerUnverifiedException("peer not verified");
                }
                certificateArr = (Certificate[]) this.peerCerts.clone();
            }
            return certificateArr;
        }

        @Override // javax.net.ssl.SSLSession
        public Certificate[] getLocalCertificates() {
            Certificate[] certificateArr = ReferenceCountedOpenSslEngine.this.localCertificateChain;
            if (certificateArr == null) {
                return null;
            }
            return (Certificate[]) certificateArr.clone();
        }

        @Override // javax.net.ssl.SSLSession
        public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
            X509Certificate[] x509CertificateArr;
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (ReferenceCountedOpenSslEngine.isEmpty(this.x509PeerCerts)) {
                    throw new SSLPeerUnverifiedException("peer not verified");
                }
                x509CertificateArr = (X509Certificate[]) this.x509PeerCerts.clone();
            }
            return x509CertificateArr;
        }

        @Override // javax.net.ssl.SSLSession
        public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
            return ((java.security.cert.X509Certificate) getPeerCertificates()[0]).getSubjectX500Principal();
        }

        @Override // javax.net.ssl.SSLSession
        public Principal getLocalPrincipal() {
            Certificate[] certificateArr = ReferenceCountedOpenSslEngine.this.localCertificateChain;
            if (certificateArr == null || certificateArr.length == 0) {
                return null;
            }
            return ((java.security.cert.X509Certificate) certificateArr[0]).getIssuerX500Principal();
        }

        @Override // javax.net.ssl.SSLSession
        public String getCipherSuite() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                String str = this.cipher;
                return str == null ? "SSL_NULL_WITH_NULL_NULL" : str;
            }
        }

        @Override // javax.net.ssl.SSLSession
        public String getProtocol() {
            String str = this.protocol;
            if (str == null) {
                synchronized (ReferenceCountedOpenSslEngine.this) {
                    str = !ReferenceCountedOpenSslEngine.this.isDestroyed() ? SSL.getVersion(ReferenceCountedOpenSslEngine.this.ssl) : "";
                }
            }
            return str;
        }

        @Override // javax.net.ssl.SSLSession
        public String getPeerHost() {
            return ReferenceCountedOpenSslEngine.this.getPeerHost();
        }

        @Override // javax.net.ssl.SSLSession
        public int getPeerPort() {
            return ReferenceCountedOpenSslEngine.this.getPeerPort();
        }

        @Override // javax.net.ssl.SSLSession
        public int getPacketBufferSize() {
            return ReferenceCountedOpenSslEngine.this.maxEncryptedPacketLength();
        }

        @Override // javax.net.ssl.SSLSession
        public int getApplicationBufferSize() {
            return this.applicationBufferSize;
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.ssl.OpenSslSession
        public void tryExpandApplicationBufferSize(int i) {
            if (i <= ReferenceCountedOpenSslEngine.MAX_PLAINTEXT_LENGTH || this.applicationBufferSize == ReferenceCountedOpenSslEngine.MAX_RECORD_SIZE) {
                return;
            }
            this.applicationBufferSize = ReferenceCountedOpenSslEngine.MAX_RECORD_SIZE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ClientAuth;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState;

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
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[ApplicationProtocolConfig.Protocol.NPN_AND_ALPN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ClientAuth.values().length];
            $SwitchMap$io$netty$handler$ssl$ClientAuth = iArr2;
            try {
                iArr2[ClientAuth.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ClientAuth[ClientAuth.REQUIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ClientAuth[ClientAuth.OPTIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[HandshakeState.values().length];
            $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState = iArr3;
            try {
                iArr3[HandshakeState.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState[HandshakeState.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState[HandshakeState.STARTED_IMPLICITLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState[HandshakeState.STARTED_EXPLICITLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }
}
