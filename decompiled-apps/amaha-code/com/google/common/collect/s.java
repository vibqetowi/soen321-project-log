package com.google.common.collect;

import com.google.common.collect.q;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: ImmutableList.java */
/* loaded from: classes.dex */
public abstract class s<E> extends q<E> implements List<E>, RandomAccess {

    /* renamed from: v  reason: collision with root package name */
    public static final b f9446v = new b(l0.f9412y, 0);

    /* compiled from: ImmutableList.java */
    /* loaded from: classes.dex */
    public static final class a<E> extends q.a<E> {
        public final void b(Object obj) {
            obj.getClass();
            int i6 = this.f9438b + 1;
            Object[] objArr = this.f9437a;
            if (objArr.length < i6) {
                this.f9437a = Arrays.copyOf(objArr, q.b.a(objArr.length, i6));
                this.f9439c = false;
            } else if (this.f9439c) {
                this.f9437a = (Object[]) objArr.clone();
                this.f9439c = false;
            }
            Object[] objArr2 = this.f9437a;
            int i10 = this.f9438b;
            this.f9438b = i10 + 1;
            objArr2[i10] = obj;
        }

        public final l0 c() {
            this.f9439c = true;
            return s.t(this.f9438b, this.f9437a);
        }
    }

    /* compiled from: ImmutableList.java */
    /* loaded from: classes.dex */
    public static class b<E> extends com.google.common.collect.a<E> {

        /* renamed from: w  reason: collision with root package name */
        public final s<E> f9447w;

        public b(s<E> sVar, int i6) {
            super(sVar.size(), i6);
            this.f9447w = sVar;
        }
    }

    /* compiled from: ImmutableList.java */
    /* loaded from: classes.dex */
    public static class c implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final Object[] f9448u;

        public c(Object[] objArr) {
            this.f9448u = objArr;
        }

        public Object readResolve() {
            return s.C(this.f9448u);
        }
    }

    /* compiled from: ImmutableList.java */
    /* loaded from: classes.dex */
    public class d extends s<E> {

        /* renamed from: w  reason: collision with root package name */
        public final transient int f9449w;

        /* renamed from: x  reason: collision with root package name */
        public final transient int f9450x;

        public d(int i6, int i10) {
            this.f9449w = i6;
            this.f9450x = i10;
        }

        @Override // com.google.common.collect.s, java.util.List
        /* renamed from: L */
        public final s<E> subList(int i6, int i10) {
            sc.b.y(i6, i10, this.f9450x);
            int i11 = this.f9449w;
            return s.this.subList(i6 + i11, i10 + i11);
        }

        @Override // java.util.List
        public final E get(int i6) {
            sc.b.u(i6, this.f9450x);
            return s.this.get(i6 + this.f9449w);
        }

        @Override // com.google.common.collect.s, com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.s, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.q
        public final Object[] m() {
            return s.this.m();
        }

        @Override // com.google.common.collect.q
        public final int o() {
            return s.this.q() + this.f9449w + this.f9450x;
        }

        @Override // com.google.common.collect.q
        public final int q() {
            return s.this.q() + this.f9449w;
        }

        @Override // com.google.common.collect.q
        public final boolean r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f9450x;
        }

        @Override // com.google.common.collect.s, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i6) {
            return listIterator(i6);
        }
    }

    public static l0 C(Object[] objArr) {
        if (objArr.length == 0) {
            return l0.f9412y;
        }
        return v((Object[]) objArr.clone());
    }

    public static l0 J(Long l2, Long l10, Long l11, Long l12, Long l13) {
        return v(l2, l10, l11, l12, l13);
    }

    public static l0 K(Object obj) {
        return v(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static l0 t(int i6, Object[] objArr) {
        if (i6 == 0) {
            return l0.f9412y;
        }
        return new l0(i6, objArr);
    }

    public static l0 v(Object... objArr) {
        int length = objArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (objArr[i6] == null) {
                throw new NullPointerException(defpackage.b.h(20, "at index ", i6));
            }
        }
        return t(objArr.length, objArr);
    }

    public static <E> s<E> z(Collection<? extends E> collection) {
        if (collection instanceof q) {
            s<E> e10 = ((q) collection).e();
            if (e10.r()) {
                Object[] array = e10.toArray();
                return t(array.length, array);
            }
            return e10;
        }
        return v(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: I */
    public final b listIterator(int i6) {
        sc.b.x(i6, size());
        if (isEmpty()) {
            return f9446v;
        }
        return new b(this, i6);
    }

    @Override // java.util.List
    /* renamed from: L */
    public s<E> subList(int i6, int i10) {
        sc.b.y(i6, i10, size());
        int i11 = i10 - i6;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return l0.f9412y;
        }
        return new d(i6, i11);
    }

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

    @Override // com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i6 = 0; i6 < size; i6++) {
                        if (f6.b.v0(get(i6), list.get(i6))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = list.iterator();
                for (E e10 : this) {
                    if (it.hasNext()) {
                        if (!f6.b.v0(e10, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    @Override // com.google.common.collect.q
    public int g(Object[] objArr) {
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            objArr[0 + i6] = get(i6);
        }
        return 0 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i6 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i6 = ~(~(get(i10).hashCode() + (i6 * 31)));
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

    @Override // com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
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
    @Deprecated
    public final E remove(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q
    public final v0<E> s() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i6, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q
    public Object writeReplace() {
        return new c(toArray());
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.q
    @Deprecated
    public final s<E> e() {
        return this;
    }
}
