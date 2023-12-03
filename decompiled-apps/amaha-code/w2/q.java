package w2;

import java.util.Set;
import n2.a0;
import n2.d0;
/* compiled from: StopWorkRunnable.java */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: x  reason: collision with root package name */
    public static final String f36317x = androidx.work.q.f("StopWorkRunnable");

    /* renamed from: u  reason: collision with root package name */
    public final a0 f36318u;

    /* renamed from: v  reason: collision with root package name */
    public final n2.t f36319v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f36320w;

    public q(a0 a0Var, n2.t tVar, boolean z10) {
        this.f36318u = a0Var;
        this.f36319v = tVar;
        this.f36320w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d10;
        if (this.f36320w) {
            d10 = this.f36318u.f.m(this.f36319v);
        } else {
            n2.p pVar = this.f36318u.f;
            n2.t tVar = this.f36319v;
            pVar.getClass();
            String str = tVar.f25851a.f34722a;
            synchronized (pVar.F) {
                d0 d0Var = (d0) pVar.A.remove(str);
                if (d0Var == null) {
                    androidx.work.q d11 = androidx.work.q.d();
                    String str2 = n2.p.G;
                    d11.a(str2, "WorkerWrapper could not be found for " + str);
                } else {
                    Set set = (Set) pVar.B.get(str);
                    if (set != null && set.contains(tVar)) {
                        androidx.work.q d12 = androidx.work.q.d();
                        String str3 = n2.p.G;
                        d12.a(str3, "Processor stopping background work " + str);
                        pVar.B.remove(str);
                        d10 = n2.p.d(d0Var, str);
                    }
                }
                d10 = false;
            }
        }
        androidx.work.q d13 = androidx.work.q.d();
        String str4 = f36317x;
        d13.a(str4, "StopWorkRunnable for " + this.f36319v.f25851a.f34722a + "; Processor.stopWork = " + d10);
    }
}
