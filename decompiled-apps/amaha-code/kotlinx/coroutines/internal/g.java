package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.e0;
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23595u = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_next");

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23596v = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_prev");

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23597w = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes2.dex */
    public static abstract class a extends kotlinx.coroutines.internal.a<g> {

        /* renamed from: b  reason: collision with root package name */
        public final g f23598b;

        /* renamed from: c  reason: collision with root package name */
        public g f23599c;

        public a(g gVar) {
            this.f23598b = gVar;
        }

        @Override // kotlinx.coroutines.internal.a
        public final void b(g gVar, Object obj) {
            boolean z10;
            g gVar2;
            g gVar3 = gVar;
            boolean z11 = false;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g gVar4 = this.f23598b;
            if (z10) {
                gVar2 = gVar4;
            } else {
                gVar2 = this.f23599c;
            }
            if (gVar2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g.f23595u;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(gVar3, this, gVar2)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(gVar3) != this) {
                        break;
                    }
                }
                if (z11 && z10) {
                    g gVar5 = this.f23599c;
                    kotlin.jvm.internal.i.d(gVar5);
                    gVar4.m(gVar5);
                }
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.q {
        public b(Object obj) {
            super(obj);
        }

        public final Object o() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    public final int A(g gVar, g gVar2, a aVar) {
        boolean z10;
        f23596v.lazySet(gVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23595u;
        atomicReferenceFieldUpdater.lazySet(gVar, gVar2);
        aVar.f23599c = gVar2;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, gVar2, aVar)) {
                z10 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != gVar2) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return 0;
        }
        if (aVar.a(this) == null) {
            return 1;
        }
        return 2;
    }

    public final boolean k(g gVar, f fVar) {
        boolean z10;
        f23596v.lazySet(gVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23595u;
        atomicReferenceFieldUpdater.lazySet(gVar, fVar);
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, fVar, gVar)) {
                z10 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != fVar) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return false;
        }
        gVar.m(fVar);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003e, code lost:
        r7 = kotlinx.coroutines.internal.g.f23595u;
        r4 = ((kotlinx.coroutines.internal.n) r4).f23612a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
        if (r7.compareAndSet(r3, r1, r4) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
        if (r7.get(r3) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r5 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g l() {
        while (true) {
            g gVar = (g) this._prev;
            g gVar2 = gVar;
            while (true) {
                g gVar3 = null;
                while (true) {
                    Object obj = gVar2._next;
                    boolean z10 = true;
                    if (obj == this) {
                        if (gVar == gVar2) {
                            return gVar2;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23596v;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, gVar, gVar2)) {
                                if (atomicReferenceFieldUpdater.get(this) != gVar) {
                                    z10 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z10) {
                            return gVar2;
                        }
                    } else if (v()) {
                        return null;
                    } else {
                        if (obj == null) {
                            return gVar2;
                        }
                        if (obj instanceof m) {
                            ((m) obj).a(gVar2);
                            break;
                        } else if (obj instanceof n) {
                            if (gVar3 != null) {
                                break;
                            }
                            gVar2 = (g) gVar2._prev;
                        } else {
                            gVar3 = gVar2;
                            gVar2 = (g) obj;
                        }
                    }
                }
                gVar2 = gVar3;
            }
        }
    }

    public final void m(g gVar) {
        boolean z10;
        do {
            g gVar2 = (g) gVar._prev;
            if (o() != gVar) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23596v;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(gVar, gVar2, this)) {
                    z10 = true;
                    continue;
                    break;
                } else if (atomicReferenceFieldUpdater.get(gVar) != gVar2) {
                    z10 = false;
                    continue;
                    break;
                }
            }
        } while (!z10);
        if (v()) {
            gVar.l();
        }
    }

    public final Object o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof m)) {
                return obj;
            }
            ((m) obj).a(this);
        }
    }

    public final g p() {
        n nVar;
        g gVar;
        Object o10 = o();
        if (o10 instanceof n) {
            nVar = (n) o10;
        } else {
            nVar = null;
        }
        if (nVar == null || (gVar = nVar.f23612a) == null) {
            return (g) o10;
        }
        return gVar;
    }

    public final g s() {
        g l2 = l();
        if (l2 == null) {
            Object obj = this._prev;
            while (true) {
                l2 = (g) obj;
                if (!l2.v()) {
                    break;
                }
                obj = l2._prev;
            }
        }
        return l2;
    }

    public final void t() {
        g gVar = this;
        while (true) {
            Object o10 = gVar.o();
            if (o10 instanceof n) {
                gVar = ((n) o10).f23612a;
            } else {
                gVar.l();
                return;
            }
        }
    }

    public String toString() {
        return new b(this) + '@' + e0.q(this);
    }

    public boolean v() {
        return o() instanceof n;
    }

    public boolean w() {
        if (z() == null) {
            return true;
        }
        return false;
    }

    public final g z() {
        g gVar;
        boolean z10;
        do {
            Object o10 = o();
            if (o10 instanceof n) {
                return ((n) o10).f23612a;
            }
            if (o10 == this) {
                return (g) o10;
            }
            gVar = (g) o10;
            n nVar = (n) gVar._removedRef;
            if (nVar == null) {
                nVar = new n(gVar);
                f23597w.lazySet(gVar, nVar);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23595u;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, o10, nVar)) {
                    z10 = true;
                    continue;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != o10) {
                    z10 = false;
                    continue;
                    break;
                }
            }
        } while (!z10);
        gVar.l();
        return null;
    }
}
