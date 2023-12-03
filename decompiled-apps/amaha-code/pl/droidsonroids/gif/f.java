package pl.droidsonroids.gif;

import java.lang.Thread;
/* compiled from: SafeRunnable.java */
/* loaded from: classes2.dex */
public abstract class f implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final b f28582u;

    public f(b bVar) {
        this.f28582u = bVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.f28582u.A.l()) {
                a();
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
            throw th2;
        }
    }
}
