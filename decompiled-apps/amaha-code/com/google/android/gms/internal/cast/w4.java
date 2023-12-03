package com.google.android.gms.internal.cast;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public class w4<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u  reason: collision with root package name */
    public final int f7673u;

    /* renamed from: x  reason: collision with root package name */
    public boolean f7676x;

    /* renamed from: y  reason: collision with root package name */
    public volatile v4 f7677y;

    /* renamed from: v  reason: collision with root package name */
    public List<t4> f7674v = Collections.emptyList();

    /* renamed from: w  reason: collision with root package name */
    public Map<K, V> f7675w = Collections.emptyMap();

    /* renamed from: z  reason: collision with root package name */
    public Map<K, V> f7678z = Collections.emptyMap();

    public void a() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.f7676x) {
            if (this.f7675w.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f7675w);
            }
            this.f7675w = unmodifiableMap;
            if (this.f7678z.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f7678z);
            }
            this.f7678z = unmodifiableMap2;
            this.f7676x = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b */
    public final V put(K k10, V v10) {
        f();
        int d10 = d(k10);
        if (d10 >= 0) {
            return (V) this.f7674v.get(d10).setValue(v10);
        }
        f();
        boolean isEmpty = this.f7674v.isEmpty();
        int i6 = this.f7673u;
        if (isEmpty && !(this.f7674v instanceof ArrayList)) {
            this.f7674v = new ArrayList(i6);
        }
        int i10 = -(d10 + 1);
        if (i10 >= i6) {
            return g().put(k10, v10);
        }
        if (this.f7674v.size() == i6) {
            t4 remove = this.f7674v.remove(i6 - 1);
            g().put((K) remove.f7642u, (V) remove.f7643v);
        }
        this.f7674v.add(i10, new t4(this, k10, v10));
        return null;
    }

    public final V c(int i6) {
        f();
        V v10 = (V) this.f7674v.remove(i6).f7643v;
        if (!this.f7675w.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            List<t4> list = this.f7674v;
            Map.Entry<K, V> next = it.next();
            list.add(new t4(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (!this.f7674v.isEmpty()) {
            this.f7674v.clear();
        }
        if (!this.f7675w.isEmpty()) {
            this.f7675w.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (d(comparable) < 0 && !this.f7675w.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final int d(K k10) {
        int size = this.f7674v.size() - 1;
        int i6 = 0;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f7674v.get(size).f7642u);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i6 <= size) {
            int i10 = (i6 + size) / 2;
            int compareTo2 = k10.compareTo(this.f7674v.get(i10).f7642u);
            if (compareTo2 < 0) {
                size = i10 - 1;
            } else if (compareTo2 > 0) {
                i6 = i10 + 1;
            } else {
                return i10;
            }
        }
        return -(i6 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f7677y == null) {
            this.f7677y = new v4(this);
        }
        return this.f7677y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return super.equals(obj);
        }
        w4 w4Var = (w4) obj;
        int size = size();
        if (size != w4Var.size()) {
            return false;
        }
        int size2 = this.f7674v.size();
        if (size2 == w4Var.f7674v.size()) {
            for (int i6 = 0; i6 < size2; i6++) {
                if (!this.f7674v.get(i6).equals(w4Var.f7674v.get(i6))) {
                    return false;
                }
            }
            if (size2 == size) {
                return true;
            }
            return this.f7675w.equals(w4Var.f7675w);
        }
        return ((AbstractSet) entrySet()).equals(w4Var.entrySet());
    }

    public final void f() {
        if (!this.f7676x) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final SortedMap<K, V> g() {
        f();
        if (this.f7675w.isEmpty() && !(this.f7675w instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7675w = treeMap;
            this.f7678z = treeMap.descendingMap();
        }
        return (SortedMap) this.f7675w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        if (d10 >= 0) {
            return (V) this.f7674v.get(d10).f7643v;
        }
        return this.f7675w.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f7674v.size();
        int i6 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i6 += this.f7674v.get(i10).hashCode();
        }
        if (this.f7675w.size() > 0) {
            return this.f7675w.hashCode() + i6;
        }
        return i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        if (d10 >= 0) {
            return (V) c(d10);
        }
        if (this.f7675w.isEmpty()) {
            return null;
        }
        return this.f7675w.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7675w.size() + this.f7674v.size();
    }
}
