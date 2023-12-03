package vr;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: SerializingExecutor.java */
/* loaded from: classes2.dex */
public final class a3 implements Executor, Runnable {

    /* renamed from: x  reason: collision with root package name */
    public static final Logger f35393x = Logger.getLogger(a3.class.getName());

    /* renamed from: y  reason: collision with root package name */
    public static final a f35394y;

    /* renamed from: u  reason: collision with root package name */
    public final Executor f35395u;

    /* renamed from: v  reason: collision with root package name */
    public final ConcurrentLinkedQueue f35396v = new ConcurrentLinkedQueue();

    /* renamed from: w  reason: collision with root package name */
    public volatile int f35397w = 0;

    /* compiled from: SerializingExecutor.java */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract boolean a(a3 a3Var);

        public abstract void b(a3 a3Var);
    }

    /* compiled from: SerializingExecutor.java */
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicIntegerFieldUpdater<a3> f35398a;

        public b(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            this.f35398a = atomicIntegerFieldUpdater;
        }

        @Override // vr.a3.a
        public final boolean a(a3 a3Var) {
            return this.f35398a.compareAndSet(a3Var, 0, -1);
        }

        @Override // vr.a3.a
        public final void b(a3 a3Var) {
            this.f35398a.set(a3Var, 0);
        }
    }

    /* compiled from: SerializingExecutor.java */
    /* loaded from: classes2.dex */
    public static final class c extends a {
        @Override // vr.a3.a
        public final boolean a(a3 a3Var) {
            synchronized (a3Var) {
                if (a3Var.f35397w == 0) {
                    a3Var.f35397w = -1;
                    return true;
                }
                return false;
            }
        }

        @Override // vr.a3.a
        public final void b(a3 a3Var) {
            synchronized (a3Var) {
                a3Var.f35397w = 0;
            }
        }
    }

    static {
        a cVar;
        try {
            cVar = new b(AtomicIntegerFieldUpdater.newUpdater(a3.class, "w"));
        } catch (Throwable th2) {
            f35393x.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th2);
            cVar = new c();
        }
        f35394y = cVar;
    }

    public a3(Executor executor) {
        sc.b.w(executor, "'executor' must not be null.");
        this.f35395u = executor;
    }

    public final void a(Runnable runnable) {
        a aVar = f35394y;
        if (aVar.a(this)) {
            try {
                this.f35395u.execute(this);
            } catch (Throwable th2) {
                if (runnable != null) {
                    this.f35396v.remove(runnable);
                }
                aVar.b(this);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f35396v;
        sc.b.w(runnable, "'r' must not be null.");
        concurrentLinkedQueue.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        a aVar = f35394y;
        while (true) {
            concurrentLinkedQueue = this.f35396v;
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e10) {
                    Logger logger = f35393x;
                    Level level = Level.SEVERE;
                    logger.log(level, "Exception while executing runnable " + runnable, (Throwable) e10);
                }
            } catch (Throwable th2) {
                aVar.b(this);
                throw th2;
            }
        }
        aVar.b(this);
        if (!concurrentLinkedQueue.isEmpty()) {
            a(null);
        }
    }
}
