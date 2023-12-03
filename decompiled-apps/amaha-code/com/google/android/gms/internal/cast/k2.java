package com.google.android.gms.internal.cast;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public abstract class k2 implements Iterator, java.util.Iterator {
    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final Object next() {
        j2 j2Var = (j2) this;
        int i6 = j2Var.f7562u;
        if (i6 < j2Var.f7563v) {
            j2Var.f7562u = i6 + 1;
            return Byte.valueOf(j2Var.f7564w.g(i6));
        }
        throw new NoSuchElementException();
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
