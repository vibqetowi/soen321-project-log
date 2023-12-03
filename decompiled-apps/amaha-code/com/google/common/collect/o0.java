package com.google.common.collect;

import java.io.Serializable;
/* compiled from: ReverseNaturalOrdering.java */
/* loaded from: classes.dex */
public final class o0 extends k0<Comparable<?>> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public static final o0 f9434u = new o0();

    private Object readResolve() {
        return f9434u;
    }

    @Override // com.google.common.collect.k0
    public final <S extends Comparable<?>> k0<S> a() {
        return j0.f9394u;
    }

    @Override // com.google.common.collect.k0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
