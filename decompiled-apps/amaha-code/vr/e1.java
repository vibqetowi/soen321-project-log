package vr;

import tr.b;
/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public final class e1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c1 f35547u;

    public e1(c1 c1Var) {
        this.f35547u = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f35547u.f35459w.f33510a == tr.j.IDLE) {
            this.f35547u.f35447j.a(b.a.INFO, "CONNECTING as requested");
            c1.b(this.f35547u, tr.j.CONNECTING);
            c1.i(this.f35547u);
        }
    }
}
