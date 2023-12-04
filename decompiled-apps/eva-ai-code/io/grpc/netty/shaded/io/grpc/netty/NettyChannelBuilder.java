package io.grpc.netty.shaded.io.grpc.netty;

import com.facebook.internal.ServerProtocol;
import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import io.grpc.CallCredentials;
import io.grpc.ChannelCredentials;
import io.grpc.ChannelLogger;
import io.grpc.HttpConnectProxiedSocketAddress;
import io.grpc.ManagedChannelBuilder;
import io.grpc.internal.AbstractManagedChannelImplBuilder;
import io.grpc.internal.AtomicBackoff;
import io.grpc.internal.ClientTransportFactory;
import io.grpc.internal.ConnectionClientTransport;
import io.grpc.internal.FixedObjectPool;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.KeepAliveManager;
import io.grpc.internal.ManagedChannelImplBuilder;
import io.grpc.internal.ObjectPool;
import io.grpc.internal.SharedResourcePool;
import io.grpc.internal.TransportTracer;
import io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator;
import io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiators;
import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.channel.ChannelFactory;
import io.grpc.netty.shaded.io.netty.channel.ChannelOption;
import io.grpc.netty.shaded.io.netty.channel.EventLoopGroup;
import io.grpc.netty.shaded.io.netty.channel.ReflectiveChannelFactory;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContext;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.net.ssl.SSLException;
/* loaded from: classes4.dex */
public final class NettyChannelBuilder extends AbstractManagedChannelImplBuilder<NettyChannelBuilder> {
    private static final boolean DEFAULT_AUTO_FLOW_CONTROL;
    public static final int DEFAULT_FLOW_CONTROL_WINDOW = 1048576;
    private boolean autoFlowControl;
    private ChannelFactory<? extends Channel> channelFactory;
    private final Map<ChannelOption<?>, Object> channelOptions;
    private ObjectPool<? extends EventLoopGroup> eventLoopGroupPool;
    private int flowControlWindow;
    private final boolean freezeProtocolNegotiatorFactory;
    private long keepAliveTimeNanos;
    private long keepAliveTimeoutNanos;
    private boolean keepAliveWithoutCalls;
    private LocalSocketPicker localSocketPicker;
    private final ManagedChannelImplBuilder managedChannelImplBuilder;
    private int maxHeaderListSize;
    private int maxInboundMessageSize;
    private ProtocolNegotiator.ClientFactory protocolNegotiatorFactory;
    private TransportTracer.Factory transportTracerFactory;
    private final boolean useGetForSafeMethods;
    private static final long AS_LARGE_AS_INFINITE = TimeUnit.DAYS.toNanos(1000);
    private static final ChannelFactory<? extends Channel> DEFAULT_CHANNEL_FACTORY = new ReflectiveChannelFactory(Utils.DEFAULT_CLIENT_CHANNEL_TYPE);
    private static final ObjectPool<? extends EventLoopGroup> DEFAULT_EVENT_LOOP_GROUP_POOL = SharedResourcePool.forResource(Utils.DEFAULT_WORKER_EVENT_LOOP_GROUP);

    /* loaded from: classes4.dex */
    public static class LocalSocketPicker {
        @Nullable
        public SocketAddress createSocketAddress(SocketAddress socketAddress, Attributes attributes) {
            return null;
        }
    }

    static {
        String str = System.getenv("GRPC_EXPERIMENTAL_AUTOFLOWCONTROL");
        if (str == null) {
            str = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
        }
        DEFAULT_AUTO_FLOW_CONTROL = Boolean.parseBoolean(str);
    }

    @CheckReturnValue
    public static NettyChannelBuilder forAddress(SocketAddress socketAddress) {
        return new NettyChannelBuilder(socketAddress);
    }

    @CheckReturnValue
    public static NettyChannelBuilder forAddress(String str, int i) {
        return forTarget(GrpcUtil.authorityFromHostAndPort(str, i));
    }

    @CheckReturnValue
    public static NettyChannelBuilder forAddress(String str, int i, ChannelCredentials channelCredentials) {
        return forTarget(GrpcUtil.authorityFromHostAndPort(str, i), channelCredentials);
    }

    @CheckReturnValue
    public static NettyChannelBuilder forTarget(String str) {
        return new NettyChannelBuilder(str);
    }

