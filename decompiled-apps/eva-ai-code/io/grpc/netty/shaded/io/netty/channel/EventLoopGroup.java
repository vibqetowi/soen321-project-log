package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorGroup;
/* loaded from: classes4.dex */
public interface EventLoopGroup extends EventExecutorGroup {
    @Override // 
    EventLoop next();

    ChannelFuture register(Channel channel);

    @Deprecated
    ChannelFuture register(Channel channel, ChannelPromise channelPromise);

    ChannelFuture register(ChannelPromise channelPromise);
}
