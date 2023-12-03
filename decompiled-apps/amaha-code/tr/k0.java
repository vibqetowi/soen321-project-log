package tr;

import cs.f;
import tr.l0;
/* compiled from: SynchronizationContext.java */
/* loaded from: classes2.dex */
public final class k0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l0.a f33512u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Runnable f33513v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f33514w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ l0 f33515x;

    public k0(l0 l0Var, l0.a aVar, f.d dVar, long j10) {
        this.f33515x = l0Var;
        this.f33512u = aVar;
        this.f33513v = dVar;
        this.f33514w = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33515x.execute(this.f33512u);
    }

    public final String toString() {
        return this.f33513v.toString() + "(scheduled in SynchronizationContext with delay of " + this.f33514w + ")";
    }
}
