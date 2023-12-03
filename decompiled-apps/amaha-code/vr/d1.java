package vr;

import tr.b;
/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public final class d1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c1 f35492u;

    public d1(c1 c1Var) {
        this.f35492u = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c1 c1Var = this.f35492u;
        c1Var.f35453p = null;
        c1Var.f35447j.a(b.a.INFO, "CONNECTING after backoff");
        c1.b(c1Var, tr.j.CONNECTING);
        c1.i(c1Var);
    }
}
