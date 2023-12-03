package com.google.android.gms.internal.cast;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class d3 extends h2<Integer> implements RandomAccess, f3, k4 {

    /* renamed from: x  reason: collision with root package name */
    public static final d3 f7510x;

    /* renamed from: v  reason: collision with root package name */
    public int[] f7511v;

    /* renamed from: w  reason: collision with root package name */
    public int f7512w;

    static {
        d3 d3Var = new d3(new int[0], 0);
        f7510x = d3Var;
        d3Var.f7545u = false;
    }

    public d3() {
        this(new int[10], 0);
    }

    @Override // com.google.android.gms.internal.cast.j3
    public final j3<Integer> D(int i6) {
        if (i6 >= this.f7512w) {
            return new d3(Arrays.copyOf(this.f7511v, i6), this.f7512w);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i6, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f7512w)) {
            int[] iArr = this.f7511v;
            if (i10 < iArr.length) {
                System.arraycopy(iArr, i6, iArr, i6 + 1, i10 - i6);
            } else {
                int[] iArr2 = new int[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i6);
                System.arraycopy(this.f7511v, i6, iArr2, i6 + 1, this.f7512w - i6);
                this.f7511v = iArr2;
            }
            this.f7511v[i6] = intValue;
            this.f7512w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i6));
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        e();
        Charset charset = k3.f7570a;
        collection.getClass();
        if (!(collection instanceof d3)) {
            return super.addAll(collection);
        }
        d3 d3Var = (d3) collection;
        int i6 = d3Var.f7512w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f7512w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            int[] iArr = this.f7511v;
            if (i11 > iArr.length) {
                this.f7511v = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(d3Var.f7511v, 0, this.f7511v, this.f7512w, d3Var.f7512w);
            this.f7512w = i11;
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

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return super.equals(obj);
        }
        d3 d3Var = (d3) obj;
        if (this.f7512w != d3Var.f7512w) {
            return false;
        }
        int[] iArr = d3Var.f7511v;
        for (int i6 = 0; i6 < this.f7512w; i6++) {
            if (this.f7511v[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i6) {
        e();
        int i10 = this.f7512w;
        int[] iArr = this.f7511v;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[pl.a.b(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f7511v = iArr2;
        }
        int[] iArr3 = this.f7511v;
        int i11 = this.f7512w;
        this.f7512w = i11 + 1;
        iArr3[i11] = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i6) {
        m(i6);
        return Integer.valueOf(this.f7511v[i6]);
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f7512w; i10++) {
            i6 = (i6 * 31) + this.f7511v[i10];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i6 = this.f7512w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f7511v[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f7512w) {
            return;
        }
        throw new IndexOutOfBoundsException(o(i6));
    }

    public final String o(int i6) {
        int i10 = this.f7512w;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i6);
        sb2.append(", Size:");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        int i10;
        e();
        m(i6);
        int[] iArr = this.f7511v;
        int i11 = iArr[i6];
        if (i6 < this.f7512w - 1) {
            System.arraycopy(iArr, i6 + 1, iArr, i6, (i10 - i6) - 1);
        }
        this.f7512w--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            int[] iArr = this.f7511v;
            System.arraycopy(iArr, i10, iArr, i6, this.f7512w - i10);
            this.f7512w -= i10 - i6;
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
        int[] iArr = this.f7511v;
        int i10 = iArr[i6];
        iArr[i6] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7512w;
    }

    public d3(int[] iArr, int i6) {
        this.f7511v = iArr;
        this.f7512w = i6;
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
