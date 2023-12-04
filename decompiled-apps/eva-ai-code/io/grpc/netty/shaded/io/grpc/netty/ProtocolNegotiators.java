package io.grpc.netty.shaded.io.grpc.netty;

import com.facebook.appevents.integrity.IntegrityManager;
import com.google.common.base.Preconditions;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.grpc.CallCredentials;
import io.grpc.ChannelCredentials;
import io.grpc.ChannelLogger;
import io.grpc.ChoiceChannelCredentials;
import io.grpc.ChoiceServerCredentials;
import io.grpc.CompositeCallCredentials;
import io.grpc.CompositeChannelCredentials;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.InsecureServerCredentials;
import io.grpc.InternalChannelz;
import io.grpc.SecurityLevel;
import io.grpc.ServerCredentials;
import io.grpc.Status;
import io.grpc.TlsChannelCredentials;
import io.grpc.TlsServerCredentials;
import io.grpc.internal.GrpcAttributes;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.ObjectPool;
import io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator;
import io.grpc.netty.shaded.io.netty.channel.ChannelDuplexHandler;
import io.grpc.netty.shaded.io.netty.channel.ChannelFutureListener;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandler;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandlerAdapter;
import io.grpc.netty.shaded.io.netty.channel.ChannelPipeline;
import io.grpc.netty.shaded.io.netty.handler.codec.http.DefaultHttpRequest;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpClientCodec;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpClientUpgradeHandler;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaderNames;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpMethod;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpVersion;
import io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2ClientUpgradeCodec;
import io.grpc.netty.shaded.io.netty.handler.proxy.HttpProxyHandler;
import io.grpc.netty.shaded.io.netty.handler.proxy.ProxyConnectionEvent;
import io.grpc.netty.shaded.io.netty.handler.ssl.OpenSsl;
import io.grpc.netty.shaded.io.netty.handler.ssl.OpenSslEngine;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContext;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslHandler;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslHandshakeCompletionEvent;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslProvider;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import io.grpc.netty.shaded.io.netty.util.AttributeMap;
import java.io.ByteArrayInputStream;
import java.net.SocketAddress;
import java.net.URI;
import java.nio.channels.ClosedChannelException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProtocolNegotiators {
    private static final Logger log = Logger.getLogger(ProtocolNegotiators.class.getName());
    private static final EnumSet<TlsChannelCredentials.Feature> understoodTlsFeatures = EnumSet.noneOf(TlsChannelCredentials.Feature.class);
    private static final EnumSet<TlsServerCredentials.Feature> understoodServerTlsFeatures = EnumSet.noneOf(TlsServerCredentials.Feature.class);

    private ProtocolNegotiators() {
    }

    public static FromChannelCredentialsResult from(ChannelCredentials channelCredentials) {
        if (channelCredentials instanceof TlsChannelCredentials) {
            Set<TlsChannelCredentials.Feature> incomprehensible = ((TlsChannelCredentials) channelCredentials).incomprehensible(understoodTlsFeatures);
            if (!incomprehensible.isEmpty()) {
                return FromChannelCredentialsResult.error("TLS features not understood: " + incomprehensible);
            }
            return FromChannelCredentialsResult.negotiator(tlsClientFactory(null));
        } else if (channelCredentials instanceof InsecureChannelCredentials) {
            return FromChannelCredentialsResult.negotiator(plaintextClientFactory());
        } else {
            if (channelCredentials instanceof CompositeChannelCredentials) {
                CompositeChannelCredentials compositeChannelCredentials = (CompositeChannelCredentials) channelCredentials;
                return from(compositeChannelCredentials.getChannelCredentials()).withCallCredentials(compositeChannelCredentials.getCallCredentials());
            } else if (channelCredentials instanceof NettyChannelCredentials) {
                return FromChannelCredentialsResult.negotiator(((NettyChannelCredentials) channelCredentials).getNegotiator());
            } else {
                if (channelCredentials instanceof ChoiceChannelCredentials) {
                    StringBuilder sb = new StringBuilder();
                    for (ChannelCredentials channelCredentials2 : ((ChoiceChannelCredentials) channelCredentials).getCredentialsList()) {
                        FromChannelCredentialsResult from = from(channelCredentials2);
                        if (from.error == null) {
                            return from;
                        }
                        sb.append(", ");
                        sb.append(from.error);
                    }
                    return FromChannelCredentialsResult.error(sb.substring(2));
                }
                return FromChannelCredentialsResult.error("Unsupported credential type: " + channelCredentials.getClass().getName());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class FromChannelCredentialsResult {
        public final CallCredentials callCredentials;
        public final String error;
        public final ProtocolNegotiator.ClientFactory negotiator;

        private FromChannelCredentialsResult(ProtocolNegotiator.ClientFactory clientFactory, CallCredentials callCredentials, String str) {
            this.negotiator = clientFactory;
            this.callCredentials = callCredentials;
            this.error = str;
        }

        public static FromChannelCredentialsResult error(String str) {
            return new FromChannelCredentialsResult(null, null, (String) Preconditions.checkNotNull(str, "error"));
        }

        public static FromChannelCredentialsResult negotiator(ProtocolNegotiator.ClientFactory clientFactory) {
            return new FromChannelCredentialsResult((ProtocolNegotiator.ClientFactory) Preconditions.checkNotNull(clientFactory, "factory"), null, null);
        }

        public FromChannelCredentialsResult withCallCredentials(CallCredentials callCredentials) {
            Preconditions.checkNotNull(callCredentials, "callCreds");
            if (this.error != null) {
                return this;
            }
            if (this.callCredentials != null) {
                callCredentials = new CompositeCallCredentials(this.callCredentials, callCredentials);
            }
            return new FromChannelCredentialsResult(this.negotiator, callCredentials, null);
        }
    }

    public static FromServerCredentialsResult from(ServerCredentials serverCredentials) {
        if (serverCredentials instanceof TlsServerCredentials) {
            TlsServerCredentials tlsServerCredentials = (TlsServerCredentials) serverCredentials;
            Set<TlsServerCredentials.Feature> incomprehensible = tlsServerCredentials.incomprehensible(understoodServerTlsFeatures);
            if (!incomprehensible.isEmpty()) {
                return FromServerCredentialsResult.error("TLS features not understood: " + incomprehensible);
            }
            try {
                return FromServerCredentialsResult.negotiator(serverTlsFactory(GrpcSslContexts.forServer(new ByteArrayInputStream(tlsServerCredentials.getCertificateChain()), new ByteArrayInputStream(tlsServerCredentials.getPrivateKey()), tlsServerCredentials.getPrivateKeyPassword()).build()));
            } catch (SSLException e) {
                throw new IllegalArgumentException("Unexpected error converting ServerCredentials to Netty SslContext", e);
            }
        } else if (serverCredentials instanceof InsecureServerCredentials) {
            return FromServerCredentialsResult.negotiator(serverPlaintextFactory());
        } else {
            if (serverCredentials instanceof NettyServerCredentials) {
                return FromServerCredentialsResult.negotiator(((NettyServerCredentials) serverCredentials).getNegotiator());
            }
            if (serverCredentials instanceof ChoiceServerCredentials) {
                StringBuilder sb = new StringBuilder();
                for (ServerCredentials serverCredentials2 : ((ChoiceServerCredentials) serverCredentials).getCredentialsList()) {
                    FromServerCredentialsResult from = from(serverCredentials2);
                    if (from.error == null) {
                        return from;
                    }
                    sb.append(", ");
                    sb.append(from.error);
                }
                return FromServerCredentialsResult.error(sb.substring(2));
            }
            return FromServerCredentialsResult.error("Unsupported credential type: " + serverCredentials.getClass().getName());
        }
    }

    /* loaded from: classes4.dex */
    public static final class FromServerCredentialsResult {
        public final String error;
        public final ProtocolNegotiator.ServerFactory negotiator;

        private FromServerCredentialsResult(ProtocolNegotiator.ServerFactory serverFactory, String str) {
            this.negotiator = serverFactory;
            this.error = str;
        }

        public static FromServerCredentialsResult error(String str) {
            return new FromServerCredentialsResult(null, (String) Preconditions.checkNotNull(str, "error"));
        }

        public static FromServerCredentialsResult negotiator(ProtocolNegotiator.ServerFactory serverFactory) {
            return new FromServerCredentialsResult((ProtocolNegotiator.ServerFactory) Preconditions.checkNotNull(serverFactory, "factory"), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChannelLogger negotiationLogger(ChannelHandlerContext channelHandlerContext) {
        return negotiationLogger(channelHandlerContext.channel());
    }

    private static ChannelLogger negotiationLogger(AttributeMap attributeMap) {
        ChannelLogger channelLogger = (ChannelLogger) attributeMap.attr(NettyClientTransport.LOGGER_KEY).get();
        return channelLogger != null ? channelLogger : new ChannelLogger() { // from class: io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiators.1NoopChannelLogger
            @Override // io.grpc.ChannelLogger
            public void log(ChannelLogger.ChannelLogLevel channelLogLevel, String str) {
            }

            @Override // io.grpc.ChannelLogger
            public void log(ChannelLogger.ChannelLogLevel channelLogLevel, String str, Object... objArr) {
            }
        };
    }

    public static ProtocolNegotiator.ServerFactory fixedServerFactory(ProtocolNegotiator protocolNegotiator) {
        return new FixedProtocolNegotiatorServerFactory(protocolNegotiator);
    }

    /* loaded from: classes4.dex */
    private static final class FixedProtocolNegotiatorServerFactory implements ProtocolNegotiator.ServerFactory {
        private final ProtocolNegotiator protocolNegotiator;

        public FixedProtocolNegotiatorServerFactory(ProtocolNegotiator protocolNegotiator) {
            this.protocolNegotiator = (ProtocolNegotiator) Preconditions.checkNotNull(protocolNegotiator, "protocolNegotiator");
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ServerFactory
        public ProtocolNegotiator newNegotiator(ObjectPool<? extends Executor> objectPool) {
            return this.protocolNegotiator;
        }
    }

    public static ProtocolNegotiator serverPlaintext() {
        return new PlaintextProtocolNegotiator();
    }

    public static ProtocolNegotiator.ServerFactory serverPlaintextFactory() {
        return new PlaintextProtocolNegotiatorServerFactory();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class PlaintextProtocolNegotiatorServerFactory implements ProtocolNegotiator.ServerFactory {
        PlaintextProtocolNegotiatorServerFactory() {
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ServerFactory
        public ProtocolNegotiator newNegotiator(ObjectPool<? extends Executor> objectPool) {
            return ProtocolNegotiators.serverPlaintext();
        }
    }

    public static ProtocolNegotiator.ServerFactory serverTlsFactory(SslContext sslContext) {
        return new TlsProtocolNegotiatorServerFactory(sslContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class TlsProtocolNegotiatorServerFactory implements ProtocolNegotiator.ServerFactory {
        private final SslContext sslContext;

        public TlsProtocolNegotiatorServerFactory(SslContext sslContext) {
            this.sslContext = (SslContext) Preconditions.checkNotNull(sslContext, "sslContext");
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ServerFactory
        public ProtocolNegotiator newNegotiator(ObjectPool<? extends Executor> objectPool) {
            return ProtocolNegotiators.serverTls(this.sslContext, objectPool);
        }
    }

    public static ProtocolNegotiator serverTls(final SslContext sslContext, final ObjectPool<? extends Executor> objectPool) {
        Preconditions.checkNotNull(sslContext, "sslContext");
        final Executor object = objectPool != null ? objectPool.getObject() : null;
        return new ProtocolNegotiator() { // from class: io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiators.1
            @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
            public ChannelHandler newHandler(GrpcHttp2ConnectionHandler grpcHttp2ConnectionHandler) {
                return new WaitUntilActiveHandler(new ServerTlsHandler(new GrpcNegotiationHandler(grpcHttp2ConnectionHandler), SslContext.this, objectPool));
            }

            @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
            public void close() {
                Executor executor;
                ObjectPool objectPool2 = objectPool;
                if (objectPool2 == null || (executor = object) == null) {
                    return;
                }
                objectPool2.returnObject(executor);
            }

            @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
            public AsciiString scheme() {
                return Utils.HTTPS;
            }
        };
    }

    public static ProtocolNegotiator serverTls(SslContext sslContext) {
        return serverTls(sslContext, null);
    }

    /* loaded from: classes4.dex */
    static final class ServerTlsHandler extends ChannelInboundHandlerAdapter {
        private Executor executor;
        private final ChannelHandler next;
        private ProtocolNegotiationEvent pne = ProtocolNegotiationEvent.DEFAULT;
        private final SslContext sslContext;

        ServerTlsHandler(ChannelHandler channelHandler, SslContext sslContext, ObjectPool<? extends Executor> objectPool) {
            this.sslContext = (SslContext) Preconditions.checkNotNull(sslContext, "sslContext");
            this.next = (ChannelHandler) Preconditions.checkNotNull(channelHandler, "next");
            if (objectPool != null) {
                this.executor = objectPool.getObject();
            }
        }

        @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler
        public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
            SslHandler sslHandler;
            super.handlerAdded(channelHandlerContext);
            SSLEngine newEngine = this.sslContext.newEngine(channelHandlerContext.alloc());
            ChannelPipeline pipeline = channelHandlerContext.pipeline();
            String name = channelHandlerContext.name();
            if (this.executor != null) {
                sslHandler = new SslHandler(newEngine, false, this.executor);
            } else {
                sslHandler = new SslHandler(newEngine, false);
            }
            pipeline.addBefore(name, null, sslHandler);
        }

        @Override // io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandler
        public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
            if (obj instanceof ProtocolNegotiationEvent) {
                this.pne = (ProtocolNegotiationEvent) obj;
            } else if (obj instanceof SslHandshakeCompletionEvent) {
                SslHandshakeCompletionEvent sslHandshakeCompletionEvent = (SslHandshakeCompletionEvent) obj;
                if (!sslHandshakeCompletionEvent.isSuccess()) {
                    ProtocolNegotiators.logSslEngineDetails(Level.FINE, channelHandlerContext, "TLS negotiation failed for new client.", null);
                    channelHandlerContext.fireExceptionCaught(sslHandshakeCompletionEvent.cause());
                    return;
                }
                SslHandler sslHandler = (SslHandler) channelHandlerContext.pipeline().get(SslHandler.class);
                if (!this.sslContext.applicationProtocolNegotiator().protocols().contains(sslHandler.applicationProtocol())) {
                    ProtocolNegotiators.logSslEngineDetails(Level.FINE, channelHandlerContext, "TLS negotiation failed for new client.", null);
                    channelHandlerContext.fireExceptionCaught((Throwable) ProtocolNegotiators.unavailableException("Failed protocol negotiation: Unable to find compatible protocol"));
                    return;
                }
                channelHandlerContext.pipeline().replace(channelHandlerContext.name(), (String) null, this.next);
                fireProtocolNegotiationEvent(channelHandlerContext, sslHandler.engine().getSession());
            } else {
                super.userEventTriggered(channelHandlerContext, obj);
            }
        }

        private void fireProtocolNegotiationEvent(ChannelHandlerContext channelHandlerContext, SSLSession sSLSession) {
            channelHandlerContext.fireUserEventTriggered((Object) this.pne.withAttributes(this.pne.getAttributes().toBuilder().set(GrpcAttributes.ATTR_SECURITY_LEVEL, SecurityLevel.PRIVACY_AND_INTEGRITY).set(Grpc.TRANSPORT_ATTR_SSL_SESSION, sSLSession).build()).withSecurity(new InternalChannelz.Security(new InternalChannelz.Tls(sSLSession))));
        }
    }

    public static ProtocolNegotiator httpProxy(final SocketAddress socketAddress, @Nullable final String str, @Nullable final String str2, final ProtocolNegotiator protocolNegotiator) {
        Preconditions.checkNotNull(protocolNegotiator, "negotiator");
        Preconditions.checkNotNull(socketAddress, "proxyAddress");
        final AsciiString scheme = protocolNegotiator.scheme();
        return new ProtocolNegotiator() { // from class: io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiators.1ProxyNegotiator
            @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
            public ChannelHandler newHandler(GrpcHttp2ConnectionHandler grpcHttp2ConnectionHandler) {
                return new ProxyProtocolNegotiationHandler(socketAddress, str, str2, ProtocolNegotiator.this.newHandler(grpcHttp2ConnectionHandler));
            }

            @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
            public AsciiString scheme() {
                return scheme;
            }

            @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
            public void close() {
                ProtocolNegotiator.this.close();
            }
        };
    }

    /* loaded from: classes4.dex */
    static final class ProxyProtocolNegotiationHandler extends ProtocolNegotiationHandler {
        private final SocketAddress address;
        @Nullable
        private final String password;
        @Nullable
        private final String userName;

        public ProxyProtocolNegotiationHandler(SocketAddress socketAddress, @Nullable String str, @Nullable String str2, ChannelHandler channelHandler) {
            super(channelHandler);
            this.address = (SocketAddress) Preconditions.checkNotNull(socketAddress, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
            this.userName = str;
            this.password = str2;
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiators.ProtocolNegotiationHandler
        protected void protocolNegotiationEventTriggered(ChannelHandlerContext channelHandlerContext) {
            HttpProxyHandler httpProxyHandler;
            if (this.userName == null || this.password == null) {
                httpProxyHandler = new HttpProxyHandler(this.address);
            } else {
                httpProxyHandler = new HttpProxyHandler(this.address, this.userName, this.password);
            }
            channelHandlerContext.pipeline().addBefore(channelHandlerContext.name(), null, httpProxyHandler);
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiators.ProtocolNegotiationHandler
        protected void userEventTriggered0(ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
            if (obj instanceof ProxyConnectionEvent) {
                fireProtocolNegotiationEvent(channelHandlerContext);
            } else {
                super.userEventTriggered(channelHandlerContext, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class ClientTlsProtocolNegotiator implements ProtocolNegotiator {
        private Executor executor;
        private final ObjectPool<? extends Executor> executorPool;
        private final SslContext sslContext;

        public ClientTlsProtocolNegotiator(SslContext sslContext, ObjectPool<? extends Executor> objectPool) {
            this.sslContext = (SslContext) Preconditions.checkNotNull(sslContext, "sslContext");
            this.executorPool = objectPool;
            if (objectPool != null) {
                this.executor = objectPool.getObject();
            }
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public AsciiString scheme() {
            return Utils.HTTPS;
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public ChannelHandler newHandler(GrpcHttp2ConnectionHandler grpcHttp2ConnectionHandler) {
            return new WaitUntilActiveHandler(new ClientTlsHandler(new GrpcNegotiationHandler(grpcHttp2ConnectionHandler), this.sslContext, grpcHttp2ConnectionHandler.getAuthority(), this.executor));
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public void close() {
            Executor executor;
            ObjectPool<? extends Executor> objectPool = this.executorPool;
            if (objectPool == null || (executor = this.executor) == null) {
                return;
            }
            objectPool.returnObject(executor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class ClientTlsHandler extends ProtocolNegotiationHandler {
        private Executor executor;
        private final String host;
        private final int port;
        private final SslContext sslContext;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ClientTlsHandler(ChannelHandler channelHandler, SslContext sslContext, String str, Executor executor) {
            super(channelHandler);
            this.sslContext = (SslContext) Preconditions.checkNotNull(sslContext, "sslContext");
            HostPort parseAuthority = ProtocolNegotiators.parseAuthority(str);
            this.host = parseAuthority.host;
            this.port = parseAuthority.port;
            this.executor = executor;
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiators.ProtocolNegotiationHandler
        protected void handlerAdded0(ChannelHandlerContext channelHandlerContext) {
            SslHandler sslHandler;
            SSLEngine newEngine = this.sslContext.newEngine(channelHandlerContext.alloc(), this.host, this.port);
            SSLParameters sSLParameters = newEngine.getSSLParameters();
            sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
            newEngine.setSSLParameters(sSLParameters);
            ChannelPipeline pipeline = channelHandlerContext.pipeline();
            String name = channelHandlerContext.name();
            if (this.executor != null) {
                sslHandler = new SslHandler(newEngine, false, this.executor);
            } else {
                sslHandler = new SslHandler(newEngine, false);
            }
            pipeline.addBefore(name, null, sslHandler);
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiators.ProtocolNegotiationHandler
        protected void userEventTriggered0(ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
            if (obj instanceof SslHandshakeCompletionEvent) {
                SslHandshakeCompletionEvent sslHandshakeCompletionEvent = (SslHandshakeCompletionEvent) obj;
                if (sslHandshakeCompletionEvent.isSuccess()) {
                    SslHandler sslHandler = (SslHandler) channelHandlerContext.pipeline().get(SslHandler.class);
                    if (!this.sslContext.applicationProtocolNegotiator().protocols().contains(sslHandler.applicationProtocol())) {
                        RuntimeException unavailableException = ProtocolNegotiators.unavailableException("Failed ALPN negotiation: Unable to find compatible protocol");
                        ProtocolNegotiators.logSslEngineDetails(Level.FINE, channelHandlerContext, "TLS negotiation failed.", unavailableException);
                        channelHandlerContext.fireExceptionCaught((Throwable) unavailableException);
                        return;
                    }
                    ProtocolNegotiators.logSslEngineDetails(Level.FINER, channelHandlerContext, "TLS negotiation succeeded.", null);
                    propagateTlsComplete(channelHandlerContext, sslHandler.engine().getSession());
                    return;
                }
                Throwable cause = sslHandshakeCompletionEvent.cause();
                if (cause instanceof ClosedChannelException) {
                    cause = Status.UNAVAILABLE.withDescription("Connection closed while performing TLS negotiation").withCause(cause).asRuntimeException();
                }
                channelHandlerContext.fireExceptionCaught(cause);
                return;
            }
            super.userEventTriggered0(channelHandlerContext, obj);
        }

        private void propagateTlsComplete(ChannelHandlerContext channelHandlerContext, SSLSession sSLSession) {
            InternalChannelz.Security security = new InternalChannelz.Security(new InternalChannelz.Tls(sSLSession));
            ProtocolNegotiationEvent protocolNegotiationEvent = getProtocolNegotiationEvent();
            replaceProtocolNegotiationEvent(protocolNegotiationEvent.withAttributes(protocolNegotiationEvent.getAttributes().toBuilder().set(GrpcAttributes.ATTR_SECURITY_LEVEL, SecurityLevel.PRIVACY_AND_INTEGRITY).set(Grpc.TRANSPORT_ATTR_SSL_SESSION, sSLSession).build()).withSecurity(security));
            fireProtocolNegotiationEvent(channelHandlerContext);
        }
    }

    static HostPort parseAuthority(String str) {
        int i;
        URI authorityToUri = GrpcUtil.authorityToUri((String) Preconditions.checkNotNull(str, "authority"));
        if (authorityToUri.getHost() != null) {
            str = authorityToUri.getHost();
            i = authorityToUri.getPort();
        } else {
            i = -1;
        }
        return new HostPort(str, i);
    }

    public static ProtocolNegotiator tls(SslContext sslContext, ObjectPool<? extends Executor> objectPool) {
        return new ClientTlsProtocolNegotiator(sslContext, objectPool);
    }

    public static ProtocolNegotiator tls(SslContext sslContext) {
        return tls(sslContext, null);
    }

    public static ProtocolNegotiator.ClientFactory tlsClientFactory(SslContext sslContext) {
        return new TlsProtocolNegotiatorClientFactory(sslContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class TlsProtocolNegotiatorClientFactory implements ProtocolNegotiator.ClientFactory {
        private final SslContext sslContext;

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public int getDefaultPort() {
            return GrpcUtil.DEFAULT_PORT_SSL;
        }

        public TlsProtocolNegotiatorClientFactory(SslContext sslContext) {
            this.sslContext = sslContext;
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public ProtocolNegotiator newNegotiator() {
            SslContext sslContext = this.sslContext;
            if (sslContext == null) {
                try {
                    sslContext = GrpcSslContexts.forClient().build();
                } catch (SSLException e) {
                    throw new RuntimeException(e);
                }
            }
            return ProtocolNegotiators.tls(sslContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class HostPort {
        final String host;
        final int port;

        public HostPort(String str, int i) {
            this.host = str;
            this.port = i;
        }
    }

    public static ProtocolNegotiator plaintextUpgrade() {
        return new PlaintextUpgradeProtocolNegotiator();
    }

    public static ProtocolNegotiator.ClientFactory plaintextUpgradeClientFactory() {
        return new PlaintextUpgradeProtocolNegotiatorClientFactory();
    }

    /* loaded from: classes4.dex */
    private static final class PlaintextUpgradeProtocolNegotiatorClientFactory implements ProtocolNegotiator.ClientFactory {
        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public int getDefaultPort() {
            return 80;
        }

        private PlaintextUpgradeProtocolNegotiatorClientFactory() {
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public ProtocolNegotiator newNegotiator() {
            return ProtocolNegotiators.plaintextUpgrade();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class PlaintextUpgradeProtocolNegotiator implements ProtocolNegotiator {
        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public void close() {
        }

        PlaintextUpgradeProtocolNegotiator() {
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public AsciiString scheme() {
            return Utils.HTTP;
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public ChannelHandler newHandler(GrpcHttp2ConnectionHandler grpcHttp2ConnectionHandler) {
            return new WaitUntilActiveHandler(new Http2UpgradeAndGrpcHandler(grpcHttp2ConnectionHandler.getAuthority(), grpcHttp2ConnectionHandler));
        }
    }

    /* loaded from: classes4.dex */
    static final class Http2UpgradeAndGrpcHandler extends ChannelInboundHandlerAdapter {
        private final String authority;
        private final GrpcHttp2ConnectionHandler next;
        private ProtocolNegotiationEvent pne;

        Http2UpgradeAndGrpcHandler(String str, GrpcHttp2ConnectionHandler grpcHttp2ConnectionHandler) {
            this.authority = (String) Preconditions.checkNotNull(str, "authority");
            this.next = (GrpcHttp2ConnectionHandler) Preconditions.checkNotNull(grpcHttp2ConnectionHandler, "next");
        }

        @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler
        public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
            ProtocolNegotiators.negotiationLogger(channelHandlerContext).log(ChannelLogger.ChannelLogLevel.INFO, "Http2Upgrade started");
            HttpClientCodec httpClientCodec = new HttpClientCodec();
            channelHandlerContext.pipeline().addBefore(channelHandlerContext.name(), null, httpClientCodec);
            channelHandlerContext.pipeline().addBefore(channelHandlerContext.name(), null, new HttpClientUpgradeHandler(httpClientCodec, new Http2ClientUpgradeCodec(this.next), 1000));
            DefaultHttpRequest defaultHttpRequest = new DefaultHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, RemoteSettings.FORWARD_SLASH_STRING);
            defaultHttpRequest.headers().add(HttpHeaderNames.HOST, this.authority);
            channelHandlerContext.writeAndFlush(defaultHttpRequest).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
            super.handlerAdded(channelHandlerContext);
        }

        @Override // io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandler
        public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
            if (obj instanceof ProtocolNegotiationEvent) {
                Preconditions.checkState(this.pne == null, "negotiation already started");
                this.pne = (ProtocolNegotiationEvent) obj;
            } else if (obj == HttpClientUpgradeHandler.UpgradeEvent.UPGRADE_SUCCESSFUL) {
                Preconditions.checkState(this.pne != null, "negotiation not yet complete");
                ProtocolNegotiators.negotiationLogger(channelHandlerContext).log(ChannelLogger.ChannelLogLevel.INFO, "Http2Upgrade finished");
                channelHandlerContext.pipeline().remove(channelHandlerContext.name());
                this.next.handleProtocolNegotiationCompleted(this.pne.getAttributes(), this.pne.getSecurity());
            } else if (obj == HttpClientUpgradeHandler.UpgradeEvent.UPGRADE_REJECTED) {
                channelHandlerContext.fireExceptionCaught((Throwable) ProtocolNegotiators.unavailableException("HTTP/2 upgrade rejected"));
            } else {
                super.userEventTriggered(channelHandlerContext, obj);
            }
        }
    }

    public static ProtocolNegotiator plaintext() {
        return new PlaintextProtocolNegotiator();
    }

    public static ProtocolNegotiator.ClientFactory plaintextClientFactory() {
        return new PlaintextProtocolNegotiatorClientFactory();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class PlaintextProtocolNegotiatorClientFactory implements ProtocolNegotiator.ClientFactory {
        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public int getDefaultPort() {
            return 80;
        }

        PlaintextProtocolNegotiatorClientFactory() {
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public ProtocolNegotiator newNegotiator() {
            return ProtocolNegotiators.plaintext();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException unavailableException(String str) {
        return Status.UNAVAILABLE.withDescription(str).asRuntimeException();
    }

    static void logSslEngineDetails(Level level, ChannelHandlerContext channelHandlerContext, String str, @Nullable Throwable th) {
        Logger logger = log;
        if (logger.isLoggable(level)) {
            SslHandler sslHandler = (SslHandler) channelHandlerContext.pipeline().get(SslHandler.class);
            SSLEngine engine = sslHandler.engine();
            StringBuilder sb = new StringBuilder(str);
            sb.append("\nSSLEngine Details: [\n");
            if (engine instanceof OpenSslEngine) {
                sb.append("    OpenSSL, Version: 0x");
                sb.append(Integer.toHexString(OpenSsl.version()));
                sb.append(" (");
                sb.append(OpenSsl.versionString());
                sb.append("), ALPN supported: ");
                sb.append(SslProvider.isAlpnSupported(SslProvider.OPENSSL));
            } else if (JettyTlsUtil.isJettyAlpnConfigured()) {
                sb.append("    Jetty ALPN");
            } else if (JettyTlsUtil.isJettyNpnConfigured()) {
                sb.append("    Jetty NPN");
            } else if (JettyTlsUtil.isJava9AlpnAvailable()) {
                sb.append("    JDK9 ALPN");
            }
            sb.append("\n    TLS Protocol: ");
            sb.append(engine.getSession().getProtocol());
            sb.append("\n    Application Protocol: ");
            sb.append(sslHandler.applicationProtocol());
            sb.append("\n    Need Client Auth: ");
            sb.append(engine.getNeedClientAuth());
            sb.append("\n    Want Client Auth: ");
            sb.append(engine.getWantClientAuth());
            sb.append("\n    Supported protocols=");
            sb.append(Arrays.toString(engine.getSupportedProtocols()));
            sb.append("\n    Enabled protocols=");
            sb.append(Arrays.toString(engine.getEnabledProtocols()));
            sb.append("\n    Supported ciphers=");
            sb.append(Arrays.toString(engine.getSupportedCipherSuites()));
            sb.append("\n    Enabled ciphers=");
            sb.append(Arrays.toString(engine.getEnabledCipherSuites()));
            sb.append("\n]");
            logger.log(level, sb.toString(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class GrpcNegotiationHandler extends ChannelInboundHandlerAdapter {
        private final GrpcHttp2ConnectionHandler next;

        public GrpcNegotiationHandler(GrpcHttp2ConnectionHandler grpcHttp2ConnectionHandler) {
            this.next = (GrpcHttp2ConnectionHandler) Preconditions.checkNotNull(grpcHttp2ConnectionHandler, "next");
        }

        @Override // io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandler
        public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
            if (obj instanceof ProtocolNegotiationEvent) {
                ProtocolNegotiationEvent protocolNegotiationEvent = (ProtocolNegotiationEvent) obj;
                channelHandlerContext.pipeline().replace(channelHandlerContext.name(), (String) null, this.next);
                this.next.handleProtocolNegotiationCompleted(protocolNegotiationEvent.getAttributes(), protocolNegotiationEvent.getSecurity());
                return;
            }
            super.userEventTriggered(channelHandlerContext, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class PlaintextProtocolNegotiator implements ProtocolNegotiator {
        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public void close() {
        }

        PlaintextProtocolNegotiator() {
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public ChannelHandler newHandler(GrpcHttp2ConnectionHandler grpcHttp2ConnectionHandler) {
            return new WaitUntilActiveHandler(new GrpcNegotiationHandler(grpcHttp2ConnectionHandler));
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public AsciiString scheme() {
            return Utils.HTTP;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class WaitUntilActiveHandler extends ProtocolNegotiationHandler {
        boolean protocolNegotiationEventReceived;

        /* JADX INFO: Access modifiers changed from: package-private */
        public WaitUntilActiveHandler(ChannelHandler channelHandler) {
            super(channelHandler);
        }

        @Override // io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandler
        public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
            if (this.protocolNegotiationEventReceived) {
                replaceOnActive(channelHandlerContext);
                fireProtocolNegotiationEvent(channelHandlerContext);
            }
            super.channelActive(channelHandlerContext);
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiators.ProtocolNegotiationHandler
        protected void protocolNegotiationEventTriggered(ChannelHandlerContext channelHandlerContext) {
            this.protocolNegotiationEventReceived = true;
            if (channelHandlerContext.channel().isActive()) {
                replaceOnActive(channelHandlerContext);
                fireProtocolNegotiationEvent(channelHandlerContext);
            }
        }

        private void replaceOnActive(ChannelHandlerContext channelHandlerContext) {
            ProtocolNegotiationEvent protocolNegotiationEvent = getProtocolNegotiationEvent();
            replaceProtocolNegotiationEvent(protocolNegotiationEvent.withAttributes(protocolNegotiationEvent.getAttributes().toBuilder().set(Grpc.TRANSPORT_ATTR_LOCAL_ADDR, channelHandlerContext.channel().localAddress()).set(Grpc.TRANSPORT_ATTR_REMOTE_ADDR, channelHandlerContext.channel().remoteAddress()).set(GrpcAttributes.ATTR_SECURITY_LEVEL, SecurityLevel.NONE).build()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class ProtocolNegotiationHandler extends ChannelDuplexHandler {
        private final String negotiatorName;
        private final ChannelHandler next;
        private ProtocolNegotiationEvent pne;

        protected void protocolNegotiationEventTriggered(ChannelHandlerContext channelHandlerContext) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public ProtocolNegotiationHandler(ChannelHandler channelHandler, String str) {
            this.next = (ChannelHandler) Preconditions.checkNotNull(channelHandler, "next");
            this.negotiatorName = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public ProtocolNegotiationHandler(ChannelHandler channelHandler) {
            this.next = (ChannelHandler) Preconditions.checkNotNull(channelHandler, "next");
            this.negotiatorName = getClass().getSimpleName().replace("Handler", "");
        }

        @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler
        public final void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
            ProtocolNegotiators.negotiationLogger(channelHandlerContext).log(ChannelLogger.ChannelLogLevel.DEBUG, "{0} started", this.negotiatorName);
            handlerAdded0(channelHandlerContext);
        }

        protected void handlerAdded0(ChannelHandlerContext channelHandlerContext) throws Exception {
            super.handlerAdded(channelHandlerContext);
        }

        @Override // io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandler
        public final void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
            if (obj instanceof ProtocolNegotiationEvent) {
                ProtocolNegotiationEvent protocolNegotiationEvent = this.pne;
                Preconditions.checkState(protocolNegotiationEvent == null, "pre-existing negotiation: %s < %s", protocolNegotiationEvent, obj);
                this.pne = (ProtocolNegotiationEvent) obj;
                protocolNegotiationEventTriggered(channelHandlerContext);
                return;
            }
            userEventTriggered0(channelHandlerContext, obj);
        }

        protected void userEventTriggered0(ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
            super.userEventTriggered(channelHandlerContext, obj);
        }

        protected final ProtocolNegotiationEvent getProtocolNegotiationEvent() {
            Preconditions.checkState(this.pne != null, "previous protocol negotiation event hasn't triggered");
            return this.pne;
        }

        protected final void replaceProtocolNegotiationEvent(ProtocolNegotiationEvent protocolNegotiationEvent) {
            Preconditions.checkState(this.pne != null, "previous protocol negotiation event hasn't triggered");
            this.pne = (ProtocolNegotiationEvent) Preconditions.checkNotNull(protocolNegotiationEvent);
        }

        protected final void fireProtocolNegotiationEvent(ChannelHandlerContext channelHandlerContext) {
            Preconditions.checkState(this.pne != null, "previous protocol negotiation event hasn't triggered");
            ProtocolNegotiators.negotiationLogger(channelHandlerContext).log(ChannelLogger.ChannelLogLevel.INFO, "{0} completed", this.negotiatorName);
            channelHandlerContext.pipeline().replace(channelHandlerContext.name(), (String) null, this.next);
            channelHandlerContext.fireUserEventTriggered((Object) this.pne);
        }
    }
}
