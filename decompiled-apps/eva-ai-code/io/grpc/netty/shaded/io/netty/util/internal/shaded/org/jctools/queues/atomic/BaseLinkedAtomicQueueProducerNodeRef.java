package io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.atomic;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: BaseLinkedAtomicQueue.java */
/* loaded from: classes4.dex */
abstract class BaseLinkedAtomicQueueProducerNodeRef<E> extends BaseLinkedAtomicQueuePad0<E> {
    private static final AtomicReferenceFieldUpdater<BaseLinkedAtomicQueueProducerNodeRef, LinkedQueueAtomicNode> P_NODE_UPDATER = AtomicReferenceFieldUpdater.newUpdater(BaseLinkedAtomicQueueProducerNodeRef.class, LinkedQueueAtomicNode.class, "producerNode");
    private volatile LinkedQueueAtomicNode<E> producerNode;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void spProducerNode(LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        P_NODE_UPDATER.lazySet(this, linkedQueueAtomicNode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void soProducerNode(LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        P_NODE_UPDATER.lazySet(this, linkedQueueAtomicNode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LinkedQueueAtomicNode<E> lvProducerNode() {
        return this.producerNode;
    }

    final boolean casProducerNode(LinkedQueueAtomicNode<E> linkedQueueAtomicNode, LinkedQueueAtomicNode<E> linkedQueueAtomicNode2) {
        return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(P_NODE_UPDATER, this, linkedQueueAtomicNode, linkedQueueAtomicNode2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LinkedQueueAtomicNode<E> lpProducerNode() {
        return this.producerNode;
    }

    protected final LinkedQueueAtomicNode<E> xchgProducerNode(LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        return P_NODE_UPDATER.getAndSet(this, linkedQueueAtomicNode);
    }
}
