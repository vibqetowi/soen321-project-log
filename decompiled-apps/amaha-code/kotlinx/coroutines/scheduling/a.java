package kotlinx.coroutines.scheduling;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.r;
import r1.b0;
/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes2.dex */
public final class a implements Executor, Closeable {
    public final o<C0362a> A;
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: u  reason: collision with root package name */
    public final int f23654u;

    /* renamed from: v  reason: collision with root package name */
    public final int f23655v;

    /* renamed from: w  reason: collision with root package name */
    public final long f23656w;

    /* renamed from: x  reason: collision with root package name */
    public final String f23657x;

    /* renamed from: y  reason: collision with root package name */
    public final d f23658y;

    /* renamed from: z  reason: collision with root package name */
    public final d f23659z;
    public static final r E = new r("NOT_IN_STACK");
    public static final /* synthetic */ AtomicLongFieldUpdater B = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater C = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: kotlinx.coroutines.scheduling.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0362a extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(C0362a.class, "workerCtl");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: u  reason: collision with root package name */
        public final l f23660u;

        /* renamed from: v  reason: collision with root package name */
        public int f23661v;

        /* renamed from: w  reason: collision with root package name */
        public long f23662w;
        volatile /* synthetic */ int workerCtl;

        /* renamed from: x  reason: collision with root package name */
        public long f23663x;

        /* renamed from: y  reason: collision with root package name */
        public int f23664y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f23665z;

        public C0362a() {
            throw null;
        }

        public C0362a(int i6) {
            setDaemon(true);
            this.f23660u = new l();
            this.f23661v = 4;
            this.workerCtl = 0;
            this.nextParkedWorker = a.E;
            this.f23664y = vs.c.f36135u.b();
            f(i6);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final g a(boolean z10) {
            boolean z11;
            g d10;
            g gVar;
            g e10;
            g e11;
            boolean z12;
            boolean z13 = true;
            if (this.f23661v != 1) {
                a aVar = a.this;
                while (true) {
                    long j10 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        z12 = false;
                        break;
                    } else if (a.C.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                        z12 = true;
                        break;
                    }
                }
                if (z12) {
                    this.f23661v = 1;
                } else {
                    z11 = false;
                    if (!z11) {
                        if (z10) {
                            if (d(a.this.f23654u * 2) != 0) {
                                z13 = false;
                            }
                            if (!z13 || (e11 = e()) == null) {
                                l lVar = this.f23660u;
                                lVar.getClass();
                                g gVar2 = (g) l.f23681b.getAndSet(lVar, null);
                                if (gVar2 == null) {
                                    gVar = lVar.d();
                                } else {
                                    gVar = gVar2;
                                }
                                if (gVar == null) {
                                    if (!z13 && (e10 = e()) != null) {
                                        return e10;
                                    }
                                } else {
                                    return gVar;
                                }
                            } else {
                                return e11;
                            }
                        } else {
                            g e12 = e();
                            if (e12 != null) {
                                return e12;
                            }
                        }
                        return i(false);
                    }
                    if (z10) {
                        l lVar2 = this.f23660u;
                        lVar2.getClass();
                        d10 = (g) l.f23681b.getAndSet(lVar2, null);
                        if (d10 == null) {
                            d10 = lVar2.d();
                        }
                        if (d10 == null) {
                            d10 = a.this.f23659z.d();
                        }
                    } else {
                        d10 = a.this.f23659z.d();
                    }
                    if (d10 == null) {
                        return i(true);
                    }
                    return d10;
                }
            }
            z11 = true;
            if (!z11) {
            }
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i6) {
            int i10 = this.f23664y;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.f23664y = i13;
            int i14 = i6 - 1;
            if ((i14 & i6) == 0) {
                return i13 & i14;
            }
            return (i13 & SubsamplingScaleImageView.TILE_SIZE_AUTO) % i6;
        }

        public final g e() {
            int d10 = d(2);
            a aVar = a.this;
            if (d10 == 0) {
                g d11 = aVar.f23658y.d();
                if (d11 != null) {
                    return d11;
                }
                return aVar.f23659z.d();
            }
            g d12 = aVar.f23659z.d();
            if (d12 != null) {
                return d12;
            }
            return aVar.f23658y.d();
        }

