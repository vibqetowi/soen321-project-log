package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class m4<E> extends h2<E> implements RandomAccess {

    /* renamed from: x  reason: collision with root package name */
    public static final m4<Object> f7592x;

    /* renamed from: v  reason: collision with root package name */
    public E[] f7593v;

    /* renamed from: w  reason: collision with root package name */
    public int f7594w;

    static {
        m4<Object> m4Var = new m4<>(0, new Object[0]);
        f7592x = m4Var;
        m4Var.f7545u = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m4(int i6, Object[] objArr) {
        this.f7593v = objArr;
        this.f7594w = i6;
    }

    @Override // com.google.android.gms.internal.cast.j3
    public final /* bridge */ /* synthetic */ j3 D(int i6) {
        if (i6 >= this.f7594w) {
            return new m4(this.f7594w, Arrays.copyOf(this.f7593v, i6));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, E e10) {
        int i10;
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f7594w)) {
            E[] eArr = this.f7593v;
            if (i10 < eArr.length) {
                System.arraycopy(eArr, i6, eArr, i6 + 1, i10 - i6);
            } else {
                E[] eArr2 = (E[]) new Object[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i6);
                System.arraycopy(this.f7593v, i6, eArr2, i6 + 1, this.f7594w - i6);
                this.f7593v = eArr2;
            }
            this.f7593v[i6] = e10;
            this.f7594w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m(i6));
    }

    public final void g(int i6) {
        if (i6 >= 0 && i6 < this.f7594w) {
            return;
        }
        throw new IndexOutOfBoundsException(m(i6));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i6) {
        g(i6);
        return this.f7593v[i6];
    }

    public final String m(int i6) {
        int i10 = this.f7594w;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i6);
        sb2.append(", Size:");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractList, java.util.List
    public final E remove(int i6) {
        int i10;
        e();
        g(i6);
        E[] eArr = this.f7593v;
        E e10 = eArr[i6];
        if (i6 < this.f7594w - 1) {
            System.arraycopy(eArr, i6 + 1, eArr, i6, (i10 - i6) - 1);
        }
        this.f7594w--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i6, E e10) {
        e();
        g(i6);
        E[] eArr = this.f7593v;
        E e11 = eArr[i6];
        eArr[i6] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7594w;
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        e();
        int i6 = this.f7594w;
        E[] eArr = this.f7593v;
        if (i6 == eArr.length) {
            this.f7593v = (E[]) Arrays.copyOf(eArr, ((i6 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f7593v;
        int i10 = this.f7594w;
        this.f7594w = i10 + 1;
        eArr2[i10] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }
}
