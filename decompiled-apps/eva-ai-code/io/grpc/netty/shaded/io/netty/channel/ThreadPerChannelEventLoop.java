package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener;
@Deprecated
/* loaded from: classes4.dex */
public class ThreadPerChannelEventLoop extends SingleThreadEventLoop {
    private Channel ch;
    private final ThreadPerChannelEventLoopGroup parent;

    @Override // io.grpc.netty.shaded.io.netty.channel.SingleThreadEventLoop
    public int registeredChannels() {
        return 1;
    }

    public ThreadPerChannelEventLoop(ThreadPerChannelEventLoopGroup threadPerChannelEventLoopGroup) {
        super((EventLoopGroup) threadPerChannelEventLoopGroup, threadPerChannelEventLoopGroup.executor, true);
        this.parent = threadPerChannelEventLoopGroup;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [io.grpc.netty.shaded.io.netty.channel.ChannelFuture] */
    @Override // io.grpc.netty.shaded.io.netty.channel.SingleThreadEventLoop, io.grpc.netty.shaded.io.netty.channel.EventLoopGroup
    public ChannelFuture register(ChannelPromise channelPromise) {
        return super.register(channelPromise).addListener((GenericFutureListener<? extends Future<? super Void>>) new ChannelFutureListener() { // from class: io.grpc.netty.shaded.io.netty.channel.ThreadPerChannelEventLoop.1
            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (channelFuture.isSuccess()) {
                    ThreadPerChannelEventLoop.this.ch = channelFuture.channel();
                    return;
                }
                ThreadPerChannelEventLoop.this.deregister();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [io.grpc.netty.shaded.io.netty.channel.ChannelFuture] */
    @Override // io.grpc.netty.shaded.io.netty.channel.SingleThreadEventLoop, io.grpc.netty.shaded.io.netty.channel.EventLoopGroup
    @Deprecated
    public ChannelFuture register(Channel channel, ChannelPromise channelPromise) {
        return super.register(channel, channelPromise).addListener((GenericFutureListener<? extends Future<? super Void>>) new ChannelFutureListener() { // from class: io.grpc.netty.shaded.io.netty.channel.ThreadPerChannelEventLoop.2
            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (channelFuture.isSuccess()) {
                    ThreadPerChannelEventLoop.this.ch = channelFuture.channel();
                    return;
                }
                ThreadPerChannelEventLoop.this.deregister();
            }
        });
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.SingleThreadEventExecutor
    protected void run() {
        while (true) {
            Runnable takeTask = takeTask();
            if (takeTask != null) {
                takeTask.run();
                updateLastExecutionTime();
            }
            Channel channel = this.ch;
            if (isShuttingDown()) {
                if (channel != null) {
                    channel.unsafe().close(channel.unsafe().voidPromise());
                }
                if (confirmShutdown()) {
                    return;
                }
            } else if (channel != null && !channel.isRegistered()) {
                runAllTasks();
                deregister();
            }
        }
    }

    protected void deregister() {
        this.ch = null;
        this.parent.activeChildren.remove(this);
        this.parent.idleChildren.add(this);
    }
}
