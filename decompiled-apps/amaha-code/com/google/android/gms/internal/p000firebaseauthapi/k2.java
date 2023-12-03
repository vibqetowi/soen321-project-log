package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import pl.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k2  reason: invalid package */
/* loaded from: classes.dex */
public final class k2 extends x implements RandomAccess {

    /* renamed from: x  reason: collision with root package name */
    public static final k2 f7933x;

    /* renamed from: v  reason: collision with root package name */
    public Object[] f7934v;

    /* renamed from: w  reason: collision with root package name */
    public int f7935w;

    static {
        k2 k2Var = new k2(0, new Object[0]);
        f7933x = k2Var;
        k2Var.f8233u = false;
    }

    public k2(int i6, Object[] objArr) {
        this.f7934v = objArr;
        this.f7935w = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        e();
        if (i6 >= 0 && i6 <= (i10 = this.f7935w)) {
            Object[] objArr = this.f7934v;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i6, objArr, i6 + 1, i10 - i6);
            } else {
                Object[] objArr2 = new Object[a.b(i10, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i6);
                System.arraycopy(this.f7934v, i6, objArr2, i6 + 1, this.f7935w - i6);
                this.f7934v = objArr2;
            }
            this.f7934v[i6] = obj;
            this.f7935w++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f7935w));
    }

    public final void g(int i6) {
        if (i6 >= 0 && i6 < this.f7935w) {
            return;
        }
        throw new IndexOutOfBoundsException(b.j("Index:", i6, ", Size:", this.f7935w));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        g(i6);
        return this.f7934v[i6];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h1
    public final /* bridge */ /* synthetic */ h1 k(int i6) {
        if (i6 >= this.f7935w) {
            return new k2(this.f7935w, Arrays.copyOf(this.f7934v, i6));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        int i10;
        e();
        g(i6);
        Object[] objArr = this.f7934v;
        Object obj = objArr[i6];
        if (i6 < this.f7935w - 1) {
            System.arraycopy(objArr, i6 + 1, objArr, i6, (i10 - i6) - 1);
        }
        this.f7935w--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        e();
        g(i6);
        Object[] objArr = this.f7934v;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7935w;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i6 = this.f7935w;
        Object[] objArr = this.f7934v;
        if (i6 == objArr.length) {
            this.f7934v = Arrays.copyOf(objArr, ((i6 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7934v;
        int i10 = this.f7935w;
        this.f7935w = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
