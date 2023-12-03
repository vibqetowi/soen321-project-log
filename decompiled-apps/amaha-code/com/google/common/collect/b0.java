package com.google.common.collect;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.common.collect.e;
import com.google.common.collect.s0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: Maps.java */
/* loaded from: classes.dex */
public abstract class b0<K, V> extends s0.a<Map.Entry<K, V>> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        e.a.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return e.a.this.isEmpty();
    }

    @Override // com.google.common.collect.s0.a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator<?> it = collection.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                z10 |= ((e.a.C0154a) this).remove(it.next());
            }
            return z10;
        }
    }

    @Override // com.google.common.collect.s0.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        int i6;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                x.a(size, "expectedSize");
                i6 = size + 1;
            } else if (size < 1073741824) {
                i6 = (int) ((size / 0.75f) + 1.0f);
            } else {
                i6 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            }
            HashSet hashSet = new HashSet(i6);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return e.a.this.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return e.a.this.size();
    }
}
