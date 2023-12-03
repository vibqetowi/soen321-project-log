package com.google.common.collect;

import java.io.Serializable;
/* compiled from: NaturalOrdering.java */
/* loaded from: classes.dex */
public final class j0 extends k0<Comparable<?>> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public static final j0 f9394u = new j0();

    private Object readResolve() {
        return f9394u;
    }

    @Override // com.google.common.collect.k0
    public final <S extends Comparable<?>> k0<S> a() {
        return o0.f9434u;
    }

    @Override // com.google.common.collect.k0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
