package io.grpc.netty.shaded.io.netty.channel.group;

import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.channel.ChannelFuture;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
final class VoidChannelGroupFuture implements ChannelGroupFuture {
    private static final Iterator<ChannelFuture> EMPTY = Collections.emptyList().iterator();
    private final ChannelGroup group;

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public ChannelGroupException cause() {
        return null;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture
    public ChannelFuture find(Channel channel) {
        return null;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Void getNow() {
        return null;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean isCancellable() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture
    public boolean isPartialFailure() {
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture
    public boolean isPartialSuccess() {
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean isSuccess() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VoidChannelGroupFuture(ChannelGroup channelGroup) {
        this.group = channelGroup;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture
    public ChannelGroup group() {
        return this.group;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: addListener */
    public Future<Void> addListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        throw reject();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: addListeners */
    public Future<Void> addListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr) {
        throw reject();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: removeListener */
    public Future<Void> removeListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        throw reject();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: removeListeners */
    public Future<Void> removeListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr) {
        throw reject();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: await */
    public Future<Void> await2() {
        throw reject();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: awaitUninterruptibly */
    public Future<Void> awaitUninterruptibly2() {
        throw reject();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: syncUninterruptibly */
    public Future<Void> syncUninterruptibly2() {
        throw reject();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture, io.grpc.netty.shaded.io.netty.util.concurrent.Future
    /* renamed from: sync */
    public Future<Void> sync2() {
        throw reject();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.group.ChannelGroupFuture, java.lang.Iterable
    public Iterator<ChannelFuture> iterator() {
        return EMPTY;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean await(long j, TimeUnit timeUnit) {
        throw reject();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean await(long j) {
        throw reject();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long j, TimeUnit timeUnit) {
        throw reject();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long j) {
        throw reject();
    }

    @Override // java.util.concurrent.Future
    public Void get() {
        throw reject();
    }

    @Override // java.util.concurrent.Future
    public Void get(long j, TimeUnit timeUnit) {
        throw reject();
    }

    private static RuntimeException reject() {
        return new IllegalStateException("void future");
    }
}
