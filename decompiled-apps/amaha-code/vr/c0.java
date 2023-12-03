package vr;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import nc.f;
import tr.c;
import vr.q1;
/* compiled from: DelayedClientCall.java */
/* loaded from: classes2.dex */
public class c0<ReqT, RespT> extends tr.c<ReqT, RespT> {

    /* renamed from: j  reason: collision with root package name */
    public static final g f35409j;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledFuture<?> f35410a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f35411b;

    /* renamed from: c  reason: collision with root package name */
    public final tr.l f35412c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f35413d;

    /* renamed from: e  reason: collision with root package name */
    public c.a<RespT> f35414e;
    public tr.c<ReqT, RespT> f;

    /* renamed from: g  reason: collision with root package name */
    public tr.i0 f35415g;

    /* renamed from: h  reason: collision with root package name */
    public List<Runnable> f35416h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public i<RespT> f35417i;

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class a extends y {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ i f35418v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, i iVar) {
            super(c0Var.f35412c);
            this.f35418v = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vr.y
        public final void a() {
            List<Runnable> list;
            i iVar = this.f35418v;
            iVar.getClass();
            List arrayList = new ArrayList();
            while (true) {
                synchronized (iVar) {
                    if (iVar.f35433c.isEmpty()) {
                        iVar.f35433c = null;
                        iVar.f35432b = true;
                        return;
                    }
                    list = iVar.f35433c;
                    iVar.f35433c = arrayList;
                }
                for (Runnable runnable : list) {
                    runnable.run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ c.a f35419u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ tr.c0 f35420v;

        public b(c.a aVar, tr.c0 c0Var) {
            this.f35419u = aVar;
            this.f35420v = c0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c0.this.f.e(this.f35419u, this.f35420v);
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ tr.i0 f35422u;

        public c(tr.i0 i0Var) {
            this.f35422u = i0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            tr.c<ReqT, RespT> cVar = c0.this.f;
            tr.i0 i0Var = this.f35422u;
            cVar.a(i0Var.f33492b, i0Var.f33493c);
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Object f35424u;

        public d(Object obj) {
            this.f35424u = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            c0.this.f.d(this.f35424u);
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f35426u;

        public e(int i6) {
            this.f35426u = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c0.this.f.c(this.f35426u);
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c0.this.f.b();
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public final class h extends y {

        /* renamed from: v  reason: collision with root package name */
        public final c.a<RespT> f35429v;

        /* renamed from: w  reason: collision with root package name */
        public final tr.i0 f35430w;

        public h(c0 c0Var, c.a<RespT> aVar, tr.i0 i0Var) {
            super(c0Var.f35412c);
            this.f35429v = aVar;
            this.f35430w = i0Var;
        }

        @Override // vr.y
        public final void a() {
            this.f35429v.a(new tr.c0(), this.f35430w);
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public static final class i<RespT> extends c.a<RespT> {

        /* renamed from: a  reason: collision with root package name */
        public final c.a<RespT> f35431a;

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f35432b;

        /* renamed from: c  reason: collision with root package name */
        public List<Runnable> f35433c = new ArrayList();

        /* compiled from: DelayedClientCall.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ tr.c0 f35434u;

            public a(tr.c0 c0Var) {
                this.f35434u = c0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.this.f35431a.b(this.f35434u);
            }
        }

        /* compiled from: DelayedClientCall.java */
        /* loaded from: classes2.dex */
        public class b implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ Object f35436u;

            public b(Object obj) {
                this.f35436u = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                i.this.f35431a.c(this.f35436u);
            }
        }

        /* compiled from: DelayedClientCall.java */
        /* loaded from: classes2.dex */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.this.f35431a.d();
            }
        }

        public i(c.a<RespT> aVar) {
            this.f35431a = aVar;
        }

        @Override // tr.c.a
        public final void a(tr.c0 c0Var, tr.i0 i0Var) {
            e(new d0(this, i0Var, c0Var));
        }

        @Override // tr.c.a
        public final void b(tr.c0 c0Var) {
            if (this.f35432b) {
                this.f35431a.b(c0Var);
            } else {
                e(new a(c0Var));
            }
        }

        @Override // tr.c.a
        public final void c(RespT respt) {
            if (this.f35432b) {
                this.f35431a.c(respt);
            } else {
                e(new b(respt));
            }
        }

        @Override // tr.c.a
        public final void d() {
            if (this.f35432b) {
                this.f35431a.d();
            } else {
                e(new c());
            }
        }

        public final void e(Runnable runnable) {
            synchronized (this) {
                if (!this.f35432b) {
                    this.f35433c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }
    }

    static {
        Logger.getLogger(c0.class.getName());
        f35409j = new g();
    }

    public c0(Executor executor, q1.o oVar, tr.m mVar) {
        ScheduledFuture<?> schedule;
        sc.b.w(executor, "callExecutor");
        this.f35411b = executor;
        sc.b.w(oVar, "scheduler");
        tr.l b10 = tr.l.b();
        this.f35412c = b10;
        b10.getClass();
        if (mVar == null) {
            schedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long h10 = mVar.h(timeUnit);
            long abs = Math.abs(h10);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = abs / timeUnit2.toNanos(1L);
            long abs2 = Math.abs(h10) % timeUnit2.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            if (h10 < 0) {
                sb2.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb2.append("Deadline CallOptions will be exceeded in ");
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb2.append("s. ");
            schedule = oVar.schedule(new b0(this, sb2), h10, timeUnit);
        }
        this.f35410a = schedule;
    }

    @Override // tr.c
    public final void a(String str, Throwable th2) {
        tr.i0 g5;
        tr.i0 i0Var = tr.i0.f;
        if (str != null) {
            g5 = i0Var.g(str);
        } else {
            g5 = i0Var.g("Call cancelled without message");
        }
        if (th2 != null) {
            g5 = g5.f(th2);
        }
        g(g5, false);
    }

    @Override // tr.c
    public final void b() {
        h(new f());
    }

    @Override // tr.c
    public final void c(int i6) {
        if (this.f35413d) {
            this.f.c(i6);
        } else {
            h(new e(i6));
        }
    }

    @Override // tr.c
    public final void d(ReqT reqt) {
        if (this.f35413d) {
            this.f.d(reqt);
        } else {
            h(new d(reqt));
        }
    }

    @Override // tr.c
    public final void e(c.a<RespT> aVar, tr.c0 c0Var) {
        boolean z10;
        tr.i0 i0Var;
        boolean z11;
        if (this.f35414e == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("already started", z10);
        synchronized (this) {
            sc.b.w(aVar, "listener");
            this.f35414e = aVar;
            i0Var = this.f35415g;
            z11 = this.f35413d;
            if (!z11) {
                i<RespT> iVar = new i<>(aVar);
                this.f35417i = iVar;
                aVar = iVar;
            }
        }
        if (i0Var != null) {
            this.f35411b.execute(new h(this, aVar, i0Var));
        } else if (z11) {
            this.f.e(aVar, c0Var);
        } else {
            h(new b(aVar, c0Var));
        }
    }

    public final void g(tr.i0 i0Var, boolean z10) {
        c.a<RespT> aVar;
        synchronized (this) {
            try {
                tr.c<ReqT, RespT> cVar = this.f;
                boolean z11 = true;
                if (cVar == null) {
                    g gVar = f35409j;
                    if (cVar != null) {
                        z11 = false;
                    }
                    sc.b.z(cVar, "realCall already set to %s", z11);
                    ScheduledFuture<?> scheduledFuture = this.f35410a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f = gVar;
                    aVar = this.f35414e;
                    this.f35415g = i0Var;
                    z11 = false;
                } else if (z10) {
                    return;
                } else {
                    aVar = null;
                }
                if (z11) {
                    h(new c(i0Var));
                } else {
                    if (aVar != null) {
                        this.f35411b.execute(new h(this, aVar, i0Var));
                    }
                    i();
                }
                f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(Runnable runnable) {
        synchronized (this) {
            if (!this.f35413d) {
                this.f35416h.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        i<RespT> iVar;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f35416h.isEmpty()) {
                    break;
                }
                list = this.f35416h;
                this.f35416h = arrayList;
            }
            if (iVar == null) {
                this.f35411b.execute(new a(this, iVar));
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.f35416h = null;
        this.f35413d = true;
        iVar = this.f35417i;
        if (iVar == null) {
        }
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(this.f, "realCall");
        return c10.toString();
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class g extends tr.c<Object, Object> {
        @Override // tr.c
        public final void b() {
        }

        @Override // tr.c
        public final void c(int i6) {
        }

        @Override // tr.c
        public final void d(Object obj) {
        }

        @Override // tr.c
        public final void a(String str, Throwable th2) {
        }

        @Override // tr.c
        public final void e(c.a<Object> aVar, tr.c0 c0Var) {
        }
    }

    public void f() {
    }
}
