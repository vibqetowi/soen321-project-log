package pv;

import hs.k;
import is.q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import lv.d0;
import lv.m;
import lv.o;
import lv.t;
import lv.x;
import lv.z;
import ta.q6;
/* compiled from: RealCall.kt */
/* loaded from: classes2.dex */
public final class d implements lv.e {
    public final AtomicBoolean A;
    public Object B;
    public pv.c C;
    public e D;
    public boolean E;
    public pv.b F;
    public boolean G;
    public boolean H;
    public boolean I;
    public volatile boolean J;
    public volatile pv.b K;
    public volatile e L;

    /* renamed from: u  reason: collision with root package name */
    public final x f29048u;

    /* renamed from: v  reason: collision with root package name */
    public final z f29049v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f29050w;

    /* renamed from: x  reason: collision with root package name */
    public final i f29051x;

    /* renamed from: y  reason: collision with root package name */
    public final o f29052y;

    /* renamed from: z  reason: collision with root package name */
    public final c f29053z;

    /* compiled from: RealCall.kt */
    /* loaded from: classes2.dex */
    public final class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final lv.f f29054u;

        /* renamed from: v  reason: collision with root package name */
        public volatile AtomicInteger f29055v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ d f29056w;

        public a(d this$0, q6 q6Var) {
            kotlin.jvm.internal.i.g(this$0, "this$0");
            this.f29056w = this$0;
            this.f29054u = q6Var;
            this.f29055v = new AtomicInteger(0);
        }

