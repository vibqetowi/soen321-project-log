package com.google.android.gms.internal.measurement;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class p5 extends s4 implements RandomAccess, c7 {

    /* renamed from: v  reason: collision with root package name */
    public float[] f8549v;

    /* renamed from: w  reason: collision with root package name */
    public int f8550w;

    static {
        new p5(0, new float[0]).f8591u = false;
    }

    public p5() {
        this(0, new float[10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        float floatValue = ((Float) obj).floatValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f8550w)) {
            float[] fArr = this.f8549v;
            if (i10 < fArr.length) {
                System.arraycopy(fArr, i6, fArr, i6 + 1, i10 - i6);
            } else {
                float[] fArr2 = new float[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i6);
                System.arraycopy(this.f8549v, i6, fArr2, i6 + 1, this.f8550w - i6);
                this.f8549v = fArr2;
            }
            this.f8549v[i6] = floatValue;
            this.f8550w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8550w));
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = c6.f8318a;
        collection.getClass();
        if (!(collection instanceof p5)) {
            return super.addAll(collection);
        }
        p5 p5Var = (p5) collection;
        int i6 = p5Var.f8550w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f8550w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            float[] fArr = this.f8549v;
            if (i11 > fArr.length) {
                this.f8549v = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(p5Var.f8549v, 0, this.f8549v, this.f8550w, p5Var.f8550w);
            this.f8550w = i11;
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
        if (!(obj instanceof p5)) {
            return super.equals(obj);
        }
        p5 p5Var = (p5) obj;
        if (this.f8550w != p5Var.f8550w) {
            return false;
        }
        float[] fArr = p5Var.f8549v;
        for (int i6 = 0; i6 < this.f8550w; i6++) {
            if (Float.floatToIntBits(this.f8549v[i6]) != Float.floatToIntBits(fArr[i6])) {
                return false;
            }
        }
        return true;
    }

    public final void g(float f) {
        e();
        int i6 = this.f8550w;
        float[] fArr = this.f8549v;
        if (i6 == fArr.length) {
            float[] fArr2 = new float[pl.a.b(i6, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i6);
            this.f8549v = fArr2;
        }
        float[] fArr3 = this.f8549v;
        int i10 = this.f8550w;
        this.f8550w = i10 + 1;
        fArr3[i10] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        m(i6);
        return Float.valueOf(this.f8549v[i6]);
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f8550w; i10++) {
            i6 = (i6 * 31) + Float.floatToIntBits(this.f8549v[i10]);
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i6 = this.f8550w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f8549v[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final /* bridge */ /* synthetic */ b6 k(int i6) {
        if (i6 >= this.f8550w) {
            return new p5(this.f8550w, Arrays.copyOf(this.f8549v, i6));
        }
        throw new IllegalArgumentException();
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f8550w) {
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8550w));
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        int i10;
        e();
        m(i6);
        float[] fArr = this.f8549v;
        float f = fArr[i6];
        if (i6 < this.f8550w - 1) {
            System.arraycopy(fArr, i6 + 1, fArr, i6, (i10 - i6) - 1);
        }
        this.f8550w--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            float[] fArr = this.f8549v;
            System.arraycopy(fArr, i10, fArr, i6, this.f8550w - i10);
            this.f8550w -= i10 - i6;
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
        float[] fArr = this.f8549v;
        float f = fArr[i6];
        fArr[i6] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8550w;
    }

    public p5(int i6, float[] fArr) {
        this.f8549v = fArr;
        this.f8550w = i6;
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
