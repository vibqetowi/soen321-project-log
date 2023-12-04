package io.grpc.netty.shaded.io.netty.resolver;

import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor;
import java.net.InetAddress;
import java.net.InetSocketAddress;
/* loaded from: classes4.dex */
public abstract class InetNameResolver extends SimpleNameResolver<InetAddress> {
    private volatile AddressResolver<InetSocketAddress> addressResolver;

    /* JADX INFO: Access modifiers changed from: protected */
    public InetNameResolver(EventExecutor eventExecutor) {
        super(eventExecutor);
    }

    public AddressResolver<InetSocketAddress> asAddressResolver() {
        AddressResolver<InetSocketAddress> addressResolver = this.addressResolver;
        if (addressResolver == null) {
            synchronized (this) {
                addressResolver = this.addressResolver;
                if (addressResolver == null) {
                    addressResolver = new InetSocketAddressResolver(executor(), this);
                    this.addressResolver = addressResolver;
                }
            }
        }
        return addressResolver;
    }
}
