package tr;

import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SynchronizationContext.java */
/* loaded from: classes2.dex */
public final class l0 implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f33519u;

    /* renamed from: v  reason: collision with root package name */
    public final ConcurrentLinkedQueue f33520v = new ConcurrentLinkedQueue();

    /* renamed from: w  reason: collision with root package name */
    public final AtomicReference<Thread> f33521w = new AtomicReference<>();

    /* compiled from: SynchronizationContext.java */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final Runnable f33522u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f33523v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f33524w;

        public a(Runnable runnable) {
            this.f33522u = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f33523v) {
                this.f33524w = true;
                this.f33522u.run();
            }
        }
    }

    /* compiled from: SynchronizationContext.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a f33525a;

        /* renamed from: b  reason: collision with root package name */
        public final ScheduledFuture<?> f33526b;

        public b(a aVar, ScheduledFuture scheduledFuture) {
            this.f33525a = aVar;
            sc.b.w(scheduledFuture, "future");
            this.f33526b = scheduledFuture;
        }

        public final void a() {
            this.f33525a.f33523v = true;
            this.f33526b.cancel(false);
        }
    }

    public l0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f33519u = uncaughtExceptionHandler;
    }

    public final void a() {
        boolean z10;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        do {
            AtomicReference<Thread> atomicReference = this.f33521w;
            Thread currentThread = Thread.currentThread();
            while (true) {
                if (atomicReference.compareAndSet(null, currentThread)) {
                    z10 = true;
                    break;
                } else if (atomicReference.get() != null) {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                return;
            }
            while (true) {
                concurrentLinkedQueue = this.f33520v;
                try {
                    Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        atomicReference.set(null);
                    }
                } catch (Throwable th2) {
                    atomicReference.set(null);
                    throw th2;
                }
            }
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public final void b(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f33520v;
        sc.b.w(runnable, "runnable is null");
        concurrentLinkedQueue.add(runnable);
    }

    public final b c(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j10, TimeUnit timeUnit) {
        a aVar = new a(runnable);
        return new b(aVar, scheduledExecutorService.schedule(new j0(this, aVar, runnable), j10, timeUnit));
    }

    public final void d() {
        boolean z10;
        if (Thread.currentThread() == this.f33521w.get()) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("Not called from the SynchronizationContext", z10);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
