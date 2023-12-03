package com.google.protobuf;

import com.google.protobuf.y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* compiled from: ProtobufArrayList.java */
/* loaded from: classes.dex */
public final class c1<E> extends c<E> implements RandomAccess {

    /* renamed from: x  reason: collision with root package name */
    public static final c1<Object> f9893x;

    /* renamed from: v  reason: collision with root package name */
    public E[] f9894v;

    /* renamed from: w  reason: collision with root package name */
    public int f9895w;

    static {
        c1<Object> c1Var = new c1<>(0, new Object[0]);
        f9893x = c1Var;
        c1Var.f9890u = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c1(int i6, Object[] objArr) {
        this.f9894v = objArr;
        this.f9895w = i6;
    }

    @Override // com.google.protobuf.y.d
    public final y.d A(int i6) {
        if (i6 >= this.f9895w) {
            return new c1(this.f9895w, Arrays.copyOf(this.f9894v, i6));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        e();
        int i6 = this.f9895w;
        E[] eArr = this.f9894v;
        if (i6 == eArr.length) {
            this.f9894v = (E[]) Arrays.copyOf(eArr, ((i6 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f9894v;
        int i10 = this.f9895w;
        this.f9895w = i10 + 1;
        eArr2[i10] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void g(int i6) {
        if (i6 >= 0 && i6 < this.f9895w) {
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f9895w);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i6) {
        g(i6);
        return this.f9894v[i6];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final E remove(int i6) {
        int i10;
        e();
        g(i6);
        E[] eArr = this.f9894v;
        E e10 = eArr[i6];
        if (i6 < this.f9895w - 1) {
            System.arraycopy(eArr, i6 + 1, eArr, i6, (i10 - i6) - 1);
        }
        this.f9895w--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i6, E e10) {
        e();
        g(i6);
        E[] eArr = this.f9894v;
        E e11 = eArr[i6];
        eArr[i6] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9895w;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, E e10) {
        int i10;
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f9895w)) {
            E[] eArr = this.f9894v;
            if (i10 < eArr.length) {
                System.arraycopy(eArr, i6, eArr, i6 + 1, i10 - i6);
            } else {
                E[] eArr2 = (E[]) new Object[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i6);
                System.arraycopy(this.f9894v, i6, eArr2, i6 + 1, this.f9895w - i6);
                this.f9894v = eArr2;
            }
            this.f9894v[i6] = e10;
            this.f9895w++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f9895w);
        throw new IndexOutOfBoundsException(u10.toString());
    }
}
