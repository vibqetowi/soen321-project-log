package com.google.api.gax.batching;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes7.dex */
class NonBlockingSemaphore implements Semaphore64 {
    private final AtomicLong currentPermits;

    private static void checkNotNegative(long j) {
        Preconditions.checkArgument(j >= 0, "negative permits not allowed: %s", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NonBlockingSemaphore(long j) {
        checkNotNegative(j);
        this.currentPermits = new AtomicLong(j);
    }

    @Override // com.google.api.gax.batching.Semaphore64
    public void release(long j) {
        checkNotNegative(j);
        this.currentPermits.addAndGet(j);
    }

    @Override // com.google.api.gax.batching.Semaphore64
    public boolean acquire(long j) {
        long j2;
        checkNotNegative(j);
        do {
            j2 = this.currentPermits.get();
            if (j2 < j) {
                return false;
            }
        } while (!this.currentPermits.compareAndSet(j2, j2 - j));
        return true;
    }
}
