package kotlinx.coroutines.sync;

import hs.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.f;
import kotlinx.coroutines.internal.g;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.j;
import kotlinx.coroutines.p0;
import ss.l;
import ta.v;
/* compiled from: Mutex.kt */
/* loaded from: classes2.dex */
public final class c implements kotlinx.coroutines.sync.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23687a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    /* compiled from: Mutex.kt */
    /* loaded from: classes2.dex */
    public final class a extends b {

        /* renamed from: z  reason: collision with root package name */
        public final j<k> f23688z;

        /* compiled from: Mutex.kt */
        /* renamed from: kotlinx.coroutines.sync.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0363a extends kotlin.jvm.internal.k implements l<Throwable, k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ c f23689u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ a f23690v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0363a(c cVar, a aVar) {
                super(1);
                this.f23689u = cVar;
                this.f23690v = aVar;
            }

            @Override // ss.l
            public final k invoke(Throwable th2) {
                this.f23689u.a(this.f23690v.f23692x);
                return k.f19476a;
            }
        }

        public a(kotlinx.coroutines.k kVar) {
            this.f23688z = kVar;
        }

        @Override // kotlinx.coroutines.sync.c.b
        public final void B() {
            this.f23688z.i();
        }

        @Override // kotlinx.coroutines.sync.c.b
        public final boolean C() {
            if (!b.f23691y.compareAndSet(this, 0, 1)) {
                return false;
            }
            if (this.f23688z.c(k.f19476a, new C0363a(c.this, this)) == null) {
                return false;
            }
            return true;
        }

        @Override // kotlinx.coroutines.internal.g
        public final String toString() {
            return "LockCont[" + this.f23692x + ", " + this.f23688z + "] for " + c.this;
        }
    }

    /* compiled from: Mutex.kt */
    /* loaded from: classes2.dex */
    public abstract class b extends g implements p0 {

        /* renamed from: y  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f23691y = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");

        /* renamed from: x  reason: collision with root package name */
        public final Object f23692x = null;
        private volatile /* synthetic */ int isTaken = 0;

        public abstract void B();

        public abstract boolean C();

        @Override // kotlinx.coroutines.p0
        public final void i() {
            w();
        }
    }

    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.sync.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0364c extends f {
        public volatile Object owner;

        public C0364c(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.g
        public final String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* compiled from: Mutex.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlinx.coroutines.internal.a<c> {

        /* renamed from: b  reason: collision with root package name */
        public final C0364c f23693b;

        public d(C0364c c0364c) {
            this.f23693b = c0364c;
        }

        @Override // kotlinx.coroutines.internal.a
        public final void b(c cVar, Object obj) {
            Object obj2;
            c cVar2 = cVar;
            if (obj == null) {
                obj2 = hc.d.f17367a0;
            } else {
                obj2 = this.f23693b;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f23687a;
            while (!atomicReferenceFieldUpdater.compareAndSet(cVar2, this, obj2) && atomicReferenceFieldUpdater.get(cVar2) == this) {
            }
        }

        @Override // kotlinx.coroutines.internal.a
        public final r c(Object obj) {
            boolean z10;
            c cVar = (c) obj;
            C0364c c0364c = this.f23693b;
            if (c0364c.o() == c0364c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            return hc.d.W;
        }
    }

    public c(boolean z10) {
        kotlinx.coroutines.sync.a aVar;
        if (z10) {
            aVar = hc.d.Z;
        } else {
            aVar = hc.d.f17367a0;
        }
        this._state = aVar;
    }

    @Override // kotlinx.coroutines.sync.b
    public final void a(Object obj) {
        boolean z10;
        boolean z11;
        g gVar;
        boolean z12;
        while (true) {
            Object obj2 = this._state;
            boolean z13 = true;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                if (obj == null) {
                    if (((kotlinx.coroutines.sync.a) obj2).f23686a != hc.d.Y) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.sync.a aVar = (kotlinx.coroutines.sync.a) obj2;
                    if (aVar.f23686a == obj) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException(("Mutex is locked by " + aVar.f23686a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23687a;
                kotlinx.coroutines.sync.a aVar2 = hc.d.f17367a0;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z13 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z13) {
                    return;
                }
            } else if (obj2 instanceof m) {
                ((m) obj2).a(this);
            } else if (obj2 instanceof C0364c) {
                if (obj != null) {
                    C0364c c0364c = (C0364c) obj2;
                    if (c0364c.owner == obj) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalStateException(("Mutex is locked by " + c0364c.owner + " but expected " + obj).toString());
                    }
                }
                C0364c c0364c2 = (C0364c) obj2;
                while (true) {
                    gVar = (g) c0364c2.o();
                    if (gVar == c0364c2) {
                        gVar = null;
                        break;
                    } else if (gVar.w()) {
                        break;
                    } else {
                        ((n) gVar.o()).f23612a.t();
                    }
                }
                if (gVar == null) {
                    d dVar = new d(c0364c2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23687a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, dVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z13 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z13 && dVar.a(this) == null) {
                        return;
                    }
                } else {
                    b bVar = (b) gVar;
                    if (bVar.C()) {
                        Object obj3 = bVar.f23692x;
                        if (obj3 == null) {
                            obj3 = hc.d.X;
                        }
                        c0364c2.owner = obj3;
                        bVar.B();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00be, code lost:
        r12.p(new kotlinx.coroutines.p1(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c6, code lost:
        r12 = r12.s();
        r0 = ms.a.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
        if (r12 != r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cf, code lost:
        r12 = hs.k.f19476a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
        if (r12 != r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d6, code lost:
        return hs.k.f19476a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ls.d dVar) {
        kotlinx.coroutines.sync.a aVar;
        r rVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        while (true) {
            Object obj = this._state;
            boolean z15 = obj instanceof kotlinx.coroutines.sync.a;
            aVar = hc.d.Z;
            rVar = hc.d.Y;
            if (z15) {
                if (((kotlinx.coroutines.sync.a) obj).f23686a != rVar) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23687a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, aVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    z11 = true;
                    break;
                }
            } else if (obj instanceof C0364c) {
                if (((C0364c) obj).owner != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    throw new IllegalStateException("Already locked by null".toString());
                }
            } else if (obj instanceof m) {
                ((m) obj).a(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
        z11 = false;
        if (z11) {
            return k.f19476a;
        }
        kotlinx.coroutines.k y10 = v.y(ca.a.G0(dVar));
        a aVar2 = new a(y10);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) obj2;
                if (aVar3.f23686a != rVar) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23687a;
                    C0364c c0364c = new C0364c(aVar3.f23686a);
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c0364c) && atomicReferenceFieldUpdater2.get(this) == obj2) {
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f23687a;
                    while (true) {
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, obj2, aVar)) {
                            z12 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                            z12 = false;
                            break;
                        }
                    }
                    if (z12) {
                        y10.v(new kotlinx.coroutines.sync.d(this), k.f19476a);
                        break;
                    }
                }
            } else if (obj2 instanceof C0364c) {
                C0364c c0364c2 = (C0364c) obj2;
                if (c0364c2.owner != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    do {
                    } while (!c0364c2.s().k(aVar2, c0364c2));
                    if (this._state == obj2 || !b.f23691y.compareAndSet(aVar2, 0, 1)) {
                        break;
                    }
                    aVar2 = new a(y10);
                } else {
                    throw new IllegalStateException("Already locked by null".toString());
                }
            } else if (obj2 instanceof m) {
                ((m) obj2).a(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public final String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.a) {
                return "Mutex[" + ((kotlinx.coroutines.sync.a) obj).f23686a + ']';
            } else if (obj instanceof m) {
                ((m) obj).a(this);
            } else if (obj instanceof C0364c) {
                return "Mutex[" + ((C0364c) obj).owner + ']';
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}
