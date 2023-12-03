package com.google.firebase.database.collection;

import com.google.firebase.database.collection.ImmutableSortedMap;
import j$.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
/* loaded from: classes.dex */
public class ImmutableSortedSet<T> implements Iterable<T> {
    private final ImmutableSortedMap<T, Void> map;

    /* loaded from: classes.dex */
    public static class WrappedEntryIterator<T> implements Iterator<T>, j$.util.Iterator {
        final Iterator<Map.Entry<T, Void>> iterator;

        public WrappedEntryIterator(Iterator<Map.Entry<T, Void>> it) {
            this.iterator = it;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            return this.iterator.next().getKey();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            this.iterator.remove();
        }
    }

    public ImmutableSortedSet(List<T> list, Comparator<T> comparator) {
        this.map = ImmutableSortedMap.Builder.buildFrom(list, Collections.emptyMap(), ImmutableSortedMap.Builder.identityTranslator(), comparator);
    }

    public boolean contains(T t3) {
        return this.map.containsKey(t3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableSortedSet)) {
            return false;
        }
        return this.map.equals(((ImmutableSortedSet) obj).map);
    }

    public T getMaxEntry() {
        return this.map.getMaxKey();
    }

    public T getMinEntry() {
        return this.map.getMinKey();
    }

    public T getPredecessorEntry(T t3) {
        return this.map.getPredecessorKey(t3);
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public int indexOf(T t3) {
        return this.map.indexOf(t3);
    }

    public ImmutableSortedSet<T> insert(T t3) {
        return new ImmutableSortedSet<>(this.map.insert(t3, null));
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new WrappedEntryIterator(this.map.iterator());
    }

    public java.util.Iterator<T> iteratorFrom(T t3) {
        return new WrappedEntryIterator(this.map.iteratorFrom(t3));
    }

    public ImmutableSortedSet<T> remove(T t3) {
        ImmutableSortedMap<T, Void> remove = this.map.remove(t3);
        if (remove == this.map) {
            return this;
        }
        return new ImmutableSortedSet<>(remove);
    }

    public java.util.Iterator<T> reverseIterator() {
        return new WrappedEntryIterator(this.map.reverseIterator());
    }

    public java.util.Iterator<T> reverseIteratorFrom(T t3) {
        return new WrappedEntryIterator(this.map.reverseIteratorFrom(t3));
    }

    public int size() {
        return this.map.size();
    }

    public ImmutableSortedSet<T> unionWith(ImmutableSortedSet<T> immutableSortedSet) {
        ImmutableSortedSet<T> immutableSortedSet2;
        if (size() < immutableSortedSet.size()) {
            immutableSortedSet2 = immutableSortedSet;
            immutableSortedSet = this;
        } else {
            immutableSortedSet2 = this;
        }
        java.util.Iterator<T> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            immutableSortedSet2 = immutableSortedSet2.insert(it.next());
        }
        return immutableSortedSet2;
    }

    private ImmutableSortedSet(ImmutableSortedMap<T, Void> immutableSortedMap) {
        this.map = immutableSortedMap;
    }
}
