package sv;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;
import zv.a0;
import zv.x;
import zv.z;
/* compiled from: Http2Stream.kt */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final int f32183a;

    /* renamed from: b  reason: collision with root package name */
    public final e f32184b;

    /* renamed from: c  reason: collision with root package name */
    public long f32185c;

    /* renamed from: d  reason: collision with root package name */
    public long f32186d;

    /* renamed from: e  reason: collision with root package name */
    public long f32187e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<lv.s> f32188g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f32189h;

    /* renamed from: i  reason: collision with root package name */
    public final b f32190i;

    /* renamed from: j  reason: collision with root package name */
    public final a f32191j;

    /* renamed from: k  reason: collision with root package name */
    public final c f32192k;

    /* renamed from: l  reason: collision with root package name */
    public final c f32193l;

    /* renamed from: m  reason: collision with root package name */
    public sv.a f32194m;

    /* renamed from: n  reason: collision with root package name */
    public IOException f32195n;

    /* compiled from: Http2Stream.kt */
    /* loaded from: classes2.dex */
    public final class a implements x {

        /* renamed from: u  reason: collision with root package name */
        public final boolean f32196u;

        /* renamed from: v  reason: collision with root package name */
        public final zv.e f32197v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f32198w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q f32199x;

        public a(q this$0, boolean z10) {
            kotlin.jvm.internal.i.g(this$0, "this$0");
            this.f32199x = this$0;
            this.f32196u = z10;
            this.f32197v = new zv.e();
        }

        public final void a(boolean z10) {
            long min;
            boolean z11;
            q qVar = this.f32199x;
            synchronized (qVar) {
                qVar.f32193l.h();
                while (qVar.f32187e >= qVar.f && !this.f32196u && !this.f32198w && qVar.f() == null) {
                    qVar.l();
                }
                qVar.f32193l.l();
                qVar.b();
                min = Math.min(qVar.f - qVar.f32187e, this.f32197v.f39885v);
                qVar.f32187e += min;
                if (z10 && min == this.f32197v.f39885v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                hs.k kVar = hs.k.f19476a;
            }
            this.f32199x.f32193l.h();
            try {
                q qVar2 = this.f32199x;
                qVar2.f32184b.s(qVar2.f32183a, z11, this.f32197v, min);
            } finally {
                this.f32199x.f32193l.l();
            }
        }

        @Override // zv.x, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z10;
            q qVar = this.f32199x;
            byte[] bArr = mv.b.f25755a;
            synchronized (qVar) {
                if (this.f32198w) {
                    return;
                }
                boolean z11 = false;
                if (qVar.f() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hs.k kVar = hs.k.f19476a;
                q qVar2 = this.f32199x;
                if (!qVar2.f32191j.f32196u) {
                    if (this.f32197v.f39885v > 0) {
                        z11 = true;
                    }
                    if (z11) {
                        while (this.f32197v.f39885v > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        qVar2.f32184b.s(qVar2.f32183a, true, null, 0L);
                    }
                }
                synchronized (this.f32199x) {
                    this.f32198w = true;
                    hs.k kVar2 = hs.k.f19476a;
                }
                this.f32199x.f32184b.flush();
                this.f32199x.a();
            }
        }

        @Override // zv.x
        public final a0 d() {
            return this.f32199x.f32193l;
        }

        @Override // zv.x, java.io.Flushable
        public final void flush() {
            q qVar = this.f32199x;
            byte[] bArr = mv.b.f25755a;
            synchronized (qVar) {
                qVar.b();
                hs.k kVar = hs.k.f19476a;
            }
            while (this.f32197v.f39885v > 0) {
                a(false);
                this.f32199x.f32184b.flush();
            }
        }

        @Override // zv.x
        public final void n(zv.e source, long j10) {
            kotlin.jvm.internal.i.g(source, "source");
            byte[] bArr = mv.b.f25755a;
            zv.e eVar = this.f32197v;
            eVar.n(source, j10);
            while (eVar.f39885v >= 16384) {
                a(false);
            }
        }
    }

    /* compiled from: Http2Stream.kt */
    /* loaded from: classes2.dex */
    public final class b implements z {

        /* renamed from: u  reason: collision with root package name */
        public final long f32200u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f32201v;

        /* renamed from: w  reason: collision with root package name */
        public final zv.e f32202w;

        /* renamed from: x  reason: collision with root package name */
        public final zv.e f32203x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f32204y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ q f32205z;

        public b(q this$0, long j10, boolean z10) {
            kotlin.jvm.internal.i.g(this$0, "this$0");
            this.f32205z = this$0;
            this.f32200u = j10;
            this.f32201v = z10;
            this.f32202w = new zv.e();
            this.f32203x = new zv.e();
        }

        public final void a(long j10) {
            byte[] bArr = mv.b.f25755a;
            this.f32205z.f32184b.o(j10);
        }

        @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j10;
            q qVar = this.f32205z;
            synchronized (qVar) {
                this.f32204y = true;
                zv.e eVar = this.f32203x;
                j10 = eVar.f39885v;
                eVar.a();
                qVar.notifyAll();
                hs.k kVar = hs.k.f19476a;
            }
            if (j10 > 0) {
                a(j10);
            }
            this.f32205z.a();
        }

        @Override // zv.z
        public final a0 d() {
            return this.f32205z.f32192k;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // zv.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long o0(zv.e sink, long j10) {
            boolean z10;
            Throwable th2;
            long j11;
            boolean z11;
            kotlin.jvm.internal.i.g(sink, "sink");
            long j12 = 0;
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "byteCount < 0: ").toString());
            }
            while (true) {
                q qVar = this.f32205z;
                synchronized (qVar) {
                    qVar.f32192k.h();
                    if (qVar.f() != null) {
                        th2 = qVar.f32195n;
                        if (th2 == null) {
                            sv.a f = qVar.f();
                            kotlin.jvm.internal.i.d(f);
                            th2 = new StreamResetException(f);
                        }
                    } else {
                        th2 = null;
                    }
                    if (this.f32204y) {
                        break;
                    }
                    zv.e eVar = this.f32203x;
                    long j13 = eVar.f39885v;
                    if (j13 > j12) {
                        j11 = eVar.o0(sink, Math.min(j10, j13));
                        long j14 = qVar.f32185c + j11;
                        qVar.f32185c = j14;
                        long j15 = j14 - qVar.f32186d;
                        if (th2 == null && j15 >= qVar.f32184b.L.a() / 2) {
                            qVar.f32184b.I(qVar.f32183a, j15);
                            qVar.f32186d = qVar.f32185c;
                        }
                    } else if (!this.f32201v && th2 == null) {
                        qVar.l();
                        j11 = -1;
                        z11 = true;
                        qVar.f32192k.l();
                        hs.k kVar = hs.k.f19476a;
                    } else {
                        j11 = -1;
                    }
                    z11 = false;
                    qVar.f32192k.l();
                    hs.k kVar2 = hs.k.f19476a;
                }
                if (z11) {
                    j12 = 0;
                } else if (j11 != -1) {
                    a(j11);
                    return j11;
                } else if (th2 == null) {
                    return -1L;
                } else {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: Http2Stream.kt */
    /* loaded from: classes2.dex */
    public final class c extends zv.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ q f32206k;

        public c(q this$0) {
            kotlin.jvm.internal.i.g(this$0, "this$0");
            this.f32206k = this$0;
        }

        @Override // zv.a
        public final IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // zv.a
        public final void k() {
            this.f32206k.e(sv.a.CANCEL);
            e eVar = this.f32206k.f32184b;
            synchronized (eVar) {
                long j10 = eVar.J;
                long j11 = eVar.I;
                if (j10 >= j11) {
                    eVar.I = j11 + 1;
                    eVar.K = System.nanoTime() + 1000000000;
                    hs.k kVar = hs.k.f19476a;
                    eVar.C.c(new n(kotlin.jvm.internal.i.n(" ping", eVar.f32130x), eVar), 0L);
                }
            }
        }

        public final void l() {
            if (!i()) {
                return;
            }
            throw j(null);
        }
    }

    public q(int i6, e eVar, boolean z10, boolean z11, lv.s sVar) {
        this.f32183a = i6;
        this.f32184b = eVar;
        this.f = eVar.M.a();
        ArrayDeque<lv.s> arrayDeque = new ArrayDeque<>();
        this.f32188g = arrayDeque;
        this.f32190i = new b(this, eVar.L.a(), z11);
        this.f32191j = new a(this, z10);
        this.f32192k = new c(this);
        this.f32193l = new c(this);
        if (sVar != null) {
            if (!h()) {
                arrayDeque.add(sVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (h()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z10;
        boolean i6;
        byte[] bArr = mv.b.f25755a;
        synchronized (this) {
            b bVar = this.f32190i;
            if (!bVar.f32201v && bVar.f32204y) {
                a aVar = this.f32191j;
                if (aVar.f32196u || aVar.f32198w) {
                    z10 = true;
                    i6 = i();
                    hs.k kVar = hs.k.f19476a;
                }
            }
            z10 = false;
            i6 = i();
            hs.k kVar2 = hs.k.f19476a;
        }
        if (z10) {
            c(sv.a.CANCEL, null);
        } else if (!i6) {
            this.f32184b.j(this.f32183a);
        }
    }

    public final void b() {
        a aVar = this.f32191j;
        if (!aVar.f32198w) {
            if (!aVar.f32196u) {
                if (this.f32194m != null) {
                    IOException iOException = this.f32195n;
                    if (iOException == null) {
                        sv.a aVar2 = this.f32194m;
                        kotlin.jvm.internal.i.d(aVar2);
                        throw new StreamResetException(aVar2);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void c(sv.a aVar, IOException iOException) {
        if (!d(aVar, iOException)) {
            return;
        }
        e eVar = this.f32184b;
        eVar.getClass();
        eVar.S.j(this.f32183a, aVar);
    }

    public final boolean d(sv.a aVar, IOException iOException) {
        byte[] bArr = mv.b.f25755a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.f32190i.f32201v && this.f32191j.f32196u) {
                return false;
            }
            this.f32194m = aVar;
            this.f32195n = iOException;
            notifyAll();
            hs.k kVar = hs.k.f19476a;
            this.f32184b.j(this.f32183a);
            return true;
        }
    }

    public final void e(sv.a aVar) {
        if (!d(aVar, null)) {
            return;
        }
        this.f32184b.G(this.f32183a, aVar);
    }

    public final synchronized sv.a f() {
        return this.f32194m;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a g() {
        boolean z10;
        synchronized (this) {
            if (!this.f32189h && !h()) {
                z10 = false;
                if (!z10) {
                    hs.k kVar = hs.k.f19476a;
                } else {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
            }
            z10 = true;
            if (!z10) {
            }
        }
        return this.f32191j;
    }

    public final boolean h() {
        boolean z10;
        if ((this.f32183a & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32184b.f32127u == z10) {
            return true;
        }
        return false;
    }

    public final synchronized boolean i() {
        if (this.f32194m != null) {
            return false;
        }
        b bVar = this.f32190i;
        if (bVar.f32201v || bVar.f32204y) {
            a aVar = this.f32191j;
            if (aVar.f32196u || aVar.f32198w) {
                if (this.f32189h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0008, B:8:0x0010, B:11:0x001f, B:12:0x0023, B:9:0x0016), top: B:20:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(lv.s headers, boolean z10) {
        boolean i6;
        kotlin.jvm.internal.i.g(headers, "headers");
        byte[] bArr = mv.b.f25755a;
        synchronized (this) {
            if (this.f32189h && z10) {
                this.f32190i.getClass();
                if (z10) {
                    this.f32190i.f32201v = true;
                }
                i6 = i();
                notifyAll();
                hs.k kVar = hs.k.f19476a;
            }
            this.f32189h = true;
            this.f32188g.add(headers);
            if (z10) {
            }
            i6 = i();
            notifyAll();
            hs.k kVar2 = hs.k.f19476a;
        }
        if (!i6) {
            this.f32184b.j(this.f32183a);
        }
    }

    public final synchronized void k(sv.a aVar) {
        if (this.f32194m == null) {
            this.f32194m = aVar;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
