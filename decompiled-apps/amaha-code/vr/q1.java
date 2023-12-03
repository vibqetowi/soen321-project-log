package vr;

import io.grpc.a;
import io.grpc.b;
import io.grpc.g;
import io.grpc.h;
import io.grpc.l;
import io.grpc.n;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import nc.f;
import tr.b;
import tr.c;
import tr.e;
import tr.l0;
import tr.t;
import vr.b3;
import vr.c1;
import vr.f2;
import vr.g2;
import vr.j;
import vr.j0;
import vr.j3;
import vr.k;
import vr.p;
import vr.u0;
import vr.u2;
import vr.v2;
/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public final class q1 extends tr.b0 implements tr.v<Object> {
    public static final Logger e0 = Logger.getLogger(q1.class.getName());

    /* renamed from: f0  reason: collision with root package name */
    public static final Pattern f35846f0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: g0  reason: collision with root package name */
    public static final tr.i0 f35847g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final tr.i0 f35848h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final tr.i0 f35849i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final f2 f35850j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final a f35851k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final d f35852l0;
    public final HashSet A;
    public Collection<n.e<?, ?>> B;
    public final Object C;
    public final HashSet D;
    public final e0 E;
    public final q F;
    public final AtomicBoolean G;
    public boolean H;
    public boolean I;
    public volatile boolean J;
    public final CountDownLatch K;
    public final s1 L;
    public final vr.m M;
    public final vr.o N;
    public final vr.n O;
    public final tr.u P;
    public final n Q;
    public int R;
    public f2 S;
    public boolean T;
    public final boolean U;
    public final v2.s V;
    public final long W;
    public final long X;
    public final boolean Y;
    public final j Z;

    /* renamed from: a0  reason: collision with root package name */
    public l0.b f35853a0;

    /* renamed from: b  reason: collision with root package name */
    public final tr.w f35854b;

    /* renamed from: b0  reason: collision with root package name */
    public vr.k f35855b0;

    /* renamed from: c  reason: collision with root package name */
    public final String f35856c;
    public final e c0;

    /* renamed from: d  reason: collision with root package name */
    public final n.a f35857d;

    /* renamed from: d0  reason: collision with root package name */
    public final u2 f35858d0;

    /* renamed from: e  reason: collision with root package name */
    public final l.a f35859e;
    public final vr.j f;

    /* renamed from: g  reason: collision with root package name */
    public final vr.l f35860g;

    /* renamed from: h  reason: collision with root package name */
    public final o f35861h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f35862i;

    /* renamed from: j  reason: collision with root package name */
    public final e3 f35863j;

    /* renamed from: k  reason: collision with root package name */
    public final i f35864k;

    /* renamed from: l  reason: collision with root package name */
    public final i f35865l;

    /* renamed from: m  reason: collision with root package name */
    public final j3 f35866m;

    /* renamed from: n  reason: collision with root package name */
    public final tr.l0 f35867n;

    /* renamed from: o  reason: collision with root package name */
    public final tr.o f35868o;

    /* renamed from: p  reason: collision with root package name */
    public final tr.i f35869p;

    /* renamed from: q  reason: collision with root package name */
    public final nc.m<nc.l> f35870q;
    public final long r;

    /* renamed from: s  reason: collision with root package name */
    public final x f35871s;

    /* renamed from: t  reason: collision with root package name */
    public final k.a f35872t;

    /* renamed from: u  reason: collision with root package name */
    public final androidx.work.k f35873u;

    /* renamed from: v  reason: collision with root package name */
    public io.grpc.l f35874v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f35875w;

    /* renamed from: x  reason: collision with root package name */
    public l f35876x;

    /* renamed from: y  reason: collision with root package name */
    public volatile h.AbstractC0310h f35877y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f35878z;

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class a extends io.grpc.g {
        @Override // io.grpc.g
        public final g.a a() {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q1 q1Var = q1.this;
            if (!q1Var.G.get() && q1Var.f35876x != null) {
                q1Var.K(false);
                q1.H(q1Var);
            }
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class c implements Thread.UncaughtExceptionHandler {
        public c() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th2) {
            Logger logger = q1.e0;
            Level level = Level.SEVERE;
            StringBuilder sb2 = new StringBuilder("[");
            q1 q1Var = q1.this;
            sb2.append(q1Var.f35854b);
            sb2.append("] Uncaught exception in the SynchronizationContext. Panic!");
            logger.log(level, sb2.toString(), th2);
            if (!q1Var.f35878z) {
                q1Var.f35878z = true;
                q1Var.K(true);
                q1Var.O(false);
                u1 u1Var = new u1(th2);
                q1Var.f35877y = u1Var;
                q1Var.E.i(u1Var);
                q1Var.Q.E(null);
                q1Var.O.a(b.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
                q1Var.f35871s.a(tr.j.TRANSIENT_FAILURE);
            }
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class e implements p.c {
        public e() {
        }

        public final t a(p2 p2Var) {
            h.AbstractC0310h abstractC0310h = q1.this.f35877y;
            if (q1.this.G.get()) {
                return q1.this.E;
            }
            if (abstractC0310h == null) {
                q1.this.f35867n.execute(new y1(this));
                return q1.this.E;
            }
            t e10 = u0.e(abstractC0310h.a(p2Var), Boolean.TRUE.equals(p2Var.f35840a.f20438h));
            if (e10 != null) {
                return e10;
            }
            return q1.this.E;
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public static final class f<ReqT, RespT> extends tr.q<ReqT, RespT> {

        /* renamed from: a  reason: collision with root package name */
        public final io.grpc.g f35882a;

        /* renamed from: b  reason: collision with root package name */
        public final androidx.work.k f35883b;

        /* renamed from: c  reason: collision with root package name */
        public final Executor f35884c;

        /* renamed from: d  reason: collision with root package name */
        public final tr.d0<ReqT, RespT> f35885d;

        /* renamed from: e  reason: collision with root package name */
        public final tr.l f35886e;
        public io.grpc.b f;

        /* renamed from: g  reason: collision with root package name */
        public tr.c<ReqT, RespT> f35887g;

        public f(io.grpc.g gVar, n.a aVar, Executor executor, tr.d0 d0Var, io.grpc.b bVar) {
            this.f35882a = gVar;
            this.f35883b = aVar;
            this.f35885d = d0Var;
            Executor executor2 = bVar.f20433b;
            executor = executor2 != null ? executor2 : executor;
            this.f35884c = executor;
            b.a b10 = io.grpc.b.b(bVar);
            b10.f20442b = executor;
            this.f = new io.grpc.b(b10);
            this.f35886e = tr.l.b();
        }

        @Override // tr.e0, tr.c
        public final void a(String str, Throwable th2) {
            tr.c<ReqT, RespT> cVar = this.f35887g;
            if (cVar != null) {
                cVar.a(str, th2);
            }
        }

        @Override // tr.q, tr.c
        public final void e(c.a<RespT> aVar, tr.c0 c0Var) {
            io.grpc.b bVar = this.f;
            tr.d0<ReqT, RespT> d0Var = this.f35885d;
            sc.b.w(d0Var, "method");
            sc.b.w(c0Var, "headers");
            sc.b.w(bVar, "callOptions");
            g.a a10 = this.f35882a.a();
            tr.i0 i0Var = a10.f20459a;
            if (!i0Var.e()) {
                this.f35884c.execute(new a2(this, aVar, u0.g(i0Var)));
                this.f35887g = q1.f35852l0;
                return;
            }
            f2 f2Var = (f2) a10.f20460b;
            f2Var.getClass();
            f2.a aVar2 = f2Var.f35605b.get(d0Var.f33451b);
            if (aVar2 == null) {
                aVar2 = f2Var.f35606c.get(d0Var.f33452c);
            }
            if (aVar2 == null) {
                aVar2 = f2Var.f35604a;
            }
            if (aVar2 != null) {
                this.f = this.f.c(f2.a.f35609g, aVar2);
            }
            tr.d dVar = a10.f20461c;
            if (dVar != null) {
                this.f35887g = dVar.a();
            } else {
                this.f35887g = this.f35883b.w(d0Var, this.f);
            }
            this.f35887g.e(aVar, c0Var);
        }

        @Override // tr.e0
        public final tr.c<ReqT, RespT> f() {
            return this.f35887g;
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q1 q1Var = q1.this;
            q1Var.f35853a0 = null;
            q1Var.f35867n.d();
            if (q1Var.f35875w) {
                q1Var.f35874v.b();
            }
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public static final class i implements Executor {

        /* renamed from: u  reason: collision with root package name */
        public final l2<? extends Executor> f35890u;

        /* renamed from: v  reason: collision with root package name */
        public Executor f35891v;

        public i(e3 e3Var) {
            this.f35890u = e3Var;
        }

        public final synchronized void a() {
            Executor executor = this.f35891v;
            if (executor != null) {
                this.f35890u.a(executor);
                this.f35891v = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Executor executor;
            synchronized (this) {
                if (this.f35891v == null) {
                    Executor b10 = this.f35890u.b();
                    Executor executor2 = this.f35891v;
                    if (b10 != null) {
                        this.f35891v = b10;
                    } else {
                        throw new NullPointerException(kotlin.jvm.internal.h.P("%s.getObject()", executor2));
                    }
                }
                executor = this.f35891v;
            }
            executor.execute(runnable);
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class j extends g3.f {
        public j() {
        }

        @Override // g3.f
        public final void a() {
            q1.this.L();
        }

        @Override // g3.f
        public final void b() {
            q1 q1Var = q1.this;
            if (q1Var.G.get()) {
                return;
            }
            q1Var.N();
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q1 q1Var = q1.this;
            if (q1Var.f35876x == null) {
                return;
            }
            q1.H(q1Var);
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class l extends h.c {

        /* renamed from: a  reason: collision with root package name */
        public j.a f35894a;

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                q1 q1Var = q1.this;
                q1Var.f35867n.d();
                tr.l0 l0Var = q1Var.f35867n;
                l0Var.d();
                l0.b bVar = q1Var.f35853a0;
                if (bVar != null) {
                    bVar.a();
                    q1Var.f35853a0 = null;
                    q1Var.f35855b0 = null;
                }
                l0Var.d();
                if (q1Var.f35875w) {
                    q1Var.f35874v.b();
                }
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class b implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ h.AbstractC0310h f35897u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ tr.j f35898v;

            public b(h.AbstractC0310h abstractC0310h, tr.j jVar) {
                this.f35897u = abstractC0310h;
                this.f35898v = jVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                l lVar = l.this;
                q1 q1Var = q1.this;
                if (lVar != q1Var.f35876x) {
                    return;
                }
                h.AbstractC0310h abstractC0310h = this.f35897u;
                q1Var.f35877y = abstractC0310h;
                q1Var.E.i(abstractC0310h);
                tr.j jVar = tr.j.SHUTDOWN;
                tr.j jVar2 = this.f35898v;
                if (jVar2 != jVar) {
                    q1.this.O.b(b.a.INFO, "Entering {0} state with picker: {1}", jVar2, abstractC0310h);
                    q1.this.f35871s.a(jVar2);
                }
            }
        }

        public l() {
        }

        @Override // io.grpc.h.c
        public final h.g a(h.a aVar) {
            q1 q1Var = q1.this;
            q1Var.f35867n.d();
            sc.b.B("Channel is being terminated", !q1Var.I);
            return new p(aVar, this);
        }

        @Override // io.grpc.h.c
        public final tr.b b() {
            return q1.this.O;
        }

        @Override // io.grpc.h.c
        public final ScheduledExecutorService c() {
            return q1.this.f35861h;
        }

        @Override // io.grpc.h.c
        public final tr.l0 d() {
            return q1.this.f35867n;
        }

        @Override // io.grpc.h.c
        public final void e() {
            q1 q1Var = q1.this;
            q1Var.f35867n.d();
            q1Var.f35867n.execute(new a());
        }

        @Override // io.grpc.h.c
        public final void f(tr.j jVar, h.AbstractC0310h abstractC0310h) {
            q1 q1Var = q1.this;
            q1Var.f35867n.d();
            sc.b.w(jVar, "newState");
            sc.b.w(abstractC0310h, "newPicker");
            q1Var.f35867n.execute(new b(abstractC0310h, jVar));
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class m extends l.d {

        /* renamed from: a  reason: collision with root package name */
        public final l f35900a;

        /* renamed from: b  reason: collision with root package name */
        public final io.grpc.l f35901b;

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class a implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ tr.i0 f35903u;

            public a(tr.i0 i0Var) {
                this.f35903u = i0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                m mVar = m.this;
                mVar.getClass();
                Logger logger = q1.e0;
                Level level = Level.WARNING;
                q1 q1Var = q1.this;
                tr.i0 i0Var = this.f35903u;
                logger.log(level, "[{0}] Failed to resolve name. status={1}", new Object[]{q1Var.f35854b, i0Var});
                n nVar = q1Var.Q;
                if (nVar.f35907b.get() == q1.f35851k0) {
                    nVar.E(null);
                }
                if (q1Var.R != 3) {
                    q1Var.O.b(b.a.WARNING, "Failed to resolve name: {0}", i0Var);
                    q1Var.R = 3;
                }
                l lVar = q1Var.f35876x;
                l lVar2 = mVar.f35900a;
                if (lVar2 == lVar) {
                    lVar2.f35894a.f35717b.c(i0Var);
                    mVar.c();
                }
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class b implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l.e f35905u;

            public b(l.e eVar) {
                this.f35905u = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f2 f2Var;
                tr.i0 i0Var;
                f2 f2Var2;
                String str;
                boolean z10;
                int i6;
                Object obj;
                m mVar = m.this;
                q1 q1Var = q1.this;
                if (q1Var.f35874v != mVar.f35901b) {
                    return;
                }
                l.e eVar = this.f35905u;
                List<io.grpc.d> list = eVar.f20493a;
                b.a aVar = b.a.DEBUG;
                io.grpc.a aVar2 = eVar.f20494b;
                q1Var.O.b(aVar, "Resolved address: {0}, config={1}", list, aVar2);
                q1 q1Var2 = q1.this;
                int i10 = q1Var2.R;
                b.a aVar3 = b.a.INFO;
                if (i10 != 2) {
                    q1Var2.O.b(aVar3, "Address resolved: {0}", list);
                    q1Var2.R = 2;
                }
                q1Var2.f35855b0 = null;
                a.b<io.grpc.g> bVar = io.grpc.g.f20458a;
                io.grpc.g gVar = (io.grpc.g) aVar2.f20427a.get(bVar);
                l.b bVar2 = eVar.f20495c;
                if (bVar2 != null && (obj = bVar2.f20492b) != null) {
                    f2Var = (f2) obj;
                } else {
                    f2Var = null;
                }
                if (bVar2 != null) {
                    i0Var = bVar2.f20491a;
                } else {
                    i0Var = null;
                }
                if (!q1Var2.U) {
                    if (f2Var != null) {
                        q1Var2.O.a(aVar3, "Service config from name resolver discarded by channel settings");
                    }
                    q1Var2.getClass();
                    f2Var2 = q1.f35850j0;
                    if (gVar != null) {
                        q1Var2.O.a(aVar3, "Config selector from name resolver discarded by channel settings");
                    }
                    q1Var2.Q.E(f2Var2.b());
                } else {
                    if (f2Var != null) {
                        n nVar = q1Var2.Q;
                        if (gVar != null) {
                            nVar.E(gVar);
                            if (f2Var.b() != null) {
                                q1Var2.O.a(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            nVar.E(f2Var.b());
                        }
                    } else if (i0Var != null) {
                        if (!q1Var2.T) {
                            q1Var2.O.a(aVar3, "Fallback to error due to invalid first service config without default config");
                            mVar.a(bVar2.f20491a);
                            return;
                        }
                        f2Var = q1Var2.S;
                    } else {
                        f2Var = q1.f35850j0;
                        q1Var2.Q.E(null);
                    }
                    if (!f2Var.equals(q1Var2.S)) {
                        vr.n nVar2 = q1Var2.O;
                        Object[] objArr = new Object[1];
                        if (f2Var == q1.f35850j0) {
                            str = " to empty";
                        } else {
                            str = "";
                        }
                        objArr[0] = str;
                        nVar2.b(aVar3, "Service config changed{0}", objArr);
                        q1Var2.S = f2Var;
                    }
                    try {
                        q1Var2.T = true;
                    } catch (RuntimeException e10) {
                        q1.e0.log(Level.WARNING, "[" + q1Var2.f35854b + "] Unexpected exception from parsing service config", (Throwable) e10);
                    }
                    f2Var2 = f2Var;
                }
                l lVar = q1Var2.f35876x;
                l lVar2 = mVar.f35900a;
                if (lVar2 == lVar) {
                    aVar2.getClass();
                    a.C0307a c0307a = new a.C0307a(aVar2);
                    c0307a.b(bVar);
                    Map<String, ?> map = f2Var2.f;
                    if (map != null) {
                        c0307a.c(io.grpc.h.f20462b, map);
                        c0307a.a();
                    }
                    io.grpc.a a10 = c0307a.a();
                    j.a aVar4 = lVar2.f35894a;
                    io.grpc.a aVar5 = io.grpc.a.f20426b;
                    sc.b.w(list, "addresses");
                    List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
                    sc.b.w(a10, "attributes");
                    aVar4.getClass();
                    b3.b bVar3 = (b3.b) f2Var2.f35608e;
                    h.c cVar = aVar4.f35716a;
                    if (bVar3 == null) {
                        try {
                            vr.j jVar = vr.j.this;
                            bVar3 = new b3.b(vr.j.a(jVar, jVar.f35715b), null);
                        } catch (j.e e11) {
                            cVar.f(tr.j.TRANSIENT_FAILURE, new j.c(tr.i0.f33487l.g(e11.getMessage())));
                            aVar4.f35717b.f();
                            aVar4.f35718c = null;
                            aVar4.f35717b = new j.d();
                            z10 = true;
                        }
                    }
                    io.grpc.i iVar = aVar4.f35718c;
                    io.grpc.i iVar2 = bVar3.f35407a;
                    if (iVar != null && iVar2.b().equals(aVar4.f35718c.b())) {
                        i6 = 1;
                    } else {
                        cVar.f(tr.j.CONNECTING, new j.b());
                        aVar4.f35717b.f();
                        aVar4.f35718c = iVar2;
                        io.grpc.h hVar = aVar4.f35717b;
                        aVar4.f35717b = iVar2.a(cVar);
                        i6 = 1;
                        cVar.b().b(aVar3, "Load balancer changed from {0} to {1}", hVar.getClass().getSimpleName(), aVar4.f35717b.getClass().getSimpleName());
                    }
                    Object obj2 = bVar3.f35408b;
                    if (obj2 != null) {
                        tr.b b10 = cVar.b();
                        Object[] objArr2 = new Object[i6];
                        objArr2[0] = obj2;
                        b10.b(aVar, "Load-balancing config: {0}", objArr2);
                    }
                    z10 = aVar4.f35717b.a(new h.f(unmodifiableList, a10, obj2));
                    if (!z10) {
                        mVar.c();
                    }
                }
            }
        }

        public m(l lVar, io.grpc.l lVar2) {
            this.f35900a = lVar;
            sc.b.w(lVar2, "resolver");
            this.f35901b = lVar2;
        }

        @Override // io.grpc.l.d
        public final void a(tr.i0 i0Var) {
            sc.b.s("the error status must not be OK", !i0Var.e());
            q1.this.f35867n.execute(new a(i0Var));
        }

        @Override // io.grpc.l.d
        public final void b(l.e eVar) {
            q1.this.f35867n.execute(new b(eVar));
        }

        public final void c() {
            boolean z10;
            q1 q1Var = q1.this;
            l0.b bVar = q1Var.f35853a0;
            if (bVar != null) {
                l0.a aVar = bVar.f33525a;
                if (!aVar.f33524w && !aVar.f33523v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
            }
            if (q1Var.f35855b0 == null) {
                ((j0.a) q1Var.f35872t).getClass();
                q1Var.f35855b0 = new j0();
            }
            long a10 = ((j0) q1Var.f35855b0).a();
            q1Var.O.b(b.a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a10));
            q1Var.f35853a0 = q1Var.f35867n.c(q1Var.f35860g.u0(), new g(), a10, TimeUnit.NANOSECONDS);
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public static final class o implements ScheduledExecutorService {

        /* renamed from: u  reason: collision with root package name */
        public final ScheduledExecutorService f35922u;

        public o(ScheduledExecutorService scheduledExecutorService) {
            sc.b.w(scheduledExecutorService, "delegate");
            this.f35922u = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f35922u.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f35922u.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f35922u.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.f35922u.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f35922u.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f35922u.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            return this.f35922u.schedule(callable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f35922u.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f35922u.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Callable<T> callable) {
            return this.f35922u.submit(callable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return this.f35922u.invokeAll(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return (T) this.f35922u.invokeAny(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f35922u.schedule(runnable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future<?> submit(Runnable runnable) {
            return this.f35922u.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Runnable runnable, T t3) {
            return this.f35922u.submit(runnable, t3);
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class p extends vr.f {

        /* renamed from: a  reason: collision with root package name */
        public final h.a f35923a;

        /* renamed from: b  reason: collision with root package name */
        public final tr.w f35924b;

        /* renamed from: c  reason: collision with root package name */
        public final vr.n f35925c;

        /* renamed from: d  reason: collision with root package name */
        public final vr.o f35926d;

        /* renamed from: e  reason: collision with root package name */
        public List<io.grpc.d> f35927e;
        public c1 f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f35928g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f35929h;

        /* renamed from: i  reason: collision with root package name */
        public l0.b f35930i;

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class a extends c1.c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ h.i f35932a;

            public a(h.i iVar) {
                this.f35932a = iVar;
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                c1 c1Var = p.this.f;
                tr.i0 i0Var = q1.f35849i0;
                c1Var.getClass();
                c1Var.f35448k.execute(new g1(c1Var, i0Var));
            }
        }

        public p(h.a aVar, l lVar) {
            List<io.grpc.d> list = aVar.f20464a;
            this.f35927e = list;
            q1.this.getClass();
            this.f35923a = aVar;
            sc.b.w(lVar, "helper");
            tr.w wVar = new tr.w(tr.w.f33586d.incrementAndGet(), "Subchannel", q1.this.i());
            this.f35924b = wVar;
            j3 j3Var = q1.this.f35866m;
            long a10 = j3Var.a();
            vr.o oVar = new vr.o(wVar, 0, a10, "Subchannel for " + list);
            this.f35926d = oVar;
            this.f35925c = new vr.n(oVar, j3Var);
        }

        @Override // io.grpc.h.g
        public final List<io.grpc.d> b() {
            q1.this.f35867n.d();
            sc.b.B("not started", this.f35928g);
            return this.f35927e;
        }

        @Override // io.grpc.h.g
        public final io.grpc.a c() {
            return this.f35923a.f20465b;
        }

        @Override // io.grpc.h.g
        public final Object d() {
            sc.b.B("Subchannel is not started", this.f35928g);
            return this.f;
        }

        @Override // io.grpc.h.g
        public final void e() {
            q1.this.f35867n.d();
            sc.b.B("not started", this.f35928g);
            this.f.a();
        }

        @Override // io.grpc.h.g
        public final void f() {
            l0.b bVar;
            q1 q1Var = q1.this;
            q1Var.f35867n.d();
            if (this.f == null) {
                this.f35929h = true;
                return;
            }
            if (this.f35929h) {
                if (q1Var.I && (bVar = this.f35930i) != null) {
                    bVar.a();
                    this.f35930i = null;
                } else {
                    return;
                }
            } else {
                this.f35929h = true;
            }
            if (!q1Var.I) {
                this.f35930i = q1Var.f35867n.c(q1Var.f35860g.u0(), new o1(new b()), 5L, TimeUnit.SECONDS);
                return;
            }
            c1 c1Var = this.f;
            tr.i0 i0Var = q1.f35848h0;
            c1Var.getClass();
            c1Var.f35448k.execute(new g1(c1Var, i0Var));
        }

        @Override // io.grpc.h.g
        public final void g(h.i iVar) {
            q1 q1Var = q1.this;
            q1Var.f35867n.d();
            sc.b.B("already started", !this.f35928g);
            sc.b.B("already shutdown", !this.f35929h);
            sc.b.B("Channel is being terminated", !q1Var.I);
            this.f35928g = true;
            List<io.grpc.d> list = this.f35923a.f20464a;
            String i6 = q1Var.i();
            k.a aVar = q1Var.f35872t;
            vr.l lVar = q1Var.f35860g;
            c1 c1Var = new c1(list, i6, aVar, lVar, lVar.u0(), q1Var.f35870q, q1Var.f35867n, new a(iVar), q1Var.P, new vr.m(q1Var.L.f35951a), this.f35926d, this.f35924b, this.f35925c);
            t.a aVar2 = t.a.CT_INFO;
            Long valueOf = Long.valueOf(q1Var.f35866m.a());
            sc.b.w(valueOf, "timestampNanos");
            q1Var.N.b(new tr.t("Child Subchannel started", aVar2, valueOf.longValue(), c1Var));
            this.f = c1Var;
            tr.u.a(q1Var.P.f33584b, c1Var);
            q1Var.A.add(c1Var);
        }

        @Override // io.grpc.h.g
        public final void h(List<io.grpc.d> list) {
            q1.this.f35867n.d();
            this.f35927e = list;
            c1 c1Var = this.f;
            c1Var.getClass();
            sc.b.w(list, "newAddressGroups");
            for (io.grpc.d dVar : list) {
                sc.b.w(dVar, "newAddressGroups contains null entry");
            }
            sc.b.s("newAddressGroups is empty", !list.isEmpty());
            c1Var.f35448k.execute(new f1(c1Var, Collections.unmodifiableList(new ArrayList(list))));
        }

        public final String toString() {
            return this.f35924b.toString();
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class q {

        /* renamed from: a  reason: collision with root package name */
        public final Object f35935a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public HashSet f35936b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public tr.i0 f35937c;

        public q() {
        }

        public final void a(tr.i0 i0Var) {
            synchronized (this.f35935a) {
                if (this.f35937c != null) {
                    return;
                }
                this.f35937c = i0Var;
                boolean isEmpty = this.f35936b.isEmpty();
                if (isEmpty) {
                    q1.this.E.h(i0Var);
                }
            }
        }
    }

    static {
        tr.i0 i0Var = tr.i0.f33488m;
        f35847g0 = i0Var.g("Channel shutdownNow invoked");
        f35848h0 = i0Var.g("Channel shutdown invoked");
        f35849i0 = i0Var.g("Subchannel shutdown invoked");
        f35850j0 = new f2(null, new HashMap(), new HashMap(), null, null, null);
        f35851k0 = new a();
        f35852l0 = new d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [tr.e$b] */
    public q1(d2 d2Var, u uVar, j0.a aVar, e3 e3Var, u0.d dVar, ArrayList arrayList) {
        boolean z10;
        j3.a aVar2 = j3.f35738a;
        tr.l0 l0Var = new tr.l0(new c());
        this.f35867n = l0Var;
        this.f35871s = new x();
        this.A = new HashSet(16, 0.75f);
        this.C = new Object();
        this.D = new HashSet(1, 0.75f);
        this.F = new q();
        this.G = new AtomicBoolean(false);
        this.K = new CountDownLatch(1);
        this.R = 1;
        this.S = f35850j0;
        this.T = false;
        this.V = new v2.s();
        h hVar = new h();
        this.Z = new j();
        this.c0 = new e();
        String str = d2Var.f35499e;
        sc.b.w(str, "target");
        this.f35856c = str;
        tr.w wVar = new tr.w(tr.w.f33586d.incrementAndGet(), "Channel", str);
        this.f35854b = wVar;
        this.f35866m = aVar2;
        e3 e3Var2 = d2Var.f35495a;
        sc.b.w(e3Var2, "executorPool");
        this.f35863j = e3Var2;
        Executor executor = (Executor) e3Var2.b();
        sc.b.w(executor, "executor");
        this.f35862i = executor;
        e3 e3Var3 = d2Var.f35496b;
        sc.b.w(e3Var3, "offloadExecutorPool");
        i iVar = new i(e3Var3);
        this.f35865l = iVar;
        vr.l lVar = new vr.l(uVar, d2Var.f, iVar);
        this.f35860g = lVar;
        o oVar = new o(lVar.u0());
        this.f35861h = oVar;
        vr.o oVar2 = new vr.o(wVar, 0, aVar2.a(), defpackage.b.m("Channel for '", str, "'"));
        this.N = oVar2;
        vr.n nVar = new vr.n(oVar2, aVar2);
        this.O = nVar;
        q2 q2Var = u0.f35984m;
        boolean z11 = d2Var.f35508o;
        this.Y = z11;
        vr.j jVar = new vr.j(d2Var.f35500g);
        this.f = jVar;
        y2 y2Var = new y2(z11, d2Var.f35504k, d2Var.f35505l, jVar);
        Integer valueOf = Integer.valueOf(d2Var.f35516x.a());
        q2Var.getClass();
        l.a aVar3 = new l.a(valueOf, q2Var, l0Var, y2Var, oVar, nVar, iVar, null);
        this.f35859e = aVar3;
        n.a aVar4 = d2Var.f35498d;
        this.f35857d = aVar4;
        this.f35874v = M(str, aVar4, aVar3);
        this.f35864k = new i(e3Var);
        e0 e0Var = new e0(executor, l0Var);
        this.E = e0Var;
        e0Var.e(hVar);
        this.f35872t = aVar;
        this.U = d2Var.f35510q;
        n nVar2 = new n(this.f35874v.a());
        this.Q = nVar2;
        int i6 = tr.e.f33462a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nVar2 = new e.b(nVar2, (tr.d) it.next());
        }
        this.f35873u = nVar2;
        sc.b.w(dVar, "stopwatchSupplier");
        this.f35870q = dVar;
        long j10 = d2Var.f35503j;
        if (j10 == -1) {
            this.r = j10;
        } else {
            if (j10 >= d2.A) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.o("invalid idleTimeoutMillis %s", j10, z10);
            this.r = j10;
        }
        this.f35858d0 = new u2(new k(), this.f35867n, this.f35860g.u0(), new nc.l());
        tr.o oVar3 = d2Var.f35501h;
        sc.b.w(oVar3, "decompressorRegistry");
        this.f35868o = oVar3;
        tr.i iVar2 = d2Var.f35502i;
        sc.b.w(iVar2, "compressorRegistry");
        this.f35869p = iVar2;
        this.X = d2Var.f35506m;
        this.W = d2Var.f35507n;
        this.L = new s1();
        this.M = new vr.m(aVar2);
        tr.u uVar2 = d2Var.f35509p;
        uVar2.getClass();
        this.P = uVar2;
        tr.u.a(uVar2.f33583a, this);
        if (!this.U) {
            this.T = true;
        }
    }

    public static void H(q1 q1Var) {
        boolean z10 = true;
        q1Var.O(true);
        e0 e0Var = q1Var.E;
        e0Var.i(null);
        q1Var.O.a(b.a.INFO, "Entering IDLE state");
        q1Var.f35871s.a(tr.j.IDLE);
        Object[] objArr = {q1Var.C, e0Var};
        j jVar = q1Var.Z;
        jVar.getClass();
        int i6 = 0;
        while (true) {
            if (i6 < 2) {
                if (((Set) jVar.f16181b).contains(objArr[i6])) {
                    break;
                }
                i6++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            q1Var.L();
        }
    }

    public static void I(q1 q1Var) {
        if (q1Var.H) {
            Iterator it = q1Var.A.iterator();
            while (it.hasNext()) {
                c1 c1Var = (c1) it.next();
                c1Var.getClass();
                tr.i0 i0Var = f35847g0;
                g1 g1Var = new g1(c1Var, i0Var);
                tr.l0 l0Var = c1Var.f35448k;
                l0Var.execute(g1Var);
                l0Var.execute(new j1(c1Var, i0Var));
            }
            Iterator it2 = q1Var.D.iterator();
            if (it2.hasNext()) {
                ((m2) it2.next()).getClass();
                throw null;
            }
        }
    }

    public static void J(q1 q1Var) {
        if (!q1Var.J && q1Var.G.get() && q1Var.A.isEmpty() && q1Var.D.isEmpty()) {
            q1Var.O.a(b.a.INFO, "Terminated");
            tr.u.b(q1Var.P.f33583a, q1Var);
            q1Var.f35863j.a(q1Var.f35862i);
            i iVar = q1Var.f35864k;
            synchronized (iVar) {
                Executor executor = iVar.f35891v;
                if (executor != null) {
                    iVar.f35890u.a(executor);
                    iVar.f35891v = null;
                }
            }
            q1Var.f35865l.a();
            q1Var.f35860g.close();
            q1Var.J = true;
            q1Var.K.countDown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r3 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static io.grpc.l M(String str, n.a aVar, l.a aVar2) {
        URI uri;
        io.grpc.l b10;
        StringBuilder sb2 = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e10) {
            sb2.append(e10.getMessage());
            uri = null;
        }
        if (uri == null || (b10 = aVar.b(uri, aVar2)) == null) {
            String str2 = "";
            if (!f35846f0.matcher(str).matches()) {
                try {
                    b10 = aVar.b(new URI(aVar.a(), "", "/" + str, null), aVar2);
                } catch (URISyntaxException e11) {
                    throw new IllegalArgumentException(e11);
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (sb2.length() > 0) {
                str2 = " (" + ((Object) sb2) + ")";
            }
            objArr[1] = str2;
            throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
        }
        return b10;
    }

    @Override // tr.b0
    public final void D() {
        this.f35867n.execute(new b());
    }

    @Override // tr.b0
    public final tr.j E() {
        tr.j jVar = this.f35871s.f36110b;
        if (jVar != null) {
            if (jVar == tr.j.IDLE) {
                this.f35867n.execute(new v1(this));
            }
            return jVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    @Override // tr.b0
    public final void F(tr.j jVar, ne.o oVar) {
        this.f35867n.execute(new t1(this, oVar, jVar));
    }

    @Override // tr.b0
    public final tr.b0 G() {
        b.a aVar = b.a.DEBUG;
        vr.n nVar = this.O;
        nVar.a(aVar, "shutdownNow() called");
        nVar.a(aVar, "shutdown() called");
        boolean compareAndSet = this.G.compareAndSet(false, true);
        n nVar2 = this.Q;
        tr.l0 l0Var = this.f35867n;
        if (compareAndSet) {
            l0Var.execute(new w1(this));
            q1.this.f35867n.execute(new b2(nVar2));
            l0Var.execute(new r1(this));
        }
        q1.this.f35867n.execute(new c2(nVar2));
        l0Var.execute(new x1(this));
        return this;
    }

    public final void K(boolean z10) {
        ScheduledFuture<?> scheduledFuture;
        u2 u2Var = this.f35858d0;
        u2Var.f = false;
        if (z10 && (scheduledFuture = u2Var.f36002g) != null) {
            scheduledFuture.cancel(false);
            u2Var.f36002g = null;
        }
    }

    public final void L() {
        this.f35867n.d();
        if (!this.G.get() && !this.f35878z) {
            if (!((Set) this.Z.f16181b).isEmpty()) {
                K(false);
            } else {
                N();
            }
            if (this.f35876x != null) {
                return;
            }
            this.O.a(b.a.INFO, "Exiting idle mode");
            l lVar = new l();
            vr.j jVar = this.f;
            jVar.getClass();
            lVar.f35894a = new j.a(lVar);
            this.f35876x = lVar;
            this.f35874v.d(new m(lVar, this.f35874v));
            this.f35875w = true;
        }
    }

    public final void N() {
        long j10 = this.r;
        if (j10 == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        u2 u2Var = this.f35858d0;
        u2Var.getClass();
        long nanos = timeUnit.toNanos(j10);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long a10 = u2Var.f36000d.a(timeUnit2) + nanos;
        u2Var.f = true;
        if (a10 - u2Var.f36001e < 0 || u2Var.f36002g == null) {
            ScheduledFuture<?> scheduledFuture = u2Var.f36002g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            u2Var.f36002g = u2Var.f35997a.schedule(new u2.b(), nanos, timeUnit2);
        }
        u2Var.f36001e = a10;
    }

    public final void O(boolean z10) {
        boolean z11;
        this.f35867n.d();
        if (z10) {
            sc.b.B("nameResolver is not started", this.f35875w);
            if (this.f35876x != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            sc.b.B("lbHelper is null", z11);
        }
        if (this.f35874v != null) {
            this.f35867n.d();
            l0.b bVar = this.f35853a0;
            if (bVar != null) {
                bVar.a();
                this.f35853a0 = null;
                this.f35855b0 = null;
            }
            this.f35874v.c();
            this.f35875w = false;
            if (z10) {
                this.f35874v = M(this.f35856c, this.f35857d, this.f35859e);
            } else {
                this.f35874v = null;
            }
        }
        l lVar = this.f35876x;
        if (lVar != null) {
            j.a aVar = lVar.f35894a;
            aVar.f35717b.f();
            aVar.f35717b = null;
            this.f35876x = null;
        }
        this.f35877y = null;
    }

    @Override // tr.v
    public final tr.w g() {
        return this.f35854b;
    }

    @Override // androidx.work.k
    public final String i() {
        return this.f35873u.i();
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.b(this.f35854b.f33589c, "logId");
        c10.c(this.f35856c, "target");
        return c10.toString();
    }

    @Override // androidx.work.k
    public final <ReqT, RespT> tr.c<ReqT, RespT> w(tr.d0<ReqT, RespT> d0Var, io.grpc.b bVar) {
        return this.f35873u.w(d0Var, bVar);
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class n extends androidx.work.k {

        /* renamed from: c  reason: collision with root package name */
        public final String f35908c;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReference<io.grpc.g> f35907b = new AtomicReference<>(q1.f35851k0);

        /* renamed from: d  reason: collision with root package name */
        public final a f35909d = new a();

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public class a extends androidx.work.k {
            public a() {
            }

            @Override // androidx.work.k
            public final String i() {
                return n.this.f35908c;
            }

            @Override // androidx.work.k
            public final <RequestT, ResponseT> tr.c<RequestT, ResponseT> w(tr.d0<RequestT, ResponseT> d0Var, io.grpc.b bVar) {
                Executor executor;
                ScheduledExecutorService u02;
                q1 q1Var = q1.this;
                Logger logger = q1.e0;
                q1Var.getClass();
                Executor executor2 = bVar.f20433b;
                if (executor2 == null) {
                    executor = q1Var.f35862i;
                } else {
                    executor = executor2;
                }
                q1 q1Var2 = q1.this;
                e eVar = q1Var2.c0;
                if (q1Var2.J) {
                    u02 = null;
                } else {
                    u02 = q1.this.f35860g.u0();
                }
                vr.p pVar = new vr.p(d0Var, executor, bVar, eVar, u02, q1.this.M);
                q1.this.getClass();
                pVar.f35825q = false;
                q1 q1Var3 = q1.this;
                pVar.r = q1Var3.f35868o;
                pVar.f35826s = q1Var3.f35869p;
                return pVar;
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                q1.this.L();
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public class d implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ e f35913u;

            public d(e eVar) {
                this.f35913u = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n nVar = n.this;
                io.grpc.g gVar = nVar.f35907b.get();
                a aVar = q1.f35851k0;
                e<?, ?> eVar = this.f35913u;
                if (gVar == aVar) {
                    q1 q1Var = q1.this;
                    if (q1Var.B == null) {
                        q1Var.B = new LinkedHashSet();
                        q1Var.Z.c(q1Var.C, true);
                    }
                    q1Var.B.add(eVar);
                    return;
                }
                eVar.j();
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class e<ReqT, RespT> extends c0<ReqT, RespT> {

            /* renamed from: k  reason: collision with root package name */
            public final tr.l f35915k;

            /* renamed from: l  reason: collision with root package name */
            public final tr.d0<ReqT, RespT> f35916l;

            /* renamed from: m  reason: collision with root package name */
            public final io.grpc.b f35917m;

            /* compiled from: ManagedChannelImpl.java */
            /* loaded from: classes2.dex */
            public class a implements Runnable {

                /* renamed from: u  reason: collision with root package name */
                public final /* synthetic */ Runnable f35919u;

                public a(a0 a0Var) {
                    this.f35919u = a0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f35919u.run();
                    e eVar = e.this;
                    q1.this.f35867n.execute(new b());
                }
            }

            /* compiled from: ManagedChannelImpl.java */
            /* loaded from: classes2.dex */
            public final class b implements Runnable {
                public b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    Collection<e<?, ?>> collection = q1.this.B;
                    if (collection != null) {
                        collection.remove(eVar);
                        n nVar = n.this;
                        if (q1.this.B.isEmpty()) {
                            q1 q1Var = q1.this;
                            q1Var.Z.c(q1Var.C, false);
                            q1 q1Var2 = q1.this;
                            q1Var2.B = null;
                            if (q1Var2.G.get()) {
                                q1.this.F.a(q1.f35848h0);
                            }
                        }
                    }
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public e(tr.l lVar, tr.d0<ReqT, RespT> d0Var, io.grpc.b bVar) {
                super(r1 == null ? r0.f35862i : r1, q1.this.f35861h, bVar.f20432a);
                q1 q1Var = q1.this;
                Logger logger = q1.e0;
                q1Var.getClass();
                Executor executor = bVar.f20433b;
                this.f35915k = lVar;
                this.f35916l = d0Var;
                this.f35917m = bVar;
            }

            @Override // vr.c0
            public final void f() {
                q1.this.f35867n.execute(new b());
            }

            public final void j() {
                boolean z10;
                a0 a0Var;
                tr.l a10 = this.f35915k.a();
                try {
                    tr.c<ReqT, RespT> D = n.this.D(this.f35916l, this.f35917m);
                    synchronized (this) {
                        try {
                            tr.c<ReqT, RespT> cVar = this.f;
                            if (cVar != null) {
                                a0Var = null;
                            } else {
                                if (cVar == null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                sc.b.z(cVar, "realCall already set to %s", z10);
                                ScheduledFuture<?> scheduledFuture = this.f35410a;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                }
                                this.f = D;
                                a0Var = new a0(this, this.f35412c);
                            }
                        } finally {
                        }
                    }
                    if (a0Var == null) {
                        q1.this.f35867n.execute(new b());
                        return;
                    }
                    q1 q1Var = q1.this;
                    io.grpc.b bVar = this.f35917m;
                    Logger logger = q1.e0;
                    q1Var.getClass();
                    Executor executor = bVar.f20433b;
                    if (executor == null) {
                        executor = q1Var.f35862i;
                    }
                    executor.execute(new a(a0Var));
                } finally {
                    this.f35915k.c(a10);
                }
            }
        }

        public n(String str) {
            sc.b.w(str, "authority");
            this.f35908c = str;
        }

        public final <ReqT, RespT> tr.c<ReqT, RespT> D(tr.d0<ReqT, RespT> d0Var, io.grpc.b bVar) {
            io.grpc.g gVar = this.f35907b.get();
            a aVar = this.f35909d;
            if (gVar == null) {
                return aVar.w(d0Var, bVar);
            }
            if (gVar instanceof f2.b) {
                f2 f2Var = ((f2.b) gVar).f35615b;
                f2Var.getClass();
                f2.a aVar2 = f2Var.f35605b.get(d0Var.f33451b);
                if (aVar2 == null) {
                    aVar2 = f2Var.f35606c.get(d0Var.f33452c);
                }
                if (aVar2 == null) {
                    aVar2 = f2Var.f35604a;
                }
                if (aVar2 != null) {
                    bVar = bVar.c(f2.a.f35609g, aVar2);
                }
                return aVar.w(d0Var, bVar);
            }
            return new f(gVar, aVar, q1.this.f35862i, d0Var, bVar);
        }

        public final void E(io.grpc.g gVar) {
            Collection<e<?, ?>> collection;
            AtomicReference<io.grpc.g> atomicReference = this.f35907b;
            io.grpc.g gVar2 = atomicReference.get();
            atomicReference.set(gVar);
            if (gVar2 == q1.f35851k0 && (collection = q1.this.B) != null) {
                for (e<?, ?> eVar : collection) {
                    eVar.j();
                }
            }
        }

        @Override // androidx.work.k
        public final String i() {
            return this.f35908c;
        }

        @Override // androidx.work.k
        public final <ReqT, RespT> tr.c<ReqT, RespT> w(tr.d0<ReqT, RespT> d0Var, io.grpc.b bVar) {
            AtomicReference<io.grpc.g> atomicReference = this.f35907b;
            io.grpc.g gVar = atomicReference.get();
            a aVar = q1.f35851k0;
            if (gVar != aVar) {
                return D(d0Var, bVar);
            }
            q1 q1Var = q1.this;
            q1Var.f35867n.execute(new b());
            if (atomicReference.get() != aVar) {
                return D(d0Var, bVar);
            }
            if (q1Var.G.get()) {
                return new c();
            }
            e eVar = new e(tr.l.b(), d0Var, bVar);
            q1Var.f35867n.execute(new d(eVar));
            return eVar;
        }

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public class c extends tr.c<ReqT, RespT> {
            @Override // tr.c
            public final void e(c.a<RespT> aVar, tr.c0 c0Var) {
                aVar.a(new tr.c0(), q1.f35848h0);
            }

            @Override // tr.c
            public final void b() {
            }

            @Override // tr.c
            public final void c(int i6) {
            }

            @Override // tr.c
            public final void d(ReqT reqt) {
            }

            @Override // tr.c
            public final void a(String str, Throwable th2) {
            }
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class d extends tr.c<Object, Object> {
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

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class h implements g2.a {
        public h() {
        }

        @Override // vr.g2.a
        public final void b() {
            q1 q1Var = q1.this;
            sc.b.B("Channel must have been shut down", q1Var.G.get());
            q1Var.I = true;
            q1Var.O(false);
            q1.I(q1Var);
            q1.J(q1Var);
        }

        @Override // vr.g2.a
        public final void c(tr.i0 i0Var) {
            sc.b.B("Channel must have been shut down", q1.this.G.get());
        }

        @Override // vr.g2.a
        public final void d(boolean z10) {
            q1 q1Var = q1.this;
            q1Var.Z.c(q1Var.E, z10);
        }

        @Override // vr.g2.a
        public final void a() {
        }
    }
}
