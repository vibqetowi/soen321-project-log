package io.grpc.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Preconditions;
import io.grpc.Decompressor;
import io.grpc.internal.ApplicationThreadDeframerListener;
import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;
import io.perfmark.Link;
import io.perfmark.PerfMark;
import java.io.Closeable;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes4.dex */
final class MigratingThreadDeframer implements ThreadOptimizedDeframer {
    private final ApplicationThreadDeframerListener appListener;
    private final MessageDeframer deframer;
    private boolean deframerOnTransportThread;
    private boolean messageProducerEnqueued;
    private final MigratingDeframerListener migratingListener;
    private final ApplicationThreadDeframerListener.TransportExecutor transportExecutor;
    private final MessageDeframer.Listener transportListener;
    private final DeframeMessageProducer messageProducer = new DeframeMessageProducer();
    private final Object lock = new Object();
    private final Queue<Op> opQueue = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface Op {
        void run(boolean z);
    }

    static /* synthetic */ ApplicationThreadDeframerListener access$500(MigratingThreadDeframer migratingThreadDeframer) {
        return migratingThreadDeframer.appListener;
    }

    public MigratingThreadDeframer(MessageDeframer.Listener listener, ApplicationThreadDeframerListener.TransportExecutor transportExecutor, MessageDeframer messageDeframer) {
        SquelchLateMessagesAvailableDeframerListener squelchLateMessagesAvailableDeframerListener = new SquelchLateMessagesAvailableDeframerListener((MessageDeframer.Listener) Preconditions.checkNotNull(listener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER));
        this.transportListener = squelchLateMessagesAvailableDeframerListener;
        this.transportExecutor = (ApplicationThreadDeframerListener.TransportExecutor) Preconditions.checkNotNull(transportExecutor, "transportExecutor");
        ApplicationThreadDeframerListener applicationThreadDeframerListener = new ApplicationThreadDeframerListener(squelchLateMessagesAvailableDeframerListener, transportExecutor);
        this.appListener = applicationThreadDeframerListener;
        MigratingDeframerListener migratingDeframerListener = new MigratingDeframerListener(applicationThreadDeframerListener);
        this.migratingListener = migratingDeframerListener;
        messageDeframer.setListener(migratingDeframerListener);
        this.deframer = messageDeframer;
    }

    @Override // io.grpc.internal.Deframer
    public void setMaxInboundMessageSize(int i) {
        this.deframer.setMaxInboundMessageSize(i);
    }

    @Override // io.grpc.internal.Deframer
    public void setDecompressor(Decompressor decompressor) {
        this.deframer.setDecompressor(decompressor);
    }

    @Override // io.grpc.internal.Deframer
    public void setFullStreamDecompressor(GzipInflatingBuffer gzipInflatingBuffer) {
        this.deframer.setFullStreamDecompressor(gzipInflatingBuffer);
    }

    private boolean runWhereAppropriate(Op op) {
        return runWhereAppropriate(op, true);
    }

