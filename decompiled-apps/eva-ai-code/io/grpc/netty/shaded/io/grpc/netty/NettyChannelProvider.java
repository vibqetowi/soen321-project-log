package io.grpc.netty.shaded.io.grpc.netty;

import io.grpc.ChannelCredentials;
import io.grpc.ManagedChannelProvider;
import io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiators;
/* loaded from: classes4.dex */
public final class NettyChannelProvider extends ManagedChannelProvider {
    @Override // io.grpc.ManagedChannelProvider
    public boolean isAvailable() {
        return true;
    }

    @Override // io.grpc.ManagedChannelProvider
    public int priority() {
        return 5;
    }

    @Override // io.grpc.ManagedChannelProvider
    public NettyChannelBuilder builderForAddress(String str, int i) {
        return NettyChannelBuilder.forAddress(str, i);
    }

    @Override // io.grpc.ManagedChannelProvider
    public NettyChannelBuilder builderForTarget(String str) {
        return NettyChannelBuilder.forTarget(str);
    }

    @Override // io.grpc.ManagedChannelProvider
    public ManagedChannelProvider.NewChannelBuilderResult newChannelBuilder(String str, ChannelCredentials channelCredentials) {
        ProtocolNegotiators.FromChannelCredentialsResult from = ProtocolNegotiators.from(channelCredentials);
        if (from.error != null) {
            return ManagedChannelProvider.NewChannelBuilderResult.error(from.error);
        }
        return ManagedChannelProvider.NewChannelBuilderResult.channelBuilder(new NettyChannelBuilder(str, from.negotiator, from.callCredentials));
    }
}
