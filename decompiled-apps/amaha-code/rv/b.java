package rv;

import gv.n;
import gv.r;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import lv.d0;
import lv.s;
import lv.t;
import lv.x;
import lv.y;
import qv.i;
import zv.a0;
import zv.g;
import zv.h;
import zv.l;
import zv.z;
/* compiled from: Http1ExchangeCodec.kt */
/* loaded from: classes2.dex */
public final class b implements qv.d {

    /* renamed from: a  reason: collision with root package name */
    public final x f31031a;

    /* renamed from: b  reason: collision with root package name */
    public final pv.e f31032b;

    /* renamed from: c  reason: collision with root package name */
    public final h f31033c;

    /* renamed from: d  reason: collision with root package name */
    public final g f31034d;

    /* renamed from: e  reason: collision with root package name */
    public int f31035e;
    public final rv.a f;

    /* renamed from: g  reason: collision with root package name */
    public s f31036g;

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes2.dex */
    public abstract class a implements z {

        /* renamed from: u  reason: collision with root package name */
        public final l f31037u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f31038v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b f31039w;

        public a(b this$0) {
            i.g(this$0, "this$0");
            this.f31039w = this$0;
            this.f31037u = new l(this$0.f31033c.d());
        }

        public final void a() {
            b bVar = this.f31039w;
            int i6 = bVar.f31035e;
            if (i6 == 6) {
                return;
            }
            if (i6 == 5) {
                b.i(bVar, this.f31037u);
                bVar.f31035e = 6;
                return;
            }
            throw new IllegalStateException(i.n(Integer.valueOf(bVar.f31035e), "state: "));
        }

        @Override // zv.z
        public final a0 d() {
            return this.f31037u;
        }

