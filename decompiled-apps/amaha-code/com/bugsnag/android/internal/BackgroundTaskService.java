package com.bugsnag.android.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: BackgroundTaskService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u001dB9\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J(\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0006\u0010\u000e\u001a\u00020\u0003R\u001a\u0010\u000f\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/internal/BackgroundTaskService;", "", "Ljava/util/concurrent/ExecutorService;", "Lhs/k;", "awaitTerminationSafe", "Lcom/bugsnag/android/internal/TaskType;", "taskType", "Ljava/lang/Runnable;", "runnable", "Ljava/util/concurrent/Future;", "submitTask", "T", "Ljava/util/concurrent/Callable;", "callable", "shutdown", "errorExecutor", "Ljava/util/concurrent/ExecutorService;", "getErrorExecutor$bugsnag_android_core_release", "()Ljava/util/concurrent/ExecutorService;", "sessionExecutor", "getSessionExecutor$bugsnag_android_core_release", "ioExecutor", "getIoExecutor$bugsnag_android_core_release", "internalReportExecutor", "getInternalReportExecutor$bugsnag_android_core_release", "defaultExecutor", "getDefaultExecutor$bugsnag_android_core_release", "<init>", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "SafeFuture", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class BackgroundTaskService {
    private final ExecutorService defaultExecutor;
    private final ExecutorService errorExecutor;
    private final ExecutorService internalReportExecutor;
    private final ExecutorService ioExecutor;
    private final ExecutorService sessionExecutor;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TaskType.ERROR_REQUEST.ordinal()] = 1;
            iArr[TaskType.SESSION_REQUEST.ordinal()] = 2;
            iArr[TaskType.IO.ordinal()] = 3;
            iArr[TaskType.INTERNAL_REPORT.ordinal()] = 4;
            iArr[TaskType.DEFAULT.ordinal()] = 5;
        }
    }

    public BackgroundTaskService() {
        this(null, null, null, null, null, 31, null);
    }

    private final void awaitTerminationSafe(ExecutorService executorService) {
        try {
            executorService.awaitTermination(1500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
    }

    public final ExecutorService getDefaultExecutor$bugsnag_android_core_release() {
        return this.defaultExecutor;
    }

    public final ExecutorService getErrorExecutor$bugsnag_android_core_release() {
        return this.errorExecutor;
    }

    public final ExecutorService getInternalReportExecutor$bugsnag_android_core_release() {
        return this.internalReportExecutor;
    }

    public final ExecutorService getIoExecutor$bugsnag_android_core_release() {
        return this.ioExecutor;
    }

    public final ExecutorService getSessionExecutor$bugsnag_android_core_release() {
        return this.sessionExecutor;
    }

    public final void shutdown() {
        this.internalReportExecutor.shutdownNow();
        this.defaultExecutor.shutdownNow();
        this.errorExecutor.shutdown();
        this.sessionExecutor.shutdown();
        this.ioExecutor.shutdown();
        awaitTerminationSafe(this.errorExecutor);
        awaitTerminationSafe(this.sessionExecutor);
        awaitTerminationSafe(this.ioExecutor);
    }

    public final Future<?> submitTask(TaskType taskType, Runnable runnable) {
        i.h(taskType, "taskType");
        i.h(runnable, "runnable");
        Callable<Object> callable = Executors.callable(runnable);
        i.c(callable, "Executors.callable(runnable)");
        return submitTask(taskType, callable);
    }

    /* compiled from: BackgroundTaskService.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001J\t\u0010\u000f\u001a\u00020\fH\u0096\u0001J\t\u0010\u0010\u001a\u00020\fH\u0096\u0001R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bugsnag/android/internal/BackgroundTaskService$SafeFuture;", "V", "Ljava/util/concurrent/Future;", "Lhs/k;", "ensureTaskGetSafe", "get", "()Ljava/lang/Object;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "", "p0", "cancel", "isCancelled", "isDone", "Ljava/util/concurrent/FutureTask;", "delegate", "Ljava/util/concurrent/FutureTask;", "Lcom/bugsnag/android/internal/TaskType;", "taskType", "Lcom/bugsnag/android/internal/TaskType;", "<init>", "(Ljava/util/concurrent/FutureTask;Lcom/bugsnag/android/internal/TaskType;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class SafeFuture<V> implements Future<V> {
        private final FutureTask<V> delegate;
        private final TaskType taskType;

        public SafeFuture(FutureTask<V> delegate, TaskType taskType) {
            i.h(delegate, "delegate");
            i.h(taskType, "taskType");
            this.delegate = delegate;
            this.taskType = taskType;
        }

        private final void ensureTaskGetSafe() {
            if (!this.delegate.isDone()) {
                Thread currentThread = Thread.currentThread();
                i.c(currentThread, "JThread.currentThread()");
                if (BackgroundTaskServiceKt.getTaskType(currentThread) == this.taskType) {
                    this.delegate.run();
                }
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.delegate.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            ensureTaskGetSafe();
            return this.delegate.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegate.isDone();
        }

        @Override // java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) {
            ensureTaskGetSafe();
            return this.delegate.get(j10, timeUnit);
        }
    }

    public BackgroundTaskService(ExecutorService errorExecutor, ExecutorService sessionExecutor, ExecutorService ioExecutor, ExecutorService internalReportExecutor, ExecutorService defaultExecutor) {
        i.h(errorExecutor, "errorExecutor");
        i.h(sessionExecutor, "sessionExecutor");
        i.h(ioExecutor, "ioExecutor");
        i.h(internalReportExecutor, "internalReportExecutor");
        i.h(defaultExecutor, "defaultExecutor");
        this.errorExecutor = errorExecutor;
        this.sessionExecutor = sessionExecutor;
        this.ioExecutor = ioExecutor;
        this.internalReportExecutor = internalReportExecutor;
        this.defaultExecutor = defaultExecutor;
    }

    public final <T> Future<T> submitTask(TaskType taskType, Callable<T> callable) {
        i.h(taskType, "taskType");
        i.h(callable, "callable");
        FutureTask futureTask = new FutureTask(callable);
        int i6 = WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()];
        if (i6 == 1) {
            this.errorExecutor.execute(futureTask);
        } else if (i6 == 2) {
            this.sessionExecutor.execute(futureTask);
        } else if (i6 == 3) {
            this.ioExecutor.execute(futureTask);
        } else if (i6 == 4) {
            this.internalReportExecutor.execute(futureTask);
        } else if (i6 == 5) {
            this.defaultExecutor.execute(futureTask);
        }
        return new SafeFuture(futureTask, taskType);
    }

    public /* synthetic */ BackgroundTaskService(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, ExecutorService executorService5, int i6, d dVar) {
        this((i6 & 1) != 0 ? BackgroundTaskServiceKt.createExecutor("Bugsnag Error thread", TaskType.ERROR_REQUEST, true) : executorService, (i6 & 2) != 0 ? BackgroundTaskServiceKt.createExecutor("Bugsnag Session thread", TaskType.SESSION_REQUEST, true) : executorService2, (i6 & 4) != 0 ? BackgroundTaskServiceKt.createExecutor("Bugsnag IO thread", TaskType.IO, true) : executorService3, (i6 & 8) != 0 ? BackgroundTaskServiceKt.createExecutor("Bugsnag Internal Report thread", TaskType.INTERNAL_REPORT, false) : executorService4, (i6 & 16) != 0 ? BackgroundTaskServiceKt.createExecutor("Bugsnag Default thread", TaskType.DEFAULT, false) : executorService5);
    }
}
