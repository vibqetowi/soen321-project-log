package com.google.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: IntArrayList.java */
/* loaded from: classes.dex */
public final class x extends c<Integer> implements y.c, RandomAccess, a1 {

    /* renamed from: x  reason: collision with root package name */
    public static final x f10081x;

    /* renamed from: v  reason: collision with root package name */
    public int[] f10082v;

    /* renamed from: w  reason: collision with root package name */
    public int f10083w;

    static {
        x xVar = new x(new int[0], 0);
        f10081x = xVar;
        xVar.f9890u = false;
    }

    public x() {
        this(new int[10], 0);
    }

    @Override // com.google.protobuf.y.d
    public final y.d<Integer> A(int i6) {
        if (i6 >= this.f10083w) {
            return new x(Arrays.copyOf(this.f10082v, i6), this.f10083w);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f10083w)) {
            int[] iArr = this.f10082v;
            if (i10 < iArr.length) {
                System.arraycopy(iArr, i6, iArr, i6 + 1, i10 - i6);
            } else {
                int[] iArr2 = new int[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i6);
                System.arraycopy(this.f10082v, i6, iArr2, i6 + 1, this.f10083w - i6);
                this.f10082v = iArr2;
            }
            this.f10082v[i6] = intValue;
            this.f10083w++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f10083w);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        e();
        Charset charset = y.f10086a;
        collection.getClass();
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i6 = xVar.f10083w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f10083w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            int[] iArr = this.f10082v;
            if (i11 > iArr.length) {
                this.f10082v = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(xVar.f10082v, 0, this.f10082v, this.f10083w, xVar.f10083w);
            this.f10083w = i11;
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
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f10083w != xVar.f10083w) {
            return false;
        }
        int[] iArr = xVar.f10082v;
        for (int i6 = 0; i6 < this.f10083w; i6++) {
            if (this.f10082v[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i6) {
        e();
        int i10 = this.f10083w;
        int[] iArr = this.f10082v;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[pl.a.b(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f10082v = iArr2;
        }
        int[] iArr3 = this.f10082v;
        int i11 = this.f10083w;
        this.f10083w = i11 + 1;
        iArr3[i11] = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return Integer.valueOf(o(i6));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f10083w; i10++) {
            i6 = (i6 * 31) + this.f10082v[i10];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i6 = this.f10083w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f10082v[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f10083w) {
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f10083w);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    public final int o(int i6) {
        m(i6);
        return this.f10082v[i6];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        int i10;
        e();
        m(i6);
        int[] iArr = this.f10082v;
        int i11 = iArr[i6];
        if (i6 < this.f10083w - 1) {
            System.arraycopy(iArr, i6 + 1, iArr, i6, (i10 - i6) - 1);
        }
        this.f10083w--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            int[] iArr = this.f10082v;
            System.arraycopy(iArr, i10, iArr, i6, this.f10083w - i10);
            this.f10083w -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        m(i6);
        int[] iArr = this.f10082v;
        int i10 = iArr[i6];
        iArr[i6] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10083w;
    }

    public x(int[] iArr, int i6) {
        this.f10082v = iArr;
        this.f10083w = i6;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
