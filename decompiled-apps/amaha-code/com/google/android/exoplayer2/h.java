package com.google.android.exoplayer2;
/* compiled from: DefaultMediaClock.java */
/* loaded from: classes.dex */
public final class h implements c9.k {

    /* renamed from: u  reason: collision with root package name */
    public final c9.r f6507u;

    /* renamed from: v  reason: collision with root package name */
    public final a f6508v;

    /* renamed from: w  reason: collision with root package name */
    public z f6509w;

    /* renamed from: x  reason: collision with root package name */
    public c9.k f6510x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f6511y = true;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6512z;

    /* compiled from: DefaultMediaClock.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public h(a aVar, c9.s sVar) {
        this.f6508v = aVar;
        this.f6507u = new c9.r(sVar);
    }

    @Override // c9.k
    public final v c() {
        c9.k kVar = this.f6510x;
        if (kVar != null) {
            return kVar.c();
        }
        return this.f6507u.f5193y;
    }

    @Override // c9.k
    public final void d(v vVar) {
        c9.k kVar = this.f6510x;
        if (kVar != null) {
            kVar.d(vVar);
            vVar = this.f6510x.c();
        }
        this.f6507u.d(vVar);
    }

    @Override // c9.k
    public final long j() {
        if (this.f6511y) {
            return this.f6507u.j();
        }
        c9.k kVar = this.f6510x;
        kVar.getClass();
        return kVar.j();
    }
}
