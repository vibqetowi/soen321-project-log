package com.google.common.collect;

import java.util.NoSuchElementException;
/* compiled from: Iterators.java */
/* loaded from: classes.dex */
public final class v extends v0<Object> {

    /* renamed from: u  reason: collision with root package name */
    public boolean f9468u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f9469v;

    public v(Object obj) {
        this.f9469v = obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return !this.f9468u;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!this.f9468u) {
            this.f9468u = true;
            return this.f9469v;
        }
        throw new NoSuchElementException();
    }
}
