package com.google.android.gms.internal.measurement;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class x5 extends s4 implements RandomAccess, z5, c7 {

    /* renamed from: x  reason: collision with root package name */
    public static final x5 f8687x;

    /* renamed from: v  reason: collision with root package name */
    public int[] f8688v;

    /* renamed from: w  reason: collision with root package name */
    public int f8689w;

    static {
        x5 x5Var = new x5(new int[0], 0);
        f8687x = x5Var;
        x5Var.f8591u = false;
    }

    public x5() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f8689w)) {
            int[] iArr = this.f8688v;
            if (i10 < iArr.length) {
                System.arraycopy(iArr, i6, iArr, i6 + 1, i10 - i6);
            } else {
                int[] iArr2 = new int[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i6);
                System.arraycopy(this.f8688v, i6, iArr2, i6 + 1, this.f8689w - i6);
                this.f8688v = iArr2;
            }
            this.f8688v[i6] = intValue;
            this.f8689w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8689w));
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = c6.f8318a;
        collection.getClass();
        if (!(collection instanceof x5)) {
            return super.addAll(collection);
        }
        x5 x5Var = (x5) collection;
        int i6 = x5Var.f8689w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f8689w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            int[] iArr = this.f8688v;
            if (i11 > iArr.length) {
                this.f8688v = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(x5Var.f8688v, 0, this.f8688v, this.f8689w, x5Var.f8689w);
            this.f8689w = i11;
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
        if (!(obj instanceof x5)) {
            return super.equals(obj);
        }
        x5 x5Var = (x5) obj;
        if (this.f8689w != x5Var.f8689w) {
            return false;
        }
        int[] iArr = x5Var.f8688v;
        for (int i6 = 0; i6 < this.f8689w; i6++) {
            if (this.f8688v[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i6) {
        e();
        int i10 = this.f8689w;
        int[] iArr = this.f8688v;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[pl.a.b(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f8688v = iArr2;
        }
        int[] iArr3 = this.f8688v;
        int i11 = this.f8689w;
        this.f8689w = i11 + 1;
        iArr3[i11] = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        m(i6);
        return Integer.valueOf(this.f8688v[i6]);
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f8689w; i10++) {
            i6 = (i6 * 31) + this.f8688v[i10];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i6 = this.f8689w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f8688v[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 k(int i6) {
        if (i6 >= this.f8689w) {
            return new x5(Arrays.copyOf(this.f8688v, i6), this.f8689w);
        }
        throw new IllegalArgumentException();
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f8689w) {
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8689w));
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        int i10;
        e();
        m(i6);
        int[] iArr = this.f8688v;
        int i11 = iArr[i6];
        if (i6 < this.f8689w - 1) {
            System.arraycopy(iArr, i6 + 1, iArr, i6, (i10 - i6) - 1);
        }
        this.f8689w--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            int[] iArr = this.f8688v;
            System.arraycopy(iArr, i10, iArr, i6, this.f8689w - i10);
            this.f8689w -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        m(i6);
        int[] iArr = this.f8688v;
        int i10 = iArr[i6];
        iArr[i6] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8689w;
    }

    public x5(int[] iArr, int i6) {
        this.f8688v = iArr;
        this.f8689w = i6;
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
