package he;

import he.k;
/* compiled from: InFilter.java */
/* loaded from: classes.dex */
public final class o extends k {
    public o(ke.m mVar, rf.s sVar) {
        super(mVar, k.a.IN, sVar);
        ca.a.u0(ke.t.h(sVar), "InFilter expects an ArrayValue", new Object[0]);
    }

    @Override // he.k, he.l
    public final boolean e(ke.g gVar) {
        rf.s e10 = gVar.e(this.f17539c);
        if (e10 != null && ke.t.e(this.f17538b.X(), e10)) {
            return true;
        }
        return false;
    }
}
