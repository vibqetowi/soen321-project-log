package com.google.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: FloatArrayList.java */
/* loaded from: classes.dex */
public final class t extends c<Float> implements RandomAccess, a1 {

    /* renamed from: v  reason: collision with root package name */
    public float[] f10042v;

    /* renamed from: w  reason: collision with root package name */
    public int f10043w;

    static {
        new t(0, new float[0]).f9890u = false;
    }

    public t() {
        this(0, new float[10]);
    }

    @Override // com.google.protobuf.y.d
    public final y.d A(int i6) {
        if (i6 >= this.f10043w) {
            return new t(this.f10043w, Arrays.copyOf(this.f10042v, i6));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        float floatValue = ((Float) obj).floatValue();
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f10043w)) {
            float[] fArr = this.f10042v;
            if (i10 < fArr.length) {
                System.arraycopy(fArr, i6, fArr, i6 + 1, i10 - i6);
            } else {
                float[] fArr2 = new float[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i6);
                System.arraycopy(this.f10042v, i6, fArr2, i6 + 1, this.f10043w - i6);
                this.f10042v = fArr2;
            }
            this.f10042v[i6] = floatValue;
            this.f10043w++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f10043w);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        e();
        Charset charset = y.f10086a;
        collection.getClass();
        if (!(collection instanceof t)) {
            return super.addAll(collection);
        }
        t tVar = (t) collection;
        int i6 = tVar.f10043w;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f10043w;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i10 >= i6) {
            int i11 = i10 + i6;
            float[] fArr = this.f10042v;
            if (i11 > fArr.length) {
                this.f10042v = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(tVar.f10042v, 0, this.f10042v, this.f10043w, tVar.f10043w);
            this.f10043w = i11;
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

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return super.equals(obj);
        }
        t tVar = (t) obj;
        if (this.f10043w != tVar.f10043w) {
            return false;
        }
        float[] fArr = tVar.f10042v;
        for (int i6 = 0; i6 < this.f10043w; i6++) {
            if (Float.floatToIntBits(this.f10042v[i6]) != Float.floatToIntBits(fArr[i6])) {
                return false;
            }
        }
        return true;
    }

    public final void g(float f) {
        e();
        int i6 = this.f10043w;
        float[] fArr = this.f10042v;
        if (i6 == fArr.length) {
            float[] fArr2 = new float[pl.a.b(i6, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i6);
            this.f10042v = fArr2;
        }
        float[] fArr3 = this.f10042v;
        int i10 = this.f10043w;
        this.f10043w = i10 + 1;
        fArr3[i10] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        m(i6);
        return Float.valueOf(this.f10042v[i6]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f10043w; i10++) {
            i6 = (i6 * 31) + Float.floatToIntBits(this.f10042v[i10]);
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i6 = this.f10043w;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f10042v[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void m(int i6) {
        if (i6 >= 0 && i6 < this.f10043w) {
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index:", i6, ", Size:");
        u10.append(this.f10043w);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        int i10;
        e();
        m(i6);
        float[] fArr = this.f10042v;
        float f = fArr[i6];
        if (i6 < this.f10043w - 1) {
            System.arraycopy(fArr, i6 + 1, fArr, i6, (i10 - i6) - 1);
        }
        this.f10043w--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        e();
        if (i10 >= i6) {
            float[] fArr = this.f10042v;
            System.arraycopy(fArr, i10, fArr, i6, this.f10043w - i10);
            this.f10043w -= i10 - i6;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        e();
        m(i6);
        float[] fArr = this.f10042v;
        float f = fArr[i6];
        fArr[i6] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10043w;
    }

    public t(int i6, float[] fArr) {
        this.f10042v = fArr;
        this.f10043w = i6;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
