package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PromiseNotificationUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes4.dex */
public final class DelegatingChannelPromiseNotifier implements ChannelPromise, ChannelFutureListener {
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(DelegatingChannelPromiseNotifier.class);
    private final ChannelPromise delegate;
    private final boolean logNotifyFailure;

    public DelegatingChannelPromiseNotifier(ChannelPromise channelPromise) {
        this(channelPromise, !(channelPromise instanceof VoidChannelPromise));
    }

    public DelegatingChannelPromiseNotifier(ChannelPromise channelPromise, boolean z) {
        this.delegate = (ChannelPromise) ObjectUtil.checkNotNull(channelPromise, "delegate");
        this.logNotifyFailure = z;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
    public void operationComplete(ChannelFuture channelFuture) throws Exception {
        InternalLogger internalLogger = this.logNotifyFailure ? logger : null;
        if (channelFuture.isSuccess()) {
            PromiseNotificationUtil.trySuccess(this.delegate, (Void) channelFuture.get(), internalLogger);
        } else if (channelFuture.isCancelled()) {
            PromiseNotificationUtil.tryCancel(this.delegate, internalLogger);
        } else {
            PromiseNotificationUtil.tryFailure(this.delegate, channelFuture.cause(), internalLogger);
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise, io.grpc.netty.shaded.io.netty.channel.ChannelFuture
    public Channel channel() {
        return this.delegate.channel();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Promise
    public ChannelPromise setSuccess(Void r2) {
        this.delegate.setSuccess(r2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise
    public ChannelPromise setSuccess() {
        this.delegate.setSuccess();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise
    public boolean trySuccess() {
        return this.delegate.trySuccess();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Promise
    public boolean trySuccess(Void r2) {
        return this.delegate.trySuccess(r2);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise
    public ChannelPromise setFailure(Throwable th) {
        this.delegate.setFailure(th);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise, io.grpc.netty.shaded.io.netty.channel.ChannelFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> addListener(GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        this.delegate.addListener(genericFutureListener);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise, io.grpc.netty.shaded.io.netty.channel.ChannelFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> addListeners(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr) {
        this.delegate.addListeners(genericFutureListenerArr);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise, io.grpc.netty.shaded.io.netty.channel.ChannelFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> removeListener(GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        this.delegate.removeListener(genericFutureListener);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise, io.grpc.netty.shaded.io.netty.channel.ChannelFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> removeListeners(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr) {
        this.delegate.removeListeners(genericFutureListenerArr);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Promise
    public boolean tryFailure(Throwable th) {
        return this.delegate.tryFailure(th);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Promise
    public boolean setUncancellable() {
        return this.delegate.setUncancellable();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise, io.grpc.netty.shaded.io.netty.channel.ChannelFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> await() throws InterruptedException {
        this.delegate.await();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise, io.grpc.netty.shaded.io.netty.channel.ChannelFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> awaitUninterruptibly() {
        this.delegate.awaitUninterruptibly();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelFuture
    public boolean isVoid() {
        return this.delegate.isVoid();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise
    public ChannelPromise unvoid() {
        return isVoid() ? new DelegatingChannelPromiseNotifier(this.delegate.unvoid()) : this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.await(j, timeUnit);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean await(long j) throws InterruptedException {
        return this.delegate.await(j);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long j, TimeUnit timeUnit) {
        return this.delegate.awaitUninterruptibly(j, timeUnit);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long j) {
        return this.delegate.awaitUninterruptibly(j);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Void getNow() {
        return this.delegate.getNow();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.delegate.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.delegate.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.delegate.isDone();
    }

    @Override // java.util.concurrent.Future
    public Void get() throws InterruptedException, ExecutionException {
        return (Void) this.delegate.get();
    }

    @Override // java.util.concurrent.Future
    public Void get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (Void) this.delegate.get(j, timeUnit);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise, io.grpc.netty.shaded.io.netty.channel.ChannelFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> sync() throws InterruptedException {
        this.delegate.sync();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelPromise, io.grpc.netty.shaded.io.netty.channel.ChannelFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Future<Void> syncUninterruptibly() {
        this.delegate.syncUninterruptibly();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean isSuccess() {
        return this.delegate.isSuccess();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean isCancellable() {
        return this.delegate.isCancellable();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Throwable cause() {
        return this.delegate.cause();
    }
}
