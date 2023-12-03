package com.google.common.collect;

import com.google.common.collect.m0;
import com.google.common.collect.q;
import j$.util.Map;
import j$.util.Objects;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* compiled from: ImmutableMap.java */
/* loaded from: classes.dex */
public abstract class t<K, V> implements Map<K, V>, Serializable, j$.util.Map {

    /* renamed from: u  reason: collision with root package name */
    public transient u<Map.Entry<K, V>> f9452u;

    /* renamed from: v  reason: collision with root package name */
    public transient u<K> f9453v;

    /* renamed from: w  reason: collision with root package name */
    public transient q<V> f9454w;

    /* compiled from: ImmutableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f9455a;

        /* renamed from: b  reason: collision with root package name */
        public int f9456b = 0;

        /* renamed from: c  reason: collision with root package name */
        public C0157a f9457c;

        /* compiled from: ImmutableMap.java */
        /* renamed from: com.google.common.collect.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0157a {

            /* renamed from: a  reason: collision with root package name */
            public final Object f9458a;

            /* renamed from: b  reason: collision with root package name */
            public final Object f9459b;

            /* renamed from: c  reason: collision with root package name */
            public final Object f9460c;

            public C0157a(Object obj, Object obj2, Object obj3) {
                this.f9458a = obj;
                this.f9459b = obj2;
                this.f9460c = obj3;
            }

