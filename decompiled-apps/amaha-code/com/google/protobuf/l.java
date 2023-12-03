package com.google.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: DoubleArrayList.java */
/* loaded from: classes.dex */
public final class l extends c<Double> implements RandomAccess, a1 {

    /* renamed from: v  reason: collision with root package name */
    public double[] f9997v;

    /* renamed from: w  reason: collision with root package name */
    public int f9998w;

    static {
        new l(0, new double[0]).f9890u = false;
    }

    public l() {
        this(0, new double[10]);
    }

    @Override // com.google.protobuf.y.d
    public final y.d A(int i6) {
        if (i6 >= this.f9998w) {
            return new l(this.f9998w, Arrays.copyOf(this.f9997v, i6));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f9998w)) {
            double[] dArr = this.f9997v;
            if (i10 < dArr.length) {
                System.arraycopy(dArr, i6, dArr, i6 + 1, i10 - i6);
            } else {
                double[] dArr2 = new double[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i6);
                System.arraycopy(this.f9997v, i6, dArr2, i6 + 1, this.f9998w - i6);
                this.f9997v = dArr2;
            }
            this.f9997v[i6] = doubleValue;
            this.f9998w++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f9998w);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        e();
        Charset charset = y.f10086a;
        collection.getClass();
        if (!(collection instanceof l)) {
            return super.addAll(collection);
        }
        l lVar = (l) collection;
        int i6 = lVar.f9998w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f9998w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            double[] dArr = this.f9997v;
            if (i11 > dArr.length) {
                this.f9997v = Arrays.copyOf(dArr, i11);
            }
            System.arraycopy(lVar.f9997v, 0, this.f9997v, this.f9998w, lVar.f9998w);
            this.f9998w = i11;
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
        if (!(obj instanceof l)) {
            return super.equals(obj);
        }
        l lVar = (l) obj;
        if (this.f9998w != lVar.f9998w) {
            return false;
        }
        double[] dArr = lVar.f9997v;
        for (int i6 = 0; i6 < this.f9998w; i6++) {
            if (Double.doubleToLongBits(this.f9997v[i6]) != Double.doubleToLongBits(dArr[i6])) {
                return false;
            }
        }
        return true;
    }

    public final void g(double d10) {
        e();
        int i6 = this.f9998w;
        double[] dArr = this.f9997v;
        if (i6 == dArr.length) {
            double[] dArr2 = new double[pl.a.b(i6, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i6);
            this.f9997v = dArr2;
        }
        double[] dArr3 = this.f9997v;
        int i10 = this.f9998w;
        this.f9998w = i10 + 1;
        dArr3[i10] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        m(i6);
        return Double.valueOf(this.f9997v[i6]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f9998w; i10++) {
            i6 = (i6 * 31) + y.a(Double.doubleToLongBits(this.f9997v[i10]));
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i6 = this.f9998w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f9997v[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f9998w) {
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f9998w);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        int i10;
        e();
        m(i6);
        double[] dArr = this.f9997v;
        double d10 = dArr[i6];
        if (i6 < this.f9998w - 1) {
            System.arraycopy(dArr, i6 + 1, dArr, i6, (i10 - i6) - 1);
        }
        this.f9998w--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            double[] dArr = this.f9997v;
            System.arraycopy(dArr, i10, dArr, i6, this.f9998w - i10);
            this.f9998w -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        e();
        m(i6);
        double[] dArr = this.f9997v;
        double d10 = dArr[i6];
        dArr[i6] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9998w;
    }

    public l(int i6, double[] dArr) {
        this.f9997v = dArr;
        this.f9998w = i6;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
