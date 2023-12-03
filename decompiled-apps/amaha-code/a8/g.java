package a8;

import c9.w;
import u7.t;
import u7.u;
/* compiled from: XingSeeker.java */
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long f368a;

    /* renamed from: b  reason: collision with root package name */
    public final int f369b;

    /* renamed from: c  reason: collision with root package name */
    public final long f370c;

    /* renamed from: d  reason: collision with root package name */
    public final long f371d;

    /* renamed from: e  reason: collision with root package name */
    public final long f372e;
    public final long[] f;

    public g(long j10, int i6, long j11, long j12, long[] jArr) {
        this.f368a = j10;
        this.f369b = i6;
        this.f370c = j11;
        this.f = jArr;
        this.f371d = j12;
        this.f372e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // a8.e
    public final long c() {
        return this.f372e;
    }

    @Override // u7.t
    public final boolean d() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // a8.e
    public final long e(long j10) {
        long j11;
        double d10;
        long j12 = j10 - this.f368a;
        if (d() && j12 > this.f369b) {
            long[] jArr = this.f;
            sc.b.E(jArr);
            double d11 = (j12 * 256.0d) / this.f371d;
            int f = w.f(jArr, (long) d11, true);
            long j13 = this.f370c;
            long j14 = (f * j13) / 100;
            long j15 = jArr[f];
            int i6 = f + 1;
            long j16 = (j13 * i6) / 100;
            if (f == 99) {
                j11 = 256;
            } else {
                j11 = jArr[i6];
            }
            if (j15 == j11) {
                d10 = 0.0d;
            } else {
                d10 = (d11 - j15) / (j11 - j15);
            }
            return Math.round(d10 * (j16 - j14)) + j14;
        }
        return 0L;
    }

    @Override // u7.t
    public final t.a i(long j10) {
        double d10;
        double d11;
        boolean d12 = d();
        int i6 = this.f369b;
        long j11 = this.f368a;
        if (!d12) {
            u uVar = new u(0L, j11 + i6);
            return new t.a(uVar, uVar);
        }
        long i10 = w.i(j10, 0L, this.f370c);
        double d13 = (i10 * 100.0d) / this.f370c;
        double d14 = 0.0d;
        if (d13 > 0.0d) {
            if (d13 >= 100.0d) {
                d10 = 256.0d;
                d14 = 256.0d;
                double d15 = d14 / d10;
                long j12 = this.f371d;
                u uVar2 = new u(i10, j11 + w.i(Math.round(d15 * j12), i6, j12 - 1));
                return new t.a(uVar2, uVar2);
            }
            int i11 = (int) d13;
            long[] jArr = this.f;
            sc.b.E(jArr);
            double d16 = jArr[i11];
            if (i11 == 99) {
                d11 = 256.0d;
            } else {
                d11 = jArr[i11 + 1];
            }
            d14 = d16 + ((d11 - d16) * (d13 - i11));
        }
        d10 = 256.0d;
        double d152 = d14 / d10;
        long j122 = this.f371d;
        u uVar22 = new u(i10, j11 + w.i(Math.round(d152 * j122), i6, j122 - 1));
        return new t.a(uVar22, uVar22);
    }

    @Override // u7.t
    public final long j() {
        return this.f370c;
    }
}
