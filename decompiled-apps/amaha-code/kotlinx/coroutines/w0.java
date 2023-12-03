package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: Executors.kt */
/* loaded from: classes2.dex */
public final class w0 extends v0 implements j0 {

    /* renamed from: w  reason: collision with root package name */
    public final Executor f23711w;

    public w0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f23711w = executor;
        Method method2 = kotlinx.coroutines.internal.b.f23586a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = kotlinx.coroutines.internal.b.f23586a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // kotlinx.coroutines.j0
    public final void J(long j10, k kVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f23711w;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new gd.k(this, kVar), j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                sp.b.d(kVar.f23631y, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            kVar.p(new g(0, scheduledFuture));
        } else {
            f0.C.J(j10, kVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f23711w;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof w0) && ((w0) obj).f23711w == this.f23711w) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.a0
    public final void f0(ls.f fVar, Runnable runnable) {
        try {
            this.f23711w.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            sp.b.d(fVar, cancellationException);
            o0.f23642c.f0(fVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f23711w);
    }

    @Override // kotlinx.coroutines.a0
    public final String toString() {
        return this.f23711w.toString();
    }
}