    @CheckReturnValue
    public static NettyChannelBuilder forTarget(String str, ChannelCredentials channelCredentials) {
        ProtocolNegotiators.FromChannelCredentialsResult from = ProtocolNegotiators.from(channelCredentials);
        if (from.error != null) {
            throw new IllegalArgumentException(from.error);
        }
        return new NettyChannelBuilder(str, from.negotiator, from.callCredentials);
    }

    /* loaded from: classes4.dex */
    private final class NettyChannelTransportFactoryBuilder implements ManagedChannelImplBuilder.ClientTransportFactoryBuilder {
        private NettyChannelTransportFactoryBuilder() {
        }

        /* synthetic */ NettyChannelTransportFactoryBuilder(NettyChannelBuilder nettyChannelBuilder, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // io.grpc.internal.ManagedChannelImplBuilder.ClientTransportFactoryBuilder
        public ClientTransportFactory buildClientTransportFactory() {
            return NettyChannelBuilder.this.buildTransportFactory();
        }
    }

    /* loaded from: classes4.dex */
    private final class NettyChannelDefaultPortProvider implements ManagedChannelImplBuilder.ChannelBuilderDefaultPortProvider {
        private NettyChannelDefaultPortProvider() {
        }

        /* synthetic */ NettyChannelDefaultPortProvider(NettyChannelBuilder nettyChannelBuilder, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // io.grpc.internal.ManagedChannelImplBuilder.ChannelBuilderDefaultPortProvider
        public int getDefaultPort() {
            return NettyChannelBuilder.this.protocolNegotiatorFactory.getDefaultPort();
        }
    }

    @CheckReturnValue
    NettyChannelBuilder(String str) {
        this.transportTracerFactory = TransportTracer.getDefaultFactory();
        this.channelOptions = new HashMap();
        this.channelFactory = DEFAULT_CHANNEL_FACTORY;
        this.eventLoopGroupPool = DEFAULT_EVENT_LOOP_GROUP_POOL;
        this.autoFlowControl = DEFAULT_AUTO_FLOW_CONTROL;
        this.flowControlWindow = 1048576;
        this.maxInboundMessageSize = 4194304;
        this.maxHeaderListSize = 8192;
        this.keepAliveTimeNanos = Long.MAX_VALUE;
        this.keepAliveTimeoutNanos = GrpcUtil.DEFAULT_KEEPALIVE_TIMEOUT_NANOS;
        this.protocolNegotiatorFactory = new DefaultProtocolNegotiator(this, null);
        this.useGetForSafeMethods = false;
        this.managedChannelImplBuilder = new ManagedChannelImplBuilder(str, new NettyChannelTransportFactoryBuilder(this, null), new NettyChannelDefaultPortProvider(this, null));
        this.freezeProtocolNegotiatorFactory = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckReturnValue
    public NettyChannelBuilder(String str, ProtocolNegotiator.ClientFactory clientFactory, @Nullable CallCredentials callCredentials) {
        this.transportTracerFactory = TransportTracer.getDefaultFactory();
        this.channelOptions = new HashMap();
        this.channelFactory = DEFAULT_CHANNEL_FACTORY;
        this.eventLoopGroupPool = DEFAULT_EVENT_LOOP_GROUP_POOL;
        this.autoFlowControl = DEFAULT_AUTO_FLOW_CONTROL;
        this.flowControlWindow = 1048576;
        this.maxInboundMessageSize = 4194304;
        this.maxHeaderListSize = 8192;
        this.keepAliveTimeNanos = Long.MAX_VALUE;
        this.keepAliveTimeoutNanos = GrpcUtil.DEFAULT_KEEPALIVE_TIMEOUT_NANOS;
        this.protocolNegotiatorFactory = new DefaultProtocolNegotiator(this, null);
        this.useGetForSafeMethods = false;
        this.managedChannelImplBuilder = new ManagedChannelImplBuilder(str, callCredentials, new NettyChannelTransportFactoryBuilder(this, null), new NettyChannelDefaultPortProvider(this, null));
        this.protocolNegotiatorFactory = (ProtocolNegotiator.ClientFactory) Preconditions.checkNotNull(clientFactory, "negotiator");
        this.freezeProtocolNegotiatorFactory = true;
    }

    @CheckReturnValue
    NettyChannelBuilder(SocketAddress socketAddress) {
        this.transportTracerFactory = TransportTracer.getDefaultFactory();
        this.channelOptions = new HashMap();
        this.channelFactory = DEFAULT_CHANNEL_FACTORY;
        this.eventLoopGroupPool = DEFAULT_EVENT_LOOP_GROUP_POOL;
        this.autoFlowControl = DEFAULT_AUTO_FLOW_CONTROL;
        this.flowControlWindow = 1048576;
        this.maxInboundMessageSize = 4194304;
        this.maxHeaderListSize = 8192;
        this.keepAliveTimeNanos = Long.MAX_VALUE;
        this.keepAliveTimeoutNanos = GrpcUtil.DEFAULT_KEEPALIVE_TIMEOUT_NANOS;
        this.protocolNegotiatorFactory = new DefaultProtocolNegotiator(this, null);
        this.useGetForSafeMethods = false;
        this.managedChannelImplBuilder = new ManagedChannelImplBuilder(socketAddress, getAuthorityFromAddress(socketAddress), new NettyChannelTransportFactoryBuilder(this, null), new NettyChannelDefaultPortProvider(this, null));
        this.freezeProtocolNegotiatorFactory = false;
    }

    @Override // io.grpc.internal.AbstractManagedChannelImplBuilder
    protected ManagedChannelBuilder<?> delegate() {
        return this.managedChannelImplBuilder;
    }

    @CheckReturnValue
    private static String getAuthorityFromAddress(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            return GrpcUtil.authorityFromHostAndPort(inetSocketAddress.getHostString(), inetSocketAddress.getPort());
        }
        return socketAddress.toString();
    }

