package vr;

import io.grpc.b;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import nc.f;
import tr.c;
import tr.c0;
import tr.d0;
import tr.f;
import tr.i0;
import tr.m;
import vr.f2;
import vr.i3;
import vr.q1;
import vr.s;
import vr.v2;
/* compiled from: ClientCallImpl.java */
/* loaded from: classes2.dex */
public final class p<ReqT, RespT> extends tr.c<ReqT, RespT> {

    /* renamed from: t  reason: collision with root package name */
    public static final Logger f35807t = Logger.getLogger(p.class.getName());

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f35808u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* renamed from: v  reason: collision with root package name */
    public static final double f35809v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* renamed from: a  reason: collision with root package name */
    public final tr.d0<ReqT, RespT> f35810a;

    /* renamed from: b  reason: collision with root package name */
    public final fs.c f35811b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f35812c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f35813d;

    /* renamed from: e  reason: collision with root package name */
    public final m f35814e;
    public final tr.l f;

    /* renamed from: g  reason: collision with root package name */
    public volatile ScheduledFuture<?> f35815g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f35816h;

    /* renamed from: i  reason: collision with root package name */
    public io.grpc.b f35817i;

    /* renamed from: j  reason: collision with root package name */
    public r f35818j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f35819k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f35820l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f35821m;

    /* renamed from: n  reason: collision with root package name */
    public final c f35822n;

    /* renamed from: p  reason: collision with root package name */
    public final ScheduledExecutorService f35824p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f35825q;

    /* renamed from: o  reason: collision with root package name */
    public final p<ReqT, RespT>.d f35823o = new d(this);
    public tr.o r = tr.o.f33539d;

    /* renamed from: s  reason: collision with root package name */
    public tr.i f35826s = tr.i.f33478b;

    /* compiled from: ClientCallImpl.java */
    /* loaded from: classes2.dex */
    public class a extends y {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ c.a f35827v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f35828w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c.a aVar, String str) {
            super(p.this.f);
            this.f35827v = aVar;
            this.f35828w = str;
        }

