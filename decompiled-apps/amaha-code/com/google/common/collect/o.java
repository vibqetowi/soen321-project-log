package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: ForwardingMap.java */
/* loaded from: classes.dex */
public abstract class o<K, V> extends p implements Map<K, V> {
    public abstract Map<K, V> b();

    @Override // java.util.Map
    public final void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return b().containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this && !b().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return b().get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return b().keySet();
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        return b().put(k10, v10);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return b().size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return b().values();
    }
}
