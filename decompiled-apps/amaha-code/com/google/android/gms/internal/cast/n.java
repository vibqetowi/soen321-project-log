package com.google.android.gms.internal.cast;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public abstract class n<K, V> implements Map<K, V>, Serializable, j$.util.Map {

    /* renamed from: u  reason: collision with root package name */
    public transient r f7601u;

    /* renamed from: v  reason: collision with root package name */
    public transient s f7602v;

    /* renamed from: w  reason: collision with root package name */
    public transient t f7603w;

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        t tVar = this.f7603w;
        if (tVar == null) {
            t tVar2 = new t(1, ((u) this).f7646x);
            this.f7603w = tVar2;
            tVar = tVar2;
        }
        return tVar.contains(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set entrySet() {
        r rVar = this.f7601u;
        if (rVar == null) {
            r rVar2 = new r(((u) this).f7646x);
            this.f7601u = rVar2;
            return rVar2;
        }
        return rVar;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        return ((o) entrySet()).equals(((java.util.Map) obj).entrySet());
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        int i6;
        r rVar = this.f7601u;
        if (rVar == null) {
            r rVar2 = new r(((u) this).f7646x);
            this.f7601u = rVar2;
            rVar = rVar2;
        }
        Iterator it = rVar.iterator();
        int i10 = 0;
        while (true) {
            k kVar = (k) it;
            if (kVar.hasNext()) {
                Object next = kVar.next();
                if (next != null) {
                    i6 = next.hashCode();
                } else {
                    i6 = 0;
                }
                i10 += i6;
            } else {
                return i10;
            }
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        s sVar = this.f7602v;
        if (sVar == null) {
            s sVar2 = new s(new t(0, ((u) this).f7646x));
            this.f7602v = sVar2;
            return sVar2;
        }
        return sVar;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((int) Math.min(0 * 8, 1073741824L));
        sb2.append('{');
        Iterator it = ((r) entrySet()).iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection values() {
        t tVar = this.f7603w;
        if (tVar == null) {
            t tVar2 = new t(1, ((u) this).f7646x);
            this.f7603w = tVar2;
            return tVar2;
        }
        return tVar;
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v10) {
        return v10;
    }
}
