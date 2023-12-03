package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class e7 extends s4 implements RandomAccess {

    /* renamed from: x  reason: collision with root package name */
    public static final e7 f8360x;

    /* renamed from: v  reason: collision with root package name */
    public Object[] f8361v;

    /* renamed from: w  reason: collision with root package name */
    public int f8362w;

    static {
        e7 e7Var = new e7(0, new Object[0]);
        f8360x = e7Var;
        e7Var.f8591u = false;
    }

    public e7(int i6, Object[] objArr) {
        this.f8361v = objArr;
        this.f8362w = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f8362w)) {
            Object[] objArr = this.f8361v;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i6, objArr, i6 + 1, i10 - i6);
            } else {
                Object[] objArr2 = new Object[pl.a.b(i10, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i6);
                System.arraycopy(this.f8361v, i6, objArr2, i6 + 1, this.f8362w - i6);
                this.f8361v = objArr2;
            }
            this.f8361v[i6] = obj;
            this.f8362w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8362w));
    }

    public final void g(int i6) {
        if (i6 >= 0 && i6 < this.f8362w) {
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("Index:", i6, ", Size:", this.f8362w));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        g(i6);
        return this.f8361v[i6];
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final /* bridge */ /* synthetic */ b6 k(int i6) {
        if (i6 >= this.f8362w) {
            return new e7(this.f8362w, Arrays.copyOf(this.f8361v, i6));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        int i10;
        e();
        g(i6);
        Object[] objArr = this.f8361v;
        Object obj = objArr[i6];
        if (i6 < this.f8362w - 1) {
            System.arraycopy(objArr, i6 + 1, objArr, i6, (i10 - i6) - 1);
        }
        this.f8362w--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        e();
        g(i6);
        Object[] objArr = this.f8361v;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8362w;
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i6 = this.f8362w;
        Object[] objArr = this.f8361v;
        if (i6 == objArr.length) {
            this.f8361v = Arrays.copyOf(objArr, ((i6 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f8361v;
        int i10 = this.f8362w;
        this.f8362w = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
