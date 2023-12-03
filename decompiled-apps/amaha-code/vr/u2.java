package vr;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import vr.q1;
/* compiled from: Rescheduler.java */
/* loaded from: classes2.dex */
public final class u2 {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f35997a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f35998b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f35999c;

    /* renamed from: d  reason: collision with root package name */
    public final nc.l f36000d;

    /* renamed from: e  reason: collision with root package name */
    public long f36001e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public ScheduledFuture<?> f36002g;

    /* compiled from: Rescheduler.java */
    /* loaded from: classes2.dex */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            u2 u2Var = u2.this;
            if (!u2Var.f) {
                u2Var.f36002g = null;
                return;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long a10 = u2Var.f36001e - u2Var.f36000d.a(timeUnit);
            if (a10 > 0) {
                u2Var.f36002g = u2Var.f35997a.schedule(new b(), a10, timeUnit);
                return;
            }
            u2Var.f = false;
            u2Var.f36002g = null;
            u2Var.f35999c.run();
        }
    }

    /* compiled from: Rescheduler.java */
    /* loaded from: classes2.dex */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            u2 u2Var = u2.this;
            u2Var.f35998b.execute(new a());
        }
    }

    public u2(q1.k kVar, tr.l0 l0Var, ScheduledExecutorService scheduledExecutorService, nc.l lVar) {
        this.f35999c = kVar;
        this.f35998b = l0Var;
        this.f35997a = scheduledExecutorService;
        this.f36000d = lVar;
        lVar.b();
    }
}
