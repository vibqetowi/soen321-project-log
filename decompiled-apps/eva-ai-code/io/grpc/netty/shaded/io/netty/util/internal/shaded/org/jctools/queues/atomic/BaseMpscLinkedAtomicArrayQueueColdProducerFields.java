package io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: BaseMpscLinkedAtomicArrayQueue.java */
/* loaded from: classes4.dex */
abstract class BaseMpscLinkedAtomicArrayQueueColdProducerFields<E> extends BaseMpscLinkedAtomicArrayQueuePad3<E> {
    private static final AtomicLongFieldUpdater<BaseMpscLinkedAtomicArrayQueueColdProducerFields> P_LIMIT_UPDATER = AtomicLongFieldUpdater.newUpdater(BaseMpscLinkedAtomicArrayQueueColdProducerFields.class, "producerLimit");
    protected AtomicReferenceArray<E> producerBuffer;
    private volatile long producerLimit;
    protected long producerMask;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long lvProducerLimit() {
        return this.producerLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean casProducerLimit(long j, long j2) {
        return P_LIMIT_UPDATER.compareAndSet(this, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void soProducerLimit(long j) {
        P_LIMIT_UPDATER.lazySet(this, j);
    }
}
