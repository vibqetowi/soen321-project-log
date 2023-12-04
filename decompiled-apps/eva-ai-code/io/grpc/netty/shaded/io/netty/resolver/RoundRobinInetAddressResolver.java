package io.grpc.netty.shaded.io.netty.resolver;

import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.FutureListener;
import io.grpc.netty.shaded.io.netty.util.concurrent.Promise;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public class RoundRobinInetAddressResolver extends InetNameResolver {
    private final NameResolver<InetAddress> nameResolver;

    public RoundRobinInetAddressResolver(EventExecutor eventExecutor, NameResolver<InetAddress> nameResolver) {
        super(eventExecutor);
        this.nameResolver = nameResolver;
    }

    @Override // io.grpc.netty.shaded.io.netty.resolver.SimpleNameResolver
    protected void doResolve(final String str, final Promise<InetAddress> promise) throws Exception {
        this.nameResolver.resolveAll(str).addListener(new FutureListener<List<InetAddress>>() { // from class: io.grpc.netty.shaded.io.netty.resolver.RoundRobinInetAddressResolver.1
            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
            public void operationComplete(Future<List<InetAddress>> future) throws Exception {
                if (future.isSuccess()) {
                    List<InetAddress> now = future.getNow();
                    int size = now.size();
                    if (size > 0) {
                        promise.setSuccess(now.get(RoundRobinInetAddressResolver.randomIndex(size)));
                        return;
                    } else {
                        promise.setFailure(new UnknownHostException(str));
                        return;
                    }
                }
                promise.setFailure(future.cause());
            }
        });
    }

    @Override // io.grpc.netty.shaded.io.netty.resolver.SimpleNameResolver
    protected void doResolveAll(String str, final Promise<List<InetAddress>> promise) throws Exception {
        this.nameResolver.resolveAll(str).addListener(new FutureListener<List<InetAddress>>() { // from class: io.grpc.netty.shaded.io.netty.resolver.RoundRobinInetAddressResolver.2
            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
            public void operationComplete(Future<List<InetAddress>> future) throws Exception {
                if (future.isSuccess()) {
                    List<InetAddress> now = future.getNow();
                    if (!now.isEmpty()) {
                        ArrayList arrayList = new ArrayList(now);
                        Collections.rotate(arrayList, RoundRobinInetAddressResolver.randomIndex(now.size()));
                        promise.setSuccess(arrayList);
                        return;
                    }
                    promise.setSuccess(now);
                    return;
                }
                promise.setFailure(future.cause());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int randomIndex(int i) {
        if (i == 1) {
            return 0;
        }
        return PlatformDependent.threadLocalRandom().nextInt(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.resolver.SimpleNameResolver, io.grpc.netty.shaded.io.netty.resolver.NameResolver, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.nameResolver.close();
    }
}
