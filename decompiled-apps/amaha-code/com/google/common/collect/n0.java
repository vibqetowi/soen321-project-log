package com.google.common.collect;
/* compiled from: RegularImmutableSet.java */
/* loaded from: classes.dex */
public final class n0<E> extends u<E> {
    public static final Object[] C;
    public static final n0<Object> D;
    public final transient int A;
    public final transient int B;

    /* renamed from: x  reason: collision with root package name */
    public final transient Object[] f9431x;

    /* renamed from: y  reason: collision with root package name */
    public final transient int f9432y;

    /* renamed from: z  reason: collision with root package name */
    public final transient Object[] f9433z;

    static {
        Object[] objArr = new Object[0];
        C = objArr;
        D = new n0<>(0, 0, 0, objArr, objArr);
    }

    public n0(int i6, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f9431x = objArr;
        this.f9432y = i6;
        this.f9433z = objArr2;
        this.A = i10;
        this.B = i11;
    }

    @Override // com.google.common.collect.u
    public final s<E> I() {
        return s.t(this.B, this.f9431x);
    }

    @Override // com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f9433z;
            if (objArr.length != 0) {
                int f = x.f(obj);
                while (true) {
                    int i6 = f & this.A;
                    Object obj2 = objArr[i6];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    f = i6 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.q
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.f9431x;
        int i6 = this.B;
        System.arraycopy(objArr2, 0, objArr, 0, i6);
        return 0 + i6;
    }

    @Override // com.google.common.collect.u, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9432y;
    }

    @Override // com.google.common.collect.q
    public final Object[] m() {
        return this.f9431x;
    }

    @Override // com.google.common.collect.q
    public final int o() {
        return this.B;
    }

    @Override // com.google.common.collect.q
    public final int q() {
        return 0;
    }

    @Override // com.google.common.collect.q
    public final boolean r() {
        return false;
    }

    @Override // com.google.common.collect.u, com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: s */
    public final v0<E> iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.B;
    }
}
