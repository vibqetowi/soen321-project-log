package io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: BaseLinkedAtomicQueue.java */
/* loaded from: classes4.dex */
abstract class BaseLinkedAtomicQueueConsumerNodeRef<E> extends BaseLinkedAtomicQueuePad1<E> {
    private static final AtomicReferenceFieldUpdater<BaseLinkedAtomicQueueConsumerNodeRef, LinkedQueueAtomicNode> C_NODE_UPDATER = AtomicReferenceFieldUpdater.newUpdater(BaseLinkedAtomicQueueConsumerNodeRef.class, LinkedQueueAtomicNode.class, "consumerNode");
    private volatile LinkedQueueAtomicNode<E> consumerNode;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void spConsumerNode(LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        C_NODE_UPDATER.lazySet(this, linkedQueueAtomicNode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LinkedQueueAtomicNode<E> lvConsumerNode() {
        return this.consumerNode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LinkedQueueAtomicNode<E> lpConsumerNode() {
        return this.consumerNode;
    }
}
