package tr;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: Deadline.java */
/* loaded from: classes2.dex */
public final class m implements Comparable<m> {
    public static final long A;

    /* renamed from: x  reason: collision with root package name */
    public static final a f33527x = new a();

    /* renamed from: y  reason: collision with root package name */
    public static final long f33528y;

    /* renamed from: z  reason: collision with root package name */
    public static final long f33529z;

    /* renamed from: u  reason: collision with root package name */
    public final b f33530u;

    /* renamed from: v  reason: collision with root package name */
    public final long f33531v;

    /* renamed from: w  reason: collision with root package name */
    public volatile boolean f33532w;

    /* compiled from: Deadline.java */
    /* loaded from: classes2.dex */
    public static class a extends b {
    }

    /* compiled from: Deadline.java */
    /* loaded from: classes2.dex */
    public static abstract class b {
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f33528y = nanos;
        f33529z = -nanos;
        A = TimeUnit.SECONDS.toNanos(1L);
    }

    public m(long j10) {
        boolean z10;
        a aVar = f33527x;
        long nanoTime = System.nanoTime();
        this.f33530u = aVar;
        long min = Math.min(f33528y, Math.max(f33529z, j10));
        this.f33531v = nanoTime + min;
        if (min <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33532w = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(m mVar) {
        m mVar2 = mVar;
        d(mVar2);
        int i6 = ((this.f33531v - mVar2.f33531v) > 0L ? 1 : ((this.f33531v - mVar2.f33531v) == 0L ? 0 : -1));
        if (i6 < 0) {
            return -1;
        }
        if (i6 > 0) {
            return 1;
        }
        return 0;
    }

    public final void d(m mVar) {
        b bVar = mVar.f33530u;
        b bVar2 = this.f33530u;
        if (bVar2 == bVar) {
            return;
        }
        throw new AssertionError("Tickers (" + bVar2 + " and " + mVar.f33530u + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        b bVar = this.f33530u;
        if (bVar != null ? bVar != mVar.f33530u : mVar.f33530u != null) {
            return false;
        }
        if (this.f33531v == mVar.f33531v) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (!this.f33532w) {
            long j10 = this.f33531v;
            ((a) this.f33530u).getClass();
            if (j10 - System.nanoTime() <= 0) {
                this.f33532w = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public final long h(TimeUnit timeUnit) {
        ((a) this.f33530u).getClass();
        long nanoTime = System.nanoTime();
        if (!this.f33532w && this.f33531v - nanoTime <= 0) {
            this.f33532w = true;
        }
        return timeUnit.convert(this.f33531v - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final int hashCode() {
        return Arrays.asList(this.f33530u, Long.valueOf(this.f33531v)).hashCode();
    }

    public final String toString() {
        long h10 = h(TimeUnit.NANOSECONDS);
        long abs = Math.abs(h10);
        long j10 = A;
        long j11 = abs / j10;
        long abs2 = Math.abs(h10) % j10;
        StringBuilder sb2 = new StringBuilder();
        if (h10 < 0) {
            sb2.append('-');
        }
        sb2.append(j11);
        if (abs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb2.append("s from now");
        a aVar = f33527x;
        b bVar = this.f33530u;
        if (bVar != aVar) {
            sb2.append(" (ticker=" + bVar + ")");
        }
        return sb2.toString();
    }
}
