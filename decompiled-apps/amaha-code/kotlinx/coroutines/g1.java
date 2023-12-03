package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jv.h;
import kotlinx.coroutines.c1;
import ls.f;
/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public class g1 implements c1, p, o1 {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23578u = AtomicReferenceFieldUpdater.newUpdater(g1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* compiled from: JobSupport.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> extends k<T> {
        public final g1 C;

        public a(ls.d<? super T> dVar, g1 g1Var) {
            super(1, dVar);
            this.C = g1Var;
        }

        @Override // kotlinx.coroutines.k
        public final String B() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.k
        public final Throwable r(g1 g1Var) {
            Throwable c10;
            Object Q = this.C.Q();
            if ((Q instanceof c) && (c10 = ((c) Q).c()) != null) {
                return c10;
            }
            if (Q instanceof u) {
                return ((u) Q).f23703a;
            }
            return g1Var.I();
        }
    }

    /* compiled from: JobSupport.kt */
    /* loaded from: classes2.dex */
    public static final class b extends f1 {
        public final o A;
        public final Object B;

        /* renamed from: y  reason: collision with root package name */
        public final g1 f23579y;

        /* renamed from: z  reason: collision with root package name */
        public final c f23580z;

        public b(g1 g1Var, c cVar, o oVar, Object obj) {
            this.f23579y = g1Var;
            this.f23580z = cVar;
            this.A = oVar;
            this.B = obj;
        }

        @Override // kotlinx.coroutines.w
        public final void B(Throwable th2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.f23578u;
            g1 g1Var = this.f23579y;
            g1Var.getClass();
            o Y = g1.Y(this.A);
            c cVar = this.f23580z;
            Object obj = this.B;
            if (Y == null || !g1Var.m0(cVar, Y, obj)) {
                g1Var.u(g1Var.F(cVar, obj));
            }
        }

        @Override // ss.l
        public final /* bridge */ /* synthetic */ hs.k invoke(Throwable th2) {
            B(th2);
            return hs.k.f19476a;
        }
    }

    /* compiled from: JobSupport.kt */
    /* loaded from: classes2.dex */
    public static final class c implements y0 {
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: u  reason: collision with root package name */
        public final l1 f23581u;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        public c(l1 l1Var, Throwable th2) {
            this.f23581u = l1Var;
            this._rootCause = th2;
        }

        @Override // kotlinx.coroutines.y0
        public final boolean a() {
            if (((Throwable) this._rootCause) == null) {
                return true;
            }
            return false;
        }

        public final void b(Throwable th2) {
            Throwable th3 = (Throwable) this._rootCause;
            if (th3 == null) {
                this._rootCause = th2;
            } else if (th2 == th3) {
            } else {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th2;
                } else if (obj instanceof Throwable) {
                    if (th2 == obj) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th2);
                    this._exceptionsHolder = arrayList;
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        public final Throwable c() {
            return (Throwable) this._rootCause;
        }

        public final boolean d() {
            if (((Throwable) this._rootCause) != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean e() {
            return this._isCompleting;
        }

        @Override // kotlinx.coroutines.y0
        public final l1 f() {
            return this.f23581u;
        }

        public final boolean g() {
            if (this._exceptionsHolder == kotlin.jvm.internal.b0.Q) {
                return true;
            }
            return false;
        }

        public final ArrayList h(Throwable th2) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th3 = (Throwable) this._rootCause;
            if (th3 != null) {
                arrayList.add(0, th3);
            }
            if (th2 != null && !kotlin.jvm.internal.i.b(th2, th3)) {
                arrayList.add(th2);
            }
            this._exceptionsHolder = kotlin.jvm.internal.b0.Q;
            return arrayList;
        }

        public final void i() {
            this._isCompleting = 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [int, boolean] */
        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f23581u + ']';
        }
    }

    public g1(boolean z10) {
        q0 q0Var;
        if (z10) {
            q0Var = kotlin.jvm.internal.b0.S;
        } else {
            q0Var = kotlin.jvm.internal.b0.R;
        }
        this._state = q0Var;
        this._parentHandle = null;
    }

    public static o Y(kotlinx.coroutines.internal.g gVar) {
        while (gVar.v()) {
            gVar = gVar.s();
        }
        while (true) {
            gVar = gVar.p();
            if (!gVar.v()) {
                if (gVar instanceof o) {
                    return (o) gVar;
                }
                if (gVar instanceof l1) {
                    return null;
                }
            }
        }
    }

    public static String i0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.d()) {
                return "Cancelling";
            }
            if (cVar.e()) {
                return "Completing";
            }
        } else if (obj instanceof y0) {
            if (!((y0) obj).a()) {
                return "New";
            }
        } else if (obj instanceof u) {
            return "Cancelled";
        } else {
            return "Completed";
        }
        return "Active";
    }

    public final boolean A(Throwable th2) {
        if (V()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        n nVar = (n) this._parentHandle;
        if (nVar != null && nVar != m1.f23638u) {
            if (nVar.d(th2) || z10) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public String B() {
        return "Job was cancelled";
    }

    public boolean C(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (y(th2) && L()) {
            return true;
        }
        return false;
    }

    public final void D(y0 y0Var, Object obj) {
        u uVar;
        Throwable th2;
        n nVar = (n) this._parentHandle;
        if (nVar != null) {
            nVar.i();
            this._parentHandle = m1.f23638u;
        }
        CompletionHandlerException completionHandlerException = null;
        if (obj instanceof u) {
            uVar = (u) obj;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            th2 = uVar.f23703a;
        } else {
            th2 = null;
        }
        if (y0Var instanceof f1) {
            try {
                ((f1) y0Var).B(th2);
                return;
            } catch (Throwable th3) {
                T(new CompletionHandlerException("Exception in completion handler " + y0Var + " for " + this, th3));
                return;
            }
        }
        l1 f = y0Var.f();
        if (f != null) {
            for (kotlinx.coroutines.internal.g gVar = (kotlinx.coroutines.internal.g) f.o(); !kotlin.jvm.internal.i.b(gVar, f); gVar = gVar.p()) {
                if (gVar instanceof f1) {
                    f1 f1Var = (f1) gVar;
                    try {
                        f1Var.B(th2);
                    } catch (Throwable th4) {
                        if (completionHandlerException != null) {
                            ca.a.h(completionHandlerException, th4);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + f1Var + " for " + this, th4);
                            hs.k kVar = hs.k.f19476a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                T(completionHandlerException);
            }
        }
    }

    public final Throwable E(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof Throwable;
        }
        if (z10) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new JobCancellationException(B(), null, this);
            }
            return th2;
        } else if (obj != null) {
            return ((o1) obj).q0();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    public final Object F(c cVar, Object obj) {
        u uVar;
        Throwable K;
        Object obj2;
        boolean z10;
        Throwable th2 = null;
        if (obj instanceof u) {
            uVar = (u) obj;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            th2 = uVar.f23703a;
        }
        synchronized (cVar) {
            cVar.d();
            ArrayList<Throwable> h10 = cVar.h(th2);
            K = K(cVar, h10);
            if (K != null && h10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(h10.size()));
                for (Throwable th3 : h10) {
                    if (th3 != K && th3 != K && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        ca.a.h(K, th3);
                    }
                }
            }
        }
        if (K != null && K != th2) {
            obj = new u(K, false);
        }
        if (K != null) {
            if (!A(K) && !S(K)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (obj != null) {
                    u.f23702b.compareAndSet((u) obj, 0, 1);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        a0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23578u;
        if (obj instanceof y0) {
            obj2 = new z0((y0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, obj2) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        D(cVar, obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlinx.coroutines.x0] */
    @Override // kotlinx.coroutines.c1
    public final p0 G(boolean z10, boolean z11, ss.l<? super Throwable, hs.k> lVar) {
        f1 f1Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u uVar;
        Throwable th2;
        boolean z12;
        Throwable th3 = null;
        if (z10) {
            if (lVar instanceof d1) {
                f1Var = (d1) lVar;
            } else {
                f1Var = null;
            }
            if (f1Var == null) {
                f1Var = new a1(lVar);
            }
        } else {
            if (lVar instanceof f1) {
                f1Var = (f1) lVar;
            } else {
                f1Var = null;
            }
            if (f1Var == null) {
                f1Var = new b1(0, lVar);
            }
        }
        f1Var.f23502x = this;
        while (true) {
            Object Q = Q();
            boolean z13 = true;
            if (Q instanceof q0) {
                q0 q0Var = (q0) Q;
                if (q0Var.f23644u) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23578u;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, Q, f1Var)) {
                            if (atomicReferenceFieldUpdater2.get(this) != Q) {
                                z13 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z13) {
                        return f1Var;
                    }
                } else {
                    l1 l1Var = new l1();
                    if (!q0Var.f23644u) {
                        l1Var = new x0(l1Var);
                    }
                    do {
                        atomicReferenceFieldUpdater = f23578u;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, q0Var, l1Var)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == q0Var);
                }
            } else if (Q instanceof y0) {
                l1 f = ((y0) Q).f();
                if (f == null) {
                    if (Q != null) {
                        d0((f1) Q);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    p0 p0Var = m1.f23638u;
                    if (z10 && (Q instanceof c)) {
                        synchronized (Q) {
                            th2 = ((c) Q).c();
                            if (th2 == null || ((lVar instanceof o) && !((c) Q).e())) {
                                h1 h1Var = new h1(f1Var, this, Q);
                                while (true) {
                                    int A = f.s().A(f1Var, f, h1Var);
                                    if (A != 1) {
                                        if (A == 2) {
                                            z12 = false;
                                            break;
                                        }
                                    } else {
                                        z12 = true;
                                        break;
                                    }
                                }
                                if (z12) {
                                    if (th2 == null) {
                                        return f1Var;
                                    }
                                    p0Var = f1Var;
                                }
                            }
                            hs.k kVar = hs.k.f19476a;
                        }
                    } else {
                        th2 = null;
                    }
                    if (th2 != null) {
                        if (z11) {
                            lVar.invoke(th2);
                        }
                        return p0Var;
                    }
                    h1 h1Var2 = new h1(f1Var, this, Q);
                    while (true) {
                        int A2 = f.s().A(f1Var, f, h1Var2);
                        if (A2 == 1) {
                            break;
                        } else if (A2 == 2) {
                            z13 = false;
                            break;
                        }
                    }
                    if (z13) {
                        return f1Var;
                    }
                }
            } else {
                if (z11) {
                    if (Q instanceof u) {
                        uVar = (u) Q;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null) {
                        th3 = uVar.f23703a;
                    }
                    lVar.invoke(th3);
                }
                return m1.f23638u;
            }
        }
    }

    public final Object H() {
        Object Q = Q();
        if (!(Q instanceof y0)) {
            if (!(Q instanceof u)) {
                return kotlin.jvm.internal.b0.s(Q);
            }
            throw ((u) Q).f23703a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // kotlinx.coroutines.c1
    public final CancellationException I() {
        Object Q = Q();
        CancellationException cancellationException = null;
        if (Q instanceof c) {
            Throwable c10 = ((c) Q).c();
            if (c10 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c10 instanceof CancellationException) {
                    cancellationException = (CancellationException) c10;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = B();
                    }
                    return new JobCancellationException(concat, c10, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(Q instanceof y0)) {
            if (Q instanceof u) {
                Throwable th2 = ((u) Q).f23703a;
                if (th2 instanceof CancellationException) {
                    cancellationException = (CancellationException) th2;
                }
                if (cancellationException == null) {
                    return new JobCancellationException(B(), th2, this);
                }
                return cancellationException;
            }
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public final Throwable K(c cVar, ArrayList arrayList) {
        Object obj;
        boolean z10;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!cVar.d()) {
                return null;
            }
            return new JobCancellationException(B(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean L() {
        return true;
    }

    public boolean M() {
        return this instanceof r;
    }

    public final l1 N(y0 y0Var) {
        l1 f = y0Var.f();
        if (f == null) {
            if (y0Var instanceof q0) {
                return new l1();
            }
            if (y0Var instanceof f1) {
                d0((f1) y0Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + y0Var).toString());
        }
        return f;
    }

    @Override // kotlinx.coroutines.c1
    public final n O(g1 g1Var) {
        return (n) c1.a.a(this, true, new o(g1Var), 2);
    }

    public final n P() {
        return (n) this._parentHandle;
    }

    public final Object Q() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.m)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.m) obj).a(this);
        }
    }

    public boolean S(Throwable th2) {
        return false;
    }

    public final void U(c1 c1Var) {
        m1 m1Var = m1.f23638u;
        if (c1Var == null) {
            this._parentHandle = m1Var;
            return;
        }
        c1Var.start();
        n O = c1Var.O(this);
        this._parentHandle = O;
        if (!(Q() instanceof y0)) {
            O.i();
            this._parentHandle = m1Var;
        }
    }

    public boolean V() {
        return this instanceof e;
    }

    public final Object W(Object obj) {
        Object j02;
        u uVar;
        do {
            j02 = j0(Q(), obj);
            if (j02 == kotlin.jvm.internal.b0.M) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                if (obj instanceof u) {
                    uVar = (u) obj;
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    th2 = uVar.f23703a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (j02 == kotlin.jvm.internal.b0.O);
        return j02;
    }

    public String X() {
        return getClass().getSimpleName();
    }

    public final void Z(l1 l1Var, Throwable th2) {
        CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.g gVar = (kotlinx.coroutines.internal.g) l1Var.o(); !kotlin.jvm.internal.i.b(gVar, l1Var); gVar = gVar.p()) {
            if (gVar instanceof d1) {
                f1 f1Var = (f1) gVar;
                try {
                    f1Var.B(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        ca.a.h(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + f1Var + " for " + this, th3);
                        hs.k kVar = hs.k.f19476a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            T(completionHandlerException);
        }
        A(th2);
    }

    @Override // kotlinx.coroutines.c1
    public boolean a() {
        Object Q = Q();
        if ((Q instanceof y0) && ((y0) Q).a()) {
            return true;
        }
        return false;
    }

    public final void d0(f1 f1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z10;
        l1 l1Var = new l1();
        f1Var.getClass();
        kotlinx.coroutines.internal.g.f23596v.lazySet(l1Var, f1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.g.f23595u;
        atomicReferenceFieldUpdater2.lazySet(l1Var, f1Var);
        while (true) {
            if (f1Var.o() == f1Var) {
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(f1Var, f1Var, l1Var)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(f1Var) != f1Var) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
                if (z10) {
                    l1Var.m(f1Var);
                    break;
                }
            } else {
                break;
            }
        }
        kotlinx.coroutines.internal.g p10 = f1Var.p();
        do {
            atomicReferenceFieldUpdater = f23578u;
            if (atomicReferenceFieldUpdater.compareAndSet(this, f1Var, p10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == f1Var);
    }

    @Override // ls.f.b, ls.f
    public final <E extends f.b> E e(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // kotlinx.coroutines.c1, iv.s
    public void g(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(B(), null, this);
        }
        z(cancellationException);
    }

    public final int g0(Object obj) {
        boolean z10 = obj instanceof q0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23578u;
        boolean z11 = false;
        if (z10) {
            if (((q0) obj).f23644u) {
                return 0;
            }
            q0 q0Var = kotlin.jvm.internal.b0.S;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, q0Var)) {
                    z11 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z11) {
                return -1;
            }
            b0();
            return 1;
        } else if (!(obj instanceof x0)) {
            return 0;
        } else {
            l1 l1Var = ((x0) obj).f23713u;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, l1Var)) {
                    z11 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z11) {
                return -1;
            }
            b0();
            return 1;
        }
    }

    @Override // ls.f.b
    public final f.c<?> getKey() {
        return c1.b.f23496u;
    }

    @Override // ls.f
    public final ls.f h(ls.f context) {
        kotlin.jvm.internal.i.g(context, "context");
        return f.a.a(this, context);
    }

    @Override // kotlinx.coroutines.c1
    public final Object j(h.a.C0346a.b bVar) {
        boolean z10;
        while (true) {
            Object Q = Q();
            if (!(Q instanceof y0)) {
                z10 = false;
                break;
            } else if (g0(Q) >= 0) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            sp.b.p(bVar.getContext());
            return hs.k.f19476a;
        }
        k kVar = new k(1, ca.a.G0(bVar));
        kVar.u();
        kVar.p(new g(1, k0(new b1(2, kVar))));
        Object s10 = kVar.s();
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        if (s10 != aVar) {
            s10 = hs.k.f19476a;
        }
        if (s10 == aVar) {
            return s10;
        }
        return hs.k.f19476a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Throwable, T] */
    public final Object j0(Object obj, Object obj2) {
        z0 z0Var;
        boolean z10;
        c cVar;
        u uVar;
        o oVar;
        if (!(obj instanceof y0)) {
            return kotlin.jvm.internal.b0.M;
        }
        boolean z11 = false;
        if (((obj instanceof q0) || (obj instanceof f1)) && !(obj instanceof o) && !(obj2 instanceof u)) {
            y0 y0Var = (y0) obj;
            if (obj2 instanceof y0) {
                z0Var = new z0((y0) obj2);
            } else {
                z0Var = obj2;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23578u;
                if (atomicReferenceFieldUpdater.compareAndSet(this, y0Var, z0Var)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != y0Var) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                a0(obj2);
                D(y0Var, obj2);
                z11 = true;
            }
            if (z11) {
                return obj2;
            }
            return kotlin.jvm.internal.b0.O;
        }
        y0 y0Var2 = (y0) obj;
        l1 N = N(y0Var2);
        if (N == null) {
            return kotlin.jvm.internal.b0.O;
        }
        o oVar2 = null;
        if (y0Var2 instanceof c) {
            cVar = (c) y0Var2;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(N, null);
        }
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        synchronized (cVar) {
            if (cVar.e()) {
                return kotlin.jvm.internal.b0.M;
            }
            cVar.i();
            if (cVar != y0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23578u;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, y0Var2, cVar)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != y0Var2) {
                        break;
                    }
                }
                if (!z11) {
                    return kotlin.jvm.internal.b0.O;
                }
            }
            boolean d10 = cVar.d();
            if (obj2 instanceof u) {
                uVar = (u) obj2;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                cVar.b(uVar.f23703a);
            }
            ?? c10 = Boolean.valueOf(d10 ^ true).booleanValue() ? cVar.c() : 0;
            xVar.f23469u = c10;
            hs.k kVar = hs.k.f19476a;
            if (c10 != 0) {
                Z(N, c10);
            }
            if (y0Var2 instanceof o) {
                oVar = (o) y0Var2;
            } else {
                oVar = null;
            }
            if (oVar == null) {
                l1 f = y0Var2.f();
                if (f != null) {
                    oVar2 = Y(f);
                }
            } else {
                oVar2 = oVar;
            }
            if (oVar2 != null && m0(cVar, oVar2, obj2)) {
                return kotlin.jvm.internal.b0.N;
            }
            return F(cVar, obj2);
        }
    }

    @Override // kotlinx.coroutines.c1
    public final p0 k0(ss.l<? super Throwable, hs.k> lVar) {
        return G(false, true, lVar);
    }

    public final boolean m0(c cVar, o oVar, Object obj) {
        while (c1.a.a(oVar.f23639y, false, new b(this, cVar, oVar, obj), 1) == m1.f23638u) {
            oVar = Y(oVar);
            if (oVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // ls.f
    public final ls.f o(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    @Override // kotlinx.coroutines.o1
    public final CancellationException q0() {
        Throwable th2;
        Object Q = Q();
        CancellationException cancellationException = null;
        if (Q instanceof c) {
            th2 = ((c) Q).c();
        } else if (Q instanceof u) {
            th2 = ((u) Q).f23703a;
        } else if (!(Q instanceof y0)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + Q).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is ".concat(i0(Q)), th2, this);
        }
        return cancellationException;
    }

    @Override // ls.f
    public final <R> R s(R r, ss.p<? super R, ? super f.b, ? extends R> operation) {
        kotlin.jvm.internal.i.g(operation, "operation");
        return operation.invoke(r, this);
    }

    @Override // kotlinx.coroutines.c1
    public final boolean start() {
        int g02;
        do {
            g02 = g0(Q());
            if (g02 == 0) {
                return false;
            }
        } while (g02 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(X() + '{' + i0(Q()) + '}');
        sb2.append('@');
        sb2.append(e0.q(this));
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.p
    public final void v0(g1 g1Var) {
        y(g1Var);
    }

    public final Object x(ls.d<Object> dVar) {
        Object Q;
        do {
            Q = Q();
            if (!(Q instanceof y0)) {
                if (!(Q instanceof u)) {
                    return kotlin.jvm.internal.b0.s(Q);
                }
                throw ((u) Q).f23703a;
            }
        } while (g0(Q) < 0);
        a aVar = new a(ca.a.G0(dVar), this);
        aVar.u();
        aVar.p(new g(1, k0(new b1(1, aVar))));
        return aVar.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f4, code lost:
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(Object obj) {
        kotlinx.coroutines.internal.r rVar;
        boolean z10;
        boolean z11;
        kotlinx.coroutines.internal.r rVar2 = kotlin.jvm.internal.b0.M;
        if (M()) {
            do {
                Object Q = Q();
                if ((Q instanceof y0) && (!(Q instanceof c) || !((c) Q).e())) {
                    rVar2 = j0(Q, new u(E(obj), false));
                } else {
                    rVar2 = kotlin.jvm.internal.b0.M;
                    break;
                }
            } while (rVar2 == kotlin.jvm.internal.b0.O);
            if (rVar2 == kotlin.jvm.internal.b0.N) {
                return true;
            }
        }
        if (rVar2 == kotlin.jvm.internal.b0.M) {
            Throwable th2 = null;
            Throwable th3 = null;
            while (true) {
                Object Q2 = Q();
                if (Q2 instanceof c) {
                    synchronized (Q2) {
                        if (((c) Q2).g()) {
                            rVar = kotlin.jvm.internal.b0.P;
                        } else {
                            boolean d10 = ((c) Q2).d();
                            if (obj != null || !d10) {
                                if (th3 == null) {
                                    th3 = E(obj);
                                }
                                ((c) Q2).b(th3);
                            }
                            Throwable c10 = ((c) Q2).c();
                            if (!d10) {
                                th2 = c10;
                            }
                            if (th2 != null) {
                                Z(((c) Q2).f23581u, th2);
                            }
                            rVar = kotlin.jvm.internal.b0.M;
                        }
                    }
                } else if (Q2 instanceof y0) {
                    if (th3 == null) {
                        th3 = E(obj);
                    }
                    y0 y0Var = (y0) Q2;
                    if (y0Var.a()) {
                        l1 N = N(y0Var);
                        if (N != null) {
                            c cVar = new c(N, th3);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23578u;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, y0Var, cVar)) {
                                    z11 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater.get(this) != y0Var) {
                                    z11 = false;
                                    break;
                                }
                            }
                            if (z11) {
                                Z(N, th3);
                                z10 = true;
                                if (!z10) {
                                    rVar = kotlin.jvm.internal.b0.M;
                                    break;
                                }
                            }
                        }
                        z10 = false;
                        if (!z10) {
                        }
                    } else {
                        Object j02 = j0(Q2, new u(th3, false));
                        if (j02 != kotlin.jvm.internal.b0.M) {
                            if (j02 != kotlin.jvm.internal.b0.O) {
                                rVar2 = j02;
                                break;
                            }
                        } else {
                            throw new IllegalStateException(("Cannot happen in " + Q2).toString());
                        }
                    }
                } else {
                    rVar = kotlin.jvm.internal.b0.P;
                    break;
                }
            }
        }
        if (rVar2 != kotlin.jvm.internal.b0.M && rVar2 != kotlin.jvm.internal.b0.N) {
            if (rVar2 == kotlin.jvm.internal.b0.P) {
                return false;
            }
            u(rVar2);
        }
        return true;
    }

    public void z(CancellationException cancellationException) {
        y(cancellationException);
    }

    public void b0() {
    }

    public void T(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public void a0(Object obj) {
    }

    public void u(Object obj) {
    }
}
