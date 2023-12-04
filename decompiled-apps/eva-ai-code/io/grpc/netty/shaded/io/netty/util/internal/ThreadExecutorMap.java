package io.grpc.netty.shaded.io.netty.util.internal;

import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor;
import io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocal;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes4.dex */
public final class ThreadExecutorMap {
    private static final FastThreadLocal<EventExecutor> mappings = new FastThreadLocal<>();

    private ThreadExecutorMap() {
    }

    public static EventExecutor currentExecutor() {
        return mappings.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setCurrentEventExecutor(EventExecutor eventExecutor) {
        mappings.set(eventExecutor);
    }

    public static Executor apply(final Executor executor, final EventExecutor eventExecutor) {
        ObjectUtil.checkNotNull(executor, "executor");
        ObjectUtil.checkNotNull(eventExecutor, "eventExecutor");
        return new Executor() { // from class: io.grpc.netty.shaded.io.netty.util.internal.ThreadExecutorMap.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                executor.execute(ThreadExecutorMap.apply(runnable, eventExecutor));
            }
        };
    }

    public static Runnable apply(final Runnable runnable, final EventExecutor eventExecutor) {
        ObjectUtil.checkNotNull(runnable, "command");
        ObjectUtil.checkNotNull(eventExecutor, "eventExecutor");
        return new Runnable() { // from class: io.grpc.netty.shaded.io.netty.util.internal.ThreadExecutorMap.2
            @Override // java.lang.Runnable
            public void run() {
                ThreadExecutorMap.setCurrentEventExecutor(EventExecutor.this);
                try {
                    runnable.run();
                } finally {
                    ThreadExecutorMap.setCurrentEventExecutor(null);
                }
            }
        };
    }

    public static ThreadFactory apply(final ThreadFactory threadFactory, final EventExecutor eventExecutor) {
        ObjectUtil.checkNotNull(threadFactory, "command");
        ObjectUtil.checkNotNull(eventExecutor, "eventExecutor");
        return new ThreadFactory() { // from class: io.grpc.netty.shaded.io.netty.util.internal.ThreadExecutorMap.3
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return threadFactory.newThread(ThreadExecutorMap.apply(runnable, eventExecutor));
            }
        };
    }
}
