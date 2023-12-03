package vr;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: LogExceptionRunnable.java */
/* loaded from: classes2.dex */
public final class o1 implements Runnable {

    /* renamed from: v  reason: collision with root package name */
    public static final Logger f35804v = Logger.getLogger(o1.class.getName());

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f35805u;

    public o1(Runnable runnable) {
        this.f35805u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f35805u;
        try {
            runnable.run();
        } catch (Throwable th2) {
            Level level = Level.SEVERE;
            f35804v.log(level, "Exception while executing runnable " + runnable, (Throwable) th2);
            Object obj = nc.n.f26014a;
            if (!(th2 instanceof RuntimeException)) {
                if (!(th2 instanceof Error)) {
                    throw new AssertionError(th2);
                }
                throw th2;
            }
            throw ((RuntimeException) th2);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f35805u + ")";
    }
}
