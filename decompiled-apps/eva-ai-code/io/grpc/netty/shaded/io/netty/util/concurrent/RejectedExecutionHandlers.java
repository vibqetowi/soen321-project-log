package io.grpc.netty.shaded.io.netty.util.concurrent;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes4.dex */
public final class RejectedExecutionHandlers {
    private static final RejectedExecutionHandler REJECT = new RejectedExecutionHandler() { // from class: io.grpc.netty.shaded.io.netty.util.concurrent.RejectedExecutionHandlers.1
        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.RejectedExecutionHandler
        public void rejected(Runnable runnable, SingleThreadEventExecutor singleThreadEventExecutor) {
            throw new RejectedExecutionException();
        }
    };

    private RejectedExecutionHandlers() {
    }

    public static RejectedExecutionHandler reject() {
        return REJECT;
    }

    public static RejectedExecutionHandler backoff(final int i, long j, TimeUnit timeUnit) {
        ObjectUtil.checkPositive(i, "retries");
        final long nanos = timeUnit.toNanos(j);
        return new RejectedExecutionHandler() { // from class: io.grpc.netty.shaded.io.netty.util.concurrent.RejectedExecutionHandlers.2
            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.RejectedExecutionHandler
            public void rejected(Runnable runnable, SingleThreadEventExecutor singleThreadEventExecutor) {
                if (!singleThreadEventExecutor.inEventLoop()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        singleThreadEventExecutor.wakeup(false);
                        LockSupport.parkNanos(nanos);
                        if (singleThreadEventExecutor.offerTask(runnable)) {
                            return;
                        }
                    }
                }
                throw new RejectedExecutionException();
            }
        };
    }
}
