package com.google.common.collect;

import com.google.common.collect.z.i;
import com.google.common.collect.z.n;
import j$.util.Iterator;
import j$.util.concurrent.ConcurrentMap;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import nc.d;
/* compiled from: MapMakerInternalMap.java */
/* loaded from: classes.dex */
public final class z<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, j$.util.concurrent.ConcurrentMap {
    public static final a D = new a();
    public transient l A;
    public transient v B;
    public transient g C;

    /* renamed from: u  reason: collision with root package name */
    public final transient int f9477u;

    /* renamed from: v  reason: collision with root package name */
    public final transient int f9478v;

    /* renamed from: w  reason: collision with root package name */
    public final transient n<K, V, E, S>[] f9479w;

    /* renamed from: x  reason: collision with root package name */
    public final int f9480x;

    /* renamed from: y  reason: collision with root package name */
    public final nc.d<Object> f9481y;

    /* renamed from: z  reason: collision with root package name */
    public final transient j<K, V, E, S> f9482z;

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public interface a0<K, V, E extends i<K, V, E>> extends i<K, V, E> {
        b0<K, V, E> b();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static abstract class b<K, V> extends com.google.common.collect.n<K, V> implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final p f9483u;

        /* renamed from: v  reason: collision with root package name */
        public final p f9484v;

        /* renamed from: w  reason: collision with root package name */
        public final nc.d<Object> f9485w;

        /* renamed from: x  reason: collision with root package name */
        public final int f9486x;

        /* renamed from: y  reason: collision with root package name */
        public transient ConcurrentMap<K, V> f9487y;

        public b(p pVar, p pVar2, nc.d dVar, int i6, ConcurrentMap concurrentMap) {
            this.f9483u = pVar;
            this.f9484v = pVar2;
            this.f9485w = dVar;
            this.f9486x = i6;
            this.f9487y = concurrentMap;
        }

        @Override // com.google.common.collect.p
        public final Object a() {
            return this.f9487y;
        }

        @Override // com.google.common.collect.o
        public final Map b() {
            return this.f9487y;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public interface b0<K, V, E extends i<K, V, E>> {
        b0 a(ReferenceQueue referenceQueue, a0 a0Var);

        E b();

        void clear();

        V get();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static abstract class c<K, V, E extends i<K, V, E>> implements i<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        public final K f9488a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9489b;

        /* renamed from: c  reason: collision with root package name */
        public final E f9490c;

        public c(K k10, int i6, E e10) {
            this.f9488a = k10;
            this.f9489b = i6;
            this.f9490c = e10;
        }

        @Override // com.google.common.collect.z.i
        public final E a() {
            return this.f9490c;
        }

        @Override // com.google.common.collect.z.i
        public final int getHash() {
            return this.f9489b;
        }

        @Override // com.google.common.collect.z.i
        public final K getKey() {
            return this.f9488a;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class c0<K, V, E extends i<K, V, E>> extends WeakReference<V> implements b0<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        public final E f9491a;

        public c0(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f9491a = e10;
        }

        @Override // com.google.common.collect.z.b0
        public final b0 a(ReferenceQueue referenceQueue, a0 a0Var) {
            return new c0(referenceQueue, get(), a0Var);
        }

        @Override // com.google.common.collect.z.b0
        public final E b() {
            return this.f9491a;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static abstract class d<K, V, E extends i<K, V, E>> extends WeakReference<K> implements i<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        public final int f9492a;

        /* renamed from: b  reason: collision with root package name */
        public final E f9493b;

        public d(ReferenceQueue<K> referenceQueue, K k10, int i6, E e10) {
            super(k10, referenceQueue);
            this.f9492a = i6;
            this.f9493b = e10;
        }

        @Override // com.google.common.collect.z.i
        public final E a() {
            return this.f9493b;
        }

        @Override // com.google.common.collect.z.i
        public final int getHash() {
            return this.f9492a;
        }

        @Override // com.google.common.collect.z.i
        public final K getKey() {
            return get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class d0 extends com.google.common.collect.f<K, V> {

        /* renamed from: u  reason: collision with root package name */
        public final K f9494u;

        /* renamed from: v  reason: collision with root package name */
        public V f9495v;

        public d0(K k10, V v10) {
            this.f9494u = k10;
            this.f9495v = v10;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f9494u.equals(entry.getKey()) || !this.f9495v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public final K getKey() {
            return this.f9494u;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public final V getValue() {
            return this.f9495v;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public final int hashCode() {
            return this.f9494u.hashCode() ^ this.f9495v.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = (V) z.this.put(this.f9494u, v10);
            this.f9495v = v10;
            return v11;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class e implements i<Object, Object, e> {
        public e() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.z.i
        public final e a() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.z.i
        public final int getHash() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.z.i
        public final Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.z.i
        public final Object getValue() {
            throw new AssertionError();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class f extends z<K, V, E, S>.h<Map.Entry<K, V>> {
        public f(z zVar) {
            super();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return c();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class g extends m<Map.Entry<K, V>> {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            z.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            z zVar;
            Object obj2;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = (zVar = z.this).get(key)) == null || !zVar.f9482z.d().d().c(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return z.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new f(z.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !z.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return z.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public abstract class h<T> implements Iterator<T>, j$.util.Iterator {
        public z<K, V, E, S>.d0 A;

        /* renamed from: u  reason: collision with root package name */
        public int f9498u;

        /* renamed from: v  reason: collision with root package name */
        public int f9499v = -1;

        /* renamed from: w  reason: collision with root package name */
        public n<K, V, E, S> f9500w;

        /* renamed from: x  reason: collision with root package name */
        public AtomicReferenceArray<E> f9501x;

        /* renamed from: y  reason: collision with root package name */
        public E f9502y;

        /* renamed from: z  reason: collision with root package name */
        public z<K, V, E, S>.d0 f9503z;

        public h() {
            this.f9498u = z.this.f9479w.length - 1;
            a();
        }

        public final void a() {
            boolean z10;
            this.f9503z = null;
            E e10 = this.f9502y;
            if (e10 != null) {
                while (true) {
                    E e11 = (E) e10.a();
                    this.f9502y = e11;
                    if (e11 == null) {
                        break;
                    } else if (b(e11)) {
                        z10 = true;
                        break;
                    } else {
                        e10 = this.f9502y;
                    }
                }
            }
            z10 = false;
            if (z10 || d()) {
                return;
            }
            while (true) {
                int i6 = this.f9498u;
                if (i6 >= 0) {
                    n<K, V, E, S>[] nVarArr = z.this.f9479w;
                    this.f9498u = i6 - 1;
                    n<K, V, E, S> nVar = nVarArr[i6];
                    this.f9500w = nVar;
                    if (nVar.f9506v != 0) {
                        AtomicReferenceArray<E> atomicReferenceArray = this.f9500w.f9509y;
                        this.f9501x = atomicReferenceArray;
                        this.f9499v = atomicReferenceArray.length() - 1;
                        if (d()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final boolean b(E e10) {
            Object value;
            z zVar = z.this;
            try {
                Object key = e10.getKey();
                zVar.getClass();
                if (e10.getKey() == null) {
                    value = null;
                } else {
                    value = e10.getValue();
                }
                if (value != null) {
                    this.f9503z = new d0(key, value);
                    this.f9500w.g();
                    return true;
                }
                this.f9500w.g();
                return false;
            } catch (Throwable th2) {
                this.f9500w.g();
                throw th2;
            }
        }

        public final z<K, V, E, S>.d0 c() {
            z<K, V, E, S>.d0 d0Var = this.f9503z;
            if (d0Var != null) {
                this.A = d0Var;
                a();
                return this.A;
            }
            throw new NoSuchElementException();
        }

        public final boolean d() {
            while (true) {
                int i6 = this.f9499v;
                boolean z10 = false;
                if (i6 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f9501x;
                this.f9499v = i6 - 1;
                E e10 = atomicReferenceArray.get(i6);
                this.f9502y = e10;
                if (e10 != null) {
                    if (b(e10)) {
                        break;
                    }
                    E e11 = this.f9502y;
                    if (e11 != null) {
                        while (true) {
                            E e12 = (E) e11.a();
                            this.f9502y = e12;
                            if (e12 == null) {
                                break;
                            } else if (b(e12)) {
                                z10 = true;
                                break;
                            } else {
                                e11 = this.f9502y;
                            }
                        }
                    }
                    if (z10) {
                        break;
                    }
                }
            }
            return true;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f9503z != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            boolean z10;
            if (this.A != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.B("no calls to next() since the last call to remove()", z10);
            z.this.remove(this.A.f9494u);
            this.A = null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public interface i<K, V, E extends i<K, V, E>> {
        E a();

        int getHash();

        K getKey();

        V getValue();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public interface j<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> {
        n a(z zVar, int i6);

        E b(S s10, E e10, E e11);

        p c();

        p d();

        void e(S s10, E e10, V v10);

        E f(S s10, K k10, int i6, E e10);
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class k extends z<K, V, E, S>.h<K> {
        public k(z zVar) {
            super();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final K next() {
            return c().f9494u;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class l extends m<K> {
        public l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            z.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return z.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return z.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return new k(z.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (z.this.remove(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return z.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static abstract class m<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return z.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) z.a(this).toArray(tArr);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class o<K, V> extends b<K, V> {
        public o(p pVar, p pVar2, nc.d dVar, int i6, ConcurrentMap concurrentMap) {
            super(pVar, pVar2, dVar, i6, concurrentMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void readObject(ObjectInputStream objectInputStream) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            objectInputStream.defaultReadObject();
            int readInt = objectInputStream.readInt();
            com.google.common.collect.y yVar = new com.google.common.collect.y();
            int i6 = yVar.f9473b;
            boolean z16 = false;
            if (i6 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.A("initial capacity was already set to %s", i6, z10);
            if (readInt >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            sc.b.t(z11);
            yVar.f9473b = readInt;
            p pVar = yVar.f9475d;
            if (pVar == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            sc.b.z(pVar, "Key strength was already set to %s", z12);
            p pVar2 = this.f9483u;
            pVar2.getClass();
            yVar.f9475d = pVar2;
            p.a aVar = p.f9511u;
            if (pVar2 != aVar) {
                yVar.f9472a = true;
            }
            p pVar3 = yVar.f9476e;
            if (pVar3 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            sc.b.z(pVar3, "Value strength was already set to %s", z13);
            p pVar4 = this.f9484v;
            pVar4.getClass();
            yVar.f9476e = pVar4;
            if (pVar4 != aVar) {
                yVar.f9472a = true;
            }
            nc.d<Object> dVar = yVar.f;
            if (dVar == null) {
                z14 = true;
            } else {
                z14 = false;
            }
            sc.b.z(dVar, "key equivalence was already set to %s", z14);
            nc.d<Object> dVar2 = this.f9485w;
            dVar2.getClass();
            yVar.f = dVar2;
            yVar.f9472a = true;
            int i10 = yVar.f9474c;
            if (i10 == -1) {
                z15 = true;
            } else {
                z15 = false;
            }
            sc.b.A("concurrency level was already set to %s", i10, z15);
            int i11 = this.f9486x;
            if (i11 > 0) {
                z16 = true;
            }
            sc.b.t(z16);
            yVar.f9474c = i11;
            this.f9487y = yVar.b();
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    return;
                }
                this.f9487y.put(readObject, objectInputStream.readObject());
            }
        }

        private Object readResolve() {
            return this.f9487y;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.f9487y.size());
            for (Map.Entry<K, V> entry : this.f9487y.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static abstract class p {

        /* renamed from: u  reason: collision with root package name */
        public static final a f9511u;

        /* renamed from: v  reason: collision with root package name */
        public static final b f9512v;

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ p[] f9513w;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public enum a extends p {
            public a() {
                super("STRONG", 0);
            }

            @Override // com.google.common.collect.z.p
            public final nc.d<Object> d() {
                return d.a.f25991u;
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public enum b extends p {
            public b() {
                super("WEAK", 1);
            }

            @Override // com.google.common.collect.z.p
            public final nc.d<Object> d() {
                return d.b.f25992u;
            }
        }

        static {
            a aVar = new a();
            f9511u = aVar;
            b bVar = new b();
            f9512v = bVar;
            f9513w = new p[]{aVar, bVar};
        }

        public p() {
            throw null;
        }

        public p(String str, int i6) {
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) f9513w.clone();
        }

        public abstract nc.d<Object> d();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class q<K, V> extends c<K, V, q<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        public volatile V f9514d;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public static final class a<K, V> implements j<K, V, q<K, V>, r<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a<?, ?> f9515a = new a<>();

            @Override // com.google.common.collect.z.j
            public final n a(z zVar, int i6) {
                return new r(zVar, i6);
            }

            @Override // com.google.common.collect.z.j
            public final i b(n nVar, i iVar, i iVar2) {
                r rVar = (r) nVar;
                q qVar = (q) iVar;
                q qVar2 = new q(qVar.f9488a, qVar.f9489b, (q) iVar2);
                qVar2.f9514d = qVar.f9514d;
                return qVar2;
            }

            @Override // com.google.common.collect.z.j
            public final p c() {
                return p.f9511u;
            }

            @Override // com.google.common.collect.z.j
            public final p d() {
                return p.f9511u;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.z.j
            public final void e(n nVar, i iVar, Object obj) {
                r rVar = (r) nVar;
                ((q) iVar).f9514d = obj;
            }

            @Override // com.google.common.collect.z.j
            public final i f(n nVar, Object obj, int i6, i iVar) {
                r rVar = (r) nVar;
                return new q(obj, i6, (q) iVar);
            }
        }

        public q(K k10, int i6, q<K, V> qVar) {
            super(k10, i6, qVar);
            this.f9514d = null;
        }

        @Override // com.google.common.collect.z.i
        public final V getValue() {
            return this.f9514d;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class s<K, V> extends c<K, V, s<K, V>> implements a0<K, V, s<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        public volatile b0<K, V, s<K, V>> f9516d;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public static final class a<K, V> implements j<K, V, s<K, V>, t<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a<?, ?> f9517a = new a<>();

            @Override // com.google.common.collect.z.j
            public final n a(z zVar, int i6) {
                return new t(zVar, i6);
            }

            @Override // com.google.common.collect.z.j
            public final i b(n nVar, i iVar, i iVar2) {
                boolean z10;
                t tVar = (t) nVar;
                s sVar = (s) iVar;
                s sVar2 = (s) iVar2;
                int i6 = n.A;
                if (sVar.getValue() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return null;
                }
                ReferenceQueue<V> referenceQueue = tVar.B;
                s sVar3 = new s(sVar.f9488a, sVar.f9489b, sVar2);
                sVar3.f9516d = sVar.f9516d.a(referenceQueue, sVar3);
                return sVar3;
            }

            @Override // com.google.common.collect.z.j
            public final p c() {
                return p.f9511u;
            }

            @Override // com.google.common.collect.z.j
            public final p d() {
                return p.f9512v;
            }

            @Override // com.google.common.collect.z.j
            public final void e(n nVar, i iVar, Object obj) {
                s sVar = (s) iVar;
                ReferenceQueue<V> referenceQueue = ((t) nVar).B;
                b0<K, V, s<K, V>> b0Var = sVar.f9516d;
                sVar.f9516d = new c0(referenceQueue, obj, sVar);
                b0Var.clear();
            }

            @Override // com.google.common.collect.z.j
            public final i f(n nVar, Object obj, int i6, i iVar) {
                t tVar = (t) nVar;
                return new s(obj, i6, (s) iVar);
            }
        }

        public s(K k10, int i6, s<K, V> sVar) {
            super(k10, i6, sVar);
            this.f9516d = z.D;
        }

        @Override // com.google.common.collect.z.a0
        public final b0<K, V, s<K, V>> b() {
            return this.f9516d;
        }

        @Override // com.google.common.collect.z.i
        public final V getValue() {
            return this.f9516d.get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class u extends z<K, V, E, S>.h<V> {
        public u(z zVar) {
            super();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final V next() {
            return c().f9495v;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class v extends AbstractCollection<V> {
        public v() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            z.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return z.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return z.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            return new u(z.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return z.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return z.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) z.a(this).toArray(tArr);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class w<K, V> extends d<K, V, w<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        public volatile V f9519c;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public static final class a<K, V> implements j<K, V, w<K, V>, x<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a<?, ?> f9520a = new a<>();

            @Override // com.google.common.collect.z.j
            public final n a(z zVar, int i6) {
                return new x(zVar, i6);
            }

            @Override // com.google.common.collect.z.j
            public final i b(n nVar, i iVar, i iVar2) {
                x xVar = (x) nVar;
                w wVar = (w) iVar;
                w wVar2 = (w) iVar2;
                if (wVar.get() == null) {
                    return null;
                }
                w wVar3 = new w(xVar.B, wVar.get(), wVar.f9492a, wVar2);
                wVar3.f9519c = wVar.f9519c;
                return wVar3;
            }

            @Override // com.google.common.collect.z.j
            public final p c() {
                return p.f9512v;
            }

            @Override // com.google.common.collect.z.j
            public final p d() {
                return p.f9511u;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.z.j
            public final void e(n nVar, i iVar, Object obj) {
                x xVar = (x) nVar;
                ((w) iVar).f9519c = obj;
            }

            @Override // com.google.common.collect.z.j
            public final i f(n nVar, Object obj, int i6, i iVar) {
                return new w(((x) nVar).B, obj, i6, (w) iVar);
            }
        }

        public w(ReferenceQueue<K> referenceQueue, K k10, int i6, w<K, V> wVar) {
            super(referenceQueue, k10, i6, wVar);
            this.f9519c = null;
        }

        @Override // com.google.common.collect.z.i
        public final V getValue() {
            return this.f9519c;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class y<K, V> extends d<K, V, y<K, V>> implements a0<K, V, y<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        public volatile b0<K, V, y<K, V>> f9521c;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public static final class a<K, V> implements j<K, V, y<K, V>, C0158z<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a<?, ?> f9522a = new a<>();

            @Override // com.google.common.collect.z.j
            public final n a(z zVar, int i6) {
                return new C0158z(zVar, i6);
            }

            @Override // com.google.common.collect.z.j
            public final i b(n nVar, i iVar, i iVar2) {
                boolean z10;
                C0158z c0158z = (C0158z) nVar;
                y yVar = (y) iVar;
                y yVar2 = (y) iVar2;
                if (yVar.get() != null) {
                    int i6 = n.A;
                    if (yVar.getValue() == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        ReferenceQueue<K> referenceQueue = c0158z.B;
                        ReferenceQueue<V> referenceQueue2 = c0158z.C;
                        y yVar3 = new y(referenceQueue, yVar.get(), yVar.f9492a, yVar2);
                        yVar3.f9521c = yVar.f9521c.a(referenceQueue2, yVar3);
                        return yVar3;
                    }
                }
                return null;
            }

            @Override // com.google.common.collect.z.j
            public final p c() {
                return p.f9512v;
            }

            @Override // com.google.common.collect.z.j
            public final p d() {
                return p.f9512v;
            }

            @Override // com.google.common.collect.z.j
            public final void e(n nVar, i iVar, Object obj) {
                y yVar = (y) iVar;
                ReferenceQueue<V> referenceQueue = ((C0158z) nVar).C;
                b0<K, V, y<K, V>> b0Var = yVar.f9521c;
                yVar.f9521c = new c0(referenceQueue, obj, yVar);
                b0Var.clear();
            }

            @Override // com.google.common.collect.z.j
            public final i f(n nVar, Object obj, int i6, i iVar) {
                return new y(((C0158z) nVar).B, obj, i6, (y) iVar);
            }
        }

        public y(ReferenceQueue<K> referenceQueue, K k10, int i6, y<K, V> yVar) {
            super(referenceQueue, k10, i6, yVar);
            this.f9521c = z.D;
        }

        @Override // com.google.common.collect.z.a0
        public final b0<K, V, y<K, V>> b() {
            return this.f9521c;
        }

        @Override // com.google.common.collect.z.i
        public final V getValue() {
            return this.f9521c.get();
        }
    }

    public z(com.google.common.collect.y yVar, j<K, V, E, S> jVar) {
        int i6 = yVar.f9474c;
        this.f9480x = Math.min(i6 == -1 ? 4 : i6, 65536);
        this.f9481y = (nc.d) nc.f.a(yVar.f, yVar.a().d());
        this.f9482z = jVar;
        int i10 = yVar.f9473b;
        int min = Math.min(i10 == -1 ? 16 : i10, 1073741824);
        int i11 = 0;
        int i12 = 1;
        int i13 = 1;
        int i14 = 0;
        while (i13 < this.f9480x) {
            i14++;
            i13 <<= 1;
        }
        this.f9478v = 32 - i14;
        this.f9477u = i13 - 1;
        this.f9479w = new n[i13];
        int i15 = min / i13;
        while (i12 < (i13 * i15 < min ? i15 + 1 : i15)) {
            i12 <<= 1;
        }
        while (true) {
            n<K, V, E, S>[] nVarArr = this.f9479w;
            if (i11 < nVarArr.length) {
                nVarArr[i11] = this.f9482z.a(this, i12);
                i11++;
            } else {
                return;
            }
        }
    }

    public static ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        java.util.Iterator it = collection.iterator();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public final int b(Object obj) {
        int b10;
        nc.d<Object> dVar = this.f9481y;
        if (obj == null) {
            dVar.getClass();
            b10 = 0;
        } else {
            b10 = dVar.b(obj);
        }
        int i6 = b10 + ((b10 << 15) ^ (-12931));
        int i10 = i6 ^ (i6 >>> 10);
        int i11 = i10 + (i10 << 3);
        int i12 = i11 ^ (i11 >>> 6);
        int i13 = (i12 << 2) + (i12 << 14) + i12;
        return (i13 >>> 16) ^ i13;
    }

    public final n<K, V, E, S> c(int i6) {
        return this.f9479w[(i6 >>> this.f9478v) & this.f9477u];
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void clear() {
        n<K, V, E, S>[] nVarArr = this.f9479w;
        int length = nVarArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            n<K, V, E, S> nVar = nVarArr[i6];
            if (nVar.f9506v != 0) {
                nVar.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = nVar.f9509y;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    nVar.e();
                    nVar.f9510z.set(0);
                    nVar.f9507w++;
                    nVar.f9506v = 0;
                } finally {
                    nVar.unlock();
                }
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        i d10;
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        int b10 = b(obj);
        n<K, V, E, S> c10 = c(b10);
        c10.getClass();
        try {
            if (c10.f9506v != 0 && (d10 = c10.d(b10, obj)) != null) {
                if (d10.getValue() != null) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            c10.g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        if (obj == null) {
            return false;
        }
        n<K, V, E, S>[] nVarArr = this.f9479w;
        long j10 = -1;
        int i6 = 0;
        while (i6 < 3) {
            long j11 = 0;
            for (n<K, V, E, S> nVar : nVarArr) {
                int i10 = nVar.f9506v;
                AtomicReferenceArray<E> atomicReferenceArray = nVar.f9509y;
                for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                    for (E e10 = atomicReferenceArray.get(i11); e10 != null; e10 = e10.a()) {
                        if (e10.getKey() == null) {
                            nVar.m();
                        } else {
                            value = e10.getValue();
                            if (value == null) {
                                nVar.m();
                            }
                            if (value == null && this.f9482z.d().d().c(obj, value)) {
                                return true;
                            }
                        }
                        value = null;
                        if (value == null) {
                        }
                    }
                }
                j11 += nVar.f9507w;
            }
            if (j11 != j10) {
                i6++;
                j10 = j11;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        g gVar = this.C;
        if (gVar == null) {
            g gVar2 = new g();
            this.C = gVar2;
            return gVar2;
        }
        return gVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V get(Object obj) {
        V v10 = null;
        if (obj == null) {
            return null;
        }
        int b10 = b(obj);
        n<K, V, E, S> c10 = c(b10);
        c10.getClass();
        try {
            i d10 = c10.d(b10, obj);
            if (d10 != null && (v10 = (V) d10.getValue()) == null) {
                c10.m();
            }
            return v10;
        } finally {
            c10.g();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        n<K, V, E, S>[] nVarArr = this.f9479w;
        long j10 = 0;
        for (int i6 = 0; i6 < nVarArr.length; i6++) {
            if (nVarArr[i6].f9506v != 0) {
                return false;
            }
            j10 += nVarArr[i6].f9507w;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            if (nVarArr[i10].f9506v != 0) {
                return false;
            }
            j10 -= nVarArr[i10].f9507w;
        }
        if (j10 != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set<K> keySet() {
        l lVar = this.A;
        if (lVar == null) {
            l lVar2 = new l();
            this.A = lVar2;
            return lVar2;
        }
        return lVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V put(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int b10 = b(k10);
        return (V) c(b10).h(b10, k10, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final V putIfAbsent(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int b10 = b(k10);
        return (V) c(b10).h(b10, k10, v10, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        r11 = (V) r7.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r11 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r7.getValue() != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r1 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        r2.f9507w++;
        r3.set(r4, r2.i(r6, r7));
        r2.f9506v--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return r11;
     */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int b10 = b(obj);
        n<K, V, E, S> c10 = c(b10);
        c10.lock();
        try {
            c10.j();
            AtomicReferenceArray<E> atomicReferenceArray = c10.f9509y;
            int length = (atomicReferenceArray.length() - 1) & b10;
            E e10 = atomicReferenceArray.get(length);
            E e11 = e10;
            while (true) {
                if (e11 == null) {
                    break;
                }
                Object key = e11.getKey();
                if (e11.getHash() == b10 && key != null && c10.f9505u.f9481y.c(obj, key)) {
                    break;
                }
                e11 = (E) e11.a();
            }
            return null;
        } finally {
            c10.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V replace(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int b10 = b(k10);
        n<K, V, E, S> c10 = c(b10);
        c10.lock();
        try {
            c10.j();
            AtomicReferenceArray<E> atomicReferenceArray = c10.f9509y;
            int length = (atomicReferenceArray.length() - 1) & b10;
            E e10 = atomicReferenceArray.get(length);
            E e11 = e10;
            while (true) {
                if (e11 == null) {
                    break;
                }
                Object key = e11.getKey();
                if (e11.getHash() == b10 && key != null && c10.f9505u.f9481y.c(k10, key)) {
                    V v11 = (V) e11.getValue();
                    if (v11 == null) {
                        if (e11.getValue() == null) {
                            c10.f9507w++;
                            atomicReferenceArray.set(length, c10.i(e10, e11));
                            c10.f9506v--;
                        }
                    } else {
                        c10.f9507w++;
                        c10.l(e11, v10);
                        return v11;
                    }
                } else {
                    e11 = (E) e11.a();
                }
            }
        } finally {
            c10.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int size() {
        long j10 = 0;
        for (n<K, V, E, S> nVar : this.f9479w) {
            j10 += nVar.f9506v;
        }
        return qc.a.F(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Collection<V> values() {
        v vVar = this.B;
        if (vVar == null) {
            v vVar2 = new v();
            this.B = vVar2;
            return vVar2;
        }
        return vVar;
    }

    public Object writeReplace() {
        j<K, V, E, S> jVar = this.f9482z;
        p c10 = jVar.c();
        p d10 = jVar.d();
        nc.d<Object> dVar = this.f9481y;
        jVar.d().d();
        return new o(c10, d10, dVar, this.f9480x, this);
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public class a implements b0<Object, Object, e> {
        @Override // com.google.common.collect.z.b0
        public final b0 a(ReferenceQueue referenceQueue, a0 a0Var) {
            e eVar = (e) a0Var;
            return this;
        }

        @Override // com.google.common.collect.z.b0
        public final /* bridge */ /* synthetic */ e b() {
            return null;
        }

        @Override // com.google.common.collect.z.b0
        public final Object get() {
            return null;
        }

        @Override // com.google.common.collect.z.b0
        public final void clear() {
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static abstract class n<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> extends ReentrantLock {
        public static final /* synthetic */ int A = 0;

        /* renamed from: u  reason: collision with root package name */
        public final z<K, V, E, S> f9505u;

        /* renamed from: v  reason: collision with root package name */
        public volatile int f9506v;

        /* renamed from: w  reason: collision with root package name */
        public int f9507w;

        /* renamed from: x  reason: collision with root package name */
        public int f9508x;

        /* renamed from: y  reason: collision with root package name */
        public volatile AtomicReferenceArray<E> f9509y;

        /* renamed from: z  reason: collision with root package name */
        public final AtomicInteger f9510z = new AtomicInteger();

        public n(z zVar, int i6) {
            this.f9505u = zVar;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i6);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f9508x = length;
            if (length == -1) {
                this.f9508x = length + 1;
            }
            this.f9509y = atomicReferenceArray;
        }

        public final void a(ReferenceQueue<K> referenceQueue) {
            int i6 = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    i iVar = (i) poll;
                    z<K, V, E, S> zVar = this.f9505u;
                    zVar.getClass();
                    int hash = iVar.getHash();
                    n<K, V, E, S> c10 = zVar.c(hash);
                    c10.lock();
                    try {
                        AtomicReferenceArray<E> atomicReferenceArray = c10.f9509y;
                        int length = hash & (atomicReferenceArray.length() - 1);
                        E e10 = atomicReferenceArray.get(length);
                        i iVar2 = e10;
                        while (true) {
                            if (iVar2 == null) {
                                break;
                            } else if (iVar2 == iVar) {
                                c10.f9507w++;
                                atomicReferenceArray.set(length, c10.i(e10, iVar2));
                                c10.f9506v--;
                                break;
                            } else {
                                iVar2 = iVar2.a();
                            }
                        }
                        c10.unlock();
                        i6++;
                    } catch (Throwable th2) {
                        c10.unlock();
                        throw th2;
                    }
                } else {
                    return;
                }
            } while (i6 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v7 */
        public final void b(ReferenceQueue<V> referenceQueue) {
            int i6 = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    b0<K, V, E> b0Var = (b0) poll;
                    z<K, V, E, S> zVar = this.f9505u;
                    zVar.getClass();
                    E b10 = b0Var.b();
                    int hash = b10.getHash();
                    n<K, V, E, S> c10 = zVar.c(hash);
                    Object key = b10.getKey();
                    c10.lock();
                    try {
                        AtomicReferenceArray<E> atomicReferenceArray = c10.f9509y;
                        int length = (atomicReferenceArray.length() - 1) & hash;
                        E e10 = atomicReferenceArray.get(length);
                        E e11 = e10;
                        while (true) {
                            if (e11 == null) {
                                break;
                            }
                            Object key2 = e11.getKey();
                            if (e11.getHash() == hash && key2 != null && c10.f9505u.f9481y.c(key, key2)) {
                                if (e11.b() == b0Var) {
                                    c10.f9507w++;
                                    atomicReferenceArray.set(length, c10.i(e10, e11));
                                    c10.f9506v--;
                                }
                            } else {
                                e11 = (E) e11.a();
                            }
                        }
                        c10.unlock();
                        i6++;
                    } catch (Throwable th2) {
                        c10.unlock();
                        throw th2;
                    }
                } else {
                    return;
                }
            } while (i6 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f9509y;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i6 = this.f9506v;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) new AtomicReferenceArray(length << 1);
            this.f9508x = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i10 = 0; i10 < length; i10++) {
                E e10 = atomicReferenceArray.get(i10);
                if (e10 != null) {
                    i a10 = e10.a();
                    int hash = e10.getHash() & length2;
                    if (a10 == null) {
                        atomicReferenceArray2.set(hash, e10);
                    } else {
                        i iVar = e10;
                        while (a10 != null) {
                            int hash2 = a10.getHash() & length2;
                            if (hash2 != hash) {
                                iVar = a10;
                                hash = hash2;
                            }
                            a10 = a10.a();
                        }
                        atomicReferenceArray2.set(hash, iVar);
                        while (e10 != iVar) {
                            int hash3 = e10.getHash() & length2;
                            i b10 = this.f9505u.f9482z.b(k(), e10, (i) atomicReferenceArray2.get(hash3));
                            if (b10 != null) {
                                atomicReferenceArray2.set(hash3, b10);
                            } else {
                                i6--;
                            }
                            e10 = e10.a();
                        }
                    }
                }
            }
            this.f9509y = atomicReferenceArray2;
            this.f9506v = i6;
        }

        public final i d(int i6, Object obj) {
            if (this.f9506v != 0) {
                AtomicReferenceArray<E> atomicReferenceArray = this.f9509y;
                for (E e10 = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i6); e10 != null; e10 = e10.a()) {
                    if (e10.getHash() == i6) {
                        Object key = e10.getKey();
                        if (key == null) {
                            m();
                        } else if (this.f9505u.f9481y.c(obj, key)) {
                            return e10;
                        }
                    }
                }
            }
            return null;
        }

        public final void g() {
            if ((this.f9510z.incrementAndGet() & 63) == 0) {
                j();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object h(int i6, Object obj, Object obj2, boolean z10) {
            lock();
            try {
                j();
                int i10 = this.f9506v + 1;
                if (i10 > this.f9508x) {
                    c();
                    i10 = this.f9506v + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f9509y;
                int length = (atomicReferenceArray.length() - 1) & i6;
                E e10 = atomicReferenceArray.get(length);
                for (i iVar = e10; iVar != null; iVar = iVar.a()) {
                    Object key = iVar.getKey();
                    if (iVar.getHash() == i6 && key != null && this.f9505u.f9481y.c(obj, key)) {
                        Object value = iVar.getValue();
                        if (value == null) {
                            this.f9507w++;
                            l(iVar, obj2);
                            this.f9506v = this.f9506v;
                            return null;
                        } else if (z10) {
                            return value;
                        } else {
                            this.f9507w++;
                            l(iVar, obj2);
                            return value;
                        }
                    }
                }
                this.f9507w++;
                E f = this.f9505u.f9482z.f(k(), obj, i6, e10);
                l(f, obj2);
                atomicReferenceArray.set(length, f);
                this.f9506v = i10;
                return null;
            } finally {
                unlock();
            }
        }

        public final E i(E e10, E e11) {
            int i6 = this.f9506v;
            E e12 = (E) e11.a();
            while (e10 != e11) {
                E b10 = this.f9505u.f9482z.b(k(), e10, e12);
                if (b10 != null) {
                    e12 = b10;
                } else {
                    i6--;
                }
                e10 = (E) e10.a();
            }
            this.f9506v = i6;
            return e12;
        }

        public final void j() {
            if (tryLock()) {
                try {
                    f();
                    this.f9510z.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S k();

        public final void l(E e10, V v10) {
            this.f9505u.f9482z.e(k(), e10, v10);
        }

        public final void m() {
            if (tryLock()) {
                try {
                    f();
                } finally {
                    unlock();
                }
            }
        }

        public void e() {
        }

        public void f() {
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class r<K, V> extends n<K, V, q<K, V>, r<K, V>> {
        public r(z zVar, int i6) {
            super(zVar, i6);
        }

        @Override // com.google.common.collect.z.n
        public final n k() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class t<K, V> extends n<K, V, s<K, V>, t<K, V>> {
        public final ReferenceQueue<V> B;

        public t(z zVar, int i6) {
            super(zVar, i6);
            this.B = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.z.n
        public final void e() {
            do {
            } while (this.B.poll() != null);
        }

        @Override // com.google.common.collect.z.n
        public final void f() {
            b(this.B);
        }

        @Override // com.google.common.collect.z.n
        public final n k() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class x<K, V> extends n<K, V, w<K, V>, x<K, V>> {
        public final ReferenceQueue<K> B;

        public x(z zVar, int i6) {
            super(zVar, i6);
            this.B = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.z.n
        public final void e() {
            do {
            } while (this.B.poll() != null);
        }

        @Override // com.google.common.collect.z.n
        public final void f() {
            a(this.B);
        }

        @Override // com.google.common.collect.z.n
        public final n k() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.z$z  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0158z<K, V> extends n<K, V, y<K, V>, C0158z<K, V>> {
        public final ReferenceQueue<K> B;
        public final ReferenceQueue<V> C;

        public C0158z(z zVar, int i6) {
            super(zVar, i6);
            this.B = new ReferenceQueue<>();
            this.C = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.z.n
        public final void e() {
            do {
            } while (this.B.poll() != null);
        }

        @Override // com.google.common.collect.z.n
        public final void f() {
            a(this.B);
            b(this.C);
        }

        @Override // com.google.common.collect.z.n
        public final n k() {
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r2.f9505u.f9482z.d().d().c(r12, r7.getValue()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r7.getValue() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r11 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        r2.f9507w++;
        r3.set(r4, r2.i(r6, r7));
        r2.f9506v--;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj, Object obj2) {
        boolean z10 = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int b10 = b(obj);
        n<K, V, E, S> c10 = c(b10);
        c10.lock();
        try {
            c10.j();
            AtomicReferenceArray<E> atomicReferenceArray = c10.f9509y;
            int length = (atomicReferenceArray.length() - 1) & b10;
            E e10 = atomicReferenceArray.get(length);
            E e11 = e10;
            while (true) {
                if (e11 == null) {
                    break;
                }
                Object key = e11.getKey();
                if (e11.getHash() == b10 && key != null && c10.f9505u.f9481y.c(obj, key)) {
                    break;
                }
                e11 = (E) e11.a();
            }
            return z10;
        } finally {
            c10.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(K k10, V v10, V v11) {
        k10.getClass();
        v11.getClass();
        if (v10 == null) {
            return false;
        }
        int b10 = b(k10);
        n<K, V, E, S> c10 = c(b10);
        c10.lock();
        try {
            c10.j();
            AtomicReferenceArray<E> atomicReferenceArray = c10.f9509y;
            int length = (atomicReferenceArray.length() - 1) & b10;
            E e10 = atomicReferenceArray.get(length);
            E e11 = e10;
            while (true) {
                if (e11 == null) {
                    break;
                }
                Object key = e11.getKey();
                if (e11.getHash() == b10 && key != null && c10.f9505u.f9481y.c(k10, key)) {
                    Object value = e11.getValue();
                    if (value == null) {
                        if (e11.getValue() == null) {
                            c10.f9507w++;
                            atomicReferenceArray.set(length, c10.i(e10, e11));
                            c10.f9506v--;
                        }
                    } else if (c10.f9505u.f9482z.d().d().c(v10, value)) {
                        c10.f9507w++;
                        c10.l(e11, v11);
                        c10.unlock();
                        return true;
                    }
                } else {
                    e11 = (E) e11.a();
                }
            }
            return false;
        } finally {
            c10.unlock();
        }
    }
}