        @Override // java.lang.Runnable
        public final void run() {
            t.a aVar;
            x xVar;
            t tVar = this.f29056w.f29049v.f24751a;
            tVar.getClass();
            try {
                aVar = new t.a();
                aVar.d(tVar, "/...");
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            kotlin.jvm.internal.i.d(aVar);
            aVar.f24696b = t.b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
            aVar.f24697c = t.b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
            String n10 = kotlin.jvm.internal.i.n(aVar.a().f24693i, "OkHttp ");
            d dVar = this.f29056w;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(n10);
            try {
                dVar.f29053z.h();
                boolean z10 = false;
                try {
                    z10 = true;
                    this.f29054u.b(dVar, dVar.e());
                    xVar = dVar.f29048u;
                } catch (IOException e10) {
                    if (z10) {
                        uv.h hVar = uv.h.f34614a;
                        uv.h hVar2 = uv.h.f34614a;
                        String n11 = kotlin.jvm.internal.i.n(d.a(dVar), "Callback failure for ");
                        hVar2.getClass();
                        uv.h.i(4, n11, e10);
                    } else {
                        this.f29054u.a(dVar, e10);
                    }
                    xVar = dVar.f29048u;
                }
                xVar.f24720u.b(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    /* loaded from: classes2.dex */
    public static final class b extends WeakReference<d> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f29057a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d referent, Object obj) {
            super(referent);
            kotlin.jvm.internal.i.g(referent, "referent");
            this.f29057a = obj;
        }
    }

    /* compiled from: RealCall.kt */
    /* loaded from: classes2.dex */
    public static final class c extends zv.a {
        public c() {
        }

        @Override // zv.a
        public final void k() {
            d.this.cancel();
        }
    }

    public d(x client, z originalRequest, boolean z10) {
        kotlin.jvm.internal.i.g(client, "client");
        kotlin.jvm.internal.i.g(originalRequest, "originalRequest");
        this.f29048u = client;
        this.f29049v = originalRequest;
        this.f29050w = z10;
        this.f29051x = (i) client.f24721v.f16400v;
        o this_asFactory = (o) client.f24724y.f17396v;
        byte[] bArr = mv.b.f25755a;
        kotlin.jvm.internal.i.g(this_asFactory, "$this_asFactory");
        this.f29052y = this_asFactory;
        c cVar = new c();
        cVar.g(0, TimeUnit.MILLISECONDS);
        this.f29053z = cVar;
        this.A = new AtomicBoolean();
        this.I = true;
    }

    public static final String a(d dVar) {
        String str;
        String str2;
        t.a aVar;
        StringBuilder sb2 = new StringBuilder();
        if (dVar.J) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (dVar.f29050w) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb2.append(str2);
        sb2.append(" to ");
        t tVar = dVar.f29049v.f24751a;
        tVar.getClass();
        try {
            aVar = new t.a();
            aVar.d(tVar, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        kotlin.jvm.internal.i.d(aVar);
        aVar.f24696b = t.b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        aVar.f24697c = t.b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        sb2.append(aVar.a().f24693i);
        return sb2.toString();
    }

    @Override // lv.e
    public final void O(q6 q6Var) {
        a aVar;
        if (this.A.compareAndSet(false, true)) {
            uv.h hVar = uv.h.f34614a;
            this.B = uv.h.f34614a.g();
            this.f29052y.getClass();
            m mVar = this.f29048u.f24720u;
            a aVar2 = new a(this, q6Var);
            mVar.getClass();
            synchronized (mVar) {
                mVar.f24665b.add(aVar2);
                d dVar = aVar2.f29056w;
                if (!dVar.f29050w) {
                    String str = dVar.f29049v.f24751a.f24689d;
                    Iterator<a> it = mVar.f24666c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            aVar = it.next();
                            if (kotlin.jvm.internal.i.b(aVar.f29056w.f29049v.f24751a.f24689d, str)) {
                                break;
                            }
                        } else {
                            Iterator<a> it2 = mVar.f24665b.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    aVar = it2.next();
                                    if (kotlin.jvm.internal.i.b(aVar.f29056w.f29049v.f24751a.f24689d, str)) {
                                        break;
                                    }
                                } else {
                                    aVar = null;
                                    break;
                                }
                            }
                        }
                    }
                    if (aVar != null) {
                        aVar2.f29055v = aVar.f29055v;
                    }
                }
                k kVar = k.f19476a;
            }
            mVar.g();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void b(e eVar) {
        boolean z10;
        byte[] bArr = mv.b.f25755a;
        if (this.D == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.D = eVar;
            eVar.f29072p.add(new b(this, this.B));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final <E extends IOException> E c(E e10) {
        E e11;
        Socket i6;
        boolean z10;
        byte[] bArr = mv.b.f25755a;
        e eVar = this.D;
        if (eVar != null) {
            synchronized (eVar) {
                i6 = i();
            }
            if (this.D == null) {
                if (i6 != null) {
                    mv.b.e(i6);
                }
                this.f29052y.getClass();
            } else {
                if (i6 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (this.E || !this.f29053z.i()) {
            e11 = e10;
        } else {
            e11 = new InterruptedIOException("timeout");
            if (e10 != null) {
                e11.initCause(e10);
            }
        }
        if (e10 != null) {
            o oVar = this.f29052y;
            kotlin.jvm.internal.i.d(e11);
            oVar.getClass();
        } else {
            this.f29052y.getClass();
        }
        return e11;
    }

    @Override // lv.e
    public final void cancel() {
        Socket socket;
        if (this.J) {
            return;
        }
        this.J = true;
        pv.b bVar = this.K;
        if (bVar != null) {
            bVar.f29027d.cancel();
        }
        e eVar = this.L;
        if (eVar != null && (socket = eVar.f29060c) != null) {
            mv.b.e(socket);
        }
        this.f29052y.getClass();
    }

    public final Object clone() {
        return new d(this.f29048u, this.f29049v, this.f29050w);
    }

    public final void d(boolean z10) {
        pv.b bVar;
        synchronized (this) {
            if (this.I) {
                k kVar = k.f19476a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (bVar = this.K) != null) {
            bVar.f29027d.cancel();
            bVar.f29024a.f(bVar, true, true, null);
        }
        this.F = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d0 e() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        q.R1(this.f29048u.f24722w, arrayList);
        arrayList.add(new qv.h(this.f29048u));
        arrayList.add(new qv.a(this.f29048u.D));
        arrayList.add(new nv.a(this.f29048u.E));
        arrayList.add(pv.a.f29023a);
        if (!this.f29050w) {
            q.R1(this.f29048u.f24723x, arrayList);
        }
        arrayList.add(new qv.b(this.f29050w));
        z zVar = this.f29049v;
        x xVar = this.f29048u;
        try {
            d0 c10 = new qv.f(this, arrayList, 0, null, zVar, xVar.Q, xVar.R, xVar.S).c(this.f29049v);
            if (!this.J) {
                h(null);
                return c10;
            }
            mv.b.d(c10);
            throw new IOException("Canceled");
        } catch (IOException e10) {
            try {
                IOException h10 = h(e10);
                if (h10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw h10;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    h(null);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
            if (!z10) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <E extends IOException> E f(pv.b exchange, boolean z10, boolean z11, E e10) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        kotlin.jvm.internal.i.g(exchange, "exchange");
        if (!kotlin.jvm.internal.i.b(exchange, this.K)) {
            return e10;
        }
        synchronized (this) {
            z12 = false;
            if (z10) {
                try {
                    if (!this.G) {
                    }
                    if (z10) {
                        this.G = false;
                    }
                    if (z11) {
                        this.H = false;
                    }
                    z14 = this.G;
                    if (z14 && !this.H) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z14 && !this.H && !this.I) {
                        z12 = true;
                    }
                    z13 = z12;
                    z12 = z15;
                    k kVar = k.f19476a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z11 || !this.H) {
                z13 = false;
                k kVar2 = k.f19476a;
            }
            if (z10) {
            }
            if (z11) {
            }
            z14 = this.G;
            if (z14) {
            }
            z15 = false;
            if (!z14) {
                z12 = true;
            }
            z13 = z12;
            z12 = z15;
            k kVar22 = k.f19476a;
        }
        if (z12) {
            this.K = null;
            e eVar = this.D;
            if (eVar != null) {
                eVar.h();
            }
        }
        if (z13) {
            return (E) c(e10);
        }
        return e10;
    }

    @Override // lv.e
    public final d0 g() {
        if (this.A.compareAndSet(false, true)) {
            this.f29053z.h();
            uv.h hVar = uv.h.f34614a;
            this.B = uv.h.f34614a.g();
            this.f29052y.getClass();
            try {
                m mVar = this.f29048u.f24720u;
                synchronized (mVar) {
                    mVar.f24667d.add(this);
                }
                return e();
            } finally {
                this.f29048u.f24720u.c(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final IOException h(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.I) {
                this.I = false;
                if (!this.G && !this.H) {
                    z10 = true;
                }
            }
            k kVar = k.f19476a;
        }
        if (z10) {
            return c(iOException);
        }
        return iOException;
    }

    public final Socket i() {
        boolean z10;
        e eVar = this.D;
        kotlin.jvm.internal.i.d(eVar);
        byte[] bArr = mv.b.f25755a;
        ArrayList arrayList = eVar.f29072p;
        Iterator it = arrayList.iterator();
        boolean z11 = false;
        int i6 = 0;
        while (true) {
            if (it.hasNext()) {
                if (kotlin.jvm.internal.i.b(((Reference) it.next()).get(), this)) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.remove(i6);
            this.D = null;
            if (arrayList.isEmpty()) {
                eVar.f29073q = System.nanoTime();
                i iVar = this.f29051x;
                iVar.getClass();
                byte[] bArr2 = mv.b.f25755a;
                boolean z12 = eVar.f29066j;
                ov.c cVar = iVar.f29082c;
                if (!z12 && iVar.f29080a != 0) {
                    cVar.c(iVar.f29083d, 0L);
                } else {
                    eVar.f29066j = true;
                    ConcurrentLinkedQueue<e> concurrentLinkedQueue = iVar.f29084e;
                    concurrentLinkedQueue.remove(eVar);
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar.a();
                    }
                    z11 = true;
                }
                if (z11) {
                    Socket socket = eVar.f29061d;
                    kotlin.jvm.internal.i.d(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // lv.e
    public final boolean o() {
        return this.J;
    }

    @Override // lv.e
    public final z s() {
        return this.f29049v;
    }
}
