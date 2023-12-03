package x1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: TransactionExecutor.kt */
/* loaded from: classes.dex */
public final class v implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public final Executor f37574u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayDeque<Runnable> f37575v;

    /* renamed from: w  reason: collision with root package name */
    public Runnable f37576w;

    /* renamed from: x  reason: collision with root package name */
    public final Object f37577x;

    public v(Executor executor) {
        kotlin.jvm.internal.i.g(executor, "executor");
        this.f37574u = executor;
        this.f37575v = new ArrayDeque<>();
        this.f37577x = new Object();
    }

    public final void a() {
        synchronized (this.f37577x) {
            Runnable poll = this.f37575v.poll();
            Runnable runnable = poll;
            this.f37576w = runnable;
            if (poll != null) {
                this.f37574u.execute(runnable);
            }
            hs.k kVar = hs.k.f19476a;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        kotlin.jvm.internal.i.g(command, "command");
        synchronized (this.f37577x) {
            this.f37575v.offer(new g.v(command, this));
            if (this.f37576w == null) {
                a();
            }
            hs.k kVar = hs.k.f19476a;
        }
    }
}
