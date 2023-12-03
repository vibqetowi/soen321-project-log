package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: u  reason: collision with root package name */
    public c<K, V> f25762u;

    /* renamed from: v  reason: collision with root package name */
    public c<K, V> f25763v;

    /* renamed from: w  reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f25764w = new WeakHashMap<>();

    /* renamed from: x  reason: collision with root package name */
    public int f25765x = 0;

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f25769x;
        }

        @Override // n.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f25768w;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: n.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0419b<K, V> extends e<K, V> {
        public C0419b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f25768w;
        }

        @Override // n.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f25769x;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: u  reason: collision with root package name */
        public final K f25766u;

        /* renamed from: v  reason: collision with root package name */
        public final V f25767v;

        /* renamed from: w  reason: collision with root package name */
        public c<K, V> f25768w;

        /* renamed from: x  reason: collision with root package name */
        public c<K, V> f25769x;

        public c(K k10, V v10) {
            this.f25766u = k10;
            this.f25767v = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f25766u.equals(cVar.f25766u) && this.f25767v.equals(cVar.f25767v)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f25766u;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f25767v;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f25766u.hashCode() ^ this.f25767v.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f25766u + "=" + this.f25767v;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: u  reason: collision with root package name */
        public c<K, V> f25770u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f25771v = true;

        public d() {
        }

        @Override // n.b.f
        public final void a(c<K, V> cVar) {
            boolean z10;
            c<K, V> cVar2 = this.f25770u;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f25769x;
                this.f25770u = cVar3;
                if (cVar3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f25771v = z10;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f25771v) {
                if (b.this.f25762u != null) {
                    return true;
                }
                return false;
            }
            c<K, V> cVar = this.f25770u;
            if (cVar != null && cVar.f25768w != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            if (this.f25771v) {
                this.f25771v = false;
                this.f25770u = b.this.f25762u;
            } else {
                c<K, V> cVar2 = this.f25770u;
                if (cVar2 != null) {
                    cVar = cVar2.f25768w;
                } else {
                    cVar = null;
                }
                this.f25770u = cVar;
            }
            return this.f25770u;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: u  reason: collision with root package name */
        public c<K, V> f25773u;

        /* renamed from: v  reason: collision with root package name */
        public c<K, V> f25774v;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f25773u = cVar2;
            this.f25774v = cVar;
        }

        @Override // n.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f25773u == cVar && cVar == this.f25774v) {
                this.f25774v = null;
                this.f25773u = null;
            }
            c<K, V> cVar3 = this.f25773u;
            if (cVar3 == cVar) {
                this.f25773u = b(cVar3);
            }
            c<K, V> cVar4 = this.f25774v;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f25773u;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f25774v = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f25774v != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.f25774v;
            c<K, V> cVar3 = this.f25773u;
            if (cVar2 != cVar3 && cVar3 != null) {
                cVar = c(cVar2);
            } else {
                cVar = null;
            }
            this.f25774v = cVar;
            return cVar2;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> e(K k10) {
        c<K, V> cVar = this.f25762u;
        while (cVar != null && !cVar.f25766u.equals(k10)) {
            cVar = cVar.f25768w;
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((n.b.e) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f25765x != bVar.f25765x) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public V g(K k10, V v10) {
        c<K, V> e10 = e(k10);
        if (e10 != null) {
            return e10.f25767v;
        }
        c<K, V> cVar = new c<>(k10, v10);
        this.f25765x++;
        c<K, V> cVar2 = this.f25763v;
        if (cVar2 == null) {
            this.f25762u = cVar;
            this.f25763v = cVar;
            return null;
        }
        cVar2.f25768w = cVar;
        cVar.f25769x = cVar2;
        this.f25763v = cVar;
        return null;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i6 = 0;
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                i6 += ((Map.Entry) eVar.next()).hashCode();
            } else {
                return i6;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f25762u, this.f25763v);
        this.f25764w.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V m(K k10) {
        c<K, V> e10 = e(k10);
        if (e10 == null) {
            return null;
        }
        this.f25765x--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f25764w;
        if (!weakHashMap.isEmpty()) {
            for (f<K, V> fVar : weakHashMap.keySet()) {
                fVar.a(e10);
            }
        }
        c<K, V> cVar = e10.f25769x;
        if (cVar != null) {
            cVar.f25768w = e10.f25768w;
        } else {
            this.f25762u = e10.f25768w;
        }
        c<K, V> cVar2 = e10.f25768w;
        if (cVar2 != null) {
            cVar2.f25769x = cVar;
        } else {
            this.f25763v = cVar;
        }
        e10.f25768w = null;
        e10.f25769x = null;
        return e10.f25767v;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb2.append(", ");
                }
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
