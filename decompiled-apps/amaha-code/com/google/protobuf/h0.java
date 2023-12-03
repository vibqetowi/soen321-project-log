package com.google.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: LongArrayList.java */
/* loaded from: classes.dex */
public final class h0 extends c<Long> implements RandomAccess, a1 {

    /* renamed from: v  reason: collision with root package name */
    public long[] f9931v;

    /* renamed from: w  reason: collision with root package name */
    public int f9932w;

    static {
        new h0(new long[0], 0).f9890u = false;
    }

    public h0() {
        this(new long[10], 0);
    }

    @Override // com.google.protobuf.y.d
    public final y.d A(int i6) {
        if (i6 >= this.f9932w) {
            return new h0(Arrays.copyOf(this.f9931v, i6), this.f9932w);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f9932w)) {
            long[] jArr = this.f9931v;
            if (i10 < jArr.length) {
                System.arraycopy(jArr, i6, jArr, i6 + 1, i10 - i6);
            } else {
                long[] jArr2 = new long[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i6);
                System.arraycopy(this.f9931v, i6, jArr2, i6 + 1, this.f9932w - i6);
                this.f9931v = jArr2;
            }
            this.f9931v[i6] = longValue;
            this.f9932w++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f9932w);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        e();
        Charset charset = y.f10086a;
        collection.getClass();
        if (!(collection instanceof h0)) {
            return super.addAll(collection);
        }
        h0 h0Var = (h0) collection;
        int i6 = h0Var.f9932w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f9932w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            long[] jArr = this.f9931v;
            if (i11 > jArr.length) {
                this.f9931v = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(h0Var.f9931v, 0, this.f9931v, this.f9932w, h0Var.f9932w);
            this.f9932w = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        if (this.f9932w != h0Var.f9932w) {
            return false;
        }
        long[] jArr = h0Var.f9931v;
        for (int i6 = 0; i6 < this.f9932w; i6++) {
            if (this.f9931v[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j10) {
        e();
        int i6 = this.f9932w;
        long[] jArr = this.f9931v;
        if (i6 == jArr.length) {
            long[] jArr2 = new long[pl.a.b(i6, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i6);
            this.f9931v = jArr2;
        }
        long[] jArr3 = this.f9931v;
        int i10 = this.f9932w;
        this.f9932w = i10 + 1;
        jArr3[i10] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        m(i6);
        return Long.valueOf(this.f9931v[i6]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f9932w; i10++) {
            i6 = (i6 * 31) + y.a(this.f9931v[i10]);
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i6 = this.f9932w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f9931v[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f9932w) {
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f9932w);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        int i10;
        e();
        m(i6);
        long[] jArr = this.f9931v;
        long j10 = jArr[i6];
        if (i6 < this.f9932w - 1) {
            System.arraycopy(jArr, i6 + 1, jArr, i6, (i10 - i6) - 1);
        }
        this.f9932w--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            long[] jArr = this.f9931v;
            System.arraycopy(jArr, i10, jArr, i6, this.f9932w - i10);
            this.f9932w -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        long longValue = ((Long) obj).longValue();
        e();
        m(i6);
        long[] jArr = this.f9931v;
        long j10 = jArr[i6];
        jArr[i6] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9932w;
    }

    public h0(long[] jArr, int i6) {
        this.f9931v = jArr;
        this.f9932w = i6;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
