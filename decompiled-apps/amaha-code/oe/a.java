package oe;

import android.os.Handler;
import android.os.Looper;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import je.o;
import ne.u;
/* compiled from: AsyncQueue.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<c> f27383c = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<C0452a> f27382b = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public final b f27381a = new b();

    /* compiled from: AsyncQueue.java */
    /* renamed from: oe.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0452a {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f27384a;

        /* renamed from: b  reason: collision with root package name */
        public ScheduledFuture f27385b;

        public C0452a(Runnable runnable) {
            this.f27384a = runnable;
        }

        public final void a() {
            a.this.d();
            ScheduledFuture scheduledFuture = this.f27385b;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                b();
            }
        }

        public final void b() {
            boolean z10;
            if (this.f27385b != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ca.a.u0(z10, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.f27385b = null;
            ca.a.u0(a.this.f27382b.remove(this), "Delayed task not found.", new Object[0]);
        }
    }

    /* compiled from: AsyncQueue.java */
    /* loaded from: classes.dex */
    public class b implements Executor {

        /* renamed from: u  reason: collision with root package name */
        public final C0453a f27387u;

        /* renamed from: v  reason: collision with root package name */
        public final Thread f27388v;

        /* compiled from: AsyncQueue.java */
        /* renamed from: oe.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0453a extends ScheduledThreadPoolExecutor {
            public C0453a(RunnableC0454b runnableC0454b) {
                super(1, runnableC0454b);
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            public final void afterExecute(Runnable runnable, Throwable th2) {
                super.afterExecute(runnable, th2);
                if (th2 == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e10) {
                        th2 = e10.getCause();
                    }
                }
                if (th2 != null) {
                    a.this.c(th2);
                }
            }
        }

        /* compiled from: AsyncQueue.java */
        /* renamed from: oe.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0454b implements Runnable, ThreadFactory {

            /* renamed from: u  reason: collision with root package name */
            public final CountDownLatch f27391u = new CountDownLatch(1);

            /* renamed from: v  reason: collision with root package name */
            public Runnable f27392v;

            public RunnableC0454b() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                boolean z10;
                if (this.f27392v == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f27392v = runnable;
                this.f27391u.countDown();
                return b.this.f27388v;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.f27391u.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f27392v.run();
            }
        }

        public b() {
            RunnableC0454b runnableC0454b = new RunnableC0454b();
            Thread newThread = Executors.defaultThreadFactory().newThread(runnableC0454b);
            this.f27388v = newThread;
            newThread.setName("FirestoreWorker");
            newThread.setDaemon(true);
            newThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: oe.b
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    a.this.c(th2);
                }
            });
            C0453a c0453a = new C0453a(runnableC0454b);
            this.f27387u = c0453a;
            c0453a.setKeepAliveTime(3L, TimeUnit.SECONDS);
        }

        @Override // java.util.concurrent.Executor
        public final synchronized void execute(Runnable runnable) {
            this.f27387u.execute(runnable);
        }
    }

    /* compiled from: AsyncQueue.java */
    /* loaded from: classes.dex */
    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        /* JADX INFO: Fake field, exist only in values array */
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    public final C0452a a(c cVar, long j10, Runnable runnable) {
        ScheduledFuture<?> schedule;
        if (this.f27383c.contains(cVar)) {
            j10 = 0;
        }
        System.currentTimeMillis();
        C0452a c0452a = new C0452a(runnable);
        b bVar = this.f27381a;
        o oVar = new o(5, c0452a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (bVar) {
            schedule = bVar.f27387u.schedule(oVar, j10, timeUnit);
        }
        c0452a.f27385b = schedule;
        this.f27382b.add(c0452a);
        return c0452a;
    }

    public final void b(Runnable runnable) {
        w2.f fVar = new w2.f(4, runnable);
        b bVar = this.f27381a;
        bVar.getClass();
        try {
            bVar.execute(new u(new ya.i(), 1, fVar));
        } catch (RejectedExecutionException unused) {
            kc.f.A(2, a.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
        }
    }

    public final void c(Throwable th2) {
        this.f27381a.f27387u.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new o(4, th2));
    }

    public final void d() {
        Thread currentThread = Thread.currentThread();
        b bVar = this.f27381a;
        Thread thread = bVar.f27388v;
        if (thread == currentThread) {
            return;
        }
        ca.a.V("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", thread.getName(), Long.valueOf(bVar.f27388v.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        throw null;
    }
}
