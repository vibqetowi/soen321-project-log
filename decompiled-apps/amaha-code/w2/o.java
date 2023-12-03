package w2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: SerialExecutorImpl.java */
/* loaded from: classes.dex */
public final class o implements Executor {

    /* renamed from: v  reason: collision with root package name */
    public final Executor f36309v;

    /* renamed from: w  reason: collision with root package name */
    public Runnable f36310w;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayDeque<a> f36308u = new ArrayDeque<>();

    /* renamed from: x  reason: collision with root package name */
    public final Object f36311x = new Object();

    /* compiled from: SerialExecutorImpl.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final o f36312u;

        /* renamed from: v  reason: collision with root package name */
        public final Runnable f36313v;

        public a(o oVar, Runnable runnable) {
            this.f36312u = oVar;
            this.f36313v = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f36313v.run();
                synchronized (this.f36312u.f36311x) {
                    this.f36312u.b();
                }
            } catch (Throwable th2) {
                synchronized (this.f36312u.f36311x) {
                    this.f36312u.b();
                    throw th2;
                }
            }
        }
    }

    public o(ExecutorService executorService) {
        this.f36309v = executorService;
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f36311x) {
            if (!this.f36308u.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void b() {
        a poll = this.f36308u.poll();
        this.f36310w = poll;
        if (poll != null) {
            this.f36309v.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f36311x) {
            this.f36308u.add(new a(this, runnable));
            if (this.f36310w == null) {
                b();
            }
        }
    }
}
