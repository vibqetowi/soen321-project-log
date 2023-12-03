package le;
/* compiled from: VerifyMutation.java */
/* loaded from: classes.dex */
public final class p extends f {
    public p(ke.i iVar, l lVar) {
        super(iVar, lVar);
    }

    @Override // le.f
    public final d a(ke.n nVar, d dVar, sc.h hVar) {
        ca.a.V("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // le.f
    public final void b(ke.n nVar, h hVar) {
        ca.a.V("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // le.f
    public final d d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            return e((p) obj);
        }
        return false;
    }

    public final int hashCode() {
        return f();
    }

    public final String toString() {
        return "VerifyMutation{" + g() + "}";
    }
}
