package is;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ArrayDeque.kt */
/* loaded from: classes2.dex */
public final class g<E> extends d<E> {

    /* renamed from: x  reason: collision with root package name */
    public static final Object[] f20652x = new Object[0];

    /* renamed from: u  reason: collision with root package name */
    public int f20653u;

    /* renamed from: v  reason: collision with root package name */
    public Object[] f20654v;

    /* renamed from: w  reason: collision with root package name */
    public int f20655w;

    public g(int i6) {
        Object[] objArr;
        if (i6 == 0) {
            objArr = f20652x;
        } else if (i6 > 0) {
            objArr = new Object[i6];
        } else {
            throw new IllegalArgumentException(defpackage.c.p("Illegal Capacity: ", i6));
        }
        this.f20654v = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, E e10) {
        int i10 = this.f20655w;
        if (i6 < 0 || i6 > i10) {
            throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", i10));
        }
        if (i6 == i10) {
            addLast(e10);
        } else if (i6 == 0) {
            addFirst(e10);
        } else {
            q(i10 + 1);
            int t3 = t(this.f20653u + i6);
            int i11 = this.f20655w;
            if (i6 < ((i11 + 1) >> 1)) {
                if (t3 == 0) {
                    Object[] objArr = this.f20654v;
                    kotlin.jvm.internal.i.g(objArr, "<this>");
                    t3 = objArr.length;
                }
                int i12 = t3 - 1;
                int i13 = this.f20653u;
                if (i13 == 0) {
                    Object[] objArr2 = this.f20654v;
                    kotlin.jvm.internal.i.g(objArr2, "<this>");
                    i13 = objArr2.length;
                }
                int i14 = i13 - 1;
                int i15 = this.f20653u;
                if (i12 >= i15) {
                    Object[] objArr3 = this.f20654v;
                    objArr3[i14] = objArr3[i15];
                    i.J1(i15, i15 + 1, i12 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f20654v;
                    i.J1(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f20654v;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    i.J1(0, 1, i12 + 1, objArr5, objArr5);
                }
                this.f20654v[i12] = e10;
                this.f20653u = i14;
            } else {
                int t10 = t(i11 + this.f20653u);
                if (t3 < t10) {
                    Object[] objArr6 = this.f20654v;
                    i.J1(t3 + 1, t3, t10, objArr6, objArr6);
                } else {
                    Object[] objArr7 = this.f20654v;
                    i.J1(1, 0, t10, objArr7, objArr7);
                    Object[] objArr8 = this.f20654v;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    i.J1(t3 + 1, t3, objArr8.length - 1, objArr8, objArr8);
                }
                this.f20654v[t3] = e10;
            }
            this.f20655w++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection<? extends E> elements) {
        kotlin.jvm.internal.i.g(elements, "elements");
        int i10 = this.f20655w;
        if (i6 >= 0 && i6 <= i10) {
            if (elements.isEmpty()) {
                return false;
            }
            int i11 = this.f20655w;
            if (i6 == i11) {
                return addAll(elements);
            }
            q(elements.size() + i11);
            int t3 = t(this.f20655w + this.f20653u);
            int t10 = t(this.f20653u + i6);
            int size = elements.size();
            if (i6 < ((this.f20655w + 1) >> 1)) {
                int i12 = this.f20653u;
                int i13 = i12 - size;
                if (t10 < i12) {
                    Object[] objArr = this.f20654v;
                    i.J1(i13, i12, objArr.length, objArr, objArr);
                    if (size >= t10) {
                        Object[] objArr2 = this.f20654v;
                        i.J1(objArr2.length - size, 0, t10, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f20654v;
                        i.J1(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f20654v;
                        i.J1(0, size, t10, objArr4, objArr4);
                    }
                } else if (i13 >= 0) {
                    Object[] objArr5 = this.f20654v;
                    i.J1(i13, i12, t10, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f20654v;
                    i13 += objArr6.length;
                    int i14 = t10 - i12;
                    int length = objArr6.length - i13;
                    if (length >= i14) {
                        i.J1(i13, i12, t10, objArr6, objArr6);
                    } else {
                        i.J1(i13, i12, i12 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f20654v;
                        i.J1(0, this.f20653u + length, t10, objArr7, objArr7);
                    }
                }
                this.f20653u = i13;
                int i15 = t10 - size;
                if (i15 < 0) {
                    i15 += this.f20654v.length;
                }
                o(i15, elements);
            } else {
                int i16 = t10 + size;
                if (t10 < t3) {
                    int i17 = size + t3;
                    Object[] objArr8 = this.f20654v;
                    if (i17 <= objArr8.length) {
                        i.J1(i16, t10, t3, objArr8, objArr8);
                    } else if (i16 >= objArr8.length) {
                        i.J1(i16 - objArr8.length, t10, t3, objArr8, objArr8);
                    } else {
                        int length2 = t3 - (i17 - objArr8.length);
                        i.J1(0, length2, t3, objArr8, objArr8);
                        Object[] objArr9 = this.f20654v;
                        i.J1(i16, t10, length2, objArr9, objArr9);
                    }
                } else {
                    Object[] objArr10 = this.f20654v;
                    i.J1(size, 0, t3, objArr10, objArr10);
                    Object[] objArr11 = this.f20654v;
                    if (i16 >= objArr11.length) {
                        i.J1(i16 - objArr11.length, t10, objArr11.length, objArr11, objArr11);
                    } else {
                        i.J1(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                        Object[] objArr12 = this.f20654v;
                        i.J1(i16, t10, objArr12.length - size, objArr12, objArr12);
                    }
                }
                o(t10, elements);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", i10));
    }

    public final void addFirst(E e10) {
        q(this.f20655w + 1);
        int i6 = this.f20653u;
        if (i6 == 0) {
            Object[] objArr = this.f20654v;
            kotlin.jvm.internal.i.g(objArr, "<this>");
            i6 = objArr.length;
        }
        int i10 = i6 - 1;
        this.f20653u = i10;
        this.f20654v[i10] = e10;
        this.f20655w++;
    }

    public final void addLast(E e10) {
        q(g() + 1);
        this.f20654v[t(g() + this.f20653u)] = e10;
        this.f20655w = g() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int t3 = t(this.f20655w + this.f20653u);
        int i6 = this.f20653u;
        if (i6 < t3) {
            i.M1(this.f20654v, i6, t3);
        } else if (!isEmpty()) {
            Object[] objArr = this.f20654v;
            i.M1(objArr, this.f20653u, objArr.length);
            i.M1(this.f20654v, 0, t3);
        }
        this.f20653u = 0;
        this.f20655w = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.f20654v[this.f20653u];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // is.d
    public final int g() {
        return this.f20655w;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i6) {
        int g5 = g();
        if (i6 >= 0 && i6 < g5) {
            return (E) this.f20654v[t(this.f20653u + i6)];
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", g5));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i6;
        int t3 = t(g() + this.f20653u);
        int i10 = this.f20653u;
        if (i10 < t3) {
            while (i10 < t3) {
                if (kotlin.jvm.internal.i.b(obj, this.f20654v[i10])) {
                    i6 = this.f20653u;
                } else {
                    i10++;
                }
            }
            return -1;
        } else if (i10 >= t3) {
            int length = this.f20654v.length;
            while (true) {
                if (i10 < length) {
                    if (kotlin.jvm.internal.i.b(obj, this.f20654v[i10])) {
                        i6 = this.f20653u;
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < t3; i11++) {
                        if (kotlin.jvm.internal.i.b(obj, this.f20654v[i11])) {
                            i10 = i11 + this.f20654v.length;
                            i6 = this.f20653u;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i10 - i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (g() == 0) {
            return true;
        }
        return false;
    }

    public final E last() {
        if (!isEmpty()) {
            return (E) this.f20654v[t(ca.a.l0(this) + this.f20653u)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i6;
        int t3 = t(this.f20655w + this.f20653u);
        int i10 = this.f20653u;
        if (i10 < t3) {
            length = t3 - 1;
            if (i10 <= length) {
                while (!kotlin.jvm.internal.i.b(obj, this.f20654v[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i6 = this.f20653u;
                return length - i6;
            }
            return -1;
        }
        if (i10 > t3) {
            int i11 = t3 - 1;
            while (true) {
                if (-1 < i11) {
                    if (kotlin.jvm.internal.i.b(obj, this.f20654v[i11])) {
                        length = i11 + this.f20654v.length;
                        i6 = this.f20653u;
                        break;
                    }
                    i11--;
                } else {
                    Object[] objArr = this.f20654v;
                    kotlin.jvm.internal.i.g(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f20653u;
                    if (i12 <= length) {
                        while (!kotlin.jvm.internal.i.b(obj, this.f20654v[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i6 = this.f20653u;
                    }
                }
            }
        }
        return -1;
    }

    @Override // is.d
    public final E m(int i6) {
        int i10 = this.f20655w;
        if (i6 >= 0 && i6 < i10) {
            if (i6 == ca.a.l0(this)) {
                return removeLast();
            }
            if (i6 == 0) {
                return removeFirst();
            }
            int t3 = t(this.f20653u + i6);
            Object[] objArr = this.f20654v;
            E e10 = (E) objArr[t3];
            if (i6 < (this.f20655w >> 1)) {
                int i11 = this.f20653u;
                if (t3 >= i11) {
                    i.J1(i11 + 1, i11, t3, objArr, objArr);
                } else {
                    i.J1(1, 0, t3, objArr, objArr);
                    Object[] objArr2 = this.f20654v;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i12 = this.f20653u;
                    i.J1(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f20654v;
                int i13 = this.f20653u;
                objArr3[i13] = null;
                this.f20653u = r(i13);
            } else {
                int t10 = t(ca.a.l0(this) + this.f20653u);
                if (t3 <= t10) {
                    Object[] objArr4 = this.f20654v;
                    i.J1(t3, t3 + 1, t10 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f20654v;
                    i.J1(t3, t3 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f20654v;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    i.J1(0, 1, t10 + 1, objArr6, objArr6);
                }
                this.f20654v[t10] = null;
            }
            this.f20655w--;
            return e10;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", i10));
    }

    public final void o(int i6, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f20654v.length;
        while (i6 < length && it.hasNext()) {
            this.f20654v[i6] = it.next();
            i6++;
        }
        int i10 = this.f20653u;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f20654v[i11] = it.next();
        }
        this.f20655w = collection.size() + g();
    }

    public final void q(int i6) {
        if (i6 >= 0) {
            Object[] objArr = this.f20654v;
            if (i6 <= objArr.length) {
                return;
            }
            if (objArr == f20652x) {
                if (i6 < 10) {
                    i6 = 10;
                }
                this.f20654v = new Object[i6];
                return;
            }
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i6 < 0) {
                i10 = i6;
            }
            if (i10 - 2147483639 > 0) {
                if (i6 > 2147483639) {
                    i10 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                } else {
                    i10 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i10];
            i.J1(0, this.f20653u, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f20654v;
            int length2 = objArr3.length;
            int i11 = this.f20653u;
            i.J1(length2 - i11, 0, i11, objArr3, objArr2);
            this.f20653u = 0;
            this.f20654v = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int r(int i6) {
        Object[] objArr = this.f20654v;
        kotlin.jvm.internal.i.g(objArr, "<this>");
        if (i6 == objArr.length - 1) {
            return 0;
        }
        return i6 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        m(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> elements) {
        boolean z10;
        int t3;
        kotlin.jvm.internal.i.g(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty()) {
            if (this.f20654v.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int t10 = t(this.f20655w + this.f20653u);
                int i6 = this.f20653u;
                if (i6 < t10) {
                    t3 = i6;
                    while (i6 < t10) {
                        Object obj = this.f20654v[i6];
                        if (!elements.contains(obj)) {
                            this.f20654v[t3] = obj;
                            t3++;
                        } else {
                            z11 = true;
                        }
                        i6++;
                    }
                    i.M1(this.f20654v, t3, t10);
                } else {
                    int length = this.f20654v.length;
                    int i10 = i6;
                    boolean z12 = false;
                    while (i6 < length) {
                        Object[] objArr = this.f20654v;
                        Object obj2 = objArr[i6];
                        objArr[i6] = null;
                        if (!elements.contains(obj2)) {
                            this.f20654v[i10] = obj2;
                            i10++;
                        } else {
                            z12 = true;
                        }
                        i6++;
                    }
                    t3 = t(i10);
                    for (int i11 = 0; i11 < t10; i11++) {
                        Object[] objArr2 = this.f20654v;
                        Object obj3 = objArr2[i11];
                        objArr2[i11] = null;
                        if (!elements.contains(obj3)) {
                            this.f20654v[t3] = obj3;
                            t3 = r(t3);
                        } else {
                            z12 = true;
                        }
                    }
                    z11 = z12;
                }
                if (z11) {
                    int i12 = t3 - this.f20653u;
                    if (i12 < 0) {
                        i12 += this.f20654v.length;
                    }
                    this.f20655w = i12;
                }
            }
        }
        return z11;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f20654v;
            int i6 = this.f20653u;
            E e10 = (E) objArr[i6];
            objArr[i6] = null;
            this.f20653u = r(i6);
            this.f20655w = g() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int t3 = t(ca.a.l0(this) + this.f20653u);
            Object[] objArr = this.f20654v;
            E e10 = (E) objArr[t3];
            objArr[t3] = null;
            this.f20655w = g() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> elements) {
        boolean z10;
        int t3;
        kotlin.jvm.internal.i.g(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty()) {
            if (this.f20654v.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int t10 = t(this.f20655w + this.f20653u);
                int i6 = this.f20653u;
                if (i6 < t10) {
                    t3 = i6;
                    while (i6 < t10) {
                        Object obj = this.f20654v[i6];
                        if (elements.contains(obj)) {
                            this.f20654v[t3] = obj;
                            t3++;
                        } else {
                            z11 = true;
                        }
                        i6++;
                    }
                    i.M1(this.f20654v, t3, t10);
                } else {
                    int length = this.f20654v.length;
                    int i10 = i6;
                    boolean z12 = false;
                    while (i6 < length) {
                        Object[] objArr = this.f20654v;
                        Object obj2 = objArr[i6];
                        objArr[i6] = null;
                        if (elements.contains(obj2)) {
                            this.f20654v[i10] = obj2;
                            i10++;
                        } else {
                            z12 = true;
                        }
                        i6++;
                    }
                    t3 = t(i10);
                    for (int i11 = 0; i11 < t10; i11++) {
                        Object[] objArr2 = this.f20654v;
                        Object obj3 = objArr2[i11];
                        objArr2[i11] = null;
                        if (elements.contains(obj3)) {
                            this.f20654v[t3] = obj3;
                            t3 = r(t3);
                        } else {
                            z12 = true;
                        }
                    }
                    z11 = z12;
                }
                if (z11) {
                    int i12 = t3 - this.f20653u;
                    if (i12 < 0) {
                        i12 += this.f20654v.length;
                    }
                    this.f20655w = i12;
                }
            }
        }
        return z11;
    }

    public final E s() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f20654v[t(ca.a.l0(this) + this.f20653u)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i6, E e10) {
        int g5 = g();
        if (i6 >= 0 && i6 < g5) {
            int t3 = t(this.f20653u + i6);
            Object[] objArr = this.f20654v;
            E e11 = (E) objArr[t3];
            objArr[t3] = e10;
            return e11;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", g5));
    }

    public final int t(int i6) {
        Object[] objArr = this.f20654v;
        if (i6 >= objArr.length) {
            return i6 - objArr.length;
        }
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[g()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.i.g(array, "array");
        int length = array.length;
        int i6 = this.f20655w;
        if (length < i6) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i6);
            kotlin.jvm.internal.i.e(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (T[]) ((Object[]) newInstance);
        }
        int t3 = t(this.f20655w + this.f20653u);
        int i10 = this.f20653u;
        if (i10 < t3) {
            i.K1(this.f20654v, array, 0, i10, t3, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f20654v;
            i.J1(0, this.f20653u, objArr.length, objArr, array);
            Object[] objArr2 = this.f20654v;
            i.J1(objArr2.length - this.f20653u, 0, t3, objArr2, array);
        }
        int length2 = array.length;
        int i11 = this.f20655w;
        if (length2 > i11) {
            array[i11] = null;
        }
        return array;
    }

    public g() {
        this.f20654v = f20652x;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.i.g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        q(elements.size() + g());
        o(t(g() + this.f20653u), elements);
        return true;
    }
}
