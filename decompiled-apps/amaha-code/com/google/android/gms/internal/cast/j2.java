package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class j2 extends k2 {

    /* renamed from: u  reason: collision with root package name */
    public int f7562u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final int f7563v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ n2 f7564w;

    public j2(n2 n2Var) {
        this.f7564w = n2Var;
        this.f7563v = n2Var.m();
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        if (this.f7562u < this.f7563v) {
            return true;
        }
        return false;
    }
}
