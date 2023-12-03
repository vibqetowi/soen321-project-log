package kotlinx.coroutines;

import java.lang.Thread;
import java.util.List;
/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<b0> f23494a = ca.a.a1(fv.t.J0(fv.k.u0(defpackage.b.q())));

    public static final void a(ls.f fVar, Throwable th2) {
        Throwable runtimeException;
        for (b0 b0Var : f23494a) {
            try {
                b0Var.R(fVar, th2);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    ca.a.h(runtimeException, th2);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            ca.a.h(th2, new k0(fVar));
            hs.k kVar = hs.k.f19476a;
        } catch (Throwable th4) {
            sp.b.j(th4);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}
