package oa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public abstract class q extends n implements List, RandomAccess {

    /* renamed from: v  reason: collision with root package name */
    public static final o f27340v = new o(b.f27315y, 0);

    public static q v(ArrayList arrayList) {
        if (arrayList instanceof n) {
            q o10 = ((n) arrayList).o();
            if (o10.r()) {
                Object[] array = o10.toArray();
                int length = array.length;
                if (length == 0) {
                    return b.f27315y;
                }
                return new b(length, array);
            }
            return o10;
        }
        Object[] array2 = arrayList.toArray();
        int length2 = array2.length;
        for (int i6 = 0; i6 < length2; i6++) {
            if (array2[i6] == null) {
                throw new NullPointerException(defpackage.c.p("at index ", i6));
            }
        }
        if (length2 == 0) {
            return b.f27315y;
        }
        return new b(length2, array2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i6, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i6, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // oa.n
    public int e(Object[] objArr) {
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            objArr[i6] = get(i6);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i6 = 0; i6 < size; i6++) {
                        Object obj2 = get(i6);
                        Object obj3 = list.get(i6);
                        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                        }
                    }
                    return true;
                }
                o listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = listIterator.next();
                        Object next2 = it.next();
                        if (next != next2 && (next == null || !next.equals(next2))) {
                            z10 = false;
                            continue;
                        } else {
                            z10 = true;
                            continue;
                        }
                        if (!z10) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i6 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i6 = (i6 * 31) + get(i10).hashCode();
        }
        return i6;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (obj.equals(get(i6))) {
                return i6;
            }
        }
        return -1;
    }

    @Override // oa.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // oa.n
    public final o q() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i6, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: t */
    public q subList(int i6, int i10) {
        sc.b.s0(i6, i10, size());
        int i11 = i10 - i6;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return b.f27315y;
        }
        return new p(this, i6, i11);
    }

    @Override // java.util.List
    /* renamed from: z */
    public final o listIterator(int i6) {
        sc.b.q0(i6, size());
        if (isEmpty()) {
            return f27340v;
        }
        return new o(this, i6);
    }

    @Override // oa.n
    @Deprecated
    public final q o() {
        return this;
    }
}
