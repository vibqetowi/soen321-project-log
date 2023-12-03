package a8;

import q7.p;
/* compiled from: ConstantBitrateSeeker.java */
/* loaded from: classes.dex */
public final class a extends u7.d implements e {
    public a(long j10, long j11, p.a aVar, boolean z10) {
        super(aVar.f, aVar.f29301c, j10, j11, z10);
    }

    @Override // a8.e
    public final long c() {
        return -1L;
    }

    @Override // a8.e
    public final long e(long j10) {
        return ((Math.max(0L, j10 - this.f33864b) * 8) * 1000000) / this.f33867e;
    }
}