    private boolean runWhereAppropriate(Op op, boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.lock) {
            z2 = this.deframerOnTransportThread;
            z3 = this.messageProducerEnqueued;
            if (!z2) {
                this.opQueue.offer(op);
                this.messageProducerEnqueued = true;
            }
        }
        if (z2) {
            op.run(true);
            return true;
        } else if (z3) {
            return false;
        } else {
            if (z) {
                PerfMark.startTask("MigratingThreadDeframer.messageAvailable");
                try {
                    this.transportListener.messagesAvailable(this.messageProducer);
                    return false;
                } finally {
                    PerfMark.stopTask("MigratingThreadDeframer.messageAvailable");
                }
            }
            final Link linkOut = PerfMark.linkOut();
            this.transportExecutor.runOnTransportThread(new Runnable() { // from class: io.grpc.internal.MigratingThreadDeframer.1
                @Override // java.lang.Runnable
                public void run() {
                    PerfMark.startTask("MigratingThreadDeframer.messageAvailable");
                    PerfMark.linkIn(linkOut);
                    try {
                        MigratingThreadDeframer.this.transportListener.messagesAvailable(MigratingThreadDeframer.this.messageProducer);
                    } finally {
                        PerfMark.stopTask("MigratingThreadDeframer.messageAvailable");
                    }
                }
            });
            return false;
        }
    }

    @Override // io.grpc.internal.ThreadOptimizedDeframer, io.grpc.internal.Deframer
    public void request(final int i) {
        runWhereAppropriate(new Op() { // from class: io.grpc.internal.MigratingThreadDeframer.1RequestOp
            @Override // io.grpc.internal.MigratingThreadDeframer.Op
            public void run(boolean z) {
                if (z) {
                    final Link linkOut = PerfMark.linkOut();
                    MigratingThreadDeframer.this.transportExecutor.runOnTransportThread(new Runnable() { // from class: io.grpc.internal.MigratingThreadDeframer.1RequestOp.1
                        @Override // java.lang.Runnable
                        public void run() {
                            PerfMark.startTask("MigratingThreadDeframer.request");
                            PerfMark.linkIn(linkOut);
                            try {
                                MigratingThreadDeframer.this.requestFromTransportThread(i);
                            } finally {
                                PerfMark.stopTask("MigratingThreadDeframer.request");
                            }
                        }
                    });
                    return;
                }
                PerfMark.startTask("MigratingThreadDeframer.request");
                try {
                    MigratingThreadDeframer.this.deframer.request(i);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestFromTransportThread(final int i) {
        runWhereAppropriate(new Op() { // from class: io.grpc.internal.MigratingThreadDeframer.1RequestAgainOp
            @Override // io.grpc.internal.MigratingThreadDeframer.Op
            public void run(boolean z) {
                if (z) {
                    try {
                        MigratingThreadDeframer.this.deframer.request(i);
                    } catch (Throwable th) {
                        MigratingThreadDeframer.this.appListener.deframeFailed(th);
                        MigratingThreadDeframer.this.deframer.close();
                    }
                    if (MigratingThreadDeframer.this.deframer.hasPendingDeliveries()) {
                        return;
                    }
                    synchronized (MigratingThreadDeframer.this.lock) {
                        PerfMark.event("MigratingThreadDeframer.deframerOnApplicationThread");
                        MigratingThreadDeframer.this.migratingListener.setDelegate(MigratingThreadDeframer.this.appListener);
                        MigratingThreadDeframer.this.deframerOnTransportThread = false;
                    }
                    return;
                }
                MigratingThreadDeframer.this.request(i);
            }
        });
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1DeframeOp  reason: invalid class name */
    /* loaded from: classes4.dex */
    class C1DeframeOp implements Op, Closeable {
        final /* synthetic */ ReadableBuffer val$data;

        C1DeframeOp(ReadableBuffer readableBuffer) {
            this.val$data = readableBuffer;
        }

        @Override // io.grpc.internal.MigratingThreadDeframer.Op
        public void run(boolean z) {
            PerfMark.startTask("MigratingThreadDeframer.deframe");
            try {
                if (z) {
                    MigratingThreadDeframer.this.deframer.deframe(this.val$data);
                } else {
                    MigratingThreadDeframer.this.deframer.deframe(this.val$data);
                }
            } finally {
                PerfMark.stopTask("MigratingThreadDeframer.deframe");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.val$data.close();
        }
    }

    @Override // io.grpc.internal.Deframer
    public void deframe(ReadableBuffer readableBuffer) {
        runWhereAppropriate(new C1DeframeOp(readableBuffer));
    }

    @Override // io.grpc.internal.Deframer
    public void closeWhenComplete() {
        runWhereAppropriate(new Op() { // from class: io.grpc.internal.MigratingThreadDeframer.1CloseWhenCompleteOp
            @Override // io.grpc.internal.MigratingThreadDeframer.Op
            public void run(boolean z) {
                MigratingThreadDeframer.this.deframer.closeWhenComplete();
            }
        });
    }

    @Override // io.grpc.internal.Deframer
    public void close() {
        if (runWhereAppropriate(new Op() { // from class: io.grpc.internal.MigratingThreadDeframer.1CloseOp
            @Override // io.grpc.internal.MigratingThreadDeframer.Op
            public void run(boolean z) {
                MigratingThreadDeframer.this.deframer.close();
            }
        })) {
            return;
        }
        this.deframer.stopDelivery();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class DeframeMessageProducer implements StreamListener.MessageProducer, Closeable {
        DeframeMessageProducer() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
            if (r4.this$0.deframer.hasPendingDeliveries() == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
            io.perfmark.PerfMark.event("MigratingThreadDeframer.deframerOnTransportThread");
            r4.this$0.migratingListener.setDelegate(r4.this$0.transportListener);
            r4.this$0.deframerOnTransportThread = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
            r4.this$0.messageProducerEnqueued = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
            return null;
         */
        @Override // io.grpc.internal.StreamListener.MessageProducer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InputStream next() {
            Op op;
            while (true) {
                InputStream messageReadQueuePoll = MigratingThreadDeframer.this.appListener.messageReadQueuePoll();
                if (messageReadQueuePoll != null) {
                    return messageReadQueuePoll;
                }
                synchronized (MigratingThreadDeframer.this.lock) {
                    op = (Op) MigratingThreadDeframer.this.opQueue.poll();
                    if (op == null) {
                        break;
                    }
                }
                op.run(false);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Op op;
            while (true) {
                synchronized (MigratingThreadDeframer.this.lock) {
                    do {
                        op = (Op) MigratingThreadDeframer.this.opQueue.poll();
                        if (op == null) {
                            break;
                        }
                    } while (!(op instanceof Closeable));
                    if (op == null) {
                        MigratingThreadDeframer.this.messageProducerEnqueued = false;
                        return;
                    }
                }
                GrpcUtil.closeQuietly((Closeable) op);
            }
        }
    }

    /* loaded from: classes4.dex */
    static class MigratingDeframerListener extends ForwardingDeframerListener {
        private MessageDeframer.Listener delegate;

        public MigratingDeframerListener(MessageDeframer.Listener listener) {
            setDelegate(listener);
        }

        @Override // io.grpc.internal.ForwardingDeframerListener
        protected MessageDeframer.Listener delegate() {
            return this.delegate;
        }

        public void setDelegate(MessageDeframer.Listener listener) {
            this.delegate = (MessageDeframer.Listener) Preconditions.checkNotNull(listener, "delegate");
        }
    }
}
