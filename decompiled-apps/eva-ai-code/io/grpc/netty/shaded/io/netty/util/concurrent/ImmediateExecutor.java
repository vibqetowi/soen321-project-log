package io.grpc.netty.shaded.io.netty.util.concurrent;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public final class ImmediateExecutor implements Executor {
    public static final ImmediateExecutor INSTANCE = new ImmediateExecutor();

    private ImmediateExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        ((Runnable) ObjectUtil.checkNotNull(runnable, "command")).run();
    }
}
