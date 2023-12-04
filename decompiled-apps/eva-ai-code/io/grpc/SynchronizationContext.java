package io.grpc;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.google.common.base.Preconditions;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes4.dex */
public final class SynchronizationContext implements Executor {
    private final Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
    private final Queue<Runnable> queue = new ConcurrentLinkedQueue();
    private final AtomicReference<Thread> drainingThread = new AtomicReference<>();

    public SynchronizationContext(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) Preconditions.checkNotNull(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void drain() {
        while (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.drainingThread, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.queue.poll();
                    if (poll != null) {
                        poll.run();
                    } else {
                        this.drainingThread.set(null);
                        if (this.queue.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    this.drainingThread.set(null);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void executeLater(Runnable runnable) {
        this.queue.add(Preconditions.checkNotNull(runnable, "runnable is null"));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        executeLater(runnable);
        drain();
    }

    public void throwIfNotInThisSynchronizationContext() {
        Preconditions.checkState(Thread.currentThread() == this.drainingThread.get(), "Not called from the SynchronizationContext");
    }

    public final ScheduledHandle schedule(final Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        final ManagedRunnable managedRunnable = new ManagedRunnable(runnable);
        return new ScheduledHandle(managedRunnable, scheduledExecutorService.schedule(new Runnable() { // from class: io.grpc.SynchronizationContext.1
            @Override // java.lang.Runnable
            public void run() {
                SynchronizationContext.this.execute(managedRunnable);
            }

            public String toString() {
                return runnable.toString() + "(scheduled in SynchronizationContext)";
            }
        }, j, timeUnit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class ManagedRunnable implements Runnable {
        boolean hasStarted;
        boolean isCancelled;
        final Runnable task;

        ManagedRunnable(Runnable runnable) {
            this.task = (Runnable) Preconditions.checkNotNull(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.isCancelled) {
                return;
            }
            this.hasStarted = true;
            this.task.run();
        }
    }

    /* loaded from: classes4.dex */
    public static final class ScheduledHandle {
        private final ScheduledFuture<?> future;
        private final ManagedRunnable runnable;

        private ScheduledHandle(ManagedRunnable managedRunnable, ScheduledFuture<?> scheduledFuture) {
            this.runnable = (ManagedRunnable) Preconditions.checkNotNull(managedRunnable, "runnable");
            this.future = (ScheduledFuture) Preconditions.checkNotNull(scheduledFuture, "future");
        }

        public void cancel() {
            this.runnable.isCancelled = true;
            this.future.cancel(false);
        }

        public boolean isPending() {
            return (this.runnable.hasStarted || this.runnable.isCancelled) ? false : true;
        }
    }
}
