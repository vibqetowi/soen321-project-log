package he;

import he.k;
import java.util.ArrayList;
/* compiled from: KeyFieldInFilter.java */
/* loaded from: classes.dex */
public final class q extends k {

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f17558d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(ke.m mVar, rf.s sVar) {
        super(mVar, r0, sVar);
        k.a aVar = k.a.IN;
        ArrayList arrayList = new ArrayList();
        this.f17558d = arrayList;
        arrayList.addAll(i(aVar, sVar));
    }

    public static ArrayList i(k.a aVar, rf.s sVar) {
        boolean z10;
        if (aVar != k.a.IN && aVar != k.a.NOT_IN) {
            z10 = false;
        } else {
            z10 = true;
        }
        ca.a.u0(z10, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        ca.a.u0(ke.t.h(sVar), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (rf.s sVar2 : sVar.X().p()) {
            ca.a.u0(ke.t.k(sVar2), r1.b0.b(new StringBuilder("Comparing on key with "), aVar.f17545u, ", but an array value was not a ReferenceValue"), new Object[0]);
            arrayList.add(ke.i.h(sVar2.f0()));
        }
        return arrayList;
    }

    @Override // he.k, he.l
    public final boolean e(ke.g gVar) {
        return this.f17558d.contains(gVar.getKey());
    }
}
