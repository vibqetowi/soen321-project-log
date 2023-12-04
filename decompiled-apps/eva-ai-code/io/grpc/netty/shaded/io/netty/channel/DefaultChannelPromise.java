package io.grpc.netty.shaded.io.netty.channel;

import com.appsflyer.AppsFlyerProperties;
import io.grpc.netty.shaded.io.netty.channel.ChannelFlushPromiseNotifier;
import io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise;
import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
public class DefaultChannelPromise extends DefaultPromise<Void> implements ChannelPromise, ChannelFlushPromiseNotifier.FlushCheckpoint {
    private final Channel channel;
    private long checkpoint;

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelFuture
    public boolean isVoid() {
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
    public ChannelPromise promise() {
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise
    public ChannelPromise unvoid() {
        return this;
    }

    public DefaultChannelPromise(Channel channel) {
        this.channel = (Channel) ObjectUtil.checkNotNull(channel, AppsFlyerProperties.CHANNEL);
    }

    public DefaultChannelPromise(Channel channel, EventExecutor eventExecutor) {
        super(eventExecutor);
        this.channel = (Channel) ObjectUtil.checkNotNull(channel, AppsFlyerProperties.CHANNEL);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise
    public EventExecutor executor() {
        EventExecutor executor = super.executor();
        return executor == null ? channel().eventLoop() : executor;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise, io.grpc.netty.shaded.io.netty.channel.ChannelFuture
    public Channel channel() {
        return this.channel;
    }

    public ChannelPromise setSuccess() {
        return setSuccess((Void) null);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Promise
    public ChannelPromise setSuccess(Void r1) {
        super.setSuccess((DefaultChannelPromise) r1);
        return this;
    }

    public boolean trySuccess() {
        return trySuccess(null);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Promise, io.grpc.netty.shaded.io.netty.channel.ChannelPromise
    public ChannelPromise setFailure(Throwable th) {
        super.setFailure(th);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> addListener(GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        super.addListener((GenericFutureListener) genericFutureListener);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> addListeners(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr) {
        super.addListeners((GenericFutureListener[]) genericFutureListenerArr);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> removeListener(GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        super.removeListener((GenericFutureListener) genericFutureListener);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> removeListeners(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr) {
        super.removeListeners((GenericFutureListener[]) genericFutureListenerArr);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> sync() throws InterruptedException {
        super.sync();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> syncUninterruptibly() {
        super.syncUninterruptibly();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> await() throws InterruptedException {
        super.await();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> awaitUninterruptibly() {
        super.awaitUninterruptibly();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
    public long flushCheckpoint() {
        return this.checkpoint;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
    public void flushCheckpoint(long j) {
        this.checkpoint = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise
    public void checkDeadLock() {
        if (channel().isRegistered()) {
            super.checkDeadLock();
        }
    }
}
