package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener;
/* loaded from: classes4.dex */
public interface ChannelFuture extends Future<Void> {
    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Future<Void> addListener(GenericFutureListener<? extends Future<? super Void>> genericFutureListener);

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Future<Void> addListeners(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr);

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Future<Void> await() throws InterruptedException;

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Future<Void> awaitUninterruptibly();

    Channel channel();

    boolean isVoid();

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Future<Void> removeListener(GenericFutureListener<? extends Future<? super Void>> genericFutureListener);

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Future<Void> removeListeners(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr);

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Future<Void> sync() throws InterruptedException;

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Future<Void> syncUninterruptibly();
}
