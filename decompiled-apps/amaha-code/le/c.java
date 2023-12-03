package le;

import ke.r;
/* compiled from: DeleteMutation.java */
/* loaded from: classes.dex */
public final class c extends f {
    public c(ke.i iVar, l lVar) {
        super(iVar, lVar);
    }

    @Override // le.f
    public final d a(ke.n nVar, d dVar, sc.h hVar) {
        j(nVar);
        if (this.f24216b.a(nVar)) {
            nVar.k(nVar.f23287d);
            nVar.f23289g = 1;
            nVar.f23287d = r.f23293v;
            return null;
        }
        return dVar;
    }

    @Override // le.f
    public final void b(ke.n nVar, h hVar) {
        j(nVar);
        ca.a.u0(hVar.f24223b.isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        nVar.k(hVar.f24222a);
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
        if (obj != null && c.class == obj.getClass()) {
            return e((c) obj);
        }
        return false;
    }

    public final int hashCode() {
        return f();
    }

    public final String toString() {
        return "DeleteMutation{" + g() + "}";
    }
}
