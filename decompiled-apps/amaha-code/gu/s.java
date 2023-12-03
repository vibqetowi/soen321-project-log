package gu;

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
/* loaded from: classes2.dex */
public class s<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f16895z = 0;

    /* renamed from: u  reason: collision with root package name */
    public final int f16896u;

    /* renamed from: v  reason: collision with root package name */
    public List<s<K, V>.b> f16897v = Collections.emptyList();

    /* renamed from: w  reason: collision with root package name */
    public Map<K, V> f16898w = Collections.emptyMap();

    /* renamed from: x  reason: collision with root package name */
    public boolean f16899x;

    /* renamed from: y  reason: collision with root package name */
    public volatile s<K, V>.d f16900y;

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0264a f16901a = new C0264a();

        /* renamed from: b  reason: collision with root package name */
        public static final b f16902b = new b();

        /* compiled from: SmallSortedMap.java */
        /* renamed from: gu.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0264a implements Iterator<Object>, j$.util.Iterator {
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
        /* loaded from: classes2.dex */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final java.util.Iterator<Object> iterator() {
                return a.f16901a;
            }
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public class b implements Comparable<s<K, V>.b>, Map.Entry<K, V> {

        /* renamed from: u  reason: collision with root package name */
        public final K f16903u;

        /* renamed from: v  reason: collision with root package name */
        public V f16904v;

        public b() {
            throw null;
        }

        public b(K k10, V v10) {
            this.f16903u = k10;
            this.f16904v = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f16903u.compareTo(((b) obj).f16903u);
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
            K k10 = this.f16903u;
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
                V v10 = this.f16904v;
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
            return this.f16903u;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f16904v;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            int i6 = 0;
            K k10 = this.f16903u;
            if (k10 == null) {
                hashCode = 0;
            } else {
                hashCode = k10.hashCode();
            }
            V v10 = this.f16904v;
            if (v10 != null) {
                i6 = v10.hashCode();
            }
            return i6 ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            int i6 = s.f16895z;
            s.this.b();
            V v11 = this.f16904v;
            this.f16904v = v10;
            return v11;
        }

        public final String toString() {
            String valueOf = String.valueOf(this.f16903u);
            String valueOf2 = String.valueOf(this.f16904v);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
            sb2.append(valueOf);
            sb2.append("=");
            sb2.append(valueOf2);
            return sb2.toString();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public class c implements java.util.Iterator<Map.Entry<K, V>>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public int f16906u = -1;

        /* renamed from: v  reason: collision with root package name */
        public boolean f16907v;

        /* renamed from: w  reason: collision with root package name */
        public java.util.Iterator<Map.Entry<K, V>> f16908w;

        public c() {
        }

        public final java.util.Iterator<Map.Entry<K, V>> a() {
            if (this.f16908w == null) {
                this.f16908w = s.this.f16898w.entrySet().iterator();
            }
            return this.f16908w;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f16906u + 1 < s.this.f16897v.size() || a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            this.f16907v = true;
            int i6 = this.f16906u + 1;
            this.f16906u = i6;
            s sVar = s.this;
            if (i6 < sVar.f16897v.size()) {
                return sVar.f16897v.get(this.f16906u);
            }
            return a().next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (this.f16907v) {
                this.f16907v = false;
                int i6 = s.f16895z;
                s sVar = s.this;
                sVar.b();
                if (this.f16906u < sVar.f16897v.size()) {
                    int i10 = this.f16906u;
                    this.f16906u = i10 - 1;
                    sVar.g(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                Object value = entry.getValue();
                s.this.f((Comparable) entry.getKey(), value);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = s.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                s.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return s.this.size();
        }
    }

    public s(int i6) {
        this.f16896u = i6;
    }

    public final int a(K k10) {
        int size = this.f16897v.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f16897v.get(size).f16903u);
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
            int compareTo2 = k10.compareTo(this.f16897v.get(i10).f16903u);
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
        if (!this.f16899x) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final Iterable<Map.Entry<K, V>> c() {
        if (this.f16898w.isEmpty()) {
            return a.f16902b;
        }
        return this.f16898w.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f16897v.isEmpty()) {
            this.f16897v.clear();
        }
        if (!this.f16898w.isEmpty()) {
            this.f16898w.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f16898w.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final SortedMap<K, V> d() {
        b();
        if (this.f16898w.isEmpty() && !(this.f16898w instanceof TreeMap)) {
            this.f16898w = new TreeMap();
        }
        return (SortedMap) this.f16898w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f16900y == null) {
            this.f16900y = new d();
        }
        return this.f16900y;
    }

    public final V f(K k10, V v10) {
        b();
        int a10 = a(k10);
        if (a10 >= 0) {
            return this.f16897v.get(a10).setValue(v10);
        }
        b();
        boolean isEmpty = this.f16897v.isEmpty();
        int i6 = this.f16896u;
        if (isEmpty && !(this.f16897v instanceof ArrayList)) {
            this.f16897v = new ArrayList(i6);
        }
        int i10 = -(a10 + 1);
        if (i10 >= i6) {
            return d().put(k10, v10);
        }
        if (this.f16897v.size() == i6) {
            s<K, V>.b remove = this.f16897v.remove(i6 - 1);
            d().put(remove.f16903u, remove.f16904v);
        }
        this.f16897v.add(i10, new b(k10, v10));
        return null;
    }

    public final V g(int i6) {
        b();
        V v10 = this.f16897v.remove(i6).f16904v;
        if (!this.f16898w.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = d().entrySet().iterator();
            List<s<K, V>.b> list = this.f16897v;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return this.f16897v.get(a10).f16904v;
        }
        return this.f16898w.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return (V) g(a10);
        }
        if (this.f16898w.isEmpty()) {
            return null;
        }
        return this.f16898w.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16898w.size() + this.f16897v.size();
    }
}
