package io.grpc.netty.shaded.io.netty.bootstrap;

import io.grpc.netty.shaded.io.netty.channel.Channel;
@Deprecated
/* loaded from: classes4.dex */
public interface ChannelFactory<T extends Channel> {
    T newChannel();
}
