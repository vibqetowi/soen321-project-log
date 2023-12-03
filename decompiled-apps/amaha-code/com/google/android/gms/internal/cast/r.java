package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class r<K, V> extends o<Map.Entry<K, V>> {

    /* renamed from: w  reason: collision with root package name */
    public final transient Object[] f7629w;

    public r(Object[] objArr) {
        this.f7629w = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(null)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        m mVar = this.f7611v;
        if (mVar == null) {
            mVar = new q(this);
            this.f7611v = mVar;
        }
        return mVar.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.j
    public final int o(Object[] objArr) {
        m mVar = this.f7611v;
        if (mVar == null) {
            mVar = new q(this);
            this.f7611v = mVar;
        }
        return mVar.o(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
