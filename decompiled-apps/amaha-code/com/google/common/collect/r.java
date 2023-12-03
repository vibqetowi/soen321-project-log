package com.google.common.collect;

import java.io.Serializable;
/* compiled from: ImmutableEntry.java */
/* loaded from: classes.dex */
public final class r<K, V> extends f<K, V> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final K f9442u;

    /* renamed from: v  reason: collision with root package name */
    public final V f9443v;

    public r(K k10, V v10) {
        this.f9442u = k10;
        this.f9443v = v10;
    }

    @Override // com.google.common.collect.f, java.util.Map.Entry
    public final K getKey() {
        return this.f9442u;
    }

    @Override // com.google.common.collect.f, java.util.Map.Entry
    public final V getValue() {
        return this.f9443v;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
