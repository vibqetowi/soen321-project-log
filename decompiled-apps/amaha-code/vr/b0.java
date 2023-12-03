package vr;
/* compiled from: DelayedClientCall.java */
/* loaded from: classes2.dex */
public final class b0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ StringBuilder f35400u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c0 f35401v;

    public b0(c0 c0Var, StringBuilder sb2) {
        this.f35401v = c0Var;
        this.f35400u = sb2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35401v.g(tr.i0.f33483h.g(this.f35400u.toString()), true);
    }
}
