package vr;

import io.grpc.h;
import java.net.SocketAddress;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import nc.f;
import tr.b;
import tr.l0;
import vr.g2;
import vr.j0;
import vr.k;
import vr.q1;
import vr.s;
import vr.u;
/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public final class c1 implements tr.v<Object>, l3 {

    /* renamed from: a  reason: collision with root package name */
    public final tr.w f35439a;

    /* renamed from: b  reason: collision with root package name */
    public final String f35440b;

    /* renamed from: c  reason: collision with root package name */
    public final String f35441c;

    /* renamed from: d  reason: collision with root package name */
    public final k.a f35442d;

    /* renamed from: e  reason: collision with root package name */
    public final c f35443e;
    public final u f;

    /* renamed from: g  reason: collision with root package name */
    public final ScheduledExecutorService f35444g;

    /* renamed from: h  reason: collision with root package name */
    public final tr.u f35445h;

    /* renamed from: i  reason: collision with root package name */
    public final m f35446i;

    /* renamed from: j  reason: collision with root package name */
    public final tr.b f35447j;

    /* renamed from: k  reason: collision with root package name */
    public final tr.l0 f35448k;

    /* renamed from: l  reason: collision with root package name */
    public final d f35449l;

    /* renamed from: m  reason: collision with root package name */
    public volatile List<io.grpc.d> f35450m;

    /* renamed from: n  reason: collision with root package name */
    public k f35451n;

    /* renamed from: o  reason: collision with root package name */
    public final nc.l f35452o;

    /* renamed from: p  reason: collision with root package name */
    public l0.b f35453p;

    /* renamed from: q  reason: collision with root package name */
    public l0.b f35454q;
    public g2 r;

    /* renamed from: u  reason: collision with root package name */
    public w f35457u;

    /* renamed from: v  reason: collision with root package name */
    public volatile g2 f35458v;

    /* renamed from: x  reason: collision with root package name */
    public tr.i0 f35460x;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f35455s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public final a f35456t = new a();

    /* renamed from: w  reason: collision with root package name */
    public volatile tr.k f35459w = tr.k.a(tr.j.IDLE);

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public class a extends g3.f {
        public a() {
        }

        @Override // g3.f
        public final void a() {
            c1 c1Var = c1.this;
            q1.this.Z.c(c1Var, true);
        }

        @Override // g3.f
        public final void b() {
            c1 c1Var = c1.this;
            q1.this.Z.c(c1Var, false);
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public static final class b extends p0 {

        /* renamed from: a  reason: collision with root package name */
        public final w f35462a;

        /* renamed from: b  reason: collision with root package name */
        public final m f35463b;

        /* compiled from: InternalSubchannel.java */
        /* loaded from: classes2.dex */
        public class a extends n0 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ r f35464a;

            /* compiled from: InternalSubchannel.java */
            /* renamed from: vr.c1$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class C0603a extends o0 {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ s f35466a;

                public C0603a(s sVar) {
                    this.f35466a = sVar;
                }

                @Override // vr.s
                public final void b(tr.i0 i0Var, s.a aVar, tr.c0 c0Var) {
                    m mVar = b.this.f35463b;
                    if (i0Var.e()) {
                        mVar.f35764c.add(1L);
                    } else {
                        mVar.f35765d.add(1L);
                    }
                    this.f35466a.b(i0Var, aVar, c0Var);
                }
            }

            public a(r rVar) {
                this.f35464a = rVar;
            }

            @Override // vr.r
            public final void n(s sVar) {
                m mVar = b.this.f35463b;
                mVar.f35763b.add(1L);
                mVar.f35762a.a();
                this.f35464a.n(new C0603a(sVar));
            }
        }

        public b(w wVar, m mVar) {
            this.f35462a = wVar;
            this.f35463b = mVar;
        }

        @Override // vr.p0
        public final w a() {
            return this.f35462a;
        }

        @Override // vr.t
        public final r f(tr.d0<?, ?> d0Var, tr.c0 c0Var, io.grpc.b bVar, io.grpc.c[] cVarArr) {
            return new a(a().f(d0Var, c0Var, bVar, cVarArr));
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public static abstract class c {
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public List<io.grpc.d> f35468a;

        /* renamed from: b  reason: collision with root package name */
        public int f35469b;

        /* renamed from: c  reason: collision with root package name */
        public int f35470c;

        public d(List<io.grpc.d> list) {
            this.f35468a = list;
        }

        public final void a() {
            this.f35469b = 0;
            this.f35470c = 0;
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public class e implements g2.a {

        /* renamed from: a  reason: collision with root package name */
        public final w f35471a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f35472b = false;

        /* compiled from: InternalSubchannel.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                e eVar = e.this;
                c1 c1Var = c1.this;
                c1Var.f35451n = null;
                if (c1Var.f35460x != null) {
                    if (c1Var.f35458v == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sc.b.B("Unexpected non-null activeTransport", z10);
                    e eVar2 = e.this;
                    eVar2.f35471a.h(c1.this.f35460x);
                    return;
                }
                w wVar = c1Var.f35457u;
                w wVar2 = eVar.f35471a;
                if (wVar == wVar2) {
                    c1Var.f35458v = wVar2;
                    c1 c1Var2 = c1.this;
                    c1Var2.f35457u = null;
                    c1.b(c1Var2, tr.j.READY);
                }
            }
        }

        /* compiled from: InternalSubchannel.java */
        /* loaded from: classes2.dex */
        public class b implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ tr.i0 f35475u;

            public b(tr.i0 i0Var) {
                this.f35475u = i0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                boolean z11;
                if (c1.this.f35459w.f33510a == tr.j.SHUTDOWN) {
                    return;
                }
                g2 g2Var = c1.this.f35458v;
                e eVar = e.this;
                w wVar = eVar.f35471a;
                if (g2Var == wVar) {
                    c1.this.f35458v = null;
                    c1.this.f35449l.a();
                    c1.b(c1.this, tr.j.IDLE);
                    return;
                }
                c1 c1Var = c1.this;
                if (c1Var.f35457u == wVar) {
                    boolean z12 = false;
                    if (c1Var.f35459w.f33510a == tr.j.CONNECTING) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sc.b.z(c1.this.f35459w.f33510a, "Expected state is CONNECTING, actual state is %s", z10);
                    d dVar = c1.this.f35449l;
                    int i6 = dVar.f35470c + 1;
                    dVar.f35470c = i6;
                    if (i6 >= dVar.f35468a.get(dVar.f35469b).f20452a.size()) {
                        dVar.f35469b++;
                        dVar.f35470c = 0;
                    }
                    d dVar2 = c1.this.f35449l;
                    if (dVar2.f35469b < dVar2.f35468a.size()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        c1 c1Var2 = c1.this;
                        c1Var2.f35457u = null;
                        c1Var2.f35449l.a();
                        c1 c1Var3 = c1.this;
                        tr.i0 i0Var = this.f35475u;
                        c1Var3.f35448k.d();
                        sc.b.s("The error status must not be OK", !i0Var.e());
                        c1Var3.j(new tr.k(tr.j.TRANSIENT_FAILURE, i0Var));
                        if (c1Var3.f35451n == null) {
                            ((j0.a) c1Var3.f35442d).getClass();
                            c1Var3.f35451n = new j0();
                        }
                        long a10 = ((j0) c1Var3.f35451n).a();
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        long a11 = a10 - c1Var3.f35452o.a(timeUnit);
                        c1Var3.f35447j.b(b.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", c1.k(i0Var), Long.valueOf(a11));
                        if (c1Var3.f35453p == null) {
                            z12 = true;
                        }
                        sc.b.B("previous reconnectTask is not done", z12);
                        c1Var3.f35453p = c1Var3.f35448k.c(c1Var3.f35444g, new d1(c1Var3), a11, timeUnit);
                        return;
                    }
                    c1.i(c1.this);
                }
            }
        }

        /* compiled from: InternalSubchannel.java */
        /* loaded from: classes2.dex */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                c1.this.f35455s.remove(eVar.f35471a);
                if (c1.this.f35459w.f33510a == tr.j.SHUTDOWN && c1.this.f35455s.isEmpty()) {
                    c1 c1Var = c1.this;
                    c1Var.getClass();
                    c1Var.f35448k.execute(new h1(c1Var));
                }
            }
        }

        public e(b bVar) {
            this.f35471a = bVar;
        }

        @Override // vr.g2.a
        public final void a() {
            c1 c1Var = c1.this;
            c1Var.f35447j.a(b.a.INFO, "READY");
            c1Var.f35448k.execute(new a());
        }

        @Override // vr.g2.a
        public final void b() {
            sc.b.B("transportShutdown() must be called before transportTerminated().", this.f35472b);
            c1 c1Var = c1.this;
            tr.b bVar = c1Var.f35447j;
            b.a aVar = b.a.INFO;
            w wVar = this.f35471a;
            bVar.b(aVar, "{0} Terminated", wVar.g());
            tr.u.b(c1Var.f35445h.f33585c, wVar);
            i1 i1Var = new i1(c1Var, wVar, false);
            tr.l0 l0Var = c1Var.f35448k;
            l0Var.execute(i1Var);
            l0Var.execute(new c());
        }

        @Override // vr.g2.a
        public final void c(tr.i0 i0Var) {
            c1 c1Var = c1.this;
            c1Var.f35447j.b(b.a.INFO, "{0} SHUTDOWN with {1}", this.f35471a.g(), c1.k(i0Var));
            this.f35472b = true;
            c1Var.f35448k.execute(new b(i0Var));
        }

        @Override // vr.g2.a
        public final void d(boolean z10) {
            c1 c1Var = c1.this;
            c1Var.getClass();
            c1Var.f35448k.execute(new i1(c1Var, this.f35471a, z10));
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public static final class f extends tr.b {

        /* renamed from: a  reason: collision with root package name */
        public tr.w f35478a;

        @Override // tr.b
        public final void a(b.a aVar, String str) {
            b.a aVar2 = b.a.INFO;
            tr.w wVar = this.f35478a;
            Level c10 = n.c(aVar2);
            if (o.f35798d.isLoggable(c10)) {
                o.a(wVar, c10, str);
            }
        }

        @Override // tr.b
        public final void b(b.a aVar, String str, Object... objArr) {
            tr.w wVar = this.f35478a;
            Level c10 = n.c(aVar);
            if (o.f35798d.isLoggable(c10)) {
                o.a(wVar, c10, MessageFormat.format(str, objArr));
            }
        }
    }

    public c1(List list, String str, k.a aVar, l lVar, ScheduledExecutorService scheduledExecutorService, nc.m mVar, tr.l0 l0Var, q1.p.a aVar2, tr.u uVar, m mVar2, o oVar, tr.w wVar, n nVar) {
        sc.b.w(list, "addressGroups");
        sc.b.s("addressGroups is empty", !list.isEmpty());
        for (Object obj : list) {
            sc.b.w(obj, "addressGroups contains null entry");
        }
        List<io.grpc.d> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f35450m = unmodifiableList;
        this.f35449l = new d(unmodifiableList);
        this.f35440b = str;
        this.f35441c = null;
        this.f35442d = aVar;
        this.f = lVar;
        this.f35444g = scheduledExecutorService;
        this.f35452o = (nc.l) mVar.get();
        this.f35448k = l0Var;
        this.f35443e = aVar2;
        this.f35445h = uVar;
        this.f35446i = mVar2;
        sc.b.w(oVar, "channelTracer");
        sc.b.w(wVar, "logId");
        this.f35439a = wVar;
        sc.b.w(nVar, "channelLogger");
        this.f35447j = nVar;
    }

    public static void b(c1 c1Var, tr.j jVar) {
        c1Var.f35448k.d();
        c1Var.j(tr.k.a(jVar));
    }

    public static void i(c1 c1Var) {
        boolean z10;
        boolean z11;
        SocketAddress socketAddress;
        tr.s sVar;
        tr.l0 l0Var = c1Var.f35448k;
        l0Var.d();
        if (c1Var.f35453p == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("Should have no reconnectTask scheduled", z10);
        d dVar = c1Var.f35449l;
        if (dVar.f35469b == 0 && dVar.f35470c == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            nc.l lVar = c1Var.f35452o;
            lVar.f26011b = false;
            lVar.b();
        }
        SocketAddress socketAddress2 = dVar.f35468a.get(dVar.f35469b).f20452a.get(dVar.f35470c);
        if (socketAddress2 instanceof tr.s) {
            sVar = (tr.s) socketAddress2;
            socketAddress = sVar.f33569v;
        } else {
            socketAddress = socketAddress2;
            sVar = null;
        }
        io.grpc.a aVar = dVar.f35468a.get(dVar.f35469b).f20453b;
        String str = (String) aVar.f20427a.get(io.grpc.d.f20451d);
        u.a aVar2 = new u.a();
        if (str == null) {
            str = c1Var.f35440b;
        }
        sc.b.w(str, "authority");
        aVar2.f35969a = str;
        aVar2.f35970b = aVar;
        aVar2.f35971c = c1Var.f35441c;
        aVar2.f35972d = sVar;
        f fVar = new f();
        fVar.f35478a = c1Var.f35439a;
        b bVar = new b(c1Var.f.x0(socketAddress, aVar2, fVar), c1Var.f35446i);
        fVar.f35478a = bVar.g();
        tr.u.a(c1Var.f35445h.f33585c, bVar);
        c1Var.f35457u = bVar;
        c1Var.f35455s.add(bVar);
        Runnable e10 = bVar.e(new e(bVar));
        if (e10 != null) {
            l0Var.b(e10);
        }
        c1Var.f35447j.b(b.a.INFO, "Started transport {0}", fVar.f35478a);
    }

    public static String k(tr.i0 i0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i0Var.f33491a);
        String str = i0Var.f33492b;
        if (str != null) {
            sb2.append("(");
            sb2.append(str);
            sb2.append(")");
        }
        Throwable th2 = i0Var.f33493c;
        if (th2 != null) {
            sb2.append("[");
            sb2.append(th2);
            sb2.append("]");
        }
        return sb2.toString();
    }

    @Override // vr.l3
    public final g2 a() {
        g2 g2Var = this.f35458v;
        if (g2Var != null) {
            return g2Var;
        }
        this.f35448k.execute(new e1(this));
        return null;
    }

    @Override // tr.v
    public final tr.w g() {
        return this.f35439a;
    }

    public final void j(tr.k kVar) {
        boolean z10;
        this.f35448k.d();
        if (this.f35459w.f33510a != kVar.f33510a) {
            boolean z11 = false;
            if (this.f35459w.f33510a != tr.j.SHUTDOWN) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.B("Cannot transition out of SHUTDOWN to " + kVar, z10);
            this.f35459w = kVar;
            h.i iVar = ((q1.p.a) this.f35443e).f35932a;
            if (iVar != null) {
                z11 = true;
            }
            sc.b.B("listener is null", z11);
            iVar.a(kVar);
        }
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.b(this.f35439a.f33589c, "logId");
        c10.c(this.f35450m, "addressGroups");
        return c10.toString();
    }
}
