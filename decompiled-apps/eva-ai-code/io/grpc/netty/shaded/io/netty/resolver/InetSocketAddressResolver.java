package io.grpc.netty.shaded.io.netty.resolver;

import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.FutureListener;
import io.grpc.netty.shaded.io.netty.util.concurrent.Promise;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class InetSocketAddressResolver extends AbstractAddressResolver<InetSocketAddress> {
    final NameResolver<InetAddress> nameResolver;

    public InetSocketAddressResolver(EventExecutor eventExecutor, NameResolver<InetAddress> nameResolver) {
        super(eventExecutor, InetSocketAddress.class);
        this.nameResolver = nameResolver;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.resolver.AbstractAddressResolver
    public boolean doIsResolved(InetSocketAddress inetSocketAddress) {
        return !inetSocketAddress.isUnresolved();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.resolver.AbstractAddressResolver
    public void doResolve(final InetSocketAddress inetSocketAddress, final Promise<InetSocketAddress> promise) throws Exception {
        this.nameResolver.resolve(inetSocketAddress.getHostName()).addListener(new FutureListener<InetAddress>() { // from class: io.grpc.netty.shaded.io.netty.resolver.InetSocketAddressResolver.1
            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
            public void operationComplete(Future<InetAddress> future) throws Exception {
                if (future.isSuccess()) {
                    promise.setSuccess(new InetSocketAddress(future.getNow(), inetSocketAddress.getPort()));
                } else {
                    promise.setFailure(future.cause());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.resolver.AbstractAddressResolver
    public void doResolveAll(final InetSocketAddress inetSocketAddress, final Promise<List<InetSocketAddress>> promise) throws Exception {
        this.nameResolver.resolveAll(inetSocketAddress.getHostName()).addListener(new FutureListener<List<InetAddress>>() { // from class: io.grpc.netty.shaded.io.netty.resolver.InetSocketAddressResolver.2
            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
            public void operationComplete(Future<List<InetAddress>> future) throws Exception {
                if (future.isSuccess()) {
                    List<InetAddress> now = future.getNow();
                    ArrayList arrayList = new ArrayList(now.size());
                    for (InetAddress inetAddress : now) {
                        arrayList.add(new InetSocketAddress(inetAddress, inetSocketAddress.getPort()));
                    }
                    promise.setSuccess(arrayList);
                    return;
                }
                promise.setFailure(future.cause());
            }
        });
    }

    @Override // io.grpc.netty.shaded.io.netty.resolver.AbstractAddressResolver, io.grpc.netty.shaded.io.netty.resolver.AddressResolver, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.nameResolver.close();
    }
}
