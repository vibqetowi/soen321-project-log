package ad;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v9.o;
/* compiled from: DefaultTokenRefresher.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final d f499a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f500b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f501c;

    /* renamed from: d  reason: collision with root package name */
    public volatile ScheduledFuture<?> f502d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f503e;

    public g(d dVar, @yc.c Executor executor, @yc.b ScheduledExecutorService scheduledExecutorService) {
        o.h(dVar);
        this.f499a = dVar;
        this.f500b = executor;
        this.f501c = scheduledExecutorService;
        this.f503e = -1L;
    }

    public final void a() {
        if (this.f502d != null && !this.f502d.isDone()) {
            this.f502d.cancel(false);
        }
    }

    public final void b(long j10) {
        a();
        this.f503e = -1L;
        this.f502d = this.f501c.schedule(new e(this, 0), Math.max(0L, j10), TimeUnit.MILLISECONDS);
    }
}
