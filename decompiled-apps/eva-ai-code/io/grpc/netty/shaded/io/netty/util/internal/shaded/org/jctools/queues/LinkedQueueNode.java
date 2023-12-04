package io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues;

import io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess;
/* loaded from: classes4.dex */
final class LinkedQueueNode<E> {
    private static final long NEXT_OFFSET = UnsafeAccess.fieldOffset(LinkedQueueNode.class, "next");
    private volatile LinkedQueueNode<E> next;
    private E value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedQueueNode() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedQueueNode(E e) {
        spValue(e);
    }

    public E getAndNullValue() {
        E lpValue = lpValue();
        spValue(null);
        return lpValue;
    }

    public E lpValue() {
        return this.value;
    }

    public void spValue(E e) {
        this.value = e;
    }

    public void soNext(LinkedQueueNode<E> linkedQueueNode) {
        UnsafeAccess.UNSAFE.putOrderedObject(this, NEXT_OFFSET, linkedQueueNode);
    }

    public void spNext(LinkedQueueNode<E> linkedQueueNode) {
        UnsafeAccess.UNSAFE.putObject(this, NEXT_OFFSET, linkedQueueNode);
    }

    public LinkedQueueNode<E> lvNext() {
        return this.next;
    }
}
