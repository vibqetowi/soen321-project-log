package io.grpc.netty.shaded.io.netty.channel.socket;

import java.net.InetSocketAddress;
/* loaded from: classes4.dex */
public interface SocketChannel extends DuplexChannel {
    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    SocketChannelConfig config();

    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    InetSocketAddress localAddress();

    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    ServerSocketChannel parent();

    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    InetSocketAddress remoteAddress();
}
