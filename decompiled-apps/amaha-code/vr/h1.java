package vr;

import tr.b;
import vr.q1;
/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public final class h1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c1 f35678u;

    public h1(c1 c1Var) {
        this.f35678u = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c1 c1Var = this.f35678u;
        c1Var.f35447j.a(b.a.INFO, "Terminated");
        q1.p pVar = q1.p.this;
        q1.this.A.remove(c1Var);
        q1 q1Var = q1.this;
        tr.u.b(q1Var.P.f33584b, c1Var);
        q1.J(q1Var);
    }
}
