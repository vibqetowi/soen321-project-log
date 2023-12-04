package io.grpc.netty.shaded.io.netty.channel.socket;

import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.channel.ChannelFuture;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
/* loaded from: classes4.dex */
public interface DuplexChannel extends Channel {
    boolean isInputShutdown();

    boolean isOutputShutdown();

    boolean isShutdown();

    ChannelFuture shutdown();

    ChannelFuture shutdown(ChannelPromise channelPromise);

    ChannelFuture shutdownInput();

    ChannelFuture shutdownInput(ChannelPromise channelPromise);

    ChannelFuture shutdownOutput();

    ChannelFuture shutdownOutput(ChannelPromise channelPromise);
}
