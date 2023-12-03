package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: w  reason: collision with root package name */
    public final transient int f7573w;

    /* renamed from: x  reason: collision with root package name */
    public final transient int f7574x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ m f7575y;

    public l(m mVar, int i6, int i10) {
        this.f7575y = mVar;
        this.f7573w = i6;
        this.f7574x = i10;
    }

    @Override // com.google.android.gms.internal.cast.j
    public final Object[] e() {
        return this.f7575y.e();
    }

    @Override // com.google.android.gms.internal.cast.j
    public final int g() {
        return this.f7575y.g() + this.f7573w;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        g.c(i6, this.f7574x);
        return this.f7575y.get(i6 + this.f7573w);
    }

    @Override // com.google.android.gms.internal.cast.j
    public final int m() {
        return this.f7575y.g() + this.f7573w + this.f7574x;
    }

    @Override // com.google.android.gms.internal.cast.m, java.util.List
    /* renamed from: q */
    public final m subList(int i6, int i10) {
        g.e(i6, i10, this.f7574x);
        int i11 = this.f7573w;
        return this.f7575y.subList(i6 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7574x;
    }
}
