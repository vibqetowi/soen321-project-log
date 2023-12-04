package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.concurrent.OrderedEventExecutor;
/* loaded from: classes4.dex */
public interface EventLoop extends OrderedEventExecutor, EventLoopGroup {
    @Override // 
    EventLoopGroup parent();
}
