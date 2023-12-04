package io.grpc.netty.shaded.io.grpc.netty;

import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import io.grpc.ServerBuilder;
import io.grpc.ServerCredentials;
import io.grpc.ServerStreamTracer;
import io.grpc.internal.AbstractServerImplBuilder;
import io.grpc.internal.FixedObjectPool;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.InternalServer;
import io.grpc.internal.KeepAliveManager;
import io.grpc.internal.ObjectPool;
import io.grpc.internal.ServerImplBuilder;
import io.grpc.internal.SharedResourcePool;
import io.grpc.internal.TransportTracer;
import io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator;
import io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiators;
import io.grpc.netty.shaded.io.netty.channel.ChannelFactory;
import io.grpc.netty.shaded.io.netty.channel.ChannelOption;
import io.grpc.netty.shaded.io.netty.channel.EventLoopGroup;
import io.grpc.netty.shaded.io.netty.channel.ReflectiveChannelFactory;
import io.grpc.netty.shaded.io.netty.channel.ServerChannel;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContext;
import java.io.File;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckReturnValue;
import javax.net.ssl.SSLException;
/* loaded from: classes4.dex */
public final class NettyServerBuilder extends AbstractServerImplBuilder<NettyServerBuilder> {
    public static final int DEFAULT_FLOW_CONTROL_WINDOW = 1048576;
    static final long MAX_CONNECTION_AGE_GRACE_NANOS_INFINITE = Long.MAX_VALUE;
    static final long MAX_CONNECTION_AGE_NANOS_DISABLED = Long.MAX_VALUE;
    static final long MAX_CONNECTION_IDLE_NANOS_DISABLED = Long.MAX_VALUE;
    private boolean autoFlowControl;
    private ObjectPool<? extends EventLoopGroup> bossEventLoopGroupPool;
    private ChannelFactory<? extends ServerChannel> channelFactory;
    private final Map<ChannelOption<?>, Object> channelOptions;
    private final Map<ChannelOption<?>, Object> childChannelOptions;
    private Attributes eagAttributes;
    private int flowControlWindow;
    private boolean forceHeapBuffer;
    private final boolean freezeProtocolNegotiatorFactory;
    private long keepAliveTimeInNanos;
    private long keepAliveTimeoutInNanos;
    private final List<SocketAddress> listenAddresses;
    private int maxConcurrentCallsPerConnection;
    private long maxConnectionAgeGraceInNanos;
    private long maxConnectionAgeInNanos;
    private long maxConnectionIdleInNanos;
    private int maxHeaderListSize;
    private int maxMessageSize;
    private long permitKeepAliveTimeInNanos;
    private boolean permitKeepAliveWithoutCalls;
    private ProtocolNegotiator.ServerFactory protocolNegotiatorFactory;
    private final ServerImplBuilder serverImplBuilder;
    private TransportTracer.Factory transportTracerFactory;
    private ObjectPool<? extends EventLoopGroup> workerEventLoopGroupPool;
    private static final long MIN_KEEPALIVE_TIME_NANO = TimeUnit.MILLISECONDS.toNanos(1);
    private static final long MIN_KEEPALIVE_TIMEOUT_NANO = TimeUnit.MICROSECONDS.toNanos(499);
    private static final long MIN_MAX_CONNECTION_IDLE_NANO = TimeUnit.SECONDS.toNanos(1);
    private static final long MIN_MAX_CONNECTION_AGE_NANO = TimeUnit.SECONDS.toNanos(1);
    private static final long AS_LARGE_AS_INFINITE = TimeUnit.DAYS.toNanos(1000);
    private static final ObjectPool<? extends EventLoopGroup> DEFAULT_BOSS_EVENT_LOOP_GROUP_POOL = SharedResourcePool.forResource(Utils.DEFAULT_BOSS_EVENT_LOOP_GROUP);
    private static final ObjectPool<? extends EventLoopGroup> DEFAULT_WORKER_EVENT_LOOP_GROUP_POOL = SharedResourcePool.forResource(Utils.DEFAULT_WORKER_EVENT_LOOP_GROUP);

    @CheckReturnValue
    public static NettyServerBuilder forPort(int i) {
        return forAddress(new InetSocketAddress(i));
    }

    @CheckReturnValue
    public static NettyServerBuilder forPort(int i, ServerCredentials serverCredentials) {
        return forAddress(new InetSocketAddress(i), serverCredentials);
    }

    @CheckReturnValue
    public static NettyServerBuilder forAddress(SocketAddress socketAddress) {
        return new NettyServerBuilder(socketAddress);
    }

