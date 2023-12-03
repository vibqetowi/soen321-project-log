package com.google.common.collect;

import j$.util.Iterator;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
/* compiled from: CompactHashMap.java */
/* loaded from: classes.dex */
public final class k<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object D = new Object();
    public transient c A;
    public transient a B;
    public transient e C;

    /* renamed from: u  reason: collision with root package name */
    public transient Object f9395u;

    /* renamed from: v  reason: collision with root package name */
    public transient int[] f9396v;

    /* renamed from: w  reason: collision with root package name */
    public transient Object[] f9397w;

    /* renamed from: x  reason: collision with root package name */
    public transient Object[] f9398x;

    /* renamed from: y  reason: collision with root package name */
    public transient int f9399y;

    /* renamed from: z  reason: collision with root package name */
    public transient int f9400z;

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes.dex */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            k kVar = k.this;
            Map<K, V> a10 = kVar.a();
            if (a10 != null) {
                return a10.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int b10 = kVar.b(entry.getKey());
            if (b10 == -1 || !f6.b.v0(kVar.l(b10), entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            k kVar = k.this;
            Map<K, V> a10 = kVar.a();
            if (a10 != null) {
                return a10.entrySet().iterator();
            }
            return new i(kVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            k kVar = k.this;
            Map<K, V> a10 = kVar.a();
            if (a10 != null) {
                return a10.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (kVar.f()) {
                return false;
            }
            int i6 = (1 << (kVar.f9399y & 31)) - 1;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = kVar.f9395u;
            Objects.requireNonNull(obj2);
            int d10 = x.d(key, value, i6, obj2, kVar.h(), kVar.i(), kVar.j());
            if (d10 == -1) {
                return false;
            }
            kVar.d(d10, i6);
            kVar.f9400z--;
            kVar.f9399y += 32;
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return k.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes.dex */
    public abstract class b<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public int f9402u;

        /* renamed from: v  reason: collision with root package name */
        public int f9403v;

        /* renamed from: w  reason: collision with root package name */
        public int f9404w;

        public b() {
            int i6;
            this.f9402u = k.this.f9399y;
            if (k.this.isEmpty()) {
                i6 = -1;
            } else {
                i6 = 0;
            }
            this.f9403v = i6;
            this.f9404w = -1;
        }

        public abstract T a(int i6);

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f9403v >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            k kVar = k.this;
            if (kVar.f9399y == this.f9402u) {
                if (hasNext()) {
                    int i6 = this.f9403v;
                    this.f9404w = i6;
                    T a10 = a(i6);
                    int i10 = this.f9403v + 1;
                    if (i10 >= kVar.f9400z) {
                        i10 = -1;
                    }
                    this.f9403v = i10;
                    return a10;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            boolean z10;
            k kVar = k.this;
            if (kVar.f9399y == this.f9402u) {
                if (this.f9404w >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sc.b.B("no calls to next() since the last call to remove()", z10);
                this.f9402u += 32;
                kVar.remove(kVar.c(this.f9404w));
                this.f9403v--;
                this.f9404w = -1;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes.dex */
    public class c extends AbstractSet<K> {
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
        public final java.util.Iterator<K> iterator() {
            k kVar = k.this;
            Map<K, V> a10 = kVar.a();
            if (a10 != null) {
                return a10.keySet().iterator();
            }
            return new h(kVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            k kVar = k.this;
            Map<K, V> a10 = kVar.a();
            if (a10 != null) {
                return a10.keySet().remove(obj);
            }
            if (kVar.g(obj) != k.D) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return k.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes.dex */
    public final class d extends f<K, V> {

        /* renamed from: u  reason: collision with root package name */
        public final K f9407u;

        /* renamed from: v  reason: collision with root package name */
        public int f9408v;

        public d(int i6) {
            Object obj = k.D;
            this.f9407u = (K) k.this.c(i6);
            this.f9408v = i6;
        }

        public final void a() {
            int i6 = this.f9408v;
            K k10 = this.f9407u;
            k kVar = k.this;
            if (i6 == -1 || i6 >= kVar.size() || !f6.b.v0(k10, kVar.c(this.f9408v))) {
                Object obj = k.D;
                this.f9408v = kVar.b(k10);
            }
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public final K getKey() {
            return this.f9407u;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public final V getValue() {
            k kVar = k.this;
            Map<K, V> a10 = kVar.a();
            if (a10 != null) {
                return a10.get(this.f9407u);
            }
            a();
            int i6 = this.f9408v;
            if (i6 == -1) {
                return null;
            }
            return (V) kVar.l(i6);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            k kVar = k.this;
            Map<K, V> a10 = kVar.a();
            K k10 = this.f9407u;
            if (a10 != null) {
                return a10.put(k10, v10);
            }
            a();
            int i6 = this.f9408v;
            if (i6 == -1) {
                kVar.put(k10, v10);
                return null;
            }
            V v11 = (V) kVar.l(i6);
            kVar.j()[this.f9408v] = v10;
            return v11;
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes.dex */
    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            k kVar = k.this;
            Map<K, V> a10 = kVar.a();
            if (a10 != null) {
                return a10.values().iterator();
            }
            return new j(kVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return k.this.size();
        }
    }

    public k(int i6) {
        boolean z10;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.s("Expected size must be >= 0", z10);
        this.f9399y = qc.a.E(i6, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        boolean z10;
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            if (readInt >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.s("Expected size must be >= 0", z10);
            this.f9399y = qc.a.E(readInt, 1);
            for (int i6 = 0; i6 < readInt; i6++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(defpackage.b.h(25, "Invalid size: ", readInt));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        java.util.Iterator<Map.Entry<K, V>> iVar;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map<K, V> a10 = a();
        if (a10 != null) {
            iVar = a10.entrySet().iterator();
        } else {
            iVar = new i(this);
        }
        while (iVar.hasNext()) {
            Map.Entry<K, V> next = iVar.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public final Map<K, V> a() {
        Object obj = this.f9395u;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int b(Object obj) {
        if (f()) {
            return -1;
        }
        int f = x.f(obj);
        int i6 = (1 << (this.f9399y & 31)) - 1;
        Object obj2 = this.f9395u;
        Objects.requireNonNull(obj2);
        int g5 = x.g(f & i6, obj2);
        if (g5 == 0) {
            return -1;
        }
        int i10 = ~i6;
        int i11 = f & i10;
        do {
            int i12 = g5 - 1;
            int i13 = h()[i12];
            if ((i13 & i10) == i11 && f6.b.v0(obj, c(i12))) {
                return i12;
            }
            g5 = i13 & i6;
        } while (g5 != 0);
        return -1;
    }

    public final K c(int i6) {
        return (K) i()[i6];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f9399y += 32;
        Map<K, V> a10 = a();
        if (a10 != null) {
            this.f9399y = qc.a.E(size(), 3);
            a10.clear();
            this.f9395u = null;
            this.f9400z = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f9400z, (Object) null);
        Arrays.fill(j(), 0, this.f9400z, (Object) null);
        Object obj = this.f9395u;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f9400z, 0);
        this.f9400z = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> a10 = a();
        if (a10 != null) {
            return a10.containsKey(obj);
        }
        if (b(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> a10 = a();
        if (a10 != null) {
            return a10.containsValue(obj);
        }
        for (int i6 = 0; i6 < this.f9400z; i6++) {
            if (f6.b.v0(obj, l(i6))) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i6, int i10) {
        Object obj = this.f9395u;
        Objects.requireNonNull(obj);
        int[] h10 = h();
        Object[] i11 = i();
        Object[] j10 = j();
        int size = size() - 1;
        if (i6 < size) {
            Object obj2 = i11[size];
            i11[i6] = obj2;
            j10[i6] = j10[size];
            i11[size] = null;
            j10[size] = null;
            h10[i6] = h10[size];
            h10[size] = 0;
            int f = x.f(obj2) & i10;
            int g5 = x.g(f, obj);
            int i12 = size + 1;
            if (g5 == i12) {
                x.h(f, i6 + 1, obj);
                return;
            }
            while (true) {
                int i13 = g5 - 1;
                int i14 = h10[i13];
                int i15 = i14 & i10;
                if (i15 == i12) {
                    h10[i13] = ((i6 + 1) & i10) | (i14 & (~i10));
                    return;
                }
                g5 = i15;
            }
        } else {
            i11[i6] = null;
            j10[i6] = null;
            h10[i6] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a aVar = this.B;
        if (aVar == null) {
            a aVar2 = new a();
            this.B = aVar2;
            return aVar2;
        }
        return aVar;
    }

    public final boolean f() {
        if (this.f9395u == null) {
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        boolean f = f();
        Object obj2 = D;
        if (f) {
            return obj2;
        }
        int i6 = (1 << (this.f9399y & 31)) - 1;
        Object obj3 = this.f9395u;
        Objects.requireNonNull(obj3);
        int d10 = x.d(obj, null, i6, obj3, h(), i(), null);
        if (d10 == -1) {
            return obj2;
        }
        V l2 = l(d10);
        d(d10, i6);
        this.f9400z--;
        this.f9399y += 32;
        return l2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> a10 = a();
        if (a10 != null) {
            return a10.get(obj);
        }
        int b10 = b(obj);
        if (b10 == -1) {
            return null;
        }
        return l(b10);
    }

    public final int[] h() {
        int[] iArr = this.f9396v;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f9397w;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.f9398x;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i6, int i10, int i11, int i12) {
        Object b10 = x.b(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            x.h(i11 & i13, i12 + 1, b10);
        }
        Object obj = this.f9395u;
        Objects.requireNonNull(obj);
        int[] h10 = h();
        for (int i14 = 0; i14 <= i6; i14++) {
            int g5 = x.g(i14, obj);
            while (g5 != 0) {
                int i15 = g5 - 1;
                int i16 = h10[i15];
                int i17 = ((~i6) & i16) | i14;
                int i18 = i17 & i13;
                int g10 = x.g(i18, b10);
                x.h(i18, g5, b10);
                h10[i15] = ((~i13) & i17) | (g10 & i13);
                g5 = i16 & i6;
            }
        }
        this.f9395u = b10;
        this.f9399y = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.f9399y & (-32));
        return i13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        c cVar = this.A;
        if (cVar == null) {
            c cVar2 = new c();
            this.A = cVar2;
            return cVar2;
        }
        return cVar;
    }

    public final V l(int i6) {
        return (V) j()[i6];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        int i6;
        int min;
        int i10;
        if (f()) {
            sc.b.B("Arrays already allocated", f());
            int i11 = this.f9399y;
            int max = Math.max(i11 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (highestOneBit * 1.0d)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f9395u = x.b(max2);
            this.f9399y = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f9399y & (-32));
            this.f9396v = new int[i11];
            this.f9397w = new Object[i11];
            this.f9398x = new Object[i11];
        }
        Map<K, V> a10 = a();
        if (a10 != null) {
            return a10.put(k10, v10);
        }
        int[] h10 = h();
        Object[] i12 = i();
        Object[] j10 = j();
        int i13 = this.f9400z;
        int i14 = i13 + 1;
        int f = x.f(k10);
        int i15 = (1 << (this.f9399y & 31)) - 1;
        int i16 = f & i15;
        Object obj = this.f9395u;
        Objects.requireNonNull(obj);
        int g5 = x.g(i16, obj);
        int i17 = 0;
        if (g5 == 0) {
            if (i14 > i15) {
                if (i15 < 32) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                i15 = k(i15, (i15 + 1) * i10, f, i13);
            } else {
                Object obj2 = this.f9395u;
                Objects.requireNonNull(obj2);
                x.h(i16, i14, obj2);
            }
        } else {
            int i18 = ~i15;
            int i19 = f & i18;
            int i20 = 0;
            while (true) {
                int i21 = g5 - 1;
                int i22 = h10[i21];
                int i23 = i22 & i18;
                if (i23 == i19 && f6.b.v0(k10, i12[i21])) {
                    V v11 = (V) j10[i21];
                    j10[i21] = v10;
                    return v11;
                }
                int i24 = i22 & i15;
                int i25 = i19;
                int i26 = i20 + 1;
                if (i24 == 0) {
                    if (i26 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(((1 << (this.f9399y & 31)) - 1) + 1, 1.0f);
                        if (isEmpty()) {
                            i17 = -1;
                        }
                        int i27 = i17;
                        while (i27 >= 0) {
                            linkedHashMap.put(c(i27), l(i27));
                            i27++;
                            if (i27 >= this.f9400z) {
                                i27 = -1;
                            }
                        }
                        this.f9395u = linkedHashMap;
                        this.f9396v = null;
                        this.f9397w = null;
                        this.f9398x = null;
                        this.f9399y += 32;
                        return (V) linkedHashMap.put(k10, v10);
                    } else if (i14 > i15) {
                        if (i15 < 32) {
                            i6 = 4;
                        } else {
                            i6 = 2;
                        }
                        i15 = k(i15, (i15 + 1) * i6, f, i13);
                    } else {
                        h10[i21] = (i14 & i15) | i23;
                    }
                } else {
                    g5 = i24;
                    i20 = i26;
                    i19 = i25;
                }
            }
        }
        int length = h().length;
        if (i14 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f9396v = Arrays.copyOf(h(), min);
            this.f9397w = Arrays.copyOf(i(), min);
            this.f9398x = Arrays.copyOf(j(), min);
        }
        h()[i13] = ((~i15) & f) | (i15 & 0);
        i()[i13] = k10;
        j()[i13] = v10;
        this.f9400z = i14;
        this.f9399y += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> a10 = a();
        if (a10 != null) {
            return a10.remove(obj);
        }
        V v10 = (V) g(obj);
        if (v10 == D) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> a10 = a();
        if (a10 != null) {
            return a10.size();
        }
        return this.f9400z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        e eVar = this.C;
        if (eVar == null) {
            e eVar2 = new e();
            this.C = eVar2;
            return eVar2;
        }
        return eVar;
    }
}
