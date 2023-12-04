package io.grpc.netty.shaded.io.netty.channel.socket;

import io.grpc.netty.shaded.io.netty.channel.ServerChannel;
import java.net.InetSocketAddress;
/* loaded from: classes4.dex */
public interface ServerSocketChannel extends ServerChannel {
    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    ServerSocketChannelConfig config();

    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    InetSocketAddress localAddress();

    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    InetSocketAddress remoteAddress();
}
