package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
/* loaded from: classes4.dex */
final class NoOpSentryExecutorService implements ISentryExecutorService {
    private static final NoOpSentryExecutorService instance = new NoOpSentryExecutorService();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object lambda$submit$0() throws Exception {
        return null;
    }

    @Override // io.sentry.ISentryExecutorService
    public void close(long j) {
    }

    private NoOpSentryExecutorService() {
    }

    public static ISentryExecutorService getInstance() {
        return instance;
    }

    @Override // io.sentry.ISentryExecutorService
    public Future<?> submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.NoOpSentryExecutorService$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NoOpSentryExecutorService.lambda$submit$0();
            }
        });
    }
}
