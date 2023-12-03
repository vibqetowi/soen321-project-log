package oe;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import ne.u;
/* compiled from: BackgroundQueue.java */
/* loaded from: classes.dex */
public final class c implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public final Semaphore f27401u = new Semaphore(0);

    /* renamed from: v  reason: collision with root package name */
    public int f27402v = 0;

    public final void a() {
        try {
            this.f27401u.acquire(this.f27402v);
            this.f27402v = 0;
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            ca.a.V("Interrupted while waiting for background task", e10);
            throw null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f27402v++;
        g.f27422c.execute(new u(this, 2, runnable));
    }
}
