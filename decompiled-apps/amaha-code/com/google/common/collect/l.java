package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
/* compiled from: ComparatorOrdering.java */
/* loaded from: classes.dex */
public final class l<T> extends k0<T> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final Comparator<T> f9411u;

    public l(p0.d dVar) {
        this.f9411u = dVar;
    }

    @Override // com.google.common.collect.k0, java.util.Comparator
    public final int compare(T t3, T t10) {
        return this.f9411u.compare(t3, t10);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return this.f9411u.equals(((l) obj).f9411u);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9411u.hashCode();
    }

    public final String toString() {
        return this.f9411u.toString();
    }
}
