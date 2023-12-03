package p002if;

import df.a;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kf.i;
import kf.j;
import lf.b;
/* compiled from: MemoryGaugeCollector.java */
/* renamed from: if.f  reason: invalid package */
/* loaded from: classes.dex */
public final class f {
    public static final a f = a.d();

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f20024a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue<b> f20025b;

    /* renamed from: c  reason: collision with root package name */
    public final Runtime f20026c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f20027d;

    /* renamed from: e  reason: collision with root package name */
    public long f20028e;

    public f() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f20027d = null;
        this.f20028e = -1L;
        this.f20024a = newSingleThreadScheduledExecutor;
        this.f20025b = new ConcurrentLinkedQueue<>();
        this.f20026c = runtime;
    }

    public final void a(i iVar) {
        synchronized (this) {
            try {
                this.f20024a.schedule(new e(this, iVar, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                a aVar = f;
                aVar.f("Unable to collect Memory Metric: " + e10.getMessage());
            }
        }
    }

    public final synchronized void b(long j10, i iVar) {
        this.f20028e = j10;
        try {
            this.f20027d = this.f20024a.scheduleAtFixedRate(new e(this, iVar, 0), 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            a aVar = f;
            aVar.f("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    public final b c(i iVar) {
        if (iVar == null) {
            return null;
        }
        long a10 = iVar.a() + iVar.f23322u;
        b.a O = b.O();
        O.u();
        b.M((b) O.f10073v, a10);
        Runtime runtime = this.f20026c;
        int b10 = j.b(((runtime.totalMemory() - runtime.freeMemory()) * 1) / 1024);
        O.u();
        b.N((b) O.f10073v, b10);
        return O.r();
    }
}
