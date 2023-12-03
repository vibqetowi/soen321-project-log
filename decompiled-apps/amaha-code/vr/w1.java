package vr;

import tr.b;
/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public final class w1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q1 f36103u;

    public w1(q1 q1Var) {
        this.f36103u = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q1 q1Var = this.f36103u;
        q1Var.O.a(b.a.INFO, "Entering SHUTDOWN state");
        q1Var.f35871s.a(tr.j.SHUTDOWN);
    }
}
