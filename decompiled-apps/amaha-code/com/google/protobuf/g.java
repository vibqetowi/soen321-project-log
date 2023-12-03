package com.google.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: BooleanArrayList.java */
/* loaded from: classes.dex */
public final class g extends c<Boolean> implements RandomAccess, a1 {

    /* renamed from: v  reason: collision with root package name */
    public boolean[] f9917v;

    /* renamed from: w  reason: collision with root package name */
    public int f9918w;

    static {
        new g(new boolean[0], 0).f9890u = false;
    }

    public g() {
        this(new boolean[10], 0);
    }

    @Override // com.google.protobuf.y.d
    public final y.d A(int i6) {
        if (i6 >= this.f9918w) {
            return new g(Arrays.copyOf(this.f9917v, i6), this.f9918w);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f9918w)) {
            boolean[] zArr = this.f9917v;
            if (i10 < zArr.length) {
                System.arraycopy(zArr, i6, zArr, i6 + 1, i10 - i6);
            } else {
                boolean[] zArr2 = new boolean[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i6);
                System.arraycopy(this.f9917v, i6, zArr2, i6 + 1, this.f9918w - i6);
                this.f9917v = zArr2;
            }
            this.f9917v[i6] = booleanValue;
            this.f9918w++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f9918w);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        e();
        Charset charset = y.f10086a;
        collection.getClass();
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i6 = gVar.f9918w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f9918w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            boolean[] zArr = this.f9917v;
            if (i11 > zArr.length) {
                this.f9917v = Arrays.copyOf(zArr, i11);
            }
            System.arraycopy(gVar.f9917v, 0, this.f9917v, this.f9918w, gVar.f9918w);
            this.f9918w = i11;
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
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f9918w != gVar.f9918w) {
            return false;
        }
        boolean[] zArr = gVar.f9917v;
        for (int i6 = 0; i6 < this.f9918w; i6++) {
            if (this.f9917v[i6] != zArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(boolean z10) {
        e();
        int i6 = this.f9918w;
        boolean[] zArr = this.f9917v;
        if (i6 == zArr.length) {
            boolean[] zArr2 = new boolean[pl.a.b(i6, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i6);
            this.f9917v = zArr2;
        }
        boolean[] zArr3 = this.f9917v;
        int i10 = this.f9918w;
        this.f9918w = i10 + 1;
        zArr3[i10] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        m(i6);
        return Boolean.valueOf(this.f9917v[i6]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6;
        int i10 = 1;
        for (int i11 = 0; i11 < this.f9918w; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f9917v[i11];
            Charset charset = y.f10086a;
            if (z10) {
                i6 = 1231;
            } else {
                i6 = 1237;
            }
            i10 = i12 + i6;
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i6 = this.f9918w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f9917v[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f9918w) {
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f9918w);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        int i10;
        e();
        m(i6);
        boolean[] zArr = this.f9917v;
        boolean z10 = zArr[i6];
        if (i6 < this.f9918w - 1) {
            System.arraycopy(zArr, i6 + 1, zArr, i6, (i10 - i6) - 1);
        }
        this.f9918w--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            boolean[] zArr = this.f9917v;
            System.arraycopy(zArr, i10, zArr, i6, this.f9918w - i10);
            this.f9918w -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        m(i6);
        boolean[] zArr = this.f9917v;
        boolean z10 = zArr[i6];
        zArr[i6] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9918w;
    }

    public g(boolean[] zArr, int i6) {
        this.f9917v = zArr;
        this.f9918w = i6;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g(((Boolean) obj).booleanValue());
        return true;
    }
}
