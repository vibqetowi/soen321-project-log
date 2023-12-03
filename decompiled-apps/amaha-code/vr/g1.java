package vr;

import tr.l0;
/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public final class g1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ tr.i0 f35633u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c1 f35634v;

    public g1(c1 c1Var, tr.i0 i0Var) {
        this.f35634v = c1Var;
        this.f35633u = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tr.j jVar = this.f35634v.f35459w.f33510a;
        tr.j jVar2 = tr.j.SHUTDOWN;
        if (jVar == jVar2) {
            return;
        }
        c1 c1Var = this.f35634v;
        c1Var.f35460x = this.f35633u;
        g2 g2Var = c1Var.f35458v;
        c1 c1Var2 = this.f35634v;
        w wVar = c1Var2.f35457u;
        c1Var2.f35458v = null;
        c1 c1Var3 = this.f35634v;
        c1Var3.f35457u = null;
        c1.b(c1Var3, jVar2);
        this.f35634v.f35449l.a();
        if (this.f35634v.f35455s.isEmpty()) {
            c1 c1Var4 = this.f35634v;
            c1Var4.getClass();
            c1Var4.f35448k.execute(new h1(c1Var4));
        }
        c1 c1Var5 = this.f35634v;
        c1Var5.f35448k.d();
        l0.b bVar = c1Var5.f35453p;
        if (bVar != null) {
            bVar.a();
            c1Var5.f35453p = null;
            c1Var5.f35451n = null;
        }
        l0.b bVar2 = this.f35634v.f35454q;
        if (bVar2 != null) {
            bVar2.a();
            this.f35634v.r.h(this.f35633u);
            c1 c1Var6 = this.f35634v;
            c1Var6.f35454q = null;
            c1Var6.r = null;
        }
        if (g2Var != null) {
            g2Var.h(this.f35633u);
        }
        if (wVar != null) {
            wVar.h(this.f35633u);
        }
    }
}
