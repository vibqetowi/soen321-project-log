package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public abstract class f1 extends w implements p0, y0 {

    /* renamed from: x  reason: collision with root package name */
    public g1 f23502x;

    public final g1 C() {
        g1 g1Var = this.f23502x;
        if (g1Var != null) {
            return g1Var;
        }
        kotlin.jvm.internal.i.q("job");
        throw null;
    }

    @Override // kotlinx.coroutines.y0
    public final boolean a() {
        return true;
    }

    @Override // kotlinx.coroutines.y0
    public final l1 f() {
        return null;
    }

    @Override // kotlinx.coroutines.p0
    public final void i() {
        boolean z10;
        g1 C = C();
        do {
            Object Q = C.Q();
            if (Q instanceof f1) {
                if (Q == this) {
                    q0 q0Var = kotlin.jvm.internal.b0.S;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.f23578u;
                        if (atomicReferenceFieldUpdater.compareAndSet(C, Q, q0Var)) {
                            z10 = true;
                            continue;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(C) != Q) {
                            z10 = false;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((Q instanceof y0) && ((y0) Q).f() != null) {
                w();
                return;
            } else {
                return;
            }
        } while (!z10);
    }

    @Override // kotlinx.coroutines.internal.g
    public final String toString() {
        return getClass().getSimpleName() + '@' + e0.q(this) + "[job@" + e0.q(C()) + ']';
    }
}
