package zv;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: AsyncTimeout.kt */
/* loaded from: classes2.dex */
public class a extends a0 {

    /* renamed from: h  reason: collision with root package name */
    public static final long f39870h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f39871i;

    /* renamed from: j  reason: collision with root package name */
    public static a f39872j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f39873e;
    public a f;

    /* renamed from: g  reason: collision with root package name */
    public long f39874g;

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: zv.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0688a {
        public static a a() {
            a aVar = a.f39872j;
            kotlin.jvm.internal.i.d(aVar);
            a aVar2 = aVar.f;
            if (aVar2 == null) {
                long nanoTime = System.nanoTime();
                a.class.wait(a.f39870h);
                a aVar3 = a.f39872j;
                kotlin.jvm.internal.i.d(aVar3);
                if (aVar3.f != null || System.nanoTime() - nanoTime < a.f39871i) {
                    return null;
                }
                return a.f39872j;
            }
            long nanoTime2 = aVar2.f39874g - System.nanoTime();
            if (nanoTime2 > 0) {
                long j10 = nanoTime2 / 1000000;
                a.class.wait(j10, (int) (nanoTime2 - (1000000 * j10)));
                return null;
            }
            a aVar4 = a.f39872j;
            kotlin.jvm.internal.i.d(aVar4);
            aVar4.f = aVar2.f;
            aVar2.f = null;
            return aVar2;
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            a a10;
            while (true) {
                try {
                    synchronized (a.class) {
                        a aVar = a.f39872j;
                        a10 = C0688a.a();
                        if (a10 == a.f39872j) {
                            a.f39872j = null;
                            return;
                        }
                        hs.k kVar = hs.k.f19476a;
                    }
                    if (a10 != null) {
                        a10.k();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f39870h = millis;
        f39871i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        a aVar;
        long j10 = this.f39878c;
        boolean z10 = this.f39876a;
        int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i6 == 0 && !z10) {
            return;
        }
        synchronized (a.class) {
            if (!this.f39873e) {
                this.f39873e = true;
                if (f39872j == null) {
                    f39872j = new a();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (i6 != 0 && z10) {
                    this.f39874g = Math.min(j10, c() - nanoTime) + nanoTime;
                } else if (i6 != 0) {
                    this.f39874g = j10 + nanoTime;
                } else if (z10) {
                    this.f39874g = c();
                } else {
                    throw new AssertionError();
                }
                long j11 = this.f39874g - nanoTime;
                a aVar2 = f39872j;
                kotlin.jvm.internal.i.d(aVar2);
                while (true) {
                    aVar = aVar2.f;
                    if (aVar == null || j11 < aVar.f39874g - nanoTime) {
                        break;
                    }
                    aVar2 = aVar;
                }
                this.f = aVar;
                aVar2.f = this;
                if (aVar2 == f39872j) {
                    a.class.notify();
                }
                hs.k kVar = hs.k.f19476a;
            } else {
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            }
        }
    }

    public final boolean i() {
        synchronized (a.class) {
            if (!this.f39873e) {
                return false;
            }
            this.f39873e = false;
            a aVar = f39872j;
            while (aVar != null) {
                a aVar2 = aVar.f;
                if (aVar2 == this) {
                    aVar.f = this.f;
                    this.f = null;
                    return false;
                }
                aVar = aVar2;
            }
            return true;
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