        @Override // vr.y
        public final void a() {
            tr.i0 g5 = tr.i0.f33487l.g(String.format("Unable to find compressor by name %s", this.f35828w));
            tr.c0 c0Var = new tr.c0();
            p.this.getClass();
            this.f35827v.a(c0Var, g5);
        }
    }

    /* compiled from: ClientCallImpl.java */
    /* loaded from: classes2.dex */
    public class b implements s {

        /* renamed from: a  reason: collision with root package name */
        public final c.a<RespT> f35830a;

        /* renamed from: b  reason: collision with root package name */
        public tr.i0 f35831b;

        /* compiled from: ClientCallImpl.java */
        /* loaded from: classes2.dex */
        public final class a extends y {

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ tr.c0 f35833v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(tr.c0 c0Var) {
                super(p.this.f);
                this.f35833v = c0Var;
            }

            @Override // vr.y
            public final void a() {
                b bVar = b.this;
                p pVar = p.this;
                p pVar2 = p.this;
                fs.c cVar = pVar.f35811b;
                fs.b.b();
                fs.b.f15847a.getClass();
                try {
                    if (bVar.f35831b == null) {
                        bVar.f35830a.b(this.f35833v);
                    }
                } finally {
                    fs.c cVar2 = pVar2.f35811b;
                    fs.b.d();
                }
            }
        }

        /* compiled from: ClientCallImpl.java */
        /* renamed from: vr.p$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0606b extends y {

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ i3.a f35835v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0606b(i3.a aVar) {
                super(p.this.f);
                this.f35835v = aVar;
            }

            @Override // vr.y
            public final void a() {
                b bVar = b.this;
                p pVar = p.this;
                p pVar2 = p.this;
                fs.c cVar = pVar.f35811b;
                fs.b.b();
                fs.b.f15847a.getClass();
                try {
                    b();
                } finally {
                    fs.c cVar2 = pVar2.f35811b;
                    fs.b.d();
                }
            }

            public final void b() {
                b bVar = b.this;
                tr.i0 i0Var = bVar.f35831b;
                p pVar = p.this;
                i3.a aVar = this.f35835v;
                if (i0Var != null) {
                    Logger logger = u0.f35973a;
                    while (true) {
                        InputStream next = aVar.next();
                        if (next != null) {
                            u0.b(next);
                        } else {
                            return;
                        }
                    }
                } else {
                    while (true) {
                        try {
                            InputStream next2 = aVar.next();
                            if (next2 != null) {
                                bVar.f35830a.c(pVar.f35810a.f33454e.a(next2));
                                next2.close();
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            Logger logger2 = u0.f35973a;
                            while (true) {
                                InputStream next3 = aVar.next();
                                if (next3 != null) {
                                    u0.b(next3);
                                } else {
                                    tr.i0 g5 = tr.i0.f.f(th2).g("Failed to read message.");
                                    bVar.f35831b = g5;
                                    pVar.f35818j.o(g5);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

        /* compiled from: ClientCallImpl.java */
        /* loaded from: classes2.dex */
        public final class c extends y {
            public c() {
                super(p.this.f);
            }

            @Override // vr.y
            public final void a() {
                b bVar = b.this;
                p pVar = p.this;
                p pVar2 = p.this;
                fs.c cVar = pVar.f35811b;
                fs.b.b();
                fs.b.f15847a.getClass();
                try {
                    if (bVar.f35831b == null) {
                        bVar.f35830a.d();
                    }
                } finally {
                    fs.c cVar2 = pVar2.f35811b;
                    fs.b.d();
                }
            }
        }

        public b(c.a<RespT> aVar) {
            sc.b.w(aVar, "observer");
            this.f35830a = aVar;
        }

        @Override // vr.i3
        public final void a(i3.a aVar) {
            p pVar = p.this;
            fs.c cVar = pVar.f35811b;
            fs.b.b();
            fs.b.a();
            try {
                pVar.f35812c.execute(new C0606b(aVar));
            } finally {
                fs.b.d();
            }
        }

        @Override // vr.s
        public final void b(tr.i0 i0Var, s.a aVar, tr.c0 c0Var) {
            fs.c cVar = p.this.f35811b;
            fs.b.b();
            try {
                d(i0Var, c0Var);
            } finally {
                fs.b.d();
            }
        }

        @Override // vr.s
        public final void c(tr.c0 c0Var) {
            p pVar = p.this;
            fs.c cVar = pVar.f35811b;
            fs.b.b();
            fs.b.a();
            try {
                pVar.f35812c.execute(new a(c0Var));
            } finally {
                fs.b.d();
            }
        }

        public final void d(tr.i0 i0Var, tr.c0 c0Var) {
            p pVar = p.this;
            tr.m mVar = pVar.f35817i.f20432a;
            pVar.f.getClass();
            if (mVar == null) {
                mVar = null;
            }
            if (i0Var.f33491a == i0.a.CANCELLED && mVar != null && mVar.f()) {
                b1 b1Var = new b1();
                pVar.f35818j.j(b1Var);
                tr.i0 i0Var2 = tr.i0.f33483h;
                i0Var = i0Var2.a("ClientCall was cancelled at or after deadline. " + b1Var);
                c0Var = new tr.c0();
            }
            fs.b.a();
            pVar.f35812c.execute(new q(this, i0Var, c0Var));
        }

        @Override // vr.i3
        public final void onReady() {
            boolean z10;
            p pVar = p.this;
            d0.b bVar = pVar.f35810a.f33450a;
            bVar.getClass();
            if (bVar != d0.b.UNARY && bVar != d0.b.SERVER_STREAMING) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return;
            }
            fs.b.b();
            fs.b.a();
            try {
                pVar.f35812c.execute(new c());
            } finally {
                fs.b.d();
            }
        }
    }

    /* compiled from: ClientCallImpl.java */
    /* loaded from: classes2.dex */
    public interface c {
    }

    /* compiled from: ClientCallImpl.java */
    /* loaded from: classes2.dex */
    public final class d {
        public d(p pVar) {
        }
    }

    /* compiled from: ClientCallImpl.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final long f35838u;

        public e(long j10) {
            this.f35838u = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b1 b1Var = new b1();
            p pVar = p.this;
            pVar.f35818j.j(b1Var);
            long j10 = this.f35838u;
            long abs = Math.abs(j10);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1L);
            long abs2 = Math.abs(j10) % timeUnit.toNanos(1L);
            StringBuilder sb2 = new StringBuilder("deadline exceeded after ");
            if (j10 < 0) {
                sb2.append('-');
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb2.append("s. ");
            sb2.append(b1Var);
            pVar.f35818j.o(tr.i0.f33483h.a(sb2.toString()));
        }
    }

    public p(tr.d0 d0Var, Executor executor, io.grpc.b bVar, q1.e eVar, ScheduledExecutorService scheduledExecutorService, m mVar) {
        this.f35810a = d0Var;
        String str = d0Var.f33451b;
        System.identityHashCode(this);
        fs.a aVar = fs.b.f15847a;
        aVar.getClass();
        this.f35811b = fs.a.f15845a;
        boolean z10 = true;
        if (executor == rc.a.f30653u) {
            this.f35812c = new z2();
            this.f35813d = true;
        } else {
            this.f35812c = new a3(executor);
            this.f35813d = false;
        }
        this.f35814e = mVar;
        this.f = tr.l.b();
        d0.b bVar2 = d0.b.UNARY;
        d0.b bVar3 = d0Var.f33450a;
        if (bVar3 != bVar2 && bVar3 != d0.b.SERVER_STREAMING) {
            z10 = false;
        }
        this.f35816h = z10;
        this.f35817i = bVar;
        this.f35822n = eVar;
        this.f35824p = scheduledExecutorService;
        aVar.getClass();
    }

    @Override // tr.c
    public final void a(String str, Throwable th2) {
        fs.b.b();
        try {
            f(str, th2);
        } finally {
            fs.b.d();
        }
    }

    @Override // tr.c
    public final void b() {
        boolean z10;
        fs.b.b();
        try {
            if (this.f35818j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.B("Not started", z10);
            sc.b.B("call was cancelled", !this.f35820l);
            sc.b.B("call already half-closed", !this.f35821m);
            this.f35821m = true;
            this.f35818j.m();
        } finally {
            fs.b.d();
        }
    }

    @Override // tr.c
    public final void c(int i6) {
        boolean z10;
        fs.b.b();
        try {
            boolean z11 = false;
            if (this.f35818j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.B("Not started", z10);
            if (i6 >= 0) {
                z11 = true;
            }
            sc.b.s("Number requested must be non-negative", z11);
            this.f35818j.e(i6);
        } finally {
            fs.b.d();
        }
    }

    @Override // tr.c
    public final void d(ReqT reqt) {
        fs.b.b();
        try {
            h(reqt);
        } finally {
            fs.b.d();
        }
    }

    @Override // tr.c
    public final void e(c.a<RespT> aVar, tr.c0 c0Var) {
        fs.b.b();
        try {
            i(aVar, c0Var);
        } finally {
            fs.b.d();
        }
    }

    public final void f(String str, Throwable th2) {
        tr.i0 g5;
        if (str == null && th2 == null) {
            th2 = new CancellationException("Cancelled without a message or cause");
            f35807t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th2);
        }
        if (this.f35820l) {
            return;
        }
        this.f35820l = true;
        try {
            if (this.f35818j != null) {
                tr.i0 i0Var = tr.i0.f;
                if (str != null) {
                    g5 = i0Var.g(str);
                } else {
                    g5 = i0Var.g("Call cancelled without message");
                }
                if (th2 != null) {
                    g5 = g5.f(th2);
                }
                this.f35818j.o(g5);
            }
        } finally {
            g();
        }
    }

    public final void g() {
        this.f.getClass();
        ScheduledFuture<?> scheduledFuture = this.f35815g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void h(ReqT reqt) {
        boolean z10;
        if (this.f35818j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("Not started", z10);
        sc.b.B("call was cancelled", !this.f35820l);
        sc.b.B("call was half-closed", !this.f35821m);
        try {
            r rVar = this.f35818j;
            if (rVar instanceof v2) {
                ((v2) rVar).A(reqt);
            } else {
                rVar.b(this.f35810a.f33453d.b(reqt));
            }
            if (!this.f35816h) {
                this.f35818j.flush();
            }
        } catch (Error e10) {
            this.f35818j.o(tr.i0.f.g("Client sendMessage() failed with Error"));
            throw e10;
        } catch (RuntimeException e11) {
            this.f35818j.o(tr.i0.f.f(e11).g("Failed to stream message"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r9 < 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [tr.h] */
    /* JADX WARN: Type inference failed for: r18v0, types: [tr.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v9, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(c.a<RespT> aVar, tr.c0 c0Var) {
        boolean z10;
        f.b bVar;
        tr.m mVar;
        boolean z11;
        boolean z12;
        String str;
        x2 x2Var;
        w0 w0Var;
        r z1Var;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        io.grpc.b bVar2;
        char c10;
        if (this.f35818j == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("Already started", z10);
        sc.b.B("call was cancelled", !this.f35820l);
        sc.b.w(aVar, "observer");
        sc.b.w(c0Var, "headers");
        this.f.getClass();
        io.grpc.b bVar3 = this.f35817i;
        b.C0308b<f2.a> c0308b = f2.a.f35609g;
        f2.a aVar2 = (f2.a) bVar3.a(c0308b);
        if (aVar2 != null) {
            Long l2 = aVar2.f35610a;
            if (l2 != null) {
                long longValue = l2.longValue();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                m.a aVar3 = tr.m.f33527x;
                if (timeUnit != null) {
                    tr.m mVar2 = new tr.m(timeUnit.toNanos(longValue));
                    tr.m mVar3 = this.f35817i.f20432a;
                    if (mVar3 != null) {
                        mVar2.d(mVar3);
                        int i6 = ((mVar2.f33531v - mVar3.f33531v) > 0L ? 1 : ((mVar2.f33531v - mVar3.f33531v) == 0L ? 0 : -1));
                        if (i6 < 0) {
                            c10 = 65535;
                        } else if (i6 > 0) {
                            c10 = 1;
                        } else {
                            c10 = 0;
                        }
                    }
                    io.grpc.b bVar4 = this.f35817i;
                    bVar4.getClass();
                    b.a b10 = io.grpc.b.b(bVar4);
                    b10.f20441a = mVar2;
                    this.f35817i = new io.grpc.b(b10);
                } else {
                    throw new NullPointerException("units");
                }
            }
            Boolean bool = aVar2.f35611b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    io.grpc.b bVar5 = this.f35817i;
                    bVar5.getClass();
                    b.a b11 = io.grpc.b.b(bVar5);
                    b11.f20447h = Boolean.TRUE;
                    bVar2 = new io.grpc.b(b11);
                } else {
                    io.grpc.b bVar6 = this.f35817i;
                    bVar6.getClass();
                    b.a b12 = io.grpc.b.b(bVar6);
                    b12.f20447h = Boolean.FALSE;
                    bVar2 = new io.grpc.b(b12);
                }
                this.f35817i = bVar2;
            }
            Integer num = aVar2.f35612c;
            if (num != null) {
                io.grpc.b bVar7 = this.f35817i;
                Integer num2 = bVar7.f20439i;
                if (num2 != null) {
                    int min = Math.min(num2.intValue(), num.intValue());
                    if (min >= 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    sc.b.n("invalid maxsize %s", min, z16);
                    b.a b13 = io.grpc.b.b(bVar7);
                    b13.f20448i = Integer.valueOf(min);
                    this.f35817i = new io.grpc.b(b13);
                } else {
                    int intValue = num.intValue();
                    if (intValue >= 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    sc.b.n("invalid maxsize %s", intValue, z15);
                    b.a b14 = io.grpc.b.b(bVar7);
                    b14.f20448i = Integer.valueOf(intValue);
                    this.f35817i = new io.grpc.b(b14);
                }
            }
            Integer num3 = aVar2.f35613d;
            if (num3 != null) {
                io.grpc.b bVar8 = this.f35817i;
                Integer num4 = bVar8.f20440j;
                if (num4 != null) {
                    int min2 = Math.min(num4.intValue(), num3.intValue());
                    if (min2 >= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    sc.b.n("invalid maxsize %s", min2, z14);
                    b.a b15 = io.grpc.b.b(bVar8);
                    b15.f20449j = Integer.valueOf(min2);
                    this.f35817i = new io.grpc.b(b15);
                } else {
                    int intValue2 = num3.intValue();
                    if (intValue2 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    sc.b.n("invalid maxsize %s", intValue2, z13);
                    b.a b16 = io.grpc.b.b(bVar8);
                    b16.f20449j = Integer.valueOf(intValue2);
                    this.f35817i = new io.grpc.b(b16);
                }
            }
        }
        String str2 = this.f35817i.f20436e;
        f.b bVar9 = f.b.f33465a;
        if (str2 != null) {
            ?? r10 = (tr.h) this.f35826s.f33479a.get(str2);
            if (r10 == 0) {
                this.f35818j = k2.f35746a;
                this.f35812c.execute(new a(aVar, str2));
                return;
            }
            bVar = r10;
        } else {
            bVar = bVar9;
        }
        tr.o oVar = this.r;
        boolean z17 = this.f35825q;
        c0Var.a(u0.f35979h);
        c0.b bVar10 = u0.f35976d;
        c0Var.a(bVar10);
        if (bVar != bVar9) {
            c0Var.f(bVar10, bVar.a());
        }
        c0.f fVar = u0.f35977e;
        c0Var.a(fVar);
        ?? r22 = oVar.f33541b;
        if (r22.length != 0) {
            c0Var.f(fVar, r22);
        }
        c0Var.a(u0.f);
        c0.f fVar2 = u0.f35978g;
        c0Var.a(fVar2);
        if (z17) {
            c0Var.f(fVar2, f35808u);
        }
        tr.m mVar4 = this.f35817i.f20432a;
        this.f.getClass();
        if (mVar4 == null) {
            mVar = null;
        } else {
            mVar = mVar4;
        }
        if (mVar != null && mVar.f()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            this.f.getClass();
            tr.m mVar5 = this.f35817i.f20432a;
            Level level = Level.FINE;
            Logger logger = f35807t;
            if (logger.isLoggable(level) && mVar != null && mVar.equals(null)) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long max = Math.max(0L, mVar.h(timeUnit2));
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(max)));
                if (mVar5 == null) {
                    sb2.append(" Explicit call timeout was not set.");
                } else {
                    sb2.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(mVar5.h(timeUnit2))));
                }
                logger.fine(sb2.toString());
            }
            c cVar = this.f35822n;
            tr.d0<ReqT, RespT> d0Var = this.f35810a;
            io.grpc.b bVar11 = this.f35817i;
            tr.l lVar = this.f;
            q1.e eVar = (q1.e) cVar;
            q1 q1Var = q1.this;
            if (!q1Var.Y) {
                t a10 = eVar.a(new p2(d0Var, c0Var, bVar11));
                tr.l a11 = lVar.a();
                try {
                    z1Var = a10.f(d0Var, c0Var, bVar11, u0.c(bVar11, c0Var, 0, false));
                } finally {
                    lVar.c(a11);
                }
            } else {
                v2.a0 a0Var = q1Var.S.f35607d;
                f2.a aVar4 = (f2.a) bVar11.a(c0308b);
                if (aVar4 == null) {
                    x2Var = null;
                } else {
                    x2Var = aVar4.f35614e;
                }
                if (aVar4 == null) {
                    w0Var = null;
                } else {
                    w0Var = aVar4.f;
                }
                z1Var = new z1(eVar, d0Var, c0Var, bVar11, x2Var, w0Var, a0Var, lVar);
            }
            this.f35818j = z1Var;
        } else {
            io.grpc.c[] c11 = u0.c(this.f35817i, c0Var, 0, false);
            tr.m mVar6 = this.f35817i.f20432a;
            this.f.getClass();
            if (mVar6 == null) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                str = "CallOptions";
            } else {
                str = "Context";
            }
            this.f35818j = new k0(tr.i0.f33483h.g(String.format("ClientCall started after %s deadline was exceeded .9%f seconds ago", str, Double.valueOf(mVar.h(TimeUnit.NANOSECONDS) / f35809v))), s.a.PROCESSED, c11);
        }
        if (this.f35813d) {
            this.f35818j.c();
        }
        String str3 = this.f35817i.f20434c;
        if (str3 != null) {
            this.f35818j.l(str3);
        }
        Integer num5 = this.f35817i.f20439i;
        if (num5 != null) {
            this.f35818j.g(num5.intValue());
        }
        Integer num6 = this.f35817i.f20440j;
        if (num6 != null) {
            this.f35818j.h(num6.intValue());
        }
        if (mVar != null) {
            this.f35818j.i(mVar);
        }
        this.f35818j.a(bVar);
        boolean z18 = this.f35825q;
        if (z18) {
            this.f35818j.p(z18);
        }
        this.f35818j.k(this.r);
        m mVar7 = this.f35814e;
        mVar7.f35763b.add(1L);
        mVar7.f35762a.a();
        this.f35818j.n(new b(aVar));
        tr.l lVar2 = this.f;
        p<ReqT, RespT>.d dVar = this.f35823o;
        lVar2.getClass();
        if (dVar != null) {
            Logger logger2 = tr.l.f33516a;
            if (mVar != null) {
                this.f.getClass();
                if (!mVar.equals(null) && this.f35824p != null) {
                    TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
                    long h10 = mVar.h(timeUnit3);
                    this.f35815g = this.f35824p.schedule(new o1(new e(h10)), h10, timeUnit3);
                }
            }
            if (this.f35819k) {
                g();
                return;
            }
            return;
        }
        throw new NullPointerException("cancellationListener");
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(this.f35810a, "method");
        return c10.toString();
    }
}
