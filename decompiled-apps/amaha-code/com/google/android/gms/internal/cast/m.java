package com.google.android.gms.internal.cast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public abstract class m<E> extends j<E> implements List<E>, RandomAccess {

    /* renamed from: v  reason: collision with root package name */
    public static final k f7588v = new k(p.f7614y, 0);

    @Override // java.util.List
    @Deprecated
    public final void add(int i6, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i6, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@NullableDecl Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@NullableDecl Object obj) {
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
                        E e10 = get(i6);
                        Object obj2 = list.get(i6);
                        if (e10 != obj2 && (e10 == null || !e10.equals(obj2))) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                        }
                    }
                    return true;
                }
                k listIterator = listIterator(0);
                Iterator<E> it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = listIterator.next();
                        E next2 = it.next();
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
    public final int indexOf(@NullableDecl Object obj) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@NullableDecl Object obj) {
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
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.j
    public int o(Object[] objArr) {
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            objArr[i6] = get(i6);
        }
        return size;
    }

    @Override // java.util.List
    /* renamed from: q */
    public m<E> subList(int i6, int i10) {
        g.e(i6, i10, size());
        int i11 = i10 - i6;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return p.f7614y;
        }
        return new l(this, i6, i11);
    }

    @Override // java.util.List
    /* renamed from: r */
    public final k listIterator(int i6) {
        g.d(i6, size());
        if (isEmpty()) {
            return f7588v;
        }
        return new k(this, i6);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i6, E e10) {
        throw new UnsupportedOperationException();
    }
}
