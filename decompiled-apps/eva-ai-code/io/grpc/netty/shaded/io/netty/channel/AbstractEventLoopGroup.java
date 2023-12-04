package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.concurrent.AbstractEventExecutorGroup;
/* loaded from: classes4.dex */
public abstract class AbstractEventLoopGroup extends AbstractEventExecutorGroup implements EventLoopGroup {
    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorGroup, io.grpc.netty.shaded.io.netty.channel.EventLoopGroup
    public abstract EventLoop next();
}
