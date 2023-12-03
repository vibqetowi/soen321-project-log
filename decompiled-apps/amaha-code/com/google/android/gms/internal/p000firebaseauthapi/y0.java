package com.google.android.gms.internal.p000firebaseauthapi;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import pl.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y0  reason: invalid package */
/* loaded from: classes.dex */
public final class y0 extends x implements RandomAccess, i2 {

    /* renamed from: v  reason: collision with root package name */
    public float[] f8248v;

    /* renamed from: w  reason: collision with root package name */
    public int f8249w;

    static {
        new y0(0, new float[0]).f8233u = false;
    }

    public y0() {
        this(0, new float[10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        float floatValue = ((Float) obj).floatValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f8249w)) {
            float[] fArr = this.f8248v;
            if (i10 < fArr.length) {
                System.arraycopy(fArr, i6, fArr, i6 + 1, i10 - i6);
            } else {
                float[] fArr2 = new float[a.b(i10, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i6);
                System.arraycopy(this.f8248v, i6, fArr2, i6 + 1, this.f8249w - i6);
                this.f8248v = fArr2;
            }
            this.f8248v[i6] = floatValue;
            this.f8249w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f8249w));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = i1.f7886a;
        collection.getClass();
        if (!(collection instanceof y0)) {
            return super.addAll(collection);
        }
        y0 y0Var = (y0) collection;
        int i6 = y0Var.f8249w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f8249w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            float[] fArr = this.f8248v;
            if (i11 > fArr.length) {
                this.f8248v = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(y0Var.f8248v, 0, this.f8248v, this.f8249w, y0Var.f8249w);
            this.f8249w = i11;
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
        if (!(obj instanceof y0)) {
            return super.equals(obj);
        }
        y0 y0Var = (y0) obj;
        if (this.f8249w != y0Var.f8249w) {
            return false;
        }
        float[] fArr = y0Var.f8248v;
        for (int i6 = 0; i6 < this.f8249w; i6++) {
            if (Float.floatToIntBits(this.f8248v[i6]) != Float.floatToIntBits(fArr[i6])) {
                return false;
            }
        }
        return true;
    }

    public final void g(float f) {
        e();
        int i6 = this.f8249w;
        float[] fArr = this.f8248v;
        if (i6 == fArr.length) {
            float[] fArr2 = new float[a.b(i6, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i6);
            this.f8248v = fArr2;
        }
        float[] fArr3 = this.f8248v;
        int i10 = this.f8249w;
        this.f8249w = i10 + 1;
        fArr3[i10] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        m(i6);
        return Float.valueOf(this.f8248v[i6]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f8249w; i10++) {
            i6 = (i6 * 31) + Float.floatToIntBits(this.f8248v[i10]);
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i6 = this.f8249w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f8248v[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h1
    public final /* bridge */ /* synthetic */ h1 k(int i6) {
        if (i6 >= this.f8249w) {
            return new y0(this.f8249w, Arrays.copyOf(this.f8248v, i6));
        }
        throw new IllegalArgumentException();
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f8249w) {
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f8249w));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        int i10;
        e();
        m(i6);
        float[] fArr = this.f8248v;
        float f = fArr[i6];
        if (i6 < this.f8249w - 1) {
            System.arraycopy(fArr, i6 + 1, fArr, i6, (i10 - i6) - 1);
        }
        this.f8249w--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            float[] fArr = this.f8248v;
            System.arraycopy(fArr, i10, fArr, i6, this.f8249w - i10);
            this.f8249w -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        e();
        m(i6);
        float[] fArr = this.f8248v;
        float f = fArr[i6];
        fArr[i6] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8249w;
    }

    public y0(int i6, float[] fArr) {
        this.f8248v = fArr;
        this.f8249w = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
