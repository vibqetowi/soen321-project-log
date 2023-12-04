package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor;
/* loaded from: classes4.dex */
final class SucceededChannelFuture extends CompleteChannelFuture {
    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public Throwable cause() {
        return null;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.Future
    public boolean isSuccess() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SucceededChannelFuture(Channel channel, EventExecutor eventExecutor) {
        super(channel, eventExecutor);
    }
}
