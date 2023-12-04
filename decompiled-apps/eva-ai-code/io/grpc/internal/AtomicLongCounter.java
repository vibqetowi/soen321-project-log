package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes4.dex */
final class AtomicLongCounter implements LongCounter {
    private final AtomicLong counter = new AtomicLong();

    @Override // io.grpc.internal.LongCounter
    public void add(long j) {
        this.counter.getAndAdd(j);
    }

    @Override // io.grpc.internal.LongCounter
    public long value() {
        return this.counter.get();
    }
}
