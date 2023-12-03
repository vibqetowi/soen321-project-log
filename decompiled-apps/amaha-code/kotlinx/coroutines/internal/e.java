package kotlinx.coroutines.internal;

import kotlinx.coroutines.a0;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.j0;
/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes2.dex */
public final class e extends a0 implements Runnable, j0 {
    public final Object A;
    private volatile int runningWorkers;

    /* renamed from: w  reason: collision with root package name */
    public final a0 f23591w;

    /* renamed from: x  reason: collision with root package name */
    public final int f23592x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ j0 f23593y;

    /* renamed from: z  reason: collision with root package name */
    public final h<Runnable> f23594z;

    public e(kotlinx.coroutines.scheduling.k kVar, int i6) {
        j0 j0Var;
        this.f23591w = kVar;
        this.f23592x = i6;
        if (kVar instanceof j0) {
            j0Var = (j0) kVar;
        } else {
            j0Var = null;
        }
        this.f23593y = j0Var == null ? g0.f23577a : j0Var;
        this.f23594z = new h<>();
        this.A = new Object();
    }

    @Override // kotlinx.coroutines.j0
    public final void J(long j10, kotlinx.coroutines.k kVar) {
        this.f23593y.J(j10, kVar);
    }

    @Override // kotlinx.coroutines.a0
    public final void f0(ls.f fVar, Runnable runnable) {
        boolean z10;
        this.f23594z.a(runnable);
        boolean z11 = true;
        if (this.runningWorkers >= this.f23592x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            synchronized (this.A) {
                if (this.runningWorkers >= this.f23592x) {
                    z11 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z11) {
                this.f23591w.f0(this, this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0 = r3.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        r3.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r3.f23594z.c() != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        r3.runningWorkers++;
        r1 = hs.k.f19476a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        while (true) {
            int i6 = 0;
            while (true) {
                Runnable d10 = this.f23594z.d();
                if (d10 == null) {
                    break;
                }
                try {
                    d10.run();
                } catch (Throwable th2) {
                    ta.v.z(ls.g.f24521u, th2);
                }
                i6++;
                if (i6 >= 16 && this.f23591w.K0()) {
                    this.f23591w.f0(this, this);
                    return;
                }
            }
        }
    }
}
