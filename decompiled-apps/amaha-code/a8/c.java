package a8;

import android.util.Pair;
import c9.w;
import u7.t;
import u7.u;
/* compiled from: MlltSeeker.java */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f342a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f343b;

    /* renamed from: c  reason: collision with root package name */
    public final long f344c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.f342a = jArr;
        this.f343b = jArr2;
        this.f344c = j10 == -9223372036854775807L ? w.y(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair<Long, Long> a(long j10, long[] jArr, long[] jArr2) {
        double d10;
        int f = w.f(jArr, j10, true);
        long j11 = jArr[f];
        long j12 = jArr2[f];
        int i6 = f + 1;
        if (i6 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i6];
        long j14 = jArr2[i6];
        if (j13 == j11) {
            d10 = 0.0d;
        } else {
            d10 = (j10 - j11) / (j13 - j11);
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d10 * (j14 - j12))) + j12));
    }

    @Override // a8.e
    public final long c() {
        return -1L;
    }

    @Override // u7.t
    public final boolean d() {
        return true;
    }

    @Override // a8.e
    public final long e(long j10) {
        return w.y(((Long) a(j10, this.f342a, this.f343b).second).longValue());
    }

    @Override // u7.t
    public final t.a i(long j10) {
        Pair<Long, Long> a10 = a(w.E(w.i(j10, 0L, this.f344c)), this.f343b, this.f342a);
        u uVar = new u(w.y(((Long) a10.first).longValue()), ((Long) a10.second).longValue());
        return new t.a(uVar, uVar);
    }

    @Override // u7.t
    public final long j() {
        return this.f344c;
    }
}
