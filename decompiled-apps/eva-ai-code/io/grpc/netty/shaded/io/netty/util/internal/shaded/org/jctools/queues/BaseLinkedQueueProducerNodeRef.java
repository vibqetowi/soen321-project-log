package io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.queues;

import com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0;
import io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseLinkedQueue.java */
/* loaded from: classes4.dex */
public abstract class BaseLinkedQueueProducerNodeRef<E> extends BaseLinkedQueuePad0<E> {
    static final long P_NODE_OFFSET = UnsafeAccess.fieldOffset(BaseLinkedQueueProducerNodeRef.class, "producerNode");
    private volatile LinkedQueueNode<E> producerNode;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void spProducerNode(LinkedQueueNode<E> linkedQueueNode) {
        UnsafeAccess.UNSAFE.putObject(this, P_NODE_OFFSET, linkedQueueNode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void soProducerNode(LinkedQueueNode<E> linkedQueueNode) {
        UnsafeAccess.UNSAFE.putOrderedObject(this, P_NODE_OFFSET, linkedQueueNode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LinkedQueueNode<E> lvProducerNode() {
        return this.producerNode;
    }

    final boolean casProducerNode(LinkedQueueNode<E> linkedQueueNode, LinkedQueueNode<E> linkedQueueNode2) {
        return Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(UnsafeAccess.UNSAFE, this, P_NODE_OFFSET, linkedQueueNode, linkedQueueNode2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LinkedQueueNode<E> lpProducerNode() {
        return this.producerNode;
    }
}
