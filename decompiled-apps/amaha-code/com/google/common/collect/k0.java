package com.google.common.collect;

import java.util.Comparator;
/* compiled from: Ordering.java */
/* loaded from: classes.dex */
public abstract class k0<T> implements Comparator<T> {
    public <S extends T> k0<S> a() {
        return new p0(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t3, T t10);
}
