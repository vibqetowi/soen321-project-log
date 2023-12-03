package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public abstract class s0 extends t0 implements j0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_queue");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes2.dex */
    public final class a extends b {

        /* renamed from: w  reason: collision with root package name */
        public final j<hs.k> f23649w;

        public a(long j10, k kVar) {
            super(j10);
            this.f23649w = kVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f23649w.k(s0.this, hs.k.f19476a);
        }

        @Override // kotlinx.coroutines.s0.b
        public final String toString() {
            return super.toString() + this.f23649w;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes2.dex */
    public static abstract class b implements Runnable, Comparable<b>, p0, kotlinx.coroutines.internal.v {
        private volatile Object _heap;

        /* renamed from: u  reason: collision with root package name */
        public long f23651u;

        /* renamed from: v  reason: collision with root package name */
        public int f23652v = -1;

        public b(long j10) {
            this.f23651u = j10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            int i6 = ((this.f23651u - bVar.f23651u) > 0L ? 1 : ((this.f23651u - bVar.f23651u) == 0L ? 0 : -1));
            if (i6 > 0) {
                return 1;
            }
            if (i6 < 0) {
                return -1;
            }
            return 0;
        }

        @Override // kotlinx.coroutines.internal.v
        public final kotlinx.coroutines.internal.u<?> f() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.u) {
                return (kotlinx.coroutines.internal.u) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.v
        public final int getIndex() {
            return this.f23652v;
        }

        @Override // kotlinx.coroutines.internal.v
        public final void h(c cVar) {
            boolean z10;
            if (this._heap != f6.b.F) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this._heap = cVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.p0
        public final synchronized void i() {
            c cVar;
            Object obj = this._heap;
            kotlinx.coroutines.internal.r rVar = f6.b.F;
            if (obj == rVar) {
                return;
            }
            if (obj instanceof c) {
                cVar = (c) obj;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                cVar.d(this);
            }
            this._heap = rVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [T extends kotlinx.coroutines.internal.v & java.lang.Comparable<? super T>[]] */
        /* JADX WARN: Type inference failed for: r0v5 */
        public final synchronized int j(long j10, c cVar, s0 s0Var) {
            b bVar;
            if (this._heap == f6.b.F) {
                return 2;
            }
            synchronized (cVar) {
                ?? r02 = cVar.f23624a;
                if (r02 != 0) {
                    bVar = r02[0];
                } else {
                    bVar = null;
                }
                b bVar2 = bVar;
                if (s0.S0(s0Var)) {
                    return 1;
                }
                if (bVar2 == null) {
                    cVar.f23653b = j10;
                } else {
                    long j11 = bVar2.f23651u;
                    if (j11 - j10 < 0) {
                        j10 = j11;
                    }
                    if (j10 - cVar.f23653b > 0) {
                        cVar.f23653b = j10;
                    }
                }
                long j12 = this.f23651u;
                long j13 = cVar.f23653b;
                if (j12 - j13 < 0) {
                    this.f23651u = j13;
                }
                cVar.a(this);
                return 0;
            }
        }

        @Override // kotlinx.coroutines.internal.v
        public final void setIndex(int i6) {
            this.f23652v = i6;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f23651u + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlinx.coroutines.internal.u<b> {

        /* renamed from: b  reason: collision with root package name */
        public long f23653b;

        public c(long j10) {
            this.f23653b = j10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    public static final boolean S0(s0 s0Var) {
        return s0Var._isCompleted;
    }

    @Override // kotlinx.coroutines.j0
    public final void J(long j10, k kVar) {
        long j11 = 0;
        if (j10 > 0) {
            if (j10 >= 9223372036854L) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = 1000000 * j10;
            }
        }
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j11 + nanoTime, kVar);
            X0(nanoTime, aVar);
            kVar.p(new g(1, aVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0097 A[EDGE_INSN: B:105:0x0097->B:64:0x0097 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b9  */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlinx.coroutines.s0, kotlinx.coroutines.r0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v3, types: [T extends kotlinx.coroutines.internal.v & java.lang.Comparable<? super T>[]] */
    @Override // kotlinx.coroutines.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long O0() {
        Object obj;
        long j10;
        b c10;
        boolean z10;
        b bVar;
        boolean z11;
        boolean z12;
        b bVar2;
        if (P0()) {
            return 0L;
        }
        c cVar = (c) this._delayed;
        Runnable runnable = null;
        boolean z13 = true;
        if (cVar != null && !cVar.b()) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (cVar) {
                    ?? r82 = cVar.f23624a;
                    if (r82 != 0) {
                        bVar = r82[0];
                    } else {
                        bVar = null;
                    }
                    if (bVar == null) {
                        bVar2 = null;
                    } else {
                        b bVar3 = bVar;
                        if (nanoTime - bVar3.f23651u >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z12 = U0(bVar3);
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            bVar2 = cVar.e(0);
                        } else {
                            bVar2 = null;
                        }
                    }
                }
            } while (bVar2 != null);
            while (true) {
                obj = this._queue;
                if (obj == null) {
                }
            }
            if (runnable == null) {
            }
        } else {
            while (true) {
                obj = this._queue;
                if (obj == null) {
                    break;
                } else if (obj instanceof kotlinx.coroutines.internal.i) {
                    kotlinx.coroutines.internal.i iVar = (kotlinx.coroutines.internal.i) obj;
                    Object f = iVar.f();
                    if (f != kotlinx.coroutines.internal.i.f23602g) {
                        runnable = (Runnable) f;
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
                    kotlinx.coroutines.internal.i e10 = iVar.e();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e10) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (obj == f6.b.G) {
                    break;
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                            z10 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        runnable = (Runnable) obj;
                        break;
                    }
                }
            }
            if (runnable == null) {
                runnable.run();
                return 0L;
            }
            jg.b bVar4 = this.f23648y;
            if (bVar4 != null) {
                if (bVar4.f22014b != bVar4.f22015c) {
                    z13 = false;
                }
                if (!z13) {
                    j10 = 0;
                    if (j10 != 0) {
                        return 0L;
                    }
                    Object obj2 = this._queue;
                    if (obj2 != null) {
                        if (obj2 instanceof kotlinx.coroutines.internal.i) {
                            if (!((kotlinx.coroutines.internal.i) obj2).d()) {
                                return 0L;
                            }
                        } else {
                            if (obj2 != f6.b.G) {
                                return 0L;
                            }
                            return Long.MAX_VALUE;
                        }
                    }
                    c cVar2 = (c) this._delayed;
                    if (cVar2 != null && (c10 = cVar2.c()) != null) {
                        long nanoTime2 = c10.f23651u - System.nanoTime();
                        if (nanoTime2 < 0) {
                            return 0L;
                        }
                        return nanoTime2;
                    }
                    return Long.MAX_VALUE;
                }
            }
            j10 = Long.MAX_VALUE;
            if (j10 != 0) {
            }
        }
    }

    public void T0(Runnable runnable) {
        if (U0(runnable)) {
            Thread Q0 = Q0();
            if (Thread.currentThread() != Q0) {
                LockSupport.unpark(Q0);
                return;
            }
            return;
        }
        f0.C.T0(runnable);
    }

    public final boolean U0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z10 = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.i) {
                kotlinx.coroutines.internal.i iVar = (kotlinx.coroutines.internal.i) obj;
                int a10 = iVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 != 1) {
                    if (a10 == 2) {
                        return false;
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A;
                    kotlinx.coroutines.internal.i e10 = iVar.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e10) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                }
            } else if (obj == f6.b.G) {
                return false;
            } else {
                kotlinx.coroutines.internal.i iVar2 = new kotlinx.coroutines.internal.i(8, true);
                iVar2.a((Runnable) obj);
                iVar2.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = A;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, iVar2)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
    }

    public final boolean V0() {
        boolean z10;
        jg.b bVar = this.f23648y;
        if (bVar != null && bVar.f22014b != bVar.f22015c) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.i) {
                return ((kotlinx.coroutines.internal.i) obj).d();
            }
            if (obj != f6.b.G) {
                return false;
            }
        }
        return true;
    }

    public final void W0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void X0(long j10, b bVar) {
        int j11;
        Thread Q0;
        b bVar2 = null;
        boolean z10 = true;
        if (this._isCompleted != 0) {
            j11 = 1;
        } else {
            c cVar = (c) this._delayed;
            if (cVar == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                c cVar2 = new c(j10);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                kotlin.jvm.internal.i.d(obj);
                cVar = (c) obj;
            }
            j11 = bVar.j(j10, cVar, this);
        }
        if (j11 != 0) {
            if (j11 != 1) {
                if (j11 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            R0(j10, bVar);
            return;
        }
        c cVar3 = (c) this._delayed;
        if (cVar3 != null) {
            bVar2 = cVar3.c();
        }
        if (bVar2 != bVar) {
            z10 = false;
        }
        if (z10 && Thread.currentThread() != (Q0 = Q0())) {
            LockSupport.unpark(Q0);
        }
    }

    @Override // kotlinx.coroutines.a0
    public final void f0(ls.f fVar, Runnable runnable) {
        T0(runnable);
    }

    @Override // kotlinx.coroutines.r0
    public void shutdown() {
        b f;
        ThreadLocal<r0> threadLocal = t1.f23701a;
        t1.f23701a.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            kotlinx.coroutines.internal.r rVar = f6.b.G;
            boolean z10 = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, rVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.i) {
                ((kotlinx.coroutines.internal.i) obj).b();
                break;
            } else if (obj == rVar) {
                break;
            } else {
                kotlinx.coroutines.internal.i iVar = new kotlinx.coroutines.internal.i(8, true);
                iVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, iVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            }
        }
        do {
        } while (O0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            if (cVar != null && (f = cVar.f()) != null) {
                R0(nanoTime, f);
            } else {
                return;
            }
        }
    }
}
