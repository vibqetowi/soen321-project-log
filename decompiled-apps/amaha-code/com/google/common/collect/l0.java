package com.google.common.collect;

import j$.util.Objects;
/* compiled from: RegularImmutableList.java */
/* loaded from: classes.dex */
public final class l0<E> extends s<E> {

    /* renamed from: y  reason: collision with root package name */
    public static final l0 f9412y = new l0(0, new Object[0]);

    /* renamed from: w  reason: collision with root package name */
    public final transient Object[] f9413w;

    /* renamed from: x  reason: collision with root package name */
    public final transient int f9414x;

    public l0(int i6, Object[] objArr) {
        this.f9413w = objArr;
        this.f9414x = i6;
    }

    @Override // com.google.common.collect.s, com.google.common.collect.q
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.f9413w;
        int i6 = this.f9414x;
        System.arraycopy(objArr2, 0, objArr, 0, i6);
        return 0 + i6;
    }

    @Override // java.util.List
    public final E get(int i6) {
        sc.b.u(i6, this.f9414x);
        E e10 = (E) this.f9413w[i6];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // com.google.common.collect.q
    public final Object[] m() {
        return this.f9413w;
    }

    @Override // com.google.common.collect.q
    public final int o() {
        return this.f9414x;
    }

    @Override // com.google.common.collect.q
    public final int q() {
        return 0;
    }

    @Override // com.google.common.collect.q
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9414x;
    }
}
