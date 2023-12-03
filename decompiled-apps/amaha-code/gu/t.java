package gu;

import j$.util.Iterator;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.Consumer;
/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes2.dex */
public final class t extends AbstractList<String> implements RandomAccess, l {

    /* renamed from: u  reason: collision with root package name */
    public final l f16911u;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes2.dex */
    public class a implements ListIterator<String>, Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final ListIterator<String> f16912u;

        public a(t tVar, int i6) {
            this.f16912u = tVar.f16911u.listIterator(i6);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f16912u.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f16912u.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.f16912u.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f16912u.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f16912u.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f16912u.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes2.dex */
    public class b implements java.util.Iterator<String>, Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final java.util.Iterator<String> f16913u;

        public b(t tVar) {
            this.f16913u = tVar.f16911u.iterator();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f16913u.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.f16913u.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public t(l lVar) {
        this.f16911u = lVar;
    }

    @Override // gu.l
    public final void E(m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override // gu.l
    public final c V(int i6) {
        return this.f16911u.V(i6);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return (String) this.f16911u.get(i6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i6) {
        return new a(this, i6);
    }

    @Override // gu.l
    public final List<?> n() {
        return this.f16911u.n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16911u.size();
    }

    @Override // gu.l
    public final t p() {
        return this;
    }
}
