package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.concurrent.PromiseNotifier;
/* loaded from: classes4.dex */
public final class ChannelPromiseNotifier extends PromiseNotifier<Void, ChannelFuture> implements ChannelFutureListener {
    public ChannelPromiseNotifier(ChannelPromise... channelPromiseArr) {
        super(channelPromiseArr);
    }

    public ChannelPromiseNotifier(boolean z, ChannelPromise... channelPromiseArr) {
        super(z, channelPromiseArr);
    }
}
