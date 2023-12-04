package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.NettyRuntime;
import io.grpc.netty.shaded.io.netty.util.concurrent.DefaultThreadFactory;
import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorChooserFactory;
import io.grpc.netty.shaded.io.netty.util.concurrent.MultithreadEventExecutorGroup;
import io.grpc.netty.shaded.io.netty.util.internal.SystemPropertyUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes4.dex */
public abstract class MultithreadEventLoopGroup extends MultithreadEventExecutorGroup implements EventLoopGroup {
    private static final int DEFAULT_EVENT_LOOP_THREADS;
    private static final InternalLogger logger;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.MultithreadEventExecutorGroup
    public abstract EventLoop newChild(Executor executor, Object... objArr) throws Exception;

    static {
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance(MultithreadEventLoopGroup.class);
        logger = internalLoggerFactory;
        int max = Math.max(1, SystemPropertyUtil.getInt("io.grpc.netty.shaded.io.netty.eventLoopThreads", NettyRuntime.availableProcessors() * 2));
        DEFAULT_EVENT_LOOP_THREADS = max;
        if (internalLoggerFactory.isDebugEnabled()) {
            internalLoggerFactory.debug("-Dio.netty.eventLoopThreads: {}", Integer.valueOf(max));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MultithreadEventLoopGroup(int i, Executor executor, Object... objArr) {
        super(i == 0 ? DEFAULT_EVENT_LOOP_THREADS : i, executor, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MultithreadEventLoopGroup(int i, ThreadFactory threadFactory, Object... objArr) {
        super(i == 0 ? DEFAULT_EVENT_LOOP_THREADS : i, threadFactory, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MultithreadEventLoopGroup(int i, Executor executor, EventExecutorChooserFactory eventExecutorChooserFactory, Object... objArr) {
        super(i == 0 ? DEFAULT_EVENT_LOOP_THREADS : i, executor, eventExecutorChooserFactory, objArr);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.MultithreadEventExecutorGroup
    protected ThreadFactory newDefaultThreadFactory() {
        return new DefaultThreadFactory(getClass(), 10);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.MultithreadEventExecutorGroup, io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorGroup, io.grpc.netty.shaded.io.netty.channel.EventLoopGroup
    public EventLoop next() {
        return (EventLoop) super.next();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.EventLoopGroup
    public ChannelFuture register(Channel channel) {
        return next().register(channel);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.EventLoopGroup
    public ChannelFuture register(ChannelPromise channelPromise) {
        return next().register(channelPromise);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.EventLoopGroup
    @Deprecated
    public ChannelFuture register(Channel channel, ChannelPromise channelPromise) {
        return next().register(channel, channelPromise);
    }
}
