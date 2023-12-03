package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.s0;
/* compiled from: DefaultExecutor.kt */
/* loaded from: classes2.dex */
public final class f0 extends s0 implements Runnable {
    public static final f0 C;
    public static final long D;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l2;
        f0 f0Var = new f0();
        C = f0Var;
        f0Var.N0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        D = timeUnit.toNanos(l2.longValue());
    }

    @Override // kotlinx.coroutines.t0
    public final Thread Q0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.t0
    public final void R0(long j10, s0.b bVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.s0
    public final void T0(Runnable runnable) {
        boolean z10;
        if (debugStatus == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            super.T0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void Y0() {
        boolean z10;
        int i6 = debugStatus;
        if (i6 != 2 && i6 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        debugStatus = 3;
        W0();
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        t1.f23701a.set(this);
        try {
            synchronized (this) {
                int i6 = debugStatus;
                if (i6 != 2 && i6 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z11 = true;
                }
            }
            if (!z11) {
                _thread = null;
                Y0();
                if (!V0()) {
                    Q0();
                    return;
                }
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long O0 = O0();
                if (O0 == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = D + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        Y0();
                        if (!V0()) {
                            Q0();
                            return;
                        }
                        return;
                    } else if (O0 > j11) {
                        O0 = j11;
                    }
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (O0 > 0) {
                    int i10 = debugStatus;
                    if (i10 != 2 && i10 != 3) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        _thread = null;
                        Y0();
                        if (!V0()) {
                            Q0();
                            return;
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, O0);
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            Y0();
            if (!V0()) {
                Q0();
            }
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.s0, kotlinx.coroutines.r0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
