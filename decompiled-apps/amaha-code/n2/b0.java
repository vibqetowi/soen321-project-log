package n2;

import x2.a;
/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ rc.b f25802u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d0 f25803v;

    public b0(d0 d0Var, x2.c cVar) {
        this.f25803v = d0Var;
        this.f25802u = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f25803v.K.f37581u instanceof a.b) {
            return;
        }
        try {
            this.f25802u.get();
            androidx.work.q d10 = androidx.work.q.d();
            String str = d0.M;
            d10.a(str, "Starting work for " + this.f25803v.f25811y.f34736c);
            d0 d0Var = this.f25803v;
            d0Var.K.k(d0Var.f25812z.startWork());
        } catch (Throwable th2) {
            this.f25803v.K.j(th2);
        }
    }
}
