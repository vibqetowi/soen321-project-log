package vr;
/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public final class i1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ w f35696u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f35697v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c1 f35698w;

    public i1(c1 c1Var, w wVar, boolean z10) {
        this.f35698w = c1Var;
        this.f35696u = wVar;
        this.f35697v = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35698w.f35456t.c(this.f35696u, this.f35697v);
    }
}
