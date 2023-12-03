package j$.util;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.h  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0720h implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* renamed from: a  reason: collision with root package name */
    private final java.util.Map f21227a;

    /* renamed from: b  reason: collision with root package name */
    final Object f21228b = this;

    /* renamed from: c  reason: collision with root package name */
    private transient Set f21229c;

    /* renamed from: d  reason: collision with root package name */
    private transient Set f21230d;

    /* renamed from: e  reason: collision with root package name */
    private transient Collection f21231e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0720h(java.util.Map map) {
        this.f21227a = (java.util.Map) Objects.requireNonNull(map);
    }

    private static Set a(Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.f21085e;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.f21085e;
            return (Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new Error("Unable to instantiate a synchronized list.", e10);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f21228b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final void clear() {
        synchronized (this.f21228b) {
            this.f21227a.clear();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        Object k10;
        synchronized (this.f21228b) {
            k10 = AbstractC0714b.k(this.f21227a, obj, biFunction);
        }
        return k10;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object l2;
        synchronized (this.f21228b) {
            l2 = AbstractC0714b.l(this.f21227a, obj, function);
        }
        return l2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object m10;
        synchronized (this.f21228b) {
            m10 = AbstractC0714b.m(this.f21227a, obj, biFunction);
        }
        return m10;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f21228b) {
            containsKey = this.f21227a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f21228b) {
            containsValue = this.f21227a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.f21228b) {
            if (this.f21230d == null) {
                this.f21230d = a(this.f21227a.entrySet(), this.f21228b);
            }
            set = this.f21230d;
        }
        return set;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f21228b) {
            equals = this.f21227a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f21228b) {
            AbstractC0714b.n(this.f21227a, biConsumer);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f21228b) {
            obj2 = this.f21227a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object o10;
        synchronized (this.f21228b) {
            o10 = AbstractC0714b.o(this.f21227a, obj, obj2);
        }
        return o10;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f21228b) {
            hashCode = this.f21227a.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f21228b) {
            isEmpty = this.f21227a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.f21228b) {
            if (this.f21229c == null) {
                this.f21229c = a(this.f21227a.keySet(), this.f21228b);
            }
            set = this.f21229c;
        }
        return set;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object p10;
        synchronized (this.f21228b) {
            p10 = AbstractC0714b.p(this.f21227a, obj, obj2, biFunction);
        }
        return p10;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f21228b) {
            put = this.f21227a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f21228b) {
            this.f21227a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object q10;
        synchronized (this.f21228b) {
            q10 = AbstractC0714b.q(this.f21227a, obj, obj2);
        }
        return q10;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f21228b) {
            remove = this.f21227a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean r;
        synchronized (this.f21228b) {
            r = AbstractC0714b.r(this.f21227a, obj, obj2);
        }
        return r;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object s10;
        synchronized (this.f21228b) {
            s10 = AbstractC0714b.s(this.f21227a, obj, obj2);
        }
        return s10;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean t3;
        synchronized (this.f21228b) {
            t3 = AbstractC0714b.t(this.f21227a, obj, obj2, obj3);
        }
        return t3;
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f21228b) {
            AbstractC0714b.u(this.f21227a, biFunction);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        int size;
        synchronized (this.f21228b) {
            size = this.f21227a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f21228b) {
            obj = this.f21227a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection values() {
        Collection collection;
        Constructor constructor;
        Constructor constructor2;
        Collection collection2;
        synchronized (this.f21228b) {
            if (this.f21231e == null) {
                Collection values = this.f21227a.values();
                Object obj = this.f21228b;
                constructor = DesugarCollections.f21084d;
                if (constructor == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        constructor2 = DesugarCollections.f21084d;
                        collection2 = (Collection) constructor2.newInstance(values, obj);
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InstantiationException e11) {
                        e = e11;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f21231e = collection2;
            }
            collection = this.f21231e;
        }
        return collection;
    }
}
