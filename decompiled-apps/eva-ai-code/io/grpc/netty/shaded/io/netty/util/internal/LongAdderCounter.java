package io.grpc.netty.shaded.io.netty.util.internal;

import java.util.concurrent.atomic.LongAdder;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LongAdderCounter extends LongAdder implements LongCounter {
    @Override // io.grpc.netty.shaded.io.netty.util.internal.LongCounter
    public long value() {
        long longValue;
        longValue = longValue();
        return longValue;
    }
}
