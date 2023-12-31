package io.grpc.netty.shaded.io.netty.util.concurrent;

import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import java.util.EventListener;
/* loaded from: classes4.dex */
public interface GenericFutureListener<F extends Future<?>> extends EventListener {
    void operationComplete(F f) throws Exception;
}