        public final void f(int i6) {
            String valueOf;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f23657x);
            sb2.append("-worker-");
            if (i6 == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i6);
            }
            sb2.append(valueOf);
            setName(sb2.toString());
            this.indexInArray = i6;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i6) {
            int i10 = this.f23661v;
            boolean z10 = true;
            if (i10 != 1) {
                z10 = false;
            }
            if (z10) {
                a.C.addAndGet(a.this, 4398046511104L);
            }
            if (i10 != i6) {
                this.f23661v = i6;
            }
            return z10;
        }

        public final g i(boolean z10) {
            long f;
            int i6 = (int) (a.this.controlState & 2097151);
            if (i6 < 2) {
                return null;
            }
            int d10 = d(i6);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < i6; i10++) {
                d10++;
                if (d10 > i6) {
                    d10 = 1;
                }
                C0362a b10 = aVar.A.b(d10);
                if (b10 != null && b10 != this) {
                    if (z10) {
                        f = this.f23660u.e(b10.f23660u);
                    } else {
                        l lVar = this.f23660u;
                        l lVar2 = b10.f23660u;
                        lVar.getClass();
                        g d11 = lVar2.d();
                        if (d11 != null) {
                            lVar.a(d11, false);
                            f = -1;
                        } else {
                            f = lVar.f(lVar2, false);
                        }
                    }
                    if (f == -1) {
                        l lVar3 = this.f23660u;
                        lVar3.getClass();
                        g gVar = (g) l.f23681b.getAndSet(lVar3, null);
                        if (gVar == null) {
                            return lVar3.d();
                        }
                        return gVar;
                    } else if (f > 0) {
                        j10 = Math.min(j10, f);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f23663x = j10;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0062 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0002 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            boolean z10;
            boolean z11;
            loop0: while (true) {
                boolean z12 = false;
                while (!a.this.isTerminated() && this.f23661v != 5) {
                    g a10 = a(this.f23665z);
                    if (a10 != null) {
                        this.f23663x = 0L;
                        int d10 = a10.f23672v.d();
                        this.f23662w = 0L;
                        if (this.f23661v == 3) {
                            this.f23661v = 2;
                        }
                        a aVar = a.this;
                        if (d10 != 0 && h(2) && !aVar.m() && !aVar.j(aVar.controlState)) {
                            aVar.m();
                        }
                        aVar.getClass();
                        try {
                            a10.run();
                        } finally {
                            if (d10 == 0) {
                            }
                        }
                        if (d10 == 0) {
                            a.C.addAndGet(aVar, -2097152L);
                            if (this.f23661v != 5) {
                                this.f23661v = 4;
                            }
                        }
                    } else {
                        this.f23665z = false;
                        if (this.f23663x != 0) {
                            if (!z12) {
                                z12 = true;
                            } else {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f23663x);
                                this.f23663x = 0L;
                            }
                        } else {
                            if (this.nextParkedWorker != a.E) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                a.this.g(this);
                            } else {
                                this.workerCtl = -1;
                                while (true) {
                                    if (this.nextParkedWorker != a.E) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11 && this.workerCtl == -1 && !a.this.isTerminated() && this.f23661v != 5) {
                                        h(3);
                                        Thread.interrupted();
                                        if (this.f23662w == 0) {
                                            this.f23662w = System.nanoTime() + a.this.f23656w;
                                        }
                                        LockSupport.parkNanos(a.this.f23656w);
                                        if (System.nanoTime() - this.f23662w >= 0) {
                                            this.f23662w = 0L;
                                            a aVar2 = a.this;
                                            synchronized (aVar2.A) {
                                                if (!aVar2.isTerminated()) {
                                                    if (((int) (aVar2.controlState & 2097151)) > aVar2.f23654u) {
                                                        if (B.compareAndSet(this, -1, 1)) {
                                                            int i6 = this.indexInArray;
                                                            f(0);
                                                            aVar2.h(this, i6, 0);
                                                            int andDecrement = (int) (a.C.getAndDecrement(aVar2) & 2097151);
                                                            if (andDecrement != i6) {
                                                                C0362a b10 = aVar2.A.b(andDecrement);
                                                                kotlin.jvm.internal.i.d(b10);
                                                                C0362a c0362a = b10;
                                                                aVar2.A.c(i6, c0362a);
                                                                c0362a.f(i6);
                                                                aVar2.h(c0362a, andDecrement, i6);
                                                            }
                                                            aVar2.A.c(andDecrement, null);
                                                            hs.k kVar = hs.k.f19476a;
                                                            this.f23661v = 5;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            h(5);
        }
    }

    public a(long j10, String str, int i6, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f23654u = i6;
        this.f23655v = i10;
        this.f23656w = j10;
        this.f23657x = str;
        if (i6 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= i6) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i10 <= 2097150) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (j10 > 0) {
                        this.f23658y = new d();
                        this.f23659z = new d();
                        this.parkedWorkersStack = 0L;
                        this.A = new o<>(i6 + 1);
                        this.controlState = i6 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(defpackage.c.q("Max pool size ", i10, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(defpackage.b.j("Max pool size ", i10, " should be greater than or equals to core pool size ", i6).toString());
        }
        throw new IllegalArgumentException(defpackage.c.q("Core pool size ", i6, " should be at least 1").toString());
    }

    public final int a() {
        boolean z10;
        synchronized (this.A) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j10 = this.controlState;
            int i6 = (int) (j10 & 2097151);
            int i10 = i6 - ((int) ((j10 & 4398044413952L) >> 21));
            boolean z11 = false;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i10 >= this.f23654u) {
                return 0;
            }
            if (i6 >= this.f23655v) {
                return 0;
            }
            int i11 = ((int) (this.controlState & 2097151)) + 1;
            if (i11 > 0 && this.A.b(i11) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                C0362a c0362a = new C0362a(i11);
                this.A.c(i11, c0362a);
                if (i11 == ((int) (2097151 & C.incrementAndGet(this)))) {
                    z11 = true;
                }
                if (z11) {
                    c0362a.start();
                    return i10 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[LOOP:0: B:21:0x0033->B:35:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0076 A[EDGE_INSN: B:64:0x0076->B:36:0x0076 ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        C0362a c0362a;
        int i6;
        g d10;
        boolean z10;
        if (D.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            if (currentThread instanceof C0362a) {
                c0362a = (C0362a) currentThread;
            } else {
                c0362a = null;
            }
            if (c0362a == null || !kotlin.jvm.internal.i.b(a.this, this)) {
                c0362a = null;
            }
            synchronized (this.A) {
                i6 = (int) (this.controlState & 2097151);
            }
            if (1 <= i6) {
                int i10 = 1;
                while (true) {
                    C0362a b10 = this.A.b(i10);
                    kotlin.jvm.internal.i.d(b10);
                    C0362a c0362a2 = b10;
                    if (c0362a2 != c0362a) {
                        while (c0362a2.isAlive()) {
                            LockSupport.unpark(c0362a2);
                            c0362a2.join(10000L);
                        }
                        l lVar = c0362a2.f23660u;
                        d dVar = this.f23659z;
                        lVar.getClass();
                        g gVar = (g) l.f23681b.getAndSet(lVar, null);
                        if (gVar != null) {
                            dVar.a(gVar);
                        }
                        do {
                            g d11 = lVar.d();
                            if (d11 == null) {
                                z10 = false;
                                continue;
                            } else {
                                dVar.a(d11);
                                z10 = true;
                                continue;
                            }
                        } while (z10);
                        if (i10 != i6) {
                            break;
                        }
                        i10++;
                    } else if (i10 != i6) {
                    }
                }
            }
            this.f23659z.b();
            this.f23658y.b();
            while (true) {
                if (c0362a != null) {
                    d10 = c0362a.a(true);
                }
                d10 = this.f23658y.d();
                if (d10 == null && (d10 = this.f23659z.d()) == null) {
                    break;
                }
                try {
                    d10.run();
                } finally {
                }
            }
            if (c0362a != null) {
                c0362a.h(5);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void e(Runnable runnable, h hVar, boolean z10) {
        g iVar;
        C0362a c0362a;
        g gVar;
        boolean z11;
        boolean a10;
        j.f23678e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            iVar = (g) runnable;
            iVar.f23671u = nanoTime;
            iVar.f23672v = hVar;
        } else {
            iVar = new i(runnable, nanoTime, hVar);
        }
        Thread currentThread = Thread.currentThread();
        C0362a c0362a2 = null;
        if (currentThread instanceof C0362a) {
            c0362a = (C0362a) currentThread;
        } else {
            c0362a = null;
        }
        if (c0362a != null && kotlin.jvm.internal.i.b(a.this, this)) {
            c0362a2 = c0362a;
        }
        boolean z12 = true;
        if (c0362a2 == null || c0362a2.f23661v == 5 || (iVar.f23672v.d() == 0 && c0362a2.f23661v == 2)) {
            gVar = iVar;
        } else {
            c0362a2.f23665z = true;
            gVar = c0362a2.f23660u.a(iVar, z10);
        }
        if (gVar != null) {
            if (gVar.f23672v.d() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                a10 = this.f23659z.a(gVar);
            } else {
                a10 = this.f23658y.a(gVar);
            }
            if (!a10) {
                throw new RejectedExecutionException(b0.b(new StringBuilder(), this.f23657x, " was terminated"));
            }
        }
        z12 = (!z10 || c0362a2 == null) ? false : false;
        if (iVar.f23672v.d() == 0) {
            if (!z12 && !m() && !j(this.controlState)) {
                m();
                return;
            }
            return;
        }
        long addAndGet = C.addAndGet(this, 2097152L);
        if (!z12 && !m() && !j(addAndGet)) {
            m();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(runnable, j.f, false);
    }

    public final void g(C0362a c0362a) {
        long j10;
        int b10;
        if (c0362a.c() != E) {
            return;
        }
        do {
            j10 = this.parkedWorkersStack;
            b10 = c0362a.b();
            c0362a.g(this.A.b((int) (2097151 & j10)));
        } while (!B.compareAndSet(this, j10, b10 | ((2097152 + j10) & (-2097152))));
    }

    public final void h(C0362a c0362a, int i6, int i10) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i11 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i11 == i6) {
                if (i10 == 0) {
                    Object c10 = c0362a.c();
                    while (true) {
                        if (c10 == E) {
                            i11 = -1;
                            break;
                        } else if (c10 == null) {
                            i11 = 0;
                            break;
                        } else {
                            C0362a c0362a2 = (C0362a) c10;
                            i11 = c0362a2.b();
                            if (i11 != 0) {
                                break;
                            }
                            c10 = c0362a2.c();
                        }
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0 && B.compareAndSet(this, j10, j11 | i11)) {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final boolean j(long j10) {
        int i6 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i6 < 0) {
            i6 = 0;
        }
        int i10 = this.f23654u;
        if (i6 < i10) {
            int a10 = a();
            if (a10 == 1 && i10 > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        r rVar;
        int i6;
        while (true) {
            long j10 = this.parkedWorkersStack;
            C0362a b10 = this.A.b((int) (2097151 & j10));
            if (b10 == null) {
                b10 = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object c10 = b10.c();
                while (true) {
                    rVar = E;
                    if (c10 == rVar) {
                        i6 = -1;
                        break;
                    } else if (c10 == null) {
                        i6 = 0;
                        break;
                    } else {
                        C0362a c0362a = (C0362a) c10;
                        i6 = c0362a.b();
                        if (i6 != 0) {
                            break;
                        }
                        c10 = c0362a.c();
                    }
                }
                if (i6 >= 0 && B.compareAndSet(this, j10, i6 | j11)) {
                    b10.g(rVar);
                }
            }
            if (b10 == null) {
                return false;
            }
            if (C0362a.B.compareAndSet(b10, -1, 0)) {
                LockSupport.unpark(b10);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.A.a();
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < a10; i14++) {
            C0362a b10 = this.A.b(i14);
            if (b10 != null) {
                int c10 = b10.f23660u.c();
                int d10 = v.h.d(b10.f23661v);
                if (d10 != 0) {
                    if (d10 != 1) {
                        if (d10 != 2) {
                            if (d10 != 3) {
                                if (d10 == 4) {
                                    i13++;
                                }
                            } else {
                                i12++;
                                if (c10 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(c10);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        i10++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c10);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i6++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(c10);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                }
            }
        }
        long j10 = this.controlState;
        return this.f23657x + '@' + e0.q(this) + "[Pool Size {core = " + this.f23654u + ", max = " + this.f23655v + "}, Worker States {CPU = " + i6 + ", blocking = " + i10 + ", parked = " + i11 + ", dormant = " + i12 + ", terminated = " + i13 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f23658y.c() + ", global blocking queue size = " + this.f23659z.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f23654u - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }
}
