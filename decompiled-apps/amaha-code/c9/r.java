package c9;
/* compiled from: StandaloneMediaClock.java */
/* loaded from: classes.dex */
public final class r implements k {

    /* renamed from: u  reason: collision with root package name */
    public final b f5189u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5190v;

    /* renamed from: w  reason: collision with root package name */
    public long f5191w;

    /* renamed from: x  reason: collision with root package name */
    public long f5192x;

    /* renamed from: y  reason: collision with root package name */
    public com.google.android.exoplayer2.v f5193y = com.google.android.exoplayer2.v.f7194x;

    public r(s sVar) {
        this.f5189u = sVar;
    }

    public final void a(long j10) {
        this.f5191w = j10;
        if (this.f5190v) {
            this.f5192x = this.f5189u.d();
        }
    }

    @Override // c9.k
    public final com.google.android.exoplayer2.v c() {
        return this.f5193y;
    }

    @Override // c9.k
    public final void d(com.google.android.exoplayer2.v vVar) {
        if (this.f5190v) {
            a(j());
        }
        this.f5193y = vVar;
    }

    @Override // c9.k
    public final long j() {
        long j10;
        long j11 = this.f5191w;
        if (this.f5190v) {
            long d10 = this.f5189u.d() - this.f5192x;
            com.google.android.exoplayer2.v vVar = this.f5193y;
            if (vVar.f7195u == 1.0f) {
                j10 = w.y(d10);
            } else {
                j10 = d10 * vVar.f7197w;
            }
            return j11 + j10;
        }
        return j11;
    }
}
