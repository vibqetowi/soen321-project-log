package io.grpc.netty.shaded.io.netty.util.concurrent;
/* loaded from: classes4.dex */
public interface Promise<V> extends Future<V> {
    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Promise<V> addListener(GenericFutureListener<? extends Future<? super V>> genericFutureListener);

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Promise<V> addListeners(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr);

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Promise<V> await() throws InterruptedException;

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Promise<V> awaitUninterruptibly();

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Promise<V> removeListener(GenericFutureListener<? extends Future<? super V>> genericFutureListener);

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Promise<V> removeListeners(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr);

    Promise<V> setFailure(Throwable th);

    Promise<V> setSuccess(V v);

    boolean setUncancellable();

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Promise<V> sync() throws InterruptedException;

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    Promise<V> syncUninterruptibly();

    boolean tryFailure(Throwable th);

    boolean trySuccess(V v);
}
