package is;

import j$.util.Iterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.function.Consumer;
/* compiled from: AbstractList.kt */
/* loaded from: classes2.dex */
public abstract class c<E> extends is.a<E> implements List<E> {

    /* compiled from: AbstractList.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(int i6, int i10, int i11) {
            if (i6 >= 0 && i10 <= i11) {
                if (i6 <= i10) {
                    return;
                }
                throw new IllegalArgumentException(defpackage.b.j("fromIndex: ", i6, " > toIndex: ", i10));
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i6 + ", toIndex: " + i10 + ", size: " + i11);
        }
    }

    /* compiled from: AbstractList.kt */
    /* loaded from: classes2.dex */
    public class b implements Iterator<E>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public int f20643u;

        public b() {
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f20643u < c.this.g()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final E next() {
            if (hasNext()) {
                int i6 = this.f20643u;
                this.f20643u = i6 + 1;
                return c.this.get(i6);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: is.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0318c extends c<E>.b implements ListIterator<E> {
        public C0318c(int i6) {
            super();
            int g5 = c.this.g();
            if (i6 >= 0 && i6 <= g5) {
                this.f20643u = i6;
                return;
            }
            throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", g5));
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            if (this.f20643u > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f20643u;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (hasPrevious()) {
                int i6 = this.f20643u - 1;
                this.f20643u = i6;
                return c.this.get(i6);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f20643u - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* loaded from: classes2.dex */
    public static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: u  reason: collision with root package name */
        public final c<E> f20646u;

        /* renamed from: v  reason: collision with root package name */
        public final int f20647v;

        /* renamed from: w  reason: collision with root package name */
        public final int f20648w;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> list, int i6, int i10) {
            kotlin.jvm.internal.i.g(list, "list");
            this.f20646u = list;
            this.f20647v = i6;
            a.a(i6, i10, list.g());
            this.f20648w = i10 - i6;
        }

        @Override // is.a
        public final int g() {
            return this.f20648w;
        }

        @Override // is.c, java.util.List
        public final E get(int i6) {
            int i10 = this.f20648w;
            if (i6 >= 0 && i6 < i10) {
                return this.f20646u.get(this.f20647v + i6);
            }
            throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", i10));
        }
    }

    @Override // java.util.List
    public final void add(int i6, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        kotlin.jvm.internal.i.g(other, "other");
        if (size() != other.size()) {
            return false;
        }
        java.util.Iterator<E> it = other.iterator();
        for (E e10 : this) {
            if (!kotlin.jvm.internal.i.b(e10, it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract E get(int i6);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i6;
        int i10 = 1;
        for (E e10 : this) {
            int i11 = i10 * 31;
            if (e10 != null) {
                i6 = e10.hashCode();
            } else {
                i6 = 0;
            }
            i10 = i11 + i6;
        }
        return i10;
    }

    public int indexOf(E e10) {
        int i6 = 0;
        for (E e11 : this) {
            if (!kotlin.jvm.internal.i.b(e11, e10)) {
                i6++;
            } else {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.i.b(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return new C0318c(0);
    }

    @Override // java.util.List
    public final E remove(int i6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i6, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<E> subList(int i6, int i10) {
        return new d(this, i6, i10);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i6) {
        return new C0318c(i6);
    }
}
