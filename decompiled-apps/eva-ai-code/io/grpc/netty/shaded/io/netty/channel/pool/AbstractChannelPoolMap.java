package io.grpc.netty.shaded.io.netty.channel.pool;

import io.grpc.netty.shaded.io.netty.channel.pool.ChannelPool;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener;
import io.grpc.netty.shaded.io.netty.util.concurrent.GlobalEventExecutor;
import io.grpc.netty.shaded.io.netty.util.concurrent.Promise;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import io.grpc.netty.shaded.io.netty.util.internal.ReadOnlyIterator;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes4.dex */
public abstract class AbstractChannelPoolMap<K, P extends ChannelPool> implements ChannelPoolMap<K, P>, Iterable<Map.Entry<K, P>>, Closeable {
    private final ConcurrentMap<K, P> map = PlatformDependent.newConcurrentHashMap();

    protected abstract P newPool(K k);

    @Override // io.grpc.netty.shaded.io.netty.channel.pool.ChannelPoolMap
    public final P get(K k) {
        P p = this.map.get(ObjectUtil.checkNotNull(k, "key"));
        if (p == null) {
            P newPool = newPool(k);
            P putIfAbsent = this.map.putIfAbsent(k, newPool);
            if (putIfAbsent != null) {
                poolCloseAsyncIfSupported(newPool);
                return putIfAbsent;
            }
            return newPool;
        }
        return p;
    }

    public final boolean remove(K k) {
        P remove = this.map.remove(ObjectUtil.checkNotNull(k, "key"));
        if (remove != null) {
            poolCloseAsyncIfSupported(remove);
            return true;
        }
        return false;
    }

    private Future<Boolean> removeAsyncIfSupported(K k) {
        P remove = this.map.remove(ObjectUtil.checkNotNull(k, "key"));
        if (remove != null) {
            final Promise newPromise = GlobalEventExecutor.INSTANCE.newPromise();
            poolCloseAsyncIfSupported(remove).addListener(new GenericFutureListener<Future<? super Void>>() { // from class: io.grpc.netty.shaded.io.netty.channel.pool.AbstractChannelPoolMap.1
                @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
                public void operationComplete(Future<? super Void> future) throws Exception {
                    if (future.isSuccess()) {
                        newPromise.setSuccess(Boolean.TRUE);
                    } else {
                        newPromise.setFailure(future.cause());
                    }
                }
            });
            return newPromise;
        }
        return GlobalEventExecutor.INSTANCE.newSucceededFuture(Boolean.FALSE);
    }

    private static Future<Void> poolCloseAsyncIfSupported(ChannelPool channelPool) {
        if (channelPool instanceof SimpleChannelPool) {
            return ((SimpleChannelPool) channelPool).closeAsync();
        }
        try {
            channelPool.close();
            return GlobalEventExecutor.INSTANCE.newSucceededFuture(null);
        } catch (Exception e) {
            return GlobalEventExecutor.INSTANCE.newFailedFuture(e);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, P>> iterator() {
        return new ReadOnlyIterator(this.map.entrySet().iterator());
    }

    public final int size() {
        return this.map.size();
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.pool.ChannelPoolMap
    public final boolean contains(K k) {
        return this.map.containsKey(ObjectUtil.checkNotNull(k, "key"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (K k : this.map.keySet()) {
            removeAsyncIfSupported(k).syncUninterruptibly();
        }
    }
}
