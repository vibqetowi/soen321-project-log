package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
public final class l0<T> extends kotlinx.coroutines.internal.p<T> {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23635x = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public l0(ls.d dVar, ls.f fVar) {
        super(dVar, fVar);
        this._decision = 0;
    }

    @Override // kotlinx.coroutines.internal.p, kotlinx.coroutines.a
    public final void n0(Object obj) {
        boolean z10;
        while (true) {
            int i6 = this._decision;
            z10 = true;
            if (i6 != 0) {
                if (i6 == 1) {
                    z10 = false;
                } else {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f23635x.compareAndSet(this, 0, 2)) {
                break;
            }
        }
        if (z10) {
            return;
        }
        sc.b.d0(ca.a.G0(this.f23613w), ca.a.e1(obj), null);
    }

    public final Object t0() {
        boolean z10;
        while (true) {
            int i6 = this._decision;
            z10 = false;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
            } else if (f23635x.compareAndSet(this, 0, 1)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return ms.a.COROUTINE_SUSPENDED;
        }
        Object s10 = kotlin.jvm.internal.b0.s(Q());
        if (!(s10 instanceof u)) {
            return s10;
        }
        throw ((u) s10).f23703a;
    }

    @Override // kotlinx.coroutines.internal.p, kotlinx.coroutines.g1
    public final void u(Object obj) {
        n0(obj);
    }
}
