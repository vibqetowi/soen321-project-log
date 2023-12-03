package com.google.common.collect;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
/* compiled from: TransformedIterator.java */
/* loaded from: classes.dex */
public abstract class u0<F, T> implements Iterator<T>, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public final Iterator<? extends F> f9467u;

    public u0(Iterator<? extends F> it) {
        it.getClass();
        this.f9467u = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f9467u.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f9467u.next()).getValue();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.f9467u.remove();
    }
}
