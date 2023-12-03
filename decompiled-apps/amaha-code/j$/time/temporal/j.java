package j$.time.temporal;

import j$.time.AbstractC0689a;
import j$.time.chrono.AbstractC0693b;
import j$.time.format.F;
import java.util.HashMap;
/* loaded from: classes3.dex */
enum j implements p {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);
    
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a  reason: collision with root package name */
    private final transient String f21002a;

    /* renamed from: b  reason: collision with root package name */
    private final transient u f21003b;

    /* renamed from: c  reason: collision with root package name */
    private final transient long f21004c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
    }

    j(String str, long j10) {
        this.f21002a = str;
        this.f21003b = u.j((-365243219162L) + j10, 365241780471L + j10);
        this.f21004c = j10;
    }

    @Override // j$.time.temporal.p
    public final long G(l lVar) {
        return lVar.G(a.EPOCH_DAY) + this.f21004c;
    }

    @Override // j$.time.temporal.p
    public final Temporal J(Temporal temporal, long j10) {
        if (this.f21003b.i(j10)) {
            return temporal.c(AbstractC0689a.p(j10, this.f21004c), a.EPOCH_DAY);
        }
        throw new j$.time.d("Invalid value: " + this.f21002a + " " + j10);
    }

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.p
    public final boolean isTimeBased() {
        return false;
    }

    @Override // j$.time.temporal.p
    public final boolean l(l lVar) {
        return lVar.e(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final u m(l lVar) {
        if (l(lVar)) {
            return this.f21003b;
        }
        throw new j$.time.d("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.p
    public final u n() {
        return this.f21003b;
    }

    @Override // j$.time.temporal.p
    public final l r(HashMap hashMap, l lVar, F f) {
        long longValue = ((Long) hashMap.remove(this)).longValue();
        j$.time.chrono.n r = AbstractC0693b.r(lVar);
        F f2 = F.LENIENT;
        long j10 = this.f21004c;
        if (f == f2) {
            return r.j(AbstractC0689a.p(longValue, j10));
        }
        this.f21003b.b(longValue, this);
        return r.j(longValue - j10);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f21002a;
    }
}
