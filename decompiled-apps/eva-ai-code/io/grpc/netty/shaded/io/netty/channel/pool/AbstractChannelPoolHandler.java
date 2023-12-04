package io.grpc.netty.shaded.io.netty.channel.pool;

import io.grpc.netty.shaded.io.netty.channel.Channel;
/* loaded from: classes4.dex */
public abstract class AbstractChannelPoolHandler implements ChannelPoolHandler {
    @Override // io.grpc.netty.shaded.io.netty.channel.pool.ChannelPoolHandler
    public void channelAcquired(Channel channel) throws Exception {
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.pool.ChannelPoolHandler
    public void channelReleased(Channel channel) throws Exception {
    }
}
