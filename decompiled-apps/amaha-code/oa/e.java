package oa;

import java.util.Iterator;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class e extends t {

    /* renamed from: w  reason: collision with root package name */
    public final transient s f27322w;

    /* renamed from: x  reason: collision with root package name */
    public final transient q f27323x;

    public e(s sVar, f fVar) {
        this.f27322w = sVar;
        this.f27323x = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f27322w.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // oa.n
    public final int e(Object[] objArr) {
        return this.f27323x.e(objArr);
    }

    @Override // oa.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f27323x.listIterator(0);
    }

    @Override // oa.t, oa.n
    public final q o() {
        return this.f27323x;
    }

    @Override // oa.n
    public final o q() {
        return this.f27323x.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((g) this.f27322w).f27329z;
    }
}
