package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
/* compiled from: Builders.kt */
/* loaded from: classes2.dex */
public final class e<T> extends a<T> {

    /* renamed from: w  reason: collision with root package name */
    public final Thread f23497w;

    /* renamed from: x  reason: collision with root package name */
    public final r0 f23498x;

    public e(ls.f fVar, Thread thread, r0 r0Var) {
        super(fVar, true);
        this.f23497w = thread;
        this.f23498x = r0Var;
    }

    @Override // kotlinx.coroutines.g1
    public final void u(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f23497w;
        if (!kotlin.jvm.internal.i.b(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
