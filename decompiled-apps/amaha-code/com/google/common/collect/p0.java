package com.google.common.collect;

import java.io.Serializable;
/* compiled from: ReverseOrdering.java */
/* loaded from: classes.dex */
public final class p0<T> extends k0<T> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final k0<? super T> f9435u;

    public p0(k0<? super T> k0Var) {
        k0Var.getClass();
        this.f9435u = k0Var;
    }

    @Override // com.google.common.collect.k0
    public final <S extends T> k0<S> a() {
        return (k0<? super T>) this.f9435u;
    }

    @Override // com.google.common.collect.k0, java.util.Comparator
    public final int compare(T t3, T t10) {
        return this.f9435u.compare(t10, t3);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            return this.f9435u.equals(((p0) obj).f9435u);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f9435u.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9435u);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
