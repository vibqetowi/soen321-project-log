package com.google.common.collect;

import com.google.common.collect.e;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
/* compiled from: AbstractListMultimap.java */
/* loaded from: classes.dex */
public abstract class c<K, V> extends e<K, V> {
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.f0
    public final e.a a() {
        e.a aVar;
        e.a aVar2 = this.f9387w;
        if (aVar2 == null) {
            h0 h0Var = (h0) this;
            Map<K, Collection<V>> map = h0Var.f9352x;
            if (map instanceof NavigableMap) {
                aVar = new e.d((NavigableMap) h0Var.f9352x);
            } else if (map instanceof SortedMap) {
                aVar = new e.g((SortedMap) h0Var.f9352x);
            } else {
                aVar = new e.a(h0Var.f9352x);
            }
            aVar2 = aVar;
            this.f9387w = aVar2;
        }
        return aVar2;
    }

    @Override // com.google.common.collect.g
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
