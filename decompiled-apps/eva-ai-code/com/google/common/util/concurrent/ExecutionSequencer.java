package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public final class ExecutionSequencer {
    private final AtomicReference<ListenableFuture<Void>> ref = new AtomicReference<>(Futures.immediateVoidFuture());
    private ThreadConfinedTaskQueue latestTaskQueue = new ThreadConfinedTaskQueue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    private ExecutionSequencer() {
    }

    public static ExecutionSequencer create() {
        return new ExecutionSequencer();
    }

    /* loaded from: classes7.dex */
    private static final class ThreadConfinedTaskQueue {
        @CheckForNull
        Executor nextExecutor;
        @CheckForNull
        Runnable nextTask;
        @CheckForNull
        Thread thread;

        private ThreadConfinedTaskQueue() {
        }
    }

    public <T> ListenableFuture<T> submit(final Callable<T> callable, Executor executor) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(executor);
        return submitAsync(new AsyncCallable<T>(this) { // from class: com.google.common.util.concurrent.ExecutionSequencer.1
            @Override // com.google.common.util.concurrent.AsyncCallable
            public ListenableFuture<T> call() throws Exception {
                return Futures.immediateFuture(callable.call());
            }

            public String toString() {
                return callable.toString();
            }
        }, executor);
    }

    public <T> ListenableFuture<T> submitAsync(final AsyncCallable<T> asyncCallable, Executor executor) {
        Preconditions.checkNotNull(asyncCallable);
        Preconditions.checkNotNull(executor);
        final TaskNonReentrantExecutor taskNonReentrantExecutor = new TaskNonReentrantExecutor(executor, this);
        AsyncCallable<T> asyncCallable2 = new AsyncCallable<T>(this) { // from class: com.google.common.util.concurrent.ExecutionSequencer.2
            @Override // com.google.common.util.concurrent.AsyncCallable
            public ListenableFuture<T> call() throws Exception {
                if (!taskNonReentrantExecutor.trySetStarted()) {
                    return Futures.immediateCancelledFuture();
                }
                return asyncCallable.call();
            }

            public String toString() {
                return asyncCallable.toString();
            }
        };
        final SettableFuture create = SettableFuture.create();
        final ListenableFuture<Void> andSet = this.ref.getAndSet(create);
        final TrustedListenableFutureTask create2 = TrustedListenableFutureTask.create(asyncCallable2);
        andSet.addListener(create2, taskNonReentrantExecutor);
        final ListenableFuture<T> nonCancellationPropagating = Futures.nonCancellationPropagating(create2);
        Runnable runnable = new Runnable(this) { // from class: com.google.common.util.concurrent.ExecutionSequencer.3
            @Override // java.lang.Runnable
            public void run() {
                if (create2.isDone()) {
                    create.setFuture(andSet);
                } else if (nonCancellationPropagating.isCancelled() && taskNonReentrantExecutor.trySetCancelled()) {
                    create2.cancel(false);
                }
            }
        };
        nonCancellationPropagating.addListener(runnable, MoreExecutors.directExecutor());
        create2.addListener(runnable, MoreExecutors.directExecutor());
        return nonCancellationPropagating;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {
        @CheckForNull
        Executor delegate;
        @CheckForNull
        ExecutionSequencer sequencer;
        @CheckForNull
        Thread submitting;
        @CheckForNull
        Runnable task;

        private TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer) {
            super(RunningState.NOT_RUN);
            this.delegate = executor;
            this.sequencer = executionSequencer;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (get() == RunningState.CANCELLED) {
                this.delegate = null;
                this.sequencer = null;
                return;
            }
            this.submitting = Thread.currentThread();
            try {
                ThreadConfinedTaskQueue threadConfinedTaskQueue = ((ExecutionSequencer) Objects.requireNonNull(this.sequencer)).latestTaskQueue;
                if (threadConfinedTaskQueue.thread == this.submitting) {
                    this.sequencer = null;
                    Preconditions.checkState(threadConfinedTaskQueue.nextTask == null);
                    threadConfinedTaskQueue.nextTask = runnable;
                    threadConfinedTaskQueue.nextExecutor = (Executor) Objects.requireNonNull(this.delegate);
                    this.delegate = null;
                } else {
                    this.delegate = null;
                    this.task = runnable;
                    ((Executor) Objects.requireNonNull(this.delegate)).execute(this);
                }
            } finally {
                this.submitting = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread currentThread = Thread.currentThread();
            if (currentThread != this.submitting) {
                this.task = null;
                ((Runnable) Objects.requireNonNull(this.task)).run();
                return;
            }
            ThreadConfinedTaskQueue threadConfinedTaskQueue = new ThreadConfinedTaskQueue();
            threadConfinedTaskQueue.thread = currentThread;
            ((ExecutionSequencer) Objects.requireNonNull(this.sequencer)).latestTaskQueue = threadConfinedTaskQueue;
            this.sequencer = null;
            try {
                this.task = null;
                ((Runnable) Objects.requireNonNull(this.task)).run();
                while (true) {
                    Runnable runnable = threadConfinedTaskQueue.nextTask;
                    boolean z = true;
                    boolean z2 = runnable != null;
                    Executor executor = threadConfinedTaskQueue.nextExecutor;
                    if (executor == null) {
                        z = false;
                    }
                    if (!z || !z2) {
                        return;
                    }
                    threadConfinedTaskQueue.nextTask = null;
                    threadConfinedTaskQueue.nextExecutor = null;
                    executor.execute(runnable);
                }
            } finally {
                threadConfinedTaskQueue.thread = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean trySetStarted() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.STARTED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean trySetCancelled() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.CANCELLED);
        }
    }
}
