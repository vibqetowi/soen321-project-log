package io.grpc.netty.shaded.io.netty.channel.pool;

import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.Promise;
import java.io.Closeable;
/* loaded from: classes4.dex */
public interface ChannelPool extends Closeable {
    Future<Channel> acquire();

    Future<Channel> acquire(Promise<Channel> promise);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    Future<Void> release(Channel channel);

    Future<Void> release(Channel channel, Promise<Void> promise);
}
