package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class k<E> extends v<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final int f7566u;

    /* renamed from: v  reason: collision with root package name */
    public int f7567v;

    /* renamed from: w  reason: collision with root package name */
    public final m<E> f7568w;

    public k(m<E> mVar, int i6) {
        int size = mVar.size();
        g.d(i6, size);
        this.f7566u = size;
        this.f7567v = i6;
        this.f7568w = mVar;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    /* renamed from: b */
    public final boolean hasNext() {
        if (this.f7567v < this.f7566u) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    /* renamed from: c */
    public final boolean hasPrevious() {
        if (this.f7567v > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    /* renamed from: d */
    public final Object next() {
        if (hasNext()) {
            int i6 = this.f7567v;
            this.f7567v = i6 + 1;
            return this.f7568w.get(i6);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    /* renamed from: e */
    public final Object previous() {
        if (hasPrevious()) {
            int i6 = this.f7567v - 1;
            this.f7567v = i6;
            return this.f7568w.get(i6);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7567v;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7567v - 1;
    }
}
