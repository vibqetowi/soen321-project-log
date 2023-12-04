package com.google.api.gax.batching;

import com.google.common.base.Preconditions;
/* loaded from: classes7.dex */
class BlockingSemaphore implements Semaphore64 {
    private long currentPermits;

    private static void checkNotNegative(long j) {
        Preconditions.checkArgument(j >= 0, "negative permits not allowed: %s", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BlockingSemaphore(long j) {
        checkNotNegative(j);
        this.currentPermits = j;
    }

    @Override // com.google.api.gax.batching.Semaphore64
    public synchronized void release(long j) {
        checkNotNegative(j);
        this.currentPermits += j;
        notifyAll();
    }

    @Override // com.google.api.gax.batching.Semaphore64
    public synchronized boolean acquire(long j) {
        long j2;
        checkNotNegative(j);
        boolean z = false;
        while (true) {
            j2 = this.currentPermits;
            if (j2 >= j) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        this.currentPermits = j2 - j;
        if (z) {
            Thread.currentThread().interrupt();
        }
        return true;
    }
}
