package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public final class SequentialExecutor implements Executor {
    private static final Logger log = Logger.getLogger(SequentialExecutor.class.getName());
    private final Executor executor;
    private final Deque<Runnable> queue = new ArrayDeque();
    private WorkerRunningState workerRunningState = WorkerRunningState.IDLE;
    private long workerRunCount = 0;
    private final QueueWorker worker = new QueueWorker();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SequentialExecutor(Executor executor) {
        this.executor = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.queue) {
            if (this.workerRunningState != WorkerRunningState.RUNNING && this.workerRunningState != WorkerRunningState.QUEUED) {
                long j = this.workerRunCount;
                Runnable runnable2 = new Runnable(this) { // from class: com.google.common.util.concurrent.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }

                    public String toString() {
                        return runnable.toString();
                    }
                };
                this.queue.add(runnable2);
                this.workerRunningState = WorkerRunningState.QUEUING;
                try {
                    this.executor.execute(this.worker);
                    if (this.workerRunningState != WorkerRunningState.QUEUING) {
                        return;
                    }
                    synchronized (this.queue) {
                        if (this.workerRunCount == j && this.workerRunningState == WorkerRunningState.QUEUING) {
                            this.workerRunningState = WorkerRunningState.QUEUED;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.queue) {
                        if ((this.workerRunningState != WorkerRunningState.IDLE && this.workerRunningState != WorkerRunningState.QUEUING) || !this.queue.removeLastOccurrence(runnable2)) {
                            r8 = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || r8) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.queue.add(runnable);
        }
    }

    /* loaded from: classes7.dex */
    private final class QueueWorker implements Runnable {
        @CheckForNull
        Runnable task;

        private QueueWorker() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.queue) {
                    SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
            if (r1 == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
            r9.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
            r4 = com.google.common.util.concurrent.SequentialExecutor.log;
            r5 = java.util.logging.Level.SEVERE;
            r6 = java.lang.String.valueOf(r9.task);
            r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 35);
            r8.append("Exception while executing runnable ");
            r8.append(r6);
            r4.log(r5, r8.toString(), (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void workOnQueue() {
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                    synchronized (SequentialExecutor.this.queue) {
                        if (!z) {
                            if (SequentialExecutor.this.workerRunningState != WorkerRunningState.RUNNING) {
                                SequentialExecutor.access$308(SequentialExecutor.this);
                                SequentialExecutor.this.workerRunningState = WorkerRunningState.RUNNING;
                                z = true;
                            }
                        }
                        Runnable runnable = (Runnable) SequentialExecutor.this.queue.poll();
                        this.task = runnable;
                        if (runnable == null) {
                            SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                        }
                    }
                    if (z2) {
                        return;
                    }
                    return;
                    this.task = null;
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public String toString() {
            Runnable runnable = this.task;
            if (runnable == null) {
                String valueOf = String.valueOf(SequentialExecutor.this.workerRunningState);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("SequentialExecutorWorker{state=");
                sb.append(valueOf);
                sb.append("}");
                return sb.toString();
            }
            String valueOf2 = String.valueOf(runnable);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
            sb2.append("SequentialExecutorWorker{running=");
            sb2.append(valueOf2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public String toString() {
        int identityHashCode = System.identityHashCode(this);
        String valueOf = String.valueOf(this.executor);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("SequentialExecutor@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
