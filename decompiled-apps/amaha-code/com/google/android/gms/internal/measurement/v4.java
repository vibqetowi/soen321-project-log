package com.google.android.gms.internal.measurement;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class v4 extends s4 implements RandomAccess, c7 {

    /* renamed from: v  reason: collision with root package name */
    public boolean[] f8632v;

    /* renamed from: w  reason: collision with root package name */
    public int f8633w;

    static {
        new v4(new boolean[0], 0).f8591u = false;
    }

    public v4() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f8633w)) {
            boolean[] zArr = this.f8632v;
            if (i10 < zArr.length) {
                System.arraycopy(zArr, i6, zArr, i6 + 1, i10 - i6);
            } else {
                boolean[] zArr2 = new boolean[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i6);
                System.arraycopy(this.f8632v, i6, zArr2, i6 + 1, this.f8633w - i6);
                this.f8632v = zArr2;
            }
            this.f8632v[i6] = booleanValue;
            this.f8633w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8633w));
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = c6.f8318a;
        collection.getClass();
        if (!(collection instanceof v4)) {
            return super.addAll(collection);
        }
        v4 v4Var = (v4) collection;
        int i6 = v4Var.f8633w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f8633w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            boolean[] zArr = this.f8632v;
            if (i11 > zArr.length) {
                this.f8632v = Arrays.copyOf(zArr, i11);
            }
            System.arraycopy(v4Var.f8632v, 0, this.f8632v, this.f8633w, v4Var.f8633w);
            this.f8633w = i11;
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
        if (!(obj instanceof v4)) {
            return super.equals(obj);
        }
        v4 v4Var = (v4) obj;
        if (this.f8633w != v4Var.f8633w) {
            return false;
        }
        boolean[] zArr = v4Var.f8632v;
        for (int i6 = 0; i6 < this.f8633w; i6++) {
            if (this.f8632v[i6] != zArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(boolean z10) {
        e();
        int i6 = this.f8633w;
        boolean[] zArr = this.f8632v;
        if (i6 == zArr.length) {
            boolean[] zArr2 = new boolean[pl.a.b(i6, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i6);
            this.f8632v = zArr2;
        }
        boolean[] zArr3 = this.f8632v;
        int i10 = this.f8633w;
        this.f8633w = i10 + 1;
        zArr3[i10] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        m(i6);
        return Boolean.valueOf(this.f8632v[i6]);
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6;
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8633w; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f8632v[i11];
            Charset charset = c6.f8318a;
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
        int i6 = this.f8633w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f8632v[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final /* bridge */ /* synthetic */ b6 k(int i6) {
        if (i6 >= this.f8633w) {
            return new v4(Arrays.copyOf(this.f8632v, i6), this.f8633w);
        }
        throw new IllegalArgumentException();
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f8633w) {
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8633w));
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        int i10;
        e();
        m(i6);
        boolean[] zArr = this.f8632v;
        boolean z10 = zArr[i6];
        if (i6 < this.f8633w - 1) {
            System.arraycopy(zArr, i6 + 1, zArr, i6, (i10 - i6) - 1);
        }
        this.f8633w--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            boolean[] zArr = this.f8632v;
            System.arraycopy(zArr, i10, zArr, i6, this.f8633w - i10);
            this.f8633w -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        m(i6);
        boolean[] zArr = this.f8632v;
        boolean z10 = zArr[i6];
        zArr[i6] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8633w;
    }

    public v4(boolean[] zArr, int i6) {
        this.f8632v = zArr;
        this.f8633w = i6;
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Boolean) obj).booleanValue());
        return true;
    }
}
