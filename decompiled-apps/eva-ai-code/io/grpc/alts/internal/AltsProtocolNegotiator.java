package io.grpc.alts.internal;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Any;
import io.grpc.Attributes;
import io.grpc.Channel;
import io.grpc.InternalChannelz;
import io.grpc.Status;
import io.grpc.alts.internal.AltsClientOptions;
import io.grpc.alts.internal.TsiHandshakeHandler;
import io.grpc.grpclb.GrpclbConstants;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.ObjectPool;
import io.grpc.netty.shaded.io.grpc.netty.GrpcHttp2ConnectionHandler;
import io.grpc.netty.shaded.io.grpc.netty.InternalProtocolNegotiator;
import io.grpc.netty.shaded.io.grpc.netty.InternalProtocolNegotiators;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandler;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContext;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public final class AltsProtocolNegotiator {
    private static final Logger logger = Logger.getLogger(AltsProtocolNegotiator.class.getName());
    public static final Attributes.Key<TsiPeer> TSI_PEER_KEY = Attributes.Key.create("TSI_PEER");
    public static final Attributes.Key<Object> AUTH_CONTEXT_KEY = Attributes.Key.create("AUTH_CONTEXT_KEY");
    private static final AsciiString SCHEME = AsciiString.of("https");

    /* loaded from: classes4.dex */
    public static final class ClientAltsProtocolNegotiatorFactory implements InternalProtocolNegotiator.ClientFactory {
        private final ObjectPool<Channel> handshakerChannelPool;
        private final ImmutableList<String> targetServiceAccounts;

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public int getDefaultPort() {
            return GrpcUtil.DEFAULT_PORT_SSL;
        }

        public ClientAltsProtocolNegotiatorFactory(List<String> list, ObjectPool<Channel> objectPool) {
            this.targetServiceAccounts = ImmutableList.copyOf((Collection) list);
            this.handshakerChannelPool = (ObjectPool) Preconditions.checkNotNull(objectPool, "handshakerChannelPool");
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.InternalProtocolNegotiator.ClientFactory, io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public InternalProtocolNegotiator.ProtocolNegotiator newNegotiator() {
            return new ClientAltsProtocolNegotiator(this.targetServiceAccounts, this.handshakerChannelPool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ClientAltsProtocolNegotiator implements InternalProtocolNegotiator.ProtocolNegotiator {
        private final TsiHandshakerFactory handshakerFactory;
        private final LazyChannel lazyHandshakerChannel;

        ClientAltsProtocolNegotiator(ImmutableList<String> immutableList, ObjectPool<Channel> objectPool) {
            LazyChannel lazyChannel = new LazyChannel(objectPool);
            this.lazyHandshakerChannel = lazyChannel;
            this.handshakerFactory = new ClientTsiHandshakerFactory(immutableList, lazyChannel);
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public AsciiString scheme() {
            return AltsProtocolNegotiator.SCHEME;
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public ChannelHandler newHandler(GrpcHttp2ConnectionHandler grpcHttp2ConnectionHandler) {
            return InternalProtocolNegotiators.waitUntilActiveHandler(new TsiHandshakeHandler(InternalProtocolNegotiators.grpcNegotiationHandler(grpcHttp2ConnectionHandler), new NettyTsiHandshaker(this.handshakerFactory.newHandshaker(grpcHttp2ConnectionHandler.getAuthority())), new AltsHandshakeValidator()));
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public void close() {
            this.lazyHandshakerChannel.close();
        }
    }

    public static InternalProtocolNegotiator.ProtocolNegotiator serverAltsProtocolNegotiator(ObjectPool<Channel> objectPool) {
        final LazyChannel lazyChannel = new LazyChannel(objectPool);
        return new ServerAltsProtocolNegotiator(new TsiHandshakerFactory() { // from class: io.grpc.alts.internal.AltsProtocolNegotiator.1ServerTsiHandshakerFactory
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // io.grpc.alts.internal.TsiHandshakerFactory
            public TsiHandshaker newHandshaker(@Nullable String str) {
                return AltsTsiHandshaker.newServer(HandshakerServiceGrpc.newStub(LazyChannel.this.get()), new AltsHandshakerOptions(RpcProtocolVersionsUtil.getRpcProtocolVersions()));
            }
        }, lazyChannel);
    }

    /* loaded from: classes4.dex */
    static final class ServerAltsProtocolNegotiator implements InternalProtocolNegotiator.ProtocolNegotiator {
        private final TsiHandshakerFactory handshakerFactory;
        private final LazyChannel lazyHandshakerChannel;

        ServerAltsProtocolNegotiator(TsiHandshakerFactory tsiHandshakerFactory, LazyChannel lazyChannel) {
            this.handshakerFactory = (TsiHandshakerFactory) Preconditions.checkNotNull(tsiHandshakerFactory, "handshakerFactory");
            this.lazyHandshakerChannel = (LazyChannel) Preconditions.checkNotNull(lazyChannel, "lazyHandshakerChannel");
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public AsciiString scheme() {
            return AltsProtocolNegotiator.SCHEME;
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public ChannelHandler newHandler(GrpcHttp2ConnectionHandler grpcHttp2ConnectionHandler) {
            return InternalProtocolNegotiators.waitUntilActiveHandler(new TsiHandshakeHandler(InternalProtocolNegotiators.grpcNegotiationHandler(grpcHttp2ConnectionHandler), new NettyTsiHandshaker(this.handshakerFactory.newHandshaker(null)), new AltsHandshakeValidator()));
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public void close() {
            AltsProtocolNegotiator.logger.finest("ALTS Server ProtocolNegotiator Closed");
            this.lazyHandshakerChannel.close();
        }
    }

    /* loaded from: classes4.dex */
    public static final class GoogleDefaultProtocolNegotiatorFactory implements InternalProtocolNegotiator.ClientFactory {
        private final ObjectPool<Channel> handshakerChannelPool;
        private final SslContext sslContext;
        private final ImmutableList<String> targetServiceAccounts;

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public int getDefaultPort() {
            return GrpcUtil.DEFAULT_PORT_SSL;
        }

        public GoogleDefaultProtocolNegotiatorFactory(List<String> list, ObjectPool<Channel> objectPool, SslContext sslContext) {
            this.targetServiceAccounts = ImmutableList.copyOf((Collection) list);
            this.handshakerChannelPool = (ObjectPool) Preconditions.checkNotNull(objectPool, "handshakerChannelPool");
            this.sslContext = (SslContext) Preconditions.checkNotNull(sslContext, "sslContext");
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.InternalProtocolNegotiator.ClientFactory, io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator.ClientFactory
        public InternalProtocolNegotiator.ProtocolNegotiator newNegotiator() {
            return new GoogleDefaultProtocolNegotiator(this.targetServiceAccounts, this.handshakerChannelPool, this.sslContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class GoogleDefaultProtocolNegotiator implements InternalProtocolNegotiator.ProtocolNegotiator {
        private final TsiHandshakerFactory handshakerFactory;
        private final LazyChannel lazyHandshakerChannel;
        private final SslContext sslContext;

        GoogleDefaultProtocolNegotiator(ImmutableList<String> immutableList, ObjectPool<Channel> objectPool, SslContext sslContext) {
            LazyChannel lazyChannel = new LazyChannel(objectPool);
            this.lazyHandshakerChannel = lazyChannel;
            this.handshakerFactory = new ClientTsiHandshakerFactory(immutableList, lazyChannel);
            this.sslContext = (SslContext) Preconditions.checkNotNull(sslContext, "checkNotNull");
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public AsciiString scheme() {
            return AltsProtocolNegotiator.SCHEME;
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public ChannelHandler newHandler(GrpcHttp2ConnectionHandler grpcHttp2ConnectionHandler) {
            ChannelHandler tsiHandshakeHandler;
            ChannelHandler grpcNegotiationHandler = InternalProtocolNegotiators.grpcNegotiationHandler(grpcHttp2ConnectionHandler);
            if (grpcHttp2ConnectionHandler.getEagAttributes().get(GrpclbConstants.ATTR_LB_ADDR_AUTHORITY) != null || grpcHttp2ConnectionHandler.getEagAttributes().get(GrpclbConstants.ATTR_LB_PROVIDED_BACKEND) != null) {
                tsiHandshakeHandler = new TsiHandshakeHandler(grpcNegotiationHandler, new NettyTsiHandshaker(this.handshakerFactory.newHandshaker(grpcHttp2ConnectionHandler.getAuthority())), new AltsHandshakeValidator());
            } else {
                tsiHandshakeHandler = InternalProtocolNegotiators.clientTlsHandler(grpcNegotiationHandler, this.sslContext, grpcHttp2ConnectionHandler.getAuthority());
            }
            return InternalProtocolNegotiators.waitUntilActiveHandler(tsiHandshakeHandler);
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator
        public void close() {
            AltsProtocolNegotiator.logger.finest("ALTS Server ProtocolNegotiator Closed");
            this.lazyHandshakerChannel.close();
        }
    }

    /* loaded from: classes4.dex */
    private static final class ClientTsiHandshakerFactory implements TsiHandshakerFactory {
        private final LazyChannel lazyHandshakerChannel;
        private final ImmutableList<String> targetServiceAccounts;

        ClientTsiHandshakerFactory(ImmutableList<String> immutableList, LazyChannel lazyChannel) {
            this.targetServiceAccounts = (ImmutableList) Preconditions.checkNotNull(immutableList, "targetServiceAccounts");
            this.lazyHandshakerChannel = (LazyChannel) Preconditions.checkNotNull(lazyChannel, "lazyHandshakerChannel");
        }

        @Override // io.grpc.alts.internal.TsiHandshakerFactory
        public TsiHandshaker newHandshaker(@Nullable String str) {
            return AltsTsiHandshaker.newClient(HandshakerServiceGrpc.newStub(this.lazyHandshakerChannel.get()), new AltsClientOptions.Builder().setRpcProtocolVersions(RpcProtocolVersionsUtil.getRpcProtocolVersions()).setTargetServiceAccounts(this.targetServiceAccounts).setTargetName(str).build());
        }
    }

    /* loaded from: classes4.dex */
    static final class LazyChannel {
        private Channel channel;
        private final ObjectPool<Channel> channelPool;

        LazyChannel(ObjectPool<Channel> objectPool) {
            this.channelPool = (ObjectPool) Preconditions.checkNotNull(objectPool, "channelPool");
        }

        synchronized Channel get() {
            if (this.channel == null) {
                this.channel = this.channelPool.getObject();
            }
            return this.channel;
        }

        synchronized void close() {
            Channel channel = this.channel;
            if (channel != null) {
                this.channel = this.channelPool.returnObject(channel);
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class AltsHandshakeValidator extends TsiHandshakeHandler.HandshakeValidator {
        private AltsHandshakeValidator() {
        }

        @Override // io.grpc.alts.internal.TsiHandshakeHandler.HandshakeValidator
        public TsiHandshakeHandler.HandshakeValidator.SecurityDetails validatePeerObject(Object obj) throws GeneralSecurityException {
            AltsAuthContext altsAuthContext = (AltsAuthContext) obj;
            if (!RpcProtocolVersionsUtil.checkRpcProtocolVersions(RpcProtocolVersionsUtil.getRpcProtocolVersions(), altsAuthContext.getPeerRpcVersions()).getResult()) {
                throw Status.UNAVAILABLE.withDescription("Local Rpc Protocol Versions " + RpcProtocolVersionsUtil.getRpcProtocolVersions() + " are not compatible with peer Rpc Protocol Versions " + altsAuthContext.getPeerRpcVersions()).asRuntimeException();
            }
            return new TsiHandshakeHandler.HandshakeValidator.SecurityDetails(io.grpc.SecurityLevel.PRIVACY_AND_INTEGRITY, new InternalChannelz.Security(new InternalChannelz.OtherSecurity("alts", Any.pack(altsAuthContext.context))));
        }
    }

    private AltsProtocolNegotiator() {
    }
}
