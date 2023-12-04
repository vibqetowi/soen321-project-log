package io.grpc.netty.shaded.io.netty.channel.pool;

import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
/* loaded from: classes4.dex */
public interface ChannelHealthChecker {
    public static final ChannelHealthChecker ACTIVE = new ChannelHealthChecker() { // from class: io.grpc.netty.shaded.io.netty.channel.pool.ChannelHealthChecker.1
        @Override // io.grpc.netty.shaded.io.netty.channel.pool.ChannelHealthChecker
        public Future<Boolean> isHealthy(Channel channel) {
            return channel.eventLoop().newSucceededFuture(channel.isActive() ? Boolean.TRUE : Boolean.FALSE);
        }
    };

    Future<Boolean> isHealthy(Channel channel);
}
