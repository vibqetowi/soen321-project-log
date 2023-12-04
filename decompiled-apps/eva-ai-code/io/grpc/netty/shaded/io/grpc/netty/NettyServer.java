package io.grpc.netty.shaded.io.grpc.netty;

import com.appsflyer.AppsFlyerProperties;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Attributes;
import io.grpc.InternalChannelz;
import io.grpc.InternalInstrumented;
import io.grpc.InternalLogId;
import io.grpc.InternalWithLogId;
import io.grpc.ServerStreamTracer;
import io.grpc.internal.InternalServer;
import io.grpc.internal.ObjectPool;
import io.grpc.internal.ServerListener;
import io.grpc.internal.TransportTracer;
import io.grpc.netty.shaded.io.netty.bootstrap.ServerBootstrap;
import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.channel.ChannelFactory;
import io.grpc.netty.shaded.io.netty.channel.ChannelFuture;
import io.grpc.netty.shaded.io.netty.channel.ChannelFutureListener;
import io.grpc.netty.shaded.io.netty.channel.ChannelInitializer;
import io.grpc.netty.shaded.io.netty.channel.ChannelOption;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
import io.grpc.netty.shaded.io.netty.channel.EventLoopGroup;
import io.grpc.netty.shaded.io.netty.channel.ServerChannel;
import io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted;
import io.grpc.netty.shaded.io.netty.util.ReferenceCounted;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class NettyServer implements InternalServer, InternalWithLogId {
    private static final Logger log = Logger.getLogger(InternalServer.class.getName());
    private final SocketAddress address;
    private final boolean autoFlowControl;
    private EventLoopGroup bossGroup;
    private final ObjectPool<? extends EventLoopGroup> bossGroupPool;
    private Channel channel;
    private final ChannelFactory<? extends ServerChannel> channelFactory;
    private final Map<ChannelOption<?>, ?> channelOptions;
    private final InternalChannelz channelz;
    private final Map<ChannelOption<?>, ?> childChannelOptions;
    private final Attributes eagAttributes;
    private final int flowControlWindow;
    private final boolean forceHeapBuffer;
    private final long keepAliveTimeInNanos;
    private final long keepAliveTimeoutInNanos;
    private volatile InternalInstrumented<InternalChannelz.SocketStats> listenSocketStats;
    private ServerListener listener;
    private final InternalLogId logId;
    private final long maxConnectionAgeGraceInNanos;
    private final long maxConnectionAgeInNanos;
    private final long maxConnectionIdleInNanos;
    private final int maxHeaderListSize;
    private final int maxMessageSize;
    private final int maxStreamsPerConnection;
    private final long permitKeepAliveTimeInNanos;
    private final boolean permitKeepAliveWithoutCalls;
    private final ProtocolNegotiator protocolNegotiator;
    private final ReferenceCounted sharedResourceReferenceCounter = new SharedResourceReferenceCounter();
    private final List<? extends ServerStreamTracer.Factory> streamTracerFactories;
    private final TransportTracer.Factory transportTracerFactory;
    private EventLoopGroup workerGroup;
    private final ObjectPool<? extends EventLoopGroup> workerGroupPool;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NettyServer(SocketAddress socketAddress, ChannelFactory<? extends ServerChannel> channelFactory, Map<ChannelOption<?>, ?> map, Map<ChannelOption<?>, ?> map2, ObjectPool<? extends EventLoopGroup> objectPool, ObjectPool<? extends EventLoopGroup> objectPool2, boolean z, ProtocolNegotiator protocolNegotiator, List<? extends ServerStreamTracer.Factory> list, TransportTracer.Factory factory, int i, boolean z2, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, boolean z3, long j6, Attributes attributes, InternalChannelz internalChannelz) {
        this.address = socketAddress;
        this.channelFactory = (ChannelFactory) Preconditions.checkNotNull(channelFactory, "channelFactory");
        Preconditions.checkNotNull(map, "channelOptions");
        this.channelOptions = new HashMap(map);
        Preconditions.checkNotNull(map2, "childChannelOptions");
        this.childChannelOptions = new HashMap(map2);
        this.bossGroupPool = (ObjectPool) Preconditions.checkNotNull(objectPool, "bossGroupPool");
        this.workerGroupPool = (ObjectPool) Preconditions.checkNotNull(objectPool2, "workerGroupPool");
        this.forceHeapBuffer = z;
        this.bossGroup = objectPool.getObject();
        this.workerGroup = objectPool2.getObject();
        this.protocolNegotiator = (ProtocolNegotiator) Preconditions.checkNotNull(protocolNegotiator, "protocolNegotiator");
        this.streamTracerFactories = (List) Preconditions.checkNotNull(list, "streamTracerFactories");
        this.transportTracerFactory = factory;
        this.maxStreamsPerConnection = i;
        this.autoFlowControl = z2;
        this.flowControlWindow = i2;
        this.maxMessageSize = i3;
        this.maxHeaderListSize = i4;
        this.keepAliveTimeInNanos = j;
        this.keepAliveTimeoutInNanos = j2;
        this.maxConnectionIdleInNanos = j3;
        this.maxConnectionAgeInNanos = j4;
        this.maxConnectionAgeGraceInNanos = j5;
        this.permitKeepAliveWithoutCalls = z3;
        this.permitKeepAliveTimeInNanos = j6;
        this.eagAttributes = (Attributes) Preconditions.checkNotNull(attributes, "eagAttributes");
        this.channelz = (InternalChannelz) Preconditions.checkNotNull(internalChannelz);
        this.logId = InternalLogId.allocate(getClass(), socketAddress != null ? socketAddress.toString() : "No address");
    }

    @Override // io.grpc.internal.InternalServer
    public SocketAddress getListenSocketAddress() {
        Channel channel = this.channel;
        if (channel == null) {
            return this.address;
        }
        return channel.localAddress();
    }

    @Override // io.grpc.internal.InternalServer
    public InternalInstrumented<InternalChannelz.SocketStats> getListenSocketStats() {
        return this.listenSocketStats;
    }

    @Override // io.grpc.internal.InternalServer
    public void start(ServerListener serverListener) throws IOException {
        this.listener = (ServerListener) Preconditions.checkNotNull(serverListener, "serverListener");
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.option(ChannelOption.ALLOCATOR, Utils.getByteBufAllocator(this.forceHeapBuffer));
        serverBootstrap.childOption(ChannelOption.ALLOCATOR, Utils.getByteBufAllocator(this.forceHeapBuffer));
        serverBootstrap.group(this.bossGroup, this.workerGroup);
        serverBootstrap.channelFactory((ChannelFactory) this.channelFactory);
        serverBootstrap.childOption(ChannelOption.SO_KEEPALIVE, true);
        Map<ChannelOption<?>, ?> map = this.channelOptions;
        if (map != null) {
            for (Map.Entry<ChannelOption<?>, ?> entry : map.entrySet()) {
                serverBootstrap.option(entry.getKey(), entry.getValue());
            }
        }
        Map<ChannelOption<?>, ?> map2 = this.childChannelOptions;
        if (map2 != null) {
            for (Map.Entry<ChannelOption<?>, ?> entry2 : map2.entrySet()) {
                serverBootstrap.childOption(entry2.getKey(), entry2.getValue());
            }
        }
        serverBootstrap.childHandler(new ChannelInitializer<Channel>() { // from class: io.grpc.netty.shaded.io.grpc.netty.NettyServer.1
            @Override // io.grpc.netty.shaded.io.netty.channel.ChannelInitializer
            public void initChannel(Channel channel) {
                ChannelPromise newPromise = channel.newPromise();
                long j = NettyServer.this.maxConnectionAgeInNanos;
                if (j != Long.MAX_VALUE) {
                    j = (long) (((Math.random() * 0.2d) + 0.9d) * j);
                }
                NettyServerTransport nettyServerTransport = new NettyServerTransport(channel, newPromise, NettyServer.this.protocolNegotiator, NettyServer.this.streamTracerFactories, NettyServer.this.transportTracerFactory.create(), NettyServer.this.maxStreamsPerConnection, NettyServer.this.autoFlowControl, NettyServer.this.flowControlWindow, NettyServer.this.maxMessageSize, NettyServer.this.maxHeaderListSize, NettyServer.this.keepAliveTimeInNanos, NettyServer.this.keepAliveTimeoutInNanos, NettyServer.this.maxConnectionIdleInNanos, j, NettyServer.this.maxConnectionAgeGraceInNanos, NettyServer.this.permitKeepAliveWithoutCalls, NettyServer.this.permitKeepAliveTimeInNanos, NettyServer.this.eagAttributes);
                synchronized (NettyServer.this) {
                    if (NettyServer.this.channel == null || NettyServer.this.channel.isOpen()) {
                        NettyServer.this.sharedResourceReferenceCounter.retain();
                        nettyServerTransport.start(NettyServer.this.listener.transportCreated(nettyServerTransport));
                        ChannelFutureListener channelFutureListener = new ChannelFutureListener() { // from class: io.grpc.netty.shaded.io.grpc.netty.NettyServer.1.1LoopReleaser
                            private boolean done;

                            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
                            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                                if (this.done) {
                                    return;
                                }
                                this.done = true;
                                NettyServer.this.sharedResourceReferenceCounter.release();
                            }
                        };
                        newPromise.addListener((GenericFutureListener<? extends Future<? super Void>>) channelFutureListener);
                        channel.closeFuture().addListener((GenericFutureListener<? extends Future<? super Void>>) channelFutureListener);
                        return;
                    }
                    channel.close();
                }
            }
        });
        ChannelFuture bind = serverBootstrap.bind(this.address);
        bind.awaitUninterruptibly();
        if (!bind.isSuccess()) {
            throw new IOException(String.format("Failed to bind to address %s", this.address), bind.cause());
        }
        Channel channel = bind.channel();
        this.channel = channel;
        channel.eventLoop().execute(new Runnable() { // from class: io.grpc.netty.shaded.io.grpc.netty.NettyServer.2
            @Override // java.lang.Runnable
            public void run() {
                NettyServer.this.listenSocketStats = new ListenSocket(NettyServer.this.channel);
                NettyServer.this.channelz.addListenSocket(NettyServer.this.listenSocketStats);
            }
        });
    }

    @Override // io.grpc.internal.InternalServer
    public void shutdown() {
        Channel channel = this.channel;
        if (channel == null || !channel.isOpen()) {
            return;
        }
        this.channel.close().addListener((GenericFutureListener<? extends Future<? super Void>>) new ChannelFutureListener() { // from class: io.grpc.netty.shaded.io.grpc.netty.NettyServer.3
            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (!channelFuture.isSuccess()) {
                    NettyServer.log.log(Level.WARNING, "Error shutting down server", channelFuture.cause());
                }
                InternalInstrumented<InternalChannelz.SocketStats> internalInstrumented = NettyServer.this.listenSocketStats;
                NettyServer.this.listenSocketStats = null;
                if (internalInstrumented != null) {
                    NettyServer.this.channelz.removeListenSocket(internalInstrumented);
                }
                NettyServer.this.sharedResourceReferenceCounter.release();
                NettyServer.this.protocolNegotiator.close();
                synchronized (NettyServer.this) {
                    NettyServer.this.listener.serverShutdown();
                }
            }
        });
        try {
            this.channel.closeFuture().await();
        } catch (InterruptedException e) {
            log.log(Level.FINE, "Interrupted while shutting down", (Throwable) e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.grpc.InternalWithLogId
    public InternalLogId getLogId() {
        return this.logId;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("logId", this.logId.getId()).add(IntegrityManager.INTEGRITY_TYPE_ADDRESS, this.address).toString();
    }

    /* loaded from: classes4.dex */
    class SharedResourceReferenceCounter extends AbstractReferenceCounted {
        @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
        public ReferenceCounted touch(Object obj) {
            return this;
        }

        SharedResourceReferenceCounter() {
        }

        @Override // io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted
        protected void deallocate() {
            try {
                if (NettyServer.this.bossGroup != null) {
                    NettyServer.this.bossGroupPool.returnObject(NettyServer.this.bossGroup);
                }
                NettyServer.this.bossGroup = null;
                try {
                    if (NettyServer.this.workerGroup != null) {
                        NettyServer.this.workerGroupPool.returnObject(NettyServer.this.workerGroup);
                    }
                } finally {
                }
            } catch (Throwable th) {
                NettyServer.this.bossGroup = null;
                try {
                    if (NettyServer.this.workerGroup != null) {
                        NettyServer.this.workerGroupPool.returnObject(NettyServer.this.workerGroup);
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class ListenSocket implements InternalInstrumented<InternalChannelz.SocketStats> {
        private final Channel ch;
        private final InternalLogId id;

        ListenSocket(Channel channel) {
            this.ch = channel;
            this.id = InternalLogId.allocate(getClass(), String.valueOf(channel.localAddress()));
        }

        @Override // io.grpc.InternalInstrumented
        public ListenableFuture<InternalChannelz.SocketStats> getStats() {
            final SettableFuture create = SettableFuture.create();
            if (this.ch.eventLoop().inEventLoop()) {
                create.set(new InternalChannelz.SocketStats(null, this.ch.localAddress(), null, Utils.getSocketOptions(this.ch), null));
                return create;
            }
            this.ch.eventLoop().submit(new Runnable() { // from class: io.grpc.netty.shaded.io.grpc.netty.NettyServer.ListenSocket.2
                @Override // java.lang.Runnable
                public void run() {
                    create.set(new InternalChannelz.SocketStats(null, ListenSocket.this.ch.localAddress(), null, Utils.getSocketOptions(ListenSocket.this.ch), null));
                }
            }).addListener(new GenericFutureListener<Future<Object>>() { // from class: io.grpc.netty.shaded.io.grpc.netty.NettyServer.ListenSocket.1
                @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
                public void operationComplete(Future<Object> future) throws Exception {
                    if (future.isSuccess()) {
                        return;
                    }
                    create.setException(future.cause());
                }
            });
            return create;
        }

        @Override // io.grpc.InternalWithLogId
        public InternalLogId getLogId() {
            return this.id;
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("logId", this.id.getId()).add(AppsFlyerProperties.CHANNEL, this.ch).toString();
        }
    }
}
