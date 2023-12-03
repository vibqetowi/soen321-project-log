package com.google.android.gms.internal.p000firebaseauthapi;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import pl.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f1  reason: invalid package */
/* loaded from: classes.dex */
public final class f1 extends x implements RandomAccess, i2 {

    /* renamed from: v  reason: collision with root package name */
    public int[] f7832v;

    /* renamed from: w  reason: collision with root package name */
    public int f7833w;

    static {
        new f1(new int[0], 0).f8233u = false;
    }

    public f1() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f7833w)) {
            int[] iArr = this.f7832v;
            if (i10 < iArr.length) {
                System.arraycopy(iArr, i6, iArr, i6 + 1, i10 - i6);
            } else {
                int[] iArr2 = new int[a.b(i10, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i6);
                System.arraycopy(this.f7832v, i6, iArr2, i6 + 1, this.f7833w - i6);
                this.f7832v = iArr2;
            }
            this.f7832v[i6] = intValue;
            this.f7833w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f7833w));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = i1.f7886a;
        collection.getClass();
        if (!(collection instanceof f1)) {
            return super.addAll(collection);
        }
        f1 f1Var = (f1) collection;
        int i6 = f1Var.f7833w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f7833w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            int[] iArr = this.f7832v;
            if (i11 > iArr.length) {
                this.f7832v = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(f1Var.f7832v, 0, this.f7832v, this.f7833w, f1Var.f7833w);
            this.f7833w = i11;
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
        if (!(obj instanceof f1)) {
            return super.equals(obj);
        }
        f1 f1Var = (f1) obj;
        if (this.f7833w != f1Var.f7833w) {
            return false;
        }
        int[] iArr = f1Var.f7832v;
        for (int i6 = 0; i6 < this.f7833w; i6++) {
            if (this.f7832v[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i6) {
        e();
        int i10 = this.f7833w;
        int[] iArr = this.f7832v;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[a.b(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f7832v = iArr2;
        }
        int[] iArr3 = this.f7832v;
        int i11 = this.f7833w;
        this.f7833w = i11 + 1;
        iArr3[i11] = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        m(i6);
        return Integer.valueOf(this.f7832v[i6]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f7833w; i10++) {
            i6 = (i6 * 31) + this.f7832v[i10];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i6 = this.f7833w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f7832v[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h1
    public final /* bridge */ /* synthetic */ h1 k(int i6) {
        if (i6 >= this.f7833w) {
            return new f1(Arrays.copyOf(this.f7832v, i6), this.f7833w);
        }
        throw new IllegalArgumentException();
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f7833w) {
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f7833w));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        int i10;
        e();
        m(i6);
        int[] iArr = this.f7832v;
        int i11 = iArr[i6];
        if (i6 < this.f7833w - 1) {
            System.arraycopy(iArr, i6 + 1, iArr, i6, (i10 - i6) - 1);
        }
        this.f7833w--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            int[] iArr = this.f7832v;
            System.arraycopy(iArr, i10, iArr, i6, this.f7833w - i10);
            this.f7833w -= i10 - i6;
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
        int[] iArr = this.f7832v;
        int i10 = iArr[i6];
        iArr[i6] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7833w;
    }

    public f1(int[] iArr, int i6) {
        this.f7832v = iArr;
        this.f7833w = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