        @Override // zv.z
        public long o0(zv.e sink, long j10) {
            b bVar = this.f31039w;
            i.g(sink, "sink");
            try {
                return bVar.f31033c.o0(sink, j10);
            } catch (IOException e10) {
                bVar.f31032b.l();
                a();
                throw e10;
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: rv.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0527b implements zv.x {

        /* renamed from: u  reason: collision with root package name */
        public final l f31040u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f31041v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b f31042w;

        public C0527b(b this$0) {
            i.g(this$0, "this$0");
            this.f31042w = this$0;
            this.f31040u = new l(this$0.f31034d.d());
        }

        @Override // zv.x, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f31041v) {
                return;
            }
            this.f31041v = true;
            this.f31042w.f31034d.T("0\r\n\r\n");
            b.i(this.f31042w, this.f31040u);
            this.f31042w.f31035e = 3;
        }

        @Override // zv.x
        public final a0 d() {
            return this.f31040u;
        }

        @Override // zv.x, java.io.Flushable
        public final synchronized void flush() {
            if (this.f31041v) {
                return;
            }
            this.f31042w.f31034d.flush();
        }

        @Override // zv.x
        public final void n(zv.e source, long j10) {
            i.g(source, "source");
            if (!this.f31041v) {
                if (j10 == 0) {
                    return;
                }
                b bVar = this.f31042w;
                bVar.f31034d.Z(j10);
                bVar.f31034d.T("\r\n");
                bVar.f31034d.n(source, j10);
                bVar.f31034d.T("\r\n");
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes2.dex */
    public final class c extends a {
        public final /* synthetic */ b A;

        /* renamed from: x  reason: collision with root package name */
        public final t f31043x;

        /* renamed from: y  reason: collision with root package name */
        public long f31044y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f31045z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b this$0, t url) {
            super(this$0);
            i.g(this$0, "this$0");
            i.g(url, "url");
            this.A = this$0;
            this.f31043x = url;
            this.f31044y = -1L;
            this.f31045z = true;
        }

        @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f31038v) {
                return;
            }
            if (this.f31045z && !mv.b.h(this, TimeUnit.MILLISECONDS)) {
                this.A.f31032b.l();
                a();
            }
            this.f31038v = true;
        }

        @Override // rv.b.a, zv.z
        public final long o0(zv.e sink, long j10) {
            boolean z10;
            i.g(sink, "sink");
            boolean z11 = true;
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (!this.f31038v) {
                    if (!this.f31045z) {
                        return -1L;
                    }
                    long j11 = this.f31044y;
                    b bVar = this.A;
                    if (j11 == 0 || j11 == -1) {
                        if (j11 != -1) {
                            bVar.f31033c.j0();
                        }
                        try {
                            this.f31044y = bVar.f31033c.I0();
                            String obj = r.i1(bVar.f31033c.j0()).toString();
                            if (this.f31044y >= 0) {
                                if (obj.length() <= 0) {
                                    z11 = false;
                                }
                                if (!z11 || n.H0(obj, ";")) {
                                    if (this.f31044y == 0) {
                                        this.f31045z = false;
                                        bVar.f31036g = bVar.f.a();
                                        x xVar = bVar.f31031a;
                                        i.d(xVar);
                                        s sVar = bVar.f31036g;
                                        i.d(sVar);
                                        qv.e.b(xVar.D, this.f31043x, sVar);
                                        a();
                                    }
                                    if (!this.f31045z) {
                                        return -1L;
                                    }
                                }
                            }
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f31044y + obj + '\"');
                        } catch (NumberFormatException e10) {
                            throw new ProtocolException(e10.getMessage());
                        }
                    }
                    long o02 = super.o0(sink, Math.min(j10, this.f31044y));
                    if (o02 != -1) {
                        this.f31044y -= o02;
                        return o02;
                    }
                    bVar.f31032b.l();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(i.n(Long.valueOf(j10), "byteCount < 0: ").toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes2.dex */
    public final class d extends a {

        /* renamed from: x  reason: collision with root package name */
        public long f31046x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b f31047y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b this$0, long j10) {
            super(this$0);
            i.g(this$0, "this$0");
            this.f31047y = this$0;
            this.f31046x = j10;
            if (j10 == 0) {
                a();
            }
        }

        @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f31038v) {
                return;
            }
            if (this.f31046x != 0 && !mv.b.h(this, TimeUnit.MILLISECONDS)) {
                this.f31047y.f31032b.l();
                a();
            }
            this.f31038v = true;
        }

        @Override // rv.b.a, zv.z
        public final long o0(zv.e sink, long j10) {
            boolean z10;
            i.g(sink, "sink");
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (true ^ this.f31038v) {
                    long j11 = this.f31046x;
                    if (j11 == 0) {
                        return -1L;
                    }
                    long o02 = super.o0(sink, Math.min(j11, j10));
                    if (o02 != -1) {
                        long j12 = this.f31046x - o02;
                        this.f31046x = j12;
                        if (j12 == 0) {
                            a();
                        }
                        return o02;
                    }
                    this.f31047y.f31032b.l();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(i.n(Long.valueOf(j10), "byteCount < 0: ").toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes2.dex */
    public final class e implements zv.x {

        /* renamed from: u  reason: collision with root package name */
        public final l f31048u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f31049v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b f31050w;

        public e(b this$0) {
            i.g(this$0, "this$0");
            this.f31050w = this$0;
            this.f31048u = new l(this$0.f31034d.d());
        }

        @Override // zv.x, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f31049v) {
                return;
            }
            this.f31049v = true;
            l lVar = this.f31048u;
            b bVar = this.f31050w;
            b.i(bVar, lVar);
            bVar.f31035e = 3;
        }

        @Override // zv.x
        public final a0 d() {
            return this.f31048u;
        }

        @Override // zv.x, java.io.Flushable
        public final void flush() {
            if (this.f31049v) {
                return;
            }
            this.f31050w.f31034d.flush();
        }

        @Override // zv.x
        public final void n(zv.e source, long j10) {
            i.g(source, "source");
            if (!this.f31049v) {
                mv.b.c(source.f39885v, 0L, j10);
                this.f31050w.f31034d.n(source, j10);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes2.dex */
    public final class f extends a {

        /* renamed from: x  reason: collision with root package name */
        public boolean f31051x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b this$0) {
            super(this$0);
            i.g(this$0, "this$0");
        }

        @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f31038v) {
                return;
            }
            if (!this.f31051x) {
                a();
            }
            this.f31038v = true;
        }

        @Override // rv.b.a, zv.z
        public final long o0(zv.e sink, long j10) {
            boolean z10;
            i.g(sink, "sink");
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (!this.f31038v) {
                    if (this.f31051x) {
                        return -1L;
                    }
                    long o02 = super.o0(sink, j10);
                    if (o02 == -1) {
                        this.f31051x = true;
                        a();
                        return -1L;
                    }
                    return o02;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(i.n(Long.valueOf(j10), "byteCount < 0: ").toString());
        }
    }

    public b(x xVar, pv.e connection, h hVar, g gVar) {
        i.g(connection, "connection");
        this.f31031a = xVar;
        this.f31032b = connection;
        this.f31033c = hVar;
        this.f31034d = gVar;
        this.f = new rv.a(hVar);
    }

    public static final void i(b bVar, l lVar) {
        bVar.getClass();
        a0 a0Var = lVar.f39894e;
        a0.a delegate = a0.f39875d;
        i.g(delegate, "delegate");
        lVar.f39894e = delegate;
        a0Var.a();
        a0Var.b();
    }

    @Override // qv.d
    public final void a(lv.z zVar) {
        boolean z10;
        String d10;
        Proxy.Type type = this.f31032b.f29059b.f24613b.type();
        i.f(type, "connection.route().proxy.type()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zVar.f24752b);
        sb2.append(' ');
        t tVar = zVar.f24751a;
        if (!tVar.f24694j && type == Proxy.Type.HTTP) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb2.append(tVar);
        } else {
            String b10 = tVar.b();
            if (tVar.d() != null) {
                b10 = b10 + '?' + ((Object) d10);
            }
            sb2.append(b10);
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        k(zVar.f24753c, sb3);
    }

    @Override // qv.d
    public final void b() {
        this.f31034d.flush();
    }

    @Override // qv.d
    public final d0.a c(boolean z10) {
        rv.a aVar = this.f;
        int i6 = this.f31035e;
        boolean z11 = true;
        if (i6 != 1 && i6 != 3) {
            z11 = false;
        }
        if (z11) {
            t.a aVar2 = null;
            try {
                String L = aVar.f31029a.L(aVar.f31030b);
                aVar.f31030b -= L.length();
                qv.i a10 = i.a.a(L);
                int i10 = a10.f30159b;
                d0.a aVar3 = new d0.a();
                y protocol = a10.f30158a;
                kotlin.jvm.internal.i.g(protocol, "protocol");
                aVar3.f24590b = protocol;
                aVar3.f24591c = i10;
                String message = a10.f30160c;
                kotlin.jvm.internal.i.g(message, "message");
                aVar3.f24592d = message;
                aVar3.c(aVar.a());
                if (z10 && i10 == 100) {
                    return null;
                }
                if (i10 == 100) {
                    this.f31035e = 3;
                } else {
                    this.f31035e = 4;
                }
                return aVar3;
            } catch (EOFException e10) {
                t tVar = this.f31032b.f29059b.f24612a.f24535i;
                tVar.getClass();
                try {
                    t.a aVar4 = new t.a();
                    aVar4.d(tVar, "/...");
                    aVar2 = aVar4;
                } catch (IllegalArgumentException unused) {
                }
                kotlin.jvm.internal.i.d(aVar2);
                aVar2.f24696b = t.b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
                aVar2.f24697c = t.b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
                throw new IOException(kotlin.jvm.internal.i.n(aVar2.a().f24693i, "unexpected end of stream on "), e10);
            }
        }
        throw new IllegalStateException(kotlin.jvm.internal.i.n(Integer.valueOf(i6), "state: ").toString());
    }

    @Override // qv.d
    public final void cancel() {
        Socket socket = this.f31032b.f29060c;
        if (socket != null) {
            mv.b.e(socket);
        }
    }

    @Override // qv.d
    public final pv.e d() {
        return this.f31032b;
    }

    @Override // qv.d
    public final zv.x e(lv.z zVar, long j10) {
        boolean z10 = true;
        if (n.A0("chunked", zVar.f24753c.g("Transfer-Encoding"), true)) {
            int i6 = this.f31035e;
            if (i6 != 1) {
                z10 = false;
            }
            if (z10) {
                this.f31035e = 2;
                return new C0527b(this);
            }
            throw new IllegalStateException(kotlin.jvm.internal.i.n(Integer.valueOf(i6), "state: ").toString());
        } else if (j10 != -1) {
            int i10 = this.f31035e;
            if (i10 != 1) {
                z10 = false;
            }
            if (z10) {
                this.f31035e = 2;
                return new e(this);
            }
            throw new IllegalStateException(kotlin.jvm.internal.i.n(Integer.valueOf(i10), "state: ").toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // qv.d
    public final long f(d0 d0Var) {
        if (!qv.e.a(d0Var)) {
            return 0L;
        }
        if (n.A0("chunked", d0.e(d0Var, "Transfer-Encoding"), true)) {
            return -1L;
        }
        return mv.b.k(d0Var);
    }

    @Override // qv.d
    public final void g() {
        this.f31034d.flush();
    }

    @Override // qv.d
    public final z h(d0 d0Var) {
        if (!qv.e.a(d0Var)) {
            return j(0L);
        }
        boolean z10 = true;
        if (n.A0("chunked", d0.e(d0Var, "Transfer-Encoding"), true)) {
            t tVar = d0Var.f24583u.f24751a;
            int i6 = this.f31035e;
            if (i6 != 4) {
                z10 = false;
            }
            if (z10) {
                this.f31035e = 5;
                return new c(this, tVar);
            }
            throw new IllegalStateException(kotlin.jvm.internal.i.n(Integer.valueOf(i6), "state: ").toString());
        }
        long k10 = mv.b.k(d0Var);
        if (k10 != -1) {
            return j(k10);
        }
        int i10 = this.f31035e;
        if (i10 != 4) {
            z10 = false;
        }
        if (z10) {
            this.f31035e = 5;
            this.f31032b.l();
            return new f(this);
        }
        throw new IllegalStateException(kotlin.jvm.internal.i.n(Integer.valueOf(i10), "state: ").toString());
    }

    public final d j(long j10) {
        boolean z10;
        int i6 = this.f31035e;
        if (i6 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f31035e = 5;
            return new d(this, j10);
        }
        throw new IllegalStateException(kotlin.jvm.internal.i.n(Integer.valueOf(i6), "state: ").toString());
    }

    public final void k(s headers, String requestLine) {
        boolean z10;
        kotlin.jvm.internal.i.g(headers, "headers");
        kotlin.jvm.internal.i.g(requestLine, "requestLine");
        int i6 = this.f31035e;
        if (i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            g gVar = this.f31034d;
            gVar.T(requestLine).T("\r\n");
            int length = headers.f24683u.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                gVar.T(headers.m(i10)).T(": ").T(headers.q(i10)).T("\r\n");
            }
            gVar.T("\r\n");
            this.f31035e = 1;
            return;
        }
        throw new IllegalStateException(kotlin.jvm.internal.i.n(Integer.valueOf(i6), "state: ").toString());
    }
}
