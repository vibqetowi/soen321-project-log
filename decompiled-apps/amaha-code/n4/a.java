package n4;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: GlideExecutor.java */
/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: v  reason: collision with root package name */
    public static final long f25878v = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: w  reason: collision with root package name */
    public static volatile int f25879w;

    /* renamed from: u  reason: collision with root package name */
    public final ExecutorService f25880u;

    /* compiled from: GlideExecutor.java */
    /* renamed from: n4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ThreadFactoryC0421a implements ThreadFactory {

        /* renamed from: u  reason: collision with root package name */
        public final String f25881u;

        /* renamed from: v  reason: collision with root package name */
        public final boolean f25882v;

        /* renamed from: w  reason: collision with root package name */
        public int f25883w;

        /* compiled from: GlideExecutor.java */
        /* renamed from: n4.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0422a extends Thread {
            public C0422a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC0421a.this.f25882v) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th2) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                    }
                }
            }
        }

        public ThreadFactoryC0421a(String str, boolean z10) {
            this.f25881u = str;
            this.f25882v = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            C0422a c0422a;
            c0422a = new C0422a(runnable, "glide-" + this.f25881u + "-thread-" + this.f25883w);
            this.f25883w = this.f25883w + 1;
            return c0422a;
        }
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f25880u = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f25880u.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f25880u.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f25880u.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f25880u.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f25880u.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f25880u.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f25880u.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f25880u.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f25880u.submit(runnable);
    }

    public final String toString() {
        return this.f25880u.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f25880u.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f25880u.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t3) {
        return this.f25880u.submit(runnable, t3);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f25880u.submit(callable);
    }
}
