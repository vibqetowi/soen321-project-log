package he;

import he.k;
/* compiled from: NotInFilter.java */
/* loaded from: classes.dex */
public final class v extends k {
    public v(ke.m mVar, rf.s sVar) {
        super(mVar, k.a.NOT_IN, sVar);
        ca.a.u0(ke.t.h(sVar), "NotInFilter expects an ArrayValue", new Object[0]);
    }

    @Override // he.k, he.l
    public final boolean e(ke.g gVar) {
        rf.s e10;
        rf.s sVar = this.f17538b;
        if (ke.t.e(sVar.X(), ke.t.f23300b) || (e10 = gVar.e(this.f17539c)) == null || ke.t.e(sVar.X(), e10)) {
            return false;
        }
        return true;
    }
}
