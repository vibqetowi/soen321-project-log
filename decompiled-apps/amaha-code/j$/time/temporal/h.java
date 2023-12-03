package j$.time.temporal;

import j$.time.AbstractC0689a;
/* loaded from: classes3.dex */
enum h implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f20996a;

    static {
        j$.time.g gVar = j$.time.g.f20957c;
    }

    h(String str) {
        this.f20996a = str;
    }

    @Override // j$.time.temporal.s
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.h(temporal2, this);
        }
        int i6 = b.f20992a[ordinal()];
        if (i6 == 1) {
            p pVar = i.f20999c;
            return AbstractC0689a.p(temporal2.G(pVar), temporal.G(pVar));
        } else if (i6 == 2) {
            return temporal.h(temporal2, ChronoUnit.MONTHS) / 3;
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    @Override // j$.time.temporal.s
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.s
    public final boolean isTimeBased() {
        return false;
    }

    @Override // j$.time.temporal.s
    public final Temporal l(Temporal temporal, long j10) {
        int i6 = b.f20992a[ordinal()];
        if (i6 == 1) {
            p pVar = i.f20999c;
            return temporal.c(AbstractC0689a.j(temporal.l(pVar), j10), pVar);
        } else if (i6 == 2) {
            return temporal.d(j10 / 4, ChronoUnit.YEARS).d((j10 % 4) * 3, ChronoUnit.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20996a;
    }
}
