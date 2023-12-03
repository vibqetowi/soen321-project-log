package sv;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.v;
import sv.p;
import sv.q;
/* compiled from: Http2Connection.kt */
/* loaded from: classes2.dex */
public final class e implements Closeable {
    public static final u V;
    public boolean A;
    public final ov.d B;
    public final ov.c C;
    public final ov.c D;
    public final ov.c E;
    public final ca.a F;
    public long G;
    public long H;
    public long I;
    public long J;
    public long K;
    public final u L;
    public u M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public final Socket R;
    public final r S;
    public final c T;
    public final LinkedHashSet U;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f32127u;

    /* renamed from: v  reason: collision with root package name */
    public final b f32128v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f32129w;

    /* renamed from: x  reason: collision with root package name */
    public final String f32130x;

    /* renamed from: y  reason: collision with root package name */
    public int f32131y;

    /* renamed from: z  reason: collision with root package name */
    public int f32132z;

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f32133a;

        /* renamed from: b  reason: collision with root package name */
        public final ov.d f32134b;

        /* renamed from: c  reason: collision with root package name */
        public Socket f32135c;

        /* renamed from: d  reason: collision with root package name */
        public String f32136d;

        /* renamed from: e  reason: collision with root package name */
        public zv.h f32137e;
        public zv.g f;

        /* renamed from: g  reason: collision with root package name */
        public b f32138g;

        /* renamed from: h  reason: collision with root package name */
        public final ca.a f32139h;

        /* renamed from: i  reason: collision with root package name */
        public int f32140i;

        public a(ov.d taskRunner) {
            kotlin.jvm.internal.i.g(taskRunner, "taskRunner");
            this.f32133a = true;
            this.f32134b = taskRunner;
            this.f32138g = b.f32141a;
            this.f32139h = t.f32219s;
        }
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f32141a = new a();

        /* compiled from: Http2Connection.kt */
        /* loaded from: classes2.dex */
        public static final class a extends b {
            @Override // sv.e.b
            public final void b(q stream) {
                kotlin.jvm.internal.i.g(stream, "stream");
                stream.c(sv.a.REFUSED_STREAM, null);
            }
        }

        public void a(e connection, u settings) {
            kotlin.jvm.internal.i.g(connection, "connection");
            kotlin.jvm.internal.i.g(settings, "settings");
        }

