package j$.time.temporal;
/* loaded from: classes3.dex */
public enum ChronoUnit implements s {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f20988a;

    static {
        j$.time.g.n(1L);
        j$.time.g.n(1000L);
        j$.time.g.n(1000000L);
        j$.time.g.G(Long.MAX_VALUE, 999999999L);
    }

    ChronoUnit(String str) {
        this.f20988a = str;
    }

    @Override // j$.time.temporal.s
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.h(temporal2, this);
    }

    @Override // j$.time.temporal.s
    public final boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // j$.time.temporal.s
    public final boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // j$.time.temporal.s
    public final Temporal l(Temporal temporal, long j10) {
        return temporal.d(j10, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20988a;
    }
}
