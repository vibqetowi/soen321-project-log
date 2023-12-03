package he;

import he.k;
/* compiled from: ArrayContainsAnyFilter.java */
/* loaded from: classes.dex */
public final class b extends k {
    public b(ke.m mVar, rf.s sVar) {
        super(mVar, k.a.ARRAY_CONTAINS_ANY, sVar);
        ca.a.u0(ke.t.h(sVar), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    @Override // he.k, he.l
    public final boolean e(ke.g gVar) {
        rf.s e10 = gVar.e(this.f17539c);
        if (!ke.t.h(e10)) {
            return false;
        }
        for (rf.s sVar : e10.X().p()) {
            if (ke.t.e(this.f17538b.X(), sVar)) {
                return true;
            }
        }
        return false;
    }
}
