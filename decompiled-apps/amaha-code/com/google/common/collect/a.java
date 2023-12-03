package com.google.common.collect;

import com.google.common.collect.s;
import java.util.ListIterator;
import java.util.NoSuchElementException;
/* compiled from: AbstractIndexedListIterator.java */
/* loaded from: classes.dex */
public abstract class a<E> extends v0<Object> implements ListIterator<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final int f9346u;

    /* renamed from: v  reason: collision with root package name */
    public int f9347v;

    public a(int i6, int i10) {
        sc.b.x(i10, i6);
        this.f9346u = i6;
        this.f9347v = i10;
    }

    @Deprecated
    public final void a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a(obj);
        throw null;
    }

    @Deprecated
    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.f9347v < this.f9346u) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f9347v > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final E next() {
        if (hasNext()) {
            int i6 = this.f9347v;
            this.f9347v = i6 + 1;
            return ((s.b) this).f9447w.get(i6);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9347v;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i6 = this.f9347v - 1;
            this.f9347v = i6;
            return ((s.b) this).f9447w.get(i6);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9347v - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        b(obj);
        throw null;
    }
}
