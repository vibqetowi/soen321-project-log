package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.c1;
/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes2.dex */
public class k<T> extends m0<T> implements j<T>, ns.d {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(k.class, "_decision");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: x  reason: collision with root package name */
    public final ls.d<T> f23630x;

    /* renamed from: y  reason: collision with root package name */
    public final ls.f f23631y;

    /* renamed from: z  reason: collision with root package name */
    public p0 f23632z;

    public k(int i6, ls.d dVar) {
        super(i6);
        this.f23630x = dVar;
        this.f23631y = dVar.getContext();
        this._decision = 0;
        this._state = b.f23485u;
    }

    public static void A(ss.l lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public static Object E(n1 n1Var, Object obj, int i6, ss.l lVar, Object obj2) {
        h hVar;
        if (!(obj instanceof u)) {
            boolean z10 = true;
            if (i6 != 1 && i6 != 2) {
                z10 = false;
            }
            if (z10 || obj2 != null) {
                if (lVar != null || (((n1Var instanceof h) && !(n1Var instanceof d)) || obj2 != null)) {
                    if (n1Var instanceof h) {
                        hVar = (h) n1Var;
                    } else {
                        hVar = null;
                    }
                    return new t(obj, hVar, lVar, obj2, null, 16);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final boolean C() {
        Object obj = this._state;
        if ((obj instanceof t) && ((t) obj).f23699d != null) {
            o();
            return false;
        }
        this._decision = 0;
        this._state = b.f23485u;
        return true;
    }

    public final void D(Object obj, int i6, ss.l<? super Throwable, hs.k> lVar) {
        boolean z10;
        do {
            Object obj2 = this._state;
            z10 = true;
            if (obj2 instanceof n1) {
                Object E = E((n1) obj2, obj, i6, lVar, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z10 = false;
                            continue;
                            break;
                        }
                    }
                }
            } else {
                if (obj2 instanceof l) {
                    l lVar2 = (l) obj2;
                    lVar2.getClass();
                    if (l.f23634c.compareAndSet(lVar2, 0, 1)) {
                        if (lVar != null) {
                            n(lVar, lVar2.f23703a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!z10);
        if (!z()) {
            o();
        }
        q(i6);
    }

    public final kotlinx.coroutines.internal.r F(Object obj, Object obj2, ss.l<? super Throwable, hs.k> lVar) {
        kotlinx.coroutines.internal.r rVar;
        boolean z10;
        do {
            Object obj3 = this._state;
            boolean z11 = obj3 instanceof n1;
            rVar = sc.b.I;
            if (z11) {
                Object E = E((n1) obj3, obj, this.f23637w, lVar, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, E)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
            } else if (!(obj3 instanceof t)) {
                return null;
            } else {
                if (obj2 == null || ((t) obj3).f23699d != obj2) {
                    return null;
                }
                return rVar;
            }
        } while (!z10);
        if (!z()) {
            o();
        }
        return rVar;
    }

    @Override // kotlinx.coroutines.j
    public final boolean a() {
        return this._state instanceof n1;
    }

    @Override // kotlinx.coroutines.m0
    public final void b(Object obj, CancellationException cancellationException) {
        boolean z10;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof n1)) {
                if (obj2 instanceof u) {
                    return;
                }
                boolean z11 = false;
                if (obj2 instanceof t) {
                    t tVar = (t) obj2;
                    if (tVar.f23700e != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        t a10 = t.a(tVar, null, cancellationException, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                z11 = true;
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        if (z11) {
                            h hVar = tVar.f23697b;
                            if (hVar != null) {
                                l(hVar, cancellationException);
                            }
                            ss.l<Throwable, hs.k> lVar = tVar.f23698c;
                            if (lVar != null) {
                                n(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
                    t tVar2 = new t(obj2, null, null, null, cancellationException, 14);
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, tVar2)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z11) {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.j
    public final kotlinx.coroutines.internal.r c(Object obj, ss.l lVar) {
        return F(obj, null, lVar);
    }

    @Override // kotlinx.coroutines.j
    public final kotlinx.coroutines.internal.r d(Object obj, Object obj2) {
        return F(obj, obj2, null);
    }

    @Override // kotlinx.coroutines.m0
    public final ls.d<T> e() {
        return this.f23630x;
    }

    @Override // kotlinx.coroutines.m0
    public final Throwable f(Object obj) {
        Throwable f = super.f(obj);
        if (f == null) {
            return null;
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.m0
    public final <T> T g(Object obj) {
        if (obj instanceof t) {
            return (T) ((t) obj).f23696a;
        }
        return obj;
    }

    @Override // ns.d
    public final ns.d getCallerFrame() {
        ls.d<T> dVar = this.f23630x;
        if (dVar instanceof ns.d) {
            return (ns.d) dVar;
        }
        return null;
    }

    @Override // ls.d
    public final ls.f getContext() {
        return this.f23631y;
    }

    @Override // kotlinx.coroutines.j
    public final void i() {
        q(this.f23637w);
    }

    @Override // kotlinx.coroutines.m0
    public final Object j() {
        return this._state;
    }

    @Override // kotlinx.coroutines.j
    public final void k(a0 a0Var, hs.k kVar) {
        kotlinx.coroutines.internal.d dVar;
        a0 a0Var2;
        int i6;
        ls.d<T> dVar2 = this.f23630x;
        if (dVar2 instanceof kotlinx.coroutines.internal.d) {
            dVar = (kotlinx.coroutines.internal.d) dVar2;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            a0Var2 = dVar.f23588x;
        } else {
            a0Var2 = null;
        }
        if (a0Var2 == a0Var) {
            i6 = 4;
        } else {
            i6 = this.f23637w;
        }
        D(kVar, i6, null);
    }

    public final void l(h hVar, Throwable th2) {
        try {
            hVar.a(th2);
        } catch (Throwable th3) {
            ta.v.z(this.f23631y, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void m(ss.l<? super Throwable, hs.k> lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            ta.v.z(this.f23631y, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void n(ss.l<? super Throwable, hs.k> lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            ta.v.z(this.f23631y, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void o() {
        p0 p0Var = this.f23632z;
        if (p0Var == null) {
            return;
        }
        p0Var.i();
        this.f23632z = m1.f23638u;
    }

    @Override // kotlinx.coroutines.j
    public final void p(ss.l<? super Throwable, hs.k> lVar) {
        h gVar;
        boolean z10;
        if (lVar instanceof h) {
            gVar = (h) lVar;
        } else {
            gVar = new g(2, lVar);
        }
        while (true) {
            Object obj = this._state;
            boolean z11 = false;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, gVar)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z11) {
                    return;
                }
            } else {
                Throwable th2 = null;
                if (!(obj instanceof h)) {
                    boolean z12 = obj instanceof u;
                    if (z12) {
                        u uVar = (u) obj;
                        uVar.getClass();
                        if (u.f23702b.compareAndSet(uVar, 0, 1)) {
                            if (obj instanceof l) {
                                if (!z12) {
                                    uVar = null;
                                }
                                if (uVar != null) {
                                    th2 = uVar.f23703a;
                                }
                                m(lVar, th2);
                                return;
                            }
                            return;
                        }
                        A(lVar, obj);
                        throw null;
                    } else if (obj instanceof t) {
                        t tVar = (t) obj;
                        if (tVar.f23697b == null) {
                            if (gVar instanceof d) {
                                return;
                            }
                            Throwable th3 = tVar.f23700e;
                            if (th3 != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                m(lVar, th3);
                                return;
                            }
                            t a10 = t.a(tVar, gVar, null, 29);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
                            while (true) {
                                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, a10)) {
                                    z11 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                    break;
                                }
                            }
                            if (z11) {
                                return;
                            }
                        } else {
                            A(lVar, obj);
                            throw null;
                        }
                    } else if (gVar instanceof d) {
                        return;
                    } else {
                        t tVar2 = new t(obj, gVar, null, null, null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = B;
                        while (true) {
                            if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, tVar2)) {
                                z11 = true;
                                break;
                            } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                break;
                            }
                        }
                        if (z11) {
                            return;
                        }
                    }
                } else {
                    A(lVar, obj);
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void q(int i6) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 != 0) {
                if (i10 == 1) {
                    z11 = false;
                } else {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (A.compareAndSet(this, 0, 2)) {
                z11 = true;
                break;
            }
        }
        if (z11) {
            return;
        }
        ls.d<T> dVar = this.f23630x;
        if (i6 == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && (dVar instanceof kotlinx.coroutines.internal.d)) {
            if (i6 != 1 && i6 != 2) {
                z13 = false;
            } else {
                z13 = true;
            }
            int i11 = this.f23637w;
            if (i11 != 1 && i11 != 2) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (z13 == z14) {
                a0 a0Var = ((kotlinx.coroutines.internal.d) dVar).f23588x;
                ls.f context = dVar.getContext();
                if (a0Var.K0()) {
                    a0Var.f0(context, this);
                    return;
                }
                r0 a10 = t1.a();
                if (a10.f23646w >= 4294967296L) {
                    z10 = true;
                }
                if (z10) {
                    a10.M0(this);
                    return;
                }
                a10.N0(true);
                try {
                    ta.v.K(this, this.f23630x, true);
                    do {
                    } while (a10.P0());
                } catch (Throwable th2) {
                    try {
                        h(th2, null);
                    } finally {
                        a10.L0(true);
                    }
                }
                return;
            }
        }
        ta.v.K(this, dVar, z12);
    }

    public Throwable r(g1 g1Var) {
        return g1Var.I();
    }

    @Override // ls.d
    public final void resumeWith(Object obj) {
        Throwable a10 = hs.g.a(obj);
        if (a10 != null) {
            obj = new u(a10, false);
        }
        D(obj, this.f23637w, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r1 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r6.f23632z != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r0 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r0 = r6.f23630x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        if ((r0 instanceof kotlinx.coroutines.internal.d) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        r5 = (kotlinx.coroutines.internal.d) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        r0 = r5.q(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        o();
        w(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
        return ms.a.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
        r0 = r6.f23630x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
        if ((r0 instanceof kotlinx.coroutines.internal.d) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
        r5 = (kotlinx.coroutines.internal.d) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
        if (r5 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
        r0 = r5.q(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
        o();
        w(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
        r0 = r6._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
        if ((r0 instanceof kotlinx.coroutines.u) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
        r1 = r6.f23637w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
        if (r1 == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
        if (r1 != 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
        if (r3 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
        r1 = (kotlinx.coroutines.c1) r6.f23631y.e(kotlinx.coroutines.c1.b.f23496u);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
        if (r1.a() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0087, code lost:
        r1 = r1.I();
        b(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008e, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
        return g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0098, code lost:
        throw ((kotlinx.coroutines.u) r0).f23703a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s() {
        boolean z10;
        boolean z11 = z();
        while (true) {
            int i6 = this._decision;
            boolean z12 = false;
            if (i6 != 0) {
                if (i6 == 2) {
                    z10 = false;
                } else {
                    throw new IllegalStateException("Already suspended".toString());
                }
            } else if (A.compareAndSet(this, 0, 1)) {
                z10 = true;
                break;
            }
        }
    }

    @Override // kotlinx.coroutines.j
    public final kotlinx.coroutines.internal.r t(Throwable th2) {
        return F(new u(th2, false), null, null);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(B());
        sb2.append('(');
        sb2.append(e0.w(this.f23630x));
        sb2.append("){");
        Object obj = this._state;
        if (obj instanceof n1) {
            str = "Active";
        } else if (obj instanceof l) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(e0.q(this));
        return sb2.toString();
    }

    public final void u() {
        p0 x10 = x();
        if (x10 != null && y()) {
            x10.i();
            this.f23632z = m1.f23638u;
        }
    }

    @Override // kotlinx.coroutines.j
    public final void v(ss.l lVar, Object obj) {
        D(obj, this.f23637w, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0020, code lost:
        continue;
     */
    @Override // kotlinx.coroutines.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(Throwable th2) {
        Object obj;
        boolean z10;
        boolean z11;
        h hVar;
        do {
            obj = this._state;
            z10 = false;
            if (!(obj instanceof n1)) {
                return false;
            }
            z11 = obj instanceof h;
            l lVar = new l(this, th2, z11);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    z10 = true;
                    continue;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        } while (!z10);
        if (z11) {
            hVar = (h) obj;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            l(hVar, th2);
        }
        if (!z()) {
            o();
        }
        q(this.f23637w);
        return true;
    }

    public final p0 x() {
        c1 c1Var = (c1) this.f23631y.e(c1.b.f23496u);
        if (c1Var == null) {
            return null;
        }
        p0 a10 = c1.a.a(c1Var, true, new m(this), 2);
        this.f23632z = a10;
        return a10;
    }

    public final boolean y() {
        return !(this._state instanceof n1);
    }

    public final boolean z() {
        boolean z10;
        if (this.f23637w == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && ((kotlinx.coroutines.internal.d) this.f23630x).m()) {
            return true;
        }
        return false;
    }
}
