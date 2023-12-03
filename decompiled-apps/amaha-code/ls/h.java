package ls;

import hs.g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: SafeContinuationJvm.kt */
/* loaded from: classes2.dex */
public final class h<T> implements d<T>, ns.d {
    @Deprecated

    /* renamed from: v  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<h<?>, Object> f24522v = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "result");
    private volatile Object result;

    /* renamed from: u  reason: collision with root package name */
    public final d<T> f24523u;

    /* JADX WARN: Multi-variable type inference failed */
    public h(d<? super T> dVar) {
        ms.a aVar = ms.a.UNDECIDED;
        this.f24523u = dVar;
        this.result = aVar;
    }

    public final Object b() {
        boolean z10;
        Object obj = this.result;
        ms.a aVar = ms.a.UNDECIDED;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<h<?>, Object> atomicReferenceFieldUpdater = f24522v;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return aVar2;
            }
            obj = this.result;
        }
        if (obj != ms.a.RESUMED) {
            if (!(obj instanceof g.a)) {
                return obj;
            }
            throw ((g.a) obj).f19466u;
        }
        return aVar2;
    }

    @Override // ns.d
    public final ns.d getCallerFrame() {
        d<T> dVar = this.f24523u;
        if (dVar instanceof ns.d) {
            return (ns.d) dVar;
        }
        return null;
    }

    @Override // ls.d
    public final f getContext() {
        return this.f24523u.getContext();
    }

    @Override // ls.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            ms.a aVar = ms.a.UNDECIDED;
            boolean z10 = false;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater<h<?>, Object> atomicReferenceFieldUpdater = f24522v;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                if (obj2 == aVar2) {
                    AtomicReferenceFieldUpdater<h<?>, Object> atomicReferenceFieldUpdater2 = f24522v;
                    ms.a aVar3 = ms.a.RESUMED;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                            z10 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                            break;
                        }
                    }
                    if (z10) {
                        this.f24523u.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f24523u;
    }
}
