package com.google.common.collect;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.common.collect.s;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: ImmutableCollection.java */
/* loaded from: classes.dex */
public abstract class q<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public static final Object[] f9436u = new Object[0];

    /* compiled from: ImmutableCollection.java */
    /* loaded from: classes.dex */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f9437a;

        /* renamed from: b  reason: collision with root package name */
        public int f9438b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9439c;

        public a() {
            x.a(4, "initialCapacity");
            this.f9437a = new Object[4];
            this.f9438b = 0;
        }
    }

    /* compiled from: ImmutableCollection.java */
    /* loaded from: classes.dex */
    public static abstract class b<E> {
        public static int a(int i6, int i10) {
            if (i10 >= 0) {
                int i11 = i6 + (i6 >> 1) + 1;
                if (i11 < i10) {
                    i11 = Integer.highestOneBit(i10 - 1) << 1;
                }
                if (i11 < 0) {
                    return SubsamplingScaleImageView.TILE_SIZE_AUTO;
                }
                return i11;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public s<E> e() {
        if (isEmpty()) {
            s.b bVar = s.f9446v;
            return l0.f9412y;
        }
        Object[] array = toArray();
        s.b bVar2 = s.f9446v;
        return s.t(array.length, array);
    }

    public int g(Object[] objArr) {
        v0<E> it = iterator();
        int i6 = 0;
        while (it.hasNext()) {
            objArr[i6] = it.next();
            i6++;
        }
        return i6;
    }

    public Object[] m() {
        return null;
    }

    public int o() {
        throw new UnsupportedOperationException();
    }

    public int q() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean r();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: s */
    public abstract v0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f9436u);
    }

    Object writeReplace() {
        return new s.c(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] m10 = m();
            if (m10 != null) {
                return (T[]) Arrays.copyOfRange(m10, q(), o(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        g(tArr);
        return tArr;
    }
}
