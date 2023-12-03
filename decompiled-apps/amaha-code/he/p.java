package he;

import he.k;
/* compiled from: KeyFieldFilter.java */
/* loaded from: classes.dex */
public final class p extends k {

    /* renamed from: d  reason: collision with root package name */
    public final ke.i f17557d;

    public p(ke.m mVar, k.a aVar, rf.s sVar) {
        super(mVar, aVar, sVar);
        ca.a.u0(ke.t.k(sVar), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.f17557d = ke.i.h(this.f17538b.f0());
    }

    @Override // he.k, he.l
    public final boolean e(ke.g gVar) {
        return h(gVar.getKey().compareTo(this.f17557d));
    }
}
