package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.t1;
/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes2.dex */
public final class d<T> extends m0<T> implements ns.d, ls.d<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_reusableCancellableContinuation");
    public final Object A;
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: x  reason: collision with root package name */
    public final a0 f23588x;

    /* renamed from: y  reason: collision with root package name */
    public final ls.d<T> f23589y;

    /* renamed from: z  reason: collision with root package name */
    public Object f23590z;

    /* JADX WARN: Multi-variable type inference failed */
    public d(a0 a0Var, ls.d<? super T> dVar) {
        super(-1);
        this.f23588x = a0Var;
        this.f23589y = dVar;
        this.f23590z = sc.b.J;
        this.A = t.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // kotlinx.coroutines.m0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof kotlinx.coroutines.v) {
            ((kotlinx.coroutines.v) obj).f23709b.invoke(cancellationException);
        }
    }

    @Override // ns.d
    public final ns.d getCallerFrame() {
        ls.d<T> dVar = this.f23589y;
        if (dVar instanceof ns.d) {
            return (ns.d) dVar;
        }
        return null;
    }

    @Override // ls.d
    public final ls.f getContext() {
        return this.f23589y.getContext();
    }

    @Override // kotlinx.coroutines.m0
    public final Object j() {
        Object obj = this.f23590z;
        this.f23590z = sc.b.J;
        return obj;
    }

    public final kotlinx.coroutines.k<T> l() {
        boolean z10;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r rVar = sc.b.K;
            if (obj == null) {
                this._reusableCancellableContinuation = rVar;
                return null;
            } else if (obj instanceof kotlinx.coroutines.k) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return (kotlinx.coroutines.k) obj;
                }
            } else if (obj != rVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean m() {
        if (this._reusableCancellableContinuation != null) {
            return true;
        }
        return false;
    }

    public final boolean n(Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r rVar = sc.b.K;
            boolean z10 = false;
            boolean z11 = true;
            if (kotlin.jvm.internal.i.b(obj, rVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, th2)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != rVar) {
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z11 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z11) {
                    return false;
                }
            }
        }
    }

    public final void o() {
        kotlinx.coroutines.k kVar;
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof kotlinx.coroutines.k) {
            kVar = (kotlinx.coroutines.k) obj;
        } else {
            kVar = null;
        }
        if (kVar != null) {
            kVar.o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Throwable q(kotlinx.coroutines.j<?> jVar) {
        boolean z10;
        do {
            Object obj = this._reusableCancellableContinuation;
            r rVar = sc.b.K;
            z10 = false;
            if (obj == rVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, jVar)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != rVar) {
                        break;
                    }
                }
            } else if (obj instanceof Throwable) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                if (z10) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!z10);
        return null;
    }

    @Override // ls.d
    public final void resumeWith(Object obj) {
        Object uVar;
        boolean z10;
        ls.d<T> dVar = this.f23589y;
        ls.f context = dVar.getContext();
        Throwable a10 = hs.g.a(obj);
        if (a10 == null) {
            uVar = obj;
        } else {
            uVar = new kotlinx.coroutines.u(a10, false);
        }
        a0 a0Var = this.f23588x;
        if (a0Var.K0()) {
            this.f23590z = uVar;
            this.f23637w = 0;
            a0Var.f0(context, this);
            return;
        }
        r0 a11 = t1.a();
        if (a11.f23646w >= 4294967296L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f23590z = uVar;
            this.f23637w = 0;
            a11.M0(this);
            return;
        }
        a11.N0(true);
        try {
            ls.f context2 = getContext();
            Object c10 = t.c(context2, this.A);
            dVar.resumeWith(obj);
            hs.k kVar = hs.k.f19476a;
            t.a(context2, c10);
            do {
            } while (a11.P0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f23588x + ", " + e0.w(this.f23589y) + ']';
    }

    @Override // kotlinx.coroutines.m0
    public final ls.d<T> e() {
        return this;
    }
}
