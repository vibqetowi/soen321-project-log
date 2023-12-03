package oa;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public abstract class s implements Map, Serializable, j$.util.Map {

    /* renamed from: u  reason: collision with root package name */
    public transient d f27344u;

    /* renamed from: v  reason: collision with root package name */
    public transient e f27345v;

    /* renamed from: w  reason: collision with root package name */
    public transient f f27346w;

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
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        f fVar = this.f27346w;
        if (fVar == null) {
            g gVar = (g) this;
            f fVar2 = new f(1, gVar.f27329z, gVar.f27328y);
            this.f27346w = fVar2;
            fVar = fVar2;
        }
        return fVar.contains(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set entrySet() {
        d dVar = this.f27344u;
        if (dVar == null) {
            g gVar = (g) this;
            d dVar2 = new d(gVar, gVar.f27328y, gVar.f27329z);
            this.f27344u = dVar2;
            return dVar2;
        }
        return dVar;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        return ((t) entrySet()).equals(((java.util.Map) obj).entrySet());
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        int i6;
        d dVar = this.f27344u;
        if (dVar == null) {
            g gVar = (g) this;
            d dVar2 = new d(gVar, gVar.f27328y, gVar.f27329z);
            this.f27344u = dVar2;
            dVar = dVar2;
        }
        Iterator it = dVar.iterator();
        int i10 = 0;
        while (true) {
            o oVar = (o) it;
            if (oVar.hasNext()) {
                E next = oVar.next();
                if (next != 0) {
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
        if (((g) this).f27329z == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        e eVar = this.f27345v;
        if (eVar == null) {
            g gVar = (g) this;
            e eVar2 = new e(gVar, new f(0, gVar.f27329z, gVar.f27328y));
            this.f27345v = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int i6 = ((g) this).f27329z;
        if (i6 >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(i6 * 8, 1073741824L));
            sb2.append('{');
            Iterator it = ((d) entrySet()).iterator();
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
        throw new IllegalArgumentException(defpackage.c.p("size cannot be negative but was: ", i6));
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection values() {
        f fVar = this.f27346w;
        if (fVar == null) {
            g gVar = (g) this;
            f fVar2 = new f(1, gVar.f27329z, gVar.f27328y);
            this.f27346w = fVar2;
            return fVar2;
        }
        return fVar;
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
