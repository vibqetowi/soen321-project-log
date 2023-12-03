package ta;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class w3 extends e4 {
    public static final AtomicLong E = new AtomicLong(Long.MIN_VALUE);
    public final t3 A;
    public final t3 B;
    public final Object C;
    public final Semaphore D;

    /* renamed from: w  reason: collision with root package name */
    public v3 f32926w;

    /* renamed from: x  reason: collision with root package name */
    public v3 f32927x;

    /* renamed from: y  reason: collision with root package name */
    public final PriorityBlockingQueue f32928y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedBlockingQueue f32929z;

    public w3(y3 y3Var) {
        super(y3Var);
        this.C = new Object();
        this.D = new Semaphore(2);
        this.f32928y = new PriorityBlockingQueue();
        this.f32929z = new LinkedBlockingQueue();
        this.A = new t3(this, "Thread death: Uncaught exception on worker thread");
        this.B = new t3(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // ta.x3
    public final void h() {
        if (Thread.currentThread() == this.f32926w) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override // ta.e4
    public final boolean i() {
        return false;
    }

    public final void l() {
        if (Thread.currentThread() == this.f32927x) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    public final Object m(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            w3 w3Var = this.f32943u.D;
            y3.k(w3Var);
            w3Var.p(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                w2 w2Var = this.f32943u.C;
                y3.k(w2Var);
                w2Var.C.b("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            w2 w2Var2 = this.f32943u.C;
            y3.k(w2Var2);
            w2Var2.C.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final u3 n(Callable callable) {
        j();
        u3 u3Var = new u3(this, callable, false);
        if (Thread.currentThread() == this.f32926w) {
            if (!this.f32928y.isEmpty()) {
                w2 w2Var = this.f32943u.C;
                y3.k(w2Var);
                w2Var.C.b("Callable skipped the worker queue.");
            }
            u3Var.run();
        } else {
            s(u3Var);
        }
        return u3Var;
    }

    public final void o(Runnable runnable) {
        j();
        u3 u3Var = new u3(this, runnable, false, "Task exception on network thread");
        synchronized (this.C) {
            this.f32929z.add(u3Var);
            v3 v3Var = this.f32927x;
            if (v3Var == null) {
                v3 v3Var2 = new v3(this, "Measurement Network", this.f32929z);
                this.f32927x = v3Var2;
                v3Var2.setUncaughtExceptionHandler(this.B);
                this.f32927x.start();
            } else {
                v3Var.a();
            }
        }
    }

    public final void p(Runnable runnable) {
        j();
        v9.o.h(runnable);
        s(new u3(this, runnable, false, "Task exception on worker thread"));
    }

    public final void q(Runnable runnable) {
        j();
        s(new u3(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean r() {
        if (Thread.currentThread() == this.f32926w) {
            return true;
        }
        return false;
    }

    public final void s(u3 u3Var) {
        synchronized (this.C) {
            this.f32928y.add(u3Var);
            v3 v3Var = this.f32926w;
            if (v3Var == null) {
                v3 v3Var2 = new v3(this, "Measurement Worker", this.f32928y);
                this.f32926w = v3Var2;
                v3Var2.setUncaughtExceptionHandler(this.A);
                this.f32926w.start();
            } else {
                v3Var.a();
            }
        }
    }
}
