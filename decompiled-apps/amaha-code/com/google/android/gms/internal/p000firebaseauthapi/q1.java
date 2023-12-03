package com.google.android.gms.internal.p000firebaseauthapi;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import pl.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q1  reason: invalid package */
/* loaded from: classes.dex */
public final class q1 extends x implements RandomAccess, i2 {

    /* renamed from: v  reason: collision with root package name */
    public long[] f8076v;

    /* renamed from: w  reason: collision with root package name */
    public int f8077w;

    static {
        new q1(new long[0], 0).f8233u = false;
    }

    public q1() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f8077w)) {
            long[] jArr = this.f8076v;
            if (i10 < jArr.length) {
                System.arraycopy(jArr, i6, jArr, i6 + 1, i10 - i6);
            } else {
                long[] jArr2 = new long[a.b(i10, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i6);
                System.arraycopy(this.f8076v, i6, jArr2, i6 + 1, this.f8077w - i6);
                this.f8076v = jArr2;
            }
            this.f8076v[i6] = longValue;
            this.f8077w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f8077w));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = i1.f7886a;
        collection.getClass();
        if (!(collection instanceof q1)) {
            return super.addAll(collection);
        }
        q1 q1Var = (q1) collection;
        int i6 = q1Var.f8077w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f8077w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            long[] jArr = this.f8076v;
            if (i11 > jArr.length) {
                this.f8076v = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(q1Var.f8076v, 0, this.f8076v, this.f8077w, q1Var.f8077w);
            this.f8077w = i11;
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

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return super.equals(obj);
        }
        q1 q1Var = (q1) obj;
        if (this.f8077w != q1Var.f8077w) {
            return false;
        }
        long[] jArr = q1Var.f8076v;
        for (int i6 = 0; i6 < this.f8077w; i6++) {
            if (this.f8076v[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j10) {
        e();
        int i6 = this.f8077w;
        long[] jArr = this.f8076v;
        if (i6 == jArr.length) {
            long[] jArr2 = new long[a.b(i6, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i6);
            this.f8076v = jArr2;
        }
        long[] jArr3 = this.f8076v;
        int i10 = this.f8077w;
        this.f8077w = i10 + 1;
        jArr3[i10] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        m(i6);
        return Long.valueOf(this.f8076v[i6]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f8077w; i10++) {
            i6 = (i6 * 31) + i1.a(this.f8076v[i10]);
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i6 = this.f8077w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f8076v[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h1
    public final /* bridge */ /* synthetic */ h1 k(int i6) {
        if (i6 >= this.f8077w) {
            return new q1(Arrays.copyOf(this.f8076v, i6), this.f8077w);
        }
        throw new IllegalArgumentException();
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f8077w) {
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f8077w));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        int i10;
        e();
        m(i6);
        long[] jArr = this.f8076v;
        long j10 = jArr[i6];
        if (i6 < this.f8077w - 1) {
            System.arraycopy(jArr, i6 + 1, jArr, i6, (i10 - i6) - 1);
        }
        this.f8077w--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            long[] jArr = this.f8076v;
            System.arraycopy(jArr, i10, jArr, i6, this.f8077w - i10);
            this.f8077w -= i10 - i6;
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
        long[] jArr = this.f8076v;
        long j10 = jArr[i6];
        jArr[i6] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8077w;
    }

    public q1(long[] jArr, int i6) {
        this.f8076v = jArr;
        this.f8077w = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
