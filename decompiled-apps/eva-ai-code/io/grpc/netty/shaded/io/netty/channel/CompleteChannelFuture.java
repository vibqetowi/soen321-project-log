package io.grpc.netty.shaded.io.netty.channel;

import com.appsflyer.AppsFlyerProperties;
import io.grpc.netty.shaded.io.netty.util.concurrent.CompleteFuture;
import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class CompleteChannelFuture extends CompleteFuture<Void> implements ChannelFuture {
    private final Channel channel;

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.CompleteFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: await */
    public Future<Void> await2() throws InterruptedException {
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.CompleteFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: awaitUninterruptibly */
    public Future<Void> awaitUninterruptibly2() {
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Void getNow() {
        return null;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelFuture
    public boolean isVoid() {
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.CompleteFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: sync */
    public Future<Void> sync2() throws InterruptedException {
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.CompleteFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: syncUninterruptibly */
    public Future<Void> syncUninterruptibly2() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CompleteChannelFuture(Channel channel, EventExecutor eventExecutor) {
        super(eventExecutor);
        this.channel = (Channel) ObjectUtil.checkNotNull(channel, AppsFlyerProperties.CHANNEL);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.CompleteFuture
    public EventExecutor executor() {
        EventExecutor executor = super.executor();
        return executor == null ? channel().eventLoop() : executor;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.CompleteFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: addListener */
    public Future<Void> addListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        super.addListener((GenericFutureListener) genericFutureListener);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.CompleteFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: addListeners */
    public Future<Void> addListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr) {
        super.addListeners((GenericFutureListener[]) genericFutureListenerArr);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.CompleteFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: removeListener */
    public Future<Void> removeListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        super.removeListener((GenericFutureListener) genericFutureListener);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.CompleteFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: removeListeners */
    public Future<Void> removeListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr) {
        super.removeListeners((GenericFutureListener[]) genericFutureListenerArr);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelFuture
    public Channel channel() {
        return this.channel;
    }
}
