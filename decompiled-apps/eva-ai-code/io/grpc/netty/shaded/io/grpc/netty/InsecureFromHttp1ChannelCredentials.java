package io.grpc.netty.shaded.io.grpc.netty;

import io.grpc.ChannelCredentials;
/* loaded from: classes4.dex */
public final class InsecureFromHttp1ChannelCredentials {
    private InsecureFromHttp1ChannelCredentials() {
    }

    public static ChannelCredentials create() {
        return NettyChannelCredentials.create(ProtocolNegotiators.plaintextUpgradeClientFactory());
    }
}
