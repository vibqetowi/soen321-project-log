package com.google.android.gms.internal.measurement;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class g5 extends s4 implements RandomAccess, c7 {

    /* renamed from: v  reason: collision with root package name */
    public double[] f8393v;

    /* renamed from: w  reason: collision with root package name */
    public int f8394w;

    static {
        new g5(0, new double[0]).f8591u = false;
    }

    public g5() {
        this(0, new double[10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f8394w)) {
            double[] dArr = this.f8393v;
            if (i10 < dArr.length) {
                System.arraycopy(dArr, i6, dArr, i6 + 1, i10 - i6);
            } else {
                double[] dArr2 = new double[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i6);
                System.arraycopy(this.f8393v, i6, dArr2, i6 + 1, this.f8394w - i6);
                this.f8393v = dArr2;
            }
            this.f8393v[i6] = doubleValue;
            this.f8394w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8394w));
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = c6.f8318a;
        collection.getClass();
        if (!(collection instanceof g5)) {
            return super.addAll(collection);
        }
        g5 g5Var = (g5) collection;
        int i6 = g5Var.f8394w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f8394w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            double[] dArr = this.f8393v;
            if (i11 > dArr.length) {
                this.f8393v = Arrays.copyOf(dArr, i11);
            }
            System.arraycopy(g5Var.f8393v, 0, this.f8393v, this.f8394w, g5Var.f8394w);
            this.f8394w = i11;
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

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return super.equals(obj);
        }
        g5 g5Var = (g5) obj;
        if (this.f8394w != g5Var.f8394w) {
            return false;
        }
        double[] dArr = g5Var.f8393v;
        for (int i6 = 0; i6 < this.f8394w; i6++) {
            if (Double.doubleToLongBits(this.f8393v[i6]) != Double.doubleToLongBits(dArr[i6])) {
                return false;
            }
        }
        return true;
    }

    public final void g(double d10) {
        e();
        int i6 = this.f8394w;
        double[] dArr = this.f8393v;
        if (i6 == dArr.length) {
            double[] dArr2 = new double[pl.a.b(i6, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i6);
            this.f8393v = dArr2;
        }
        double[] dArr3 = this.f8393v;
        int i10 = this.f8394w;
        this.f8394w = i10 + 1;
        dArr3[i10] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        m(i6);
        return Double.valueOf(this.f8393v[i6]);
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f8394w; i10++) {
            i6 = (i6 * 31) + c6.a(Double.doubleToLongBits(this.f8393v[i10]));
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i6 = this.f8394w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f8393v[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final /* bridge */ /* synthetic */ b6 k(int i6) {
        if (i6 >= this.f8394w) {
            return new g5(this.f8394w, Arrays.copyOf(this.f8393v, i6));
        }
        throw new IllegalArgumentException();
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f8394w) {
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8394w));
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        int i10;
        e();
        m(i6);
        double[] dArr = this.f8393v;
        double d10 = dArr[i6];
        if (i6 < this.f8394w - 1) {
            System.arraycopy(dArr, i6 + 1, dArr, i6, (i10 - i6) - 1);
        }
        this.f8394w--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            double[] dArr = this.f8393v;
            System.arraycopy(dArr, i10, dArr, i6, this.f8394w - i10);
            this.f8394w -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        e();
        m(i6);
        double[] dArr = this.f8393v;
        double d10 = dArr[i6];
        dArr[i6] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8394w;
    }

    public g5(int i6, double[] dArr) {
        this.f8393v = dArr;
        this.f8394w = i6;
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
