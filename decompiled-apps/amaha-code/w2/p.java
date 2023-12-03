package w2;

import androidx.work.WorkerParameters;
import n2.a0;
/* compiled from: StartWorkRunnable.java */
/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final a0 f36314u;

    /* renamed from: v  reason: collision with root package name */
    public final n2.t f36315v;

    /* renamed from: w  reason: collision with root package name */
    public final WorkerParameters.a f36316w;

    public p(a0 a0Var, n2.t tVar, WorkerParameters.a aVar) {
        this.f36314u = a0Var;
        this.f36315v = tVar;
        this.f36316w = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36314u.f.j(this.f36315v, this.f36316w);
    }
}
