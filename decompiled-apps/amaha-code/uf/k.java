package uf;

import j$.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
/* compiled from: LinkedTreeMap.java */
/* loaded from: classes.dex */
public final class k<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a B = new a();
    public k<K, V>.c A;

    /* renamed from: u  reason: collision with root package name */
    public final Comparator<? super K> f34075u;

    /* renamed from: v  reason: collision with root package name */
    public e<K, V> f34076v;

    /* renamed from: w  reason: collision with root package name */
    public int f34077w;

    /* renamed from: x  reason: collision with root package name */
    public int f34078x;

    /* renamed from: y  reason: collision with root package name */
    public final e<K, V> f34079y;

    /* renamed from: z  reason: collision with root package name */
    public k<K, V>.b f34080z;

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes.dex */
        public class a extends k<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final Object next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && k.this.b((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            k kVar;
            e<K, V> b10;
            if (!(obj instanceof Map.Entry) || (b10 = (kVar = k.this).b((Map.Entry) obj)) == null) {
                return false;
            }
            kVar.d(b10, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return k.this.f34077w;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes.dex */
    public final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes.dex */
        public class a extends k<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final K next() {
                return a().f34092z;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0016 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean remove(Object obj) {
            e<K, V> a10;
            k kVar = k.this;
            kVar.getClass();
            if (obj != null) {
                try {
                    a10 = kVar.a(obj, false);
                } catch (ClassCastException unused) {
                }
                if (a10 != null) {
                    kVar.d(a10, true);
                }
                if (a10 != null) {
                    return false;
                }
                return true;
            }
            a10 = null;
            if (a10 != null) {
            }
            if (a10 != null) {
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return k.this.f34077w;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes.dex */
    public abstract class d<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public e<K, V> f34083u;

        /* renamed from: v  reason: collision with root package name */
        public e<K, V> f34084v = null;

        /* renamed from: w  reason: collision with root package name */
        public int f34085w;

        public d() {
            this.f34083u = k.this.f34079y.f34090x;
            this.f34085w = k.this.f34078x;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f34083u;
            k kVar = k.this;
            if (eVar != kVar.f34079y) {
                if (kVar.f34078x == this.f34085w) {
                    this.f34083u = eVar.f34090x;
                    this.f34084v = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f34083u != k.this.f34079y) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f34084v;
            if (eVar != null) {
                k kVar = k.this;
                kVar.d(eVar, true);
                this.f34084v = null;
                this.f34085w = kVar.f34078x;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public k() {
        a aVar = B;
        this.f34077w = 0;
        this.f34078x = 0;
        this.f34079y = new e<>();
        this.f34075u = aVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final e<K, V> a(K k10, boolean z10) {
        int i6;
        e<K, V> eVar;
        Comparable comparable;
        e<K, V> eVar2;
        e<K, V> eVar3 = this.f34076v;
        a aVar = B;
        Comparator<? super K> comparator = this.f34075u;
        if (eVar3 != null) {
            if (comparator == aVar) {
                comparable = (Comparable) k10;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj = (K) eVar3.f34092z;
                if (comparable != null) {
                    i6 = comparable.compareTo(obj);
                } else {
                    i6 = comparator.compare(k10, obj);
                }
                if (i6 == 0) {
                    return eVar3;
                }
                if (i6 < 0) {
                    eVar2 = eVar3.f34088v;
                } else {
                    eVar2 = eVar3.f34089w;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i6 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f34079y;
        if (eVar3 == null) {
            if (comparator == aVar && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(eVar3, k10, eVar4, eVar4.f34091y);
            this.f34076v = eVar;
        } else {
            eVar = new e<>(eVar3, k10, eVar4, eVar4.f34091y);
            if (i6 < 0) {
                eVar3.f34088v = eVar;
            } else {
                eVar3.f34089w = eVar;
            }
            c(eVar3, true);
        }
        this.f34077w++;
        this.f34078x++;
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e<K, V> b(Map.Entry<?, ?> entry) {
        e<K, V> a10;
        boolean z10;
        Object key = entry.getKey();
        boolean z11 = false;
        if (key != null) {
            try {
                a10 = a(key, false);
            } catch (ClassCastException unused) {
            }
            if (a10 != null) {
                V v10 = a10.A;
                Object value = entry.getValue();
                if (v10 != value && (v10 == null || !v10.equals(value))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    z11 = true;
                }
            }
            if (z11) {
                return null;
            }
            return a10;
        }
        a10 = null;
        if (a10 != null) {
        }
        if (z11) {
        }
    }

    public final void c(e<K, V> eVar, boolean z10) {
        int i6;
        int i10;
        int i11;
        int i12;
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f34088v;
            e<K, V> eVar3 = eVar.f34089w;
            int i13 = 0;
            if (eVar2 != null) {
                i6 = eVar2.B;
            } else {
                i6 = 0;
            }
            if (eVar3 != null) {
                i10 = eVar3.B;
            } else {
                i10 = 0;
            }
            int i14 = i6 - i10;
            if (i14 == -2) {
                e<K, V> eVar4 = eVar3.f34088v;
                e<K, V> eVar5 = eVar3.f34089w;
                if (eVar5 != null) {
                    i12 = eVar5.B;
                } else {
                    i12 = 0;
                }
                if (eVar4 != null) {
                    i13 = eVar4.B;
                }
                int i15 = i13 - i12;
                if (i15 != -1 && (i15 != 0 || z10)) {
                    h(eVar3);
                    g(eVar);
                } else {
                    g(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i14 == 2) {
                e<K, V> eVar6 = eVar2.f34088v;
                e<K, V> eVar7 = eVar2.f34089w;
                if (eVar7 != null) {
                    i11 = eVar7.B;
                } else {
                    i11 = 0;
                }
                if (eVar6 != null) {
                    i13 = eVar6.B;
                }
                int i16 = i13 - i11;
                if (i16 != 1 && (i16 != 0 || z10)) {
                    g(eVar2);
                    h(eVar);
                } else {
                    h(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i14 == 0) {
                eVar.B = i6 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.B = Math.max(i6, i10) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f34087u;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f34076v = null;
        this.f34077w = 0;
        this.f34078x++;
        e<K, V> eVar = this.f34079y;
        eVar.f34091y = eVar;
        eVar.f34090x = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[ORIG_RETURN, RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsKey(Object obj) {
        e<K, V> a10;
        if (obj != 0) {
            try {
                a10 = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (a10 != null) {
                return false;
            }
            return true;
        }
        a10 = null;
        if (a10 != null) {
        }
    }

    public final void d(e<K, V> eVar, boolean z10) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i6;
        if (z10) {
            e<K, V> eVar4 = eVar.f34091y;
            eVar4.f34090x = eVar.f34090x;
            eVar.f34090x.f34091y = eVar4;
        }
        e<K, V> eVar5 = eVar.f34088v;
        e<K, V> eVar6 = eVar.f34089w;
        e<K, V> eVar7 = eVar.f34087u;
        int i10 = 0;
        if (eVar5 != null && eVar6 != null) {
            if (eVar5.B > eVar6.B) {
                e<K, V> eVar8 = eVar5.f34089w;
                while (true) {
                    e<K, V> eVar9 = eVar8;
                    eVar3 = eVar5;
                    eVar5 = eVar9;
                    if (eVar5 == null) {
                        break;
                    }
                    eVar8 = eVar5.f34089w;
                }
            } else {
                e<K, V> eVar10 = eVar6.f34088v;
                while (true) {
                    eVar2 = eVar6;
                    eVar6 = eVar10;
                    if (eVar6 == null) {
                        break;
                    }
                    eVar10 = eVar6.f34088v;
                }
                eVar3 = eVar2;
            }
            d(eVar3, false);
            e<K, V> eVar11 = eVar.f34088v;
            if (eVar11 != null) {
                i6 = eVar11.B;
                eVar3.f34088v = eVar11;
                eVar11.f34087u = eVar3;
                eVar.f34088v = null;
            } else {
                i6 = 0;
            }
            e<K, V> eVar12 = eVar.f34089w;
            if (eVar12 != null) {
                i10 = eVar12.B;
                eVar3.f34089w = eVar12;
                eVar12.f34087u = eVar3;
                eVar.f34089w = null;
            }
            eVar3.B = Math.max(i6, i10) + 1;
            f(eVar, eVar3);
            return;
        }
        if (eVar5 != null) {
            f(eVar, eVar5);
            eVar.f34088v = null;
        } else if (eVar6 != null) {
            f(eVar, eVar6);
            eVar.f34089w = null;
        } else {
            f(eVar, null);
        }
        c(eVar7, false);
        this.f34077w--;
        this.f34078x++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        k<K, V>.b bVar = this.f34080z;
        if (bVar == null) {
            k<K, V>.b bVar2 = new b();
            this.f34080z = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f34087u;
        eVar.f34087u = null;
        if (eVar2 != null) {
            eVar2.f34087u = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f34088v == eVar) {
                eVar3.f34088v = eVar2;
                return;
            } else {
                eVar3.f34089w = eVar2;
                return;
            }
        }
        this.f34076v = eVar2;
    }

    public final void g(e<K, V> eVar) {
        int i6;
        int i10;
        e<K, V> eVar2 = eVar.f34088v;
        e<K, V> eVar3 = eVar.f34089w;
        e<K, V> eVar4 = eVar3.f34088v;
        e<K, V> eVar5 = eVar3.f34089w;
        eVar.f34089w = eVar4;
        if (eVar4 != null) {
            eVar4.f34087u = eVar;
        }
        f(eVar, eVar3);
        eVar3.f34088v = eVar;
        eVar.f34087u = eVar3;
        int i11 = 0;
        if (eVar2 != null) {
            i6 = eVar2.B;
        } else {
            i6 = 0;
        }
        if (eVar4 != null) {
            i10 = eVar4.B;
        } else {
            i10 = 0;
        }
        int max = Math.max(i6, i10) + 1;
        eVar.B = max;
        if (eVar5 != null) {
            i11 = eVar5.B;
        }
        eVar3.B = Math.max(max, i11) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        e<K, V> eVar;
        if (obj != 0) {
            try {
                eVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (eVar != null) {
                return null;
            }
            return eVar.A;
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    public final void h(e<K, V> eVar) {
        int i6;
        int i10;
        e<K, V> eVar2 = eVar.f34088v;
        e<K, V> eVar3 = eVar.f34089w;
        e<K, V> eVar4 = eVar2.f34088v;
        e<K, V> eVar5 = eVar2.f34089w;
        eVar.f34088v = eVar5;
        if (eVar5 != null) {
            eVar5.f34087u = eVar;
        }
        f(eVar, eVar2);
        eVar2.f34089w = eVar;
        eVar.f34087u = eVar2;
        int i11 = 0;
        if (eVar3 != null) {
            i6 = eVar3.B;
        } else {
            i6 = 0;
        }
        if (eVar5 != null) {
            i10 = eVar5.B;
        } else {
            i10 = 0;
        }
        int max = Math.max(i6, i10) + 1;
        eVar.B = max;
        if (eVar4 != null) {
            i11 = eVar4.B;
        }
        eVar2.B = Math.max(max, i11) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        k<K, V>.c cVar = this.A;
        if (cVar == null) {
            k<K, V>.c cVar2 = new c();
            this.A = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        if (k10 != null) {
            e<K, V> a10 = a(k10, true);
            V v11 = a10.A;
            a10.A = v10;
            return v11;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V remove(Object obj) {
        e<K, V> eVar;
        if (obj != 0) {
            try {
                eVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (eVar != null) {
                d(eVar, true);
            }
            if (eVar != null) {
                return null;
            }
            return eVar.A;
        }
        eVar = null;
        if (eVar != null) {
        }
        if (eVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f34077w;
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {
        public V A;
        public int B;

        /* renamed from: u  reason: collision with root package name */
        public e<K, V> f34087u;

        /* renamed from: v  reason: collision with root package name */
        public e<K, V> f34088v;

        /* renamed from: w  reason: collision with root package name */
        public e<K, V> f34089w;

        /* renamed from: x  reason: collision with root package name */
        public e<K, V> f34090x;

        /* renamed from: y  reason: collision with root package name */
        public e<K, V> f34091y;

        /* renamed from: z  reason: collision with root package name */
        public final K f34092z;

        public e() {
            this.f34092z = null;
            this.f34091y = this;
            this.f34090x = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f34092z;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.A;
            if (v10 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v10.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f34092z;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.A;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            int i6 = 0;
            K k10 = this.f34092z;
            if (k10 == null) {
                hashCode = 0;
            } else {
                hashCode = k10.hashCode();
            }
            V v10 = this.A;
            if (v10 != null) {
                i6 = v10.hashCode();
            }
            return i6 ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = this.A;
            this.A = v10;
            return v11;
        }

        public final String toString() {
            return this.f34092z + "=" + this.A;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f34087u = eVar;
            this.f34092z = k10;
            this.B = 1;
            this.f34090x = eVar2;
            this.f34091y = eVar3;
            eVar3.f34090x = this;
            eVar2.f34091y = this;
        }
    }
}
