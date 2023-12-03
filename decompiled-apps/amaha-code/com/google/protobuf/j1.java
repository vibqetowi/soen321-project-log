package com.google.protobuf;

import j$.util.Iterator;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u  reason: collision with root package name */
    public final int f9978u;

    /* renamed from: x  reason: collision with root package name */
    public boolean f9981x;

    /* renamed from: y  reason: collision with root package name */
    public volatile j1<K, V>.d f9982y;

    /* renamed from: v  reason: collision with root package name */
    public List<j1<K, V>.b> f9979v = Collections.emptyList();

    /* renamed from: w  reason: collision with root package name */
    public Map<K, V> f9980w = Collections.emptyMap();

    /* renamed from: z  reason: collision with root package name */
    public Map<K, V> f9983z = Collections.emptyMap();

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0165a f9984a = new C0165a();

        /* renamed from: b  reason: collision with root package name */
        public static final b f9985b = new b();

        /* compiled from: SmallSortedMap.java */
        /* renamed from: com.google.protobuf.j1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0165a implements Iterator<Object>, j$.util.Iterator {
            @Override // java.util.Iterator, j$.util.Iterator
            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        /* loaded from: classes.dex */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final java.util.Iterator<Object> iterator() {
                return a.f9984a;
            }
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class b implements Map.Entry<K, V>, Comparable<j1<K, V>.b> {

        /* renamed from: u  reason: collision with root package name */
        public final K f9986u;

        /* renamed from: v  reason: collision with root package name */
        public V f9987v;

        public b() {
            throw null;
        }

        public b(K k10, V v10) {
            this.f9986u = k10;
            this.f9987v = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f9986u.compareTo(((b) obj).f9986u);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean equals;
            boolean equals2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k10 = this.f9986u;
            if (k10 == null) {
                if (key == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = k10.equals(key);
            }
            if (equals) {
                V v10 = this.f9987v;
                Object value = entry.getValue();
                if (v10 == null) {
                    if (value == null) {
                        equals2 = true;
                    } else {
                        equals2 = false;
                    }
                } else {
                    equals2 = v10.equals(value);
                }
                if (equals2) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f9986u;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f9987v;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            int i6 = 0;
            K k10 = this.f9986u;
            if (k10 == null) {
                hashCode = 0;
            } else {
                hashCode = k10.hashCode();
            }
            V v10 = this.f9987v;
            if (v10 != null) {
                i6 = v10.hashCode();
            }
            return i6 ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            int i6 = j1.A;
            j1.this.b();
            V v11 = this.f9987v;
            this.f9987v = v10;
            return v11;
        }

        public final String toString() {
            return this.f9986u + "=" + this.f9987v;
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class c implements java.util.Iterator<Map.Entry<K, V>>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public int f9989u = -1;

        /* renamed from: v  reason: collision with root package name */
        public boolean f9990v;

        /* renamed from: w  reason: collision with root package name */
        public java.util.Iterator<Map.Entry<K, V>> f9991w;

        public c() {
        }

        public final java.util.Iterator<Map.Entry<K, V>> a() {
            if (this.f9991w == null) {
                this.f9991w = j1.this.f9980w.entrySet().iterator();
            }
            return this.f9991w;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            int i6 = this.f9989u + 1;
            j1 j1Var = j1.this;
            if (i6 < j1Var.f9979v.size()) {
                return true;
            }
            if (!j1Var.f9980w.isEmpty() && a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            this.f9990v = true;
            int i6 = this.f9989u + 1;
            this.f9989u = i6;
            j1 j1Var = j1.this;
            if (i6 < j1Var.f9979v.size()) {
                return j1Var.f9979v.get(this.f9989u);
            }
            return a().next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (this.f9990v) {
                this.f9990v = false;
                int i6 = j1.A;
                j1 j1Var = j1.this;
                j1Var.b();
                if (this.f9989u < j1Var.f9979v.size()) {
                    int i10 = this.f9989u;
                    this.f9989u = i10 - 1;
                    j1Var.j(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                Object value = entry.getValue();
                j1.this.put((Comparable) entry.getKey(), value);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                j1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return j1.this.size();
        }
    }

    public j1(int i6) {
        this.f9978u = i6;
    }

    public final int a(K k10) {
        int size = this.f9979v.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f9979v.get(size).f9986u);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i6 = 0;
        while (i6 <= size) {
            int i10 = (i6 + size) / 2;
            int compareTo2 = k10.compareTo(this.f9979v.get(i10).f9986u);
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

    public final void b() {
        if (!this.f9981x) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final Map.Entry<K, V> c(int i6) {
        return this.f9979v.get(i6);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f9979v.isEmpty()) {
            this.f9979v.clear();
        }
        if (!this.f9980w.isEmpty()) {
            this.f9980w.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f9980w.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final int d() {
        return this.f9979v.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f9982y == null) {
            this.f9982y = new d();
        }
        return this.f9982y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        int size = size();
        if (size != j1Var.size()) {
            return false;
        }
        int d10 = d();
        if (d10 != j1Var.d()) {
            return entrySet().equals(j1Var.entrySet());
        }
        for (int i6 = 0; i6 < d10; i6++) {
            if (!c(i6).equals(j1Var.c(i6))) {
                return false;
            }
        }
        if (d10 == size) {
            return true;
        }
        return this.f9980w.equals(j1Var.f9980w);
    }

    public final Iterable<Map.Entry<K, V>> f() {
        if (this.f9980w.isEmpty()) {
            return a.f9985b;
        }
        return this.f9980w.entrySet();
    }

    public final SortedMap<K, V> g() {
        b();
        if (this.f9980w.isEmpty() && !(this.f9980w instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9980w = treeMap;
            this.f9983z = treeMap.descendingMap();
        }
        return (SortedMap) this.f9980w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return this.f9979v.get(a10).f9987v;
        }
        return this.f9980w.get(comparable);
    }

    public void h() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.f9981x) {
            if (this.f9980w.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f9980w);
            }
            this.f9980w = unmodifiableMap;
            if (this.f9983z.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f9983z);
            }
            this.f9983z = unmodifiableMap2;
            this.f9981x = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int d10 = d();
        int i6 = 0;
        for (int i10 = 0; i10 < d10; i10++) {
            i6 += this.f9979v.get(i10).hashCode();
        }
        if (this.f9980w.size() > 0) {
            return i6 + this.f9980w.hashCode();
        }
        return i6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: i */
    public final V put(K k10, V v10) {
        b();
        int a10 = a(k10);
        if (a10 >= 0) {
            return this.f9979v.get(a10).setValue(v10);
        }
        b();
        boolean isEmpty = this.f9979v.isEmpty();
        int i6 = this.f9978u;
        if (isEmpty && !(this.f9979v instanceof ArrayList)) {
            this.f9979v = new ArrayList(i6);
        }
        int i10 = -(a10 + 1);
        if (i10 >= i6) {
            return g().put(k10, v10);
        }
        if (this.f9979v.size() == i6) {
            j1<K, V>.b remove = this.f9979v.remove(i6 - 1);
            g().put(remove.f9986u, remove.f9987v);
        }
        this.f9979v.add(i10, new b(k10, v10));
        return null;
    }

    public final V j(int i6) {
        b();
        V v10 = this.f9979v.remove(i6).f9987v;
        if (!this.f9980w.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            List<j1<K, V>.b> list = this.f9979v;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return (V) j(a10);
        }
        if (this.f9980w.isEmpty()) {
            return null;
        }
        return this.f9980w.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9980w.size() + this.f9979v.size();
    }
}
