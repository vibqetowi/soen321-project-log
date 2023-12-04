package io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues;

import io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo;
import io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.util.Pow2;
import io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.util.RangeUtil;
import io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class BaseMpscLinkedArrayQueue<E> extends BaseMpscLinkedArrayQueueColdProducerFields<E> implements MessagePassingQueue<E>, QueueProgressIndicators {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CONTINUE_TO_P_INDEX_CAS = 0;
    private static final int QUEUE_FULL = 2;
    private static final int QUEUE_RESIZE = 3;
    private static final int RETRY = 1;
    private static final Object JUMP = new Object();
    private static final Object BUFFER_CONSUMED = new Object();

    protected abstract long availableInQueue(long j, long j2);

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public abstract int capacity();

    protected abstract long getCurrentBufferCapacity(long j);

    protected abstract int getNextBufferSize(E[] eArr);

    public BaseMpscLinkedArrayQueue(int i) {
        RangeUtil.checkGreaterThanOrEqual(i, 2, "initialCapacity");
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        long j = (roundToPowerOfTwo - 1) << 1;
        E[] eArr = (E[]) UnsafeRefArrayAccess.allocateRefArray(roundToPowerOfTwo + 1);
        this.producerBuffer = eArr;
        this.producerMask = j;
        this.consumerBuffer = eArr;
        this.consumerMask = j;
        soProducerLimit(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int size() {
        long lvProducerIndex;
        long lvConsumerIndex;
        long lvConsumerIndex2 = lvConsumerIndex();
        while (true) {
            lvProducerIndex = lvProducerIndex();
            lvConsumerIndex = lvConsumerIndex();
            if (lvConsumerIndex2 == lvConsumerIndex) {
                break;
            }
            lvConsumerIndex2 = lvConsumerIndex;
        }
        long j = (lvProducerIndex - lvConsumerIndex) >> 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean isEmpty() {
        return lvConsumerIndex() == lvProducerIndex();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return getClass().getName();
    }

    @Override // java.util.Queue, io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        while (true) {
            long lvProducerLimit = lvProducerLimit();
            long lvProducerIndex = lvProducerIndex();
            if ((lvProducerIndex & 1) != 1) {
                long j = this.producerMask;
                E[] eArr = this.producerBuffer;
                if (lvProducerLimit <= lvProducerIndex) {
                    int offerSlowPath = offerSlowPath(j, lvProducerIndex, lvProducerLimit);
                    if (offerSlowPath == 1) {
                        continue;
                    } else if (offerSlowPath == 2) {
                        return false;
                    } else {
                        if (offerSlowPath == 3) {
                            resize(j, eArr, lvProducerIndex, e, null);
                            return true;
                        }
                    }
                }
                if (casProducerIndex(lvProducerIndex, 2 + lvProducerIndex)) {
                    UnsafeRefArrayAccess.soRefElement(eArr, LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lvProducerIndex, j), e);
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    @Override // java.util.Queue, io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public E poll() {
        E[] eArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j = this.consumerMask;
        long modifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        E e = (E) UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e == null) {
            if (lpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                e = (E) UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
            } while (e == null);
            if (e != JUMP) {
            }
        } else if (e != JUMP) {
            return newBufferPoll(nextBuffer(eArr, j), lpConsumerIndex);
        } else {
            UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, null);
            soConsumerIndex(lpConsumerIndex + 2);
            return e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[RETURN] */
    @Override // java.util.Queue, io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public E peek() {
        E[] eArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j = this.consumerMask;
        long modifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        E e = (E) UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e != null || lpConsumerIndex == lvProducerIndex()) {
            return e != JUMP ? newBufferPeek(nextBuffer(eArr, j), lpConsumerIndex) : e;
        }
        do {
            e = (E) UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        } while (e == null);
        if (e != JUMP) {
        }
    }

    private int offerSlowPath(long j, long j2, long j3) {
        long lvConsumerIndex = lvConsumerIndex();
        long currentBufferCapacity = getCurrentBufferCapacity(j) + lvConsumerIndex;
        if (currentBufferCapacity > j2) {
            return !casProducerLimit(j3, currentBufferCapacity) ? 1 : 0;
        } else if (availableInQueue(j2, lvConsumerIndex) <= 0) {
            return 2;
        } else {
            return casProducerIndex(j2, 1 + j2) ? 3 : 1;
        }
    }

    private E[] nextBuffer(E[] eArr, long j) {
        long nextArrayOffset = nextArrayOffset(j);
        E[] eArr2 = (E[]) ((Object[]) UnsafeRefArrayAccess.lvRefElement(eArr, nextArrayOffset));
        this.consumerBuffer = eArr2;
        this.consumerMask = (LinkedArrayQueueUtil.length(eArr2) - 2) << 1;
        UnsafeRefArrayAccess.soRefElement(eArr, nextArrayOffset, BUFFER_CONSUMED);
        return eArr2;
    }

    private static long nextArrayOffset(long j) {
        return LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j + 2, Long.MAX_VALUE);
    }

    private E newBufferPoll(E[] eArr, long j) {
        long modifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j, this.consumerMask);
        E e = (E) UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e == null) {
            throw new IllegalStateException("new buffer must have at least one element");
        }
        UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(j + 2);
        return e;
    }

    private E newBufferPeek(E[] eArr, long j) {
        E e = (E) UnsafeRefArrayAccess.lvRefElement(eArr, LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j, this.consumerMask));
        if (e != null) {
            return e;
        }
        throw new IllegalStateException("new buffer must have at least one element");
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex() / 2;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex() / 2;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        E[] eArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j = this.consumerMask;
        long modifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        E e = (E) UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e == null) {
            return null;
        }
        if (e == JUMP) {
            return newBufferPoll(nextBuffer(eArr, j), lpConsumerIndex);
        }
        UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 2);
        return e;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        E[] eArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j = this.consumerMask;
        E e = (E) UnsafeRefArrayAccess.lvRefElement(eArr, LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j));
        return e == JUMP ? newBufferPeek(nextBuffer(eArr, j), lpConsumerIndex) : e;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier) {
        int capacity = capacity();
        long j = 0;
        do {
            int fill = fill(supplier, PortableJvmInfo.RECOMENDED_OFFER_BATCH);
            if (fill == 0) {
                return (int) j;
            }
            j += fill;
        } while (j <= capacity);
        return (int) j;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier, int i) {
        long j;
        if (supplier == null) {
            throw new IllegalArgumentException("supplier is null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("limit is negative:" + i);
        }
        if (i == 0) {
            return 0;
        }
        while (true) {
            long lvProducerLimit = lvProducerLimit();
            long lvProducerIndex = lvProducerIndex();
            if ((lvProducerIndex & 1) != 1) {
                long j2 = this.producerMask;
                E[] eArr = this.producerBuffer;
                long min = Math.min(lvProducerLimit, (i * 2) + lvProducerIndex);
                if (lvProducerIndex >= lvProducerLimit) {
                    int offerSlowPath = offerSlowPath(j2, lvProducerIndex, lvProducerLimit);
                    if (offerSlowPath != 0 && offerSlowPath != 1) {
                        if (offerSlowPath == 2) {
                            return 0;
                        }
                        if (offerSlowPath == 3) {
                            resize(j2, eArr, lvProducerIndex, null, supplier);
                            return 1;
                        }
                        j = min;
                    }
                } else {
                    j = min;
                }
                if (casProducerIndex(lvProducerIndex, j)) {
                    int i2 = (int) ((j - lvProducerIndex) / 2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        UnsafeRefArrayAccess.soRefElement(eArr, LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset((i3 * 2) + lvProducerIndex, j2), supplier.get());
                    }
                    return i2;
                }
            }
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void fill(MessagePassingQueue.Supplier<E> supplier, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        MessagePassingQueueUtil.fill(this, supplier, waitStrategy, exitCondition);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer) {
        return drain(consumer, capacity());
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer, int i) {
        return MessagePassingQueueUtil.drain(this, consumer, i);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(MessagePassingQueue.Consumer<E> consumer, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        MessagePassingQueueUtil.drain(this, consumer, waitStrategy, exitCondition);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new WeakIterator(this.consumerBuffer, lvConsumerIndex(), lvProducerIndex());
    }

    /* loaded from: classes4.dex */
    private static class WeakIterator<E> implements Iterator<E> {
        private E[] currentBuffer;
        private int mask;
        private E nextElement;
        private long nextIndex;
        private final long pIndex;

        WeakIterator(E[] eArr, long j, long j2) {
            this.pIndex = j2 >> 1;
            this.nextIndex = j >> 1;
            setBuffer(eArr);
            this.nextElement = getNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextElement != null;
        }

        @Override // java.util.Iterator
        public E next() {
            E e = this.nextElement;
            if (e == null) {
                throw new NoSuchElementException();
            }
            this.nextElement = getNext();
            return e;
        }

        private void setBuffer(E[] eArr) {
            this.currentBuffer = eArr;
            this.mask = LinkedArrayQueueUtil.length(eArr) - 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private E getNext() {
            while (true) {
                long j = this.nextIndex;
                if (j >= this.pIndex) {
                    break;
                }
                this.nextIndex = 1 + j;
                E e = (E) UnsafeRefArrayAccess.lvRefElement(this.currentBuffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(j, this.mask));
                if (e != null) {
                    if (e == BaseMpscLinkedArrayQueue.JUMP) {
                        Object lvRefElement = UnsafeRefArrayAccess.lvRefElement(this.currentBuffer, UnsafeRefArrayAccess.calcRefElementOffset(this.mask + 1));
                        if (lvRefElement == BaseMpscLinkedArrayQueue.BUFFER_CONSUMED || lvRefElement == null) {
                            break;
                        }
                        setBuffer((Object[]) lvRefElement);
                        E e2 = (E) UnsafeRefArrayAccess.lvRefElement(this.currentBuffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(j, this.mask));
                        if (e2 != null) {
                            return e2;
                        }
                    } else {
                        return e;
                    }
                }
            }
            return null;
        }
    }

    private void resize(long j, E[] eArr, long j2, E e, MessagePassingQueue.Supplier<E> supplier) {
        int nextBufferSize = getNextBufferSize(eArr);
        try {
            E[] eArr2 = (E[]) UnsafeRefArrayAccess.allocateRefArray(nextBufferSize);
            this.producerBuffer = eArr2;
            long j3 = (nextBufferSize - 2) << 1;
            this.producerMask = j3;
            long modifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j2, j);
            long modifiedCalcCircularRefElementOffset2 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j2, j3);
            if (e == null) {
                e = supplier.get();
            }
            UnsafeRefArrayAccess.soRefElement(eArr2, modifiedCalcCircularRefElementOffset2, e);
            UnsafeRefArrayAccess.soRefElement(eArr, nextArrayOffset(j), eArr2);
            long availableInQueue = availableInQueue(j2, lvConsumerIndex());
            RangeUtil.checkPositive(availableInQueue, "availableInQueue");
            soProducerLimit(Math.min(j3, availableInQueue) + j2);
            soProducerIndex(j2 + 2);
            UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, JUMP);
        } catch (OutOfMemoryError e2) {
            soProducerIndex(j2);
            throw e2;
        }
    }
}
