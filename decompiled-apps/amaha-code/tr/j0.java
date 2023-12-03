package tr;

import tr.l0;
/* compiled from: SynchronizationContext.java */
/* loaded from: classes2.dex */
public final class j0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l0.a f33507u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Runnable f33508v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ l0 f33509w;

    public j0(l0 l0Var, l0.a aVar, Runnable runnable) {
        this.f33509w = l0Var;
        this.f33507u = aVar;
        this.f33508v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33509w.execute(this.f33507u);
    }

    public final String toString() {
        return this.f33508v.toString() + "(scheduled in SynchronizationContext)";
    }
}
