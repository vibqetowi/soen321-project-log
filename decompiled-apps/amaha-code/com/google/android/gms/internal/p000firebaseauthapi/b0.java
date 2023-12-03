package com.google.android.gms.internal.p000firebaseauthapi;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import pl.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b0  reason: invalid package */
/* loaded from: classes.dex */
public final class b0 extends x implements RandomAccess, i2 {

    /* renamed from: v  reason: collision with root package name */
    public boolean[] f7720v;

    /* renamed from: w  reason: collision with root package name */
    public int f7721w;

    static {
        new b0(new boolean[0], 0).f8233u = false;
    }

    public b0() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f7721w)) {
            boolean[] zArr = this.f7720v;
            if (i10 < zArr.length) {
                System.arraycopy(zArr, i6, zArr, i6 + 1, i10 - i6);
            } else {
                boolean[] zArr2 = new boolean[a.b(i10, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i6);
                System.arraycopy(this.f7720v, i6, zArr2, i6 + 1, this.f7721w - i6);
                this.f7720v = zArr2;
            }
            this.f7720v[i6] = booleanValue;
            this.f7721w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f7721w));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = i1.f7886a;
        collection.getClass();
        if (!(collection instanceof b0)) {
            return super.addAll(collection);
        }
        b0 b0Var = (b0) collection;
        int i6 = b0Var.f7721w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f7721w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            boolean[] zArr = this.f7720v;
            if (i11 > zArr.length) {
                this.f7720v = Arrays.copyOf(zArr, i11);
            }
            System.arraycopy(b0Var.f7720v, 0, this.f7720v, this.f7721w, b0Var.f7721w);
            this.f7721w = i11;
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
        if (!(obj instanceof b0)) {
            return super.equals(obj);
        }
        b0 b0Var = (b0) obj;
        if (this.f7721w != b0Var.f7721w) {
            return false;
        }
        boolean[] zArr = b0Var.f7720v;
        for (int i6 = 0; i6 < this.f7721w; i6++) {
            if (this.f7720v[i6] != zArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(boolean z10) {
        e();
        int i6 = this.f7721w;
        boolean[] zArr = this.f7720v;
        if (i6 == zArr.length) {
            boolean[] zArr2 = new boolean[a.b(i6, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i6);
            this.f7720v = zArr2;
        }
        boolean[] zArr3 = this.f7720v;
        int i10 = this.f7721w;
        this.f7721w = i10 + 1;
        zArr3[i10] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        m(i6);
        return Boolean.valueOf(this.f7720v[i6]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6;
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7721w; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f7720v[i11];
            Charset charset = i1.f7886a;
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
        int i6 = this.f7721w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f7720v[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h1
    public final /* bridge */ /* synthetic */ h1 k(int i6) {
        if (i6 >= this.f7721w) {
            return new b0(Arrays.copyOf(this.f7720v, i6), this.f7721w);
        }
        throw new IllegalArgumentException();
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f7721w) {
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f7721w));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        int i10;
        e();
        m(i6);
        boolean[] zArr = this.f7720v;
        boolean z10 = zArr[i6];
        if (i6 < this.f7721w - 1) {
            System.arraycopy(zArr, i6 + 1, zArr, i6, (i10 - i6) - 1);
        }
        this.f7721w--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            boolean[] zArr = this.f7720v;
            System.arraycopy(zArr, i10, zArr, i6, this.f7721w - i10);
            this.f7721w -= i10 - i6;
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
        boolean[] zArr = this.f7720v;
        boolean z10 = zArr[i6];
        zArr[i6] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7721w;
    }

    public b0(boolean[] zArr, int i6) {
        this.f7720v = zArr;
        this.f7721w = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Boolean) obj).booleanValue());
        return true;
    }
}
