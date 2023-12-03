package vr;

import java.util.concurrent.Executor;
import vr.x;
/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public final class t1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Runnable f35960u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ tr.j f35961v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ q1 f35962w;

    public t1(q1 q1Var, ne.o oVar, tr.j jVar) {
        this.f35962w = q1Var;
        this.f35960u = oVar;
        this.f35961v = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q1 q1Var = this.f35962w;
        x xVar = q1Var.f35871s;
        Runnable runnable = this.f35960u;
        Executor executor = q1Var.f35862i;
        tr.j jVar = this.f35961v;
        xVar.getClass();
        sc.b.w(runnable, "callback");
        sc.b.w(executor, "executor");
        sc.b.w(jVar, "source");
        x.a aVar = new x.a(runnable, executor);
        if (xVar.f36110b != jVar) {
            executor.execute(runnable);
        } else {
            xVar.f36109a.add(aVar);
        }
    }
}
