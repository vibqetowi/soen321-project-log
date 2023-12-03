package is;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: Collections.kt */
/* loaded from: classes2.dex */
public final class f<T> implements Collection<T>, ts.a {

    /* renamed from: u  reason: collision with root package name */
    public final T[] f20649u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f20650v;

    public f(T[] values, boolean z10) {
        kotlin.jvm.internal.i.g(values, "values");
        this.f20649u = values;
        this.f20650v = z10;
    }

    @Override // java.util.Collection
    public final boolean add(T t3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return k.Q1(obj, this.f20649u);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.g(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f20649u.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return kotlin.jvm.internal.h.N(this.f20649u);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f20649u.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.f20649u;
        kotlin.jvm.internal.i.g(tArr, "<this>");
        if (this.f20650v && kotlin.jvm.internal.i.b(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.i.f(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.i.g(array, "array");
        return (T[]) kc.f.Z(this, array);
    }
}
