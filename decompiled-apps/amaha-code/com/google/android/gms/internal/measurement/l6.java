package com.google.android.gms.internal.measurement;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class l6 extends s4 implements RandomAccess, a6, c7 {

    /* renamed from: x  reason: collision with root package name */
    public static final l6 f8456x;

    /* renamed from: v  reason: collision with root package name */
    public long[] f8457v;

    /* renamed from: w  reason: collision with root package name */
    public int f8458w;

    static {
        l6 l6Var = new l6(new long[0], 0);
        f8456x = l6Var;
        l6Var.f8591u = false;
    }

    public l6() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f8458w)) {
            long[] jArr = this.f8457v;
            if (i10 < jArr.length) {
                System.arraycopy(jArr, i6, jArr, i6 + 1, i10 - i6);
            } else {
                long[] jArr2 = new long[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i6);
                System.arraycopy(this.f8457v, i6, jArr2, i6 + 1, this.f8458w - i6);
                this.f8457v = jArr2;
            }
            this.f8457v[i6] = longValue;
            this.f8458w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8458w));
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = c6.f8318a;
        collection.getClass();
        if (!(collection instanceof l6)) {
            return super.addAll(collection);
        }
        l6 l6Var = (l6) collection;
        int i6 = l6Var.f8458w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f8458w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            long[] jArr = this.f8457v;
            if (i11 > jArr.length) {
                this.f8457v = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(l6Var.f8457v, 0, this.f8457v, this.f8458w, l6Var.f8458w);
            this.f8458w = i11;
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
        if (!(obj instanceof l6)) {
            return super.equals(obj);
        }
        l6 l6Var = (l6) obj;
        if (this.f8458w != l6Var.f8458w) {
            return false;
        }
        long[] jArr = l6Var.f8457v;
        for (int i6 = 0; i6 < this.f8458w; i6++) {
            if (this.f8457v[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j10) {
        e();
        int i6 = this.f8458w;
        long[] jArr = this.f8457v;
        if (i6 == jArr.length) {
            long[] jArr2 = new long[pl.a.b(i6, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i6);
            this.f8457v = jArr2;
        }
        long[] jArr3 = this.f8457v;
        int i10 = this.f8458w;
        this.f8458w = i10 + 1;
        jArr3[i10] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        m(i6);
        return Long.valueOf(this.f8457v[i6]);
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f8458w; i10++) {
            i6 = (i6 * 31) + c6.a(this.f8457v[i10]);
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i6 = this.f8458w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f8457v[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 k(int i6) {
        if (i6 >= this.f8458w) {
            return new l6(Arrays.copyOf(this.f8457v, i6), this.f8458w);
        }
        throw new IllegalArgumentException();
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f8458w) {
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8458w));
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        int i10;
        e();
        m(i6);
        long[] jArr = this.f8457v;
        long j10 = jArr[i6];
        if (i6 < this.f8458w - 1) {
            System.arraycopy(jArr, i6 + 1, jArr, i6, (i10 - i6) - 1);
        }
        this.f8458w--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            long[] jArr = this.f8457v;
            System.arraycopy(jArr, i10, jArr, i6, this.f8458w - i10);
            this.f8458w -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        long longValue = ((Long) obj).longValue();
        e();
        m(i6);
        long[] jArr = this.f8457v;
        long j10 = jArr[i6];
        jArr[i6] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8458w;
    }

    public l6(long[] jArr, int i6) {
        this.f8457v = jArr;
        this.f8458w = i6;
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
