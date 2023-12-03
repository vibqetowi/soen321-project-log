package vr;

import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import tr.c0;
import tr.f;
import tr.o;
import vr.e;
import vr.i2;
import vr.s;
import wr.h;
/* compiled from: AbstractClientStream.java */
/* loaded from: classes2.dex */
public abstract class a extends e implements r, i2.c {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f35359g = Logger.getLogger(a.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final m3 f35360a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f35361b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f35362c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f35363d;

    /* renamed from: e  reason: collision with root package name */
    public tr.c0 f35364e;
    public volatile boolean f;

    /* compiled from: AbstractClientStream.java */
    /* loaded from: classes2.dex */
    public static abstract class b extends e.a {

        /* renamed from: h  reason: collision with root package name */
        public final g3 f35370h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f35371i;

        /* renamed from: j  reason: collision with root package name */
        public s f35372j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f35373k;

        /* renamed from: l  reason: collision with root package name */
        public tr.o f35374l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f35375m;

        /* renamed from: n  reason: collision with root package name */
        public RunnableC0602a f35376n;

        /* renamed from: o  reason: collision with root package name */
        public volatile boolean f35377o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f35378p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f35379q;

        /* compiled from: AbstractClientStream.java */
        /* renamed from: vr.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0602a implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ tr.i0 f35380u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ s.a f35381v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ tr.c0 f35382w;

            public RunnableC0602a(tr.i0 i0Var, s.a aVar, tr.c0 c0Var) {
                this.f35380u = i0Var;
                this.f35381v = aVar;
                this.f35382w = c0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.i(this.f35380u, this.f35381v, this.f35382w);
            }
        }

        public b(int i6, g3 g3Var, m3 m3Var) {
            super(i6, g3Var, m3Var);
            this.f35374l = tr.o.f33539d;
            this.f35375m = false;
            this.f35370h = g3Var;
        }

        public final void i(tr.i0 i0Var, s.a aVar, tr.c0 c0Var) {
            if (!this.f35371i) {
                this.f35371i = true;
                g3 g3Var = this.f35370h;
                if (g3Var.f35636b.compareAndSet(false, true)) {
                    for (com.android.volley.toolbox.a aVar2 : g3Var.f35635a) {
                        aVar2.s(i0Var);
                    }
                }
                this.f35372j.b(i0Var, aVar, c0Var);
                if (this.f35523c != null) {
                    i0Var.e();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(tr.c0 c0Var) {
            boolean z10;
            String str;
            boolean z11;
            boolean z12;
            sc.b.B("Received headers on closed stream", !this.f35378p);
            for (com.android.volley.toolbox.a aVar : this.f35370h.f35635a) {
                ((io.grpc.c) aVar).getClass();
            }
            String str2 = (String) c0Var.c(u0.f);
            boolean z13 = this.f35373k;
            f.b bVar = f.b.f33465a;
            tr.n nVar = null;
            if (z13 && str2 != null) {
                if (str2.equalsIgnoreCase("gzip")) {
                    v0 v0Var = new v0();
                    h2 h2Var = this.f35524d;
                    if (h2Var.f35683y == bVar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    sc.b.B("per-message decompressor already set", z11);
                    if (h2Var.f35684z == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    sc.b.B("full stream decompressor already set", z12);
                    h2Var.f35684z = v0Var;
                    h2Var.G = null;
                    x0 x0Var = (x0) this;
                    this.f35521a = new g(x0Var, x0Var, h2Var);
                    z10 = true;
                    str = (String) c0Var.c(u0.f35976d);
                    if (str != null) {
                        o.a aVar2 = this.f35374l.f33540a.get(str);
                        if (aVar2 != null) {
                            nVar = aVar2.f33542a;
                        }
                        if (nVar == null) {
                            ((h.b) this).e(new StatusRuntimeException(tr.i0.f33487l.g(String.format("Can't find decompressor for %s", str))));
                            return;
                        } else if (nVar != bVar) {
                            if (z10) {
                                ((h.b) this).e(new StatusRuntimeException(tr.i0.f33487l.g("Full stream and gRPC message encoding cannot both be set")));
                                return;
                            }
                            this.f35521a.h(nVar);
                        }
                    }
                    this.f35372j.c(c0Var);
                } else if (!str2.equalsIgnoreCase("identity")) {
                    ((h.b) this).e(new StatusRuntimeException(tr.i0.f33487l.g(String.format("Can't find full stream decompressor for %s", str2))));
                    return;
                }
            }
            z10 = false;
            str = (String) c0Var.c(u0.f35976d);
            if (str != null) {
            }
            this.f35372j.c(c0Var);
        }

        public final void k(tr.c0 c0Var, tr.i0 i0Var, boolean z10) {
            l(i0Var, s.a.PROCESSED, z10, c0Var);
        }

        public final void l(tr.i0 i0Var, s.a aVar, boolean z10, tr.c0 c0Var) {
            sc.b.w(i0Var, "status");
            if (this.f35378p && !z10) {
                return;
            }
            this.f35378p = true;
            this.f35379q = i0Var.e();
            synchronized (this.f35522b) {
                this.f35526g = true;
            }
            if (this.f35375m) {
                this.f35376n = null;
                i(i0Var, aVar, c0Var);
                return;
            }
            this.f35376n = new RunnableC0602a(i0Var, aVar, c0Var);
            if (z10) {
                this.f35521a.close();
            } else {
                this.f35521a.j();
            }
        }
    }

    public a(ca.a aVar, g3 g3Var, m3 m3Var, tr.c0 c0Var, io.grpc.b bVar, boolean z10) {
        sc.b.w(c0Var, "headers");
        sc.b.w(m3Var, "transportTracer");
        this.f35360a = m3Var;
        this.f35362c = !Boolean.TRUE.equals(bVar.a(u0.f35985n));
        this.f35363d = z10;
        if (!z10) {
            this.f35361b = new i2(this, aVar, g3Var);
            this.f35364e = c0Var;
            return;
        }
        this.f35361b = new C0601a(c0Var, g3Var);
    }

    @Override // vr.i2.c
    public final void d(n3 n3Var, boolean z10, boolean z11, int i6) {
        boolean z12;
        zv.e eVar;
        if (n3Var == null && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        sc.b.s("null frame before EOS", z12);
        h.a q10 = q();
        q10.getClass();
        fs.b.c();
        if (n3Var == null) {
            eVar = wr.h.f37117p;
        } else {
            eVar = ((wr.n) n3Var).f37186a;
            int i10 = (int) eVar.f39885v;
            if (i10 > 0) {
                wr.h.s(wr.h.this, i10);
            }
        }
        try {
            synchronized (wr.h.this.f37122l.f37128x) {
                h.b.p(wr.h.this.f37122l, eVar, z10, z11);
                m3 m3Var = wr.h.this.f35360a;
                if (i6 == 0) {
                    m3Var.getClass();
                } else {
                    m3Var.getClass();
                    m3Var.f35769a.a();
                }
            }
        } finally {
            fs.b.e();
        }
    }

    @Override // vr.r
    public final void g(int i6) {
        f().f35521a.g(i6);
    }

    @Override // vr.r
    public final void h(int i6) {
        this.f35361b.h(i6);
    }

    @Override // vr.r
    public final void i(tr.m mVar) {
        tr.c0 c0Var = this.f35364e;
        c0.b bVar = u0.f35975c;
        c0Var.a(bVar);
        this.f35364e.f(bVar, Long.valueOf(Math.max(0L, mVar.h(TimeUnit.NANOSECONDS))));
    }

    @Override // vr.h3
    public final boolean isReady() {
        if (f().g() && !this.f) {
            return true;
        }
        return false;
    }

    @Override // vr.r
    public final void j(b1 b1Var) {
        b1Var.c(((wr.h) this).f37124n.f20427a.get(io.grpc.f.f20455a), "remote_addr");
    }

    @Override // vr.r
    public final void k(tr.o oVar) {
        boolean z10;
        h.b f = f();
        if (f.f35372j == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("Already called start", z10);
        sc.b.w(oVar, "decompressorRegistry");
        f.f35374l = oVar;
    }

    @Override // vr.r
    public final void m() {
        if (!f().f35377o) {
            f().f35377o = true;
            this.f35361b.close();
        }
    }

    @Override // vr.r
    public final void n(s sVar) {
        boolean z10;
        h.b f = f();
        if (f.f35372j == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("Already called setListener", z10);
        f.f35372j = sVar;
        if (!this.f35363d) {
            q().a(this.f35364e, null);
            this.f35364e = null;
        }
    }

    @Override // vr.r
    public final void o(tr.i0 i0Var) {
        sc.b.s("Should not cancel with OK status", !i0Var.e());
        this.f = true;
        h.a q10 = q();
        q10.getClass();
        fs.b.c();
        try {
            synchronized (wr.h.this.f37122l.f37128x) {
                wr.h.this.f37122l.q(null, i0Var, true);
            }
        } finally {
            fs.b.e();
        }
    }

    @Override // vr.r
    public final void p(boolean z10) {
        f().f35373k = z10;
    }

    public abstract h.a q();

    @Override // vr.e
    /* renamed from: r */
    public abstract h.b f();

    /* compiled from: AbstractClientStream.java */
    /* renamed from: vr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0601a implements s0 {

        /* renamed from: a  reason: collision with root package name */
        public tr.c0 f35365a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f35366b;

        /* renamed from: c  reason: collision with root package name */
        public final g3 f35367c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f35368d;

        public C0601a(tr.c0 c0Var, g3 g3Var) {
            sc.b.w(c0Var, "headers");
            this.f35365a = c0Var;
            this.f35367c = g3Var;
        }

        @Override // vr.s0
        public final void b(InputStream inputStream) {
            boolean z10;
            if (this.f35368d == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.B("writePayload should not be called multiple times", z10);
            try {
                this.f35368d = oc.a.b(inputStream);
                g3 g3Var = this.f35367c;
                for (com.android.volley.toolbox.a aVar : g3Var.f35635a) {
                    aVar.getClass();
                }
                int length = this.f35368d.length;
                for (com.android.volley.toolbox.a aVar2 : g3Var.f35635a) {
                    aVar2.getClass();
                }
                int length2 = this.f35368d.length;
                com.android.volley.toolbox.a[] aVarArr = g3Var.f35635a;
                for (com.android.volley.toolbox.a aVar3 : aVarArr) {
                    aVar3.getClass();
                }
                long length3 = this.f35368d.length;
                for (com.android.volley.toolbox.a aVar4 : aVarArr) {
                    aVar4.o(length3);
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // vr.s0
        public final void close() {
            boolean z10 = true;
            this.f35366b = true;
            if (this.f35368d == null) {
                z10 = false;
            }
            sc.b.B("Lack of request message. GET request is only supported for unary requests", z10);
            a.this.q().a(this.f35365a, this.f35368d);
            this.f35368d = null;
            this.f35365a = null;
        }

        @Override // vr.s0
        public final boolean isClosed() {
            return this.f35366b;
        }

        @Override // vr.s0
        public final void flush() {
        }

        @Override // vr.s0
        public final s0 a(tr.h hVar) {
            return this;
        }

        @Override // vr.s0
        public final void h(int i6) {
        }
    }
}
