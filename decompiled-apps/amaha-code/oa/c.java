package oa;

import java.util.AbstractMap;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class c extends q {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ d f27318w;

    public c(d dVar) {
        this.f27318w = dVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i6) {
        d dVar = this.f27318w;
        sc.b.n0(i6, dVar.f27321y);
        int i10 = i6 + i6;
        Object[] objArr = dVar.f27320x;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // oa.n
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27318w.f27321y;
    }
}
