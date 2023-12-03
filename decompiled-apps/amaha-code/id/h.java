package id;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import v9.o;
/* compiled from: SequentialExecutor.java */
/* loaded from: classes.dex */
public final class h implements Executor {

    /* renamed from: z  reason: collision with root package name */
    public static final Logger f19979z = Logger.getLogger(h.class.getName());

    /* renamed from: u  reason: collision with root package name */
    public final Executor f19980u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayDeque f19981v = new ArrayDeque();

    /* renamed from: w  reason: collision with root package name */
    public int f19982w = 1;

    /* renamed from: x  reason: collision with root package name */
    public long f19983x = 0;

    /* renamed from: y  reason: collision with root package name */
    public final b f19984y = new b();

    /* compiled from: SequentialExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Runnable f19985u;

        public a(Runnable runnable) {
            this.f19985u = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f19985u.run();
        }

        public final String toString() {
            return this.f19985u.toString();
        }
    }

    /* compiled from: SequentialExecutor.java */
    /* loaded from: classes.dex */
    public final class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public Runnable f19986u;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
            if (r1 == false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
            r10.f19986u.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
            id.h.f19979z.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r10.f19986u, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                try {
                    synchronized (h.this.f19981v) {
                        if (!z10) {
                            h hVar = h.this;
                            if (hVar.f19982w != 4) {
                                hVar.f19983x++;
                                hVar.f19982w = 4;
                                z10 = true;
                            }
                        }
                        Runnable runnable = (Runnable) h.this.f19981v.poll();
                        this.f19986u = runnable;
                        if (runnable == null) {
                            h.this.f19982w = 1;
                        }
                    }
                    if (z11) {
                        return;
                    }
                    return;
                    this.f19986u = null;
                } finally {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (h.this.f19981v) {
                    h.this.f19982w = 1;
                    throw e10;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f19986u;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + defpackage.d.v(h.this.f19982w) + "}";
        }
    }

    public h(Executor executor) {
        o.h(executor);
        this.f19980u = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o.h(runnable);
        synchronized (this.f19981v) {
            int i6 = this.f19982w;
            if (i6 != 4 && i6 != 3) {
                long j10 = this.f19983x;
                a aVar = new a(runnable);
                this.f19981v.add(aVar);
                this.f19982w = 2;
                boolean z10 = false;
                try {
                    this.f19980u.execute(this.f19984y);
                    if (this.f19982w != 2) {
                        z10 = true;
                    }
                    if (z10) {
                        return;
                    }
                    synchronized (this.f19981v) {
                        if (this.f19983x == j10 && this.f19982w == 2) {
                            this.f19982w = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f19981v) {
                        int i10 = this.f19982w;
                        if ((i10 == 1 || i10 == 2) && this.f19981v.removeLastOccurrence(aVar)) {
                            z10 = true;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || z10) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f19981v.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f19980u + "}";
    }
}