    @CheckReturnValue
    public static NettyServerBuilder forAddress(SocketAddress socketAddress, ServerCredentials serverCredentials) {
        ProtocolNegotiators.FromServerCredentialsResult from = ProtocolNegotiators.from(serverCredentials);
        if (from.error != null) {
            throw new IllegalArgumentException(from.error);
        }
        return new NettyServerBuilder(socketAddress, from.negotiator);
    }

    /* loaded from: classes4.dex */
    private final class NettyClientTransportServersBuilder implements ServerImplBuilder.ClientTransportServersBuilder {
        private NettyClientTransportServersBuilder() {
        }

        @Override // io.grpc.internal.ServerImplBuilder.ClientTransportServersBuilder
        public List<? extends InternalServer> buildClientTransportServers(List<? extends ServerStreamTracer.Factory> list) {
            return NettyServerBuilder.this.buildTransportServers(list);
        }
    }

    @CheckReturnValue
    private NettyServerBuilder(SocketAddress socketAddress) {
        ArrayList arrayList = new ArrayList();
        this.listenAddresses = arrayList;
        this.transportTracerFactory = TransportTracer.getDefaultFactory();
        this.channelFactory = Utils.DEFAULT_SERVER_CHANNEL_FACTORY;
        this.channelOptions = new HashMap();
        this.childChannelOptions = new HashMap();
        this.bossEventLoopGroupPool = DEFAULT_BOSS_EVENT_LOOP_GROUP_POOL;
        this.workerEventLoopGroupPool = DEFAULT_WORKER_EVENT_LOOP_GROUP_POOL;
        this.maxConcurrentCallsPerConnection = Integer.MAX_VALUE;
        this.autoFlowControl = true;
        this.flowControlWindow = 1048576;
        this.maxMessageSize = 4194304;
        this.maxHeaderListSize = 8192;
        this.keepAliveTimeInNanos = GrpcUtil.DEFAULT_SERVER_KEEPALIVE_TIME_NANOS;
        this.keepAliveTimeoutInNanos = GrpcUtil.DEFAULT_SERVER_KEEPALIVE_TIMEOUT_NANOS;
        this.maxConnectionIdleInNanos = Long.MAX_VALUE;
        this.maxConnectionAgeInNanos = Long.MAX_VALUE;
        this.maxConnectionAgeGraceInNanos = Long.MAX_VALUE;
        this.permitKeepAliveTimeInNanos = TimeUnit.MINUTES.toNanos(5L);
        this.eagAttributes = Attributes.EMPTY;
        this.serverImplBuilder = new ServerImplBuilder(new NettyClientTransportServersBuilder());
        arrayList.add(socketAddress);
        this.protocolNegotiatorFactory = ProtocolNegotiators.serverPlaintextFactory();
        this.freezeProtocolNegotiatorFactory = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckReturnValue
    public NettyServerBuilder(SocketAddress socketAddress, ProtocolNegotiator.ServerFactory serverFactory) {
        ArrayList arrayList = new ArrayList();
        this.listenAddresses = arrayList;
        this.transportTracerFactory = TransportTracer.getDefaultFactory();
        this.channelFactory = Utils.DEFAULT_SERVER_CHANNEL_FACTORY;
        this.channelOptions = new HashMap();
        this.childChannelOptions = new HashMap();
        this.bossEventLoopGroupPool = DEFAULT_BOSS_EVENT_LOOP_GROUP_POOL;
        this.workerEventLoopGroupPool = DEFAULT_WORKER_EVENT_LOOP_GROUP_POOL;
        this.maxConcurrentCallsPerConnection = Integer.MAX_VALUE;
        this.autoFlowControl = true;
        this.flowControlWindow = 1048576;
        this.maxMessageSize = 4194304;
        this.maxHeaderListSize = 8192;
        this.keepAliveTimeInNanos = GrpcUtil.DEFAULT_SERVER_KEEPALIVE_TIME_NANOS;
        this.keepAliveTimeoutInNanos = GrpcUtil.DEFAULT_SERVER_KEEPALIVE_TIMEOUT_NANOS;
        this.maxConnectionIdleInNanos = Long.MAX_VALUE;
        this.maxConnectionAgeInNanos = Long.MAX_VALUE;
        this.maxConnectionAgeGraceInNanos = Long.MAX_VALUE;
        this.permitKeepAliveTimeInNanos = TimeUnit.MINUTES.toNanos(5L);
        this.eagAttributes = Attributes.EMPTY;
        this.serverImplBuilder = new ServerImplBuilder(new NettyClientTransportServersBuilder());
        arrayList.add(socketAddress);
        this.protocolNegotiatorFactory = (ProtocolNegotiator.ServerFactory) Preconditions.checkNotNull(serverFactory, "negotiatorFactory");
        this.freezeProtocolNegotiatorFactory = true;
    }

    @Override // io.grpc.internal.AbstractServerImplBuilder
    protected ServerBuilder<?> delegate() {
        return this.serverImplBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NettyServerBuilder addListenAddress(SocketAddress socketAddress) {
        this.listenAddresses.add(Preconditions.checkNotNull(socketAddress, "listenAddress"));
        return this;
    }

    public NettyServerBuilder channelType(Class<? extends ServerChannel> cls) {
        Preconditions.checkNotNull(cls, "channelType");
        return channelFactory(new ReflectiveChannelFactory(cls));
    }

    public NettyServerBuilder channelFactory(ChannelFactory<? extends ServerChannel> channelFactory) {
        this.channelFactory = (ChannelFactory) Preconditions.checkNotNull(channelFactory, "channelFactory");
        return this;
    }

    public <T> NettyServerBuilder withOption(ChannelOption<T> channelOption, T t) {
        this.channelOptions.put(channelOption, t);
        return this;
    }

    public <T> NettyServerBuilder withChildOption(ChannelOption<T> channelOption, T t) {
        this.childChannelOptions.put(channelOption, t);
        return this;
    }

    public NettyServerBuilder bossEventLoopGroup(EventLoopGroup eventLoopGroup) {
        if (eventLoopGroup != null) {
            return bossEventLoopGroupPool(new FixedObjectPool(eventLoopGroup));
        }
        return bossEventLoopGroupPool(DEFAULT_BOSS_EVENT_LOOP_GROUP_POOL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NettyServerBuilder bossEventLoopGroupPool(ObjectPool<? extends EventLoopGroup> objectPool) {
        this.bossEventLoopGroupPool = (ObjectPool) Preconditions.checkNotNull(objectPool, "bossEventLoopGroupPool");
        return this;
    }

    public NettyServerBuilder workerEventLoopGroup(EventLoopGroup eventLoopGroup) {
        if (eventLoopGroup != null) {
            return workerEventLoopGroupPool(new FixedObjectPool(eventLoopGroup));
        }
        return workerEventLoopGroupPool(DEFAULT_WORKER_EVENT_LOOP_GROUP_POOL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NettyServerBuilder workerEventLoopGroupPool(ObjectPool<? extends EventLoopGroup> objectPool) {
        this.workerEventLoopGroupPool = (ObjectPool) Preconditions.checkNotNull(objectPool, "workerEventLoopGroupPool");
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setForceHeapBuffer(boolean z) {
        this.forceHeapBuffer = z;
    }

    public NettyServerBuilder sslContext(SslContext sslContext) {
        Preconditions.checkState(!this.freezeProtocolNegotiatorFactory, "Cannot change security when using ServerCredentials");
        if (sslContext != null) {
            Preconditions.checkArgument(sslContext.isServer(), "Client SSL context can not be used for server");
            GrpcSslContexts.ensureAlpnAndH2Enabled(sslContext.applicationProtocolNegotiator());
            this.protocolNegotiatorFactory = ProtocolNegotiators.serverTlsFactory(sslContext);
        } else {
            this.protocolNegotiatorFactory = ProtocolNegotiators.serverPlaintextFactory();
        }
        return this;
    }

    public final NettyServerBuilder protocolNegotiator(ProtocolNegotiator protocolNegotiator) {
        Preconditions.checkState(!this.freezeProtocolNegotiatorFactory, "Cannot change security when using ServerCredentials");
        this.protocolNegotiatorFactory = ProtocolNegotiators.fixedServerFactory(protocolNegotiator);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTracingEnabled(boolean z) {
        this.serverImplBuilder.setTracingEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStatsEnabled(boolean z) {
        this.serverImplBuilder.setStatsEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStatsRecordStartedRpcs(boolean z) {
        this.serverImplBuilder.setStatsRecordStartedRpcs(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStatsRecordRealTimeMetrics(boolean z) {
        this.serverImplBuilder.setStatsRecordRealTimeMetrics(z);
    }

    public NettyServerBuilder maxConcurrentCallsPerConnection(int i) {
        Preconditions.checkArgument(i > 0, "max must be positive: %s", i);
        this.maxConcurrentCallsPerConnection = i;
        return this;
    }

    public NettyServerBuilder initialFlowControlWindow(int i) {
        Preconditions.checkArgument(i > 0, "initialFlowControlWindow must be positive");
        this.flowControlWindow = i;
        this.autoFlowControl = true;
        return this;
    }

    public NettyServerBuilder flowControlWindow(int i) {
        Preconditions.checkArgument(i > 0, "flowControlWindow must be positive: %s", i);
        this.flowControlWindow = i;
        this.autoFlowControl = false;
        return this;
    }

    @Deprecated
    public NettyServerBuilder maxMessageSize(int i) {
        return maxInboundMessageSize(i);
    }

    @Override // io.grpc.internal.AbstractServerImplBuilder, io.grpc.ServerBuilder
    public NettyServerBuilder maxInboundMessageSize(int i) {
        Preconditions.checkArgument(i >= 0, "bytes must be non-negative: %s", i);
        this.maxMessageSize = i;
        return this;
    }

    @Deprecated
    public NettyServerBuilder maxHeaderListSize(int i) {
        return maxInboundMetadataSize(i);
    }

    @Override // io.grpc.internal.AbstractServerImplBuilder, io.grpc.ServerBuilder
    public NettyServerBuilder maxInboundMetadataSize(int i) {
        Preconditions.checkArgument(i > 0, "maxInboundMetadataSize must be positive: %s", i);
        this.maxHeaderListSize = i;
        return this;
    }

    public NettyServerBuilder keepAliveTime(long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j > 0, "keepalive time must be positive：%s", j);
        long nanos = timeUnit.toNanos(j);
        this.keepAliveTimeInNanos = nanos;
        long clampKeepAliveTimeInNanos = KeepAliveManager.clampKeepAliveTimeInNanos(nanos);
        this.keepAliveTimeInNanos = clampKeepAliveTimeInNanos;
        if (clampKeepAliveTimeInNanos >= AS_LARGE_AS_INFINITE) {
            this.keepAliveTimeInNanos = Long.MAX_VALUE;
        }
        long j2 = this.keepAliveTimeInNanos;
        long j3 = MIN_KEEPALIVE_TIME_NANO;
        if (j2 < j3) {
            this.keepAliveTimeInNanos = j3;
        }
        return this;
    }

    public NettyServerBuilder keepAliveTimeout(long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j > 0, "keepalive timeout must be positive: %s", j);
        long nanos = timeUnit.toNanos(j);
        this.keepAliveTimeoutInNanos = nanos;
        long clampKeepAliveTimeoutInNanos = KeepAliveManager.clampKeepAliveTimeoutInNanos(nanos);
        this.keepAliveTimeoutInNanos = clampKeepAliveTimeoutInNanos;
        long j2 = MIN_KEEPALIVE_TIMEOUT_NANO;
        if (clampKeepAliveTimeoutInNanos < j2) {
            this.keepAliveTimeoutInNanos = j2;
        }
        return this;
    }

    public NettyServerBuilder maxConnectionIdle(long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j > 0, "max connection idle must be positive: %s", j);
        long nanos = timeUnit.toNanos(j);
        this.maxConnectionIdleInNanos = nanos;
        if (nanos >= AS_LARGE_AS_INFINITE) {
            this.maxConnectionIdleInNanos = Long.MAX_VALUE;
        }
        long j2 = this.maxConnectionIdleInNanos;
        long j3 = MIN_MAX_CONNECTION_IDLE_NANO;
        if (j2 < j3) {
            this.maxConnectionIdleInNanos = j3;
        }
        return this;
    }

    public NettyServerBuilder maxConnectionAge(long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j > 0, "max connection age must be positive: %s", j);
        long nanos = timeUnit.toNanos(j);
        this.maxConnectionAgeInNanos = nanos;
        if (nanos >= AS_LARGE_AS_INFINITE) {
            this.maxConnectionAgeInNanos = Long.MAX_VALUE;
        }
        long j2 = this.maxConnectionAgeInNanos;
        long j3 = MIN_MAX_CONNECTION_AGE_NANO;
        if (j2 < j3) {
            this.maxConnectionAgeInNanos = j3;
        }
        return this;
    }

    public NettyServerBuilder maxConnectionAgeGrace(long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j >= 0, "max connection age grace must be non-negative: %s", j);
        long nanos = timeUnit.toNanos(j);
        this.maxConnectionAgeGraceInNanos = nanos;
        if (nanos >= AS_LARGE_AS_INFINITE) {
            this.maxConnectionAgeGraceInNanos = Long.MAX_VALUE;
        }
        return this;
    }

    public NettyServerBuilder permitKeepAliveTime(long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j >= 0, "permit keepalive time must be non-negative: %s", j);
        this.permitKeepAliveTimeInNanos = timeUnit.toNanos(j);
        return this;
    }

    public NettyServerBuilder permitKeepAliveWithoutCalls(boolean z) {
        this.permitKeepAliveWithoutCalls = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void eagAttributes(Attributes attributes) {
        this.eagAttributes = (Attributes) Preconditions.checkNotNull(attributes, "eagAttributes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckReturnValue
    public List<NettyServer> buildTransportServers(List<? extends ServerStreamTracer.Factory> list) {
        NettyServerBuilder nettyServerBuilder = this;
        assertEventLoopsAndChannelType();
        ProtocolNegotiator newNegotiator = nettyServerBuilder.protocolNegotiatorFactory.newNegotiator(nettyServerBuilder.serverImplBuilder.getExecutorPool());
        ArrayList arrayList = new ArrayList(nettyServerBuilder.listenAddresses.size());
        for (SocketAddress socketAddress : nettyServerBuilder.listenAddresses) {
            arrayList.add(new NettyServer(socketAddress, nettyServerBuilder.channelFactory, nettyServerBuilder.channelOptions, nettyServerBuilder.childChannelOptions, nettyServerBuilder.bossEventLoopGroupPool, nettyServerBuilder.workerEventLoopGroupPool, nettyServerBuilder.forceHeapBuffer, newNegotiator, list, nettyServerBuilder.transportTracerFactory, nettyServerBuilder.maxConcurrentCallsPerConnection, nettyServerBuilder.autoFlowControl, nettyServerBuilder.flowControlWindow, nettyServerBuilder.maxMessageSize, nettyServerBuilder.maxHeaderListSize, nettyServerBuilder.keepAliveTimeInNanos, nettyServerBuilder.keepAliveTimeoutInNanos, nettyServerBuilder.maxConnectionIdleInNanos, nettyServerBuilder.maxConnectionAgeInNanos, nettyServerBuilder.maxConnectionAgeGraceInNanos, nettyServerBuilder.permitKeepAliveWithoutCalls, nettyServerBuilder.permitKeepAliveTimeInNanos, nettyServerBuilder.eagAttributes, nettyServerBuilder.serverImplBuilder.getChannelz()));
            nettyServerBuilder = this;
        }
        return Collections.unmodifiableList(arrayList);
    }

    void assertEventLoopsAndChannelType() {
        boolean z = true;
        boolean z2 = (this.channelFactory == Utils.DEFAULT_SERVER_CHANNEL_FACTORY || this.bossEventLoopGroupPool == DEFAULT_BOSS_EVENT_LOOP_GROUP_POOL || this.workerEventLoopGroupPool == DEFAULT_WORKER_EVENT_LOOP_GROUP_POOL) ? false : true;
        boolean z3 = this.channelFactory == Utils.DEFAULT_SERVER_CHANNEL_FACTORY && this.bossEventLoopGroupPool == DEFAULT_BOSS_EVENT_LOOP_GROUP_POOL && this.workerEventLoopGroupPool == DEFAULT_WORKER_EVENT_LOOP_GROUP_POOL;
        if (!z2 && !z3) {
            z = false;
        }
        Preconditions.checkState(z, "All of BossEventLoopGroup, WorkerEventLoopGroup and ChannelType should be provided or neither should be");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NettyServerBuilder setTransportTracerFactory(TransportTracer.Factory factory) {
        this.transportTracerFactory = factory;
        return this;
    }

    @Override // io.grpc.internal.AbstractServerImplBuilder, io.grpc.ServerBuilder
    public NettyServerBuilder useTransportSecurity(File file, File file2) {
        Preconditions.checkState(!this.freezeProtocolNegotiatorFactory, "Cannot change security when using ServerCredentials");
        try {
            this.protocolNegotiatorFactory = ProtocolNegotiators.serverTlsFactory(GrpcSslContexts.forServer(file, file2).build());
            return this;
        } catch (SSLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // io.grpc.internal.AbstractServerImplBuilder, io.grpc.ServerBuilder
    public NettyServerBuilder useTransportSecurity(InputStream inputStream, InputStream inputStream2) {
        Preconditions.checkState(!this.freezeProtocolNegotiatorFactory, "Cannot change security when using ServerCredentials");
        try {
            this.protocolNegotiatorFactory = ProtocolNegotiators.serverTlsFactory(GrpcSslContexts.forServer(inputStream, inputStream2).build());
            return this;
        } catch (SSLException e) {
            throw new RuntimeException(e);
        }
    }
}
