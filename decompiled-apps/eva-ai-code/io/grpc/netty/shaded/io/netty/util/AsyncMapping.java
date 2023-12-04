package io.grpc.netty.shaded.io.netty.util;

import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.Promise;
/* loaded from: classes4.dex */
public interface AsyncMapping<IN, OUT> {
    Future<OUT> map(IN in, Promise<OUT> promise);
}
