package io.grpc.netty.shaded.io.netty.channel.unix;

import io.grpc.netty.shaded.io.netty.channel.ServerChannel;
/* loaded from: classes4.dex */
public interface ServerDomainSocketChannel extends ServerChannel, UnixChannel {
    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    DomainSocketAddress localAddress();

    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    DomainSocketAddress remoteAddress();
}
