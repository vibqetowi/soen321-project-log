package io.grpc.netty.shaded.io.netty.resolver;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.integrity.IntegrityManager;
import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.Promise;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.TypeParameterMatcher;
import java.net.SocketAddress;
import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class AbstractAddressResolver<T extends SocketAddress> implements AddressResolver<T> {
    private final EventExecutor executor;
    private final TypeParameterMatcher matcher;

    @Override // io.grpc.netty.shaded.io.netty.resolver.AddressResolver, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    protected abstract boolean doIsResolved(T t);

    protected abstract void doResolve(T t, Promise<T> promise) throws Exception;

    protected abstract void doResolveAll(T t, Promise<List<T>> promise) throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractAddressResolver(EventExecutor eventExecutor) {
        this.executor = (EventExecutor) ObjectUtil.checkNotNull(eventExecutor, "executor");
        this.matcher = TypeParameterMatcher.find(this, AbstractAddressResolver.class, ExifInterface.GPS_DIRECTION_TRUE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractAddressResolver(EventExecutor eventExecutor, Class<? extends T> cls) {
        this.executor = (EventExecutor) ObjectUtil.checkNotNull(eventExecutor, "executor");
        this.matcher = TypeParameterMatcher.get(cls);
    }

    protected EventExecutor executor() {
        return this.executor;
    }

    @Override // io.grpc.netty.shaded.io.netty.resolver.AddressResolver
    public boolean isSupported(SocketAddress socketAddress) {
        return this.matcher.match(socketAddress);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.netty.shaded.io.netty.resolver.AddressResolver
    public final boolean isResolved(SocketAddress socketAddress) {
        if (!isSupported(socketAddress)) {
            throw new UnsupportedAddressTypeException();
        }
        return doIsResolved(socketAddress);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.netty.shaded.io.netty.resolver.AddressResolver
    public final Future<T> resolve(SocketAddress socketAddress) {
        if (!isSupported((SocketAddress) ObjectUtil.checkNotNull(socketAddress, IntegrityManager.INTEGRITY_TYPE_ADDRESS))) {
            return executor().newFailedFuture(new UnsupportedAddressTypeException());
        }
        if (isResolved(socketAddress)) {
            return this.executor.newSucceededFuture(socketAddress);
        }
        try {
            Promise<T> newPromise = executor().newPromise();
            doResolve(socketAddress, newPromise);
            return newPromise;
        } catch (Exception e) {
            return executor().newFailedFuture(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.netty.shaded.io.netty.resolver.AddressResolver
    public final Future<T> resolve(SocketAddress socketAddress, Promise<T> promise) {
        ObjectUtil.checkNotNull(socketAddress, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        ObjectUtil.checkNotNull(promise, "promise");
        if (!isSupported(socketAddress)) {
            return promise.setFailure(new UnsupportedAddressTypeException());
        }
        if (isResolved(socketAddress)) {
            return promise.setSuccess(socketAddress);
        }
        try {
            doResolve(socketAddress, promise);
            return promise;
        } catch (Exception e) {
            return promise.setFailure(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.netty.shaded.io.netty.resolver.AddressResolver
    public final Future<List<T>> resolveAll(SocketAddress socketAddress) {
        if (!isSupported((SocketAddress) ObjectUtil.checkNotNull(socketAddress, IntegrityManager.INTEGRITY_TYPE_ADDRESS))) {
            return executor().newFailedFuture(new UnsupportedAddressTypeException());
        }
        if (isResolved(socketAddress)) {
            return this.executor.newSucceededFuture(Collections.singletonList(socketAddress));
        }
        try {
            Promise<List<T>> newPromise = executor().newPromise();
            doResolveAll(socketAddress, newPromise);
            return newPromise;
        } catch (Exception e) {
            return executor().newFailedFuture(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.netty.shaded.io.netty.resolver.AddressResolver
    public final Future<List<T>> resolveAll(SocketAddress socketAddress, Promise<List<T>> promise) {
        ObjectUtil.checkNotNull(socketAddress, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        ObjectUtil.checkNotNull(promise, "promise");
        if (!isSupported(socketAddress)) {
            return promise.setFailure(new UnsupportedAddressTypeException());
        }
        if (isResolved(socketAddress)) {
            return promise.setSuccess(Collections.singletonList(socketAddress));
        }
        try {
            doResolveAll(socketAddress, promise);
            return promise;
        } catch (Exception e) {
            return promise.setFailure(e);
        }
    }
}
