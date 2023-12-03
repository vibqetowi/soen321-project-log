package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class p<E> extends m<E> {

    /* renamed from: y  reason: collision with root package name */
    public static final p f7614y = new p(0, new Object[0]);

    /* renamed from: w  reason: collision with root package name */
    public final transient Object[] f7615w;

    /* renamed from: x  reason: collision with root package name */
    public final transient int f7616x;

    public p(int i6, Object[] objArr) {
        this.f7615w = objArr;
        this.f7616x = i6;
    }

    @Override // com.google.android.gms.internal.cast.j
    public final Object[] e() {
        return this.f7615w;
    }

    @Override // com.google.android.gms.internal.cast.j
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i6) {
        g.c(i6, this.f7616x);
        return (E) this.f7615w[i6];
    }

    @Override // com.google.android.gms.internal.cast.j
    public final int m() {
        return this.f7616x;
    }

    @Override // com.google.android.gms.internal.cast.m, com.google.android.gms.internal.cast.j
    public final int o(Object[] objArr) {
        Object[] objArr2 = this.f7615w;
        int i6 = this.f7616x;
        System.arraycopy(objArr2, 0, objArr, 0, i6);
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7616x;
    }
}
