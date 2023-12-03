package pd;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: ImmutableList.java */
/* loaded from: classes.dex */
public final class c0<E> implements List<E>, RandomAccess {

    /* renamed from: u  reason: collision with root package name */
    public final List<E> f28248u;

    public c0(List<E> list) {
        this.f28248u = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e10) {
        return this.f28248u.add(e10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return this.f28248u.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f28248u.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f28248u.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f28248u.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f28248u.equals(obj);
    }

    @Override // java.util.List
    public final E get(int i6) {
        return this.f28248u.get(i6);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f28248u.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f28248u.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f28248u.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.f28248u.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f28248u.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return this.f28248u.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f28248u.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.f28248u.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.f28248u.retainAll(collection);
    }

    @Override // java.util.List
    public final E set(int i6, E e10) {
        return this.f28248u.set(i6, e10);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f28248u.size();
    }

    @Override // java.util.List
    public final List<E> subList(int i6, int i10) {
        return this.f28248u.subList(i6, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f28248u.toArray();
    }

    @Override // java.util.List
    public final void add(int i6, E e10) {
        this.f28248u.add(i6, e10);
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection<? extends E> collection) {
        return this.f28248u.addAll(i6, collection);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i6) {
        return this.f28248u.listIterator(i6);
    }

    @Override // java.util.List
    public final E remove(int i6) {
        return this.f28248u.remove(i6);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f28248u.toArray(tArr);
    }
}
