package pv;

import java.io.IOException;
import java.net.ProtocolException;
import lv.d0;
import lv.o;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import zv.k;
import zv.x;
import zv.z;
/* compiled from: Exchange.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final d f29024a;

    /* renamed from: b  reason: collision with root package name */
    public final o f29025b;

    /* renamed from: c  reason: collision with root package name */
    public final c f29026c;

    /* renamed from: d  reason: collision with root package name */
    public final qv.d f29027d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f29028e;
    public final e f;

    /* compiled from: Exchange.kt */
    /* loaded from: classes2.dex */
    public final class a extends zv.j {

        /* renamed from: v  reason: collision with root package name */
        public final long f29029v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f29030w;

        /* renamed from: x  reason: collision with root package name */
        public long f29031x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f29032y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ b f29033z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b this$0, x delegate, long j10) {
            super(delegate);
            kotlin.jvm.internal.i.g(this$0, "this$0");
            kotlin.jvm.internal.i.g(delegate, "delegate");
            this.f29033z = this$0;
            this.f29029v = j10;
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f29030w) {
                return e10;
            }
            this.f29030w = true;
            return (E) this.f29033z.a(false, true, e10);
        }

        @Override // zv.j, zv.x, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f29032y) {
                return;
            }
            this.f29032y = true;
            long j10 = this.f29029v;
            if (j10 != -1 && this.f29031x != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // zv.j, zv.x, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // zv.j, zv.x
        public final void n(zv.e source, long j10) {
            kotlin.jvm.internal.i.g(source, "source");
            if (!this.f29032y) {
                long j11 = this.f29029v;
                if (j11 != -1 && this.f29031x + j10 > j11) {
                    throw new ProtocolException("expected " + j11 + " bytes but received " + (this.f29031x + j10));
                }
                try {
                    super.n(source, j10);
                    this.f29031x += j10;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* compiled from: Exchange.kt */
    /* renamed from: pv.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0491b extends k {
        public final /* synthetic */ b A;

        /* renamed from: v  reason: collision with root package name */
        public final long f29034v;

        /* renamed from: w  reason: collision with root package name */
        public long f29035w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f29036x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f29037y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f29038z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0491b(b bVar, z delegate, long j10) {
            super(delegate);
            kotlin.jvm.internal.i.g(delegate, "delegate");
            this.A = bVar;
            this.f29034v = j10;
            this.f29036x = true;
            if (j10 == 0) {
                a(null);
            }
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f29037y) {
                return e10;
            }
            this.f29037y = true;
            b bVar = this.A;
            if (e10 == null && this.f29036x) {
                this.f29036x = false;
                bVar.f29025b.getClass();
                d call = bVar.f29024a;
                kotlin.jvm.internal.i.g(call, "call");
            }
            return (E) bVar.a(true, false, e10);
        }

        @Override // zv.k, zv.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f29038z) {
                return;
            }
            this.f29038z = true;
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // zv.k, zv.z
        public final long o0(zv.e sink, long j10) {
            kotlin.jvm.internal.i.g(sink, "sink");
            if (!this.f29038z) {
                try {
                    long o02 = this.f39893u.o0(sink, j10);
                    if (this.f29036x) {
                        this.f29036x = false;
                        b bVar = this.A;
                        o oVar = bVar.f29025b;
                        d call = bVar.f29024a;
                        oVar.getClass();
                        kotlin.jvm.internal.i.g(call, "call");
                    }
                    if (o02 == -1) {
                        a(null);
                        return -1L;
                    }
                    long j11 = this.f29035w + o02;
                    long j12 = this.f29034v;
                    if (j12 != -1 && j11 > j12) {
                        throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
                    }
                    this.f29035w = j11;
                    if (j11 == j12) {
                        a(null);
                    }
                    return o02;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public b(d dVar, o eventListener, c cVar, qv.d dVar2) {
        kotlin.jvm.internal.i.g(eventListener, "eventListener");
        this.f29024a = dVar;
        this.f29025b = eventListener;
        this.f29026c = cVar;
        this.f29027d = dVar2;
        this.f = dVar2.d();
    }

    public final IOException a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            c(iOException);
        }
        o oVar = this.f29025b;
        d call = this.f29024a;
        if (z11) {
            if (iOException != null) {
                oVar.getClass();
                kotlin.jvm.internal.i.g(call, "call");
            } else {
                oVar.getClass();
                kotlin.jvm.internal.i.g(call, "call");
            }
        }
        if (z10) {
            if (iOException != null) {
                oVar.getClass();
                kotlin.jvm.internal.i.g(call, "call");
            } else {
                oVar.getClass();
                kotlin.jvm.internal.i.g(call, "call");
            }
        }
        return call.f(this, z11, z10, iOException);
    }

    public final d0.a b(boolean z10) {
        try {
            d0.a c10 = this.f29027d.c(z10);
            if (c10 != null) {
                c10.f24600m = this;
            }
            return c10;
        } catch (IOException e10) {
            this.f29025b.getClass();
            d call = this.f29024a;
            kotlin.jvm.internal.i.g(call, "call");
            c(e10);
            throw e10;
        }
    }

    public final void c(IOException iOException) {
        boolean z10;
        this.f29026c.c(iOException);
        e d10 = this.f29027d.d();
        d call = this.f29024a;
        synchronized (d10) {
            kotlin.jvm.internal.i.g(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).f27606u == sv.a.REFUSED_STREAM) {
                    int i6 = d10.f29070n + 1;
                    d10.f29070n = i6;
                    if (i6 > 1) {
                        d10.f29066j = true;
                        d10.f29068l++;
                    }
                } else if (((StreamResetException) iOException).f27606u != sv.a.CANCEL || !call.J) {
                    d10.f29066j = true;
                    d10.f29068l++;
                }
            } else {
                if (d10.f29063g != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || (iOException instanceof ConnectionShutdownException)) {
                    d10.f29066j = true;
                    if (d10.f29069m == 0) {
                        e.d(call.f29048u, d10.f29059b, iOException);
                        d10.f29068l++;
                    }
                }
            }
        }
    }
}
