package com.google.common.collect;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.function.Consumer;
/* compiled from: UnmodifiableIterator.java */
/* loaded from: classes.dex */
public abstract class v0<E> implements Iterator<E>, j$.util.Iterator {
    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
