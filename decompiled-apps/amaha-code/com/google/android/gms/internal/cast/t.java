package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class t extends m<Object> {

    /* renamed from: w  reason: collision with root package name */
    public final transient Object[] f7640w;

    /* renamed from: x  reason: collision with root package name */
    public final transient int f7641x;

    public t(int i6, Object[] objArr) {
        this.f7640w = objArr;
        this.f7641x = i6;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        g.c(i6, 0);
        return this.f7640w[i6 + i6 + this.f7641x];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
