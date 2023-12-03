package com.google.android.gms.internal.p000firebaseauthapi;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import pl.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p0  reason: invalid package */
/* loaded from: classes.dex */
public final class p0 extends x implements RandomAccess, i2 {

    /* renamed from: v  reason: collision with root package name */
    public double[] f8033v;

    /* renamed from: w  reason: collision with root package name */
    public int f8034w;

    static {
        new p0(0, new double[0]).f8233u = false;
    }

    public p0() {
        this(0, new double[10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f8034w)) {
            double[] dArr = this.f8033v;
            if (i10 < dArr.length) {
                System.arraycopy(dArr, i6, dArr, i6 + 1, i10 - i6);
            } else {
                double[] dArr2 = new double[a.b(i10, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i6);
                System.arraycopy(this.f8033v, i6, dArr2, i6 + 1, this.f8034w - i6);
                this.f8033v = dArr2;
            }
            this.f8033v[i6] = doubleValue;
            this.f8034w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f8034w));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = i1.f7886a;
        collection.getClass();
        if (!(collection instanceof p0)) {
            return super.addAll(collection);
        }
        p0 p0Var = (p0) collection;
        int i6 = p0Var.f8034w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f8034w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            double[] dArr = this.f8033v;
            if (i11 > dArr.length) {
                this.f8033v = Arrays.copyOf(dArr, i11);
            }
            System.arraycopy(p0Var.f8033v, 0, this.f8033v, this.f8034w, p0Var.f8034w);
            this.f8034w = i11;
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
        if (!(obj instanceof p0)) {
            return super.equals(obj);
        }
        p0 p0Var = (p0) obj;
        if (this.f8034w != p0Var.f8034w) {
            return false;
        }
        double[] dArr = p0Var.f8033v;
        for (int i6 = 0; i6 < this.f8034w; i6++) {
            if (Double.doubleToLongBits(this.f8033v[i6]) != Double.doubleToLongBits(dArr[i6])) {
                return false;
            }
        }
        return true;
    }

    public final void g(double d10) {
        e();
        int i6 = this.f8034w;
        double[] dArr = this.f8033v;
        if (i6 == dArr.length) {
            double[] dArr2 = new double[a.b(i6, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i6);
            this.f8033v = dArr2;
        }
        double[] dArr3 = this.f8033v;
        int i10 = this.f8034w;
        this.f8034w = i10 + 1;
        dArr3[i10] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        m(i6);
        return Double.valueOf(this.f8033v[i6]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f8034w; i10++) {
            i6 = (i6 * 31) + i1.a(Double.doubleToLongBits(this.f8033v[i10]));
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i6 = this.f8034w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f8033v[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h1
    public final /* bridge */ /* synthetic */ h1 k(int i6) {
        if (i6 >= this.f8034w) {
            return new p0(this.f8034w, Arrays.copyOf(this.f8033v, i6));
        }
        throw new IllegalArgumentException();
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f8034w) {
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f8034w));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        int i10;
        e();
        m(i6);
        double[] dArr = this.f8033v;
        double d10 = dArr[i6];
        if (i6 < this.f8034w - 1) {
            System.arraycopy(dArr, i6 + 1, dArr, i6, (i10 - i6) - 1);
        }
        this.f8034w--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            double[] dArr = this.f8033v;
            System.arraycopy(dArr, i10, dArr, i6, this.f8034w - i10);
            this.f8034w -= i10 - i6;
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
        double[] dArr = this.f8033v;
        double d10 = dArr[i6];
        dArr[i6] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8034w;
    }

    public p0(int i6, double[] dArr) {
        this.f8033v = dArr;
        this.f8034w = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
