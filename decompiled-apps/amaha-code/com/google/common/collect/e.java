package com.google.common.collect;

import j$.util.Iterator;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.Consumer;
/* compiled from: AbstractMapBasedMultimap.java */
/* loaded from: classes.dex */
public abstract class e<K, V> extends com.google.common.collect.g<K, V> implements Serializable {

    /* renamed from: x  reason: collision with root package name */
    public transient Map<K, Collection<V>> f9352x;

    /* renamed from: y  reason: collision with root package name */
    public transient int f9353y;

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class a extends e0<K, Collection<V>> {

        /* renamed from: w  reason: collision with root package name */
        public final transient Map<K, Collection<V>> f9354w;

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: com.google.common.collect.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0154a extends b0<K, Collection<V>> {
            public C0154a() {
            }

            @Override // com.google.common.collect.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = a.this.f9354w.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Collection<V> collection;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                e eVar = e.this;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = eVar.f9352x;
                map.getClass();
                try {
                    collection = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collection = null;
                }
                Collection<V> collection2 = collection;
                if (collection2 != null) {
                    int size = collection2.size();
                    collection2.clear();
                    eVar.f9353y -= size;
                    return true;
                }
                return true;
            }
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes.dex */
        public class b implements Iterator<Map.Entry<K, Collection<V>>>, j$.util.Iterator {

            /* renamed from: u  reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f9357u;

            /* renamed from: v  reason: collision with root package name */
            public Collection<V> f9358v;

            public b() {
                this.f9357u = a.this.f9354w.entrySet().iterator();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final boolean hasNext() {
                return this.f9357u.hasNext();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f9357u.next();
                this.f9358v = next.getValue();
                return a.this.a(next);
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final void remove() {
                boolean z10;
                if (this.f9358v != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sc.b.B("no calls to next() since the last call to remove()", z10);
                this.f9357u.remove();
                e.this.f9353y -= this.f9358v.size();
                this.f9358v.clear();
                this.f9358v = null;
            }
        }

        public a(Map<K, Collection<V>> map) {
            this.f9354w = map;
        }

        public final r a(Map.Entry entry) {
            Object jVar;
            Object key = entry.getKey();
            com.google.common.collect.c cVar = (com.google.common.collect.c) e.this;
            cVar.getClass();
            List list = (List) ((Collection) entry.getValue());
            if (list instanceof RandomAccess) {
                jVar = new f(cVar, key, list, null);
            } else {
                jVar = new j(key, list, null);
            }
            return new r(key, jVar);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            e eVar = e.this;
            if (this.f9354w == eVar.f9352x) {
                eVar.b();
                return;
            }
            b bVar = new b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f9354w;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            if (this != obj && !this.f9354w.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Object jVar;
            Map<K, Collection<V>> map = this.f9354w;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            com.google.common.collect.c cVar = (com.google.common.collect.c) e.this;
            cVar.getClass();
            List list = (List) collection2;
            if (list instanceof RandomAccess) {
                jVar = new f(cVar, obj, list, null);
            } else {
                jVar = new j(obj, list, null);
            }
            return jVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f9354w.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            c cVar;
            e eVar = e.this;
            c cVar2 = eVar.f9385u;
            if (cVar2 == null) {
                h0 h0Var = (h0) eVar;
                Map<K, Collection<V>> map = h0Var.f9352x;
                if (map instanceof NavigableMap) {
                    cVar = new C0155e((NavigableMap) h0Var.f9352x);
                } else if (map instanceof SortedMap) {
                    cVar = new h((SortedMap) h0Var.f9352x);
                } else {
                    cVar = new c(h0Var.f9352x);
                }
                cVar2 = cVar;
                eVar.f9385u = cVar2;
            }
            return cVar2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> remove = this.f9354w.remove(obj);
            if (remove == null) {
                return null;
            }
            e eVar = e.this;
            List<V> list = ((h0) eVar).f9391z.get();
            list.addAll(remove);
            eVar.f9353y -= remove.size();
            remove.clear();
            return list;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f9354w.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f9354w.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public abstract class b<T> implements java.util.Iterator<T>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final java.util.Iterator<Map.Entry<K, Collection<V>>> f9360u;

        /* renamed from: v  reason: collision with root package name */
        public K f9361v = null;

        /* renamed from: w  reason: collision with root package name */
        public Collection<V> f9362w = null;

        /* renamed from: x  reason: collision with root package name */
        public java.util.Iterator<V> f9363x = w.f9470u;

        public b() {
            this.f9360u = e.this.f9352x.entrySet().iterator();
        }

        public abstract T a(K k10, V v10);

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (!this.f9360u.hasNext() && !this.f9363x.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (!this.f9363x.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f9360u.next();
                this.f9361v = next.getKey();
                Collection<V> value = next.getValue();
                this.f9362w = value;
                this.f9363x = value.iterator();
            }
            return a(this.f9361v, this.f9363x.next());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            this.f9363x.remove();
            Collection<V> collection = this.f9362w;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f9360u.remove();
            }
            e eVar = e.this;
            eVar.f9353y--;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class c extends c0<K, Collection<V>> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes.dex */
        public class a implements java.util.Iterator<K>, j$.util.Iterator {

            /* renamed from: u  reason: collision with root package name */
            public Map.Entry<K, Collection<V>> f9366u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ java.util.Iterator f9367v;

            public a(java.util.Iterator it) {
                this.f9367v = it;
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final boolean hasNext() {
                return this.f9367v.hasNext();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f9367v.next();
                this.f9366u = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final void remove() {
                boolean z10;
                if (this.f9366u != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sc.b.B("no calls to next() since the last call to remove()", z10);
                Collection<V> value = this.f9366u.getValue();
                this.f9367v.remove();
                e.this.f9353y -= value.size();
                value.clear();
                this.f9366u = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            java.util.Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (aVar.hasNext()) {
                    aVar.next();
                    aVar.remove();
                } else {
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f9350u.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (this != obj && !this.f9350u.keySet().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f9350u.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return new a(this.f9350u.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int i6;
            Collection collection = (Collection) this.f9350u.remove(obj);
            if (collection != null) {
                i6 = collection.size();
                collection.clear();
                e.this.f9353y -= i6;
            } else {
                i6 = 0;
            }
            if (i6 <= 0) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class d extends e<K, V>.g implements NavigableMap<K, Collection<V>> {
        public d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.e.g
        public final SortedSet b() {
            return new C0155e(d());
        }

        @Override // com.google.common.collect.e.g
        public final SortedSet c() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = d().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k10) {
            return d().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return ((d) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(d().descendingMap());
        }

        public final r f(java.util.Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            List<V> list = ((h0) e.this).f9391z.get();
            list.addAll((Collection) entry.getValue());
            it.remove();
            return new r(entry.getKey(), Collections.unmodifiableList(list));
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = d().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k10) {
            return d().floorKey(k10);
        }

        @Override // com.google.common.collect.e.g
        /* renamed from: g */
        public final NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) ((SortedMap) this.f9354w);
        }

        @Override // com.google.common.collect.e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = d().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k10) {
            return d().higherKey(k10);
        }

        @Override // com.google.common.collect.e.g, com.google.common.collect.e.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = d().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k10) {
            return d().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return f(((a.C0154a) entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return f(((a.C0154a) ((e0) descendingMap()).entrySet()).iterator());
        }

        @Override // com.google.common.collect.e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new d(d().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new d(d().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new d(d().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0155e extends e<K, V>.h implements NavigableSet<K> {
        public C0155e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k10) {
            return e().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public final java.util.Iterator<K> descendingIterator() {
            return ((c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new C0155e(e().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final K floor(K k10) {
            return e().floorKey(k10);
        }

        @Override // com.google.common.collect.e.h
        /* renamed from: g */
        public final NavigableMap<K, Collection<V>> e() {
            return (NavigableMap) ((SortedMap) this.f9350u);
        }

        @Override // com.google.common.collect.e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k10) {
            return e().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k10) {
            return e().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            c.a aVar = (c.a) iterator();
            if (aVar.hasNext()) {
                K k10 = (K) aVar.next();
                aVar.remove();
                return k10;
            }
            return null;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            java.util.Iterator<K> descendingIterator = descendingIterator();
            if (descendingIterator.hasNext()) {
                K next = descendingIterator.next();
                descendingIterator.remove();
                return next;
            }
            return null;
        }

        @Override // com.google.common.collect.e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k10, boolean z10) {
            return new C0155e(e().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new C0155e(e().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k10, boolean z10) {
            return new C0155e(e().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class f extends e<K, V>.j implements RandomAccess {
        public f(e eVar, K k10, List<V> list, e<K, V>.i iVar) {
            super(k10, list, iVar);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class g extends e<K, V>.a implements SortedMap<K, Collection<V>> {

        /* renamed from: y  reason: collision with root package name */
        public SortedSet<K> f9370y;

        public g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> b() {
            return new h(d());
        }

        @Override // com.google.common.collect.e.a, java.util.AbstractMap, java.util.Map
        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f9370y;
            if (sortedSet == null) {
                SortedSet<K> b10 = b();
                this.f9370y = b10;
                return b10;
            }
            return sortedSet;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.f9354w;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new g(d().headMap(k10));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new g(d().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new g(d().tailMap(k10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class h extends e<K, V>.c implements SortedSet<K> {
        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return e().comparator();
        }

        public SortedMap<K, Collection<V>> e() {
            return (SortedMap) this.f9350u;
        }

        @Override // java.util.SortedSet
        public final K first() {
            return e().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new h(e().headMap(k10));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return e().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new h(e().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new h(e().tailMap(k10));
        }
    }

    public e(Map<K, Collection<V>> map) {
        sc.b.t(map.isEmpty());
        this.f9352x = map;
    }

    public final void b() {
        for (Collection<V> collection : this.f9352x.values()) {
            collection.clear();
        }
        this.f9352x.clear();
        this.f9353y = 0;
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class j extends e<K, V>.i implements List<V> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes.dex */
        public class a extends e<K, V>.i.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public final void add(V v10) {
                j jVar = j.this;
                boolean isEmpty = jVar.isEmpty();
                b().add(v10);
                e.this.f9353y++;
                if (isEmpty) {
                    jVar.e();
                }
            }

            public final ListIterator<V> b() {
                a();
                return (ListIterator) this.f9378u;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v10) {
                b().set(v10);
            }

            public a(int i6) {
                super(((List) j.this.f9374v).listIterator(i6));
            }
        }

        public j(K k10, List<V> list, e<K, V>.i iVar) {
            super(k10, list, iVar);
        }

        @Override // java.util.List
        public final void add(int i6, V v10) {
            g();
            boolean isEmpty = this.f9374v.isEmpty();
            ((List) this.f9374v).add(i6, v10);
            e.this.f9353y++;
            if (isEmpty) {
                e();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i6, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f9374v).addAll(i6, collection);
            if (addAll) {
                e.this.f9353y += this.f9374v.size() - size;
                if (size == 0) {
                    e();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public final V get(int i6) {
            g();
            return (V) ((List) this.f9374v).get(i6);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            g();
            return ((List) this.f9374v).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            g();
            return ((List) this.f9374v).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            g();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i6) {
            g();
            V v10 = (V) ((List) this.f9374v).remove(i6);
            e eVar = e.this;
            eVar.f9353y--;
            m();
            return v10;
        }

        @Override // java.util.List
        public final V set(int i6, V v10) {
            g();
            return (V) ((List) this.f9374v).set(i6, v10);
        }

        @Override // java.util.List
        public final List<V> subList(int i6, int i10) {
            g();
            List subList = ((List) this.f9374v).subList(i6, i10);
            e<K, V>.i iVar = this.f9375w;
            if (iVar == null) {
                iVar = this;
            }
            e eVar = e.this;
            eVar.getClass();
            boolean z10 = subList instanceof RandomAccess;
            K k10 = this.f9373u;
            if (z10) {
                return new f(eVar, k10, subList, iVar);
            }
            return new j(k10, subList, iVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i6) {
            g();
            return new a(i6);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class i extends AbstractCollection<V> {

        /* renamed from: u  reason: collision with root package name */
        public final K f9373u;

        /* renamed from: v  reason: collision with root package name */
        public Collection<V> f9374v;

        /* renamed from: w  reason: collision with root package name */
        public final e<K, V>.i f9375w;

        /* renamed from: x  reason: collision with root package name */
        public final Collection<V> f9376x;

        public i(K k10, Collection<V> collection, e<K, V>.i iVar) {
            Collection<V> collection2;
            this.f9373u = k10;
            this.f9374v = collection;
            this.f9375w = iVar;
            if (iVar == null) {
                collection2 = null;
            } else {
                collection2 = iVar.f9374v;
            }
            this.f9376x = collection2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v10) {
            g();
            boolean isEmpty = this.f9374v.isEmpty();
            boolean add = this.f9374v.add(v10);
            if (add) {
                e.this.f9353y++;
                if (isEmpty) {
                    e();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f9374v.addAll(collection);
            if (addAll) {
                e.this.f9353y += this.f9374v.size() - size;
                if (size == 0) {
                    e();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f9374v.clear();
            e.this.f9353y -= size;
            m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            g();
            return this.f9374v.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            g();
            return this.f9374v.containsAll(collection);
        }

        public final void e() {
            e<K, V>.i iVar = this.f9375w;
            if (iVar != null) {
                iVar.e();
            } else {
                e.this.f9352x.put(this.f9373u, this.f9374v);
            }
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            g();
            return this.f9374v.equals(obj);
        }

        public final void g() {
            Collection<V> collection;
            e<K, V>.i iVar = this.f9375w;
            if (iVar != null) {
                iVar.g();
                if (iVar.f9374v != this.f9376x) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f9374v.isEmpty() && (collection = e.this.f9352x.get(this.f9373u)) != null) {
                this.f9374v = collection;
            }
        }

        @Override // java.util.Collection
        public final int hashCode() {
            g();
            return this.f9374v.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            g();
            return new a();
        }

        public final void m() {
            e<K, V>.i iVar = this.f9375w;
            if (iVar != null) {
                iVar.m();
            } else if (this.f9374v.isEmpty()) {
                e.this.f9352x.remove(this.f9373u);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            g();
            boolean remove = this.f9374v.remove(obj);
            if (remove) {
                e eVar = e.this;
                eVar.f9353y--;
                m();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f9374v.removeAll(collection);
            if (removeAll) {
                e.this.f9353y += this.f9374v.size() - size;
                m();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.f9374v.retainAll(collection);
            if (retainAll) {
                e.this.f9353y += this.f9374v.size() - size;
                m();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            g();
            return this.f9374v.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            g();
            return this.f9374v.toString();
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes.dex */
        public class a implements java.util.Iterator<V>, j$.util.Iterator {

            /* renamed from: u  reason: collision with root package name */
            public final java.util.Iterator<V> f9378u;

            /* renamed from: v  reason: collision with root package name */
            public final Collection<V> f9379v;

            public a() {
                java.util.Iterator<V> it;
                Collection<V> collection = i.this.f9374v;
                this.f9379v = collection;
                if (collection instanceof List) {
                    it = ((List) collection).listIterator();
                } else {
                    it = collection.iterator();
                }
                this.f9378u = it;
            }

            public final void a() {
                i iVar = i.this;
                iVar.g();
                if (iVar.f9374v == this.f9379v) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final boolean hasNext() {
                a();
                return this.f9378u.hasNext();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final V next() {
                a();
                return this.f9378u.next();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final void remove() {
                this.f9378u.remove();
                i iVar = i.this;
                e eVar = e.this;
                eVar.f9353y--;
                iVar.m();
            }

            public a(ListIterator listIterator) {
                this.f9379v = i.this.f9374v;
                this.f9378u = listIterator;
            }
        }
    }
}
