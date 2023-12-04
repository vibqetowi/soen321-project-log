package io.grpc.netty.shaded.io.netty.util.concurrent;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes4.dex */
public final class ThreadPerTaskExecutor implements Executor {
    private final ThreadFactory threadFactory;

    public ThreadPerTaskExecutor(ThreadFactory threadFactory) {
        this.threadFactory = (ThreadFactory) ObjectUtil.checkNotNull(threadFactory, "threadFactory");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.threadFactory.newThread(runnable).start();
    }
}
