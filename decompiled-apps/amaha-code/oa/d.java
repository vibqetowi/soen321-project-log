package oa;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class d extends t {

    /* renamed from: w  reason: collision with root package name */
    public final transient s f27319w;

    /* renamed from: x  reason: collision with root package name */
    public final transient Object[] f27320x;

    /* renamed from: y  reason: collision with root package name */
    public final transient int f27321y;

    public d(s sVar, Object[] objArr, int i6) {
        this.f27319w = sVar;
        this.f27320x = objArr;
        this.f27321y = i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f27319w.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // oa.n
    public final int e(Object[] objArr) {
        return o().e(objArr);
    }

    @Override // oa.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return o().listIterator(0);
    }

    @Override // oa.n
    public final o q() {
        return o().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27321y;
    }

    @Override // oa.t
    public final q t() {
        return new c(this);
    }
}
