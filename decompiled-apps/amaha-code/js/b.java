package js;

import j$.util.Iterator;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.i;
/* compiled from: MapBuilder.kt */
/* loaded from: classes2.dex */
public final class b<K, V> implements Map<K, V>, Serializable, ts.d {
    public int A;
    public int B;
    public js.c C;
    public js.d<V> D;
    public js.c E;
    public boolean F;

    /* renamed from: u  reason: collision with root package name */
    public K[] f22605u;

    /* renamed from: v  reason: collision with root package name */
    public V[] f22606v;

    /* renamed from: w  reason: collision with root package name */
    public int[] f22607w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f22608x;

    /* renamed from: y  reason: collision with root package name */
    public int f22609y;

    /* renamed from: z  reason: collision with root package name */
    public int f22610z;

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: js.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0344b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, ts.a, j$.util.Iterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0344b(b<K, V> map) {
            super(map);
            i.g(map, "map");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            int i6 = this.f22614v;
            b<K, V> bVar = this.f22613u;
            if (i6 < bVar.f22610z) {
                this.f22614v = i6 + 1;
                this.f22615w = i6;
                c cVar = new c(bVar, i6);
                a();
                return cVar;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes2.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, ts.a {

        /* renamed from: u  reason: collision with root package name */
        public final b<K, V> f22611u;

        /* renamed from: v  reason: collision with root package name */
        public final int f22612v;

        public c(b<K, V> map, int i6) {
            i.g(map, "map");
            this.f22611u = map;
            this.f22612v = i6;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (i.b(entry.getKey(), getKey()) && i.b(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f22611u.f22605u[this.f22612v];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            V[] vArr = this.f22611u.f22606v;
            i.d(vArr);
            return vArr[this.f22612v];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int i6;
            K key = getKey();
            int i10 = 0;
            if (key != null) {
                i6 = key.hashCode();
            } else {
                i6 = 0;
            }
            V value = getValue();
            if (value != null) {
                i10 = value.hashCode();
            }
            return i6 ^ i10;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            b<K, V> bVar = this.f22611u;
            bVar.b();
            V[] vArr = bVar.f22606v;
            if (vArr == null) {
                vArr = (V[]) ca.a.l(bVar.f22605u.length);
                bVar.f22606v = vArr;
            }
            int i6 = this.f22612v;
            V v11 = vArr[i6];
            vArr[i6] = v10;
            return v11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes2.dex */
    public static class d<K, V> {

        /* renamed from: u  reason: collision with root package name */
        public final b<K, V> f22613u;

        /* renamed from: v  reason: collision with root package name */
        public int f22614v;

        /* renamed from: w  reason: collision with root package name */
        public int f22615w;

        public d(b<K, V> map) {
            i.g(map, "map");
            this.f22613u = map;
            this.f22615w = -1;
            a();
        }

        public final void a() {
            while (true) {
                int i6 = this.f22614v;
                b<K, V> bVar = this.f22613u;
                if (i6 < bVar.f22610z && bVar.f22607w[i6] < 0) {
                    this.f22614v = i6 + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            if (this.f22614v < this.f22613u.f22610z) {
                return true;
            }
            return false;
        }

        public final void remove() {
            boolean z10;
            if (this.f22615w != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b<K, V> bVar = this.f22613u;
                bVar.b();
                bVar.j(this.f22615w);
                this.f22615w = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes2.dex */
    public static final class e<K, V> extends d<K, V> implements java.util.Iterator<K>, ts.a, j$.util.Iterator {
        public e(b<K, V> bVar) {
            super(bVar);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final K next() {
            int i6 = this.f22614v;
            b<K, V> bVar = this.f22613u;
            if (i6 < bVar.f22610z) {
                this.f22614v = i6 + 1;
                this.f22615w = i6;
                K k10 = bVar.f22605u[i6];
                a();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes2.dex */
    public static final class f<K, V> extends d<K, V> implements java.util.Iterator<V>, ts.a, j$.util.Iterator {
        public f(b<K, V> bVar) {
            super(bVar);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final V next() {
            int i6 = this.f22614v;
            b<K, V> bVar = this.f22613u;
            if (i6 < bVar.f22610z) {
                this.f22614v = i6 + 1;
                this.f22615w = i6;
                V[] vArr = bVar.f22606v;
                i.d(vArr);
                V v10 = vArr[this.f22615w];
                a();
                return v10;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        new a();
    }

    public b() {
        this(8);
    }

    private final Object writeReplace() {
        if (this.F) {
            return new js.f(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(K k10) {
        b();
        while (true) {
            int h10 = h(k10);
            int i6 = this.f22609y * 2;
            int length = this.f22608x.length / 2;
            if (i6 > length) {
                i6 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f22608x;
                int i11 = iArr[h10];
                if (i11 <= 0) {
                    int i12 = this.f22610z;
                    K[] kArr = this.f22605u;
                    if (i12 >= kArr.length) {
                        f(1);
                    } else {
                        int i13 = i12 + 1;
                        this.f22610z = i13;
                        kArr[i12] = k10;
                        this.f22607w[i12] = h10;
                        iArr[h10] = i13;
                        this.B++;
                        if (i10 > this.f22609y) {
                            this.f22609y = i10;
                        }
                        return i12;
                    }
                } else if (i.b(this.f22605u[i11 - 1], k10)) {
                    return -i11;
                } else {
                    i10++;
                    if (i10 > i6) {
                        i(this.f22608x.length * 2);
                        break;
                    }
                    int i14 = h10 - 1;
                    if (h10 == 0) {
                        h10 = this.f22608x.length - 1;
                    } else {
                        h10 = i14;
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.F) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean c(Collection<?> m10) {
        i.g(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!d((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        xs.e it = new xs.f(0, this.f22610z - 1).iterator();
        while (it.f38001w) {
            int nextInt = it.nextInt();
            int[] iArr = this.f22607w;
            int i6 = iArr[nextInt];
            if (i6 >= 0) {
                this.f22608x[i6] = 0;
                iArr[nextInt] = -1;
            }
        }
        ca.a.h1(0, this.f22610z, this.f22605u);
        V[] vArr = this.f22606v;
        if (vArr != null) {
            ca.a.h1(0, this.f22610z, vArr);
        }
        this.B = 0;
        this.f22610z = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i6;
        int i10 = this.f22610z;
        while (true) {
            i6 = -1;
            i10--;
            if (i10 < 0) {
                break;
            } else if (this.f22607w[i10] >= 0) {
                V[] vArr = this.f22606v;
                i.d(vArr);
                if (i.b(vArr[i10], obj)) {
                    i6 = i10;
                    break;
                }
            }
        }
        if (i6 >= 0) {
            return true;
        }
        return false;
    }

    public final boolean d(Map.Entry<? extends K, ? extends V> entry) {
        i.g(entry, "entry");
        int g5 = g(entry.getKey());
        if (g5 < 0) {
            return false;
        }
        V[] vArr = this.f22606v;
        i.d(vArr);
        return i.b(vArr[g5], entry.getValue());
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        js.c cVar = this.E;
        if (cVar == null) {
            js.c cVar2 = new js.c(this, 0);
            this.E = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.B == map.size() && c(map.entrySet())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i6) {
        V[] vArr;
        int i10 = this.f22610z;
        int i11 = i6 + i10;
        if (i11 >= 0) {
            K[] kArr = this.f22605u;
            if (i11 > kArr.length) {
                int length = (kArr.length * 3) / 2;
                if (i11 <= length) {
                    i11 = length;
                }
                K[] kArr2 = (K[]) Arrays.copyOf(kArr, i11);
                i.f(kArr2, "copyOf(this, newSize)");
                this.f22605u = kArr2;
                V[] vArr2 = this.f22606v;
                if (vArr2 != null) {
                    vArr = (V[]) Arrays.copyOf(vArr2, i11);
                    i.f(vArr, "copyOf(this, newSize)");
                } else {
                    vArr = null;
                }
                this.f22606v = vArr;
                int[] copyOf = Arrays.copyOf(this.f22607w, i11);
                i.f(copyOf, "copyOf(this, newSize)");
                this.f22607w = copyOf;
                if (i11 < 1) {
                    i11 = 1;
                }
                int highestOneBit = Integer.highestOneBit(i11 * 3);
                if (highestOneBit > this.f22608x.length) {
                    i(highestOneBit);
                    return;
                }
                return;
            } else if ((i10 + i11) - this.B > kArr.length) {
                i(this.f22608x.length);
                return;
            } else {
                return;
            }
        }
        throw new OutOfMemoryError();
    }

    public final int g(K k10) {
        int h10 = h(k10);
        int i6 = this.f22609y;
        while (true) {
            int i10 = this.f22608x[h10];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (i.b(this.f22605u[i11], k10)) {
                    return i11;
                }
            }
            i6--;
            if (i6 < 0) {
                return -1;
            }
            int i12 = h10 - 1;
            if (h10 == 0) {
                h10 = this.f22608x.length - 1;
            } else {
                h10 = i12;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int g5 = g(obj);
        if (g5 < 0) {
            return null;
        }
        V[] vArr = this.f22606v;
        i.d(vArr);
        return vArr[g5];
    }

    public final int h(K k10) {
        int i6;
        if (k10 != null) {
            i6 = k10.hashCode();
        } else {
            i6 = 0;
        }
        return (i6 * (-1640531527)) >>> this.A;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i6;
        int i10;
        C0344b c0344b = new C0344b(this);
        int i11 = 0;
        while (c0344b.hasNext()) {
            int i12 = c0344b.f22614v;
            b<K, V> bVar = c0344b.f22613u;
            if (i12 < bVar.f22610z) {
                c0344b.f22614v = i12 + 1;
                c0344b.f22615w = i12;
                K k10 = bVar.f22605u[i12];
                if (k10 != null) {
                    i6 = k10.hashCode();
                } else {
                    i6 = 0;
                }
                V[] vArr = bVar.f22606v;
                i.d(vArr);
                V v10 = vArr[c0344b.f22615w];
                if (v10 != null) {
                    i10 = v10.hashCode();
                } else {
                    i10 = 0;
                }
                c0344b.a();
                i11 += i6 ^ i10;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i11;
    }

    public final void i(int i6) {
        boolean z10;
        int i10;
        if (this.f22610z > this.B) {
            V[] vArr = this.f22606v;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i10 = this.f22610z;
                if (i11 >= i10) {
                    break;
                }
                if (this.f22607w[i11] >= 0) {
                    K[] kArr = this.f22605u;
                    kArr[i12] = kArr[i11];
                    if (vArr != null) {
                        vArr[i12] = vArr[i11];
                    }
                    i12++;
                }
                i11++;
            }
            ca.a.h1(i12, i10, this.f22605u);
            if (vArr != null) {
                ca.a.h1(i12, this.f22610z, vArr);
            }
            this.f22610z = i12;
        }
        int[] iArr = this.f22608x;
        if (i6 != iArr.length) {
            this.f22608x = new int[i6];
            this.A = Integer.numberOfLeadingZeros(i6) + 1;
        } else {
            int length = iArr.length;
            i.g(iArr, "<this>");
            Arrays.fill(iArr, 0, length, 0);
        }
        int i13 = 0;
        while (i13 < this.f22610z) {
            int i14 = i13 + 1;
            int h10 = h(this.f22605u[i13]);
            int i15 = this.f22609y;
            while (true) {
                int[] iArr2 = this.f22608x;
                if (iArr2[h10] == 0) {
                    iArr2[h10] = i14;
                    this.f22607w[i13] = h10;
                    z10 = true;
                    break;
                }
                i15--;
                if (i15 < 0) {
                    z10 = false;
                    break;
                }
                int i16 = h10 - 1;
                if (h10 == 0) {
                    h10 = iArr2.length - 1;
                } else {
                    h10 = i16;
                }
            }
            if (z10) {
                i13 = i14;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.B == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i6) {
        K[] kArr = this.f22605u;
        i.g(kArr, "<this>");
        kArr[i6] = null;
        int i10 = this.f22607w[i6];
        int i11 = this.f22609y * 2;
        int length = this.f22608x.length / 2;
        if (i11 > length) {
            i11 = length;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = i10;
        while (true) {
            int i15 = i10 - 1;
            if (i10 == 0) {
                i10 = this.f22608x.length - 1;
            } else {
                i10 = i15;
            }
            i13++;
            if (i13 > this.f22609y) {
                this.f22608x[i14] = 0;
                break;
            }
            int[] iArr = this.f22608x;
            int i16 = iArr[i10];
            if (i16 == 0) {
                iArr[i14] = 0;
                break;
            }
            if (i16 < 0) {
                iArr[i14] = -1;
            } else {
                int i17 = i16 - 1;
                int[] iArr2 = this.f22608x;
                if (((h(this.f22605u[i17]) - i10) & (iArr2.length - 1)) >= i13) {
                    iArr2[i14] = i16;
                    this.f22607w[i17] = i14;
                }
                i12--;
                if (i12 < 0) {
                    this.f22608x[i14] = -1;
                    break;
                }
            }
            i14 = i10;
            i13 = 0;
            i12--;
            if (i12 < 0) {
            }
        }
        this.f22607w[i6] = -1;
        this.B--;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        js.c cVar = this.C;
        if (cVar == null) {
            js.c cVar2 = new js.c(this, 1);
            this.C = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        b();
        int a10 = a(k10);
        V[] vArr = this.f22606v;
        if (vArr == null) {
            vArr = (V[]) ca.a.l(this.f22605u.length);
            this.f22606v = vArr;
        }
        if (a10 < 0) {
            int i6 = (-a10) - 1;
            V v11 = vArr[i6];
            vArr[i6] = v10;
            return v11;
        }
        vArr[a10] = v10;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> from) {
        i.g(from, "from");
        b();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = from.entrySet();
        if (!entrySet.isEmpty()) {
            f(entrySet.size());
            for (Map.Entry<? extends K, ? extends V> entry : entrySet) {
                int a10 = a(entry.getKey());
                V[] vArr = this.f22606v;
                if (vArr == null) {
                    vArr = (V[]) ca.a.l(this.f22605u.length);
                    this.f22606v = vArr;
                }
                if (a10 >= 0) {
                    vArr[a10] = entry.getValue();
                } else {
                    int i6 = (-a10) - 1;
                    if (!i.b(entry.getValue(), vArr[i6])) {
                        vArr[i6] = entry.getValue();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        b();
        int g5 = g(obj);
        if (g5 < 0) {
            g5 = -1;
        } else {
            j(g5);
        }
        if (g5 < 0) {
            return null;
        }
        V[] vArr = this.f22606v;
        i.d(vArr);
        V v10 = vArr[g5];
        vArr[g5] = null;
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.B;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.B * 3) + 2);
        sb2.append("{");
        C0344b c0344b = new C0344b(this);
        int i6 = 0;
        while (c0344b.hasNext()) {
            if (i6 > 0) {
                sb2.append(", ");
            }
            int i10 = c0344b.f22614v;
            b<K, V> bVar = c0344b.f22613u;
            if (i10 < bVar.f22610z) {
                c0344b.f22614v = i10 + 1;
                c0344b.f22615w = i10;
                K k10 = bVar.f22605u[i10];
                if (i.b(k10, bVar)) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(k10);
                }
                sb2.append('=');
                V[] vArr = bVar.f22606v;
                i.d(vArr);
                V v10 = vArr[c0344b.f22615w];
                if (i.b(v10, bVar)) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(v10);
                }
                c0344b.a();
                i6++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        i.f(sb3, "sb.toString()");
        return sb3;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        js.d<V> dVar = this.D;
        if (dVar == null) {
            js.d<V> dVar2 = new js.d<>(this);
            this.D = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public b(int i6) {
        K[] kArr = (K[]) ca.a.l(i6);
        int[] iArr = new int[i6];
        int highestOneBit = Integer.highestOneBit((i6 < 1 ? 1 : i6) * 3);
        this.f22605u = kArr;
        this.f22606v = null;
        this.f22607w = iArr;
        this.f22608x = new int[highestOneBit];
        this.f22609y = 2;
        this.f22610z = 0;
        this.A = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
