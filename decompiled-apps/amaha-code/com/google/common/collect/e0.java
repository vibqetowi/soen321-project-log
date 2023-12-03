package com.google.common.collect;

import com.google.common.collect.e;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: Maps.java */
/* loaded from: classes.dex */
public abstract class e0<K, V> extends AbstractMap<K, V> {

    /* renamed from: u  reason: collision with root package name */
    public transient e.a.C0154a f9383u;

    /* renamed from: v  reason: collision with root package name */
    public transient d0 f9384v;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        e.a.C0154a c0154a = this.f9383u;
        if (c0154a == null) {
            e.a.C0154a c0154a2 = new e.a.C0154a();
            this.f9383u = c0154a2;
            return c0154a2;
        }
        return c0154a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        d0 d0Var = this.f9384v;
        if (d0Var == null) {
            d0 d0Var2 = new d0(this);
            this.f9384v = d0Var2;
            return d0Var2;
        }
        return d0Var;
    }
}
