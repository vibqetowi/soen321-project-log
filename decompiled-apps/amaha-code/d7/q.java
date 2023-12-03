package d7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public final Executor f12257u;

    /* compiled from: SafeLoggingExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final Runnable f12258u;

        public a(Runnable runnable) {
            this.f12258u = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f12258u.run();
            } catch (Exception e10) {
                h7.a.b("Executor", "Background execution failure.", e10);
            }
        }
    }

    public q(ExecutorService executorService) {
        this.f12257u = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12257u.execute(new a(runnable));
    }
}
