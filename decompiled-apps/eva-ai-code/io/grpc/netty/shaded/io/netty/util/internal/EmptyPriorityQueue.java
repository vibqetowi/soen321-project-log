package io.grpc.netty.shaded.io.netty.util.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes4.dex */
public final class EmptyPriorityQueue<T> implements PriorityQueue<T> {
    private static final PriorityQueue<Object> INSTANCE = new EmptyPriorityQueue();

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t) {
        return false;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    @Override // java.util.Collection
    public void clear() {
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.PriorityQueue
    public void clearIgnoringIndexes() {
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.PriorityQueue
    public boolean containsTyped(T t) {
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        return false;
    }

    @Override // java.util.Queue
    public T peek() {
        return null;
    }

    @Override // java.util.Queue
    public T poll() {
        return null;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.PriorityQueue
    public void priorityChanged(T t) {
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return false;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.internal.PriorityQueue
    public boolean removeTyped(T t) {
        return false;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override // java.util.Collection
    public int size() {
        return 0;
    }

    public String toString() {
        return "EmptyPriorityQueue";
    }

    private EmptyPriorityQueue() {
    }

    public static <V> EmptyPriorityQueue<V> instance() {
        return (EmptyPriorityQueue) INSTANCE;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return EmptyArrays.EMPTY_OBJECTS;
    }

    @Override // java.util.Collection
    public <T1> T1[] toArray(T1[] t1Arr) {
        if (t1Arr.length > 0) {
            t1Arr[0] = null;
        }
        return t1Arr;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof PriorityQueue) && ((PriorityQueue) obj).isEmpty();
    }

    @Override // java.util.Queue
    public T remove() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Queue
    public T element() {
        throw new NoSuchElementException();
    }
}
