package oe;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import ne.u;
/* compiled from: ThrottledForwardingExecutor.java */
/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public final Executor f27430u;

    /* renamed from: v  reason: collision with root package name */
    public final Semaphore f27431v = new Semaphore(4);

    public m(Executor executor) {
        this.f27430u = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.f27431v.tryAcquire()) {
            try {
                this.f27430u.execute(new u(this, 4, runnable));
                return;
            } catch (RejectedExecutionException unused) {
                runnable.run();
                return;
            }
        }
        runnable.run();
    }
}
