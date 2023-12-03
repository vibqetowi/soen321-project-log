package wr;

import com.theinnerhour.b2b.utils.Constants;
import java.io.IOException;
import java.net.Socket;
import vr.a3;
import wr.b;
import zv.a0;
import zv.x;
/* compiled from: AsyncSink.java */
/* loaded from: classes2.dex */
public final class a implements x {
    public x C;
    public Socket D;
    public boolean E;
    public int F;
    public int G;

    /* renamed from: w  reason: collision with root package name */
    public final a3 f37076w;

    /* renamed from: x  reason: collision with root package name */
    public final b.a f37077x;

    /* renamed from: y  reason: collision with root package name */
    public final int f37078y;

    /* renamed from: u  reason: collision with root package name */
    public final Object f37074u = new Object();

    /* renamed from: v  reason: collision with root package name */
    public final zv.e f37075v = new zv.e();

    /* renamed from: z  reason: collision with root package name */
    public boolean f37079z = false;
    public boolean A = false;
    public boolean B = false;

    /* compiled from: AsyncSink.java */
    /* renamed from: wr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0624a extends e {
        public C0624a() {
            super();
            fs.b.a();
        }

        @Override // wr.a.e
        public final void a() {
            a aVar;
            int i6;
            fs.b.c();
            fs.b.f15847a.getClass();
            zv.e eVar = new zv.e();
            try {
                synchronized (a.this.f37074u) {
                    zv.e eVar2 = a.this.f37075v;
                    eVar.n(eVar2, eVar2.h());
                    aVar = a.this;
                    aVar.f37079z = false;
                    i6 = aVar.G;
                }
                aVar.C.n(eVar, eVar.f39885v);
                synchronized (a.this.f37074u) {
                    a.this.G -= i6;
                }
            } finally {
                fs.b.e();
            }
        }
    }

    /* compiled from: AsyncSink.java */
    /* loaded from: classes2.dex */
    public class b extends e {
        public b() {
            super();
            fs.b.a();
        }

        @Override // wr.a.e
        public final void a() {
            a aVar;
            fs.b.c();
            fs.b.f15847a.getClass();
            zv.e eVar = new zv.e();
            try {
                synchronized (a.this.f37074u) {
                    zv.e eVar2 = a.this.f37075v;
                    eVar.n(eVar2, eVar2.f39885v);
                    aVar = a.this;
                    aVar.A = false;
                }
                aVar.C.n(eVar, eVar.f39885v);
                a.this.C.flush();
            } finally {
                fs.b.e();
            }
        }
    }

    /* compiled from: AsyncSink.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            try {
                x xVar = aVar.C;
                if (xVar != null) {
                    zv.e eVar = aVar.f37075v;
                    long j10 = eVar.f39885v;
                    if (j10 > 0) {
                        xVar.n(eVar, j10);
                    }
                }
            } catch (IOException e10) {
                aVar.f37077x.a(e10);
            }
            zv.e eVar2 = aVar.f37075v;
            b.a aVar2 = aVar.f37077x;
            eVar2.getClass();
            try {
                x xVar2 = aVar.C;
                if (xVar2 != null) {
                    xVar2.close();
                }
            } catch (IOException e11) {
                aVar2.a(e11);
            }
            try {
                Socket socket = aVar.D;
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e12) {
                aVar2.a(e12);
            }
        }
    }

    /* compiled from: AsyncSink.java */
    /* loaded from: classes2.dex */
    public class d extends wr.c {
        public d(yr.c cVar) {
            super(cVar);
        }

        @Override // yr.c
        public final void N(int i6, yr.a aVar) {
            a.this.F++;
            this.f37089u.N(i6, aVar);
        }

        @Override // yr.c
        public final void g0(hg.a aVar) {
            a.this.F++;
            this.f37089u.g0(aVar);
        }

        @Override // yr.c
        public final void i(int i6, int i10, boolean z10) {
            if (z10) {
                a.this.F++;
            }
            this.f37089u.i(i6, i10, z10);
        }
    }

    /* compiled from: AsyncSink.java */
    /* loaded from: classes2.dex */
    public abstract class e implements Runnable {
        public e() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            try {
                if (aVar.C != null) {
                    a();
                    return;
                }
                throw new IOException("Unable to perform write due to unavailable sink.");
            } catch (Exception e10) {
                aVar.f37077x.a(e10);
            }
        }
    }

    public a(a3 a3Var, b.a aVar) {
        sc.b.w(a3Var, "executor");
        this.f37076w = a3Var;
        sc.b.w(aVar, "exceptionHandler");
        this.f37077x = aVar;
        this.f37078y = Constants.TIMEOUT_MS;
    }

    public final void a(zv.b bVar, Socket socket) {
        boolean z10;
        if (this.C == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("AsyncSink's becomeConnected should only be called once.", z10);
        this.C = bVar;
        this.D = socket;
    }

    @Override // zv.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.B) {
            return;
        }
        this.B = true;
        this.f37076w.execute(new c());
    }

    @Override // zv.x
    public final a0 d() {
        return a0.f39875d;
    }

    @Override // zv.x, java.io.Flushable
    public final void flush() {
        if (!this.B) {
            fs.b.c();
            try {
                synchronized (this.f37074u) {
                    if (this.A) {
                        return;
                    }
                    this.A = true;
                    this.f37076w.execute(new b());
                    return;
                }
            } finally {
                fs.b.e();
            }
        }
        throw new IOException("closed");
    }

    @Override // zv.x
    public final void n(zv.e eVar, long j10) {
        sc.b.w(eVar, "source");
        if (!this.B) {
            fs.b.c();
            try {
                synchronized (this.f37074u) {
                    this.f37075v.n(eVar, j10);
                    int i6 = this.G + this.F;
                    this.G = i6;
                    boolean z10 = false;
                    this.F = 0;
                    if (!this.E && i6 > this.f37078y) {
                        this.E = true;
                        z10 = true;
                    } else {
                        if (!this.f37079z && !this.A && this.f37075v.h() > 0) {
                            this.f37079z = true;
                        }
                        return;
                    }
                    if (z10) {
                        try {
                            this.D.close();
                        } catch (IOException e10) {
                            this.f37077x.a(e10);
                        }
                        return;
                    }
                    this.f37076w.execute(new C0624a());
                    return;
                }
            } finally {
                fs.b.e();
            }
        }
        throw new IOException("closed");
    }
}
