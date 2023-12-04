package io.grpc.netty.shaded.io.netty.util.concurrent;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PriorityQueue;
import io.grpc.netty.shaded.io.netty.util.internal.ThreadExecutorMap;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
public final class GlobalEventExecutor extends AbstractScheduledEventExecutor implements OrderedEventExecutor {
    final ScheduledFutureTask<Void> quietPeriodTask;
    private final AtomicBoolean started;
    final BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue();
    private final TaskRunner taskRunner;
    private final Future<?> terminationFuture;
    volatile Thread thread;
    final ThreadFactory threadFactory;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(GlobalEventExecutor.class);
    private static final long SCHEDULE_QUIET_PERIOD_INTERVAL = TimeUnit.SECONDS.toNanos(1);
    public static final GlobalEventExecutor INSTANCE = new GlobalEventExecutor();

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorGroup
    public boolean isShuttingDown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    private GlobalEventExecutor() {
        Callable callable = Executors.callable(new Runnable() { // from class: io.grpc.netty.shaded.io.netty.util.concurrent.GlobalEventExecutor.1
            @Override // java.lang.Runnable
            public void run() {
            }
        }, null);
        long j = SCHEDULE_QUIET_PERIOD_INTERVAL;
        ScheduledFutureTask<Void> scheduledFutureTask = new ScheduledFutureTask<>(this, callable, ScheduledFutureTask.deadlineNanos(j), -j);
        this.quietPeriodTask = scheduledFutureTask;
        this.taskRunner = new TaskRunner();
        this.started = new AtomicBoolean();
        this.terminationFuture = new FailedFuture(this, new UnsupportedOperationException());
        scheduledTaskQueue().add(scheduledFutureTask);
        this.threadFactory = ThreadExecutorMap.apply(new DefaultThreadFactory(DefaultThreadFactory.toPoolName(getClass()), false, 5, null), this);
    }

    Runnable takeTask() {
        Runnable runnable;
        BlockingQueue<Runnable> blockingQueue = this.taskQueue;
        do {
            ScheduledFutureTask<?> peekScheduledTask = peekScheduledTask();
            runnable = null;
            if (peekScheduledTask == null) {
                try {
                    return blockingQueue.take();
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            long delayNanos = peekScheduledTask.delayNanos();
            if (delayNanos > 0) {
                try {
                    runnable = blockingQueue.poll(delayNanos, TimeUnit.NANOSECONDS);
                } catch (InterruptedException unused2) {
                    return null;
                }
            }
            if (runnable == null) {
                fetchFromScheduledTaskQueue();
                runnable = blockingQueue.poll();
                continue;
            }
        } while (runnable == null);
        return runnable;
    }

    private void fetchFromScheduledTaskQueue() {
        long nanoTime = AbstractScheduledEventExecutor.nanoTime();
        Runnable pollScheduledTask = pollScheduledTask(nanoTime);
        while (pollScheduledTask != null) {
            this.taskQueue.add(pollScheduledTask);
            pollScheduledTask = pollScheduledTask(nanoTime);
        }
    }

    public int pendingTasks() {
        return this.taskQueue.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void addTask(Runnable runnable) {
        this.taskQueue.add(ObjectUtil.checkNotNull(runnable, "task"));
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor
    public boolean inEventLoop(Thread thread) {
        return thread == this.thread;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorGroup
    public Future<?> shutdownGracefully(long j, long j2, TimeUnit timeUnit) {
        return terminationFuture();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorGroup
    public Future<?> terminationFuture() {
        return this.terminationFuture;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ExecutorService, io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorGroup
    @Deprecated
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public boolean awaitInactivity(long j, TimeUnit timeUnit) throws InterruptedException {
        ObjectUtil.checkNotNull(timeUnit, "unit");
        Thread thread = this.thread;
        if (thread == null) {
            throw new IllegalStateException("thread was not started");
        }
        thread.join(timeUnit.toMillis(j));
        return !thread.isAlive();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        addTask((Runnable) ObjectUtil.checkNotNull(runnable, "task"));
        if (inEventLoop()) {
            return;
        }
        startThread();
    }

    private void startThread() {
        if (this.started.compareAndSet(false, true)) {
            final Thread newThread = this.threadFactory.newThread(this.taskRunner);
            AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: io.grpc.netty.shaded.io.netty.util.concurrent.GlobalEventExecutor.2
                @Override // java.security.PrivilegedAction
                public Void run() {
                    newThread.setContextClassLoader(null);
                    return null;
                }
            });
            this.thread = newThread;
            newThread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class TaskRunner implements Runnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        TaskRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                Runnable takeTask = GlobalEventExecutor.this.takeTask();
                if (takeTask != null) {
                    try {
                        takeTask.run();
                    } catch (Throwable th) {
                        GlobalEventExecutor.logger.warn("Unexpected exception from the global event executor: ", th);
                    }
                    if (takeTask != GlobalEventExecutor.this.quietPeriodTask) {
                        continue;
                    }
                }
                PriorityQueue<ScheduledFutureTask<?>> priorityQueue = GlobalEventExecutor.this.scheduledTaskQueue;
                if (GlobalEventExecutor.this.taskQueue.isEmpty() && (priorityQueue == null || priorityQueue.size() == 1)) {
                    GlobalEventExecutor.this.started.compareAndSet(true, false);
                    if ((GlobalEventExecutor.this.taskQueue.isEmpty() && (priorityQueue == null || priorityQueue.size() == 1)) || !GlobalEventExecutor.this.started.compareAndSet(false, true)) {
                        return;
                    }
                }
            }
        }
    }
}
