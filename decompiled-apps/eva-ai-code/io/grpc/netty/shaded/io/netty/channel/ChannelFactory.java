package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.channel.Channel;
/* loaded from: classes4.dex */
public interface ChannelFactory<T extends Channel> extends io.grpc.netty.shaded.io.netty.bootstrap.ChannelFactory<T> {
    @Override // io.grpc.netty.shaded.io.netty.bootstrap.ChannelFactory
    T newChannel();
}
