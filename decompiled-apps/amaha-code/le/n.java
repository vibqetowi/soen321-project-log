package le;

import java.util.HashMap;
import java.util.List;
import ke.r;
/* compiled from: SetMutation.java */
/* loaded from: classes.dex */
public final class n extends f {

    /* renamed from: d  reason: collision with root package name */
    public final ke.o f24231d;

    public n(ke.i iVar, ke.o oVar, l lVar, List<e> list) {
        super(iVar, lVar, list);
        this.f24231d = oVar;
    }

    @Override // le.f
    public final d a(ke.n nVar, d dVar, sc.h hVar) {
        j(nVar);
        if (!this.f24216b.a(nVar)) {
            return dVar;
        }
        HashMap h10 = h(hVar, nVar);
        ke.o oVar = new ke.o(this.f24231d.b());
        oVar.h(h10);
        nVar.j(nVar.f23287d, oVar);
        nVar.f23289g = 1;
        nVar.f23287d = r.f23293v;
        return null;
    }

    @Override // le.f
    public final void b(ke.n nVar, h hVar) {
        j(nVar);
        ke.o oVar = new ke.o(this.f24231d.b());
        oVar.h(i(nVar, hVar.f24223b));
        nVar.j(hVar.f24222a, oVar);
        nVar.f23289g = 2;
    }

    @Override // le.f
    public final d d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (e(nVar) && this.f24231d.equals(nVar.f24231d) && this.f24217c.equals(nVar.f24217c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24231d.hashCode() + (f() * 31);
    }

    public final String toString() {
        return "SetMutation{" + g() + ", value=" + this.f24231d + "}";
    }
}
