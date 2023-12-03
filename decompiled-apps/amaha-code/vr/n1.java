package vr;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import vr.t;
/* compiled from: KeepAliveManager.java */
/* loaded from: classes2.dex */
public final class n1 {

    /* renamed from: l  reason: collision with root package name */
    public static final long f35774l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f35775a;

    /* renamed from: b  reason: collision with root package name */
    public final nc.l f35776b;

    /* renamed from: c  reason: collision with root package name */
    public final d f35777c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f35778d;

    /* renamed from: e  reason: collision with root package name */
    public int f35779e;
    public ScheduledFuture<?> f;

    /* renamed from: g  reason: collision with root package name */
    public ScheduledFuture<?> f35780g;

    /* renamed from: h  reason: collision with root package name */
    public final o1 f35781h;

    /* renamed from: i  reason: collision with root package name */
    public final o1 f35782i;

    /* renamed from: j  reason: collision with root package name */
    public final long f35783j;

    /* renamed from: k  reason: collision with root package name */
    public final long f35784k;

    /* compiled from: KeepAliveManager.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n1 n1Var;
            boolean z10;
            synchronized (n1.this) {
                n1Var = n1.this;
                if (n1Var.f35779e != 6) {
                    n1Var.f35779e = 6;
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                n1Var.f35777c.a();
            }
        }
    }

    /* compiled from: KeepAliveManager.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            synchronized (n1.this) {
                n1 n1Var = n1.this;
                n1Var.f35780g = null;
                int i6 = n1Var.f35779e;
                if (i6 == 2) {
                    n1Var.f35779e = 4;
                    n1Var.f = n1Var.f35775a.schedule(n1Var.f35781h, n1Var.f35784k, TimeUnit.NANOSECONDS);
                    z10 = true;
                } else {
                    if (i6 == 3) {
                        ScheduledExecutorService scheduledExecutorService = n1Var.f35775a;
                        o1 o1Var = n1Var.f35782i;
                        long j10 = n1Var.f35783j;
                        nc.l lVar = n1Var.f35776b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        n1Var.f35780g = scheduledExecutorService.schedule(o1Var, j10 - lVar.a(timeUnit), timeUnit);
                        n1.this.f35779e = 2;
                    }
                    z10 = false;
                }
            }
            if (z10) {
                n1.this.f35777c.b();
            }
        }
    }

    /* compiled from: KeepAliveManager.java */
    /* loaded from: classes2.dex */
    public interface d {
        void a();

        void b();
    }

    static {
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public n1(c cVar, ScheduledExecutorService scheduledExecutorService, long j10, long j11, boolean z10) {
        nc.l lVar = new nc.l();
        this.f35779e = 1;
        this.f35781h = new o1(new a());
        this.f35782i = new o1(new b());
        this.f35777c = cVar;
        sc.b.w(scheduledExecutorService, "scheduler");
        this.f35775a = scheduledExecutorService;
        this.f35776b = lVar;
        this.f35783j = j10;
        this.f35784k = j11;
        this.f35778d = z10;
        lVar.f26011b = false;
        lVar.b();
    }

    public final synchronized void a() {
        nc.l lVar = this.f35776b;
        boolean z10 = false;
        lVar.f26011b = false;
        lVar.b();
        int i6 = this.f35779e;
        if (i6 == 2) {
            this.f35779e = 3;
        } else if (i6 == 4 || i6 == 5) {
            ScheduledFuture<?> scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.f35779e == 5) {
                this.f35779e = 1;
                return;
            }
            this.f35779e = 2;
            if (this.f35780g == null) {
                z10 = true;
            }
            sc.b.B("There should be no outstanding pingFuture", z10);
            this.f35780g = this.f35775a.schedule(this.f35782i, this.f35783j, TimeUnit.NANOSECONDS);
        }
    }

    public final synchronized void b() {
        int i6 = this.f35779e;
        if (i6 == 1) {
            this.f35779e = 2;
            if (this.f35780g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f35775a;
                o1 o1Var = this.f35782i;
                long j10 = this.f35783j;
                nc.l lVar = this.f35776b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f35780g = scheduledExecutorService.schedule(o1Var, j10 - lVar.a(timeUnit), timeUnit);
            }
        } else if (i6 == 5) {
            this.f35779e = 4;
        }
    }

    public final synchronized void c() {
        if (this.f35778d) {
            b();
        }
    }

    /* compiled from: KeepAliveManager.java */
    /* loaded from: classes2.dex */
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final w f35787a;

        public c(w wVar) {
            this.f35787a = wVar;
        }

        @Override // vr.n1.d
        public final void a() {
            this.f35787a.c(tr.i0.f33488m.g("Keepalive failed. The connection is likely gone"));
        }

        @Override // vr.n1.d
        public final void b() {
            this.f35787a.d(new a());
        }

        /* compiled from: KeepAliveManager.java */
        /* loaded from: classes2.dex */
        public class a implements t.a {
            public a() {
            }

            @Override // vr.t.a
            public final void a() {
                c.this.f35787a.c(tr.i0.f33488m.g("Keepalive failed. The connection is likely gone"));
            }

            @Override // vr.t.a
            public final void onSuccess() {
            }
        }
    }
}
