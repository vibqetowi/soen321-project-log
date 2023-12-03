package u7;

import u7.t;
/* compiled from: ConstantBitrateSeekMap.java */
/* loaded from: classes.dex */
public class d implements t {

    /* renamed from: a  reason: collision with root package name */
    public final long f33863a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33864b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33865c;

    /* renamed from: d  reason: collision with root package name */
    public final long f33866d;

    /* renamed from: e  reason: collision with root package name */
    public final int f33867e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f33868g;

    public d(int i6, int i10, long j10, long j11, boolean z10) {
        this.f33863a = j10;
        this.f33864b = j11;
        this.f33865c = i10 == -1 ? 1 : i10;
        this.f33867e = i6;
        this.f33868g = z10;
        if (j10 == -1) {
            this.f33866d = -1L;
            this.f = -9223372036854775807L;
            return;
        }
        long j12 = j10 - j11;
        this.f33866d = j12;
        this.f = ((Math.max(0L, j12) * 8) * 1000000) / i6;
    }

    @Override // u7.t
    public final boolean d() {
        if (this.f33866d == -1 && !this.f33868g) {
            return false;
        }
        return true;
    }

    @Override // u7.t
    public final t.a i(long j10) {
        long j11 = this.f33864b;
        long j12 = this.f33866d;
        int i6 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
        if (i6 == 0 && !this.f33868g) {
            u uVar = new u(0L, j11);
            return new t.a(uVar, uVar);
        }
        int i10 = this.f33867e;
        long j13 = this.f33865c;
        long j14 = (((i10 * j10) / 8000000) / j13) * j13;
        if (i6 != 0) {
            j14 = Math.min(j14, j12 - j13);
        }
        long max = Math.max(j14, 0L) + j11;
        long max2 = ((Math.max(0L, max - j11) * 8) * 1000000) / i10;
        u uVar2 = new u(max2, max);
        if (i6 != 0 && max2 < j10) {
            long j15 = j13 + max;
            if (j15 < this.f33863a) {
                return new t.a(uVar2, new u(((Math.max(0L, j15 - j11) * 8) * 1000000) / i10, j15));
            }
        }
        return new t.a(uVar2, uVar2);
    }

    @Override // u7.t
    public final long j() {
        return this.f;
    }
}
