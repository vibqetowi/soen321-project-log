package he;

import he.k;
/* compiled from: ArrayContainsFilter.java */
/* loaded from: classes.dex */
public final class c extends k {
    public c(ke.m mVar, rf.s sVar) {
        super(mVar, k.a.ARRAY_CONTAINS, sVar);
    }

    @Override // he.k, he.l
    public final boolean e(ke.g gVar) {
        rf.s e10 = gVar.e(this.f17539c);
        if (ke.t.h(e10) && ke.t.e(e10.X(), this.f17538b)) {
            return true;
        }
        return false;
    }
}
