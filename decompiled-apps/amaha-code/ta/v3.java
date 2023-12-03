package ta;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class v3 extends Thread {

    /* renamed from: u  reason: collision with root package name */
    public final Object f32906u;

    /* renamed from: v  reason: collision with root package name */
    public final BlockingQueue f32907v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f32908w = false;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w3 f32909x;

    public v3(w3 w3Var, String str, BlockingQueue blockingQueue) {
        this.f32909x = w3Var;
        v9.o.h(blockingQueue);
        this.f32906u = new Object();
        this.f32907v = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f32906u) {
            this.f32906u.notifyAll();
        }
    }

    public final void b() {
        synchronized (this.f32909x.C) {
            try {
                if (!this.f32908w) {
                    this.f32909x.D.release();
                    this.f32909x.C.notifyAll();
                    w3 w3Var = this.f32909x;
                    if (this == w3Var.f32926w) {
                        w3Var.f32926w = null;
                    } else if (this == w3Var.f32927x) {
                        w3Var.f32927x = null;
                    } else {
                        w2 w2Var = w3Var.f32943u.C;
                        y3.k(w2Var);
                        w2Var.f32925z.b("Current scheduler thread is neither worker nor network");
                    }
                    this.f32908w = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        w2 w2Var = this.f32909x.f32943u.C;
        y3.k(w2Var);
        w2Var.C.c(interruptedException, String.valueOf(getName()).concat(" was interrupted"));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i6;
        boolean z10 = false;
        while (!z10) {
            try {
                this.f32909x.D.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                u3 u3Var = (u3) this.f32907v.poll();
                if (u3Var != null) {
                    if (true != u3Var.f32896v) {
                        i6 = 10;
                    } else {
                        i6 = threadPriority;
                    }
                    Process.setThreadPriority(i6);
                    u3Var.run();
                } else {
                    synchronized (this.f32906u) {
                        if (this.f32907v.peek() == null) {
                            this.f32909x.getClass();
                            try {
                                this.f32906u.wait(30000L);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    synchronized (this.f32909x.C) {
                        if (this.f32907v.peek() == null) {
                            b();
                            return;
                        }
                    }
                }
            }
        } finally {
            b();
        }
    }
}