        public abstract void b(q qVar);
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes2.dex */
    public static final class d extends ov.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e f32144e;
        public final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, e eVar, long j10) {
            super(str, true);
            this.f32144e = eVar;
            this.f = j10;
        }

        @Override // ov.a
        public final long a() {
            e eVar;
            boolean z10;
            synchronized (this.f32144e) {
                eVar = this.f32144e;
                long j10 = eVar.H;
                long j11 = eVar.G;
                if (j10 < j11) {
                    z10 = true;
                } else {
                    eVar.G = j11 + 1;
                    z10 = false;
                }
            }
            if (z10) {
                eVar.e(null);
                return -1L;
            }
            try {
                eVar.S.i(1, 0, false);
            } catch (IOException e10) {
                eVar.e(e10);
            }
            return this.f;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: sv.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0542e extends ov.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e f32145e;
        public final /* synthetic */ int f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ sv.a f32146g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0542e(String str, e eVar, int i6, sv.a aVar) {
            super(str, true);
            this.f32145e = eVar;
            this.f = i6;
            this.f32146g = aVar;
        }

        @Override // ov.a
        public final long a() {
            e eVar = this.f32145e;
            try {
                int i6 = this.f;
                sv.a statusCode = this.f32146g;
                eVar.getClass();
                kotlin.jvm.internal.i.g(statusCode, "statusCode");
                eVar.S.j(i6, statusCode);
                return -1L;
            } catch (IOException e10) {
                eVar.e(e10);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes2.dex */
    public static final class f extends ov.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e f32147e;
        public final /* synthetic */ int f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f32148g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, e eVar, int i6, long j10) {
            super(str, true);
            this.f32147e = eVar;
            this.f = i6;
            this.f32148g = j10;
        }

        @Override // ov.a
        public final long a() {
            e eVar = this.f32147e;
            try {
                eVar.S.f(this.f, this.f32148g);
                return -1L;
            } catch (IOException e10) {
                eVar.e(e10);
                return -1L;
            }
        }
    }

    static {
        u uVar = new u();
        uVar.c(7, 65535);
        uVar.c(5, 16384);
        V = uVar;
    }

    public e(a aVar) {
        int i6;
        boolean z10 = aVar.f32133a;
        this.f32127u = z10;
        this.f32128v = aVar.f32138g;
        this.f32129w = new LinkedHashMap();
        String str = aVar.f32136d;
        if (str != null) {
            this.f32130x = str;
            if (z10) {
                i6 = 3;
            } else {
                i6 = 2;
            }
            this.f32132z = i6;
            ov.d dVar = aVar.f32134b;
            this.B = dVar;
            ov.c f2 = dVar.f();
            this.C = f2;
            this.D = dVar.f();
            this.E = dVar.f();
            this.F = aVar.f32139h;
            u uVar = new u();
            if (z10) {
                uVar.c(7, 16777216);
            }
            this.L = uVar;
            u uVar2 = V;
            this.M = uVar2;
            this.Q = uVar2.a();
            Socket socket = aVar.f32135c;
            if (socket != null) {
                this.R = socket;
                zv.g gVar = aVar.f;
                if (gVar != null) {
                    this.S = new r(gVar, z10);
                    zv.h hVar = aVar.f32137e;
                    if (hVar != null) {
                        this.T = new c(this, new p(hVar, z10));
                        this.U = new LinkedHashSet();
                        int i10 = aVar.f32140i;
                        if (i10 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(i10);
                            f2.c(new d(kotlin.jvm.internal.i.n(" ping", str), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("source");
                    throw null;
                }
                kotlin.jvm.internal.i.q("sink");
                throw null;
            }
            kotlin.jvm.internal.i.q("socket");
            throw null;
        }
        kotlin.jvm.internal.i.q("connectionName");
        throw null;
    }

    public final void G(int i6, sv.a aVar) {
        this.C.c(new C0542e(this.f32130x + '[' + i6 + "] writeSynReset", this, i6, aVar), 0L);
    }

    public final void I(int i6, long j10) {
        this.C.c(new f(this.f32130x + '[' + i6 + "] windowUpdate", this, i6, j10), 0L);
    }

    public final void a(sv.a aVar, sv.a aVar2, IOException iOException) {
        int i6;
        Object[] objArr;
        byte[] bArr = mv.b.f25755a;
        try {
            m(aVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f32129w.isEmpty()) {
                objArr = this.f32129w.values().toArray(new q[0]);
                if (objArr != null) {
                    this.f32129w.clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            } else {
                objArr = null;
            }
            hs.k kVar = hs.k.f19476a;
        }
        q[] qVarArr = (q[]) objArr;
        if (qVarArr != null) {
            for (q qVar : qVarArr) {
                try {
                    qVar.c(aVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.S.close();
        } catch (IOException unused3) {
        }
        try {
            this.R.close();
        } catch (IOException unused4) {
        }
        this.C.f();
        this.D.f();
        this.E.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(sv.a.NO_ERROR, sv.a.CANCEL, null);
    }

    public final void e(IOException iOException) {
        sv.a aVar = sv.a.PROTOCOL_ERROR;
        a(aVar, aVar, iOException);
    }

    public final void flush() {
        this.S.flush();
    }

    public final synchronized q g(int i6) {
        return (q) this.f32129w.get(Integer.valueOf(i6));
    }

    public final synchronized boolean h(long j10) {
        if (this.A) {
            return false;
        }
        if (this.J < this.I) {
            if (j10 >= this.K) {
                return false;
            }
        }
        return true;
    }

    public final synchronized q j(int i6) {
        q qVar;
        qVar = (q) this.f32129w.remove(Integer.valueOf(i6));
        notifyAll();
        return qVar;
    }

    public final void m(sv.a aVar) {
        synchronized (this.S) {
            v vVar = new v();
            synchronized (this) {
                if (this.A) {
                    return;
                }
                this.A = true;
                int i6 = this.f32131y;
                vVar.f23467u = i6;
                hs.k kVar = hs.k.f19476a;
                this.S.g(i6, aVar, mv.b.f25755a);
            }
        }
    }

    public final synchronized void o(long j10) {
        long j11 = this.N + j10;
        this.N = j11;
        long j12 = j11 - this.O;
        if (j12 >= this.L.a() / 2) {
            I(0, j12);
            this.O += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.S.f32210x);
        r6 = r3;
        r8.P += r6;
        r4 = hs.k.f19476a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(int i6, boolean z10, zv.e eVar, long j10) {
        int min;
        long j11;
        boolean z11;
        if (j10 == 0) {
            this.S.P(z10, i6, eVar, 0);
            return;
        }
        loop0: while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        long j12 = this.P;
                        long j13 = this.Q;
                        if (j12 < j13) {
                            break;
                        } else if (!this.f32129w.containsKey(Integer.valueOf(i6))) {
                            break loop0;
                        } else {
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
            }
            j10 -= j11;
            r rVar = this.S;
            if (z10 && j10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            rVar.P(z11, i6, eVar, min);
        }
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes2.dex */
    public final class c implements p.c, ss.a<hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final p f32142u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ e f32143v;

        public c(e this$0, p pVar) {
            kotlin.jvm.internal.i.g(this$0, "this$0");
            this.f32143v = this$0;
            this.f32142u = pVar;
        }

        @Override // sv.p.c
        public final void f(int i6, long j10) {
            if (i6 == 0) {
                e eVar = this.f32143v;
                synchronized (eVar) {
                    eVar.Q += j10;
                    eVar.notifyAll();
                    hs.k kVar = hs.k.f19476a;
                }
                return;
            }
            q g5 = this.f32143v.g(i6);
            if (g5 != null) {
                synchronized (g5) {
                    g5.f += j10;
                    if (j10 > 0) {
                        g5.notifyAll();
                    }
                    hs.k kVar2 = hs.k.f19476a;
                }
            }
        }

        @Override // sv.p.c
        public final void i(int i6, int i10, boolean z10) {
            if (z10) {
                e eVar = this.f32143v;
                synchronized (eVar) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                eVar.notifyAll();
                            }
                            hs.k kVar = hs.k.f19476a;
                        } else {
                            eVar.J++;
                        }
                    } else {
                        eVar.H++;
                    }
                }
                return;
            }
            e eVar2 = this.f32143v;
            eVar2.C.c(new h(kotlin.jvm.internal.i.n(" ping", eVar2.f32130x), this.f32143v, i6, i10), 0L);
        }

        @Override // ss.a
        public final hs.k invoke() {
            Throwable th2;
            sv.a aVar;
            e eVar = this.f32143v;
            p pVar = this.f32142u;
            sv.a aVar2 = sv.a.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                pVar.e(this);
                while (pVar.a(false, this)) {
                }
                aVar = sv.a.NO_ERROR;
                try {
                    try {
                        eVar.a(aVar, sv.a.CANCEL, null);
                    } catch (IOException e11) {
                        e10 = e11;
                        sv.a aVar3 = sv.a.PROTOCOL_ERROR;
                        eVar.a(aVar3, aVar3, e10);
                        mv.b.d(pVar);
                        return hs.k.f19476a;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    eVar.a(aVar, aVar2, e10);
                    mv.b.d(pVar);
                    throw th2;
                }
            } catch (IOException e12) {
                e10 = e12;
                aVar = aVar2;
            } catch (Throwable th4) {
                th2 = th4;
                aVar = aVar2;
                eVar.a(aVar, aVar2, e10);
                mv.b.d(pVar);
                throw th2;
            }
            mv.b.d(pVar);
            return hs.k.f19476a;
        }

        @Override // sv.p.c
        public final void j(u uVar) {
            e eVar = this.f32143v;
            eVar.C.c(new i(kotlin.jvm.internal.i.n(" applyAndAckSettings", eVar.f32130x), this, uVar), 0L);
        }

        @Override // sv.p.c
        public final void k(int i6, List list) {
            e eVar = this.f32143v;
            eVar.getClass();
            synchronized (eVar) {
                if (eVar.U.contains(Integer.valueOf(i6))) {
                    eVar.G(i6, sv.a.PROTOCOL_ERROR);
                    return;
                }
                eVar.U.add(Integer.valueOf(i6));
                ov.c cVar = eVar.D;
                cVar.c(new l(eVar.f32130x + '[' + i6 + "] onRequest", eVar, i6, list), 0L);
            }
        }

        @Override // sv.p.c
        public final void m(int i6, sv.a aVar, zv.i debugData) {
            int i10;
            Object[] array;
            kotlin.jvm.internal.i.g(debugData, "debugData");
            debugData.h();
            e eVar = this.f32143v;
            synchronized (eVar) {
                i10 = 0;
                array = eVar.f32129w.values().toArray(new q[0]);
                if (array != null) {
                    eVar.A = true;
                    hs.k kVar = hs.k.f19476a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
            q[] qVarArr = (q[]) array;
            int length = qVarArr.length;
            while (i10 < length) {
                q qVar = qVarArr[i10];
                i10++;
                if (qVar.f32183a > i6 && qVar.h()) {
                    qVar.k(sv.a.REFUSED_STREAM);
                    this.f32143v.j(qVar.f32183a);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
            if (r21 == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f7, code lost:
            r5.j(mv.b.f25756b, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
            return;
         */
        @Override // sv.p.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void o(int i6, int i10, zv.h source, boolean z10) {
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            long j10;
            kotlin.jvm.internal.i.g(source, "source");
            this.f32143v.getClass();
            if (i6 != 0 && (i6 & 1) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                e eVar = this.f32143v;
                eVar.getClass();
                zv.e eVar2 = new zv.e();
                long j11 = i10;
                source.C0(j11);
                source.o0(eVar2, j11);
                eVar.D.c(new j(eVar.f32130x + '[' + i6 + "] onData", eVar, i6, eVar2, i10, z10), 0L);
                return;
            }
            q g5 = this.f32143v.g(i6);
            if (g5 == null) {
                this.f32143v.G(i6, sv.a.PROTOCOL_ERROR);
                long j12 = i10;
                this.f32143v.o(j12);
                source.skip(j12);
                return;
            }
            byte[] bArr = mv.b.f25755a;
            q.b bVar = g5.f32190i;
            long j13 = i10;
            bVar.getClass();
            while (true) {
                if (j13 <= 0) {
                    break;
                }
                synchronized (bVar.f32205z) {
                    z12 = bVar.f32201v;
                    if (bVar.f32203x.f39885v + j13 > bVar.f32200u) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    hs.k kVar = hs.k.f19476a;
                }
                if (z13) {
                    source.skip(j13);
                    bVar.f32205z.e(sv.a.FLOW_CONTROL_ERROR);
                    break;
                } else if (z12) {
                    source.skip(j13);
                    break;
                } else {
                    long o02 = source.o0(bVar.f32202w, j13);
                    if (o02 != -1) {
                        j13 -= o02;
                        q qVar = bVar.f32205z;
                        synchronized (qVar) {
                            if (bVar.f32204y) {
                                zv.e eVar3 = bVar.f32202w;
                                j10 = eVar3.f39885v;
                                eVar3.a();
                            } else {
                                zv.e eVar4 = bVar.f32203x;
                                if (eVar4.f39885v == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                eVar4.K0(bVar.f32202w);
                                if (z14) {
                                    qVar.notifyAll();
                                }
                                j10 = 0;
                            }
                        }
                        if (j10 > 0) {
                            bVar.a(j10);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        @Override // sv.p.c
        public final void s(int i6, List list, boolean z10) {
            boolean z11;
            this.f32143v.getClass();
            if (i6 != 0 && (i6 & 1) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                e eVar = this.f32143v;
                eVar.getClass();
                eVar.D.c(new k(eVar.f32130x + '[' + i6 + "] onHeaders", eVar, i6, list, z10), 0L);
                return;
            }
            e eVar2 = this.f32143v;
            synchronized (eVar2) {
                q g5 = eVar2.g(i6);
                if (g5 == null) {
                    if (eVar2.A) {
                        return;
                    }
                    if (i6 <= eVar2.f32131y) {
                        return;
                    }
                    if (i6 % 2 == eVar2.f32132z % 2) {
                        return;
                    }
                    q qVar = new q(i6, eVar2, false, z10, mv.b.v(list));
                    eVar2.f32131y = i6;
                    eVar2.f32129w.put(Integer.valueOf(i6), qVar);
                    ov.c f = eVar2.B.f();
                    f.c(new g(eVar2.f32130x + '[' + i6 + "] onStream", eVar2, qVar), 0L);
                    return;
                }
                hs.k kVar = hs.k.f19476a;
                g5.j(mv.b.v(list), z10);
            }
        }

        @Override // sv.p.c
        public final void t(int i6, sv.a aVar) {
            boolean z10;
            e eVar = this.f32143v;
            eVar.getClass();
            if (i6 != 0 && (i6 & 1) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                eVar.D.c(new m(eVar.f32130x + '[' + i6 + "] onReset", eVar, i6, aVar), 0L);
                return;
            }
            q j10 = eVar.j(i6);
            if (j10 != null) {
                j10.k(aVar);
            }
        }

        @Override // sv.p.c
        public final void l() {
        }

        @Override // sv.p.c
        public final void p() {
        }
    }
}
