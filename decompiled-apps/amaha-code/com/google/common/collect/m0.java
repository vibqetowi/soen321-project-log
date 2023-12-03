package com.google.common.collect;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Map;
/* compiled from: RegularImmutableMap.java */
/* loaded from: classes.dex */
public final class m0<K, V> extends t<K, V> {
    public static final m0 A = new m0(new Object[0], 0, null);

    /* renamed from: x  reason: collision with root package name */
    public final transient Object f9419x;

    /* renamed from: y  reason: collision with root package name */
    public final transient Object[] f9420y;

    /* renamed from: z  reason: collision with root package name */
    public final transient int f9421z;

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends u<Map.Entry<K, V>> {
        public final transient int A;

        /* renamed from: x  reason: collision with root package name */
        public final transient t<K, V> f9422x;

        /* renamed from: y  reason: collision with root package name */
        public final transient Object[] f9423y;

        /* renamed from: z  reason: collision with root package name */
        public final transient int f9424z = 0;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: com.google.common.collect.m0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0156a extends s<Map.Entry<K, V>> {
            public C0156a() {
            }

            @Override // java.util.List
            public final Object get(int i6) {
                a aVar = a.this;
                sc.b.u(i6, aVar.A);
                int i10 = i6 * 2;
                int i11 = aVar.f9424z;
                Object[] objArr = aVar.f9423y;
                Object obj = objArr[i11 + i10];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i10 + (i11 ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.q
            public final boolean r() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.A;
            }
        }

        public a(t tVar, Object[] objArr, int i6) {
            this.f9422x = tVar;
            this.f9423y = objArr;
            this.A = i6;
        }

        @Override // com.google.common.collect.u
        public final s<Map.Entry<K, V>> I() {
            return new C0156a();
        }

        @Override // com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f9422x.get(key))) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.q
        public final int g(Object[] objArr) {
            return e().g(objArr);
        }

        @Override // com.google.common.collect.q
        public final boolean r() {
            return true;
        }

        @Override // com.google.common.collect.u, com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: s */
        public final v0<Map.Entry<K, V>> iterator() {
            return e().listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.A;
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes.dex */
    public static final class b<K> extends u<K> {

        /* renamed from: x  reason: collision with root package name */
        public final transient t<K, ?> f9426x;

        /* renamed from: y  reason: collision with root package name */
        public final transient s<K> f9427y;

        public b(t tVar, c cVar) {
            this.f9426x = tVar;
            this.f9427y = cVar;
        }

        @Override // com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (this.f9426x.get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.u, com.google.common.collect.q
        public final s<K> e() {
            return this.f9427y;
        }

        @Override // com.google.common.collect.q
        public final int g(Object[] objArr) {
            return this.f9427y.g(objArr);
        }

        @Override // com.google.common.collect.q
        public final boolean r() {
            return true;
        }

        @Override // com.google.common.collect.u, com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: s */
        public final v0<K> iterator() {
            return this.f9427y.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f9426x.size();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes.dex */
    public static final class c extends s<Object> {

        /* renamed from: w  reason: collision with root package name */
        public final transient Object[] f9428w;

        /* renamed from: x  reason: collision with root package name */
        public final transient int f9429x;

        /* renamed from: y  reason: collision with root package name */
        public final transient int f9430y;

        public c(int i6, int i10, Object[] objArr) {
            this.f9428w = objArr;
            this.f9429x = i6;
            this.f9430y = i10;
        }

        @Override // java.util.List
        public final Object get(int i6) {
            sc.b.u(i6, this.f9430y);
            Object obj = this.f9428w[(i6 * 2) + this.f9429x];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.q
        public final boolean r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f9430y;
        }
    }

    public m0(Object[] objArr, int i6, Object obj) {
        this.f9419x = obj;
        this.f9420y = objArr;
        this.f9421z = i6;
    }

    @Override // com.google.common.collect.t
    public final a b() {
        return new a(this, this.f9420y, this.f9421z);
    }

    @Override // com.google.common.collect.t
    public final b c() {
        return new b(this, new c(0, this.f9421z, this.f9420y));
    }

    @Override // com.google.common.collect.t
    public final c d() {
        return new c(1, this.f9421z, this.f9420y);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[RETURN] */
    @Override // com.google.common.collect.t, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        V v10;
        if (obj != null) {
            Object[] objArr = this.f9420y;
            if (this.f9421z == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                if (obj2.equals(obj)) {
                    v10 = (V) objArr[1];
                    Objects.requireNonNull(v10);
                }
            } else {
                Object obj3 = this.f9419x;
                if (obj3 != null) {
                    if (obj3 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj3;
                        int length = bArr.length - 1;
                        int e10 = x.e(obj.hashCode());
                        while (true) {
                            int i6 = e10 & length;
                            int i10 = bArr[i6] & 255;
                            if (i10 == 255) {
                                break;
                            } else if (obj.equals(objArr[i10])) {
                                v10 = (V) objArr[i10 ^ 1];
                                break;
                            } else {
                                e10 = i6 + 1;
                            }
                        }
                    } else if (obj3 instanceof short[]) {
                        short[] sArr = (short[]) obj3;
                        int length2 = sArr.length - 1;
                        int e11 = x.e(obj.hashCode());
                        while (true) {
                            int i11 = e11 & length2;
                            int i12 = sArr[i11] & 65535;
                            if (i12 == 65535) {
                                break;
                            } else if (obj.equals(objArr[i12])) {
                                v10 = (V) objArr[i12 ^ 1];
                                break;
                            } else {
                                e11 = i11 + 1;
                            }
                        }
                    } else {
                        int[] iArr = (int[]) obj3;
                        int length3 = iArr.length - 1;
                        int e12 = x.e(obj.hashCode());
                        while (true) {
                            int i13 = e12 & length3;
                            int i14 = iArr[i13];
                            if (i14 == -1) {
                                break;
                            } else if (obj.equals(objArr[i14])) {
                                v10 = (V) objArr[i14 ^ 1];
                                break;
                            } else {
                                e12 = i13 + 1;
                            }
                        }
                    }
                }
            }
            if (v10 != null) {
                return null;
            }
            return v10;
        }
        v10 = null;
        if (v10 != null) {
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.f9421z;
    }

    @Override // com.google.common.collect.t
    public final void f() {
    }
}
