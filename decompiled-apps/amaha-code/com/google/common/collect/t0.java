package com.google.common.collect;
/* compiled from: SingletonImmutableSet.java */
/* loaded from: classes.dex */
public final class t0<E> extends u<E> {

    /* renamed from: x  reason: collision with root package name */
    public final transient E f9463x;

    public t0(E e10) {
        e10.getClass();
        this.f9463x = e10;
    }

    @Override // com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9463x.equals(obj);
    }

    @Override // com.google.common.collect.u, com.google.common.collect.q
    public final s<E> e() {
        return s.K(this.f9463x);
    }

    @Override // com.google.common.collect.q
    public final int g(Object[] objArr) {
        objArr[0] = this.f9463x;
        return 1;
    }

    @Override // com.google.common.collect.u, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9463x.hashCode();
    }

    @Override // com.google.common.collect.q
    public final boolean r() {
        return false;
    }

    @Override // com.google.common.collect.u, com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: s */
    public final v0<E> iterator() {
        return new v(this.f9463x);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f9463x.toString();
        StringBuilder sb2 = new StringBuilder(ri.e.c(obj, 2));
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