    public NettyChannelBuilder channelType(Class<? extends Channel> cls) {
        Preconditions.checkNotNull(cls, "channelType");
        return channelFactory(new ReflectiveChannelFactory(cls));
    }

    public NettyChannelBuilder channelFactory(ChannelFactory<? extends Channel> channelFactory) {
        this.channelFactory = (ChannelFactory) Preconditions.checkNotNull(channelFactory, "channelFactory");
        return this;
    }

    public <T> NettyChannelBuilder withOption(ChannelOption<T> channelOption, T t) {
        this.channelOptions.put(channelOption, t);
        return this;
    }

    public NettyChannelBuilder negotiationType(NegotiationType negotiationType) {
        Preconditions.checkState(!this.freezeProtocolNegotiatorFactory, "Cannot change security when using ChannelCredentials");
        ProtocolNegotiator.ClientFactory clientFactory = this.protocolNegotiatorFactory;
        if (clientFactory instanceof DefaultProtocolNegotiator) {
            ((DefaultProtocolNegotiator) clientFactory).negotiationType = negotiationType;
            return this;
        }
        return this;
    }

    public NettyChannelBuilder eventLoopGroup(@Nullable EventLoopGroup eventLoopGroup) {
        if (eventLoopGroup != null) {
            return eventLoopGroupPool(new FixedObjectPool(eventLoopGroup));
        }
        return eventLoopGroupPool(DEFAULT_EVENT_LOOP_GROUP_POOL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NettyChannelBuilder eventLoopGroupPool(ObjectPool<? extends EventLoopGroup> objectPool) {
        this.eventLoopGroupPool = (ObjectPool) Preconditions.checkNotNull(objectPool, "eventLoopGroupPool");
        return this;
    }

    public NettyChannelBuilder sslContext(SslContext sslContext) {
        Preconditions.checkState(!this.freezeProtocolNegotiatorFactory, "Cannot change security when using ChannelCredentials");
        if (sslContext != null) {
            Preconditions.checkArgument(sslContext.isClient(), "Server SSL context can not be used for client channel");
            GrpcSslContexts.ensureAlpnAndH2Enabled(sslContext.applicationProtocolNegotiator());
        }
        ProtocolNegotiator.ClientFactory clientFactory = this.protocolNegotiatorFactory;
        if (clientFactory instanceof DefaultProtocolNegotiator) {
            ((DefaultProtocolNegotiator) clientFactory).sslContext = sslContext;
            return this;
        }
        return this;
    }

    public NettyChannelBuilder initialFlowControlWindow(int i) {
        Preconditions.checkArgument(i > 0, "initialFlowControlWindow must be positive");
        this.flowControlWindow = i;
        this.autoFlowControl = true;
        return this;
    }

    public NettyChannelBuilder flowControlWindow(int i) {
        Preconditions.checkArgument(i > 0, "flowControlWindow must be positive");
        this.flowControlWindow = i;
        this.autoFlowControl = false;
        return this;
    }

    @Deprecated
    public NettyChannelBuilder maxHeaderListSize(int i) {
        return maxInboundMetadataSize(i);
    }

    @Override // io.grpc.internal.AbstractManagedChannelImplBuilder, io.grpc.ManagedChannelBuilder
    public NettyChannelBuilder maxInboundMetadataSize(int i) {
        Preconditions.checkArgument(i > 0, "maxInboundMetadataSize must be > 0");
        this.maxHeaderListSize = i;
        return this;
    }

    @Override // io.grpc.internal.AbstractManagedChannelImplBuilder, io.grpc.ManagedChannelBuilder
    public NettyChannelBuilder usePlaintext() {
        negotiationType(NegotiationType.PLAINTEXT);
        return this;
    }

    @Override // io.grpc.internal.AbstractManagedChannelImplBuilder, io.grpc.ManagedChannelBuilder
    public NettyChannelBuilder useTransportSecurity() {
        negotiationType(NegotiationType.TLS);
        return this;
    }

    @Override // io.grpc.internal.AbstractManagedChannelImplBuilder, io.grpc.ManagedChannelBuilder
    public NettyChannelBuilder keepAliveTime(long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j);
        this.keepAliveTimeNanos = nanos;
        long clampKeepAliveTimeInNanos = KeepAliveManager.clampKeepAliveTimeInNanos(nanos);
        this.keepAliveTimeNanos = clampKeepAliveTimeInNanos;
        if (clampKeepAliveTimeInNanos >= AS_LARGE_AS_INFINITE) {
            this.keepAliveTimeNanos = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // io.grpc.internal.AbstractManagedChannelImplBuilder, io.grpc.ManagedChannelBuilder
    public NettyChannelBuilder keepAliveTimeout(long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j > 0, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j);
        this.keepAliveTimeoutNanos = nanos;
        this.keepAliveTimeoutNanos = KeepAliveManager.clampKeepAliveTimeoutInNanos(nanos);
        return this;
    }

    @Override // io.grpc.internal.AbstractManagedChannelImplBuilder, io.grpc.ManagedChannelBuilder
    public NettyChannelBuilder keepAliveWithoutCalls(boolean z) {
        this.keepAliveWithoutCalls = z;
        return this;
    }

    public NettyChannelBuilder localSocketPicker(@Nullable LocalSocketPicker localSocketPicker) {
        this.localSocketPicker = localSocketPicker;
        return this;
    }

    @Override // io.grpc.internal.AbstractManagedChannelImplBuilder, io.grpc.ManagedChannelBuilder
    public NettyChannelBuilder maxInboundMessageSize(int i) {
        Preconditions.checkArgument(i >= 0, "negative max");
        this.maxInboundMessageSize = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckReturnValue
    public ClientTransportFactory buildTransportFactory() {
        assertEventLoopAndChannelType();
        return new NettyTransportFactory(this.protocolNegotiatorFactory.newNegotiator(), this.channelFactory, this.channelOptions, this.eventLoopGroupPool, this.autoFlowControl, this.flowControlWindow, this.maxInboundMessageSize, this.maxHeaderListSize, this.keepAliveTimeNanos, this.keepAliveTimeoutNanos, this.keepAliveWithoutCalls, this.transportTracerFactory, this.localSocketPicker, false);
    }

    void assertEventLoopAndChannelType() {
        ChannelFactory<? extends Channel> channelFactory = this.channelFactory;
        ChannelFactory<? extends Channel> channelFactory2 = DEFAULT_CHANNEL_FACTORY;
        boolean z = true;
        boolean z2 = (channelFactory == channelFactory2 || this.eventLoopGroupPool == DEFAULT_EVENT_LOOP_GROUP_POOL) ? false : true;
        boolean z3 = channelFactory == channelFactory2 && this.eventLoopGroupPool == DEFAULT_EVENT_LOOP_GROUP_POOL;
        if (!z2 && !z3) {
            z = false;
        }
        Preconditions.checkState(z, "Both EventLoopGroup and ChannelType should be provided or neither should be");
    }

    @CheckReturnValue
    int getDefaultPort() {
        return this.protocolNegotiatorFactory.getDefaultPort();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$grpc$netty$NegotiationType;

        static {
            int[] iArr = new int[NegotiationType.values().length];
            $SwitchMap$io$grpc$netty$NegotiationType = iArr;
            try {
                iArr[NegotiationType.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$grpc$netty$NegotiationType[NegotiationType.PLAINTEXT_UPGRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$grpc$netty$NegotiationType[NegotiationType.TLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @CheckReturnValue
    static ProtocolNegotiator createProtocolNegotiatorByType(NegotiationType negotiationType, SslContext sslContext, ObjectPool<? extends Executor> objectPool) {
        int i = AnonymousClass1.$SwitchMap$io$grpc$netty$NegotiationType[negotiationType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return ProtocolNegotiators.tls(sslContext, objectPool);
                }
                throw new IllegalArgumentException("Unsupported negotiationType: " + negotiationType);
            }
            return ProtocolNegotiators.plaintextUpgrade();
        }
        return ProtocolNegotiators.plaintext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NettyChannelBuilder disableCheckAuthority() {
        this.managedChannelImplBuilder.disableCheckAuthority();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NettyChannelBuilder enableCheckAuthority() {
        this.managedChannelImplBuilder.enableCheckAuthority();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void protocolNegotiatorFactory(ProtocolNegotiator.ClientFactory clientFactory) {
        Preconditions.checkState(!this.freezeProtocolNegotiatorFactory, "Cannot change security when using ChannelCredentials");
        this.protocolNegotiatorFactory = (ProtocolNegotiator.ClientFactory) Preconditions.checkNotNull(clientFactory, "protocolNegotiatorFactory");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTracingEnabled(boolean z) {
        this.managedChannelImplBuilder.setTracingEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStatsEnabled(boolean z) {
        this.managedChannelImplBuilder.setStatsEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStatsRecordStartedRpcs(boolean z) {
        this.managedChannelImplBuilder.setStatsRecordStartedRpcs(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStatsRecordFinishedRpcs(boolean z) {
        this.managedChannelImplBuilder.setStatsRecordFinishedRpcs(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStatsRecordRealTimeMetrics(boolean z) {
        this.managedChannelImplBuilder.setStatsRecordRealTimeMetrics(z);
    }

    NettyChannelBuilder setTransportTracerFactory(TransportTracer.Factory factory) {
        this.transportTracerFactory = factory;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class DefaultProtocolNegotiator implements ProtocolNegotiator.ClientFactory {
        private NegotiationType negotiationType;
        private SslContext sslContext;

        private DefaultProtocolNegotiator() {
            this.negotiationType = NegotiationType.TLS;
        }

        /* synthetic */ DefaultProtocolNegotiator(NettyChannelBuilder nettyChannelBuilder, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public ProtocolNegotiator newNegotiator() {
            SslContext sslContext = this.sslContext;
            if (this.negotiationType == NegotiationType.TLS && sslContext == null) {
                try {
                    sslContext = GrpcSslContexts.forClient().build();
                } catch (SSLException e) {
                    throw new RuntimeException(e);
                }
            }
            return NettyChannelBuilder.createProtocolNegotiatorByType(this.negotiationType, sslContext, NettyChannelBuilder.this.managedChannelImplBuilder.getOffloadExecutorPool());
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public int getDefaultPort() {
            int i = AnonymousClass1.$SwitchMap$io$grpc$netty$NegotiationType[this.negotiationType.ordinal()];
            if (i == 1 || i == 2) {
                return 80;
            }
            if (i == 3) {
                return GrpcUtil.DEFAULT_PORT_SSL;
            }
            throw new AssertionError(this.negotiationType + " not handled");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckReturnValue
    /* loaded from: classes4.dex */
    public static final class NettyTransportFactory implements ClientTransportFactory {
        private final boolean autoFlowControl;
        private final ChannelFactory<? extends Channel> channelFactory;
        private final Map<ChannelOption<?>, ?> channelOptions;
        private boolean closed;
        private final int flowControlWindow;
        private final EventLoopGroup group;
        private final ObjectPool<? extends EventLoopGroup> groupPool;
        private final AtomicBackoff keepAliveTimeNanos;
        private final long keepAliveTimeoutNanos;
        private final boolean keepAliveWithoutCalls;
        private final LocalSocketPicker localSocketPicker;
        private final int maxHeaderListSize;
        private final int maxMessageSize;
        private final ProtocolNegotiator protocolNegotiator;
        private final TransportTracer.Factory transportTracerFactory;
        private final boolean useGetForSafeMethods;

        NettyTransportFactory(ProtocolNegotiator protocolNegotiator, ChannelFactory<? extends Channel> channelFactory, Map<ChannelOption<?>, ?> map, ObjectPool<? extends EventLoopGroup> objectPool, boolean z, int i, int i2, int i3, long j, long j2, boolean z2, TransportTracer.Factory factory, LocalSocketPicker localSocketPicker, boolean z3) {
            this.protocolNegotiator = (ProtocolNegotiator) Preconditions.checkNotNull(protocolNegotiator, "protocolNegotiator");
            this.channelFactory = channelFactory;
            this.channelOptions = new HashMap(map);
            this.groupPool = objectPool;
            this.group = objectPool.getObject();
            this.autoFlowControl = z;
            this.flowControlWindow = i;
            this.maxMessageSize = i2;
            this.maxHeaderListSize = i3;
            this.keepAliveTimeNanos = new AtomicBackoff("keepalive time nanos", j);
            this.keepAliveTimeoutNanos = j2;
            this.keepAliveWithoutCalls = z2;
            this.transportTracerFactory = factory;
            this.localSocketPicker = localSocketPicker != null ? localSocketPicker : new LocalSocketPicker();
            this.useGetForSafeMethods = z3;
        }

        @Override // io.grpc.internal.ClientTransportFactory
        public ConnectionClientTransport newClientTransport(SocketAddress socketAddress, ClientTransportFactory.ClientTransportOptions clientTransportOptions, ChannelLogger channelLogger) {
            InetSocketAddress inetSocketAddress;
            ProtocolNegotiator protocolNegotiator;
            Preconditions.checkState(!this.closed, "The transport factory is closed.");
            ProtocolNegotiator protocolNegotiator2 = this.protocolNegotiator;
            HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress = clientTransportOptions.getHttpConnectProxiedSocketAddress();
            if (httpConnectProxiedSocketAddress != null) {
                InetSocketAddress targetAddress = httpConnectProxiedSocketAddress.getTargetAddress();
                inetSocketAddress = targetAddress;
                protocolNegotiator = ProtocolNegotiators.httpProxy(httpConnectProxiedSocketAddress.getProxyAddress(), httpConnectProxiedSocketAddress.getUsername(), httpConnectProxiedSocketAddress.getPassword(), this.protocolNegotiator);
            } else {
                inetSocketAddress = socketAddress;
                protocolNegotiator = protocolNegotiator2;
            }
            final AtomicBackoff.State state = this.keepAliveTimeNanos.getState();
            return new NettyClientTransport(inetSocketAddress, this.channelFactory, this.channelOptions, this.group, protocolNegotiator, this.autoFlowControl, this.flowControlWindow, this.maxMessageSize, this.maxHeaderListSize, state.get(), this.keepAliveTimeoutNanos, this.keepAliveWithoutCalls, clientTransportOptions.getAuthority(), clientTransportOptions.getUserAgent(), new Runnable() { // from class: io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder.NettyTransportFactory.1
                @Override // java.lang.Runnable
                public void run() {
                    state.backoff();
                }
            }, this.transportTracerFactory.create(), clientTransportOptions.getEagAttributes(), this.localSocketPicker, channelLogger, this.useGetForSafeMethods);
        }

        @Override // io.grpc.internal.ClientTransportFactory
        public ScheduledExecutorService getScheduledExecutorService() {
            return this.group;
        }

        @Override // io.grpc.internal.ClientTransportFactory, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.protocolNegotiator.close();
            this.groupPool.returnObject(this.group);
        }
    }
}
