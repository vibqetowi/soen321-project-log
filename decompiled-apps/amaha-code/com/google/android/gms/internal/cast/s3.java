package com.google.android.gms.internal.cast;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class s3 extends h2<Long> implements RandomAccess, h3, k4 {

    /* renamed from: x  reason: collision with root package name */
    public static final s3 f7637x;

    /* renamed from: v  reason: collision with root package name */
    public long[] f7638v;

    /* renamed from: w  reason: collision with root package name */
    public int f7639w;

    static {
        s3 s3Var = new s3(new long[0], 0);
        f7637x = s3Var;
        s3Var.f7545u = false;
    }

    public s3() {
        this(new long[10], 0);
    }

    @Override // com.google.android.gms.internal.cast.j3
    public final /* bridge */ /* synthetic */ j3<Long> D(int i6) {
        if (i6 >= this.f7639w) {
            return new s3(Arrays.copyOf(this.f7638v, i6), this.f7639w);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i6, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f7639w)) {
            long[] jArr = this.f7638v;
            if (i10 < jArr.length) {
                System.arraycopy(jArr, i6, jArr, i6 + 1, i10 - i6);
            } else {
                long[] jArr2 = new long[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i6);
                System.arraycopy(this.f7638v, i6, jArr2, i6 + 1, this.f7639w - i6);
                this.f7638v = jArr2;
            }
            this.f7638v[i6] = longValue;
            this.f7639w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m(i6));
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        e();
        Charset charset = k3.f7570a;
        collection.getClass();
        if (!(collection instanceof s3)) {
            return super.addAll(collection);
        }
        s3 s3Var = (s3) collection;
        int i6 = s3Var.f7639w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f7639w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            long[] jArr = this.f7638v;
            if (i11 > jArr.length) {
                this.f7638v = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(s3Var.f7638v, 0, this.f7638v, this.f7639w, s3Var.f7639w);
            this.f7639w = i11;
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
        if (!(obj instanceof s3)) {
            return super.equals(obj);
        }
        s3 s3Var = (s3) obj;
        if (this.f7639w != s3Var.f7639w) {
            return false;
        }
        long[] jArr = s3Var.f7638v;
        for (int i6 = 0; i6 < this.f7639w; i6++) {
            if (this.f7638v[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i6) {
        if (i6 >= 0 && i6 < this.f7639w) {
            return;
        }
        throw new IndexOutOfBoundsException(m(i6));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i6) {
        g(i6);
        return Long.valueOf(this.f7638v[i6]);
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f7639w; i10++) {
            i6 = (i6 * 31) + k3.a(this.f7638v[i10]);
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i6 = this.f7639w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f7638v[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    public final String m(int i6) {
        int i10 = this.f7639w;
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
        g(i6);
        long[] jArr = this.f7638v;
        long j10 = jArr[i6];
        if (i6 < this.f7639w - 1) {
            System.arraycopy(jArr, i6 + 1, jArr, i6, (i10 - i6) - 1);
        }
        this.f7639w--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            long[] jArr = this.f7638v;
            System.arraycopy(jArr, i10, jArr, i6, this.f7639w - i10);
            this.f7639w -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        long longValue = ((Long) obj).longValue();
        e();
        g(i6);
        long[] jArr = this.f7638v;
        long j10 = jArr[i6];
        jArr[i6] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7639w;
    }

    public s3(long[] jArr, int i6) {
        this.f7638v = jArr;
        this.f7639w = i6;
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        e();
        int i6 = this.f7639w;
        long[] jArr = this.f7638v;
        if (i6 == jArr.length) {
            long[] jArr2 = new long[pl.a.b(i6, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i6);
            this.f7638v = jArr2;
        }
        long[] jArr3 = this.f7638v;
        int i10 = this.f7639w;
        this.f7639w = i10 + 1;
        jArr3[i10] = longValue;
        return true;
    }
}
