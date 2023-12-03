package com.google.protobuf;

import j$.util.Iterator;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.Consumer;
/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes.dex */
public final class p1 extends AbstractList<String> implements f0, RandomAccess {

    /* renamed from: u  reason: collision with root package name */
    public final f0 f10012u;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes.dex */
    public class a implements ListIterator<String>, Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final ListIterator<String> f10013u;

        public a(p1 p1Var, int i6) {
            this.f10013u = p1Var.f10012u.listIterator(i6);
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
            return this.f10013u.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f10013u.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.f10013u.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f10013u.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f10013u.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f10013u.previousIndex();
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
    /* loaded from: classes.dex */
    public class b implements java.util.Iterator<String>, Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final java.util.Iterator<String> f10014u;

        public b(p1 p1Var) {
            this.f10014u = p1Var.f10012u.iterator();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f10014u.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.f10014u.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public p1(f0 f0Var) {
        this.f10012u = f0Var;
    }

    @Override // com.google.protobuf.f0
    public final void B(h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.f0
    public final Object b0(int i6) {
        return this.f10012u.b0(i6);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return (String) this.f10012u.get(i6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i6) {
        return new a(this, i6);
    }

    @Override // com.google.protobuf.f0
    public final List<?> n() {
        return this.f10012u.n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10012u.size();
    }

    @Override // com.google.protobuf.f0
    public final f0 p() {
        return this;
    }
}
