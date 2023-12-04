package io.grpc.internal;

import com.google.common.base.Stopwatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Rescheduler {
    private boolean enabled;
    private long runAtNanos;
    private final Runnable runnable;
    private final ScheduledExecutorService scheduler;
    private final Executor serializingExecutor;
    private final Stopwatch stopwatch;
    private ScheduledFuture<?> wakeUp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rescheduler(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, Stopwatch stopwatch) {
        this.runnable = runnable;
        this.serializingExecutor = executor;
        this.scheduler = scheduledExecutorService;
        this.stopwatch = stopwatch;
        stopwatch.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reschedule(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long nanoTime = nanoTime() + nanos;
        this.enabled = true;
        if (nanoTime - this.runAtNanos < 0 || this.wakeUp == null) {
            ScheduledFuture<?> scheduledFuture = this.wakeUp;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.wakeUp = this.scheduler.schedule(new FutureRunnable(), nanos, TimeUnit.NANOSECONDS);
        }
        this.runAtNanos = nanoTime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cancel(boolean z) {
        ScheduledFuture<?> scheduledFuture;
        this.enabled = false;
        if (!z || (scheduledFuture = this.wakeUp) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.wakeUp = null;
    }

    /* loaded from: classes4.dex */
    private final class FutureRunnable implements Runnable {
        private FutureRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Rescheduler.this.serializingExecutor.execute(new ChannelFutureRunnable());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isEnabled() {
            return Rescheduler.this.enabled;
        }
    }

    /* loaded from: classes4.dex */
    private final class ChannelFutureRunnable implements Runnable {
        private ChannelFutureRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!Rescheduler.this.enabled) {
                Rescheduler.this.wakeUp = null;
                return;
            }
            long nanoTime = Rescheduler.this.nanoTime();
            if (Rescheduler.this.runAtNanos - nanoTime <= 0) {
                Rescheduler.this.enabled = false;
                Rescheduler.this.wakeUp = null;
                Rescheduler.this.runnable.run();
                return;
            }
            Rescheduler rescheduler = Rescheduler.this;
            rescheduler.wakeUp = rescheduler.scheduler.schedule(new FutureRunnable(), Rescheduler.this.runAtNanos - nanoTime, TimeUnit.NANOSECONDS);
        }
    }

    static boolean isEnabled(Runnable runnable) {
        return ((FutureRunnable) runnable).isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long nanoTime() {
        return this.stopwatch.elapsed(TimeUnit.NANOSECONDS);
    }
}
