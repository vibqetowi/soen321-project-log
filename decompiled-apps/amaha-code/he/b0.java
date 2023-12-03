package he;

import he.f;
import je.p;
import je.s0;
import je.z0;
/* compiled from: SQLiteComponentProvider.java */
/* loaded from: classes.dex */
public final class b0 extends u {
    @Override // he.u
    public final z0 c(f.a aVar) {
        androidx.work.k kVar = this.f17482a;
        ca.a.v0(kVar, "persistence not initialized yet", new Object[0]);
        je.p pVar = ((s0) kVar).f21925g.f21889x;
        je.k a10 = a();
        pVar.getClass();
        return new p.a(aVar.f17490b, a10);
    }

    @Override // he.u
    public final je.e d(f.a aVar) {
        androidx.work.k kVar = this.f17482a;
        ca.a.v0(kVar, "persistence not initialized yet", new Object[0]);
        return new je.e(kVar, aVar.f17490b, a());
    }

    @Override // he.u
    public final androidx.work.k e(f.a aVar) {
        e9.c cVar = aVar.f17491c;
        return new s0(aVar.f17489a, (String) cVar.f13870d, (ke.f) cVar.f13869c, new je.i(new ne.t((ke.f) cVar.f13869c)), new p.b(aVar.f17492d.f9633d));
    }
}
