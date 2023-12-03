package t;

import j$.util.Iterator;
import j$.util.Map;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
/* compiled from: MapCollections.java */
/* loaded from: classes.dex */
public abstract class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public g<K, V>.b f32240a;

    /* renamed from: b  reason: collision with root package name */
    public g<K, V>.c f32241b;

    /* renamed from: c  reason: collision with root package name */
    public g<K, V>.e f32242c;

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class a<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final int f32243u;

        /* renamed from: v  reason: collision with root package name */
        public int f32244v;

        /* renamed from: w  reason: collision with root package name */
        public int f32245w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f32246x = false;

        public a(int i6) {
            this.f32243u = i6;
            this.f32244v = g.this.d();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f32245w < this.f32244v) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (hasNext()) {
                T t3 = (T) g.this.b(this.f32245w, this.f32243u);
                this.f32245w++;
                this.f32246x = true;
                return t3;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (this.f32246x) {
                int i6 = this.f32245w - 1;
                this.f32245w = i6;
                this.f32244v--;
                this.f32246x = false;
                g.this.h(i6);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            g gVar = g.this;
            int d10 = gVar.d();
            for (Map.Entry<K, V> entry : collection) {
                gVar.g(entry.getKey(), entry.getValue());
            }
            if (d10 != gVar.d()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            g gVar = g.this;
            int e10 = gVar.e(key);
            if (e10 < 0) {
                return false;
            }
            Object b10 = gVar.b(e10, 1);
            Object value = entry.getValue();
            if (b10 != value && (b10 == null || !b10.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int hashCode;
            int hashCode2;
            g gVar = g.this;
            int i6 = 0;
            for (int d10 = gVar.d() - 1; d10 >= 0; d10--) {
                Object b10 = gVar.b(d10, 0);
                Object b11 = gVar.b(d10, 1);
                if (b10 == null) {
                    hashCode = 0;
                } else {
                    hashCode = b10.hashCode();
                }
                if (b11 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = b11.hashCode();
                }
                i6 += hashCode ^ hashCode2;
            }
            return i6;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            if (g.this.d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (g.this.e(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> c10 = g.this.c();
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!c10.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int hashCode;
            g gVar = g.this;
            int i6 = 0;
            for (int d10 = gVar.d() - 1; d10 >= 0; d10--) {
                Object b10 = gVar.b(d10, 0);
                if (b10 == null) {
                    hashCode = 0;
                } else {
                    hashCode = b10.hashCode();
                }
                i6 += hashCode;
            }
            return i6;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            if (g.this.d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            g gVar = g.this;
            int e10 = gVar.e(obj);
            if (e10 >= 0) {
                gVar.h(e10);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> c10 = g.this.c();
            int size = c10.size();
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                c10.remove(it.next());
            }
            if (size != c10.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return g.k(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.l(0, tArr);
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            g gVar = g.this;
            int d10 = gVar.d();
            Object[] objArr = new Object[d10];
            for (int i6 = 0; i6 < d10; i6++) {
                objArr[i6] = gVar.b(i6, 0);
            }
            return objArr;
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class d implements java.util.Iterator<Map.Entry<K, V>>, Map.Entry<K, V>, j$.util.Iterator, Map.Entry {

        /* renamed from: u  reason: collision with root package name */
        public int f32250u;

        /* renamed from: w  reason: collision with root package name */
        public boolean f32252w = false;

        /* renamed from: v  reason: collision with root package name */
        public int f32251v = -1;

        public d() {
            this.f32250u = g.this.d() - 1;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean z10;
            boolean z11;
            if (this.f32252w) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i6 = this.f32251v;
                g gVar = g.this;
                Object b10 = gVar.b(i6, 0);
                if (key != b10 && (key == null || !key.equals(b10))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return false;
                }
                Object value = entry.getValue();
                Object b11 = gVar.b(this.f32251v, 1);
                if (value != b11 && (value == null || !value.equals(b11))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final K getKey() {
            if (this.f32252w) {
                return (K) g.this.b(this.f32251v, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final V getValue() {
            if (this.f32252w) {
                return (V) g.this.b(this.f32251v, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f32251v < this.f32250u) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            if (this.f32252w) {
                int i6 = this.f32251v;
                g gVar = g.this;
                int i10 = 0;
                Object b10 = gVar.b(i6, 0);
                Object b11 = gVar.b(this.f32251v, 1);
                if (b10 == null) {
                    hashCode = 0;
                } else {
                    hashCode = b10.hashCode();
                }
                if (b11 != null) {
                    i10 = b11.hashCode();
                }
                return hashCode ^ i10;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.f32251v++;
                this.f32252w = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (this.f32252w) {
                g.this.h(this.f32251v);
                this.f32251v--;
                this.f32250u--;
                this.f32252w = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final V setValue(V v10) {
            if (this.f32252w) {
                return (V) g.this.i(this.f32251v, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            if (g.this.f(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            if (g.this.d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            g gVar = g.this;
            int f = gVar.f(obj);
            if (f >= 0) {
                gVar.h(f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            g gVar = g.this;
            int d10 = gVar.d();
            int i6 = 0;
            boolean z10 = false;
            while (i6 < d10) {
                if (collection.contains(gVar.b(i6, 1))) {
                    gVar.h(i6);
                    i6--;
                    d10--;
                    z10 = true;
                }
                i6++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            g gVar = g.this;
            int d10 = gVar.d();
            int i6 = 0;
            boolean z10 = false;
            while (i6 < d10) {
                if (!collection.contains(gVar.b(i6, 1))) {
                    gVar.h(i6);
                    i6--;
                    d10--;
                    z10 = true;
                }
                i6++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.l(1, tArr);
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            g gVar = g.this;
            int d10 = gVar.d();
            Object[] objArr = new Object[d10];
            for (int i6 = 0; i6 < d10; i6++) {
                objArr[i6] = gVar.b(i6, 1);
            }
            return objArr;
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(java.util.Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public abstract void a();

    public abstract Object b(int i6, int i10);

    public abstract java.util.Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k10, V v10);

    public abstract void h(int i6);

    public abstract V i(int i6, V v10);

    public final Object[] l(int i6, Object[] objArr) {
        int d10 = d();
        if (objArr.length < d10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d10);
        }
        for (int i10 = 0; i10 < d10; i10++) {
            objArr[i10] = b(i10, i6);
        }
        if (objArr.length > d10) {
            objArr[d10] = null;
        }
        return objArr;
    }
}
