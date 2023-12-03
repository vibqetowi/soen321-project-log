package he;

import he.k;
import java.util.ArrayList;
/* compiled from: KeyFieldNotInFilter.java */
/* loaded from: classes.dex */
public final class r extends k {

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f17559d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(ke.m mVar, rf.s sVar) {
        super(mVar, r0, sVar);
        k.a aVar = k.a.NOT_IN;
        ArrayList arrayList = new ArrayList();
        this.f17559d = arrayList;
        arrayList.addAll(q.i(aVar, sVar));
    }

    @Override // he.k, he.l
    public final boolean e(ke.g gVar) {
        return !this.f17559d.contains(gVar.getKey());
    }
}
