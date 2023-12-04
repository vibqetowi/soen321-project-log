package io.grpc.netty.shaded.io.netty.util.concurrent;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import io.grpc.netty.shaded.io.netty.util.concurrent.AbstractEventExecutor;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import io.grpc.netty.shaded.io.netty.util.internal.SystemPropertyUtil;
import io.grpc.netty.shaded.io.netty.util.internal.ThreadExecutorMap;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes4.dex */
public abstract class SingleThreadEventExecutor extends AbstractScheduledEventExecutor implements OrderedEventExecutor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ST_NOT_STARTED = 1;
    private static final int ST_SHUTDOWN = 4;
    private static final int ST_SHUTTING_DOWN = 3;
    private static final int ST_STARTED = 2;
    private static final int ST_TERMINATED = 5;
    private final boolean addTaskWakesUp;
    private final Executor executor;
    private volatile long gracefulShutdownQuietPeriod;
    private long gracefulShutdownStartTime;
    private volatile long gracefulShutdownTimeout;
    private volatile boolean interrupted;
    private long lastExecutionTime;
    private final int maxPendingTasks;
    private final RejectedExecutionHandler rejectedExecutionHandler;
    private final Set<Runnable> shutdownHooks;
    private volatile int state;
    private final Queue<Runnable> taskQueue;
    private final Promise<?> terminationFuture;
    private volatile Thread thread;
    private final CountDownLatch threadLock;
    private volatile ThreadProperties threadProperties;
    static final int DEFAULT_MAX_PENDING_EXECUTOR_TASKS = Math.max(16, SystemPropertyUtil.getInt("io.grpc.netty.shaded.io.netty.eventexecutor.maxPendingTasks", Integer.MAX_VALUE));
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(SingleThreadEventExecutor.class);
    private static final Runnable NOOP_TASK = new Runnable() { // from class: io.grpc.netty.shaded.io.netty.util.concurrent.SingleThreadEventExecutor.1
        @Override // java.lang.Runnable
        public void run() {
        }
    };
    private static final AtomicIntegerFieldUpdater<SingleThreadEventExecutor> STATE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(SingleThreadEventExecutor.class, "state");
    private static final AtomicReferenceFieldUpdater<SingleThreadEventExecutor, ThreadProperties> PROPERTIES_UPDATER = AtomicReferenceFieldUpdater.newUpdater(SingleThreadEventExecutor.class, ThreadProperties.class, "threadProperties");
    private static final long SCHEDULE_PURGE_INTERVAL = TimeUnit.SECONDS.toNanos(1);

    @Deprecated
    /* loaded from: classes4.dex */
    protected interface NonWakeupRunnable extends AbstractEventExecutor.LazyRunnable {
    }

    protected void afterRunningAllTasks() {
    }

    protected void cleanup() {
    }

    protected abstract void run();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean wakesUpForTask(Runnable runnable) {
        return true;
    }

    static /* synthetic */ Thread access$100(SingleThreadEventExecutor singleThreadEventExecutor) {
        return singleThreadEventExecutor.thread;
    }

    static /* synthetic */ Thread access$102(SingleThreadEventExecutor singleThreadEventExecutor, Thread thread) {
        singleThreadEventExecutor.thread = thread;
        return thread;
    }

    static /* synthetic */ boolean access$200(SingleThreadEventExecutor singleThreadEventExecutor) {
        return singleThreadEventExecutor.interrupted;
    }

    static /* synthetic */ InternalLogger access$300() {
        return logger;
    }

    static /* synthetic */ int access$400(SingleThreadEventExecutor singleThreadEventExecutor) {
        return singleThreadEventExecutor.state;
    }

    static /* synthetic */ AtomicIntegerFieldUpdater access$500() {
        return STATE_UPDATER;
    }

    static /* synthetic */ long access$600(SingleThreadEventExecutor singleThreadEventExecutor) {
        return singleThreadEventExecutor.gracefulShutdownStartTime;
    }

    static /* synthetic */ CountDownLatch access$700(SingleThreadEventExecutor singleThreadEventExecutor) {
        return singleThreadEventExecutor.threadLock;
    }

    static /* synthetic */ Promise access$800(SingleThreadEventExecutor singleThreadEventExecutor) {
        return singleThreadEventExecutor.terminationFuture;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SingleThreadEventExecutor(EventExecutorGroup eventExecutorGroup, ThreadFactory threadFactory, boolean z) {
        this(eventExecutorGroup, new ThreadPerTaskExecutor(threadFactory), z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SingleThreadEventExecutor(EventExecutorGroup eventExecutorGroup, ThreadFactory threadFactory, boolean z, int i, RejectedExecutionHandler rejectedExecutionHandler) {
        this(eventExecutorGroup, new ThreadPerTaskExecutor(threadFactory), z, i, rejectedExecutionHandler);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SingleThreadEventExecutor(EventExecutorGroup eventExecutorGroup, Executor executor, boolean z) {
        this(eventExecutorGroup, executor, z, DEFAULT_MAX_PENDING_EXECUTOR_TASKS, RejectedExecutionHandlers.reject());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SingleThreadEventExecutor(EventExecutorGroup eventExecutorGroup, Executor executor, boolean z, int i, RejectedExecutionHandler rejectedExecutionHandler) {
        super(eventExecutorGroup);
        this.threadLock = new CountDownLatch(1);
        this.shutdownHooks = new LinkedHashSet();
        this.state = 1;
        this.terminationFuture = new DefaultPromise(GlobalEventExecutor.INSTANCE);
        this.addTaskWakesUp = z;
        int max = Math.max(16, i);
        this.maxPendingTasks = max;
        this.executor = ThreadExecutorMap.apply(executor, this);
        this.taskQueue = newTaskQueue(max);
        this.rejectedExecutionHandler = (RejectedExecutionHandler) ObjectUtil.checkNotNull(rejectedExecutionHandler, "rejectedHandler");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SingleThreadEventExecutor(EventExecutorGroup eventExecutorGroup, Executor executor, boolean z, Queue<Runnable> queue, RejectedExecutionHandler rejectedExecutionHandler) {
        super(eventExecutorGroup);
        this.threadLock = new CountDownLatch(1);
        this.shutdownHooks = new LinkedHashSet();
        this.state = 1;
        this.terminationFuture = new DefaultPromise(GlobalEventExecutor.INSTANCE);
        this.addTaskWakesUp = z;
        this.maxPendingTasks = DEFAULT_MAX_PENDING_EXECUTOR_TASKS;
        this.executor = ThreadExecutorMap.apply(executor, this);
        this.taskQueue = (Queue) ObjectUtil.checkNotNull(queue, "taskQueue");
        this.rejectedExecutionHandler = (RejectedExecutionHandler) ObjectUtil.checkNotNull(rejectedExecutionHandler, "rejectedHandler");
    }

    @Deprecated
    protected Queue<Runnable> newTaskQueue() {
        return newTaskQueue(this.maxPendingTasks);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Queue<Runnable> newTaskQueue(int i) {
        return new LinkedBlockingQueue(i);
    }

    protected void interruptThread() {
        Thread thread = this.thread;
        if (thread == null) {
            this.interrupted = true;
        } else {
            thread.interrupt();
        }
    }

    protected Runnable pollTask() {
        return pollTaskFrom(this.taskQueue);
    }

    protected static Runnable pollTaskFrom(Queue<Runnable> queue) {
        Runnable poll;
        do {
            poll = queue.poll();
        } while (poll == WAKEUP_TASK);
        return poll;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Runnable takeTask() {
        Runnable runnable;
        Queue<Runnable> queue = this.taskQueue;
        if (!(queue instanceof BlockingQueue)) {
            throw new UnsupportedOperationException();
        }
        BlockingQueue blockingQueue = (BlockingQueue) queue;
        do {
            ScheduledFutureTask<?> peekScheduledTask = peekScheduledTask();
            runnable = null;
            if (peekScheduledTask == null) {
                try {
                    Runnable runnable2 = (Runnable) blockingQueue.take();
                    try {
                        if (runnable2 == WAKEUP_TASK) {
                            return null;
                        }
                    } catch (InterruptedException unused) {
                    }
                    return runnable2;
                } catch (InterruptedException unused2) {
                    return null;
                }
            }
            long delayNanos = peekScheduledTask.delayNanos();
            if (delayNanos > 0) {
                try {
                    runnable = (Runnable) blockingQueue.poll(delayNanos, TimeUnit.NANOSECONDS);
                } catch (InterruptedException unused3) {
                    return null;
                }
            }
            if (runnable == null) {
                fetchFromScheduledTaskQueue();
                runnable = (Runnable) blockingQueue.poll();
                continue;
            }
        } while (runnable == null);
        return runnable;
    }

    private boolean fetchFromScheduledTaskQueue() {
        Runnable pollScheduledTask;
        if (this.scheduledTaskQueue == null || this.scheduledTaskQueue.isEmpty()) {
            return true;
        }
        long nanoTime = AbstractScheduledEventExecutor.nanoTime();
        do {
            pollScheduledTask = pollScheduledTask(nanoTime);
            if (pollScheduledTask == null) {
                return true;
            }
        } while (this.taskQueue.offer(pollScheduledTask));
        this.scheduledTaskQueue.add((ScheduledFutureTask) pollScheduledTask);
        return false;
    }

    private boolean executeExpiredScheduledTasks() {
        long nanoTime;
        Runnable pollScheduledTask;
        if (this.scheduledTaskQueue == null || this.scheduledTaskQueue.isEmpty() || (pollScheduledTask = pollScheduledTask((nanoTime = AbstractScheduledEventExecutor.nanoTime()))) == null) {
            return false;
        }
        do {
            safeExecute(pollScheduledTask);
            pollScheduledTask = pollScheduledTask(nanoTime);
        } while (pollScheduledTask != null);
        return true;
    }

    protected Runnable peekTask() {
        return this.taskQueue.peek();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean hasTasks() {
        return !this.taskQueue.isEmpty();
    }

    public int pendingTasks() {
        return this.taskQueue.size();
    }

    protected void addTask(Runnable runnable) {
        ObjectUtil.checkNotNull(runnable, "task");
        if (offerTask(runnable)) {
            return;
        }
        reject(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean offerTask(Runnable runnable) {
        if (isShutdown()) {
            reject();
        }
        return this.taskQueue.offer(runnable);
    }

    protected boolean removeTask(Runnable runnable) {
        return this.taskQueue.remove(ObjectUtil.checkNotNull(runnable, "task"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean runAllTasks() {
        boolean fetchFromScheduledTaskQueue;
        boolean z = false;
        do {
            fetchFromScheduledTaskQueue = fetchFromScheduledTaskQueue();
            if (runAllTasksFrom(this.taskQueue)) {
                z = true;
                continue;
            }
        } while (!fetchFromScheduledTaskQueue);
        if (z) {
            this.lastExecutionTime = ScheduledFutureTask.nanoTime();
        }
        afterRunningAllTasks();
        return z;
    }

    protected final boolean runScheduledAndExecutorTasks(int i) {
        int i2 = 0;
        while ((runExistingTasksFrom(this.taskQueue) | executeExpiredScheduledTasks()) && (i2 = i2 + 1) < i) {
        }
        if (i2 > 0) {
            this.lastExecutionTime = ScheduledFutureTask.nanoTime();
        }
        afterRunningAllTasks();
        return i2 > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean runAllTasksFrom(Queue<Runnable> queue) {
        Runnable pollTaskFrom = pollTaskFrom(queue);
        if (pollTaskFrom == null) {
            return false;
        }
        do {
            safeExecute(pollTaskFrom);
            pollTaskFrom = pollTaskFrom(queue);
        } while (pollTaskFrom != null);
        return true;
    }

    private boolean runExistingTasksFrom(Queue<Runnable> queue) {
        Runnable poll;
        Runnable pollTaskFrom = pollTaskFrom(queue);
        if (pollTaskFrom == null) {
            return false;
        }
        int min = Math.min(this.maxPendingTasks, queue.size());
        safeExecute(pollTaskFrom);
        while (true) {
            int i = min - 1;
            if (min <= 0 || (poll = queue.poll()) == null) {
                return true;
            }
            safeExecute(poll);
            min = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean runAllTasks(long j) {
        long nanoTime;
        fetchFromScheduledTaskQueue();
        Runnable pollTask = pollTask();
        if (pollTask == null) {
            afterRunningAllTasks();
            return false;
        }
        long nanoTime2 = j > 0 ? ScheduledFutureTask.nanoTime() + j : 0L;
        long j2 = 0;
        while (true) {
            safeExecute(pollTask);
            j2++;
            if ((63 & j2) == 0) {
                nanoTime = ScheduledFutureTask.nanoTime();
                if (nanoTime >= nanoTime2) {
                    break;
                }
            }
            pollTask = pollTask();
            if (pollTask == null) {
                nanoTime = ScheduledFutureTask.nanoTime();
                break;
            }
        }
        afterRunningAllTasks();
        this.lastExecutionTime = nanoTime;
        return true;
    }

    protected long delayNanos(long j) {
        ScheduledFutureTask<?> peekScheduledTask = peekScheduledTask();
        if (peekScheduledTask == null) {
            return SCHEDULE_PURGE_INTERVAL;
        }
        return peekScheduledTask.delayNanos(j);
    }

    protected long deadlineNanos() {
        ScheduledFutureTask<?> peekScheduledTask = peekScheduledTask();
        if (peekScheduledTask == null) {
            return nanoTime() + SCHEDULE_PURGE_INTERVAL;
        }
        return peekScheduledTask.deadlineNanos();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateLastExecutionTime() {
        this.lastExecutionTime = ScheduledFutureTask.nanoTime();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void wakeup(boolean z) {
        if (z) {
            return;
        }
        this.taskQueue.offer(WAKEUP_TASK);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor
    public boolean inEventLoop(Thread thread) {
        return thread == this.thread;
    }

    public void addShutdownHook(final Runnable runnable) {
        if (inEventLoop()) {
            this.shutdownHooks.add(runnable);
        } else {
            execute(new Runnable() { // from class: io.grpc.netty.shaded.io.netty.util.concurrent.SingleThreadEventExecutor.2
                @Override // java.lang.Runnable
                public void run() {
                    SingleThreadEventExecutor.this.shutdownHooks.add(runnable);
                }
            });
        }
    }

    public void removeShutdownHook(final Runnable runnable) {
        if (inEventLoop()) {
            this.shutdownHooks.remove(runnable);
        } else {
            execute(new Runnable() { // from class: io.grpc.netty.shaded.io.netty.util.concurrent.SingleThreadEventExecutor.3
                @Override // java.lang.Runnable
                public void run() {
                    SingleThreadEventExecutor.this.shutdownHooks.remove(runnable);
                }
            });
        }
    }

    private boolean runShutdownHooks() {
        boolean z = false;
        while (!this.shutdownHooks.isEmpty()) {
            ArrayList<Runnable> arrayList = new ArrayList(this.shutdownHooks);
            this.shutdownHooks.clear();
            for (Runnable runnable : arrayList) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    logger.warn("Shutdown hook raised an exception.", th);
                }
                z = true;
            }
        }
        if (z) {
            this.lastExecutionTime = ScheduledFutureTask.nanoTime();
        }
        return z;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorGroup
    public Future<?> shutdownGracefully(long j, long j2, TimeUnit timeUnit) {
        ObjectUtil.checkPositiveOrZero(j, "quietPeriod");
        if (j2 < j) {
            throw new IllegalArgumentException("timeout: " + j2 + " (expected >= quietPeriod (" + j + "))");
        }
        ObjectUtil.checkNotNull(timeUnit, "unit");
        if (isShuttingDown()) {
            return terminationFuture();
        }
        boolean inEventLoop = inEventLoop();
        while (!isShuttingDown()) {
            int i = this.state;
            int i2 = 3;
            boolean z = true;
            if (!inEventLoop && i != 1 && i != 2) {
                z = false;
                i2 = i;
            }
            if (STATE_UPDATER.compareAndSet(this, i, i2)) {
                this.gracefulShutdownQuietPeriod = timeUnit.toNanos(j);
                this.gracefulShutdownTimeout = timeUnit.toNanos(j2);
                if (ensureThreadStarted(i)) {
                    return this.terminationFuture;
                }
                if (z) {
                    this.taskQueue.offer(WAKEUP_TASK);
                    if (!this.addTaskWakesUp) {
                        wakeup(inEventLoop);
                    }
                }
                return terminationFuture();
            }
        }
        return terminationFuture();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorGroup
    public Future<?> terminationFuture() {
        return this.terminationFuture;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ExecutorService, io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorGroup
    @Deprecated
    public void shutdown() {
        if (isShutdown()) {
            return;
        }
        boolean inEventLoop = inEventLoop();
        while (!isShuttingDown()) {
            int i = this.state;
            int i2 = 4;
            boolean z = true;
            if (!inEventLoop && i != 1 && i != 2 && i != 3) {
                z = false;
                i2 = i;
            }
            if (STATE_UPDATER.compareAndSet(this, i, i2)) {
                if (!ensureThreadStarted(i) && z) {
                    this.taskQueue.offer(WAKEUP_TASK);
                    if (this.addTaskWakesUp) {
                        return;
                    }
                    wakeup(inEventLoop);
                    return;
                }
                return;
            }
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutorGroup
    public boolean isShuttingDown() {
        return this.state >= 3;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.state >= 4;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.state == 5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean confirmShutdown() {
        if (isShuttingDown()) {
            if (!inEventLoop()) {
                throw new IllegalStateException("must be invoked from an event loop");
            }
            cancelScheduledTasks();
            if (this.gracefulShutdownStartTime == 0) {
                this.gracefulShutdownStartTime = ScheduledFutureTask.nanoTime();
            }
            if (runAllTasks() || runShutdownHooks()) {
                if (isShutdown() || this.gracefulShutdownQuietPeriod == 0) {
                    return true;
                }
                this.taskQueue.offer(WAKEUP_TASK);
                return false;
            }
            long nanoTime = ScheduledFutureTask.nanoTime();
            if (isShutdown() || nanoTime - this.gracefulShutdownStartTime > this.gracefulShutdownTimeout || nanoTime - this.lastExecutionTime > this.gracefulShutdownQuietPeriod) {
                return true;
            }
            this.taskQueue.offer(WAKEUP_TASK);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            return false;
        }
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        ObjectUtil.checkNotNull(timeUnit, "unit");
        if (inEventLoop()) {
            throw new IllegalStateException("cannot await termination of the current thread");
        }
        this.threadLock.await(j, timeUnit);
        return isTerminated();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        ObjectUtil.checkNotNull(runnable, "task");
        execute(runnable, !(runnable instanceof AbstractEventExecutor.LazyRunnable) && wakesUpForTask(runnable));
    }

    @Override // io.grpc.netty.shaded.io.netty.util.concurrent.AbstractEventExecutor
    public void lazyExecute(Runnable runnable) {
        execute((Runnable) ObjectUtil.checkNotNull(runnable, "task"), false);
    }

    private void execute(Runnable runnable, boolean z) {
        boolean z2;
        boolean inEventLoop = inEventLoop();
        addTask(runnable);
        if (!inEventLoop) {
            startThread();
            if (isShutdown()) {
                try {
                    z2 = removeTask(runnable);
                } catch (UnsupportedOperationException unused) {
                    z2 = false;
                }
                if (z2) {
                    reject();
                }
            }
        }
        if (this.addTaskWakesUp || !z) {
            return;
        }
        wakeup(inEventLoop);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        throwIfInEventLoop("invokeAny");
        return (T) super.invokeAny(collection);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        throwIfInEventLoop("invokeAny");
        return (T) super.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> List<java.util.concurrent.Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        throwIfInEventLoop("invokeAll");
        return super.invokeAll(collection);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> List<java.util.concurrent.Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        throwIfInEventLoop("invokeAll");
        return super.invokeAll(collection, j, timeUnit);
    }

    private void throwIfInEventLoop(String str) {
        if (inEventLoop()) {
            throw new RejectedExecutionException("Calling " + str + " from within the EventLoop is not allowed");
        }
    }

    public final ThreadProperties threadProperties() {
        ThreadProperties threadProperties = this.threadProperties;
        if (threadProperties == null) {
            Thread thread = this.thread;
            if (thread == null) {
                submit(NOOP_TASK).syncUninterruptibly();
                thread = this.thread;
            }
            DefaultThreadProperties defaultThreadProperties = new DefaultThreadProperties(thread);
            return !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(PROPERTIES_UPDATER, this, null, defaultThreadProperties) ? this.threadProperties : defaultThreadProperties;
        }
        return threadProperties;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void reject() {
        throw new RejectedExecutionException("event executor terminated");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void reject(Runnable runnable) {
        this.rejectedExecutionHandler.rejected(runnable, this);
    }

    private void startThread() {
        if (this.state == 1 && STATE_UPDATER.compareAndSet(this, 1, 2)) {
            try {
                doStartThread();
            } catch (Throwable th) {
                STATE_UPDATER.compareAndSet(this, 2, 1);
                throw th;
            }
        }
    }

    private boolean ensureThreadStarted(int i) {
        if (i == 1) {
            try {
                doStartThread();
                return false;
            } catch (Throwable th) {
                STATE_UPDATER.set(this, 5);
                this.terminationFuture.tryFailure(th);
                if (!(th instanceof Exception)) {
                    PlatformDependent.throwException(th);
                }
                return true;
            }
        }
        return false;
    }

    private void doStartThread() {
        this.executor.execute(new Runnable() { // from class: io.grpc.netty.shaded.io.netty.util.concurrent.SingleThreadEventExecutor.4
            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 272
                	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    Method dump skipped, instructions count: 1121
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.grpc.netty.shaded.io.netty.util.concurrent.SingleThreadEventExecutor.AnonymousClass4.run():void");
            }
        });
    }

    final int drainTasks() {
        int i = 0;
        while (true) {
            Runnable poll = this.taskQueue.poll();
            if (poll == null) {
                return i;
            }
            if (WAKEUP_TASK != poll) {
                i++;
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class DefaultThreadProperties implements ThreadProperties {
        private final Thread t;

        DefaultThreadProperties(Thread thread) {
            this.t = thread;
        }

        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.ThreadProperties
        public Thread.State state() {
            return this.t.getState();
        }

        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.ThreadProperties
        public int priority() {
            return this.t.getPriority();
        }

        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.ThreadProperties
        public boolean isInterrupted() {
            return this.t.isInterrupted();
        }

        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.ThreadProperties
        public boolean isDaemon() {
            return this.t.isDaemon();
        }

        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.ThreadProperties
        public String name() {
            return this.t.getName();
        }

        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.ThreadProperties
        public long id() {
            return this.t.getId();
        }

        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.ThreadProperties
        public StackTraceElement[] stackTrace() {
            return this.t.getStackTrace();
        }

        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.ThreadProperties
        public boolean isAlive() {
            return this.t.isAlive();
        }
    }
}
