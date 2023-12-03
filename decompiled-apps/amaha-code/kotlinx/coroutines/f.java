package kotlinx.coroutines;
/* compiled from: EventLoop.kt */
/* loaded from: classes2.dex */
public final class f extends s0 {
    public final Thread C;

    public f(Thread thread) {
        this.C = thread;
    }

    @Override // kotlinx.coroutines.t0
    public final Thread Q0() {
        return this.C;
    }
}
