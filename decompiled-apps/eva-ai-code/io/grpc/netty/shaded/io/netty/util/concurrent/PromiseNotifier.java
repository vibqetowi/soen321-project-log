package io.grpc.netty.shaded.io.netty.util.concurrent;

import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PromiseNotificationUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
/* loaded from: classes4.dex */
public class PromiseNotifier<V, F extends Future<V>> implements GenericFutureListener<F> {
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(PromiseNotifier.class);
    private final boolean logNotifyFailure;
    private final Promise<? super V>[] promises;

    @SafeVarargs
    public PromiseNotifier(Promise<? super V>... promiseArr) {
        this(true, promiseArr);
    }

    @SafeVarargs
    public PromiseNotifier(boolean z, Promise<? super V>... promiseArr) {
        ObjectUtil.checkNotNull(promiseArr, "promises");
        for (Promise<? super V> promise : promiseArr) {
            if (promise == null) {
                throw new IllegalArgumentException("promises contains null Promise");
            }
        }
        this.promises = (Promise[]) promiseArr.clone();
        this.logNotifyFailure = z;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
    public void operationComplete(F f) throws Exception {
        InternalLogger internalLogger = this.logNotifyFailure ? logger : null;
        int i = 0;
        if (f.isSuccess()) {
            Object obj = f.get();
            Promise<? super V>[] promiseArr = this.promises;
            int length = promiseArr.length;
            while (i < length) {
                PromiseNotificationUtil.trySuccess(promiseArr[i], obj, internalLogger);
                i++;
            }
        } else if (f.isCancelled()) {
            Promise<? super V>[] promiseArr2 = this.promises;
            int length2 = promiseArr2.length;
            while (i < length2) {
                PromiseNotificationUtil.tryCancel(promiseArr2[i], internalLogger);
                i++;
            }
        } else {
            Throwable cause = f.cause();
            Promise<? super V>[] promiseArr3 = this.promises;
            int length3 = promiseArr3.length;
            while (i < length3) {
                PromiseNotificationUtil.tryFailure(promiseArr3[i], cause, internalLogger);
                i++;
            }
        }
    }
}
