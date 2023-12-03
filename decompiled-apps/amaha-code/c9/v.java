package c9;
/* compiled from: TimestampAdjuster.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public long f5201a;

    /* renamed from: b  reason: collision with root package name */
    public long f5202b;

    /* renamed from: c  reason: collision with root package name */
    public long f5203c;

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Long> f5204d = new ThreadLocal<>();

    public v(long j10) {
        e(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f5202b == -9223372036854775807L) {
            long j11 = this.f5201a;
            if (j11 == 9223372036854775806L) {
                Long l2 = this.f5204d.get();
                l2.getClass();
                j11 = l2.longValue();
            }
            this.f5202b = j11 - j10;
            notifyAll();
        }
        this.f5203c = j10;
        return j10 + this.f5202b;
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f5203c;
        if (j11 != -9223372036854775807L) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = (4294967296L + j12) / 8589934592L;
            long j14 = ((j13 - 1) * 8589934592L) + j10;
            long j15 = (j13 * 8589934592L) + j10;
            if (Math.abs(j14 - j12) < Math.abs(j15 - j12)) {
                j10 = j14;
            } else {
                j10 = j15;
            }
        }
        return a((j10 * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j10;
        j10 = this.f5201a;
        return (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized long d() {
        return this.f5202b;
    }

    public final synchronized void e(long j10) {
        long j11;
        this.f5201a = j10;
        if (j10 == Long.MAX_VALUE) {
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f5202b = j11;
        this.f5203c = -9223372036854775807L;
    }
}
