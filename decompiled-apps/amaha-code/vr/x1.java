package vr;
/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public final class x1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q1 f36117u;

    public x1(q1 q1Var) {
        this.f36117u = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q1 q1Var = this.f36117u;
        if (q1Var.H) {
            return;
        }
        q1Var.H = true;
        q1.I(q1Var);
    }
}
