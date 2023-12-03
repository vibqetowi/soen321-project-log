package kotlinx.coroutines;
/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<r0> f23701a = new ThreadLocal<>();

    public static r0 a() {
        ThreadLocal<r0> threadLocal = f23701a;
        r0 r0Var = threadLocal.get();
        if (r0Var == null) {
            f fVar = new f(Thread.currentThread());
            threadLocal.set(fVar);
            return fVar;
        }
        return r0Var;
    }
}
