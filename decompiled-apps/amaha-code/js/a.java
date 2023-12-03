package js;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import is.c;
import j$.util.Iterator;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.function.Consumer;
import kotlin.jvm.internal.i;
/* compiled from: ListBuilder.kt */
/* loaded from: classes2.dex */
public final class a<E> extends is.d<E> implements RandomAccess, Serializable {

    /* renamed from: u  reason: collision with root package name */
    public E[] f22596u;

    /* renamed from: v  reason: collision with root package name */
    public final int f22597v;

    /* renamed from: w  reason: collision with root package name */
    public int f22598w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f22599x;

    /* renamed from: y  reason: collision with root package name */
    public final a<E> f22600y;

    /* renamed from: z  reason: collision with root package name */
    public final a<E> f22601z;

    /* compiled from: ListBuilder.kt */
    /* renamed from: js.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0343a<E> implements ListIterator<E>, ts.a, Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final a<E> f22602u;

        /* renamed from: v  reason: collision with root package name */
        public int f22603v;

        /* renamed from: w  reason: collision with root package name */
        public int f22604w;

        public C0343a(a<E> list, int i6) {
            i.g(list, "list");
            this.f22602u = list;
            this.f22603v = i6;
            this.f22604w = -1;
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            int i6 = this.f22603v;
            this.f22603v = i6 + 1;
            this.f22602u.add(i6, e10);
            this.f22604w = -1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f22603v < this.f22602u.f22598w) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            if (this.f22603v > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final E next() {
            int i6 = this.f22603v;
            a<E> aVar = this.f22602u;
            if (i6 < aVar.f22598w) {
                this.f22603v = i6 + 1;
                this.f22604w = i6;
                return aVar.f22596u[aVar.f22597v + i6];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f22603v;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            int i6 = this.f22603v;
            if (i6 > 0) {
                int i10 = i6 - 1;
                this.f22603v = i10;
                this.f22604w = i10;
                a<E> aVar = this.f22602u;
                return aVar.f22596u[aVar.f22597v + i10];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f22603v - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            boolean z10;
            int i6 = this.f22604w;
            if (i6 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f22602u.m(i6);
                this.f22603v = this.f22604w;
                this.f22604w = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            boolean z10;
            int i6 = this.f22604w;
            if (i6 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f22602u.set(i6, e10);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public a(E[] eArr, int i6, int i10, boolean z10, a<E> aVar, a<E> aVar2) {
        this.f22596u = eArr;
        this.f22597v = i6;
        this.f22598w = i10;
        this.f22599x = z10;
        this.f22600y = aVar;
        this.f22601z = aVar2;
    }

    private final Object writeReplace() {
        boolean z10;
        a<E> aVar;
        if (!this.f22599x && ((aVar = this.f22601z) == null || !aVar.f22599x)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return new e(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        r();
        q(this.f22597v + this.f22598w, e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        i.g(elements, "elements");
        r();
        int size = elements.size();
        o(this.f22597v + this.f22598w, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        r();
        v(this.f22597v, this.f22598w);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.f22596u;
            int i6 = this.f22598w;
            if (i6 == list.size()) {
                for (int i10 = 0; i10 < i6; i10++) {
                    if (i.b(eArr[this.f22597v + i10], list.get(i10))) {
                    }
                }
                z10 = true;
                if (!z10) {
                    return true;
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
        return false;
    }

    @Override // is.d
    public final int g() {
        return this.f22598w;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i6) {
        int i10 = this.f22598w;
        if (i6 >= 0 && i6 < i10) {
            return this.f22596u[this.f22597v + i6];
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", i10));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6;
        E[] eArr = this.f22596u;
        int i10 = this.f22598w;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            E e10 = eArr[this.f22597v + i12];
            int i13 = i11 * 31;
            if (e10 != null) {
                i6 = e10.hashCode();
            } else {
                i6 = 0;
            }
            i11 = i13 + i6;
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i6 = 0; i6 < this.f22598w; i6++) {
            if (i.b(this.f22596u[this.f22597v + i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f22598w == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
        return new C0343a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i6 = this.f22598w - 1; i6 >= 0; i6--) {
            if (i.b(this.f22596u[this.f22597v + i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return new C0343a(this, 0);
    }

    @Override // is.d
    public final E m(int i6) {
        r();
        int i10 = this.f22598w;
        if (i6 >= 0 && i6 < i10) {
            return t(this.f22597v + i6);
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", i10));
    }

    public final void o(int i6, Collection<? extends E> collection, int i10) {
        a<E> aVar = this.f22600y;
        if (aVar != null) {
            aVar.o(i6, collection, i10);
            this.f22596u = aVar.f22596u;
            this.f22598w += i10;
            return;
        }
        s(i6, i10);
        java.util.Iterator<? extends E> it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f22596u[i6 + i11] = it.next();
        }
    }

    public final void q(int i6, E e10) {
        a<E> aVar = this.f22600y;
        if (aVar != null) {
            aVar.q(i6, e10);
            this.f22596u = aVar.f22596u;
            this.f22598w++;
            return;
        }
        s(i6, 1);
        this.f22596u[i6] = e10;
    }

    public final void r() {
        boolean z10;
        a<E> aVar;
        if (!this.f22599x && ((aVar = this.f22601z) == null || !aVar.f22599x)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        r();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> elements) {
        i.g(elements, "elements");
        r();
        if (z(this.f22597v, this.f22598w, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> elements) {
        i.g(elements, "elements");
        r();
        if (z(this.f22597v, this.f22598w, elements, true) > 0) {
            return true;
        }
        return false;
    }

    public final void s(int i6, int i10) {
        int i11 = this.f22598w + i10;
        if (this.f22600y == null) {
            if (i11 >= 0) {
                E[] eArr = this.f22596u;
                if (i11 > eArr.length) {
                    int length = eArr.length;
                    int i12 = length + (length >> 1);
                    if (i12 - i11 < 0) {
                        i12 = i11;
                    }
                    if (i12 - 2147483639 > 0) {
                        if (i11 > 2147483639) {
                            i12 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                        } else {
                            i12 = 2147483639;
                        }
                    }
                    E[] eArr2 = (E[]) Arrays.copyOf(eArr, i12);
                    i.f(eArr2, "copyOf(this, newSize)");
                    this.f22596u = eArr2;
                }
                E[] eArr3 = this.f22596u;
                is.i.J1(i6 + i10, i6, this.f22597v + this.f22598w, eArr3, eArr3);
                this.f22598w += i10;
                return;
            }
            throw new OutOfMemoryError();
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i6, E e10) {
        r();
        int i10 = this.f22598w;
        if (i6 >= 0 && i6 < i10) {
            E[] eArr = this.f22596u;
            int i11 = this.f22597v;
            E e11 = eArr[i11 + i6];
            eArr[i11 + i6] = e10;
            return e11;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i6, int i10) {
        a<E> aVar;
        c.a.a(i6, i10, this.f22598w);
        E[] eArr = this.f22596u;
        int i11 = this.f22597v + i6;
        int i12 = i10 - i6;
        boolean z10 = this.f22599x;
        a<E> aVar2 = this.f22601z;
        if (aVar2 == null) {
            aVar = this;
        } else {
            aVar = aVar2;
        }
        return new a(eArr, i11, i12, z10, this, aVar);
    }

    public final E t(int i6) {
        int i10;
        a<E> aVar = this.f22600y;
        if (aVar != null) {
            this.f22598w--;
            return aVar.t(i6);
        }
        E[] eArr = this.f22596u;
        E e10 = eArr[i6];
        is.i.J1(i6, i6 + 1, this.f22598w + this.f22597v, eArr, eArr);
        E[] eArr2 = this.f22596u;
        i.g(eArr2, "<this>");
        eArr2[(i10 + this.f22598w) - 1] = null;
        this.f22598w--;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] destination) {
        i.g(destination, "destination");
        int length = destination.length;
        int i6 = this.f22598w;
        int i10 = this.f22597v;
        if (length < i6) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.f22596u, i10, i6 + i10, destination.getClass());
            i.f(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        is.i.J1(0, i10, i6 + i10, this.f22596u, destination);
        int length2 = destination.length;
        int i11 = this.f22598w;
        if (length2 > i11) {
            destination[i11] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        E[] eArr = this.f22596u;
        int i6 = this.f22598w;
        StringBuilder sb2 = new StringBuilder((i6 * 3) + 2);
        sb2.append("[");
        for (int i10 = 0; i10 < i6; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(eArr[this.f22597v + i10]);
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        i.f(sb3, "sb.toString()");
        return sb3;
    }

    public final void v(int i6, int i10) {
        a<E> aVar = this.f22600y;
        if (aVar != null) {
            aVar.v(i6, i10);
        } else {
            E[] eArr = this.f22596u;
            is.i.J1(i6, i6 + i10, this.f22598w, eArr, eArr);
            E[] eArr2 = this.f22596u;
            int i11 = this.f22598w;
            ca.a.h1(i11 - i10, i11, eArr2);
        }
        this.f22598w -= i10;
    }

    public final int z(int i6, int i10, Collection<? extends E> collection, boolean z10) {
        a<E> aVar = this.f22600y;
        if (aVar != null) {
            int z11 = aVar.z(i6, i10, collection, z10);
            this.f22598w -= z11;
            return z11;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i6 + i11;
            if (collection.contains(this.f22596u[i13]) == z10) {
                E[] eArr = this.f22596u;
                i11++;
                eArr[i12 + i6] = eArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        E[] eArr2 = this.f22596u;
        is.i.J1(i6 + i12, i10 + i6, this.f22598w, eArr2, eArr2);
        E[] eArr3 = this.f22596u;
        int i15 = this.f22598w;
        ca.a.h1(i15 - i14, i15, eArr3);
        this.f22598w -= i14;
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i6) {
        int i10 = this.f22598w;
        if (i6 >= 0 && i6 <= i10) {
            return new C0343a(this, i6);
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, E e10) {
        r();
        int i10 = this.f22598w;
        if (i6 >= 0 && i6 <= i10) {
            q(this.f22597v + i6, e10);
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection<? extends E> elements) {
        i.g(elements, "elements");
        r();
        int i10 = this.f22598w;
        if (i6 >= 0 && i6 <= i10) {
            int size = elements.size();
            o(this.f22597v + i6, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        E[] eArr = this.f22596u;
        int i6 = this.f22598w;
        int i10 = this.f22597v;
        return is.i.L1(i10, i6 + i10, eArr);
    }

    public a() {
        this(10);
    }

    public a(int i6) {
        this(ca.a.l(i6), 0, 0, false, null, null);
    }
}
