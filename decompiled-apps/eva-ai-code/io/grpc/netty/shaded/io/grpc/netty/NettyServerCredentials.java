package io.grpc.netty.shaded.io.grpc.netty;

import com.google.common.base.Preconditions;
import io.grpc.ServerCredentials;
import io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiator;
/* loaded from: classes4.dex */
final class NettyServerCredentials extends ServerCredentials {
    private final ProtocolNegotiator.ServerFactory negotiator;

    public static ServerCredentials create(ProtocolNegotiator.ServerFactory serverFactory) {
        return new NettyServerCredentials(serverFactory);
    }

    private NettyServerCredentials(ProtocolNegotiator.ServerFactory serverFactory) {
        this.negotiator = (ProtocolNegotiator.ServerFactory) Preconditions.checkNotNull(serverFactory, "negotiator");
    }

    public ProtocolNegotiator.ServerFactory getNegotiator() {
        return this.negotiator;
    }
}
