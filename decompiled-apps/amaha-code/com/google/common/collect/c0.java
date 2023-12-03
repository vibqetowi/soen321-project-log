package com.google.common.collect;

import com.google.common.collect.s0;
import java.util.Map;
/* compiled from: Maps.java */
/* loaded from: classes.dex */
public class c0<K, V> extends s0.a<K> {

    /* renamed from: u  reason: collision with root package name */
    public final Map<K, V> f9350u;

    public c0(Map<K, V> map) {
        map.getClass();
        this.f9350u = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9350u.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f9350u.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9350u.size();
    }
}