            public final IllegalArgumentException a() {
                Object obj = this.f9458a;
                String valueOf = String.valueOf(obj);
                String valueOf2 = String.valueOf(this.f9459b);
                String valueOf3 = String.valueOf(obj);
                String valueOf4 = String.valueOf(this.f9460c);
                StringBuilder n10 = defpackage.e.n(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39, "Multiple entries with same key: ", valueOf, "=", valueOf2);
                n10.append(" and ");
                n10.append(valueOf3);
                n10.append("=");
                n10.append(valueOf4);
                return new IllegalArgumentException(n10.toString());
            }
        }

        public a(int i6) {
            this.f9455a = new Object[i6 * 2];
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:71:0x018d  */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r4v2, types: [int[]] */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r7v11 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final m0 a() {
            short[] sArr;
            char c10;
            char c11;
            byte[] bArr;
            m0 m0Var;
            C0157a c0157a = this.f9457c;
            if (c0157a == null) {
                int i6 = this.f9456b;
                Object[] objArr = this.f9455a;
                if (i6 == 0) {
                    m0Var = m0.A;
                } else {
                    m0 m0Var2 = m0.A;
                    int i10 = 1;
                    C0157a c0157a2 = null;
                    if (i6 == 1) {
                        Objects.requireNonNull(objArr[0]);
                        Objects.requireNonNull(objArr[1]);
                        m0Var = new m0(objArr, 1, null);
                    } else {
                        sc.b.x(i6, objArr.length >> 1);
                        int t3 = u.t(i6);
                        if (i6 == 1) {
                            Objects.requireNonNull(objArr[0]);
                            Objects.requireNonNull(objArr[1]);
                        } else {
                            int i11 = t3 - 1;
                            char c12 = 65535;
                            if (t3 <= 128) {
                                bArr = new byte[t3];
                                Arrays.fill(bArr, (byte) -1);
                                int i12 = 0;
                                int i13 = 0;
                                while (i12 < i6) {
                                    int i14 = (i12 * 2) + 0;
                                    int i15 = (i13 * 2) + 0;
                                    Object obj = objArr[i14];
                                    Objects.requireNonNull(obj);
                                    Object obj2 = objArr[i14 ^ i10];
                                    Objects.requireNonNull(obj2);
                                    int e10 = x.e(obj.hashCode());
                                    while (true) {
                                        int i16 = e10 & i11;
                                        int i17 = bArr[i16] & 255;
                                        if (i17 == 255) {
                                            bArr[i16] = (byte) i15;
                                            if (i13 < i12) {
                                                objArr[i15] = obj;
                                                objArr[i15 ^ 1] = obj2;
                                            }
                                            i13++;
                                        } else if (obj.equals(objArr[i17])) {
                                            int i18 = i17 ^ 1;
                                            Object obj3 = objArr[i18];
                                            Objects.requireNonNull(obj3);
                                            C0157a c0157a3 = new C0157a(obj, obj2, obj3);
                                            objArr[i18] = obj2;
                                            c0157a2 = c0157a3;
                                            break;
                                        } else {
                                            e10 = i16 + 1;
                                        }
                                    }
                                    i12++;
                                    i10 = 1;
                                }
                                if (i13 != i6) {
                                    sArr = new Object[]{bArr, Integer.valueOf(i13), c0157a2};
                                    c0157a2 = sArr;
                                }
                                c0157a2 = bArr;
                            } else {
                                if (t3 <= 32768) {
                                    sArr = new short[t3];
                                    Arrays.fill(sArr, (short) -1);
                                    int i19 = 0;
                                    for (int i20 = 0; i20 < i6; i20++) {
                                        int i21 = (i20 * 2) + 0;
                                        int i22 = (i19 * 2) + 0;
                                        Object obj4 = objArr[i21];
                                        Objects.requireNonNull(obj4);
                                        Object obj5 = objArr[i21 ^ 1];
                                        Objects.requireNonNull(obj5);
                                        int e11 = x.e(obj4.hashCode());
                                        while (true) {
                                            int i23 = e11 & i11;
                                            int i24 = sArr[i23] & 65535;
                                            if (i24 == 65535) {
                                                sArr[i23] = (short) i22;
                                                if (i19 < i20) {
                                                    objArr[i22] = obj4;
                                                    objArr[i22 ^ 1] = obj5;
                                                }
                                                i19++;
                                            } else if (obj4.equals(objArr[i24])) {
                                                int i25 = i24 ^ 1;
                                                Object obj6 = objArr[i25];
                                                Objects.requireNonNull(obj6);
                                                c0157a2 = new C0157a(obj4, obj5, obj6);
                                                objArr[i25] = obj5;
                                                break;
                                            } else {
                                                e11 = i23 + 1;
                                            }
                                        }
                                    }
                                    if (i19 != i6) {
                                        bArr = new Object[]{sArr, Integer.valueOf(i19), c0157a2};
                                        c0157a2 = bArr;
                                    }
                                } else {
                                    sArr = new int[t3];
                                    Arrays.fill((int[]) sArr, -1);
                                    int i26 = 0;
                                    int i27 = 0;
                                    while (i26 < i6) {
                                        int i28 = (i26 * 2) + 0;
                                        int i29 = (i27 * 2) + 0;
                                        Object obj7 = objArr[i28];
                                        Objects.requireNonNull(obj7);
                                        Object obj8 = objArr[i28 ^ 1];
                                        Objects.requireNonNull(obj8);
                                        int e12 = x.e(obj7.hashCode());
                                        while (true) {
                                            int i30 = e12 & i11;
                                            ?? r15 = sArr[i30];
                                            if (r15 == c12) {
                                                sArr[i30] = i29;
                                                if (i27 < i26) {
                                                    objArr[i29] = obj7;
                                                    objArr[i29 ^ 1] = obj8;
                                                }
                                                i27++;
                                            } else if (obj7.equals(objArr[r15])) {
                                                int i31 = r15 ^ 1;
                                                Object obj9 = objArr[i31];
                                                Objects.requireNonNull(obj9);
                                                c0157a2 = new C0157a(obj7, obj8, obj9);
                                                objArr[i31] = obj8;
                                                break;
                                            } else {
                                                e12 = i30 + 1;
                                                c12 = 65535;
                                            }
                                        }
                                        i26++;
                                        c12 = 65535;
                                    }
                                    if (i27 != i6) {
                                        Integer valueOf = Integer.valueOf(i27);
                                        c10 = 1;
                                        c11 = 2;
                                        c0157a2 = new Object[]{sArr, valueOf, c0157a2};
                                        if (c0157a2 instanceof Object[]) {
                                            ?? r52 = (Object[]) c0157a2;
                                            this.f9457c = (C0157a) r52[c11];
                                            ?? r12 = r52[0];
                                            int intValue = ((Integer) r52[c10]).intValue();
                                            objArr = Arrays.copyOf(objArr, intValue * 2);
                                            c0157a2 = r12;
                                            i6 = intValue;
                                        }
                                        m0Var = new m0(objArr, i6, c0157a2);
                                    }
                                }
                                c0157a2 = sArr;
                            }
                        }
                        c11 = 2;
                        c10 = 1;
                        if (c0157a2 instanceof Object[]) {
                        }
                        m0Var = new m0(objArr, i6, c0157a2);
                    }
                }
                C0157a c0157a4 = this.f9457c;
                if (c0157a4 == null) {
                    return m0Var;
                }
                throw c0157a4.a();
            }
            throw c0157a.a();
        }

        public final void b(Object obj, Object obj2) {
            int i6 = (this.f9456b + 1) * 2;
            Object[] objArr = this.f9455a;
            if (i6 > objArr.length) {
                this.f9455a = Arrays.copyOf(objArr, q.b.a(objArr.length, i6));
            }
            if (obj != null) {
                if (obj2 != null) {
                    Object[] objArr2 = this.f9455a;
                    int i10 = this.f9456b;
                    int i11 = i10 * 2;
                    objArr2[i11] = obj;
                    objArr2[i11 + 1] = obj2;
                    this.f9456b = i10 + 1;
                    return;
                }
                String valueOf = String.valueOf(obj);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
                sb2.append("null value in entry: ");
                sb2.append(valueOf);
                sb2.append("=null");
                throw new NullPointerException(sb2.toString());
            }
            String valueOf2 = String.valueOf(obj2);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 24);
            sb3.append("null key in entry: null=");
            sb3.append(valueOf2);
            throw new NullPointerException(sb3.toString());
        }
    }

    /* compiled from: ImmutableMap.java */
    /* loaded from: classes.dex */
    public static class b<K, V> implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final Object[] f9461u;

        /* renamed from: v  reason: collision with root package name */
        public final Object[] f9462v;

        public b(t<K, V> tVar) {
            Object[] objArr = new Object[tVar.size()];
            Object[] objArr2 = new Object[tVar.size()];
            m0.a aVar = tVar.f9452u;
            if (aVar == null) {
                aVar = tVar.b();
                tVar.f9452u = aVar;
            }
            v0<Map.Entry<K, V>> it = aVar.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i6] = next.getKey();
                objArr2[i6] = next.getValue();
                i6++;
            }
            this.f9461u = objArr;
            this.f9462v = objArr2;
        }

        public final Object readResolve() {
            Object[] objArr = this.f9461u;
            boolean z10 = objArr instanceof u;
            Object[] objArr2 = this.f9462v;
            if (!z10) {
                a aVar = new a(objArr.length);
                for (int i6 = 0; i6 < objArr.length; i6++) {
                    aVar.b(objArr[i6], objArr2[i6]);
                }
                return aVar.a();
            }
            u uVar = (u) objArr;
            a aVar2 = new a(uVar.size());
            Iterator it = uVar.iterator();
            v0 it2 = ((q) objArr2).iterator();
            while (it.hasNext()) {
                aVar2.b(it.next(), it2.next());
            }
            return aVar2.a();
        }
    }

    public static <K, V> t<K, V> a(Map<? extends K, ? extends V> map) {
        int i6;
        if ((map instanceof t) && !(map instanceof SortedMap)) {
            t<K, V> tVar = (t) map;
            tVar.f();
            return tVar;
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        boolean z10 = entrySet instanceof Collection;
        if (z10) {
            i6 = entrySet.size();
        } else {
            i6 = 4;
        }
        a aVar = new a(i6);
        if (z10) {
            int size = (entrySet.size() + aVar.f9456b) * 2;
            Object[] objArr = aVar.f9455a;
            if (size > objArr.length) {
                aVar.f9455a = Arrays.copyOf(objArr, q.b.a(objArr.length, size));
            }
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.b(entry.getKey(), entry.getValue());
        }
        return aVar.a();
    }

    public abstract m0.a b();

    public abstract m0.b c();

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
        m0.c cVar = this.f9454w;
        if (cVar == null) {
            cVar = d();
            this.f9454w = cVar;
        }
        return cVar.contains(obj);
    }

    public abstract m0.c d();

    @Override // java.util.Map, j$.util.Map
    public final Set entrySet() {
        u<Map.Entry<K, V>> uVar = this.f9452u;
        if (uVar == null) {
            m0.a b10 = b();
            this.f9452u = b10;
            return b10;
        }
        return uVar;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    public abstract void f();

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        if (v11 != null) {
            return v11;
        }
        return v10;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        m0.a aVar = this.f9452u;
        if (aVar == null) {
            aVar = b();
            this.f9452u = aVar;
        }
        return s0.b(aVar);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        u<K> uVar = this.f9453v;
        if (uVar == null) {
            m0.b c10 = c();
            this.f9453v = c10;
            return c10;
        }
        return uVar;
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
        int size = size();
        x.a(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
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
        q<V> qVar = this.f9454w;
        if (qVar == null) {
            m0.c d10 = d();
            this.f9454w = d10;
            return d10;
        }
        return qVar;
    }

    public Object writeReplace() {
        return new b(this);
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
}
